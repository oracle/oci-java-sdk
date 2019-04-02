/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Options for tuning compatibility and performance of VM shapes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LaunchOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LaunchOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeType")
        private BootVolumeType bootVolumeType;

        public Builder bootVolumeType(BootVolumeType bootVolumeType) {
            this.bootVolumeType = bootVolumeType;
            this.__explicitlySet__.add("bootVolumeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("firmware")
        private Firmware firmware;

        public Builder firmware(Firmware firmware) {
            this.firmware = firmware;
            this.__explicitlySet__.add("firmware");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            this.__explicitlySet__.add("networkType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remoteDataVolumeType")
        private RemoteDataVolumeType remoteDataVolumeType;

        public Builder remoteDataVolumeType(RemoteDataVolumeType remoteDataVolumeType) {
            this.remoteDataVolumeType = remoteDataVolumeType;
            this.__explicitlySet__.add("remoteDataVolumeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConsistentVolumeNamingEnabled")
        private Boolean isConsistentVolumeNamingEnabled;

        public Builder isConsistentVolumeNamingEnabled(Boolean isConsistentVolumeNamingEnabled) {
            this.isConsistentVolumeNamingEnabled = isConsistentVolumeNamingEnabled;
            this.__explicitlySet__.add("isConsistentVolumeNamingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchOptions build() {
            LaunchOptions __instance__ =
                    new LaunchOptions(
                            bootVolumeType,
                            firmware,
                            networkType,
                            remoteDataVolumeType,
                            isPvEncryptionInTransitEnabled,
                            isConsistentVolumeNamingEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchOptions o) {
            Builder copiedBuilder =
                    bootVolumeType(o.getBootVolumeType())
                            .firmware(o.getFirmware())
                            .networkType(o.getNetworkType())
                            .remoteDataVolumeType(o.getRemoteDataVolumeType())
                            .isPvEncryptionInTransitEnabled(o.getIsPvEncryptionInTransitEnabled())
                            .isConsistentVolumeNamingEnabled(
                                    o.getIsConsistentVolumeNamingEnabled());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Emulation type for volume.
     * * `ISCSI` - ISCSI attached block storage device. This is the default for Boot Volumes and Remote Block
     * Storage volumes on Oracle provided images.
     * * `SCSI` - Emulated SCSI disk.
     * * `IDE` - Emulated IDE disk.
     * * `VFIO` - Direct attached Virtual Function storage.  This is the default option for Local data
     * volumes on Oracle provided images.
     * * `PARAVIRTUALIZED` - Paravirtualized disk.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BootVolumeType {
        Iscsi("ISCSI"),
        Scsi("SCSI"),
        Ide("IDE"),
        Vfio("VFIO"),
        Paravirtualized("PARAVIRTUALIZED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Emulation type for volume.
     * * `ISCSI` - ISCSI attached block storage device. This is the default for Boot Volumes and Remote Block
     * Storage volumes on Oracle provided images.
     * * `SCSI` - Emulated SCSI disk.
     * * `IDE` - Emulated IDE disk.
     * * `VFIO` - Direct attached Virtual Function storage.  This is the default option for Local data
     * volumes on Oracle provided images.
     * * `PARAVIRTUALIZED` - Paravirtualized disk.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeType")
    BootVolumeType bootVolumeType;
    /**
     * Firmware used to boot VM.  Select the option that matches your operating system.
     * * `BIOS` - Boot VM using BIOS style firmware.  This is compatible with both 32 bit and 64 bit operating
     * systems that boot using MBR style bootloaders.
     * * `UEFI_64` - Boot VM using UEFI style firmware compatible with 64 bit operating systems.  This is the
     * default for Oracle provided images.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Firmware {
        Bios("BIOS"),
        Uefi64("UEFI_64"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Firmware used to boot VM.  Select the option that matches your operating system.
     * * `BIOS` - Boot VM using BIOS style firmware.  This is compatible with both 32 bit and 64 bit operating
     * systems that boot using MBR style bootloaders.
     * * `UEFI_64` - Boot VM using UEFI style firmware compatible with 64 bit operating systems.  This is the
     * default for Oracle provided images.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firmware")
    Firmware firmware;
    /**
     * Emulation type for NIC.
     * * `E1000` - Emulated Gigabit ethernet controller.  Compatible with Linux e1000 network driver.
     * * `VFIO` - Direct attached Virtual Function network controller.  Default for Oracle provided images.
     * * `PARAVIRTUALIZED` - VM instances launch with paravirtualized devices using virtio drivers.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum NetworkType {
        E1000("E1000"),
        Vfio("VFIO"),
        Paravirtualized("PARAVIRTUALIZED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Emulation type for NIC.
     * * `E1000` - Emulated Gigabit ethernet controller.  Compatible with Linux e1000 network driver.
     * * `VFIO` - Direct attached Virtual Function network controller.  Default for Oracle provided images.
     * * `PARAVIRTUALIZED` - VM instances launch with paravirtualized devices using virtio drivers.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    NetworkType networkType;
    /**
     * Emulation type for volume.
     * * `ISCSI` - ISCSI attached block storage device. This is the default for Boot Volumes and Remote Block
     * Storage volumes on Oracle provided images.
     * * `SCSI` - Emulated SCSI disk.
     * * `IDE` - Emulated IDE disk.
     * * `VFIO` - Direct attached Virtual Function storage.  This is the default option for Local data
     * volumes on Oracle provided images.
     * * `PARAVIRTUALIZED` - Paravirtualized disk.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RemoteDataVolumeType {
        Iscsi("ISCSI"),
        Scsi("SCSI"),
        Ide("IDE"),
        Vfio("VFIO"),
        Paravirtualized("PARAVIRTUALIZED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Emulation type for volume.
     * * `ISCSI` - ISCSI attached block storage device. This is the default for Boot Volumes and Remote Block
     * Storage volumes on Oracle provided images.
     * * `SCSI` - Emulated SCSI disk.
     * * `IDE` - Emulated IDE disk.
     * * `VFIO` - Direct attached Virtual Function storage.  This is the default option for Local data
     * volumes on Oracle provided images.
     * * `PARAVIRTUALIZED` - Paravirtualized disk.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteDataVolumeType")
    RemoteDataVolumeType remoteDataVolumeType;

    /**
     * Whether to enable in-transit encryption for the boot volume's paravirtualized attachment. The default value is false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    Boolean isPvEncryptionInTransitEnabled;

    /**
     * Whether to enable consistent volume naming feature. Defaults to false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConsistentVolumeNamingEnabled")
    Boolean isConsistentVolumeNamingEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
