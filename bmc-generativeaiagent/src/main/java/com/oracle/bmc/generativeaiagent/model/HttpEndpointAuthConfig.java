/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Authentication configuration used for HTTP Endpoint tools. Defines the type of authentication and
 * the source of credentials. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HttpEndpointAuthConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpEndpointAuthConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"httpEndpointAuthSources"})
    public HttpEndpointAuthConfig(java.util.List<HttpEndpointAuthSource> httpEndpointAuthSources) {
        super();
        this.httpEndpointAuthSources = httpEndpointAuthSources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of credential sources from which authentication credentials can be resolved. Only
         * AGENT is supported for HTTP Endpoint Tool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("httpEndpointAuthSources")
        private java.util.List<HttpEndpointAuthSource> httpEndpointAuthSources;

        /**
         * A list of credential sources from which authentication credentials can be resolved. Only
         * AGENT is supported for HTTP Endpoint Tool.
         *
         * @param httpEndpointAuthSources the value to set
         * @return this builder
         */
        public Builder httpEndpointAuthSources(
                java.util.List<HttpEndpointAuthSource> httpEndpointAuthSources) {
            this.httpEndpointAuthSources = httpEndpointAuthSources;
            this.__explicitlySet__.add("httpEndpointAuthSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpEndpointAuthConfig build() {
            HttpEndpointAuthConfig model = new HttpEndpointAuthConfig(this.httpEndpointAuthSources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpEndpointAuthConfig model) {
            if (model.wasPropertyExplicitlySet("httpEndpointAuthSources")) {
                this.httpEndpointAuthSources(model.getHttpEndpointAuthSources());
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
     * A list of credential sources from which authentication credentials can be resolved. Only
     * AGENT is supported for HTTP Endpoint Tool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpEndpointAuthSources")
    private final java.util.List<HttpEndpointAuthSource> httpEndpointAuthSources;

    /**
     * A list of credential sources from which authentication credentials can be resolved. Only
     * AGENT is supported for HTTP Endpoint Tool.
     *
     * @return the value
     */
    public java.util.List<HttpEndpointAuthSource> getHttpEndpointAuthSources() {
        return httpEndpointAuthSources;
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
        sb.append("HttpEndpointAuthConfig(");
        sb.append("super=").append(super.toString());
        sb.append("httpEndpointAuthSources=").append(String.valueOf(this.httpEndpointAuthSources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpEndpointAuthConfig)) {
            return false;
        }

        HttpEndpointAuthConfig other = (HttpEndpointAuthConfig) o;
        return java.util.Objects.equals(this.httpEndpointAuthSources, other.httpEndpointAuthSources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.httpEndpointAuthSources == null
                                ? 43
                                : this.httpEndpointAuthSources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
