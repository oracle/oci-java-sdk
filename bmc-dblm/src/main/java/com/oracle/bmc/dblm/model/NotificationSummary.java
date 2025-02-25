/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Notifications <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NotificationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NotificationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "notificationType",
        "notificationText",
        "id",
        "timePublished"
    })
    public NotificationSummary(
            NotificationType notificationType,
            String notificationText,
            String id,
            java.util.Date timePublished) {
        super();
        this.notificationType = notificationType;
        this.notificationText = notificationText;
        this.id = id;
        this.timePublished = timePublished;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Notification type */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationType")
        private NotificationType notificationType;

        /**
         * Notification type
         *
         * @param notificationType the value to set
         * @return this builder
         */
        public Builder notificationType(NotificationType notificationType) {
            this.notificationType = notificationType;
            this.__explicitlySet__.add("notificationType");
            return this;
        }
        /** Notification text */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationText")
        private String notificationText;

        /**
         * Notification text
         *
         * @param notificationText the value to set
         * @return this builder
         */
        public Builder notificationText(String notificationText) {
            this.notificationText = notificationText;
            this.__explicitlySet__.add("notificationText");
            return this;
        }
        /** Notification identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Notification identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Published date */
        @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
        private java.util.Date timePublished;

        /**
         * Published date
         *
         * @param timePublished the value to set
         * @return this builder
         */
        public Builder timePublished(java.util.Date timePublished) {
            this.timePublished = timePublished;
            this.__explicitlySet__.add("timePublished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NotificationSummary build() {
            NotificationSummary model =
                    new NotificationSummary(
                            this.notificationType,
                            this.notificationText,
                            this.id,
                            this.timePublished);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotificationSummary model) {
            if (model.wasPropertyExplicitlySet("notificationType")) {
                this.notificationType(model.getNotificationType());
            }
            if (model.wasPropertyExplicitlySet("notificationText")) {
                this.notificationText(model.getNotificationText());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timePublished")) {
                this.timePublished(model.getTimePublished());
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

    /** Notification type */
    public enum NotificationType implements com.oracle.bmc.http.internal.BmcEnum {
        Cve("CVE"),
        Advisory("ADVISORY"),
        Patch("PATCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NotificationType.class);

        private final String value;
        private static java.util.Map<String, NotificationType> map;

        static {
            map = new java.util.HashMap<>();
            for (NotificationType v : NotificationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NotificationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NotificationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NotificationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Notification type */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationType")
    private final NotificationType notificationType;

    /**
     * Notification type
     *
     * @return the value
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /** Notification text */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationText")
    private final String notificationText;

    /**
     * Notification text
     *
     * @return the value
     */
    public String getNotificationText() {
        return notificationText;
    }

    /** Notification identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Notification identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Published date */
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    private final java.util.Date timePublished;

    /**
     * Published date
     *
     * @return the value
     */
    public java.util.Date getTimePublished() {
        return timePublished;
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
        sb.append("NotificationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("notificationType=").append(String.valueOf(this.notificationType));
        sb.append(", notificationText=").append(String.valueOf(this.notificationText));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", timePublished=").append(String.valueOf(this.timePublished));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationSummary)) {
            return false;
        }

        NotificationSummary other = (NotificationSummary) o;
        return java.util.Objects.equals(this.notificationType, other.notificationType)
                && java.util.Objects.equals(this.notificationText, other.notificationText)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timePublished, other.timePublished)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.notificationType == null ? 43 : this.notificationType.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationText == null ? 43 : this.notificationText.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.timePublished == null ? 43 : this.timePublished.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
