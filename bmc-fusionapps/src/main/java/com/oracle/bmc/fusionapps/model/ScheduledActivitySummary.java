/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Summary of the scheduled activity for a Fusion environment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScheduledActivitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduledActivitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "runCycle",
        "fusionEnvironmentId",
        "lifecycleState",
        "actions",
        "timeScheduledStart",
        "timeExpectedFinish",
        "timeFinished",
        "delayInHours",
        "serviceAvailability",
        "timeAccepted",
        "timeUpdated",
        "lifecycleDetails",
        "freeformTags",
        "definedTags"
    })
    public ScheduledActivitySummary(
            String id,
            String displayName,
            ScheduledActivity.RunCycle runCycle,
            String fusionEnvironmentId,
            ScheduledActivity.LifecycleState lifecycleState,
            java.util.List<Action> actions,
            java.util.Date timeScheduledStart,
            java.util.Date timeExpectedFinish,
            java.util.Date timeFinished,
            Integer delayInHours,
            ScheduledActivity.ServiceAvailability serviceAvailability,
            java.util.Date timeAccepted,
            java.util.Date timeUpdated,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.runCycle = runCycle;
        this.fusionEnvironmentId = fusionEnvironmentId;
        this.lifecycleState = lifecycleState;
        this.actions = actions;
        this.timeScheduledStart = timeScheduledStart;
        this.timeExpectedFinish = timeExpectedFinish;
        this.timeFinished = timeFinished;
        this.delayInHours = delayInHours;
        this.serviceAvailability = serviceAvailability;
        this.timeAccepted = timeAccepted;
        this.timeUpdated = timeUpdated;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
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
        /** A friendly name for the scheduled activity. Can be changed later. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A friendly name for the scheduled activity. Can be changed later.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The run cadence of this scheduled activity. Valid values are Quarterly, Monthly, OneOff,
         * and Vertex.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runCycle")
        private ScheduledActivity.RunCycle runCycle;

        /**
         * The run cadence of this scheduled activity. Valid values are Quarterly, Monthly, OneOff,
         * and Vertex.
         *
         * @param runCycle the value to set
         * @return this builder
         */
        public Builder runCycle(ScheduledActivity.RunCycle runCycle) {
            this.runCycle = runCycle;
            this.__explicitlySet__.add("runCycle");
            return this;
        }
        /** The OCID of the Fusion environment for the scheduled activity. */
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
        private String fusionEnvironmentId;

        /**
         * The OCID of the Fusion environment for the scheduled activity.
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            this.__explicitlySet__.add("fusionEnvironmentId");
            return this;
        }
        /**
         * The current state of the scheduled activity. Valid values are Scheduled, In progress ,
         * Failed, Completed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ScheduledActivity.LifecycleState lifecycleState;

        /**
         * The current state of the scheduled activity. Valid values are Scheduled, In progress ,
         * Failed, Completed.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ScheduledActivity.LifecycleState lifecycleState) {
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
        /** Service availability / impact during scheduled activity execution, up down */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceAvailability")
        private ScheduledActivity.ServiceAvailability serviceAvailability;

        /**
         * Service availability / impact during scheduled activity execution, up down
         *
         * @param serviceAvailability the value to set
         * @return this builder
         */
        public Builder serviceAvailability(
                ScheduledActivity.ServiceAvailability serviceAvailability) {
            this.serviceAvailability = serviceAvailability;
            this.__explicitlySet__.add("serviceAvailability");
            return this;
        }
        /**
         * The time the scheduled activity record was created. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The time the scheduled activity record was created. An RFC3339 formatted datetime string.
         *
         * @param timeAccepted the value to set
         * @return this builder
         */
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
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
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledActivitySummary build() {
            ScheduledActivitySummary model =
                    new ScheduledActivitySummary(
                            this.id,
                            this.displayName,
                            this.runCycle,
                            this.fusionEnvironmentId,
                            this.lifecycleState,
                            this.actions,
                            this.timeScheduledStart,
                            this.timeExpectedFinish,
                            this.timeFinished,
                            this.delayInHours,
                            this.serviceAvailability,
                            this.timeAccepted,
                            this.timeUpdated,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledActivitySummary model) {
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
            if (model.wasPropertyExplicitlySet("serviceAvailability")) {
                this.serviceAvailability(model.getServiceAvailability());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** A friendly name for the scheduled activity. Can be changed later. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A friendly name for the scheduled activity. Can be changed later.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The run cadence of this scheduled activity. Valid values are Quarterly, Monthly, OneOff, and
     * Vertex.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runCycle")
    private final ScheduledActivity.RunCycle runCycle;

    /**
     * The run cadence of this scheduled activity. Valid values are Quarterly, Monthly, OneOff, and
     * Vertex.
     *
     * @return the value
     */
    public ScheduledActivity.RunCycle getRunCycle() {
        return runCycle;
    }

    /** The OCID of the Fusion environment for the scheduled activity. */
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
    private final String fusionEnvironmentId;

    /**
     * The OCID of the Fusion environment for the scheduled activity.
     *
     * @return the value
     */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }

    /**
     * The current state of the scheduled activity. Valid values are Scheduled, In progress ,
     * Failed, Completed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ScheduledActivity.LifecycleState lifecycleState;

    /**
     * The current state of the scheduled activity. Valid values are Scheduled, In progress ,
     * Failed, Completed.
     *
     * @return the value
     */
    public ScheduledActivity.LifecycleState getLifecycleState() {
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

    /** Service availability / impact during scheduled activity execution, up down */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAvailability")
    private final ScheduledActivity.ServiceAvailability serviceAvailability;

    /**
     * Service availability / impact during scheduled activity execution, up down
     *
     * @return the value
     */
    public ScheduledActivity.ServiceAvailability getServiceAvailability() {
        return serviceAvailability;
    }

    /** The time the scheduled activity record was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The time the scheduled activity record was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
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
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("ScheduledActivitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", runCycle=").append(String.valueOf(this.runCycle));
        sb.append(", fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", actions=").append(String.valueOf(this.actions));
        sb.append(", timeScheduledStart=").append(String.valueOf(this.timeScheduledStart));
        sb.append(", timeExpectedFinish=").append(String.valueOf(this.timeExpectedFinish));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", delayInHours=").append(String.valueOf(this.delayInHours));
        sb.append(", serviceAvailability=").append(String.valueOf(this.serviceAvailability));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledActivitySummary)) {
            return false;
        }

        ScheduledActivitySummary other = (ScheduledActivitySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.runCycle, other.runCycle)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.actions, other.actions)
                && java.util.Objects.equals(this.timeScheduledStart, other.timeScheduledStart)
                && java.util.Objects.equals(this.timeExpectedFinish, other.timeExpectedFinish)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.delayInHours, other.delayInHours)
                && java.util.Objects.equals(this.serviceAvailability, other.serviceAvailability)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result =
                (result * PRIME)
                        + (this.serviceAvailability == null
                                ? 43
                                : this.serviceAvailability.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
