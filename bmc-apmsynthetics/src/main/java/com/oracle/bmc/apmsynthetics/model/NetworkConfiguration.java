/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the network configuration. For NETWORK monitor type, NetworkConfiguration is
 * mandatory. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NetworkConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "numberOfHops",
        "probePerHop",
        "transmissionRate",
        "protocol",
        "probeMode"
    })
    public NetworkConfiguration(
            Integer numberOfHops,
            Integer probePerHop,
            Integer transmissionRate,
            Protocol protocol,
            ProbeMode probeMode) {
        super();
        this.numberOfHops = numberOfHops;
        this.probePerHop = probePerHop;
        this.transmissionRate = transmissionRate;
        this.protocol = protocol;
        this.probeMode = probeMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of hops. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfHops")
        private Integer numberOfHops;

        /**
         * Number of hops.
         *
         * @param numberOfHops the value to set
         * @return this builder
         */
        public Builder numberOfHops(Integer numberOfHops) {
            this.numberOfHops = numberOfHops;
            this.__explicitlySet__.add("numberOfHops");
            return this;
        }
        /** Number of probes per hop. */
        @com.fasterxml.jackson.annotation.JsonProperty("probePerHop")
        private Integer probePerHop;

        /**
         * Number of probes per hop.
         *
         * @param probePerHop the value to set
         * @return this builder
         */
        public Builder probePerHop(Integer probePerHop) {
            this.probePerHop = probePerHop;
            this.__explicitlySet__.add("probePerHop");
            return this;
        }
        /** Number of probe packets sent out simultaneously. */
        @com.fasterxml.jackson.annotation.JsonProperty("transmissionRate")
        private Integer transmissionRate;

        /**
         * Number of probe packets sent out simultaneously.
         *
         * @param transmissionRate the value to set
         * @return this builder
         */
        public Builder transmissionRate(Integer transmissionRate) {
            this.transmissionRate = transmissionRate;
            this.__explicitlySet__.add("transmissionRate");
            return this;
        }
        /** Type of protocol. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * Type of protocol.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** Type of probe mode when TCP protocol is selected. */
        @com.fasterxml.jackson.annotation.JsonProperty("probeMode")
        private ProbeMode probeMode;

        /**
         * Type of probe mode when TCP protocol is selected.
         *
         * @param probeMode the value to set
         * @return this builder
         */
        public Builder probeMode(ProbeMode probeMode) {
            this.probeMode = probeMode;
            this.__explicitlySet__.add("probeMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkConfiguration build() {
            NetworkConfiguration model =
                    new NetworkConfiguration(
                            this.numberOfHops,
                            this.probePerHop,
                            this.transmissionRate,
                            this.protocol,
                            this.probeMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkConfiguration model) {
            if (model.wasPropertyExplicitlySet("numberOfHops")) {
                this.numberOfHops(model.getNumberOfHops());
            }
            if (model.wasPropertyExplicitlySet("probePerHop")) {
                this.probePerHop(model.getProbePerHop());
            }
            if (model.wasPropertyExplicitlySet("transmissionRate")) {
                this.transmissionRate(model.getTransmissionRate());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("probeMode")) {
                this.probeMode(model.getProbeMode());
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

    /** Number of hops. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfHops")
    private final Integer numberOfHops;

    /**
     * Number of hops.
     *
     * @return the value
     */
    public Integer getNumberOfHops() {
        return numberOfHops;
    }

    /** Number of probes per hop. */
    @com.fasterxml.jackson.annotation.JsonProperty("probePerHop")
    private final Integer probePerHop;

    /**
     * Number of probes per hop.
     *
     * @return the value
     */
    public Integer getProbePerHop() {
        return probePerHop;
    }

    /** Number of probe packets sent out simultaneously. */
    @com.fasterxml.jackson.annotation.JsonProperty("transmissionRate")
    private final Integer transmissionRate;

    /**
     * Number of probe packets sent out simultaneously.
     *
     * @return the value
     */
    public Integer getTransmissionRate() {
        return transmissionRate;
    }

    /** Type of protocol. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * Type of protocol.
     *
     * @return the value
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /** Type of probe mode when TCP protocol is selected. */
    @com.fasterxml.jackson.annotation.JsonProperty("probeMode")
    private final ProbeMode probeMode;

    /**
     * Type of probe mode when TCP protocol is selected.
     *
     * @return the value
     */
    public ProbeMode getProbeMode() {
        return probeMode;
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
        sb.append("NetworkConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("numberOfHops=").append(String.valueOf(this.numberOfHops));
        sb.append(", probePerHop=").append(String.valueOf(this.probePerHop));
        sb.append(", transmissionRate=").append(String.valueOf(this.transmissionRate));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", probeMode=").append(String.valueOf(this.probeMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkConfiguration)) {
            return false;
        }

        NetworkConfiguration other = (NetworkConfiguration) o;
        return java.util.Objects.equals(this.numberOfHops, other.numberOfHops)
                && java.util.Objects.equals(this.probePerHop, other.probePerHop)
                && java.util.Objects.equals(this.transmissionRate, other.transmissionRate)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.probeMode, other.probeMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.numberOfHops == null ? 43 : this.numberOfHops.hashCode());
        result = (result * PRIME) + (this.probePerHop == null ? 43 : this.probePerHop.hashCode());
        result =
                (result * PRIME)
                        + (this.transmissionRate == null ? 43 : this.transmissionRate.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.probeMode == null ? 43 : this.probeMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
