/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details to assign an IPv6 subnet prefix and IPv6 address on VNIC creation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = Ipv6AddressIpv6SubnetCidrPairDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Ipv6AddressIpv6SubnetCidrPairDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv6SubnetCidr", "ipv6Address"})
    public Ipv6AddressIpv6SubnetCidrPairDetails(String ipv6SubnetCidr, String ipv6Address) {
        super();
        this.ipv6SubnetCidr = ipv6SubnetCidr;
        this.ipv6Address = ipv6Address;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The IPv6 prefix allocated to the subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6SubnetCidr")
        private String ipv6SubnetCidr;

        /**
         * The IPv6 prefix allocated to the subnet.
         *
         * @param ipv6SubnetCidr the value to set
         * @return this builder
         **/
        public Builder ipv6SubnetCidr(String ipv6SubnetCidr) {
            this.ipv6SubnetCidr = ipv6SubnetCidr;
            this.__explicitlySet__.add("ipv6SubnetCidr");
            return this;
        }
        /**
         * An IPv6 address of your choice. Must be an available IPv6 address within the subnet's prefix.
         * If an IPv6 address is not provided:
         * - Oracle will automatically assign an IPv6 address from the subnet's IPv6 prefix if and only if there is only one IPv6 prefix on the subnet.
         * - Oracle will automatically assign an IPv6 address from the subnet's IPv6 Oracle GUA prefix if it exists on the subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
        private String ipv6Address;

        /**
         * An IPv6 address of your choice. Must be an available IPv6 address within the subnet's prefix.
         * If an IPv6 address is not provided:
         * - Oracle will automatically assign an IPv6 address from the subnet's IPv6 prefix if and only if there is only one IPv6 prefix on the subnet.
         * - Oracle will automatically assign an IPv6 address from the subnet's IPv6 Oracle GUA prefix if it exists on the subnet.
         *
         * @param ipv6Address the value to set
         * @return this builder
         **/
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            this.__explicitlySet__.add("ipv6Address");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Ipv6AddressIpv6SubnetCidrPairDetails build() {
            Ipv6AddressIpv6SubnetCidrPairDetails model =
                    new Ipv6AddressIpv6SubnetCidrPairDetails(this.ipv6SubnetCidr, this.ipv6Address);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Ipv6AddressIpv6SubnetCidrPairDetails model) {
            if (model.wasPropertyExplicitlySet("ipv6SubnetCidr")) {
                this.ipv6SubnetCidr(model.getIpv6SubnetCidr());
            }
            if (model.wasPropertyExplicitlySet("ipv6Address")) {
                this.ipv6Address(model.getIpv6Address());
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
     * The IPv6 prefix allocated to the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6SubnetCidr")
    private final String ipv6SubnetCidr;

    /**
     * The IPv6 prefix allocated to the subnet.
     *
     * @return the value
     **/
    public String getIpv6SubnetCidr() {
        return ipv6SubnetCidr;
    }

    /**
     * An IPv6 address of your choice. Must be an available IPv6 address within the subnet's prefix.
     * If an IPv6 address is not provided:
     * - Oracle will automatically assign an IPv6 address from the subnet's IPv6 prefix if and only if there is only one IPv6 prefix on the subnet.
     * - Oracle will automatically assign an IPv6 address from the subnet's IPv6 Oracle GUA prefix if it exists on the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
    private final String ipv6Address;

    /**
     * An IPv6 address of your choice. Must be an available IPv6 address within the subnet's prefix.
     * If an IPv6 address is not provided:
     * - Oracle will automatically assign an IPv6 address from the subnet's IPv6 prefix if and only if there is only one IPv6 prefix on the subnet.
     * - Oracle will automatically assign an IPv6 address from the subnet's IPv6 Oracle GUA prefix if it exists on the subnet.
     *
     * @return the value
     **/
    public String getIpv6Address() {
        return ipv6Address;
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
        sb.append("Ipv6AddressIpv6SubnetCidrPairDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ipv6SubnetCidr=").append(String.valueOf(this.ipv6SubnetCidr));
        sb.append(", ipv6Address=").append(String.valueOf(this.ipv6Address));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ipv6AddressIpv6SubnetCidrPairDetails)) {
            return false;
        }

        Ipv6AddressIpv6SubnetCidrPairDetails other = (Ipv6AddressIpv6SubnetCidrPairDetails) o;
        return java.util.Objects.equals(this.ipv6SubnetCidr, other.ipv6SubnetCidr)
                && java.util.Objects.equals(this.ipv6Address, other.ipv6Address)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ipv6SubnetCidr == null ? 43 : this.ipv6SubnetCidr.hashCode());
        result = (result * PRIME) + (this.ipv6Address == null ? 43 : this.ipv6Address.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
