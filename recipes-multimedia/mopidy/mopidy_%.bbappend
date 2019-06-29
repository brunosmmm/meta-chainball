
SRC_URI += "file://mopidy.conf"

do_install_append() {
  install -d ${D}${sysconfdir}/mopidy
  install -m 655 ${WORKDIR}/mopidy.conf ${D}${sysconfdir}/mopidy/mopidy.conf
}

pkg_postinst_ontarget_${PN} () {

  install -d /var/cache/mopidy
  install -d /var/lib/mopidy
  install -d /var/log/mopidy
  install -d /var/lib/mopidy/local
  install -d /var/lib/mopidy/media
  install -d /var/lib/mopidy/playlists
}

PR = "r3"

FILES_${PN} += " ${sysconfdir}/mopidy/*"