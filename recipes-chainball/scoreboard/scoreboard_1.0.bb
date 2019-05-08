DESCRIPTION = "The chainball scoreboard"
SECTION = "devel/python"
LICENSE = "MIT"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c4a80bf5871cb89316f07a73eeba7405"
DEPENDS = "python3-cheroot python3-pyserial python3-bottle python3-dbus python3-playsound python3-spidev rpi-gpio"

SRCREV = "9312c574f9f25df88795ef06febfc56e459a12d4"
SRC_URI = "https://github.com/brunosmmm/chainball-sboard.git"

S = "${WORKDIR}/git"
PR = "r1"

inherit setuptools3

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"

do_install_append() {
                    rm -f ${D}${libdir}/python*/site-packages/site.py*
}
