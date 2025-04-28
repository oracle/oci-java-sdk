/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties required to create a Slack channel. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSlackChannelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSlackChannelDetails extends CreateChannelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
        private Long sessionExpiryDurationInMilliseconds;

        public Builder sessionExpiryDurationInMilliseconds(
                Long sessionExpiryDurationInMilliseconds) {
            this.sessionExpiryDurationInMilliseconds = sessionExpiryDurationInMilliseconds;
            this.__explicitlySet__.add("sessionExpiryDurationInMilliseconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The Slack Client Id for the Slack app. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * The Slack Client Id for the Slack app.
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /** The URL to redirect to when authentication is successful. */
        @com.fasterxml.jackson.annotation.JsonProperty("authSuccessUrl")
        private String authSuccessUrl;

        /**
         * The URL to redirect to when authentication is successful.
         *
         * @param authSuccessUrl the value to set
         * @return this builder
         */
        public Builder authSuccessUrl(String authSuccessUrl) {
            this.authSuccessUrl = authSuccessUrl;
            this.__explicitlySet__.add("authSuccessUrl");
            return this;
        }
        /** The URL to redirect to when authentication is unsuccessful. */
        @com.fasterxml.jackson.annotation.JsonProperty("authErrorUrl")
        private String authErrorUrl;

        /**
         * The URL to redirect to when authentication is unsuccessful.
         *
         * @param authErrorUrl the value to set
         * @return this builder
         */
        public Builder authErrorUrl(String authErrorUrl) {
            this.authErrorUrl = authErrorUrl;
            this.__explicitlySet__.add("authErrorUrl");
            return this;
        }
        /** The Signing Secret for the Slack App. */
        @com.fasterxml.jackson.annotation.JsonProperty("signingSecret")
        private String signingSecret;

        /**
         * The Signing Secret for the Slack App.
         *
         * @param signingSecret the value to set
         * @return this builder
         */
        public Builder signingSecret(String signingSecret) {
            this.signingSecret = signingSecret;
            this.__explicitlySet__.add("signingSecret");
            return this;
        }
        /** The Client Secret for the Slack App. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private String clientSecret;

        /**
         * The Client Secret for the Slack App.
         *
         * @param clientSecret the value to set
         * @return this builder
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }
        /** The ID of the Skill or Digital Assistant that the Channel is routed to. */
        @com.fasterxml.jackson.annotation.JsonProperty("botId")
        private String botId;

        /**
         * The ID of the Skill or Digital Assistant that the Channel is routed to.
         *
         * @param botId the value to set
         * @return this builder
         */
        public Builder botId(String botId) {
            this.botId = botId;
            this.__explicitlySet__.add("botId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSlackChannelDetails build() {
            CreateSlackChannelDetails model =
                    new CreateSlackChannelDetails(
                            this.name,
                            this.description,
                            this.sessionExpiryDurationInMilliseconds,
                            this.freeformTags,
                            this.definedTags,
                            this.clientId,
                            this.authSuccessUrl,
                            this.authErrorUrl,
                            this.signingSecret,
                            this.clientSecret,
                            this.botId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSlackChannelDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("sessionExpiryDurationInMilliseconds")) {
                this.sessionExpiryDurationInMilliseconds(
                        model.getSessionExpiryDurationInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("authSuccessUrl")) {
                this.authSuccessUrl(model.getAuthSuccessUrl());
            }
            if (model.wasPropertyExplicitlySet("authErrorUrl")) {
                this.authErrorUrl(model.getAuthErrorUrl());
            }
            if (model.wasPropertyExplicitlySet("signingSecret")) {
                this.signingSecret(model.getSigningSecret());
            }
            if (model.wasPropertyExplicitlySet("clientSecret")) {
                this.clientSecret(model.getClientSecret());
            }
            if (model.wasPropertyExplicitlySet("botId")) {
                this.botId(model.getBotId());
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
    public CreateSlackChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String clientId,
            String authSuccessUrl,
            String authErrorUrl,
            String signingSecret,
            String clientSecret,
            String botId) {
        super(name, description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.clientId = clientId;
        this.authSuccessUrl = authSuccessUrl;
        this.authErrorUrl = authErrorUrl;
        this.signingSecret = signingSecret;
        this.clientSecret = clientSecret;
        this.botId = botId;
    }

    /** The Slack Client Id for the Slack app. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * The Slack Client Id for the Slack app.
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /** The URL to redirect to when authentication is successful. */
    @com.fasterxml.jackson.annotation.JsonProperty("authSuccessUrl")
    private final String authSuccessUrl;

    /**
     * The URL to redirect to when authentication is successful.
     *
     * @return the value
     */
    public String getAuthSuccessUrl() {
        return authSuccessUrl;
    }

    /** The URL to redirect to when authentication is unsuccessful. */
    @com.fasterxml.jackson.annotation.JsonProperty("authErrorUrl")
    private final String authErrorUrl;

    /**
     * The URL to redirect to when authentication is unsuccessful.
     *
     * @return the value
     */
    public String getAuthErrorUrl() {
        return authErrorUrl;
    }

    /** The Signing Secret for the Slack App. */
    @com.fasterxml.jackson.annotation.JsonProperty("signingSecret")
    private final String signingSecret;

    /**
     * The Signing Secret for the Slack App.
     *
     * @return the value
     */
    public String getSigningSecret() {
        return signingSecret;
    }

    /** The Client Secret for the Slack App. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final String clientSecret;

    /**
     * The Client Secret for the Slack App.
     *
     * @return the value
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /** The ID of the Skill or Digital Assistant that the Channel is routed to. */
    @com.fasterxml.jackson.annotation.JsonProperty("botId")
    private final String botId;

    /**
     * The ID of the Skill or Digital Assistant that the Channel is routed to.
     *
     * @return the value
     */
    public String getBotId() {
        return botId;
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
        sb.append("CreateSlackChannelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", authSuccessUrl=").append(String.valueOf(this.authSuccessUrl));
        sb.append(", authErrorUrl=").append(String.valueOf(this.authErrorUrl));
        sb.append(", signingSecret=").append("<redacted>");
        sb.append(", clientSecret=").append("<redacted>");
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSlackChannelDetails)) {
            return false;
        }

        CreateSlackChannelDetails other = (CreateSlackChannelDetails) o;
        return java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.authSuccessUrl, other.authSuccessUrl)
                && java.util.Objects.equals(this.authErrorUrl, other.authErrorUrl)
                && java.util.Objects.equals(this.signingSecret, other.signingSecret)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && java.util.Objects.equals(this.botId, other.botId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result =
                (result * PRIME)
                        + (this.authSuccessUrl == null ? 43 : this.authSuccessUrl.hashCode());
        result = (result * PRIME) + (this.authErrorUrl == null ? 43 : this.authErrorUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.signingSecret == null ? 43 : this.signingSecret.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result = (result * PRIME) + (this.botId == null ? 43 : this.botId.hashCode());
        return result;
    }
}
