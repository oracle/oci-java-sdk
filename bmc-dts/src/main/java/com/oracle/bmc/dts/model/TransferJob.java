/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.014")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TransferJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TransferJob {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uploadBucketName")
        private String uploadBucketName;

        public Builder uploadBucketName(String uploadBucketName) {
            this.uploadBucketName = uploadBucketName;
            this.__explicitlySet__.add("uploadBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deviceType")
        private DeviceType deviceType;

        public Builder deviceType(DeviceType deviceType) {
            this.deviceType = deviceType;
            this.__explicitlySet__.add("deviceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferApplianceLabels")
        private java.util.List<String> attachedTransferApplianceLabels;

        public Builder attachedTransferApplianceLabels(
                java.util.List<String> attachedTransferApplianceLabels) {
            this.attachedTransferApplianceLabels = attachedTransferApplianceLabels;
            this.__explicitlySet__.add("attachedTransferApplianceLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferPackageLabels")
        private java.util.List<String> attachedTransferPackageLabels;

        public Builder attachedTransferPackageLabels(
                java.util.List<String> attachedTransferPackageLabels) {
            this.attachedTransferPackageLabels = attachedTransferPackageLabels;
            this.__explicitlySet__.add("attachedTransferPackageLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferDeviceLabels")
        private java.util.List<String> attachedTransferDeviceLabels;

        public Builder attachedTransferDeviceLabels(
                java.util.List<String> attachedTransferDeviceLabels) {
            this.attachedTransferDeviceLabels = attachedTransferDeviceLabels;
            this.__explicitlySet__.add("attachedTransferDeviceLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TransferJob build() {
            TransferJob __instance__ =
                    new TransferJob(
                            id,
                            compartmentId,
                            uploadBucketName,
                            displayName,
                            label,
                            creationTime,
                            deviceType,
                            lifecycleState,
                            attachedTransferApplianceLabels,
                            attachedTransferPackageLabels,
                            attachedTransferDeviceLabels,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransferJob o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .uploadBucketName(o.getUploadBucketName())
                            .displayName(o.getDisplayName())
                            .label(o.getLabel())
                            .creationTime(o.getCreationTime())
                            .deviceType(o.getDeviceType())
                            .lifecycleState(o.getLifecycleState())
                            .attachedTransferApplianceLabels(o.getAttachedTransferApplianceLabels())
                            .attachedTransferPackageLabels(o.getAttachedTransferPackageLabels())
                            .attachedTransferDeviceLabels(o.getAttachedTransferDeviceLabels())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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

    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    @com.fasterxml.jackson.annotation.JsonProperty("uploadBucketName")
    String uploadBucketName;

    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    @com.fasterxml.jackson.annotation.JsonProperty("label")
    String label;

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    java.util.Date creationTime;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DeviceType {
        Disk("DISK"),
        Appliance("APPLIANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DeviceType> map;

        static {
            map = new java.util.HashMap<>();
            for (DeviceType v : DeviceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeviceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeviceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeviceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("deviceType")
    DeviceType deviceType;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Initiated("INITIATED"),
        Preparing("PREPARING"),
        Active("ACTIVE"),
        Deleted("DELETED"),
        Closed("CLOSED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Transfer Appliance labels associated with this transfer Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferApplianceLabels")
    java.util.List<String> attachedTransferApplianceLabels;

    /**
     * Transfer Package labels associated with this transfer Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferPackageLabels")
    java.util.List<String> attachedTransferPackageLabels;

    /**
     * Transfer Device labels associated with this transfer Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferDeviceLabels")
    java.util.List<String> attachedTransferDeviceLabels;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
