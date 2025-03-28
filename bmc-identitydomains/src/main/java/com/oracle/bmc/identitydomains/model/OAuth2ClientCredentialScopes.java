/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Scopes <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OAuth2ClientCredentialScopes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OAuth2ClientCredentialScopes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"audience", "scope"})
    public OAuth2ClientCredentialScopes(String audience, String scope) {
        super();
        this.audience = audience;
        this.scope = scope;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Audience
         *
         * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readWrite -
         * required: true - returned: default
         */
        @com.fasterxml.jackson.annotation.JsonProperty("audience")
        private String audience;

        /**
         * Audience
         *
         * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readWrite -
         * required: true - returned: default
         *
         * @param audience the value to set
         * @return this builder
         */
        public Builder audience(String audience) {
            this.audience = audience;
            this.__explicitlySet__.add("audience");
            return this;
        }
        /**
         * Scope
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsScimCompliant: false - type: string -
         * mutability: readWrite - multiValued: false - required: true - returned: default
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * Scope
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsScimCompliant: false - type: string -
         * mutability: readWrite - multiValued: false - required: true - returned: default
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OAuth2ClientCredentialScopes build() {
            OAuth2ClientCredentialScopes model =
                    new OAuth2ClientCredentialScopes(this.audience, this.scope);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OAuth2ClientCredentialScopes model) {
            if (model.wasPropertyExplicitlySet("audience")) {
                this.audience(model.getAudience());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
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
     * Audience
     *
     * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readWrite -
     * required: true - returned: default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("audience")
    private final String audience;

    /**
     * Audience
     *
     * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readWrite -
     * required: true - returned: default
     *
     * @return the value
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Scope
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsScimCompliant: false - type: string -
     * mutability: readWrite - multiValued: false - required: true - returned: default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * Scope
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsScimCompliant: false - type: string -
     * mutability: readWrite - multiValued: false - required: true - returned: default
     *
     * @return the value
     */
    public String getScope() {
        return scope;
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
        sb.append("OAuth2ClientCredentialScopes(");
        sb.append("super=").append(super.toString());
        sb.append("audience=").append(String.valueOf(this.audience));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuth2ClientCredentialScopes)) {
            return false;
        }

        OAuth2ClientCredentialScopes other = (OAuth2ClientCredentialScopes) o;
        return java.util.Objects.equals(this.audience, other.audience)
                && java.util.Objects.equals(this.scope, other.scope)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.audience == null ? 43 : this.audience.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
