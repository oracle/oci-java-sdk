/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateVirtualCircuitDetails.Builder.class
)
public class CreateVirtualCircuitDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
        private java.util.List<CrossConnectMapping> crossConnectMappings;

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
        private String gatewayId;

        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
        private String providerServiceName;

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public CreateVirtualCircuitDetails build() {
            return new CreateVirtualCircuitDetails(
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
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVirtualCircuitDetails o) {
            return bandwidthShapeName(o.getBandwidthShapeName())
                    .compartmentId(o.getCompartmentId())
                    .crossConnectMappings(o.getCrossConnectMappings())
                    .customerBgpAsn(o.getCustomerBgpAsn())
                    .displayName(o.getDisplayName())
                    .gatewayId(o.getGatewayId())
                    .providerName(o.getProviderName())
                    .providerServiceName(o.getProviderServiceName())
                    .region(o.getRegion())
                    .type(o.getType());
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
     * available bandwidth levels (i.e., shapes), see
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the {@link Drg}
     * that this virtual circuit uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String gatewayId;

    /**
     * The name of the provider (if you're connecting via a provider).
     * To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String providerName;

    /**
     * The name of the service offered by the provider (if you're connecting
     * via a provider). To get a list of the available service offerings, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String providerServiceName;

    /**
     * The Oracle Bare Metal Cloud Services region where this virtual
     * circuit is located.
     * <p>
     * Example: `phx`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Type type;
}
