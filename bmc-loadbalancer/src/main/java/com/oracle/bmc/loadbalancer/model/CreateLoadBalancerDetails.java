/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * The configuration details for creating a load balancer.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = CreateLoadBalancerDetails.Builder.class)
public class CreateLoadBalancerDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("backendSets")
        private Map<String, BackendSetDetails> backendSets;

        @JsonProperty("certificates")
        private Map<String, CertificateDetails> certificates;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("listeners")
        private Map<String, ListenerDetails> listeners;

        @JsonProperty("shapeName")
        private String shapeName;

        @JsonProperty("subnetIds")
        private List<String> subnetIds;

        public CreateLoadBalancerDetails build() {
            return new CreateLoadBalancerDetails(
                    backendSets,
                    certificates,
                    compartmentId,
                    displayName,
                    listeners,
                    shapeName,
                    subnetIds);
        }

        @JsonIgnore
        public Builder copy(CreateLoadBalancerDetails o) {
            return backendSets(o.getBackendSets())
                    .certificates(o.getCertificates())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
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

    @JsonProperty("backendSets")
    Map<String, BackendSetDetails> backendSets;

    @JsonProperty("certificates")
    Map<String, CertificateDetails> certificates;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * <p>
     * Example: `My load balancer`
     *
     **/
    @JsonProperty("displayName")
    @Valid
    @NotNull
    String displayName;

    @JsonProperty("listeners")
    Map<String, ListenerDetails> listeners;

    /**
     * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
     * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
     * operation.
     * <p>
     * Example: `100Mbps`
     *
     **/
    @JsonProperty("shapeName")
    @Valid
    @NotNull
    String shapeName;

    /**
     * An array of subnet [OCIDs](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     **/
    @JsonProperty("subnetIds")
    @Valid
    @NotNull
    List<String> subnetIds;
}
