/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A service offering from a supported provider. For more information,
 * see [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FastConnectProviderService.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class FastConnectProviderService {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privatePeeringBgpManagement")
        private PrivatePeeringBgpManagement privatePeeringBgpManagement;

        public Builder privatePeeringBgpManagement(
                PrivatePeeringBgpManagement privatePeeringBgpManagement) {
            this.privatePeeringBgpManagement = privatePeeringBgpManagement;
            this.__explicitlySet__.add("privatePeeringBgpManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
        private String providerServiceName;

        public Builder providerServiceName(String providerServiceName) {
            this.providerServiceName = providerServiceName;
            this.__explicitlySet__.add("providerServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicPeeringBgpManagement")
        private PublicPeeringBgpManagement publicPeeringBgpManagement;

        public Builder publicPeeringBgpManagement(
                PublicPeeringBgpManagement publicPeeringBgpManagement) {
            this.publicPeeringBgpManagement = publicPeeringBgpManagement;
            this.__explicitlySet__.add("publicPeeringBgpManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedVirtualCircuitTypes")
        private java.util.List<SupportedVirtualCircuitTypes> supportedVirtualCircuitTypes;

        public Builder supportedVirtualCircuitTypes(
                java.util.List<SupportedVirtualCircuitTypes> supportedVirtualCircuitTypes) {
            this.supportedVirtualCircuitTypes = supportedVirtualCircuitTypes;
            this.__explicitlySet__.add("supportedVirtualCircuitTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerAsnManagement")
        private CustomerAsnManagement customerAsnManagement;

        public Builder customerAsnManagement(CustomerAsnManagement customerAsnManagement) {
            this.customerAsnManagement = customerAsnManagement;
            this.__explicitlySet__.add("customerAsnManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceKeyManagement")
        private ProviderServiceKeyManagement providerServiceKeyManagement;

        public Builder providerServiceKeyManagement(
                ProviderServiceKeyManagement providerServiceKeyManagement) {
            this.providerServiceKeyManagement = providerServiceKeyManagement;
            this.__explicitlySet__.add("providerServiceKeyManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bandwithShapeManagement")
        private BandwithShapeManagement bandwithShapeManagement;

        public Builder bandwithShapeManagement(BandwithShapeManagement bandwithShapeManagement) {
            this.bandwithShapeManagement = bandwithShapeManagement;
            this.__explicitlySet__.add("bandwithShapeManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requiredTotalCrossConnects")
        private Integer requiredTotalCrossConnects;

        public Builder requiredTotalCrossConnects(Integer requiredTotalCrossConnects) {
            this.requiredTotalCrossConnects = requiredTotalCrossConnects;
            this.__explicitlySet__.add("requiredTotalCrossConnects");
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

        public FastConnectProviderService build() {
            FastConnectProviderService __instance__ =
                    new FastConnectProviderService(
                            description,
                            id,
                            privatePeeringBgpManagement,
                            providerName,
                            providerServiceName,
                            publicPeeringBgpManagement,
                            supportedVirtualCircuitTypes,
                            customerAsnManagement,
                            providerServiceKeyManagement,
                            bandwithShapeManagement,
                            requiredTotalCrossConnects,
                            type);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FastConnectProviderService o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .id(o.getId())
                            .privatePeeringBgpManagement(o.getPrivatePeeringBgpManagement())
                            .providerName(o.getProviderName())
                            .providerServiceName(o.getProviderServiceName())
                            .publicPeeringBgpManagement(o.getPublicPeeringBgpManagement())
                            .supportedVirtualCircuitTypes(o.getSupportedVirtualCircuitTypes())
                            .customerAsnManagement(o.getCustomerAsnManagement())
                            .providerServiceKeyManagement(o.getProviderServiceKeyManagement())
                            .bandwithShapeManagement(o.getBandwithShapeManagement())
                            .requiredTotalCrossConnects(o.getRequiredTotalCrossConnects())
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
     * The location of the provider's website or portal. This portal is where you can get information
     * about the provider service, create a virtual circuit connection from the provider to Oracle
     * Cloud Infrastructure, and retrieve your provider service key for that virtual circuit connection.
     * <p>
     * Example: `https://example.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The OCID of the service offered by the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * Who is responsible for managing the private peering BGP information.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PrivatePeeringBgpManagement {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PrivatePeeringBgpManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (PrivatePeeringBgpManagement v : PrivatePeeringBgpManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PrivatePeeringBgpManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrivatePeeringBgpManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PrivatePeeringBgpManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Who is responsible for managing the private peering BGP information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privatePeeringBgpManagement")
    PrivatePeeringBgpManagement privatePeeringBgpManagement;

    /**
     * The name of the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    String providerName;

    /**
     * The name of the service offered by the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    String providerServiceName;
    /**
     * Who is responsible for managing the public peering BGP information.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PublicPeeringBgpManagement {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PublicPeeringBgpManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicPeeringBgpManagement v : PublicPeeringBgpManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublicPeeringBgpManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicPeeringBgpManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublicPeeringBgpManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Who is responsible for managing the public peering BGP information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicPeeringBgpManagement")
    PublicPeeringBgpManagement publicPeeringBgpManagement;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum SupportedVirtualCircuitTypes {
        Public("PUBLIC"),
        Private("PRIVATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, SupportedVirtualCircuitTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (SupportedVirtualCircuitTypes v : SupportedVirtualCircuitTypes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SupportedVirtualCircuitTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SupportedVirtualCircuitTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SupportedVirtualCircuitTypes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * An array of virtual circuit types supported by this service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedVirtualCircuitTypes")
    java.util.List<SupportedVirtualCircuitTypes> supportedVirtualCircuitTypes;
    /**
     * Who is responsible for managing the ASN information for the network at the other end
     * of the connection from Oracle.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CustomerAsnManagement {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, CustomerAsnManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (CustomerAsnManagement v : CustomerAsnManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CustomerAsnManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CustomerAsnManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CustomerAsnManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Who is responsible for managing the ASN information for the network at the other end
     * of the connection from Oracle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerAsnManagement")
    CustomerAsnManagement customerAsnManagement;
    /**
     * Who is responsible for managing the provider service key.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ProviderServiceKeyManagement {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ProviderServiceKeyManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (ProviderServiceKeyManagement v : ProviderServiceKeyManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ProviderServiceKeyManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProviderServiceKeyManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ProviderServiceKeyManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Who is responsible for managing the provider service key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceKeyManagement")
    ProviderServiceKeyManagement providerServiceKeyManagement;
    /**
     * Who is responsible for managing the virtual circuit bandwidth.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BandwithShapeManagement {
        CustomerManaged("CUSTOMER_MANAGED"),
        ProviderManaged("PROVIDER_MANAGED"),
        OracleManaged("ORACLE_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BandwithShapeManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (BandwithShapeManagement v : BandwithShapeManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BandwithShapeManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BandwithShapeManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BandwithShapeManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Who is responsible for managing the virtual circuit bandwidth.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bandwithShapeManagement")
    BandwithShapeManagement bandwithShapeManagement;

    /**
     * Total number of cross-connect or cross-connect groups required for the virtual circuit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requiredTotalCrossConnects")
    Integer requiredTotalCrossConnects;
    /**
     * Provider service type.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        Layer2("LAYER2"),
        Layer3("LAYER3"),

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
     * Provider service type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
