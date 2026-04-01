/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * The type describes the configuration of a virtual network interface.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OlvmNicConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmNicConfiguration extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bootProtocol",
        "ip",
        "ipv6",
        "ipv6BootProtocol",
        "name",
        "isOnBoot"
    })
    public OlvmNicConfiguration(
            OlvmBootProtocol bootProtocol,
            OlvmIp ip,
            OlvmIp ipv6,
            OlvmBootProtocol ipv6BootProtocol,
            String name,
            Boolean isOnBoot) {
        super();
        this.bootProtocol = bootProtocol;
        this.ip = ip;
        this.ipv6 = ipv6;
        this.ipv6BootProtocol = ipv6BootProtocol;
        this.name = name;
        this.isOnBoot = isOnBoot;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("bootProtocol")
        private OlvmBootProtocol bootProtocol;

        public Builder bootProtocol(OlvmBootProtocol bootProtocol) {
            this.bootProtocol = bootProtocol;
            this.__explicitlySet__.add("bootProtocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ip")
        private OlvmIp ip;

        public Builder ip(OlvmIp ip) {
            this.ip = ip;
            this.__explicitlySet__.add("ip");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6")
        private OlvmIp ipv6;

        public Builder ipv6(OlvmIp ipv6) {
            this.ipv6 = ipv6;
            this.__explicitlySet__.add("ipv6");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6BootProtocol")
        private OlvmBootProtocol ipv6BootProtocol;

        public Builder ipv6BootProtocol(OlvmBootProtocol ipv6BootProtocol) {
            this.ipv6BootProtocol = ipv6BootProtocol;
            this.__explicitlySet__.add("ipv6BootProtocol");
            return this;
        }
        /**
         * Network interface name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Network interface name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Specifies whether the network interface should be activated on the virtual machine guest operating system boot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOnBoot")
        private Boolean isOnBoot;

        /**
         * Specifies whether the network interface should be activated on the virtual machine guest operating system boot.
         * @param isOnBoot the value to set
         * @return this builder
         **/
        public Builder isOnBoot(Boolean isOnBoot) {
            this.isOnBoot = isOnBoot;
            this.__explicitlySet__.add("isOnBoot");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmNicConfiguration build() {
            OlvmNicConfiguration model =
                    new OlvmNicConfiguration(
                            this.bootProtocol,
                            this.ip,
                            this.ipv6,
                            this.ipv6BootProtocol,
                            this.name,
                            this.isOnBoot);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmNicConfiguration model) {
            if (model.wasPropertyExplicitlySet("bootProtocol")) {
                this.bootProtocol(model.getBootProtocol());
            }
            if (model.wasPropertyExplicitlySet("ip")) {
                this.ip(model.getIp());
            }
            if (model.wasPropertyExplicitlySet("ipv6")) {
                this.ipv6(model.getIpv6());
            }
            if (model.wasPropertyExplicitlySet("ipv6BootProtocol")) {
                this.ipv6BootProtocol(model.getIpv6BootProtocol());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isOnBoot")) {
                this.isOnBoot(model.getIsOnBoot());
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

    @com.fasterxml.jackson.annotation.JsonProperty("bootProtocol")
    private final OlvmBootProtocol bootProtocol;

    public OlvmBootProtocol getBootProtocol() {
        return bootProtocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    private final OlvmIp ip;

    public OlvmIp getIp() {
        return ip;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ipv6")
    private final OlvmIp ipv6;

    public OlvmIp getIpv6() {
        return ipv6;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ipv6BootProtocol")
    private final OlvmBootProtocol ipv6BootProtocol;

    public OlvmBootProtocol getIpv6BootProtocol() {
        return ipv6BootProtocol;
    }

    /**
     * Network interface name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Network interface name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Specifies whether the network interface should be activated on the virtual machine guest operating system boot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOnBoot")
    private final Boolean isOnBoot;

    /**
     * Specifies whether the network interface should be activated on the virtual machine guest operating system boot.
     * @return the value
     **/
    public Boolean getIsOnBoot() {
        return isOnBoot;
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
        sb.append("OlvmNicConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("bootProtocol=").append(String.valueOf(this.bootProtocol));
        sb.append(", ip=").append(String.valueOf(this.ip));
        sb.append(", ipv6=").append(String.valueOf(this.ipv6));
        sb.append(", ipv6BootProtocol=").append(String.valueOf(this.ipv6BootProtocol));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isOnBoot=").append(String.valueOf(this.isOnBoot));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmNicConfiguration)) {
            return false;
        }

        OlvmNicConfiguration other = (OlvmNicConfiguration) o;
        return java.util.Objects.equals(this.bootProtocol, other.bootProtocol)
                && java.util.Objects.equals(this.ip, other.ip)
                && java.util.Objects.equals(this.ipv6, other.ipv6)
                && java.util.Objects.equals(this.ipv6BootProtocol, other.ipv6BootProtocol)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isOnBoot, other.isOnBoot)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bootProtocol == null ? 43 : this.bootProtocol.hashCode());
        result = (result * PRIME) + (this.ip == null ? 43 : this.ip.hashCode());
        result = (result * PRIME) + (this.ipv6 == null ? 43 : this.ipv6.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6BootProtocol == null ? 43 : this.ipv6BootProtocol.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isOnBoot == null ? 43 : this.isOnBoot.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
