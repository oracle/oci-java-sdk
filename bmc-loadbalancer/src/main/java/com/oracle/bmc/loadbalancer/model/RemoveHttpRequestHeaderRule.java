/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of removing a header from a request. This rule applies only to HTTP listeners.
 * If the same header appears more than once in the request, the load balancer removes all occurances of the specified header.
 * **Note:** The system does not distinquish between underscore and dash characters in headers. That is, it treats
 * {@code example_header_name} and {@code example-header-name} as identical. Oracle recommends that you do not rely on underscore
 * or dash characters to uniquely distinguish header names.
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
    builder = RemoveHttpRequestHeaderRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RemoveHttpRequestHeaderRule extends Rule {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveHttpRequestHeaderRule build() {
            RemoveHttpRequestHeaderRule model = new RemoveHttpRequestHeaderRule(this.header);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveHttpRequestHeaderRule model) {
            if (model.wasPropertyExplicitlySet("header")) {
                this.header(model.getHeader());
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
    public RemoveHttpRequestHeaderRule(String header) {
        super();
        this.header = header;
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
        sb.append("RemoveHttpRequestHeaderRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", header=").append(String.valueOf(this.header));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveHttpRequestHeaderRule)) {
            return false;
        }

        RemoveHttpRequestHeaderRule other = (RemoveHttpRequestHeaderRule) o;
        return java.util.Objects.equals(this.header, other.header) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.header == null ? 43 : this.header.hashCode());
        return result;
    }
}
