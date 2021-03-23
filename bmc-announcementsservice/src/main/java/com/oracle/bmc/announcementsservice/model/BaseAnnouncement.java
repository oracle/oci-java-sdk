/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * Incident information that forms the basis of an announcement. Avoid entering confidential information.
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
     * The OCID of the announcement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The reference Jira ticket number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceTicketNumber")
    String referenceTicketNumber;

    /**
     * A summary of the issue. A summary might appear in the console banner view of the announcement or in
     * an email subject line. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    String summary;

    /**
     * The label associated with an initial time value.
     * Example: `Time Started`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOneTitle")
    String timeOneTitle;
    /**
     * The type of a time associated with an initial time value. If the `timeOneTitle` attribute is present, then the `timeOneTitle` attribute contains a label of `timeOneType` in English.
     * Example: `START_TIME`
     *
     **/
    public enum TimeOneType {
        ActionRequiredBy("ACTION_REQUIRED_BY"),
        NewStartTime("NEW_START_TIME"),
        OriginalEndTime("ORIGINAL_END_TIME"),
        ReportDate("REPORT_DATE"),
        StartTime("START_TIME"),
        TimeDetected("TIME_DETECTED"),
        ;

        private final String value;
        private static java.util.Map<String, TimeOneType> map;

        static {
            map = new java.util.HashMap<>();
            for (TimeOneType v : TimeOneType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TimeOneType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TimeOneType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TimeOneType: " + key);
        }
    };
    /**
     * The type of a time associated with an initial time value. If the `timeOneTitle` attribute is present, then the `timeOneTitle` attribute contains a label of `timeOneType` in English.
     * Example: `START_TIME`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOneType")
    TimeOneType timeOneType;

    /**
     * The actual value of the first time value for the event. Typically, this denotes the time an event started, but the meaning
     * can vary, depending on the announcement type. The `timeOneType` attribute describes the meaning.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOneValue")
    java.util.Date timeOneValue;

    /**
     * The label associated with a second time value.
     * Example: `Time Ended`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTwoTitle")
    String timeTwoTitle;
    /**
     * The type of a time associated with second time value. If the `timeTwoTitle` attribute is present, then the `timeTwoTitle` attribute contains a label of `timeTwoType` in English.
     * Example: `END_TIME`
     *
     **/
    public enum TimeTwoType {
        EndTime("END_TIME"),
        NewEndTime("NEW_END_TIME"),
        ;

        private final String value;
        private static java.util.Map<String, TimeTwoType> map;

        static {
            map = new java.util.HashMap<>();
            for (TimeTwoType v : TimeTwoType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TimeTwoType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TimeTwoType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TimeTwoType: " + key);
        }
    };
    /**
     * The type of a time associated with second time value. If the `timeTwoTitle` attribute is present, then the `timeTwoTitle` attribute contains a label of `timeTwoType` in English.
     * Example: `END_TIME`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTwoType")
    TimeTwoType timeTwoType;

    /**
     * The actual value of the second time value. Typically, this denotes the time an event ended, but the meaning
     * can vary, depending on the announcement type. The `timeTwoType` attribute describes the meaning.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTwoValue")
    java.util.Date timeTwoValue;

    /**
     * Impacted Oracle Cloud Infrastructure services.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    java.util.List<String> services;

    /**
     * Impacted regions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("affectedRegions")
    java.util.List<String> affectedRegions;
    /**
     * The type of announcement. An announcement's type signals its severity.
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
            throw new IllegalArgumentException("Invalid AnnouncementType: " + key);
        }
    };
    /**
     * The type of announcement. An announcement's type signals its severity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("announcementType")
    AnnouncementType announcementType;
    /**
     * The current lifecycle state of the announcement.
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * The current lifecycle state of the announcement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Whether the announcement is displayed as a banner in the console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBanner")
    Boolean isBanner;

    /**
     * The date and time the announcement was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: `2019-01-01T17:43:01.389+0000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the announcement was last updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: `2019-01-01T17:43:01.389+0000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
}
