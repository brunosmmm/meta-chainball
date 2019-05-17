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
SRC_URI = "https://files.pythonhosted.org/packages/76/87/ecc1a222f0caaa7ba7b8928737e89b2e91b8c22450c12b8a51ee625a4d87/Beaker-1.10.1.tar.gz"
SRC_URI[md5sum] = "7ae556d88e70508fcf6ec89eb100714f"
SRC_URI[sha256sum] = "8eb05d9f7362dc5840b188ac7fff6146b41dceb000deab58a07e9c8da893ed9b"
S = "${WORKDIR}/Beaker-1.10.1"
