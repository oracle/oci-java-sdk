/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information for creating a Scheduled Job
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
        "intervalType",
        "intervalValue",
        "managedInstances",
        "managedInstanceGroups",
        "operationType",
        "updateType",
        "packageNames",
        "freeformTags",
        "definedTags",
        "updateNames",
        "osFamily"
    })
    public CreateScheduledJobDetails(
            String compartmentId,
            String displayName,
            String description,
            ScheduleTypes scheduleType,
            java.util.Date timeNextExecution,
            IntervalTypes intervalType,
            String intervalValue,
            java.util.List<Id> managedInstances,
            java.util.List<Id> managedInstanceGroups,
            OperationTypes operationType,
            PackageUpdateTypes updateType,
            java.util.List<PackageName> packageNames,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> updateNames,
            OsFamilies osFamily) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.scheduleType = scheduleType;
        this.timeNextExecution = timeNextExecution;
        this.intervalType = intervalType;
        this.intervalValue = intervalValue;
        this.managedInstances = managedInstances;
        this.managedInstanceGroups = managedInstanceGroups;
        this.operationType = operationType;
        this.updateType = updateType;
        this.packageNames = packageNames;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.updateNames = updateNames;
        this.osFamily = osFamily;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID for the Compartment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID for the Compartment
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
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
         * The list of managed instances this scheduled job operates on
         * (mutually exclusive with managedInstanceGroups). Either this or the
         * managedInstanceGroups must be supplied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstances")
        private java.util.List<Id> managedInstances;

        /**
         * The list of managed instances this scheduled job operates on
         * (mutually exclusive with managedInstanceGroups). Either this or the
         * managedInstanceGroups must be supplied.
         *
         * @param managedInstances the value to set
         * @return this builder
         **/
        public Builder managedInstances(java.util.List<Id> managedInstances) {
            this.managedInstances = managedInstances;
            this.__explicitlySet__.add("managedInstances");
            return this;
        }
        /**
         * The list of managed instance groups this scheduled job operates on
         * (mutually exclusive with managedInstances). Either this or
         * managedInstances must be supplied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
        private java.util.List<Id> managedInstanceGroups;

        /**
         * The list of managed instance groups this scheduled job operates on
         * (mutually exclusive with managedInstances). Either this or
         * managedInstances must be supplied.
         *
         * @param managedInstanceGroups the value to set
         * @return this builder
         **/
        public Builder managedInstanceGroups(java.util.List<Id> managedInstanceGroups) {
            this.managedInstanceGroups = managedInstanceGroups;
            this.__explicitlySet__.add("managedInstanceGroups");
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
         * The Operating System type of the managed instance(s) on which this scheduled job will operate.
         * If not specified, this defaults to Linux.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        /**
         * The Operating System type of the managed instance(s) on which this scheduled job will operate.
         * If not specified, this defaults to Linux.
         *
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
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
                            this.intervalType,
                            this.intervalValue,
                            this.managedInstances,
                            this.managedInstanceGroups,
                            this.operationType,
                            this.updateType,
                            this.packageNames,
                            this.freeformTags,
                            this.definedTags,
                            this.updateNames,
                            this.osFamily);
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
            if (model.wasPropertyExplicitlySet("intervalType")) {
                this.intervalType(model.getIntervalType());
            }
            if (model.wasPropertyExplicitlySet("intervalValue")) {
                this.intervalValue(model.getIntervalValue());
            }
            if (model.wasPropertyExplicitlySet("managedInstances")) {
                this.managedInstances(model.getManagedInstances());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceGroups")) {
                this.managedInstanceGroups(model.getManagedInstanceGroups());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("updateNames")) {
                this.updateNames(model.getUpdateNames());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
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
     * OCID for the Compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID for the Compartment
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
     * The list of managed instances this scheduled job operates on
     * (mutually exclusive with managedInstanceGroups). Either this or the
     * managedInstanceGroups must be supplied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstances")
    private final java.util.List<Id> managedInstances;

    /**
     * The list of managed instances this scheduled job operates on
     * (mutually exclusive with managedInstanceGroups). Either this or the
     * managedInstanceGroups must be supplied.
     *
     * @return the value
     **/
    public java.util.List<Id> getManagedInstances() {
        return managedInstances;
    }

    /**
     * The list of managed instance groups this scheduled job operates on
     * (mutually exclusive with managedInstances). Either this or
     * managedInstances must be supplied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
    private final java.util.List<Id> managedInstanceGroups;

    /**
     * The list of managed instance groups this scheduled job operates on
     * (mutually exclusive with managedInstances). Either this or
     * managedInstances must be supplied.
     *
     * @return the value
     **/
    public java.util.List<Id> getManagedInstanceGroups() {
        return managedInstanceGroups;
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
     * The Operating System type of the managed instance(s) on which this scheduled job will operate.
     * If not specified, this defaults to Linux.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamilies osFamily;

    /**
     * The Operating System type of the managed instance(s) on which this scheduled job will operate.
     * If not specified, this defaults to Linux.
     *
     * @return the value
     **/
    public OsFamilies getOsFamily() {
        return osFamily;
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
        sb.append(", intervalType=").append(String.valueOf(this.intervalType));
        sb.append(", intervalValue=").append(String.valueOf(this.intervalValue));
        sb.append(", managedInstances=").append(String.valueOf(this.managedInstances));
        sb.append(", managedInstanceGroups=").append(String.valueOf(this.managedInstanceGroups));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", packageNames=").append(String.valueOf(this.packageNames));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", updateNames=").append(String.valueOf(this.updateNames));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
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
                && java.util.Objects.equals(this.intervalType, other.intervalType)
                && java.util.Objects.equals(this.intervalValue, other.intervalValue)
                && java.util.Objects.equals(this.managedInstances, other.managedInstances)
                && java.util.Objects.equals(this.managedInstanceGroups, other.managedInstanceGroups)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(this.packageNames, other.packageNames)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.updateNames, other.updateNames)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
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
        result = (result * PRIME) + (this.intervalType == null ? 43 : this.intervalType.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalValue == null ? 43 : this.intervalValue.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstances == null ? 43 : this.managedInstances.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceGroups == null
                                ? 43
                                : this.managedInstanceGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + (this.packageNames == null ? 43 : this.packageNames.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.updateNames == null ? 43 : this.updateNames.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
