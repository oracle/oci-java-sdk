/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Response of executeOperationJob.
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
    builder = ExecuteOperationJob.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExecuteOperationJob {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private String operationStatus;

        public Builder operationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationName")
        private String operationName;

        public Builder operationName(String operationName) {
            this.operationName = operationName;
            this.__explicitlySet__.add("operationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outParams")
        private java.util.List<String> outParams;

        public Builder outParams(java.util.List<String> outParams) {
            this.outParams = outParams;
            this.__explicitlySet__.add("outParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationResult")
        private java.util.List<OperationExecResult> operationResult;

        public Builder operationResult(java.util.List<OperationExecResult> operationResult) {
            this.operationResult = operationResult;
            this.__explicitlySet__.add("operationResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteOperationJob build() {
            ExecuteOperationJob __instance__ =
                    new ExecuteOperationJob(
                            operationStatus,
                            errorMessage,
                            operationName,
                            outParams,
                            operationResult);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteOperationJob o) {
            Builder copiedBuilder =
                    operationStatus(o.getOperationStatus())
                            .errorMessage(o.getErrorMessage())
                            .operationName(o.getOperationName())
                            .outParams(o.getOutParams())
                            .operationResult(o.getOperationResult());

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
     * Status of the operation job for all sets of input.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    String operationStatus;

    /**
     * Error message, if whole operation is failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

    /**
     * Name of the operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationName")
    String operationName;

    /**
     * List of names of OUT/INOUT params.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outParams")
    java.util.List<String> outParams;

    /**
     * List of operation execution result for each input set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationResult")
    java.util.List<OperationExecResult> operationResult;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
