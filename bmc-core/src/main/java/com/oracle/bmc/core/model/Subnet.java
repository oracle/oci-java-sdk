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
 * A logical subdivision of a VCN. Each subnet exists in a single Availability Domain and
 * consists of a contiguous range of IP addresses that do not overlap with
 * other subnets in the VCN. Example: 172.16.1.0/24. For more information, see
 * [Overview of the Networking Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm) and
 * [Managing Subnets](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingsubnets.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = Subnet.Builder.class)
public class Subnet {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @JsonProperty("cidrBlock")
        private String cidrBlock;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("dhcpOptionsId")
        private String dhcpOptionsId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("dnsLabel")
        private String dnsLabel;

        @JsonProperty("id")
        private String id;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("routeTableId")
        private String routeTableId;

        @JsonProperty("securityListIds")
        private List<String> securityListIds;

        @JsonProperty("subnetDomainName")
        private String subnetDomainName;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("vcnId")
        private String vcnId;

        @JsonProperty("virtualRouterIp")
        private String virtualRouterIp;

        @JsonProperty("virtualRouterMac")
        private String virtualRouterMac;

        public Subnet build() {
            return new Subnet(
                    availabilityDomain,
                    cidrBlock,
                    compartmentId,
                    dhcpOptionsId,
                    displayName,
                    dnsLabel,
                    id,
                    lifecycleState,
                    routeTableId,
                    securityListIds,
                    subnetDomainName,
                    timeCreated,
                    vcnId,
                    virtualRouterIp,
                    virtualRouterMac);
        }

        @JsonIgnore
        public Builder copy(Subnet o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .cidrBlock(o.getCidrBlock())
                    .compartmentId(o.getCompartmentId())
                    .dhcpOptionsId(o.getDhcpOptionsId())
                    .displayName(o.getDisplayName())
                    .dnsLabel(o.getDnsLabel())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .routeTableId(o.getRouteTableId())
                    .securityListIds(o.getSecurityListIds())
                    .subnetDomainName(o.getSubnetDomainName())
                    .timeCreated(o.getTimeCreated())
                    .vcnId(o.getVcnId())
                    .virtualRouterIp(o.getVirtualRouterIp())
                    .virtualRouterMac(o.getVirtualRouterMac());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The subnet's Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @JsonProperty("availabilityDomain")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The subnet's CIDR block.
     * <p>
     * Example: `172.16.1.0/24`
     *
     **/
    @JsonProperty("cidrBlock")
    @Valid
    @NotNull
    @Size(min = 1, max = 32)
    String cidrBlock;

    /**
     * The OCID of the compartment containing the subnet.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID of the set of DHCP options associated with the subnet.
     *
     **/
    @JsonProperty("dhcpOptionsId")
    @Size(min = 1, max = 255)
    String dhcpOptionsId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
     * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (e.g., `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
     * The value cannot be changed.
     * <p>
     * The absence of this parameter means the Internet and VCN Resolver
     * will not resolve hostnames of instances in this subnet.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `subnet123`
     *
     **/
    @JsonProperty("dnsLabel")
    @Size(min = 1, max = 15)
    String dnsLabel;

    /**
     * The subnet's Oracle ID (OCID).
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;
    /**
     * The subnet's current state.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static Map<String, LifecycleState> map;

        static {
            map = new HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new RuntimeException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * The subnet's current state.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The OCID of the route table the subnet is using.
     **/
    @JsonProperty("routeTableId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String routeTableId;

    /**
     * OCIDs for the security lists to use for VNICs in this subnet.
     **/
    @JsonProperty("securityListIds")
    List<String> securityListIds;

    /**
     * The subnet's domain name, which consists of the subnet's DNS label,
     * the VCN's DNS label, and the `oraclevcn.com` domain.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `subnet123.vcn1.oraclevcn.com`
     *
     **/
    @JsonProperty("subnetDomainName")
    @Size(min = 1, max = 253)
    String subnetDomainName;

    /**
     * The date and time the subnet was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;

    /**
     * The OCID of the VCN the subnet is in.
     **/
    @JsonProperty("vcnId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vcnId;

    /**
     * The IP address of the virtual router.
     * <p>
     * Example: `10.0.14.1`
     *
     **/
    @JsonProperty("virtualRouterIp")
    @Valid
    @NotNull
    @Size(min = 1, max = 32)
    String virtualRouterIp;

    /**
     * The MAC address of the virtual router.
     * <p>
     * Example: `00:00:17:B6:4D:DD`
     *
     **/
    @JsonProperty("virtualRouterMac")
    @Valid
    @NotNull
    @Size(min = 1, max = 32)
    String virtualRouterMac;
}
