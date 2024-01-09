/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Auth Token and endpoint to access Oracle Cloud Infrastructure - Classic, which is the source
 * environment from which you want to migrate the application. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OcicAuthorizationTokenDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OcicAuthorizationTokenDetails extends AuthorizationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** AuthClient app url resource that the accesstoken is for. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientAppUrl")
        private String clientAppUrl;

        /**
         * AuthClient app url resource that the accesstoken is for.
         *
         * @param clientAppUrl the value to set
         * @return this builder
         */
        public Builder clientAppUrl(String clientAppUrl) {
            this.clientAppUrl = clientAppUrl;
            this.__explicitlySet__.add("clientAppUrl");
            return this;
        }
        /** AccessToken to access the app endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * AccessToken to access the app endpoint.
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

        public OcicAuthorizationTokenDetails build() {
            OcicAuthorizationTokenDetails model =
                    new OcicAuthorizationTokenDetails(this.clientAppUrl, this.accessToken);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OcicAuthorizationTokenDetails model) {
            if (model.wasPropertyExplicitlySet("clientAppUrl")) {
                this.clientAppUrl(model.getClientAppUrl());
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
    public OcicAuthorizationTokenDetails(String clientAppUrl, String accessToken) {
        super();
        this.clientAppUrl = clientAppUrl;
        this.accessToken = accessToken;
    }

    /** AuthClient app url resource that the accesstoken is for. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientAppUrl")
    private final String clientAppUrl;

    /**
     * AuthClient app url resource that the accesstoken is for.
     *
     * @return the value
     */
    public String getClientAppUrl() {
        return clientAppUrl;
    }

    /** AccessToken to access the app endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * AccessToken to access the app endpoint.
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
        sb.append("OcicAuthorizationTokenDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", clientAppUrl=").append(String.valueOf(this.clientAppUrl));
        sb.append(", accessToken=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OcicAuthorizationTokenDetails)) {
            return false;
        }

        OcicAuthorizationTokenDetails other = (OcicAuthorizationTokenDetails) o;
        return java.util.Objects.equals(this.clientAppUrl, other.clientAppUrl)
                && java.util.Objects.equals(this.accessToken, other.accessToken)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.clientAppUrl == null ? 43 : this.clientAppUrl.hashCode());
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        return result;
    }
}
