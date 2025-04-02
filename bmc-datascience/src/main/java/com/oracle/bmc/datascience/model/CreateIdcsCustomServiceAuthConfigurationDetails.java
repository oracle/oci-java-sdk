/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Create configuration for existing Oracle Cloud Service <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateIdcsCustomServiceAuthConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateIdcsCustomServiceAuthConfigurationDetails
        extends CreateAuthConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Audience of the IDCS application */
        @com.fasterxml.jackson.annotation.JsonProperty("audience")
        private String audience;

        /**
         * Audience of the IDCS application
         *
         * @param audience the value to set
         * @return this builder
         */
        public Builder audience(String audience) {
            this.audience = audience;
            this.__explicitlySet__.add("audience");
            return this;
        }
        /** Scope of the IDCS application */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * Scope of the IDCS application
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /** Name of the IDCS application */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * Name of the IDCS application
         *
         * @param applicationName the value to set
         * @return this builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }
        /** Name of the IDCS application role */
        @com.fasterxml.jackson.annotation.JsonProperty("roleName")
        private String roleName;

        /**
         * Name of the IDCS application role
         *
         * @param roleName the value to set
         * @return this builder
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            this.__explicitlySet__.add("roleName");
            return this;
        }
        /** Bearer token serving as Proof-of-Ownership for referenced IDCS stripe/application */
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * Bearer token serving as Proof-of-Ownership for referenced IDCS stripe/application
         *
         * @param accessToken the value to set
         * @return this builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIdcsCustomServiceAuthConfigurationDetails build() {
            CreateIdcsCustomServiceAuthConfigurationDetails model =
                    new CreateIdcsCustomServiceAuthConfigurationDetails(
                            this.audience,
                            this.scope,
                            this.applicationName,
                            this.roleName,
                            this.accessToken);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIdcsCustomServiceAuthConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("audience")) {
                this.audience(model.getAudience());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("roleName")) {
                this.roleName(model.getRoleName());
            }
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
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
    public CreateIdcsCustomServiceAuthConfigurationDetails(
            String audience,
            String scope,
            String applicationName,
            String roleName,
            String accessToken) {
        super();
        this.audience = audience;
        this.scope = scope;
        this.applicationName = applicationName;
        this.roleName = roleName;
        this.accessToken = accessToken;
    }

    /** Audience of the IDCS application */
    @com.fasterxml.jackson.annotation.JsonProperty("audience")
    private final String audience;

    /**
     * Audience of the IDCS application
     *
     * @return the value
     */
    public String getAudience() {
        return audience;
    }

    /** Scope of the IDCS application */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * Scope of the IDCS application
     *
     * @return the value
     */
    public String getScope() {
        return scope;
    }

    /** Name of the IDCS application */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * Name of the IDCS application
     *
     * @return the value
     */
    public String getApplicationName() {
        return applicationName;
    }

    /** Name of the IDCS application role */
    @com.fasterxml.jackson.annotation.JsonProperty("roleName")
    private final String roleName;

    /**
     * Name of the IDCS application role
     *
     * @return the value
     */
    public String getRoleName() {
        return roleName;
    }

    /** Bearer token serving as Proof-of-Ownership for referenced IDCS stripe/application */
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * Bearer token serving as Proof-of-Ownership for referenced IDCS stripe/application
     *
     * @return the value
     */
    public String getAccessToken() {
        return accessToken;
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
        sb.append("CreateIdcsCustomServiceAuthConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", audience=").append(String.valueOf(this.audience));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", roleName=").append(String.valueOf(this.roleName));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIdcsCustomServiceAuthConfigurationDetails)) {
            return false;
        }

        CreateIdcsCustomServiceAuthConfigurationDetails other =
                (CreateIdcsCustomServiceAuthConfigurationDetails) o;
        return java.util.Objects.equals(this.audience, other.audience)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.roleName, other.roleName)
                && java.util.Objects.equals(this.accessToken, other.accessToken)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.audience == null ? 43 : this.audience.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result = (result * PRIME) + (this.roleName == null ? 43 : this.roleName.hashCode());
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        return result;
    }
}
