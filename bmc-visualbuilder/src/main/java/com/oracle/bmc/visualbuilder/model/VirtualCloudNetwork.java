/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * Virtual Cloud Network definition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VirtualCloudNetwork.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualCloudNetwork
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "allowlistedIpCidrs"})
    public VirtualCloudNetwork(String id, java.util.List<String> allowlistedIpCidrs) {
        super();
        this.id = id;
        this.allowlistedIpCidrs = allowlistedIpCidrs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Virtual Cloud Network OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Virtual Cloud Network OCID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Source IP addresses or IP address ranges ingress rules. (ex: "168.122.59.5/32",
         * "10.20.30.0/26") An invalid IP or CIDR block will result in a 400 response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowlistedIpCidrs")
        private java.util.List<String> allowlistedIpCidrs;

        /**
         * Source IP addresses or IP address ranges ingress rules. (ex: "168.122.59.5/32",
         * "10.20.30.0/26") An invalid IP or CIDR block will result in a 400 response.
         *
         * @param allowlistedIpCidrs the value to set
         * @return this builder
         */
        public Builder allowlistedIpCidrs(java.util.List<String> allowlistedIpCidrs) {
            this.allowlistedIpCidrs = allowlistedIpCidrs;
            this.__explicitlySet__.add("allowlistedIpCidrs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCloudNetwork build() {
            VirtualCloudNetwork model = new VirtualCloudNetwork(this.id, this.allowlistedIpCidrs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCloudNetwork model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("allowlistedIpCidrs")) {
                this.allowlistedIpCidrs(model.getAllowlistedIpCidrs());
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

    /** The Virtual Cloud Network OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Virtual Cloud Network OCID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Source IP addresses or IP address ranges ingress rules. (ex: "168.122.59.5/32",
     * "10.20.30.0/26") An invalid IP or CIDR block will result in a 400 response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowlistedIpCidrs")
    private final java.util.List<String> allowlistedIpCidrs;

    /**
     * Source IP addresses or IP address ranges ingress rules. (ex: "168.122.59.5/32",
     * "10.20.30.0/26") An invalid IP or CIDR block will result in a 400 response.
     *
     * @return the value
     */
    public java.util.List<String> getAllowlistedIpCidrs() {
        return allowlistedIpCidrs;
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
        sb.append("VirtualCloudNetwork(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", allowlistedIpCidrs=").append(String.valueOf(this.allowlistedIpCidrs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCloudNetwork)) {
            return false;
        }

        VirtualCloudNetwork other = (VirtualCloudNetwork) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.allowlistedIpCidrs, other.allowlistedIpCidrs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.allowlistedIpCidrs == null
                                ? 43
                                : this.allowlistedIpCidrs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
