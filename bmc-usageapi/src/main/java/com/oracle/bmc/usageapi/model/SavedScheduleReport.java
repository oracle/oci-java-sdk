/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * notification to customer.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SavedScheduleReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SavedScheduleReport {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notificationType")
        private NotificationType notificationType;

        public Builder notificationType(NotificationType notificationType) {
            this.notificationType = notificationType;
            this.__explicitlySet__.add("notificationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notificationTarget")
        private String notificationTarget;

        public Builder notificationTarget(String notificationTarget) {
            this.notificationTarget = notificationTarget;
            this.__explicitlySet__.add("notificationTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SavedScheduleReport build() {
            SavedScheduleReport __instance__ =
                    new SavedScheduleReport(displayName, notificationType, notificationTarget);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SavedScheduleReport o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .notificationType(o.getNotificationType())
                            .notificationTarget(o.getNotificationTarget());

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

    /**
     * the name of notification
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;
    /**
     * notification type, eg EMAIL.
     **/
    public enum NotificationType {
        Email("EMAIL"),
        ;

        private final String value;
        private static java.util.Map<String, NotificationType> map;

        static {
            map = new java.util.HashMap<>();
            for (NotificationType v : NotificationType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid NotificationType: " + key);
        }
    };
    /**
     * notification type, eg EMAIL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationType")
    NotificationType notificationType;

    /**
     * notification destination.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTarget")
    String notificationTarget;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
