DESCRIPTION = "A Session and Caching library with WSGI Middleware"
HOMEPAGE = "https://beaker.readthedocs.io/"
AUTHOR = "Beaker"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=1542fc716428f25e082d01f05aa2a5c5"

DEPENDS += "\
    ${PYTHON_PN}-setuptools-scm-native \
"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-pycrypto \
"

PR = "r1"

SRC_URI[md5sum] = "7ae556d88e70508fcf6ec89eb100714f"
SRC_URI[sha256sum] = "8eb05d9f7362dc5840b188ac7fff6146b41dceb000deab58a07e9c8da893ed9b"
