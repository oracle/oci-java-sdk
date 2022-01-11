/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A set of public keys that is retrieved at run-time from a remote location
 * to verify the JWT signature. The set should only contain JWK-formatted
 * keys.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RemoteJsonWebKeySet.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RemoteJsonWebKeySet extends PublicKeySet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
        private Boolean isSslVerifyDisabled;

        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = isSslVerifyDisabled;
            this.__explicitlySet__.add("isSslVerifyDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxCacheDurationInHours")
        private Integer maxCacheDurationInHours;

        public Builder maxCacheDurationInHours(Integer maxCacheDurationInHours) {
            this.maxCacheDurationInHours = maxCacheDurationInHours;
            this.__explicitlySet__.add("maxCacheDurationInHours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoteJsonWebKeySet build() {
            RemoteJsonWebKeySet __instance__ =
                    new RemoteJsonWebKeySet(uri, isSslVerifyDisabled, maxCacheDurationInHours);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoteJsonWebKeySet o) {
            Builder copiedBuilder =
                    uri(o.getUri())
                            .isSslVerifyDisabled(o.getIsSslVerifyDisabled())
                            .maxCacheDurationInHours(o.getMaxCacheDurationInHours());

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

    @Deprecated
    public RemoteJsonWebKeySet(
            String uri, Boolean isSslVerifyDisabled, Integer maxCacheDurationInHours) {
        super();
        this.uri = uri;
        this.isSslVerifyDisabled = isSslVerifyDisabled;
        this.maxCacheDurationInHours = maxCacheDurationInHours;
    }

    /**
     * The uri from which to retrieve the key. It must be accessible
     * without authentication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * Defines whether or not to uphold SSL verification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
    Boolean isSslVerifyDisabled;

    /**
     * The duration for which the JWKS should be cached before it is
     * fetched again.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCacheDurationInHours")
    Integer maxCacheDurationInHours;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
