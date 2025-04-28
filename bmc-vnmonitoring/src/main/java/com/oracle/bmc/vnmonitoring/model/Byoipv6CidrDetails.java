/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The list of one or more BYOIPv6 CIDR blocks for the VCN that meets the following criteria: - The
 * CIDR must from a BYOIPv6 range. - The IPv6 CIDR blocks must be valid. - Multiple CIDR blocks must
 * not overlap each other or the on-premises network CIDR block. - The number of CIDR blocks must
 * not exceed the limit of IPv6 CIDR blocks allowed to a VCN. <br>
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
        builder = Byoipv6CidrDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Byoipv6CidrDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"byoipv6RangeId", "ipv6CidrBlock"})
    public Byoipv6CidrDetails(String byoipv6RangeId, String ipv6CidrBlock) {
        super();
        this.byoipv6RangeId = byoipv6RangeId;
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code ByoipRange} resource to which the CIDR block belongs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("byoipv6RangeId")
        private String byoipv6RangeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code ByoipRange} resource to which the CIDR block belongs.
         *
         * @param byoipv6RangeId the value to set
         * @return this builder
         */
        public Builder byoipv6RangeId(String byoipv6RangeId) {
            this.byoipv6RangeId = byoipv6RangeId;
            this.__explicitlySet__.add("byoipv6RangeId");
            return this;
        }
        /**
         * An IPv6 CIDR block required to create a VCN with a BYOIP prefix. It could be the whole
         * CIDR block identified in {@code byoipv6RangeId}, or a subrange. Example: {@code
         * 2001:0db8:0123::/48}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * An IPv6 CIDR block required to create a VCN with a BYOIP prefix. It could be the whole
         * CIDR block identified in {@code byoipv6RangeId}, or a subrange. Example: {@code
         * 2001:0db8:0123::/48}
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

        public Byoipv6CidrDetails build() {
            Byoipv6CidrDetails model =
                    new Byoipv6CidrDetails(this.byoipv6RangeId, this.ipv6CidrBlock);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Byoipv6CidrDetails model) {
            if (model.wasPropertyExplicitlySet("byoipv6RangeId")) {
                this.byoipv6RangeId(model.getByoipv6RangeId());
            }
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code ByoipRange} resource to which the CIDR block belongs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("byoipv6RangeId")
    private final String byoipv6RangeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code ByoipRange} resource to which the CIDR block belongs.
     *
     * @return the value
     */
    public String getByoipv6RangeId() {
        return byoipv6RangeId;
    }

    /**
     * An IPv6 CIDR block required to create a VCN with a BYOIP prefix. It could be the whole CIDR
     * block identified in {@code byoipv6RangeId}, or a subrange. Example: {@code
     * 2001:0db8:0123::/48}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * An IPv6 CIDR block required to create a VCN with a BYOIP prefix. It could be the whole CIDR
     * block identified in {@code byoipv6RangeId}, or a subrange. Example: {@code
     * 2001:0db8:0123::/48}
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
        sb.append("Byoipv6CidrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("byoipv6RangeId=").append(String.valueOf(this.byoipv6RangeId));
        sb.append(", ipv6CidrBlock=").append(String.valueOf(this.ipv6CidrBlock));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Byoipv6CidrDetails)) {
            return false;
        }

        Byoipv6CidrDetails other = (Byoipv6CidrDetails) o;
        return java.util.Objects.equals(this.byoipv6RangeId, other.byoipv6RangeId)
                && java.util.Objects.equals(this.ipv6CidrBlock, other.ipv6CidrBlock)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.byoipv6RangeId == null ? 43 : this.byoipv6RangeId.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlock == null ? 43 : this.ipv6CidrBlock.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
