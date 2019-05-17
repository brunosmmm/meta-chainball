SUMMARY = "Update DuckDNS dynamic DNS"
LICENSE = "MIT"

FILESEXTRAPATHS_prepend = "${THISDIR}/files:"
RDEPENDS_${PN} = "curl"

SRC_URI = "file://duckdns.service \
           file://duckdns.timer \
           "
LIC_FILES_CHKSUM = "file://duckdns.timer;md5=abdc14201e4427c26b63a9f510e0d7fd"
PR = "r6"

S = "${WORKDIR}"

DUCKDNS_LOG_PATH = "/var/log/duckdns.log"
DUCNDNS_DOMAIN ?= ""
DUCKDNS_TOKEN ?= ""

SYSTEMD_SERVICE_${PN} = "duckdns.service duckdns.timer"
SYSTEMD_PACKAGES = "${PN}"
FILES_${PN} += "/lib/systemd/system"

do_install() {

  if [ ${DUCKDNS_DOMAIN} == "" ]; then
    bberror "DUCKDNS_DOMAIN cannot be empty"
  fi

  if [ ${DUCKDNS_TOKEN} == "" ]; then
    bberror "DUCKDNS_TOKEN cannot be empty"
  fi

  sed -i "s/DUCKDNS_TOKEN=/DUCKDNS_TOKEN=${DUCKDNS_TOKEN}/" ${WORKDIR}/duckdns.service
  sed -i "s/DUCKDNS_DOMAIN=/DUCKDNS_DOMAIN=${DUCKDNS_DOMAIN}/" ${WORKDIR}/duckdns.service
  sed -i "s|DUCKDNS_LOG=|DUCKDNS_LOG=${DUCKDNS_LOG_PATH}|" ${WORKDIR}/duckdns.service

  install -d ${D}${systemd_system_unitdir}
  install -m 0644 ${WORKDIR}/duckdns.service ${D}${systemd_system_unitdir}
  install -m 0644 ${WORKDIR}/duckdns.timer ${D}${systemd_system_unitdir}
}

inherit systemd