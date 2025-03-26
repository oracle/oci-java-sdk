/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * Object that represents metadata for message.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MessageMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MessageMetadata extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"channelId", "customProperties"})
    public MessageMetadata(String channelId, java.util.Map<String, String> customProperties) {
        super();
        this.channelId = channelId;
        this.customProperties = customProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The channel ID which specifies the channel to publish or retrieve messages.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("channelId")
        private String channelId;

        /**
         * The channel ID which specifies the channel to publish or retrieve messages.
         * @param channelId the value to set
         * @return this builder
         **/
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            this.__explicitlySet__.add("channelId");
            return this;
        }
        /**
         * Additional message properties
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
        private java.util.Map<String, String> customProperties;

        /**
         * Additional message properties
         * @param customProperties the value to set
         * @return this builder
         **/
        public Builder customProperties(java.util.Map<String, String> customProperties) {
            this.customProperties = customProperties;
            this.__explicitlySet__.add("customProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MessageMetadata build() {
            MessageMetadata model = new MessageMetadata(this.channelId, this.customProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MessageMetadata model) {
            if (model.wasPropertyExplicitlySet("channelId")) {
                this.channelId(model.getChannelId());
            }
            if (model.wasPropertyExplicitlySet("customProperties")) {
                this.customProperties(model.getCustomProperties());
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

    /**
     * The channel ID which specifies the channel to publish or retrieve messages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("channelId")
    private final String channelId;

    /**
     * The channel ID which specifies the channel to publish or retrieve messages.
     * @return the value
     **/
    public String getChannelId() {
        return channelId;
    }

    /**
     * Additional message properties
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
    private final java.util.Map<String, String> customProperties;

    /**
     * Additional message properties
     * @return the value
     **/
    public java.util.Map<String, String> getCustomProperties() {
        return customProperties;
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
        sb.append("MessageMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("channelId=").append(String.valueOf(this.channelId));
        sb.append(", customProperties=").append(String.valueOf(this.customProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageMetadata)) {
            return false;
        }

        MessageMetadata other = (MessageMetadata) o;
        return java.util.Objects.equals(this.channelId, other.channelId)
                && java.util.Objects.equals(this.customProperties, other.customProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.channelId == null ? 43 : this.channelId.hashCode());
        result =
                (result * PRIME)
                        + (this.customProperties == null ? 43 : this.customProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
