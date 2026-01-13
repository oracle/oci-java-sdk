/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.model;

/**
 * This is the summary information about a schedule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScheduleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "action",
        "description",
        "recurrenceDetails",
        "recurrenceType",
        "resourceFilters",
        "resources",
        "timeStarts",
        "timeEnds",
        "timeCreated",
        "timeUpdated",
        "timeLastRun",
        "timeNextRun",
        "lastRunStatus",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ScheduleSummary(
            String id,
            String compartmentId,
            String displayName,
            Action action,
            String description,
            String recurrenceDetails,
            RecurrenceType recurrenceType,
            java.util.List<ResourceFilter> resourceFilters,
            java.util.List<Resource> resources,
            java.util.Date timeStarts,
            java.util.Date timeEnds,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastRun,
            java.util.Date timeNextRun,
            OperationStatus lastRunStatus,
            Schedule.LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.action = action;
        this.description = description;
        this.recurrenceDetails = recurrenceDetails;
        this.recurrenceType = recurrenceType;
        this.resourceFilters = resourceFilters;
        this.resources = resources;
        this.timeStarts = timeStarts;
        this.timeEnds = timeEnds;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastRun = timeLastRun;
        this.timeNextRun = timeNextRun;
        this.lastRunStatus = lastRunStatus;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * schedule
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * schedule
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which the schedule is created
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which the schedule is created
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * This is a user-friendly name for the schedule. It does not have to be unique, and it's
         * changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * This is a user-friendly name for the schedule. It does not have to be unique, and it's
         * changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** This is the action that will be executed by the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * This is the action that will be executed by the schedule.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /** This is the description of the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * This is the description of the schedule.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * This is the frequency of recurrence of a schedule. The frequency field can either conform
         * to RFC-5545 formatting or UNIX cron formatting for recurrences, based on the value
         * specified by the recurrenceType field.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recurrenceDetails")
        private String recurrenceDetails;

        /**
         * This is the frequency of recurrence of a schedule. The frequency field can either conform
         * to RFC-5545 formatting or UNIX cron formatting for recurrences, based on the value
         * specified by the recurrenceType field.
         *
         * @param recurrenceDetails the value to set
         * @return this builder
         */
        public Builder recurrenceDetails(String recurrenceDetails) {
            this.recurrenceDetails = recurrenceDetails;
            this.__explicitlySet__.add("recurrenceDetails");
            return this;
        }
        /** Type of recurrence of a schedule */
        @com.fasterxml.jackson.annotation.JsonProperty("recurrenceType")
        private RecurrenceType recurrenceType;

        /**
         * Type of recurrence of a schedule
         *
         * @param recurrenceType the value to set
         * @return this builder
         */
        public Builder recurrenceType(RecurrenceType recurrenceType) {
            this.recurrenceType = recurrenceType;
            this.__explicitlySet__.add("recurrenceType");
            return this;
        }
        /**
         * This is a list of resources filters. The schedule will be applied to resources matching
         * all of them.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceFilters")
        private java.util.List<ResourceFilter> resourceFilters;

        /**
         * This is a list of resources filters. The schedule will be applied to resources matching
         * all of them.
         *
         * @param resourceFilters the value to set
         * @return this builder
         */
        public Builder resourceFilters(java.util.List<ResourceFilter> resourceFilters) {
            this.resourceFilters = resourceFilters;
            this.__explicitlySet__.add("resourceFilters");
            return this;
        }
        /** This is the list of resources to which the scheduled operation is applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<Resource> resources;

        /**
         * This is the list of resources to which the scheduled operation is applied.
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<Resource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /**
         * This is the date and time the schedule starts, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarts")
        private java.util.Date timeStarts;

        /**
         * This is the date and time the schedule starts, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeStarts the value to set
         * @return this builder
         */
        public Builder timeStarts(java.util.Date timeStarts) {
            this.timeStarts = timeStarts;
            this.__explicitlySet__.add("timeStarts");
            return this;
        }
        /**
         * This is the date and time the schedule ends, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnds")
        private java.util.Date timeEnds;

        /**
         * This is the date and time the schedule ends, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeEnds the value to set
         * @return this builder
         */
        public Builder timeEnds(java.util.Date timeEnds) {
            this.timeEnds = timeEnds;
            this.__explicitlySet__.add("timeEnds");
            return this;
        }
        /**
         * This is the date and time the schedule was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * This is the date and time the schedule was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * This is the date and time the schedule was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * This is the date and time the schedule was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * This is the date and time the schedule runs last time, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRun")
        private java.util.Date timeLastRun;

        /**
         * This is the date and time the schedule runs last time, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeLastRun the value to set
         * @return this builder
         */
        public Builder timeLastRun(java.util.Date timeLastRun) {
            this.timeLastRun = timeLastRun;
            this.__explicitlySet__.add("timeLastRun");
            return this;
        }
        /**
         * This is the date and time the schedule run the next time, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextRun")
        private java.util.Date timeNextRun;

        /**
         * This is the date and time the schedule run the next time, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeNextRun the value to set
         * @return this builder
         */
        public Builder timeNextRun(java.util.Date timeNextRun) {
            this.timeNextRun = timeNextRun;
            this.__explicitlySet__.add("timeNextRun");
            return this;
        }
        /** This is the status of the last work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastRunStatus")
        private OperationStatus lastRunStatus;

        /**
         * This is the status of the last work request.
         *
         * @param lastRunStatus the value to set
         * @return this builder
         */
        public Builder lastRunStatus(OperationStatus lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            this.__explicitlySet__.add("lastRunStatus");
            return this;
        }
        /** This is the current state of the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Schedule.LifecycleState lifecycleState;

        /**
         * This is the current state of the schedule.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Schedule.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * These are free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * These are free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * These are defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * These are defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * These are system tags for this resource. Each key is predefined and scoped to a
         * namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * These are system tags for this resource. Each key is predefined and scoped to a
         * namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleSummary build() {
            ScheduleSummary model =
                    new ScheduleSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.action,
                            this.description,
                            this.recurrenceDetails,
                            this.recurrenceType,
                            this.resourceFilters,
                            this.resources,
                            this.timeStarts,
                            this.timeEnds,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeLastRun,
                            this.timeNextRun,
                            this.lastRunStatus,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("recurrenceDetails")) {
                this.recurrenceDetails(model.getRecurrenceDetails());
            }
            if (model.wasPropertyExplicitlySet("recurrenceType")) {
                this.recurrenceType(model.getRecurrenceType());
            }
            if (model.wasPropertyExplicitlySet("resourceFilters")) {
                this.resourceFilters(model.getResourceFilters());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("timeStarts")) {
                this.timeStarts(model.getTimeStarts());
            }
            if (model.wasPropertyExplicitlySet("timeEnds")) {
                this.timeEnds(model.getTimeEnds());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastRun")) {
                this.timeLastRun(model.getTimeLastRun());
            }
            if (model.wasPropertyExplicitlySet("timeNextRun")) {
                this.timeNextRun(model.getTimeNextRun());
            }
            if (model.wasPropertyExplicitlySet("lastRunStatus")) {
                this.lastRunStatus(model.getLastRunStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * schedule
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * schedule
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the schedule is created
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the schedule is created
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * This is a user-friendly name for the schedule. It does not have to be unique, and it's
     * changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * This is a user-friendly name for the schedule. It does not have to be unique, and it's
     * changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** This is the action that will be executed by the schedule. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        StartResource("START_RESOURCE"),
        StopResource("STOP_RESOURCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** This is the action that will be executed by the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * This is the action that will be executed by the schedule.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /** This is the description of the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * This is the description of the schedule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the frequency of recurrence of a schedule. The frequency field can either conform to
     * RFC-5545 formatting or UNIX cron formatting for recurrences, based on the value specified by
     * the recurrenceType field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recurrenceDetails")
    private final String recurrenceDetails;

    /**
     * This is the frequency of recurrence of a schedule. The frequency field can either conform to
     * RFC-5545 formatting or UNIX cron formatting for recurrences, based on the value specified by
     * the recurrenceType field.
     *
     * @return the value
     */
    public String getRecurrenceDetails() {
        return recurrenceDetails;
    }

    /** Type of recurrence of a schedule */
    public enum RecurrenceType implements com.oracle.bmc.http.internal.BmcEnum {
        Cron("CRON"),
        Ical("ICAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RecurrenceType.class);

        private final String value;
        private static java.util.Map<String, RecurrenceType> map;

        static {
            map = new java.util.HashMap<>();
            for (RecurrenceType v : RecurrenceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RecurrenceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecurrenceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RecurrenceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of recurrence of a schedule */
    @com.fasterxml.jackson.annotation.JsonProperty("recurrenceType")
    private final RecurrenceType recurrenceType;

    /**
     * Type of recurrence of a schedule
     *
     * @return the value
     */
    public RecurrenceType getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * This is a list of resources filters. The schedule will be applied to resources matching all
     * of them.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceFilters")
    private final java.util.List<ResourceFilter> resourceFilters;

    /**
     * This is a list of resources filters. The schedule will be applied to resources matching all
     * of them.
     *
     * @return the value
     */
    public java.util.List<ResourceFilter> getResourceFilters() {
        return resourceFilters;
    }

    /** This is the list of resources to which the scheduled operation is applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<Resource> resources;

    /**
     * This is the list of resources to which the scheduled operation is applied.
     *
     * @return the value
     */
    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * This is the date and time the schedule starts, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarts")
    private final java.util.Date timeStarts;

    /**
     * This is the date and time the schedule starts, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarts() {
        return timeStarts;
    }

    /**
     * This is the date and time the schedule ends, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnds")
    private final java.util.Date timeEnds;

    /**
     * This is the date and time the schedule ends, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeEnds() {
        return timeEnds;
    }

    /**
     * This is the date and time the schedule was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * This is the date and time the schedule was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * This is the date and time the schedule was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * This is the date and time the schedule was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * This is the date and time the schedule runs last time, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRun")
    private final java.util.Date timeLastRun;

    /**
     * This is the date and time the schedule runs last time, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeLastRun() {
        return timeLastRun;
    }

    /**
     * This is the date and time the schedule run the next time, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextRun")
    private final java.util.Date timeNextRun;

    /**
     * This is the date and time the schedule run the next time, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeNextRun() {
        return timeNextRun;
    }

    /** This is the status of the last work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastRunStatus")
    private final OperationStatus lastRunStatus;

    /**
     * This is the status of the last work request.
     *
     * @return the value
     */
    public OperationStatus getLastRunStatus() {
        return lastRunStatus;
    }

    /** This is the current state of the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Schedule.LifecycleState lifecycleState;

    /**
     * This is the current state of the schedule.
     *
     * @return the value
     */
    public Schedule.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * These are free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * These are free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * These are defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * These are defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * These are system tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * These are system tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ScheduleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", recurrenceDetails=").append(String.valueOf(this.recurrenceDetails));
        sb.append(", recurrenceType=").append(String.valueOf(this.recurrenceType));
        sb.append(", resourceFilters=").append(String.valueOf(this.resourceFilters));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", timeStarts=").append(String.valueOf(this.timeStarts));
        sb.append(", timeEnds=").append(String.valueOf(this.timeEnds));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastRun=").append(String.valueOf(this.timeLastRun));
        sb.append(", timeNextRun=").append(String.valueOf(this.timeNextRun));
        sb.append(", lastRunStatus=").append(String.valueOf(this.lastRunStatus));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleSummary)) {
            return false;
        }

        ScheduleSummary other = (ScheduleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.recurrenceDetails, other.recurrenceDetails)
                && java.util.Objects.equals(this.recurrenceType, other.recurrenceType)
                && java.util.Objects.equals(this.resourceFilters, other.resourceFilters)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.timeStarts, other.timeStarts)
                && java.util.Objects.equals(this.timeEnds, other.timeEnds)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastRun, other.timeLastRun)
                && java.util.Objects.equals(this.timeNextRun, other.timeNextRun)
                && java.util.Objects.equals(this.lastRunStatus, other.lastRunStatus)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.recurrenceDetails == null ? 43 : this.recurrenceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.recurrenceType == null ? 43 : this.recurrenceType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceFilters == null ? 43 : this.resourceFilters.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + (this.timeStarts == null ? 43 : this.timeStarts.hashCode());
        result = (result * PRIME) + (this.timeEnds == null ? 43 : this.timeEnds.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeLastRun == null ? 43 : this.timeLastRun.hashCode());
        result = (result * PRIME) + (this.timeNextRun == null ? 43 : this.timeNextRun.hashCode());
        result =
                (result * PRIME)
                        + (this.lastRunStatus == null ? 43 : this.lastRunStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
