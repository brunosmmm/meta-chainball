SUMMARY = "Mopidy-spotify"

RDEPENDS_${PN} = " \
                 python-pykka \
                 python-pyspotify \
                 python-requests \
                 python-pycparser \
                 mopidy \
                 "
inherit setuptools

SRC_URI = "git://github.com/kingosticks/mopidy-spotify.git;branch=fix/web-api-playlists-v2;protocol=https"
SRCREV = "62a16f01d9bb565ca53e7174eb78d4128f591b6a"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
LICENSE = "Apache-2.0"

S = "${WORKDIR}/git"
PR = "r1"