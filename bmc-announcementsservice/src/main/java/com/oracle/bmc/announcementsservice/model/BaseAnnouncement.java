/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * Base for announcements and incidents
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = BaseAnnouncement.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AnnouncementSummary.class,
        name = "AnnouncementSummary"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Announcement.class,
        name = "Announcement"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BaseAnnouncement {

    /**
     * The OCID of the announcement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The reference JIRA ticket number
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceTicketNumber")
    String referenceTicketNumber;

    /**
     * Forms part of the email subject and/or the console representation (a banner or alike)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    String summary;

    /**
     * The title of the first time value, e.g. Time Started
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOneTitle")
    String timeOneTitle;

    /**
     * The first time value, actual meaning depending on notification type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOneValue")
    java.util.Date timeOneValue;

    /**
     * The title of the second time value, e.g. Time Ended
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTwoTitle")
    String timeTwoTitle;

    /**
     * The second time value, actual meaning depending on notification type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTwoValue")
    java.util.Date timeTwoValue;

    /**
     * Impacted services
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    java.util.List<String> services;

    /**
     * Impacted regions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("affectedRegions")
    java.util.List<String> affectedRegions;
    /**
     * The detailed description of an announcement
     **/
    public enum AnnouncementType {
        ActionRecommended("ACTION_RECOMMENDED"),
        ActionRequired("ACTION_REQUIRED"),
        EmergencyChange("EMERGENCY_CHANGE"),
        EmergencyMaintenance("EMERGENCY_MAINTENANCE"),
        EmergencyMaintenanceComplete("EMERGENCY_MAINTENANCE_COMPLETE"),
        EmergencyMaintenanceExtended("EMERGENCY_MAINTENANCE_EXTENDED"),
        EmergencyMaintenanceRescheduled("EMERGENCY_MAINTENANCE_RESCHEDULED"),
        Information("INFORMATION"),
        PlannedChange("PLANNED_CHANGE"),
        PlannedChangeComplete("PLANNED_CHANGE_COMPLETE"),
        PlannedChangeExtended("PLANNED_CHANGE_EXTENDED"),
        PlannedChangeRescheduled("PLANNED_CHANGE_RESCHEDULED"),
        ProductionEventNotification("PRODUCTION_EVENT_NOTIFICATION"),
        ScheduledMaintenance("SCHEDULED_MAINTENANCE"),
        ;

        private final String value;
        private static java.util.Map<String, AnnouncementType> map;

        static {
            map = new java.util.HashMap<>();
            for (AnnouncementType v : AnnouncementType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AnnouncementType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AnnouncementType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid AnnouncementType: " + key);
        }
    };
    /**
     * The detailed description of an announcement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("announcementType")
    AnnouncementType announcementType;
    /**
     * Lifecycle states of announcement
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * Lifecycle states of announcement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Show announcement as a banner
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBanner")
    Boolean isBanner;

    /**
     * The date and time the announcement was created, in the format defined by RFC3339
     * Example: `2016-07-22T17:43:01.389+0000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the announcement was last updated, in the format defined by RFC3339
     * Example: `2016-07-22T17:43:01.389+0000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
}
