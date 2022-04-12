/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details used when adding a ULA or private IPv6 prefix or an IPv6 GUA assigned by Oracle or a BYOIPv6 prefix. You can add only one of these per request.
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
    builder = AddVcnIpv6CidrDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AddVcnIpv6CidrDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6PrivateCidrBlock")
        private String ipv6PrivateCidrBlock;

        public Builder ipv6PrivateCidrBlock(String ipv6PrivateCidrBlock) {
            this.ipv6PrivateCidrBlock = ipv6PrivateCidrBlock;
            this.__explicitlySet__.add("ipv6PrivateCidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOracleGuaAllocationEnabled")
        private Boolean isOracleGuaAllocationEnabled;

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
            AddVcnIpv6CidrDetails __instance__ =
                    new AddVcnIpv6CidrDetails(
                            ipv6PrivateCidrBlock, isOracleGuaAllocationEnabled, byoipv6CidrDetail);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddVcnIpv6CidrDetails o) {
            Builder copiedBuilder =
                    ipv6PrivateCidrBlock(o.getIpv6PrivateCidrBlock())
                            .isOracleGuaAllocationEnabled(o.getIsOracleGuaAllocationEnabled())
                            .byoipv6CidrDetail(o.getByoipv6CidrDetail());

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
     * This field is not required and should only be specified if a ULA or private IPv6 prefix is desired for VCN's private IP address space.
     * See[IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:0db8:0123::/48} or {@code fd00:1000:0:1::/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6PrivateCidrBlock")
    String ipv6PrivateCidrBlock;

    /**
     * Indicates whether Oracle will allocate an IPv6 GUA. Only one prefix of /56 size can be allocated by Oracle as a GUA.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOracleGuaAllocationEnabled")
    Boolean isOracleGuaAllocationEnabled;

    @com.fasterxml.jackson.annotation.JsonProperty("byoipv6CidrDetail")
    Byoipv6CidrDetails byoipv6CidrDetail;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
