/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration for UDP protocol parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UdpProtocolParameters.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UdpProtocolParameters extends ProtocolParameters {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The source port to use in a {@code PathAnalyzerTest} resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourcePort")
        private Integer sourcePort;

        /**
         * The source port to use in a {@code PathAnalyzerTest} resource.
         *
         * @param sourcePort the value to set
         * @return this builder
         */
        public Builder sourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            this.__explicitlySet__.add("sourcePort");
            return this;
        }
        /** The destination port to use in a {@code PathAnalyzerTest} resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationPort")
        private Integer destinationPort;

        /**
         * The destination port to use in a {@code PathAnalyzerTest} resource.
         *
         * @param destinationPort the value to set
         * @return this builder
         */
        public Builder destinationPort(Integer destinationPort) {
            this.destinationPort = destinationPort;
            this.__explicitlySet__.add("destinationPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UdpProtocolParameters build() {
            UdpProtocolParameters model =
                    new UdpProtocolParameters(this.sourcePort, this.destinationPort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UdpProtocolParameters model) {
            if (model.wasPropertyExplicitlySet("sourcePort")) {
                this.sourcePort(model.getSourcePort());
            }
            if (model.wasPropertyExplicitlySet("destinationPort")) {
                this.destinationPort(model.getDestinationPort());
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

    @Deprecated
    public UdpProtocolParameters(Integer sourcePort, Integer destinationPort) {
        super();
        this.sourcePort = sourcePort;
        this.destinationPort = destinationPort;
    }

    /** The source port to use in a {@code PathAnalyzerTest} resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePort")
    private final Integer sourcePort;

    /**
     * The source port to use in a {@code PathAnalyzerTest} resource.
     *
     * @return the value
     */
    public Integer getSourcePort() {
        return sourcePort;
    }

    /** The destination port to use in a {@code PathAnalyzerTest} resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationPort")
    private final Integer destinationPort;

    /**
     * The destination port to use in a {@code PathAnalyzerTest} resource.
     *
     * @return the value
     */
    public Integer getDestinationPort() {
        return destinationPort;
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
        sb.append("UdpProtocolParameters(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourcePort=").append(String.valueOf(this.sourcePort));
        sb.append(", destinationPort=").append(String.valueOf(this.destinationPort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UdpProtocolParameters)) {
            return false;
        }

        UdpProtocolParameters other = (UdpProtocolParameters) o;
        return java.util.Objects.equals(this.sourcePort, other.sourcePort)
                && java.util.Objects.equals(this.destinationPort, other.destinationPort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sourcePort == null ? 43 : this.sourcePort.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationPort == null ? 43 : this.destinationPort.hashCode());
        return result;
    }
}
