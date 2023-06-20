/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A Data Flow pool object.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Pool.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Pool extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "description",
        "displayName",
        "freeformTags",
        "id",
        "lifecycleDetails",
        "lifecycleState",
        "ownerPrincipalId",
        "ownerUserName",
        "poolMetrics",
        "configurations",
        "schedules",
        "idleTimeoutInMinutes",
        "timeCreated",
        "timeUpdated"
    })
    public Pool(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            String lifecycleDetails,
            PoolLifecycleState lifecycleState,
            String ownerPrincipalId,
            String ownerUserName,
            PoolMetrics poolMetrics,
            java.util.List<PoolConfig> configurations,
            java.util.List<PoolSchedule> schedules,
            Integer idleTimeoutInMinutes,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.ownerPrincipalId = ownerPrincipalId;
        this.ownerUserName = ownerUserName;
        this.poolMetrics = poolMetrics;
        this.configurations = configurations;
        this.schedules = schedules;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of a compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of a compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * A user-friendly description. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
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
         * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The detailed messages about the lifecycle state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The detailed messages about the lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The current state of this pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private PoolLifecycleState lifecycleState;

        /**
         * The current state of this pool.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(PoolLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The OCID of the user who created the resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
        private String ownerPrincipalId;

        /**
         * The OCID of the user who created the resource.
         *
         * @param ownerPrincipalId the value to set
         * @return this builder
         **/
        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            this.__explicitlySet__.add("ownerPrincipalId");
            return this;
        }
        /**
         * The username of the user who created the resource.  If the username of the owner does not exist,
         * {@code null} will be returned and the caller should refer to the ownerPrincipalId value instead.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ownerUserName")
        private String ownerUserName;

        /**
         * The username of the user who created the resource.  If the username of the owner does not exist,
         * {@code null} will be returned and the caller should refer to the ownerPrincipalId value instead.
         *
         * @param ownerUserName the value to set
         * @return this builder
         **/
        public Builder ownerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            this.__explicitlySet__.add("ownerUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("poolMetrics")
        private PoolMetrics poolMetrics;

        public Builder poolMetrics(PoolMetrics poolMetrics) {
            this.poolMetrics = poolMetrics;
            this.__explicitlySet__.add("poolMetrics");
            return this;
        }
        /**
         * List of PoolConfig items.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<PoolConfig> configurations;

        /**
         * List of PoolConfig items.
         *
         * @param configurations the value to set
         * @return this builder
         **/
        public Builder configurations(java.util.List<PoolConfig> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }
        /**
         * A list of schedules for pool to auto start and stop.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schedules")
        private java.util.List<PoolSchedule> schedules;

        /**
         * A list of schedules for pool to auto start and stop.
         *
         * @param schedules the value to set
         * @return this builder
         **/
        public Builder schedules(java.util.List<PoolSchedule> schedules) {
            this.schedules = schedules;
            this.__explicitlySet__.add("schedules");
            return this;
        }
        /**
         * Optional timeout value in minutes used to auto stop Pools. A Pool will be auto stopped after inactivity for this amount of time period.
         * If value not set, pool will not be auto stopped auto.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInMinutes")
        private Integer idleTimeoutInMinutes;

        /**
         * Optional timeout value in minutes used to auto stop Pools. A Pool will be auto stopped after inactivity for this amount of time period.
         * If value not set, pool will not be auto stopped auto.
         *
         * @param idleTimeoutInMinutes the value to set
         * @return this builder
         **/
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            this.__explicitlySet__.add("idleTimeoutInMinutes");
            return this;
        }
        /**
         * The date and time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Pool build() {
            Pool model =
                    new Pool(
                            this.compartmentId,
                            this.definedTags,
                            this.description,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.ownerPrincipalId,
                            this.ownerUserName,
                            this.poolMetrics,
                            this.configurations,
                            this.schedules,
                            this.idleTimeoutInMinutes,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Pool model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("ownerPrincipalId")) {
                this.ownerPrincipalId(model.getOwnerPrincipalId());
            }
            if (model.wasPropertyExplicitlySet("ownerUserName")) {
                this.ownerUserName(model.getOwnerUserName());
            }
            if (model.wasPropertyExplicitlySet("poolMetrics")) {
                this.poolMetrics(model.getPoolMetrics());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
            }
            if (model.wasPropertyExplicitlySet("schedules")) {
                this.schedules(model.getSchedules());
            }
            if (model.wasPropertyExplicitlySet("idleTimeoutInMinutes")) {
                this.idleTimeoutInMinutes(model.getIdleTimeoutInMinutes());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The OCID of a compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of a compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly description. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
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
     * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The detailed messages about the lifecycle state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The detailed messages about the lifecycle state.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The current state of this pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final PoolLifecycleState lifecycleState;

    /**
     * The current state of this pool.
     *
     * @return the value
     **/
    public PoolLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The OCID of the user who created the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
    private final String ownerPrincipalId;

    /**
     * The OCID of the user who created the resource.
     *
     * @return the value
     **/
    public String getOwnerPrincipalId() {
        return ownerPrincipalId;
    }

    /**
     * The username of the user who created the resource.  If the username of the owner does not exist,
     * {@code null} will be returned and the caller should refer to the ownerPrincipalId value instead.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerUserName")
    private final String ownerUserName;

    /**
     * The username of the user who created the resource.  If the username of the owner does not exist,
     * {@code null} will be returned and the caller should refer to the ownerPrincipalId value instead.
     *
     * @return the value
     **/
    public String getOwnerUserName() {
        return ownerUserName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("poolMetrics")
    private final PoolMetrics poolMetrics;

    public PoolMetrics getPoolMetrics() {
        return poolMetrics;
    }

    /**
     * List of PoolConfig items.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<PoolConfig> configurations;

    /**
     * List of PoolConfig items.
     *
     * @return the value
     **/
    public java.util.List<PoolConfig> getConfigurations() {
        return configurations;
    }

    /**
     * A list of schedules for pool to auto start and stop.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedules")
    private final java.util.List<PoolSchedule> schedules;

    /**
     * A list of schedules for pool to auto start and stop.
     *
     * @return the value
     **/
    public java.util.List<PoolSchedule> getSchedules() {
        return schedules;
    }

    /**
     * Optional timeout value in minutes used to auto stop Pools. A Pool will be auto stopped after inactivity for this amount of time period.
     * If value not set, pool will not be auto stopped auto.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInMinutes")
    private final Integer idleTimeoutInMinutes;

    /**
     * Optional timeout value in minutes used to auto stop Pools. A Pool will be auto stopped after inactivity for this amount of time period.
     * If value not set, pool will not be auto stopped auto.
     *
     * @return the value
     **/
    public Integer getIdleTimeoutInMinutes() {
        return idleTimeoutInMinutes;
    }

    /**
     * The date and time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("Pool(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", ownerPrincipalId=").append(String.valueOf(this.ownerPrincipalId));
        sb.append(", ownerUserName=").append(String.valueOf(this.ownerUserName));
        sb.append(", poolMetrics=").append(String.valueOf(this.poolMetrics));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", schedules=").append(String.valueOf(this.schedules));
        sb.append(", idleTimeoutInMinutes=").append(String.valueOf(this.idleTimeoutInMinutes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pool)) {
            return false;
        }

        Pool other = (Pool) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.ownerPrincipalId, other.ownerPrincipalId)
                && java.util.Objects.equals(this.ownerUserName, other.ownerUserName)
                && java.util.Objects.equals(this.poolMetrics, other.poolMetrics)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.schedules, other.schedules)
                && java.util.Objects.equals(this.idleTimeoutInMinutes, other.idleTimeoutInMinutes)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerPrincipalId == null ? 43 : this.ownerPrincipalId.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerUserName == null ? 43 : this.ownerUserName.hashCode());
        result = (result * PRIME) + (this.poolMetrics == null ? 43 : this.poolMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result = (result * PRIME) + (this.schedules == null ? 43 : this.schedules.hashCode());
        result =
                (result * PRIME)
                        + (this.idleTimeoutInMinutes == null
                                ? 43
                                : this.idleTimeoutInMinutes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
