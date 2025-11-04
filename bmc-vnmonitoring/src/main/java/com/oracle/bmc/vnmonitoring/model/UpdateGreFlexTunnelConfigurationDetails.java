/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The gre tunnel configuration update details. <br>
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
        builder = UpdateGreFlexTunnelConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "tunnelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateGreFlexTunnelConfigurationDetails
        extends UpdateFlexTunnelConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("customerTunnelIp")
        private String customerTunnelIp;

        public Builder customerTunnelIp(String customerTunnelIp) {
            this.customerTunnelIp = customerTunnelIp;
            this.__explicitlySet__.add("customerTunnelIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleTunnelIp")
        private String oracleTunnelIp;

        public Builder oracleTunnelIp(String oracleTunnelIp) {
            this.oracleTunnelIp = oracleTunnelIp;
            this.__explicitlySet__.add("oracleTunnelIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpSession")
        private UpdateFlexTunnelBgpSessionDetails bgpSession;

        public Builder bgpSession(UpdateFlexTunnelBgpSessionDetails bgpSession) {
            this.bgpSession = bgpSession;
            this.__explicitlySet__.add("bgpSession");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateGreFlexTunnelConfigurationDetails build() {
            UpdateGreFlexTunnelConfigurationDetails model =
                    new UpdateGreFlexTunnelConfigurationDetails(
                            this.customerTunnelIp, this.oracleTunnelIp, this.bgpSession);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGreFlexTunnelConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("customerTunnelIp")) {
                this.customerTunnelIp(model.getCustomerTunnelIp());
            }
            if (model.wasPropertyExplicitlySet("oracleTunnelIp")) {
                this.oracleTunnelIp(model.getOracleTunnelIp());
            }
            if (model.wasPropertyExplicitlySet("bgpSession")) {
                this.bgpSession(model.getBgpSession());
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

    @Deprecated
    public UpdateGreFlexTunnelConfigurationDetails(
            String customerTunnelIp,
            String oracleTunnelIp,
            UpdateFlexTunnelBgpSessionDetails bgpSession) {
        super(customerTunnelIp, oracleTunnelIp, bgpSession);
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
        sb.append("UpdateGreFlexTunnelConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateGreFlexTunnelConfigurationDetails)) {
            return false;
        }

        UpdateGreFlexTunnelConfigurationDetails other = (UpdateGreFlexTunnelConfigurationDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
