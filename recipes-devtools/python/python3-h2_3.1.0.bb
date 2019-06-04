
DESCRIPTION = "H2."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6b2f6bbe76528af543242d606c14851"

SRC_URI[md5sum] = "9378f49ad5af38fa316a2129830e4c95"
SRC_URI[sha256sum] = "fd07e865a3272ac6ef195d8904de92dc7b38dc28297ec39cfa22716b6d62e6eb"

PYPI_PACKAGE = "h2"

inherit pypi setuptools3

RDEPENDS_${PN} += " python3-hyperframe python3-hpack"