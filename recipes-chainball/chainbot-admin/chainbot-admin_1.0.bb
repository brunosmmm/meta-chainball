SUMMARY = "Setup admin account"
LICENSE = "MIT"

inherit useradd
PR = "r2"

ADMIN_USERNAME = "cbadmin"
ADMIN_PASSWORD = "$1$sShN5NZA$C7WF2YmoHWiJ5ANFmbONv1"

USERADD_PACKAGES = "${PN}"
GROUPADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "-r wheel"
USERADD_PARAM_${PN} = "-d /home/${ADMIN_USERNAME} -r -s /bin/bash -p ${ADMIN_PASSWORD} -m -G wheel ${ADMIN_USERNAME}"

RDEPENDS_${PN} = "sudo"

FILES_${PN} = ""
ALLOW_EMPTY_${PN} = "1"