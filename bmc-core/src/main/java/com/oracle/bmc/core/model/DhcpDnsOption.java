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
 * DHCP option for specifying how DNS (hostname resolution) is handled in the subnets in the VCN.
 * For more information, see
 * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = DhcpDnsOption.Builder.class)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class DhcpDnsOption extends DhcpOption {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("customDnsServers")
        private List<String> customDnsServers;

        @JsonProperty("serverType")
        private ServerType serverType;

        public DhcpDnsOption build() {
            return new DhcpDnsOption(customDnsServers, serverType);
        }

        @JsonIgnore
        public Builder copy(DhcpDnsOption o) {
            return customDnsServers(o.getCustomDnsServers()).serverType(o.getServerType());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public DhcpDnsOption(List<String> customDnsServers, ServerType serverType) {
        super();
        this.customDnsServers = customDnsServers;
        this.serverType = serverType;
    }

    /**
     * If you set `serverType` to `CustomDnsServer`, specify the IP address
     * of at least one DNS server of your choice (three maximum).
     *
     **/
    @JsonProperty("customDnsServers")
    List<String> customDnsServers;
    /**
     * - **VcnLocal:** Reserved for future use.
     * <p>
     * - **VcnLocalPlusInternet:** Also referred to as \"Internet and VCN Resolver\".
     * Instances can resolve internet hostnames (no Internet Gateway is required),
     * and can resolve hostnames of instances in the VCN. This is the default
     * value in the default set of DHCP options in the VCN. For the VCN Resolver to
     * work across the VCN, there must also be a DNS label set for the VCN, a DNS
     * label set for each subnet, and a hostname for each instance. For more information,
     * see [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * - **CustomDnsServer:** Instances use a DNS server of your choice (three maximum).
     *
     **/
    public enum ServerType {
        VcnLocal("VcnLocal"),
        VcnLocalPlusInternet("VcnLocalPlusInternet"),
        CustomDnsServer("CustomDnsServer"),
        ;

        private final String value;
        private static Map<String, ServerType> map;

        static {
            map = new HashMap<>();
            for (ServerType v : ServerType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ServerType(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
        public static ServerType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid ServerType: " + key);
        }
    };
    /**
     * - **VcnLocal:** Reserved for future use.
     * <p>
     * - **VcnLocalPlusInternet:** Also referred to as \"Internet and VCN Resolver\".
     * Instances can resolve internet hostnames (no Internet Gateway is required),
     * and can resolve hostnames of instances in the VCN. This is the default
     * value in the default set of DHCP options in the VCN. For the VCN Resolver to
     * work across the VCN, there must also be a DNS label set for the VCN, a DNS
     * label set for each subnet, and a hostname for each instance. For more information,
     * see [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * - **CustomDnsServer:** Instances use a DNS server of your choice (three maximum).
     *
     **/
    @JsonProperty("serverType")
    @Valid
    @NotNull
    ServerType serverType;
}
