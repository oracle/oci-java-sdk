/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The limit and usage for a specific environment type, for example, production, development, or test.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LimitAndUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LimitAndUsage {
    @Deprecated
    @java.beans.ConstructorProperties({"limit", "usage"})
    public LimitAndUsage(Integer limit, Integer usage) {
        super();
        this.limit = limit;
        this.usage = usage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The limit of current environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        private Integer limit;

        /**
         * The limit of current environment.
         * @param limit the value to set
         * @return this builder
         **/
        public Builder limit(Integer limit) {
            this.limit = limit;
            this.__explicitlySet__.add("limit");
            return this;
        }
        /**
         * The usage of current environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Integer usage;

        /**
         * The usage of current environment.
         * @param usage the value to set
         * @return this builder
         **/
        public Builder usage(Integer usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitAndUsage build() {
            LimitAndUsage __instance__ = new LimitAndUsage(limit, usage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitAndUsage o) {
            Builder copiedBuilder = limit(o.getLimit()).usage(o.getUsage());

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
     * The limit of current environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

    /**
     * The limit of current environment.
     * @return the value
     **/
    public Integer getLimit() {
        return limit;
    }

    /**
     * The usage of current environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final Integer usage;

    /**
     * The usage of current environment.
     * @return the value
     **/
    public Integer getUsage() {
        return usage;
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
        sb.append("LimitAndUsage(");
        sb.append("limit=").append(String.valueOf(this.limit));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitAndUsage)) {
            return false;
        }

        LimitAndUsage other = (LimitAndUsage) o;
        return java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
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
