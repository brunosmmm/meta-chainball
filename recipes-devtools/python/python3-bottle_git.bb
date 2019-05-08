
DESCRIPTION = "Bottle, git version"
SECTION = "devel/python"
LICENSE = "MIT"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab52dc5a6e00b0f2f281e5fff61326aa"

SRCREV = "a454029f6e8a087e5cb570eb6ee36c2087d26e4d"
SRC_URI = "git://github.com/bottlepy/bottle.git;protocol=https;branch=master"

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