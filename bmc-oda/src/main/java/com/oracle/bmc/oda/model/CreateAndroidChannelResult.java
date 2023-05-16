/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The configuration for an Android channel. <br>
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
        builder = CreateAndroidChannelResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAndroidChannelResult extends CreateChannelResult {
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
        /** The maximum time until the token expires (in minutes). */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTokenExpirationTimeInMinutes")
        private Long maxTokenExpirationTimeInMinutes;

        /**
         * The maximum time until the token expires (in minutes).
         *
         * @param maxTokenExpirationTimeInMinutes the value to set
         * @return this builder
         */
        public Builder maxTokenExpirationTimeInMinutes(Long maxTokenExpirationTimeInMinutes) {
            this.maxTokenExpirationTimeInMinutes = maxTokenExpirationTimeInMinutes;
            this.__explicitlySet__.add("maxTokenExpirationTimeInMinutes");
            return this;
        }
        /** Whether client authentication is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isClientAuthenticationEnabled")
        private Boolean isClientAuthenticationEnabled;

        /**
         * Whether client authentication is enabled or not.
         *
         * @param isClientAuthenticationEnabled the value to set
         * @return this builder
         */
        public Builder isClientAuthenticationEnabled(Boolean isClientAuthenticationEnabled) {
            this.isClientAuthenticationEnabled = isClientAuthenticationEnabled;
            this.__explicitlySet__.add("isClientAuthenticationEnabled");
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

        public CreateAndroidChannelResult build() {
            CreateAndroidChannelResult model =
                    new CreateAndroidChannelResult(
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
                            this.maxTokenExpirationTimeInMinutes,
                            this.isClientAuthenticationEnabled,
                            this.botId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAndroidChannelResult model) {
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
            if (model.wasPropertyExplicitlySet("maxTokenExpirationTimeInMinutes")) {
                this.maxTokenExpirationTimeInMinutes(model.getMaxTokenExpirationTimeInMinutes());
            }
            if (model.wasPropertyExplicitlySet("isClientAuthenticationEnabled")) {
                this.isClientAuthenticationEnabled(model.getIsClientAuthenticationEnabled());
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
    public CreateAndroidChannelResult(
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
        this.botId = botId;
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

    /** The maximum time until the token expires (in minutes). */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTokenExpirationTimeInMinutes")
    private final Long maxTokenExpirationTimeInMinutes;

    /**
     * The maximum time until the token expires (in minutes).
     *
     * @return the value
     */
    public Long getMaxTokenExpirationTimeInMinutes() {
        return maxTokenExpirationTimeInMinutes;
    }

    /** Whether client authentication is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isClientAuthenticationEnabled")
    private final Boolean isClientAuthenticationEnabled;

    /**
     * Whether client authentication is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsClientAuthenticationEnabled() {
        return isClientAuthenticationEnabled;
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
        sb.append("CreateAndroidChannelResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretKey=").append("<redacted>");
        sb.append(", maxTokenExpirationTimeInMinutes=")
                .append(String.valueOf(this.maxTokenExpirationTimeInMinutes));
        sb.append(", isClientAuthenticationEnabled=")
                .append(String.valueOf(this.isClientAuthenticationEnabled));
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAndroidChannelResult)) {
            return false;
        }

        CreateAndroidChannelResult other = (CreateAndroidChannelResult) o;
        return java.util.Objects.equals(this.secretKey, other.secretKey)
                && java.util.Objects.equals(
                        this.maxTokenExpirationTimeInMinutes, other.maxTokenExpirationTimeInMinutes)
                && java.util.Objects.equals(
                        this.isClientAuthenticationEnabled, other.isClientAuthenticationEnabled)
                && java.util.Objects.equals(this.botId, other.botId)
                && super.equals(other);
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
        result = (result * PRIME) + (this.botId == null ? 43 : this.botId.hashCode());
        return result;
    }
}
