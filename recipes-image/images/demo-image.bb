require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += " ssh-server-dropbear "

IMAGE_INSTALL += " os-release "
IMAGE_INSTALL += " screen "
IMAGE_INSTALL += " packagegroup-iotivity "
IMAGE_INSTALL += " iotivity-simple-client "
