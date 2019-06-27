SUMMARY = "libspotify"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "file://libspotify-12.1.51-Linux-x86_64-release.tar.gz \
           file://Makefile"
LICENSE = "commercial"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a7efe9489ebf22e7f43756283669839"

S = "${WORKDIR}/libspotify-12.1.51-Linux-x86_64-release"

CLEANBROKEN = "1"
EXTRA_OEMAKE = "'oe_prefix=${D}'"

do_compile_prepend() {
  cp ${WORKDIR}/Makefile ${S}/
}

PR = "r1"

inherit native