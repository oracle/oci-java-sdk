/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

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
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VirtualCircuit.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VirtualCircuit
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bandwidthShapeName",
        "bgpManagement",
        "bgpSessionState",
        "compartmentId",
        "crossConnectMappings",
        "customerBgpAsn",
        "displayName",
        "gatewayId",
        "id",
        "lifecycleState",
        "oracleBgpAsn",
        "providerName",
        "providerServiceId",
        "providerServiceName",
        "providerState",
        "publicPrefixes",
        "referenceComment",
        "region",
        "serviceType",
        "timeCreated",
        "type"
    })
    public VirtualCircuit(
            String bandwidthShapeName,
            BgpManagement bgpManagement,
            BgpSessionState bgpSessionState,
            String compartmentId,
            java.util.List<CrossConnectMapping> crossConnectMappings,
            Integer customerBgpAsn,
            String displayName,
            String gatewayId,
            String id,
            LifecycleState lifecycleState,
            Integer oracleBgpAsn,
            String providerName,
            String providerServiceId,
            String providerServiceName,
            ProviderState providerState,
            java.util.List<String> publicPrefixes,
            String referenceComment,
            String region,
            ServiceType serviceType,
            java.util.Date timeCreated,
            Type type) {
        super();
        this.bandwidthShapeName = bandwidthShapeName;
        this.bgpManagement = bgpManagement;
        this.bgpSessionState = bgpSessionState;
        this.compartmentId = compartmentId;
        this.crossConnectMappings = crossConnectMappings;
        this.customerBgpAsn = customerBgpAsn;
        this.displayName = displayName;
        this.gatewayId = gatewayId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.oracleBgpAsn = oracleBgpAsn;
        this.providerName = providerName;
        this.providerServiceId = providerServiceId;
        this.providerServiceName = providerServiceName;
        this.providerState = providerState;
        this.publicPrefixes = publicPrefixes;
        this.referenceComment = referenceComment;
        this.region = region;
        this.serviceType = serviceType;
        this.timeCreated = timeCreated;
        this.type = type;
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
        /** BGP management option. */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpManagement")
        private BgpManagement bgpManagement;

        /**
         * BGP management option.
         *
         * @param bgpManagement the value to set
         * @return this builder
         */
        public Builder bgpManagement(BgpManagement bgpManagement) {
            this.bgpManagement = bgpManagement;
            this.__explicitlySet__.add("bgpManagement");
            return this;
        }
        /** The state of the BGP session associated with the virtual circuit. */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionState")
        private BgpSessionState bgpSessionState;

        /**
         * The state of the BGP session associated with the virtual circuit.
         *
         * @param bgpSessionState the value to set
         * @return this builder
         */
        public Builder bgpSessionState(BgpSessionState bgpSessionState) {
            this.bgpSessionState = bgpSessionState;
            this.__explicitlySet__.add("bgpSessionState");
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
         * The BGP ASN of the network at the other end of the BGP session from Oracle. If the
         * session is between the customer's edge router and Oracle, the value is the customer's
         * ASN. If the BGP session is between the provider's edge router and Oracle, the value is
         * the provider's ASN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        /**
         * The BGP ASN of the network at the other end of the BGP session from Oracle. If the
         * session is between the customer's edge router and Oracle, the value is the customer's
         * ASN. If the BGP session is between the provider's edge router and Oracle, the value is
         * the provider's ASN.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuit build() {
            VirtualCircuit model =
                    new VirtualCircuit(
                            this.bandwidthShapeName,
                            this.bgpManagement,
                            this.bgpSessionState,
                            this.compartmentId,
                            this.crossConnectMappings,
                            this.customerBgpAsn,
                            this.displayName,
                            this.gatewayId,
                            this.id,
                            this.lifecycleState,
                            this.oracleBgpAsn,
                            this.providerName,
                            this.providerServiceId,
                            this.providerServiceName,
                            this.providerState,
                            this.publicPrefixes,
                            this.referenceComment,
                            this.region,
                            this.serviceType,
                            this.timeCreated,
                            this.type);
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("crossConnectMappings")) {
                this.crossConnectMappings(model.getCrossConnectMappings());
            }
            if (model.wasPropertyExplicitlySet("customerBgpAsn")) {
                this.customerBgpAsn(model.getCustomerBgpAsn());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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

    /** BGP management option. */
    public enum BgpManagement implements com.oracle.bmc.http.internal.BmcEnum {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),
        ;

        private final String value;
        private static java.util.Map<String, BgpManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpManagement v : BgpManagement.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid BgpManagement: " + key);
        }
    };
    /** BGP management option. */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpManagement")
    private final BgpManagement bgpManagement;

    /**
     * BGP management option.
     *
     * @return the value
     */
    public BgpManagement getBgpManagement() {
        return bgpManagement;
    }

    /** The state of the BGP session associated with the virtual circuit. */
    public enum BgpSessionState implements com.oracle.bmc.http.internal.BmcEnum {
        Up("UP"),
        Down("DOWN"),
        ;

        private final String value;
        private static java.util.Map<String, BgpSessionState> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpSessionState v : BgpSessionState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid BgpSessionState: " + key);
        }
    };
    /** The state of the BGP session associated with the virtual circuit. */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionState")
    private final BgpSessionState bgpSessionState;

    /**
     * The state of the BGP session associated with the virtual circuit.
     *
     * @return the value
     */
    public BgpSessionState getBgpSessionState() {
        return bgpSessionState;
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

    /**
     * The BGP ASN of the network at the other end of the BGP session from Oracle. If the session is
     * between the customer's edge router and Oracle, the value is the customer's ASN. If the BGP
     * session is between the provider's edge router and Oracle, the value is the provider's ASN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    private final Integer customerBgpAsn;

    /**
     * The BGP ASN of the network at the other end of the BGP session from Oracle. If the session is
     * between the customer's edge router and Oracle, the value is the customer's ASN. If the BGP
     * session is between the provider's edge router and Oracle, the value is the provider's ASN.
     *
     * @return the value
     */
    public Integer getCustomerBgpAsn() {
        return customerBgpAsn;
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
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
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
        ;

        private final String value;
        private static java.util.Map<String, ServiceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceType v : ServiceType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ServiceType: " + key);
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
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Type: " + key);
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
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", crossConnectMappings=").append(String.valueOf(this.crossConnectMappings));
        sb.append(", customerBgpAsn=").append(String.valueOf(this.customerBgpAsn));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", gatewayId=").append(String.valueOf(this.gatewayId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", oracleBgpAsn=").append(String.valueOf(this.oracleBgpAsn));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", providerServiceId=").append(String.valueOf(this.providerServiceId));
        sb.append(", providerServiceName=").append(String.valueOf(this.providerServiceName));
        sb.append(", providerState=").append(String.valueOf(this.providerState));
        sb.append(", publicPrefixes=").append(String.valueOf(this.publicPrefixes));
        sb.append(", referenceComment=").append(String.valueOf(this.referenceComment));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", type=").append(String.valueOf(this.type));
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
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.crossConnectMappings, other.crossConnectMappings)
                && java.util.Objects.equals(this.customerBgpAsn, other.customerBgpAsn)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.gatewayId, other.gatewayId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.oracleBgpAsn, other.oracleBgpAsn)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.providerServiceId, other.providerServiceId)
                && java.util.Objects.equals(this.providerServiceName, other.providerServiceName)
                && java.util.Objects.equals(this.providerState, other.providerState)
                && java.util.Objects.equals(this.publicPrefixes, other.publicPrefixes)
                && java.util.Objects.equals(this.referenceComment, other.referenceComment)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.type, other.type)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectMappings == null
                                ? 43
                                : this.crossConnectMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpAsn == null ? 43 : this.customerBgpAsn.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
