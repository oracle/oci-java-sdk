/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Optional. Used to specify from which subnet prefixes an IPv6 address should be allocated, or to
 * assign valid available IPv6 addresses. <br>
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
        builder = InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv6SubnetCidr", "ipv6Address"})
    public InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails(
            String ipv6SubnetCidr, String ipv6Address) {
        super();
        this.ipv6SubnetCidr = ipv6SubnetCidr;
        this.ipv6Address = ipv6Address;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Optional. Used to disambiguate which subnet prefix should be used to create an IPv6
         * allocation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6SubnetCidr")
        private String ipv6SubnetCidr;

        /**
         * Optional. Used to disambiguate which subnet prefix should be used to create an IPv6
         * allocation.
         *
         * @param ipv6SubnetCidr the value to set
         * @return this builder
         */
        public Builder ipv6SubnetCidr(String ipv6SubnetCidr) {
            this.ipv6SubnetCidr = ipv6SubnetCidr;
            this.__explicitlySet__.add("ipv6SubnetCidr");
            return this;
        }
        /**
         * Optional. An available IPv6 address of your subnet from a valid IPv6 prefix on the subnet
         * (otherwise the IP address is automatically assigned).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
        private String ipv6Address;

        /**
         * Optional. An available IPv6 address of your subnet from a valid IPv6 prefix on the subnet
         * (otherwise the IP address is automatically assigned).
         *
         * @param ipv6Address the value to set
         * @return this builder
         */
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            this.__explicitlySet__.add("ipv6Address");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails build() {
            InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails model =
                    new InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails(
                            this.ipv6SubnetCidr, this.ipv6Address);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails model) {
            if (model.wasPropertyExplicitlySet("ipv6SubnetCidr")) {
                this.ipv6SubnetCidr(model.getIpv6SubnetCidr());
            }
            if (model.wasPropertyExplicitlySet("ipv6Address")) {
                this.ipv6Address(model.getIpv6Address());
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

    /**
     * Optional. Used to disambiguate which subnet prefix should be used to create an IPv6
     * allocation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6SubnetCidr")
    private final String ipv6SubnetCidr;

    /**
     * Optional. Used to disambiguate which subnet prefix should be used to create an IPv6
     * allocation.
     *
     * @return the value
     */
    public String getIpv6SubnetCidr() {
        return ipv6SubnetCidr;
    }

    /**
     * Optional. An available IPv6 address of your subnet from a valid IPv6 prefix on the subnet
     * (otherwise the IP address is automatically assigned).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
    private final String ipv6Address;

    /**
     * Optional. An available IPv6 address of your subnet from a valid IPv6 prefix on the subnet
     * (otherwise the IP address is automatically assigned).
     *
     * @return the value
     */
    public String getIpv6Address() {
        return ipv6Address;
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
        sb.append("InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails(");
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
        if (!(o instanceof InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails)) {
            return false;
        }

        InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails other =
                (InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails) o;
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
