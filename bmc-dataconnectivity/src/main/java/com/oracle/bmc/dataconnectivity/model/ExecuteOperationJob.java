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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExecuteOperationJob.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteOperationJob {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationStatus",
        "errorMessage",
        "operationName",
        "outParams",
        "operationResult"
    })
    public ExecuteOperationJob(
            String operationStatus,
            String errorMessage,
            String operationName,
            java.util.List<String> outParams,
            java.util.List<OperationExecResult> operationResult) {
        super();
        this.operationStatus = operationStatus;
        this.errorMessage = errorMessage;
        this.operationName = operationName;
        this.outParams = outParams;
        this.operationResult = operationResult;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Status of the operation job for all sets of input.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private String operationStatus;

        /**
         * Status of the operation job for all sets of input.
         * @param operationStatus the value to set
         * @return this builder
         **/
        public Builder operationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }
        /**
         * Error message, if whole operation is failed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Error message, if whole operation is failed.
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * Name of the operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationName")
        private String operationName;

        /**
         * Name of the operation.
         * @param operationName the value to set
         * @return this builder
         **/
        public Builder operationName(String operationName) {
            this.operationName = operationName;
            this.__explicitlySet__.add("operationName");
            return this;
        }
        /**
         * List of names of OUT/INOUT params.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outParams")
        private java.util.List<String> outParams;

        /**
         * List of names of OUT/INOUT params.
         * @param outParams the value to set
         * @return this builder
         **/
        public Builder outParams(java.util.List<String> outParams) {
            this.outParams = outParams;
            this.__explicitlySet__.add("outParams");
            return this;
        }
        /**
         * List of operation execution result for each input set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationResult")
        private java.util.List<OperationExecResult> operationResult;

        /**
         * List of operation execution result for each input set.
         * @param operationResult the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Status of the operation job for all sets of input.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final String operationStatus;

    /**
     * Status of the operation job for all sets of input.
     * @return the value
     **/
    public String getOperationStatus() {
        return operationStatus;
    }

    /**
     * Error message, if whole operation is failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Error message, if whole operation is failed.
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Name of the operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationName")
    private final String operationName;

    /**
     * Name of the operation.
     * @return the value
     **/
    public String getOperationName() {
        return operationName;
    }

    /**
     * List of names of OUT/INOUT params.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outParams")
    private final java.util.List<String> outParams;

    /**
     * List of names of OUT/INOUT params.
     * @return the value
     **/
    public java.util.List<String> getOutParams() {
        return outParams;
    }

    /**
     * List of operation execution result for each input set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationResult")
    private final java.util.List<OperationExecResult> operationResult;

    /**
     * List of operation execution result for each input set.
     * @return the value
     **/
    public java.util.List<OperationExecResult> getOperationResult() {
        return operationResult;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExecuteOperationJob(");
        sb.append("operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", operationName=").append(String.valueOf(this.operationName));
        sb.append(", outParams=").append(String.valueOf(this.outParams));
        sb.append(", operationResult=").append(String.valueOf(this.operationResult));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteOperationJob)) {
            return false;
        }

        ExecuteOperationJob other = (ExecuteOperationJob) o;
        return java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.operationName, other.operationName)
                && java.util.Objects.equals(this.outParams, other.outParams)
                && java.util.Objects.equals(this.operationResult, other.operationResult)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationStatus == null ? 43 : this.operationStatus.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.operationName == null ? 43 : this.operationName.hashCode());
        result = (result * PRIME) + (this.outParams == null ? 43 : this.outParams.hashCode());
        result =
                (result * PRIME)
                        + (this.operationResult == null ? 43 : this.operationResult.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
