/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details for creating a scheduled task. The client must fully specify the details. Not supported
 * for TaskType ACCELERATION. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateStandardTaskDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateStandardTaskDetails extends CreateScheduledTaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /** Task type. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        /**
         * Task type.
         *
         * @param taskType the value to set
         * @return this builder
         */
        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }
        /**
         * Schedules, typically a single schedule. Note there may only be a single schedule for
         * SAVED_SEARCH and PURGE scheduled tasks.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedules")
        private java.util.List<Schedule> schedules;

        /**
         * Schedules, typically a single schedule. Note there may only be a single schedule for
         * SAVED_SEARCH and PURGE scheduled tasks.
         *
         * @param schedules the value to set
         * @return this builder
         */
        public Builder schedules(java.util.List<Schedule> schedules) {
            this.schedules = schedules;
            this.__explicitlySet__.add("schedules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateStandardTaskDetails build() {
            CreateStandardTaskDetails model =
                    new CreateStandardTaskDetails(
                            this.compartmentId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.taskType,
                            this.schedules,
                            this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateStandardTaskDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("taskType")) {
                this.taskType(model.getTaskType());
            }
            if (model.wasPropertyExplicitlySet("schedules")) {
                this.schedules(model.getSchedules());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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

    @Deprecated
    public CreateStandardTaskDetails(
            String compartmentId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            TaskType taskType,
            java.util.List<Schedule> schedules,
            Action action) {
        super(compartmentId, displayName, freeformTags, definedTags);
        this.taskType = taskType;
        this.schedules = schedules;
        this.action = action;
    }

    /** Task type. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final TaskType taskType;

    /**
     * Task type.
     *
     * @return the value
     */
    public TaskType getTaskType() {
        return taskType;
    }

    /**
     * Schedules, typically a single schedule. Note there may only be a single schedule for
     * SAVED_SEARCH and PURGE scheduled tasks.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedules")
    private final java.util.List<Schedule> schedules;

    /**
     * Schedules, typically a single schedule. Note there may only be a single schedule for
     * SAVED_SEARCH and PURGE scheduled tasks.
     *
     * @return the value
     */
    public java.util.List<Schedule> getSchedules() {
        return schedules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    public Action getAction() {
        return action;
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
        sb.append("CreateStandardTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", schedules=").append(String.valueOf(this.schedules));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateStandardTaskDetails)) {
            return false;
        }

        CreateStandardTaskDetails other = (CreateStandardTaskDetails) o;
        return java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.schedules, other.schedules)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result = (result * PRIME) + (this.schedules == null ? 43 : this.schedules.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        return result;
    }
}
