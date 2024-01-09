/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Options for tuning the compatibility and performance of VM shapes. The values that you specify
 * override any default values. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceConfigurationLaunchOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceConfigurationLaunchOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bootVolumeType",
        "firmware",
        "networkType",
        "remoteDataVolumeType",
        "isPvEncryptionInTransitEnabled",
        "isConsistentVolumeNamingEnabled"
    })
    public InstanceConfigurationLaunchOptions(
            BootVolumeType bootVolumeType,
            Firmware firmware,
            NetworkType networkType,
            RemoteDataVolumeType remoteDataVolumeType,
            Boolean isPvEncryptionInTransitEnabled,
            Boolean isConsistentVolumeNamingEnabled) {
        super();
        this.bootVolumeType = bootVolumeType;
        this.firmware = firmware;
        this.networkType = networkType;
        this.remoteDataVolumeType = remoteDataVolumeType;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
        this.isConsistentVolumeNamingEnabled = isConsistentVolumeNamingEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage
         * device. * {@code SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code
         * VFIO} - Direct attached Virtual Function storage. This is the default option for local
         * data volumes on platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This
         * is the default for boot volumes and remote block storage volumes on platform images.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeType")
        private BootVolumeType bootVolumeType;

        /**
         * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage
         * device. * {@code SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code
         * VFIO} - Direct attached Virtual Function storage. This is the default option for local
         * data volumes on platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This
         * is the default for boot volumes and remote block storage volumes on platform images.
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
         * Firmware used to boot VM. Select the option that matches your operating system. * {@code
         * BIOS} - Boot VM using BIOS style firmware. This is compatible with both 32 bit and 64 bit
         * operating systems that boot using MBR style bootloaders. * {@code UEFI_64} - Boot VM
         * using UEFI style firmware compatible with 64 bit operating systems. This is the default
         * for platform images.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("firmware")
        private Firmware firmware;

        /**
         * Firmware used to boot VM. Select the option that matches your operating system. * {@code
         * BIOS} - Boot VM using BIOS style firmware. This is compatible with both 32 bit and 64 bit
         * operating systems that boot using MBR style bootloaders. * {@code UEFI_64} - Boot VM
         * using UEFI style firmware compatible with 64 bit operating systems. This is the default
         * for platform images.
         *
         * @param firmware the value to set
         * @return this builder
         */
        public Builder firmware(Firmware firmware) {
            this.firmware = firmware;
            this.__explicitlySet__.add("firmware");
            return this;
        }
        /**
         * Emulation type for the physical network interface card (NIC). * {@code E1000} - Emulated
         * Gigabit ethernet controller. Compatible with Linux e1000 network driver. * {@code VFIO} -
         * Direct attached Virtual Function network controller. This is the networking type when you
         * launch an instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED}
         * - VM instances launch with paravirtualized devices using VirtIO drivers.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        /**
         * Emulation type for the physical network interface card (NIC). * {@code E1000} - Emulated
         * Gigabit ethernet controller. Compatible with Linux e1000 network driver. * {@code VFIO} -
         * Direct attached Virtual Function network controller. This is the networking type when you
         * launch an instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED}
         * - VM instances launch with paravirtualized devices using VirtIO drivers.
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
         * Emulation type for volume. * {@code ISCSI} - ISCSI attached block storage device. *
         * {@code SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code VFIO} -
         * Direct attached Virtual Function storage. This is the default option for local data
         * volumes on platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the
         * default for boot volumes and remote block storage volumes on platform images.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteDataVolumeType")
        private RemoteDataVolumeType remoteDataVolumeType;

        /**
         * Emulation type for volume. * {@code ISCSI} - ISCSI attached block storage device. *
         * {@code SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code VFIO} -
         * Direct attached Virtual Function storage. This is the default option for local data
         * volumes on platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the
         * default for boot volumes and remote block storage volumes on platform images.
         *
         * @param remoteDataVolumeType the value to set
         * @return this builder
         */
        public Builder remoteDataVolumeType(RemoteDataVolumeType remoteDataVolumeType) {
            this.remoteDataVolumeType = remoteDataVolumeType;
            this.__explicitlySet__.add("remoteDataVolumeType");
            return this;
        }
        /**
         * Deprecated. Instead use {@code isPvEncryptionInTransitEnabled} in {@link
         * #instanceConfigurationLaunchInstanceDetails(InstanceConfigurationLaunchInstanceDetailsRequest)
         * instanceConfigurationLaunchInstanceDetails}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        /**
         * Deprecated. Instead use {@code isPvEncryptionInTransitEnabled} in {@link
         * #instanceConfigurationLaunchInstanceDetails(InstanceConfigurationLaunchInstanceDetailsRequest)
         * instanceConfigurationLaunchInstanceDetails}.
         *
         * @param isPvEncryptionInTransitEnabled the value to set
         * @return this builder
         */
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }
        /** Whether to enable consistent volume naming feature. Defaults to false. */
        @com.fasterxml.jackson.annotation.JsonProperty("isConsistentVolumeNamingEnabled")
        private Boolean isConsistentVolumeNamingEnabled;

        /**
         * Whether to enable consistent volume naming feature. Defaults to false.
         *
         * @param isConsistentVolumeNamingEnabled the value to set
         * @return this builder
         */
        public Builder isConsistentVolumeNamingEnabled(Boolean isConsistentVolumeNamingEnabled) {
            this.isConsistentVolumeNamingEnabled = isConsistentVolumeNamingEnabled;
            this.__explicitlySet__.add("isConsistentVolumeNamingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationLaunchOptions build() {
            InstanceConfigurationLaunchOptions model =
                    new InstanceConfigurationLaunchOptions(
                            this.bootVolumeType,
                            this.firmware,
                            this.networkType,
                            this.remoteDataVolumeType,
                            this.isPvEncryptionInTransitEnabled,
                            this.isConsistentVolumeNamingEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationLaunchOptions model) {
            if (model.wasPropertyExplicitlySet("bootVolumeType")) {
                this.bootVolumeType(model.getBootVolumeType());
            }
            if (model.wasPropertyExplicitlySet("firmware")) {
                this.firmware(model.getFirmware());
            }
            if (model.wasPropertyExplicitlySet("networkType")) {
                this.networkType(model.getNetworkType());
            }
            if (model.wasPropertyExplicitlySet("remoteDataVolumeType")) {
                this.remoteDataVolumeType(model.getRemoteDataVolumeType());
            }
            if (model.wasPropertyExplicitlySet("isPvEncryptionInTransitEnabled")) {
                this.isPvEncryptionInTransitEnabled(model.getIsPvEncryptionInTransitEnabled());
            }
            if (model.wasPropertyExplicitlySet("isConsistentVolumeNamingEnabled")) {
                this.isConsistentVolumeNamingEnabled(model.getIsConsistentVolumeNamingEnabled());
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
     * {@code SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code VFIO} - Direct
     * attached Virtual Function storage. This is the default option for local data volumes on
     * platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for
     * boot volumes and remote block storage volumes on platform images.
     */
    public enum BootVolumeType implements com.oracle.bmc.http.internal.BmcEnum {
        Iscsi("ISCSI"),
        Scsi("SCSI"),
        Ide("IDE"),
        Vfio("VFIO"),
        Paravirtualized("PARAVIRTUALIZED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BootVolumeType.class);

        private final String value;
        private static java.util.Map<String, BootVolumeType> map;

        static {
            map = new java.util.HashMap<>();
            for (BootVolumeType v : BootVolumeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'BootVolumeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage device. *
     * {@code SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code VFIO} - Direct
     * attached Virtual Function storage. This is the default option for local data volumes on
     * platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for
     * boot volumes and remote block storage volumes on platform images.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeType")
    private final BootVolumeType bootVolumeType;

    /**
     * Emulation type for the boot volume. * {@code ISCSI} - ISCSI attached block storage device. *
     * {@code SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code VFIO} - Direct
     * attached Virtual Function storage. This is the default option for local data volumes on
     * platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for
     * boot volumes and remote block storage volumes on platform images.
     *
     * @return the value
     */
    public BootVolumeType getBootVolumeType() {
        return bootVolumeType;
    }

    /**
     * Firmware used to boot VM. Select the option that matches your operating system. * {@code
     * BIOS} - Boot VM using BIOS style firmware. This is compatible with both 32 bit and 64 bit
     * operating systems that boot using MBR style bootloaders. * {@code UEFI_64} - Boot VM using
     * UEFI style firmware compatible with 64 bit operating systems. This is the default for
     * platform images.
     */
    public enum Firmware implements com.oracle.bmc.http.internal.BmcEnum {
        Bios("BIOS"),
        Uefi64("UEFI_64"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Firmware.class);

        private final String value;
        private static java.util.Map<String, Firmware> map;

        static {
            map = new java.util.HashMap<>();
            for (Firmware v : Firmware.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Firmware(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Firmware create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Firmware', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Firmware used to boot VM. Select the option that matches your operating system. * {@code
     * BIOS} - Boot VM using BIOS style firmware. This is compatible with both 32 bit and 64 bit
     * operating systems that boot using MBR style bootloaders. * {@code UEFI_64} - Boot VM using
     * UEFI style firmware compatible with 64 bit operating systems. This is the default for
     * platform images.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("firmware")
    private final Firmware firmware;

    /**
     * Firmware used to boot VM. Select the option that matches your operating system. * {@code
     * BIOS} - Boot VM using BIOS style firmware. This is compatible with both 32 bit and 64 bit
     * operating systems that boot using MBR style bootloaders. * {@code UEFI_64} - Boot VM using
     * UEFI style firmware compatible with 64 bit operating systems. This is the default for
     * platform images.
     *
     * @return the value
     */
    public Firmware getFirmware() {
        return firmware;
    }

    /**
     * Emulation type for the physical network interface card (NIC). * {@code E1000} - Emulated
     * Gigabit ethernet controller. Compatible with Linux e1000 network driver. * {@code VFIO} -
     * Direct attached Virtual Function network controller. This is the networking type when you
     * launch an instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED} -
     * VM instances launch with paravirtualized devices using VirtIO drivers.
     */
    public enum NetworkType implements com.oracle.bmc.http.internal.BmcEnum {
        E1000("E1000"),
        Vfio("VFIO"),
        Paravirtualized("PARAVIRTUALIZED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NetworkType.class);

        private final String value;
        private static java.util.Map<String, NetworkType> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkType v : NetworkType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Emulation type for the physical network interface card (NIC). * {@code E1000} - Emulated
     * Gigabit ethernet controller. Compatible with Linux e1000 network driver. * {@code VFIO} -
     * Direct attached Virtual Function network controller. This is the networking type when you
     * launch an instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED} -
     * VM instances launch with paravirtualized devices using VirtIO drivers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    private final NetworkType networkType;

    /**
     * Emulation type for the physical network interface card (NIC). * {@code E1000} - Emulated
     * Gigabit ethernet controller. Compatible with Linux e1000 network driver. * {@code VFIO} -
     * Direct attached Virtual Function network controller. This is the networking type when you
     * launch an instance using hardware-assisted (SR-IOV) networking. * {@code PARAVIRTUALIZED} -
     * VM instances launch with paravirtualized devices using VirtIO drivers.
     *
     * @return the value
     */
    public NetworkType getNetworkType() {
        return networkType;
    }

    /**
     * Emulation type for volume. * {@code ISCSI} - ISCSI attached block storage device. * {@code
     * SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code VFIO} - Direct
     * attached Virtual Function storage. This is the default option for local data volumes on
     * platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for
     * boot volumes and remote block storage volumes on platform images.
     */
    public enum RemoteDataVolumeType implements com.oracle.bmc.http.internal.BmcEnum {
        Iscsi("ISCSI"),
        Scsi("SCSI"),
        Ide("IDE"),
        Vfio("VFIO"),
        Paravirtualized("PARAVIRTUALIZED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RemoteDataVolumeType.class);

        private final String value;
        private static java.util.Map<String, RemoteDataVolumeType> map;

        static {
            map = new java.util.HashMap<>();
            for (RemoteDataVolumeType v : RemoteDataVolumeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RemoteDataVolumeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RemoteDataVolumeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RemoteDataVolumeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Emulation type for volume. * {@code ISCSI} - ISCSI attached block storage device. * {@code
     * SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code VFIO} - Direct
     * attached Virtual Function storage. This is the default option for local data volumes on
     * platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for
     * boot volumes and remote block storage volumes on platform images.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteDataVolumeType")
    private final RemoteDataVolumeType remoteDataVolumeType;

    /**
     * Emulation type for volume. * {@code ISCSI} - ISCSI attached block storage device. * {@code
     * SCSI} - Emulated SCSI disk. * {@code IDE} - Emulated IDE disk. * {@code VFIO} - Direct
     * attached Virtual Function storage. This is the default option for local data volumes on
     * platform images. * {@code PARAVIRTUALIZED} - Paravirtualized disk. This is the default for
     * boot volumes and remote block storage volumes on platform images.
     *
     * @return the value
     */
    public RemoteDataVolumeType getRemoteDataVolumeType() {
        return remoteDataVolumeType;
    }

    /**
     * Deprecated. Instead use {@code isPvEncryptionInTransitEnabled} in {@link
     * #instanceConfigurationLaunchInstanceDetails(InstanceConfigurationLaunchInstanceDetailsRequest)
     * instanceConfigurationLaunchInstanceDetails}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    /**
     * Deprecated. Instead use {@code isPvEncryptionInTransitEnabled} in {@link
     * #instanceConfigurationLaunchInstanceDetails(InstanceConfigurationLaunchInstanceDetailsRequest)
     * instanceConfigurationLaunchInstanceDetails}.
     *
     * @return the value
     */
    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
    }

    /** Whether to enable consistent volume naming feature. Defaults to false. */
    @com.fasterxml.jackson.annotation.JsonProperty("isConsistentVolumeNamingEnabled")
    private final Boolean isConsistentVolumeNamingEnabled;

    /**
     * Whether to enable consistent volume naming feature. Defaults to false.
     *
     * @return the value
     */
    public Boolean getIsConsistentVolumeNamingEnabled() {
        return isConsistentVolumeNamingEnabled;
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
        sb.append("InstanceConfigurationLaunchOptions(");
        sb.append("super=").append(super.toString());
        sb.append("bootVolumeType=").append(String.valueOf(this.bootVolumeType));
        sb.append(", firmware=").append(String.valueOf(this.firmware));
        sb.append(", networkType=").append(String.valueOf(this.networkType));
        sb.append(", remoteDataVolumeType=").append(String.valueOf(this.remoteDataVolumeType));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(", isConsistentVolumeNamingEnabled=")
                .append(String.valueOf(this.isConsistentVolumeNamingEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationLaunchOptions)) {
            return false;
        }

        InstanceConfigurationLaunchOptions other = (InstanceConfigurationLaunchOptions) o;
        return java.util.Objects.equals(this.bootVolumeType, other.bootVolumeType)
                && java.util.Objects.equals(this.firmware, other.firmware)
                && java.util.Objects.equals(this.networkType, other.networkType)
                && java.util.Objects.equals(this.remoteDataVolumeType, other.remoteDataVolumeType)
                && java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && java.util.Objects.equals(
                        this.isConsistentVolumeNamingEnabled, other.isConsistentVolumeNamingEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bootVolumeType == null ? 43 : this.bootVolumeType.hashCode());
        result = (result * PRIME) + (this.firmware == null ? 43 : this.firmware.hashCode());
        result = (result * PRIME) + (this.networkType == null ? 43 : this.networkType.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteDataVolumeType == null
                                ? 43
                                : this.remoteDataVolumeType.hashCode());
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isConsistentVolumeNamingEnabled == null
                                ? 43
                                : this.isConsistentVolumeNamingEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
