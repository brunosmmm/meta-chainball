DESCRIPTION = "ConfigObj"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=4660251f3f696f841c004d76d3cd343f"

SRC_URI[md5sum] = "e472a3a1c2a67bb0ec9b5d54c13a47d6"
SRC_URI[sha256sum] = "a2f5650770e1c87fb335af19a9b7eb73fc05ccf22144eb68db7d00cd2bcb0902"

PYPI_PACKAGE = "configobj"

RDEPENDS_${PN} = " \
                 python-six \
                 "

inherit pypi setuptools