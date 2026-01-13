/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Settings for protection capabilities <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProtectionCapabilitySettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProtectionCapabilitySettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maxNumberOfArguments",
        "maxSingleArgumentLength",
        "maxTotalArgumentLength",
        "maxHttpRequestHeaders",
        "maxHttpRequestHeaderLength",
        "allowedHttpMethods"
    })
    public ProtectionCapabilitySettings(
            Integer maxNumberOfArguments,
            Integer maxSingleArgumentLength,
            Integer maxTotalArgumentLength,
            Integer maxHttpRequestHeaders,
            Integer maxHttpRequestHeaderLength,
            java.util.List<String> allowedHttpMethods) {
        super();
        this.maxNumberOfArguments = maxNumberOfArguments;
        this.maxSingleArgumentLength = maxSingleArgumentLength;
        this.maxTotalArgumentLength = maxTotalArgumentLength;
        this.maxHttpRequestHeaders = maxHttpRequestHeaders;
        this.maxHttpRequestHeaderLength = maxHttpRequestHeaderLength;
        this.allowedHttpMethods = allowedHttpMethods;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Maximum number of arguments allowed. Used in protection capability 920380: Number of
         * Arguments Limits.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxNumberOfArguments")
        private Integer maxNumberOfArguments;

        /**
         * Maximum number of arguments allowed. Used in protection capability 920380: Number of
         * Arguments Limits.
         *
         * @param maxNumberOfArguments the value to set
         * @return this builder
         */
        public Builder maxNumberOfArguments(Integer maxNumberOfArguments) {
            this.maxNumberOfArguments = maxNumberOfArguments;
            this.__explicitlySet__.add("maxNumberOfArguments");
            return this;
        }
        /**
         * Maximum allowed length of a single argument. Used in protection capability 920370: Limit
         * argument value length.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSingleArgumentLength")
        private Integer maxSingleArgumentLength;

        /**
         * Maximum allowed length of a single argument. Used in protection capability 920370: Limit
         * argument value length.
         *
         * @param maxSingleArgumentLength the value to set
         * @return this builder
         */
        public Builder maxSingleArgumentLength(Integer maxSingleArgumentLength) {
            this.maxSingleArgumentLength = maxSingleArgumentLength;
            this.__explicitlySet__.add("maxSingleArgumentLength");
            return this;
        }
        /**
         * Maximum allowed total length of all arguments. Used in protection capability 920390:
         * Limit arguments total length.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalArgumentLength")
        private Integer maxTotalArgumentLength;

        /**
         * Maximum allowed total length of all arguments. Used in protection capability 920390:
         * Limit arguments total length.
         *
         * @param maxTotalArgumentLength the value to set
         * @return this builder
         */
        public Builder maxTotalArgumentLength(Integer maxTotalArgumentLength) {
            this.maxTotalArgumentLength = maxTotalArgumentLength;
            this.__explicitlySet__.add("maxTotalArgumentLength");
            return this;
        }
        /**
         * Maximum number of headers allowed in an HTTP request. Used in protection capability
         * 9200014: Limit Number of Request Headers.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxHttpRequestHeaders")
        private Integer maxHttpRequestHeaders;

        /**
         * Maximum number of headers allowed in an HTTP request. Used in protection capability
         * 9200014: Limit Number of Request Headers.
         *
         * @param maxHttpRequestHeaders the value to set
         * @return this builder
         */
        public Builder maxHttpRequestHeaders(Integer maxHttpRequestHeaders) {
            this.maxHttpRequestHeaders = maxHttpRequestHeaders;
            this.__explicitlySet__.add("maxHttpRequestHeaders");
            return this;
        }
        /**
         * Maximum allowed length of headers in an HTTP request. Used in protection capability:
         * 9200024: Limit length of request header size.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxHttpRequestHeaderLength")
        private Integer maxHttpRequestHeaderLength;

        /**
         * Maximum allowed length of headers in an HTTP request. Used in protection capability:
         * 9200024: Limit length of request header size.
         *
         * @param maxHttpRequestHeaderLength the value to set
         * @return this builder
         */
        public Builder maxHttpRequestHeaderLength(Integer maxHttpRequestHeaderLength) {
            this.maxHttpRequestHeaderLength = maxHttpRequestHeaderLength;
            this.__explicitlySet__.add("maxHttpRequestHeaderLength");
            return this;
        }
        /**
         * List of allowed HTTP methods. Each value as a RFC7230 formated token string. Used in
         * protection capability 911100: Restrict HTTP Request Methods.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedHttpMethods")
        private java.util.List<String> allowedHttpMethods;

        /**
         * List of allowed HTTP methods. Each value as a RFC7230 formated token string. Used in
         * protection capability 911100: Restrict HTTP Request Methods.
         *
         * @param allowedHttpMethods the value to set
         * @return this builder
         */
        public Builder allowedHttpMethods(java.util.List<String> allowedHttpMethods) {
            this.allowedHttpMethods = allowedHttpMethods;
            this.__explicitlySet__.add("allowedHttpMethods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionCapabilitySettings build() {
            ProtectionCapabilitySettings model =
                    new ProtectionCapabilitySettings(
                            this.maxNumberOfArguments,
                            this.maxSingleArgumentLength,
                            this.maxTotalArgumentLength,
                            this.maxHttpRequestHeaders,
                            this.maxHttpRequestHeaderLength,
                            this.allowedHttpMethods);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionCapabilitySettings model) {
            if (model.wasPropertyExplicitlySet("maxNumberOfArguments")) {
                this.maxNumberOfArguments(model.getMaxNumberOfArguments());
            }
            if (model.wasPropertyExplicitlySet("maxSingleArgumentLength")) {
                this.maxSingleArgumentLength(model.getMaxSingleArgumentLength());
            }
            if (model.wasPropertyExplicitlySet("maxTotalArgumentLength")) {
                this.maxTotalArgumentLength(model.getMaxTotalArgumentLength());
            }
            if (model.wasPropertyExplicitlySet("maxHttpRequestHeaders")) {
                this.maxHttpRequestHeaders(model.getMaxHttpRequestHeaders());
            }
            if (model.wasPropertyExplicitlySet("maxHttpRequestHeaderLength")) {
                this.maxHttpRequestHeaderLength(model.getMaxHttpRequestHeaderLength());
            }
            if (model.wasPropertyExplicitlySet("allowedHttpMethods")) {
                this.allowedHttpMethods(model.getAllowedHttpMethods());
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
     * Maximum number of arguments allowed. Used in protection capability 920380: Number of
     * Arguments Limits.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxNumberOfArguments")
    private final Integer maxNumberOfArguments;

    /**
     * Maximum number of arguments allowed. Used in protection capability 920380: Number of
     * Arguments Limits.
     *
     * @return the value
     */
    public Integer getMaxNumberOfArguments() {
        return maxNumberOfArguments;
    }

    /**
     * Maximum allowed length of a single argument. Used in protection capability 920370: Limit
     * argument value length.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSingleArgumentLength")
    private final Integer maxSingleArgumentLength;

    /**
     * Maximum allowed length of a single argument. Used in protection capability 920370: Limit
     * argument value length.
     *
     * @return the value
     */
    public Integer getMaxSingleArgumentLength() {
        return maxSingleArgumentLength;
    }

    /**
     * Maximum allowed total length of all arguments. Used in protection capability 920390: Limit
     * arguments total length.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalArgumentLength")
    private final Integer maxTotalArgumentLength;

    /**
     * Maximum allowed total length of all arguments. Used in protection capability 920390: Limit
     * arguments total length.
     *
     * @return the value
     */
    public Integer getMaxTotalArgumentLength() {
        return maxTotalArgumentLength;
    }

    /**
     * Maximum number of headers allowed in an HTTP request. Used in protection capability 9200014:
     * Limit Number of Request Headers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxHttpRequestHeaders")
    private final Integer maxHttpRequestHeaders;

    /**
     * Maximum number of headers allowed in an HTTP request. Used in protection capability 9200014:
     * Limit Number of Request Headers.
     *
     * @return the value
     */
    public Integer getMaxHttpRequestHeaders() {
        return maxHttpRequestHeaders;
    }

    /**
     * Maximum allowed length of headers in an HTTP request. Used in protection capability: 9200024:
     * Limit length of request header size.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxHttpRequestHeaderLength")
    private final Integer maxHttpRequestHeaderLength;

    /**
     * Maximum allowed length of headers in an HTTP request. Used in protection capability: 9200024:
     * Limit length of request header size.
     *
     * @return the value
     */
    public Integer getMaxHttpRequestHeaderLength() {
        return maxHttpRequestHeaderLength;
    }

    /**
     * List of allowed HTTP methods. Each value as a RFC7230 formated token string. Used in
     * protection capability 911100: Restrict HTTP Request Methods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedHttpMethods")
    private final java.util.List<String> allowedHttpMethods;

    /**
     * List of allowed HTTP methods. Each value as a RFC7230 formated token string. Used in
     * protection capability 911100: Restrict HTTP Request Methods.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedHttpMethods() {
        return allowedHttpMethods;
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
        sb.append("ProtectionCapabilitySettings(");
        sb.append("super=").append(super.toString());
        sb.append("maxNumberOfArguments=").append(String.valueOf(this.maxNumberOfArguments));
        sb.append(", maxSingleArgumentLength=")
                .append(String.valueOf(this.maxSingleArgumentLength));
        sb.append(", maxTotalArgumentLength=").append(String.valueOf(this.maxTotalArgumentLength));
        sb.append(", maxHttpRequestHeaders=").append(String.valueOf(this.maxHttpRequestHeaders));
        sb.append(", maxHttpRequestHeaderLength=")
                .append(String.valueOf(this.maxHttpRequestHeaderLength));
        sb.append(", allowedHttpMethods=").append(String.valueOf(this.allowedHttpMethods));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionCapabilitySettings)) {
            return false;
        }

        ProtectionCapabilitySettings other = (ProtectionCapabilitySettings) o;
        return java.util.Objects.equals(this.maxNumberOfArguments, other.maxNumberOfArguments)
                && java.util.Objects.equals(
                        this.maxSingleArgumentLength, other.maxSingleArgumentLength)
                && java.util.Objects.equals(
                        this.maxTotalArgumentLength, other.maxTotalArgumentLength)
                && java.util.Objects.equals(this.maxHttpRequestHeaders, other.maxHttpRequestHeaders)
                && java.util.Objects.equals(
                        this.maxHttpRequestHeaderLength, other.maxHttpRequestHeaderLength)
                && java.util.Objects.equals(this.allowedHttpMethods, other.allowedHttpMethods)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maxNumberOfArguments == null
                                ? 43
                                : this.maxNumberOfArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSingleArgumentLength == null
                                ? 43
                                : this.maxSingleArgumentLength.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTotalArgumentLength == null
                                ? 43
                                : this.maxTotalArgumentLength.hashCode());
        result =
                (result * PRIME)
                        + (this.maxHttpRequestHeaders == null
                                ? 43
                                : this.maxHttpRequestHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.maxHttpRequestHeaderLength == null
                                ? 43
                                : this.maxHttpRequestHeaderLength.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedHttpMethods == null
                                ? 43
                                : this.allowedHttpMethods.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
