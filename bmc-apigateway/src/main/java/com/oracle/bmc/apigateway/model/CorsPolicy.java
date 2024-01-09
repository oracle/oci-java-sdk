/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Enable CORS (Cross-Origin-Resource-Sharing) request handling. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CorsPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CorsPolicy extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "allowedOrigins",
        "allowedMethods",
        "allowedHeaders",
        "exposedHeaders",
        "isAllowCredentialsEnabled",
        "maxAgeInSeconds"
    })
    public CorsPolicy(
            java.util.List<String> allowedOrigins,
            java.util.List<String> allowedMethods,
            java.util.List<String> allowedHeaders,
            java.util.List<String> exposedHeaders,
            Boolean isAllowCredentialsEnabled,
            Integer maxAgeInSeconds) {
        super();
        this.allowedOrigins = allowedOrigins;
        this.allowedMethods = allowedMethods;
        this.allowedHeaders = allowedHeaders;
        this.exposedHeaders = exposedHeaders;
        this.isAllowCredentialsEnabled = isAllowCredentialsEnabled;
        this.maxAgeInSeconds = maxAgeInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of allowed origins that the CORS handler will use to respond to CORS requests.
         * The gateway will send the Access-Control-Allow-Origin header with the best origin match
         * for the circumstances. '*' will match any origins, and 'null' will match queries from
         * 'file:' origins. All other origins must be qualified with the scheme, full hostname, and
         * port if necessary.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedOrigins")
        private java.util.List<String> allowedOrigins;

        /**
         * The list of allowed origins that the CORS handler will use to respond to CORS requests.
         * The gateway will send the Access-Control-Allow-Origin header with the best origin match
         * for the circumstances. '*' will match any origins, and 'null' will match queries from
         * 'file:' origins. All other origins must be qualified with the scheme, full hostname, and
         * port if necessary.
         *
         * @param allowedOrigins the value to set
         * @return this builder
         */
        public Builder allowedOrigins(java.util.List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            this.__explicitlySet__.add("allowedOrigins");
            return this;
        }
        /**
         * The list of allowed HTTP methods that will be returned for the preflight OPTIONS request
         * in the Access-Control-Allow-Methods header. '*' will allow all methods.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedMethods")
        private java.util.List<String> allowedMethods;

        /**
         * The list of allowed HTTP methods that will be returned for the preflight OPTIONS request
         * in the Access-Control-Allow-Methods header. '*' will allow all methods.
         *
         * @param allowedMethods the value to set
         * @return this builder
         */
        public Builder allowedMethods(java.util.List<String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            this.__explicitlySet__.add("allowedMethods");
            return this;
        }
        /**
         * The list of headers that will be allowed from the client via the
         * Access-Control-Allow-Headers header. '*' will allow all headers.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedHeaders")
        private java.util.List<String> allowedHeaders;

        /**
         * The list of headers that will be allowed from the client via the
         * Access-Control-Allow-Headers header. '*' will allow all headers.
         *
         * @param allowedHeaders the value to set
         * @return this builder
         */
        public Builder allowedHeaders(java.util.List<String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            this.__explicitlySet__.add("allowedHeaders");
            return this;
        }
        /**
         * The list of headers that the client will be allowed to see from the response as indicated
         * by the Access-Control-Expose-Headers header. '*' will expose all headers.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exposedHeaders")
        private java.util.List<String> exposedHeaders;

        /**
         * The list of headers that the client will be allowed to see from the response as indicated
         * by the Access-Control-Expose-Headers header. '*' will expose all headers.
         *
         * @param exposedHeaders the value to set
         * @return this builder
         */
        public Builder exposedHeaders(java.util.List<String> exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            this.__explicitlySet__.add("exposedHeaders");
            return this;
        }
        /**
         * Whether to send the Access-Control-Allow-Credentials header to allow CORS requests with
         * cookies.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAllowCredentialsEnabled")
        private Boolean isAllowCredentialsEnabled;

        /**
         * Whether to send the Access-Control-Allow-Credentials header to allow CORS requests with
         * cookies.
         *
         * @param isAllowCredentialsEnabled the value to set
         * @return this builder
         */
        public Builder isAllowCredentialsEnabled(Boolean isAllowCredentialsEnabled) {
            this.isAllowCredentialsEnabled = isAllowCredentialsEnabled;
            this.__explicitlySet__.add("isAllowCredentialsEnabled");
            return this;
        }
        /**
         * The time in seconds for the client to cache preflight responses. This is sent as the
         * Access-Control-Max-Age if greater than 0.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAgeInSeconds")
        private Integer maxAgeInSeconds;

        /**
         * The time in seconds for the client to cache preflight responses. This is sent as the
         * Access-Control-Max-Age if greater than 0.
         *
         * @param maxAgeInSeconds the value to set
         * @return this builder
         */
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = maxAgeInSeconds;
            this.__explicitlySet__.add("maxAgeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CorsPolicy build() {
            CorsPolicy model =
                    new CorsPolicy(
                            this.allowedOrigins,
                            this.allowedMethods,
                            this.allowedHeaders,
                            this.exposedHeaders,
                            this.isAllowCredentialsEnabled,
                            this.maxAgeInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CorsPolicy model) {
            if (model.wasPropertyExplicitlySet("allowedOrigins")) {
                this.allowedOrigins(model.getAllowedOrigins());
            }
            if (model.wasPropertyExplicitlySet("allowedMethods")) {
                this.allowedMethods(model.getAllowedMethods());
            }
            if (model.wasPropertyExplicitlySet("allowedHeaders")) {
                this.allowedHeaders(model.getAllowedHeaders());
            }
            if (model.wasPropertyExplicitlySet("exposedHeaders")) {
                this.exposedHeaders(model.getExposedHeaders());
            }
            if (model.wasPropertyExplicitlySet("isAllowCredentialsEnabled")) {
                this.isAllowCredentialsEnabled(model.getIsAllowCredentialsEnabled());
            }
            if (model.wasPropertyExplicitlySet("maxAgeInSeconds")) {
                this.maxAgeInSeconds(model.getMaxAgeInSeconds());
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
     * The list of allowed origins that the CORS handler will use to respond to CORS requests. The
     * gateway will send the Access-Control-Allow-Origin header with the best origin match for the
     * circumstances. '*' will match any origins, and 'null' will match queries from 'file:'
     * origins. All other origins must be qualified with the scheme, full hostname, and port if
     * necessary.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedOrigins")
    private final java.util.List<String> allowedOrigins;

    /**
     * The list of allowed origins that the CORS handler will use to respond to CORS requests. The
     * gateway will send the Access-Control-Allow-Origin header with the best origin match for the
     * circumstances. '*' will match any origins, and 'null' will match queries from 'file:'
     * origins. All other origins must be qualified with the scheme, full hostname, and port if
     * necessary.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * The list of allowed HTTP methods that will be returned for the preflight OPTIONS request in
     * the Access-Control-Allow-Methods header. '*' will allow all methods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedMethods")
    private final java.util.List<String> allowedMethods;

    /**
     * The list of allowed HTTP methods that will be returned for the preflight OPTIONS request in
     * the Access-Control-Allow-Methods header. '*' will allow all methods.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * The list of headers that will be allowed from the client via the Access-Control-Allow-Headers
     * header. '*' will allow all headers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedHeaders")
    private final java.util.List<String> allowedHeaders;

    /**
     * The list of headers that will be allowed from the client via the Access-Control-Allow-Headers
     * header. '*' will allow all headers.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedHeaders() {
        return allowedHeaders;
    }

    /**
     * The list of headers that the client will be allowed to see from the response as indicated by
     * the Access-Control-Expose-Headers header. '*' will expose all headers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposedHeaders")
    private final java.util.List<String> exposedHeaders;

    /**
     * The list of headers that the client will be allowed to see from the response as indicated by
     * the Access-Control-Expose-Headers header. '*' will expose all headers.
     *
     * @return the value
     */
    public java.util.List<String> getExposedHeaders() {
        return exposedHeaders;
    }

    /**
     * Whether to send the Access-Control-Allow-Credentials header to allow CORS requests with
     * cookies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowCredentialsEnabled")
    private final Boolean isAllowCredentialsEnabled;

    /**
     * Whether to send the Access-Control-Allow-Credentials header to allow CORS requests with
     * cookies.
     *
     * @return the value
     */
    public Boolean getIsAllowCredentialsEnabled() {
        return isAllowCredentialsEnabled;
    }

    /**
     * The time in seconds for the client to cache preflight responses. This is sent as the
     * Access-Control-Max-Age if greater than 0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAgeInSeconds")
    private final Integer maxAgeInSeconds;

    /**
     * The time in seconds for the client to cache preflight responses. This is sent as the
     * Access-Control-Max-Age if greater than 0.
     *
     * @return the value
     */
    public Integer getMaxAgeInSeconds() {
        return maxAgeInSeconds;
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
        sb.append("CorsPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("allowedOrigins=").append(String.valueOf(this.allowedOrigins));
        sb.append(", allowedMethods=").append(String.valueOf(this.allowedMethods));
        sb.append(", allowedHeaders=").append(String.valueOf(this.allowedHeaders));
        sb.append(", exposedHeaders=").append(String.valueOf(this.exposedHeaders));
        sb.append(", isAllowCredentialsEnabled=")
                .append(String.valueOf(this.isAllowCredentialsEnabled));
        sb.append(", maxAgeInSeconds=").append(String.valueOf(this.maxAgeInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CorsPolicy)) {
            return false;
        }

        CorsPolicy other = (CorsPolicy) o;
        return java.util.Objects.equals(this.allowedOrigins, other.allowedOrigins)
                && java.util.Objects.equals(this.allowedMethods, other.allowedMethods)
                && java.util.Objects.equals(this.allowedHeaders, other.allowedHeaders)
                && java.util.Objects.equals(this.exposedHeaders, other.exposedHeaders)
                && java.util.Objects.equals(
                        this.isAllowCredentialsEnabled, other.isAllowCredentialsEnabled)
                && java.util.Objects.equals(this.maxAgeInSeconds, other.maxAgeInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowedOrigins == null ? 43 : this.allowedOrigins.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedMethods == null ? 43 : this.allowedMethods.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedHeaders == null ? 43 : this.allowedHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.exposedHeaders == null ? 43 : this.exposedHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.isAllowCredentialsEnabled == null
                                ? 43
                                : this.isAllowCredentialsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAgeInSeconds == null ? 43 : this.maxAgeInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
