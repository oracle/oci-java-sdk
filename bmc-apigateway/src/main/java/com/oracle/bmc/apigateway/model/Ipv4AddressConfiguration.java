/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * IPv4 address configuration details that should be used when creating the gateway. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = Ipv4AddressConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Ipv4AddressConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reservedIpIds"})
    public Ipv4AddressConfiguration(java.util.List<String> reservedIpIds) {
        super();
        this.reservedIpIds = reservedIpIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of Reserved IP OCIDs created in VCN service. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedIpIds")
        private java.util.List<String> reservedIpIds;

        /**
         * List of Reserved IP OCIDs created in VCN service.
         *
         * @param reservedIpIds the value to set
         * @return this builder
         */
        public Builder reservedIpIds(java.util.List<String> reservedIpIds) {
            this.reservedIpIds = reservedIpIds;
            this.__explicitlySet__.add("reservedIpIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Ipv4AddressConfiguration build() {
            Ipv4AddressConfiguration model = new Ipv4AddressConfiguration(this.reservedIpIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Ipv4AddressConfiguration model) {
            if (model.wasPropertyExplicitlySet("reservedIpIds")) {
                this.reservedIpIds(model.getReservedIpIds());
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

    /** List of Reserved IP OCIDs created in VCN service. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedIpIds")
    private final java.util.List<String> reservedIpIds;

    /**
     * List of Reserved IP OCIDs created in VCN service.
     *
     * @return the value
     */
    public java.util.List<String> getReservedIpIds() {
        return reservedIpIds;
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
        sb.append("Ipv4AddressConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("reservedIpIds=").append(String.valueOf(this.reservedIpIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ipv4AddressConfiguration)) {
            return false;
        }

        Ipv4AddressConfiguration other = (Ipv4AddressConfiguration) o;
        return java.util.Objects.equals(this.reservedIpIds, other.reservedIpIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.reservedIpIds == null ? 43 : this.reservedIpIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
