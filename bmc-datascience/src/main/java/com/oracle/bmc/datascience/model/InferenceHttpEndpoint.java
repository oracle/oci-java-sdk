/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Represents a custom HTTP endpoint detail for inferencing.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InferenceHttpEndpoint.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InferenceHttpEndpoint
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"endpointUriSuffix", "httpMethods"})
    public InferenceHttpEndpoint(String endpointUriSuffix, java.util.List<HttpMethod> httpMethods) {
        super();
        this.endpointUriSuffix = endpointUriSuffix;
        this.httpMethods = httpMethods;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The suffix part of the endpoint that will be allowed for invocation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointUriSuffix")
        private String endpointUriSuffix;

        /**
         * The suffix part of the endpoint that will be allowed for invocation.
         *
         * @param endpointUriSuffix the value to set
         * @return this builder
         **/
        public Builder endpointUriSuffix(String endpointUriSuffix) {
            this.endpointUriSuffix = endpointUriSuffix;
            this.__explicitlySet__.add("endpointUriSuffix");
            return this;
        }
        /**
         * List of HTTP methods acceptable by the URI.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpMethods")
        private java.util.List<HttpMethod> httpMethods;

        /**
         * List of HTTP methods acceptable by the URI.
         *
         * @param httpMethods the value to set
         * @return this builder
         **/
        public Builder httpMethods(java.util.List<HttpMethod> httpMethods) {
            this.httpMethods = httpMethods;
            this.__explicitlySet__.add("httpMethods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InferenceHttpEndpoint build() {
            InferenceHttpEndpoint model =
                    new InferenceHttpEndpoint(this.endpointUriSuffix, this.httpMethods);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferenceHttpEndpoint model) {
            if (model.wasPropertyExplicitlySet("endpointUriSuffix")) {
                this.endpointUriSuffix(model.getEndpointUriSuffix());
            }
            if (model.wasPropertyExplicitlySet("httpMethods")) {
                this.httpMethods(model.getHttpMethods());
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
     * The suffix part of the endpoint that will be allowed for invocation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointUriSuffix")
    private final String endpointUriSuffix;

    /**
     * The suffix part of the endpoint that will be allowed for invocation.
     *
     * @return the value
     **/
    public String getEndpointUriSuffix() {
        return endpointUriSuffix;
    }

    /**
     * List of HTTP methods acceptable by the URI.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpMethods")
    private final java.util.List<HttpMethod> httpMethods;

    /**
     * List of HTTP methods acceptable by the URI.
     *
     * @return the value
     **/
    public java.util.List<HttpMethod> getHttpMethods() {
        return httpMethods;
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
        sb.append("InferenceHttpEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("endpointUriSuffix=").append(String.valueOf(this.endpointUriSuffix));
        sb.append(", httpMethods=").append(String.valueOf(this.httpMethods));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferenceHttpEndpoint)) {
            return false;
        }

        InferenceHttpEndpoint other = (InferenceHttpEndpoint) o;
        return java.util.Objects.equals(this.endpointUriSuffix, other.endpointUriSuffix)
                && java.util.Objects.equals(this.httpMethods, other.httpMethods)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.endpointUriSuffix == null ? 43 : this.endpointUriSuffix.hashCode());
        result = (result * PRIME) + (this.httpMethods == null ? 43 : this.httpMethods.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
