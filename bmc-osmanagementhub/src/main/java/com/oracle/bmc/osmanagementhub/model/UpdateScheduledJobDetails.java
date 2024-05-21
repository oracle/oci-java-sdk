/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to update a scheduled job.
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
    builder = UpdateScheduledJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateScheduledJobDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "scheduleType",
        "timeNextExecution",
        "recurringRule",
        "operations",
        "freeformTags",
        "definedTags",
        "retryIntervals"
    })
    public UpdateScheduledJobDetails(
            String displayName,
            String description,
            ScheduleTypes scheduleType,
            java.util.Date timeNextExecution,
            String recurringRule,
            java.util.List<ScheduledJobOperation> operations,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<Integer> retryIntervals) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.scheduleType = scheduleType;
        this.timeNextExecution = timeNextExecution;
        this.recurringRule = recurringRule;
        this.operations = operations;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.retryIntervals = retryIntervals;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * User-friendly name for the scheduled job. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name for the scheduled job. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * User-specified description for the scheduled job. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description for the scheduled job. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The type of scheduling frequency for the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private ScheduleTypes scheduleType;

        /**
         * The type of scheduling frequency for the job.
         * @param scheduleType the value to set
         * @return this builder
         **/
        public Builder scheduleType(ScheduleTypes scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /**
         * The desired time of the next execution of this scheduled job (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        /**
         * The desired time of the next execution of this scheduled job (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         * @param timeNextExecution the value to set
         * @return this builder
         **/
        public Builder timeNextExecution(java.util.Date timeNextExecution) {
            this.timeNextExecution = timeNextExecution;
            this.__explicitlySet__.add("timeNextExecution");
            return this;
        }
        /**
         * The frequency schedule for a recurring scheduled job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recurringRule")
        private String recurringRule;

        /**
         * The frequency schedule for a recurring scheduled job.
         * @param recurringRule the value to set
         * @return this builder
         **/
        public Builder recurringRule(String recurringRule) {
            this.recurringRule = recurringRule;
            this.__explicitlySet__.add("recurringRule");
            return this;
        }
        /**
         * The list of operations this scheduled job needs to perform.
         * A scheduled job supports only one operation type, unless it is one of the following:
         * * UPDATE_PACKAGES
         * * UPDATE_ALL
         * * UPDATE_SECURITY
         * * UPDATE_BUGFIX
         * * UPDATE_ENHANCEMENT
         * * UPDATE_OTHER
         * * UPDATE_KSPLICE_USERSPACE
         * * UPDATE_KSPLICE_KERNEL
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operations")
        private java.util.List<ScheduledJobOperation> operations;

        /**
         * The list of operations this scheduled job needs to perform.
         * A scheduled job supports only one operation type, unless it is one of the following:
         * * UPDATE_PACKAGES
         * * UPDATE_ALL
         * * UPDATE_SECURITY
         * * UPDATE_BUGFIX
         * * UPDATE_ENHANCEMENT
         * * UPDATE_OTHER
         * * UPDATE_KSPLICE_USERSPACE
         * * UPDATE_KSPLICE_KERNEL
         *
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
        /**
         * The amount of time in minutes to wait until retrying the scheduled job. If set, the service will automatically
         * retry a failed scheduled job after the interval. For example, you could set the interval to [2,5,10]. If the
         * initial execution of the job fails, the service waits 2 minutes and then retries. If that fails, the service
         * waits 5 minutes and then retries. If that fails, the service waits 10 minutes and then retries.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("retryIntervals")
        private java.util.List<Integer> retryIntervals;

        /**
         * The amount of time in minutes to wait until retrying the scheduled job. If set, the service will automatically
         * retry a failed scheduled job after the interval. For example, you could set the interval to [2,5,10]. If the
         * initial execution of the job fails, the service waits 2 minutes and then retries. If that fails, the service
         * waits 5 minutes and then retries. If that fails, the service waits 10 minutes and then retries.
         *
         * @param retryIntervals the value to set
         * @return this builder
         **/
        public Builder retryIntervals(java.util.List<Integer> retryIntervals) {
            this.retryIntervals = retryIntervals;
            this.__explicitlySet__.add("retryIntervals");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateScheduledJobDetails build() {
            UpdateScheduledJobDetails model =
                    new UpdateScheduledJobDetails(
                            this.displayName,
                            this.description,
                            this.scheduleType,
                            this.timeNextExecution,
                            this.recurringRule,
                            this.operations,
                            this.freeformTags,
                            this.definedTags,
                            this.retryIntervals);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateScheduledJobDetails model) {
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
     * User-friendly name for the scheduled job. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name for the scheduled job. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * User-specified description for the scheduled job. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description for the scheduled job. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The type of scheduling frequency for the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final ScheduleTypes scheduleType;

    /**
     * The type of scheduling frequency for the job.
     * @return the value
     **/
    public ScheduleTypes getScheduleType() {
        return scheduleType;
    }

    /**
     * The desired time of the next execution of this scheduled job (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    private final java.util.Date timeNextExecution;

    /**
     * The desired time of the next execution of this scheduled job (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     * @return the value
     **/
    public java.util.Date getTimeNextExecution() {
        return timeNextExecution;
    }

    /**
     * The frequency schedule for a recurring scheduled job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recurringRule")
    private final String recurringRule;

    /**
     * The frequency schedule for a recurring scheduled job.
     * @return the value
     **/
    public String getRecurringRule() {
        return recurringRule;
    }

    /**
     * The list of operations this scheduled job needs to perform.
     * A scheduled job supports only one operation type, unless it is one of the following:
     * * UPDATE_PACKAGES
     * * UPDATE_ALL
     * * UPDATE_SECURITY
     * * UPDATE_BUGFIX
     * * UPDATE_ENHANCEMENT
     * * UPDATE_OTHER
     * * UPDATE_KSPLICE_USERSPACE
     * * UPDATE_KSPLICE_KERNEL
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    private final java.util.List<ScheduledJobOperation> operations;

    /**
     * The list of operations this scheduled job needs to perform.
     * A scheduled job supports only one operation type, unless it is one of the following:
     * * UPDATE_PACKAGES
     * * UPDATE_ALL
     * * UPDATE_SECURITY
     * * UPDATE_BUGFIX
     * * UPDATE_ENHANCEMENT
     * * UPDATE_OTHER
     * * UPDATE_KSPLICE_USERSPACE
     * * UPDATE_KSPLICE_KERNEL
     *
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

    /**
     * The amount of time in minutes to wait until retrying the scheduled job. If set, the service will automatically
     * retry a failed scheduled job after the interval. For example, you could set the interval to [2,5,10]. If the
     * initial execution of the job fails, the service waits 2 minutes and then retries. If that fails, the service
     * waits 5 minutes and then retries. If that fails, the service waits 10 minutes and then retries.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryIntervals")
    private final java.util.List<Integer> retryIntervals;

    /**
     * The amount of time in minutes to wait until retrying the scheduled job. If set, the service will automatically
     * retry a failed scheduled job after the interval. For example, you could set the interval to [2,5,10]. If the
     * initial execution of the job fails, the service waits 2 minutes and then retries. If that fails, the service
     * waits 5 minutes and then retries. If that fails, the service waits 10 minutes and then retries.
     *
     * @return the value
     **/
    public java.util.List<Integer> getRetryIntervals() {
        return retryIntervals;
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
        sb.append("UpdateScheduledJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", timeNextExecution=").append(String.valueOf(this.timeNextExecution));
        sb.append(", recurringRule=").append(String.valueOf(this.recurringRule));
        sb.append(", operations=").append(String.valueOf(this.operations));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", retryIntervals=").append(String.valueOf(this.retryIntervals));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateScheduledJobDetails)) {
            return false;
        }

        UpdateScheduledJobDetails other = (UpdateScheduledJobDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.timeNextExecution, other.timeNextExecution)
                && java.util.Objects.equals(this.recurringRule, other.recurringRule)
                && java.util.Objects.equals(this.operations, other.operations)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.retryIntervals, other.retryIntervals)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNextExecution == null ? 43 : this.timeNextExecution.hashCode());
        result =
                (result * PRIME)
                        + (this.recurringRule == null ? 43 : this.recurringRule.hashCode());
        result = (result * PRIME) + (this.operations == null ? 43 : this.operations.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.retryIntervals == null ? 43 : this.retryIntervals.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
