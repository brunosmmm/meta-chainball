SUMMARY = "Chainbot default image."

LICENSE = "MIT"

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
    linux-firmware-bcm43430 \
    bridge-utils \
    ifupdown \
    ${MACHINE_EXTRA_RRECOMMENDS} \
"

IMAGE_FSTYPES = "tar.bz2 ext4 rpi-sdimg"
COMPATIBLE_MACHINE = "^rpi$"

inherit core-image
