DESCRIPTION = "Quart."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eda1e14eec511d8f00b71ed576f1ecdf"

SRC_URI[md5sum] = "44468e3680c2b4930ad3f5bf6b052b85"
SRC_URI[sha256sum] = "3b3e1207bdecbbae35b9aeef137abcf273768034423df77c9ad1034a105ddde3"

PYPI_PACKAGE = "Quart"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-jinja2 python3-multidict python3-blinker python3-itsdangerous python3-click python3-hypercorn python3-sortedcontainers python3-aiofiles"