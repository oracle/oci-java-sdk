/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa.model;

/**
 * An object that specifies an HTTP response caching policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResponseCachingPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResponseCachingPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isResponseHeaderBasedCachingEnabled"})
    public ResponseCachingPolicy(Boolean isResponseHeaderBasedCachingEnabled) {
        super();
        this.isResponseHeaderBasedCachingEnabled = isResponseHeaderBasedCachingEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * When false, responses will not be cached by the backend based on response headers.
         *
         * <p>When true, responses that contain one of the supported cache control headers will be
         * cached according to the values specified in the cache control headers.
         *
         * <p>The "X-Accel-Expires" header field sets caching time of a response in seconds. The
         * zero value disables caching for a response. If the value starts with the @ prefix, it
         * sets an absolute time in seconds since Epoch, up to which the response may be cached.
         *
         * <p>If the header does not include the "X-Accel-Expires" field, parameters of caching may
         * be set in the header fields "Expires" or "Cache-Control".
         *
         * <p>If the header includes the "Set-Cookie" field, such a response will not be cached.
         *
         * <p>If the header includes the "Vary" field with the special value "*", such a response
         * will not be cached. If the header includes the "Vary" field with another value, such a
         * response will be cached taking into account the corresponding request header fields.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isResponseHeaderBasedCachingEnabled")
        private Boolean isResponseHeaderBasedCachingEnabled;

        /**
         * When false, responses will not be cached by the backend based on response headers.
         *
         * <p>When true, responses that contain one of the supported cache control headers will be
         * cached according to the values specified in the cache control headers.
         *
         * <p>The "X-Accel-Expires" header field sets caching time of a response in seconds. The
         * zero value disables caching for a response. If the value starts with the @ prefix, it
         * sets an absolute time in seconds since Epoch, up to which the response may be cached.
         *
         * <p>If the header does not include the "X-Accel-Expires" field, parameters of caching may
         * be set in the header fields "Expires" or "Cache-Control".
         *
         * <p>If the header includes the "Set-Cookie" field, such a response will not be cached.
         *
         * <p>If the header includes the "Vary" field with the special value "*", such a response
         * will not be cached. If the header includes the "Vary" field with another value, such a
         * response will be cached taking into account the corresponding request header fields.
         *
         * @param isResponseHeaderBasedCachingEnabled the value to set
         * @return this builder
         */
        public Builder isResponseHeaderBasedCachingEnabled(
                Boolean isResponseHeaderBasedCachingEnabled) {
            this.isResponseHeaderBasedCachingEnabled = isResponseHeaderBasedCachingEnabled;
            this.__explicitlySet__.add("isResponseHeaderBasedCachingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponseCachingPolicy build() {
            ResponseCachingPolicy model =
                    new ResponseCachingPolicy(this.isResponseHeaderBasedCachingEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponseCachingPolicy model) {
            if (model.wasPropertyExplicitlySet("isResponseHeaderBasedCachingEnabled")) {
                this.isResponseHeaderBasedCachingEnabled(
                        model.getIsResponseHeaderBasedCachingEnabled());
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

    /**
     * When false, responses will not be cached by the backend based on response headers.
     *
     * <p>When true, responses that contain one of the supported cache control headers will be
     * cached according to the values specified in the cache control headers.
     *
     * <p>The "X-Accel-Expires" header field sets caching time of a response in seconds. The zero
     * value disables caching for a response. If the value starts with the @ prefix, it sets an
     * absolute time in seconds since Epoch, up to which the response may be cached.
     *
     * <p>If the header does not include the "X-Accel-Expires" field, parameters of caching may be
     * set in the header fields "Expires" or "Cache-Control".
     *
     * <p>If the header includes the "Set-Cookie" field, such a response will not be cached.
     *
     * <p>If the header includes the "Vary" field with the special value "*", such a response will
     * not be cached. If the header includes the "Vary" field with another value, such a response
     * will be cached taking into account the corresponding request header fields.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isResponseHeaderBasedCachingEnabled")
    private final Boolean isResponseHeaderBasedCachingEnabled;

    /**
     * When false, responses will not be cached by the backend based on response headers.
     *
     * <p>When true, responses that contain one of the supported cache control headers will be
     * cached according to the values specified in the cache control headers.
     *
     * <p>The "X-Accel-Expires" header field sets caching time of a response in seconds. The zero
     * value disables caching for a response. If the value starts with the @ prefix, it sets an
     * absolute time in seconds since Epoch, up to which the response may be cached.
     *
     * <p>If the header does not include the "X-Accel-Expires" field, parameters of caching may be
     * set in the header fields "Expires" or "Cache-Control".
     *
     * <p>If the header includes the "Set-Cookie" field, such a response will not be cached.
     *
     * <p>If the header includes the "Vary" field with the special value "*", such a response will
     * not be cached. If the header includes the "Vary" field with another value, such a response
     * will be cached taking into account the corresponding request header fields.
     *
     * @return the value
     */
    public Boolean getIsResponseHeaderBasedCachingEnabled() {
        return isResponseHeaderBasedCachingEnabled;
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
        sb.append("ResponseCachingPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("isResponseHeaderBasedCachingEnabled=")
                .append(String.valueOf(this.isResponseHeaderBasedCachingEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponseCachingPolicy)) {
            return false;
        }

        ResponseCachingPolicy other = (ResponseCachingPolicy) o;
        return java.util.Objects.equals(
                        this.isResponseHeaderBasedCachingEnabled,
                        other.isResponseHeaderBasedCachingEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isResponseHeaderBasedCachingEnabled == null
                                ? 43
                                : this.isResponseHeaderBasedCachingEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
