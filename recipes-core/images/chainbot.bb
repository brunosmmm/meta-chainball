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
    libsdl \
    libsdl-mixer \
    libsdl-image \
    libsdl-ttf \
    scoreboard \
    hostapd \
    dnf \
"

inherit core-image
