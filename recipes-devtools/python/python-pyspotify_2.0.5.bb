
SUMMARY = "Pyspotify"
HOMEPAGE = "http://pyspotify.mopidy.com/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[md5sum] = "a3c54cfe8b216acedf1f92ecea0428da"
SRC_URI[sha256sum] = "fbd41c58d62232b0cabb7a9e38d45f36ac221699c006899bdb6be74c04602678"

DEPENDS = " \
          python-cffi-native \
          libspotify \
          "

RDEPENDS_${PN} = " \
                libspotify \
                "

PR = "r1"

PYPI_PACKAGE = "pyspotify"
inherit pypi setuptools