DESCRIPTION = "HTTPS using dehydrated"
LICENSE = "MIT"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:${THISDIR}/files:"
LIC_FILES_CHKSUM = "file://LICENSE;md5=74f6cbaf97a1f46911ecf8c0ed57c855"


SRCREV = "ce3d6583779d9fad597012dd116ab2a8c000e9cb"
SRC_URI = "git://github.com/lukas2511/dehydrated.git;protocol=https;branch=master \
           file://domains.txt \
           file://config \
           file://hook.sh \
           file://dehydrated-register.sh \
           file://dehydrated-register.service \
           file://dehydrated-renew.service \
           file://dehydrated-renew.timer \
           "

S = "${WORKDIR}/git"
PR = "r5"

do_install() {
  install -d ${D}${bindir}

  # install dehydrated
  install -m 0775 ${S}/dehydrated ${D}$bindir/dehydrated

  # install configuration
  sed -i "s|__HOOK_INSTALL_DIR__|${bindir}|" ${WORKDIR}/config
  install -d ${D}${sysconfdir}/dehydrated/
  install -m 0644 ${WORKDIR}/config ${D}${sysconfdir}/dehydrated/config
  install -m 0644 ${WORKDIR}/domains.txt ${D}${sysconfdir}/dehydrated/domains.txt

  # install hook script
  sed -i "s/__DUCKDNS_TOKEN__/${DUCKDNS_TOKEN}/" ${WORKDIR}/hook.sh
  install -m 0740 ${WORKDIR}/hook.sh ${D}${bindir}/dehydrated_hook.sh

  # install registration service
  sed -i "s|__BINDIR__|${bindir}|" ${WORKDIR}/dehydrated-register.service
  install -d ${D}${systemd_system_unitdir}
  install -m 0775 ${WORKDIR}/dehydrated-register.sh ${D}${bindir}/
  install -m 0644 ${WORKDIR}/dehydrated-register.service ${D}${systemd_system_unitdir}/
  install -m 0644 ${WORKDIR}/dehydrated-renew.service ${D}${systemd_system_unitdir}/
  install -m 0644 ${WORKDIR}/dehydrated-renew.timer ${D}${systemd_system_unitdir}/
}

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "dehydrated-register.service dehydrated-renew.timer"
FILES_${PN} += "${systemd_system_unitdir}"

inherit systemd