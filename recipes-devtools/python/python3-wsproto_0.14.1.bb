
DESCRIPTION = "wsproto."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69fabf732409f4ac61875827b258caaf"

SRC_URI[md5sum] = "6421d9e2ddd1597ddc4b9ad2b3d0f040"
SRC_URI[sha256sum] = "ed222c812aaea55d72d18a87df429cfd602e15b6c992a07a53b495858f083a14"

PYPI_PACKAGE = "wsproto"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-h11"