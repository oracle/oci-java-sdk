/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateVirtualCircuitDetails.Builder.class)
public class CreateVirtualCircuitDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("crossConnectMappings")
        private List<CrossConnectMapping> crossConnectMappings;

        @JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("gatewayId")
        private String gatewayId;

        @JsonProperty("providerName")
        private String providerName;

        @JsonProperty("providerServiceName")
        private String providerServiceName;

        @JsonProperty("region")
        private String region;

        @JsonProperty("type")
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

        @JsonIgnore
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
    @JsonProperty("bandwidthShapeName")
    String bandwidthShapeName;

    /**
     * The OCID of the compartment to contain the virtual circuit.
     *
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * Create a `CrossConnectMapping` for each cross-connect or cross-connect
     * group this virtual circuit will run on.
     *
     **/
    @JsonProperty("crossConnectMappings")
    List<CrossConnectMapping> crossConnectMappings;

    /**
     * Your BGP ASN (either public or private). Provide this value only if
     * there's a BGP session that goes from your edge router to Oracle.
     * Otherwise, leave this empty or null.
     *
     **/
    @JsonProperty("customerBgpAsn")
    Integer customerBgpAsn;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the {@link Drg}
     * that this virtual circuit uses.
     *
     **/
    @JsonProperty("gatewayId")
    @Size(min = 1, max = 255)
    String gatewayId;

    /**
     * The name of the provider (if you're connecting via a provider).
     * To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @JsonProperty("providerName")
    @Size(min = 1, max = 255)
    String providerName;

    /**
     * The name of the service offered by the provider (if you're connecting
     * via a provider). To get a list of the available service offerings, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @JsonProperty("providerServiceName")
    @Size(min = 1, max = 255)
    String providerServiceName;

    /**
     * The Oracle Bare Metal Cloud Services region where this virtual
     * circuit is located.
     * <p>
     * Example: `phx`
     *
     **/
    @JsonProperty("region")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
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
        private static Map<String, Type> map;

        static {
            map = new HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("type")
    @Valid
    @NotNull
    Type type;
}
