/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties required to create a Web channel. <br>
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
        builder = CreateWebChannelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateWebChannelDetails extends CreateChannelDetails {
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
        /**
         * A comma-delimited whitelist of allowed domains.
         *
         * <p>The channel will only communicate with the sites from the domains that you add to this
         * list. For example, *.corp.example.com, *.hdr.example.com. Entering a single asterisk (*)
         * allows unrestricted access to the channel from any domain.
         *
         * <p>Typically, you'd only enter a single asterisk during development. For production, you
         * would add an allowlist of domains.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedDomains")
        private String allowedDomains;

        /**
         * A comma-delimited whitelist of allowed domains.
         *
         * <p>The channel will only communicate with the sites from the domains that you add to this
         * list. For example, *.corp.example.com, *.hdr.example.com. Entering a single asterisk (*)
         * allows unrestricted access to the channel from any domain.
         *
         * <p>Typically, you'd only enter a single asterisk during development. For production, you
         * would add an allowlist of domains.
         *
         * @param allowedDomains the value to set
         * @return this builder
         */
        public Builder allowedDomains(String allowedDomains) {
            this.allowedDomains = allowedDomains;
            this.__explicitlySet__.add("allowedDomains");
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

        public CreateWebChannelDetails build() {
            CreateWebChannelDetails model =
                    new CreateWebChannelDetails(
                            this.name,
                            this.description,
                            this.sessionExpiryDurationInMilliseconds,
                            this.freeformTags,
                            this.definedTags,
                            this.maxTokenExpirationTimeInMinutes,
                            this.isClientAuthenticationEnabled,
                            this.allowedDomains,
                            this.botId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWebChannelDetails model) {
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
            if (model.wasPropertyExplicitlySet("maxTokenExpirationTimeInMinutes")) {
                this.maxTokenExpirationTimeInMinutes(model.getMaxTokenExpirationTimeInMinutes());
            }
            if (model.wasPropertyExplicitlySet("isClientAuthenticationEnabled")) {
                this.isClientAuthenticationEnabled(model.getIsClientAuthenticationEnabled());
            }
            if (model.wasPropertyExplicitlySet("allowedDomains")) {
                this.allowedDomains(model.getAllowedDomains());
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
    public CreateWebChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Long maxTokenExpirationTimeInMinutes,
            Boolean isClientAuthenticationEnabled,
            String allowedDomains,
            String botId) {
        super(name, description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.maxTokenExpirationTimeInMinutes = maxTokenExpirationTimeInMinutes;
        this.isClientAuthenticationEnabled = isClientAuthenticationEnabled;
        this.allowedDomains = allowedDomains;
        this.botId = botId;
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

    /**
     * A comma-delimited whitelist of allowed domains.
     *
     * <p>The channel will only communicate with the sites from the domains that you add to this
     * list. For example, *.corp.example.com, *.hdr.example.com. Entering a single asterisk (*)
     * allows unrestricted access to the channel from any domain.
     *
     * <p>Typically, you'd only enter a single asterisk during development. For production, you
     * would add an allowlist of domains.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedDomains")
    private final String allowedDomains;

    /**
     * A comma-delimited whitelist of allowed domains.
     *
     * <p>The channel will only communicate with the sites from the domains that you add to this
     * list. For example, *.corp.example.com, *.hdr.example.com. Entering a single asterisk (*)
     * allows unrestricted access to the channel from any domain.
     *
     * <p>Typically, you'd only enter a single asterisk during development. For production, you
     * would add an allowlist of domains.
     *
     * @return the value
     */
    public String getAllowedDomains() {
        return allowedDomains;
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
        sb.append("CreateWebChannelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", maxTokenExpirationTimeInMinutes=")
                .append(String.valueOf(this.maxTokenExpirationTimeInMinutes));
        sb.append(", isClientAuthenticationEnabled=")
                .append(String.valueOf(this.isClientAuthenticationEnabled));
        sb.append(", allowedDomains=").append(String.valueOf(this.allowedDomains));
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWebChannelDetails)) {
            return false;
        }

        CreateWebChannelDetails other = (CreateWebChannelDetails) o;
        return java.util.Objects.equals(
                        this.maxTokenExpirationTimeInMinutes, other.maxTokenExpirationTimeInMinutes)
                && java.util.Objects.equals(
                        this.isClientAuthenticationEnabled, other.isClientAuthenticationEnabled)
                && java.util.Objects.equals(this.allowedDomains, other.allowedDomains)
                && java.util.Objects.equals(this.botId, other.botId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
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
        return result;
    }
}
