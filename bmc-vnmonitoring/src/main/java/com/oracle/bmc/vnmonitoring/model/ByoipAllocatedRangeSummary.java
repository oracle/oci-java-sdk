/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * A summary of CIDR block subranges that are currently allocated to an IP pool. <br>
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
        builder = ByoipAllocatedRangeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ByoipAllocatedRangeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
         * The BYOIP CIDR block range or subrange allocated to an IP pool. This could be all or part
         * of a BYOIP CIDR block.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * The BYOIP CIDR block range or subrange allocated to an IP pool. This could be all or part
         * of a BYOIP CIDR block.
         *
         * @param cidrBlock the value to set
         * @return this builder
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IP pool containing the CIDR block.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicIpPoolId")
        private String publicIpPoolId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IP pool containing the CIDR block.
         *
         * @param publicIpPoolId the value to set
         * @return this builder
         */
        public Builder publicIpPoolId(String publicIpPoolId) {
            this.publicIpPoolId = publicIpPoolId;
            this.__explicitlySet__.add("publicIpPoolId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByoipAllocatedRangeSummary build() {
            ByoipAllocatedRangeSummary model =
                    new ByoipAllocatedRangeSummary(this.cidrBlock, this.publicIpPoolId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByoipAllocatedRangeSummary model) {
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("publicIpPoolId")) {
                this.publicIpPoolId(model.getPublicIpPoolId());
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
     * The BYOIP CIDR block range or subrange allocated to an IP pool. This could be all or part of
     * a BYOIP CIDR block.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * The BYOIP CIDR block range or subrange allocated to an IP pool. This could be all or part of
     * a BYOIP CIDR block.
     *
     * @return the value
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP
     * pool containing the CIDR block.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicIpPoolId")
    private final String publicIpPoolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP
     * pool containing the CIDR block.
     *
     * @return the value
     */
    public String getPublicIpPoolId() {
        return publicIpPoolId;
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
        sb.append("ByoipAllocatedRangeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", publicIpPoolId=").append(String.valueOf(this.publicIpPoolId));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.publicIpPoolId == null ? 43 : this.publicIpPoolId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
