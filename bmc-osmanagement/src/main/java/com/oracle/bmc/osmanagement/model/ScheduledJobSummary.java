/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Basic information about a Scheduled Job
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
    builder = ScheduledJobSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ScheduledJobSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecution")
        private java.util.Date timeLastExecution;

        public Builder timeLastExecution(java.util.Date timeLastExecution) {
            this.timeLastExecution = timeLastExecution;
            this.__explicitlySet__.add("timeLastExecution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstances")
        private java.util.List<Id> managedInstances;

        public Builder managedInstances(java.util.List<Id> managedInstances) {
            this.managedInstances = managedInstances;
            this.__explicitlySet__.add("managedInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
        private java.util.List<Id> managedInstanceGroups;

        public Builder managedInstanceGroups(java.util.List<Id> managedInstanceGroups) {
            this.managedInstanceGroups = managedInstanceGroups;
            this.__explicitlySet__.add("managedInstanceGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationTypes operationType;

        public Builder operationType(OperationTypes operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledJobSummary build() {
            ScheduledJobSummary __instance__ =
                    new ScheduledJobSummary(
                            id,
                            displayName,
                            compartmentId,
                            scheduleType,
                            timeNextExecution,
                            timeLastExecution,
                            managedInstances,
                            managedInstanceGroups,
                            operationType,
                            lifecycleState,
                            freeformTags,
                            definedTags,
                            osFamily);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledJobSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .scheduleType(o.getScheduleType())
                            .timeNextExecution(o.getTimeNextExecution())
                            .timeLastExecution(o.getTimeLastExecution())
                            .managedInstances(o.getManagedInstances())
                            .managedInstanceGroups(o.getManagedInstanceGroups())
                            .operationType(o.getOperationType())
                            .lifecycleState(o.getLifecycleState())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .osFamily(o.getOsFamily());

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
     * OCID for the Scheduled Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Scheduled Job name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * OCID for the Compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * the type of scheduling this Scheduled Job follows
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    ScheduleTypes scheduleType;

    /**
     * the time/date of the next scheduled execution of this Scheduled Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    java.util.Date timeNextExecution;

    /**
     * the time/date of the last execution of this Scheduled Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecution")
    java.util.Date timeLastExecution;

    /**
     * the list of managed instances this scheduled job operates on (mutually exclusive with managedInstanceGroups)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstances")
    java.util.List<Id> managedInstances;

    /**
     * the list of managed instance groups this scheduled job operates on (mutually exclusive with managedInstances)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
    java.util.List<Id> managedInstanceGroups;

    /**
     * the type of operation this Scheduled Job performs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    OperationTypes operationType;

    /**
     * The current state of the Scheduled Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

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

    /**
     * The Operating System type of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    OsFamilies osFamily;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
