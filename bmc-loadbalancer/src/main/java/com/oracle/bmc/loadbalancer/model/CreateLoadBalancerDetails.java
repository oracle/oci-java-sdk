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
public class CreateLoadBalancerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
        private java.util.Map<String, BackendSetDetails> backendSets;

        @com.fasterxml.jackson.annotation.JsonProperty("certificates")
        private java.util.Map<String, CertificateDetails> certificates;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
        private Boolean isPrivate;

        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.Map<String, ListenerDetails> listeners;

        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        public CreateLoadBalancerDetails build() {
            return new CreateLoadBalancerDetails(
                    backendSets,
                    certificates,
                    compartmentId,
                    displayName,
                    isPrivate,
                    listeners,
                    shapeName,
                    subnetIds);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLoadBalancerDetails o) {
            return backendSets(o.getBackendSets())
                    .certificates(o.getCertificates())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .isPrivate(o.getIsPrivate())
                    .listeners(o.getListeners())
                    .shapeName(o.getShapeName())
                    .subnetIds(o.getSubnetIds());
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: `My load balancer`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 1024)
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
     * hosts the secondary (stand-by) load balancer. A public load balancer is accessible from the internet, depending on your
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String shapeName;

    /**
     * An array of subnet [OCIDs](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<String> subnetIds;
}
