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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterEndpoints.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ClusterEndpoints {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The non-native networking Kubernetes API server endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetes")
    String kubernetes;

    /**
     * The public native networking Kubernetes API server endpoint, if one was requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicEndpoint")
    String publicEndpoint;

    /**
     * The private native networking Kubernetes API server endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    String privateEndpoint;

    /**
     * The FQDN assigned to the Kubernetes API private endpoint.
     * Example: 'https://yourVcnHostnameEndpoint'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnHostnameEndpoint")
    String vcnHostnameEndpoint;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
