/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The details of the task <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Task.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Task extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stepName",
        "associationType",
        "taskRecordDetails",
        "stepProperties",
        "outputVariableMappings"
    })
    public Task(
            String stepName,
            AssociationType associationType,
            AssociatedTaskDetails taskRecordDetails,
            ComponentProperties stepProperties,
            java.util.List<OutputVariableMapping> outputVariableMappings) {
        super();
        this.stepName = stepName;
        this.associationType = associationType;
        this.taskRecordDetails = taskRecordDetails;
        this.stepProperties = stepProperties;
        this.outputVariableMappings = outputVariableMappings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the task step. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * The name of the task step.
         *
         * @param stepName the value to set
         * @return this builder
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /** The association type of the task */
        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private AssociationType associationType;

        /**
         * The association type of the task
         *
         * @param associationType the value to set
         * @return this builder
         */
        public Builder associationType(AssociationType associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskRecordDetails")
        private AssociatedTaskDetails taskRecordDetails;

        public Builder taskRecordDetails(AssociatedTaskDetails taskRecordDetails) {
            this.taskRecordDetails = taskRecordDetails;
            this.__explicitlySet__.add("taskRecordDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepProperties")
        private ComponentProperties stepProperties;

        public Builder stepProperties(ComponentProperties stepProperties) {
            this.stepProperties = stepProperties;
            this.__explicitlySet__.add("stepProperties");
            return this;
        }
        /**
         * Mapping output variables of previous tasks to the input variables of the current task.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("outputVariableMappings")
        private java.util.List<OutputVariableMapping> outputVariableMappings;

        /**
         * Mapping output variables of previous tasks to the input variables of the current task.
         *
         * @param outputVariableMappings the value to set
         * @return this builder
         */
        public Builder outputVariableMappings(
                java.util.List<OutputVariableMapping> outputVariableMappings) {
            this.outputVariableMappings = outputVariableMappings;
            this.__explicitlySet__.add("outputVariableMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Task build() {
            Task model =
                    new Task(
                            this.stepName,
                            this.associationType,
                            this.taskRecordDetails,
                            this.stepProperties,
                            this.outputVariableMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Task model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("associationType")) {
                this.associationType(model.getAssociationType());
            }
            if (model.wasPropertyExplicitlySet("taskRecordDetails")) {
                this.taskRecordDetails(model.getTaskRecordDetails());
            }
            if (model.wasPropertyExplicitlySet("stepProperties")) {
                this.stepProperties(model.getStepProperties());
            }
            if (model.wasPropertyExplicitlySet("outputVariableMappings")) {
                this.outputVariableMappings(model.getOutputVariableMappings());
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

    /** The name of the task step. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * The name of the task step.
     *
     * @return the value
     */
    public String getStepName() {
        return stepName;
    }

    /** The association type of the task */
    public enum AssociationType implements com.oracle.bmc.http.internal.BmcEnum {
        Task("TASK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssociationType.class);

        private final String value;
        private static java.util.Map<String, AssociationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AssociationType v : AssociationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssociationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssociationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssociationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The association type of the task */
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final AssociationType associationType;

    /**
     * The association type of the task
     *
     * @return the value
     */
    public AssociationType getAssociationType() {
        return associationType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("taskRecordDetails")
    private final AssociatedTaskDetails taskRecordDetails;

    public AssociatedTaskDetails getTaskRecordDetails() {
        return taskRecordDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stepProperties")
    private final ComponentProperties stepProperties;

    public ComponentProperties getStepProperties() {
        return stepProperties;
    }

    /** Mapping output variables of previous tasks to the input variables of the current task. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputVariableMappings")
    private final java.util.List<OutputVariableMapping> outputVariableMappings;

    /**
     * Mapping output variables of previous tasks to the input variables of the current task.
     *
     * @return the value
     */
    public java.util.List<OutputVariableMapping> getOutputVariableMappings() {
        return outputVariableMappings;
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
        sb.append("Task(");
        sb.append("super=").append(super.toString());
        sb.append("stepName=").append(String.valueOf(this.stepName));
        sb.append(", associationType=").append(String.valueOf(this.associationType));
        sb.append(", taskRecordDetails=").append(String.valueOf(this.taskRecordDetails));
        sb.append(", stepProperties=").append(String.valueOf(this.stepProperties));
        sb.append(", outputVariableMappings=").append(String.valueOf(this.outputVariableMappings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }

        Task other = (Task) o;
        return java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.associationType, other.associationType)
                && java.util.Objects.equals(this.taskRecordDetails, other.taskRecordDetails)
                && java.util.Objects.equals(this.stepProperties, other.stepProperties)
                && java.util.Objects.equals(
                        this.outputVariableMappings, other.outputVariableMappings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result =
                (result * PRIME)
                        + (this.associationType == null ? 43 : this.associationType.hashCode());
        result =
                (result * PRIME)
                        + (this.taskRecordDetails == null ? 43 : this.taskRecordDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.stepProperties == null ? 43 : this.stepProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.outputVariableMappings == null
                                ? 43
                                : this.outputVariableMappings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
