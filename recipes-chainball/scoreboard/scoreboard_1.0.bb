DESCRIPTION = "The chainball scoreboard"
SECTION = "devel/python"
LICENSE = "MIT"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:${THISDIR}/files:"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c4a80bf5871cb89316f07a73eeba7405"
RDEPENDS_${PN} = "python3-cheroot python3-pyserial python3-bottle python3-dbus python3-playsound python3-spidev python3-systemd python3-requests"

# append rpi-gpio if is raspberrypi
RDEPENDS_${PN}_append_raspberrypi2 = " rpi-gpio"

SRCREV = "29d2affb0f43bd914e2be0c43def33823b1b7606"
SRC_URI = "git://github.com/brunosmmm/chainball-sboard.git;protocol=https;branch=master \
           file://scoreboard.json \
           file://db.json \
           "

S = "${WORKDIR}/git"
PR = "r14"

inherit setuptools3 useradd

# add user
SCOREBOARD_USERNAME = "scoreboard"
USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "-r -M ${SCOREBOARD_USERNAME}"

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"

do_install_append() {
  rm -f ${D}${libdir}/python*/site-packages/site.py*
  install -d ${D}${sysconfdir}/chainball/
  install -d ${D}/var/chainball/
  install -d ${D}/var/chainball/sfx/
  install -m 755 ${S}/conf/* ${D}${sysconfdir}/chainball/

  # overwrite configuration
  install -m 755 ${WORKDIR}/scoreboard.json ${D}${sysconfdir}/chainball/

  install -d ${D}${systemd_system_unitdir}
  install -m 0644 ${S}/misc/scoreboard.service ${D}${systemd_system_unitdir}

  # install fake database
  install -d ${D}/usr/lib/chainball/db/
  echo "[]" > ${D}/usr/lib/chainball/db/registry.json
}

SYSTEMD_SERVICE_${PN} = "scoreboard.service"
SYSTEMD_PACKAGES = "${PN}"
FILES_${PN} += "/lib/systemd/system"

inherit systemd
