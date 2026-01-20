/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details used when adding an IPv4 prefix to a subnet. <br>
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
        builder = AddIpv4SubnetCidrDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddIpv4SubnetCidrDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv4CidrBlock"})
    public AddIpv4SubnetCidrDetails(String ipv4CidrBlock) {
        super();
        this.ipv4CidrBlock = ipv4CidrBlock;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The CIDR IP address range of the subnet. The CIDR must maintain the following rules -
         *
         * <p>a. The CIDR block is valid and correctly formatted. b. The new range is within one of
         * the parent VCN ranges.
         *
         * <p>Example: {@code 10.0.1.0/24}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4CidrBlock")
        private String ipv4CidrBlock;

        /**
         * The CIDR IP address range of the subnet. The CIDR must maintain the following rules -
         *
         * <p>a. The CIDR block is valid and correctly formatted. b. The new range is within one of
         * the parent VCN ranges.
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

        public AddIpv4SubnetCidrDetails build() {
            AddIpv4SubnetCidrDetails model = new AddIpv4SubnetCidrDetails(this.ipv4CidrBlock);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddIpv4SubnetCidrDetails model) {
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
     * The CIDR IP address range of the subnet. The CIDR must maintain the following rules -
     *
     * <p>a. The CIDR block is valid and correctly formatted. b. The new range is within one of the
     * parent VCN ranges.
     *
     * <p>Example: {@code 10.0.1.0/24}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4CidrBlock")
    private final String ipv4CidrBlock;

    /**
     * The CIDR IP address range of the subnet. The CIDR must maintain the following rules -
     *
     * <p>a. The CIDR block is valid and correctly formatted. b. The new range is within one of the
     * parent VCN ranges.
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
        sb.append("AddIpv4SubnetCidrDetails(");
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
        if (!(o instanceof AddIpv4SubnetCidrDetails)) {
            return false;
        }

        AddIpv4SubnetCidrDetails other = (AddIpv4SubnetCidrDetails) o;
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
