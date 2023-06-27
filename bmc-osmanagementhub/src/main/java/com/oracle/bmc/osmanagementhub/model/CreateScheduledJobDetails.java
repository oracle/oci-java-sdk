/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Information for creating a scheduled job.
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
    builder = CreateScheduledJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateScheduledJobDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "scheduleType",
        "timeNextExecution",
        "recurringRule",
        "managedInstanceIds",
        "managedInstanceGroupIds",
        "managedCompartmentIds",
        "lifecycleStageIds",
        "isSubcompartmentIncluded",
        "operations",
        "freeformTags",
        "definedTags"
    })
    public CreateScheduledJobDetails(
            String compartmentId,
            String displayName,
            String description,
            ScheduleTypes scheduleType,
            java.util.Date timeNextExecution,
            String recurringRule,
            java.util.List<String> managedInstanceIds,
            java.util.List<String> managedInstanceGroupIds,
            java.util.List<String> managedCompartmentIds,
            java.util.List<String> lifecycleStageIds,
            Boolean isSubcompartmentIncluded,
            java.util.List<ScheduledJobOperation> operations,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.scheduleType = scheduleType;
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
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment containing the scheduled job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the scheduled job.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Scheduled job name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Scheduled job name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Details describing the scheduled job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details describing the scheduled job.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The type of scheduling this scheduled job follows.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private ScheduleTypes scheduleType;

        /**
         * The type of scheduling this scheduled job follows.
         * @param scheduleType the value to set
         * @return this builder
         **/
        public Builder scheduleType(ScheduleTypes scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /**
         * The desired time for the next execution of this scheduled job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        /**
         * The desired time for the next execution of this scheduled job.
         * @param timeNextExecution the value to set
         * @return this builder
         **/
        public Builder timeNextExecution(java.util.Date timeNextExecution) {
            this.timeNextExecution = timeNextExecution;
            this.__explicitlySet__.add("timeNextExecution");
            return this;
        }
        /**
         * The recurring rule for a recurring scheduled job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recurringRule")
        private String recurringRule;

        /**
         * The recurring rule for a recurring scheduled job.
         * @param recurringRule the value to set
         * @return this builder
         **/
        public Builder recurringRule(String recurringRule) {
            this.recurringRule = recurringRule;
            this.__explicitlySet__.add("recurringRule");
            return this;
        }
        /**
         * The list of managed instance OCIDs this scheduled job operates on. Either this or
         * managedInstanceGroupIds, or managedCompartmentIds, or lifecycleStageIds must be supplied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
        private java.util.List<String> managedInstanceIds;

        /**
         * The list of managed instance OCIDs this scheduled job operates on. Either this or
         * managedInstanceGroupIds, or managedCompartmentIds, or lifecycleStageIds must be supplied.
         *
         * @param managedInstanceIds the value to set
         * @return this builder
         **/
        public Builder managedInstanceIds(java.util.List<String> managedInstanceIds) {
            this.managedInstanceIds = managedInstanceIds;
            this.__explicitlySet__.add("managedInstanceIds");
            return this;
        }
        /**
         * The list of managed instance group OCIDs this scheduled job operates on. Either this or
         * managedInstanceIds, or managedCompartmentIds, or lifecycleStageIds must be supplied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
        private java.util.List<String> managedInstanceGroupIds;

        /**
         * The list of managed instance group OCIDs this scheduled job operates on. Either this or
         * managedInstanceIds, or managedCompartmentIds, or lifecycleStageIds must be supplied.
         *
         * @param managedInstanceGroupIds the value to set
         * @return this builder
         **/
        public Builder managedInstanceGroupIds(java.util.List<String> managedInstanceGroupIds) {
            this.managedInstanceGroupIds = managedInstanceGroupIds;
            this.__explicitlySet__.add("managedInstanceGroupIds");
            return this;
        }
        /**
         * The list of target compartment OCIDs if this scheduled job operates on a compartment level.
         * Either this or managedInstanceIds, or managedInstanceGroupIds, or lifecycleStageIds must be supplied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedCompartmentIds")
        private java.util.List<String> managedCompartmentIds;

        /**
         * The list of target compartment OCIDs if this scheduled job operates on a compartment level.
         * Either this or managedInstanceIds, or managedInstanceGroupIds, or lifecycleStageIds must be supplied.
         *
         * @param managedCompartmentIds the value to set
         * @return this builder
         **/
        public Builder managedCompartmentIds(java.util.List<String> managedCompartmentIds) {
            this.managedCompartmentIds = managedCompartmentIds;
            this.__explicitlySet__.add("managedCompartmentIds");
            return this;
        }
        /**
         * The list of lifecycle stage OCIDs this scheduled job operates on. Either this or
         * managedInstanceIds, or managedInstanceGroupIds, or managedCompartmentIds must be supplied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageIds")
        private java.util.List<String> lifecycleStageIds;

        /**
         * The list of lifecycle stage OCIDs this scheduled job operates on. Either this or
         * managedInstanceIds, or managedInstanceGroupIds, or managedCompartmentIds must be supplied.
         *
         * @param lifecycleStageIds the value to set
         * @return this builder
         **/
        public Builder lifecycleStageIds(java.util.List<String> lifecycleStageIds) {
            this.lifecycleStageIds = lifecycleStageIds;
            this.__explicitlySet__.add("lifecycleStageIds");
            return this;
        }
        /**
         * Whether to create jobs for all compartments in the tenancy when managedCompartmentIds specifies the tenancy OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSubcompartmentIncluded")
        private Boolean isSubcompartmentIncluded;

        /**
         * Whether to create jobs for all compartments in the tenancy when managedCompartmentIds specifies the tenancy OCID.
         * @param isSubcompartmentIncluded the value to set
         * @return this builder
         **/
        public Builder isSubcompartmentIncluded(Boolean isSubcompartmentIncluded) {
            this.isSubcompartmentIncluded = isSubcompartmentIncluded;
            this.__explicitlySet__.add("isSubcompartmentIncluded");
            return this;
        }
        /**
         * The list of operations this scheduled job needs to perform (can only support one operation if the operationType is not UPDATE_PACKAGES/UPDATE_ALL/UPDATE_SECURITY/UPDATE_BUGFIX/UPDATE_ENHANCEMENT/UPDATE_OTHER/UPDATE_KSPLICE_USERSPACE/UPDATE_KSPLICE_KERNEL).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operations")
        private java.util.List<ScheduledJobOperation> operations;

        /**
         * The list of operations this scheduled job needs to perform (can only support one operation if the operationType is not UPDATE_PACKAGES/UPDATE_ALL/UPDATE_SECURITY/UPDATE_BUGFIX/UPDATE_ENHANCEMENT/UPDATE_OTHER/UPDATE_KSPLICE_USERSPACE/UPDATE_KSPLICE_KERNEL).
         * @param operations the value to set
         * @return this builder
         **/
        public Builder operations(java.util.List<ScheduledJobOperation> operations) {
            this.operations = operations;
            this.__explicitlySet__.add("operations");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateScheduledJobDetails build() {
            CreateScheduledJobDetails model =
                    new CreateScheduledJobDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.scheduleType,
                            this.timeNextExecution,
                            this.recurringRule,
                            this.managedInstanceIds,
                            this.managedInstanceGroupIds,
                            this.managedCompartmentIds,
                            this.lifecycleStageIds,
                            this.isSubcompartmentIncluded,
                            this.operations,
                            this.freeformTags,
                            this.definedTags);
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
     * The OCID of the compartment containing the scheduled job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the scheduled job.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Scheduled job name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Scheduled job name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Details describing the scheduled job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details describing the scheduled job.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The type of scheduling this scheduled job follows.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final ScheduleTypes scheduleType;

    /**
     * The type of scheduling this scheduled job follows.
     * @return the value
     **/
    public ScheduleTypes getScheduleType() {
        return scheduleType;
    }

    /**
     * The desired time for the next execution of this scheduled job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    private final java.util.Date timeNextExecution;

    /**
     * The desired time for the next execution of this scheduled job.
     * @return the value
     **/
    public java.util.Date getTimeNextExecution() {
        return timeNextExecution;
    }

    /**
     * The recurring rule for a recurring scheduled job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recurringRule")
    private final String recurringRule;

    /**
     * The recurring rule for a recurring scheduled job.
     * @return the value
     **/
    public String getRecurringRule() {
        return recurringRule;
    }

    /**
     * The list of managed instance OCIDs this scheduled job operates on. Either this or
     * managedInstanceGroupIds, or managedCompartmentIds, or lifecycleStageIds must be supplied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
    private final java.util.List<String> managedInstanceIds;

    /**
     * The list of managed instance OCIDs this scheduled job operates on. Either this or
     * managedInstanceGroupIds, or managedCompartmentIds, or lifecycleStageIds must be supplied.
     *
     * @return the value
     **/
    public java.util.List<String> getManagedInstanceIds() {
        return managedInstanceIds;
    }

    /**
     * The list of managed instance group OCIDs this scheduled job operates on. Either this or
     * managedInstanceIds, or managedCompartmentIds, or lifecycleStageIds must be supplied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
    private final java.util.List<String> managedInstanceGroupIds;

    /**
     * The list of managed instance group OCIDs this scheduled job operates on. Either this or
     * managedInstanceIds, or managedCompartmentIds, or lifecycleStageIds must be supplied.
     *
     * @return the value
     **/
    public java.util.List<String> getManagedInstanceGroupIds() {
        return managedInstanceGroupIds;
    }

    /**
     * The list of target compartment OCIDs if this scheduled job operates on a compartment level.
     * Either this or managedInstanceIds, or managedInstanceGroupIds, or lifecycleStageIds must be supplied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedCompartmentIds")
    private final java.util.List<String> managedCompartmentIds;

    /**
     * The list of target compartment OCIDs if this scheduled job operates on a compartment level.
     * Either this or managedInstanceIds, or managedInstanceGroupIds, or lifecycleStageIds must be supplied.
     *
     * @return the value
     **/
    public java.util.List<String> getManagedCompartmentIds() {
        return managedCompartmentIds;
    }

    /**
     * The list of lifecycle stage OCIDs this scheduled job operates on. Either this or
     * managedInstanceIds, or managedInstanceGroupIds, or managedCompartmentIds must be supplied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageIds")
    private final java.util.List<String> lifecycleStageIds;

    /**
     * The list of lifecycle stage OCIDs this scheduled job operates on. Either this or
     * managedInstanceIds, or managedInstanceGroupIds, or managedCompartmentIds must be supplied.
     *
     * @return the value
     **/
    public java.util.List<String> getLifecycleStageIds() {
        return lifecycleStageIds;
    }

    /**
     * Whether to create jobs for all compartments in the tenancy when managedCompartmentIds specifies the tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSubcompartmentIncluded")
    private final Boolean isSubcompartmentIncluded;

    /**
     * Whether to create jobs for all compartments in the tenancy when managedCompartmentIds specifies the tenancy OCID.
     * @return the value
     **/
    public Boolean getIsSubcompartmentIncluded() {
        return isSubcompartmentIncluded;
    }

    /**
     * The list of operations this scheduled job needs to perform (can only support one operation if the operationType is not UPDATE_PACKAGES/UPDATE_ALL/UPDATE_SECURITY/UPDATE_BUGFIX/UPDATE_ENHANCEMENT/UPDATE_OTHER/UPDATE_KSPLICE_USERSPACE/UPDATE_KSPLICE_KERNEL).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    private final java.util.List<ScheduledJobOperation> operations;

    /**
     * The list of operations this scheduled job needs to perform (can only support one operation if the operationType is not UPDATE_PACKAGES/UPDATE_ALL/UPDATE_SECURITY/UPDATE_BUGFIX/UPDATE_ENHANCEMENT/UPDATE_OTHER/UPDATE_KSPLICE_USERSPACE/UPDATE_KSPLICE_KERNEL).
     * @return the value
     **/
    public java.util.List<ScheduledJobOperation> getOperations() {
        return operations;
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
        sb.append("CreateScheduledJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
