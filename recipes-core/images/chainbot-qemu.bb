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
    sudo \
    chainbot-admin \
    vim \
    curl \
"

IMAGE_CLASSES += "qemuboot"
IMAGE_FSTYPES = "tar.bz2 ext4"
COMPATIBLE_MACHINE = "qemuarm"

inherit core-image
