/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the traffic configuration that leaves the traffic node. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EgressTrafficSpec.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class EgressTrafficSpec
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "protocol",
        "sourceAddress",
        "destinationAddress",
        "trafficProtocolParameters"
    })
    public EgressTrafficSpec(
            Integer protocol,
            String sourceAddress,
            String destinationAddress,
            TrafficProtocolParameters trafficProtocolParameters) {
        super();
        this.protocol = protocol;
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.trafficProtocolParameters = trafficProtocolParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The IP protocol to use for the traffic path analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Integer protocol;

        /**
         * The IP protocol to use for the traffic path analysis.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(Integer protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** The IPv4 address of the source node. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceAddress")
        private String sourceAddress;

        /**
         * The IPv4 address of the source node.
         *
         * @param sourceAddress the value to set
         * @return this builder
         */
        public Builder sourceAddress(String sourceAddress) {
            this.sourceAddress = sourceAddress;
            this.__explicitlySet__.add("sourceAddress");
            return this;
        }
        /** The IPv4 address of the destination node. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationAddress")
        private String destinationAddress;

        /**
         * The IPv4 address of the destination node.
         *
         * @param destinationAddress the value to set
         * @return this builder
         */
        public Builder destinationAddress(String destinationAddress) {
            this.destinationAddress = destinationAddress;
            this.__explicitlySet__.add("destinationAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trafficProtocolParameters")
        private TrafficProtocolParameters trafficProtocolParameters;

        public Builder trafficProtocolParameters(
                TrafficProtocolParameters trafficProtocolParameters) {
            this.trafficProtocolParameters = trafficProtocolParameters;
            this.__explicitlySet__.add("trafficProtocolParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EgressTrafficSpec build() {
            EgressTrafficSpec model =
                    new EgressTrafficSpec(
                            this.protocol,
                            this.sourceAddress,
                            this.destinationAddress,
                            this.trafficProtocolParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EgressTrafficSpec model) {
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("sourceAddress")) {
                this.sourceAddress(model.getSourceAddress());
            }
            if (model.wasPropertyExplicitlySet("destinationAddress")) {
                this.destinationAddress(model.getDestinationAddress());
            }
            if (model.wasPropertyExplicitlySet("trafficProtocolParameters")) {
                this.trafficProtocolParameters(model.getTrafficProtocolParameters());
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

    /** The IP protocol to use for the traffic path analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Integer protocol;

    /**
     * The IP protocol to use for the traffic path analysis.
     *
     * @return the value
     */
    public Integer getProtocol() {
        return protocol;
    }

    /** The IPv4 address of the source node. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceAddress")
    private final String sourceAddress;

    /**
     * The IPv4 address of the source node.
     *
     * @return the value
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /** The IPv4 address of the destination node. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationAddress")
    private final String destinationAddress;

    /**
     * The IPv4 address of the destination node.
     *
     * @return the value
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("trafficProtocolParameters")
    private final TrafficProtocolParameters trafficProtocolParameters;

    public TrafficProtocolParameters getTrafficProtocolParameters() {
        return trafficProtocolParameters;
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
        sb.append("EgressTrafficSpec(");
        sb.append("super=").append(super.toString());
        sb.append("protocol=").append(String.valueOf(this.protocol));
        sb.append(", sourceAddress=").append(String.valueOf(this.sourceAddress));
        sb.append(", destinationAddress=").append(String.valueOf(this.destinationAddress));
        sb.append(", trafficProtocolParameters=")
                .append(String.valueOf(this.trafficProtocolParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EgressTrafficSpec)) {
            return false;
        }

        EgressTrafficSpec other = (EgressTrafficSpec) o;
        return java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.sourceAddress, other.sourceAddress)
                && java.util.Objects.equals(this.destinationAddress, other.destinationAddress)
                && java.util.Objects.equals(
                        this.trafficProtocolParameters, other.trafficProtocolParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceAddress == null ? 43 : this.sourceAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationAddress == null
                                ? 43
                                : this.destinationAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.trafficProtocolParameters == null
                                ? 43
                                : this.trafficProtocolParameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
