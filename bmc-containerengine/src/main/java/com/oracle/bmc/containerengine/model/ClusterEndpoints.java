/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define endpoints for a cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterEndpoints.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ClusterEndpoints
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "kubernetes",
        "publicEndpoint",
        "privateEndpoint",
        "vcnHostnameEndpoint",
        "ipv6Endpoint"
    })
    public ClusterEndpoints(
            String kubernetes,
            String publicEndpoint,
            String privateEndpoint,
            String vcnHostnameEndpoint,
            String ipv6Endpoint) {
        super();
        this.kubernetes = kubernetes;
        this.publicEndpoint = publicEndpoint;
        this.privateEndpoint = privateEndpoint;
        this.vcnHostnameEndpoint = vcnHostnameEndpoint;
        this.ipv6Endpoint = ipv6Endpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The non-native networking Kubernetes API server endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetes")
        private String kubernetes;

        /**
         * The non-native networking Kubernetes API server endpoint.
         *
         * @param kubernetes the value to set
         * @return this builder
         */
        public Builder kubernetes(String kubernetes) {
            this.kubernetes = kubernetes;
            this.__explicitlySet__.add("kubernetes");
            return this;
        }
        /** The public native networking Kubernetes API server endpoint, if one was requested. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicEndpoint")
        private String publicEndpoint;

        /**
         * The public native networking Kubernetes API server endpoint, if one was requested.
         *
         * @param publicEndpoint the value to set
         * @return this builder
         */
        public Builder publicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            this.__explicitlySet__.add("publicEndpoint");
            return this;
        }
        /** The private native networking Kubernetes API server endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private String privateEndpoint;

        /**
         * The private native networking Kubernetes API server endpoint.
         *
         * @param privateEndpoint the value to set
         * @return this builder
         */
        public Builder privateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }
        /**
         * The FQDN assigned to the Kubernetes API private endpoint. Example:
         * 'https://yourVcnHostnameEndpoint'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnHostnameEndpoint")
        private String vcnHostnameEndpoint;

        /**
         * The FQDN assigned to the Kubernetes API private endpoint. Example:
         * 'https://yourVcnHostnameEndpoint'
         *
         * @param vcnHostnameEndpoint the value to set
         * @return this builder
         */
        public Builder vcnHostnameEndpoint(String vcnHostnameEndpoint) {
            this.vcnHostnameEndpoint = vcnHostnameEndpoint;
            this.__explicitlySet__.add("vcnHostnameEndpoint");
            return this;
        }
        /** The IPv6 networking Kubernetes API server endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Endpoint")
        private String ipv6Endpoint;

        /**
         * The IPv6 networking Kubernetes API server endpoint.
         *
         * @param ipv6Endpoint the value to set
         * @return this builder
         */
        public Builder ipv6Endpoint(String ipv6Endpoint) {
            this.ipv6Endpoint = ipv6Endpoint;
            this.__explicitlySet__.add("ipv6Endpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterEndpoints build() {
            ClusterEndpoints model =
                    new ClusterEndpoints(
                            this.kubernetes,
                            this.publicEndpoint,
                            this.privateEndpoint,
                            this.vcnHostnameEndpoint,
                            this.ipv6Endpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterEndpoints model) {
            if (model.wasPropertyExplicitlySet("kubernetes")) {
                this.kubernetes(model.getKubernetes());
            }
            if (model.wasPropertyExplicitlySet("publicEndpoint")) {
                this.publicEndpoint(model.getPublicEndpoint());
            }
            if (model.wasPropertyExplicitlySet("privateEndpoint")) {
                this.privateEndpoint(model.getPrivateEndpoint());
            }
            if (model.wasPropertyExplicitlySet("vcnHostnameEndpoint")) {
                this.vcnHostnameEndpoint(model.getVcnHostnameEndpoint());
            }
            if (model.wasPropertyExplicitlySet("ipv6Endpoint")) {
                this.ipv6Endpoint(model.getIpv6Endpoint());
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

    /** The non-native networking Kubernetes API server endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetes")
    private final String kubernetes;

    /**
     * The non-native networking Kubernetes API server endpoint.
     *
     * @return the value
     */
    public String getKubernetes() {
        return kubernetes;
    }

    /** The public native networking Kubernetes API server endpoint, if one was requested. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicEndpoint")
    private final String publicEndpoint;

    /**
     * The public native networking Kubernetes API server endpoint, if one was requested.
     *
     * @return the value
     */
    public String getPublicEndpoint() {
        return publicEndpoint;
    }

    /** The private native networking Kubernetes API server endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    private final String privateEndpoint;

    /**
     * The private native networking Kubernetes API server endpoint.
     *
     * @return the value
     */
    public String getPrivateEndpoint() {
        return privateEndpoint;
    }

    /**
     * The FQDN assigned to the Kubernetes API private endpoint. Example:
     * 'https://yourVcnHostnameEndpoint'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnHostnameEndpoint")
    private final String vcnHostnameEndpoint;

    /**
     * The FQDN assigned to the Kubernetes API private endpoint. Example:
     * 'https://yourVcnHostnameEndpoint'
     *
     * @return the value
     */
    public String getVcnHostnameEndpoint() {
        return vcnHostnameEndpoint;
    }

    /** The IPv6 networking Kubernetes API server endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Endpoint")
    private final String ipv6Endpoint;

    /**
     * The IPv6 networking Kubernetes API server endpoint.
     *
     * @return the value
     */
    public String getIpv6Endpoint() {
        return ipv6Endpoint;
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
        sb.append("ClusterEndpoints(");
        sb.append("super=").append(super.toString());
        sb.append("kubernetes=").append(String.valueOf(this.kubernetes));
        sb.append(", publicEndpoint=").append(String.valueOf(this.publicEndpoint));
        sb.append(", privateEndpoint=").append(String.valueOf(this.privateEndpoint));
        sb.append(", vcnHostnameEndpoint=").append(String.valueOf(this.vcnHostnameEndpoint));
        sb.append(", ipv6Endpoint=").append(String.valueOf(this.ipv6Endpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterEndpoints)) {
            return false;
        }

        ClusterEndpoints other = (ClusterEndpoints) o;
        return java.util.Objects.equals(this.kubernetes, other.kubernetes)
                && java.util.Objects.equals(this.publicEndpoint, other.publicEndpoint)
                && java.util.Objects.equals(this.privateEndpoint, other.privateEndpoint)
                && java.util.Objects.equals(this.vcnHostnameEndpoint, other.vcnHostnameEndpoint)
                && java.util.Objects.equals(this.ipv6Endpoint, other.ipv6Endpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.kubernetes == null ? 43 : this.kubernetes.hashCode());
        result =
                (result * PRIME)
                        + (this.publicEndpoint == null ? 43 : this.publicEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpoint == null ? 43 : this.privateEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.vcnHostnameEndpoint == null
                                ? 43
                                : this.vcnHostnameEndpoint.hashCode());
        result = (result * PRIME) + (this.ipv6Endpoint == null ? 43 : this.ipv6Endpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
