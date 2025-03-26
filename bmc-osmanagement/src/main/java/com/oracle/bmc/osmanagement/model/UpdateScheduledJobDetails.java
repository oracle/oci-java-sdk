/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information for updating a Scheduled Job
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
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
        "intervalType",
        "intervalValue",
        "operationType",
        "updateType",
        "packageNames",
        "updateNames",
        "freeformTags",
        "definedTags"
    })
    public UpdateScheduledJobDetails(
            String displayName,
            String description,
            ScheduleTypes scheduleType,
            java.util.Date timeNextExecution,
            IntervalTypes intervalType,
            String intervalValue,
            OperationTypes operationType,
            PackageUpdateTypes updateType,
            java.util.List<PackageName> packageNames,
            java.util.List<String> updateNames,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.scheduleType = scheduleType;
        this.timeNextExecution = timeNextExecution;
        this.intervalType = intervalType;
        this.intervalValue = intervalValue;
        this.operationType = operationType;
        this.updateType = updateType;
        this.packageNames = packageNames;
        this.updateNames = updateNames;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Scheduled Job name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Scheduled Job name
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Details describing the Scheduled Job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details describing the Scheduled Job.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * the type of scheduling this Scheduled Job follows
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private ScheduleTypes scheduleType;

        /**
         * the type of scheduling this Scheduled Job follows
         * @param scheduleType the value to set
         * @return this builder
         **/
        public Builder scheduleType(ScheduleTypes scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /**
         * the desired time for the next execution of this Scheduled Job
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        /**
         * the desired time for the next execution of this Scheduled Job
         * @param timeNextExecution the value to set
         * @return this builder
         **/
        public Builder timeNextExecution(java.util.Date timeNextExecution) {
            this.timeNextExecution = timeNextExecution;
            this.__explicitlySet__.add("timeNextExecution");
            return this;
        }
        /**
         * the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalType")
        private IntervalTypes intervalType;

        /**
         * the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
         * @param intervalType the value to set
         * @return this builder
         **/
        public Builder intervalType(IntervalTypes intervalType) {
            this.intervalType = intervalType;
            this.__explicitlySet__.add("intervalType");
            return this;
        }
        /**
         * the value for the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalValue")
        private String intervalValue;

        /**
         * the value for the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
         * @param intervalValue the value to set
         * @return this builder
         **/
        public Builder intervalValue(String intervalValue) {
            this.intervalValue = intervalValue;
            this.__explicitlySet__.add("intervalValue");
            return this;
        }
        /**
         * the type of operation this Scheduled Job performs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationTypes operationType;

        /**
         * the type of operation this Scheduled Job performs
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(OperationTypes operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * Type of the update (only if operation type is UPDATEALL)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private PackageUpdateTypes updateType;

        /**
         * Type of the update (only if operation type is UPDATEALL)
         * @param updateType the value to set
         * @return this builder
         **/
        public Builder updateType(PackageUpdateTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }
        /**
         * the id of the package (only if operation type is INSTALL/UPDATE/REMOVE)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
        private java.util.List<PackageName> packageNames;

        /**
         * the id of the package (only if operation type is INSTALL/UPDATE/REMOVE)
         * @param packageNames the value to set
         * @return this builder
         **/
        public Builder packageNames(java.util.List<PackageName> packageNames) {
            this.packageNames = packageNames;
            this.__explicitlySet__.add("packageNames");
            return this;
        }
        /**
         * The unique names of the Windows Updates (only if operation type is INSTALL).
         * This is only applicable when the osFamily is for Windows managed instances.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateNames")
        private java.util.List<String> updateNames;

        /**
         * The unique names of the Windows Updates (only if operation type is INSTALL).
         * This is only applicable when the osFamily is for Windows managed instances.
         *
         * @param updateNames the value to set
         * @return this builder
         **/
        public Builder updateNames(java.util.List<String> updateNames) {
            this.updateNames = updateNames;
            this.__explicitlySet__.add("updateNames");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public UpdateScheduledJobDetails build() {
            UpdateScheduledJobDetails model =
                    new UpdateScheduledJobDetails(
                            this.displayName,
                            this.description,
                            this.scheduleType,
                            this.timeNextExecution,
                            this.intervalType,
                            this.intervalValue,
                            this.operationType,
                            this.updateType,
                            this.packageNames,
                            this.updateNames,
                            this.freeformTags,
                            this.definedTags);
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
            if (model.wasPropertyExplicitlySet("intervalType")) {
                this.intervalType(model.getIntervalType());
            }
            if (model.wasPropertyExplicitlySet("intervalValue")) {
                this.intervalValue(model.getIntervalValue());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("updateType")) {
                this.updateType(model.getUpdateType());
            }
            if (model.wasPropertyExplicitlySet("packageNames")) {
                this.packageNames(model.getPackageNames());
            }
            if (model.wasPropertyExplicitlySet("updateNames")) {
                this.updateNames(model.getUpdateNames());
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
     * Scheduled Job name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Scheduled Job name
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Details describing the Scheduled Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details describing the Scheduled Job.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * the type of scheduling this Scheduled Job follows
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final ScheduleTypes scheduleType;

    /**
     * the type of scheduling this Scheduled Job follows
     * @return the value
     **/
    public ScheduleTypes getScheduleType() {
        return scheduleType;
    }

    /**
     * the desired time for the next execution of this Scheduled Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    private final java.util.Date timeNextExecution;

    /**
     * the desired time for the next execution of this Scheduled Job
     * @return the value
     **/
    public java.util.Date getTimeNextExecution() {
        return timeNextExecution;
    }

    /**
     * the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalType")
    private final IntervalTypes intervalType;

    /**
     * the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
     * @return the value
     **/
    public IntervalTypes getIntervalType() {
        return intervalType;
    }

    /**
     * the value for the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalValue")
    private final String intervalValue;

    /**
     * the value for the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
     * @return the value
     **/
    public String getIntervalValue() {
        return intervalValue;
    }

    /**
     * the type of operation this Scheduled Job performs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationTypes operationType;

    /**
     * the type of operation this Scheduled Job performs
     * @return the value
     **/
    public OperationTypes getOperationType() {
        return operationType;
    }

    /**
     * Type of the update (only if operation type is UPDATEALL)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final PackageUpdateTypes updateType;

    /**
     * Type of the update (only if operation type is UPDATEALL)
     * @return the value
     **/
    public PackageUpdateTypes getUpdateType() {
        return updateType;
    }

    /**
     * the id of the package (only if operation type is INSTALL/UPDATE/REMOVE)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
    private final java.util.List<PackageName> packageNames;

    /**
     * the id of the package (only if operation type is INSTALL/UPDATE/REMOVE)
     * @return the value
     **/
    public java.util.List<PackageName> getPackageNames() {
        return packageNames;
    }

    /**
     * The unique names of the Windows Updates (only if operation type is INSTALL).
     * This is only applicable when the osFamily is for Windows managed instances.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateNames")
    private final java.util.List<String> updateNames;

    /**
     * The unique names of the Windows Updates (only if operation type is INSTALL).
     * This is only applicable when the osFamily is for Windows managed instances.
     *
     * @return the value
     **/
    public java.util.List<String> getUpdateNames() {
        return updateNames;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("UpdateScheduledJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", timeNextExecution=").append(String.valueOf(this.timeNextExecution));
        sb.append(", intervalType=").append(String.valueOf(this.intervalType));
        sb.append(", intervalValue=").append(String.valueOf(this.intervalValue));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", packageNames=").append(String.valueOf(this.packageNames));
        sb.append(", updateNames=").append(String.valueOf(this.updateNames));
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
        if (!(o instanceof UpdateScheduledJobDetails)) {
            return false;
        }

        UpdateScheduledJobDetails other = (UpdateScheduledJobDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.timeNextExecution, other.timeNextExecution)
                && java.util.Objects.equals(this.intervalType, other.intervalType)
                && java.util.Objects.equals(this.intervalValue, other.intervalValue)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(this.packageNames, other.packageNames)
                && java.util.Objects.equals(this.updateNames, other.updateNames)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.intervalType == null ? 43 : this.intervalType.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalValue == null ? 43 : this.intervalValue.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + (this.packageNames == null ? 43 : this.packageNames.hashCode());
        result = (result * PRIME) + (this.updateNames == null ? 43 : this.updateNames.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
