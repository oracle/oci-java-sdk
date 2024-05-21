/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Defines the lifecycle stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LifecycleStage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LifecycleStage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleEnvironmentId",
        "rank",
        "osFamily",
        "archType",
        "vendorName",
        "managedInstanceIds",
        "location",
        "softwareSourceId",
        "timeCreated",
        "timeModified",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public LifecycleStage(
            String id,
            String compartmentId,
            String displayName,
            String lifecycleEnvironmentId,
            Integer rank,
            OsFamily osFamily,
            ArchType archType,
            VendorName vendorName,
            java.util.List<ManagedInstanceDetails> managedInstanceIds,
            ManagedInstanceLocation location,
            SoftwareSourceDetails softwareSourceId,
            java.util.Date timeCreated,
            java.util.Date timeModified,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleEnvironmentId = lifecycleEnvironmentId;
        this.rank = rank;
        this.osFamily = osFamily;
        this.archType = archType;
        this.vendorName = vendorName;
        this.managedInstanceIds = managedInstanceIds;
        this.location = location;
        this.softwareSourceId = softwareSourceId;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the lifecycle stage.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The user-friendly name for the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the lifecycle stage.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment that contains the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleEnvironmentId")
        private String lifecycleEnvironmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment that contains the lifecycle stage.
         * @param lifecycleEnvironmentId the value to set
         * @return this builder
         **/
        public Builder lifecycleEnvironmentId(String lifecycleEnvironmentId) {
            this.lifecycleEnvironmentId = lifecycleEnvironmentId;
            this.__explicitlySet__.add("lifecycleEnvironmentId");
            return this;
        }
        /**
         * User-specified rank for the lifecycle stage. Rank determines the hierarchy of the lifecycle stages within the lifecycle environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rank")
        private Integer rank;

        /**
         * User-specified rank for the lifecycle stage. Rank determines the hierarchy of the lifecycle stages within the lifecycle environment.
         *
         * @param rank the value to set
         * @return this builder
         **/
        public Builder rank(Integer rank) {
            this.rank = rank;
            this.__explicitlySet__.add("rank");
            return this;
        }
        /**
         * The operating system of the managed instances in the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The operating system of the managed instances in the lifecycle stage.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * The CPU architecture of the managed instances in the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The CPU architecture of the managed instances in the lifecycle stage.
         * @param archType the value to set
         * @return this builder
         **/
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /**
         * The vendor of the operating system used by the managed instances in the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private VendorName vendorName;

        /**
         * The vendor of the operating system used by the managed instances in the lifecycle stage.
         * @param vendorName the value to set
         * @return this builder
         **/
        public Builder vendorName(VendorName vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }
        /**
         * The list of managed instances associated with the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
        private java.util.List<ManagedInstanceDetails> managedInstanceIds;

        /**
         * The list of managed instances associated with the lifecycle stage.
         * @param managedInstanceIds the value to set
         * @return this builder
         **/
        public Builder managedInstanceIds(
                java.util.List<ManagedInstanceDetails> managedInstanceIds) {
            this.managedInstanceIds = managedInstanceIds;
            this.__explicitlySet__.add("managedInstanceIds");
            return this;
        }
        /**
         * The location of managed instances associated with the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private ManagedInstanceLocation location;

        /**
         * The location of managed instances associated with the lifecycle stage.
         * @param location the value to set
         * @return this builder
         **/
        public Builder location(ManagedInstanceLocation location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private SoftwareSourceDetails softwareSourceId;

        public Builder softwareSourceId(SoftwareSourceDetails softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }
        /**
         * The time the lifecycle stage was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the lifecycle stage was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the lifecycle stage was last modified (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The time the lifecycle stage was last modified (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         * @param timeModified the value to set
         * @return this builder
         **/
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /**
         * The current state of the lifecycle stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the lifecycle stage.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LifecycleStage build() {
            LifecycleStage model =
                    new LifecycleStage(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.lifecycleEnvironmentId,
                            this.rank,
                            this.osFamily,
                            this.archType,
                            this.vendorName,
                            this.managedInstanceIds,
                            this.location,
                            this.softwareSourceId,
                            this.timeCreated,
                            this.timeModified,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LifecycleStage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleEnvironmentId")) {
                this.lifecycleEnvironmentId(model.getLifecycleEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("rank")) {
                this.rank(model.getRank());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("vendorName")) {
                this.vendorName(model.getVendorName());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceIds")) {
                this.managedInstanceIds(model.getManagedInstanceIds());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceId")) {
                this.softwareSourceId(model.getSoftwareSourceId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the lifecycle stage.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-friendly name for the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the lifecycle stage.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment that contains the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleEnvironmentId")
    private final String lifecycleEnvironmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment that contains the lifecycle stage.
     * @return the value
     **/
    public String getLifecycleEnvironmentId() {
        return lifecycleEnvironmentId;
    }

    /**
     * User-specified rank for the lifecycle stage. Rank determines the hierarchy of the lifecycle stages within the lifecycle environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rank")
    private final Integer rank;

    /**
     * User-specified rank for the lifecycle stage. Rank determines the hierarchy of the lifecycle stages within the lifecycle environment.
     *
     * @return the value
     **/
    public Integer getRank() {
        return rank;
    }

    /**
     * The operating system of the managed instances in the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The operating system of the managed instances in the lifecycle stage.
     * @return the value
     **/
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /**
     * The CPU architecture of the managed instances in the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The CPU architecture of the managed instances in the lifecycle stage.
     * @return the value
     **/
    public ArchType getArchType() {
        return archType;
    }

    /**
     * The vendor of the operating system used by the managed instances in the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final VendorName vendorName;

    /**
     * The vendor of the operating system used by the managed instances in the lifecycle stage.
     * @return the value
     **/
    public VendorName getVendorName() {
        return vendorName;
    }

    /**
     * The list of managed instances associated with the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
    private final java.util.List<ManagedInstanceDetails> managedInstanceIds;

    /**
     * The list of managed instances associated with the lifecycle stage.
     * @return the value
     **/
    public java.util.List<ManagedInstanceDetails> getManagedInstanceIds() {
        return managedInstanceIds;
    }

    /**
     * The location of managed instances associated with the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final ManagedInstanceLocation location;

    /**
     * The location of managed instances associated with the lifecycle stage.
     * @return the value
     **/
    public ManagedInstanceLocation getLocation() {
        return location;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final SoftwareSourceDetails softwareSourceId;

    public SoftwareSourceDetails getSoftwareSourceId() {
        return softwareSourceId;
    }

    /**
     * The time the lifecycle stage was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the lifecycle stage was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the lifecycle stage was last modified (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The time the lifecycle stage was last modified (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     * @return the value
     **/
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /**
     * The current state of the lifecycle stage.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
     * The current state of the lifecycle stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the lifecycle stage.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("LifecycleStage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleEnvironmentId=").append(String.valueOf(this.lifecycleEnvironmentId));
        sb.append(", rank=").append(String.valueOf(this.rank));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", managedInstanceIds=").append(String.valueOf(this.managedInstanceIds));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LifecycleStage)) {
            return false;
        }

        LifecycleStage other = (LifecycleStage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.lifecycleEnvironmentId, other.lifecycleEnvironmentId)
                && java.util.Objects.equals(this.rank, other.rank)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.managedInstanceIds, other.managedInstanceIds)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleEnvironmentId == null
                                ? 43
                                : this.lifecycleEnvironmentId.hashCode());
        result = (result * PRIME) + (this.rank == null ? 43 : this.rank.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceIds == null
                                ? 43
                                : this.managedInstanceIds.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
