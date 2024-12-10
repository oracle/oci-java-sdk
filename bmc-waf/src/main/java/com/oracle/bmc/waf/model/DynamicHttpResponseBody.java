/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Allows returning dynamically generated HTTP response body based on the provided template.
 * The template allows variable interpolation by specifying variable name between the '${' and '}' delimiters.
 * Escape sequences using '\\' are supported to allow usage of '\\\\' and '\\${' in the template to return '\\' and '\\${' in final response.
 * <p>
 * The following variables are supported:
 * <p>
 * http.request.id - the HTTP request ID. For example: "d5fa953f75ef417e4c8008ef9336d779".
 * <p>
 * Example:
 * {
 *   "type": "DYNAMIC",
 *   "template": "{\
 *   \\"code\\": 403,\
 *   \\"message\\":\\"Unauthorised\\",\
 *   \\"incidentId\\": \\"${http.request.id}\\"\
 * }"
 * }
 * <p>
 * Example with escape sequence:
 * {
 *   "type": "DYNAMIC",
 *   "template": "\\\\${Returned as plain text}"
 * }
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DynamicHttpResponseBody.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DynamicHttpResponseBody extends HttpResponseBody {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Dynamic response body
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private String template;

        /**
         * Dynamic response body
         * @param template the value to set
         * @return this builder
         **/
        public Builder template(String template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DynamicHttpResponseBody build() {
            DynamicHttpResponseBody model = new DynamicHttpResponseBody(this.template);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DynamicHttpResponseBody model) {
            if (model.wasPropertyExplicitlySet("template")) {
                this.template(model.getTemplate());
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
    public DynamicHttpResponseBody(String template) {
        super();
        this.template = template;
    }

    /**
     * Dynamic response body
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    private final String template;

    /**
     * Dynamic response body
     * @return the value
     **/
    public String getTemplate() {
        return template;
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
        sb.append("DynamicHttpResponseBody(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", template=").append(String.valueOf(this.template));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DynamicHttpResponseBody)) {
            return false;
        }

        DynamicHttpResponseBody other = (DynamicHttpResponseBody) o;
        return java.util.Objects.equals(this.template, other.template) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.template == null ? 43 : this.template.hashCode());
        return result;
    }
}
