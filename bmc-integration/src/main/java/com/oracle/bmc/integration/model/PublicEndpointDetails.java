/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Public endpoint configuration details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PublicEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "networkEndpointType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PublicEndpointDetails extends NetworkEndpointDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Source IP addresses or IP address ranges ingress rules.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpIps")
        private java.util.List<String> allowlistedHttpIps;

        /**
         * Source IP addresses or IP address ranges ingress rules.
         *
         * @param allowlistedHttpIps the value to set
         * @return this builder
         **/
        public Builder allowlistedHttpIps(java.util.List<String> allowlistedHttpIps) {
            this.allowlistedHttpIps = allowlistedHttpIps;
            this.__explicitlySet__.add("allowlistedHttpIps");
            return this;
        }
        /**
         * Virtual Cloud Networks allowed to access this network endpoint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpVcns")
        private java.util.List<VirtualCloudNetwork> allowlistedHttpVcns;

        /**
         * Virtual Cloud Networks allowed to access this network endpoint.
         *
         * @param allowlistedHttpVcns the value to set
         * @return this builder
         **/
        public Builder allowlistedHttpVcns(
                java.util.List<VirtualCloudNetwork> allowlistedHttpVcns) {
            this.allowlistedHttpVcns = allowlistedHttpVcns;
            this.__explicitlySet__.add("allowlistedHttpVcns");
            return this;
        }
        /**
         * The Integration service's VCN is allow-listed to allow integrations to call back into other integrations
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIntegrationVcnAllowlisted")
        private Boolean isIntegrationVcnAllowlisted;

        /**
         * The Integration service's VCN is allow-listed to allow integrations to call back into other integrations
         * @param isIntegrationVcnAllowlisted the value to set
         * @return this builder
         **/
        public Builder isIntegrationVcnAllowlisted(Boolean isIntegrationVcnAllowlisted) {
            this.isIntegrationVcnAllowlisted = isIntegrationVcnAllowlisted;
            this.__explicitlySet__.add("isIntegrationVcnAllowlisted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublicEndpointDetails build() {
            PublicEndpointDetails __instance__ =
                    new PublicEndpointDetails(
                            allowlistedHttpIps, allowlistedHttpVcns, isIntegrationVcnAllowlisted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublicEndpointDetails o) {
            Builder copiedBuilder =
                    allowlistedHttpIps(o.getAllowlistedHttpIps())
                            .allowlistedHttpVcns(o.getAllowlistedHttpVcns())
                            .isIntegrationVcnAllowlisted(o.getIsIntegrationVcnAllowlisted());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public PublicEndpointDetails(
            java.util.List<String> allowlistedHttpIps,
            java.util.List<VirtualCloudNetwork> allowlistedHttpVcns,
            Boolean isIntegrationVcnAllowlisted) {
        super();
        this.allowlistedHttpIps = allowlistedHttpIps;
        this.allowlistedHttpVcns = allowlistedHttpVcns;
        this.isIntegrationVcnAllowlisted = isIntegrationVcnAllowlisted;
    }

    /**
     * Source IP addresses or IP address ranges ingress rules.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpIps")
    private final java.util.List<String> allowlistedHttpIps;

    /**
     * Source IP addresses or IP address ranges ingress rules.
     *
     * @return the value
     **/
    public java.util.List<String> getAllowlistedHttpIps() {
        return allowlistedHttpIps;
    }

    /**
     * Virtual Cloud Networks allowed to access this network endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpVcns")
    private final java.util.List<VirtualCloudNetwork> allowlistedHttpVcns;

    /**
     * Virtual Cloud Networks allowed to access this network endpoint.
     *
     * @return the value
     **/
    public java.util.List<VirtualCloudNetwork> getAllowlistedHttpVcns() {
        return allowlistedHttpVcns;
    }

    /**
     * The Integration service's VCN is allow-listed to allow integrations to call back into other integrations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntegrationVcnAllowlisted")
    private final Boolean isIntegrationVcnAllowlisted;

    /**
     * The Integration service's VCN is allow-listed to allow integrations to call back into other integrations
     * @return the value
     **/
    public Boolean getIsIntegrationVcnAllowlisted() {
        return isIntegrationVcnAllowlisted;
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
        sb.append("PublicEndpointDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", allowlistedHttpIps=").append(String.valueOf(this.allowlistedHttpIps));
        sb.append(", allowlistedHttpVcns=").append(String.valueOf(this.allowlistedHttpVcns));
        sb.append(", isIntegrationVcnAllowlisted=")
                .append(String.valueOf(this.isIntegrationVcnAllowlisted));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
        return java.util.Objects.equals(this.allowlistedHttpIps, other.allowlistedHttpIps)
                && java.util.Objects.equals(this.allowlistedHttpVcns, other.allowlistedHttpVcns)
                && java.util.Objects.equals(
                        this.isIntegrationVcnAllowlisted, other.isIntegrationVcnAllowlisted)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
        result =
                (result * PRIME)
                        + (this.isIntegrationVcnAllowlisted == null
                                ? 43
                                : this.isIntegrationVcnAllowlisted.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
