SUMMARY = "Chainbot default image."

LICENSE = "MIT"

IMAGE_INSTALL = "\
    kernel-modules \
    python3 \
    packagegroup-core-boot \
    packagegroup-core-ssh-openssh \
"

inherit core-image
