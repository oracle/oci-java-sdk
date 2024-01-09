/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of adding a header to a response. This rule applies only to
 * HTTP listeners.
 *
 * <p>*NOTES:**
 *
 * <p>If a matching header already exists in the response, the system removes all of its
 * occurrences, and then adds the new header.
 *
 * <p>The system does not distinquish between underscore and dash characters in headers. That is, it
 * treats {@code example_header_name} and {@code example-header-name} as identical. Oracle
 * recommends that you do not rely on underscore or dash characters to uniquely distinguish header
 * names. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddHttpResponseHeaderRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "action")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddHttpResponseHeaderRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A header name that conforms to RFC 7230.
         *
         * <p>Example: {@code example_header_name}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("header")
        private String header;

        /**
         * A header name that conforms to RFC 7230.
         *
         * <p>Example: {@code example_header_name}
         *
         * @param header the value to set
         * @return this builder
         */
        public Builder header(String header) {
            this.header = header;
            this.__explicitlySet__.add("header");
            return this;
        }
        /**
         * A header value that conforms to RFC 7230. With the following exceptions: * value cannot
         * contain {@code $} * value cannot contain patterns like {@code {variable_name}}. They are
         * reserved for future extensions. Currently, such values are invalid.
         *
         * <p>Example: {@code example_value}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * A header value that conforms to RFC 7230. With the following exceptions: * value cannot
         * contain {@code $} * value cannot contain patterns like {@code {variable_name}}. They are
         * reserved for future extensions. Currently, such values are invalid.
         *
         * <p>Example: {@code example_value}
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddHttpResponseHeaderRule build() {
            AddHttpResponseHeaderRule model =
                    new AddHttpResponseHeaderRule(this.header, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddHttpResponseHeaderRule model) {
            if (model.wasPropertyExplicitlySet("header")) {
                this.header(model.getHeader());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
    public AddHttpResponseHeaderRule(String header, String value) {
        super();
        this.header = header;
        this.value = value;
    }

    /**
     * A header name that conforms to RFC 7230.
     *
     * <p>Example: {@code example_header_name}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("header")
    private final String header;

    /**
     * A header name that conforms to RFC 7230.
     *
     * <p>Example: {@code example_header_name}
     *
     * @return the value
     */
    public String getHeader() {
        return header;
    }

    /**
     * A header value that conforms to RFC 7230. With the following exceptions: * value cannot
     * contain {@code $} * value cannot contain patterns like {@code {variable_name}}. They are
     * reserved for future extensions. Currently, such values are invalid.
     *
     * <p>Example: {@code example_value}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * A header value that conforms to RFC 7230. With the following exceptions: * value cannot
     * contain {@code $} * value cannot contain patterns like {@code {variable_name}}. They are
     * reserved for future extensions. Currently, such values are invalid.
     *
     * <p>Example: {@code example_value}
     *
     * @return the value
     */
    public String getValue() {
        return value;
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
        sb.append("AddHttpResponseHeaderRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", header=").append(String.valueOf(this.header));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddHttpResponseHeaderRule)) {
            return false;
        }

        AddHttpResponseHeaderRule other = (AddHttpResponseHeaderRule) o;
        return java.util.Objects.equals(this.header, other.header)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.header == null ? 43 : this.header.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
