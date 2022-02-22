/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Operation execution result for a single input set.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OperationExecResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OperationExecResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("executionStatus")
        private ExecutionStatus executionStatus;

        public Builder executionStatus(ExecutionStatus executionStatus) {
            this.executionStatus = executionStatus;
            this.__explicitlySet__.add("executionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private Object metrics;

        public Builder metrics(Object metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputValues")
        private java.util.List<java.util.List<Object>> outputValues;

        public Builder outputValues(java.util.List<java.util.List<Object>> outputValues) {
            this.outputValues = outputValues;
            this.__explicitlySet__.add("outputValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isWhitelistedErrorMessage")
        private Boolean isWhitelistedErrorMessage;

        public Builder isWhitelistedErrorMessage(Boolean isWhitelistedErrorMessage) {
            this.isWhitelistedErrorMessage = isWhitelistedErrorMessage;
            this.__explicitlySet__.add("isWhitelistedErrorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationExecResult build() {
            OperationExecResult __instance__ =
                    new OperationExecResult(
                            executionStatus,
                            errorMessage,
                            metrics,
                            outputValues,
                            isWhitelistedErrorMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationExecResult o) {
            Builder copiedBuilder =
                    executionStatus(o.getExecutionStatus())
                            .errorMessage(o.getErrorMessage())
                            .metrics(o.getMetrics())
                            .outputValues(o.getOutputValues())
                            .isWhitelistedErrorMessage(o.getIsWhitelistedErrorMessage());

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
     * Status of the operation job for particular set of input.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ExecutionStatus {
        Failed("FAILED"),
        Success("SUCCESS"),
        Queued("QUEUED"),
        Running("RUNNING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ExecutionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ExecutionStatus v : ExecutionStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExecutionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExecutionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExecutionStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the operation job for particular set of input.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionStatus")
    ExecutionStatus executionStatus;

    /**
     * Error message if execution of operation is failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

    /**
     * Metrics of operation execution job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    Object metrics;

    /**
     * List of emitted rows for each OUT/INOUT param.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputValues")
    java.util.List<java.util.List<Object>> outputValues;

    /**
     * True, if error message should be displayed on UI.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isWhitelistedErrorMessage")
    Boolean isWhitelistedErrorMessage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
