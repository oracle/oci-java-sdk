/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * The OAuth2 client credentials. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScimClientCredentials.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ScimClientCredentials
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clientId", "clientSecret"})
    public ScimClientCredentials(String clientId, String clientSecret) {
        super();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The client identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * The client identifier.
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /** The client secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private String clientSecret;

        /**
         * The client secret.
         *
         * @param clientSecret the value to set
         * @return this builder
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScimClientCredentials build() {
            ScimClientCredentials model =
                    new ScimClientCredentials(this.clientId, this.clientSecret);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScimClientCredentials model) {
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("clientSecret")) {
                this.clientSecret(model.getClientSecret());
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

    /** The client identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * The client identifier.
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /** The client secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final String clientSecret;

    /**
     * The client secret.
     *
     * @return the value
     */
    public String getClientSecret() {
        return clientSecret;
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
        sb.append("ScimClientCredentials(");
        sb.append("super=").append(super.toString());
        sb.append("clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecret=").append(String.valueOf(this.clientSecret));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScimClientCredentials)) {
            return false;
        }

        ScimClientCredentials other = (ScimClientCredentials) o;
        return java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
