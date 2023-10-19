/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Pattern describing an http/https URL or set thereof as a concatenation of optional host component
 * and optional path component.
 *
 * <p>{@code *.example.com} will match http://example.com/ and https://foo.example.com/foo?bar.
 *
 * <p>{@code www.example.com/foo*} will match https://www.example.com/foo and
 * http://www.exampe.com/foobar and https://www.example.com/foo/bar?baz, but not
 * http://sub.www.example.com/foo or https://www.example.com/FOO.
 *
 * <p>{@code *.example.com/foo*} will match http://example.com/foo and
 * https://sub2.sub.example.com/foo/bar?baz, but not http://example.com/FOO. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SimpleUrlPattern.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SimpleUrlPattern extends UrlPattern {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A string consisting of a concatenation of optional host component and optional path
         * component. The host component may start with {@code *.} to match the case-insensitive
         * domain and all its subdomains. The path component must start with a {@code /}, and may
         * end with {@code *} to match all paths of which it is a case-sensitive prefix. A missing
         * host component matches all request domains, and a missing path component matches all
         * request paths. An empty value matches all requests.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        /**
         * A string consisting of a concatenation of optional host component and optional path
         * component. The host component may start with {@code *.} to match the case-insensitive
         * domain and all its subdomains. The path component must start with a {@code /}, and may
         * end with {@code *} to match all paths of which it is a case-sensitive prefix. A missing
         * host component matches all request domains, and a missing path component matches all
         * request paths. An empty value matches all requests.
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

        public SimpleUrlPattern build() {
            SimpleUrlPattern model = new SimpleUrlPattern(this.pattern);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SimpleUrlPattern model) {
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

    @Deprecated
    public SimpleUrlPattern(String pattern) {
        super();
        this.pattern = pattern;
    }

    /**
     * A string consisting of a concatenation of optional host component and optional path
     * component. The host component may start with {@code *.} to match the case-insensitive domain
     * and all its subdomains. The path component must start with a {@code /}, and may end with
     * {@code *} to match all paths of which it is a case-sensitive prefix. A missing host component
     * matches all request domains, and a missing path component matches all request paths. An empty
     * value matches all requests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

    /**
     * A string consisting of a concatenation of optional host component and optional path
     * component. The host component may start with {@code *.} to match the case-insensitive domain
     * and all its subdomains. The path component must start with a {@code /}, and may end with
     * {@code *} to match all paths of which it is a case-sensitive prefix. A missing host component
     * matches all request domains, and a missing path component matches all request paths. An empty
     * value matches all requests.
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
        sb.append("SimpleUrlPattern(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SimpleUrlPattern)) {
            return false;
        }

        SimpleUrlPattern other = (SimpleUrlPattern) o;
        return java.util.Objects.equals(this.pattern, other.pattern) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        return result;
    }
}
