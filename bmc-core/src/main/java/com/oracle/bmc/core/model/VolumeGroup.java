/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies a volume group which is a collection of
 * volumes. For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VolumeGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VolumeGroup {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "lifecycleState",
        "sizeInMBs",
        "sizeInGBs",
        "sourceDetails",
        "timeCreated",
        "volumeIds",
        "isHydrated",
        "volumeGroupReplicas"
    })
    public VolumeGroup(
            String availabilityDomain,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            LifecycleState lifecycleState,
            Long sizeInMBs,
            Long sizeInGBs,
            VolumeGroupSourceDetails sourceDetails,
            java.util.Date timeCreated,
            java.util.List<String> volumeIds,
            Boolean isHydrated,
            java.util.List<VolumeGroupReplicaInfo> volumeGroupReplicas) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.sizeInMBs = sizeInMBs;
        this.sizeInGBs = sizeInGBs;
        this.sourceDetails = sourceDetails;
        this.timeCreated = timeCreated;
        this.volumeIds = volumeIds;
        this.isHydrated = isHydrated;
        this.volumeGroupReplicas = volumeGroupReplicas;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the volume group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the volume group.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the compartment that contains the volume group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the volume group.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The OCID for the volume group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID for the volume group.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The current state of a volume group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of a volume group.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The aggregate size of the volume group in MBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        /**
         * The aggregate size of the volume group in MBs.
         * @param sizeInMBs the value to set
         * @return this builder
         **/
        public Builder sizeInMBs(Long sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            this.__explicitlySet__.add("sizeInMBs");
            return this;
        }
        /**
         * The aggregate size of the volume group in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        /**
         * The aggregate size of the volume group in GBs.
         * @param sizeInGBs the value to set
         * @return this builder
         **/
        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private VolumeGroupSourceDetails sourceDetails;

        public Builder sourceDetails(VolumeGroupSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * The date and time the volume group was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the volume group was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * OCIDs for the volumes in this volume group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeIds")
        private java.util.List<String> volumeIds;

        /**
         * OCIDs for the volumes in this volume group.
         * @param volumeIds the value to set
         * @return this builder
         **/
        public Builder volumeIds(java.util.List<String> volumeIds) {
            this.volumeIds = volumeIds;
            this.__explicitlySet__.add("volumeIds");
            return this;
        }
        /**
         * Specifies whether the newly created cloned volume group's data has finished copying
         * from the source volume group or backup.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
        private Boolean isHydrated;

        /**
         * Specifies whether the newly created cloned volume group's data has finished copying
         * from the source volume group or backup.
         *
         * @param isHydrated the value to set
         * @return this builder
         **/
        public Builder isHydrated(Boolean isHydrated) {
            this.isHydrated = isHydrated;
            this.__explicitlySet__.add("isHydrated");
            return this;
        }
        /**
         * The list of volume group replicas of this volume group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicas")
        private java.util.List<VolumeGroupReplicaInfo> volumeGroupReplicas;

        /**
         * The list of volume group replicas of this volume group.
         * @param volumeGroupReplicas the value to set
         * @return this builder
         **/
        public Builder volumeGroupReplicas(
                java.util.List<VolumeGroupReplicaInfo> volumeGroupReplicas) {
            this.volumeGroupReplicas = volumeGroupReplicas;
            this.__explicitlySet__.add("volumeGroupReplicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeGroup build() {
            VolumeGroup __instance__ =
                    new VolumeGroup(
                            availabilityDomain,
                            compartmentId,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            lifecycleState,
                            sizeInMBs,
                            sizeInGBs,
                            sourceDetails,
                            timeCreated,
                            volumeIds,
                            isHydrated,
                            volumeGroupReplicas);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeGroup o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .sizeInMBs(o.getSizeInMBs())
                            .sizeInGBs(o.getSizeInGBs())
                            .sourceDetails(o.getSourceDetails())
                            .timeCreated(o.getTimeCreated())
                            .volumeIds(o.getVolumeIds())
                            .isHydrated(o.getIsHydrated())
                            .volumeGroupReplicas(o.getVolumeGroupReplicas());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The availability domain of the volume group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the volume group.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compartment that contains the volume group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the volume group.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The OCID for the volume group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID for the volume group.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The current state of a volume group.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Faulty("FAULTY"),
        UpdatePending("UPDATE_PENDING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
     * The current state of a volume group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of a volume group.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The aggregate size of the volume group in MBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
    private final Long sizeInMBs;

    /**
     * The aggregate size of the volume group in MBs.
     * @return the value
     **/
    public Long getSizeInMBs() {
        return sizeInMBs;
    }

    /**
     * The aggregate size of the volume group in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Long sizeInGBs;

    /**
     * The aggregate size of the volume group in GBs.
     * @return the value
     **/
    public Long getSizeInGBs() {
        return sizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final VolumeGroupSourceDetails sourceDetails;

    public VolumeGroupSourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * The date and time the volume group was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the volume group was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * OCIDs for the volumes in this volume group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeIds")
    private final java.util.List<String> volumeIds;

    /**
     * OCIDs for the volumes in this volume group.
     * @return the value
     **/
    public java.util.List<String> getVolumeIds() {
        return volumeIds;
    }

    /**
     * Specifies whether the newly created cloned volume group's data has finished copying
     * from the source volume group or backup.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
    private final Boolean isHydrated;

    /**
     * Specifies whether the newly created cloned volume group's data has finished copying
     * from the source volume group or backup.
     *
     * @return the value
     **/
    public Boolean getIsHydrated() {
        return isHydrated;
    }

    /**
     * The list of volume group replicas of this volume group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicas")
    private final java.util.List<VolumeGroupReplicaInfo> volumeGroupReplicas;

    /**
     * The list of volume group replicas of this volume group.
     * @return the value
     **/
    public java.util.List<VolumeGroupReplicaInfo> getVolumeGroupReplicas() {
        return volumeGroupReplicas;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VolumeGroup(");
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sizeInMBs=").append(String.valueOf(this.sizeInMBs));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", volumeIds=").append(String.valueOf(this.volumeIds));
        sb.append(", isHydrated=").append(String.valueOf(this.isHydrated));
        sb.append(", volumeGroupReplicas=").append(String.valueOf(this.volumeGroupReplicas));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeGroup)) {
            return false;
        }

        VolumeGroup other = (VolumeGroup) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sizeInMBs, other.sizeInMBs)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.volumeIds, other.volumeIds)
                && java.util.Objects.equals(this.isHydrated, other.isHydrated)
                && java.util.Objects.equals(this.volumeGroupReplicas, other.volumeGroupReplicas)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sizeInMBs == null ? 43 : this.sizeInMBs.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.volumeIds == null ? 43 : this.volumeIds.hashCode());
        result = (result * PRIME) + (this.isHydrated == null ? 43 : this.isHydrated.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupReplicas == null
                                ? 43
                                : this.volumeGroupReplicas.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
