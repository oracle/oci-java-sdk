/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Pattern describing an http/https URL or set thereof
 * as a concatenation of optional host component and optional path component.
 * <p>
 * Key points:
 * 1. Use the specific URLs or construct the URL patterns you want to match using wildcard {@code *} and token characters {@code ./}.
 * 2. In the host component and path component don't enter consecutive wildcard {@code *} for example: {@code example.*.*.com}.
 * 3. To match the exact domain and its subdirectories add a trailing slash {@code /} to your entry.
 * 4. The firewall interprets entries that do not end in a {@code /} or {@code *} with an implicit asterisk {@code *} to their end, which further increases the potential matches.
 * 5. The Use of multiple wildcards in a single pattern can impact the performance of the firewall.
 * <p>
 * Domain/subdomains match examples:
 * 1. {@code *.example.com.*} will match {@code sub1.sub2.example.com.info.us} and {@code sub1.example.com.us} and {@code sub1.example.com/subdirectory} but not match {@code sub1.example.com}.
 * 2. {@code *.example.com} will match {@code sub1.example.com} and {@code sub1.sub2.example.com} and {@code sub1.example.com.au} but not match {@code example.com}.
 * 3. {@code *.example.com/} will match {@code sub1.sub2.example.com} and {@code sub1.example.com} but not match {@code sub1.example.com.au}.
 * 4. {@code example.com} will match {@code example.com} and {@code example.com.au} and {@code example.com.info.us} and {@code example.com/subdirectory}.
 * 5. {@code example.com/} will match {@code example.com} and {@code example.com/foo} but not {@code example.com.info.us}.
 * 6. {@code example.*.com} will match {@code example.sub1.com} and {@code example.sub1.sub2.com} and {@code example.sub1.com.au} and {@code example.sub1.com/subdirecroty}.
 * 7. {@code example.*.com/} will match {@code example.sub1.com} and {@code example.sub1.sub2.com} and {@code example.sub1.com/subdirecroty} but not match {@code example.sub1.com.au}.
 * 8. {@code example.com.*} will match {@code example.com.us} and {@code example.com.info.us} and {@code example.com.us/subdirectory} but not match {@code sub1.example.com}.
 * <p>
 * Subdirectory or path match examples:
 * 1. {@code example.com/*} will match {@code example.com/foo} and {@code example.com/bar} and any {@code example.com/subdirectory}.
 * 2. {@code example.com/foo} will match {@code example.com/foo}.
 * 3. {@code www.example.com/foo/*} will match {@code www.exampe.com/foo/subdiectory}, but not match {@code www.example.com/FOO} or {@code www.example.com/bar/subdirectory}.
 * 4. {@code *.example.com/foo/*} will match {@code sub2.sub.example.com/foo/subdirectory} but not match {@code sub1.example.com/FOO} or {@code sub1.example.com/bar/subdirectory}.
 * <p>
 * Other examples containing IP addresses in urls:
 * 1. 103.12.14.122/ will match 103.12.14.122 and 103.12.14.122/subdirectory.
 * 2. 103.12.14.122:8081/ will match 103.12.14.122:8081 and 103.12.14.122:8081/subdirectory.
 * 3. 2607:9d80:4680:3f01:0000:0000:00d0:00c0/ will match 2607:9d80:4680:3f01:0000:0000:00d0:00c0 and 2607:9d80:4680:3f01:0000:0000:00d0:00c0/subdirecroty.
 * 4. [2607:9d80:4680:3f01:0000:0000:00d0:00c0]:8081/ will match [2607:9d80:4680:3f01:0000:0000:00d0:00c0]:8081 and [2607:9d80:4680:3f01:0000:0000:00d0:00c0]:8081/subdirecroty.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SimpleUrlPattern.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SimpleUrlPattern extends UrlPattern {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A string consisting of a concatenation of optional host component and optional path component.
         * The host component may start with {@code *.} to match the case-insensitive domain and all its subdomains.
         * The path component must start with a {@code /}, and may end with {@code *} to match all paths of which it is a case-sensitive prefix.
         * A missing host component matches all request domains, and a missing path component matches all request paths.
         * An empty value matches all requests.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        /**
         * A string consisting of a concatenation of optional host component and optional path component.
         * The host component may start with {@code *.} to match the case-insensitive domain and all its subdomains.
         * The path component must start with a {@code /}, and may end with {@code *} to match all paths of which it is a case-sensitive prefix.
         * A missing host component matches all request domains, and a missing path component matches all request paths.
         * An empty value matches all requests.
         *
         * @param pattern the value to set
         * @return this builder
         **/
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SimpleUrlPattern build() {
            SimpleUrlPattern __instance__ = new SimpleUrlPattern(pattern);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SimpleUrlPattern o) {
            Builder copiedBuilder = pattern(o.getPattern());

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

    @Deprecated
    public SimpleUrlPattern(String pattern) {
        super();
        this.pattern = pattern;
    }

    /**
     * A string consisting of a concatenation of optional host component and optional path component.
     * The host component may start with {@code *.} to match the case-insensitive domain and all its subdomains.
     * The path component must start with a {@code /}, and may end with {@code *} to match all paths of which it is a case-sensitive prefix.
     * A missing host component matches all request domains, and a missing path component matches all request paths.
     * An empty value matches all requests.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

    /**
     * A string consisting of a concatenation of optional host component and optional path component.
     * The host component may start with {@code *.} to match the case-insensitive domain and all its subdomains.
     * The path component must start with a {@code /}, and may end with {@code *} to match all paths of which it is a case-sensitive prefix.
     * A missing host component matches all request domains, and a missing path component matches all request paths.
     * An empty value matches all requests.
     *
     * @return the value
     **/
    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SimpleUrlPattern(");
        sb.append("super=").append(super.toString());
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
        return java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
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
