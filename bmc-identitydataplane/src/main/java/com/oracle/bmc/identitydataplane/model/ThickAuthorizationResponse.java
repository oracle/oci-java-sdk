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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ThickAuthorizationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ThickAuthorizationResponse
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "policy",
        "policyCacheDuration",
        "groups",
        "groupMembershipCacheDuration",
        "flushAllCaches"
    })
    public ThickAuthorizationResponse(
            String policy,
            String policyCacheDuration,
            java.util.List<String> groups,
            String groupMembershipCacheDuration,
            Boolean flushAllCaches) {
        super();
        this.policy = policy;
        this.policyCacheDuration = policyCacheDuration;
        this.groups = groups;
        this.groupMembershipCacheDuration = groupMembershipCacheDuration;
        this.flushAllCaches = flushAllCaches;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The policy string related to the request
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private String policy;

        /**
         * The policy string related to the request
         * @param policy the value to set
         * @return this builder
         **/
        public Builder policy(String policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }
        /**
         * The duration of how long this policy should be cached. Note that the type is of type java.time.Duration, not
         * string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyCacheDuration")
        private String policyCacheDuration;

        /**
         * The duration of how long this policy should be cached. Note that the type is of type java.time.Duration, not
         * string.
         *
         * @param policyCacheDuration the value to set
         * @return this builder
         **/
        public Builder policyCacheDuration(String policyCacheDuration) {
            this.policyCacheDuration = policyCacheDuration;
            this.__explicitlySet__.add("policyCacheDuration");
            return this;
        }
        /**
         * The policy string related to the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<String> groups;

        /**
         * The policy string related to the request.
         * @param groups the value to set
         * @return this builder
         **/
        public Builder groups(java.util.List<String> groups) {
            this.groups = groups;
            this.__explicitlySet__.add("groups");
            return this;
        }
        /**
         * The duration of how long the user's group membership should be cached. Note that the type is of type
         * java.time.Duration, not string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipCacheDuration")
        private String groupMembershipCacheDuration;

        /**
         * The duration of how long the user's group membership should be cached. Note that the type is of type
         * java.time.Duration, not string.
         *
         * @param groupMembershipCacheDuration the value to set
         * @return this builder
         **/
        public Builder groupMembershipCacheDuration(String groupMembershipCacheDuration) {
            this.groupMembershipCacheDuration = groupMembershipCacheDuration;
            this.__explicitlySet__.add("groupMembershipCacheDuration");
            return this;
        }
        /**
         * If set to true, the SDK should clear the caches.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("flushAllCaches")
        private Boolean flushAllCaches;

        /**
         * If set to true, the SDK should clear the caches.
         * @param flushAllCaches the value to set
         * @return this builder
         **/
        public Builder flushAllCaches(Boolean flushAllCaches) {
            this.flushAllCaches = flushAllCaches;
            this.__explicitlySet__.add("flushAllCaches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThickAuthorizationResponse build() {
            ThickAuthorizationResponse model =
                    new ThickAuthorizationResponse(
                            this.policy,
                            this.policyCacheDuration,
                            this.groups,
                            this.groupMembershipCacheDuration,
                            this.flushAllCaches);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThickAuthorizationResponse model) {
            if (model.wasPropertyExplicitlySet("policy")) {
                this.policy(model.getPolicy());
            }
            if (model.wasPropertyExplicitlySet("policyCacheDuration")) {
                this.policyCacheDuration(model.getPolicyCacheDuration());
            }
            if (model.wasPropertyExplicitlySet("groups")) {
                this.groups(model.getGroups());
            }
            if (model.wasPropertyExplicitlySet("groupMembershipCacheDuration")) {
                this.groupMembershipCacheDuration(model.getGroupMembershipCacheDuration());
            }
            if (model.wasPropertyExplicitlySet("flushAllCaches")) {
                this.flushAllCaches(model.getFlushAllCaches());
            }
            return this;
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
     * The policy string related to the request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final String policy;

    /**
     * The policy string related to the request
     * @return the value
     **/
    public String getPolicy() {
        return policy;
    }

    /**
     * The duration of how long this policy should be cached. Note that the type is of type java.time.Duration, not
     * string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyCacheDuration")
    private final String policyCacheDuration;

    /**
     * The duration of how long this policy should be cached. Note that the type is of type java.time.Duration, not
     * string.
     *
     * @return the value
     **/
    public String getPolicyCacheDuration() {
        return policyCacheDuration;
    }

    /**
     * The policy string related to the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    private final java.util.List<String> groups;

    /**
     * The policy string related to the request.
     * @return the value
     **/
    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * The duration of how long the user's group membership should be cached. Note that the type is of type
     * java.time.Duration, not string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipCacheDuration")
    private final String groupMembershipCacheDuration;

    /**
     * The duration of how long the user's group membership should be cached. Note that the type is of type
     * java.time.Duration, not string.
     *
     * @return the value
     **/
    public String getGroupMembershipCacheDuration() {
        return groupMembershipCacheDuration;
    }

    /**
     * If set to true, the SDK should clear the caches.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flushAllCaches")
    private final Boolean flushAllCaches;

    /**
     * If set to true, the SDK should clear the caches.
     * @return the value
     **/
    public Boolean getFlushAllCaches() {
        return flushAllCaches;
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
        sb.append("ThickAuthorizationResponse(");
        sb.append("super=").append(super.toString());
        sb.append("policy=").append(String.valueOf(this.policy));
        sb.append(", policyCacheDuration=").append(String.valueOf(this.policyCacheDuration));
        sb.append(", groups=").append(String.valueOf(this.groups));
        sb.append(", groupMembershipCacheDuration=")
                .append(String.valueOf(this.groupMembershipCacheDuration));
        sb.append(", flushAllCaches=").append(String.valueOf(this.flushAllCaches));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThickAuthorizationResponse)) {
            return false;
        }

        ThickAuthorizationResponse other = (ThickAuthorizationResponse) o;
        return java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.policyCacheDuration, other.policyCacheDuration)
                && java.util.Objects.equals(this.groups, other.groups)
                && java.util.Objects.equals(
                        this.groupMembershipCacheDuration, other.groupMembershipCacheDuration)
                && java.util.Objects.equals(this.flushAllCaches, other.flushAllCaches)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result =
                (result * PRIME)
                        + (this.policyCacheDuration == null
                                ? 43
                                : this.policyCacheDuration.hashCode());
        result = (result * PRIME) + (this.groups == null ? 43 : this.groups.hashCode());
        result =
                (result * PRIME)
                        + (this.groupMembershipCacheDuration == null
                                ? 43
                                : this.groupMembershipCacheDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.flushAllCaches == null ? 43 : this.flushAllCaches.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
