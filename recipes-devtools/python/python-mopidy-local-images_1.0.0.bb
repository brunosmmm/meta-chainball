
DESCRIPTION = "Mopidy-local-images"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI[md5sum] = "e25fe0663ca2800b36acbf5e9813ce65"
SRC_URI[sha256sum] = "3ea10bcaa83a2f1af0f0c106747badf3b2cee3b288956d8cb31696165a98de06"

PYPI_PACKAGE = "Mopidy-Local-Images"

RDEPENDS_${PN} = " \
                 python-pykka \
                 mopidy \
                 python-uritools \
                 python-image \
                 "

PR = "r1"

inherit pypi setuptools