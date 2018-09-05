/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The properties that define a load balancer. For more information, see
 * [Managing a Load Balancer](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/managingloadbalancer.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about endpoints and signing API requests, see
 * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
 * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LoadBalancer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LoadBalancer {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
        private java.util.Map<String, BackendSet> backendSets;

        public Builder backendSets(java.util.Map<String, BackendSet> backendSets) {
            this.backendSets = backendSets;
            this.__explicitlySet__.add("backendSets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificates")
        private java.util.Map<String, Certificate> certificates;

        public Builder certificates(java.util.Map<String, Certificate> certificates) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
        private java.util.Map<String, Hostname> hostnames;

        public Builder hostnames(java.util.Map<String, Hostname> hostnames) {
            this.hostnames = hostnames;
            this.__explicitlySet__.add("hostnames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
        private java.util.List<IpAddress> ipAddresses;

        public Builder ipAddresses(java.util.List<IpAddress> ipAddresses) {
            this.ipAddresses = ipAddresses;
            this.__explicitlySet__.add("ipAddresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
        private Boolean isPrivate;

        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            this.__explicitlySet__.add("isPrivate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.Map<String, Listener> listeners;

        public Builder listeners(java.util.Map<String, Listener> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSets")
        private java.util.Map<String, PathRouteSet> pathRouteSets;

        public Builder pathRouteSets(java.util.Map<String, PathRouteSet> pathRouteSets) {
            this.pathRouteSets = pathRouteSets;
            this.__explicitlySet__.add("pathRouteSets");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadBalancer build() {
            LoadBalancer __instance__ =
                    new LoadBalancer(
                            backendSets,
                            certificates,
                            compartmentId,
                            definedTags,
                            displayName,
                            freeformTags,
                            hostnames,
                            id,
                            ipAddresses,
                            isPrivate,
                            lifecycleState,
                            listeners,
                            pathRouteSets,
                            shapeName,
                            subnetIds,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancer o) {
            Builder copiedBuilder =
                    backendSets(o.getBackendSets())
                            .certificates(o.getCertificates())
                            .compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .hostnames(o.getHostnames())
                            .id(o.getId())
                            .ipAddresses(o.getIpAddresses())
                            .isPrivate(o.getIsPrivate())
                            .lifecycleState(o.getLifecycleState())
                            .listeners(o.getListeners())
                            .pathRouteSets(o.getPathRouteSets())
                            .shapeName(o.getShapeName())
                            .subnetIds(o.getSubnetIds())
                            .timeCreated(o.getTimeCreated());

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
    java.util.Map<String, BackendSet> backendSets;

    @com.fasterxml.jackson.annotation.JsonProperty("certificates")
    java.util.Map<String, Certificate> certificates;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * <p>
     * Example: `example_load_balancer`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    java.util.Map<String, Hostname> hostnames;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * An array of IP addresses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
    java.util.List<IpAddress> ipAddresses;

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
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
    Boolean isPrivate;
    /**
     * The current state of the load balancer.
     *
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
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
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
    /**
     * The current state of the load balancer.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    java.util.Map<String, Listener> listeners;

    @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSets")
    java.util.Map<String, PathRouteSet> pathRouteSets;

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

    /**
     * The date and time the load balancer was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
