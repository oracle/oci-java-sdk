/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Public endpoint configuration details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PublicEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "networkEndpointType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PublicEndpointDetails extends NetworkEndpointDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Source IP addresses or IP address ranges in ingress rules. */
        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
        private java.util.List<String> whitelistedIps;

        /**
         * Source IP addresses or IP address ranges in ingress rules.
         *
         * @param whitelistedIps the value to set
         * @return this builder
         */
        public Builder whitelistedIps(java.util.List<String> whitelistedIps) {
            this.whitelistedIps = whitelistedIps;
            this.__explicitlySet__.add("whitelistedIps");
            return this;
        }
        /** Virtual Cloud Networks allowed to access this network endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedVcns")
        private java.util.List<VirtualCloudNetwork> whitelistedVcns;

        /**
         * Virtual Cloud Networks allowed to access this network endpoint.
         *
         * @param whitelistedVcns the value to set
         * @return this builder
         */
        public Builder whitelistedVcns(java.util.List<VirtualCloudNetwork> whitelistedVcns) {
            this.whitelistedVcns = whitelistedVcns;
            this.__explicitlySet__.add("whitelistedVcns");
            return this;
        }
        /** Oracle Cloud Services that are allowed to access this Analytics instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedServices")
        private java.util.List<AccessControlServiceType> whitelistedServices;

        /**
         * Oracle Cloud Services that are allowed to access this Analytics instance.
         *
         * @param whitelistedServices the value to set
         * @return this builder
         */
        public Builder whitelistedServices(
                java.util.List<AccessControlServiceType> whitelistedServices) {
            this.whitelistedServices = whitelistedServices;
            this.__explicitlySet__.add("whitelistedServices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublicEndpointDetails build() {
            PublicEndpointDetails model =
                    new PublicEndpointDetails(
                            this.whitelistedIps, this.whitelistedVcns, this.whitelistedServices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublicEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("whitelistedIps")) {
                this.whitelistedIps(model.getWhitelistedIps());
            }
            if (model.wasPropertyExplicitlySet("whitelistedVcns")) {
                this.whitelistedVcns(model.getWhitelistedVcns());
            }
            if (model.wasPropertyExplicitlySet("whitelistedServices")) {
                this.whitelistedServices(model.getWhitelistedServices());
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
    public PublicEndpointDetails(
            java.util.List<String> whitelistedIps,
            java.util.List<VirtualCloudNetwork> whitelistedVcns,
            java.util.List<AccessControlServiceType> whitelistedServices) {
        super();
        this.whitelistedIps = whitelistedIps;
        this.whitelistedVcns = whitelistedVcns;
        this.whitelistedServices = whitelistedServices;
    }

    /** Source IP addresses or IP address ranges in ingress rules. */
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
    private final java.util.List<String> whitelistedIps;

    /**
     * Source IP addresses or IP address ranges in ingress rules.
     *
     * @return the value
     */
    public java.util.List<String> getWhitelistedIps() {
        return whitelistedIps;
    }

    /** Virtual Cloud Networks allowed to access this network endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedVcns")
    private final java.util.List<VirtualCloudNetwork> whitelistedVcns;

    /**
     * Virtual Cloud Networks allowed to access this network endpoint.
     *
     * @return the value
     */
    public java.util.List<VirtualCloudNetwork> getWhitelistedVcns() {
        return whitelistedVcns;
    }

    /** Oracle Cloud Services that are allowed to access this Analytics instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedServices")
    private final java.util.List<AccessControlServiceType> whitelistedServices;

    /**
     * Oracle Cloud Services that are allowed to access this Analytics instance.
     *
     * @return the value
     */
    public java.util.List<AccessControlServiceType> getWhitelistedServices() {
        return whitelistedServices;
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
        sb.append("PublicEndpointDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", whitelistedIps=").append(String.valueOf(this.whitelistedIps));
        sb.append(", whitelistedVcns=").append(String.valueOf(this.whitelistedVcns));
        sb.append(", whitelistedServices=").append(String.valueOf(this.whitelistedServices));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublicEndpointDetails)) {
            return false;
        }

        PublicEndpointDetails other = (PublicEndpointDetails) o;
        return java.util.Objects.equals(this.whitelistedIps, other.whitelistedIps)
                && java.util.Objects.equals(this.whitelistedVcns, other.whitelistedVcns)
                && java.util.Objects.equals(this.whitelistedServices, other.whitelistedServices)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.whitelistedIps == null ? 43 : this.whitelistedIps.hashCode());
        result =
                (result * PRIME)
                        + (this.whitelistedVcns == null ? 43 : this.whitelistedVcns.hashCode());
        result =
                (result * PRIME)
                        + (this.whitelistedServices == null
                                ? 43
                                : this.whitelistedServices.hashCode());
        return result;
    }
}
