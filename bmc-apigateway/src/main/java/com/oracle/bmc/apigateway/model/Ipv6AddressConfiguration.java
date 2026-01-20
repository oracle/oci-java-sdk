/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * IPv6 address configuration details that should be used when creating the gateway. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = Ipv6AddressConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Ipv6AddressConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"addresses", "subnetCidrs"})
    public Ipv6AddressConfiguration(
            java.util.List<String> addresses, java.util.List<String> subnetCidrs) {
        super();
        this.addresses = addresses;
        this.subnetCidrs = subnetCidrs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of IPv6 addresses that will be assigned to the gateway during creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("addresses")
        private java.util.List<String> addresses;

        /**
         * List of IPv6 addresses that will be assigned to the gateway during creation.
         *
         * @param addresses the value to set
         * @return this builder
         */
        public Builder addresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            this.__explicitlySet__.add("addresses");
            return this;
        }
        /**
         * List of IPv6 prefixes from which to provision IPv6 addresses from. This is required if
         * more than one prefix exists on the subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetCidrs")
        private java.util.List<String> subnetCidrs;

        /**
         * List of IPv6 prefixes from which to provision IPv6 addresses from. This is required if
         * more than one prefix exists on the subnet.
         *
         * @param subnetCidrs the value to set
         * @return this builder
         */
        public Builder subnetCidrs(java.util.List<String> subnetCidrs) {
            this.subnetCidrs = subnetCidrs;
            this.__explicitlySet__.add("subnetCidrs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Ipv6AddressConfiguration build() {
            Ipv6AddressConfiguration model =
                    new Ipv6AddressConfiguration(this.addresses, this.subnetCidrs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Ipv6AddressConfiguration model) {
            if (model.wasPropertyExplicitlySet("addresses")) {
                this.addresses(model.getAddresses());
            }
            if (model.wasPropertyExplicitlySet("subnetCidrs")) {
                this.subnetCidrs(model.getSubnetCidrs());
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

    /** List of IPv6 addresses that will be assigned to the gateway during creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    private final java.util.List<String> addresses;

    /**
     * List of IPv6 addresses that will be assigned to the gateway during creation.
     *
     * @return the value
     */
    public java.util.List<String> getAddresses() {
        return addresses;
    }

    /**
     * List of IPv6 prefixes from which to provision IPv6 addresses from. This is required if more
     * than one prefix exists on the subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetCidrs")
    private final java.util.List<String> subnetCidrs;

    /**
     * List of IPv6 prefixes from which to provision IPv6 addresses from. This is required if more
     * than one prefix exists on the subnet.
     *
     * @return the value
     */
    public java.util.List<String> getSubnetCidrs() {
        return subnetCidrs;
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
        sb.append("Ipv6AddressConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("addresses=").append(String.valueOf(this.addresses));
        sb.append(", subnetCidrs=").append(String.valueOf(this.subnetCidrs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ipv6AddressConfiguration)) {
            return false;
        }

        Ipv6AddressConfiguration other = (Ipv6AddressConfiguration) o;
        return java.util.Objects.equals(this.addresses, other.addresses)
                && java.util.Objects.equals(this.subnetCidrs, other.subnetCidrs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.addresses == null ? 43 : this.addresses.hashCode());
        result = (result * PRIME) + (this.subnetCidrs == null ? 43 : this.subnetCidrs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
