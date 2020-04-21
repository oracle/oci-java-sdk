/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the client or backup networks in a VM cluster network.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VmNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class VmNetworkDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            this.__explicitlySet__.add("networkType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netmask")
        private String netmask;

        public Builder netmask(String netmask) {
            this.netmask = netmask;
            this.__explicitlySet__.add("netmask");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gateway")
        private String gateway;

        public Builder gateway(String gateway) {
            this.gateway = gateway;
            this.__explicitlySet__.add("gateway");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<NodeDetails> nodes;

        public Builder nodes(java.util.List<NodeDetails> nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmNetworkDetails build() {
            VmNetworkDetails __instance__ =
                    new VmNetworkDetails(vlanId, networkType, netmask, gateway, domainName, nodes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmNetworkDetails o) {
            Builder copiedBuilder =
                    vlanId(o.getVlanId())
                            .networkType(o.getNetworkType())
                            .netmask(o.getNetmask())
                            .gateway(o.getGateway())
                            .domainName(o.getDomainName())
                            .nodes(o.getNodes());

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
     * The network VLAN ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    String vlanId;
    /**
     * The network type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum NetworkType {
        Client("CLIENT"),
        Backup("BACKUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, NetworkType> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkType v : NetworkType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The network type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    NetworkType networkType;

    /**
     * The network netmask.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netmask")
    String netmask;

    /**
     * The network gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    String gateway;

    /**
     * The network domain name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    String domainName;

    /**
     * The list of node details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    java.util.List<NodeDetails> nodes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
