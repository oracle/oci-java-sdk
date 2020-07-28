/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Options for tuning the compatibility and performance of VM shapes.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateLaunchOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateLaunchOptions {
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

        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            this.__explicitlySet__.add("networkType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLaunchOptions build() {
            UpdateLaunchOptions __instance__ =
                    new UpdateLaunchOptions(
                            bootVolumeType, networkType, isPvEncryptionInTransitEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLaunchOptions o) {
            Builder copiedBuilder =
                    bootVolumeType(o.getBootVolumeType())
                            .networkType(o.getNetworkType())
                            .isPvEncryptionInTransitEnabled(o.getIsPvEncryptionInTransitEnabled());

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
     * Emulation type for the boot volume.
     * * `ISCSI` - ISCSI attached block storage device.
     * * `PARAVIRTUALIZED` - Paravirtualized disk. This is the default for boot volumes and remote block
     * storage volumes on Oracle-provided plaform images.
     * <p>
     * Before you change the boot volume attachment type, detach all block volumes and VNICs except for
     * the boot volume and the primary VNIC.
     * <p>
     * If the instance is running when you change the boot volume attachment type, it will be rebooted.
     * <p>
     **Note:** Some instances might not function properly if you change the boot volume attachment type. After
     * the instance reboots and is running, connect to it. If the connection fails or the OS doesn't behave
     * as expected, the changes are not supported. Revert the instance to the original boot volume attachment type.
     *
     **/
    public enum BootVolumeType {
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
     * Emulation type for the boot volume.
     * * `ISCSI` - ISCSI attached block storage device.
     * * `PARAVIRTUALIZED` - Paravirtualized disk. This is the default for boot volumes and remote block
     * storage volumes on Oracle-provided plaform images.
     * <p>
     * Before you change the boot volume attachment type, detach all block volumes and VNICs except for
     * the boot volume and the primary VNIC.
     * <p>
     * If the instance is running when you change the boot volume attachment type, it will be rebooted.
     * <p>
     **Note:** Some instances might not function properly if you change the boot volume attachment type. After
     * the instance reboots and is running, connect to it. If the connection fails or the OS doesn't behave
     * as expected, the changes are not supported. Revert the instance to the original boot volume attachment type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeType")
    BootVolumeType bootVolumeType;
    /**
     * Emulation type for the physical network interface card (NIC).
     * * `VFIO` - Direct attached Virtual Function network controller. This is the networking type
     * when you launch an instance using hardware-assisted (SR-IOV) networking.
     * * `PARAVIRTUALIZED` - VM instances launch with paravirtualized devices using VirtIO drivers.
     * <p>
     * Before you change the networking type, detach all VNICs and block volumes except for the primary
     * VNIC and the boot volume.
     * <p>
     * The image must have paravirtualized drivers installed. For more information, see
     * [Editing an Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
     * <p>
     * If the instance is running when you change the network type, it will be rebooted.
     * <p>
     **Note:** Some instances might not function properly if you change the networking type. After
     * the instance reboots and is running, connect to it. If the connection fails or the OS doesn't behave
     * as expected, the changes are not supported. Revert the instance to the original networking type.
     *
     **/
    public enum NetworkType {
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
     * Emulation type for the physical network interface card (NIC).
     * * `VFIO` - Direct attached Virtual Function network controller. This is the networking type
     * when you launch an instance using hardware-assisted (SR-IOV) networking.
     * * `PARAVIRTUALIZED` - VM instances launch with paravirtualized devices using VirtIO drivers.
     * <p>
     * Before you change the networking type, detach all VNICs and block volumes except for the primary
     * VNIC and the boot volume.
     * <p>
     * The image must have paravirtualized drivers installed. For more information, see
     * [Editing an Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
     * <p>
     * If the instance is running when you change the network type, it will be rebooted.
     * <p>
     **Note:** Some instances might not function properly if you change the networking type. After
     * the instance reboots and is running, connect to it. If the connection fails or the OS doesn't behave
     * as expected, the changes are not supported. Revert the instance to the original networking type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    NetworkType networkType;

    /**
     * Whether to enable in-transit encryption for the boot volume's paravirtualized attachment.
     * <p>
     * Data in transit is transferred over an internal and highly secure network. If you have specific
     * compliance requirements related to the encryption of the data while it is moving between the
     * instance and the boot volume, you can enable in-transit encryption. In-transit encryption is
     * not enabled by default.
     * <p>
     * All boot volumes are encrypted at rest.
     * <p>
     * For more information, see [Block Volume Encryption](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm#Encrypti).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    Boolean isPvEncryptionInTransitEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
