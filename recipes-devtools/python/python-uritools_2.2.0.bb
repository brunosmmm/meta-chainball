
DESCRIPTION = "uritools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f26bb17a77ef0afdb242c384163bcaec"

SRC_URI[md5sum] = "b233ab8184cacf75c5ab3ffd35dac066"
SRC_URI[sha256sum] = "80e8e23cafad54fd85811b5d9ba0fc595d933f5727c61c3937945eec09f99e2b"

PYPI_PACKAGE = "uritools"

RDEPENDS_${PN} = " \
                 python-ipaddress \
                 "

PR = "r0"

inherit pypi setuptools