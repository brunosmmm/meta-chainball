
DESCRIPTION = "Pygame"
HOMEPAGE = "https://github.com/pygame/pygame"
AUTHOR = "pygame"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=beeffd9dfcc746ed5a91921f1acc2746"

DEPENDS += "\
    ${PYTHON_PN}-setuptools-scm-native \
    ${PYTHON_PN}-setuptools-scm-git-archive-native \
"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-numpy \
"

PR = "r0"

SRC_URI[md5sum] = "36f8817874f9e63acdf12914340b60e9"
SRC_URI[sha256sum] = "301c6428c0880ecd4a9e3951b80e539c33863b6ff356a443db1758de4f297957"