/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Input details to execute operation.
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
    builder = CreateExecuteOperationJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateExecuteOperationJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("inputRecords")
        private java.util.List<OperationInputRecord> inputRecords;

        public Builder inputRecords(java.util.List<OperationInputRecord> inputRecords) {
            this.inputRecords = inputRecords;
            this.__explicitlySet__.add("inputRecords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExecuteOperationJobDetails build() {
            CreateExecuteOperationJobDetails __instance__ =
                    new CreateExecuteOperationJobDetails(
                            operation, callOperationConfig, inputRecords);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExecuteOperationJobDetails o) {
            Builder copiedBuilder =
                    operation(o.getOperation())
                            .callOperationConfig(o.getCallOperationConfig())
                            .inputRecords(o.getInputRecords());

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

    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    Operation operation;

    @com.fasterxml.jackson.annotation.JsonProperty("callOperationConfig")
    CallOperationConfig callOperationConfig;

    /**
     * Collection of input parameters supplied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputRecords")
    java.util.List<OperationInputRecord> inputRecords;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
