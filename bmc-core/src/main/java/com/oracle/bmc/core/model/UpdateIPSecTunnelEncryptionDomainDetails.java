/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Request to update a multi-encryption domain policy on the IPSec tunnel. There can't be more than
 * 50 security associations in use at one time. See [Encryption domain for policy-based
 * tunnels](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/ipsecencryptiondomains.htm#spi_policy_based_tunnel)
 * for more. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateIPSecTunnelEncryptionDomainDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateIPSecTunnelEncryptionDomainDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"oracleTrafficSelector", "cpeTrafficSelector"})
    public UpdateIPSecTunnelEncryptionDomainDetails(
            java.util.List<String> oracleTrafficSelector,
            java.util.List<String> cpeTrafficSelector) {
        super();
        this.oracleTrafficSelector = oracleTrafficSelector;
        this.cpeTrafficSelector = cpeTrafficSelector;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Lists IPv4 or IPv6-enabled subnets in your Oracle tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleTrafficSelector")
        private java.util.List<String> oracleTrafficSelector;

        /**
         * Lists IPv4 or IPv6-enabled subnets in your Oracle tenancy.
         *
         * @param oracleTrafficSelector the value to set
         * @return this builder
         */
        public Builder oracleTrafficSelector(java.util.List<String> oracleTrafficSelector) {
            this.oracleTrafficSelector = oracleTrafficSelector;
            this.__explicitlySet__.add("oracleTrafficSelector");
            return this;
        }
        /** Lists IPv4 or IPv6-enabled subnets in your on-premises network. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeTrafficSelector")
        private java.util.List<String> cpeTrafficSelector;

        /**
         * Lists IPv4 or IPv6-enabled subnets in your on-premises network.
         *
         * @param cpeTrafficSelector the value to set
         * @return this builder
         */
        public Builder cpeTrafficSelector(java.util.List<String> cpeTrafficSelector) {
            this.cpeTrafficSelector = cpeTrafficSelector;
            this.__explicitlySet__.add("cpeTrafficSelector");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIPSecTunnelEncryptionDomainDetails build() {
            UpdateIPSecTunnelEncryptionDomainDetails model =
                    new UpdateIPSecTunnelEncryptionDomainDetails(
                            this.oracleTrafficSelector, this.cpeTrafficSelector);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIPSecTunnelEncryptionDomainDetails model) {
            if (model.wasPropertyExplicitlySet("oracleTrafficSelector")) {
                this.oracleTrafficSelector(model.getOracleTrafficSelector());
            }
            if (model.wasPropertyExplicitlySet("cpeTrafficSelector")) {
                this.cpeTrafficSelector(model.getCpeTrafficSelector());
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

    /** Lists IPv4 or IPv6-enabled subnets in your Oracle tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleTrafficSelector")
    private final java.util.List<String> oracleTrafficSelector;

    /**
     * Lists IPv4 or IPv6-enabled subnets in your Oracle tenancy.
     *
     * @return the value
     */
    public java.util.List<String> getOracleTrafficSelector() {
        return oracleTrafficSelector;
    }

    /** Lists IPv4 or IPv6-enabled subnets in your on-premises network. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeTrafficSelector")
    private final java.util.List<String> cpeTrafficSelector;

    /**
     * Lists IPv4 or IPv6-enabled subnets in your on-premises network.
     *
     * @return the value
     */
    public java.util.List<String> getCpeTrafficSelector() {
        return cpeTrafficSelector;
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
        sb.append("UpdateIPSecTunnelEncryptionDomainDetails(");
        sb.append("super=").append(super.toString());
        sb.append("oracleTrafficSelector=").append(String.valueOf(this.oracleTrafficSelector));
        sb.append(", cpeTrafficSelector=").append(String.valueOf(this.cpeTrafficSelector));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIPSecTunnelEncryptionDomainDetails)) {
            return false;
        }

        UpdateIPSecTunnelEncryptionDomainDetails other =
                (UpdateIPSecTunnelEncryptionDomainDetails) o;
        return java.util.Objects.equals(this.oracleTrafficSelector, other.oracleTrafficSelector)
                && java.util.Objects.equals(this.cpeTrafficSelector, other.cpeTrafficSelector)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.oracleTrafficSelector == null
                                ? 43
                                : this.oracleTrafficSelector.hashCode());
        result =
                (result * PRIME)
                        + (this.cpeTrafficSelector == null
                                ? 43
                                : this.cpeTrafficSelector.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
