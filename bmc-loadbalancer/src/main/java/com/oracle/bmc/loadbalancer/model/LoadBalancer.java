/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The properties that define a load balancer. For more information, see
 * [Managing a Load Balancer](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingloadbalancer.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about endpoints and signing API requests, see
 * [About the API](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
 * [SDKS and Other Tools](https://docs.cloud.oracle.com/Content/API/Concepts/sdks.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LoadBalancer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LoadBalancer {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "timeCreated",
        "ipAddresses",
        "shapeName",
        "shapeDetails",
        "isPrivate",
        "subnetIds",
        "networkSecurityGroupIds",
        "listeners",
        "hostnames",
        "sslCipherSuites",
        "certificates",
        "backendSets",
        "pathRouteSets",
        "freeformTags",
        "definedTags",
        "systemTags",
        "ruleSets",
        "routingPolicies"
    })
    public LoadBalancer(
            String id,
            String compartmentId,
            String displayName,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.List<IpAddress> ipAddresses,
            String shapeName,
            ShapeDetails shapeDetails,
            Boolean isPrivate,
            java.util.List<String> subnetIds,
            java.util.List<String> networkSecurityGroupIds,
            java.util.Map<String, Listener> listeners,
            java.util.Map<String, Hostname> hostnames,
            java.util.Map<String, SSLCipherSuite> sslCipherSuites,
            java.util.Map<String, Certificate> certificates,
            java.util.Map<String, BackendSet> backendSets,
            java.util.Map<String, PathRouteSet> pathRouteSets,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Map<String, RuleSet> ruleSets,
            java.util.Map<String, RoutingPolicy> routingPolicies) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.ipAddresses = ipAddresses;
        this.shapeName = shapeName;
        this.shapeDetails = shapeDetails;
        this.isPrivate = isPrivate;
        this.subnetIds = subnetIds;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.listeners = listeners;
        this.hostnames = hostnames;
        this.sslCipherSuites = sslCipherSuites;
        this.certificates = certificates;
        this.backendSets = backendSets;
        this.pathRouteSets = pathRouteSets;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.ruleSets = ruleSets;
        this.routingPolicies = routingPolicies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * <p>
         * Example: {@code example_load_balancer}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * <p>
         * Example: {@code example_load_balancer}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The current state of the load balancer.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the load balancer.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the load balancer was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the load balancer was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * An array of IP addresses.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
        private java.util.List<IpAddress> ipAddresses;

        /**
         * An array of IP addresses.
         *
         * @param ipAddresses the value to set
         * @return this builder
         **/
        public Builder ipAddresses(java.util.List<IpAddress> ipAddresses) {
            this.ipAddresses = ipAddresses;
            this.__explicitlySet__.add("ipAddresses");
            return this;
        }
        /**
         * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
         * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
         * operation.
         * <p>
         * Example: {@code 100Mbps}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
         * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
         * operation.
         * <p>
         * Example: {@code 100Mbps}
         *
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeDetails")
        private ShapeDetails shapeDetails;

        public Builder shapeDetails(ShapeDetails shapeDetails) {
            this.shapeDetails = shapeDetails;
            this.__explicitlySet__.add("shapeDetails");
            return this;
        }
        /**
         * Whether the load balancer has a VCN-local (private) IP address.
         * <p>
         * If "true", the service assigns a private IP address to the load balancer.
         * <p>
         * If "false", the service assigns a public IP address to the load balancer.
         * <p>
         * A public load balancer is accessible from the internet, depending on your VCN's
         * [security list rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securitylists.htm). For more information about public and
         * private load balancers, see [How Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
        private Boolean isPrivate;

        /**
         * Whether the load balancer has a VCN-local (private) IP address.
         * <p>
         * If "true", the service assigns a private IP address to the load balancer.
         * <p>
         * If "false", the service assigns a public IP address to the load balancer.
         * <p>
         * A public load balancer is accessible from the internet, depending on your VCN's
         * [security list rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securitylists.htm). For more information about public and
         * private load balancers, see [How Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
         * <p>
         * Example: {@code true}
         *
         * @param isPrivate the value to set
         * @return this builder
         **/
        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            this.__explicitlySet__.add("isPrivate");
            return this;
        }
        /**
         * An array of subnet [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        /**
         * An array of subnet [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param subnetIds the value to set
         * @return this builder
         **/
        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }
        /**
         * An array of NSG [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the load
         * balancer.
         * <p>
         * During the load balancer's creation, the service adds the new load balancer to the specified NSGs.
         * <p>
         * The benefits of associating the load balancer with NSGs include:
         * <p>
         *  NSGs define network security rules to govern ingress and egress traffic for the load balancer.
         * <p>
         *  The network security rules of other resources can reference the NSGs associated with the load balancer
         *    to ensure access.
         * <p>
         * Example: ["ocid1.nsg.oc1.phx.unique_ID"]
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * An array of NSG [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the load
         * balancer.
         * <p>
         * During the load balancer's creation, the service adds the new load balancer to the specified NSGs.
         * <p>
         * The benefits of associating the load balancer with NSGs include:
         * <p>
         *  NSGs define network security rules to govern ingress and egress traffic for the load balancer.
         * <p>
         *  The network security rules of other resources can reference the NSGs associated with the load balancer
         *    to ensure access.
         * <p>
         * Example: ["ocid1.nsg.oc1.phx.unique_ID"]
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         **/
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.Map<String, Listener> listeners;

        public Builder listeners(java.util.Map<String, Listener> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
        private java.util.Map<String, Hostname> hostnames;

        public Builder hostnames(java.util.Map<String, Hostname> hostnames) {
            this.hostnames = hostnames;
            this.__explicitlySet__.add("hostnames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslCipherSuites")
        private java.util.Map<String, SSLCipherSuite> sslCipherSuites;

        public Builder sslCipherSuites(java.util.Map<String, SSLCipherSuite> sslCipherSuites) {
            this.sslCipherSuites = sslCipherSuites;
            this.__explicitlySet__.add("sslCipherSuites");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificates")
        private java.util.Map<String, Certificate> certificates;

        public Builder certificates(java.util.Map<String, Certificate> certificates) {
            this.certificates = certificates;
            this.__explicitlySet__.add("certificates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
        private java.util.Map<String, BackendSet> backendSets;

        public Builder backendSets(java.util.Map<String, BackendSet> backendSets) {
            this.backendSets = backendSets;
            this.__explicitlySet__.add("backendSets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSets")
        private java.util.Map<String, PathRouteSet> pathRouteSets;

        public Builder pathRouteSets(java.util.Map<String, PathRouteSet> pathRouteSets) {
            this.pathRouteSets = pathRouteSets;
            this.__explicitlySet__.add("pathRouteSets");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleSets")
        private java.util.Map<String, RuleSet> ruleSets;

        public Builder ruleSets(java.util.Map<String, RuleSet> ruleSets) {
            this.ruleSets = ruleSets;
            this.__explicitlySet__.add("ruleSets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingPolicies")
        private java.util.Map<String, RoutingPolicy> routingPolicies;

        public Builder routingPolicies(java.util.Map<String, RoutingPolicy> routingPolicies) {
            this.routingPolicies = routingPolicies;
            this.__explicitlySet__.add("routingPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadBalancer build() {
            LoadBalancer __instance__ =
                    new LoadBalancer(
                            id,
                            compartmentId,
                            displayName,
                            lifecycleState,
                            timeCreated,
                            ipAddresses,
                            shapeName,
                            shapeDetails,
                            isPrivate,
                            subnetIds,
                            networkSecurityGroupIds,
                            listeners,
                            hostnames,
                            sslCipherSuites,
                            certificates,
                            backendSets,
                            pathRouteSets,
                            freeformTags,
                            definedTags,
                            systemTags,
                            ruleSets,
                            routingPolicies);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancer o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .ipAddresses(o.getIpAddresses())
                            .shapeName(o.getShapeName())
                            .shapeDetails(o.getShapeDetails())
                            .isPrivate(o.getIsPrivate())
                            .subnetIds(o.getSubnetIds())
                            .networkSecurityGroupIds(o.getNetworkSecurityGroupIds())
                            .listeners(o.getListeners())
                            .hostnames(o.getHostnames())
                            .sslCipherSuites(o.getSslCipherSuites())
                            .certificates(o.getCertificates())
                            .backendSets(o.getBackendSets())
                            .pathRouteSets(o.getPathRouteSets())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .ruleSets(o.getRuleSets())
                            .routingPolicies(o.getRoutingPolicies());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * <p>
     * Example: {@code example_load_balancer}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * <p>
     * Example: {@code example_load_balancer}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The current state of the load balancer.
     *
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    private final LifecycleState lifecycleState;

    /**
     * The current state of the load balancer.
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the load balancer was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the load balancer was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An array of IP addresses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
    private final java.util.List<IpAddress> ipAddresses;

    /**
     * An array of IP addresses.
     *
     * @return the value
     **/
    public java.util.List<IpAddress> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
     * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
     * operation.
     * <p>
     * Example: {@code 100Mbps}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
     * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
     * operation.
     * <p>
     * Example: {@code 100Mbps}
     *
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeDetails")
    private final ShapeDetails shapeDetails;

    public ShapeDetails getShapeDetails() {
        return shapeDetails;
    }

    /**
     * Whether the load balancer has a VCN-local (private) IP address.
     * <p>
     * If "true", the service assigns a private IP address to the load balancer.
     * <p>
     * If "false", the service assigns a public IP address to the load balancer.
     * <p>
     * A public load balancer is accessible from the internet, depending on your VCN's
     * [security list rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securitylists.htm). For more information about public and
     * private load balancers, see [How Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
    private final Boolean isPrivate;

    /**
     * Whether the load balancer has a VCN-local (private) IP address.
     * <p>
     * If "true", the service assigns a private IP address to the load balancer.
     * <p>
     * If "false", the service assigns a public IP address to the load balancer.
     * <p>
     * A public load balancer is accessible from the internet, depending on your VCN's
     * [security list rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securitylists.htm). For more information about public and
     * private load balancers, see [How Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * An array of subnet [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    private final java.util.List<String> subnetIds;

    /**
     * An array of subnet [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * An array of NSG [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the load
     * balancer.
     * <p>
     * During the load balancer's creation, the service adds the new load balancer to the specified NSGs.
     * <p>
     * The benefits of associating the load balancer with NSGs include:
     * <p>
     *  NSGs define network security rules to govern ingress and egress traffic for the load balancer.
     * <p>
     *  The network security rules of other resources can reference the NSGs associated with the load balancer
     *    to ensure access.
     * <p>
     * Example: ["ocid1.nsg.oc1.phx.unique_ID"]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of NSG [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the load
     * balancer.
     * <p>
     * During the load balancer's creation, the service adds the new load balancer to the specified NSGs.
     * <p>
     * The benefits of associating the load balancer with NSGs include:
     * <p>
     *  NSGs define network security rules to govern ingress and egress traffic for the load balancer.
     * <p>
     *  The network security rules of other resources can reference the NSGs associated with the load balancer
     *    to ensure access.
     * <p>
     * Example: ["ocid1.nsg.oc1.phx.unique_ID"]
     *
     * @return the value
     **/
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    private final java.util.Map<String, Listener> listeners;

    public java.util.Map<String, Listener> getListeners() {
        return listeners;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    private final java.util.Map<String, Hostname> hostnames;

    public java.util.Map<String, Hostname> getHostnames() {
        return hostnames;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sslCipherSuites")
    private final java.util.Map<String, SSLCipherSuite> sslCipherSuites;

    public java.util.Map<String, SSLCipherSuite> getSslCipherSuites() {
        return sslCipherSuites;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificates")
    private final java.util.Map<String, Certificate> certificates;

    public java.util.Map<String, Certificate> getCertificates() {
        return certificates;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
    private final java.util.Map<String, BackendSet> backendSets;

    public java.util.Map<String, BackendSet> getBackendSets() {
        return backendSets;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSets")
    private final java.util.Map<String, PathRouteSet> pathRouteSets;

    public java.util.Map<String, PathRouteSet> getPathRouteSets() {
        return pathRouteSets;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ruleSets")
    private final java.util.Map<String, RuleSet> ruleSets;

    public java.util.Map<String, RuleSet> getRuleSets() {
        return ruleSets;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("routingPolicies")
    private final java.util.Map<String, RoutingPolicy> routingPolicies;

    public java.util.Map<String, RoutingPolicy> getRoutingPolicies() {
        return routingPolicies;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LoadBalancer(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", ipAddresses=").append(String.valueOf(this.ipAddresses));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", shapeDetails=").append(String.valueOf(this.shapeDetails));
        sb.append(", isPrivate=").append(String.valueOf(this.isPrivate));
        sb.append(", subnetIds=").append(String.valueOf(this.subnetIds));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", listeners=").append(String.valueOf(this.listeners));
        sb.append(", hostnames=").append(String.valueOf(this.hostnames));
        sb.append(", sslCipherSuites=").append(String.valueOf(this.sslCipherSuites));
        sb.append(", certificates=").append(String.valueOf(this.certificates));
        sb.append(", backendSets=").append(String.valueOf(this.backendSets));
        sb.append(", pathRouteSets=").append(String.valueOf(this.pathRouteSets));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", ruleSets=").append(String.valueOf(this.ruleSets));
        sb.append(", routingPolicies=").append(String.valueOf(this.routingPolicies));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadBalancer)) {
            return false;
        }

        LoadBalancer other = (LoadBalancer) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.ipAddresses, other.ipAddresses)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.shapeDetails, other.shapeDetails)
                && java.util.Objects.equals(this.isPrivate, other.isPrivate)
                && java.util.Objects.equals(this.subnetIds, other.subnetIds)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.listeners, other.listeners)
                && java.util.Objects.equals(this.hostnames, other.hostnames)
                && java.util.Objects.equals(this.sslCipherSuites, other.sslCipherSuites)
                && java.util.Objects.equals(this.certificates, other.certificates)
                && java.util.Objects.equals(this.backendSets, other.backendSets)
                && java.util.Objects.equals(this.pathRouteSets, other.pathRouteSets)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.ruleSets, other.ruleSets)
                && java.util.Objects.equals(this.routingPolicies, other.routingPolicies)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.ipAddresses == null ? 43 : this.ipAddresses.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.shapeDetails == null ? 43 : this.shapeDetails.hashCode());
        result = (result * PRIME) + (this.isPrivate == null ? 43 : this.isPrivate.hashCode());
        result = (result * PRIME) + (this.subnetIds == null ? 43 : this.subnetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + (this.listeners == null ? 43 : this.listeners.hashCode());
        result = (result * PRIME) + (this.hostnames == null ? 43 : this.hostnames.hashCode());
        result =
                (result * PRIME)
                        + (this.sslCipherSuites == null ? 43 : this.sslCipherSuites.hashCode());
        result = (result * PRIME) + (this.certificates == null ? 43 : this.certificates.hashCode());
        result = (result * PRIME) + (this.backendSets == null ? 43 : this.backendSets.hashCode());
        result =
                (result * PRIME)
                        + (this.pathRouteSets == null ? 43 : this.pathRouteSets.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.ruleSets == null ? 43 : this.ruleSets.hashCode());
        result =
                (result * PRIME)
                        + (this.routingPolicies == null ? 43 : this.routingPolicies.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
