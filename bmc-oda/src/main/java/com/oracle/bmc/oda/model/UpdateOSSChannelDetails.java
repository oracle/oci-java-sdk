/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties to update an Oracle Streaming Service (OSS) channel. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOSSChannelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateOSSChannelDetails extends UpdateChannelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The IDs of the Skills and Digital Assistants that the Channel is routed to. */
        @com.fasterxml.jackson.annotation.JsonProperty("eventSinkBotIds")
        private java.util.List<String> eventSinkBotIds;

        /**
         * The IDs of the Skills and Digital Assistants that the Channel is routed to.
         *
         * @param eventSinkBotIds the value to set
         * @return this builder
         */
        public Builder eventSinkBotIds(java.util.List<String> eventSinkBotIds) {
            this.eventSinkBotIds = eventSinkBotIds;
            this.__explicitlySet__.add("eventSinkBotIds");
            return this;
        }
        /** The topic inbound messages are received on. */
        @com.fasterxml.jackson.annotation.JsonProperty("inboundMessageTopic")
        private String inboundMessageTopic;

        /**
         * The topic inbound messages are received on.
         *
         * @param inboundMessageTopic the value to set
         * @return this builder
         */
        public Builder inboundMessageTopic(String inboundMessageTopic) {
            this.inboundMessageTopic = inboundMessageTopic;
            this.__explicitlySet__.add("inboundMessageTopic");
            return this;
        }
        /** The topic outbound messages are sent on. */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundMessageTopic")
        private String outboundMessageTopic;

        /**
         * The topic outbound messages are sent on.
         *
         * @param outboundMessageTopic the value to set
         * @return this builder
         */
        public Builder outboundMessageTopic(String outboundMessageTopic) {
            this.outboundMessageTopic = outboundMessageTopic;
            this.__explicitlySet__.add("outboundMessageTopic");
            return this;
        }
        /** The Oracle Streaming Service bootstrap servers. */
        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
        private String bootstrapServers;

        /**
         * The Oracle Streaming Service bootstrap servers.
         *
         * @param bootstrapServers the value to set
         * @return this builder
         */
        public Builder bootstrapServers(String bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            this.__explicitlySet__.add("bootstrapServers");
            return this;
        }
        /**
         * The security protocol to use when conecting to the Oracle Streaming Service. See Oracle
         * Streaming Service documentation for a list of valid values.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private String securityProtocol;

        /**
         * The security protocol to use when conecting to the Oracle Streaming Service. See Oracle
         * Streaming Service documentation for a list of valid values.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(String securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * The SASL mechanmism to use when conecting to the Oracle Streaming Service. See Oracle
         * Streaming Service documentation for a list of valid values.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("saslMechanism")
        private String saslMechanism;

        /**
         * The SASL mechanmism to use when conecting to the Oracle Streaming Service. See Oracle
         * Streaming Service documentation for a list of valid values.
         *
         * @param saslMechanism the value to set
         * @return this builder
         */
        public Builder saslMechanism(String saslMechanism) {
            this.saslMechanism = saslMechanism;
            this.__explicitlySet__.add("saslMechanism");
            return this;
        }
        /** The tenancy to use when connecting to the Oracle Streaming Service. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        /**
         * The tenancy to use when connecting to the Oracle Streaming Service.
         *
         * @param tenancyName the value to set
         * @return this builder
         */
        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }
        /** The user name to use when connecting to the Oracle Streaming Service. */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The user name to use when connecting to the Oracle Streaming Service.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** The stream pool OCI to use when connecting to the Oracle Streaming Service. */
        @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
        private String streamPoolId;

        /**
         * The stream pool OCI to use when connecting to the Oracle Streaming Service.
         *
         * @param streamPoolId the value to set
         * @return this builder
         */
        public Builder streamPoolId(String streamPoolId) {
            this.streamPoolId = streamPoolId;
            this.__explicitlySet__.add("streamPoolId");
            return this;
        }
        /** The authentication token to use when connecting to the Oracle Streaming Service. */
        @com.fasterxml.jackson.annotation.JsonProperty("authToken")
        private String authToken;

        /**
         * The authentication token to use when connecting to the Oracle Streaming Service.
         *
         * @param authToken the value to set
         * @return this builder
         */
        public Builder authToken(String authToken) {
            this.authToken = authToken;
            this.__explicitlySet__.add("authToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOSSChannelDetails build() {
            UpdateOSSChannelDetails model =
                    new UpdateOSSChannelDetails(
                            this.description,
                            this.sessionExpiryDurationInMilliseconds,
                            this.freeformTags,
                            this.definedTags,
                            this.eventSinkBotIds,
                            this.inboundMessageTopic,
                            this.outboundMessageTopic,
                            this.bootstrapServers,
                            this.securityProtocol,
                            this.saslMechanism,
                            this.tenancyName,
                            this.userName,
                            this.streamPoolId,
                            this.authToken);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOSSChannelDetails model) {
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
            if (model.wasPropertyExplicitlySet("eventSinkBotIds")) {
                this.eventSinkBotIds(model.getEventSinkBotIds());
            }
            if (model.wasPropertyExplicitlySet("inboundMessageTopic")) {
                this.inboundMessageTopic(model.getInboundMessageTopic());
            }
            if (model.wasPropertyExplicitlySet("outboundMessageTopic")) {
                this.outboundMessageTopic(model.getOutboundMessageTopic());
            }
            if (model.wasPropertyExplicitlySet("bootstrapServers")) {
                this.bootstrapServers(model.getBootstrapServers());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("saslMechanism")) {
                this.saslMechanism(model.getSaslMechanism());
            }
            if (model.wasPropertyExplicitlySet("tenancyName")) {
                this.tenancyName(model.getTenancyName());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("streamPoolId")) {
                this.streamPoolId(model.getStreamPoolId());
            }
            if (model.wasPropertyExplicitlySet("authToken")) {
                this.authToken(model.getAuthToken());
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
    public UpdateOSSChannelDetails(
            String description,
            Long sessionExpiryDurationInMilliseconds,
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
            String streamPoolId,
            String authToken) {
        super(description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.eventSinkBotIds = eventSinkBotIds;
        this.inboundMessageTopic = inboundMessageTopic;
        this.outboundMessageTopic = outboundMessageTopic;
        this.bootstrapServers = bootstrapServers;
        this.securityProtocol = securityProtocol;
        this.saslMechanism = saslMechanism;
        this.tenancyName = tenancyName;
        this.userName = userName;
        this.streamPoolId = streamPoolId;
        this.authToken = authToken;
    }

    /** The IDs of the Skills and Digital Assistants that the Channel is routed to. */
    @com.fasterxml.jackson.annotation.JsonProperty("eventSinkBotIds")
    private final java.util.List<String> eventSinkBotIds;

    /**
     * The IDs of the Skills and Digital Assistants that the Channel is routed to.
     *
     * @return the value
     */
    public java.util.List<String> getEventSinkBotIds() {
        return eventSinkBotIds;
    }

    /** The topic inbound messages are received on. */
    @com.fasterxml.jackson.annotation.JsonProperty("inboundMessageTopic")
    private final String inboundMessageTopic;

    /**
     * The topic inbound messages are received on.
     *
     * @return the value
     */
    public String getInboundMessageTopic() {
        return inboundMessageTopic;
    }

    /** The topic outbound messages are sent on. */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundMessageTopic")
    private final String outboundMessageTopic;

    /**
     * The topic outbound messages are sent on.
     *
     * @return the value
     */
    public String getOutboundMessageTopic() {
        return outboundMessageTopic;
    }

    /** The Oracle Streaming Service bootstrap servers. */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    private final String bootstrapServers;

    /**
     * The Oracle Streaming Service bootstrap servers.
     *
     * @return the value
     */
    public String getBootstrapServers() {
        return bootstrapServers;
    }

    /**
     * The security protocol to use when conecting to the Oracle Streaming Service. See Oracle
     * Streaming Service documentation for a list of valid values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final String securityProtocol;

    /**
     * The security protocol to use when conecting to the Oracle Streaming Service. See Oracle
     * Streaming Service documentation for a list of valid values.
     *
     * @return the value
     */
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * The SASL mechanmism to use when conecting to the Oracle Streaming Service. See Oracle
     * Streaming Service documentation for a list of valid values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("saslMechanism")
    private final String saslMechanism;

    /**
     * The SASL mechanmism to use when conecting to the Oracle Streaming Service. See Oracle
     * Streaming Service documentation for a list of valid values.
     *
     * @return the value
     */
    public String getSaslMechanism() {
        return saslMechanism;
    }

    /** The tenancy to use when connecting to the Oracle Streaming Service. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    private final String tenancyName;

    /**
     * The tenancy to use when connecting to the Oracle Streaming Service.
     *
     * @return the value
     */
    public String getTenancyName() {
        return tenancyName;
    }

    /** The user name to use when connecting to the Oracle Streaming Service. */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The user name to use when connecting to the Oracle Streaming Service.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** The stream pool OCI to use when connecting to the Oracle Streaming Service. */
    @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
    private final String streamPoolId;

    /**
     * The stream pool OCI to use when connecting to the Oracle Streaming Service.
     *
     * @return the value
     */
    public String getStreamPoolId() {
        return streamPoolId;
    }

    /** The authentication token to use when connecting to the Oracle Streaming Service. */
    @com.fasterxml.jackson.annotation.JsonProperty("authToken")
    private final String authToken;

    /**
     * The authentication token to use when connecting to the Oracle Streaming Service.
     *
     * @return the value
     */
    public String getAuthToken() {
        return authToken;
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
        sb.append("UpdateOSSChannelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", eventSinkBotIds=").append(String.valueOf(this.eventSinkBotIds));
        sb.append(", inboundMessageTopic=").append(String.valueOf(this.inboundMessageTopic));
        sb.append(", outboundMessageTopic=").append(String.valueOf(this.outboundMessageTopic));
        sb.append(", bootstrapServers=").append(String.valueOf(this.bootstrapServers));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", saslMechanism=").append(String.valueOf(this.saslMechanism));
        sb.append(", tenancyName=").append(String.valueOf(this.tenancyName));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", streamPoolId=").append(String.valueOf(this.streamPoolId));
        sb.append(", authToken=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOSSChannelDetails)) {
            return false;
        }

        UpdateOSSChannelDetails other = (UpdateOSSChannelDetails) o;
        return java.util.Objects.equals(this.eventSinkBotIds, other.eventSinkBotIds)
                && java.util.Objects.equals(this.inboundMessageTopic, other.inboundMessageTopic)
                && java.util.Objects.equals(this.outboundMessageTopic, other.outboundMessageTopic)
                && java.util.Objects.equals(this.bootstrapServers, other.bootstrapServers)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.saslMechanism, other.saslMechanism)
                && java.util.Objects.equals(this.tenancyName, other.tenancyName)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.streamPoolId, other.streamPoolId)
                && java.util.Objects.equals(this.authToken, other.authToken)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.eventSinkBotIds == null ? 43 : this.eventSinkBotIds.hashCode());
        result =
                (result * PRIME)
                        + (this.inboundMessageTopic == null
                                ? 43
                                : this.inboundMessageTopic.hashCode());
        result =
                (result * PRIME)
                        + (this.outboundMessageTopic == null
                                ? 43
                                : this.outboundMessageTopic.hashCode());
        result =
                (result * PRIME)
                        + (this.bootstrapServers == null ? 43 : this.bootstrapServers.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.saslMechanism == null ? 43 : this.saslMechanism.hashCode());
        result = (result * PRIME) + (this.tenancyName == null ? 43 : this.tenancyName.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.streamPoolId == null ? 43 : this.streamPoolId.hashCode());
        result = (result * PRIME) + (this.authToken == null ? 43 : this.authToken.hashCode());
        return result;
    }
}
