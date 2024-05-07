/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that species the maximum number of connections the listed IPs can make to a listener.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IpMaxConnections.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpMaxConnections
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipAddresses", "maxConnections"})
    public IpMaxConnections(java.util.List<String> ipAddresses, Integer maxConnections) {
        super();
        this.ipAddresses = ipAddresses;
        this.maxConnections = maxConnections;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Each element in the list should be valid IPv4 or IPv6 CIDR Block address. Example:
         * '["129.213.176.0/24", "150.136.187.0/24", "2002::1234:abcd:ffff:c0a8:101/64"]'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
        private java.util.List<String> ipAddresses;

        /**
         * Each element in the list should be valid IPv4 or IPv6 CIDR Block address. Example:
         * '["129.213.176.0/24", "150.136.187.0/24", "2002::1234:abcd:ffff:c0a8:101/64"]'
         *
         * @param ipAddresses the value to set
         * @return this builder
         */
        public Builder ipAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            this.__explicitlySet__.add("ipAddresses");
            return this;
        }
        /** The max number of connections that the specified IPs can make to the Listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
        private Integer maxConnections;

        /**
         * The max number of connections that the specified IPs can make to the Listener.
         *
         * @param maxConnections the value to set
         * @return this builder
         */
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            this.__explicitlySet__.add("maxConnections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpMaxConnections build() {
            IpMaxConnections model = new IpMaxConnections(this.ipAddresses, this.maxConnections);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpMaxConnections model) {
            if (model.wasPropertyExplicitlySet("ipAddresses")) {
                this.ipAddresses(model.getIpAddresses());
            }
            if (model.wasPropertyExplicitlySet("maxConnections")) {
                this.maxConnections(model.getMaxConnections());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Each element in the list should be valid IPv4 or IPv6 CIDR Block address. Example:
     * '["129.213.176.0/24", "150.136.187.0/24", "2002::1234:abcd:ffff:c0a8:101/64"]'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
    private final java.util.List<String> ipAddresses;

    /**
     * Each element in the list should be valid IPv4 or IPv6 CIDR Block address. Example:
     * '["129.213.176.0/24", "150.136.187.0/24", "2002::1234:abcd:ffff:c0a8:101/64"]'
     *
     * @return the value
     */
    public java.util.List<String> getIpAddresses() {
        return ipAddresses;
    }

    /** The max number of connections that the specified IPs can make to the Listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
    private final Integer maxConnections;

    /**
     * The max number of connections that the specified IPs can make to the Listener.
     *
     * @return the value
     */
    public Integer getMaxConnections() {
        return maxConnections;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IpMaxConnections(");
        sb.append("super=").append(super.toString());
        sb.append("ipAddresses=").append(String.valueOf(this.ipAddresses));
        sb.append(", maxConnections=").append(String.valueOf(this.maxConnections));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpMaxConnections)) {
            return false;
        }

        IpMaxConnections other = (IpMaxConnections) o;
        return java.util.Objects.equals(this.ipAddresses, other.ipAddresses)
                && java.util.Objects.equals(this.maxConnections, other.maxConnections)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipAddresses == null ? 43 : this.ipAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.maxConnections == null ? 43 : this.maxConnections.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
