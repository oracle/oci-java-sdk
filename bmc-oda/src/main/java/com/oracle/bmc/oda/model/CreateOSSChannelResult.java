/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The configuration for an Oracle Streaming Service (OSS) channel.
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
    builder = CreateOSSChannelResult.Builder.class
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
public class CreateOSSChannelResult extends CreateChannelResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("eventSinkBotIds")
        private java.util.List<String> eventSinkBotIds;

        public Builder eventSinkBotIds(java.util.List<String> eventSinkBotIds) {
            this.eventSinkBotIds = eventSinkBotIds;
            this.__explicitlySet__.add("eventSinkBotIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inboundMessageTopic")
        private String inboundMessageTopic;

        public Builder inboundMessageTopic(String inboundMessageTopic) {
            this.inboundMessageTopic = inboundMessageTopic;
            this.__explicitlySet__.add("inboundMessageTopic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outboundMessageTopic")
        private String outboundMessageTopic;

        public Builder outboundMessageTopic(String outboundMessageTopic) {
            this.outboundMessageTopic = outboundMessageTopic;
            this.__explicitlySet__.add("outboundMessageTopic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
        private String bootstrapServers;

        public Builder bootstrapServers(String bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            this.__explicitlySet__.add("bootstrapServers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private String securityProtocol;

        public Builder securityProtocol(String securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("saslMechanism")
        private String saslMechanism;

        public Builder saslMechanism(String saslMechanism) {
            this.saslMechanism = saslMechanism;
            this.__explicitlySet__.add("saslMechanism");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
        private String streamPoolId;

        public Builder streamPoolId(String streamPoolId) {
            this.streamPoolId = streamPoolId;
            this.__explicitlySet__.add("streamPoolId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOSSChannelResult build() {
            CreateOSSChannelResult __instance__ =
                    new CreateOSSChannelResult(
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
                            eventSinkBotIds,
                            inboundMessageTopic,
                            outboundMessageTopic,
                            bootstrapServers,
                            securityProtocol,
                            saslMechanism,
                            tenancyName,
                            userName,
                            streamPoolId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOSSChannelResult o) {
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
                            .eventSinkBotIds(o.getEventSinkBotIds())
                            .inboundMessageTopic(o.getInboundMessageTopic())
                            .outboundMessageTopic(o.getOutboundMessageTopic())
                            .bootstrapServers(o.getBootstrapServers())
                            .securityProtocol(o.getSecurityProtocol())
                            .saslMechanism(o.getSaslMechanism())
                            .tenancyName(o.getTenancyName())
                            .userName(o.getUserName())
                            .streamPoolId(o.getStreamPoolId());

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
    public CreateOSSChannelResult(
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
            java.util.List<String> eventSinkBotIds,
            String inboundMessageTopic,
            String outboundMessageTopic,
            String bootstrapServers,
            String securityProtocol,
            String saslMechanism,
            String tenancyName,
            String userName,
            String streamPoolId) {
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
        this.eventSinkBotIds = eventSinkBotIds;
        this.inboundMessageTopic = inboundMessageTopic;
        this.outboundMessageTopic = outboundMessageTopic;
        this.bootstrapServers = bootstrapServers;
        this.securityProtocol = securityProtocol;
        this.saslMechanism = saslMechanism;
        this.tenancyName = tenancyName;
        this.userName = userName;
        this.streamPoolId = streamPoolId;
    }

    /**
     * The IDs of the Skills and Digital Assistants that the Channel is routed to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventSinkBotIds")
    java.util.List<String> eventSinkBotIds;

    /**
     * The topic inbound messages are received on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inboundMessageTopic")
    String inboundMessageTopic;

    /**
     * The topic outbound messages are sent on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outboundMessageTopic")
    String outboundMessageTopic;

    /**
     * The Oracle Streaming Service bootstrap servers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    String bootstrapServers;

    /**
     * The security protocol to use when conecting to the Oracle Streaming Service. See Oracle Streaming Service documentation for a list of valid values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    String securityProtocol;

    /**
     * The SASL mechanmism to use when conecting to the Oracle Streaming Service. See Oracle Streaming Service documentation for a list of valid values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("saslMechanism")
    String saslMechanism;

    /**
     * The tenancy to use when connecting to the Oracle Streaming Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    String tenancyName;

    /**
     * The user name to use when connecting to the Oracle Streaming Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;

    /**
     * The stream pool OCI to use when connecting to the Oracle Streaming Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
    String streamPoolId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
