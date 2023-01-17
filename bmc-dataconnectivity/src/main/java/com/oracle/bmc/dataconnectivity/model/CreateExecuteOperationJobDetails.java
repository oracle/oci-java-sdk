/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Input details to execute an operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateExecuteOperationJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateExecuteOperationJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operation", "callOperationConfig", "inputRecords"})
    public CreateExecuteOperationJobDetails(
            Operation operation,
            CallOperationConfig callOperationConfig,
            java.util.List<OperationInputRecord> inputRecords) {
        super();
        this.operation = operation;
        this.callOperationConfig = callOperationConfig;
        this.inputRecords = inputRecords;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

        public Builder operation(Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("callOperationConfig")
        private CallOperationConfig callOperationConfig;

        public Builder callOperationConfig(CallOperationConfig callOperationConfig) {
            this.callOperationConfig = callOperationConfig;
            this.__explicitlySet__.add("callOperationConfig");
            return this;
        }
        /** Collection of the input parameters supplied. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputRecords")
        private java.util.List<OperationInputRecord> inputRecords;

        /**
         * Collection of the input parameters supplied.
         *
         * @param inputRecords the value to set
         * @return this builder
         */
        public Builder inputRecords(java.util.List<OperationInputRecord> inputRecords) {
            this.inputRecords = inputRecords;
            this.__explicitlySet__.add("inputRecords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExecuteOperationJobDetails build() {
            CreateExecuteOperationJobDetails model =
                    new CreateExecuteOperationJobDetails(
                            this.operation, this.callOperationConfig, this.inputRecords);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExecuteOperationJobDetails model) {
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
            }
            if (model.wasPropertyExplicitlySet("callOperationConfig")) {
                this.callOperationConfig(model.getCallOperationConfig());
            }
            if (model.wasPropertyExplicitlySet("inputRecords")) {
                this.inputRecords(model.getInputRecords());
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

    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Operation operation;

    public Operation getOperation() {
        return operation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("callOperationConfig")
    private final CallOperationConfig callOperationConfig;

    public CallOperationConfig getCallOperationConfig() {
        return callOperationConfig;
    }

    /** Collection of the input parameters supplied. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputRecords")
    private final java.util.List<OperationInputRecord> inputRecords;

    /**
     * Collection of the input parameters supplied.
     *
     * @return the value
     */
    public java.util.List<OperationInputRecord> getInputRecords() {
        return inputRecords;
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
        sb.append("CreateExecuteOperationJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("operation=").append(String.valueOf(this.operation));
        sb.append(", callOperationConfig=").append(String.valueOf(this.callOperationConfig));
        sb.append(", inputRecords=").append(String.valueOf(this.inputRecords));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExecuteOperationJobDetails)) {
            return false;
        }

        CreateExecuteOperationJobDetails other = (CreateExecuteOperationJobDetails) o;
        return java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.callOperationConfig, other.callOperationConfig)
                && java.util.Objects.equals(this.inputRecords, other.inputRecords)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result =
                (result * PRIME)
                        + (this.callOperationConfig == null
                                ? 43
                                : this.callOperationConfig.hashCode());
        result = (result * PRIME) + (this.inputRecords == null ? 43 : this.inputRecords.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
