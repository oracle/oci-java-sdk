/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Specifies the filtering rule to reject logs <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GrepFilterDenyRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GrepFilterDenyRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "pattern"})
    public GrepFilterDenyRule(String key, String pattern) {
        super();
        this.key = key;
        this.pattern = pattern;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The field name to which the regular expression is applied */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The field name to which the regular expression is applied
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The regular expression */
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        /**
         * The regular expression
         *
         * @param pattern the value to set
         * @return this builder
         */
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GrepFilterDenyRule build() {
            GrepFilterDenyRule model = new GrepFilterDenyRule(this.key, this.pattern);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GrepFilterDenyRule model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("pattern")) {
                this.pattern(model.getPattern());
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

    /** The field name to which the regular expression is applied */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The field name to which the regular expression is applied
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The regular expression */
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

    /**
     * The regular expression
     *
     * @return the value
     */
    public String getPattern() {
        return pattern;
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
        sb.append("GrepFilterDenyRule(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrepFilterDenyRule)) {
            return false;
        }

        GrepFilterDenyRule other = (GrepFilterDenyRule) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.pattern, other.pattern)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
