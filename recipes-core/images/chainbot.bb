SUMMARY = "Chainbot default image."

LICENSE = "MIT"

IMAGE_FEATURES = " \
	ssh-server-openssh \
  debug-tweaks \
  package-management \
	"

IMAGE_INSTALL = "\
    kernel-modules \
    python3 \
    packagegroup-core-boot \
    packagegroup-core-ssh-openssh \
    scoreboard \
    hostapd \
    dnf \
    tzdata-americas \
"

inherit core-image
