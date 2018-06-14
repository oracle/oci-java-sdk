/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to create a cluster kubeconfig.
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateClusterKubeconfigContentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateClusterKubeconfigContentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tokenVersion")
        private String tokenVersion;

        public Builder tokenVersion(String tokenVersion) {
            this.tokenVersion = tokenVersion;
            this.__explicitlySet__.add("tokenVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expiration")
        private Integer expiration;

        public Builder expiration(Integer expiration) {
            this.expiration = expiration;
            this.__explicitlySet__.add("expiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateClusterKubeconfigContentDetails build() {
            CreateClusterKubeconfigContentDetails __instance__ =
                    new CreateClusterKubeconfigContentDetails(tokenVersion, expiration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateClusterKubeconfigContentDetails o) {
            Builder copiedBuilder = tokenVersion(o.getTokenVersion()).expiration(o.getExpiration());

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
     * The version of the kubeconfig token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenVersion")
    String tokenVersion;

    /**
     * The desired expiration, in seconds, to use for the kubeconfig token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expiration")
    Integer expiration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
