/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect.
 * <p>
 * A virtual circuit is an isolated network path that runs over one or more physical
 * network connections to provide a single, logical connection between the edge router
 * on the customer's existing network and Oracle Cloud Infrastructure. *Private*
 * virtual circuits support private peering, and *public* virtual circuits support
 * public peering. For more information, see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
 * <p>
 * Each virtual circuit is made up of information shared between a customer, Oracle,
 * and a provider (if the customer is using FastConnect via a provider). Who fills in
 * a given property of a virtual circuit depends on whether the BGP session related to
 * that virtual circuit goes from the customer's edge router to Oracle, or from the provider's
 * edge router to Oracle. Also, in the case where the customer is using a provider, values
 * for some of the properties may not be present immediately, but may get filled in as the
 * provider and Oracle each do their part to provision the virtual circuit.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VirtualCircuit.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class VirtualCircuit {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        public Builder bandwidthShapeName(String bandwidthShapeName) {
            this.bandwidthShapeName = bandwidthShapeName;
            this.__explicitlySet__.add("bandwidthShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpManagement")
        private BgpManagement bgpManagement;

        public Builder bgpManagement(BgpManagement bgpManagement) {
            this.bgpManagement = bgpManagement;
            this.__explicitlySet__.add("bgpManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionState")
        private BgpSessionState bgpSessionState;

        public Builder bgpSessionState(BgpSessionState bgpSessionState) {
            this.bgpSessionState = bgpSessionState;
            this.__explicitlySet__.add("bgpSessionState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
        private java.util.List<CrossConnectMapping> crossConnectMappings;

        public Builder crossConnectMappings(
                java.util.List<CrossConnectMapping> crossConnectMappings) {
            this.crossConnectMappings = crossConnectMappings;
            this.__explicitlySet__.add("crossConnectMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        public Builder customerBgpAsn(Integer customerBgpAsn) {
            this.customerBgpAsn = customerBgpAsn;
            this.__explicitlySet__.add("customerBgpAsn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
        private String gatewayId;

        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            this.__explicitlySet__.add("gatewayId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpAsn")
        private Integer oracleBgpAsn;

        public Builder oracleBgpAsn(Integer oracleBgpAsn) {
            this.oracleBgpAsn = oracleBgpAsn;
            this.__explicitlySet__.add("oracleBgpAsn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceId")
        private String providerServiceId;

        public Builder providerServiceId(String providerServiceId) {
            this.providerServiceId = providerServiceId;
            this.__explicitlySet__.add("providerServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
        private String providerServiceName;

        public Builder providerServiceName(String providerServiceName) {
            this.providerServiceName = providerServiceName;
            this.__explicitlySet__.add("providerServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerState")
        private ProviderState providerState;

        public Builder providerState(ProviderState providerState) {
            this.providerState = providerState;
            this.__explicitlySet__.add("providerState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
        private java.util.List<String> publicPrefixes;

        public Builder publicPrefixes(java.util.List<String> publicPrefixes) {
            this.publicPrefixes = publicPrefixes;
            this.__explicitlySet__.add("publicPrefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
        private String referenceComment;

        public Builder referenceComment(String referenceComment) {
            this.referenceComment = referenceComment;
            this.__explicitlySet__.add("referenceComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private ServiceType serviceType;

        public Builder serviceType(ServiceType serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuit build() {
            VirtualCircuit __instance__ =
                    new VirtualCircuit(
                            bandwidthShapeName,
                            bgpManagement,
                            bgpSessionState,
                            compartmentId,
                            crossConnectMappings,
                            customerBgpAsn,
                            displayName,
                            gatewayId,
                            id,
                            lifecycleState,
                            oracleBgpAsn,
                            providerName,
                            providerServiceId,
                            providerServiceName,
                            providerState,
                            publicPrefixes,
                            referenceComment,
                            region,
                            serviceType,
                            timeCreated,
                            type);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuit o) {
            Builder copiedBuilder =
                    bandwidthShapeName(o.getBandwidthShapeName())
                            .bgpManagement(o.getBgpManagement())
                            .bgpSessionState(o.getBgpSessionState())
                            .compartmentId(o.getCompartmentId())
                            .crossConnectMappings(o.getCrossConnectMappings())
                            .customerBgpAsn(o.getCustomerBgpAsn())
                            .displayName(o.getDisplayName())
                            .gatewayId(o.getGatewayId())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .oracleBgpAsn(o.getOracleBgpAsn())
                            .providerName(o.getProviderName())
                            .providerServiceId(o.getProviderServiceId())
                            .providerServiceName(o.getProviderServiceName())
                            .providerState(o.getProviderState())
                            .publicPrefixes(o.getPublicPrefixes())
                            .referenceComment(o.getReferenceComment())
                            .region(o.getRegion())
                            .serviceType(o.getServiceType())
                            .timeCreated(o.getTimeCreated())
                            .type(o.getType());

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
     * The provisioned data rate of the connection.  To get a list of the
     * available bandwidth levels (that is, shapes), see
     * {@link #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest) listFastConnectProviderVirtualCircuitBandwidthShapes}.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    String bandwidthShapeName;
    /**
     * BGP management option.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BgpManagement {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * BGP management option.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpManagement")
    BgpManagement bgpManagement;
    /**
     * The state of the BGP session associated with the virtual circuit.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BgpSessionState {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The state of the BGP session associated with the virtual circuit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionState")
    BgpSessionState bgpSessionState;

    /**
     * The OCID of the compartment containing the virtual circuit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * An array of mappings, each containing properties for a
     * cross-connect or cross-connect group that is associated with this
     * virtual circuit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
    java.util.List<CrossConnectMapping> crossConnectMappings;

    /**
     * The BGP ASN of the network at the other end of the BGP
     * session from Oracle. If the session is between the customer's
     * edge router and Oracle, the value is the customer's ASN. If the BGP
     * session is between the provider's edge router and Oracle, the value
     * is the provider's ASN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    Integer customerBgpAsn;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the customer's {@link Drg}
     * that this virtual circuit uses. Applicable only to private virtual circuits.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    String gatewayId;

    /**
     * The virtual circuit's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The virtual circuit's current state. For information about
     * the different states, see
     * [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        PendingProvider("PENDING_PROVIDER"),
        Verifying("VERIFYING"),
        Provisioning("PROVISIONING"),
        Provisioned("PROVISIONED"),
        Failed("FAILED"),
        Inactive("INACTIVE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
     * The virtual circuit's current state. For information about
     * the different states, see
     * [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The Oracle BGP ASN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpAsn")
    Integer oracleBgpAsn;

    /**
     * Deprecated. Instead use `providerServiceId`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    String providerName;

    /**
     * The OCID of the service offered by the provider (if the customer is connecting via a provider).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceId")
    String providerServiceId;

    /**
     * Deprecated. Instead use `providerServiceId`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    String providerServiceName;
    /**
     * The provider's state in relation to this virtual circuit (if the
     * customer is connecting via a provider). ACTIVE means
     * the provider has provisioned the virtual circuit from their end.
     * INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ProviderState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The provider's state in relation to this virtual circuit (if the
     * customer is connecting via a provider). ACTIVE means
     * the provider has provisioned the virtual circuit from their end.
     * INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerState")
    ProviderState providerState;

    /**
     * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to
     * advertise across the connection. Each prefix must be /31 or less specific.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
    java.util.List<String> publicPrefixes;

    /**
     * Provider-supplied reference information about this virtual circuit
     * (if the customer is connecting via a provider).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
    String referenceComment;

    /**
     * The Oracle Cloud Infrastructure region where this virtual
     * circuit is located.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    String region;
    /**
     * Provider service type.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ServiceType {
        Colocated("COLOCATED"),
        Layer2("LAYER2"),
        Layer3("LAYER3"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Provider service type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    ServiceType serviceType;

    /**
     * The date and time the virtual circuit was created,
     * in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * Whether the virtual circuit supports private or public peering. For more information,
     * see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        Public("PUBLIC"),
        Private("PRIVATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Whether the virtual circuit supports private or public peering. For more information,
     * see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
