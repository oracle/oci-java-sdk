/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateScheduledJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateScheduledJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private ScheduleTypes scheduleType;

        public Builder scheduleType(ScheduleTypes scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        public Builder timeNextExecution(java.util.Date timeNextExecution) {
            this.timeNextExecution = timeNextExecution;
            this.__explicitlySet__.add("timeNextExecution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intervalType")
        private IntervalTypes intervalType;

        public Builder intervalType(IntervalTypes intervalType) {
            this.intervalType = intervalType;
            this.__explicitlySet__.add("intervalType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intervalValue")
        private String intervalValue;

        public Builder intervalValue(String intervalValue) {
            this.intervalValue = intervalValue;
            this.__explicitlySet__.add("intervalValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationTypes operationType;

        public Builder operationType(OperationTypes operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private PackageUpdateTypes updateType;

        public Builder updateType(PackageUpdateTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
        private java.util.List<PackageName> packageNames;

        public Builder packageNames(java.util.List<PackageName> packageNames) {
            this.packageNames = packageNames;
            this.__explicitlySet__.add("packageNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateNames")
        private java.util.List<String> updateNames;

        public Builder updateNames(java.util.List<String> updateNames) {
            this.updateNames = updateNames;
            this.__explicitlySet__.add("updateNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateScheduledJobDetails build() {
            UpdateScheduledJobDetails __instance__ =
                    new UpdateScheduledJobDetails(
                            displayName,
                            description,
                            scheduleType,
                            timeNextExecution,
                            intervalType,
                            intervalValue,
                            operationType,
                            updateType,
                            packageNames,
                            updateNames,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateScheduledJobDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .scheduleType(o.getScheduleType())
                            .timeNextExecution(o.getTimeNextExecution())
                            .intervalType(o.getIntervalType())
                            .intervalValue(o.getIntervalValue())
                            .operationType(o.getOperationType())
                            .updateType(o.getUpdateType())
                            .packageNames(o.getPackageNames())
                            .updateNames(o.getUpdateNames())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Scheduled Job name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Details describing the Scheduled Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * the type of scheduling this Scheduled Job follows
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    ScheduleTypes scheduleType;

    /**
     * the desired time for the next execution of this Scheduled Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    java.util.Date timeNextExecution;

    /**
     * the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalType")
    IntervalTypes intervalType;

    /**
     * the value for the interval period for a recurring Scheduled Job (only if schedule type is RECURRING)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalValue")
    String intervalValue;

    /**
     * the type of operation this Scheduled Job performs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    OperationTypes operationType;

    /**
     * Type of the update (only if operation type is UPDATEALL)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    PackageUpdateTypes updateType;

    /**
     * the id of the package (only if operation type is INSTALL/UPDATE/REMOVE)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
    java.util.List<PackageName> packageNames;

    /**
     * The unique names of the Windows Updates (only if operation type is INSTALL).
     * This is only applicable when the osFamily is for Windows managed instances.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateNames")
    java.util.List<String> updateNames;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
