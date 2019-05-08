DESCRIPTION = "Highly-optimized, pure-python HTTP server"
HOMEPAGE = "https://github.com/cherrypy/cheroot"
AUTHOR = "CherryPy Team"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=beeffd9dfcc746ed5a91921f1acc2746"

DEPENDS += "\
    ${PYTHON_PN}-setuptools-scm-native \
    ${PYTHON_PN}-setuptools-scm-git-archive-native  \
"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-email \
    ${PYTHON_PN}-fcntl \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-logging \
    ${PYTHON_PN}-unixadmin \
"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-pyopenssl \
    ${PYTHON_PN}-six \
"

PR = "r0"

SRC_URI[md5sum] = "895607bb1b35f3283e115501c7262289"
SRC_URI[sha256sum] = "f6a85e005adb5bc5f3a92b998ff0e48795d4d98a0fbb7edde47a7513d4100601"
