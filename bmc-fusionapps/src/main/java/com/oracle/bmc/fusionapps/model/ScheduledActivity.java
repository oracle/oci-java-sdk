/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Details of scheduled activity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScheduledActivity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ScheduledActivity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "runCycle",
        "fusionEnvironmentId",
        "lifecycleState",
        "actions",
        "serviceAvailability",
        "timeScheduledStart",
        "timeExpectedFinish",
        "timeFinished",
        "delayInHours",
        "timeCreated",
        "timeUpdated",
        "lifecycleDetails"
    })
    public ScheduledActivity(
            String id,
            String displayName,
            RunCycle runCycle,
            String fusionEnvironmentId,
            LifecycleState lifecycleState,
            java.util.List<Action> actions,
            ServiceAvailability serviceAvailability,
            java.util.Date timeScheduledStart,
            java.util.Date timeExpectedFinish,
            java.util.Date timeFinished,
            Integer delayInHours,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleDetails lifecycleDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.runCycle = runCycle;
        this.fusionEnvironmentId = fusionEnvironmentId;
        this.lifecycleState = lifecycleState;
        this.actions = actions;
        this.serviceAvailability = serviceAvailability;
        this.timeScheduledStart = timeScheduledStart;
        this.timeExpectedFinish = timeExpectedFinish;
        this.timeFinished = timeFinished;
        this.delayInHours = delayInHours;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** scheduled activity display name, can be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * scheduled activity display name, can be renamed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** run cadence. */
        @com.fasterxml.jackson.annotation.JsonProperty("runCycle")
        private RunCycle runCycle;

        /**
         * run cadence.
         *
         * @param runCycle the value to set
         * @return this builder
         */
        public Builder runCycle(RunCycle runCycle) {
            this.runCycle = runCycle;
            this.__explicitlySet__.add("runCycle");
            return this;
        }
        /** FAaaS Environment Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
        private String fusionEnvironmentId;

        /**
         * FAaaS Environment Identifier.
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            this.__explicitlySet__.add("fusionEnvironmentId");
            return this;
        }
        /** The current state of the scheduledActivity. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the scheduledActivity.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** List of actions */
        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private java.util.List<Action> actions;

        /**
         * List of actions
         *
         * @param actions the value to set
         * @return this builder
         */
        public Builder actions(java.util.List<Action> actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }
        /** Service availability / impact during scheduled activity execution up down */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceAvailability")
        private ServiceAvailability serviceAvailability;

        /**
         * Service availability / impact during scheduled activity execution up down
         *
         * @param serviceAvailability the value to set
         * @return this builder
         */
        public Builder serviceAvailability(ServiceAvailability serviceAvailability) {
            this.serviceAvailability = serviceAvailability;
            this.__explicitlySet__.add("serviceAvailability");
            return this;
        }
        /**
         * Current time the scheduled activity is scheduled to start. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
        private java.util.Date timeScheduledStart;

        /**
         * Current time the scheduled activity is scheduled to start. An RFC3339 formatted datetime
         * string.
         *
         * @param timeScheduledStart the value to set
         * @return this builder
         */
        public Builder timeScheduledStart(java.util.Date timeScheduledStart) {
            this.timeScheduledStart = timeScheduledStart;
            this.__explicitlySet__.add("timeScheduledStart");
            return this;
        }
        /**
         * Current time the scheduled activity is scheduled to end. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpectedFinish")
        private java.util.Date timeExpectedFinish;

        /**
         * Current time the scheduled activity is scheduled to end. An RFC3339 formatted datetime
         * string.
         *
         * @param timeExpectedFinish the value to set
         * @return this builder
         */
        public Builder timeExpectedFinish(java.util.Date timeExpectedFinish) {
            this.timeExpectedFinish = timeExpectedFinish;
            this.__explicitlySet__.add("timeExpectedFinish");
            return this;
        }
        /**
         * The time the scheduled activity actually completed / cancelled / failed. An RFC3339
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The time the scheduled activity actually completed / cancelled / failed. An RFC3339
         * formatted datetime string.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** Cumulative delay hours */
        @com.fasterxml.jackson.annotation.JsonProperty("delayInHours")
        private Integer delayInHours;

        /**
         * Cumulative delay hours
         *
         * @param delayInHours the value to set
         * @return this builder
         */
        public Builder delayInHours(Integer delayInHours) {
            this.delayInHours = delayInHours;
            this.__explicitlySet__.add("delayInHours");
            return this;
        }
        /**
         * The time the scheduled activity record was created. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the scheduled activity record was created. An RFC3339 formatted datetime string.
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
         * The time the scheduled activity record was updated. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the scheduled activity record was updated. An RFC3339 formatted datetime string.
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
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledActivity build() {
            ScheduledActivity model =
                    new ScheduledActivity(
                            this.id,
                            this.displayName,
                            this.runCycle,
                            this.fusionEnvironmentId,
                            this.lifecycleState,
                            this.actions,
                            this.serviceAvailability,
                            this.timeScheduledStart,
                            this.timeExpectedFinish,
                            this.timeFinished,
                            this.delayInHours,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledActivity model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("runCycle")) {
                this.runCycle(model.getRunCycle());
            }
            if (model.wasPropertyExplicitlySet("fusionEnvironmentId")) {
                this.fusionEnvironmentId(model.getFusionEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("actions")) {
                this.actions(model.getActions());
            }
            if (model.wasPropertyExplicitlySet("serviceAvailability")) {
                this.serviceAvailability(model.getServiceAvailability());
            }
            if (model.wasPropertyExplicitlySet("timeScheduledStart")) {
                this.timeScheduledStart(model.getTimeScheduledStart());
            }
            if (model.wasPropertyExplicitlySet("timeExpectedFinish")) {
                this.timeExpectedFinish(model.getTimeExpectedFinish());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("delayInHours")) {
                this.delayInHours(model.getDelayInHours());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** scheduled activity display name, can be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * scheduled activity display name, can be renamed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** run cadence. */
    public enum RunCycle implements com.oracle.bmc.http.internal.BmcEnum {
        Quarterly("QUARTERLY"),
        Monthly("MONTHLY"),
        Oneoff("ONEOFF"),
        Vertex("VERTEX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RunCycle.class);

        private final String value;
        private static java.util.Map<String, RunCycle> map;

        static {
            map = new java.util.HashMap<>();
            for (RunCycle v : RunCycle.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RunCycle(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RunCycle create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RunCycle', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** run cadence. */
    @com.fasterxml.jackson.annotation.JsonProperty("runCycle")
    private final RunCycle runCycle;

    /**
     * run cadence.
     *
     * @return the value
     */
    public RunCycle getRunCycle() {
        return runCycle;
    }

    /** FAaaS Environment Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
    private final String fusionEnvironmentId;

    /**
     * FAaaS Environment Identifier.
     *
     * @return the value
     */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }

    /** The current state of the scheduledActivity. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the scheduledActivity. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the scheduledActivity.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** List of actions */
    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    private final java.util.List<Action> actions;

    /**
     * List of actions
     *
     * @return the value
     */
    public java.util.List<Action> getActions() {
        return actions;
    }

    /** Service availability / impact during scheduled activity execution up down */
    public enum ServiceAvailability implements com.oracle.bmc.http.internal.BmcEnum {
        Available("AVAILABLE"),
        Unavailable("UNAVAILABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServiceAvailability.class);

        private final String value;
        private static java.util.Map<String, ServiceAvailability> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceAvailability v : ServiceAvailability.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServiceAvailability(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceAvailability create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServiceAvailability', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Service availability / impact during scheduled activity execution up down */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAvailability")
    private final ServiceAvailability serviceAvailability;

    /**
     * Service availability / impact during scheduled activity execution up down
     *
     * @return the value
     */
    public ServiceAvailability getServiceAvailability() {
        return serviceAvailability;
    }

    /**
     * Current time the scheduled activity is scheduled to start. An RFC3339 formatted datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
    private final java.util.Date timeScheduledStart;

    /**
     * Current time the scheduled activity is scheduled to start. An RFC3339 formatted datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduledStart() {
        return timeScheduledStart;
    }

    /**
     * Current time the scheduled activity is scheduled to end. An RFC3339 formatted datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpectedFinish")
    private final java.util.Date timeExpectedFinish;

    /**
     * Current time the scheduled activity is scheduled to end. An RFC3339 formatted datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeExpectedFinish() {
        return timeExpectedFinish;
    }

    /**
     * The time the scheduled activity actually completed / cancelled / failed. An RFC3339 formatted
     * datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time the scheduled activity actually completed / cancelled / failed. An RFC3339 formatted
     * datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** Cumulative delay hours */
    @com.fasterxml.jackson.annotation.JsonProperty("delayInHours")
    private final Integer delayInHours;

    /**
     * Cumulative delay hours
     *
     * @return the value
     */
    public Integer getDelayInHours() {
        return delayInHours;
    }

    /** The time the scheduled activity record was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the scheduled activity record was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the scheduled activity record was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the scheduled activity record was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    public enum LifecycleDetails implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Rollbackaccepted("ROLLBACKACCEPTED"),
        Rollbackinprogress("ROLLBACKINPROGRESS"),
        Rollbacksucceeded("ROLLBACKSUCCEEDED"),
        Rollbackfailed("ROLLBACKFAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("ScheduledActivity(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", runCycle=").append(String.valueOf(this.runCycle));
        sb.append(", fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", actions=").append(String.valueOf(this.actions));
        sb.append(", serviceAvailability=").append(String.valueOf(this.serviceAvailability));
        sb.append(", timeScheduledStart=").append(String.valueOf(this.timeScheduledStart));
        sb.append(", timeExpectedFinish=").append(String.valueOf(this.timeExpectedFinish));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", delayInHours=").append(String.valueOf(this.delayInHours));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledActivity)) {
            return false;
        }

        ScheduledActivity other = (ScheduledActivity) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.runCycle, other.runCycle)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.actions, other.actions)
                && java.util.Objects.equals(this.serviceAvailability, other.serviceAvailability)
                && java.util.Objects.equals(this.timeScheduledStart, other.timeScheduledStart)
                && java.util.Objects.equals(this.timeExpectedFinish, other.timeExpectedFinish)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.delayInHours, other.delayInHours)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.runCycle == null ? 43 : this.runCycle.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.actions == null ? 43 : this.actions.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceAvailability == null
                                ? 43
                                : this.serviceAvailability.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduledStart == null
                                ? 43
                                : this.timeScheduledStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExpectedFinish == null
                                ? 43
                                : this.timeExpectedFinish.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.delayInHours == null ? 43 : this.delayInHours.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
