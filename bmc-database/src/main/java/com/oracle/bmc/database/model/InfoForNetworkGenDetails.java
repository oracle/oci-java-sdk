/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for generation of the client or backup network in a VM cluster network in an Exadata Cloud@Customer system.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InfoForNetworkGenDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InfoForNetworkGenDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            this.__explicitlySet__.add("networkType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cidr")
        private String cidr;

        public Builder cidr(String cidr) {
            this.cidr = cidr;
            this.__explicitlySet__.add("cidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gateway")
        private String gateway;

        public Builder gateway(String gateway) {
            this.gateway = gateway;
            this.__explicitlySet__.add("gateway");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netmask")
        private String netmask;

        public Builder netmask(String netmask) {
            this.netmask = netmask;
            this.__explicitlySet__.add("netmask");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InfoForNetworkGenDetails build() {
            InfoForNetworkGenDetails __instance__ =
                    new InfoForNetworkGenDetails(
                            networkType, vlanId, cidr, gateway, netmask, domain, prefix);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InfoForNetworkGenDetails o) {
            Builder copiedBuilder =
                    networkType(o.getNetworkType())
                            .vlanId(o.getVlanId())
                            .cidr(o.getCidr())
                            .gateway(o.getGateway())
                            .netmask(o.getNetmask())
                            .domain(o.getDomain())
                            .prefix(o.getPrefix());

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
     * The network type.
     **/
    public enum NetworkType {
        Client("CLIENT"),
        Backup("BACKUP"),
        ;

        private final String value;
        private static java.util.Map<String, NetworkType> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkType v : NetworkType.values()) {
                map.put(v.getValue(), v);
            }
        }

        NetworkType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NetworkType: " + key);
        }
    };
    /**
     * The network type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    NetworkType networkType;

    /**
     * The network VLAN ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    String vlanId;

    /**
     * The cidr for the network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidr")
    String cidr;

    /**
     * The network gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    String gateway;

    /**
     * The network netmask.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netmask")
    String netmask;

    /**
     * The network domain name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * The network domain name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    String prefix;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
