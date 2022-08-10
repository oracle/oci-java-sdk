/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of modifying a response header value. This rule applies only to HTTP listeners.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExtendHttpResponseHeaderValueRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtendHttpResponseHeaderValueRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A header name that conforms to RFC 7230.
         * <p>
         * Example: {@code example_header_name}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("header")
        private String header;

        /**
         * A header name that conforms to RFC 7230.
         * <p>
         * Example: {@code example_header_name}
         *
         * @param header the value to set
         * @return this builder
         **/
        public Builder header(String header) {
            this.header = header;
            this.__explicitlySet__.add("header");
            return this;
        }
        /**
         * A string to prepend to the header value. The resulting header value must still conform to RFC 7230.
         * With the following exceptions:
         * *  value cannot contain {@code $}
         * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
         * <p>
         * Example: {@code example_prefix_value}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * A string to prepend to the header value. The resulting header value must still conform to RFC 7230.
         * With the following exceptions:
         * *  value cannot contain {@code $}
         * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
         * <p>
         * Example: {@code example_prefix_value}
         *
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * A string to append to the header value. The resulting header value must still conform to RFC 7230.
         * With the following exceptions:
         * *  value cannot contain {@code $}
         * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
         * <p>
         * Example: {@code example_suffix_value}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("suffix")
        private String suffix;

        /**
         * A string to append to the header value. The resulting header value must still conform to RFC 7230.
         * With the following exceptions:
         * *  value cannot contain {@code $}
         * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
         * <p>
         * Example: {@code example_suffix_value}
         *
         * @param suffix the value to set
         * @return this builder
         **/
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            this.__explicitlySet__.add("suffix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtendHttpResponseHeaderValueRule build() {
            ExtendHttpResponseHeaderValueRule model =
                    new ExtendHttpResponseHeaderValueRule(this.header, this.prefix, this.suffix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtendHttpResponseHeaderValueRule model) {
            if (model.wasPropertyExplicitlySet("header")) {
                this.header(model.getHeader());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("suffix")) {
                this.suffix(model.getSuffix());
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

    @Deprecated
    public ExtendHttpResponseHeaderValueRule(String header, String prefix, String suffix) {
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
    private final String header;

    /**
     * A header name that conforms to RFC 7230.
     * <p>
     * Example: {@code example_header_name}
     *
     * @return the value
     **/
    public String getHeader() {
        return header;
    }

    /**
     * A string to prepend to the header value. The resulting header value must still conform to RFC 7230.
     * With the following exceptions:
     * *  value cannot contain {@code $}
     * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
     * <p>
     * Example: {@code example_prefix_value}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * A string to prepend to the header value. The resulting header value must still conform to RFC 7230.
     * With the following exceptions:
     * *  value cannot contain {@code $}
     * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
     * <p>
     * Example: {@code example_prefix_value}
     *
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    /**
     * A string to append to the header value. The resulting header value must still conform to RFC 7230.
     * With the following exceptions:
     * *  value cannot contain {@code $}
     * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
     * <p>
     * Example: {@code example_suffix_value}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suffix")
    private final String suffix;

    /**
     * A string to append to the header value. The resulting header value must still conform to RFC 7230.
     * With the following exceptions:
     * *  value cannot contain {@code $}
     * *  value cannot contain patterns like {@code {variable_name}}. They are reserved for future extensions. Currently, such values are invalid.
     * <p>
     * Example: {@code example_suffix_value}
     *
     * @return the value
     **/
    public String getSuffix() {
        return suffix;
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
        sb.append("ExtendHttpResponseHeaderValueRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", header=").append(String.valueOf(this.header));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", suffix=").append(String.valueOf(this.suffix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtendHttpResponseHeaderValueRule)) {
            return false;
        }

        ExtendHttpResponseHeaderValueRule other = (ExtendHttpResponseHeaderValueRule) o;
        return java.util.Objects.equals(this.header, other.header)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.suffix, other.suffix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.header == null ? 43 : this.header.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.suffix == null ? 43 : this.suffix.hashCode());
        return result;
    }
}
