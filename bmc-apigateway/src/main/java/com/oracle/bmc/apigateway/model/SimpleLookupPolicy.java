/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Provides ability to vary the cache key using context expressions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SimpleLookupPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SimpleLookupPolicy extends ResponseCacheLookupPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /**
         * A list of context expressions whose values will be added to the base cache key. Values
         * should contain an expression enclosed within ${} delimiters. Only the request context is
         * available.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cacheKeyAdditions")
        private java.util.List<String> cacheKeyAdditions;

        /**
         * A list of context expressions whose values will be added to the base cache key. Values
         * should contain an expression enclosed within ${} delimiters. Only the request context is
         * available.
         *
         * @param cacheKeyAdditions the value to set
         * @return this builder
         */
        public Builder cacheKeyAdditions(java.util.List<String> cacheKeyAdditions) {
            this.cacheKeyAdditions = cacheKeyAdditions;
            this.__explicitlySet__.add("cacheKeyAdditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SimpleLookupPolicy build() {
            SimpleLookupPolicy model =
                    new SimpleLookupPolicy(
                            this.isEnabled, this.isPrivateCachingEnabled, this.cacheKeyAdditions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SimpleLookupPolicy model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isPrivateCachingEnabled")) {
                this.isPrivateCachingEnabled(model.getIsPrivateCachingEnabled());
            }
            if (model.wasPropertyExplicitlySet("cacheKeyAdditions")) {
                this.cacheKeyAdditions(model.getCacheKeyAdditions());
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
    public SimpleLookupPolicy(
            Boolean isEnabled,
            Boolean isPrivateCachingEnabled,
            java.util.List<String> cacheKeyAdditions) {
        super(isEnabled, isPrivateCachingEnabled);
        this.cacheKeyAdditions = cacheKeyAdditions;
    }

    /**
     * A list of context expressions whose values will be added to the base cache key. Values should
     * contain an expression enclosed within ${} delimiters. Only the request context is available.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cacheKeyAdditions")
    private final java.util.List<String> cacheKeyAdditions;

    /**
     * A list of context expressions whose values will be added to the base cache key. Values should
     * contain an expression enclosed within ${} delimiters. Only the request context is available.
     *
     * @return the value
     */
    public java.util.List<String> getCacheKeyAdditions() {
        return cacheKeyAdditions;
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
        sb.append("SimpleLookupPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", cacheKeyAdditions=").append(String.valueOf(this.cacheKeyAdditions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SimpleLookupPolicy)) {
            return false;
        }

        SimpleLookupPolicy other = (SimpleLookupPolicy) o;
        return java.util.Objects.equals(this.cacheKeyAdditions, other.cacheKeyAdditions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cacheKeyAdditions == null ? 43 : this.cacheKeyAdditions.hashCode());
        return result;
    }
}
