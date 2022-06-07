/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Use a function to validate a custom header or query parameter sent with the request authentication.
 * A valid policy must specify either tokenHeader or tokenQueryParam.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomAuthenticationPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
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

        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tokenHeader")
        private String tokenHeader;

        public Builder tokenHeader(String tokenHeader) {
            this.tokenHeader = tokenHeader;
            this.__explicitlySet__.add("tokenHeader");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
        private String tokenQueryParam;

        public Builder tokenQueryParam(String tokenQueryParam) {
            this.tokenQueryParam = tokenQueryParam;
            this.__explicitlySet__.add("tokenQueryParam");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomAuthenticationPolicy build() {
            CustomAuthenticationPolicy __instance__ =
                    new CustomAuthenticationPolicy(
                            isAnonymousAccessAllowed, functionId, tokenHeader, tokenQueryParam);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomAuthenticationPolicy o) {
            Builder copiedBuilder =
                    isAnonymousAccessAllowed(o.getIsAnonymousAccessAllowed())
                            .functionId(o.getFunctionId())
                            .tokenHeader(o.getTokenHeader())
                            .tokenQueryParam(o.getTokenQueryParam());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
    public CustomAuthenticationPolicy(
            Boolean isAnonymousAccessAllowed,
            String functionId,
            String tokenHeader,
            String tokenQueryParam) {
        super(isAnonymousAccessAllowed);
        this.functionId = functionId;
        this.tokenHeader = tokenHeader;
        this.tokenQueryParam = tokenQueryParam;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Functions function resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final String functionId;

    public String getFunctionId() {
        return functionId;
    }

    /**
     * The name of the header containing the authentication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenHeader")
    private final String tokenHeader;

    public String getTokenHeader() {
        return tokenHeader;
    }

    /**
     * The name of the query parameter containing the authentication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
    private final String tokenQueryParam;

    public String getTokenQueryParam() {
        return tokenQueryParam;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CustomAuthenticationPolicy(");
        sb.append("super=").append(super.toString());
        sb.append(", functionId=").append(String.valueOf(this.functionId));
        sb.append(", tokenHeader=").append(String.valueOf(this.tokenHeader));
        sb.append(", tokenQueryParam=").append(String.valueOf(this.tokenQueryParam));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
