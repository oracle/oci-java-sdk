/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Request data required to clone a network firewall policy. <br>
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
        builder = ApplyNetworkFirewallPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApplyNetworkFirewallPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"firewalls"})
    public ApplyNetworkFirewallPolicyDetails(java.util.List<String> firewalls) {
        super();
        this.firewalls = firewalls;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Ordered priority list of firewall OCIDs on which the update needs to be applied in given
         * order. If the list is a subset of the firewalls attached, then given firewalls would be
         * deployed first with the change, followed by remaining firewalls.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("firewalls")
        private java.util.List<String> firewalls;

        /**
         * Ordered priority list of firewall OCIDs on which the update needs to be applied in given
         * order. If the list is a subset of the firewalls attached, then given firewalls would be
         * deployed first with the change, followed by remaining firewalls.
         *
         * @param firewalls the value to set
         * @return this builder
         */
        public Builder firewalls(java.util.List<String> firewalls) {
            this.firewalls = firewalls;
            this.__explicitlySet__.add("firewalls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplyNetworkFirewallPolicyDetails build() {
            ApplyNetworkFirewallPolicyDetails model =
                    new ApplyNetworkFirewallPolicyDetails(this.firewalls);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplyNetworkFirewallPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("firewalls")) {
                this.firewalls(model.getFirewalls());
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
     * Ordered priority list of firewall OCIDs on which the update needs to be applied in given
     * order. If the list is a subset of the firewalls attached, then given firewalls would be
     * deployed first with the change, followed by remaining firewalls.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("firewalls")
    private final java.util.List<String> firewalls;

    /**
     * Ordered priority list of firewall OCIDs on which the update needs to be applied in given
     * order. If the list is a subset of the firewalls attached, then given firewalls would be
     * deployed first with the change, followed by remaining firewalls.
     *
     * @return the value
     */
    public java.util.List<String> getFirewalls() {
        return firewalls;
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
        sb.append("ApplyNetworkFirewallPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("firewalls=").append(String.valueOf(this.firewalls));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplyNetworkFirewallPolicyDetails)) {
            return false;
        }

        ApplyNetworkFirewallPolicyDetails other = (ApplyNetworkFirewallPolicyDetails) o;
        return java.util.Objects.equals(this.firewalls, other.firewalls) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.firewalls == null ? 43 : this.firewalls.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
