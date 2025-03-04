/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to create a scheduled job. <br>
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
        builder = CreateScheduledJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateScheduledJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "scheduleType",
        "locations",
        "timeNextExecution",
        "recurringRule",
        "managedInstanceIds",
        "managedInstanceGroupIds",
        "managedCompartmentIds",
        "lifecycleStageIds",
        "isSubcompartmentIncluded",
        "operations",
        "freeformTags",
        "definedTags",
        "retryIntervals",
        "isManagedByAutonomousLinux",
        "workRequestId"
    })
    public CreateScheduledJobDetails(
            String compartmentId,
            String displayName,
            String description,
            ScheduleTypes scheduleType,
            java.util.List<ManagedInstanceLocation> locations,
            java.util.Date timeNextExecution,
            String recurringRule,
            java.util.List<String> managedInstanceIds,
            java.util.List<String> managedInstanceGroupIds,
            java.util.List<String> managedCompartmentIds,
            java.util.List<String> lifecycleStageIds,
            Boolean isSubcompartmentIncluded,
            java.util.List<ScheduledJobOperation> operations,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<Integer> retryIntervals,
            Boolean isManagedByAutonomousLinux,
            String workRequestId) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.scheduleType = scheduleType;
        this.locations = locations;
        this.timeNextExecution = timeNextExecution;
        this.recurringRule = recurringRule;
        this.managedInstanceIds = managedInstanceIds;
        this.managedInstanceGroupIds = managedInstanceGroupIds;
        this.managedCompartmentIds = managedCompartmentIds;
        this.lifecycleStageIds = lifecycleStageIds;
        this.isSubcompartmentIncluded = isSubcompartmentIncluded;
        this.operations = operations;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.retryIntervals = retryIntervals;
        this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
        this.workRequestId = workRequestId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the scheduled job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the scheduled job.
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
         * User-friendly name for the scheduled job. Does not have to be unique and you can change
         * the name later. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name for the scheduled job. Does not have to be unique and you can change
         * the name later. Avoid entering confidential information.
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
         * User-specified description of the scheduled job. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description of the scheduled job. Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The type of scheduling frequency for the scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private ScheduleTypes scheduleType;

        /**
         * The type of scheduling frequency for the scheduled job.
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
         * The desired time of the next execution of this scheduled job (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        /**
         * The desired time of the next execution of this scheduled job (in [RFC
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
        /** The frequency schedule for a recurring scheduled job. */
        @com.fasterxml.jackson.annotation.JsonProperty("recurringRule")
        private String recurringRule;

        /**
         * The frequency schedule for a recurring scheduled job.
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
         * The managed instance
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
         * scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore you must supply either this or managedInstanceGroupIds, or
         * managedCompartmentIds, or lifecycleStageIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
        private java.util.List<String> managedInstanceIds;

        /**
         * The managed instance
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
         * scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore you must supply either this or managedInstanceGroupIds, or
         * managedCompartmentIds, or lifecycleStageIds.
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
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
         * scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore you must supply either this or managedInstanceIds, or managedCompartmentIds, or
         * lifecycleStageIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
        private java.util.List<String> managedInstanceGroupIds;

        /**
         * The managed instance group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
         * scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore you must supply either this or managedInstanceIds, or managedCompartmentIds, or
         * lifecycleStageIds.
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
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
         * scheduled job operates on. To apply the job to all compartments in the tenancy, set this
         * to the tenancy OCID (root compartment) and set isSubcompartmentIncluded to true. A
         * scheduled job can only operate on one type of target, therefore you must supply either
         * this or managedInstanceIds, or managedInstanceGroupIds, or lifecycleStageIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedCompartmentIds")
        private java.util.List<String> managedCompartmentIds;

        /**
         * The compartment
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
         * scheduled job operates on. To apply the job to all compartments in the tenancy, set this
         * to the tenancy OCID (root compartment) and set isSubcompartmentIncluded to true. A
         * scheduled job can only operate on one type of target, therefore you must supply either
         * this or managedInstanceIds, or managedInstanceGroupIds, or lifecycleStageIds.
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
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
         * scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore you must supply either this or managedInstanceIds, or managedInstanceGroupIds,
         * or managedCompartmentIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageIds")
        private java.util.List<String> lifecycleStageIds;

        /**
         * The lifecycle stage
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
         * scheduled job operates on. A scheduled job can only operate on one type of target,
         * therefore you must supply either this or managedInstanceIds, or managedInstanceGroupIds,
         * or managedCompartmentIds.
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
         * Indicates whether to apply the scheduled job to all compartments in the tenancy when
         * managedCompartmentIds specifies the tenancy
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (root
         * compartment).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSubcompartmentIncluded")
        private Boolean isSubcompartmentIncluded;

        /**
         * Indicates whether to apply the scheduled job to all compartments in the tenancy when
         * managedCompartmentIds specifies the tenancy
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (root
         * compartment).
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * work request that will be rerun.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * work request that will be rerun.
         *
         * @param workRequestId the value to set
         * @return this builder
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateScheduledJobDetails build() {
            CreateScheduledJobDetails model =
                    new CreateScheduledJobDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.scheduleType,
                            this.locations,
                            this.timeNextExecution,
                            this.recurringRule,
                            this.managedInstanceIds,
                            this.managedInstanceGroupIds,
                            this.managedCompartmentIds,
                            this.lifecycleStageIds,
                            this.isSubcompartmentIncluded,
                            this.operations,
                            this.freeformTags,
                            this.definedTags,
                            this.retryIntervals,
                            this.isManagedByAutonomousLinux,
                            this.workRequestId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateScheduledJobDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scheduleType")) {
                this.scheduleType(model.getScheduleType());
            }
            if (model.wasPropertyExplicitlySet("locations")) {
                this.locations(model.getLocations());
            }
            if (model.wasPropertyExplicitlySet("timeNextExecution")) {
                this.timeNextExecution(model.getTimeNextExecution());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("retryIntervals")) {
                this.retryIntervals(model.getRetryIntervals());
            }
            if (model.wasPropertyExplicitlySet("isManagedByAutonomousLinux")) {
                this.isManagedByAutonomousLinux(model.getIsManagedByAutonomousLinux());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the scheduled job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the scheduled job.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * User-friendly name for the scheduled job. Does not have to be unique and you can change the
     * name later. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name for the scheduled job. Does not have to be unique and you can change the
     * name later. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** User-specified description of the scheduled job. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description of the scheduled job. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The type of scheduling frequency for the scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final ScheduleTypes scheduleType;

    /**
     * The type of scheduling frequency for the scheduled job.
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
     * The desired time of the next execution of this scheduled job (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    private final java.util.Date timeNextExecution;

    /**
     * The desired time of the next execution of this scheduled job (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeNextExecution() {
        return timeNextExecution;
    }

    /** The frequency schedule for a recurring scheduled job. */
    @com.fasterxml.jackson.annotation.JsonProperty("recurringRule")
    private final String recurringRule;

    /**
     * The frequency schedule for a recurring scheduled job.
     *
     * @return the value
     */
    public String getRecurringRule() {
        return recurringRule;
    }

    /**
     * The managed instance
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
     * scheduled job operates on. A scheduled job can only operate on one type of target, therefore
     * you must supply either this or managedInstanceGroupIds, or managedCompartmentIds, or
     * lifecycleStageIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
    private final java.util.List<String> managedInstanceIds;

    /**
     * The managed instance
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
     * scheduled job operates on. A scheduled job can only operate on one type of target, therefore
     * you must supply either this or managedInstanceGroupIds, or managedCompartmentIds, or
     * lifecycleStageIds.
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceIds() {
        return managedInstanceIds;
    }

    /**
     * The managed instance group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
     * scheduled job operates on. A scheduled job can only operate on one type of target, therefore
     * you must supply either this or managedInstanceIds, or managedCompartmentIds, or
     * lifecycleStageIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
    private final java.util.List<String> managedInstanceGroupIds;

    /**
     * The managed instance group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
     * scheduled job operates on. A scheduled job can only operate on one type of target, therefore
     * you must supply either this or managedInstanceIds, or managedCompartmentIds, or
     * lifecycleStageIds.
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceGroupIds() {
        return managedInstanceGroupIds;
    }

    /**
     * The compartment
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
     * scheduled job operates on. To apply the job to all compartments in the tenancy, set this to
     * the tenancy OCID (root compartment) and set isSubcompartmentIncluded to true. A scheduled job
     * can only operate on one type of target, therefore you must supply either this or
     * managedInstanceIds, or managedInstanceGroupIds, or lifecycleStageIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedCompartmentIds")
    private final java.util.List<String> managedCompartmentIds;

    /**
     * The compartment
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
     * scheduled job operates on. To apply the job to all compartments in the tenancy, set this to
     * the tenancy OCID (root compartment) and set isSubcompartmentIncluded to true. A scheduled job
     * can only operate on one type of target, therefore you must supply either this or
     * managedInstanceIds, or managedInstanceGroupIds, or lifecycleStageIds.
     *
     * @return the value
     */
    public java.util.List<String> getManagedCompartmentIds() {
        return managedCompartmentIds;
    }

    /**
     * The lifecycle stage
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
     * scheduled job operates on. A scheduled job can only operate on one type of target, therefore
     * you must supply either this or managedInstanceIds, or managedInstanceGroupIds, or
     * managedCompartmentIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageIds")
    private final java.util.List<String> lifecycleStageIds;

    /**
     * The lifecycle stage
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that this
     * scheduled job operates on. A scheduled job can only operate on one type of target, therefore
     * you must supply either this or managedInstanceIds, or managedInstanceGroupIds, or
     * managedCompartmentIds.
     *
     * @return the value
     */
    public java.util.List<String> getLifecycleStageIds() {
        return lifecycleStageIds;
    }

    /**
     * Indicates whether to apply the scheduled job to all compartments in the tenancy when
     * managedCompartmentIds specifies the tenancy
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (root
     * compartment).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSubcompartmentIncluded")
    private final Boolean isSubcompartmentIncluded;

    /**
     * Indicates whether to apply the scheduled job to all compartments in the tenancy when
     * managedCompartmentIds specifies the tenancy
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (root
     * compartment).
     *
     * @return the value
     */
    public Boolean getIsSubcompartmentIncluded() {
        return isSubcompartmentIncluded;
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * work request that will be rerun.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * work request that will be rerun.
     *
     * @return the value
     */
    public String getWorkRequestId() {
        return workRequestId;
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
        sb.append("CreateScheduledJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", locations=").append(String.valueOf(this.locations));
        sb.append(", timeNextExecution=").append(String.valueOf(this.timeNextExecution));
        sb.append(", recurringRule=").append(String.valueOf(this.recurringRule));
        sb.append(", managedInstanceIds=").append(String.valueOf(this.managedInstanceIds));
        sb.append(", managedInstanceGroupIds=")
                .append(String.valueOf(this.managedInstanceGroupIds));
        sb.append(", managedCompartmentIds=").append(String.valueOf(this.managedCompartmentIds));
        sb.append(", lifecycleStageIds=").append(String.valueOf(this.lifecycleStageIds));
        sb.append(", isSubcompartmentIncluded=")
                .append(String.valueOf(this.isSubcompartmentIncluded));
        sb.append(", operations=").append(String.valueOf(this.operations));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", retryIntervals=").append(String.valueOf(this.retryIntervals));
        sb.append(", isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateScheduledJobDetails)) {
            return false;
        }

        CreateScheduledJobDetails other = (CreateScheduledJobDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.locations, other.locations)
                && java.util.Objects.equals(this.timeNextExecution, other.timeNextExecution)
                && java.util.Objects.equals(this.recurringRule, other.recurringRule)
                && java.util.Objects.equals(this.managedInstanceIds, other.managedInstanceIds)
                && java.util.Objects.equals(
                        this.managedInstanceGroupIds, other.managedInstanceGroupIds)
                && java.util.Objects.equals(this.managedCompartmentIds, other.managedCompartmentIds)
                && java.util.Objects.equals(this.lifecycleStageIds, other.lifecycleStageIds)
                && java.util.Objects.equals(
                        this.isSubcompartmentIncluded, other.isSubcompartmentIncluded)
                && java.util.Objects.equals(this.operations, other.operations)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.retryIntervals, other.retryIntervals)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result = (result * PRIME) + (this.locations == null ? 43 : this.locations.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNextExecution == null ? 43 : this.timeNextExecution.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.retryIntervals == null ? 43 : this.retryIntervals.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
