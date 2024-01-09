/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The value of this attribute persists any OAuth access token that the system uses to connect to
 * this ManagedApp. The system obtains this access token using an OAuth protocol flow that could be
 * two-legged or three-legged. A two-legged flow involves only the requester and the server. A
 * three-legged flow also requires the consent of a user -- in this case the consent of an
 * administrator.
 *
 * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite -
 * required: false - returned: default - type: complex <br>
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
        builder = AppThreeLeggedOAuthCredential.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppThreeLeggedOAuthCredential
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"accessToken", "refreshToken", "accessTokenExpiry"})
    public AppThreeLeggedOAuthCredential(
            String accessToken, String refreshToken, String accessTokenExpiry) {
        super();
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.accessTokenExpiry = accessTokenExpiry;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Access Token
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive:
         * encrypt - multiValued: false - mutability: readWrite - required: false - returned:
         * default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * Access Token
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive:
         * encrypt - multiValued: false - mutability: readWrite - required: false - returned:
         * default - type: string - uniqueness: none
         *
         * @param accessToken the value to set
         * @return this builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }
        /**
         * Refresh Token
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsSensitive:
         * encrypt - multiValued: false - mutability: readWrite - required: false - returned:
         * default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("refreshToken")
        private String refreshToken;

        /**
         * Refresh Token
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsSensitive:
         * encrypt - multiValued: false - mutability: readWrite - required: false - returned:
         * default - type: string - uniqueness: none
         *
         * @param refreshToken the value to set
         * @return this builder
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            this.__explicitlySet__.add("refreshToken");
            return this;
        }
        /**
         * Access token expiry
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: dateTime -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessTokenExpiry")
        private String accessTokenExpiry;

        /**
         * Access token expiry
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: dateTime -
         * uniqueness: none
         *
         * @param accessTokenExpiry the value to set
         * @return this builder
         */
        public Builder accessTokenExpiry(String accessTokenExpiry) {
            this.accessTokenExpiry = accessTokenExpiry;
            this.__explicitlySet__.add("accessTokenExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppThreeLeggedOAuthCredential build() {
            AppThreeLeggedOAuthCredential model =
                    new AppThreeLeggedOAuthCredential(
                            this.accessToken, this.refreshToken, this.accessTokenExpiry);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppThreeLeggedOAuthCredential model) {
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
            }
            if (model.wasPropertyExplicitlySet("refreshToken")) {
                this.refreshToken(model.getRefreshToken());
            }
            if (model.wasPropertyExplicitlySet("accessTokenExpiry")) {
                this.accessTokenExpiry(model.getAccessTokenExpiry());
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
     * Access Token
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: encrypt -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * Access Token
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: encrypt -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Refresh Token
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsSensitive: encrypt -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshToken")
    private final String refreshToken;

    /**
     * Refresh Token
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsSensitive: encrypt -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Access token expiry
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: dateTime - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessTokenExpiry")
    private final String accessTokenExpiry;

    /**
     * Access token expiry
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: dateTime - uniqueness:
     * none
     *
     * @return the value
     */
    public String getAccessTokenExpiry() {
        return accessTokenExpiry;
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
        sb.append("AppThreeLeggedOAuthCredential(");
        sb.append("super=").append(super.toString());
        sb.append("accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", refreshToken=").append(String.valueOf(this.refreshToken));
        sb.append(", accessTokenExpiry=").append(String.valueOf(this.accessTokenExpiry));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppThreeLeggedOAuthCredential)) {
            return false;
        }

        AppThreeLeggedOAuthCredential other = (AppThreeLeggedOAuthCredential) o;
        return java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(this.refreshToken, other.refreshToken)
                && java.util.Objects.equals(this.accessTokenExpiry, other.accessTokenExpiry)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        result = (result * PRIME) + (this.refreshToken == null ? 43 : this.refreshToken.hashCode());
        result =
                (result * PRIME)
                        + (this.accessTokenExpiry == null ? 43 : this.accessTokenExpiry.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
