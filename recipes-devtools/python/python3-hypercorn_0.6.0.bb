
DESCRIPTION = "Hypercorn."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b55b0913488ba6e14df06d407f10691"

SRC_URI[md5sum] = "933fa6ef0d1e40bd6949f6a52539db18"
SRC_URI[sha256sum] = "9ab2d6b686e5a9a455433144a269d3004ad0aa079d15ed291554858a9b8dbd38"

PYPI_PACKAGE = "Hypercorn"

inherit pypi setuptools3

RDEPENDS_${PN} += " python3-h11 python3-h2 python3-pytoml python3-wsproto python3-typing-extensions"