/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The location for where an instance pool will place instances.
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
    builder = UpdateInstancePoolPlacementConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateInstancePoolPlacementConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
        private java.util.List<String> faultDomains;

        public Builder faultDomains(java.util.List<String> faultDomains) {
            this.faultDomains = faultDomains;
            this.__explicitlySet__.add("faultDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primarySubnetId")
        private String primarySubnetId;

        public Builder primarySubnetId(String primarySubnetId) {
            this.primarySubnetId = primarySubnetId;
            this.__explicitlySet__.add("primarySubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnicSubnets")
        private java.util.List<InstancePoolPlacementSecondaryVnicSubnet> secondaryVnicSubnets;

        public Builder secondaryVnicSubnets(
                java.util.List<InstancePoolPlacementSecondaryVnicSubnet> secondaryVnicSubnets) {
            this.secondaryVnicSubnets = secondaryVnicSubnets;
            this.__explicitlySet__.add("secondaryVnicSubnets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInstancePoolPlacementConfigurationDetails build() {
            UpdateInstancePoolPlacementConfigurationDetails __instance__ =
                    new UpdateInstancePoolPlacementConfigurationDetails(
                            availabilityDomain,
                            faultDomains,
                            primarySubnetId,
                            secondaryVnicSubnets);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInstancePoolPlacementConfigurationDetails o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .faultDomains(o.getFaultDomains())
                            .primarySubnetId(o.getPrimarySubnetId())
                            .secondaryVnicSubnets(o.getSecondaryVnicSubnets());

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
     * The availability domain to place instances.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The fault domains to place instances.
     * <p>
     * If you don't provide any values, the system makes a best effort to distribute
     * instances across all fault domains based on capacity.
     * <p>
     * To distribute the instances evenly across selected fault domains, provide a
     * set of fault domains. For example, you might want instances to be evenly
     * distributed if your applications require high availability.
     * <p>
     * To get a list of fault domains, use the
     * {@link #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation
     * in the Identity and Access Management Service API.
     * <p>
     * Example: `[FAULT-DOMAIN-1, FAULT-DOMAIN-2, FAULT-DOMAIN-3]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
    java.util.List<String> faultDomains;

    /**
     * The OCID of the primary subnet to place instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primarySubnetId")
    String primarySubnetId;

    /**
     * The set of subnet OCIDs for secondary VNICs for instances in the pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnicSubnets")
    java.util.List<InstancePoolPlacementSecondaryVnicSubnet> secondaryVnicSubnets;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
