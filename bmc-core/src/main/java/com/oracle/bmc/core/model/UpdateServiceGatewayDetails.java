/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateServiceGatewayDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateServiceGatewayDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("blockTraffic")
        private Boolean blockTraffic;

        public Builder blockTraffic(Boolean blockTraffic) {
            this.blockTraffic = blockTraffic;
            this.__explicitlySet__.add("blockTraffic");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<ServiceIdRequestDetails> services;

        public Builder services(java.util.List<ServiceIdRequestDetails> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateServiceGatewayDetails build() {
            UpdateServiceGatewayDetails __instance__ =
                    new UpdateServiceGatewayDetails(
                            blockTraffic,
                            definedTags,
                            displayName,
                            freeformTags,
                            routeTableId,
                            services);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateServiceGatewayDetails o) {
            Builder copiedBuilder =
                    blockTraffic(o.getBlockTraffic())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .routeTableId(o.getRouteTableId())
                            .services(o.getServices());

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
     * Whether the service gateway blocks all traffic through it. The default is `false`. When
     * this is `true`, traffic is not routed to any services, regardless of route rules.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockTraffic")
    Boolean blockTraffic;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The OCID of the route table the service gateway will use.
     * For information about why you would associate a route table with a service gateway, see
     * [Transit Routing: Private Access to Oracle Services](https://docs.cloud.oracle.com/Content/Network/Tasks/transitroutingoracleservices.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    String routeTableId;

    /**
     * List of all the `Service` objects you want enabled on this service gateway. Sending an empty list
     * means you want to disable all services. Omitting this parameter entirely keeps the
     * existing list of services intact.
     * <p>
     * You can also enable or disable a particular `Service` by using
     * {@link #attachServiceId(AttachServiceIdRequest) attachServiceId} or
     * {@link #detachServiceId(DetachServiceIdRequest) detachServiceId}.
     * <p>
     * For each enabled `Service`, make sure there's a route rule with the `Service` object's `cidrBlock`
     * as the rule's destination and the service gateway as the rule's target. See
     * {@link RouteTable}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    java.util.List<ServiceIdRequestDetails> services;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
