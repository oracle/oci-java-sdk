/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A summary of IPv6 CIDR block subranges currently allocated to a VCN.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ByoipRangeVcnIpv6AllocationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ByoipRangeVcnIpv6AllocationSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("byoipRangeId")
        private String byoipRangeId;

        public Builder byoipRangeId(String byoipRangeId) {
            this.byoipRangeId = byoipRangeId;
            this.__explicitlySet__.add("byoipRangeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByoipRangeVcnIpv6AllocationSummary build() {
            ByoipRangeVcnIpv6AllocationSummary __instance__ =
                    new ByoipRangeVcnIpv6AllocationSummary(
                            byoipRangeId, compartmentId, ipv6CidrBlock, vcnId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByoipRangeVcnIpv6AllocationSummary o) {
            Builder copiedBuilder =
                    byoipRangeId(o.getByoipRangeId())
                            .compartmentId(o.getCompartmentId())
                            .ipv6CidrBlock(o.getIpv6CidrBlock())
                            .vcnId(o.getVcnId());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource to which the CIDR block belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byoipRangeId")
    String byoipRangeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The BYOIPv6 CIDR block range or subrange allocated to a VCN. This could be all or part of a BYOIPv6 CIDR block.
     * Each VCN allocation must be /64 or larger.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    String ipv6CidrBlock;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Vcn} resource to which the ByoipRange belongs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
