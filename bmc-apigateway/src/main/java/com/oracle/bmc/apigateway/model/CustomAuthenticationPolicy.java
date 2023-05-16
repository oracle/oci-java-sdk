/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Use a function to validate a custom header or query parameter sent with the request
 * authentication. A valid policy must specify either tokenHeader or tokenQueryParam. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CustomAuthenticationPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomAuthenticationPolicy extends AuthenticationPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isAnonymousAccessAllowed")
        private Boolean isAnonymousAccessAllowed;

        public Builder isAnonymousAccessAllowed(Boolean isAnonymousAccessAllowed) {
            this.isAnonymousAccessAllowed = isAnonymousAccessAllowed;
            this.__explicitlySet__.add("isAnonymousAccessAllowed");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Oracle Functions function resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Oracle Functions function resource.
         *
         * @param functionId the value to set
         * @return this builder
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }
        /** The name of the header containing the authentication token. */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenHeader")
        private String tokenHeader;

        /**
         * The name of the header containing the authentication token.
         *
         * @param tokenHeader the value to set
         * @return this builder
         */
        public Builder tokenHeader(String tokenHeader) {
            this.tokenHeader = tokenHeader;
            this.__explicitlySet__.add("tokenHeader");
            return this;
        }
        /** The name of the query parameter containing the authentication token. */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
        private String tokenQueryParam;

        /**
         * The name of the query parameter containing the authentication token.
         *
         * @param tokenQueryParam the value to set
         * @return this builder
         */
        public Builder tokenQueryParam(String tokenQueryParam) {
            this.tokenQueryParam = tokenQueryParam;
            this.__explicitlySet__.add("tokenQueryParam");
            return this;
        }
        /**
         * A map where key is a user defined string and value is a context expressions whose values
         * will be sent to the custom auth function. Values should contain an expression. Example:
         * {@code {"foo": "request.header[abc]"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, String> parameters;

        /**
         * A map where key is a user defined string and value is a context expressions whose values
         * will be sent to the custom auth function. Values should contain an expression. Example:
         * {@code {"foo": "request.header[abc]"}}
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * A list of keys from "parameters" attribute value whose values will be added to the cache
         * key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cacheKey")
        private java.util.List<String> cacheKey;

        /**
         * A list of keys from "parameters" attribute value whose values will be added to the cache
         * key.
         *
         * @param cacheKey the value to set
         * @return this builder
         */
        public Builder cacheKey(java.util.List<String> cacheKey) {
            this.cacheKey = cacheKey;
            this.__explicitlySet__.add("cacheKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationFailurePolicy")
        private ValidationFailurePolicy validationFailurePolicy;

        public Builder validationFailurePolicy(ValidationFailurePolicy validationFailurePolicy) {
            this.validationFailurePolicy = validationFailurePolicy;
            this.__explicitlySet__.add("validationFailurePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomAuthenticationPolicy build() {
            CustomAuthenticationPolicy model =
                    new CustomAuthenticationPolicy(
                            this.isAnonymousAccessAllowed,
                            this.functionId,
                            this.tokenHeader,
                            this.tokenQueryParam,
                            this.parameters,
                            this.cacheKey,
                            this.validationFailurePolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomAuthenticationPolicy model) {
            if (model.wasPropertyExplicitlySet("isAnonymousAccessAllowed")) {
                this.isAnonymousAccessAllowed(model.getIsAnonymousAccessAllowed());
            }
            if (model.wasPropertyExplicitlySet("functionId")) {
                this.functionId(model.getFunctionId());
            }
            if (model.wasPropertyExplicitlySet("tokenHeader")) {
                this.tokenHeader(model.getTokenHeader());
            }
            if (model.wasPropertyExplicitlySet("tokenQueryParam")) {
                this.tokenQueryParam(model.getTokenQueryParam());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("cacheKey")) {
                this.cacheKey(model.getCacheKey());
            }
            if (model.wasPropertyExplicitlySet("validationFailurePolicy")) {
                this.validationFailurePolicy(model.getValidationFailurePolicy());
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
    public CustomAuthenticationPolicy(
            Boolean isAnonymousAccessAllowed,
            String functionId,
            String tokenHeader,
            String tokenQueryParam,
            java.util.Map<String, String> parameters,
            java.util.List<String> cacheKey,
            ValidationFailurePolicy validationFailurePolicy) {
        super(isAnonymousAccessAllowed);
        this.functionId = functionId;
        this.tokenHeader = tokenHeader;
        this.tokenQueryParam = tokenQueryParam;
        this.parameters = parameters;
        this.cacheKey = cacheKey;
        this.validationFailurePolicy = validationFailurePolicy;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Oracle Functions function resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final String functionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Oracle Functions function resource.
     *
     * @return the value
     */
    public String getFunctionId() {
        return functionId;
    }

    /** The name of the header containing the authentication token. */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenHeader")
    private final String tokenHeader;

    /**
     * The name of the header containing the authentication token.
     *
     * @return the value
     */
    public String getTokenHeader() {
        return tokenHeader;
    }

    /** The name of the query parameter containing the authentication token. */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
    private final String tokenQueryParam;

    /**
     * The name of the query parameter containing the authentication token.
     *
     * @return the value
     */
    public String getTokenQueryParam() {
        return tokenQueryParam;
    }

    /**
     * A map where key is a user defined string and value is a context expressions whose values will
     * be sent to the custom auth function. Values should contain an expression. Example: {@code
     * {"foo": "request.header[abc]"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, String> parameters;

    /**
     * A map where key is a user defined string and value is a context expressions whose values will
     * be sent to the custom auth function. Values should contain an expression. Example: {@code
     * {"foo": "request.header[abc]"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * A list of keys from "parameters" attribute value whose values will be added to the cache key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cacheKey")
    private final java.util.List<String> cacheKey;

    /**
     * A list of keys from "parameters" attribute value whose values will be added to the cache key.
     *
     * @return the value
     */
    public java.util.List<String> getCacheKey() {
        return cacheKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validationFailurePolicy")
    private final ValidationFailurePolicy validationFailurePolicy;

    public ValidationFailurePolicy getValidationFailurePolicy() {
        return validationFailurePolicy;
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
        sb.append("CustomAuthenticationPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", functionId=").append(String.valueOf(this.functionId));
        sb.append(", tokenHeader=").append(String.valueOf(this.tokenHeader));
        sb.append(", tokenQueryParam=").append(String.valueOf(this.tokenQueryParam));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", cacheKey=").append(String.valueOf(this.cacheKey));
        sb.append(", validationFailurePolicy=")
                .append(String.valueOf(this.validationFailurePolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomAuthenticationPolicy)) {
            return false;
        }

        CustomAuthenticationPolicy other = (CustomAuthenticationPolicy) o;
        return java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.tokenHeader, other.tokenHeader)
                && java.util.Objects.equals(this.tokenQueryParam, other.tokenQueryParam)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.cacheKey, other.cacheKey)
                && java.util.Objects.equals(
                        this.validationFailurePolicy, other.validationFailurePolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result = (result * PRIME) + (this.tokenHeader == null ? 43 : this.tokenHeader.hashCode());
        result =
                (result * PRIME)
                        + (this.tokenQueryParam == null ? 43 : this.tokenQueryParam.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.cacheKey == null ? 43 : this.cacheKey.hashCode());
        result =
                (result * PRIME)
                        + (this.validationFailurePolicy == null
                                ? 43
                                : this.validationFailurePolicy.hashCode());
        return result;
    }
}
