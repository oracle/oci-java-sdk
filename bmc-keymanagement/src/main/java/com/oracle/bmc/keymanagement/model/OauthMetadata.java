/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Authorization details required to get access token from IDP for accessing protected resources.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OauthMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OauthMetadata extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"idcsAccountNameUrl", "clientAppId", "clientAppSecret"})
    public OauthMetadata(String idcsAccountNameUrl, String clientAppId, String clientAppSecret) {
        super();
        this.idcsAccountNameUrl = idcsAccountNameUrl;
        this.clientAppId = clientAppId;
        this.clientAppSecret = clientAppSecret;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Base URL of the IDCS account where confidential client app is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAccountNameUrl")
        private String idcsAccountNameUrl;

        /**
         * Base URL of the IDCS account where confidential client app is created.
         *
         * @param idcsAccountNameUrl the value to set
         * @return this builder
         */
        public Builder idcsAccountNameUrl(String idcsAccountNameUrl) {
            this.idcsAccountNameUrl = idcsAccountNameUrl;
            this.__explicitlySet__.add("idcsAccountNameUrl");
            return this;
        }
        /** ID of the client app created in IDP. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientAppId")
        private String clientAppId;

        /**
         * ID of the client app created in IDP.
         *
         * @param clientAppId the value to set
         * @return this builder
         */
        public Builder clientAppId(String clientAppId) {
            this.clientAppId = clientAppId;
            this.__explicitlySet__.add("clientAppId");
            return this;
        }
        /** Secret of the client app created in IDP. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientAppSecret")
        private String clientAppSecret;

        /**
         * Secret of the client app created in IDP.
         *
         * @param clientAppSecret the value to set
         * @return this builder
         */
        public Builder clientAppSecret(String clientAppSecret) {
            this.clientAppSecret = clientAppSecret;
            this.__explicitlySet__.add("clientAppSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OauthMetadata build() {
            OauthMetadata model =
                    new OauthMetadata(
                            this.idcsAccountNameUrl, this.clientAppId, this.clientAppSecret);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OauthMetadata model) {
            if (model.wasPropertyExplicitlySet("idcsAccountNameUrl")) {
                this.idcsAccountNameUrl(model.getIdcsAccountNameUrl());
            }
            if (model.wasPropertyExplicitlySet("clientAppId")) {
                this.clientAppId(model.getClientAppId());
            }
            if (model.wasPropertyExplicitlySet("clientAppSecret")) {
                this.clientAppSecret(model.getClientAppSecret());
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

    /** Base URL of the IDCS account where confidential client app is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAccountNameUrl")
    private final String idcsAccountNameUrl;

    /**
     * Base URL of the IDCS account where confidential client app is created.
     *
     * @return the value
     */
    public String getIdcsAccountNameUrl() {
        return idcsAccountNameUrl;
    }

    /** ID of the client app created in IDP. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientAppId")
    private final String clientAppId;

    /**
     * ID of the client app created in IDP.
     *
     * @return the value
     */
    public String getClientAppId() {
        return clientAppId;
    }

    /** Secret of the client app created in IDP. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientAppSecret")
    private final String clientAppSecret;

    /**
     * Secret of the client app created in IDP.
     *
     * @return the value
     */
    public String getClientAppSecret() {
        return clientAppSecret;
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
        sb.append("OauthMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("idcsAccountNameUrl=").append(String.valueOf(this.idcsAccountNameUrl));
        sb.append(", clientAppId=").append(String.valueOf(this.clientAppId));
        sb.append(", clientAppSecret=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OauthMetadata)) {
            return false;
        }

        OauthMetadata other = (OauthMetadata) o;
        return java.util.Objects.equals(this.idcsAccountNameUrl, other.idcsAccountNameUrl)
                && java.util.Objects.equals(this.clientAppId, other.clientAppId)
                && java.util.Objects.equals(this.clientAppSecret, other.clientAppSecret)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.idcsAccountNameUrl == null
                                ? 43
                                : this.idcsAccountNameUrl.hashCode());
        result = (result * PRIME) + (this.clientAppId == null ? 43 : this.clientAppId.hashCode());
        result =
                (result * PRIME)
                        + (this.clientAppSecret == null ? 43 : this.clientAppSecret.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
