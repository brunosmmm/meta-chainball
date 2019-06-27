SUMMARY = "Chainbot default image."

LICENSE = "MIT"

PR = "r1"

IMAGE_FEATURES = " \
	ssh-server-openssh \
  package-management \
	"

IMAGE_INSTALL = "\
    kernel-modules \
    python3 \
    packagegroup-core-boot \
    packagegroup-core-ssh-openssh \
    packagegroup-core-full-cmdline \
    scoreboard \
    hostapd \
    dnf \
    tzdata \
    sudo \
    chainbot-admin \
    vim \
    curl \
    dnsmasq \
    scoreboard-network \
    webboard \
    wpa-supplicant \
    iptables \
    bridge-utils \
    ifupdown \
    alsa-utils \
    scoreboard-extra \
"

IMAGE_INSTALL_append_raspberrypi3 = "\
    ${MACHINE_EXTRA_RRECOMMENDS} \
"

IMAGE_FSTYPES = "tar.bz2 ext4 rpi-sdimg"
COMPATIBLE_MACHINE = "^rpi$"

inherit core-image
