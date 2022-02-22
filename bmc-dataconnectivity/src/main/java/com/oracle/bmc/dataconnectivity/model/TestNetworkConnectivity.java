/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The network validation response.
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
    builder = TestNetworkConnectivity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TestNetworkConnectivity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("networkValidationOutput")
        private String networkValidationOutput;

        public Builder networkValidationOutput(String networkValidationOutput) {
            this.networkValidationOutput = networkValidationOutput;
            this.__explicitlySet__.add("networkValidationOutput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReachable")
        private Boolean isReachable;

        public Builder isReachable(Boolean isReachable) {
            this.isReachable = isReachable;
            this.__explicitlySet__.add("isReachable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exceptionMessage")
        private String exceptionMessage;

        public Builder exceptionMessage(String exceptionMessage) {
            this.exceptionMessage = exceptionMessage;
            this.__explicitlySet__.add("exceptionMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestNetworkConnectivity build() {
            TestNetworkConnectivity __instance__ =
                    new TestNetworkConnectivity(
                            networkValidationOutput, isReachable, exceptionMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestNetworkConnectivity o) {
            Builder copiedBuilder =
                    networkValidationOutput(o.getNetworkValidationOutput())
                            .isReachable(o.getIsReachable())
                            .exceptionMessage(o.getExceptionMessage());

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
     * Last line from network validation command execution output.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkValidationOutput")
    String networkValidationOutput;

    /**
     * True if the data asset is has a valid network path.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReachable")
    Boolean isReachable;

    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exceptionMessage")
    String exceptionMessage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
