default_prefix ?= /usr/local
oe_includedir ?= ""
oe_libdir ?= ""

all:

install:
	echo $(oe_includedir)
	install -d $(oe_includedir)/libspotify
	install include/libspotify/api.h $(oe_includedir)/libspotify

	install -d $(oe_libdir)
	install -T lib/libspotify.so.12 $(oe_libdir)/libspotify.so.12.1.103

	cd $(oe_libdir) && ln -sf libspotify.so.12.1.103 libspotify.so.12 && ln -sf libspotify.so.12.1.103 libspotify.so

	install -d $(oe_libdir)/pkgconfig
	sed -e s:PKG_PREFIX:$(default_prefix):g <lib/pkgconfig/libspotify.pc >$(oe_libdir)/pkgconfig/libspotify.pc
