
do_install_append() {
  echo "%wheel ALL=(ALL) NOPASSWD: ALL" >> ${D}${sysconfdir}/sudoers.d/cbadmin
}

FILES_${PN} += " ${sysconfdir}/sudoers.d/cbadmin"