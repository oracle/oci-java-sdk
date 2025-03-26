/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A detailed description of your web application's origin host server. An origin must be defined to set up WAF rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Origin.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Origin extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"uri", "httpPort", "httpsPort", "customHeaders"})
    public Origin(
            String uri, Integer httpPort, Integer httpsPort, java.util.List<Header> customHeaders) {
        super();
        this.uri = uri;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.customHeaders = customHeaders;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The URI of the origin. Does not support paths. Port numbers should be specified in the {@code httpPort} and {@code httpsPort} fields.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * The URI of the origin. Does not support paths. Port numbers should be specified in the {@code httpPort} and {@code httpsPort} fields.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * The HTTP port on the origin that the web application listens on. If unspecified, defaults to {@code 80}. If {@code 0} is specified - the origin is not used for HTTP traffic.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpPort")
        private Integer httpPort;

        /**
         * The HTTP port on the origin that the web application listens on. If unspecified, defaults to {@code 80}. If {@code 0} is specified - the origin is not used for HTTP traffic.
         * @param httpPort the value to set
         * @return this builder
         **/
        public Builder httpPort(Integer httpPort) {
            this.httpPort = httpPort;
            this.__explicitlySet__.add("httpPort");
            return this;
        }
        /**
         * The HTTPS port on the origin that the web application listens on. If unspecified, defaults to {@code 443}. If {@code 0} is specified - the origin is not used for HTTPS traffic.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpsPort")
        private Integer httpsPort;

        /**
         * The HTTPS port on the origin that the web application listens on. If unspecified, defaults to {@code 443}. If {@code 0} is specified - the origin is not used for HTTPS traffic.
         * @param httpsPort the value to set
         * @return this builder
         **/
        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = httpsPort;
            this.__explicitlySet__.add("httpsPort");
            return this;
        }
        /**
         * A list of HTTP headers to forward to your origin.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customHeaders")
        private java.util.List<Header> customHeaders;

        /**
         * A list of HTTP headers to forward to your origin.
         * @param customHeaders the value to set
         * @return this builder
         **/
        public Builder customHeaders(java.util.List<Header> customHeaders) {
            this.customHeaders = customHeaders;
            this.__explicitlySet__.add("customHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Origin build() {
            Origin model = new Origin(this.uri, this.httpPort, this.httpsPort, this.customHeaders);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Origin model) {
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("httpPort")) {
                this.httpPort(model.getHttpPort());
            }
            if (model.wasPropertyExplicitlySet("httpsPort")) {
                this.httpsPort(model.getHttpsPort());
            }
            if (model.wasPropertyExplicitlySet("customHeaders")) {
                this.customHeaders(model.getCustomHeaders());
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

    /**
     * The URI of the origin. Does not support paths. Port numbers should be specified in the {@code httpPort} and {@code httpsPort} fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * The URI of the origin. Does not support paths. Port numbers should be specified in the {@code httpPort} and {@code httpsPort} fields.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * The HTTP port on the origin that the web application listens on. If unspecified, defaults to {@code 80}. If {@code 0} is specified - the origin is not used for HTTP traffic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpPort")
    private final Integer httpPort;

    /**
     * The HTTP port on the origin that the web application listens on. If unspecified, defaults to {@code 80}. If {@code 0} is specified - the origin is not used for HTTP traffic.
     * @return the value
     **/
    public Integer getHttpPort() {
        return httpPort;
    }

    /**
     * The HTTPS port on the origin that the web application listens on. If unspecified, defaults to {@code 443}. If {@code 0} is specified - the origin is not used for HTTPS traffic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpsPort")
    private final Integer httpsPort;

    /**
     * The HTTPS port on the origin that the web application listens on. If unspecified, defaults to {@code 443}. If {@code 0} is specified - the origin is not used for HTTPS traffic.
     * @return the value
     **/
    public Integer getHttpsPort() {
        return httpsPort;
    }

    /**
     * A list of HTTP headers to forward to your origin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customHeaders")
    private final java.util.List<Header> customHeaders;

    /**
     * A list of HTTP headers to forward to your origin.
     * @return the value
     **/
    public java.util.List<Header> getCustomHeaders() {
        return customHeaders;
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
        sb.append("Origin(");
        sb.append("super=").append(super.toString());
        sb.append("uri=").append(String.valueOf(this.uri));
        sb.append(", httpPort=").append(String.valueOf(this.httpPort));
        sb.append(", httpsPort=").append(String.valueOf(this.httpsPort));
        sb.append(", customHeaders=").append(String.valueOf(this.customHeaders));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Origin)) {
            return false;
        }

        Origin other = (Origin) o;
        return java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.httpPort, other.httpPort)
                && java.util.Objects.equals(this.httpsPort, other.httpsPort)
                && java.util.Objects.equals(this.customHeaders, other.customHeaders)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.httpPort == null ? 43 : this.httpPort.hashCode());
        result = (result * PRIME) + (this.httpsPort == null ? 43 : this.httpsPort.hashCode());
        result =
                (result * PRIME)
                        + (this.customHeaders == null ? 43 : this.customHeaders.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
