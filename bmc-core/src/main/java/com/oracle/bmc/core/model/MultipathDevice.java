/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Secondary multipath device, it uses the charUsername and chapSecret from primary volume attachment
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MultipathDevice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MultipathDevice {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv4", "iqn", "port"})
    public MultipathDevice(String ipv4, String iqn, Integer port) {
        super();
        this.ipv4 = ipv4;
        this.iqn = iqn;
        this.port = port;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The volume's iSCSI IP address.
         * <p>
         * Example: {@code 169.254.2.2}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
        private String ipv4;

        /**
         * The volume's iSCSI IP address.
         * <p>
         * Example: {@code 169.254.2.2}
         *
         * @param ipv4 the value to set
         * @return this builder
         **/
        public Builder ipv4(String ipv4) {
            this.ipv4 = ipv4;
            this.__explicitlySet__.add("ipv4");
            return this;
        }
        /**
         * The target volume's iSCSI Qualified Name in the format defined
         * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
         * <p>
         * Example: {@code iqn.2015-12.com.oracleiaas:40b7ee03-883f-46c6-a951-63d2841d2195}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("iqn")
        private String iqn;

        /**
         * The target volume's iSCSI Qualified Name in the format defined
         * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
         * <p>
         * Example: {@code iqn.2015-12.com.oracleiaas:40b7ee03-883f-46c6-a951-63d2841d2195}
         *
         * @param iqn the value to set
         * @return this builder
         **/
        public Builder iqn(String iqn) {
            this.iqn = iqn;
            this.__explicitlySet__.add("iqn");
            return this;
        }
        /**
         * The volume's iSCSI port, usually port 860 or 3260.
         * <p>
         * Example: {@code 3260}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The volume's iSCSI port, usually port 860 or 3260.
         * <p>
         * Example: {@code 3260}
         *
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultipathDevice build() {
            MultipathDevice __instance__ = new MultipathDevice(ipv4, iqn, port);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultipathDevice o) {
            Builder copiedBuilder = ipv4(o.getIpv4()).iqn(o.getIqn()).port(o.getPort());

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
     * The volume's iSCSI IP address.
     * <p>
     * Example: {@code 169.254.2.2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
    private final String ipv4;

    /**
     * The volume's iSCSI IP address.
     * <p>
     * Example: {@code 169.254.2.2}
     *
     * @return the value
     **/
    public String getIpv4() {
        return ipv4;
    }

    /**
     * The target volume's iSCSI Qualified Name in the format defined
     * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
     * <p>
     * Example: {@code iqn.2015-12.com.oracleiaas:40b7ee03-883f-46c6-a951-63d2841d2195}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iqn")
    private final String iqn;

    /**
     * The target volume's iSCSI Qualified Name in the format defined
     * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
     * <p>
     * Example: {@code iqn.2015-12.com.oracleiaas:40b7ee03-883f-46c6-a951-63d2841d2195}
     *
     * @return the value
     **/
    public String getIqn() {
        return iqn;
    }

    /**
     * The volume's iSCSI port, usually port 860 or 3260.
     * <p>
     * Example: {@code 3260}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The volume's iSCSI port, usually port 860 or 3260.
     * <p>
     * Example: {@code 3260}
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
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
        sb.append("MultipathDevice(");
        sb.append("ipv4=").append(String.valueOf(this.ipv4));
        sb.append(", iqn=").append(String.valueOf(this.iqn));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MultipathDevice)) {
            return false;
        }

        MultipathDevice other = (MultipathDevice) o;
        return java.util.Objects.equals(this.ipv4, other.ipv4)
                && java.util.Objects.equals(this.iqn, other.iqn)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipv4 == null ? 43 : this.ipv4.hashCode());
        result = (result * PRIME) + (this.iqn == null ? 43 : this.iqn.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
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
