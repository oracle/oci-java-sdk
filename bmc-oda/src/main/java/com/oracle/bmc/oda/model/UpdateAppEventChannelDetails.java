/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties to update an Application Event channel. <br>
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
        builder = UpdateAppEventChannelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAppEventChannelDetails extends UpdateChannelDetails {
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
        /** The URL for sending errors and responses to. */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundUrl")
        private String outboundUrl;

        /**
         * The URL for sending errors and responses to.
         *
         * @param outboundUrl the value to set
         * @return this builder
         */
        public Builder outboundUrl(String outboundUrl) {
            this.outboundUrl = outboundUrl;
            this.__explicitlySet__.add("outboundUrl");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAppEventChannelDetails build() {
            UpdateAppEventChannelDetails model =
                    new UpdateAppEventChannelDetails(
                            this.name,
                            this.description,
                            this.sessionExpiryDurationInMilliseconds,
                            this.freeformTags,
                            this.definedTags,
                            this.outboundUrl,
                            this.eventSinkBotIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAppEventChannelDetails model) {
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
            if (model.wasPropertyExplicitlySet("outboundUrl")) {
                this.outboundUrl(model.getOutboundUrl());
            }
            if (model.wasPropertyExplicitlySet("eventSinkBotIds")) {
                this.eventSinkBotIds(model.getEventSinkBotIds());
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
    public UpdateAppEventChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String outboundUrl,
            java.util.List<String> eventSinkBotIds) {
        super(name, description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.outboundUrl = outboundUrl;
        this.eventSinkBotIds = eventSinkBotIds;
    }

    /** The URL for sending errors and responses to. */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundUrl")
    private final String outboundUrl;

    /**
     * The URL for sending errors and responses to.
     *
     * @return the value
     */
    public String getOutboundUrl() {
        return outboundUrl;
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
        sb.append("UpdateAppEventChannelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", outboundUrl=").append(String.valueOf(this.outboundUrl));
        sb.append(", eventSinkBotIds=").append(String.valueOf(this.eventSinkBotIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAppEventChannelDetails)) {
            return false;
        }

        UpdateAppEventChannelDetails other = (UpdateAppEventChannelDetails) o;
        return java.util.Objects.equals(this.outboundUrl, other.outboundUrl)
                && java.util.Objects.equals(this.eventSinkBotIds, other.eventSinkBotIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.outboundUrl == null ? 43 : this.outboundUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.eventSinkBotIds == null ? 43 : this.eventSinkBotIds.hashCode());
        return result;
    }
}
