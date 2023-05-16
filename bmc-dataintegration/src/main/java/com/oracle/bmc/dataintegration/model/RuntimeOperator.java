/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Runtime operator model which holds the runtime metadata of the task operator executed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuntimeOperator.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RuntimeOperator
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "taskRunKey",
        "startTimeInMillis",
        "endTimeInMillis",
        "status",
        "executionState",
        "parameters",
        "inputs",
        "outputs",
        "metrics"
    })
    public RuntimeOperator(
            String taskRunKey,
            Long startTimeInMillis,
            Long endTimeInMillis,
            Status status,
            ExecutionState executionState,
            java.util.List<Parameter> parameters,
            java.util.Map<String, ParameterValue> inputs,
            java.util.Map<String, ParameterValue> outputs,
            java.util.Map<String, Float> metrics) {
        super();
        this.taskRunKey = taskRunKey;
        this.startTimeInMillis = startTimeInMillis;
        this.endTimeInMillis = endTimeInMillis;
        this.status = status;
        this.executionState = executionState;
        this.parameters = parameters;
        this.inputs = inputs;
        this.outputs = outputs;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The TaskRun key. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskRunKey")
        private String taskRunKey;

        /**
         * The TaskRun key.
         *
         * @param taskRunKey the value to set
         * @return this builder
         */
        public Builder taskRunKey(String taskRunKey) {
            this.taskRunKey = taskRunKey;
            this.__explicitlySet__.add("taskRunKey");
            return this;
        }
        /** The runtime operator start time. */
        @com.fasterxml.jackson.annotation.JsonProperty("startTimeInMillis")
        private Long startTimeInMillis;

        /**
         * The runtime operator start time.
         *
         * @param startTimeInMillis the value to set
         * @return this builder
         */
        public Builder startTimeInMillis(Long startTimeInMillis) {
            this.startTimeInMillis = startTimeInMillis;
            this.__explicitlySet__.add("startTimeInMillis");
            return this;
        }
        /** The runtime operator end time. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimeInMillis")
        private Long endTimeInMillis;

        /**
         * The runtime operator end time.
         *
         * @param endTimeInMillis the value to set
         * @return this builder
         */
        public Builder endTimeInMillis(Long endTimeInMillis) {
            this.endTimeInMillis = endTimeInMillis;
            this.__explicitlySet__.add("endTimeInMillis");
            return this;
        }
        /** status */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * status
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** status */
        @com.fasterxml.jackson.annotation.JsonProperty("executionState")
        private ExecutionState executionState;

        /**
         * status
         *
         * @param executionState the value to set
         * @return this builder
         */
        public Builder executionState(ExecutionState executionState) {
            this.executionState = executionState;
            this.__explicitlySet__.add("executionState");
            return this;
        }
        /**
         * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be
         * configured when the pipeline is executed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        /**
         * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be
         * configured when the pipeline is executed.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /** The configuration provider bindings. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private java.util.Map<String, ParameterValue> inputs;

        /**
         * The configuration provider bindings.
         *
         * @param inputs the value to set
         * @return this builder
         */
        public Builder inputs(java.util.Map<String, ParameterValue> inputs) {
            this.inputs = inputs;
            this.__explicitlySet__.add("inputs");
            return this;
        }
        /** The configuration provider bindings. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private java.util.Map<String, ParameterValue> outputs;

        /**
         * The configuration provider bindings.
         *
         * @param outputs the value to set
         * @return this builder
         */
        public Builder outputs(java.util.Map<String, ParameterValue> outputs) {
            this.outputs = outputs;
            this.__explicitlySet__.add("outputs");
            return this;
        }
        /** A map metrics for the task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.Map<String, Float> metrics;

        /**
         * A map metrics for the task run.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.Map<String, Float> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuntimeOperator build() {
            RuntimeOperator model =
                    new RuntimeOperator(
                            this.taskRunKey,
                            this.startTimeInMillis,
                            this.endTimeInMillis,
                            this.status,
                            this.executionState,
                            this.parameters,
                            this.inputs,
                            this.outputs,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuntimeOperator model) {
            if (model.wasPropertyExplicitlySet("taskRunKey")) {
                this.taskRunKey(model.getTaskRunKey());
            }
            if (model.wasPropertyExplicitlySet("startTimeInMillis")) {
                this.startTimeInMillis(model.getStartTimeInMillis());
            }
            if (model.wasPropertyExplicitlySet("endTimeInMillis")) {
                this.endTimeInMillis(model.getEndTimeInMillis());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("executionState")) {
                this.executionState(model.getExecutionState());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("inputs")) {
                this.inputs(model.getInputs());
            }
            if (model.wasPropertyExplicitlySet("outputs")) {
                this.outputs(model.getOutputs());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
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

    /** The TaskRun key. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskRunKey")
    private final String taskRunKey;

    /**
     * The TaskRun key.
     *
     * @return the value
     */
    public String getTaskRunKey() {
        return taskRunKey;
    }

    /** The runtime operator start time. */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeInMillis")
    private final Long startTimeInMillis;

    /**
     * The runtime operator start time.
     *
     * @return the value
     */
    public Long getStartTimeInMillis() {
        return startTimeInMillis;
    }

    /** The runtime operator end time. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeInMillis")
    private final Long endTimeInMillis;

    /**
     * The runtime operator end time.
     *
     * @return the value
     */
    public Long getEndTimeInMillis() {
        return endTimeInMillis;
    }

    /** status */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        NotStarted("NOT_STARTED"),
        Queued("QUEUED"),
        Running("RUNNING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Success("SUCCESS"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** status */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * status
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** status */
    public enum ExecutionState implements com.oracle.bmc.http.internal.BmcEnum {
        NotStarted("NOT_STARTED"),
        Running("RUNNING"),
        Terminated("TERMINATED"),
        Success("SUCCESS"),
        Error("ERROR"),
        Skipped("SKIPPED"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExecutionState.class);

        private final String value;
        private static java.util.Map<String, ExecutionState> map;

        static {
            map = new java.util.HashMap<>();
            for (ExecutionState v : ExecutionState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExecutionState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExecutionState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExecutionState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** status */
    @com.fasterxml.jackson.annotation.JsonProperty("executionState")
    private final ExecutionState executionState;

    /**
     * status
     *
     * @return the value
     */
    public ExecutionState getExecutionState() {
        return executionState;
    }

    /**
     * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be
     * configured when the pipeline is executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

    /**
     * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be
     * configured when the pipeline is executed.
     *
     * @return the value
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /** The configuration provider bindings. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final java.util.Map<String, ParameterValue> inputs;

    /**
     * The configuration provider bindings.
     *
     * @return the value
     */
    public java.util.Map<String, ParameterValue> getInputs() {
        return inputs;
    }

    /** The configuration provider bindings. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final java.util.Map<String, ParameterValue> outputs;

    /**
     * The configuration provider bindings.
     *
     * @return the value
     */
    public java.util.Map<String, ParameterValue> getOutputs() {
        return outputs;
    }

    /** A map metrics for the task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.Map<String, Float> metrics;

    /**
     * A map metrics for the task run.
     *
     * @return the value
     */
    public java.util.Map<String, Float> getMetrics() {
        return metrics;
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
        sb.append("RuntimeOperator(");
        sb.append("super=").append(super.toString());
        sb.append("taskRunKey=").append(String.valueOf(this.taskRunKey));
        sb.append(", startTimeInMillis=").append(String.valueOf(this.startTimeInMillis));
        sb.append(", endTimeInMillis=").append(String.valueOf(this.endTimeInMillis));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", executionState=").append(String.valueOf(this.executionState));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", inputs=").append(String.valueOf(this.inputs));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuntimeOperator)) {
            return false;
        }

        RuntimeOperator other = (RuntimeOperator) o;
        return java.util.Objects.equals(this.taskRunKey, other.taskRunKey)
                && java.util.Objects.equals(this.startTimeInMillis, other.startTimeInMillis)
                && java.util.Objects.equals(this.endTimeInMillis, other.endTimeInMillis)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.executionState, other.executionState)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.inputs, other.inputs)
                && java.util.Objects.equals(this.outputs, other.outputs)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskRunKey == null ? 43 : this.taskRunKey.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeInMillis == null ? 43 : this.startTimeInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.endTimeInMillis == null ? 43 : this.endTimeInMillis.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.executionState == null ? 43 : this.executionState.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
