/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Optional. Used to specify from which subnet prefixes an IPv6 address should be allocated, or to assign valid available IPv6 addresses.
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
    builder = InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv6SubnetCidr"})
    public InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails(String ipv6SubnetCidr) {
        super();
        this.ipv6SubnetCidr = ipv6SubnetCidr;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Optional. Used to disambiguate which subnet prefix should be used to create an IPv6 allocation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6SubnetCidr")
        private String ipv6SubnetCidr;

        /**
         * Optional. Used to disambiguate which subnet prefix should be used to create an IPv6 allocation.
         *
         * @param ipv6SubnetCidr the value to set
         * @return this builder
         **/
        public Builder ipv6SubnetCidr(String ipv6SubnetCidr) {
            this.ipv6SubnetCidr = ipv6SubnetCidr;
            this.__explicitlySet__.add("ipv6SubnetCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails build() {
            InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails model =
                    new InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails(this.ipv6SubnetCidr);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails model) {
            if (model.wasPropertyExplicitlySet("ipv6SubnetCidr")) {
                this.ipv6SubnetCidr(model.getIpv6SubnetCidr());
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
     * Optional. Used to disambiguate which subnet prefix should be used to create an IPv6 allocation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6SubnetCidr")
    private final String ipv6SubnetCidr;

    /**
     * Optional. Used to disambiguate which subnet prefix should be used to create an IPv6 allocation.
     *
     * @return the value
     **/
    public String getIpv6SubnetCidr() {
        return ipv6SubnetCidr;
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
        sb.append("InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ipv6SubnetCidr=").append(String.valueOf(this.ipv6SubnetCidr));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails)) {
            return false;
        }

        InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails other =
                (InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails) o;
        return java.util.Objects.equals(this.ipv6SubnetCidr, other.ipv6SubnetCidr)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ipv6SubnetCidr == null ? 43 : this.ipv6SubnetCidr.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
