/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The configuration for a Web channel.
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
    builder = CreateWebChannelResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateWebChannelResult extends CreateChannelResult {
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
         * The secret key used to verify the authenticity of received messages.
         * This is only returned this once.  If it is lost the keys will need to be rotated to generate a new key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
        private String secretKey;

        /**
         * The secret key used to verify the authenticity of received messages.
         * This is only returned this once.  If it is lost the keys will need to be rotated to generate a new key.
         *
         * @param secretKey the value to set
         * @return this builder
         **/
        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            this.__explicitlySet__.add("secretKey");
            return this;
        }
        /**
         * The maximum time until the token expires (in minutes).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxTokenExpirationTimeInMinutes")
        private Long maxTokenExpirationTimeInMinutes;

        /**
         * The maximum time until the token expires (in minutes).
         * @param maxTokenExpirationTimeInMinutes the value to set
         * @return this builder
         **/
        public Builder maxTokenExpirationTimeInMinutes(Long maxTokenExpirationTimeInMinutes) {
            this.maxTokenExpirationTimeInMinutes = maxTokenExpirationTimeInMinutes;
            this.__explicitlySet__.add("maxTokenExpirationTimeInMinutes");
            return this;
        }
        /**
         * Whether client authentication is enabled or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isClientAuthenticationEnabled")
        private Boolean isClientAuthenticationEnabled;

        /**
         * Whether client authentication is enabled or not.
         * @param isClientAuthenticationEnabled the value to set
         * @return this builder
         **/
        public Builder isClientAuthenticationEnabled(Boolean isClientAuthenticationEnabled) {
            this.isClientAuthenticationEnabled = isClientAuthenticationEnabled;
            this.__explicitlySet__.add("isClientAuthenticationEnabled");
            return this;
        }
        /**
         * A comma-delimited whitelist of allowed domains.
         *
         * The channel will only communicate with the sites from the domains that you add to this list.
         * For example, *.corp.example.com, *.hdr.example.com. Entering a single asterisk (*) allows unrestricted access
         * to the channel from any domain.
         *
         * Typically, you'd only enter a single asterisk during development. For production, you would add an allowlist of domains.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedDomains")
        private String allowedDomains;

        /**
         * A comma-delimited whitelist of allowed domains.
         *
         * The channel will only communicate with the sites from the domains that you add to this list.
         * For example, *.corp.example.com, *.hdr.example.com. Entering a single asterisk (*) allows unrestricted access
         * to the channel from any domain.
         *
         * Typically, you'd only enter a single asterisk during development. For production, you would add an allowlist of domains.
         *
         * @param allowedDomains the value to set
         * @return this builder
         **/
        public Builder allowedDomains(String allowedDomains) {
            this.allowedDomains = allowedDomains;
            this.__explicitlySet__.add("allowedDomains");
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

        public CreateWebChannelResult build() {
            CreateWebChannelResult __instance__ =
                    new CreateWebChannelResult(
                            id,
                            name,
                            description,
                            category,
                            sessionExpiryDurationInMilliseconds,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags,
                            secretKey,
                            maxTokenExpirationTimeInMinutes,
                            isClientAuthenticationEnabled,
                            allowedDomains,
                            botId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWebChannelResult o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .category(o.getCategory())
                            .sessionExpiryDurationInMilliseconds(
                                    o.getSessionExpiryDurationInMilliseconds())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .secretKey(o.getSecretKey())
                            .maxTokenExpirationTimeInMinutes(o.getMaxTokenExpirationTimeInMinutes())
                            .isClientAuthenticationEnabled(o.getIsClientAuthenticationEnabled())
                            .allowedDomains(o.getAllowedDomains())
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
    public CreateWebChannelResult(
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
            Long maxTokenExpirationTimeInMinutes,
            Boolean isClientAuthenticationEnabled,
            String allowedDomains,
            String botId) {
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
        this.maxTokenExpirationTimeInMinutes = maxTokenExpirationTimeInMinutes;
        this.isClientAuthenticationEnabled = isClientAuthenticationEnabled;
        this.allowedDomains = allowedDomains;
        this.botId = botId;
    }

    /**
     * The secret key used to verify the authenticity of received messages.
     * This is only returned this once.  If it is lost the keys will need to be rotated to generate a new key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
    private final String secretKey;

    /**
     * The secret key used to verify the authenticity of received messages.
     * This is only returned this once.  If it is lost the keys will need to be rotated to generate a new key.
     *
     * @return the value
     **/
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * The maximum time until the token expires (in minutes).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTokenExpirationTimeInMinutes")
    private final Long maxTokenExpirationTimeInMinutes;

    /**
     * The maximum time until the token expires (in minutes).
     * @return the value
     **/
    public Long getMaxTokenExpirationTimeInMinutes() {
        return maxTokenExpirationTimeInMinutes;
    }

    /**
     * Whether client authentication is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isClientAuthenticationEnabled")
    private final Boolean isClientAuthenticationEnabled;

    /**
     * Whether client authentication is enabled or not.
     * @return the value
     **/
    public Boolean getIsClientAuthenticationEnabled() {
        return isClientAuthenticationEnabled;
    }

    /**
     * A comma-delimited whitelist of allowed domains.
     *
     * The channel will only communicate with the sites from the domains that you add to this list.
     * For example, *.corp.example.com, *.hdr.example.com. Entering a single asterisk (*) allows unrestricted access
     * to the channel from any domain.
     *
     * Typically, you'd only enter a single asterisk during development. For production, you would add an allowlist of domains.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedDomains")
    private final String allowedDomains;

    /**
     * A comma-delimited whitelist of allowed domains.
     *
     * The channel will only communicate with the sites from the domains that you add to this list.
     * For example, *.corp.example.com, *.hdr.example.com. Entering a single asterisk (*) allows unrestricted access
     * to the channel from any domain.
     *
     * Typically, you'd only enter a single asterisk during development. For production, you would add an allowlist of domains.
     *
     * @return the value
     **/
    public String getAllowedDomains() {
        return allowedDomains;
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
        sb.append("CreateWebChannelResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretKey=").append(String.valueOf(this.secretKey));
        sb.append(", maxTokenExpirationTimeInMinutes=")
                .append(String.valueOf(this.maxTokenExpirationTimeInMinutes));
        sb.append(", isClientAuthenticationEnabled=")
                .append(String.valueOf(this.isClientAuthenticationEnabled));
        sb.append(", allowedDomains=").append(String.valueOf(this.allowedDomains));
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
        if (!(o instanceof CreateWebChannelResult)) {
            return false;
        }

        CreateWebChannelResult other = (CreateWebChannelResult) o;
        return java.util.Objects.equals(this.secretKey, other.secretKey)
                && java.util.Objects.equals(
                        this.maxTokenExpirationTimeInMinutes, other.maxTokenExpirationTimeInMinutes)
                && java.util.Objects.equals(
                        this.isClientAuthenticationEnabled, other.isClientAuthenticationEnabled)
                && java.util.Objects.equals(this.allowedDomains, other.allowedDomains)
                && java.util.Objects.equals(this.botId, other.botId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretKey == null ? 43 : this.secretKey.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTokenExpirationTimeInMinutes == null
                                ? 43
                                : this.maxTokenExpirationTimeInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.isClientAuthenticationEnabled == null
                                ? 43
                                : this.isClientAuthenticationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedDomains == null ? 43 : this.allowedDomains.hashCode());
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
