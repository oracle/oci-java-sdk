/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for creating a load balancer.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateLoadBalancerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateLoadBalancerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
        private Boolean isPrivate;

        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            this.__explicitlySet__.add("isPrivate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipMode")
        private IpMode ipMode;

        public Builder ipMode(IpMode ipMode) {
            this.ipMode = ipMode;
            this.__explicitlySet__.add("ipMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reservedIps")
        private java.util.List<ReservedIP> reservedIps;

        public Builder reservedIps(java.util.List<ReservedIP> reservedIps) {
            this.reservedIps = reservedIps;
            this.__explicitlySet__.add("reservedIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.Map<String, ListenerDetails> listeners;

        public Builder listeners(java.util.Map<String, ListenerDetails> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
        private java.util.Map<String, HostnameDetails> hostnames;

        public Builder hostnames(java.util.Map<String, HostnameDetails> hostnames) {
            this.hostnames = hostnames;
            this.__explicitlySet__.add("hostnames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
        private java.util.Map<String, BackendSetDetails> backendSets;

        public Builder backendSets(java.util.Map<String, BackendSetDetails> backendSets) {
            this.backendSets = backendSets;
            this.__explicitlySet__.add("backendSets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificates")
        private java.util.Map<String, CertificateDetails> certificates;

        public Builder certificates(java.util.Map<String, CertificateDetails> certificates) {
            this.certificates = certificates;
            this.__explicitlySet__.add("certificates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslCipherSuites")
        private java.util.Map<String, SSLCipherSuiteDetails> sslCipherSuites;

        public Builder sslCipherSuites(
                java.util.Map<String, SSLCipherSuiteDetails> sslCipherSuites) {
            this.sslCipherSuites = sslCipherSuites;
            this.__explicitlySet__.add("sslCipherSuites");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSets")
        private java.util.Map<String, PathRouteSetDetails> pathRouteSets;

        public Builder pathRouteSets(java.util.Map<String, PathRouteSetDetails> pathRouteSets) {
            this.pathRouteSets = pathRouteSets;
            this.__explicitlySet__.add("pathRouteSets");
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

        @com.fasterxml.jackson.annotation.JsonProperty("ruleSets")
        private java.util.Map<String, RuleSetDetails> ruleSets;

        public Builder ruleSets(java.util.Map<String, RuleSetDetails> ruleSets) {
            this.ruleSets = ruleSets;
            this.__explicitlySet__.add("ruleSets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLoadBalancerDetails build() {
            CreateLoadBalancerDetails __instance__ =
                    new CreateLoadBalancerDetails(
                            compartmentId,
                            displayName,
                            shapeName,
                            isPrivate,
                            ipMode,
                            reservedIps,
                            listeners,
                            hostnames,
                            backendSets,
                            networkSecurityGroupIds,
                            subnetIds,
                            certificates,
                            sslCipherSuites,
                            pathRouteSets,
                            freeformTags,
                            definedTags,
                            ruleSets);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLoadBalancerDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .shapeName(o.getShapeName())
                            .isPrivate(o.getIsPrivate())
                            .ipMode(o.getIpMode())
                            .reservedIps(o.getReservedIps())
                            .listeners(o.getListeners())
                            .hostnames(o.getHostnames())
                            .backendSets(o.getBackendSets())
                            .networkSecurityGroupIds(o.getNetworkSecurityGroupIds())
                            .subnetIds(o.getSubnetIds())
                            .certificates(o.getCertificates())
                            .sslCipherSuites(o.getSslCipherSuites())
                            .pathRouteSets(o.getPathRouteSets())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .ruleSets(o.getRuleSets());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: `example_load_balancer`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

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
     * Whether the load balancer has a VCN-local (private) IP address.
     * <p>
     * If \"true\", the service assigns a private IP address to the load balancer.
     * <p>
     * If \"false\", the service assigns a public IP address to the load balancer.
     * <p>
     * A public load balancer is accessible from the internet, depending on your VCN's
     * [security list rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securitylists.htm). For more information about public and
     * private load balancers, see [How Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
    Boolean isPrivate;
    /**
     * Whether the load balancer has an IPv4 or IPv6 IP address.
     * <p>
     * If \"IPV4\", the service assigns an IPv4 address and the load balancer supports IPv4 traffic.
     * <p>
     * If \"IPV6\", the service assigns an IPv6 address and the load balancer supports IPv6 traffic.
     * <p>
     * Example: \"ipMode\":\"IPV6\"
     *
     **/
    public enum IpMode {
        Ipv4("IPV4"),
        Ipv6("IPV6"),
        ;

        private final String value;
        private static java.util.Map<String, IpMode> map;

        static {
            map = new java.util.HashMap<>();
            for (IpMode v : IpMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        IpMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IpMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IpMode: " + key);
        }
    };
    /**
     * Whether the load balancer has an IPv4 or IPv6 IP address.
     * <p>
     * If \"IPV4\", the service assigns an IPv4 address and the load balancer supports IPv4 traffic.
     * <p>
     * If \"IPV6\", the service assigns an IPv6 address and the load balancer supports IPv6 traffic.
     * <p>
     * Example: \"ipMode\":\"IPV6\"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipMode")
    IpMode ipMode;

    /**
     * An array of reserved Ips.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservedIps")
    java.util.List<ReservedIP> reservedIps;

    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    java.util.Map<String, ListenerDetails> listeners;

    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    java.util.Map<String, HostnameDetails> hostnames;

    @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
    java.util.Map<String, BackendSetDetails> backendSets;

    /**
     * An array of NSG [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with this load balancer.
     * <p>
     * During the load balancer's creation, the service adds the new load balancer to the specified NSGs.
     * <p>
     * The benefits of using NSGs with the load balancer include:
     * <p>
     *  NSGs define network security rules to govern ingress and egress traffic for the load balancer.
     * <p>
     *  The network security rules of other resources can reference the NSGs associated with the load balancer
     *    to ensure access.
     * <p>
     * Example: `[\"ocid1.nsg.oc1.phx.unique_ID\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of subnet [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    java.util.List<String> subnetIds;

    @com.fasterxml.jackson.annotation.JsonProperty("certificates")
    java.util.Map<String, CertificateDetails> certificates;

    @com.fasterxml.jackson.annotation.JsonProperty("sslCipherSuites")
    java.util.Map<String, SSLCipherSuiteDetails> sslCipherSuites;

    @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSets")
    java.util.Map<String, PathRouteSetDetails> pathRouteSets;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonProperty("ruleSets")
    java.util.Map<String, RuleSetDetails> ruleSets;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
