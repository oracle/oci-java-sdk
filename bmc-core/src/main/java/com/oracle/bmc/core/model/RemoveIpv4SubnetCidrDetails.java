/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details object for removing an IPv4 prefix from a subnet. <br>
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
        builder = RemoveIpv4SubnetCidrDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveIpv4SubnetCidrDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv4CidrBlock"})
    public RemoveIpv4SubnetCidrDetails(String ipv4CidrBlock) {
        super();
        this.ipv4CidrBlock = ipv4CidrBlock;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This field should only be specified when removing an IPv4 prefix from a subnet's IPv4
         * address space. The CIDR must maintain the following rules -
         *
         * <p>a. The CIDR block is valid and correctly formatted. b. The CIDR range is within one of
         * the parent VCN ranges. c. The CIDR range to be removed is already present in the list of
         * ipv4CidrBlocks
         *
         * <p>Example: {@code 10.0.1.0/24}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4CidrBlock")
        private String ipv4CidrBlock;

        /**
         * This field should only be specified when removing an IPv4 prefix from a subnet's IPv4
         * address space. The CIDR must maintain the following rules -
         *
         * <p>a. The CIDR block is valid and correctly formatted. b. The CIDR range is within one of
         * the parent VCN ranges. c. The CIDR range to be removed is already present in the list of
         * ipv4CidrBlocks
         *
         * <p>Example: {@code 10.0.1.0/24}
         *
         * @param ipv4CidrBlock the value to set
         * @return this builder
         */
        public Builder ipv4CidrBlock(String ipv4CidrBlock) {
            this.ipv4CidrBlock = ipv4CidrBlock;
            this.__explicitlySet__.add("ipv4CidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveIpv4SubnetCidrDetails build() {
            RemoveIpv4SubnetCidrDetails model = new RemoveIpv4SubnetCidrDetails(this.ipv4CidrBlock);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveIpv4SubnetCidrDetails model) {
            if (model.wasPropertyExplicitlySet("ipv4CidrBlock")) {
                this.ipv4CidrBlock(model.getIpv4CidrBlock());
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
     * This field should only be specified when removing an IPv4 prefix from a subnet's IPv4 address
     * space. The CIDR must maintain the following rules -
     *
     * <p>a. The CIDR block is valid and correctly formatted. b. The CIDR range is within one of the
     * parent VCN ranges. c. The CIDR range to be removed is already present in the list of
     * ipv4CidrBlocks
     *
     * <p>Example: {@code 10.0.1.0/24}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4CidrBlock")
    private final String ipv4CidrBlock;

    /**
     * This field should only be specified when removing an IPv4 prefix from a subnet's IPv4 address
     * space. The CIDR must maintain the following rules -
     *
     * <p>a. The CIDR block is valid and correctly formatted. b. The CIDR range is within one of the
     * parent VCN ranges. c. The CIDR range to be removed is already present in the list of
     * ipv4CidrBlocks
     *
     * <p>Example: {@code 10.0.1.0/24}
     *
     * @return the value
     */
    public String getIpv4CidrBlock() {
        return ipv4CidrBlock;
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
        sb.append("RemoveIpv4SubnetCidrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ipv4CidrBlock=").append(String.valueOf(this.ipv4CidrBlock));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveIpv4SubnetCidrDetails)) {
            return false;
        }

        RemoveIpv4SubnetCidrDetails other = (RemoveIpv4SubnetCidrDetails) o;
        return java.util.Objects.equals(this.ipv4CidrBlock, other.ipv4CidrBlock)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ipv4CidrBlock == null ? 43 : this.ipv4CidrBlock.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
