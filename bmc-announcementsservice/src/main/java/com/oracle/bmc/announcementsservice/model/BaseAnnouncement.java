/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "referenceTicketNumber",
        "summary",
        "timeOneTitle",
        "timeOneType",
        "timeOneValue",
        "timeTwoTitle",
        "timeTwoType",
        "timeTwoValue",
        "services",
        "affectedRegions",
        "announcementType",
        "lifecycleState",
        "isBanner",
        "timeCreated",
        "timeUpdated",
        "environmentName",
        "platformType"
    })
    protected BaseAnnouncement(
            String id,
            String referenceTicketNumber,
            String summary,
            String timeOneTitle,
            TimeOneType timeOneType,
            java.util.Date timeOneValue,
            String timeTwoTitle,
            TimeTwoType timeTwoType,
            java.util.Date timeTwoValue,
            java.util.List<String> services,
            java.util.List<String> affectedRegions,
            AnnouncementType announcementType,
            LifecycleState lifecycleState,
            Boolean isBanner,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String environmentName,
            PlatformType platformType) {
        super();
        this.id = id;
        this.referenceTicketNumber = referenceTicketNumber;
        this.summary = summary;
        this.timeOneTitle = timeOneTitle;
        this.timeOneType = timeOneType;
        this.timeOneValue = timeOneValue;
        this.timeTwoTitle = timeTwoTitle;
        this.timeTwoType = timeTwoType;
        this.timeTwoValue = timeTwoValue;
        this.services = services;
        this.affectedRegions = affectedRegions;
        this.announcementType = announcementType;
        this.lifecycleState = lifecycleState;
        this.isBanner = isBanner;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.environmentName = environmentName;
        this.platformType = platformType;
    }

    /**
     * The OCID of the announcement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the announcement.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The reference Jira ticket number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceTicketNumber")
    private final String referenceTicketNumber;

    /**
     * The reference Jira ticket number.
     * @return the value
     **/
    public String getReferenceTicketNumber() {
        return referenceTicketNumber;
    }

    /**
     * A summary of the issue. A summary might appear in the console banner view of the announcement or in
     * an email subject line. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * A summary of the issue. A summary might appear in the console banner view of the announcement or in
     * an email subject line. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getSummary() {
        return summary;
    }

    /**
     * The label associated with an initial time value.
     * Example: {@code Time Started}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOneTitle")
    private final String timeOneTitle;

    /**
     * The label associated with an initial time value.
     * Example: {@code Time Started}
     *
     * @return the value
     **/
    public String getTimeOneTitle() {
        return timeOneTitle;
    }

    /**
     * The type of a time associated with an initial time value. If the {@code timeOneTitle} attribute is present, then the {@code timeOneTitle} attribute contains a label of {@code timeOneType} in English.
     * Example: {@code START_TIME}
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
     * The type of a time associated with an initial time value. If the {@code timeOneTitle} attribute is present, then the {@code timeOneTitle} attribute contains a label of {@code timeOneType} in English.
     * Example: {@code START_TIME}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOneType")
    private final TimeOneType timeOneType;

    /**
     * The type of a time associated with an initial time value. If the {@code timeOneTitle} attribute is present, then the {@code timeOneTitle} attribute contains a label of {@code timeOneType} in English.
     * Example: {@code START_TIME}
     *
     * @return the value
     **/
    public TimeOneType getTimeOneType() {
        return timeOneType;
    }

    /**
     * The actual value of the first time value for the event. Typically, this denotes the time an event started, but the meaning
     * can vary, depending on the announcement type. The {@code timeOneType} attribute describes the meaning.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOneValue")
    private final java.util.Date timeOneValue;

    /**
     * The actual value of the first time value for the event. Typically, this denotes the time an event started, but the meaning
     * can vary, depending on the announcement type. The {@code timeOneType} attribute describes the meaning.
     *
     * @return the value
     **/
    public java.util.Date getTimeOneValue() {
        return timeOneValue;
    }

    /**
     * The label associated with a second time value.
     * Example: {@code Time Ended}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTwoTitle")
    private final String timeTwoTitle;

    /**
     * The label associated with a second time value.
     * Example: {@code Time Ended}
     *
     * @return the value
     **/
    public String getTimeTwoTitle() {
        return timeTwoTitle;
    }

    /**
     * The type of a time associated with second time value. If the {@code timeTwoTitle} attribute is present, then the {@code timeTwoTitle} attribute contains a label of {@code timeTwoType} in English.
     * Example: {@code END_TIME}
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
     * The type of a time associated with second time value. If the {@code timeTwoTitle} attribute is present, then the {@code timeTwoTitle} attribute contains a label of {@code timeTwoType} in English.
     * Example: {@code END_TIME}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTwoType")
    private final TimeTwoType timeTwoType;

    /**
     * The type of a time associated with second time value. If the {@code timeTwoTitle} attribute is present, then the {@code timeTwoTitle} attribute contains a label of {@code timeTwoType} in English.
     * Example: {@code END_TIME}
     *
     * @return the value
     **/
    public TimeTwoType getTimeTwoType() {
        return timeTwoType;
    }

    /**
     * The actual value of the second time value. Typically, this denotes the time an event ended, but the meaning
     * can vary, depending on the announcement type. The {@code timeTwoType} attribute describes the meaning.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTwoValue")
    private final java.util.Date timeTwoValue;

    /**
     * The actual value of the second time value. Typically, this denotes the time an event ended, but the meaning
     * can vary, depending on the announcement type. The {@code timeTwoType} attribute describes the meaning.
     *
     * @return the value
     **/
    public java.util.Date getTimeTwoValue() {
        return timeTwoValue;
    }

    /**
     * Impacted Oracle Cloud Infrastructure services.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<String> services;

    /**
     * Impacted Oracle Cloud Infrastructure services.
     * @return the value
     **/
    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * Impacted regions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("affectedRegions")
    private final java.util.List<String> affectedRegions;

    /**
     * Impacted regions.
     * @return the value
     **/
    public java.util.List<String> getAffectedRegions() {
        return affectedRegions;
    }

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
    private final AnnouncementType announcementType;

    /**
     * The type of announcement. An announcement's type signals its severity.
     * @return the value
     **/
    public AnnouncementType getAnnouncementType() {
        return announcementType;
    }

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
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the announcement.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Whether the announcement is displayed as a banner in the console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBanner")
    private final Boolean isBanner;

    /**
     * Whether the announcement is displayed as a banner in the console.
     * @return the value
     **/
    public Boolean getIsBanner() {
        return isBanner;
    }

    /**
     * The date and time the announcement was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-01-01T17:43:01.389+0000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the announcement was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-01-01T17:43:01.389+0000}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the announcement was last updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-01-01T17:43:01.389+0000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the announcement was last updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-01-01T17:43:01.389+0000}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The name of the environment that this announcement pertains to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("environmentName")
    private final String environmentName;

    /**
     * The name of the environment that this announcement pertains to.
     *
     * @return the value
     **/
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * The platform type that this announcement pertains to.
     *
     **/
    public enum PlatformType {
        Iaas("IAAS"),
        Saas("SAAS"),
        ;

        private final String value;
        private static java.util.Map<String, PlatformType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformType v : PlatformType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PlatformType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PlatformType: " + key);
        }
    };
    /**
     * The platform type that this announcement pertains to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformType platformType;

    /**
     * The platform type that this announcement pertains to.
     *
     * @return the value
     **/
    public PlatformType getPlatformType() {
        return platformType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BaseAnnouncement(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", referenceTicketNumber=").append(String.valueOf(this.referenceTicketNumber));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", timeOneTitle=").append(String.valueOf(this.timeOneTitle));
        sb.append(", timeOneType=").append(String.valueOf(this.timeOneType));
        sb.append(", timeOneValue=").append(String.valueOf(this.timeOneValue));
        sb.append(", timeTwoTitle=").append(String.valueOf(this.timeTwoTitle));
        sb.append(", timeTwoType=").append(String.valueOf(this.timeTwoType));
        sb.append(", timeTwoValue=").append(String.valueOf(this.timeTwoValue));
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(", affectedRegions=").append(String.valueOf(this.affectedRegions));
        sb.append(", announcementType=").append(String.valueOf(this.announcementType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isBanner=").append(String.valueOf(this.isBanner));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", environmentName=").append(String.valueOf(this.environmentName));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseAnnouncement)) {
            return false;
        }

        BaseAnnouncement other = (BaseAnnouncement) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.referenceTicketNumber, other.referenceTicketNumber)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.timeOneTitle, other.timeOneTitle)
                && java.util.Objects.equals(this.timeOneType, other.timeOneType)
                && java.util.Objects.equals(this.timeOneValue, other.timeOneValue)
                && java.util.Objects.equals(this.timeTwoTitle, other.timeTwoTitle)
                && java.util.Objects.equals(this.timeTwoType, other.timeTwoType)
                && java.util.Objects.equals(this.timeTwoValue, other.timeTwoValue)
                && java.util.Objects.equals(this.services, other.services)
                && java.util.Objects.equals(this.affectedRegions, other.affectedRegions)
                && java.util.Objects.equals(this.announcementType, other.announcementType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isBanner, other.isBanner)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.environmentName, other.environmentName)
                && java.util.Objects.equals(this.platformType, other.platformType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceTicketNumber == null
                                ? 43
                                : this.referenceTicketNumber.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.timeOneTitle == null ? 43 : this.timeOneTitle.hashCode());
        result = (result * PRIME) + (this.timeOneType == null ? 43 : this.timeOneType.hashCode());
        result = (result * PRIME) + (this.timeOneValue == null ? 43 : this.timeOneValue.hashCode());
        result = (result * PRIME) + (this.timeTwoTitle == null ? 43 : this.timeTwoTitle.hashCode());
        result = (result * PRIME) + (this.timeTwoType == null ? 43 : this.timeTwoType.hashCode());
        result = (result * PRIME) + (this.timeTwoValue == null ? 43 : this.timeTwoValue.hashCode());
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result =
                (result * PRIME)
                        + (this.affectedRegions == null ? 43 : this.affectedRegions.hashCode());
        result =
                (result * PRIME)
                        + (this.announcementType == null ? 43 : this.announcementType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.isBanner == null ? 43 : this.isBanner.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentName == null ? 43 : this.environmentName.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        return result;
    }
}
