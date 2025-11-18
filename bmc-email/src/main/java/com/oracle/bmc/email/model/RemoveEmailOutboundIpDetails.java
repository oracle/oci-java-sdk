/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.model;

/**
 * Outbound IP details to be unassigned from the IpPool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RemoveEmailOutboundIpDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveEmailOutboundIpDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"outboundIps"})
    public RemoveEmailOutboundIpDetails(java.util.List<String> outboundIps) {
        super();
        this.outboundIps = outboundIps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of public IPs to REMOVE from the IpPool. After a public IP is unassigned, it will be
         * marked as AVAILABLE and can be assigned to another IpPool. The last IP removed from the
         * Pool will be deleted from the IP Pool after 24 hours.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundIps")
        private java.util.List<String> outboundIps;

        /**
         * List of public IPs to REMOVE from the IpPool. After a public IP is unassigned, it will be
         * marked as AVAILABLE and can be assigned to another IpPool. The last IP removed from the
         * Pool will be deleted from the IP Pool after 24 hours.
         *
         * @param outboundIps the value to set
         * @return this builder
         */
        public Builder outboundIps(java.util.List<String> outboundIps) {
            this.outboundIps = outboundIps;
            this.__explicitlySet__.add("outboundIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveEmailOutboundIpDetails build() {
            RemoveEmailOutboundIpDetails model = new RemoveEmailOutboundIpDetails(this.outboundIps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveEmailOutboundIpDetails model) {
            if (model.wasPropertyExplicitlySet("outboundIps")) {
                this.outboundIps(model.getOutboundIps());
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
     * List of public IPs to REMOVE from the IpPool. After a public IP is unassigned, it will be
     * marked as AVAILABLE and can be assigned to another IpPool. The last IP removed from the Pool
     * will be deleted from the IP Pool after 24 hours.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundIps")
    private final java.util.List<String> outboundIps;

    /**
     * List of public IPs to REMOVE from the IpPool. After a public IP is unassigned, it will be
     * marked as AVAILABLE and can be assigned to another IpPool. The last IP removed from the Pool
     * will be deleted from the IP Pool after 24 hours.
     *
     * @return the value
     */
    public java.util.List<String> getOutboundIps() {
        return outboundIps;
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
        sb.append("RemoveEmailOutboundIpDetails(");
        sb.append("super=").append(super.toString());
        sb.append("outboundIps=").append(String.valueOf(this.outboundIps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveEmailOutboundIpDetails)) {
            return false;
        }

        RemoveEmailOutboundIpDetails other = (RemoveEmailOutboundIpDetails) o;
        return java.util.Objects.equals(this.outboundIps, other.outboundIps) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.outboundIps == null ? 43 : this.outboundIps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
