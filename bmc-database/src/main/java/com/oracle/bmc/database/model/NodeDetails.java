/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodeDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"hostname", "ip", "vipHostname", "vip"})
    public NodeDetails(String hostname, String ip, String vipHostname, String vip) {
        super();
        this.hostname = hostname;
        this.ip = ip;
        this.vipHostname = vipHostname;
        this.vip = vip;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The node host name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The node host name.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The node IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ip")
        private String ip;

        /**
         * The node IP address.
         * @param ip the value to set
         * @return this builder
         **/
        public Builder ip(String ip) {
            this.ip = ip;
            this.__explicitlySet__.add("ip");
            return this;
        }
        /**
         * The node virtual IP (VIP) host name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vipHostname")
        private String vipHostname;

        /**
         * The node virtual IP (VIP) host name.
         * @param vipHostname the value to set
         * @return this builder
         **/
        public Builder vipHostname(String vipHostname) {
            this.vipHostname = vipHostname;
            this.__explicitlySet__.add("vipHostname");
            return this;
        }
        /**
         * The node virtual IP (VIP) address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vip")
        private String vip;

        /**
         * The node virtual IP (VIP) address.
         * @param vip the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The node host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The node host name.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * The node IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    private final String ip;

    /**
     * The node IP address.
     * @return the value
     **/
    public String getIp() {
        return ip;
    }

    /**
     * The node virtual IP (VIP) host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vipHostname")
    private final String vipHostname;

    /**
     * The node virtual IP (VIP) host name.
     * @return the value
     **/
    public String getVipHostname() {
        return vipHostname;
    }

    /**
     * The node virtual IP (VIP) address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vip")
    private final String vip;

    /**
     * The node virtual IP (VIP) address.
     * @return the value
     **/
    public String getVip() {
        return vip;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NodeDetails(");
        sb.append("hostname=").append(String.valueOf(this.hostname));
        sb.append(", ip=").append(String.valueOf(this.ip));
        sb.append(", vipHostname=").append(String.valueOf(this.vipHostname));
        sb.append(", vip=").append(String.valueOf(this.vip));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeDetails)) {
            return false;
        }

        NodeDetails other = (NodeDetails) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.ip, other.ip)
                && java.util.Objects.equals(this.vipHostname, other.vipHostname)
                && java.util.Objects.equals(this.vip, other.vip)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.ip == null ? 43 : this.ip.hashCode());
        result = (result * PRIME) + (this.vipHostname == null ? 43 : this.vipHostname.hashCode());
        result = (result * PRIME) + (this.vip == null ? 43 : this.vip.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
