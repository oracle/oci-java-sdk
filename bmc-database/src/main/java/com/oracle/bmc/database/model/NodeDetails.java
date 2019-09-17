/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * Node details associated with a network.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class NodeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ip")
        private String ip;

        public Builder ip(String ip) {
            this.ip = ip;
            this.__explicitlySet__.add("ip");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vipHostname")
        private String vipHostname;

        public Builder vipHostname(String vipHostname) {
            this.vipHostname = vipHostname;
            this.__explicitlySet__.add("vipHostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vip")
        private String vip;

        public Builder vip(String vip) {
            this.vip = vip;
            this.__explicitlySet__.add("vip");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeDetails build() {
            NodeDetails __instance__ = new NodeDetails(hostname, ip, vipHostname, vip);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeDetails o) {
            Builder copiedBuilder =
                    hostname(o.getHostname())
                            .ip(o.getIp())
                            .vipHostname(o.getVipHostname())
                            .vip(o.getVip());

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
     * The node host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * The node IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    String ip;

    /**
     * The node virtual IP (VIP) host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vipHostname")
    String vipHostname;

    /**
     * The node virtual IP (VIP) address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vip")
    String vip;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
