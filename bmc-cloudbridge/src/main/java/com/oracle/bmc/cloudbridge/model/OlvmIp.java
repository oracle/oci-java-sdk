/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Represents the IP configuration of a network interface.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmIp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmIp extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"address", "gateway", "netmask", "ipVersion"})
    public OlvmIp(String address, String gateway, String netmask, IpVersion ipVersion) {
        super();
        this.address = address;
        this.gateway = gateway;
        this.netmask = netmask;
        this.ipVersion = ipVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The text representation of the IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The text representation of the IP address.
         * @param address the value to set
         * @return this builder
         **/
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /**
         * The address of the default gateway.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gateway")
        private String gateway;

        /**
         * The address of the default gateway.
         * @param gateway the value to set
         * @return this builder
         **/
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            this.__explicitlySet__.add("gateway");
            return this;
        }
        /**
         * The network mask.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netmask")
        private String netmask;

        /**
         * The network mask.
         * @param netmask the value to set
         * @return this builder
         **/
        public Builder netmask(String netmask) {
            this.netmask = netmask;
            this.__explicitlySet__.add("netmask");
            return this;
        }
        /**
         * The version of the IP protocol.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
        private IpVersion ipVersion;

        /**
         * The version of the IP protocol.
         * @param ipVersion the value to set
         * @return this builder
         **/
        public Builder ipVersion(IpVersion ipVersion) {
            this.ipVersion = ipVersion;
            this.__explicitlySet__.add("ipVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmIp build() {
            OlvmIp model = new OlvmIp(this.address, this.gateway, this.netmask, this.ipVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmIp model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("gateway")) {
                this.gateway(model.getGateway());
            }
            if (model.wasPropertyExplicitlySet("netmask")) {
                this.netmask(model.getNetmask());
            }
            if (model.wasPropertyExplicitlySet("ipVersion")) {
                this.ipVersion(model.getIpVersion());
            }
            return this;
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
     * The text representation of the IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The text representation of the IP address.
     * @return the value
     **/
    public String getAddress() {
        return address;
    }

    /**
     * The address of the default gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    private final String gateway;

    /**
     * The address of the default gateway.
     * @return the value
     **/
    public String getGateway() {
        return gateway;
    }

    /**
     * The network mask.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netmask")
    private final String netmask;

    /**
     * The network mask.
     * @return the value
     **/
    public String getNetmask() {
        return netmask;
    }

    /**
     * The version of the IP protocol.
     **/
    public enum IpVersion {
        V4("V4"),
        V6("V6"),
        ;

        private final String value;
        private static java.util.Map<String, IpVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (IpVersion v : IpVersion.values()) {
                map.put(v.getValue(), v);
            }
        }

        IpVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IpVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IpVersion: " + key);
        }
    };
    /**
     * The version of the IP protocol.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
    private final IpVersion ipVersion;

    /**
     * The version of the IP protocol.
     * @return the value
     **/
    public IpVersion getIpVersion() {
        return ipVersion;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OlvmIp(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", gateway=").append(String.valueOf(this.gateway));
        sb.append(", netmask=").append(String.valueOf(this.netmask));
        sb.append(", ipVersion=").append(String.valueOf(this.ipVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmIp)) {
            return false;
        }

        OlvmIp other = (OlvmIp) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.gateway, other.gateway)
                && java.util.Objects.equals(this.netmask, other.netmask)
                && java.util.Objects.equals(this.ipVersion, other.ipVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.gateway == null ? 43 : this.gateway.hashCode());
        result = (result * PRIME) + (this.netmask == null ? 43 : this.netmask.hashCode());
        result = (result * PRIME) + (this.ipVersion == null ? 43 : this.ipVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
