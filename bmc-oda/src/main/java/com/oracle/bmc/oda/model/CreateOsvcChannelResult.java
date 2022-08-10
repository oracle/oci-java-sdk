/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The configuration for an OSVC channel.
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
    builder = CreateOsvcChannelResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOsvcChannelResult extends CreateChannelResult {
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
        private String host;

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
         * @param host the value to set
         * @return this builder
         **/
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * The port.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        /**
         * The port.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The user name for the digital-assistant agent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The user name for the digital-assistant agent.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The total session count.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSessionCount")
        private Integer totalSessionCount;

        /**
         * The total session count.
         * @param totalSessionCount the value to set
         * @return this builder
         **/
        public Builder totalSessionCount(Integer totalSessionCount) {
            this.totalSessionCount = totalSessionCount;
            this.__explicitlySet__.add("totalSessionCount");
            return this;
        }
        /**
         * The type of OSVC service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("channelService")
        private OsvcServiceType channelService;

        /**
         * The type of OSVC service.
         * @param channelService the value to set
         * @return this builder
         **/
        public Builder channelService(OsvcServiceType channelService) {
            this.channelService = channelService;
            this.__explicitlySet__.add("channelService");
            return this;
        }
        /**
         * The name of the Authentication Provider to use to authenticate the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationProviderName")
        private String authenticationProviderName;

        /**
         * The name of the Authentication Provider to use to authenticate the user.
         * @param authenticationProviderName the value to set
         * @return this builder
         **/
        public Builder authenticationProviderName(String authenticationProviderName) {
            this.authenticationProviderName = authenticationProviderName;
            this.__explicitlySet__.add("authenticationProviderName");
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

        public CreateOsvcChannelResult build() {
            CreateOsvcChannelResult model =
                    new CreateOsvcChannelResult(
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
                            this.host,
                            this.port,
                            this.userName,
                            this.totalSessionCount,
                            this.channelService,
                            this.authenticationProviderName,
                            this.botId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOsvcChannelResult model) {
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
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("totalSessionCount")) {
                this.totalSessionCount(model.getTotalSessionCount());
            }
            if (model.wasPropertyExplicitlySet("channelService")) {
                this.channelService(model.getChannelService());
            }
            if (model.wasPropertyExplicitlySet("authenticationProviderName")) {
                this.authenticationProviderName(model.getAuthenticationProviderName());
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
    public CreateOsvcChannelResult(
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
            String host,
            String port,
            String userName,
            Integer totalSessionCount,
            OsvcServiceType channelService,
            String authenticationProviderName,
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
        this.host = host;
        this.port = port;
        this.userName = userName;
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
    private final String host;

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
     * @return the value
     **/
    public String getHost() {
        return host;
    }

    /**
     * The port.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final String port;

    /**
     * The port.
     * @return the value
     **/
    public String getPort() {
        return port;
    }

    /**
     * The user name for the digital-assistant agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The user name for the digital-assistant agent.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The total session count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSessionCount")
    private final Integer totalSessionCount;

    /**
     * The total session count.
     * @return the value
     **/
    public Integer getTotalSessionCount() {
        return totalSessionCount;
    }

    /**
     * The type of OSVC service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("channelService")
    private final OsvcServiceType channelService;

    /**
     * The type of OSVC service.
     * @return the value
     **/
    public OsvcServiceType getChannelService() {
        return channelService;
    }

    /**
     * The name of the Authentication Provider to use to authenticate the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationProviderName")
    private final String authenticationProviderName;

    /**
     * The name of the Authentication Provider to use to authenticate the user.
     * @return the value
     **/
    public String getAuthenticationProviderName() {
        return authenticationProviderName;
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
        sb.append("CreateOsvcChannelResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", totalSessionCount=").append(String.valueOf(this.totalSessionCount));
        sb.append(", channelService=").append(String.valueOf(this.channelService));
        sb.append(", authenticationProviderName=")
                .append(String.valueOf(this.authenticationProviderName));
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOsvcChannelResult)) {
            return false;
        }

        CreateOsvcChannelResult other = (CreateOsvcChannelResult) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.totalSessionCount, other.totalSessionCount)
                && java.util.Objects.equals(this.channelService, other.channelService)
                && java.util.Objects.equals(
                        this.authenticationProviderName, other.authenticationProviderName)
                && java.util.Objects.equals(this.botId, other.botId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSessionCount == null ? 43 : this.totalSessionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.channelService == null ? 43 : this.channelService.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationProviderName == null
                                ? 43
                                : this.authenticationProviderName.hashCode());
        result = (result * PRIME) + (this.botId == null ? 43 : this.botId.hashCode());
        return result;
    }
}
