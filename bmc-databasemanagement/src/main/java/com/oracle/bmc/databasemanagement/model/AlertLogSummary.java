/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The detail for one alert log entry. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AlertLogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AlertLogSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "messageLevel",
        "messageType",
        "messageContent",
        "timestamp",
        "supplementalDetail",
        "fileLocation"
    })
    public AlertLogSummary(
            MessageLevel messageLevel,
            MessageType messageType,
            String messageContent,
            java.util.Date timestamp,
            String supplementalDetail,
            String fileLocation) {
        super();
        this.messageLevel = messageLevel;
        this.messageType = messageType;
        this.messageContent = messageContent;
        this.timestamp = timestamp;
        this.supplementalDetail = supplementalDetail;
        this.fileLocation = fileLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The level of the alert log. */
        @com.fasterxml.jackson.annotation.JsonProperty("messageLevel")
        private MessageLevel messageLevel;

        /**
         * The level of the alert log.
         *
         * @param messageLevel the value to set
         * @return this builder
         */
        public Builder messageLevel(MessageLevel messageLevel) {
            this.messageLevel = messageLevel;
            this.__explicitlySet__.add("messageLevel");
            return this;
        }
        /** The type of alert log message. */
        @com.fasterxml.jackson.annotation.JsonProperty("messageType")
        private MessageType messageType;

        /**
         * The type of alert log message.
         *
         * @param messageType the value to set
         * @return this builder
         */
        public Builder messageType(MessageType messageType) {
            this.messageType = messageType;
            this.__explicitlySet__.add("messageType");
            return this;
        }
        /** The contents of the alert log message. */
        @com.fasterxml.jackson.annotation.JsonProperty("messageContent")
        private String messageContent;

        /**
         * The contents of the alert log message.
         *
         * @param messageContent the value to set
         * @return this builder
         */
        public Builder messageContent(String messageContent) {
            this.messageContent = messageContent;
            this.__explicitlySet__.add("messageContent");
            return this;
        }
        /** The date and time the alert log was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the alert log was created.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** The supplemental details of the alert log. */
        @com.fasterxml.jackson.annotation.JsonProperty("supplementalDetail")
        private String supplementalDetail;

        /**
         * The supplemental details of the alert log.
         *
         * @param supplementalDetail the value to set
         * @return this builder
         */
        public Builder supplementalDetail(String supplementalDetail) {
            this.supplementalDetail = supplementalDetail;
            this.__explicitlySet__.add("supplementalDetail");
            return this;
        }
        /** The alert log file location. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileLocation")
        private String fileLocation;

        /**
         * The alert log file location.
         *
         * @param fileLocation the value to set
         * @return this builder
         */
        public Builder fileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            this.__explicitlySet__.add("fileLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlertLogSummary build() {
            AlertLogSummary model =
                    new AlertLogSummary(
                            this.messageLevel,
                            this.messageType,
                            this.messageContent,
                            this.timestamp,
                            this.supplementalDetail,
                            this.fileLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlertLogSummary model) {
            if (model.wasPropertyExplicitlySet("messageLevel")) {
                this.messageLevel(model.getMessageLevel());
            }
            if (model.wasPropertyExplicitlySet("messageType")) {
                this.messageType(model.getMessageType());
            }
            if (model.wasPropertyExplicitlySet("messageContent")) {
                this.messageContent(model.getMessageContent());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("supplementalDetail")) {
                this.supplementalDetail(model.getSupplementalDetail());
            }
            if (model.wasPropertyExplicitlySet("fileLocation")) {
                this.fileLocation(model.getFileLocation());
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

    /** The level of the alert log. */
    public enum MessageLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Critical("CRITICAL"),
        Severe("SEVERE"),
        Important("IMPORTANT"),
        Normal("NORMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MessageLevel.class);

        private final String value;
        private static java.util.Map<String, MessageLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageLevel v : MessageLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MessageLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MessageLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The level of the alert log. */
    @com.fasterxml.jackson.annotation.JsonProperty("messageLevel")
    private final MessageLevel messageLevel;

    /**
     * The level of the alert log.
     *
     * @return the value
     */
    public MessageLevel getMessageLevel() {
        return messageLevel;
    }

    /** The type of alert log message. */
    public enum MessageType implements com.oracle.bmc.http.internal.BmcEnum {
        Unknown("UNKNOWN"),
        IncidentError("INCIDENT_ERROR"),
        Error("ERROR"),
        Warning("WARNING"),
        Notification("NOTIFICATION"),
        Trace("TRACE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The type of alert log message. */
    @com.fasterxml.jackson.annotation.JsonProperty("messageType")
    private final MessageType messageType;

    /**
     * The type of alert log message.
     *
     * @return the value
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /** The contents of the alert log message. */
    @com.fasterxml.jackson.annotation.JsonProperty("messageContent")
    private final String messageContent;

    /**
     * The contents of the alert log message.
     *
     * @return the value
     */
    public String getMessageContent() {
        return messageContent;
    }

    /** The date and time the alert log was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the alert log was created.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** The supplemental details of the alert log. */
    @com.fasterxml.jackson.annotation.JsonProperty("supplementalDetail")
    private final String supplementalDetail;

    /**
     * The supplemental details of the alert log.
     *
     * @return the value
     */
    public String getSupplementalDetail() {
        return supplementalDetail;
    }

    /** The alert log file location. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileLocation")
    private final String fileLocation;

    /**
     * The alert log file location.
     *
     * @return the value
     */
    public String getFileLocation() {
        return fileLocation;
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
        sb.append("AlertLogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("messageLevel=").append(String.valueOf(this.messageLevel));
        sb.append(", messageType=").append(String.valueOf(this.messageType));
        sb.append(", messageContent=").append(String.valueOf(this.messageContent));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", supplementalDetail=").append(String.valueOf(this.supplementalDetail));
        sb.append(", fileLocation=").append(String.valueOf(this.fileLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlertLogSummary)) {
            return false;
        }

        AlertLogSummary other = (AlertLogSummary) o;
        return java.util.Objects.equals(this.messageLevel, other.messageLevel)
                && java.util.Objects.equals(this.messageType, other.messageType)
                && java.util.Objects.equals(this.messageContent, other.messageContent)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.supplementalDetail, other.supplementalDetail)
                && java.util.Objects.equals(this.fileLocation, other.fileLocation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.messageLevel == null ? 43 : this.messageLevel.hashCode());
        result = (result * PRIME) + (this.messageType == null ? 43 : this.messageType.hashCode());
        result =
                (result * PRIME)
                        + (this.messageContent == null ? 43 : this.messageContent.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.supplementalDetail == null
                                ? 43
                                : this.supplementalDetail.hashCode());
        result = (result * PRIME) + (this.fileLocation == null ? 43 : this.fileLocation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
