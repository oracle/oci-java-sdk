/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of modifying a request header value. This rule applies only to HTTP listeners.
 * <p>
 * This rule adds a prefix, a suffix, or both to the header value.
 * <p>
 **NOTES:**
 * <p>
 *  This rule requires a value for a prefix, suffix, or both.
 * <p>
 *  The system does not support this rule for headers with multiple values.
 * <p>
 *  The system does not distinquish between underscore and dash characters in headers. That is, it treats
 *    {@code example_header_name} and {@code example-header-name} as identical.  If two such headers appear in a request, the system
 *    applies the action to the first header it finds. The affected header cannot be determined in advance. Oracle
 *    recommends that you do not rely on underscore or dash characters to uniquely distinguish header names.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExtendHttpRequestHeaderValueRule.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExtendHttpRequestHeaderValueRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("header")
        private String header;

        public Builder header(String header) {
            this.header = header;
            this.__explicitlySet__.add("header");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("suffix")
        private String suffix;

        public Builder suffix(String suffix) {
            this.suffix = suffix;
            this.__explicitlySet__.add("suffix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtendHttpRequestHeaderValueRule build() {
            ExtendHttpRequestHeaderValueRule __instance__ =
                    new ExtendHttpRequestHeaderValueRule(header, prefix, suffix);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtendHttpRequestHeaderValueRule o) {
            Builder copiedBuilder =
                    header(o.getHeader()).prefix(o.getPrefix()).suffix(o.getSuffix());

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
    public ExtendHttpRequestHeaderValueRule(String header, String prefix, String suffix) {
        super();
        this.header = header;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    /**
     * A header name that conforms to RFC 7230.
     * <p>
     * Example: {@code example_header_name}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("header")
    String header;

    /**
     * A string to prepend to the header value. The resulting header value must conform to RFC 7230.
     * With the following exceptions:
     * *  value cannot contain {@code $}
     * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
     * <p>
     * Example: {@code example_prefix_value}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    String prefix;

    /**
     * A string to append to the header value. The resulting header value must conform to RFC 7230.
     * With the following exceptions:
     * *  value cannot contain {@code $}
     * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
     * <p>
     * Example: {@code example_suffix_value}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suffix")
    String suffix;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
