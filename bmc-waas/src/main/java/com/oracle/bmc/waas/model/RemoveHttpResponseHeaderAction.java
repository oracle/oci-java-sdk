/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * An object that represents the action of removing from a response all occurrences of header fields
 * with a specified name. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RemoveHttpResponseHeaderAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "action")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveHttpResponseHeaderAction extends HeaderManipulationAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A header field name that conforms to RFC 7230.
         *
         * <p>Example: {@code example_header_name}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("header")
        private String header;

        /**
         * A header field name that conforms to RFC 7230.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveHttpResponseHeaderAction build() {
            RemoveHttpResponseHeaderAction model = new RemoveHttpResponseHeaderAction(this.header);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveHttpResponseHeaderAction model) {
            if (model.wasPropertyExplicitlySet("header")) {
                this.header(model.getHeader());
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
    public RemoveHttpResponseHeaderAction(String header) {
        super();
        this.header = header;
    }

    /**
     * A header field name that conforms to RFC 7230.
     *
     * <p>Example: {@code example_header_name}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("header")
    private final String header;

    /**
     * A header field name that conforms to RFC 7230.
     *
     * <p>Example: {@code example_header_name}
     *
     * @return the value
     */
    public String getHeader() {
        return header;
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
        sb.append("RemoveHttpResponseHeaderAction(");
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
        if (!(o instanceof RemoveHttpResponseHeaderAction)) {
            return false;
        }

        RemoveHttpResponseHeaderAction other = (RemoveHttpResponseHeaderAction) o;
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
