/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * DHCP option for specifying how DNS (hostname resolution) is handled in the subnets in the VCN.
 * For more information, see
 * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DhcpDnsOption.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DhcpDnsOption extends DhcpOption {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("customDnsServers")
        private java.util.List<String> customDnsServers;

        public Builder customDnsServers(java.util.List<String> customDnsServers) {
            this.customDnsServers = customDnsServers;
            this.__explicitlySet__.add("customDnsServers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serverType")
        private ServerType serverType;

        public Builder serverType(ServerType serverType) {
            this.serverType = serverType;
            this.__explicitlySet__.add("serverType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DhcpDnsOption build() {
            DhcpDnsOption __instance__ = new DhcpDnsOption(customDnsServers, serverType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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

    public DhcpDnsOption(java.util.List<String> customDnsServers, ServerType serverType) {
        super();
        this.customDnsServers = customDnsServers;
        this.serverType = serverType;
    }

    /**
     * If you set `serverType` to `CustomDnsServer`, specify the IP address
     * of at least one DNS server of your choice (three maximum).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customDnsServers")
    java.util.List<String> customDnsServers;
    /**
     * - **VcnLocal:** Reserved for future use.
     * <p>
     * - **VcnLocalPlusInternet:** Also referred to as \"Internet and VCN Resolver\".
     * Instances can resolve internet hostnames (no Internet Gateway is required),
     * and can resolve hostnames of instances in the VCN. This is the default
     * value in the default set of DHCP options in the VCN. For the Internet and
     * VCN Resolver to work across the VCN, there must also be a DNS label set for
     * the VCN, a DNS label set for each subnet, and a hostname for each instance.
     * The Internet and VCN Resolver also enables reverse DNS lookup, which lets
     * you determine the hostname corresponding to the private IP address. For more
     * information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * - **CustomDnsServer:** Instances use a DNS server of your choice (three maximum).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ServerType {
        VcnLocal("VcnLocal"),
        VcnLocalPlusInternet("VcnLocalPlusInternet"),
        CustomDnsServer("CustomDnsServer"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ServerType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServerType v : ServerType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServerType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServerType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServerType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * - **VcnLocal:** Reserved for future use.
     * <p>
     * - **VcnLocalPlusInternet:** Also referred to as \"Internet and VCN Resolver\".
     * Instances can resolve internet hostnames (no Internet Gateway is required),
     * and can resolve hostnames of instances in the VCN. This is the default
     * value in the default set of DHCP options in the VCN. For the Internet and
     * VCN Resolver to work across the VCN, there must also be a DNS label set for
     * the VCN, a DNS label set for each subnet, and a hostname for each instance.
     * The Internet and VCN Resolver also enables reverse DNS lookup, which lets
     * you determine the hostname corresponding to the private IP address. For more
     * information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * - **CustomDnsServer:** Instances use a DNS server of your choice (three maximum).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serverType")
    ServerType serverType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
