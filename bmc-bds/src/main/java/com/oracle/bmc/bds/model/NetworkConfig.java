/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Additional configuration of the user's network.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NetworkConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NetworkConfig extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isNatGatewayRequired", "cidrBlock"})
    public NetworkConfig(Boolean isNatGatewayRequired, String cidrBlock) {
        super();
        this.isNatGatewayRequired = isNatGatewayRequired;
        this.cidrBlock = cidrBlock;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A boolean flag whether to configure a NAT gateway.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isNatGatewayRequired")
        private Boolean isNatGatewayRequired;

        /**
         * A boolean flag whether to configure a NAT gateway.
         * @param isNatGatewayRequired the value to set
         * @return this builder
         **/
        public Builder isNatGatewayRequired(Boolean isNatGatewayRequired) {
            this.isNatGatewayRequired = isNatGatewayRequired;
            this.__explicitlySet__.add("isNatGatewayRequired");
            return this;
        }
        /**
         * The CIDR IP address block of the VCN.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * The CIDR IP address block of the VCN.
         * @param cidrBlock the value to set
         * @return this builder
         **/
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkConfig build() {
            NetworkConfig model = new NetworkConfig(this.isNatGatewayRequired, this.cidrBlock);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkConfig model) {
            if (model.wasPropertyExplicitlySet("isNatGatewayRequired")) {
                this.isNatGatewayRequired(model.getIsNatGatewayRequired());
            }
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
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
     * A boolean flag whether to configure a NAT gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNatGatewayRequired")
    private final Boolean isNatGatewayRequired;

    /**
     * A boolean flag whether to configure a NAT gateway.
     * @return the value
     **/
    public Boolean getIsNatGatewayRequired() {
        return isNatGatewayRequired;
    }

    /**
     * The CIDR IP address block of the VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * The CIDR IP address block of the VCN.
     * @return the value
     **/
    public String getCidrBlock() {
        return cidrBlock;
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
        sb.append("NetworkConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isNatGatewayRequired=").append(String.valueOf(this.isNatGatewayRequired));
        sb.append(", cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkConfig)) {
            return false;
        }

        NetworkConfig other = (NetworkConfig) o;
        return java.util.Objects.equals(this.isNatGatewayRequired, other.isNatGatewayRequired)
                && java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isNatGatewayRequired == null
                                ? 43
                                : this.isNatGatewayRequired.hashCode());
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
