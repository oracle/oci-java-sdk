/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Provides ability to vary the cache key using context expressions.
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
    builder = SimpleLookupPolicy.Builder.class
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
public class SimpleLookupPolicy extends ResponseCacheLookupPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrivateCachingEnabled")
        private Boolean isPrivateCachingEnabled;

        public Builder isPrivateCachingEnabled(Boolean isPrivateCachingEnabled) {
            this.isPrivateCachingEnabled = isPrivateCachingEnabled;
            this.__explicitlySet__.add("isPrivateCachingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cacheKeyAdditions")
        private java.util.List<String> cacheKeyAdditions;

        public Builder cacheKeyAdditions(java.util.List<String> cacheKeyAdditions) {
            this.cacheKeyAdditions = cacheKeyAdditions;
            this.__explicitlySet__.add("cacheKeyAdditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SimpleLookupPolicy build() {
            SimpleLookupPolicy __instance__ =
                    new SimpleLookupPolicy(isEnabled, isPrivateCachingEnabled, cacheKeyAdditions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SimpleLookupPolicy o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .isPrivateCachingEnabled(o.getIsPrivateCachingEnabled())
                            .cacheKeyAdditions(o.getCacheKeyAdditions());

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
    public SimpleLookupPolicy(
            Boolean isEnabled,
            Boolean isPrivateCachingEnabled,
            java.util.List<String> cacheKeyAdditions) {
        super(isEnabled, isPrivateCachingEnabled);
        this.cacheKeyAdditions = cacheKeyAdditions;
    }

    /**
     * A list of context expressions whose values will be added to the base cache key. Values should contain an expression enclosed within
     * ${} delimiters. Only the request context is available.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cacheKeyAdditions")
    java.util.List<String> cacheKeyAdditions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
