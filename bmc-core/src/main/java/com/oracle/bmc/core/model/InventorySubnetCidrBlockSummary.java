/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Lists CIDRs and utilization within a subnet.
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
    builder = InventorySubnetCidrBlockSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InventorySubnetCidrBlockSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipCidrBlock", "utilization"})
    public InventorySubnetCidrBlockSummary(String ipCidrBlock, Float utilization) {
        super();
        this.ipCidrBlock = ipCidrBlock;
        this.utilization = utilization;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The CIDR Prefix within a VCN.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipCidrBlock")
        private String ipCidrBlock;

        /**
         * The CIDR Prefix within a VCN.
         * @param ipCidrBlock the value to set
         * @return this builder
         **/
        public Builder ipCidrBlock(String ipCidrBlock) {
            this.ipCidrBlock = ipCidrBlock;
            this.__explicitlySet__.add("ipCidrBlock");
            return this;
        }
        /**
         * The CIDR utilization of a VCN.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("utilization")
        private Float utilization;

        /**
         * The CIDR utilization of a VCN.
         * @param utilization the value to set
         * @return this builder
         **/
        public Builder utilization(Float utilization) {
            this.utilization = utilization;
            this.__explicitlySet__.add("utilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InventorySubnetCidrBlockSummary build() {
            InventorySubnetCidrBlockSummary model =
                    new InventorySubnetCidrBlockSummary(this.ipCidrBlock, this.utilization);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InventorySubnetCidrBlockSummary model) {
            if (model.wasPropertyExplicitlySet("ipCidrBlock")) {
                this.ipCidrBlock(model.getIpCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("utilization")) {
                this.utilization(model.getUtilization());
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
     * The CIDR Prefix within a VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipCidrBlock")
    private final String ipCidrBlock;

    /**
     * The CIDR Prefix within a VCN.
     * @return the value
     **/
    public String getIpCidrBlock() {
        return ipCidrBlock;
    }

    /**
     * The CIDR utilization of a VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("utilization")
    private final Float utilization;

    /**
     * The CIDR utilization of a VCN.
     * @return the value
     **/
    public Float getUtilization() {
        return utilization;
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
        sb.append("InventorySubnetCidrBlockSummary(");
        sb.append("super=").append(super.toString());
        sb.append("ipCidrBlock=").append(String.valueOf(this.ipCidrBlock));
        sb.append(", utilization=").append(String.valueOf(this.utilization));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InventorySubnetCidrBlockSummary)) {
            return false;
        }

        InventorySubnetCidrBlockSummary other = (InventorySubnetCidrBlockSummary) o;
        return java.util.Objects.equals(this.ipCidrBlock, other.ipCidrBlock)
                && java.util.Objects.equals(this.utilization, other.utilization)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipCidrBlock == null ? 43 : this.ipCidrBlock.hashCode());
        result = (result * PRIME) + (this.utilization == null ? 43 : this.utilization.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
