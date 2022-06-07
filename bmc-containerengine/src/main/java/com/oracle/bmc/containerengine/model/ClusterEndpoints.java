/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define endpoints for a cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterEndpoints.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterEndpoints {
    @Deprecated
    @java.beans.ConstructorProperties({
        "kubernetes",
        "publicEndpoint",
        "privateEndpoint",
        "vcnHostnameEndpoint"
    })
    public ClusterEndpoints(
            String kubernetes,
            String publicEndpoint,
            String privateEndpoint,
            String vcnHostnameEndpoint) {
        super();
        this.kubernetes = kubernetes;
        this.publicEndpoint = publicEndpoint;
        this.privateEndpoint = privateEndpoint;
        this.vcnHostnameEndpoint = vcnHostnameEndpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetes")
        private String kubernetes;

        public Builder kubernetes(String kubernetes) {
            this.kubernetes = kubernetes;
            this.__explicitlySet__.add("kubernetes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicEndpoint")
        private String publicEndpoint;

        public Builder publicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            this.__explicitlySet__.add("publicEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private String privateEndpoint;

        public Builder privateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnHostnameEndpoint")
        private String vcnHostnameEndpoint;

        public Builder vcnHostnameEndpoint(String vcnHostnameEndpoint) {
            this.vcnHostnameEndpoint = vcnHostnameEndpoint;
            this.__explicitlySet__.add("vcnHostnameEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterEndpoints build() {
            ClusterEndpoints __instance__ =
                    new ClusterEndpoints(
                            kubernetes, publicEndpoint, privateEndpoint, vcnHostnameEndpoint);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterEndpoints o) {
            Builder copiedBuilder =
                    kubernetes(o.getKubernetes())
                            .publicEndpoint(o.getPublicEndpoint())
                            .privateEndpoint(o.getPrivateEndpoint())
                            .vcnHostnameEndpoint(o.getVcnHostnameEndpoint());

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

    /**
     * The non-native networking Kubernetes API server endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetes")
    private final String kubernetes;

    public String getKubernetes() {
        return kubernetes;
    }

    /**
     * The public native networking Kubernetes API server endpoint, if one was requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicEndpoint")
    private final String publicEndpoint;

    public String getPublicEndpoint() {
        return publicEndpoint;
    }

    /**
     * The private native networking Kubernetes API server endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    private final String privateEndpoint;

    public String getPrivateEndpoint() {
        return privateEndpoint;
    }

    /**
     * The FQDN assigned to the Kubernetes API private endpoint.
     * Example: 'https://yourVcnHostnameEndpoint'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnHostnameEndpoint")
    private final String vcnHostnameEndpoint;

    public String getVcnHostnameEndpoint() {
        return vcnHostnameEndpoint;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClusterEndpoints(");
        sb.append("kubernetes=").append(String.valueOf(this.kubernetes));
        sb.append(", publicEndpoint=").append(String.valueOf(this.publicEndpoint));
        sb.append(", privateEndpoint=").append(String.valueOf(this.privateEndpoint));
        sb.append(", vcnHostnameEndpoint=").append(String.valueOf(this.vcnHostnameEndpoint));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
