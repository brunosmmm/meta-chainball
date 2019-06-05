DESCRIPTION = "Default network configuration for chainbot"
LICENSE = "MIT"

FILESEXTRAPATHS_prepend = "${THISDIR}/files:"

SRC_URI =  "file://ethernet.network \
            file://wifi.network \
            file://wpa_supplicant-wlan0.conf \
            file://COPYING \
           "

# SRC_URI_append_qemuarm = "file://ethdhcp.network \
#                           "

LIC_FILES_CHKSUM = "file://COPYING;md5=bd2103035a8021942390a78a431ba0c4"
PR = "r4"

inherit systemd
inherit deploy

S = "${WORKDIR}"

#install static rules for usb0 device
do_install() {
           install -d ${D}${sysconfdir}/systemd/network
           install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
           install -m 0644 ${WORKDIR}/ethernet.network ${D}${sysconfdir}/systemd/network/ethernet.network
           install -m 0644 ${WORKDIR}/wifi.network ${D}${sysconfdir}/systemd/network/wifi.network
           install -d ${D}${sysconfdir}/wpa_supplicant/
           install -m 0644 ${WORKDIR}/wpa_supplicant-wlan0.conf ${D}${sysconfdir}/wpa_supplicant/wpa_supplicant-wlan0.conf
           ln -s /lib/systemd/system/wpa_supplicant@.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant@wlan0.service

}
