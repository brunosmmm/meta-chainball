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
    packagegroup-core-full-cmdline \
    scoreboard \
    dnf \
    tzdata \
    sudo \
    chainbot-admin \
    vim \
    curl \
    webboard \
    alsa-utils \
"

IMAGE_CLASSES += "qemuboot"
IMAGE_FSTYPES = "tar.bz2 ext4"
COMPATIBLE_MACHINE = "qemuarm"

inherit core-image
