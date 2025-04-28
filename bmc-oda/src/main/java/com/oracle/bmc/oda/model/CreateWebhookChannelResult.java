/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The configuration for a Webhook channel. <br>
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
        builder = CreateWebhookChannelResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateWebhookChannelResult extends CreateChannelResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private ChannelCategory category;

        public Builder category(ChannelCategory category) {
            this.category = category;
            this.__explicitlySet__.add("category");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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
         * The secret key used to verify the authenticity of received messages. This is only
         * returned this once. If it is lost the keys will need to be rotated to generate a new key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
        private String secretKey;

        /**
         * The secret key used to verify the authenticity of received messages. This is only
         * returned this once. If it is lost the keys will need to be rotated to generate a new key.
         *
         * @param secretKey the value to set
         * @return this builder
         */
        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            this.__explicitlySet__.add("secretKey");
            return this;
        }
        /** The URL to send responses to. */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundUrl")
        private String outboundUrl;

        /**
         * The URL to send responses to.
         *
         * @param outboundUrl the value to set
         * @return this builder
         */
        public Builder outboundUrl(String outboundUrl) {
            this.outboundUrl = outboundUrl;
            this.__explicitlySet__.add("outboundUrl");
            return this;
        }
        /** The version for payloads. */
        @com.fasterxml.jackson.annotation.JsonProperty("payloadVersion")
        private WebhookPayloadVersion payloadVersion;

        /**
         * The version for payloads.
         *
         * @param payloadVersion the value to set
         * @return this builder
         */
        public Builder payloadVersion(WebhookPayloadVersion payloadVersion) {
            this.payloadVersion = payloadVersion;
            this.__explicitlySet__.add("payloadVersion");
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
        /**
         * The URL to use to send messages to this channel. This will be generally be used to
         * configure a webhook in a 3rd party messaging system to send messages to this channel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("webhookUrl")
        private String webhookUrl;

        /**
         * The URL to use to send messages to this channel. This will be generally be used to
         * configure a webhook in a 3rd party messaging system to send messages to this channel.
         *
         * @param webhookUrl the value to set
         * @return this builder
         */
        public Builder webhookUrl(String webhookUrl) {
            this.webhookUrl = webhookUrl;
            this.__explicitlySet__.add("webhookUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateWebhookChannelResult build() {
            CreateWebhookChannelResult model =
                    new CreateWebhookChannelResult(
                            this.id,
                            this.name,
                            this.description,
                            this.category,
                            this.sessionExpiryDurationInMilliseconds,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.secretKey,
                            this.outboundUrl,
                            this.payloadVersion,
                            this.botId,
                            this.webhookUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWebhookChannelResult model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("sessionExpiryDurationInMilliseconds")) {
                this.sessionExpiryDurationInMilliseconds(
                        model.getSessionExpiryDurationInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("secretKey")) {
                this.secretKey(model.getSecretKey());
            }
            if (model.wasPropertyExplicitlySet("outboundUrl")) {
                this.outboundUrl(model.getOutboundUrl());
            }
            if (model.wasPropertyExplicitlySet("payloadVersion")) {
                this.payloadVersion(model.getPayloadVersion());
            }
            if (model.wasPropertyExplicitlySet("botId")) {
                this.botId(model.getBotId());
            }
            if (model.wasPropertyExplicitlySet("webhookUrl")) {
                this.webhookUrl(model.getWebhookUrl());
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
    public CreateWebhookChannelResult(
            String id,
            String name,
            String description,
            ChannelCategory category,
            Long sessionExpiryDurationInMilliseconds,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String secretKey,
            String outboundUrl,
            WebhookPayloadVersion payloadVersion,
            String botId,
            String webhookUrl) {
        super(
                id,
                name,
                description,
                category,
                sessionExpiryDurationInMilliseconds,
                lifecycleState,
                timeCreated,
                timeUpdated,
                freeformTags,
                definedTags);
        this.secretKey = secretKey;
        this.outboundUrl = outboundUrl;
        this.payloadVersion = payloadVersion;
        this.botId = botId;
        this.webhookUrl = webhookUrl;
    }

    /**
     * The secret key used to verify the authenticity of received messages. This is only returned
     * this once. If it is lost the keys will need to be rotated to generate a new key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
    private final String secretKey;

    /**
     * The secret key used to verify the authenticity of received messages. This is only returned
     * this once. If it is lost the keys will need to be rotated to generate a new key.
     *
     * @return the value
     */
    public String getSecretKey() {
        return secretKey;
    }

    /** The URL to send responses to. */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundUrl")
    private final String outboundUrl;

    /**
     * The URL to send responses to.
     *
     * @return the value
     */
    public String getOutboundUrl() {
        return outboundUrl;
    }

    /** The version for payloads. */
    @com.fasterxml.jackson.annotation.JsonProperty("payloadVersion")
    private final WebhookPayloadVersion payloadVersion;

    /**
     * The version for payloads.
     *
     * @return the value
     */
    public WebhookPayloadVersion getPayloadVersion() {
        return payloadVersion;
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

    /**
     * The URL to use to send messages to this channel. This will be generally be used to configure
     * a webhook in a 3rd party messaging system to send messages to this channel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("webhookUrl")
    private final String webhookUrl;

    /**
     * The URL to use to send messages to this channel. This will be generally be used to configure
     * a webhook in a 3rd party messaging system to send messages to this channel.
     *
     * @return the value
     */
    public String getWebhookUrl() {
        return webhookUrl;
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
        sb.append("CreateWebhookChannelResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretKey=").append("<redacted>");
        sb.append(", outboundUrl=").append(String.valueOf(this.outboundUrl));
        sb.append(", payloadVersion=").append(String.valueOf(this.payloadVersion));
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append(", webhookUrl=").append(String.valueOf(this.webhookUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWebhookChannelResult)) {
            return false;
        }

        CreateWebhookChannelResult other = (CreateWebhookChannelResult) o;
        return java.util.Objects.equals(this.secretKey, other.secretKey)
                && java.util.Objects.equals(this.outboundUrl, other.outboundUrl)
                && java.util.Objects.equals(this.payloadVersion, other.payloadVersion)
                && java.util.Objects.equals(this.botId, other.botId)
                && java.util.Objects.equals(this.webhookUrl, other.webhookUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretKey == null ? 43 : this.secretKey.hashCode());
        result = (result * PRIME) + (this.outboundUrl == null ? 43 : this.outboundUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.payloadVersion == null ? 43 : this.payloadVersion.hashCode());
        result = (result * PRIME) + (this.botId == null ? 43 : this.botId.hashCode());
        result = (result * PRIME) + (this.webhookUrl == null ? 43 : this.webhookUrl.hashCode());
        return result;
    }
}
