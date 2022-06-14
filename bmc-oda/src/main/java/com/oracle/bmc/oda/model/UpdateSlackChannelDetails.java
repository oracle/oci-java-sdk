/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties to update a Slack channel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateSlackChannelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateSlackChannelDetails extends UpdateChannelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * The Slack Client Id for the Slack app.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * The Slack Client Id for the Slack app.
         * @param clientId the value to set
         * @return this builder
         **/
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * The URL to redirect to when authentication is successful.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authSuccessUrl")
        private String authSuccessUrl;

        /**
         * The URL to redirect to when authentication is successful.
         * @param authSuccessUrl the value to set
         * @return this builder
         **/
        public Builder authSuccessUrl(String authSuccessUrl) {
            this.authSuccessUrl = authSuccessUrl;
            this.__explicitlySet__.add("authSuccessUrl");
            return this;
        }
        /**
         * The URL to redirect to when authentication is unsuccessful.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authErrorUrl")
        private String authErrorUrl;

        /**
         * The URL to redirect to when authentication is unsuccessful.
         * @param authErrorUrl the value to set
         * @return this builder
         **/
        public Builder authErrorUrl(String authErrorUrl) {
            this.authErrorUrl = authErrorUrl;
            this.__explicitlySet__.add("authErrorUrl");
            return this;
        }
        /**
         * The Signing Secret for the Slack App.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingSecret")
        private String signingSecret;

        /**
         * The Signing Secret for the Slack App.
         * @param signingSecret the value to set
         * @return this builder
         **/
        public Builder signingSecret(String signingSecret) {
            this.signingSecret = signingSecret;
            this.__explicitlySet__.add("signingSecret");
            return this;
        }
        /**
         * The Client Secret for the Slack App.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private String clientSecret;

        /**
         * The Client Secret for the Slack App.
         * @param clientSecret the value to set
         * @return this builder
         **/
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }
        /**
         * The ID of the Skill or Digital Assistant that the Channel is routed to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("botId")
        private String botId;

        /**
         * The ID of the Skill or Digital Assistant that the Channel is routed to.
         * @param botId the value to set
         * @return this builder
         **/
        public Builder botId(String botId) {
            this.botId = botId;
            this.__explicitlySet__.add("botId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSlackChannelDetails build() {
            UpdateSlackChannelDetails __instance__ =
                    new UpdateSlackChannelDetails(
                            description,
                            sessionExpiryDurationInMilliseconds,
                            freeformTags,
                            definedTags,
                            clientId,
                            authSuccessUrl,
                            authErrorUrl,
                            signingSecret,
                            clientSecret,
                            botId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSlackChannelDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .sessionExpiryDurationInMilliseconds(
                                    o.getSessionExpiryDurationInMilliseconds())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .clientId(o.getClientId())
                            .authSuccessUrl(o.getAuthSuccessUrl())
                            .authErrorUrl(o.getAuthErrorUrl())
                            .signingSecret(o.getSigningSecret())
                            .clientSecret(o.getClientSecret())
                            .botId(o.getBotId());

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
    public UpdateSlackChannelDetails(
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
        super(description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.clientId = clientId;
        this.authSuccessUrl = authSuccessUrl;
        this.authErrorUrl = authErrorUrl;
        this.signingSecret = signingSecret;
        this.clientSecret = clientSecret;
        this.botId = botId;
    }

    /**
     * The Slack Client Id for the Slack app.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * The Slack Client Id for the Slack app.
     * @return the value
     **/
    public String getClientId() {
        return clientId;
    }

    /**
     * The URL to redirect to when authentication is successful.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authSuccessUrl")
    private final String authSuccessUrl;

    /**
     * The URL to redirect to when authentication is successful.
     * @return the value
     **/
    public String getAuthSuccessUrl() {
        return authSuccessUrl;
    }

    /**
     * The URL to redirect to when authentication is unsuccessful.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authErrorUrl")
    private final String authErrorUrl;

    /**
     * The URL to redirect to when authentication is unsuccessful.
     * @return the value
     **/
    public String getAuthErrorUrl() {
        return authErrorUrl;
    }

    /**
     * The Signing Secret for the Slack App.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingSecret")
    private final String signingSecret;

    /**
     * The Signing Secret for the Slack App.
     * @return the value
     **/
    public String getSigningSecret() {
        return signingSecret;
    }

    /**
     * The Client Secret for the Slack App.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final String clientSecret;

    /**
     * The Client Secret for the Slack App.
     * @return the value
     **/
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * The ID of the Skill or Digital Assistant that the Channel is routed to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("botId")
    private final String botId;

    /**
     * The ID of the Skill or Digital Assistant that the Channel is routed to.
     * @return the value
     **/
    public String getBotId() {
        return botId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateSlackChannelDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", authSuccessUrl=").append(String.valueOf(this.authSuccessUrl));
        sb.append(", authErrorUrl=").append(String.valueOf(this.authErrorUrl));
        sb.append(", signingSecret=").append(String.valueOf(this.signingSecret));
        sb.append(", clientSecret=").append(String.valueOf(this.clientSecret));
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSlackChannelDetails)) {
            return false;
        }

        UpdateSlackChannelDetails other = (UpdateSlackChannelDetails) o;
        return java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.authSuccessUrl, other.authSuccessUrl)
                && java.util.Objects.equals(this.authErrorUrl, other.authErrorUrl)
                && java.util.Objects.equals(this.signingSecret, other.signingSecret)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && java.util.Objects.equals(this.botId, other.botId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
