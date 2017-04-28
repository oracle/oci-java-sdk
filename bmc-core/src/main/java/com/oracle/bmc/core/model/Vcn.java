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
 * A Virtual Cloud Network (VCN). For more information, see
 * [Overview of the Networking Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = Vcn.Builder.class)
public class Vcn {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("cidrBlock")
        private String cidrBlock;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("defaultDhcpOptionsId")
        private String defaultDhcpOptionsId;

        @JsonProperty("defaultRouteTableId")
        private String defaultRouteTableId;

        @JsonProperty("defaultSecurityListId")
        private String defaultSecurityListId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("dnsLabel")
        private String dnsLabel;

        @JsonProperty("id")
        private String id;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("vcnDomainName")
        private String vcnDomainName;

        public Vcn build() {
            return new Vcn(
                    cidrBlock,
                    compartmentId,
                    defaultDhcpOptionsId,
                    defaultRouteTableId,
                    defaultSecurityListId,
                    displayName,
                    dnsLabel,
                    id,
                    lifecycleState,
                    timeCreated,
                    vcnDomainName);
        }

        @JsonIgnore
        public Builder copy(Vcn o) {
            return cidrBlock(o.getCidrBlock())
                    .compartmentId(o.getCompartmentId())
                    .defaultDhcpOptionsId(o.getDefaultDhcpOptionsId())
                    .defaultRouteTableId(o.getDefaultRouteTableId())
                    .defaultSecurityListId(o.getDefaultSecurityListId())
                    .displayName(o.getDisplayName())
                    .dnsLabel(o.getDnsLabel())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .timeCreated(o.getTimeCreated())
                    .vcnDomainName(o.getVcnDomainName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The CIDR IP address block of the VCN.
     * <p>
     * Example: `172.16.0.0/16`
     *
     **/
    @JsonProperty("cidrBlock")
    @Valid
    @NotNull
    @Size(min = 1, max = 32)
    String cidrBlock;

    /**
     * The OCID of the compartment containing the VCN.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID for the VCN's default set of DHCP options.
     *
     **/
    @JsonProperty("defaultDhcpOptionsId")
    @Size(min = 1, max = 255)
    String defaultDhcpOptionsId;

    /**
     * The OCID for the VCN's default route table.
     **/
    @JsonProperty("defaultRouteTableId")
    @Size(min = 1, max = 255)
    String defaultRouteTableId;

    /**
     * The OCID for the VCN's default security list.
     **/
    @JsonProperty("defaultSecurityListId")
    @Size(min = 1, max = 255)
    String defaultSecurityListId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * A DNS label for the VCN, used in conjunction with the VNIC's hostname and
     * subnet's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (e.g., `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be an alphanumeric string that begins with a letter.
     * The value cannot be changed.
     * <p>
     * The absence of this parameter means the Internet and VCN Resolver will
     * not work for this VCN.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `vcn1`
     *
     **/
    @JsonProperty("dnsLabel")
    @Size(min = 1, max = 15)
    String dnsLabel;

    /**
     * The VCN's Oracle ID (OCID).
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;
    /**
     * The VCN's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
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
     * The VCN's current state.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The date and time the VCN was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;

    /**
     * The VCN's domain name, which consists of the VCN's DNS label, and the
     * `oraclevcn.com` domain.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `vcn1.oraclevcn.com`
     *
     **/
    @JsonProperty("vcnDomainName")
    @Size(min = 1, max = 253)
    String vcnDomainName;
}
