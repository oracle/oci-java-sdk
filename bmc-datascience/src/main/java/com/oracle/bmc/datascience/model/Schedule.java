/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * A repeating action. Examples:
 * * Invoke a ML Pipeline Run once an hour.
 * * Call ML Job Run every night at midnight.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Schedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Schedule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "projectId",
        "displayName",
        "description",
        "timeLastScheduleRun",
        "timeNextScheduledRun",
        "timeCreated",
        "timeUpdated",
        "createdBy",
        "lifecycleState",
        "lifecycleDetails",
        "lastScheduleRunDetails",
        "trigger",
        "action",
        "logDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Schedule(
            String id,
            String compartmentId,
            String projectId,
            String displayName,
            String description,
            java.util.Date timeLastScheduleRun,
            java.util.Date timeNextScheduledRun,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdBy,
            ScheduleLifecycleState lifecycleState,
            String lifecycleDetails,
            String lastScheduleRunDetails,
            ScheduleTrigger trigger,
            ScheduleAction action,
            ScheduleLogDetails logDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.projectId = projectId;
        this.displayName = displayName;
        this.description = description;
        this.timeLastScheduleRun = timeLastScheduleRun;
        this.timeNextScheduledRun = timeNextScheduledRun;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.lastScheduleRunDetails = lastScheduleRunDetails;
        this.trigger = trigger;
        this.action = action;
        this.logDetails = logDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the schedule.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the schedule.
         * @param projectId the value to set
         * @return this builder
         **/
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * A user-friendly display name for the resource. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A short description of the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the schedule.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The last schedule execution time.
         * Format is defined by RFC3339.
         * Example: {@code 2022-08-05T01:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastScheduleRun")
        private java.util.Date timeLastScheduleRun;

        /**
         * The last schedule execution time.
         * Format is defined by RFC3339.
         * Example: {@code 2022-08-05T01:02:29.600Z}
         *
         * @param timeLastScheduleRun the value to set
         * @return this builder
         **/
        public Builder timeLastScheduleRun(java.util.Date timeLastScheduleRun) {
            this.timeLastScheduleRun = timeLastScheduleRun;
            this.__explicitlySet__.add("timeLastScheduleRun");
            return this;
        }
        /**
         * The next scheduled execution time for the schedule.
         * Format is defined by RFC3339.
         * Example: {@code 2022-08-05T01:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextScheduledRun")
        private java.util.Date timeNextScheduledRun;

        /**
         * The next scheduled execution time for the schedule.
         * Format is defined by RFC3339.
         * Example: {@code 2022-08-05T01:02:29.600Z}
         *
         * @param timeNextScheduledRun the value to set
         * @return this builder
         **/
        public Builder timeNextScheduledRun(java.util.Date timeNextScheduledRun) {
            this.timeNextScheduledRun = timeNextScheduledRun;
            this.__explicitlySet__.add("timeNextScheduledRun");
            return this;
        }
        /**
         * The date and time the schedule was created.
         * Format is defined by RFC3339.
         * Example: {@code 2022-08-05T01:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the schedule was created.
         * Format is defined by RFC3339.
         * Example: {@code 2022-08-05T01:02:29.600Z}
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
         * The date and time the schedule was updated.
         * Format is defined by RFC3339.
         * Example: {@code 2022-09-05T01:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the schedule was updated.
         * Format is defined by RFC3339.
         * Example: {@code 2022-09-05T01:02:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the schedule.
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The current state of the schedule.
         * Example: {@code ACTIVE}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ScheduleLifecycleState lifecycleState;

        /**
         * The current state of the schedule.
         * Example: {@code ACTIVE}
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ScheduleLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Details about the action performed by the last schedule execution.
         * Example: {@code Invoked ML Application trigger.}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastScheduleRunDetails")
        private String lastScheduleRunDetails;

        /**
         * Details about the action performed by the last schedule execution.
         * Example: {@code Invoked ML Application trigger.}
         *
         * @param lastScheduleRunDetails the value to set
         * @return this builder
         **/
        public Builder lastScheduleRunDetails(String lastScheduleRunDetails) {
            this.lastScheduleRunDetails = lastScheduleRunDetails;
            this.__explicitlySet__.add("lastScheduleRunDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trigger")
        private ScheduleTrigger trigger;

        public Builder trigger(ScheduleTrigger trigger) {
            this.trigger = trigger;
            this.__explicitlySet__.add("trigger");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private ScheduleAction action;

        public Builder action(ScheduleAction action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logDetails")
        private ScheduleLogDetails logDetails;

        public Builder logDetails(ScheduleLogDetails logDetails) {
            this.logDetails = logDetails;
            this.__explicitlySet__.add("logDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
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

        public Schedule build() {
            Schedule model =
                    new Schedule(
                            this.id,
                            this.compartmentId,
                            this.projectId,
                            this.displayName,
                            this.description,
                            this.timeLastScheduleRun,
                            this.timeNextScheduledRun,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdBy,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.lastScheduleRunDetails,
                            this.trigger,
                            this.action,
                            this.logDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Schedule model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeLastScheduleRun")) {
                this.timeLastScheduleRun(model.getTimeLastScheduleRun());
            }
            if (model.wasPropertyExplicitlySet("timeNextScheduledRun")) {
                this.timeNextScheduledRun(model.getTimeNextScheduledRun());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lastScheduleRunDetails")) {
                this.lastScheduleRunDetails(model.getLastScheduleRunDetails());
            }
            if (model.wasPropertyExplicitlySet("trigger")) {
                this.trigger(model.getTrigger());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("logDetails")) {
                this.logDetails(model.getLogDetails());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the schedule.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the schedule.
     * @return the value
     **/
    public String getProjectId() {
        return projectId;
    }

    /**
     * A user-friendly display name for the resource. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A short description of the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the schedule.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The last schedule execution time.
     * Format is defined by RFC3339.
     * Example: {@code 2022-08-05T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastScheduleRun")
    private final java.util.Date timeLastScheduleRun;

    /**
     * The last schedule execution time.
     * Format is defined by RFC3339.
     * Example: {@code 2022-08-05T01:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeLastScheduleRun() {
        return timeLastScheduleRun;
    }

    /**
     * The next scheduled execution time for the schedule.
     * Format is defined by RFC3339.
     * Example: {@code 2022-08-05T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextScheduledRun")
    private final java.util.Date timeNextScheduledRun;

    /**
     * The next scheduled execution time for the schedule.
     * Format is defined by RFC3339.
     * Example: {@code 2022-08-05T01:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeNextScheduledRun() {
        return timeNextScheduledRun;
    }

    /**
     * The date and time the schedule was created.
     * Format is defined by RFC3339.
     * Example: {@code 2022-08-05T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the schedule was created.
     * Format is defined by RFC3339.
     * Example: {@code 2022-08-05T01:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the schedule was updated.
     * Format is defined by RFC3339.
     * Example: {@code 2022-09-05T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the schedule was updated.
     * Format is defined by RFC3339.
     * Example: {@code 2022-09-05T01:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the schedule.
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The current state of the schedule.
     * Example: {@code ACTIVE}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ScheduleLifecycleState lifecycleState;

    /**
     * The current state of the schedule.
     * Example: {@code ACTIVE}
     *
     * @return the value
     **/
    public ScheduleLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Details about the action performed by the last schedule execution.
     * Example: {@code Invoked ML Application trigger.}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastScheduleRunDetails")
    private final String lastScheduleRunDetails;

    /**
     * Details about the action performed by the last schedule execution.
     * Example: {@code Invoked ML Application trigger.}
     *
     * @return the value
     **/
    public String getLastScheduleRunDetails() {
        return lastScheduleRunDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("trigger")
    private final ScheduleTrigger trigger;

    public ScheduleTrigger getTrigger() {
        return trigger;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final ScheduleAction action;

    public ScheduleAction getAction() {
        return action;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logDetails")
    private final ScheduleLogDetails logDetails;

    public ScheduleLogDetails getLogDetails() {
        return logDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
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
        sb.append("Schedule(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeLastScheduleRun=").append(String.valueOf(this.timeLastScheduleRun));
        sb.append(", timeNextScheduledRun=").append(String.valueOf(this.timeNextScheduledRun));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lastScheduleRunDetails=").append(String.valueOf(this.lastScheduleRunDetails));
        sb.append(", trigger=").append(String.valueOf(this.trigger));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", logDetails=").append(String.valueOf(this.logDetails));
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
        if (!(o instanceof Schedule)) {
            return false;
        }

        Schedule other = (Schedule) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeLastScheduleRun, other.timeLastScheduleRun)
                && java.util.Objects.equals(this.timeNextScheduledRun, other.timeNextScheduledRun)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.lastScheduleRunDetails, other.lastScheduleRunDetails)
                && java.util.Objects.equals(this.trigger, other.trigger)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.logDetails, other.logDetails)
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
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastScheduleRun == null
                                ? 43
                                : this.timeLastScheduleRun.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNextScheduledRun == null
                                ? 43
                                : this.timeNextScheduledRun.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lastScheduleRunDetails == null
                                ? 43
                                : this.lastScheduleRunDetails.hashCode());
        result = (result * PRIME) + (this.trigger == null ? 43 : this.trigger.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.logDetails == null ? 43 : this.logDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
