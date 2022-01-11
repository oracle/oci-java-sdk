/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Ocpu utilization for a VM host
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OcpuUtilizationInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OcpuUtilizationInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuUtilizationNumber")
        private Float ocpuUtilizationNumber;

        public Builder ocpuUtilizationNumber(Float ocpuUtilizationNumber) {
            this.ocpuUtilizationNumber = ocpuUtilizationNumber;
            this.__explicitlySet__.add("ocpuUtilizationNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCapacityNumber")
        private Float ocpuCapacityNumber;

        public Builder ocpuCapacityNumber(Float ocpuCapacityNumber) {
            this.ocpuCapacityNumber = ocpuCapacityNumber;
            this.__explicitlySet__.add("ocpuCapacityNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OcpuUtilizationInfo build() {
            OcpuUtilizationInfo __instance__ =
                    new OcpuUtilizationInfo(host, ocpuUtilizationNumber, ocpuCapacityNumber);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OcpuUtilizationInfo o) {
            Builder copiedBuilder =
                    host(o.getHost())
                            .ocpuUtilizationNumber(o.getOcpuUtilizationNumber())
                            .ocpuCapacityNumber(o.getOcpuCapacityNumber());

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
     * Host name of VM
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * Number of OCPU utilized
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuUtilizationNumber")
    Float ocpuUtilizationNumber;

    /**
     * Number of total OCPU capacity on the host
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCapacityNumber")
    Float ocpuCapacityNumber;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
