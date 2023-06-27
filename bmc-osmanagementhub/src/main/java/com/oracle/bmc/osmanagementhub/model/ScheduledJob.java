/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Detailed information about a scheduled job. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScheduledJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduledJob extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "description",
        "scheduleType",
        "timeNextExecution",
        "timeLastExecution",
        "recurringRule",
        "managedInstanceIds",
        "managedInstanceGroupIds",
        "managedCompartmentIds",
        "lifecycleStageIds",
        "isSubcompartmentIncluded",
        "operations",
        "workRequestIds",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags",
        "isRestricted"
    })
    public ScheduledJob(
            String id,
            String displayName,
            String compartmentId,
            String description,
            ScheduleTypes scheduleType,
            java.util.Date timeNextExecution,
            java.util.Date timeLastExecution,
            String recurringRule,
            java.util.List<String> managedInstanceIds,
            java.util.List<String> managedInstanceGroupIds,
            java.util.List<String> managedCompartmentIds,
            java.util.List<String> lifecycleStageIds,
            Boolean isSubcompartmentIncluded,
            java.util.List<ScheduledJobOperation> operations,
            java.util.List<String> workRequestIds,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isRestricted) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.scheduleType = scheduleType;
        this.timeNextExecution = timeNextExecution;
        this.timeLastExecution = timeLastExecution;
        this.recurringRule = recurringRule;
        this.managedInstanceIds = managedInstanceIds;
        this.managedInstanceGroupIds = managedInstanceGroupIds;
        this.managedCompartmentIds = managedCompartmentIds;
        this.lifecycleStageIds = lifecycleStageIds;
        this.isSubcompartmentIncluded = isSubcompartmentIncluded;
        this.operations = operations;
        this.workRequestIds = workRequestIds;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.isRestricted = isRestricted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the scheduled job.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Scheduled job name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Scheduled job name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment containing the scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the scheduled job.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Details describing the scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details describing the scheduled job.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The type of scheduling this scheduled job follows. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private ScheduleTypes scheduleType;

        /**
         * The type of scheduling this scheduled job follows.
         *
         * @param scheduleType the value to set
         * @return this builder
         */
        public Builder scheduleType(ScheduleTypes scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /** The time of the next execution of this scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        /**
         * The time of the next execution of this scheduled job.
         *
         * @param timeNextExecution the value to set
         * @return this builder
         */
        public Builder timeNextExecution(java.util.Date timeNextExecution) {
            this.timeNextExecution = timeNextExecution;
            this.__explicitlySet__.add("timeNextExecution");
            return this;
        }
        /** The time of the last execution of this scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecution")
        private java.util.Date timeLastExecution;

        /**
         * The time of the last execution of this scheduled job.
         *
         * @param timeLastExecution the value to set
         * @return this builder
         */
        public Builder timeLastExecution(java.util.Date timeLastExecution) {
            this.timeLastExecution = timeLastExecution;
            this.__explicitlySet__.add("timeLastExecution");
            return this;
        }
        /** The recurring rule for a RECURRING scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("recurringRule")
        private String recurringRule;

        /**
         * The recurring rule for a RECURRING scheduled job.
         *
         * @param recurringRule the value to set
         * @return this builder
         */
        public Builder recurringRule(String recurringRule) {
            this.recurringRule = recurringRule;
            this.__explicitlySet__.add("recurringRule");
            return this;
        }
        /**
         * The list of managed instance OCIDs this scheduled job operates on (mutually exclusive
         * with managedInstanceGroupIds, managedCompartmentIds and lifecycleStageIds).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
        private java.util.List<String> managedInstanceIds;

        /**
         * The list of managed instance OCIDs this scheduled job operates on (mutually exclusive
         * with managedInstanceGroupIds, managedCompartmentIds and lifecycleStageIds).
         *
         * @param managedInstanceIds the value to set
         * @return this builder
         */
        public Builder managedInstanceIds(java.util.List<String> managedInstanceIds) {
            this.managedInstanceIds = managedInstanceIds;
            this.__explicitlySet__.add("managedInstanceIds");
            return this;
        }
        /**
         * The list of managed instance group OCIDs this scheduled job operates on (mutually
         * exclusive with managedInstances, managedCompartmentIds and lifecycleStageIds).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
        private java.util.List<String> managedInstanceGroupIds;

        /**
         * The list of managed instance group OCIDs this scheduled job operates on (mutually
         * exclusive with managedInstances, managedCompartmentIds and lifecycleStageIds).
         *
         * @param managedInstanceGroupIds the value to set
         * @return this builder
         */
        public Builder managedInstanceGroupIds(java.util.List<String> managedInstanceGroupIds) {
            this.managedInstanceGroupIds = managedInstanceGroupIds;
            this.__explicitlySet__.add("managedInstanceGroupIds");
            return this;
        }
        /**
         * The list of target compartment OCIDs if this scheduled job operates on a compartment
         * level (mutually exclusive with managedInstances, managedInstanceGroupIds and
         * lifecycleStageIds).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedCompartmentIds")
        private java.util.List<String> managedCompartmentIds;

        /**
         * The list of target compartment OCIDs if this scheduled job operates on a compartment
         * level (mutually exclusive with managedInstances, managedInstanceGroupIds and
         * lifecycleStageIds).
         *
         * @param managedCompartmentIds the value to set
         * @return this builder
         */
        public Builder managedCompartmentIds(java.util.List<String> managedCompartmentIds) {
            this.managedCompartmentIds = managedCompartmentIds;
            this.__explicitlySet__.add("managedCompartmentIds");
            return this;
        }
        /**
         * The list of target lifecycle stage OCIDs if this scheduled job operates on lifecycle
         * stages (mutually exclusive with managedInstances, managedInstanceGroupIds and
         * managedCompartmentIds).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageIds")
        private java.util.List<String> lifecycleStageIds;

        /**
         * The list of target lifecycle stage OCIDs if this scheduled job operates on lifecycle
         * stages (mutually exclusive with managedInstances, managedInstanceGroupIds and
         * managedCompartmentIds).
         *
         * @param lifecycleStageIds the value to set
         * @return this builder
         */
        public Builder lifecycleStageIds(java.util.List<String> lifecycleStageIds) {
            this.lifecycleStageIds = lifecycleStageIds;
            this.__explicitlySet__.add("lifecycleStageIds");
            return this;
        }
        /**
         * Whether to create jobs for all compartments in the tenancy when managedCompartmentIds
         * specifies the tenancy OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSubcompartmentIncluded")
        private Boolean isSubcompartmentIncluded;

        /**
         * Whether to create jobs for all compartments in the tenancy when managedCompartmentIds
         * specifies the tenancy OCID.
         *
         * @param isSubcompartmentIncluded the value to set
         * @return this builder
         */
        public Builder isSubcompartmentIncluded(Boolean isSubcompartmentIncluded) {
            this.isSubcompartmentIncluded = isSubcompartmentIncluded;
            this.__explicitlySet__.add("isSubcompartmentIncluded");
            return this;
        }
        /**
         * The list of operations this scheduled job needs to perform (can only support one
         * operation if the operationType is not
         * UPDATE_PACKAGES/UPDATE_ALL/UPDATE_SECURITY/UPDATE_BUGFIX/UPDATE_ENHANCEMENT/UPDATE_OTHER/UPDATE_KSPLICE_USERSPACE/UPDATE_KSPLICE_KERNEL).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operations")
        private java.util.List<ScheduledJobOperation> operations;

        /**
         * The list of operations this scheduled job needs to perform (can only support one
         * operation if the operationType is not
         * UPDATE_PACKAGES/UPDATE_ALL/UPDATE_SECURITY/UPDATE_BUGFIX/UPDATE_ENHANCEMENT/UPDATE_OTHER/UPDATE_KSPLICE_USERSPACE/UPDATE_KSPLICE_KERNEL).
         *
         * @param operations the value to set
         * @return this builder
         */
        public Builder operations(java.util.List<ScheduledJobOperation> operations) {
            this.operations = operations;
            this.__explicitlySet__.add("operations");
            return this;
        }
        /** The list of work request OCIDs associated with this scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestIds")
        private java.util.List<String> workRequestIds;

        /**
         * The list of work request OCIDs associated with this scheduled job.
         *
         * @param workRequestIds the value to set
         * @return this builder
         */
        public Builder workRequestIds(java.util.List<String> workRequestIds) {
            this.workRequestIds = workRequestIds;
            this.__explicitlySet__.add("workRequestIds");
            return this;
        }
        /** The time this scheduled job was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this scheduled job was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time this scheduled job was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this scheduled job was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the scheduled job.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
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
        /**
         * true, if the schedule job has its update/deletion capabilities restricted. (Used to track
         * scheduled job for management station syncing).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRestricted")
        private Boolean isRestricted;

        /**
         * true, if the schedule job has its update/deletion capabilities restricted. (Used to track
         * scheduled job for management station syncing).
         *
         * @param isRestricted the value to set
         * @return this builder
         */
        public Builder isRestricted(Boolean isRestricted) {
            this.isRestricted = isRestricted;
            this.__explicitlySet__.add("isRestricted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledJob build() {
            ScheduledJob model =
                    new ScheduledJob(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.scheduleType,
                            this.timeNextExecution,
                            this.timeLastExecution,
                            this.recurringRule,
                            this.managedInstanceIds,
                            this.managedInstanceGroupIds,
                            this.managedCompartmentIds,
                            this.lifecycleStageIds,
                            this.isSubcompartmentIncluded,
                            this.operations,
                            this.workRequestIds,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.isRestricted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledJob model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scheduleType")) {
                this.scheduleType(model.getScheduleType());
            }
            if (model.wasPropertyExplicitlySet("timeNextExecution")) {
                this.timeNextExecution(model.getTimeNextExecution());
            }
            if (model.wasPropertyExplicitlySet("timeLastExecution")) {
                this.timeLastExecution(model.getTimeLastExecution());
            }
            if (model.wasPropertyExplicitlySet("recurringRule")) {
                this.recurringRule(model.getRecurringRule());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceIds")) {
                this.managedInstanceIds(model.getManagedInstanceIds());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceGroupIds")) {
                this.managedInstanceGroupIds(model.getManagedInstanceGroupIds());
            }
            if (model.wasPropertyExplicitlySet("managedCompartmentIds")) {
                this.managedCompartmentIds(model.getManagedCompartmentIds());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStageIds")) {
                this.lifecycleStageIds(model.getLifecycleStageIds());
            }
            if (model.wasPropertyExplicitlySet("isSubcompartmentIncluded")) {
                this.isSubcompartmentIncluded(model.getIsSubcompartmentIncluded());
            }
            if (model.wasPropertyExplicitlySet("operations")) {
                this.operations(model.getOperations());
            }
            if (model.wasPropertyExplicitlySet("workRequestIds")) {
                this.workRequestIds(model.getWorkRequestIds());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
            if (model.wasPropertyExplicitlySet("isRestricted")) {
                this.isRestricted(model.getIsRestricted());
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

    /** The OCID of the scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the scheduled job.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Scheduled job name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Scheduled job name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment containing the scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the scheduled job.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Details describing the scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details describing the scheduled job.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The type of scheduling this scheduled job follows. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final ScheduleTypes scheduleType;

    /**
     * The type of scheduling this scheduled job follows.
     *
     * @return the value
     */
    public ScheduleTypes getScheduleType() {
        return scheduleType;
    }

    /** The time of the next execution of this scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    private final java.util.Date timeNextExecution;

    /**
     * The time of the next execution of this scheduled job.
     *
     * @return the value
     */
    public java.util.Date getTimeNextExecution() {
        return timeNextExecution;
    }

    /** The time of the last execution of this scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecution")
    private final java.util.Date timeLastExecution;

    /**
     * The time of the last execution of this scheduled job.
     *
     * @return the value
     */
    public java.util.Date getTimeLastExecution() {
        return timeLastExecution;
    }

    /** The recurring rule for a RECURRING scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("recurringRule")
    private final String recurringRule;

    /**
     * The recurring rule for a RECURRING scheduled job.
     *
     * @return the value
     */
    public String getRecurringRule() {
        return recurringRule;
    }

    /**
     * The list of managed instance OCIDs this scheduled job operates on (mutually exclusive with
     * managedInstanceGroupIds, managedCompartmentIds and lifecycleStageIds).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
    private final java.util.List<String> managedInstanceIds;

    /**
     * The list of managed instance OCIDs this scheduled job operates on (mutually exclusive with
     * managedInstanceGroupIds, managedCompartmentIds and lifecycleStageIds).
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceIds() {
        return managedInstanceIds;
    }

    /**
     * The list of managed instance group OCIDs this scheduled job operates on (mutually exclusive
     * with managedInstances, managedCompartmentIds and lifecycleStageIds).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
    private final java.util.List<String> managedInstanceGroupIds;

    /**
     * The list of managed instance group OCIDs this scheduled job operates on (mutually exclusive
     * with managedInstances, managedCompartmentIds and lifecycleStageIds).
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceGroupIds() {
        return managedInstanceGroupIds;
    }

    /**
     * The list of target compartment OCIDs if this scheduled job operates on a compartment level
     * (mutually exclusive with managedInstances, managedInstanceGroupIds and lifecycleStageIds).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedCompartmentIds")
    private final java.util.List<String> managedCompartmentIds;

    /**
     * The list of target compartment OCIDs if this scheduled job operates on a compartment level
     * (mutually exclusive with managedInstances, managedInstanceGroupIds and lifecycleStageIds).
     *
     * @return the value
     */
    public java.util.List<String> getManagedCompartmentIds() {
        return managedCompartmentIds;
    }

    /**
     * The list of target lifecycle stage OCIDs if this scheduled job operates on lifecycle stages
     * (mutually exclusive with managedInstances, managedInstanceGroupIds and
     * managedCompartmentIds).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageIds")
    private final java.util.List<String> lifecycleStageIds;

    /**
     * The list of target lifecycle stage OCIDs if this scheduled job operates on lifecycle stages
     * (mutually exclusive with managedInstances, managedInstanceGroupIds and
     * managedCompartmentIds).
     *
     * @return the value
     */
    public java.util.List<String> getLifecycleStageIds() {
        return lifecycleStageIds;
    }

    /**
     * Whether to create jobs for all compartments in the tenancy when managedCompartmentIds
     * specifies the tenancy OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSubcompartmentIncluded")
    private final Boolean isSubcompartmentIncluded;

    /**
     * Whether to create jobs for all compartments in the tenancy when managedCompartmentIds
     * specifies the tenancy OCID.
     *
     * @return the value
     */
    public Boolean getIsSubcompartmentIncluded() {
        return isSubcompartmentIncluded;
    }

    /**
     * The list of operations this scheduled job needs to perform (can only support one operation if
     * the operationType is not
     * UPDATE_PACKAGES/UPDATE_ALL/UPDATE_SECURITY/UPDATE_BUGFIX/UPDATE_ENHANCEMENT/UPDATE_OTHER/UPDATE_KSPLICE_USERSPACE/UPDATE_KSPLICE_KERNEL).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    private final java.util.List<ScheduledJobOperation> operations;

    /**
     * The list of operations this scheduled job needs to perform (can only support one operation if
     * the operationType is not
     * UPDATE_PACKAGES/UPDATE_ALL/UPDATE_SECURITY/UPDATE_BUGFIX/UPDATE_ENHANCEMENT/UPDATE_OTHER/UPDATE_KSPLICE_USERSPACE/UPDATE_KSPLICE_KERNEL).
     *
     * @return the value
     */
    public java.util.List<ScheduledJobOperation> getOperations() {
        return operations;
    }

    /** The list of work request OCIDs associated with this scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestIds")
    private final java.util.List<String> workRequestIds;

    /**
     * The list of work request OCIDs associated with this scheduled job.
     *
     * @return the value
     */
    public java.util.List<String> getWorkRequestIds() {
        return workRequestIds;
    }

    /** The time this scheduled job was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this scheduled job was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time this scheduled job was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this scheduled job was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the scheduled job. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the scheduled job.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
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

    /**
     * true, if the schedule job has its update/deletion capabilities restricted. (Used to track
     * scheduled job for management station syncing).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRestricted")
    private final Boolean isRestricted;

    /**
     * true, if the schedule job has its update/deletion capabilities restricted. (Used to track
     * scheduled job for management station syncing).
     *
     * @return the value
     */
    public Boolean getIsRestricted() {
        return isRestricted;
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
        sb.append("ScheduledJob(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", timeNextExecution=").append(String.valueOf(this.timeNextExecution));
        sb.append(", timeLastExecution=").append(String.valueOf(this.timeLastExecution));
        sb.append(", recurringRule=").append(String.valueOf(this.recurringRule));
        sb.append(", managedInstanceIds=").append(String.valueOf(this.managedInstanceIds));
        sb.append(", managedInstanceGroupIds=")
                .append(String.valueOf(this.managedInstanceGroupIds));
        sb.append(", managedCompartmentIds=").append(String.valueOf(this.managedCompartmentIds));
        sb.append(", lifecycleStageIds=").append(String.valueOf(this.lifecycleStageIds));
        sb.append(", isSubcompartmentIncluded=")
                .append(String.valueOf(this.isSubcompartmentIncluded));
        sb.append(", operations=").append(String.valueOf(this.operations));
        sb.append(", workRequestIds=").append(String.valueOf(this.workRequestIds));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", isRestricted=").append(String.valueOf(this.isRestricted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledJob)) {
            return false;
        }

        ScheduledJob other = (ScheduledJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.timeNextExecution, other.timeNextExecution)
                && java.util.Objects.equals(this.timeLastExecution, other.timeLastExecution)
                && java.util.Objects.equals(this.recurringRule, other.recurringRule)
                && java.util.Objects.equals(this.managedInstanceIds, other.managedInstanceIds)
                && java.util.Objects.equals(
                        this.managedInstanceGroupIds, other.managedInstanceGroupIds)
                && java.util.Objects.equals(this.managedCompartmentIds, other.managedCompartmentIds)
                && java.util.Objects.equals(this.lifecycleStageIds, other.lifecycleStageIds)
                && java.util.Objects.equals(
                        this.isSubcompartmentIncluded, other.isSubcompartmentIncluded)
                && java.util.Objects.equals(this.operations, other.operations)
                && java.util.Objects.equals(this.workRequestIds, other.workRequestIds)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.isRestricted, other.isRestricted)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNextExecution == null ? 43 : this.timeNextExecution.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastExecution == null ? 43 : this.timeLastExecution.hashCode());
        result =
                (result * PRIME)
                        + (this.recurringRule == null ? 43 : this.recurringRule.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceIds == null
                                ? 43
                                : this.managedInstanceIds.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceGroupIds == null
                                ? 43
                                : this.managedInstanceGroupIds.hashCode());
        result =
                (result * PRIME)
                        + (this.managedCompartmentIds == null
                                ? 43
                                : this.managedCompartmentIds.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStageIds == null ? 43 : this.lifecycleStageIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isSubcompartmentIncluded == null
                                ? 43
                                : this.isSubcompartmentIncluded.hashCode());
        result = (result * PRIME) + (this.operations == null ? 43 : this.operations.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestIds == null ? 43 : this.workRequestIds.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.isRestricted == null ? 43 : this.isRestricted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
