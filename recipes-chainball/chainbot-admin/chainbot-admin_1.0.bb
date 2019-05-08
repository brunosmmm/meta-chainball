SUMMARY = "Setup admin account"
LICENSE = "MIT"

inherit useradd

ADMIN_USERNAME = "admin"
ADMIN_PASSWORD = "$1$sShN5NZA$C7WF2YmoHWiJ5ANFmbONv1"

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "-d /home/${ADMIN_USERNAME} -r -s /bin/bash -p ${ADMIN_PASSWORD} -m ${ADMIN_USERNAME}"