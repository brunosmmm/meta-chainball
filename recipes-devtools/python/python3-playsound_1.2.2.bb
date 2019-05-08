DESCRIPTION = "Pure Python, cross platform, single function module with no dependencies for playing sounds."
HOMEPAGE = "https://github.com/TaylorSMarks/playsound"
AUTHOR = "TaylorSMarks"
LICENSE = "MIT"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c17a0d63b014f6d8fda5432dd6e202e"

DEPENDS += "\
  ${PYTHON_PN}-pygobject \
"

SRCREV = "907f1fe73375a2156f7e0900c4b42c0a60fa1d00"
SRC_URI = "git://github.com/TaylorSMarks/playsound.git;protocol=https;branch=master"

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
