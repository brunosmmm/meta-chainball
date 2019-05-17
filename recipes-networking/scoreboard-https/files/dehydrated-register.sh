#!/bin/sh

dehydrated --register --accept-terms && dehydrated -c && systemctl disable dehydrated-register.service
