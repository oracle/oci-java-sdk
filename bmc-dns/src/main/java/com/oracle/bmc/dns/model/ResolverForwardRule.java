/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResolverForwardRule.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResolverForwardRule extends ResolverRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("clientAddressConditions")
        private java.util.List<String> clientAddressConditions;

        public Builder clientAddressConditions(java.util.List<String> clientAddressConditions) {
            this.clientAddressConditions = clientAddressConditions;
            this.__explicitlySet__.add("clientAddressConditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("qnameCoverConditions")
        private java.util.List<String> qnameCoverConditions;

        public Builder qnameCoverConditions(java.util.List<String> qnameCoverConditions) {
            this.qnameCoverConditions = qnameCoverConditions;
            this.__explicitlySet__.add("qnameCoverConditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationAddresses")
        private java.util.List<String> destinationAddresses;

        public Builder destinationAddresses(java.util.List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            this.__explicitlySet__.add("destinationAddresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceEndpointName")
        private String sourceEndpointName;

        public Builder sourceEndpointName(String sourceEndpointName) {
            this.sourceEndpointName = sourceEndpointName;
            this.__explicitlySet__.add("sourceEndpointName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResolverForwardRule build() {
            ResolverForwardRule __instance__ =
                    new ResolverForwardRule(
                            clientAddressConditions,
                            qnameCoverConditions,
                            destinationAddresses,
                            sourceEndpointName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResolverForwardRule o) {
            Builder copiedBuilder =
                    clientAddressConditions(o.getClientAddressConditions())
                            .qnameCoverConditions(o.getQnameCoverConditions())
                            .destinationAddresses(o.getDestinationAddresses())
                            .sourceEndpointName(o.getSourceEndpointName());

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

    @Deprecated
    public ResolverForwardRule(
            java.util.List<String> clientAddressConditions,
            java.util.List<String> qnameCoverConditions,
            java.util.List<String> destinationAddresses,
            String sourceEndpointName) {
        super(clientAddressConditions, qnameCoverConditions);
        this.destinationAddresses = destinationAddresses;
        this.sourceEndpointName = sourceEndpointName;
    }

    /**
     * IP addresses to which queries should be forwarded. Currently limited to a single address.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationAddresses")
    java.util.List<String> destinationAddresses;

    /**
     * Case-insensitive name of an endpoint, that is a sub-resource of the resolver, to use as the forwarding
     * interface. The endpoint must have isForwarding set to true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEndpointName")
    String sourceEndpointName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
