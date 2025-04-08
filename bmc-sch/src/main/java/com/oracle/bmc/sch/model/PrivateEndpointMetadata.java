/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The private endpoint metadata for the connector's source or target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrivateEndpointMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivateEndpointMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"rceTrafficIpAddress", "rceDnsProxyIpAddress"})
    public PrivateEndpointMetadata(String rceTrafficIpAddress, String rceDnsProxyIpAddress) {
        super();
        this.rceTrafficIpAddress = rceTrafficIpAddress;
        this.rceDnsProxyIpAddress = rceDnsProxyIpAddress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The reverse connection endpoint (RCE) IP address for primary flow of traffic in the
         * subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rceTrafficIpAddress")
        private String rceTrafficIpAddress;

        /**
         * The reverse connection endpoint (RCE) IP address for primary flow of traffic in the
         * subnet.
         *
         * @param rceTrafficIpAddress the value to set
         * @return this builder
         */
        public Builder rceTrafficIpAddress(String rceTrafficIpAddress) {
            this.rceTrafficIpAddress = rceTrafficIpAddress;
            this.__explicitlySet__.add("rceTrafficIpAddress");
            return this;
        }
        /** The reverse connection endpoint (RCE) IP address for DNS lookups. */
        @com.fasterxml.jackson.annotation.JsonProperty("rceDnsProxyIpAddress")
        private String rceDnsProxyIpAddress;

        /**
         * The reverse connection endpoint (RCE) IP address for DNS lookups.
         *
         * @param rceDnsProxyIpAddress the value to set
         * @return this builder
         */
        public Builder rceDnsProxyIpAddress(String rceDnsProxyIpAddress) {
            this.rceDnsProxyIpAddress = rceDnsProxyIpAddress;
            this.__explicitlySet__.add("rceDnsProxyIpAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateEndpointMetadata build() {
            PrivateEndpointMetadata model =
                    new PrivateEndpointMetadata(
                            this.rceTrafficIpAddress, this.rceDnsProxyIpAddress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateEndpointMetadata model) {
            if (model.wasPropertyExplicitlySet("rceTrafficIpAddress")) {
                this.rceTrafficIpAddress(model.getRceTrafficIpAddress());
            }
            if (model.wasPropertyExplicitlySet("rceDnsProxyIpAddress")) {
                this.rceDnsProxyIpAddress(model.getRceDnsProxyIpAddress());
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
     * The reverse connection endpoint (RCE) IP address for primary flow of traffic in the subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rceTrafficIpAddress")
    private final String rceTrafficIpAddress;

    /**
     * The reverse connection endpoint (RCE) IP address for primary flow of traffic in the subnet.
     *
     * @return the value
     */
    public String getRceTrafficIpAddress() {
        return rceTrafficIpAddress;
    }

    /** The reverse connection endpoint (RCE) IP address for DNS lookups. */
    @com.fasterxml.jackson.annotation.JsonProperty("rceDnsProxyIpAddress")
    private final String rceDnsProxyIpAddress;

    /**
     * The reverse connection endpoint (RCE) IP address for DNS lookups.
     *
     * @return the value
     */
    public String getRceDnsProxyIpAddress() {
        return rceDnsProxyIpAddress;
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
        sb.append("PrivateEndpointMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("rceTrafficIpAddress=").append(String.valueOf(this.rceTrafficIpAddress));
        sb.append(", rceDnsProxyIpAddress=").append(String.valueOf(this.rceDnsProxyIpAddress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateEndpointMetadata)) {
            return false;
        }

        PrivateEndpointMetadata other = (PrivateEndpointMetadata) o;
        return java.util.Objects.equals(this.rceTrafficIpAddress, other.rceTrafficIpAddress)
                && java.util.Objects.equals(this.rceDnsProxyIpAddress, other.rceDnsProxyIpAddress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.rceTrafficIpAddress == null
                                ? 43
                                : this.rceTrafficIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.rceDnsProxyIpAddress == null
                                ? 43
                                : this.rceDnsProxyIpAddress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
