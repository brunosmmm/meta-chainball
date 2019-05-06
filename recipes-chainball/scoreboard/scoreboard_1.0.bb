DESCRIPTION = "The chainball scoreboard"
SECTION = "devel/python"
LICENSE = "MIT"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c4a80bf5871cb89316f07a73eeba7405"
DEPENDS = "python3-cheroot python3-pyserial python3-bottle python3-dbus"

SRCREV = "5617b30f7f35ee154a684235fc11062f5e019343"
SRC_URI = "https://github.com/brunosmmm/chainball-sboard.git"

S = "${WORKDIR}/git"
PR = "r0"

inherit setuptools3

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"

do_install_append() {
                    rm -f ${D}${libdir}/python*/site-packages/site.py*
}
