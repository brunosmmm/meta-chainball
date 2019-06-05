DESCRIPTION = "The chainball web board"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c4a80bf5871cb89316f07a73eeba7405"
RDEPENDS_${PN} = "python3-flask-wtf python3-flask-login python3-flask-bcrypt python3-quart"

SRCREV = "18a6ac7ba34ec7261411557440f03459e1cf9d06"
SRC_URI = "git://github.com/brunosmmm/chainball-wboard.git;protocol=https;branch=master \
           "

S = "${WORKDIR}/git"
PR = "r2"

inherit setuptools3

do_install_append() {

  install -d ${D}${systemd_system_unitdir}
  install -m 0644 ${S}/misc/webboard.service ${D}${systemd_system_unitdir}
}

SYSTEMD_SERVICE_${PN} = "webboard.service"
SYSTEMD_PACKAGES = "${PN}"
FILES_${PN} += "${systemd_system_unitdir}"

inherit systemd