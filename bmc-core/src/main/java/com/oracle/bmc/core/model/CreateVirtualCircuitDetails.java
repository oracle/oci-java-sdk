/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateVirtualCircuitDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateVirtualCircuitDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
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

        public CreateVirtualCircuitDetails build() {
            CreateVirtualCircuitDetails __instance__ =
                    new CreateVirtualCircuitDetails(
                            bandwidthShapeName,
                            compartmentId,
                            crossConnectMappings,
                            customerBgpAsn,
                            displayName,
                            gatewayId,
                            providerName,
                            providerServiceName,
                            region,
                            type);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVirtualCircuitDetails o) {
            Builder copiedBuilder =
                    bandwidthShapeName(o.getBandwidthShapeName())
                            .compartmentId(o.getCompartmentId())
                            .crossConnectMappings(o.getCrossConnectMappings())
                            .customerBgpAsn(o.getCustomerBgpAsn())
                            .displayName(o.getDisplayName())
                            .gatewayId(o.getGatewayId())
                            .providerName(o.getProviderName())
                            .providerServiceName(o.getProviderServiceName())
                            .region(o.getRegion())
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
     * {@link #listVirtualCircuitBandwidthShapes(ListVirtualCircuitBandwidthShapesRequest) listVirtualCircuitBandwidthShapes}.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    String bandwidthShapeName;

    /**
     * The OCID of the compartment to contain the virtual circuit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Create a `CrossConnectMapping` for each cross-connect or cross-connect
     * group this virtual circuit will run on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
    java.util.List<CrossConnectMapping> crossConnectMappings;

    /**
     * Your BGP ASN (either public or private). Provide this value only if
     * there's a BGP session that goes from your edge router to Oracle.
     * Otherwise, leave this empty or null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    Integer customerBgpAsn;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the {@link Drg}
     * that this virtual circuit uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    String gatewayId;

    /**
     * The name of the provider (if you're connecting via a provider).
     * To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    String providerName;

    /**
     * The name of the provider (if you're connecting via a provider).
     * To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    String providerServiceName;

    /**
     * The Oracle Cloud Infrastructure region where this virtual
     * circuit is located.
     * Example: `phx`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    String region;
    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE
     * means [RFC 1918](https://tools.ietf.org/html/rfc1918) addresses
     * (10.0.0.0/8, 172.16/12, and 192.168/16). Only PRIVATE is supported.
     *
     **/
    public enum Type {
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
            throw new RuntimeException("Invalid Type: " + key);
        }
    };
    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE
     * means [RFC 1918](https://tools.ietf.org/html/rfc1918) addresses
     * (10.0.0.0/8, 172.16/12, and 192.168/16). Only PRIVATE is supported.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
