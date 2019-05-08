
DESCRIPTION = "Pygame"
HOMEPAGE = "https://github.com/pygame/pygame"
AUTHOR = "pygame"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://docs/LGPL;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS += "\
    ${PYTHON_PN}-setuptools-scm-native \
    libsdl \
    libsdl-mixer \
    libsdl-ttf \
    libsdl-image \
"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-numpy \
"

PR = "r0"

SRC_URI[md5sum] = "36f8817874f9e63acdf12914340b60e9"
SRC_URI[sha256sum] = "301c6428c0880ecd4a9e3951b80e539c33863b6ff356a443db1758de4f297957"
