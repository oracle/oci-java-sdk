/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the advance http header options that allow the setting of http header
 * size and allow/disallow invalid characters in the http headers. For example
 * httpLargeHeaderSizeInKB=32, the http header could have 4 buffers of 32KBs each This rule applies
 * only to HTTP listeners. No more than one {@code HttpHeaderRule} object can be present in a given
 * listener. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HttpHeaderRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "action")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpHeaderRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether or not invalid characters in client header fields will be allowed.
         * Valid names are composed of English letters, digits, hyphens and underscores. If "true",
         * invalid characters are allowed in the HTTP header. If "false", invalid characters are not
         * allowed in the HTTP header
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areInvalidCharactersAllowed")
        private Boolean areInvalidCharactersAllowed;

        /**
         * Indicates whether or not invalid characters in client header fields will be allowed.
         * Valid names are composed of English letters, digits, hyphens and underscores. If "true",
         * invalid characters are allowed in the HTTP header. If "false", invalid characters are not
         * allowed in the HTTP header
         *
         * @param areInvalidCharactersAllowed the value to set
         * @return this builder
         */
        public Builder areInvalidCharactersAllowed(Boolean areInvalidCharactersAllowed) {
            this.areInvalidCharactersAllowed = areInvalidCharactersAllowed;
            this.__explicitlySet__.add("areInvalidCharactersAllowed");
            return this;
        }
        /**
         * The maximum size of each buffer used for reading http client request header. This value
         * indicates the maximum size allowed for each buffer. The allowed values for buffer size
         * are 8, 16, 32 and 64.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("httpLargeHeaderSizeInKB")
        private Integer httpLargeHeaderSizeInKB;

        /**
         * The maximum size of each buffer used for reading http client request header. This value
         * indicates the maximum size allowed for each buffer. The allowed values for buffer size
         * are 8, 16, 32 and 64.
         *
         * @param httpLargeHeaderSizeInKB the value to set
         * @return this builder
         */
        public Builder httpLargeHeaderSizeInKB(Integer httpLargeHeaderSizeInKB) {
            this.httpLargeHeaderSizeInKB = httpLargeHeaderSizeInKB;
            this.__explicitlySet__.add("httpLargeHeaderSizeInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpHeaderRule build() {
            HttpHeaderRule model =
                    new HttpHeaderRule(
                            this.areInvalidCharactersAllowed, this.httpLargeHeaderSizeInKB);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpHeaderRule model) {
            if (model.wasPropertyExplicitlySet("areInvalidCharactersAllowed")) {
                this.areInvalidCharactersAllowed(model.getAreInvalidCharactersAllowed());
            }
            if (model.wasPropertyExplicitlySet("httpLargeHeaderSizeInKB")) {
                this.httpLargeHeaderSizeInKB(model.getHttpLargeHeaderSizeInKB());
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
    public HttpHeaderRule(Boolean areInvalidCharactersAllowed, Integer httpLargeHeaderSizeInKB) {
        super();
        this.areInvalidCharactersAllowed = areInvalidCharactersAllowed;
        this.httpLargeHeaderSizeInKB = httpLargeHeaderSizeInKB;
    }

    /**
     * Indicates whether or not invalid characters in client header fields will be allowed. Valid
     * names are composed of English letters, digits, hyphens and underscores. If "true", invalid
     * characters are allowed in the HTTP header. If "false", invalid characters are not allowed in
     * the HTTP header
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areInvalidCharactersAllowed")
    private final Boolean areInvalidCharactersAllowed;

    /**
     * Indicates whether or not invalid characters in client header fields will be allowed. Valid
     * names are composed of English letters, digits, hyphens and underscores. If "true", invalid
     * characters are allowed in the HTTP header. If "false", invalid characters are not allowed in
     * the HTTP header
     *
     * @return the value
     */
    public Boolean getAreInvalidCharactersAllowed() {
        return areInvalidCharactersAllowed;
    }

    /**
     * The maximum size of each buffer used for reading http client request header. This value
     * indicates the maximum size allowed for each buffer. The allowed values for buffer size are 8,
     * 16, 32 and 64.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpLargeHeaderSizeInKB")
    private final Integer httpLargeHeaderSizeInKB;

    /**
     * The maximum size of each buffer used for reading http client request header. This value
     * indicates the maximum size allowed for each buffer. The allowed values for buffer size are 8,
     * 16, 32 and 64.
     *
     * @return the value
     */
    public Integer getHttpLargeHeaderSizeInKB() {
        return httpLargeHeaderSizeInKB;
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
        sb.append("HttpHeaderRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", areInvalidCharactersAllowed=")
                .append(String.valueOf(this.areInvalidCharactersAllowed));
        sb.append(", httpLargeHeaderSizeInKB=")
                .append(String.valueOf(this.httpLargeHeaderSizeInKB));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpHeaderRule)) {
            return false;
        }

        HttpHeaderRule other = (HttpHeaderRule) o;
        return java.util.Objects.equals(
                        this.areInvalidCharactersAllowed, other.areInvalidCharactersAllowed)
                && java.util.Objects.equals(
                        this.httpLargeHeaderSizeInKB, other.httpLargeHeaderSizeInKB)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.areInvalidCharactersAllowed == null
                                ? 43
                                : this.areInvalidCharactersAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.httpLargeHeaderSizeInKB == null
                                ? 43
                                : this.httpLargeHeaderSizeInKB.hashCode());
        return result;
    }
}
