/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduledJobSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduledJobSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "scheduleType",
        "timeNextExecution",
        "timeLastExecution",
        "managedInstances",
        "managedInstanceGroups",
        "operationType",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "osFamily",
        "isRestricted"
    })
    public ScheduledJobSummary(
            String id,
            String displayName,
            String compartmentId,
            ScheduleTypes scheduleType,
            java.util.Date timeNextExecution,
            java.util.Date timeLastExecution,
            java.util.List<Id> managedInstances,
            java.util.List<Id> managedInstanceGroups,
            OperationTypes operationType,
            LifecycleStates lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            OsFamilies osFamily,
            Boolean isRestricted) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.scheduleType = scheduleType;
        this.timeNextExecution = timeNextExecution;
        this.timeLastExecution = timeLastExecution;
        this.managedInstances = managedInstances;
        this.managedInstanceGroups = managedInstanceGroups;
        this.operationType = operationType;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.osFamily = osFamily;
        this.isRestricted = isRestricted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID for the Scheduled Job
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for the Scheduled Job
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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
         * the time/date of the next scheduled execution of this Scheduled Job
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
        private java.util.Date timeNextExecution;

        /**
         * the time/date of the next scheduled execution of this Scheduled Job
         * @param timeNextExecution the value to set
         * @return this builder
         **/
        public Builder timeNextExecution(java.util.Date timeNextExecution) {
            this.timeNextExecution = timeNextExecution;
            this.__explicitlySet__.add("timeNextExecution");
            return this;
        }
        /**
         * the time/date of the last execution of this Scheduled Job
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecution")
        private java.util.Date timeLastExecution;

        /**
         * the time/date of the last execution of this Scheduled Job
         * @param timeLastExecution the value to set
         * @return this builder
         **/
        public Builder timeLastExecution(java.util.Date timeLastExecution) {
            this.timeLastExecution = timeLastExecution;
            this.__explicitlySet__.add("timeLastExecution");
            return this;
        }
        /**
         * the list of managed instances this scheduled job operates on (mutually exclusive with managedInstanceGroups)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstances")
        private java.util.List<Id> managedInstances;

        /**
         * the list of managed instances this scheduled job operates on (mutually exclusive with managedInstanceGroups)
         * @param managedInstances the value to set
         * @return this builder
         **/
        public Builder managedInstances(java.util.List<Id> managedInstances) {
            this.managedInstances = managedInstances;
            this.__explicitlySet__.add("managedInstances");
            return this;
        }
        /**
         * the list of managed instance groups this scheduled job operates on (mutually exclusive with managedInstances)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
        private java.util.List<Id> managedInstanceGroups;

        /**
         * the list of managed instance groups this scheduled job operates on (mutually exclusive with managedInstances)
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
         * The current state of the Scheduled Job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of the Scheduled Job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
         * The Operating System type of the managed instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        /**
         * The Operating System type of the managed instance.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * true, if the schedule job has its update capabilities restricted. (Used to track Autonomous Scheduled Job)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRestricted")
        private Boolean isRestricted;

        /**
         * true, if the schedule job has its update capabilities restricted. (Used to track Autonomous Scheduled Job)
         * @param isRestricted the value to set
         * @return this builder
         **/
        public Builder isRestricted(Boolean isRestricted) {
            this.isRestricted = isRestricted;
            this.__explicitlySet__.add("isRestricted");
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
                            this.timeNextExecution,
                            this.timeLastExecution,
                            this.managedInstances,
                            this.managedInstanceGroups,
                            this.operationType,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.osFamily,
                            this.isRestricted);
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
            if (model.wasPropertyExplicitlySet("timeNextExecution")) {
                this.timeNextExecution(model.getTimeNextExecution());
            }
            if (model.wasPropertyExplicitlySet("timeLastExecution")) {
                this.timeLastExecution(model.getTimeLastExecution());
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("isRestricted")) {
                this.isRestricted(model.getIsRestricted());
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
     * OCID for the Scheduled Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for the Scheduled Job
     * @return the value
     **/
    public String getId() {
        return id;
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
     * the time/date of the next scheduled execution of this Scheduled Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextExecution")
    private final java.util.Date timeNextExecution;

    /**
     * the time/date of the next scheduled execution of this Scheduled Job
     * @return the value
     **/
    public java.util.Date getTimeNextExecution() {
        return timeNextExecution;
    }

    /**
     * the time/date of the last execution of this Scheduled Job
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecution")
    private final java.util.Date timeLastExecution;

    /**
     * the time/date of the last execution of this Scheduled Job
     * @return the value
     **/
    public java.util.Date getTimeLastExecution() {
        return timeLastExecution;
    }

    /**
     * the list of managed instances this scheduled job operates on (mutually exclusive with managedInstanceGroups)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstances")
    private final java.util.List<Id> managedInstances;

    /**
     * the list of managed instances this scheduled job operates on (mutually exclusive with managedInstanceGroups)
     * @return the value
     **/
    public java.util.List<Id> getManagedInstances() {
        return managedInstances;
    }

    /**
     * the list of managed instance groups this scheduled job operates on (mutually exclusive with managedInstances)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
    private final java.util.List<Id> managedInstanceGroups;

    /**
     * the list of managed instance groups this scheduled job operates on (mutually exclusive with managedInstances)
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
     * The current state of the Scheduled Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of the Scheduled Job.
     * @return the value
     **/
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
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
     * The Operating System type of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamilies osFamily;

    /**
     * The Operating System type of the managed instance.
     * @return the value
     **/
    public OsFamilies getOsFamily() {
        return osFamily;
    }

    /**
     * true, if the schedule job has its update capabilities restricted. (Used to track Autonomous Scheduled Job)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRestricted")
    private final Boolean isRestricted;

    /**
     * true, if the schedule job has its update capabilities restricted. (Used to track Autonomous Scheduled Job)
     * @return the value
     **/
    public Boolean getIsRestricted() {
        return isRestricted;
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
        sb.append("ScheduledJobSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", timeNextExecution=").append(String.valueOf(this.timeNextExecution));
        sb.append(", timeLastExecution=").append(String.valueOf(this.timeLastExecution));
        sb.append(", managedInstances=").append(String.valueOf(this.managedInstances));
        sb.append(", managedInstanceGroups=").append(String.valueOf(this.managedInstanceGroups));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", isRestricted=").append(String.valueOf(this.isRestricted));
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
                && java.util.Objects.equals(this.timeNextExecution, other.timeNextExecution)
                && java.util.Objects.equals(this.timeLastExecution, other.timeLastExecution)
                && java.util.Objects.equals(this.managedInstances, other.managedInstances)
                && java.util.Objects.equals(this.managedInstanceGroups, other.managedInstanceGroups)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
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
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNextExecution == null ? 43 : this.timeNextExecution.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastExecution == null ? 43 : this.timeLastExecution.hashCode());
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
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.isRestricted == null ? 43 : this.isRestricted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
