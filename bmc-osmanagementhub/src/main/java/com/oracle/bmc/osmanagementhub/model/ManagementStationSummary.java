/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Summary of the Management Station. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementStationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementStationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "managedInstanceId",
        "compartmentId",
        "profileId",
        "scheduledJobId",
        "timeNextExecution",
        "displayName",
        "description",
        "hostname",
        "overallState",
        "healthState",
        "overallPercentage",
        "mirrorCapacity",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ManagementStationSummary(
            String id,
            String managedInstanceId,
            String compartmentId,
            String profileId,
            String scheduledJobId,
            java.util.Date timeNextExecution,
            String displayName,
            String description,
            String hostname,
            OverallState overallState,
            HealthState healthState,
            Integer overallPercentage,
            Integer mirrorCapacity,
            ManagementStation.LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.managedInstanceId = managedInstanceId;
        this.compartmentId = compartmentId;
        this.profileId = profileId;
        this.scheduledJobId = scheduledJobId;
        this.timeNextExecution = timeNextExecution;
        this.displayName = displayName;
        this.description = description;
        this.hostname = hostname;
        this.overallState = overallState;
        this.healthState = healthState;
        this.overallPercentage = overallPercentage;
        this.mirrorCapacity = mirrorCapacity;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance that is acting as the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance that is acting as the management station.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the management station.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the registration profile used for the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("profileId")
        private String profileId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the registration profile used for the management station.
         *
         * @param profileId the value to set
         * @return this builder
         */
        public Builder profileId(String profileId) {
            this.profileId = profileId;
            this.__explicitlySet__.add("profileId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the scheduled job for the mirror sync.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobId")
        private String scheduledJobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the scheduled job for the mirror sync.
         *
         * @param scheduledJobId the value to set
         * @return this builder
         */
        public Builder scheduledJobId(String scheduledJobId) {
            this.scheduledJobId = scheduledJobId;
            this.__explicitlySet__.add("scheduledJobId");
            return this;
        }
        /**
         * The date and time of the next scheduled mirror sync (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        /**
         * The date and time of the next scheduled mirror sync (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeNextExecution the value to set
         * @return this builder
         */
        public Builder timeNextExecution(java.util.Date timeNextExecution) {
            this.timeNextExecution = timeNextExecution;
            this.__explicitlySet__.add("timeNextExecution");
            return this;
        }
        /** User-friendly name for the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name for the management station.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** User-specified description of the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description of the management station.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Hostname of the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * Hostname of the management station.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** Current state of the mirror sync for the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("overallState")
        private OverallState overallState;

        /**
         * Current state of the mirror sync for the management station.
         *
         * @param overallState the value to set
         * @return this builder
         */
        public Builder overallState(OverallState overallState) {
            this.overallState = overallState;
            this.__explicitlySet__.add("overallState");
            return this;
        }
        /** Overall health status of the managment station. */
        @com.fasterxml.jackson.annotation.JsonProperty("healthState")
        private HealthState healthState;

        /**
         * Overall health status of the managment station.
         *
         * @param healthState the value to set
         * @return this builder
         */
        public Builder healthState(HealthState healthState) {
            this.healthState = healthState;
            this.__explicitlySet__.add("healthState");
            return this;
        }
        /** A decimal number representing the progress of the current mirror sync. */
        @com.fasterxml.jackson.annotation.JsonProperty("overallPercentage")
        private Integer overallPercentage;

        /**
         * A decimal number representing the progress of the current mirror sync.
         *
         * @param overallPercentage the value to set
         * @return this builder
         */
        public Builder overallPercentage(Integer overallPercentage) {
            this.overallPercentage = overallPercentage;
            this.__explicitlySet__.add("overallPercentage");
            return this;
        }
        /** A decimal number representing the amount of mirror capacity used by the sync. */
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorCapacity")
        private Integer mirrorCapacity;

        /**
         * A decimal number representing the amount of mirror capacity used by the sync.
         *
         * @param mirrorCapacity the value to set
         * @return this builder
         */
        public Builder mirrorCapacity(Integer mirrorCapacity) {
            this.mirrorCapacity = mirrorCapacity;
            this.__explicitlySet__.add("mirrorCapacity");
            return this;
        }
        /** The current state of the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ManagementStation.LifecycleState lifecycleState;

        /**
         * The current state of the management station.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ManagementStation.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementStationSummary build() {
            ManagementStationSummary model =
                    new ManagementStationSummary(
                            this.id,
                            this.managedInstanceId,
                            this.compartmentId,
                            this.profileId,
                            this.scheduledJobId,
                            this.timeNextExecution,
                            this.displayName,
                            this.description,
                            this.hostname,
                            this.overallState,
                            this.healthState,
                            this.overallPercentage,
                            this.mirrorCapacity,
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
        public Builder copy(ManagementStationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("profileId")) {
                this.profileId(model.getProfileId());
            }
            if (model.wasPropertyExplicitlySet("scheduledJobId")) {
                this.scheduledJobId(model.getScheduledJobId());
            }
            if (model.wasPropertyExplicitlySet("timeNextExecution")) {
                this.timeNextExecution(model.getTimeNextExecution());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("overallState")) {
                this.overallState(model.getOverallState());
            }
            if (model.wasPropertyExplicitlySet("healthState")) {
                this.healthState(model.getHealthState());
            }
            if (model.wasPropertyExplicitlySet("overallPercentage")) {
                this.overallPercentage(model.getOverallPercentage());
            }
            if (model.wasPropertyExplicitlySet("mirrorCapacity")) {
                this.mirrorCapacity(model.getMirrorCapacity());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance that is acting as the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance that is acting as the management station.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the management station.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the registration profile used for the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profileId")
    private final String profileId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the registration profile used for the management station.
     *
     * @return the value
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the scheduled job for the mirror sync.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobId")
    private final String scheduledJobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the scheduled job for the mirror sync.
     *
     * @return the value
     */
    public String getScheduledJobId() {
        return scheduledJobId;
    }

    /**
     * The date and time of the next scheduled mirror sync (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    private final java.util.Date timeNextExecution;

    /**
     * The date and time of the next scheduled mirror sync (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeNextExecution() {
        return timeNextExecution;
    }

    /** User-friendly name for the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name for the management station.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** User-specified description of the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description of the management station.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Hostname of the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * Hostname of the management station.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** Current state of the mirror sync for the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("overallState")
    private final OverallState overallState;

    /**
     * Current state of the mirror sync for the management station.
     *
     * @return the value
     */
    public OverallState getOverallState() {
        return overallState;
    }

    /** Overall health status of the managment station. */
    @com.fasterxml.jackson.annotation.JsonProperty("healthState")
    private final HealthState healthState;

    /**
     * Overall health status of the managment station.
     *
     * @return the value
     */
    public HealthState getHealthState() {
        return healthState;
    }

    /** A decimal number representing the progress of the current mirror sync. */
    @com.fasterxml.jackson.annotation.JsonProperty("overallPercentage")
    private final Integer overallPercentage;

    /**
     * A decimal number representing the progress of the current mirror sync.
     *
     * @return the value
     */
    public Integer getOverallPercentage() {
        return overallPercentage;
    }

    /** A decimal number representing the amount of mirror capacity used by the sync. */
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorCapacity")
    private final Integer mirrorCapacity;

    /**
     * A decimal number representing the amount of mirror capacity used by the sync.
     *
     * @return the value
     */
    public Integer getMirrorCapacity() {
        return mirrorCapacity;
    }

    /** The current state of the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ManagementStation.LifecycleState lifecycleState;

    /**
     * The current state of the management station.
     *
     * @return the value
     */
    public ManagementStation.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ManagementStationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", profileId=").append(String.valueOf(this.profileId));
        sb.append(", scheduledJobId=").append(String.valueOf(this.scheduledJobId));
        sb.append(", timeNextExecution=").append(String.valueOf(this.timeNextExecution));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", overallState=").append(String.valueOf(this.overallState));
        sb.append(", healthState=").append(String.valueOf(this.healthState));
        sb.append(", overallPercentage=").append(String.valueOf(this.overallPercentage));
        sb.append(", mirrorCapacity=").append(String.valueOf(this.mirrorCapacity));
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
        if (!(o instanceof ManagementStationSummary)) {
            return false;
        }

        ManagementStationSummary other = (ManagementStationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.profileId, other.profileId)
                && java.util.Objects.equals(this.scheduledJobId, other.scheduledJobId)
                && java.util.Objects.equals(this.timeNextExecution, other.timeNextExecution)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.overallState, other.overallState)
                && java.util.Objects.equals(this.healthState, other.healthState)
                && java.util.Objects.equals(this.overallPercentage, other.overallPercentage)
                && java.util.Objects.equals(this.mirrorCapacity, other.mirrorCapacity)
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
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.profileId == null ? 43 : this.profileId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledJobId == null ? 43 : this.scheduledJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNextExecution == null ? 43 : this.timeNextExecution.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.overallState == null ? 43 : this.overallState.hashCode());
        result = (result * PRIME) + (this.healthState == null ? 43 : this.healthState.hashCode());
        result =
                (result * PRIME)
                        + (this.overallPercentage == null ? 43 : this.overallPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorCapacity == null ? 43 : this.mirrorCapacity.hashCode());
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
