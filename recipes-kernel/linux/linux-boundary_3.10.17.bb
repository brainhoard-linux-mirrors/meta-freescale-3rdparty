# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Boundary Devices boards"

SRC_URI = "git://github.com/boundarydevices/linux-imx6.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-1.0.0_ga+yocto"
SRCBRANCH = "boundary-imx_3.10.17_1.0.0_ga"
SRCREV = "731f96d038c39af8ea916adba70034a204b0389a"
DEPENDS += "lzop-native "
COMPATIBLE_MACHINE = "(mx6)"
COMPATIBLE_MACHINE = "(nitrogen6x|nitrogen6x-lite)"
