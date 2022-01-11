/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ThickAuthorizationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ThickAuthorizationResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private String policy;

        public Builder policy(String policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyCacheDuration")
        private String policyCacheDuration;

        public Builder policyCacheDuration(String policyCacheDuration) {
            this.policyCacheDuration = policyCacheDuration;
            this.__explicitlySet__.add("policyCacheDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<String> groups;

        public Builder groups(java.util.List<String> groups) {
            this.groups = groups;
            this.__explicitlySet__.add("groups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipCacheDuration")
        private String groupMembershipCacheDuration;

        public Builder groupMembershipCacheDuration(String groupMembershipCacheDuration) {
            this.groupMembershipCacheDuration = groupMembershipCacheDuration;
            this.__explicitlySet__.add("groupMembershipCacheDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flushAllCaches")
        private Boolean flushAllCaches;

        public Builder flushAllCaches(Boolean flushAllCaches) {
            this.flushAllCaches = flushAllCaches;
            this.__explicitlySet__.add("flushAllCaches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThickAuthorizationResponse build() {
            ThickAuthorizationResponse __instance__ =
                    new ThickAuthorizationResponse(
                            policy,
                            policyCacheDuration,
                            groups,
                            groupMembershipCacheDuration,
                            flushAllCaches);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThickAuthorizationResponse o) {
            Builder copiedBuilder =
                    policy(o.getPolicy())
                            .policyCacheDuration(o.getPolicyCacheDuration())
                            .groups(o.getGroups())
                            .groupMembershipCacheDuration(o.getGroupMembershipCacheDuration())
                            .flushAllCaches(o.getFlushAllCaches());

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
     * The policy string related to the request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    String policy;

    /**
     * The duration of how long this policy should be cached. Note that the type is of type java.time.Duration, not
     * string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyCacheDuration")
    String policyCacheDuration;

    /**
     * The policy string related to the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    java.util.List<String> groups;

    /**
     * The duration of how long the user's group membership should be cached. Note that the type is of type
     * java.time.Duration, not string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipCacheDuration")
    String groupMembershipCacheDuration;

    /**
     * If set to true, the SDK should clear the caches.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flushAllCaches")
    Boolean flushAllCaches;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
