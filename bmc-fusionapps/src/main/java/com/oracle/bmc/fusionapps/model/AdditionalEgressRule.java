/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Additional egress rule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdditionalEgressRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdditionalEgressRule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "destinationCidr",
        "maxDestinationPort",
        "minDestinationPort"
    })
    public AdditionalEgressRule(
            String description,
            String destinationCidr,
            Integer maxDestinationPort,
            Integer minDestinationPort) {
        super();
        this.description = description;
        this.destinationCidr = destinationCidr;
        this.maxDestinationPort = maxDestinationPort;
        this.minDestinationPort = minDestinationPort;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Rule description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Rule description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Specifies the destination CIDR block the port should be opened for. Must be IPv4 only, and cannot be part of any private range from [RFC 1918](https://datatracker.ietf.org/doc/html/rfc1918).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationCidr")
        private String destinationCidr;

        /**
         * Specifies the destination CIDR block the port should be opened for. Must be IPv4 only, and cannot be part of any private range from [RFC 1918](https://datatracker.ietf.org/doc/html/rfc1918).
         * @param destinationCidr the value to set
         * @return this builder
         **/
        public Builder destinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            this.__explicitlySet__.add("destinationCidr");
            return this;
        }
        /**
         * The maximum port number, which must not be less than the minimum port number. To specify a single port number, set both the min and max to the same value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxDestinationPort")
        private Integer maxDestinationPort;

        /**
         * The maximum port number, which must not be less than the minimum port number. To specify a single port number, set both the min and max to the same value.
         * @param maxDestinationPort the value to set
         * @return this builder
         **/
        public Builder maxDestinationPort(Integer maxDestinationPort) {
            this.maxDestinationPort = maxDestinationPort;
            this.__explicitlySet__.add("maxDestinationPort");
            return this;
        }
        /**
         * The minimum port number, which must not be greater than the maximum port number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minDestinationPort")
        private Integer minDestinationPort;

        /**
         * The minimum port number, which must not be greater than the maximum port number.
         * @param minDestinationPort the value to set
         * @return this builder
         **/
        public Builder minDestinationPort(Integer minDestinationPort) {
            this.minDestinationPort = minDestinationPort;
            this.__explicitlySet__.add("minDestinationPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdditionalEgressRule build() {
            AdditionalEgressRule model =
                    new AdditionalEgressRule(
                            this.description,
                            this.destinationCidr,
                            this.maxDestinationPort,
                            this.minDestinationPort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdditionalEgressRule model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("destinationCidr")) {
                this.destinationCidr(model.getDestinationCidr());
            }
            if (model.wasPropertyExplicitlySet("maxDestinationPort")) {
                this.maxDestinationPort(model.getMaxDestinationPort());
            }
            if (model.wasPropertyExplicitlySet("minDestinationPort")) {
                this.minDestinationPort(model.getMinDestinationPort());
            }
            return this;
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
     * Rule description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Rule description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Specifies the destination CIDR block the port should be opened for. Must be IPv4 only, and cannot be part of any private range from [RFC 1918](https://datatracker.ietf.org/doc/html/rfc1918).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCidr")
    private final String destinationCidr;

    /**
     * Specifies the destination CIDR block the port should be opened for. Must be IPv4 only, and cannot be part of any private range from [RFC 1918](https://datatracker.ietf.org/doc/html/rfc1918).
     * @return the value
     **/
    public String getDestinationCidr() {
        return destinationCidr;
    }

    /**
     * The maximum port number, which must not be less than the minimum port number. To specify a single port number, set both the min and max to the same value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDestinationPort")
    private final Integer maxDestinationPort;

    /**
     * The maximum port number, which must not be less than the minimum port number. To specify a single port number, set both the min and max to the same value.
     * @return the value
     **/
    public Integer getMaxDestinationPort() {
        return maxDestinationPort;
    }

    /**
     * The minimum port number, which must not be greater than the maximum port number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minDestinationPort")
    private final Integer minDestinationPort;

    /**
     * The minimum port number, which must not be greater than the maximum port number.
     * @return the value
     **/
    public Integer getMinDestinationPort() {
        return minDestinationPort;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdditionalEgressRule(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", destinationCidr=").append(String.valueOf(this.destinationCidr));
        sb.append(", maxDestinationPort=").append(String.valueOf(this.maxDestinationPort));
        sb.append(", minDestinationPort=").append(String.valueOf(this.minDestinationPort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdditionalEgressRule)) {
            return false;
        }

        AdditionalEgressRule other = (AdditionalEgressRule) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.destinationCidr, other.destinationCidr)
                && java.util.Objects.equals(this.maxDestinationPort, other.maxDestinationPort)
                && java.util.Objects.equals(this.minDestinationPort, other.minDestinationPort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationCidr == null ? 43 : this.destinationCidr.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDestinationPort == null
                                ? 43
                                : this.maxDestinationPort.hashCode());
        result =
                (result * PRIME)
                        + (this.minDestinationPort == null
                                ? 43
                                : this.minDestinationPort.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
