/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Nat Configuration request to use Nat feature on firewall. <br>
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
        builder = NatConfigurationRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NatConfigurationRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mustEnablePrivateNat"})
    public NatConfigurationRequest(Boolean mustEnablePrivateNat) {
        super();
        this.mustEnablePrivateNat = mustEnablePrivateNat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * To allocate private NAT IPs to the firewall. The attached network firewall policy must
         * also have NAT rules to enable NAT on any traffic passing through the firewall. The value
         * of this field can not be false to release the NAT IPs given that the attached network
         * firewall policy does not contains any NAT rules. The value of this field should be set to
         * true if the network firewall policy being applied contains NAT rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mustEnablePrivateNat")
        private Boolean mustEnablePrivateNat;

        /**
         * To allocate private NAT IPs to the firewall. The attached network firewall policy must
         * also have NAT rules to enable NAT on any traffic passing through the firewall. The value
         * of this field can not be false to release the NAT IPs given that the attached network
         * firewall policy does not contains any NAT rules. The value of this field should be set to
         * true if the network firewall policy being applied contains NAT rules.
         *
         * @param mustEnablePrivateNat the value to set
         * @return this builder
         */
        public Builder mustEnablePrivateNat(Boolean mustEnablePrivateNat) {
            this.mustEnablePrivateNat = mustEnablePrivateNat;
            this.__explicitlySet__.add("mustEnablePrivateNat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NatConfigurationRequest build() {
            NatConfigurationRequest model = new NatConfigurationRequest(this.mustEnablePrivateNat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NatConfigurationRequest model) {
            if (model.wasPropertyExplicitlySet("mustEnablePrivateNat")) {
                this.mustEnablePrivateNat(model.getMustEnablePrivateNat());
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
     * have NAT rules to enable NAT on any traffic passing through the firewall. The value of this
     * field can not be false to release the NAT IPs given that the attached network firewall policy
     * does not contains any NAT rules. The value of this field should be set to true if the network
     * firewall policy being applied contains NAT rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mustEnablePrivateNat")
    private final Boolean mustEnablePrivateNat;

    /**
     * To allocate private NAT IPs to the firewall. The attached network firewall policy must also
     * have NAT rules to enable NAT on any traffic passing through the firewall. The value of this
     * field can not be false to release the NAT IPs given that the attached network firewall policy
     * does not contains any NAT rules. The value of this field should be set to true if the network
     * firewall policy being applied contains NAT rules.
     *
     * @return the value
     */
    public Boolean getMustEnablePrivateNat() {
        return mustEnablePrivateNat;
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
        sb.append("NatConfigurationRequest(");
        sb.append("super=").append(super.toString());
        sb.append("mustEnablePrivateNat=").append(String.valueOf(this.mustEnablePrivateNat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NatConfigurationRequest)) {
            return false;
        }

        NatConfigurationRequest other = (NatConfigurationRequest) o;
        return java.util.Objects.equals(this.mustEnablePrivateNat, other.mustEnablePrivateNat)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
