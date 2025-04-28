/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details object for removing an IPv6 prefix from a subnet. <br>
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
        builder = RemoveSubnetIpv6CidrDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveSubnetIpv6CidrDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv6CidrBlock"})
    public RemoveSubnetIpv6CidrDetails(String ipv6CidrBlock) {
        super();
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This field is not required and should only be specified when removing an IPv6 prefix from
         * a subnet's IPv6 address space. See[IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 2001:0db8:0123::/64}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * This field is not required and should only be specified when removing an IPv6 prefix from
         * a subnet's IPv6 address space. See[IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 2001:0db8:0123::/64}
         *
         * @param ipv6CidrBlock the value to set
         * @return this builder
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveSubnetIpv6CidrDetails build() {
            RemoveSubnetIpv6CidrDetails model = new RemoveSubnetIpv6CidrDetails(this.ipv6CidrBlock);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveSubnetIpv6CidrDetails model) {
            if (model.wasPropertyExplicitlySet("ipv6CidrBlock")) {
                this.ipv6CidrBlock(model.getIpv6CidrBlock());
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
     * This field is not required and should only be specified when removing an IPv6 prefix from a
     * subnet's IPv6 address space. See[IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 2001:0db8:0123::/64}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * This field is not required and should only be specified when removing an IPv6 prefix from a
     * subnet's IPv6 address space. See[IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 2001:0db8:0123::/64}
     *
     * @return the value
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
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
        sb.append("RemoveSubnetIpv6CidrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ipv6CidrBlock=").append(String.valueOf(this.ipv6CidrBlock));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveSubnetIpv6CidrDetails)) {
            return false;
        }

        RemoveSubnetIpv6CidrDetails other = (RemoveSubnetIpv6CidrDetails) o;
        return java.util.Objects.equals(this.ipv6CidrBlock, other.ipv6CidrBlock)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlock == null ? 43 : this.ipv6CidrBlock.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
