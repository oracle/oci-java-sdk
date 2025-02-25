/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The configuration for a Twilio channel.
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
    builder = CreateTwilioChannelResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTwilioChannelResult extends CreateChannelResult {
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
         * The Account SID for the Twilio number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accountSID")
        private String accountSID;

        /**
         * The Account SID for the Twilio number.
         * @param accountSID the value to set
         * @return this builder
         **/
        public Builder accountSID(String accountSID) {
            this.accountSID = accountSID;
            this.__explicitlySet__.add("accountSID");
            return this;
        }
        /**
         * The Twilio phone number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
        private String phoneNumber;

        /**
         * The Twilio phone number.
         * @param phoneNumber the value to set
         * @return this builder
         **/
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.__explicitlySet__.add("phoneNumber");
            return this;
        }
        /**
         * Whether MMS is enabled for this channel or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMmsEnabled")
        private Boolean isMmsEnabled;

        /**
         * Whether MMS is enabled for this channel or not.
         * @param isMmsEnabled the value to set
         * @return this builder
         **/
        public Builder isMmsEnabled(Boolean isMmsEnabled) {
            this.isMmsEnabled = isMmsEnabled;
            this.__explicitlySet__.add("isMmsEnabled");
            return this;
        }
        /**
         * The original connectors URL (used for backward compatibility).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originalConnectorsUrl")
        private String originalConnectorsUrl;

        /**
         * The original connectors URL (used for backward compatibility).
         * @param originalConnectorsUrl the value to set
         * @return this builder
         **/
        public Builder originalConnectorsUrl(String originalConnectorsUrl) {
            this.originalConnectorsUrl = originalConnectorsUrl;
            this.__explicitlySet__.add("originalConnectorsUrl");
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
        /**
         * The URL to use to send messages to this channel.
         * This will be generally be used to configure a webhook in a 3rd party messaging system to send messages to this channel.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("webhookUrl")
        private String webhookUrl;

        /**
         * The URL to use to send messages to this channel.
         * This will be generally be used to configure a webhook in a 3rd party messaging system to send messages to this channel.
         *
         * @param webhookUrl the value to set
         * @return this builder
         **/
        public Builder webhookUrl(String webhookUrl) {
            this.webhookUrl = webhookUrl;
            this.__explicitlySet__.add("webhookUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTwilioChannelResult build() {
            CreateTwilioChannelResult model =
                    new CreateTwilioChannelResult(
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
                            this.accountSID,
                            this.phoneNumber,
                            this.isMmsEnabled,
                            this.originalConnectorsUrl,
                            this.botId,
                            this.webhookUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTwilioChannelResult model) {
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
            if (model.wasPropertyExplicitlySet("accountSID")) {
                this.accountSID(model.getAccountSID());
            }
            if (model.wasPropertyExplicitlySet("phoneNumber")) {
                this.phoneNumber(model.getPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("isMmsEnabled")) {
                this.isMmsEnabled(model.getIsMmsEnabled());
            }
            if (model.wasPropertyExplicitlySet("originalConnectorsUrl")) {
                this.originalConnectorsUrl(model.getOriginalConnectorsUrl());
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
    public CreateTwilioChannelResult(
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
            String accountSID,
            String phoneNumber,
            Boolean isMmsEnabled,
            String originalConnectorsUrl,
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
        this.accountSID = accountSID;
        this.phoneNumber = phoneNumber;
        this.isMmsEnabled = isMmsEnabled;
        this.originalConnectorsUrl = originalConnectorsUrl;
        this.botId = botId;
        this.webhookUrl = webhookUrl;
    }

    /**
     * The Account SID for the Twilio number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accountSID")
    private final String accountSID;

    /**
     * The Account SID for the Twilio number.
     * @return the value
     **/
    public String getAccountSID() {
        return accountSID;
    }

    /**
     * The Twilio phone number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
    private final String phoneNumber;

    /**
     * The Twilio phone number.
     * @return the value
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Whether MMS is enabled for this channel or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMmsEnabled")
    private final Boolean isMmsEnabled;

    /**
     * Whether MMS is enabled for this channel or not.
     * @return the value
     **/
    public Boolean getIsMmsEnabled() {
        return isMmsEnabled;
    }

    /**
     * The original connectors URL (used for backward compatibility).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalConnectorsUrl")
    private final String originalConnectorsUrl;

    /**
     * The original connectors URL (used for backward compatibility).
     * @return the value
     **/
    public String getOriginalConnectorsUrl() {
        return originalConnectorsUrl;
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

    /**
     * The URL to use to send messages to this channel.
     * This will be generally be used to configure a webhook in a 3rd party messaging system to send messages to this channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("webhookUrl")
    private final String webhookUrl;

    /**
     * The URL to use to send messages to this channel.
     * This will be generally be used to configure a webhook in a 3rd party messaging system to send messages to this channel.
     *
     * @return the value
     **/
    public String getWebhookUrl() {
        return webhookUrl;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateTwilioChannelResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accountSID=").append(String.valueOf(this.accountSID));
        sb.append(", phoneNumber=").append(String.valueOf(this.phoneNumber));
        sb.append(", isMmsEnabled=").append(String.valueOf(this.isMmsEnabled));
        sb.append(", originalConnectorsUrl=").append(String.valueOf(this.originalConnectorsUrl));
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
        if (!(o instanceof CreateTwilioChannelResult)) {
            return false;
        }

        CreateTwilioChannelResult other = (CreateTwilioChannelResult) o;
        return java.util.Objects.equals(this.accountSID, other.accountSID)
                && java.util.Objects.equals(this.phoneNumber, other.phoneNumber)
                && java.util.Objects.equals(this.isMmsEnabled, other.isMmsEnabled)
                && java.util.Objects.equals(this.originalConnectorsUrl, other.originalConnectorsUrl)
                && java.util.Objects.equals(this.botId, other.botId)
                && java.util.Objects.equals(this.webhookUrl, other.webhookUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accountSID == null ? 43 : this.accountSID.hashCode());
        result = (result * PRIME) + (this.phoneNumber == null ? 43 : this.phoneNumber.hashCode());
        result = (result * PRIME) + (this.isMmsEnabled == null ? 43 : this.isMmsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.originalConnectorsUrl == null
                                ? 43
                                : this.originalConnectorsUrl.hashCode());
        result = (result * PRIME) + (this.botId == null ? 43 : this.botId.hashCode());
        result = (result * PRIME) + (this.webhookUrl == null ? 43 : this.webhookUrl.hashCode());
        return result;
    }
}
