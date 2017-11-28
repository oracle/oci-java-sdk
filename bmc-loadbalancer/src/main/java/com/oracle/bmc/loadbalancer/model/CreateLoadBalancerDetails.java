/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for creating a load balancer.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateLoadBalancerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateLoadBalancerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
        private java.util.Map<String, BackendSetDetails> backendSets;

        public Builder backendSets(java.util.Map<String, BackendSetDetails> backendSets) {
            this.backendSets = backendSets;
            this.__explicitlySet__.add("backendSets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificates")
        private java.util.Map<String, CertificateDetails> certificates;

        public Builder certificates(java.util.Map<String, CertificateDetails> certificates) {
            this.certificates = certificates;
            this.__explicitlySet__.add("certificates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
        private Boolean isPrivate;

        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            this.__explicitlySet__.add("isPrivate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.Map<String, ListenerDetails> listeners;

        public Builder listeners(java.util.Map<String, ListenerDetails> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLoadBalancerDetails build() {
            CreateLoadBalancerDetails __instance__ =
                    new CreateLoadBalancerDetails(
                            backendSets,
                            certificates,
                            compartmentId,
                            displayName,
                            isPrivate,
                            listeners,
                            shapeName,
                            subnetIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLoadBalancerDetails o) {
            Builder copiedBuilder =
                    backendSets(o.getBackendSets())
                            .certificates(o.getCertificates())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .isPrivate(o.getIsPrivate())
                            .listeners(o.getListeners())
                            .shapeName(o.getShapeName())
                            .subnetIds(o.getSubnetIds());

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

    @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
    java.util.Map<String, BackendSetDetails> backendSets;

    @com.fasterxml.jackson.annotation.JsonProperty("certificates")
    java.util.Map<String, CertificateDetails> certificates;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: `My load balancer`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Whether the load balancer has a VCN-local (private) IP address.
     * <p>
     * If \"true\", the service assigns a private IP address to the load balancer. The load balancer requires only one subnet
     * to host both the primary and secondary load balancers. The private IP address is local to the subnet. The load balancer
     * is accessible only from within the VCN that contains the associated subnet, or as further restricted by your security
     * list rules. The load balancer can route traffic to any backend server that is reachable from the VCN.
     * <p>
     * For a private load balancer, both the primary and secondary load balancer hosts are within the same Availability Domain.
     * <p>
     * If \"false\", the service assigns a public IP address to the load balancer. A load balancer with a public IP address
     * requires two subnets, each in a different Availability Domain. One subnet hosts the primary load balancer and the other
     * hosts the secondary (standby) load balancer. A public load balancer is accessible from the internet, depending on your
     * VCN's [security list rules](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/securitylists.htm).
     * <p>
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
    Boolean isPrivate;

    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    java.util.Map<String, ListenerDetails> listeners;

    /**
     * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
     * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
     * operation.
     * <p>
     * Example: `100Mbps`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    String shapeName;

    /**
     * An array of subnet [OCIDs](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    java.util.List<String> subnetIds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
