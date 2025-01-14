/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a scheduled job. <br>
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
        builder = ScheduledJobSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduledJobSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "scheduleType",
        "locations",
        "timeCreated",
        "timeUpdated",
        "timeNextExecution",
        "timeLastExecution",
        "managedInstanceIds",
        "managedInstanceGroupIds",
        "managedCompartmentIds",
        "lifecycleStageIds",
        "operations",
        "lifecycleState",
        "isManagedByAutonomousLinux",
        "freeformTags",
        "definedTags",
        "systemTags",
        "isRestricted",
        "retryIntervals"
    })
    public ScheduledJobSummary(
            String id,
            String displayName,
            String compartmentId,
            ScheduleTypes scheduleType,
            java.util.List<ManagedInstanceLocation> locations,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeNextExecution,
            java.util.Date timeLastExecution,
            java.util.List<String> managedInstanceIds,
            java.util.List<String> managedInstanceGroupIds,
            java.util.List<String> managedCompartmentIds,
            java.util.List<String> lifecycleStageIds,
            java.util.List<ScheduledJobOperation> operations,
            ScheduledJob.LifecycleState lifecycleState,
            Boolean isManagedByAutonomousLinux,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isRestricted,
            java.util.List<Integer> retryIntervals) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.scheduleType = scheduleType;
        this.locations = locations;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeNextExecution = timeNextExecution;
        this.timeLastExecution = timeLastExecution;
        this.managedInstanceIds = managedInstanceIds;
        this.managedInstanceGroupIds = managedInstanceGroupIds;
        this.managedCompartmentIds = managedCompartmentIds;
        this.lifecycleStageIds = lifecycleStageIds;
        this.operations = operations;
        this.lifecycleState = lifecycleState;
        this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.isRestricted = isRestricted;
        this.retryIntervals = retryIntervals;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the scheduled job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the scheduled job.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** User-friendly name for the scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name for the scheduled job.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the scheduled job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the scheduled job.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        /**
         * The list of locations this scheduled job should operate on for a job targeting on
         * compartments. (Empty list means apply to all locations). This can only be set when
         * managedCompartmentIds is not empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("locations")
        private java.util.List<ManagedInstanceLocation> locations;

        /**
         * The list of locations this scheduled job should operate on for a job targeting on
         * compartments. (Empty list means apply to all locations). This can only be set when
         * managedCompartmentIds is not empty.
         *
         * @param locations the value to set
         * @return this builder
         */
        public Builder locations(java.util.List<ManagedInstanceLocation> locations) {
            this.locations = locations;
            this.__explicitlySet__.add("locations");
            return this;
        }
        /**
         * The time this scheduled job was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this scheduled job was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time this scheduled job was updated (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this scheduled job was updated (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time of the next execution of this scheduled job (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        /**
         * The time of the next execution of this scheduled job (in [RFC
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
        /**
         * The time of the last execution of this scheduled job (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).b.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecution")
        private java.util.Date timeLastExecution;

        /**
         * The time of the last execution of this scheduled job (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).b.
         *
         * @param timeLastExecution the value to set
         * @return this builder
         */
        public Builder timeLastExecution(java.util.Date timeLastExecution) {
            this.timeLastExecution = timeLastExecution;
            this.__explicitlySet__.add("timeLastExecution");
            return this;
        }
        /**
         * The managed instance
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * this scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore this parameter is mutually exclusive with managedInstanceGroupIds,
         * managedCompartmentIds, and lifecycleStageIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
        private java.util.List<String> managedInstanceIds;

        /**
         * The managed instance
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * this scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore this parameter is mutually exclusive with managedInstanceGroupIds,
         * managedCompartmentIds, and lifecycleStageIds.
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
         * The managed instance group
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * this scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore this parameter is mutually exclusive with managedInstanceIds,
         * managedCompartmentIds, and lifecycleStageIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
        private java.util.List<String> managedInstanceGroupIds;

        /**
         * The managed instance group
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * this scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore this parameter is mutually exclusive with managedInstanceIds,
         * managedCompartmentIds, and lifecycleStageIds.
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
         * The compartment
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * this scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore this parameter is mutually exclusive with managedInstanceIds,
         * managedInstanceGroupIds, and lifecycleStageIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedCompartmentIds")
        private java.util.List<String> managedCompartmentIds;

        /**
         * The compartment
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * this scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore this parameter is mutually exclusive with managedInstanceIds,
         * managedInstanceGroupIds, and lifecycleStageIds.
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
         * The lifecycle stage
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * this scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore this parameter is mutually exclusive with managedInstanceIds,
         * managedInstanceGroupIds, and managedCompartmentIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageIds")
        private java.util.List<String> lifecycleStageIds;

        /**
         * The lifecycle stage
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * this scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore this parameter is mutually exclusive with managedInstanceIds,
         * managedInstanceGroupIds, and managedCompartmentIds.
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
         * The list of operations this scheduled job needs to perform. A scheduled job supports only
         * one operation type, unless it is one of the following: * UPDATE_PACKAGES * UPDATE_ALL *
         * UPDATE_SECURITY * UPDATE_BUGFIX * UPDATE_ENHANCEMENT * UPDATE_OTHER *
         * UPDATE_KSPLICE_USERSPACE * UPDATE_KSPLICE_KERNEL
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operations")
        private java.util.List<ScheduledJobOperation> operations;

        /**
         * The list of operations this scheduled job needs to perform. A scheduled job supports only
         * one operation type, unless it is one of the following: * UPDATE_PACKAGES * UPDATE_ALL *
         * UPDATE_SECURITY * UPDATE_BUGFIX * UPDATE_ENHANCEMENT * UPDATE_OTHER *
         * UPDATE_KSPLICE_USERSPACE * UPDATE_KSPLICE_KERNEL
         *
         * @param operations the value to set
         * @return this builder
         */
        public Builder operations(java.util.List<ScheduledJobOperation> operations) {
            this.operations = operations;
            this.__explicitlySet__.add("operations");
            return this;
        }
        /** The current state of the scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ScheduledJob.LifecycleState lifecycleState;

        /**
         * The current state of the scheduled job.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ScheduledJob.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Indicates whether this scheduled job is managed by the Autonomous Linux service. */
        @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
        private Boolean isManagedByAutonomousLinux;

        /**
         * Indicates whether this scheduled job is managed by the Autonomous Linux service.
         *
         * @param isManagedByAutonomousLinux the value to set
         * @return this builder
         */
        public Builder isManagedByAutonomousLinux(Boolean isManagedByAutonomousLinux) {
            this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            this.__explicitlySet__.add("isManagedByAutonomousLinux");
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
         * Indicates if the schedule job has restricted update and deletion capabilities. For
         * restricted scheduled jobs, you can update only the timeNextExecution, recurringRule, and
         * tags.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRestricted")
        private Boolean isRestricted;

        /**
         * Indicates if the schedule job has restricted update and deletion capabilities. For
         * restricted scheduled jobs, you can update only the timeNextExecution, recurringRule, and
         * tags.
         *
         * @param isRestricted the value to set
         * @return this builder
         */
        public Builder isRestricted(Boolean isRestricted) {
            this.isRestricted = isRestricted;
            this.__explicitlySet__.add("isRestricted");
            return this;
        }
        /**
         * The amount of time in minutes to wait until retrying the scheduled job. If set, the
         * service will automatically retry a failed scheduled job after the interval. For example,
         * you could set the interval to [2,5,10]. If the initial execution of the job fails, the
         * service waits 2 minutes and then retries. If that fails, the service waits 5 minutes and
         * then retries. If that fails, the service waits 10 minutes and then retries.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retryIntervals")
        private java.util.List<Integer> retryIntervals;

        /**
         * The amount of time in minutes to wait until retrying the scheduled job. If set, the
         * service will automatically retry a failed scheduled job after the interval. For example,
         * you could set the interval to [2,5,10]. If the initial execution of the job fails, the
         * service waits 2 minutes and then retries. If that fails, the service waits 5 minutes and
         * then retries. If that fails, the service waits 10 minutes and then retries.
         *
         * @param retryIntervals the value to set
         * @return this builder
         */
        public Builder retryIntervals(java.util.List<Integer> retryIntervals) {
            this.retryIntervals = retryIntervals;
            this.__explicitlySet__.add("retryIntervals");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledJobSummary build() {
            ScheduledJobSummary model =
                    new ScheduledJobSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.scheduleType,
                            this.locations,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeNextExecution,
                            this.timeLastExecution,
                            this.managedInstanceIds,
                            this.managedInstanceGroupIds,
                            this.managedCompartmentIds,
                            this.lifecycleStageIds,
                            this.operations,
                            this.lifecycleState,
                            this.isManagedByAutonomousLinux,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.isRestricted,
                            this.retryIntervals);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledJobSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("scheduleType")) {
                this.scheduleType(model.getScheduleType());
            }
            if (model.wasPropertyExplicitlySet("locations")) {
                this.locations(model.getLocations());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeNextExecution")) {
                this.timeNextExecution(model.getTimeNextExecution());
            }
            if (model.wasPropertyExplicitlySet("timeLastExecution")) {
                this.timeLastExecution(model.getTimeLastExecution());
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
            if (model.wasPropertyExplicitlySet("operations")) {
                this.operations(model.getOperations());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
            if (model.wasPropertyExplicitlySet("isRestricted")) {
                this.isRestricted(model.getIsRestricted());
            }
            if (model.wasPropertyExplicitlySet("retryIntervals")) {
                this.retryIntervals(model.getRetryIntervals());
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
     * the scheduled job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the scheduled job.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** User-friendly name for the scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name for the scheduled job.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the scheduled job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the scheduled job.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /**
     * The list of locations this scheduled job should operate on for a job targeting on
     * compartments. (Empty list means apply to all locations). This can only be set when
     * managedCompartmentIds is not empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locations")
    private final java.util.List<ManagedInstanceLocation> locations;

    /**
     * The list of locations this scheduled job should operate on for a job targeting on
     * compartments. (Empty list means apply to all locations). This can only be set when
     * managedCompartmentIds is not empty.
     *
     * @return the value
     */
    public java.util.List<ManagedInstanceLocation> getLocations() {
        return locations;
    }

    /**
     * The time this scheduled job was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this scheduled job was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time this scheduled job was updated (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this scheduled job was updated (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time of the next execution of this scheduled job (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    private final java.util.Date timeNextExecution;

    /**
     * The time of the next execution of this scheduled job (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeNextExecution() {
        return timeNextExecution;
    }

    /**
     * The time of the last execution of this scheduled job (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).b.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecution")
    private final java.util.Date timeLastExecution;

    /**
     * The time of the last execution of this scheduled job (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).b.
     *
     * @return the value
     */
    public java.util.Date getTimeLastExecution() {
        return timeLastExecution;
    }

    /**
     * The managed instance
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
     * this scheduled job operates on. A scheduled job can only operate on one type of target,
     * therefore this parameter is mutually exclusive with managedInstanceGroupIds,
     * managedCompartmentIds, and lifecycleStageIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
    private final java.util.List<String> managedInstanceIds;

    /**
     * The managed instance
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
     * this scheduled job operates on. A scheduled job can only operate on one type of target,
     * therefore this parameter is mutually exclusive with managedInstanceGroupIds,
     * managedCompartmentIds, and lifecycleStageIds.
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceIds() {
        return managedInstanceIds;
    }

    /**
     * The managed instance group
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
     * this scheduled job operates on. A scheduled job can only operate on one type of target,
     * therefore this parameter is mutually exclusive with managedInstanceIds,
     * managedCompartmentIds, and lifecycleStageIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
    private final java.util.List<String> managedInstanceGroupIds;

    /**
     * The managed instance group
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
     * this scheduled job operates on. A scheduled job can only operate on one type of target,
     * therefore this parameter is mutually exclusive with managedInstanceIds,
     * managedCompartmentIds, and lifecycleStageIds.
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceGroupIds() {
        return managedInstanceGroupIds;
    }

    /**
     * The compartment
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
     * this scheduled job operates on. A scheduled job can only operate on one type of target,
     * therefore this parameter is mutually exclusive with managedInstanceIds,
     * managedInstanceGroupIds, and lifecycleStageIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedCompartmentIds")
    private final java.util.List<String> managedCompartmentIds;

    /**
     * The compartment
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
     * this scheduled job operates on. A scheduled job can only operate on one type of target,
     * therefore this parameter is mutually exclusive with managedInstanceIds,
     * managedInstanceGroupIds, and lifecycleStageIds.
     *
     * @return the value
     */
    public java.util.List<String> getManagedCompartmentIds() {
        return managedCompartmentIds;
    }

    /**
     * The lifecycle stage
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
     * this scheduled job operates on. A scheduled job can only operate on one type of target,
     * therefore this parameter is mutually exclusive with managedInstanceIds,
     * managedInstanceGroupIds, and managedCompartmentIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageIds")
    private final java.util.List<String> lifecycleStageIds;

    /**
     * The lifecycle stage
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
     * this scheduled job operates on. A scheduled job can only operate on one type of target,
     * therefore this parameter is mutually exclusive with managedInstanceIds,
     * managedInstanceGroupIds, and managedCompartmentIds.
     *
     * @return the value
     */
    public java.util.List<String> getLifecycleStageIds() {
        return lifecycleStageIds;
    }

    /**
     * The list of operations this scheduled job needs to perform. A scheduled job supports only one
     * operation type, unless it is one of the following: * UPDATE_PACKAGES * UPDATE_ALL *
     * UPDATE_SECURITY * UPDATE_BUGFIX * UPDATE_ENHANCEMENT * UPDATE_OTHER *
     * UPDATE_KSPLICE_USERSPACE * UPDATE_KSPLICE_KERNEL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    private final java.util.List<ScheduledJobOperation> operations;

    /**
     * The list of operations this scheduled job needs to perform. A scheduled job supports only one
     * operation type, unless it is one of the following: * UPDATE_PACKAGES * UPDATE_ALL *
     * UPDATE_SECURITY * UPDATE_BUGFIX * UPDATE_ENHANCEMENT * UPDATE_OTHER *
     * UPDATE_KSPLICE_USERSPACE * UPDATE_KSPLICE_KERNEL
     *
     * @return the value
     */
    public java.util.List<ScheduledJobOperation> getOperations() {
        return operations;
    }

    /** The current state of the scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ScheduledJob.LifecycleState lifecycleState;

    /**
     * The current state of the scheduled job.
     *
     * @return the value
     */
    public ScheduledJob.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Indicates whether this scheduled job is managed by the Autonomous Linux service. */
    @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
    private final Boolean isManagedByAutonomousLinux;

    /**
     * Indicates whether this scheduled job is managed by the Autonomous Linux service.
     *
     * @return the value
     */
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
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
     * Indicates if the schedule job has restricted update and deletion capabilities. For restricted
     * scheduled jobs, you can update only the timeNextExecution, recurringRule, and tags.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRestricted")
    private final Boolean isRestricted;

    /**
     * Indicates if the schedule job has restricted update and deletion capabilities. For restricted
     * scheduled jobs, you can update only the timeNextExecution, recurringRule, and tags.
     *
     * @return the value
     */
    public Boolean getIsRestricted() {
        return isRestricted;
    }

    /**
     * The amount of time in minutes to wait until retrying the scheduled job. If set, the service
     * will automatically retry a failed scheduled job after the interval. For example, you could
     * set the interval to [2,5,10]. If the initial execution of the job fails, the service waits 2
     * minutes and then retries. If that fails, the service waits 5 minutes and then retries. If
     * that fails, the service waits 10 minutes and then retries.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retryIntervals")
    private final java.util.List<Integer> retryIntervals;

    /**
     * The amount of time in minutes to wait until retrying the scheduled job. If set, the service
     * will automatically retry a failed scheduled job after the interval. For example, you could
     * set the interval to [2,5,10]. If the initial execution of the job fails, the service waits 2
     * minutes and then retries. If that fails, the service waits 5 minutes and then retries. If
     * that fails, the service waits 10 minutes and then retries.
     *
     * @return the value
     */
    public java.util.List<Integer> getRetryIntervals() {
        return retryIntervals;
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
        sb.append("ScheduledJobSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", locations=").append(String.valueOf(this.locations));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeNextExecution=").append(String.valueOf(this.timeNextExecution));
        sb.append(", timeLastExecution=").append(String.valueOf(this.timeLastExecution));
        sb.append(", managedInstanceIds=").append(String.valueOf(this.managedInstanceIds));
        sb.append(", managedInstanceGroupIds=")
                .append(String.valueOf(this.managedInstanceGroupIds));
        sb.append(", managedCompartmentIds=").append(String.valueOf(this.managedCompartmentIds));
        sb.append(", lifecycleStageIds=").append(String.valueOf(this.lifecycleStageIds));
        sb.append(", operations=").append(String.valueOf(this.operations));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", isRestricted=").append(String.valueOf(this.isRestricted));
        sb.append(", retryIntervals=").append(String.valueOf(this.retryIntervals));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledJobSummary)) {
            return false;
        }

        ScheduledJobSummary other = (ScheduledJobSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.locations, other.locations)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeNextExecution, other.timeNextExecution)
                && java.util.Objects.equals(this.timeLastExecution, other.timeLastExecution)
                && java.util.Objects.equals(this.managedInstanceIds, other.managedInstanceIds)
                && java.util.Objects.equals(
                        this.managedInstanceGroupIds, other.managedInstanceGroupIds)
                && java.util.Objects.equals(this.managedCompartmentIds, other.managedCompartmentIds)
                && java.util.Objects.equals(this.lifecycleStageIds, other.lifecycleStageIds)
                && java.util.Objects.equals(this.operations, other.operations)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.isRestricted, other.isRestricted)
                && java.util.Objects.equals(this.retryIntervals, other.retryIntervals)
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
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result = (result * PRIME) + (this.locations == null ? 43 : this.locations.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNextExecution == null ? 43 : this.timeNextExecution.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastExecution == null ? 43 : this.timeLastExecution.hashCode());
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
        result = (result * PRIME) + (this.operations == null ? 43 : this.operations.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.isRestricted == null ? 43 : this.isRestricted.hashCode());
        result =
                (result * PRIME)
                        + (this.retryIntervals == null ? 43 : this.retryIntervals.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
