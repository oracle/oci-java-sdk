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

/**
 * For use with Oracle Bare Metal Cloud Services FastConnect.
 * <p>
 * A virtual circuit is an isolated network path that runs over one or more physical
 * network connections to provide a single, logical connection between the edge router
 * on the customer's existing network and a DRG. A customer could have multiple virtual
 * circuits, for example, to isolate traffic from different parts of their organization
 * (one virtual circuit for 10.0.1.0/24; another for 172.16.0.0/16), or to provide redundancy.
 * <p>
 * Each virtual circuit is made up of information shared between a customer, Oracle,
 * and a provider (if the customer is using FastConnect via a provider). Who fills in
 * a given property of a virtual circuit depends on whether the BGP session related to
 * that virtual circuit goes from the customer's edge router to Oracle, or from the provider's
 * edge router to Oracle. Also, in the case where the customer is using a provider, values
 * for some of the properties may not be present immediately, but may get filled in as the
 * provider and Oracle each do their part to provision the virtual circuit.
 * <p>
 * For more information, see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = VirtualCircuit.Builder.class)
public class VirtualCircuit {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        @JsonProperty("bgpSessionState")
        private BgpSessionState bgpSessionState;

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

        @JsonProperty("id")
        private String id;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("oracleBgpAsn")
        private Integer oracleBgpAsn;

        @JsonProperty("providerName")
        private String providerName;

        @JsonProperty("providerServiceName")
        private String providerServiceName;

        @JsonProperty("providerState")
        private ProviderState providerState;

        @JsonProperty("referenceComment")
        private String referenceComment;

        @JsonProperty("region")
        private String region;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("type")
        private Type type;

        public VirtualCircuit build() {
            return new VirtualCircuit(
                    bandwidthShapeName,
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
                    providerServiceName,
                    providerState,
                    referenceComment,
                    region,
                    timeCreated,
                    type);
        }

        @JsonIgnore
        public Builder copy(VirtualCircuit o) {
            return bandwidthShapeName(o.getBandwidthShapeName())
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
                    .providerServiceName(o.getProviderServiceName())
                    .providerState(o.getProviderState())
                    .referenceComment(o.getReferenceComment())
                    .region(o.getRegion())
                    .timeCreated(o.getTimeCreated())
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
     * The provisioned data rate of the connection.
     **/
    @JsonProperty("bandwidthShapeName")
    String bandwidthShapeName;
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
        private static Map<String, BgpSessionState> map;

        static {
            map = new HashMap<>();
            for (BgpSessionState v : BgpSessionState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpSessionState(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("bgpSessionState")
    BgpSessionState bgpSessionState;

    /**
     * The OCID of the compartment containing the virtual circuit.
     **/
    @JsonProperty("compartmentId")
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * An array of mappings, each containing properties for a
     * cross-connect or cross-connect group that is associated with this
     * virtual circuit.
     *
     **/
    @JsonProperty("crossConnectMappings")
    List<CrossConnectMapping> crossConnectMappings;

    /**
     * The BGP ASN of the network at the other end of the BGP
     * session from Oracle. If the session is between the customer's
     * edge router and Oracle, the value is the customer's ASN. If the BGP
     * session is between the provider's edge router and Oracle, the value
     * is the provider's ASN.
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
     * The OCID of the customer's {@link Drg}
     * that this virtual circuit uses.
     *
     **/
    @JsonProperty("gatewayId")
    @Size(min = 1, max = 255)
    String gatewayId;

    /**
     * The virtual circuit's Oracle ID (OCID).
     **/
    @JsonProperty("id")
    @Size(min = 1, max = 255)
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
        private static Map<String, LifecycleState> map;

        static {
            map = new HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The Oracle BGP ASN.
     **/
    @JsonProperty("oracleBgpAsn")
    Integer oracleBgpAsn;

    /**
     * The name of the provider (if the customer is connecting via a provider).
     *
     **/
    @JsonProperty("providerName")
    @Size(min = 1, max = 255)
    String providerName;

    /**
     * The name of the service offered by the provider (if the customer is connecting via a provider).
     *
     **/
    @JsonProperty("providerServiceName")
    @Size(min = 1, max = 255)
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
        private static Map<String, ProviderState> map;

        static {
            map = new HashMap<>();
            for (ProviderState v : ProviderState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
    @JsonProperty("providerState")
    ProviderState providerState;

    /**
     * Provider-supplied reference information about this virtual circuit
     * (if the customer is connecting via a provider).
     *
     **/
    @JsonProperty("referenceComment")
    String referenceComment;

    /**
     * The Oracle Bare Metal Cloud Services region where this virtual
     * circuit is located.
     *
     **/
    @JsonProperty("region")
    @Size(min = 1, max = 255)
    String region;

    /**
     * The date and time the virtual circuit was created,
     * in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;
    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE means
     * [RFC 1918](https://tools.ietf.org/html/rfc1918) addresses
     * (10.0.0.0/8, 172.16/12, and 192.168/16). Only PRIVATE is supported.
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
        private static Map<String, Type> map;

        static {
            map = new HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE means
     * [RFC 1918](https://tools.ietf.org/html/rfc1918) addresses
     * (10.0.0.0/8, 172.16/12, and 192.168/16). Only PRIVATE is supported.
     *
     **/
    @JsonProperty("type")
    Type type;
}
