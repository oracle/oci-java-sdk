/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateVirtualCircuitDetails.Builder.class
)
public class UpdateVirtualCircuitDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
        private java.util.List<CrossConnectMapping> crossConnectMappings;

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
        private String gatewayId;

        @com.fasterxml.jackson.annotation.JsonProperty("providerState")
        private ProviderState providerState;

        @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
        private String referenceComment;

        public UpdateVirtualCircuitDetails build() {
            return new UpdateVirtualCircuitDetails(
                    bandwidthShapeName,
                    crossConnectMappings,
                    customerBgpAsn,
                    displayName,
                    gatewayId,
                    providerState,
                    referenceComment);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVirtualCircuitDetails o) {
            return bandwidthShapeName(o.getBandwidthShapeName())
                    .crossConnectMappings(o.getCrossConnectMappings())
                    .customerBgpAsn(o.getCustomerBgpAsn())
                    .displayName(o.getDisplayName())
                    .gatewayId(o.getGatewayId())
                    .providerState(o.getProviderState())
                    .referenceComment(o.getReferenceComment());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The provisioned data rate of the connection. To get a list of the
     * available bandwidth levels (i.e., shapes), see
     * {@link #listVirtualCircuitBandwidthShapes(ListVirtualCircuitBandwidthShapesRequest) listVirtualCircuitBandwidthShapes}.
     * <p>
     * To be updated only by the customer who owns the virtual circuit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    String bandwidthShapeName;

    /**
     * An array of mappings, each containing properties for a cross-connect or
     * cross-connect group associated with this virtual circuit.
     * <p>
     * The customer and provider can update different properties in the mapping
     * depending on the situation. See the description of the
     * {@link CrossConnectMapping}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
    java.util.List<CrossConnectMapping> crossConnectMappings;

    /**
     * The BGP ASN of the network at the other end of the BGP
     * session from Oracle.
     * <p>
     * If the BGP session is from the customer's edge router to Oracle, the
     * required value is the customer's ASN, and it can be updated only
     * by the customer.
     * <p>
     * If the BGP session is from the provider's edge router to Oracle, the
     * required value is the provider's ASN, and it can be updated only
     * by the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    Integer customerBgpAsn;

    /**
     * A user-friendly name. Does not have to be unique.
     * Avoid entering confidential information.
     * <p>
     * To be updated only by the customer who owns the virtual circuit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the {@link Drg}
     * that this virtual circuit uses.
     * <p>
     * To be updated only by the customer who owns the virtual circuit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String gatewayId;
    /**
     * The provider's state in relation to this virtual circuit. Relevant only
     * if the customer is using FastConnect via a provider.  ACTIVE
     * means the provider has provisioned the virtual circuit from their
     * end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     * <p>
     * To be updated only by the provider.
     *
     **/
    public enum ProviderState {
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
            throw new RuntimeException("Invalid ProviderState: " + key);
        }
    };
    /**
     * The provider's state in relation to this virtual circuit. Relevant only
     * if the customer is using FastConnect via a provider.  ACTIVE
     * means the provider has provisioned the virtual circuit from their
     * end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     * <p>
     * To be updated only by the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerState")
    ProviderState providerState;

    /**
     * Provider-supplied reference information about this virtual circuit.
     * Relevant only if the customer is using FastConnect via a provider.
     * <p>
     * To be updated only by the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
    String referenceComment;
}
