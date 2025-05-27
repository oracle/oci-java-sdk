/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Nat Configuration response. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NatConfigurationResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NatConfigurationResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mustEnablePrivateNat", "natIpAddressList"})
    public NatConfigurationResponse(
            Boolean mustEnablePrivateNat, java.util.List<String> natIpAddressList) {
        super();
        this.mustEnablePrivateNat = mustEnablePrivateNat;
        this.natIpAddressList = natIpAddressList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * To allocate private NAT IPs to the firewall. The attached network firewall policy must
         * also have NAT rules to enable NAT on any traffic passing through the firewall.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mustEnablePrivateNat")
        private Boolean mustEnablePrivateNat;

        /**
         * To allocate private NAT IPs to the firewall. The attached network firewall policy must
         * also have NAT rules to enable NAT on any traffic passing through the firewall.
         *
         * @param mustEnablePrivateNat the value to set
         * @return this builder
         */
        public Builder mustEnablePrivateNat(Boolean mustEnablePrivateNat) {
            this.mustEnablePrivateNat = mustEnablePrivateNat;
            this.__explicitlySet__.add("mustEnablePrivateNat");
            return this;
        }
        /**
         * An array of NAT IP addresses that are associated with the Network Firewall. These IPs are
         * reserved for NAT and shouldn't be used for any other purpose in the subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("natIpAddressList")
        private java.util.List<String> natIpAddressList;

        /**
         * An array of NAT IP addresses that are associated with the Network Firewall. These IPs are
         * reserved for NAT and shouldn't be used for any other purpose in the subnet.
         *
         * @param natIpAddressList the value to set
         * @return this builder
         */
        public Builder natIpAddressList(java.util.List<String> natIpAddressList) {
            this.natIpAddressList = natIpAddressList;
            this.__explicitlySet__.add("natIpAddressList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NatConfigurationResponse build() {
            NatConfigurationResponse model =
                    new NatConfigurationResponse(this.mustEnablePrivateNat, this.natIpAddressList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NatConfigurationResponse model) {
            if (model.wasPropertyExplicitlySet("mustEnablePrivateNat")) {
                this.mustEnablePrivateNat(model.getMustEnablePrivateNat());
            }
            if (model.wasPropertyExplicitlySet("natIpAddressList")) {
                this.natIpAddressList(model.getNatIpAddressList());
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
     * To allocate private NAT IPs to the firewall. The attached network firewall policy must also
     * have NAT rules to enable NAT on any traffic passing through the firewall.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mustEnablePrivateNat")
    private final Boolean mustEnablePrivateNat;

    /**
     * To allocate private NAT IPs to the firewall. The attached network firewall policy must also
     * have NAT rules to enable NAT on any traffic passing through the firewall.
     *
     * @return the value
     */
    public Boolean getMustEnablePrivateNat() {
        return mustEnablePrivateNat;
    }

    /**
     * An array of NAT IP addresses that are associated with the Network Firewall. These IPs are
     * reserved for NAT and shouldn't be used for any other purpose in the subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("natIpAddressList")
    private final java.util.List<String> natIpAddressList;

    /**
     * An array of NAT IP addresses that are associated with the Network Firewall. These IPs are
     * reserved for NAT and shouldn't be used for any other purpose in the subnet.
     *
     * @return the value
     */
    public java.util.List<String> getNatIpAddressList() {
        return natIpAddressList;
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
        sb.append("NatConfigurationResponse(");
        sb.append("super=").append(super.toString());
        sb.append("mustEnablePrivateNat=").append(String.valueOf(this.mustEnablePrivateNat));
        sb.append(", natIpAddressList=").append(String.valueOf(this.natIpAddressList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NatConfigurationResponse)) {
            return false;
        }

        NatConfigurationResponse other = (NatConfigurationResponse) o;
        return java.util.Objects.equals(this.mustEnablePrivateNat, other.mustEnablePrivateNat)
                && java.util.Objects.equals(this.natIpAddressList, other.natIpAddressList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mustEnablePrivateNat == null
                                ? 43
                                : this.mustEnablePrivateNat.hashCode());
        result =
                (result * PRIME)
                        + (this.natIpAddressList == null ? 43 : this.natIpAddressList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
