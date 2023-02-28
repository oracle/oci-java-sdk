/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Options for tuning the compatibility and performance of VM shapes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateLaunchOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateLaunchOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bootVolumeType",
        "networkType",
        "isPvEncryptionInTransitEnabled"
    })
    public UpdateLaunchOptions(
            BootVolumeType bootVolumeType,
            NetworkType networkType,
            Boolean isPvEncryptionInTransitEnabled) {
        super();
        this.bootVolumeType = bootVolumeType;
        this.networkType = networkType;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage
         * device. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for boot
         * volumes and remote block storage volumes on platform images.
         *
         * <p>Before you change the boot volume attachment type, detach all block volumes and VNICs
         * except for the boot volume and the primary VNIC.
         *
         * <p>If the instance is running when you change the boot volume attachment type, it will be
         * rebooted.
         *
         * <p>*Note:** Some instances might not function properly if you change the boot volume
         * attachment type. After the instance reboots and is running, connect to it. If the
         * connection fails or the OS doesn't behave as expected, the changes are not supported.
         * Revert the instance to the original boot volume attachment type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeType")
        private BootVolumeType bootVolumeType;

        /**
         * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage
         * device. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for boot
         * volumes and remote block storage volumes on platform images.
         *
         * <p>Before you change the boot volume attachment type, detach all block volumes and VNICs
         * except for the boot volume and the primary VNIC.
         *
         * <p>If the instance is running when you change the boot volume attachment type, it will be
         * rebooted.
         *
         * <p>*Note:** Some instances might not function properly if you change the boot volume
         * attachment type. After the instance reboots and is running, connect to it. If the
         * connection fails or the OS doesn't behave as expected, the changes are not supported.
         * Revert the instance to the original boot volume attachment type.
         *
         * @param bootVolumeType the value to set
         * @return this builder
         */
        public Builder bootVolumeType(BootVolumeType bootVolumeType) {
            this.bootVolumeType = bootVolumeType;
            this.__explicitlySet__.add("bootVolumeType");
            return this;
        }
        /**
         * Emulation type for the physical network interface card (NIC). * {@code VFIO} - Direct
         * attached Virtual Function network controller. This is the networking type when you launch
         * an instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED} - VM
         * instances launch with paravirtualized devices using VirtIO drivers.
         *
         * <p>Before you change the networking type, detach all VNICs and block volumes except for
         * the primary VNIC and the boot volume.
         *
         * <p>The image must have paravirtualized drivers installed. For more information, see
         * [Editing an
         * Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
         *
         * <p>If the instance is running when you change the network type, it will be rebooted.
         *
         * <p>*Note:** Some instances might not function properly if you change the networking type.
         * After the instance reboots and is running, connect to it. If the connection fails or the
         * OS doesn't behave as expected, the changes are not supported. Revert the instance to the
         * original networking type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        /**
         * Emulation type for the physical network interface card (NIC). * {@code VFIO} - Direct
         * attached Virtual Function network controller. This is the networking type when you launch
         * an instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED} - VM
         * instances launch with paravirtualized devices using VirtIO drivers.
         *
         * <p>Before you change the networking type, detach all VNICs and block volumes except for
         * the primary VNIC and the boot volume.
         *
         * <p>The image must have paravirtualized drivers installed. For more information, see
         * [Editing an
         * Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
         *
         * <p>If the instance is running when you change the network type, it will be rebooted.
         *
         * <p>*Note:** Some instances might not function properly if you change the networking type.
         * After the instance reboots and is running, connect to it. If the connection fails or the
         * OS doesn't behave as expected, the changes are not supported. Revert the instance to the
         * original networking type.
         *
         * @param networkType the value to set
         * @return this builder
         */
        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            this.__explicitlySet__.add("networkType");
            return this;
        }
        /**
         * Whether to enable in-transit encryption for the volume's paravirtualized attachment. To
         * enable in-transit encryption for block volumes and boot volumes, this field must be set
         * to {@code true}.
         *
         * <p>Data in transit is transferred over an internal and highly secure network. If you have
         * specific compliance requirements related to the encryption of the data while it is moving
         * between the instance and the boot volume or the block volume, you can enable in-transit
         * encryption. In-transit encryption is not enabled by default.
         *
         * <p>All boot volumes and block volumes are encrypted at rest.
         *
         * <p>For more information, see [Block Volume
         * Encryption](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm#Encrypti).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        /**
         * Whether to enable in-transit encryption for the volume's paravirtualized attachment. To
         * enable in-transit encryption for block volumes and boot volumes, this field must be set
         * to {@code true}.
         *
         * <p>Data in transit is transferred over an internal and highly secure network. If you have
         * specific compliance requirements related to the encryption of the data while it is moving
         * between the instance and the boot volume or the block volume, you can enable in-transit
         * encryption. In-transit encryption is not enabled by default.
         *
         * <p>All boot volumes and block volumes are encrypted at rest.
         *
         * <p>For more information, see [Block Volume
         * Encryption](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm#Encrypti).
         *
         * @param isPvEncryptionInTransitEnabled the value to set
         * @return this builder
         */
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLaunchOptions build() {
            UpdateLaunchOptions model =
                    new UpdateLaunchOptions(
                            this.bootVolumeType,
                            this.networkType,
                            this.isPvEncryptionInTransitEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLaunchOptions model) {
            if (model.wasPropertyExplicitlySet("bootVolumeType")) {
                this.bootVolumeType(model.getBootVolumeType());
            }
            if (model.wasPropertyExplicitlySet("networkType")) {
                this.networkType(model.getNetworkType());
            }
            if (model.wasPropertyExplicitlySet("isPvEncryptionInTransitEnabled")) {
                this.isPvEncryptionInTransitEnabled(model.getIsPvEncryptionInTransitEnabled());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage device. *
     * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for boot volumes and
     * remote block storage volumes on platform images.
     *
     * <p>Before you change the boot volume attachment type, detach all block volumes and VNICs
     * except for the boot volume and the primary VNIC.
     *
     * <p>If the instance is running when you change the boot volume attachment type, it will be
     * rebooted.
     *
     * <p>*Note:** Some instances might not function properly if you change the boot volume
     * attachment type. After the instance reboots and is running, connect to it. If the connection
     * fails or the OS doesn't behave as expected, the changes are not supported. Revert the
     * instance to the original boot volume attachment type.
     */
    public enum BootVolumeType implements com.oracle.bmc.http.internal.BmcEnum {
        Iscsi("ISCSI"),
        Paravirtualized("PARAVIRTUALIZED"),
        ;

        private final String value;
        private static java.util.Map<String, BootVolumeType> map;

        static {
            map = new java.util.HashMap<>();
            for (BootVolumeType v : BootVolumeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        BootVolumeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BootVolumeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BootVolumeType: " + key);
        }
    };
    /**
     * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage device. *
     * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for boot volumes and
     * remote block storage volumes on platform images.
     *
     * <p>Before you change the boot volume attachment type, detach all block volumes and VNICs
     * except for the boot volume and the primary VNIC.
     *
     * <p>If the instance is running when you change the boot volume attachment type, it will be
     * rebooted.
     *
     * <p>*Note:** Some instances might not function properly if you change the boot volume
     * attachment type. After the instance reboots and is running, connect to it. If the connection
     * fails or the OS doesn't behave as expected, the changes are not supported. Revert the
     * instance to the original boot volume attachment type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeType")
    private final BootVolumeType bootVolumeType;

    /**
     * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage device. *
     * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for boot volumes and
     * remote block storage volumes on platform images.
     *
     * <p>Before you change the boot volume attachment type, detach all block volumes and VNICs
     * except for the boot volume and the primary VNIC.
     *
     * <p>If the instance is running when you change the boot volume attachment type, it will be
     * rebooted.
     *
     * <p>*Note:** Some instances might not function properly if you change the boot volume
     * attachment type. After the instance reboots and is running, connect to it. If the connection
     * fails or the OS doesn't behave as expected, the changes are not supported. Revert the
     * instance to the original boot volume attachment type.
     *
     * @return the value
     */
    public BootVolumeType getBootVolumeType() {
        return bootVolumeType;
    }

    /**
     * Emulation type for the physical network interface card (NIC). * {@code VFIO} - Direct
     * attached Virtual Function network controller. This is the networking type when you launch an
     * instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED} - VM
     * instances launch with paravirtualized devices using VirtIO drivers.
     *
     * <p>Before you change the networking type, detach all VNICs and block volumes except for the
     * primary VNIC and the boot volume.
     *
     * <p>The image must have paravirtualized drivers installed. For more information, see [Editing
     * an Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
     *
     * <p>If the instance is running when you change the network type, it will be rebooted.
     *
     * <p>*Note:** Some instances might not function properly if you change the networking type.
     * After the instance reboots and is running, connect to it. If the connection fails or the OS
     * doesn't behave as expected, the changes are not supported. Revert the instance to the
     * original networking type.
     */
    public enum NetworkType implements com.oracle.bmc.http.internal.BmcEnum {
        Vfio("VFIO"),
        Paravirtualized("PARAVIRTUALIZED"),
        ;

        private final String value;
        private static java.util.Map<String, NetworkType> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkType v : NetworkType.values()) {
                map.put(v.getValue(), v);
            }
        }

        NetworkType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NetworkType: " + key);
        }
    };
    /**
     * Emulation type for the physical network interface card (NIC). * {@code VFIO} - Direct
     * attached Virtual Function network controller. This is the networking type when you launch an
     * instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED} - VM
     * instances launch with paravirtualized devices using VirtIO drivers.
     *
     * <p>Before you change the networking type, detach all VNICs and block volumes except for the
     * primary VNIC and the boot volume.
     *
     * <p>The image must have paravirtualized drivers installed. For more information, see [Editing
     * an Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
     *
     * <p>If the instance is running when you change the network type, it will be rebooted.
     *
     * <p>*Note:** Some instances might not function properly if you change the networking type.
     * After the instance reboots and is running, connect to it. If the connection fails or the OS
     * doesn't behave as expected, the changes are not supported. Revert the instance to the
     * original networking type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    private final NetworkType networkType;

    /**
     * Emulation type for the physical network interface card (NIC). * {@code VFIO} - Direct
     * attached Virtual Function network controller. This is the networking type when you launch an
     * instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED} - VM
     * instances launch with paravirtualized devices using VirtIO drivers.
     *
     * <p>Before you change the networking type, detach all VNICs and block volumes except for the
     * primary VNIC and the boot volume.
     *
     * <p>The image must have paravirtualized drivers installed. For more information, see [Editing
     * an Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
     *
     * <p>If the instance is running when you change the network type, it will be rebooted.
     *
     * <p>*Note:** Some instances might not function properly if you change the networking type.
     * After the instance reboots and is running, connect to it. If the connection fails or the OS
     * doesn't behave as expected, the changes are not supported. Revert the instance to the
     * original networking type.
     *
     * @return the value
     */
    public NetworkType getNetworkType() {
        return networkType;
    }

    /**
     * Whether to enable in-transit encryption for the volume's paravirtualized attachment. To
     * enable in-transit encryption for block volumes and boot volumes, this field must be set to
     * {@code true}.
     *
     * <p>Data in transit is transferred over an internal and highly secure network. If you have
     * specific compliance requirements related to the encryption of the data while it is moving
     * between the instance and the boot volume or the block volume, you can enable in-transit
     * encryption. In-transit encryption is not enabled by default.
     *
     * <p>All boot volumes and block volumes are encrypted at rest.
     *
     * <p>For more information, see [Block Volume
     * Encryption](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm#Encrypti).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    /**
     * Whether to enable in-transit encryption for the volume's paravirtualized attachment. To
     * enable in-transit encryption for block volumes and boot volumes, this field must be set to
     * {@code true}.
     *
     * <p>Data in transit is transferred over an internal and highly secure network. If you have
     * specific compliance requirements related to the encryption of the data while it is moving
     * between the instance and the boot volume or the block volume, you can enable in-transit
     * encryption. In-transit encryption is not enabled by default.
     *
     * <p>All boot volumes and block volumes are encrypted at rest.
     *
     * <p>For more information, see [Block Volume
     * Encryption](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm#Encrypti).
     *
     * @return the value
     */
    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateLaunchOptions(");
        sb.append("super=").append(super.toString());
        sb.append("bootVolumeType=").append(String.valueOf(this.bootVolumeType));
        sb.append(", networkType=").append(String.valueOf(this.networkType));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLaunchOptions)) {
            return false;
        }

        UpdateLaunchOptions other = (UpdateLaunchOptions) o;
        return java.util.Objects.equals(this.bootVolumeType, other.bootVolumeType)
                && java.util.Objects.equals(this.networkType, other.networkType)
                && java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bootVolumeType == null ? 43 : this.bootVolumeType.hashCode());
        result = (result * PRIME) + (this.networkType == null ? 43 : this.networkType.hashCode());
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
