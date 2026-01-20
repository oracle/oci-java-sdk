/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * A summary of properties for the specified alarm suppression. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AlarmSuppressionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AlarmSuppressionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "alarmSuppressionTarget",
        "level",
        "suppressionConditions",
        "displayName",
        "description",
        "dimensions",
        "timeSuppressFrom",
        "timeSuppressUntil",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags"
    })
    public AlarmSuppressionSummary(
            String id,
            String compartmentId,
            AlarmSuppressionTarget alarmSuppressionTarget,
            AlarmSuppression.Level level,
            java.util.List<SuppressionCondition> suppressionConditions,
            String displayName,
            String description,
            java.util.Map<String, String> dimensions,
            java.util.Date timeSuppressFrom,
            java.util.Date timeSuppressUntil,
            AlarmSuppression.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.alarmSuppressionTarget = alarmSuppressionTarget;
        this.level = level;
        this.suppressionConditions = suppressionConditions;
        this.displayName = displayName;
        this.description = description;
        this.dimensions = dimensions;
        this.timeSuppressFrom = timeSuppressFrom;
        this.timeSuppressUntil = timeSuppressUntil;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * alarm suppression.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * alarm suppression.
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
         * compartment containing the alarm suppression.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the alarm suppression.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alarmSuppressionTarget")
        private AlarmSuppressionTarget alarmSuppressionTarget;

        public Builder alarmSuppressionTarget(AlarmSuppressionTarget alarmSuppressionTarget) {
            this.alarmSuppressionTarget = alarmSuppressionTarget;
            this.__explicitlySet__.add("alarmSuppressionTarget");
            return this;
        }
        /**
         * The level of this alarm suppression. {@code ALARM} indicates a suppression of the entire
         * alarm, regardless of dimension. {@code DIMENSION} indicates a suppression configured for
         * specified dimensions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private AlarmSuppression.Level level;

        /**
         * The level of this alarm suppression. {@code ALARM} indicates a suppression of the entire
         * alarm, regardless of dimension. {@code DIMENSION} indicates a suppression configured for
         * specified dimensions.
         *
         * @param level the value to set
         * @return this builder
         */
        public Builder level(AlarmSuppression.Level level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /**
         * Array of all preconditions for alarm suppression. Example: {@code [{ conditionType:
         * "RECURRENCE", suppressionRecurrence: "FRQ=DAILY;BYHOUR=10", suppressionDuration: "PT1H"
         * }]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("suppressionConditions")
        private java.util.List<SuppressionCondition> suppressionConditions;

        /**
         * Array of all preconditions for alarm suppression. Example: {@code [{ conditionType:
         * "RECURRENCE", suppressionRecurrence: "FRQ=DAILY;BYHOUR=10", suppressionDuration: "PT1H"
         * }]}
         *
         * @param suppressionConditions the value to set
         * @return this builder
         */
        public Builder suppressionConditions(
                java.util.List<SuppressionCondition> suppressionConditions) {
            this.suppressionConditions = suppressionConditions;
            this.__explicitlySet__.add("suppressionConditions");
            return this;
        }
        /**
         * A user-friendly name for the alarm suppression. It does not have to be unique, and it's
         * changeable. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the alarm suppression. It does not have to be unique, and it's
         * changeable. Avoid entering confidential information.
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
         * Human-readable reason for this alarm suppression. It does not have to be unique, and it's
         * changeable. Avoid entering confidential information.
         *
         * <p>Oracle recommends including tracking information for the event or associated work,
         * such as a ticket number.
         *
         * <p>Example: {@code Planned outage due to change IT-1234.}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Human-readable reason for this alarm suppression. It does not have to be unique, and it's
         * changeable. Avoid entering confidential information.
         *
         * <p>Oracle recommends including tracking information for the event or associated work,
         * such as a ticket number.
         *
         * <p>Example: {@code Planned outage due to change IT-1234.}
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
         * Configured dimension filter for suppressing alarm state entries that include the set of
         * specified dimension key-value pairs.
         *
         * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * Configured dimension filter for suppressing alarm state entries that include the set of
         * specified dimension key-value pairs.
         *
         * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The start date and time for the suppression to take place, inclusive. Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFrom")
        private java.util.Date timeSuppressFrom;

        /**
         * The start date and time for the suppression to take place, inclusive. Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         *
         * @param timeSuppressFrom the value to set
         * @return this builder
         */
        public Builder timeSuppressFrom(java.util.Date timeSuppressFrom) {
            this.timeSuppressFrom = timeSuppressFrom;
            this.__explicitlySet__.add("timeSuppressFrom");
            return this;
        }
        /**
         * The end date and time for the suppression to take place, inclusive. Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-01T02:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressUntil")
        private java.util.Date timeSuppressUntil;

        /**
         * The end date and time for the suppression to take place, inclusive. Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-01T02:02:29.600Z}
         *
         * @param timeSuppressUntil the value to set
         * @return this builder
         */
        public Builder timeSuppressUntil(java.util.Date timeSuppressUntil) {
            this.timeSuppressUntil = timeSuppressUntil;
            this.__explicitlySet__.add("timeSuppressUntil");
            return this;
        }
        /**
         * The current lifecycle state of the alarm suppression.
         *
         * <p>Example: {@code DELETED}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AlarmSuppression.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the alarm suppression.
         *
         * <p>Example: {@code DELETED}
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(AlarmSuppression.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the alarm suppression was created. Format defined by RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the alarm suppression was created. Format defined by RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
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
         * The date and time the alarm suppression was last updated (deleted). Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-03T01:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the alarm suppression was last updated (deleted). Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-03T01:02:29.600Z}
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

        public AlarmSuppressionSummary build() {
            AlarmSuppressionSummary model =
                    new AlarmSuppressionSummary(
                            this.id,
                            this.compartmentId,
                            this.alarmSuppressionTarget,
                            this.level,
                            this.suppressionConditions,
                            this.displayName,
                            this.description,
                            this.dimensions,
                            this.timeSuppressFrom,
                            this.timeSuppressUntil,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmSuppressionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("alarmSuppressionTarget")) {
                this.alarmSuppressionTarget(model.getAlarmSuppressionTarget());
            }
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
            }
            if (model.wasPropertyExplicitlySet("suppressionConditions")) {
                this.suppressionConditions(model.getSuppressionConditions());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("timeSuppressFrom")) {
                this.timeSuppressFrom(model.getTimeSuppressFrom());
            }
            if (model.wasPropertyExplicitlySet("timeSuppressUntil")) {
                this.timeSuppressUntil(model.getTimeSuppressUntil());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * alarm suppression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * alarm suppression.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the alarm suppression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the alarm suppression.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("alarmSuppressionTarget")
    private final AlarmSuppressionTarget alarmSuppressionTarget;

    public AlarmSuppressionTarget getAlarmSuppressionTarget() {
        return alarmSuppressionTarget;
    }

    /**
     * The level of this alarm suppression. {@code ALARM} indicates a suppression of the entire
     * alarm, regardless of dimension. {@code DIMENSION} indicates a suppression configured for
     * specified dimensions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final AlarmSuppression.Level level;

    /**
     * The level of this alarm suppression. {@code ALARM} indicates a suppression of the entire
     * alarm, regardless of dimension. {@code DIMENSION} indicates a suppression configured for
     * specified dimensions.
     *
     * @return the value
     */
    public AlarmSuppression.Level getLevel() {
        return level;
    }

    /**
     * Array of all preconditions for alarm suppression. Example: {@code [{ conditionType:
     * "RECURRENCE", suppressionRecurrence: "FRQ=DAILY;BYHOUR=10", suppressionDuration: "PT1H" }]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("suppressionConditions")
    private final java.util.List<SuppressionCondition> suppressionConditions;

    /**
     * Array of all preconditions for alarm suppression. Example: {@code [{ conditionType:
     * "RECURRENCE", suppressionRecurrence: "FRQ=DAILY;BYHOUR=10", suppressionDuration: "PT1H" }]}
     *
     * @return the value
     */
    public java.util.List<SuppressionCondition> getSuppressionConditions() {
        return suppressionConditions;
    }

    /**
     * A user-friendly name for the alarm suppression. It does not have to be unique, and it's
     * changeable. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the alarm suppression. It does not have to be unique, and it's
     * changeable. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Human-readable reason for this alarm suppression. It does not have to be unique, and it's
     * changeable. Avoid entering confidential information.
     *
     * <p>Oracle recommends including tracking information for the event or associated work, such as
     * a ticket number.
     *
     * <p>Example: {@code Planned outage due to change IT-1234.}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Human-readable reason for this alarm suppression. It does not have to be unique, and it's
     * changeable. Avoid entering confidential information.
     *
     * <p>Oracle recommends including tracking information for the event or associated work, such as
     * a ticket number.
     *
     * <p>Example: {@code Planned outage due to change IT-1234.}
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Configured dimension filter for suppressing alarm state entries that include the set of
     * specified dimension key-value pairs.
     *
     * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * Configured dimension filter for suppressing alarm state entries that include the set of
     * specified dimension key-value pairs.
     *
     * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * The start date and time for the suppression to take place, inclusive. Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFrom")
    private final java.util.Date timeSuppressFrom;

    /**
     * The start date and time for the suppression to take place, inclusive. Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeSuppressFrom() {
        return timeSuppressFrom;
    }

    /**
     * The end date and time for the suppression to take place, inclusive. Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-01T02:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressUntil")
    private final java.util.Date timeSuppressUntil;

    /**
     * The end date and time for the suppression to take place, inclusive. Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-01T02:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeSuppressUntil() {
        return timeSuppressUntil;
    }

    /**
     * The current lifecycle state of the alarm suppression.
     *
     * <p>Example: {@code DELETED}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AlarmSuppression.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the alarm suppression.
     *
     * <p>Example: {@code DELETED}
     *
     * @return the value
     */
    public AlarmSuppression.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the alarm suppression was created. Format defined by RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the alarm suppression was created. Format defined by RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the alarm suppression was last updated (deleted). Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-03T01:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the alarm suppression was last updated (deleted). Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-03T01:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("AlarmSuppressionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", alarmSuppressionTarget=").append(String.valueOf(this.alarmSuppressionTarget));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(", suppressionConditions=").append(String.valueOf(this.suppressionConditions));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", timeSuppressFrom=").append(String.valueOf(this.timeSuppressFrom));
        sb.append(", timeSuppressUntil=").append(String.valueOf(this.timeSuppressUntil));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof AlarmSuppressionSummary)) {
            return false;
        }

        AlarmSuppressionSummary other = (AlarmSuppressionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.alarmSuppressionTarget, other.alarmSuppressionTarget)
                && java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.suppressionConditions, other.suppressionConditions)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.timeSuppressFrom, other.timeSuppressFrom)
                && java.util.Objects.equals(this.timeSuppressUntil, other.timeSuppressUntil)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result =
                (result * PRIME)
                        + (this.alarmSuppressionTarget == null
                                ? 43
                                : this.alarmSuppressionTarget.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result =
                (result * PRIME)
                        + (this.suppressionConditions == null
                                ? 43
                                : this.suppressionConditions.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSuppressFrom == null ? 43 : this.timeSuppressFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSuppressUntil == null ? 43 : this.timeSuppressUntil.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
