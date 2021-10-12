/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the network configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NetworkConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class NetworkConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfHops")
        private Integer numberOfHops;

        public Builder numberOfHops(Integer numberOfHops) {
            this.numberOfHops = numberOfHops;
            this.__explicitlySet__.add("numberOfHops");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("probePerHop")
        private Integer probePerHop;

        public Builder probePerHop(Integer probePerHop) {
            this.probePerHop = probePerHop;
            this.__explicitlySet__.add("probePerHop");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transmissionRate")
        private Integer transmissionRate;

        public Builder transmissionRate(Integer transmissionRate) {
            this.transmissionRate = transmissionRate;
            this.__explicitlySet__.add("transmissionRate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("probeMode")
        private ProbeMode probeMode;

        public Builder probeMode(ProbeMode probeMode) {
            this.probeMode = probeMode;
            this.__explicitlySet__.add("probeMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkConfiguration build() {
            NetworkConfiguration __instance__ =
                    new NetworkConfiguration(
                            numberOfHops, probePerHop, transmissionRate, protocol, probeMode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkConfiguration o) {
            Builder copiedBuilder =
                    numberOfHops(o.getNumberOfHops())
                            .probePerHop(o.getProbePerHop())
                            .transmissionRate(o.getTransmissionRate())
                            .protocol(o.getProtocol())
                            .probeMode(o.getProbeMode());

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
     * Number of hops.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfHops")
    Integer numberOfHops;

    /**
     * Number of probes per hop.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("probePerHop")
    Integer probePerHop;

    /**
     * Number of probe packets sent out simultaneously.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transmissionRate")
    Integer transmissionRate;

    /**
     * Type of protocol.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    Protocol protocol;

    /**
     * Type of probe mode when TCP protocol is selected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("probeMode")
    ProbeMode probeMode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
