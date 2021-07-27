/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * The configuration details for a new bastion. A bastion provides secured, public access to target resources in the cloud that you cannot otherwise reach from the internet. A bastion resides in a public subnet and establishes the network infrastructure needed to connect a user to a target resource in a private subnet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateBastionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateBastionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bastionType")
        private String bastionType;

        public Builder bastionType(String bastionType) {
            this.bastionType = bastionType;
            this.__explicitlySet__.add("bastionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetSubnetId")
        private String targetSubnetId;

        public Builder targetSubnetId(String targetSubnetId) {
            this.targetSubnetId = targetSubnetId;
            this.__explicitlySet__.add("targetSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phoneBookEntry")
        private String phoneBookEntry;

        public Builder phoneBookEntry(String phoneBookEntry) {
            this.phoneBookEntry = phoneBookEntry;
            this.__explicitlySet__.add("phoneBookEntry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("staticJumpHostIpAddresses")
        private java.util.List<String> staticJumpHostIpAddresses;

        public Builder staticJumpHostIpAddresses(java.util.List<String> staticJumpHostIpAddresses) {
            this.staticJumpHostIpAddresses = staticJumpHostIpAddresses;
            this.__explicitlySet__.add("staticJumpHostIpAddresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientCidrBlockAllowList")
        private java.util.List<String> clientCidrBlockAllowList;

        public Builder clientCidrBlockAllowList(java.util.List<String> clientCidrBlockAllowList) {
            this.clientCidrBlockAllowList = clientCidrBlockAllowList;
            this.__explicitlySet__.add("clientCidrBlockAllowList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxSessionTtlInSeconds")
        private Integer maxSessionTtlInSeconds;

        public Builder maxSessionTtlInSeconds(Integer maxSessionTtlInSeconds) {
            this.maxSessionTtlInSeconds = maxSessionTtlInSeconds;
            this.__explicitlySet__.add("maxSessionTtlInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBastionDetails build() {
            CreateBastionDetails __instance__ =
                    new CreateBastionDetails(
                            bastionType,
                            name,
                            compartmentId,
                            targetSubnetId,
                            phoneBookEntry,
                            staticJumpHostIpAddresses,
                            clientCidrBlockAllowList,
                            maxSessionTtlInSeconds,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBastionDetails o) {
            Builder copiedBuilder =
                    bastionType(o.getBastionType())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .targetSubnetId(o.getTargetSubnetId())
                            .phoneBookEntry(o.getPhoneBookEntry())
                            .staticJumpHostIpAddresses(o.getStaticJumpHostIpAddresses())
                            .clientCidrBlockAllowList(o.getClientCidrBlockAllowList())
                            .maxSessionTtlInSeconds(o.getMaxSessionTtlInSeconds())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The type of bastion. Use {@code standard}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bastionType")
    String bastionType;

    /**
     * The name of the bastion, which can't be changed after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The unique identifier (OCID) of the compartment where the bastion is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The unique identifier (OCID) of the subnet that the bastion connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetSubnetId")
    String targetSubnetId;

    /**
     * The phonebook entry of the customer's team, which can't be changed after creation. Not applicable to {@code standard} bastions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phoneBookEntry")
    String phoneBookEntry;

    /**
     * A list of IP addresses of the hosts that the bastion has access to. Not applicable to {@code standard} bastions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("staticJumpHostIpAddresses")
    java.util.List<String> staticJumpHostIpAddresses;

    /**
     * A list of address ranges in CIDR notation that you want to allow to connect to sessions hosted by this bastion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientCidrBlockAllowList")
    java.util.List<String> clientCidrBlockAllowList;

    /**
     * The maximum amount of time that any session on the bastion can remain active.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSessionTtlInSeconds")
    Integer maxSessionTtlInSeconds;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
