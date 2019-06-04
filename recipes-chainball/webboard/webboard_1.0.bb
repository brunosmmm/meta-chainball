DESCRIPTION = "The chainball web board"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c4a80bf5871cb89316f07a73eeba7405"
RDEPENDS_${PN} = "python3-flask-wtf python3-flask-login python3-flask-bcrypt python3-quart"

SRCREV = "300466d775aa2940ab9ade376b477aa015e5f41d"
SRC_URI = "git://github.com/brunosmmm/chainball-wboard.git;protocol=https;branch=master \
           "

S = "${WORKDIR}/git"
PR = "r0"

inherit setuptools3