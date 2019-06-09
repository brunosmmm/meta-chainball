SUMMARY = "Setup admin account"
LICENSE = "MIT"

inherit useradd
PR = "r25"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
LIC_FILES_CHKSUM = "file://COPYING;md5=a2e4822a98337283e39f7b60acf85ec9"
SRC_URI = "file://cbadmin.service \
           file://COPYING \
          "

ADMIN_USERNAME = "cbadmin"
ADMIN_PASSWORD = ""

USERADD_PACKAGES = "${PN}"
GROUPADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "-r wheel"
USERADD_PARAM_${PN} = "-d /home/${ADMIN_USERNAME} -r -s /bin/bash -p '$''6''$''V3cdZ/T8crxJIwU''$''iEpP5aMO7aESAcbRiUTlj6I6y20yBP00EvS73SzTLTMZaZcwIqkEp9WsqR9vB/QUF/5hoK4hnu1wnYSDA1Man1' -m -G wheel,dialout,audio ${ADMIN_USERNAME}"

S = "${WORKDIR}"
RDEPENDS_${PN} = "sudo"

SYSTEMD_SERVICE_${PN} = "cbadmin.service"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_AUTO_ENABLE_${PN} = "disable"

do_install_append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/cbadmin.service ${D}${systemd_system_unitdir}
}

pkg_postinst_${PN} () {
#!/bin/sh -e
if [ ! -f /home/${ADMIN_USERNAME}/.ssh/cbadmin ]; then
  mkdir -p /home/${ADMIN_USERNAME}/.ssh
  ssh-keygen -b 4096 -t rsa -f /home/${ADMIN_USERNAME}/.ssh/cbadmin -q -N ""
  chown -R ${ADMIN_USERNAME}:${ADMIN_USERNAME} /home/${ADMIN_USERNAME}/.ssh
  chmod 600 /home/${ADMIN_USERNAME}.ssh/cbadmin
fi
}

FILES_${PN} = ""
FILES_${PN} += " ${systemd_system_unitdir}"
# ALLOW_EMPTY_${PN} = "1"

inherit systemd