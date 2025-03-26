/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Specifies authentication using Oracle Identity Cloud Service (IDCS), leveraging OAuth 2.0 for token-based authentication.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HttpEndpointIdcsAuthConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "httpEndpointAuthConfigType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HttpEndpointIdcsAuthConfig extends HttpEndpointAuthConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("idcsSecret")
        private IdcsSecret idcsSecret;

        public Builder idcsSecret(IdcsSecret idcsSecret) {
            this.idcsSecret = idcsSecret;
            this.__explicitlySet__.add("idcsSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpEndpointIdcsAuthConfig build() {
            HttpEndpointIdcsAuthConfig model = new HttpEndpointIdcsAuthConfig(this.idcsSecret);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpEndpointIdcsAuthConfig model) {
            if (model.wasPropertyExplicitlySet("idcsSecret")) {
                this.idcsSecret(model.getIdcsSecret());
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
    public HttpEndpointIdcsAuthConfig(IdcsSecret idcsSecret) {
        super();
        this.idcsSecret = idcsSecret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idcsSecret")
    private final IdcsSecret idcsSecret;

    public IdcsSecret getIdcsSecret() {
        return idcsSecret;
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
        sb.append("HttpEndpointIdcsAuthConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", idcsSecret=").append(String.valueOf(this.idcsSecret));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpEndpointIdcsAuthConfig)) {
            return false;
        }

        HttpEndpointIdcsAuthConfig other = (HttpEndpointIdcsAuthConfig) o;
        return java.util.Objects.equals(this.idcsSecret, other.idcsSecret) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.idcsSecret == null ? 43 : this.idcsSecret.hashCode());
        return result;
    }
}
