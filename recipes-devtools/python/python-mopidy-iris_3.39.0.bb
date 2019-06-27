DESCRIPTION = "Mopidy-iris"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=517d0b706a9620b893a093dc45bd1ce0"

SRC_URI[md5sum] = "53c9f5265bd08ae589532b6fbe2a5aac"
SRC_URI[sha256sum] = "4fd1df9003a1a81faa21668aa7e18870ba2e241d02d2be2cf9ca9fba9f314fb4"

PYPI_PACKAGE = "Mopidy-Iris"

RDEPENDS_${PN} = "bash"

inherit pypi setuptools
