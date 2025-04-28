/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * Public endpoint configuration details (update). <br>
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
        builder = UpdatePublicEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "networkEndpointType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatePublicEndpointDetails extends UpdateNetworkEndpointDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Source IP addresses or IP address ranges ingress rules. (ex: "168.122.59.5/32",
         * "10.20.30.0/26") An invalid IP or CIDR block will result in a 400 response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpIps")
        private java.util.List<String> allowlistedHttpIps;

        /**
         * Source IP addresses or IP address ranges ingress rules. (ex: "168.122.59.5/32",
         * "10.20.30.0/26") An invalid IP or CIDR block will result in a 400 response.
         *
         * @param allowlistedHttpIps the value to set
         * @return this builder
         */
        public Builder allowlistedHttpIps(java.util.List<String> allowlistedHttpIps) {
            this.allowlistedHttpIps = allowlistedHttpIps;
            this.__explicitlySet__.add("allowlistedHttpIps");
            return this;
        }
        /** Virtual Cloud Networks allowed to access this network endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpVcns")
        private java.util.List<VirtualCloudNetwork> allowlistedHttpVcns;

        /**
         * Virtual Cloud Networks allowed to access this network endpoint.
         *
         * @param allowlistedHttpVcns the value to set
         * @return this builder
         */
        public Builder allowlistedHttpVcns(
                java.util.List<VirtualCloudNetwork> allowlistedHttpVcns) {
            this.allowlistedHttpVcns = allowlistedHttpVcns;
            this.__explicitlySet__.add("allowlistedHttpVcns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePublicEndpointDetails build() {
            UpdatePublicEndpointDetails model =
                    new UpdatePublicEndpointDetails(
                            this.allowlistedHttpIps, this.allowlistedHttpVcns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePublicEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("allowlistedHttpIps")) {
                this.allowlistedHttpIps(model.getAllowlistedHttpIps());
            }
            if (model.wasPropertyExplicitlySet("allowlistedHttpVcns")) {
                this.allowlistedHttpVcns(model.getAllowlistedHttpVcns());
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
    public UpdatePublicEndpointDetails(
            java.util.List<String> allowlistedHttpIps,
            java.util.List<VirtualCloudNetwork> allowlistedHttpVcns) {
        super();
        this.allowlistedHttpIps = allowlistedHttpIps;
        this.allowlistedHttpVcns = allowlistedHttpVcns;
    }

    /**
     * Source IP addresses or IP address ranges ingress rules. (ex: "168.122.59.5/32",
     * "10.20.30.0/26") An invalid IP or CIDR block will result in a 400 response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpIps")
    private final java.util.List<String> allowlistedHttpIps;

    /**
     * Source IP addresses or IP address ranges ingress rules. (ex: "168.122.59.5/32",
     * "10.20.30.0/26") An invalid IP or CIDR block will result in a 400 response.
     *
     * @return the value
     */
    public java.util.List<String> getAllowlistedHttpIps() {
        return allowlistedHttpIps;
    }

    /** Virtual Cloud Networks allowed to access this network endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpVcns")
    private final java.util.List<VirtualCloudNetwork> allowlistedHttpVcns;

    /**
     * Virtual Cloud Networks allowed to access this network endpoint.
     *
     * @return the value
     */
    public java.util.List<VirtualCloudNetwork> getAllowlistedHttpVcns() {
        return allowlistedHttpVcns;
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
        sb.append("UpdatePublicEndpointDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", allowlistedHttpIps=").append(String.valueOf(this.allowlistedHttpIps));
        sb.append(", allowlistedHttpVcns=").append(String.valueOf(this.allowlistedHttpVcns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePublicEndpointDetails)) {
            return false;
        }

        UpdatePublicEndpointDetails other = (UpdatePublicEndpointDetails) o;
        return java.util.Objects.equals(this.allowlistedHttpIps, other.allowlistedHttpIps)
                && java.util.Objects.equals(this.allowlistedHttpVcns, other.allowlistedHttpVcns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.allowlistedHttpIps == null
                                ? 43
                                : this.allowlistedHttpIps.hashCode());
        result =
                (result * PRIME)
                        + (this.allowlistedHttpVcns == null
                                ? 43
                                : this.allowlistedHttpVcns.hashCode());
        return result;
    }
}
