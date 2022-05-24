/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties required to create a Slack channel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSlackChannelDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateSlackChannelDetails extends CreateChannelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authSuccessUrl")
        private String authSuccessUrl;

        public Builder authSuccessUrl(String authSuccessUrl) {
            this.authSuccessUrl = authSuccessUrl;
            this.__explicitlySet__.add("authSuccessUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authErrorUrl")
        private String authErrorUrl;

        public Builder authErrorUrl(String authErrorUrl) {
            this.authErrorUrl = authErrorUrl;
            this.__explicitlySet__.add("authErrorUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signingSecret")
        private String signingSecret;

        public Builder signingSecret(String signingSecret) {
            this.signingSecret = signingSecret;
            this.__explicitlySet__.add("signingSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private String clientSecret;

        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("botId")
        private String botId;

        public Builder botId(String botId) {
            this.botId = botId;
            this.__explicitlySet__.add("botId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSlackChannelDetails build() {
            CreateSlackChannelDetails __instance__ =
                    new CreateSlackChannelDetails(
                            name,
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
        public Builder copy(CreateSlackChannelDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
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

    /**
     * The Slack Client Id for the Slack app.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    String clientId;

    /**
     * The URL to redirect to when authentication is successful.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authSuccessUrl")
    String authSuccessUrl;

    /**
     * The URL to redirect to when authentication is unsuccessful.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authErrorUrl")
    String authErrorUrl;

    /**
     * The Signing Secret for the Slack App.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingSecret")
    String signingSecret;

    /**
     * The Client Secret for the Slack App.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    String clientSecret;

    /**
     * The ID of the Skill or Digital Assistant that the Channel is routed to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("botId")
    String botId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
