/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration for HTTP endpoint Tool. <br>
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
        builder = HttpEndpointToolConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "toolConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpEndpointToolConfig extends ToolConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("apiSchema")
        private ApiSchemaInputLocation apiSchema;

        public Builder apiSchema(ApiSchemaInputLocation apiSchema) {
            this.apiSchema = apiSchema;
            this.__explicitlySet__.add("apiSchema");
            return this;
        }
        /**
         * The subnet ID from agent developer tenancy through which the egress is going to be
         * routed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The subnet ID from agent developer tenancy through which the egress is going to be
         * routed.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpEndpointAuthConfig")
        private HttpEndpointAuthConfig httpEndpointAuthConfig;

        public Builder httpEndpointAuthConfig(HttpEndpointAuthConfig httpEndpointAuthConfig) {
            this.httpEndpointAuthConfig = httpEndpointAuthConfig;
            this.__explicitlySet__.add("httpEndpointAuthConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpEndpointToolConfig build() {
            HttpEndpointToolConfig model =
                    new HttpEndpointToolConfig(
                            this.apiSchema, this.subnetId, this.httpEndpointAuthConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpEndpointToolConfig model) {
            if (model.wasPropertyExplicitlySet("apiSchema")) {
                this.apiSchema(model.getApiSchema());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("httpEndpointAuthConfig")) {
                this.httpEndpointAuthConfig(model.getHttpEndpointAuthConfig());
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
    public HttpEndpointToolConfig(
            ApiSchemaInputLocation apiSchema,
            String subnetId,
            HttpEndpointAuthConfig httpEndpointAuthConfig) {
        super();
        this.apiSchema = apiSchema;
        this.subnetId = subnetId;
        this.httpEndpointAuthConfig = httpEndpointAuthConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("apiSchema")
    private final ApiSchemaInputLocation apiSchema;

    public ApiSchemaInputLocation getApiSchema() {
        return apiSchema;
    }

    /**
     * The subnet ID from agent developer tenancy through which the egress is going to be routed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The subnet ID from agent developer tenancy through which the egress is going to be routed.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("httpEndpointAuthConfig")
    private final HttpEndpointAuthConfig httpEndpointAuthConfig;

    public HttpEndpointAuthConfig getHttpEndpointAuthConfig() {
        return httpEndpointAuthConfig;
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
        sb.append("HttpEndpointToolConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", apiSchema=").append(String.valueOf(this.apiSchema));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", httpEndpointAuthConfig=").append(String.valueOf(this.httpEndpointAuthConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpEndpointToolConfig)) {
            return false;
        }

        HttpEndpointToolConfig other = (HttpEndpointToolConfig) o;
        return java.util.Objects.equals(this.apiSchema, other.apiSchema)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.httpEndpointAuthConfig, other.httpEndpointAuthConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apiSchema == null ? 43 : this.apiSchema.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.httpEndpointAuthConfig == null
                                ? 43
                                : this.httpEndpointAuthConfig.hashCode());
        return result;
    }
}
