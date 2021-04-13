/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An asynchronous replica of a boot volume that can then be used to create
 * a new boot volume or recover a boot volume. For more information, see [Overview
 * of Block Volume Replicas](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/bootvolumereplicas.htm)
 * To use any of the API operations, you must be authorized in an IAM policy.
 * If you're not authorized, talk to an administrator. If you're an administrator
 * who needs to write policies to give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
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
    builder = BootVolumeReplica.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BootVolumeReplica {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
        private java.util.Date timeLastSynced;

        public Builder timeLastSynced(java.util.Date timeLastSynced) {
            this.timeLastSynced = timeLastSynced;
            this.__explicitlySet__.add("timeLastSynced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeId")
        private String bootVolumeId;

        public Builder bootVolumeId(String bootVolumeId) {
            this.bootVolumeId = bootVolumeId;
            this.__explicitlySet__.add("bootVolumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalDataTransferredInGBs")
        private Long totalDataTransferredInGBs;

        public Builder totalDataTransferredInGBs(Long totalDataTransferredInGBs) {
            this.totalDataTransferredInGBs = totalDataTransferredInGBs;
            this.__explicitlySet__.add("totalDataTransferredInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BootVolumeReplica build() {
            BootVolumeReplica __instance__ =
                    new BootVolumeReplica(
                            availabilityDomain,
                            compartmentId,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            lifecycleState,
                            sizeInGBs,
                            timeCreated,
                            timeLastSynced,
                            bootVolumeId,
                            imageId,
                            totalDataTransferredInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BootVolumeReplica o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .sizeInGBs(o.getSizeInGBs())
                            .timeCreated(o.getTimeCreated())
                            .timeLastSynced(o.getTimeLastSynced())
                            .bootVolumeId(o.getBootVolumeId())
                            .imageId(o.getImageId())
                            .totalDataTransferredInGBs(o.getTotalDataTransferredInGBs());

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
     * The availability domain of the boot volume replica.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the compartment that contains the boot volume replica.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The boot volume replica's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The current state of a boot volume replica.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Activating("ACTIVATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Faulty("FAULTY"),

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
    /**
     * The current state of a boot volume replica.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The size of the source boot volume, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    Long sizeInGBs;

    /**
     * The date and time the boot volume replica was created. Format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the boot volume replica was last synced from the source boot volume.
     * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
    java.util.Date timeLastSynced;

    /**
     * The OCID of the source boot volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeId")
    String bootVolumeId;

    /**
     * The image OCID used to create the boot volume the replica is replicated from.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    String imageId;

    /**
     * The total size of the data transferred from the source boot volume to the boot volume replica, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalDataTransferredInGBs")
    Long totalDataTransferredInGBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
