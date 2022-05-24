/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties required to create an OSVC channel.
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
    builder = CreateOsvcChannelDetails.Builder.class
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
public class CreateOsvcChannelDetails extends CreateChannelDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSessionCount")
        private Integer totalSessionCount;

        public Builder totalSessionCount(Integer totalSessionCount) {
            this.totalSessionCount = totalSessionCount;
            this.__explicitlySet__.add("totalSessionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("channelService")
        private OsvcServiceType channelService;

        public Builder channelService(OsvcServiceType channelService) {
            this.channelService = channelService;
            this.__explicitlySet__.add("channelService");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationProviderName")
        private String authenticationProviderName;

        public Builder authenticationProviderName(String authenticationProviderName) {
            this.authenticationProviderName = authenticationProviderName;
            this.__explicitlySet__.add("authenticationProviderName");
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

        public CreateOsvcChannelDetails build() {
            CreateOsvcChannelDetails __instance__ =
                    new CreateOsvcChannelDetails(
                            name,
                            description,
                            sessionExpiryDurationInMilliseconds,
                            freeformTags,
                            definedTags,
                            host,
                            port,
                            userName,
                            password,
                            totalSessionCount,
                            channelService,
                            authenticationProviderName,
                            botId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOsvcChannelDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
                            .sessionExpiryDurationInMilliseconds(
                                    o.getSessionExpiryDurationInMilliseconds())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .host(o.getHost())
                            .port(o.getPort())
                            .userName(o.getUserName())
                            .password(o.getPassword())
                            .totalSessionCount(o.getTotalSessionCount())
                            .channelService(o.getChannelService())
                            .authenticationProviderName(o.getAuthenticationProviderName())
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
    public CreateOsvcChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String host,
            String port,
            String userName,
            String password,
            Integer totalSessionCount,
            OsvcServiceType channelService,
            String authenticationProviderName,
            String botId) {
        super(name, description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.host = host;
        this.port = port;
        this.userName = userName;
        this.password = password;
        this.totalSessionCount = totalSessionCount;
        this.channelService = channelService;
        this.authenticationProviderName = authenticationProviderName;
        this.botId = botId;
    }

    /**
     * The host.
     *
     * For OSVC, you can derive these values from the URL that you use to launch the Agent Browser User Interface
     * or the chat launch page. For example, if the URL is https://sitename.exampledomain.com/app/chat/chat_launch,
     * then the host is sitename.exampledomain.com.
     *
     * For FUSION, this is the host portion of your Oracle Applications Cloud (Fusion) instance's URL.
     * For example: sitename.exampledomain.com.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * The port.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    String port;

    /**
     * The user name for the digital-assistant agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;

    /**
     * The password for the digital-assistant agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    String password;

    /**
     * The total session count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSessionCount")
    Integer totalSessionCount;

    /**
     * The type of OSVC service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("channelService")
    OsvcServiceType channelService;

    /**
     * The name of the Authentication Provider to use to authenticate the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationProviderName")
    String authenticationProviderName;

    /**
     * The ID of the Skill or Digital Assistant that the Channel is routed to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("botId")
    String botId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
