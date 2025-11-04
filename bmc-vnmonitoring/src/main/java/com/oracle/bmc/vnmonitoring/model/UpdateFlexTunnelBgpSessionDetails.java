/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Boarder Gateway Protocol (BGP) fields <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateFlexTunnelBgpSessionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateFlexTunnelBgpSessionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "customerBgpAsn",
        "customerBgpIp",
        "oracleBgpIp",
        "customerBgpIpv6",
        "oracleBgpIpv6"
    })
    public UpdateFlexTunnelBgpSessionDetails(
            String customerBgpAsn,
            String customerBgpIp,
            String oracleBgpIp,
            String customerBgpIpv6,
            String oracleBgpIpv6) {
        super();
        this.customerBgpAsn = customerBgpAsn;
        this.customerBgpIp = customerBgpIp;
        this.oracleBgpIp = oracleBgpIp;
        this.customerBgpIpv6 = customerBgpIpv6;
        this.oracleBgpIpv6 = oracleBgpIpv6;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The BGP ASN of the network on your end of the BGP session. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private String customerBgpAsn;

        /**
         * The BGP ASN of the network on your end of the BGP session.
         *
         * @param customerBgpAsn the value to set
         * @return this builder
         */
        public Builder customerBgpAsn(String customerBgpAsn) {
            this.customerBgpAsn = customerBgpAsn;
            this.__explicitlySet__.add("customerBgpAsn");
            return this;
        }
        /** This IPv4 CIDR block is for your end of the inside tunnel interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpIp")
        private String customerBgpIp;

        /**
         * This IPv4 CIDR block is for your end of the inside tunnel interface.
         *
         * @param customerBgpIp the value to set
         * @return this builder
         */
        public Builder customerBgpIp(String customerBgpIp) {
            this.customerBgpIp = customerBgpIp;
            this.__explicitlySet__.add("customerBgpIp");
            return this;
        }
        /** The IPv4 CIDR block for the Oracle end of the inside tunnel interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpIp")
        private String oracleBgpIp;

        /**
         * The IPv4 CIDR block for the Oracle end of the inside tunnel interface.
         *
         * @param oracleBgpIp the value to set
         * @return this builder
         */
        public Builder oracleBgpIp(String oracleBgpIp) {
            this.oracleBgpIp = oracleBgpIp;
            this.__explicitlySet__.add("oracleBgpIp");
            return this;
        }
        /** The IPv6 prefix for your end of the inside tunnel interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpIpv6")
        private String customerBgpIpv6;

        /**
         * The IPv6 prefix for your end of the inside tunnel interface.
         *
         * @param customerBgpIpv6 the value to set
         * @return this builder
         */
        public Builder customerBgpIpv6(String customerBgpIpv6) {
            this.customerBgpIpv6 = customerBgpIpv6;
            this.__explicitlySet__.add("customerBgpIpv6");
            return this;
        }
        /** The IPv6 prefix for the Oracle end of the inside tunnel interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpIpv6")
        private String oracleBgpIpv6;

        /**
         * The IPv6 prefix for the Oracle end of the inside tunnel interface.
         *
         * @param oracleBgpIpv6 the value to set
         * @return this builder
         */
        public Builder oracleBgpIpv6(String oracleBgpIpv6) {
            this.oracleBgpIpv6 = oracleBgpIpv6;
            this.__explicitlySet__.add("oracleBgpIpv6");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFlexTunnelBgpSessionDetails build() {
            UpdateFlexTunnelBgpSessionDetails model =
                    new UpdateFlexTunnelBgpSessionDetails(
                            this.customerBgpAsn,
                            this.customerBgpIp,
                            this.oracleBgpIp,
                            this.customerBgpIpv6,
                            this.oracleBgpIpv6);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFlexTunnelBgpSessionDetails model) {
            if (model.wasPropertyExplicitlySet("customerBgpAsn")) {
                this.customerBgpAsn(model.getCustomerBgpAsn());
            }
            if (model.wasPropertyExplicitlySet("customerBgpIp")) {
                this.customerBgpIp(model.getCustomerBgpIp());
            }
            if (model.wasPropertyExplicitlySet("oracleBgpIp")) {
                this.oracleBgpIp(model.getOracleBgpIp());
            }
            if (model.wasPropertyExplicitlySet("customerBgpIpv6")) {
                this.customerBgpIpv6(model.getCustomerBgpIpv6());
            }
            if (model.wasPropertyExplicitlySet("oracleBgpIpv6")) {
                this.oracleBgpIpv6(model.getOracleBgpIpv6());
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

    /** The BGP ASN of the network on your end of the BGP session. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    private final String customerBgpAsn;

    /**
     * The BGP ASN of the network on your end of the BGP session.
     *
     * @return the value
     */
    public String getCustomerBgpAsn() {
        return customerBgpAsn;
    }

    /** This IPv4 CIDR block is for your end of the inside tunnel interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpIp")
    private final String customerBgpIp;

    /**
     * This IPv4 CIDR block is for your end of the inside tunnel interface.
     *
     * @return the value
     */
    public String getCustomerBgpIp() {
        return customerBgpIp;
    }

    /** The IPv4 CIDR block for the Oracle end of the inside tunnel interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpIp")
    private final String oracleBgpIp;

    /**
     * The IPv4 CIDR block for the Oracle end of the inside tunnel interface.
     *
     * @return the value
     */
    public String getOracleBgpIp() {
        return oracleBgpIp;
    }

    /** The IPv6 prefix for your end of the inside tunnel interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpIpv6")
    private final String customerBgpIpv6;

    /**
     * The IPv6 prefix for your end of the inside tunnel interface.
     *
     * @return the value
     */
    public String getCustomerBgpIpv6() {
        return customerBgpIpv6;
    }

    /** The IPv6 prefix for the Oracle end of the inside tunnel interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpIpv6")
    private final String oracleBgpIpv6;

    /**
     * The IPv6 prefix for the Oracle end of the inside tunnel interface.
     *
     * @return the value
     */
    public String getOracleBgpIpv6() {
        return oracleBgpIpv6;
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
        sb.append("UpdateFlexTunnelBgpSessionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("customerBgpAsn=").append(String.valueOf(this.customerBgpAsn));
        sb.append(", customerBgpIp=").append(String.valueOf(this.customerBgpIp));
        sb.append(", oracleBgpIp=").append(String.valueOf(this.oracleBgpIp));
        sb.append(", customerBgpIpv6=").append(String.valueOf(this.customerBgpIpv6));
        sb.append(", oracleBgpIpv6=").append(String.valueOf(this.oracleBgpIpv6));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFlexTunnelBgpSessionDetails)) {
            return false;
        }

        UpdateFlexTunnelBgpSessionDetails other = (UpdateFlexTunnelBgpSessionDetails) o;
        return java.util.Objects.equals(this.customerBgpAsn, other.customerBgpAsn)
                && java.util.Objects.equals(this.customerBgpIp, other.customerBgpIp)
                && java.util.Objects.equals(this.oracleBgpIp, other.oracleBgpIp)
                && java.util.Objects.equals(this.customerBgpIpv6, other.customerBgpIpv6)
                && java.util.Objects.equals(this.oracleBgpIpv6, other.oracleBgpIpv6)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.customerBgpAsn == null ? 43 : this.customerBgpAsn.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpIp == null ? 43 : this.customerBgpIp.hashCode());
        result = (result * PRIME) + (this.oracleBgpIp == null ? 43 : this.oracleBgpIp.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpIpv6 == null ? 43 : this.customerBgpIpv6.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleBgpIpv6 == null ? 43 : this.oracleBgpIpv6.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
