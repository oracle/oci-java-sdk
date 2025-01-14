/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Details used when adding a ULA or private IPv6 prefix or an IPv6 GUA assigned by Oracle or a
 * BYOIPv6 prefix. You can add only one of these per request. <br>
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
        builder = AddVcnIpv6CidrDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddVcnIpv6CidrDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ipv6PrivateCidrBlock",
        "isOracleGuaAllocationEnabled",
        "byoipv6CidrDetail"
    })
    public AddVcnIpv6CidrDetails(
            String ipv6PrivateCidrBlock,
            Boolean isOracleGuaAllocationEnabled,
            Byoipv6CidrDetails byoipv6CidrDetail) {
        super();
        this.ipv6PrivateCidrBlock = ipv6PrivateCidrBlock;
        this.isOracleGuaAllocationEnabled = isOracleGuaAllocationEnabled;
        this.byoipv6CidrDetail = byoipv6CidrDetail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This field is not required and should only be specified if a ULA or private IPv6 prefix
         * is desired for VCN's private IP address space. See[IPv6
         * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 2001:0db8:0123::/48} or {@code fd00:1000:0:1::/64}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6PrivateCidrBlock")
        private String ipv6PrivateCidrBlock;

        /**
         * This field is not required and should only be specified if a ULA or private IPv6 prefix
         * is desired for VCN's private IP address space. See[IPv6
         * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 2001:0db8:0123::/48} or {@code fd00:1000:0:1::/64}
         *
         * @param ipv6PrivateCidrBlock the value to set
         * @return this builder
         */
        public Builder ipv6PrivateCidrBlock(String ipv6PrivateCidrBlock) {
            this.ipv6PrivateCidrBlock = ipv6PrivateCidrBlock;
            this.__explicitlySet__.add("ipv6PrivateCidrBlock");
            return this;
        }
        /**
         * Indicates whether Oracle will allocate an IPv6 GUA. Only one prefix of /56 size can be
         * allocated by Oracle as a GUA.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOracleGuaAllocationEnabled")
        private Boolean isOracleGuaAllocationEnabled;

        /**
         * Indicates whether Oracle will allocate an IPv6 GUA. Only one prefix of /56 size can be
         * allocated by Oracle as a GUA.
         *
         * @param isOracleGuaAllocationEnabled the value to set
         * @return this builder
         */
        public Builder isOracleGuaAllocationEnabled(Boolean isOracleGuaAllocationEnabled) {
            this.isOracleGuaAllocationEnabled = isOracleGuaAllocationEnabled;
            this.__explicitlySet__.add("isOracleGuaAllocationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("byoipv6CidrDetail")
        private Byoipv6CidrDetails byoipv6CidrDetail;

        public Builder byoipv6CidrDetail(Byoipv6CidrDetails byoipv6CidrDetail) {
            this.byoipv6CidrDetail = byoipv6CidrDetail;
            this.__explicitlySet__.add("byoipv6CidrDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddVcnIpv6CidrDetails build() {
            AddVcnIpv6CidrDetails model =
                    new AddVcnIpv6CidrDetails(
                            this.ipv6PrivateCidrBlock,
                            this.isOracleGuaAllocationEnabled,
                            this.byoipv6CidrDetail);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddVcnIpv6CidrDetails model) {
            if (model.wasPropertyExplicitlySet("ipv6PrivateCidrBlock")) {
                this.ipv6PrivateCidrBlock(model.getIpv6PrivateCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("isOracleGuaAllocationEnabled")) {
                this.isOracleGuaAllocationEnabled(model.getIsOracleGuaAllocationEnabled());
            }
            if (model.wasPropertyExplicitlySet("byoipv6CidrDetail")) {
                this.byoipv6CidrDetail(model.getByoipv6CidrDetail());
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
     * This field is not required and should only be specified if a ULA or private IPv6 prefix is
     * desired for VCN's private IP address space. See[IPv6
     * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 2001:0db8:0123::/48} or {@code fd00:1000:0:1::/64}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6PrivateCidrBlock")
    private final String ipv6PrivateCidrBlock;

    /**
     * This field is not required and should only be specified if a ULA or private IPv6 prefix is
     * desired for VCN's private IP address space. See[IPv6
     * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 2001:0db8:0123::/48} or {@code fd00:1000:0:1::/64}
     *
     * @return the value
     */
    public String getIpv6PrivateCidrBlock() {
        return ipv6PrivateCidrBlock;
    }

    /**
     * Indicates whether Oracle will allocate an IPv6 GUA. Only one prefix of /56 size can be
     * allocated by Oracle as a GUA.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOracleGuaAllocationEnabled")
    private final Boolean isOracleGuaAllocationEnabled;

    /**
     * Indicates whether Oracle will allocate an IPv6 GUA. Only one prefix of /56 size can be
     * allocated by Oracle as a GUA.
     *
     * @return the value
     */
    public Boolean getIsOracleGuaAllocationEnabled() {
        return isOracleGuaAllocationEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("byoipv6CidrDetail")
    private final Byoipv6CidrDetails byoipv6CidrDetail;

    public Byoipv6CidrDetails getByoipv6CidrDetail() {
        return byoipv6CidrDetail;
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
        sb.append("AddVcnIpv6CidrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ipv6PrivateCidrBlock=").append(String.valueOf(this.ipv6PrivateCidrBlock));
        sb.append(", isOracleGuaAllocationEnabled=")
                .append(String.valueOf(this.isOracleGuaAllocationEnabled));
        sb.append(", byoipv6CidrDetail=").append(String.valueOf(this.byoipv6CidrDetail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddVcnIpv6CidrDetails)) {
            return false;
        }

        AddVcnIpv6CidrDetails other = (AddVcnIpv6CidrDetails) o;
        return java.util.Objects.equals(this.ipv6PrivateCidrBlock, other.ipv6PrivateCidrBlock)
                && java.util.Objects.equals(
                        this.isOracleGuaAllocationEnabled, other.isOracleGuaAllocationEnabled)
                && java.util.Objects.equals(this.byoipv6CidrDetail, other.byoipv6CidrDetail)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ipv6PrivateCidrBlock == null
                                ? 43
                                : this.ipv6PrivateCidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.isOracleGuaAllocationEnabled == null
                                ? 43
                                : this.isOracleGuaAllocationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.byoipv6CidrDetail == null ? 43 : this.byoipv6CidrDetail.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
