/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Request to configure Network Address Translation (NAT) on a firewall.
 * <p>
 * To perform NAT on traffic passing the private NAT IPs to the firewall, the attached network firewall policy must also have NAT rules and NAT configuration must be enabled. If NAT configuration is enabled and the attached firewall policy does not contain NAT rule then NAT IPs will get allocated but NAT will not be performed on any traffic.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NatConfigurationRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NatConfigurationRequest
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mustEnablePrivateNat"})
    public NatConfigurationRequest(Boolean mustEnablePrivateNat) {
        super();
        this.mustEnablePrivateNat = mustEnablePrivateNat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The value of this field must be set to true if the network firewall policy being applied contains NAT rules.
         * <p>
         * The value of this field can be set to false if the network firewall policy being applied or the currently attached firewall policy doesn't contain NAT rules.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mustEnablePrivateNat")
        private Boolean mustEnablePrivateNat;

        /**
         * The value of this field must be set to true if the network firewall policy being applied contains NAT rules.
         * <p>
         * The value of this field can be set to false if the network firewall policy being applied or the currently attached firewall policy doesn't contain NAT rules.
         *
         * @param mustEnablePrivateNat the value to set
         * @return this builder
         **/
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
     * The value of this field must be set to true if the network firewall policy being applied contains NAT rules.
     * <p>
     * The value of this field can be set to false if the network firewall policy being applied or the currently attached firewall policy doesn't contain NAT rules.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mustEnablePrivateNat")
    private final Boolean mustEnablePrivateNat;

    /**
     * The value of this field must be set to true if the network firewall policy being applied contains NAT rules.
     * <p>
     * The value of this field can be set to false if the network firewall policy being applied or the currently attached firewall policy doesn't contain NAT rules.
     *
     * @return the value
     **/
    public Boolean getMustEnablePrivateNat() {
        return mustEnablePrivateNat;
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
