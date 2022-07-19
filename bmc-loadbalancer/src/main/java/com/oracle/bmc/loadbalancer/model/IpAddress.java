/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A load balancer IP address.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IpAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IpAddress {
    @Deprecated
    @java.beans.ConstructorProperties({"ipAddress", "isPublic", "reservedIp"})
    public IpAddress(String ipAddress, Boolean isPublic, ReservedIP reservedIp) {
        super();
        this.ipAddress = ipAddress;
        this.isPublic = isPublic;
        this.reservedIp = reservedIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An IP address.
         * <p>
         * Example: {@code 192.168.0.3}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * An IP address.
         * <p>
         * Example: {@code 192.168.0.3}
         *
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * Whether the IP address is public or private.
         * <p>
         * If "true", the IP address is public and accessible from the internet.
         * <p>
         * If "false", the IP address is private and accessible only from within the associated VCN.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * Whether the IP address is public or private.
         * <p>
         * If "true", the IP address is public and accessible from the internet.
         * <p>
         * If "false", the IP address is private and accessible only from within the associated VCN.
         *
         * @param isPublic the value to set
         * @return this builder
         **/
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reservedIp")
        private ReservedIP reservedIp;

        public Builder reservedIp(ReservedIP reservedIp) {
            this.reservedIp = reservedIp;
            this.__explicitlySet__.add("reservedIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpAddress build() {
            IpAddress __instance__ = new IpAddress(ipAddress, isPublic, reservedIp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpAddress o) {
            Builder copiedBuilder =
                    ipAddress(o.getIpAddress())
                            .isPublic(o.getIsPublic())
                            .reservedIp(o.getReservedIp());

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
     * An IP address.
     * <p>
     * Example: {@code 192.168.0.3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * An IP address.
     * <p>
     * Example: {@code 192.168.0.3}
     *
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Whether the IP address is public or private.
     * <p>
     * If "true", the IP address is public and accessible from the internet.
     * <p>
     * If "false", the IP address is private and accessible only from within the associated VCN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * Whether the IP address is public or private.
     * <p>
     * If "true", the IP address is public and accessible from the internet.
     * <p>
     * If "false", the IP address is private and accessible only from within the associated VCN.
     *
     * @return the value
     **/
    public Boolean getIsPublic() {
        return isPublic;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reservedIp")
    private final ReservedIP reservedIp;

    public ReservedIP getReservedIp() {
        return reservedIp;
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
        sb.append("IpAddress(");
        sb.append("ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", reservedIp=").append(String.valueOf(this.reservedIp));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpAddress)) {
            return false;
        }

        IpAddress other = (IpAddress) o;
        return java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.reservedIp, other.reservedIp)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.reservedIp == null ? 43 : this.reservedIp.hashCode());
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
