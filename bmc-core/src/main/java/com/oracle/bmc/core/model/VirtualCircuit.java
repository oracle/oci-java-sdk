/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect.
 *
 * <p>A virtual circuit is an isolated network path that runs over one or more physical network
 * connections to provide a single, logical connection between the edge router on the customer's
 * existing network and Oracle Cloud Infrastructure. *Private* virtual circuits support private
 * peering, and *public* virtual circuits support public peering. For more information, see
 * [FastConnect
 * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
 *
 * <p>Each virtual circuit is made up of information shared between a customer, Oracle, and a
 * provider (if the customer is using FastConnect via a provider). Who fills in a given property of
 * a virtual circuit depends on whether the BGP session related to that virtual circuit goes from
 * the customer's edge router to Oracle, or from the provider's edge router to Oracle. Also, in the
 * case where the customer is using a provider, values for some of the properties may not be present
 * immediately, but may get filled in as the provider and Oracle each do their part to provision the
 * virtual circuit.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VirtualCircuit.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualCircuit
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bandwidthShapeName",
        "bgpManagement",
        "bgpSessionState",
        "bgpIpv6SessionState",
        "compartmentId",
        "crossConnectMappings",
        "routingPolicy",
        "bgpAdminState",
        "isBfdEnabled",
        "isTransportMode",
        "customerBgpAsn",
        "customerAsn",
        "definedTags",
        "displayName",
        "freeformTags",
        "gatewayId",
        "id",
        "lifecycleState",
        "oracleBgpAsn",
        "providerName",
        "providerServiceId",
        "providerServiceKeyName",
        "providerServiceName",
        "providerState",
        "publicPrefixes",
        "referenceComment",
        "region",
        "serviceType",
        "timeCreated",
        "type",
        "ipMtu"
    })
    public VirtualCircuit(
            String bandwidthShapeName,
            BgpManagement bgpManagement,
            BgpSessionState bgpSessionState,
            BgpIpv6SessionState bgpIpv6SessionState,
            String compartmentId,
            java.util.List<CrossConnectMapping> crossConnectMappings,
            java.util.List<RoutingPolicy> routingPolicy,
            BgpAdminState bgpAdminState,
            Boolean isBfdEnabled,
            Boolean isTransportMode,
            Integer customerBgpAsn,
            Long customerAsn,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String gatewayId,
            String id,
            LifecycleState lifecycleState,
            Integer oracleBgpAsn,
            String providerName,
            String providerServiceId,
            String providerServiceKeyName,
            String providerServiceName,
            ProviderState providerState,
            java.util.List<String> publicPrefixes,
            String referenceComment,
            String region,
            ServiceType serviceType,
            java.util.Date timeCreated,
            Type type,
            VirtualCircuitIpMtu ipMtu) {
        super();
        this.bandwidthShapeName = bandwidthShapeName;
        this.bgpManagement = bgpManagement;
        this.bgpSessionState = bgpSessionState;
        this.bgpIpv6SessionState = bgpIpv6SessionState;
        this.compartmentId = compartmentId;
        this.crossConnectMappings = crossConnectMappings;
        this.routingPolicy = routingPolicy;
        this.bgpAdminState = bgpAdminState;
        this.isBfdEnabled = isBfdEnabled;
        this.isTransportMode = isTransportMode;
        this.customerBgpAsn = customerBgpAsn;
        this.customerAsn = customerAsn;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.gatewayId = gatewayId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.oracleBgpAsn = oracleBgpAsn;
        this.providerName = providerName;
        this.providerServiceId = providerServiceId;
        this.providerServiceKeyName = providerServiceKeyName;
        this.providerServiceName = providerServiceName;
        this.providerState = providerState;
        this.publicPrefixes = publicPrefixes;
        this.referenceComment = referenceComment;
        this.region = region;
        this.serviceType = serviceType;
        this.timeCreated = timeCreated;
        this.type = type;
        this.ipMtu = ipMtu;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The provisioned data rate of the connection. To get a list of the available bandwidth
         * levels (that is, shapes), see {@link
         * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
         * listFastConnectProviderVirtualCircuitBandwidthShapes}.
         *
         * <p>Example: {@code 10 Gbps}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        /**
         * The provisioned data rate of the connection. To get a list of the available bandwidth
         * levels (that is, shapes), see {@link
         * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
         * listFastConnectProviderVirtualCircuitBandwidthShapes}.
         *
         * <p>Example: {@code 10 Gbps}
         *
         * @param bandwidthShapeName the value to set
         * @return this builder
         */
        public Builder bandwidthShapeName(String bandwidthShapeName) {
            this.bandwidthShapeName = bandwidthShapeName;
            this.__explicitlySet__.add("bandwidthShapeName");
            return this;
        }
        /** Deprecated. Instead use the information in {@link FastConnectProviderService}. */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpManagement")
        private BgpManagement bgpManagement;

        /**
         * Deprecated. Instead use the information in {@link FastConnectProviderService}.
         *
         * @param bgpManagement the value to set
         * @return this builder
         */
        public Builder bgpManagement(BgpManagement bgpManagement) {
            this.bgpManagement = bgpManagement;
            this.__explicitlySet__.add("bgpManagement");
            return this;
        }
        /** The state of the Ipv4 BGP session associated with the virtual circuit. */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionState")
        private BgpSessionState bgpSessionState;

        /**
         * The state of the Ipv4 BGP session associated with the virtual circuit.
         *
         * @param bgpSessionState the value to set
         * @return this builder
         */
        public Builder bgpSessionState(BgpSessionState bgpSessionState) {
            this.bgpSessionState = bgpSessionState;
            this.__explicitlySet__.add("bgpSessionState");
            return this;
        }
        /** The state of the Ipv6 BGP session associated with the virtual circuit. */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpIpv6SessionState")
        private BgpIpv6SessionState bgpIpv6SessionState;

        /**
         * The state of the Ipv6 BGP session associated with the virtual circuit.
         *
         * @param bgpIpv6SessionState the value to set
         * @return this builder
         */
        public Builder bgpIpv6SessionState(BgpIpv6SessionState bgpIpv6SessionState) {
            this.bgpIpv6SessionState = bgpIpv6SessionState;
            this.__explicitlySet__.add("bgpIpv6SessionState");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the virtual circuit.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * An array of mappings, each containing properties for a cross-connect or cross-connect
         * group that is associated with this virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
        private java.util.List<CrossConnectMapping> crossConnectMappings;

        /**
         * An array of mappings, each containing properties for a cross-connect or cross-connect
         * group that is associated with this virtual circuit.
         *
         * @param crossConnectMappings the value to set
         * @return this builder
         */
        public Builder crossConnectMappings(
                java.util.List<CrossConnectMapping> crossConnectMappings) {
            this.crossConnectMappings = crossConnectMappings;
            this.__explicitlySet__.add("crossConnectMappings");
            return this;
        }
        /**
         * The routing policy sets how routing information about the Oracle cloud is shared over a
         * public virtual circuit. Policies available are: {@code ORACLE_SERVICE_NETWORK}, {@code
         * REGIONAL}, {@code MARKET_LEVEL}, and {@code GLOBAL}. See [Route
         * Filtering](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/routingonprem.htm#route_filtering)
         * for details. By default, routing information is shared for all routes in the same market.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routingPolicy")
        private java.util.List<RoutingPolicy> routingPolicy;

        /**
         * The routing policy sets how routing information about the Oracle cloud is shared over a
         * public virtual circuit. Policies available are: {@code ORACLE_SERVICE_NETWORK}, {@code
         * REGIONAL}, {@code MARKET_LEVEL}, and {@code GLOBAL}. See [Route
         * Filtering](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/routingonprem.htm#route_filtering)
         * for details. By default, routing information is shared for all routes in the same market.
         *
         * @param routingPolicy the value to set
         * @return this builder
         */
        public Builder routingPolicy(java.util.List<RoutingPolicy> routingPolicy) {
            this.routingPolicy = routingPolicy;
            this.__explicitlySet__.add("routingPolicy");
            return this;
        }
        /**
         * Set to {@code ENABLED} (the default) to activate the BGP session of the virtual circuit,
         * set to {@code DISABLED} to deactivate the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpAdminState")
        private BgpAdminState bgpAdminState;

        /**
         * Set to {@code ENABLED} (the default) to activate the BGP session of the virtual circuit,
         * set to {@code DISABLED} to deactivate the virtual circuit.
         *
         * @param bgpAdminState the value to set
         * @return this builder
         */
        public Builder bgpAdminState(BgpAdminState bgpAdminState) {
            this.bgpAdminState = bgpAdminState;
            this.__explicitlySet__.add("bgpAdminState");
            return this;
        }
        /**
         * Set to {@code true} to enable BFD for IPv4 BGP peering, or set to {@code false} to
         * disable BFD. If this is not set, the default is {@code false}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isBfdEnabled")
        private Boolean isBfdEnabled;

        /**
         * Set to {@code true} to enable BFD for IPv4 BGP peering, or set to {@code false} to
         * disable BFD. If this is not set, the default is {@code false}.
         *
         * @param isBfdEnabled the value to set
         * @return this builder
         */
        public Builder isBfdEnabled(Boolean isBfdEnabled) {
            this.isBfdEnabled = isBfdEnabled;
            this.__explicitlySet__.add("isBfdEnabled");
            return this;
        }
        /**
         * Set to {@code true} for the virtual circuit to carry only encrypted traffic, or set to
         * {@code false} for the virtual circuit to carry unencrypted traffic. If this is not set,
         * the default is {@code false}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isTransportMode")
        private Boolean isTransportMode;

        /**
         * Set to {@code true} for the virtual circuit to carry only encrypted traffic, or set to
         * {@code false} for the virtual circuit to carry unencrypted traffic. If this is not set,
         * the default is {@code false}.
         *
         * @param isTransportMode the value to set
         * @return this builder
         */
        public Builder isTransportMode(Boolean isTransportMode) {
            this.isTransportMode = isTransportMode;
            this.__explicitlySet__.add("isTransportMode");
            return this;
        }
        /**
         * Deprecated. Instead use {@code customerAsn}. If you specify values for both, the request
         * will be rejected.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        /**
         * Deprecated. Instead use {@code customerAsn}. If you specify values for both, the request
         * will be rejected.
         *
         * @param customerBgpAsn the value to set
         * @return this builder
         */
        public Builder customerBgpAsn(Integer customerBgpAsn) {
            this.customerBgpAsn = customerBgpAsn;
            this.__explicitlySet__.add("customerBgpAsn");
            return this;
        }
        /**
         * The BGP ASN of the network at the other end of the BGP session from Oracle. If the
         * session is between the customer's edge router and Oracle, the value is the customer's
         * ASN. If the BGP session is between the provider's edge router and Oracle, the value is
         * the provider's ASN. Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerAsn")
        private Long customerAsn;

        /**
         * The BGP ASN of the network at the other end of the BGP session from Oracle. If the
         * session is between the customer's edge router and Oracle, the value is the customer's
         * ASN. If the BGP session is between the provider's edge router and Oracle, the value is
         * the provider's ASN. Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
         *
         * @param customerAsn the value to set
         * @return this builder
         */
        public Builder customerAsn(Long customerAsn) {
            this.customerAsn = customerAsn;
            this.__explicitlySet__.add("customerAsn");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the customer's {@link Drg} that this virtual circuit uses. Applicable only to private
         * virtual circuits.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
        private String gatewayId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the customer's {@link Drg} that this virtual circuit uses. Applicable only to private
         * virtual circuits.
         *
         * @param gatewayId the value to set
         * @return this builder
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            this.__explicitlySet__.add("gatewayId");
            return this;
        }
        /**
         * The virtual circuit's Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The virtual circuit's Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The virtual circuit's current state. For information about the different states, see
         * [FastConnect
         * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The virtual circuit's current state. For information about the different states, see
         * [FastConnect
         * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The Oracle BGP ASN. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpAsn")
        private Integer oracleBgpAsn;

        /**
         * The Oracle BGP ASN.
         *
         * @param oracleBgpAsn the value to set
         * @return this builder
         */
        public Builder oracleBgpAsn(Integer oracleBgpAsn) {
            this.oracleBgpAsn = oracleBgpAsn;
            this.__explicitlySet__.add("oracleBgpAsn");
            return this;
        }
        /** Deprecated. Instead use {@code providerServiceId}. */
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * Deprecated. Instead use {@code providerServiceId}.
         *
         * @param providerName the value to set
         * @return this builder
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the service offered by the provider (if the customer is connecting via a provider).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceId")
        private String providerServiceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the service offered by the provider (if the customer is connecting via a provider).
         *
         * @param providerServiceId the value to set
         * @return this builder
         */
        public Builder providerServiceId(String providerServiceId) {
            this.providerServiceId = providerServiceId;
            this.__explicitlySet__.add("providerServiceId");
            return this;
        }
        /**
         * The service key name offered by the provider (if the customer is connecting via a
         * provider).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceKeyName")
        private String providerServiceKeyName;

        /**
         * The service key name offered by the provider (if the customer is connecting via a
         * provider).
         *
         * @param providerServiceKeyName the value to set
         * @return this builder
         */
        public Builder providerServiceKeyName(String providerServiceKeyName) {
            this.providerServiceKeyName = providerServiceKeyName;
            this.__explicitlySet__.add("providerServiceKeyName");
            return this;
        }
        /** Deprecated. Instead use {@code providerServiceId}. */
        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
        private String providerServiceName;

        /**
         * Deprecated. Instead use {@code providerServiceId}.
         *
         * @param providerServiceName the value to set
         * @return this builder
         */
        public Builder providerServiceName(String providerServiceName) {
            this.providerServiceName = providerServiceName;
            this.__explicitlySet__.add("providerServiceName");
            return this;
        }
        /**
         * The provider's state in relation to this virtual circuit (if the customer is connecting
         * via a provider). ACTIVE means the provider has provisioned the virtual circuit from their
         * end. INACTIVE means the provider has not yet provisioned the virtual circuit, or has
         * de-provisioned it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerState")
        private ProviderState providerState;

        /**
         * The provider's state in relation to this virtual circuit (if the customer is connecting
         * via a provider). ACTIVE means the provider has provisioned the virtual circuit from their
         * end. INACTIVE means the provider has not yet provisioned the virtual circuit, or has
         * de-provisioned it.
         *
         * @param providerState the value to set
         * @return this builder
         */
        public Builder providerState(ProviderState providerState) {
            this.providerState = providerState;
            this.__explicitlySet__.add("providerState");
            return this;
        }
        /**
         * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to
         * advertise across the connection. All prefix sizes are allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
        private java.util.List<String> publicPrefixes;

        /**
         * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to
         * advertise across the connection. All prefix sizes are allowed.
         *
         * @param publicPrefixes the value to set
         * @return this builder
         */
        public Builder publicPrefixes(java.util.List<String> publicPrefixes) {
            this.publicPrefixes = publicPrefixes;
            this.__explicitlySet__.add("publicPrefixes");
            return this;
        }
        /**
         * Provider-supplied reference information about this virtual circuit (if the customer is
         * connecting via a provider).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
        private String referenceComment;

        /**
         * Provider-supplied reference information about this virtual circuit (if the customer is
         * connecting via a provider).
         *
         * @param referenceComment the value to set
         * @return this builder
         */
        public Builder referenceComment(String referenceComment) {
            this.referenceComment = referenceComment;
            this.__explicitlySet__.add("referenceComment");
            return this;
        }
        /** The Oracle Cloud Infrastructure region where this virtual circuit is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The Oracle Cloud Infrastructure region where this virtual circuit is located.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** Provider service type. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private ServiceType serviceType;

        /**
         * Provider service type.
         *
         * @param serviceType the value to set
         * @return this builder
         */
        public Builder serviceType(ServiceType serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /**
         * The date and time the virtual circuit was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the virtual circuit was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Whether the virtual circuit supports private or public peering. For more information, see
         * [FastConnect
         * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Whether the virtual circuit supports private or public peering. For more information, see
         * [FastConnect
         * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The layer 3 IP MTU to use on this virtual circuit. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipMtu")
        private VirtualCircuitIpMtu ipMtu;

        /**
         * The layer 3 IP MTU to use on this virtual circuit.
         *
         * @param ipMtu the value to set
         * @return this builder
         */
        public Builder ipMtu(VirtualCircuitIpMtu ipMtu) {
            this.ipMtu = ipMtu;
            this.__explicitlySet__.add("ipMtu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuit build() {
            VirtualCircuit model =
                    new VirtualCircuit(
                            this.bandwidthShapeName,
                            this.bgpManagement,
                            this.bgpSessionState,
                            this.bgpIpv6SessionState,
                            this.compartmentId,
                            this.crossConnectMappings,
                            this.routingPolicy,
                            this.bgpAdminState,
                            this.isBfdEnabled,
                            this.isTransportMode,
                            this.customerBgpAsn,
                            this.customerAsn,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.gatewayId,
                            this.id,
                            this.lifecycleState,
                            this.oracleBgpAsn,
                            this.providerName,
                            this.providerServiceId,
                            this.providerServiceKeyName,
                            this.providerServiceName,
                            this.providerState,
                            this.publicPrefixes,
                            this.referenceComment,
                            this.region,
                            this.serviceType,
                            this.timeCreated,
                            this.type,
                            this.ipMtu);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuit model) {
            if (model.wasPropertyExplicitlySet("bandwidthShapeName")) {
                this.bandwidthShapeName(model.getBandwidthShapeName());
            }
            if (model.wasPropertyExplicitlySet("bgpManagement")) {
                this.bgpManagement(model.getBgpManagement());
            }
            if (model.wasPropertyExplicitlySet("bgpSessionState")) {
                this.bgpSessionState(model.getBgpSessionState());
            }
            if (model.wasPropertyExplicitlySet("bgpIpv6SessionState")) {
                this.bgpIpv6SessionState(model.getBgpIpv6SessionState());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("crossConnectMappings")) {
                this.crossConnectMappings(model.getCrossConnectMappings());
            }
            if (model.wasPropertyExplicitlySet("routingPolicy")) {
                this.routingPolicy(model.getRoutingPolicy());
            }
            if (model.wasPropertyExplicitlySet("bgpAdminState")) {
                this.bgpAdminState(model.getBgpAdminState());
            }
            if (model.wasPropertyExplicitlySet("isBfdEnabled")) {
                this.isBfdEnabled(model.getIsBfdEnabled());
            }
            if (model.wasPropertyExplicitlySet("isTransportMode")) {
                this.isTransportMode(model.getIsTransportMode());
            }
            if (model.wasPropertyExplicitlySet("customerBgpAsn")) {
                this.customerBgpAsn(model.getCustomerBgpAsn());
            }
            if (model.wasPropertyExplicitlySet("customerAsn")) {
                this.customerAsn(model.getCustomerAsn());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("gatewayId")) {
                this.gatewayId(model.getGatewayId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("oracleBgpAsn")) {
                this.oracleBgpAsn(model.getOracleBgpAsn());
            }
            if (model.wasPropertyExplicitlySet("providerName")) {
                this.providerName(model.getProviderName());
            }
            if (model.wasPropertyExplicitlySet("providerServiceId")) {
                this.providerServiceId(model.getProviderServiceId());
            }
            if (model.wasPropertyExplicitlySet("providerServiceKeyName")) {
                this.providerServiceKeyName(model.getProviderServiceKeyName());
            }
            if (model.wasPropertyExplicitlySet("providerServiceName")) {
                this.providerServiceName(model.getProviderServiceName());
            }
            if (model.wasPropertyExplicitlySet("providerState")) {
                this.providerState(model.getProviderState());
            }
            if (model.wasPropertyExplicitlySet("publicPrefixes")) {
                this.publicPrefixes(model.getPublicPrefixes());
            }
            if (model.wasPropertyExplicitlySet("referenceComment")) {
                this.referenceComment(model.getReferenceComment());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("ipMtu")) {
                this.ipMtu(model.getIpMtu());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The provisioned data rate of the connection. To get a list of the available bandwidth levels
     * (that is, shapes), see {@link
     * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
     * listFastConnectProviderVirtualCircuitBandwidthShapes}.
     *
     * <p>Example: {@code 10 Gbps}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    private final String bandwidthShapeName;

    /**
     * The provisioned data rate of the connection. To get a list of the available bandwidth levels
     * (that is, shapes), see {@link
     * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
     * listFastConnectProviderVirtualCircuitBandwidthShapes}.
     *
     * <p>Example: {@code 10 Gbps}
     *
     * @return the value
     */
    public String getBandwidthShapeName() {
        return bandwidthShapeName;
    }

    /** Deprecated. Instead use the information in {@link FastConnectProviderService}. */
    public enum BgpManagement implements com.oracle.bmc.http.internal.BmcEnum {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BgpManagement.class);

        private final String value;
        private static java.util.Map<String, BgpManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpManagement v : BgpManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BgpManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Deprecated. Instead use the information in {@link FastConnectProviderService}. */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpManagement")
    private final BgpManagement bgpManagement;

    /**
     * Deprecated. Instead use the information in {@link FastConnectProviderService}.
     *
     * @return the value
     */
    public BgpManagement getBgpManagement() {
        return bgpManagement;
    }

    /** The state of the Ipv4 BGP session associated with the virtual circuit. */
    public enum BgpSessionState implements com.oracle.bmc.http.internal.BmcEnum {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BgpSessionState.class);

        private final String value;
        private static java.util.Map<String, BgpSessionState> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpSessionState v : BgpSessionState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpSessionState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpSessionState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BgpSessionState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The state of the Ipv4 BGP session associated with the virtual circuit. */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionState")
    private final BgpSessionState bgpSessionState;

    /**
     * The state of the Ipv4 BGP session associated with the virtual circuit.
     *
     * @return the value
     */
    public BgpSessionState getBgpSessionState() {
        return bgpSessionState;
    }

    /** The state of the Ipv6 BGP session associated with the virtual circuit. */
    public enum BgpIpv6SessionState implements com.oracle.bmc.http.internal.BmcEnum {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BgpIpv6SessionState.class);

        private final String value;
        private static java.util.Map<String, BgpIpv6SessionState> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpIpv6SessionState v : BgpIpv6SessionState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpIpv6SessionState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpIpv6SessionState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BgpIpv6SessionState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The state of the Ipv6 BGP session associated with the virtual circuit. */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpIpv6SessionState")
    private final BgpIpv6SessionState bgpIpv6SessionState;

    /**
     * The state of the Ipv6 BGP session associated with the virtual circuit.
     *
     * @return the value
     */
    public BgpIpv6SessionState getBgpIpv6SessionState() {
        return bgpIpv6SessionState;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the virtual circuit.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * An array of mappings, each containing properties for a cross-connect or cross-connect group
     * that is associated with this virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
    private final java.util.List<CrossConnectMapping> crossConnectMappings;

    /**
     * An array of mappings, each containing properties for a cross-connect or cross-connect group
     * that is associated with this virtual circuit.
     *
     * @return the value
     */
    public java.util.List<CrossConnectMapping> getCrossConnectMappings() {
        return crossConnectMappings;
    }

    /** */
    public enum RoutingPolicy implements com.oracle.bmc.http.internal.BmcEnum {
        OracleServiceNetwork("ORACLE_SERVICE_NETWORK"),
        Regional("REGIONAL"),
        MarketLevel("MARKET_LEVEL"),
        Global("GLOBAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RoutingPolicy.class);

        private final String value;
        private static java.util.Map<String, RoutingPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (RoutingPolicy v : RoutingPolicy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RoutingPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RoutingPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RoutingPolicy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The routing policy sets how routing information about the Oracle cloud is shared over a
     * public virtual circuit. Policies available are: {@code ORACLE_SERVICE_NETWORK}, {@code
     * REGIONAL}, {@code MARKET_LEVEL}, and {@code GLOBAL}. See [Route
     * Filtering](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/routingonprem.htm#route_filtering)
     * for details. By default, routing information is shared for all routes in the same market.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routingPolicy")
    private final java.util.List<RoutingPolicy> routingPolicy;

    /**
     * The routing policy sets how routing information about the Oracle cloud is shared over a
     * public virtual circuit. Policies available are: {@code ORACLE_SERVICE_NETWORK}, {@code
     * REGIONAL}, {@code MARKET_LEVEL}, and {@code GLOBAL}. See [Route
     * Filtering](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/routingonprem.htm#route_filtering)
     * for details. By default, routing information is shared for all routes in the same market.
     *
     * @return the value
     */
    public java.util.List<RoutingPolicy> getRoutingPolicy() {
        return routingPolicy;
    }

    /**
     * Set to {@code ENABLED} (the default) to activate the BGP session of the virtual circuit, set
     * to {@code DISABLED} to deactivate the virtual circuit.
     */
    public enum BgpAdminState implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BgpAdminState.class);

        private final String value;
        private static java.util.Map<String, BgpAdminState> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpAdminState v : BgpAdminState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpAdminState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpAdminState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BgpAdminState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Set to {@code ENABLED} (the default) to activate the BGP session of the virtual circuit, set
     * to {@code DISABLED} to deactivate the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpAdminState")
    private final BgpAdminState bgpAdminState;

    /**
     * Set to {@code ENABLED} (the default) to activate the BGP session of the virtual circuit, set
     * to {@code DISABLED} to deactivate the virtual circuit.
     *
     * @return the value
     */
    public BgpAdminState getBgpAdminState() {
        return bgpAdminState;
    }

    /**
     * Set to {@code true} to enable BFD for IPv4 BGP peering, or set to {@code false} to disable
     * BFD. If this is not set, the default is {@code false}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isBfdEnabled")
    private final Boolean isBfdEnabled;

    /**
     * Set to {@code true} to enable BFD for IPv4 BGP peering, or set to {@code false} to disable
     * BFD. If this is not set, the default is {@code false}.
     *
     * @return the value
     */
    public Boolean getIsBfdEnabled() {
        return isBfdEnabled;
    }

    /**
     * Set to {@code true} for the virtual circuit to carry only encrypted traffic, or set to {@code
     * false} for the virtual circuit to carry unencrypted traffic. If this is not set, the default
     * is {@code false}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isTransportMode")
    private final Boolean isTransportMode;

    /**
     * Set to {@code true} for the virtual circuit to carry only encrypted traffic, or set to {@code
     * false} for the virtual circuit to carry unencrypted traffic. If this is not set, the default
     * is {@code false}.
     *
     * @return the value
     */
    public Boolean getIsTransportMode() {
        return isTransportMode;
    }

    /**
     * Deprecated. Instead use {@code customerAsn}. If you specify values for both, the request will
     * be rejected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    private final Integer customerBgpAsn;

    /**
     * Deprecated. Instead use {@code customerAsn}. If you specify values for both, the request will
     * be rejected.
     *
     * @return the value
     */
    public Integer getCustomerBgpAsn() {
        return customerBgpAsn;
    }

    /**
     * The BGP ASN of the network at the other end of the BGP session from Oracle. If the session is
     * between the customer's edge router and Oracle, the value is the customer's ASN. If the BGP
     * session is between the provider's edge router and Oracle, the value is the provider's ASN.
     * Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerAsn")
    private final Long customerAsn;

    /**
     * The BGP ASN of the network at the other end of the BGP session from Oracle. If the session is
     * between the customer's edge router and Oracle, the value is the customer's ASN. If the BGP
     * session is between the provider's edge router and Oracle, the value is the provider's ASN.
     * Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
     *
     * @return the value
     */
    public Long getCustomerAsn() {
        return customerAsn;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the customer's {@link Drg} that this virtual circuit uses. Applicable only to private virtual
     * circuits.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    private final String gatewayId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the customer's {@link Drg} that this virtual circuit uses. Applicable only to private virtual
     * circuits.
     *
     * @return the value
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * The virtual circuit's Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The virtual circuit's Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The virtual circuit's current state. For information about the different states, see
     * [FastConnect
     * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        PendingProvider("PENDING_PROVIDER"),
        Verifying("VERIFYING"),
        Provisioning("PROVISIONING"),
        Provisioned("PROVISIONED"),
        Failed("FAILED"),
        Inactive("INACTIVE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The virtual circuit's current state. For information about the different states, see
     * [FastConnect
     * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The virtual circuit's current state. For information about the different states, see
     * [FastConnect
     * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The Oracle BGP ASN. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpAsn")
    private final Integer oracleBgpAsn;

    /**
     * The Oracle BGP ASN.
     *
     * @return the value
     */
    public Integer getOracleBgpAsn() {
        return oracleBgpAsn;
    }

    /** Deprecated. Instead use {@code providerServiceId}. */
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * Deprecated. Instead use {@code providerServiceId}.
     *
     * @return the value
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the service offered by the provider (if the customer is connecting via a provider).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceId")
    private final String providerServiceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the service offered by the provider (if the customer is connecting via a provider).
     *
     * @return the value
     */
    public String getProviderServiceId() {
        return providerServiceId;
    }

    /**
     * The service key name offered by the provider (if the customer is connecting via a provider).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceKeyName")
    private final String providerServiceKeyName;

    /**
     * The service key name offered by the provider (if the customer is connecting via a provider).
     *
     * @return the value
     */
    public String getProviderServiceKeyName() {
        return providerServiceKeyName;
    }

    /** Deprecated. Instead use {@code providerServiceId}. */
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    private final String providerServiceName;

    /**
     * Deprecated. Instead use {@code providerServiceId}.
     *
     * @return the value
     */
    public String getProviderServiceName() {
        return providerServiceName;
    }

    /**
     * The provider's state in relation to this virtual circuit (if the customer is connecting via a
     * provider). ACTIVE means the provider has provisioned the virtual circuit from their end.
     * INACTIVE means the provider has not yet provisioned the virtual circuit, or has
     * de-provisioned it.
     */
    public enum ProviderState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ProviderState.class);

        private final String value;
        private static java.util.Map<String, ProviderState> map;

        static {
            map = new java.util.HashMap<>();
            for (ProviderState v : ProviderState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ProviderState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProviderState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ProviderState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The provider's state in relation to this virtual circuit (if the customer is connecting via a
     * provider). ACTIVE means the provider has provisioned the virtual circuit from their end.
     * INACTIVE means the provider has not yet provisioned the virtual circuit, or has
     * de-provisioned it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerState")
    private final ProviderState providerState;

    /**
     * The provider's state in relation to this virtual circuit (if the customer is connecting via a
     * provider). ACTIVE means the provider has provisioned the virtual circuit from their end.
     * INACTIVE means the provider has not yet provisioned the virtual circuit, or has
     * de-provisioned it.
     *
     * @return the value
     */
    public ProviderState getProviderState() {
        return providerState;
    }

    /**
     * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to advertise
     * across the connection. All prefix sizes are allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
    private final java.util.List<String> publicPrefixes;

    /**
     * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to advertise
     * across the connection. All prefix sizes are allowed.
     *
     * @return the value
     */
    public java.util.List<String> getPublicPrefixes() {
        return publicPrefixes;
    }

    /**
     * Provider-supplied reference information about this virtual circuit (if the customer is
     * connecting via a provider).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
    private final String referenceComment;

    /**
     * Provider-supplied reference information about this virtual circuit (if the customer is
     * connecting via a provider).
     *
     * @return the value
     */
    public String getReferenceComment() {
        return referenceComment;
    }

    /** The Oracle Cloud Infrastructure region where this virtual circuit is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The Oracle Cloud Infrastructure region where this virtual circuit is located.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** Provider service type. */
    public enum ServiceType implements com.oracle.bmc.http.internal.BmcEnum {
        Colocated("COLOCATED"),
        Layer2("LAYER2"),
        Layer3("LAYER3"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServiceType.class);

        private final String value;
        private static java.util.Map<String, ServiceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceType v : ServiceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServiceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServiceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Provider service type. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final ServiceType serviceType;

    /**
     * Provider service type.
     *
     * @return the value
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * The date and time the virtual circuit was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the virtual circuit was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Whether the virtual circuit supports private or public peering. For more information, see
     * [FastConnect
     * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Public("PUBLIC"),
        Private("PRIVATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Whether the virtual circuit supports private or public peering. For more information, see
     * [FastConnect
     * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Whether the virtual circuit supports private or public peering. For more information, see
     * [FastConnect
     * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** The layer 3 IP MTU to use on this virtual circuit. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipMtu")
    private final VirtualCircuitIpMtu ipMtu;

    /**
     * The layer 3 IP MTU to use on this virtual circuit.
     *
     * @return the value
     */
    public VirtualCircuitIpMtu getIpMtu() {
        return ipMtu;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VirtualCircuit(");
        sb.append("super=").append(super.toString());
        sb.append("bandwidthShapeName=").append(String.valueOf(this.bandwidthShapeName));
        sb.append(", bgpManagement=").append(String.valueOf(this.bgpManagement));
        sb.append(", bgpSessionState=").append(String.valueOf(this.bgpSessionState));
        sb.append(", bgpIpv6SessionState=").append(String.valueOf(this.bgpIpv6SessionState));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", crossConnectMappings=").append(String.valueOf(this.crossConnectMappings));
        sb.append(", routingPolicy=").append(String.valueOf(this.routingPolicy));
        sb.append(", bgpAdminState=").append(String.valueOf(this.bgpAdminState));
        sb.append(", isBfdEnabled=").append(String.valueOf(this.isBfdEnabled));
        sb.append(", isTransportMode=").append(String.valueOf(this.isTransportMode));
        sb.append(", customerBgpAsn=").append(String.valueOf(this.customerBgpAsn));
        sb.append(", customerAsn=").append(String.valueOf(this.customerAsn));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", gatewayId=").append(String.valueOf(this.gatewayId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", oracleBgpAsn=").append(String.valueOf(this.oracleBgpAsn));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", providerServiceId=").append(String.valueOf(this.providerServiceId));
        sb.append(", providerServiceKeyName=").append(String.valueOf(this.providerServiceKeyName));
        sb.append(", providerServiceName=").append(String.valueOf(this.providerServiceName));
        sb.append(", providerState=").append(String.valueOf(this.providerState));
        sb.append(", publicPrefixes=").append(String.valueOf(this.publicPrefixes));
        sb.append(", referenceComment=").append(String.valueOf(this.referenceComment));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", ipMtu=").append(String.valueOf(this.ipMtu));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuit)) {
            return false;
        }

        VirtualCircuit other = (VirtualCircuit) o;
        return java.util.Objects.equals(this.bandwidthShapeName, other.bandwidthShapeName)
                && java.util.Objects.equals(this.bgpManagement, other.bgpManagement)
                && java.util.Objects.equals(this.bgpSessionState, other.bgpSessionState)
                && java.util.Objects.equals(this.bgpIpv6SessionState, other.bgpIpv6SessionState)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.crossConnectMappings, other.crossConnectMappings)
                && java.util.Objects.equals(this.routingPolicy, other.routingPolicy)
                && java.util.Objects.equals(this.bgpAdminState, other.bgpAdminState)
                && java.util.Objects.equals(this.isBfdEnabled, other.isBfdEnabled)
                && java.util.Objects.equals(this.isTransportMode, other.isTransportMode)
                && java.util.Objects.equals(this.customerBgpAsn, other.customerBgpAsn)
                && java.util.Objects.equals(this.customerAsn, other.customerAsn)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.gatewayId, other.gatewayId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.oracleBgpAsn, other.oracleBgpAsn)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.providerServiceId, other.providerServiceId)
                && java.util.Objects.equals(
                        this.providerServiceKeyName, other.providerServiceKeyName)
                && java.util.Objects.equals(this.providerServiceName, other.providerServiceName)
                && java.util.Objects.equals(this.providerState, other.providerState)
                && java.util.Objects.equals(this.publicPrefixes, other.publicPrefixes)
                && java.util.Objects.equals(this.referenceComment, other.referenceComment)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.ipMtu, other.ipMtu)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bandwidthShapeName == null
                                ? 43
                                : this.bandwidthShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpManagement == null ? 43 : this.bgpManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpSessionState == null ? 43 : this.bgpSessionState.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpIpv6SessionState == null
                                ? 43
                                : this.bgpIpv6SessionState.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectMappings == null
                                ? 43
                                : this.crossConnectMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.routingPolicy == null ? 43 : this.routingPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpAdminState == null ? 43 : this.bgpAdminState.hashCode());
        result = (result * PRIME) + (this.isBfdEnabled == null ? 43 : this.isBfdEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isTransportMode == null ? 43 : this.isTransportMode.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpAsn == null ? 43 : this.customerBgpAsn.hashCode());
        result = (result * PRIME) + (this.customerAsn == null ? 43 : this.customerAsn.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.gatewayId == null ? 43 : this.gatewayId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.oracleBgpAsn == null ? 43 : this.oracleBgpAsn.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceId == null ? 43 : this.providerServiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceKeyName == null
                                ? 43
                                : this.providerServiceKeyName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceName == null
                                ? 43
                                : this.providerServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerState == null ? 43 : this.providerState.hashCode());
        result =
                (result * PRIME)
                        + (this.publicPrefixes == null ? 43 : this.publicPrefixes.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceComment == null ? 43 : this.referenceComment.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.ipMtu == null ? 43 : this.ipMtu.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
