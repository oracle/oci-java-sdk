/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * Routing information for peer nodes using the Border Gateway Protocol (BGP).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PeerInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PeerInformation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"asn", "ip"})
    public PeerInformation(Integer asn, String ip) {
        super();
        this.asn = asn;
        this.ip = ip;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Autonomous System Number (ASN) of the peer network.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asn")
        private Integer asn;

        /**
         * The Autonomous System Number (ASN) of the peer network.
         * @param asn the value to set
         * @return this builder
         **/
        public Builder asn(Integer asn) {
            this.asn = asn;
            this.__explicitlySet__.add("asn");
            return this;
        }
        /**
         * Neighbor Border Gateway Protocal (BGP) IP address.
         * The IP address usually refers to the customer data center router.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ip")
        private String ip;

        /**
         * Neighbor Border Gateway Protocal (BGP) IP address.
         * The IP address usually refers to the customer data center router.
         *
         * @param ip the value to set
         * @return this builder
         **/
        public Builder ip(String ip) {
            this.ip = ip;
            this.__explicitlySet__.add("ip");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeerInformation build() {
            PeerInformation model = new PeerInformation(this.asn, this.ip);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeerInformation model) {
            if (model.wasPropertyExplicitlySet("asn")) {
                this.asn(model.getAsn());
            }
            if (model.wasPropertyExplicitlySet("ip")) {
                this.ip(model.getIp());
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
     * The Autonomous System Number (ASN) of the peer network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asn")
    private final Integer asn;

    /**
     * The Autonomous System Number (ASN) of the peer network.
     * @return the value
     **/
    public Integer getAsn() {
        return asn;
    }

    /**
     * Neighbor Border Gateway Protocal (BGP) IP address.
     * The IP address usually refers to the customer data center router.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    private final String ip;

    /**
     * Neighbor Border Gateway Protocal (BGP) IP address.
     * The IP address usually refers to the customer data center router.
     *
     * @return the value
     **/
    public String getIp() {
        return ip;
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
        sb.append("PeerInformation(");
        sb.append("super=").append(super.toString());
        sb.append("asn=").append(String.valueOf(this.asn));
        sb.append(", ip=").append(String.valueOf(this.ip));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeerInformation)) {
            return false;
        }

        PeerInformation other = (PeerInformation) o;
        return java.util.Objects.equals(this.asn, other.asn)
                && java.util.Objects.equals(this.ip, other.ip)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.asn == null ? 43 : this.asn.hashCode());
        result = (result * PRIME) + (this.ip == null ? 43 : this.ip.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
