/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateLoadBalancerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateLoadBalancerDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "shapeName",
        "shapeDetails",
        "isPrivate",
        "isDeleteProtectionEnabled",
        "ipMode",
        "isRequestIdEnabled",
        "requestIdHeader",
        "reservedIps",
        "listeners",
        "hostnames",
        "backendSets",
        "networkSecurityGroupIds",
        "subnetIds",
        "certificates",
        "sslCipherSuites",
        "pathRouteSets",
        "freeformTags",
        "definedTags",
        "securityAttributes",
        "ruleSets"
    })
    public CreateLoadBalancerDetails(
            String compartmentId,
            String displayName,
            String shapeName,
            ShapeDetails shapeDetails,
            Boolean isPrivate,
            Boolean isDeleteProtectionEnabled,
            IpMode ipMode,
            Boolean isRequestIdEnabled,
            String requestIdHeader,
            java.util.List<ReservedIP> reservedIps,
            java.util.Map<String, ListenerDetails> listeners,
            java.util.Map<String, HostnameDetails> hostnames,
            java.util.Map<String, BackendSetDetails> backendSets,
            java.util.List<String> networkSecurityGroupIds,
            java.util.List<String> subnetIds,
            java.util.Map<String, CertificateDetails> certificates,
            java.util.Map<String, SSLCipherSuiteDetails> sslCipherSuites,
            java.util.Map<String, PathRouteSetDetails> pathRouteSets,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            java.util.Map<String, RuleSetDetails> ruleSets) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.shapeName = shapeName;
        this.shapeDetails = shapeDetails;
        this.isPrivate = isPrivate;
        this.isDeleteProtectionEnabled = isDeleteProtectionEnabled;
        this.ipMode = ipMode;
        this.isRequestIdEnabled = isRequestIdEnabled;
        this.requestIdHeader = requestIdHeader;
        this.reservedIps = reservedIps;
        this.listeners = listeners;
        this.hostnames = hostnames;
        this.backendSets = backendSets;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.subnetIds = subnetIds;
        this.certificates = certificates;
        this.sslCipherSuites = sslCipherSuites;
        this.pathRouteSets = pathRouteSets;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.ruleSets = ruleSets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
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
         * Avoid entering confidential information.
         * <p>
         * Example: {@code example_load_balancer}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
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
         * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
         * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
         * operation.
         * <p>
         * Example: {@code flexible}
         * NOTE: After May 2023, Fixed shapes - 10Mbps, 100Mbps, 400Mbps, 8000Mbps would be deprecated and only shape
         *       allowed would be {@code Flexible}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
         * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
         * operation.
         * <p>
         * Example: {@code flexible}
         * NOTE: After May 2023, Fixed shapes - 10Mbps, 100Mbps, 400Mbps, 8000Mbps would be deprecated and only shape
         *       allowed would be {@code Flexible}
         *
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * The configuration details to create load balancer using Flexible shape. This is required only if shapeName is {@code Flexible}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeDetails")
        private ShapeDetails shapeDetails;

        /**
         * The configuration details to create load balancer using Flexible shape. This is required only if shapeName is {@code Flexible}.
         *
         * @param shapeDetails the value to set
         * @return this builder
         **/
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
         * [security list rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securitylists.htm). For more information about public and
         * private load balancers, see [How Load Balancing Works](https://docs.oracle.com/iaas/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
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
         * [security list rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securitylists.htm). For more information about public and
         * private load balancers, see [How Load Balancing Works](https://docs.oracle.com/iaas/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
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
         * Whether or not the load balancer has delete protection enabled.
         * <p>
         * If "true", the loadbalancer will be protected against deletion if configured to accept traffic.
         * <p>
         * If "false", the loadbalancer will not be protected against deletion.
         * <p>
         * Delete protection will not be enabled unless a value of "true" is provided.
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtectionEnabled")
        private Boolean isDeleteProtectionEnabled;

        /**
         * Whether or not the load balancer has delete protection enabled.
         * <p>
         * If "true", the loadbalancer will be protected against deletion if configured to accept traffic.
         * <p>
         * If "false", the loadbalancer will not be protected against deletion.
         * <p>
         * Delete protection will not be enabled unless a value of "true" is provided.
         * Example: {@code true}
         *
         * @param isDeleteProtectionEnabled the value to set
         * @return this builder
         **/
        public Builder isDeleteProtectionEnabled(Boolean isDeleteProtectionEnabled) {
            this.isDeleteProtectionEnabled = isDeleteProtectionEnabled;
            this.__explicitlySet__.add("isDeleteProtectionEnabled");
            return this;
        }
        /**
         * Whether the load balancer has an IPv4 or IPv6 IP address.
         * <p>
         * If "IPV4", the service assigns an IPv4 address and the load balancer supports IPv4 traffic.
         * <p>
         * If "IPV6", the service assigns an IPv6 address and the load balancer supports IPv6 traffic.
         * <p>
         * Example: "ipMode":"IPV6"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipMode")
        private IpMode ipMode;

        /**
         * Whether the load balancer has an IPv4 or IPv6 IP address.
         * <p>
         * If "IPV4", the service assigns an IPv4 address and the load balancer supports IPv4 traffic.
         * <p>
         * If "IPV6", the service assigns an IPv6 address and the load balancer supports IPv6 traffic.
         * <p>
         * Example: "ipMode":"IPV6"
         *
         * @param ipMode the value to set
         * @return this builder
         **/
        public Builder ipMode(IpMode ipMode) {
            this.ipMode = ipMode;
            this.__explicitlySet__.add("ipMode");
            return this;
        }
        /**
         * Whether or not the load balancer has the Request Id feature enabled for HTTP listeners.
         * <p>
         * If "true", the load balancer will attach a unique request id header to every request
         * passed through from the load balancer to load balancer backends. This same request id
         * header also will be added to the response the lb received from the backend handling
         * the request before the load balancer returns the response to the requestor. The name
         * of the unique request id header is set the by value of requestIdHeader.
         * <p>
         * If "false", the loadbalancer not add this unique request id header to either the request
         * passed through to the load balancer backends nor to the reponse returned to the user.
         * <p>
         * New load balancers have the Request Id feature disabled unless isRequestIdEnabled is set to true.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequestIdEnabled")
        private Boolean isRequestIdEnabled;

        /**
         * Whether or not the load balancer has the Request Id feature enabled for HTTP listeners.
         * <p>
         * If "true", the load balancer will attach a unique request id header to every request
         * passed through from the load balancer to load balancer backends. This same request id
         * header also will be added to the response the lb received from the backend handling
         * the request before the load balancer returns the response to the requestor. The name
         * of the unique request id header is set the by value of requestIdHeader.
         * <p>
         * If "false", the loadbalancer not add this unique request id header to either the request
         * passed through to the load balancer backends nor to the reponse returned to the user.
         * <p>
         * New load balancers have the Request Id feature disabled unless isRequestIdEnabled is set to true.
         * <p>
         * Example: {@code true}
         *
         * @param isRequestIdEnabled the value to set
         * @return this builder
         **/
        public Builder isRequestIdEnabled(Boolean isRequestIdEnabled) {
            this.isRequestIdEnabled = isRequestIdEnabled;
            this.__explicitlySet__.add("isRequestIdEnabled");
            return this;
        }
        /**
         * If isRequestIdEnabled is true then this field contains the name of the header field
         * that contains the unique request id that is attached to every request from
         * the load balancer to the load balancer backends and to every response from the load
         * balancer.
         * <p>
         * If a request to the load balancer already contains a header with same name as specified
         * in requestIdHeader then the load balancer will not change the value of that field.
         * <p>
         * If isRequestIdEnabled is false then this field is ignored.
         * <p>
         * If this field is not set or is set to "" then this field defaults to X-Request-Id
         * <p>
         **Notes:**
         * * Unless the header name is "" it must start with "X-" prefix.
         * * Setting the header name to "" will set it to the default: X-Request-Id.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestIdHeader")
        private String requestIdHeader;

        /**
         * If isRequestIdEnabled is true then this field contains the name of the header field
         * that contains the unique request id that is attached to every request from
         * the load balancer to the load balancer backends and to every response from the load
         * balancer.
         * <p>
         * If a request to the load balancer already contains a header with same name as specified
         * in requestIdHeader then the load balancer will not change the value of that field.
         * <p>
         * If isRequestIdEnabled is false then this field is ignored.
         * <p>
         * If this field is not set or is set to "" then this field defaults to X-Request-Id
         * <p>
         **Notes:**
         * * Unless the header name is "" it must start with "X-" prefix.
         * * Setting the header name to "" will set it to the default: X-Request-Id.
         *
         * @param requestIdHeader the value to set
         * @return this builder
         **/
        public Builder requestIdHeader(String requestIdHeader) {
            this.requestIdHeader = requestIdHeader;
            this.__explicitlySet__.add("requestIdHeader");
            return this;
        }
        /**
         * An array of reserved Ips.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reservedIps")
        private java.util.List<ReservedIP> reservedIps;

        /**
         * An array of reserved Ips.
         *
         * @param reservedIps the value to set
         * @return this builder
         **/
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
        /**
         * An array of NSG [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
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
         * Example: {@code ["ocid1.nsg.oc1.phx.unique_ID"]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * An array of NSG [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
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
         * Example: {@code ["ocid1.nsg.oc1.phx.unique_ID"]}
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         **/
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }
        /**
         * An array of subnet [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        /**
         * An array of subnet [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param subnetIds the value to set
         * @return this builder
         **/
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Extended Defined tags for ZPR for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value":"42","mode":"audit", "usagetype" : "zpr"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Extended Defined tags for ZPR for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value":"42","mode":"audit", "usagetype" : "zpr"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         **/
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
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
            CreateLoadBalancerDetails model =
                    new CreateLoadBalancerDetails(
                            this.compartmentId,
                            this.displayName,
                            this.shapeName,
                            this.shapeDetails,
                            this.isPrivate,
                            this.isDeleteProtectionEnabled,
                            this.ipMode,
                            this.isRequestIdEnabled,
                            this.requestIdHeader,
                            this.reservedIps,
                            this.listeners,
                            this.hostnames,
                            this.backendSets,
                            this.networkSecurityGroupIds,
                            this.subnetIds,
                            this.certificates,
                            this.sslCipherSuites,
                            this.pathRouteSets,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes,
                            this.ruleSets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLoadBalancerDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("shapeDetails")) {
                this.shapeDetails(model.getShapeDetails());
            }
            if (model.wasPropertyExplicitlySet("isPrivate")) {
                this.isPrivate(model.getIsPrivate());
            }
            if (model.wasPropertyExplicitlySet("isDeleteProtectionEnabled")) {
                this.isDeleteProtectionEnabled(model.getIsDeleteProtectionEnabled());
            }
            if (model.wasPropertyExplicitlySet("ipMode")) {
                this.ipMode(model.getIpMode());
            }
            if (model.wasPropertyExplicitlySet("isRequestIdEnabled")) {
                this.isRequestIdEnabled(model.getIsRequestIdEnabled());
            }
            if (model.wasPropertyExplicitlySet("requestIdHeader")) {
                this.requestIdHeader(model.getRequestIdHeader());
            }
            if (model.wasPropertyExplicitlySet("reservedIps")) {
                this.reservedIps(model.getReservedIps());
            }
            if (model.wasPropertyExplicitlySet("listeners")) {
                this.listeners(model.getListeners());
            }
            if (model.wasPropertyExplicitlySet("hostnames")) {
                this.hostnames(model.getHostnames());
            }
            if (model.wasPropertyExplicitlySet("backendSets")) {
                this.backendSets(model.getBackendSets());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
            }
            if (model.wasPropertyExplicitlySet("subnetIds")) {
                this.subnetIds(model.getSubnetIds());
            }
            if (model.wasPropertyExplicitlySet("certificates")) {
                this.certificates(model.getCertificates());
            }
            if (model.wasPropertyExplicitlySet("sslCipherSuites")) {
                this.sslCipherSuites(model.getSslCipherSuites());
            }
            if (model.wasPropertyExplicitlySet("pathRouteSets")) {
                this.pathRouteSets(model.getPathRouteSets());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("ruleSets")) {
                this.ruleSets(model.getRuleSets());
            }
            return this;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the load balancer.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code example_load_balancer}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code example_load_balancer}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
     * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
     * operation.
     * <p>
     * Example: {@code flexible}
     * NOTE: After May 2023, Fixed shapes - 10Mbps, 100Mbps, 400Mbps, 8000Mbps would be deprecated and only shape
     *       allowed would be {@code Flexible}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * A template that determines the total pre-provisioned bandwidth (ingress plus egress).
     * To get a list of available shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
     * operation.
     * <p>
     * Example: {@code flexible}
     * NOTE: After May 2023, Fixed shapes - 10Mbps, 100Mbps, 400Mbps, 8000Mbps would be deprecated and only shape
     *       allowed would be {@code Flexible}
     *
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * The configuration details to create load balancer using Flexible shape. This is required only if shapeName is {@code Flexible}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeDetails")
    private final ShapeDetails shapeDetails;

    /**
     * The configuration details to create load balancer using Flexible shape. This is required only if shapeName is {@code Flexible}.
     *
     * @return the value
     **/
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
     * [security list rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securitylists.htm). For more information about public and
     * private load balancers, see [How Load Balancing Works](https://docs.oracle.com/iaas/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
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
     * [security list rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securitylists.htm). For more information about public and
     * private load balancers, see [How Load Balancing Works](https://docs.oracle.com/iaas/Content/Balance/Concepts/balanceoverview.htm#how-load-balancing-works).
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * Whether or not the load balancer has delete protection enabled.
     * <p>
     * If "true", the loadbalancer will be protected against deletion if configured to accept traffic.
     * <p>
     * If "false", the loadbalancer will not be protected against deletion.
     * <p>
     * Delete protection will not be enabled unless a value of "true" is provided.
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtectionEnabled")
    private final Boolean isDeleteProtectionEnabled;

    /**
     * Whether or not the load balancer has delete protection enabled.
     * <p>
     * If "true", the loadbalancer will be protected against deletion if configured to accept traffic.
     * <p>
     * If "false", the loadbalancer will not be protected against deletion.
     * <p>
     * Delete protection will not be enabled unless a value of "true" is provided.
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsDeleteProtectionEnabled() {
        return isDeleteProtectionEnabled;
    }

    /**
     * Whether the load balancer has an IPv4 or IPv6 IP address.
     * <p>
     * If "IPV4", the service assigns an IPv4 address and the load balancer supports IPv4 traffic.
     * <p>
     * If "IPV6", the service assigns an IPv6 address and the load balancer supports IPv6 traffic.
     * <p>
     * Example: "ipMode":"IPV6"
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
     * If "IPV4", the service assigns an IPv4 address and the load balancer supports IPv4 traffic.
     * <p>
     * If "IPV6", the service assigns an IPv6 address and the load balancer supports IPv6 traffic.
     * <p>
     * Example: "ipMode":"IPV6"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipMode")
    private final IpMode ipMode;

    /**
     * Whether the load balancer has an IPv4 or IPv6 IP address.
     * <p>
     * If "IPV4", the service assigns an IPv4 address and the load balancer supports IPv4 traffic.
     * <p>
     * If "IPV6", the service assigns an IPv6 address and the load balancer supports IPv6 traffic.
     * <p>
     * Example: "ipMode":"IPV6"
     *
     * @return the value
     **/
    public IpMode getIpMode() {
        return ipMode;
    }

    /**
     * Whether or not the load balancer has the Request Id feature enabled for HTTP listeners.
     * <p>
     * If "true", the load balancer will attach a unique request id header to every request
     * passed through from the load balancer to load balancer backends. This same request id
     * header also will be added to the response the lb received from the backend handling
     * the request before the load balancer returns the response to the requestor. The name
     * of the unique request id header is set the by value of requestIdHeader.
     * <p>
     * If "false", the loadbalancer not add this unique request id header to either the request
     * passed through to the load balancer backends nor to the reponse returned to the user.
     * <p>
     * New load balancers have the Request Id feature disabled unless isRequestIdEnabled is set to true.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequestIdEnabled")
    private final Boolean isRequestIdEnabled;

    /**
     * Whether or not the load balancer has the Request Id feature enabled for HTTP listeners.
     * <p>
     * If "true", the load balancer will attach a unique request id header to every request
     * passed through from the load balancer to load balancer backends. This same request id
     * header also will be added to the response the lb received from the backend handling
     * the request before the load balancer returns the response to the requestor. The name
     * of the unique request id header is set the by value of requestIdHeader.
     * <p>
     * If "false", the loadbalancer not add this unique request id header to either the request
     * passed through to the load balancer backends nor to the reponse returned to the user.
     * <p>
     * New load balancers have the Request Id feature disabled unless isRequestIdEnabled is set to true.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsRequestIdEnabled() {
        return isRequestIdEnabled;
    }

    /**
     * If isRequestIdEnabled is true then this field contains the name of the header field
     * that contains the unique request id that is attached to every request from
     * the load balancer to the load balancer backends and to every response from the load
     * balancer.
     * <p>
     * If a request to the load balancer already contains a header with same name as specified
     * in requestIdHeader then the load balancer will not change the value of that field.
     * <p>
     * If isRequestIdEnabled is false then this field is ignored.
     * <p>
     * If this field is not set or is set to "" then this field defaults to X-Request-Id
     * <p>
     **Notes:**
     * * Unless the header name is "" it must start with "X-" prefix.
     * * Setting the header name to "" will set it to the default: X-Request-Id.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestIdHeader")
    private final String requestIdHeader;

    /**
     * If isRequestIdEnabled is true then this field contains the name of the header field
     * that contains the unique request id that is attached to every request from
     * the load balancer to the load balancer backends and to every response from the load
     * balancer.
     * <p>
     * If a request to the load balancer already contains a header with same name as specified
     * in requestIdHeader then the load balancer will not change the value of that field.
     * <p>
     * If isRequestIdEnabled is false then this field is ignored.
     * <p>
     * If this field is not set or is set to "" then this field defaults to X-Request-Id
     * <p>
     **Notes:**
     * * Unless the header name is "" it must start with "X-" prefix.
     * * Setting the header name to "" will set it to the default: X-Request-Id.
     *
     * @return the value
     **/
    public String getRequestIdHeader() {
        return requestIdHeader;
    }

    /**
     * An array of reserved Ips.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservedIps")
    private final java.util.List<ReservedIP> reservedIps;

    /**
     * An array of reserved Ips.
     *
     * @return the value
     **/
    public java.util.List<ReservedIP> getReservedIps() {
        return reservedIps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    private final java.util.Map<String, ListenerDetails> listeners;

    public java.util.Map<String, ListenerDetails> getListeners() {
        return listeners;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    private final java.util.Map<String, HostnameDetails> hostnames;

    public java.util.Map<String, HostnameDetails> getHostnames() {
        return hostnames;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
    private final java.util.Map<String, BackendSetDetails> backendSets;

    public java.util.Map<String, BackendSetDetails> getBackendSets() {
        return backendSets;
    }

    /**
     * An array of NSG [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
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
     * Example: {@code ["ocid1.nsg.oc1.phx.unique_ID"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of NSG [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with this load balancer.
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
     * Example: {@code ["ocid1.nsg.oc1.phx.unique_ID"]}
     *
     * @return the value
     **/
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /**
     * An array of subnet [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    private final java.util.List<String> subnetIds;

    /**
     * An array of subnet [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificates")
    private final java.util.Map<String, CertificateDetails> certificates;

    public java.util.Map<String, CertificateDetails> getCertificates() {
        return certificates;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sslCipherSuites")
    private final java.util.Map<String, SSLCipherSuiteDetails> sslCipherSuites;

    public java.util.Map<String, SSLCipherSuiteDetails> getSslCipherSuites() {
        return sslCipherSuites;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSets")
    private final java.util.Map<String, PathRouteSetDetails> pathRouteSets;

    public java.util.Map<String, PathRouteSetDetails> getPathRouteSets() {
        return pathRouteSets;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Extended Defined tags for ZPR for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value":"42","mode":"audit", "usagetype" : "zpr"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Extended Defined tags for ZPR for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value":"42","mode":"audit", "usagetype" : "zpr"}}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ruleSets")
    private final java.util.Map<String, RuleSetDetails> ruleSets;

    public java.util.Map<String, RuleSetDetails> getRuleSets() {
        return ruleSets;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateLoadBalancerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", shapeDetails=").append(String.valueOf(this.shapeDetails));
        sb.append(", isPrivate=").append(String.valueOf(this.isPrivate));
        sb.append(", isDeleteProtectionEnabled=")
                .append(String.valueOf(this.isDeleteProtectionEnabled));
        sb.append(", ipMode=").append(String.valueOf(this.ipMode));
        sb.append(", isRequestIdEnabled=").append(String.valueOf(this.isRequestIdEnabled));
        sb.append(", requestIdHeader=").append(String.valueOf(this.requestIdHeader));
        sb.append(", reservedIps=").append(String.valueOf(this.reservedIps));
        sb.append(", listeners=").append(String.valueOf(this.listeners));
        sb.append(", hostnames=").append(String.valueOf(this.hostnames));
        sb.append(", backendSets=").append(String.valueOf(this.backendSets));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", subnetIds=").append(String.valueOf(this.subnetIds));
        sb.append(", certificates=").append(String.valueOf(this.certificates));
        sb.append(", sslCipherSuites=").append(String.valueOf(this.sslCipherSuites));
        sb.append(", pathRouteSets=").append(String.valueOf(this.pathRouteSets));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", ruleSets=").append(String.valueOf(this.ruleSets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLoadBalancerDetails)) {
            return false;
        }

        CreateLoadBalancerDetails other = (CreateLoadBalancerDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.shapeDetails, other.shapeDetails)
                && java.util.Objects.equals(this.isPrivate, other.isPrivate)
                && java.util.Objects.equals(
                        this.isDeleteProtectionEnabled, other.isDeleteProtectionEnabled)
                && java.util.Objects.equals(this.ipMode, other.ipMode)
                && java.util.Objects.equals(this.isRequestIdEnabled, other.isRequestIdEnabled)
                && java.util.Objects.equals(this.requestIdHeader, other.requestIdHeader)
                && java.util.Objects.equals(this.reservedIps, other.reservedIps)
                && java.util.Objects.equals(this.listeners, other.listeners)
                && java.util.Objects.equals(this.hostnames, other.hostnames)
                && java.util.Objects.equals(this.backendSets, other.backendSets)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.subnetIds, other.subnetIds)
                && java.util.Objects.equals(this.certificates, other.certificates)
                && java.util.Objects.equals(this.sslCipherSuites, other.sslCipherSuites)
                && java.util.Objects.equals(this.pathRouteSets, other.pathRouteSets)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.ruleSets, other.ruleSets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.shapeDetails == null ? 43 : this.shapeDetails.hashCode());
        result = (result * PRIME) + (this.isPrivate == null ? 43 : this.isPrivate.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteProtectionEnabled == null
                                ? 43
                                : this.isDeleteProtectionEnabled.hashCode());
        result = (result * PRIME) + (this.ipMode == null ? 43 : this.ipMode.hashCode());
        result =
                (result * PRIME)
                        + (this.isRequestIdEnabled == null
                                ? 43
                                : this.isRequestIdEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.requestIdHeader == null ? 43 : this.requestIdHeader.hashCode());
        result = (result * PRIME) + (this.reservedIps == null ? 43 : this.reservedIps.hashCode());
        result = (result * PRIME) + (this.listeners == null ? 43 : this.listeners.hashCode());
        result = (result * PRIME) + (this.hostnames == null ? 43 : this.hostnames.hashCode());
        result = (result * PRIME) + (this.backendSets == null ? 43 : this.backendSets.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + (this.subnetIds == null ? 43 : this.subnetIds.hashCode());
        result = (result * PRIME) + (this.certificates == null ? 43 : this.certificates.hashCode());
        result =
                (result * PRIME)
                        + (this.sslCipherSuites == null ? 43 : this.sslCipherSuites.hashCode());
        result =
                (result * PRIME)
                        + (this.pathRouteSets == null ? 43 : this.pathRouteSets.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.ruleSets == null ? 43 : this.ruleSets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
