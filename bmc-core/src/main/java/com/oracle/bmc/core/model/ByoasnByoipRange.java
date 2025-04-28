/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about 'ByoipRange' that has {@code byoasn} as origin. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ByoasnByoipRange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ByoasnByoipRange
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cidrBlock",
        "ipv6CidrBlock",
        "byoipRangeId",
        "asPathPrependLength"
    })
    public ByoasnByoipRange(
            String cidrBlock,
            String ipv6CidrBlock,
            String byoipRangeId,
            Integer asPathPrependLength) {
        super();
        this.cidrBlock = cidrBlock;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.byoipRangeId = byoipRangeId;
        this.asPathPrependLength = asPathPrependLength;
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
         * The IPv6 prefix being imported to the Oracle cloud. This prefix must be /48 or larger,
         * and can be subdivided into sub-ranges used across multiple VCNs. A BYOIPv6 prefix can be
         * assigned across multiple VCNs, and each VCN must be /64 or larger. You may specify a ULA
         * or private IPv6 prefix of /64 or larger to use in the VCN. IPv6-enabled subnets will
         * remain a fixed /64 in size.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * The IPv6 prefix being imported to the Oracle cloud. This prefix must be /48 or larger,
         * and can be subdivided into sub-ranges used across multiple VCNs. A BYOIPv6 prefix can be
         * assigned across multiple VCNs, and each VCN must be /64 or larger. You may specify a ULA
         * or private IPv6 prefix of /64 or larger to use in the VCN. IPv6-enabled subnets will
         * remain a fixed /64 in size.
         *
         * @param ipv6CidrBlock the value to set
         * @return this builder
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code ByoipRange} resource to which the CIDR block belongs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("byoipRangeId")
        private String byoipRangeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code ByoipRange} resource to which the CIDR block belongs.
         *
         * @param byoipRangeId the value to set
         * @return this builder
         */
        public Builder byoipRangeId(String byoipRangeId) {
            this.byoipRangeId = byoipRangeId;
            this.__explicitlySet__.add("byoipRangeId");
            return this;
        }
        /** The as path prepend length. */
        @com.fasterxml.jackson.annotation.JsonProperty("asPathPrependLength")
        private Integer asPathPrependLength;

        /**
         * The as path prepend length.
         *
         * @param asPathPrependLength the value to set
         * @return this builder
         */
        public Builder asPathPrependLength(Integer asPathPrependLength) {
            this.asPathPrependLength = asPathPrependLength;
            this.__explicitlySet__.add("asPathPrependLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByoasnByoipRange build() {
            ByoasnByoipRange model =
                    new ByoasnByoipRange(
                            this.cidrBlock,
                            this.ipv6CidrBlock,
                            this.byoipRangeId,
                            this.asPathPrependLength);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByoasnByoipRange model) {
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("ipv6CidrBlock")) {
                this.ipv6CidrBlock(model.getIpv6CidrBlock());
            }
            if (model.wasPropertyExplicitlySet("byoipRangeId")) {
                this.byoipRangeId(model.getByoipRangeId());
            }
            if (model.wasPropertyExplicitlySet("asPathPrependLength")) {
                this.asPathPrependLength(model.getAsPathPrependLength());
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
     * The IPv6 prefix being imported to the Oracle cloud. This prefix must be /48 or larger, and
     * can be subdivided into sub-ranges used across multiple VCNs. A BYOIPv6 prefix can be assigned
     * across multiple VCNs, and each VCN must be /64 or larger. You may specify a ULA or private
     * IPv6 prefix of /64 or larger to use in the VCN. IPv6-enabled subnets will remain a fixed /64
     * in size.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * The IPv6 prefix being imported to the Oracle cloud. This prefix must be /48 or larger, and
     * can be subdivided into sub-ranges used across multiple VCNs. A BYOIPv6 prefix can be assigned
     * across multiple VCNs, and each VCN must be /64 or larger. You may specify a ULA or private
     * IPv6 prefix of /64 or larger to use in the VCN. IPv6-enabled subnets will remain a fixed /64
     * in size.
     *
     * @return the value
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code ByoipRange} resource to which the CIDR block belongs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("byoipRangeId")
    private final String byoipRangeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code ByoipRange} resource to which the CIDR block belongs.
     *
     * @return the value
     */
    public String getByoipRangeId() {
        return byoipRangeId;
    }

    /** The as path prepend length. */
    @com.fasterxml.jackson.annotation.JsonProperty("asPathPrependLength")
    private final Integer asPathPrependLength;

    /**
     * The as path prepend length.
     *
     * @return the value
     */
    public Integer getAsPathPrependLength() {
        return asPathPrependLength;
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
        sb.append("ByoasnByoipRange(");
        sb.append("super=").append(super.toString());
        sb.append("cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", ipv6CidrBlock=").append(String.valueOf(this.ipv6CidrBlock));
        sb.append(", byoipRangeId=").append(String.valueOf(this.byoipRangeId));
        sb.append(", asPathPrependLength=").append(String.valueOf(this.asPathPrependLength));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ByoasnByoipRange)) {
            return false;
        }

        ByoasnByoipRange other = (ByoasnByoipRange) o;
        return java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.ipv6CidrBlock, other.ipv6CidrBlock)
                && java.util.Objects.equals(this.byoipRangeId, other.byoipRangeId)
                && java.util.Objects.equals(this.asPathPrependLength, other.asPathPrependLength)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlock == null ? 43 : this.ipv6CidrBlock.hashCode());
        result = (result * PRIME) + (this.byoipRangeId == null ? 43 : this.byoipRangeId.hashCode());
        result =
                (result * PRIME)
                        + (this.asPathPrependLength == null
                                ? 43
                                : this.asPathPrependLength.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
