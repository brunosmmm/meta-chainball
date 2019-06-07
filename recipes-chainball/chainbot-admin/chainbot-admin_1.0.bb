SUMMARY = "Setup admin account"
LICENSE = "MIT"

inherit useradd
PR = "r22"

ADMIN_USERNAME = "cbadmin"
ADMIN_PASSWORD = ""

USERADD_PACKAGES = "${PN}"
GROUPADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "-r wheel"
USERADD_PARAM_${PN} = "-d /home/${ADMIN_USERNAME} -r -s /bin/bash -p '$''6''$''V3cdZ/T8crxJIwU''$''iEpP5aMO7aESAcbRiUTlj6I6y20yBP00EvS73SzTLTMZaZcwIqkEp9WsqR9vB/QUF/5hoK4hnu1wnYSDA1Man1' -m -G wheel,dialout,audio ${ADMIN_USERNAME}"

RDEPENDS_${PN} = "sudo"

FILES_${PN} = ""
ALLOW_EMPTY_${PN} = "1"