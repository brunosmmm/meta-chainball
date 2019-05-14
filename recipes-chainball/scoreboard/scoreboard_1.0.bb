DESCRIPTION = "The chainball scoreboard"
SECTION = "devel/python"
LICENSE = "MIT"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c4a80bf5871cb89316f07a73eeba7405"
RDEPENDS_${PN} = "python3-cheroot python3-pyserial python3-bottle python3-dbus python3-playsound python3-spidev"

# append rpi-gpio if is raspberrypi
RDEPENDS_${PN}_append_raspberrypi2 = " rpi-gpio"

SRCREV = "9c6dd06f45d507b073578d57597e94513db967d4"
SRC_URI = "git://github.com/brunosmmm/chainball-sboard.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PR = "r10"

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
  install -m 755 ${WORKDIR}/git/conf/* ${D}${sysconfdir}/chainball/

  install -d ${D}${systemd_system_unitdir}
  install -m 0644 ${WORKDIR}/git/misc/scoreboard.service ${D}${systemd_system_unitdir}
}

SYSTEMD_SERVICE_${PN} = "scoreboard.service"
SYSTEMD_PACKAGES = "${PN}"
FILES_${PN} += "/lib/systemd/system"

inherit systemd
