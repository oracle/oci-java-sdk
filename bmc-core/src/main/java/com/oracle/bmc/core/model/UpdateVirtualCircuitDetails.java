/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateVirtualCircuitDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateVirtualCircuitDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bandwidthShapeName",
        "crossConnectMappings",
        "routingPolicy",
        "bgpAdminState",
        "isBfdEnabled",
        "customerBgpAsn",
        "customerAsn",
        "definedTags",
        "displayName",
        "freeformTags",
        "gatewayId",
        "providerState",
        "providerServiceKeyName",
        "referenceComment",
        "ipMtu"
    })
    public UpdateVirtualCircuitDetails(
            String bandwidthShapeName,
            java.util.List<CrossConnectMapping> crossConnectMappings,
            java.util.List<RoutingPolicy> routingPolicy,
            BgpAdminState bgpAdminState,
            Boolean isBfdEnabled,
            Integer customerBgpAsn,
            Long customerAsn,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String gatewayId,
            ProviderState providerState,
            String providerServiceKeyName,
            String referenceComment,
            VirtualCircuitIpMtu ipMtu) {
        super();
        this.bandwidthShapeName = bandwidthShapeName;
        this.crossConnectMappings = crossConnectMappings;
        this.routingPolicy = routingPolicy;
        this.bgpAdminState = bgpAdminState;
        this.isBfdEnabled = isBfdEnabled;
        this.customerBgpAsn = customerBgpAsn;
        this.customerAsn = customerAsn;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.gatewayId = gatewayId;
        this.providerState = providerState;
        this.providerServiceKeyName = providerServiceKeyName;
        this.referenceComment = referenceComment;
        this.ipMtu = ipMtu;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The provisioned data rate of the connection. To get a list of the available bandwidth
         * levels (that is, shapes), see {@link
         * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
         * listFastConnectProviderVirtualCircuitBandwidthShapes}. To be updated only by the customer
         * who owns the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        /**
         * The provisioned data rate of the connection. To get a list of the available bandwidth
         * levels (that is, shapes), see {@link
         * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
         * listFastConnectProviderVirtualCircuitBandwidthShapes}. To be updated only by the customer
         * who owns the virtual circuit.
         *
         * @param bandwidthShapeName the value to set
         * @return this builder
         */
        public Builder bandwidthShapeName(String bandwidthShapeName) {
            this.bandwidthShapeName = bandwidthShapeName;
            this.__explicitlySet__.add("bandwidthShapeName");
            return this;
        }
        /**
         * An array of mappings, each containing properties for a cross-connect or cross-connect
         * group associated with this virtual circuit.
         *
         * <p>The customer and provider can update different properties in the mapping depending on
         * the situation. See the description of the {@link CrossConnectMapping}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
        private java.util.List<CrossConnectMapping> crossConnectMappings;

        /**
         * An array of mappings, each containing properties for a cross-connect or cross-connect
         * group associated with this virtual circuit.
         *
         * <p>The customer and provider can update different properties in the mapping depending on
         * the situation. See the description of the {@link CrossConnectMapping}.
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
         * The BGP ASN of the network at the other end of the BGP session from Oracle.
         *
         * <p>If the BGP session is from the customer's edge router to Oracle, the required value is
         * the customer's ASN, and it can be updated only by the customer.
         *
         * <p>If the BGP session is from the provider's edge router to Oracle, the required value is
         * the provider's ASN, and it can be updated only by the provider.
         *
         * <p>Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerAsn")
        private Long customerAsn;

        /**
         * The BGP ASN of the network at the other end of the BGP session from Oracle.
         *
         * <p>If the BGP session is from the customer's edge router to Oracle, the required value is
         * the customer's ASN, and it can be updated only by the customer.
         *
         * <p>If the BGP session is from the provider's edge router to Oracle, the required value is
         * the provider's ASN, and it can be updated only by the provider.
         *
         * <p>Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
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
         * of the {@link Drg} that this private virtual circuit uses.
         *
         * <p>To be updated only by the customer who owns the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
        private String gatewayId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the {@link Drg} that this private virtual circuit uses.
         *
         * <p>To be updated only by the customer who owns the virtual circuit.
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
         * The provider's state in relation to this virtual circuit. Relevant only if the customer
         * is using FastConnect via a provider. ACTIVE means the provider has provisioned the
         * virtual circuit from their end. INACTIVE means the provider has not yet provisioned the
         * virtual circuit, or has de-provisioned it.
         *
         * <p>To be updated only by the provider.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerState")
        private ProviderState providerState;

        /**
         * The provider's state in relation to this virtual circuit. Relevant only if the customer
         * is using FastConnect via a provider. ACTIVE means the provider has provisioned the
         * virtual circuit from their end. INACTIVE means the provider has not yet provisioned the
         * virtual circuit, or has de-provisioned it.
         *
         * <p>To be updated only by the provider.
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
        /**
         * Provider-supplied reference information about this virtual circuit. Relevant only if the
         * customer is using FastConnect via a provider.
         *
         * <p>To be updated only by the provider.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
        private String referenceComment;

        /**
         * Provider-supplied reference information about this virtual circuit. Relevant only if the
         * customer is using FastConnect via a provider.
         *
         * <p>To be updated only by the provider.
         *
         * @param referenceComment the value to set
         * @return this builder
         */
        public Builder referenceComment(String referenceComment) {
            this.referenceComment = referenceComment;
            this.__explicitlySet__.add("referenceComment");
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

        public UpdateVirtualCircuitDetails build() {
            UpdateVirtualCircuitDetails model =
                    new UpdateVirtualCircuitDetails(
                            this.bandwidthShapeName,
                            this.crossConnectMappings,
                            this.routingPolicy,
                            this.bgpAdminState,
                            this.isBfdEnabled,
                            this.customerBgpAsn,
                            this.customerAsn,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.gatewayId,
                            this.providerState,
                            this.providerServiceKeyName,
                            this.referenceComment,
                            this.ipMtu);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVirtualCircuitDetails model) {
            if (model.wasPropertyExplicitlySet("bandwidthShapeName")) {
                this.bandwidthShapeName(model.getBandwidthShapeName());
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
            if (model.wasPropertyExplicitlySet("providerState")) {
                this.providerState(model.getProviderState());
            }
            if (model.wasPropertyExplicitlySet("providerServiceKeyName")) {
                this.providerServiceKeyName(model.getProviderServiceKeyName());
            }
            if (model.wasPropertyExplicitlySet("referenceComment")) {
                this.referenceComment(model.getReferenceComment());
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
     * listFastConnectProviderVirtualCircuitBandwidthShapes}. To be updated only by the customer who
     * owns the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    private final String bandwidthShapeName;

    /**
     * The provisioned data rate of the connection. To get a list of the available bandwidth levels
     * (that is, shapes), see {@link
     * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
     * listFastConnectProviderVirtualCircuitBandwidthShapes}. To be updated only by the customer who
     * owns the virtual circuit.
     *
     * @return the value
     */
    public String getBandwidthShapeName() {
        return bandwidthShapeName;
    }

    /**
     * An array of mappings, each containing properties for a cross-connect or cross-connect group
     * associated with this virtual circuit.
     *
     * <p>The customer and provider can update different properties in the mapping depending on the
     * situation. See the description of the {@link CrossConnectMapping}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
    private final java.util.List<CrossConnectMapping> crossConnectMappings;

    /**
     * An array of mappings, each containing properties for a cross-connect or cross-connect group
     * associated with this virtual circuit.
     *
     * <p>The customer and provider can update different properties in the mapping depending on the
     * situation. See the description of the {@link CrossConnectMapping}.
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
        ;

        private final String value;
        private static java.util.Map<String, RoutingPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (RoutingPolicy v : RoutingPolicy.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid RoutingPolicy: " + key);
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
        ;

        private final String value;
        private static java.util.Map<String, BgpAdminState> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpAdminState v : BgpAdminState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid BgpAdminState: " + key);
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
     * The BGP ASN of the network at the other end of the BGP session from Oracle.
     *
     * <p>If the BGP session is from the customer's edge router to Oracle, the required value is the
     * customer's ASN, and it can be updated only by the customer.
     *
     * <p>If the BGP session is from the provider's edge router to Oracle, the required value is the
     * provider's ASN, and it can be updated only by the provider.
     *
     * <p>Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerAsn")
    private final Long customerAsn;

    /**
     * The BGP ASN of the network at the other end of the BGP session from Oracle.
     *
     * <p>If the BGP session is from the customer's edge router to Oracle, the required value is the
     * customer's ASN, and it can be updated only by the customer.
     *
     * <p>If the BGP session is from the provider's edge router to Oracle, the required value is the
     * provider's ASN, and it can be updated only by the provider.
     *
     * <p>Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
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
     * the {@link Drg} that this private virtual circuit uses.
     *
     * <p>To be updated only by the customer who owns the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    private final String gatewayId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the {@link Drg} that this private virtual circuit uses.
     *
     * <p>To be updated only by the customer who owns the virtual circuit.
     *
     * @return the value
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * The provider's state in relation to this virtual circuit. Relevant only if the customer is
     * using FastConnect via a provider. ACTIVE means the provider has provisioned the virtual
     * circuit from their end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     *
     * <p>To be updated only by the provider.
     */
    public enum ProviderState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, ProviderState> map;

        static {
            map = new java.util.HashMap<>();
            for (ProviderState v : ProviderState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ProviderState: " + key);
        }
    };
    /**
     * The provider's state in relation to this virtual circuit. Relevant only if the customer is
     * using FastConnect via a provider. ACTIVE means the provider has provisioned the virtual
     * circuit from their end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     *
     * <p>To be updated only by the provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerState")
    private final ProviderState providerState;

    /**
     * The provider's state in relation to this virtual circuit. Relevant only if the customer is
     * using FastConnect via a provider. ACTIVE means the provider has provisioned the virtual
     * circuit from their end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     *
     * <p>To be updated only by the provider.
     *
     * @return the value
     */
    public ProviderState getProviderState() {
        return providerState;
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

    /**
     * Provider-supplied reference information about this virtual circuit. Relevant only if the
     * customer is using FastConnect via a provider.
     *
     * <p>To be updated only by the provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
    private final String referenceComment;

    /**
     * Provider-supplied reference information about this virtual circuit. Relevant only if the
     * customer is using FastConnect via a provider.
     *
     * <p>To be updated only by the provider.
     *
     * @return the value
     */
    public String getReferenceComment() {
        return referenceComment;
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
        sb.append("UpdateVirtualCircuitDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bandwidthShapeName=").append(String.valueOf(this.bandwidthShapeName));
        sb.append(", crossConnectMappings=").append(String.valueOf(this.crossConnectMappings));
        sb.append(", routingPolicy=").append(String.valueOf(this.routingPolicy));
        sb.append(", bgpAdminState=").append(String.valueOf(this.bgpAdminState));
        sb.append(", isBfdEnabled=").append(String.valueOf(this.isBfdEnabled));
        sb.append(", customerBgpAsn=").append(String.valueOf(this.customerBgpAsn));
        sb.append(", customerAsn=").append(String.valueOf(this.customerAsn));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", gatewayId=").append(String.valueOf(this.gatewayId));
        sb.append(", providerState=").append(String.valueOf(this.providerState));
        sb.append(", providerServiceKeyName=").append(String.valueOf(this.providerServiceKeyName));
        sb.append(", referenceComment=").append(String.valueOf(this.referenceComment));
        sb.append(", ipMtu=").append(String.valueOf(this.ipMtu));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVirtualCircuitDetails)) {
            return false;
        }

        UpdateVirtualCircuitDetails other = (UpdateVirtualCircuitDetails) o;
        return java.util.Objects.equals(this.bandwidthShapeName, other.bandwidthShapeName)
                && java.util.Objects.equals(this.crossConnectMappings, other.crossConnectMappings)
                && java.util.Objects.equals(this.routingPolicy, other.routingPolicy)
                && java.util.Objects.equals(this.bgpAdminState, other.bgpAdminState)
                && java.util.Objects.equals(this.isBfdEnabled, other.isBfdEnabled)
                && java.util.Objects.equals(this.customerBgpAsn, other.customerBgpAsn)
                && java.util.Objects.equals(this.customerAsn, other.customerAsn)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.gatewayId, other.gatewayId)
                && java.util.Objects.equals(this.providerState, other.providerState)
                && java.util.Objects.equals(
                        this.providerServiceKeyName, other.providerServiceKeyName)
                && java.util.Objects.equals(this.referenceComment, other.referenceComment)
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
                        + (this.customerBgpAsn == null ? 43 : this.customerBgpAsn.hashCode());
        result = (result * PRIME) + (this.customerAsn == null ? 43 : this.customerAsn.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.gatewayId == null ? 43 : this.gatewayId.hashCode());
        result =
                (result * PRIME)
                        + (this.providerState == null ? 43 : this.providerState.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceKeyName == null
                                ? 43
                                : this.providerServiceKeyName.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceComment == null ? 43 : this.referenceComment.hashCode());
        result = (result * PRIME) + (this.ipMtu == null ? 43 : this.ipMtu.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
