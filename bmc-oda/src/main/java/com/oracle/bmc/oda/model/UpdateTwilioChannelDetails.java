/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties to update a Twilio channel.
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
    builder = UpdateTwilioChannelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTwilioChannelDetails extends UpdateChannelDetails {
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
         * The Auth Token for the Twilio number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authToken")
        private String authToken;

        /**
         * The Auth Token for the Twilio number.
         * @param authToken the value to set
         * @return this builder
         **/
        public Builder authToken(String authToken) {
            this.authToken = authToken;
            this.__explicitlySet__.add("authToken");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTwilioChannelDetails build() {
            UpdateTwilioChannelDetails model =
                    new UpdateTwilioChannelDetails(
                            this.name,
                            this.description,
                            this.sessionExpiryDurationInMilliseconds,
                            this.freeformTags,
                            this.definedTags,
                            this.accountSID,
                            this.phoneNumber,
                            this.authToken,
                            this.isMmsEnabled,
                            this.originalConnectorsUrl,
                            this.botId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTwilioChannelDetails model) {
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
            if (model.wasPropertyExplicitlySet("accountSID")) {
                this.accountSID(model.getAccountSID());
            }
            if (model.wasPropertyExplicitlySet("phoneNumber")) {
                this.phoneNumber(model.getPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("authToken")) {
                this.authToken(model.getAuthToken());
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
    public UpdateTwilioChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String accountSID,
            String phoneNumber,
            String authToken,
            Boolean isMmsEnabled,
            String originalConnectorsUrl,
            String botId) {
        super(name, description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.accountSID = accountSID;
        this.phoneNumber = phoneNumber;
        this.authToken = authToken;
        this.isMmsEnabled = isMmsEnabled;
        this.originalConnectorsUrl = originalConnectorsUrl;
        this.botId = botId;
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
     * The Auth Token for the Twilio number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authToken")
    private final String authToken;

    /**
     * The Auth Token for the Twilio number.
     * @return the value
     **/
    public String getAuthToken() {
        return authToken;
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
        sb.append("UpdateTwilioChannelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accountSID=").append(String.valueOf(this.accountSID));
        sb.append(", phoneNumber=").append(String.valueOf(this.phoneNumber));
        sb.append(", authToken=").append("<redacted>");
        sb.append(", isMmsEnabled=").append(String.valueOf(this.isMmsEnabled));
        sb.append(", originalConnectorsUrl=").append(String.valueOf(this.originalConnectorsUrl));
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTwilioChannelDetails)) {
            return false;
        }

        UpdateTwilioChannelDetails other = (UpdateTwilioChannelDetails) o;
        return java.util.Objects.equals(this.accountSID, other.accountSID)
                && java.util.Objects.equals(this.phoneNumber, other.phoneNumber)
                && java.util.Objects.equals(this.authToken, other.authToken)
                && java.util.Objects.equals(this.isMmsEnabled, other.isMmsEnabled)
                && java.util.Objects.equals(this.originalConnectorsUrl, other.originalConnectorsUrl)
                && java.util.Objects.equals(this.botId, other.botId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accountSID == null ? 43 : this.accountSID.hashCode());
        result = (result * PRIME) + (this.phoneNumber == null ? 43 : this.phoneNumber.hashCode());
        result = (result * PRIME) + (this.authToken == null ? 43 : this.authToken.hashCode());
        result = (result * PRIME) + (this.isMmsEnabled == null ? 43 : this.isMmsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.originalConnectorsUrl == null
                                ? 43
                                : this.originalConnectorsUrl.hashCode());
        result = (result * PRIME) + (this.botId == null ? 43 : this.botId.hashCode());
        return result;
    }
}
