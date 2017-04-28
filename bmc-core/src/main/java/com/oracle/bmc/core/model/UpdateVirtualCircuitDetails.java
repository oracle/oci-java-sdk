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
@JsonDeserialize(builder = UpdateVirtualCircuitDetails.Builder.class)
public class UpdateVirtualCircuitDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        @JsonProperty("crossConnectMappings")
        private List<CrossConnectMapping> crossConnectMappings;

        @JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("gatewayId")
        private String gatewayId;

        @JsonProperty("providerState")
        private ProviderState providerState;

        @JsonProperty("referenceComment")
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

        @JsonIgnore
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
    @JsonProperty("bandwidthShapeName")
    String bandwidthShapeName;

    /**
     * An array of mappings, each containing properties for a cross-connect or
     * cross-connect group associated with this virtual circuit.
     * <p>
     * To be updated only by the provider.
     *
     **/
    @JsonProperty("crossConnectMappings")
    List<CrossConnectMapping> crossConnectMappings;

    /**
     * The BGP ASN of the network at the other end of the BGP
     * session from Oracle.
     * <p>
     * If the BGP session is from the customer's CPE to Oracle, the
     * required value is the customer's ASN, and it can be updated only
     * by the customer.
     * <p>
     * If the BGP session is from the provider's edge router to Oracle, the
     * required value is the provider's ASN, and it can be updated only
     * by the provider.
     *
     **/
    @JsonProperty("customerBgpAsn")
    Integer customerBgpAsn;

    /**
     * A user-friendly name. Does not have to be unique.
     * <p>
     * To be updated only by the customer who owns the virtual circuit.
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the customer's {@link Drg}
     * that this virtual circuit uses.
     * <p>
     * To be updated only by the customer who owns the virtual circuit.
     *
     **/
    @JsonProperty("gatewayId")
    @Size(min = 1, max = 255)
    String gatewayId;
    /**
     * The provider's state in relation to this virtual circuit. ACTIVE
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
        private static Map<String, ProviderState> map;

        static {
            map = new HashMap<>();
            for (ProviderState v : ProviderState.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProviderState(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
        public static ProviderState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid ProviderState: " + key);
        }
    };
    /**
     * The provider's state in relation to this virtual circuit. ACTIVE
     * means the provider has provisioned the virtual circuit from their
     * end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     * <p>
     * To be updated only by the provider.
     *
     **/
    @JsonProperty("providerState")
    ProviderState providerState;

    /**
     * Provider-supplied reference information about this virtual circuit.
     * <p>
     * To be updated only by the provider.
     *
     **/
    @JsonProperty("referenceComment")
    String referenceComment;
}
