/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details used when removing ULA or private IPv6 prefix or an IPv6 GUA assigned by Oracle or
 * BYOIPv6 prefix. You can only remove one of these per request. <br>
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
        builder = RemoveVcnIpv6CidrDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveVcnIpv6CidrDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv6CidrBlock"})
    public RemoveVcnIpv6CidrDetails(String ipv6CidrBlock) {
        super();
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This field is not required and should only be specified when removing ULA or private IPv6
         * prefix or an IPv6 GUA assigned by Oracle or BYOIPv6 prefix from a VCN's IPv6 address
         * space. See[IPv6
         * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 2001:0db8:0123::/56}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * This field is not required and should only be specified when removing ULA or private IPv6
         * prefix or an IPv6 GUA assigned by Oracle or BYOIPv6 prefix from a VCN's IPv6 address
         * space. See[IPv6
         * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 2001:0db8:0123::/56}
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

        public RemoveVcnIpv6CidrDetails build() {
            RemoveVcnIpv6CidrDetails model = new RemoveVcnIpv6CidrDetails(this.ipv6CidrBlock);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveVcnIpv6CidrDetails model) {
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
     * This field is not required and should only be specified when removing ULA or private IPv6
     * prefix or an IPv6 GUA assigned by Oracle or BYOIPv6 prefix from a VCN's IPv6 address space.
     * See[IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 2001:0db8:0123::/56}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * This field is not required and should only be specified when removing ULA or private IPv6
     * prefix or an IPv6 GUA assigned by Oracle or BYOIPv6 prefix from a VCN's IPv6 address space.
     * See[IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 2001:0db8:0123::/56}
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
        sb.append("RemoveVcnIpv6CidrDetails(");
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
        if (!(o instanceof RemoveVcnIpv6CidrDetails)) {
            return false;
        }

        RemoveVcnIpv6CidrDetails other = (RemoveVcnIpv6CidrDetails) o;
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
