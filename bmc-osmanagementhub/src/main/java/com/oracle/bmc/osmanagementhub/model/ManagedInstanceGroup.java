/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that defines the managed instance group.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagedInstanceGroup.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedInstanceGroup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "timeCreated",
        "timeModified",
        "lifecycleState",
        "osFamily",
        "archType",
        "vendorName",
        "softwareSourceIds",
        "softwareSources",
        "managedInstanceIds",
        "managedInstanceCount",
        "location",
        "pendingJobCount",
        "notificationTopicId",
        "autonomousSettings",
        "isManagedByAutonomousLinux",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ManagedInstanceGroup(
            String id,
            String compartmentId,
            String displayName,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeModified,
            LifecycleState lifecycleState,
            OsFamily osFamily,
            ArchType archType,
            VendorName vendorName,
            java.util.List<SoftwareSourceDetails> softwareSourceIds,
            java.util.List<SoftwareSourceDetails> softwareSources,
            java.util.List<String> managedInstanceIds,
            Integer managedInstanceCount,
            ManagedInstanceLocation location,
            Integer pendingJobCount,
            String notificationTopicId,
            AutonomousSettings autonomousSettings,
            Boolean isManagedByAutonomousLinux,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
        this.lifecycleState = lifecycleState;
        this.osFamily = osFamily;
        this.archType = archType;
        this.vendorName = vendorName;
        this.softwareSourceIds = softwareSourceIds;
        this.softwareSources = softwareSources;
        this.managedInstanceIds = managedInstanceIds;
        this.managedInstanceCount = managedInstanceCount;
        this.location = location;
        this.pendingJobCount = pendingJobCount;
        this.notificationTopicId = notificationTopicId;
        this.autonomousSettings = autonomousSettings;
        this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the managed instance group.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name for the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the managed instance group.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * User-specified information about the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified information about the managed instance group.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The time the managed instance group was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the managed instance group was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the managed instance group was last modified (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The time the managed instance group was last modified (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         * @param timeModified the value to set
         * @return this builder
         **/
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /**
         * The current state of the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the managed instance group.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The operating system type of the instances in the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The operating system type of the instances in the managed instance group.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * The CPU architecture of the instances in the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The CPU architecture of the instances in the managed instance group.
         * @param archType the value to set
         * @return this builder
         **/
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /**
         * The vendor of the operating system used by the managed instances in the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private VendorName vendorName;

        /**
         * The vendor of the operating system used by the managed instances in the group.
         * @param vendorName the value to set
         * @return this builder
         **/
        public Builder vendorName(VendorName vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }
        /**
         * The list of software source [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that the managed instance group will use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
        private java.util.List<SoftwareSourceDetails> softwareSourceIds;

        /**
         * The list of software source [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that the managed instance group will use.
         * @param softwareSourceIds the value to set
         * @return this builder
         **/
        public Builder softwareSourceIds(java.util.List<SoftwareSourceDetails> softwareSourceIds) {
            this.softwareSourceIds = softwareSourceIds;
            this.__explicitlySet__.add("softwareSourceIds");
            return this;
        }
        /**
         * The list of software sources that the managed instance group will use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceDetails> softwareSources;

        /**
         * The list of software sources that the managed instance group will use.
         * @param softwareSources the value to set
         * @return this builder
         **/
        public Builder softwareSources(java.util.List<SoftwareSourceDetails> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }
        /**
         * The list of managed instance [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) attached to the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
        private java.util.List<String> managedInstanceIds;

        /**
         * The list of managed instance [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) attached to the managed instance group.
         * @param managedInstanceIds the value to set
         * @return this builder
         **/
        public Builder managedInstanceIds(java.util.List<String> managedInstanceIds) {
            this.managedInstanceIds = managedInstanceIds;
            this.__explicitlySet__.add("managedInstanceIds");
            return this;
        }
        /**
         * The number of managed instances in the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
        private Integer managedInstanceCount;

        /**
         * The number of managed instances in the group.
         * @param managedInstanceCount the value to set
         * @return this builder
         **/
        public Builder managedInstanceCount(Integer managedInstanceCount) {
            this.managedInstanceCount = managedInstanceCount;
            this.__explicitlySet__.add("managedInstanceCount");
            return this;
        }
        /**
         * The location of managed instances attached to the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private ManagedInstanceLocation location;

        /**
         * The location of managed instances attached to the group.
         * @param location the value to set
         * @return this builder
         **/
        public Builder location(ManagedInstanceLocation location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /**
         * The number of scheduled jobs pending against the managed instance group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pendingJobCount")
        private Integer pendingJobCount;

        /**
         * The number of scheduled jobs pending against the managed instance group.
         * @param pendingJobCount the value to set
         * @return this builder
         **/
        public Builder pendingJobCount(Integer pendingJobCount) {
            this.pendingJobCount = pendingJobCount;
            this.__explicitlySet__.add("pendingJobCount");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications to the customer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications to the customer.
         * @param notificationTopicId the value to set
         * @return this builder
         **/
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousSettings")
        private AutonomousSettings autonomousSettings;

        public Builder autonomousSettings(AutonomousSettings autonomousSettings) {
            this.autonomousSettings = autonomousSettings;
            this.__explicitlySet__.add("autonomousSettings");
            return this;
        }
        /**
         * Indicates whether the Autonomous Linux service manages the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
        private Boolean isManagedByAutonomousLinux;

        /**
         * Indicates whether the Autonomous Linux service manages the group.
         * @param isManagedByAutonomousLinux the value to set
         * @return this builder
         **/
        public Builder isManagedByAutonomousLinux(Boolean isManagedByAutonomousLinux) {
            this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            this.__explicitlySet__.add("isManagedByAutonomousLinux");
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

        public ManagedInstanceGroup build() {
            ManagedInstanceGroup model =
                    new ManagedInstanceGroup(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.timeModified,
                            this.lifecycleState,
                            this.osFamily,
                            this.archType,
                            this.vendorName,
                            this.softwareSourceIds,
                            this.softwareSources,
                            this.managedInstanceIds,
                            this.managedInstanceCount,
                            this.location,
                            this.pendingJobCount,
                            this.notificationTopicId,
                            this.autonomousSettings,
                            this.isManagedByAutonomousLinux,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstanceGroup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("vendorName")) {
                this.vendorName(model.getVendorName());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceIds")) {
                this.softwareSourceIds(model.getSoftwareSourceIds());
            }
            if (model.wasPropertyExplicitlySet("softwareSources")) {
                this.softwareSources(model.getSoftwareSources());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceIds")) {
                this.managedInstanceIds(model.getManagedInstanceIds());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceCount")) {
                this.managedInstanceCount(model.getManagedInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("pendingJobCount")) {
                this.pendingJobCount(model.getPendingJobCount());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
            }
            if (model.wasPropertyExplicitlySet("autonomousSettings")) {
                this.autonomousSettings(model.getAutonomousSettings());
            }
            if (model.wasPropertyExplicitlySet("isManagedByAutonomousLinux")) {
                this.isManagedByAutonomousLinux(model.getIsManagedByAutonomousLinux());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the managed instance group.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name for the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the managed instance group.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * User-specified information about the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified information about the managed instance group.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The time the managed instance group was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the managed instance group was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the managed instance group was last modified (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The time the managed instance group was last modified (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     * @return the value
     **/
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /**
     * The current state of the managed instance group.
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
     * The current state of the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the managed instance group.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The operating system type of the instances in the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The operating system type of the instances in the managed instance group.
     * @return the value
     **/
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /**
     * The CPU architecture of the instances in the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The CPU architecture of the instances in the managed instance group.
     * @return the value
     **/
    public ArchType getArchType() {
        return archType;
    }

    /**
     * The vendor of the operating system used by the managed instances in the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final VendorName vendorName;

    /**
     * The vendor of the operating system used by the managed instances in the group.
     * @return the value
     **/
    public VendorName getVendorName() {
        return vendorName;
    }

    /**
     * The list of software source [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that the managed instance group will use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
    private final java.util.List<SoftwareSourceDetails> softwareSourceIds;

    /**
     * The list of software source [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that the managed instance group will use.
     * @return the value
     **/
    public java.util.List<SoftwareSourceDetails> getSoftwareSourceIds() {
        return softwareSourceIds;
    }

    /**
     * The list of software sources that the managed instance group will use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<SoftwareSourceDetails> softwareSources;

    /**
     * The list of software sources that the managed instance group will use.
     * @return the value
     **/
    public java.util.List<SoftwareSourceDetails> getSoftwareSources() {
        return softwareSources;
    }

    /**
     * The list of managed instance [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) attached to the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
    private final java.util.List<String> managedInstanceIds;

    /**
     * The list of managed instance [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) attached to the managed instance group.
     * @return the value
     **/
    public java.util.List<String> getManagedInstanceIds() {
        return managedInstanceIds;
    }

    /**
     * The number of managed instances in the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
    private final Integer managedInstanceCount;

    /**
     * The number of managed instances in the group.
     * @return the value
     **/
    public Integer getManagedInstanceCount() {
        return managedInstanceCount;
    }

    /**
     * The location of managed instances attached to the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final ManagedInstanceLocation location;

    /**
     * The location of managed instances attached to the group.
     * @return the value
     **/
    public ManagedInstanceLocation getLocation() {
        return location;
    }

    /**
     * The number of scheduled jobs pending against the managed instance group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pendingJobCount")
    private final Integer pendingJobCount;

    /**
     * The number of scheduled jobs pending against the managed instance group.
     * @return the value
     **/
    public Integer getPendingJobCount() {
        return pendingJobCount;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications to the customer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications to the customer.
     * @return the value
     **/
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("autonomousSettings")
    private final AutonomousSettings autonomousSettings;

    public AutonomousSettings getAutonomousSettings() {
        return autonomousSettings;
    }

    /**
     * Indicates whether the Autonomous Linux service manages the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
    private final Boolean isManagedByAutonomousLinux;

    /**
     * Indicates whether the Autonomous Linux service manages the group.
     * @return the value
     **/
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
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
        sb.append("ManagedInstanceGroup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", softwareSourceIds=").append(String.valueOf(this.softwareSourceIds));
        sb.append(", softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append(", managedInstanceIds=").append(String.valueOf(this.managedInstanceIds));
        sb.append(", managedInstanceCount=").append(String.valueOf(this.managedInstanceCount));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", pendingJobCount=").append(String.valueOf(this.pendingJobCount));
        sb.append(", notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", autonomousSettings=").append(String.valueOf(this.autonomousSettings));
        sb.append(", isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
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
        if (!(o instanceof ManagedInstanceGroup)) {
            return false;
        }

        ManagedInstanceGroup other = (ManagedInstanceGroup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.softwareSourceIds, other.softwareSourceIds)
                && java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && java.util.Objects.equals(this.managedInstanceIds, other.managedInstanceIds)
                && java.util.Objects.equals(this.managedInstanceCount, other.managedInstanceCount)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.pendingJobCount, other.pendingJobCount)
                && java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(this.autonomousSettings, other.autonomousSettings)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceIds == null ? 43 : this.softwareSourceIds.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSources == null ? 43 : this.softwareSources.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceIds == null
                                ? 43
                                : this.managedInstanceIds.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceCount == null
                                ? 43
                                : this.managedInstanceCount.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.pendingJobCount == null ? 43 : this.pendingJobCount.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousSettings == null
                                ? 43
                                : this.autonomousSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
