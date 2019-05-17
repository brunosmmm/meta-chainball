DESCRIPTION = "Default network configuration for chainbot"
LICENSE = "MIT"

FILESEXTRAPATHS_prepend = "${THISDIR}/files:"

SRC_URI =  "file://ethernet.network \
            file://COPYING \
           "

# SRC_URI_append_qemuarm = "file://ethdhcp.network \
#                           "

LIC_FILES_CHKSUM = "file://COPYING;md5=bd2103035a8021942390a78a431ba0c4"
PR = "r1"

inherit systemd
inherit deploy

S = "${WORKDIR}"

#install static rules for usb0 device
do_install() {
           install -d ${D}${sysconfdir}/systemd/network
           install -m 0644 ${WORKDIR}/ethernet.network ${D}${sysconfdir}/systemd/network/ethernet.network
}
