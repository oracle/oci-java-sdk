/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FullyQualifiedScope.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FullyQualifiedScope {
    @Deprecated
    @java.beans.ConstructorProperties({"audience", "scope"})
    public FullyQualifiedScope(String audience, String scope) {
        super();
        this.audience = audience;
        this.scope = scope;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Audience for the given scope context.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("audience")
        private String audience;

        /**
         * Audience for the given scope context.
         * @param audience the value to set
         * @return this builder
         **/
        public Builder audience(String audience) {
            this.audience = audience;
            this.__explicitlySet__.add("audience");
            return this;
        }
        /**
         * Allowed permission scope for the given context.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * Allowed permission scope for the given context.
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FullyQualifiedScope build() {
            FullyQualifiedScope __instance__ = new FullyQualifiedScope(audience, scope);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FullyQualifiedScope o) {
            Builder copiedBuilder = audience(o.getAudience()).scope(o.getScope());

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
     * Audience for the given scope context.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("audience")
    private final String audience;

    /**
     * Audience for the given scope context.
     * @return the value
     **/
    public String getAudience() {
        return audience;
    }

    /**
     * Allowed permission scope for the given context.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * Allowed permission scope for the given context.
     * @return the value
     **/
    public String getScope() {
        return scope;
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
        sb.append("FullyQualifiedScope(");
        sb.append("audience=").append(String.valueOf(this.audience));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FullyQualifiedScope)) {
            return false;
        }

        FullyQualifiedScope other = (FullyQualifiedScope) o;
        return java.util.Objects.equals(this.audience, other.audience)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.audience == null ? 43 : this.audience.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
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
