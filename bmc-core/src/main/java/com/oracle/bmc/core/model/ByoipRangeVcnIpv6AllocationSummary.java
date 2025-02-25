/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A summary of IPv6 prefix subranges currently allocated to a VCN.
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
    builder = ByoipRangeVcnIpv6AllocationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ByoipRangeVcnIpv6AllocationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"byoipRangeId", "compartmentId", "ipv6CidrBlock", "vcnId"})
    public ByoipRangeVcnIpv6AllocationSummary(
            String byoipRangeId, String compartmentId, String ipv6CidrBlock, String vcnId) {
        super();
        this.byoipRangeId = byoipRangeId;
        this.compartmentId = compartmentId;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.vcnId = vcnId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource to which the CIDR block belongs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("byoipRangeId")
        private String byoipRangeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource to which the CIDR block belongs.
         * @param byoipRangeId the value to set
         * @return this builder
         **/
        public Builder byoipRangeId(String byoipRangeId) {
            this.byoipRangeId = byoipRangeId;
            this.__explicitlySet__.add("byoipRangeId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange}.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The BYOIPv6 prefix range or subrange allocated to a VCN. This could be all or part of a BYOIPv6 prefix.
         * Each VCN allocation must be /64 or larger.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * The BYOIPv6 prefix range or subrange allocated to a VCN. This could be all or part of a BYOIPv6 prefix.
         * Each VCN allocation must be /64 or larger.
         *
         * @param ipv6CidrBlock the value to set
         * @return this builder
         **/
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Vcn} resource to which the ByoipRange belongs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Vcn} resource to which the ByoipRange belongs.
         *
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByoipRangeVcnIpv6AllocationSummary build() {
            ByoipRangeVcnIpv6AllocationSummary model =
                    new ByoipRangeVcnIpv6AllocationSummary(
                            this.byoipRangeId, this.compartmentId, this.ipv6CidrBlock, this.vcnId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByoipRangeVcnIpv6AllocationSummary model) {
            if (model.wasPropertyExplicitlySet("byoipRangeId")) {
                this.byoipRangeId(model.getByoipRangeId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("ipv6CidrBlock")) {
                this.ipv6CidrBlock(model.getIpv6CidrBlock());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource to which the CIDR block belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byoipRangeId")
    private final String byoipRangeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource to which the CIDR block belongs.
     * @return the value
     **/
    public String getByoipRangeId() {
        return byoipRangeId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange}.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The BYOIPv6 prefix range or subrange allocated to a VCN. This could be all or part of a BYOIPv6 prefix.
     * Each VCN allocation must be /64 or larger.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * The BYOIPv6 prefix range or subrange allocated to a VCN. This could be all or part of a BYOIPv6 prefix.
     * Each VCN allocation must be /64 or larger.
     *
     * @return the value
     **/
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Vcn} resource to which the ByoipRange belongs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Vcn} resource to which the ByoipRange belongs.
     *
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
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
        sb.append("ByoipRangeVcnIpv6AllocationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("byoipRangeId=").append(String.valueOf(this.byoipRangeId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", ipv6CidrBlock=").append(String.valueOf(this.ipv6CidrBlock));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ByoipRangeVcnIpv6AllocationSummary)) {
            return false;
        }

        ByoipRangeVcnIpv6AllocationSummary other = (ByoipRangeVcnIpv6AllocationSummary) o;
        return java.util.Objects.equals(this.byoipRangeId, other.byoipRangeId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.ipv6CidrBlock, other.ipv6CidrBlock)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.byoipRangeId == null ? 43 : this.byoipRangeId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlock == null ? 43 : this.ipv6CidrBlock.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
