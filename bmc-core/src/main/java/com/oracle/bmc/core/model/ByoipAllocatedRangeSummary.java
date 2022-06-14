/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A summary of CIDR block subranges that are currently allocated to an IP pool.
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
    builder = ByoipAllocatedRangeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ByoipAllocatedRangeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"cidrBlock", "publicIpPoolId"})
    public ByoipAllocatedRangeSummary(String cidrBlock, String publicIpPoolId) {
        super();
        this.cidrBlock = cidrBlock;
        this.publicIpPoolId = publicIpPoolId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The BYOIP CIDR block range or subrange allocated to an IP pool. This could be all or part of a BYOIP CIDR block.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * The BYOIP CIDR block range or subrange allocated to an IP pool. This could be all or part of a BYOIP CIDR block.
         * @param cidrBlock the value to set
         * @return this builder
         **/
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP pool containing the CIDR block.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicIpPoolId")
        private String publicIpPoolId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP pool containing the CIDR block.
         *
         * @param publicIpPoolId the value to set
         * @return this builder
         **/
        public Builder publicIpPoolId(String publicIpPoolId) {
            this.publicIpPoolId = publicIpPoolId;
            this.__explicitlySet__.add("publicIpPoolId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByoipAllocatedRangeSummary build() {
            ByoipAllocatedRangeSummary __instance__ =
                    new ByoipAllocatedRangeSummary(cidrBlock, publicIpPoolId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByoipAllocatedRangeSummary o) {
            Builder copiedBuilder =
                    cidrBlock(o.getCidrBlock()).publicIpPoolId(o.getPublicIpPoolId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The BYOIP CIDR block range or subrange allocated to an IP pool. This could be all or part of a BYOIP CIDR block.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * The BYOIP CIDR block range or subrange allocated to an IP pool. This could be all or part of a BYOIP CIDR block.
     * @return the value
     **/
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP pool containing the CIDR block.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIpPoolId")
    private final String publicIpPoolId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP pool containing the CIDR block.
     *
     * @return the value
     **/
    public String getPublicIpPoolId() {
        return publicIpPoolId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ByoipAllocatedRangeSummary(");
        sb.append("cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", publicIpPoolId=").append(String.valueOf(this.publicIpPoolId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ByoipAllocatedRangeSummary)) {
            return false;
        }

        ByoipAllocatedRangeSummary other = (ByoipAllocatedRangeSummary) o;
        return java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.publicIpPoolId, other.publicIpPoolId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.publicIpPoolId == null ? 43 : this.publicIpPoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
