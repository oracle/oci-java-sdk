/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details for one attention log entry.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttentionLogSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttentionLogSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "messageUrgency",
        "messageType",
        "messageContent",
        "timestamp",
        "scope",
        "targetUser",
        "cause",
        "action",
        "supplementalDetail",
        "fileLocation"
    })
    public AttentionLogSummary(
            MessageUrgency messageUrgency,
            MessageType messageType,
            String messageContent,
            java.util.Date timestamp,
            String scope,
            String targetUser,
            String cause,
            String action,
            String supplementalDetail,
            String fileLocation) {
        super();
        this.messageUrgency = messageUrgency;
        this.messageType = messageType;
        this.messageContent = messageContent;
        this.timestamp = timestamp;
        this.scope = scope;
        this.targetUser = targetUser;
        this.cause = cause;
        this.action = action;
        this.supplementalDetail = supplementalDetail;
        this.fileLocation = fileLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The urgency of the attention log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messageUrgency")
        private MessageUrgency messageUrgency;

        /**
         * The urgency of the attention log.
         * @param messageUrgency the value to set
         * @return this builder
         **/
        public Builder messageUrgency(MessageUrgency messageUrgency) {
            this.messageUrgency = messageUrgency;
            this.__explicitlySet__.add("messageUrgency");
            return this;
        }
        /**
         * The type of attention log message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messageType")
        private MessageType messageType;

        /**
         * The type of attention log message.
         * @param messageType the value to set
         * @return this builder
         **/
        public Builder messageType(MessageType messageType) {
            this.messageType = messageType;
            this.__explicitlySet__.add("messageType");
            return this;
        }
        /**
         * The contents of the attention log message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messageContent")
        private String messageContent;

        /**
         * The contents of the attention log message.
         * @param messageContent the value to set
         * @return this builder
         **/
        public Builder messageContent(String messageContent) {
            this.messageContent = messageContent;
            this.__explicitlySet__.add("messageContent");
            return this;
        }
        /**
         * The date and time the attention log was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the attention log was created.
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * The database scope for the attention log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * The database scope for the attention log.
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * The user who must act on the attention log message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetUser")
        private String targetUser;

        /**
         * The user who must act on the attention log message.
         * @param targetUser the value to set
         * @return this builder
         **/
        public Builder targetUser(String targetUser) {
            this.targetUser = targetUser;
            this.__explicitlySet__.add("targetUser");
            return this;
        }
        /**
         * The cause of the attention log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cause")
        private String cause;

        /**
         * The cause of the attention log.
         * @param cause the value to set
         * @return this builder
         **/
        public Builder cause(String cause) {
            this.cause = cause;
            this.__explicitlySet__.add("cause");
            return this;
        }
        /**
         * The recommended action to handle the attention log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * The recommended action to handle the attention log.
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The supplemental details of the attention log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supplementalDetail")
        private String supplementalDetail;

        /**
         * The supplemental details of the attention log.
         * @param supplementalDetail the value to set
         * @return this builder
         **/
        public Builder supplementalDetail(String supplementalDetail) {
            this.supplementalDetail = supplementalDetail;
            this.__explicitlySet__.add("supplementalDetail");
            return this;
        }
        /**
         * The attention log file location.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileLocation")
        private String fileLocation;

        /**
         * The attention log file location.
         * @param fileLocation the value to set
         * @return this builder
         **/
        public Builder fileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            this.__explicitlySet__.add("fileLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttentionLogSummary build() {
            AttentionLogSummary __instance__ =
                    new AttentionLogSummary(
                            messageUrgency,
                            messageType,
                            messageContent,
                            timestamp,
                            scope,
                            targetUser,
                            cause,
                            action,
                            supplementalDetail,
                            fileLocation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttentionLogSummary o) {
            Builder copiedBuilder =
                    messageUrgency(o.getMessageUrgency())
                            .messageType(o.getMessageType())
                            .messageContent(o.getMessageContent())
                            .timestamp(o.getTimestamp())
                            .scope(o.getScope())
                            .targetUser(o.getTargetUser())
                            .cause(o.getCause())
                            .action(o.getAction())
                            .supplementalDetail(o.getSupplementalDetail())
                            .fileLocation(o.getFileLocation());

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

    /**
     * The urgency of the attention log.
     **/
    public enum MessageUrgency {
        Immediate("IMMEDIATE"),
        Soon("SOON"),
        Deferrable("DEFERRABLE"),
        Info("INFO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MessageUrgency.class);

        private final String value;
        private static java.util.Map<String, MessageUrgency> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageUrgency v : MessageUrgency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MessageUrgency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageUrgency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MessageUrgency', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The urgency of the attention log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messageUrgency")
    private final MessageUrgency messageUrgency;

    /**
     * The urgency of the attention log.
     * @return the value
     **/
    public MessageUrgency getMessageUrgency() {
        return messageUrgency;
    }

    /**
     * The type of attention log message.
     **/
    public enum MessageType {
        Unknown("UNKNOWN"),
        IncidentError("INCIDENT_ERROR"),
        Error("ERROR"),
        Warning("WARNING"),
        Notification("NOTIFICATION"),
        Trace("TRACE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MessageType.class);

        private final String value;
        private static java.util.Map<String, MessageType> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageType v : MessageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MessageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MessageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of attention log message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messageType")
    private final MessageType messageType;

    /**
     * The type of attention log message.
     * @return the value
     **/
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * The contents of the attention log message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messageContent")
    private final String messageContent;

    /**
     * The contents of the attention log message.
     * @return the value
     **/
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * The date and time the attention log was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the attention log was created.
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The database scope for the attention log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * The database scope for the attention log.
     * @return the value
     **/
    public String getScope() {
        return scope;
    }

    /**
     * The user who must act on the attention log message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetUser")
    private final String targetUser;

    /**
     * The user who must act on the attention log message.
     * @return the value
     **/
    public String getTargetUser() {
        return targetUser;
    }

    /**
     * The cause of the attention log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cause")
    private final String cause;

    /**
     * The cause of the attention log.
     * @return the value
     **/
    public String getCause() {
        return cause;
    }

    /**
     * The recommended action to handle the attention log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * The recommended action to handle the attention log.
     * @return the value
     **/
    public String getAction() {
        return action;
    }

    /**
     * The supplemental details of the attention log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supplementalDetail")
    private final String supplementalDetail;

    /**
     * The supplemental details of the attention log.
     * @return the value
     **/
    public String getSupplementalDetail() {
        return supplementalDetail;
    }

    /**
     * The attention log file location.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileLocation")
    private final String fileLocation;

    /**
     * The attention log file location.
     * @return the value
     **/
    public String getFileLocation() {
        return fileLocation;
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
        sb.append("AttentionLogSummary(");
        sb.append("messageUrgency=").append(String.valueOf(this.messageUrgency));
        sb.append(", messageType=").append(String.valueOf(this.messageType));
        sb.append(", messageContent=").append(String.valueOf(this.messageContent));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", targetUser=").append(String.valueOf(this.targetUser));
        sb.append(", cause=").append(String.valueOf(this.cause));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", supplementalDetail=").append(String.valueOf(this.supplementalDetail));
        sb.append(", fileLocation=").append(String.valueOf(this.fileLocation));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttentionLogSummary)) {
            return false;
        }

        AttentionLogSummary other = (AttentionLogSummary) o;
        return java.util.Objects.equals(this.messageUrgency, other.messageUrgency)
                && java.util.Objects.equals(this.messageType, other.messageType)
                && java.util.Objects.equals(this.messageContent, other.messageContent)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.targetUser, other.targetUser)
                && java.util.Objects.equals(this.cause, other.cause)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.supplementalDetail, other.supplementalDetail)
                && java.util.Objects.equals(this.fileLocation, other.fileLocation)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.messageUrgency == null ? 43 : this.messageUrgency.hashCode());
        result = (result * PRIME) + (this.messageType == null ? 43 : this.messageType.hashCode());
        result =
                (result * PRIME)
                        + (this.messageContent == null ? 43 : this.messageContent.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.targetUser == null ? 43 : this.targetUser.hashCode());
        result = (result * PRIME) + (this.cause == null ? 43 : this.cause.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.supplementalDetail == null
                                ? 43
                                : this.supplementalDetail.hashCode());
        result = (result * PRIME) + (this.fileLocation == null ? 43 : this.fileLocation.hashCode());
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
