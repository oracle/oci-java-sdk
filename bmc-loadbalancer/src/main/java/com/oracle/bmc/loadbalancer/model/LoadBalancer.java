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
 * The properties that define a load balancer. For more information, see
 * [Managing a Load Balancer](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/managingloadbalancer.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * For information about endpoints and signing API requests, see
 * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
 * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = LoadBalancer.Builder.class)
public class LoadBalancer {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("backendSets")
        private Map<String, BackendSet> backendSets;

        @JsonProperty("certificates")
        private Map<String, Certificate> certificates;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("id")
        private String id;

        @JsonProperty("ipAddresses")
        private List<IpAddress> ipAddresses;

        @JsonProperty("isPrivate")
        private Boolean isPrivate;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("listeners")
        private Map<String, Listener> listeners;

        @JsonProperty("shapeName")
        private String shapeName;

        @JsonProperty("subnetIds")
        private List<String> subnetIds;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public LoadBalancer build() {
            return new LoadBalancer(
                    backendSets,
                    certificates,
                    compartmentId,
                    displayName,
                    id,
                    ipAddresses,
                    isPrivate,
                    lifecycleState,
                    listeners,
                    shapeName,
                    subnetIds,
                    timeCreated);
        }

        @JsonIgnore
        public Builder copy(LoadBalancer o) {
            return backendSets(o.getBackendSets())
                    .certificates(o.getCertificates())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .ipAddresses(o.getIpAddresses())
                    .isPrivate(o.getIsPrivate())
                    .lifecycleState(o.getLifecycleState())
                    .listeners(o.getListeners())
                    .shapeName(o.getShapeName())
                    .subnetIds(o.getSubnetIds())
                    .timeCreated(o.getTimeCreated());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @JsonProperty("backendSets")
    Map<String, BackendSet> backendSets;

    @JsonProperty("certificates")
    Map<String, Certificate> certificates;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer.
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

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the load balancer.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    String id;

    /**
     * An array of IP addresses.
     *
     **/
    @JsonProperty("ipAddresses")
    List<IpAddress> ipAddresses;

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
     *
     **/
    @JsonProperty("isPrivate")
    Boolean isPrivate;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Failed("FAILED"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static Map<String, LifecycleState> map;

        static {
            map = new HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    @JsonProperty("listeners")
    Map<String, Listener> listeners;

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
    List<String> subnetIds;

    /**
     * The date and time the load balancer was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
}
