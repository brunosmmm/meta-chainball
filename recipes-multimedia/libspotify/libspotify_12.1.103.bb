SUMMARY = "libspotify"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
COMPATIBLE_MACHINE = "^rpi$"

SRC_URI = "file://libspotify-12.1.103-Linux-armv6-bcm2708hardfp-release.tar.gz \
           file://Makefile"
LICENSE = "commercial"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a7efe9489ebf22e7f43756283669839"

S = "${WORKDIR}/libspotify-12.1.103-Linux-armv6-bcm2708hardfp-release"

CLEANBROKEN = "1"
EXTRA_OEMAKE_append = "oe_libdir=${D}${libdir} oe_includedir=${D}${includedir}"

do_compile_prepend() {
  cp ${WORKDIR}/Makefile ${S}/
}

do_compile() {
  true
}

do_install() {
  oe_runmake install
}

# FILES_${PN} = "${includedir}/* ${libdir}/*"

INSANE_SKIP_${PN}_append = "already-stripped ldflags"

PR = "r3"
