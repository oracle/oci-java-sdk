/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * A summary of properties for the specified alarm suppression history item.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AlarmSuppressionHistoryItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AlarmSuppressionHistoryItem
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "suppressionId",
        "alarmSuppressionTarget",
        "level",
        "displayName",
        "description",
        "dimensions",
        "timeEffectiveFrom",
        "timeEffectiveUntil",
        "suppressionConditions"
    })
    public AlarmSuppressionHistoryItem(
            String suppressionId,
            AlarmSuppressionTarget alarmSuppressionTarget,
            Level level,
            String displayName,
            String description,
            java.util.Map<String, String> dimensions,
            java.util.Date timeEffectiveFrom,
            java.util.Date timeEffectiveUntil,
            java.util.List<SuppressionCondition> suppressionConditions) {
        super();
        this.suppressionId = suppressionId;
        this.alarmSuppressionTarget = alarmSuppressionTarget;
        this.level = level;
        this.displayName = displayName;
        this.description = description;
        this.dimensions = dimensions;
        this.timeEffectiveFrom = timeEffectiveFrom;
        this.timeEffectiveUntil = timeEffectiveUntil;
        this.suppressionConditions = suppressionConditions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm suppression.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("suppressionId")
        private String suppressionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm suppression.
         * @param suppressionId the value to set
         * @return this builder
         **/
        public Builder suppressionId(String suppressionId) {
            this.suppressionId = suppressionId;
            this.__explicitlySet__.add("suppressionId");
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
         * The level of this alarm suppression.
         * {@code ALARM} indicates a suppression of the entire alarm, regardless of dimension.
         * {@code DIMENSION} indicates a suppression configured for specified dimensions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private Level level;

        /**
         * The level of this alarm suppression.
         * {@code ALARM} indicates a suppression of the entire alarm, regardless of dimension.
         * {@code DIMENSION} indicates a suppression configured for specified dimensions.
         *
         * @param level the value to set
         * @return this builder
         **/
        public Builder level(Level level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /**
         * A user-friendly name for the alarm suppression. It does not have to be unique, and it's changeable. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the alarm suppression. It does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Human-readable reason for this alarm suppression.
         * It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Oracle recommends including tracking information for the event or associated work,
         * such as a ticket number.
         * <p>
         * Example: {@code Planned outage due to change IT-1234.}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Human-readable reason for this alarm suppression.
         * It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Oracle recommends including tracking information for the event or associated work,
         * such as a ticket number.
         * <p>
         * Example: {@code Planned outage due to change IT-1234.}
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Configured dimension filter for suppressing alarm state entries that include the set of specified dimension key-value pairs.
         * <p>
         * Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * Configured dimension filter for suppressing alarm state entries that include the set of specified dimension key-value pairs.
         * <p>
         * Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         *
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The start date and time for the suppression actually starts, inclusive. Format defined by RFC3339.
         * <p>
         * Example: {@code 2023-02-01T01:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEffectiveFrom")
        private java.util.Date timeEffectiveFrom;

        /**
         * The start date and time for the suppression actually starts, inclusive. Format defined by RFC3339.
         * <p>
         * Example: {@code 2023-02-01T01:02:29.600Z}
         *
         * @param timeEffectiveFrom the value to set
         * @return this builder
         **/
        public Builder timeEffectiveFrom(java.util.Date timeEffectiveFrom) {
            this.timeEffectiveFrom = timeEffectiveFrom;
            this.__explicitlySet__.add("timeEffectiveFrom");
            return this;
        }
        /**
         * The end date and time for the suppression actually ends, inclusive. Format defined by RFC3339.
         * <p>
         * Example: {@code 2023-02-01T02:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEffectiveUntil")
        private java.util.Date timeEffectiveUntil;

        /**
         * The end date and time for the suppression actually ends, inclusive. Format defined by RFC3339.
         * <p>
         * Example: {@code 2023-02-01T02:02:29.600Z}
         *
         * @param timeEffectiveUntil the value to set
         * @return this builder
         **/
        public Builder timeEffectiveUntil(java.util.Date timeEffectiveUntil) {
            this.timeEffectiveUntil = timeEffectiveUntil;
            this.__explicitlySet__.add("timeEffectiveUntil");
            return this;
        }
        /**
         * Array of all preconditions for alarm suppression.
         * Example: {@code [{
         *   conditionType: "RECURRENCE",
         *   suppressionRecurrence: "FRQ=DAILY;BYHOUR=10",
         *   suppressionDuration: "PT1H"
         * }]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("suppressionConditions")
        private java.util.List<SuppressionCondition> suppressionConditions;

        /**
         * Array of all preconditions for alarm suppression.
         * Example: {@code [{
         *   conditionType: "RECURRENCE",
         *   suppressionRecurrence: "FRQ=DAILY;BYHOUR=10",
         *   suppressionDuration: "PT1H"
         * }]}
         *
         * @param suppressionConditions the value to set
         * @return this builder
         **/
        public Builder suppressionConditions(
                java.util.List<SuppressionCondition> suppressionConditions) {
            this.suppressionConditions = suppressionConditions;
            this.__explicitlySet__.add("suppressionConditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmSuppressionHistoryItem build() {
            AlarmSuppressionHistoryItem model =
                    new AlarmSuppressionHistoryItem(
                            this.suppressionId,
                            this.alarmSuppressionTarget,
                            this.level,
                            this.displayName,
                            this.description,
                            this.dimensions,
                            this.timeEffectiveFrom,
                            this.timeEffectiveUntil,
                            this.suppressionConditions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmSuppressionHistoryItem model) {
            if (model.wasPropertyExplicitlySet("suppressionId")) {
                this.suppressionId(model.getSuppressionId());
            }
            if (model.wasPropertyExplicitlySet("alarmSuppressionTarget")) {
                this.alarmSuppressionTarget(model.getAlarmSuppressionTarget());
            }
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
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
            if (model.wasPropertyExplicitlySet("timeEffectiveFrom")) {
                this.timeEffectiveFrom(model.getTimeEffectiveFrom());
            }
            if (model.wasPropertyExplicitlySet("timeEffectiveUntil")) {
                this.timeEffectiveUntil(model.getTimeEffectiveUntil());
            }
            if (model.wasPropertyExplicitlySet("suppressionConditions")) {
                this.suppressionConditions(model.getSuppressionConditions());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm suppression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suppressionId")
    private final String suppressionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm suppression.
     * @return the value
     **/
    public String getSuppressionId() {
        return suppressionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("alarmSuppressionTarget")
    private final AlarmSuppressionTarget alarmSuppressionTarget;

    public AlarmSuppressionTarget getAlarmSuppressionTarget() {
        return alarmSuppressionTarget;
    }

    /**
     * The level of this alarm suppression.
     * {@code ALARM} indicates a suppression of the entire alarm, regardless of dimension.
     * {@code DIMENSION} indicates a suppression configured for specified dimensions.
     *
     **/
    public enum Level {
        Alarm("ALARM"),
        Dimension("DIMENSION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Level.class);

        private final String value;
        private static java.util.Map<String, Level> map;

        static {
            map = new java.util.HashMap<>();
            for (Level v : Level.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Level(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Level create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Level', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The level of this alarm suppression.
     * {@code ALARM} indicates a suppression of the entire alarm, regardless of dimension.
     * {@code DIMENSION} indicates a suppression configured for specified dimensions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final Level level;

    /**
     * The level of this alarm suppression.
     * {@code ALARM} indicates a suppression of the entire alarm, regardless of dimension.
     * {@code DIMENSION} indicates a suppression configured for specified dimensions.
     *
     * @return the value
     **/
    public Level getLevel() {
        return level;
    }

    /**
     * A user-friendly name for the alarm suppression. It does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the alarm suppression. It does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Human-readable reason for this alarm suppression.
     * It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Oracle recommends including tracking information for the event or associated work,
     * such as a ticket number.
     * <p>
     * Example: {@code Planned outage due to change IT-1234.}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Human-readable reason for this alarm suppression.
     * It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Oracle recommends including tracking information for the event or associated work,
     * such as a ticket number.
     * <p>
     * Example: {@code Planned outage due to change IT-1234.}
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Configured dimension filter for suppressing alarm state entries that include the set of specified dimension key-value pairs.
     * <p>
     * Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * Configured dimension filter for suppressing alarm state entries that include the set of specified dimension key-value pairs.
     * <p>
     * Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * The start date and time for the suppression actually starts, inclusive. Format defined by RFC3339.
     * <p>
     * Example: {@code 2023-02-01T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEffectiveFrom")
    private final java.util.Date timeEffectiveFrom;

    /**
     * The start date and time for the suppression actually starts, inclusive. Format defined by RFC3339.
     * <p>
     * Example: {@code 2023-02-01T01:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeEffectiveFrom() {
        return timeEffectiveFrom;
    }

    /**
     * The end date and time for the suppression actually ends, inclusive. Format defined by RFC3339.
     * <p>
     * Example: {@code 2023-02-01T02:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEffectiveUntil")
    private final java.util.Date timeEffectiveUntil;

    /**
     * The end date and time for the suppression actually ends, inclusive. Format defined by RFC3339.
     * <p>
     * Example: {@code 2023-02-01T02:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeEffectiveUntil() {
        return timeEffectiveUntil;
    }

    /**
     * Array of all preconditions for alarm suppression.
     * Example: {@code [{
     *   conditionType: "RECURRENCE",
     *   suppressionRecurrence: "FRQ=DAILY;BYHOUR=10",
     *   suppressionDuration: "PT1H"
     * }]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suppressionConditions")
    private final java.util.List<SuppressionCondition> suppressionConditions;

    /**
     * Array of all preconditions for alarm suppression.
     * Example: {@code [{
     *   conditionType: "RECURRENCE",
     *   suppressionRecurrence: "FRQ=DAILY;BYHOUR=10",
     *   suppressionDuration: "PT1H"
     * }]}
     *
     * @return the value
     **/
    public java.util.List<SuppressionCondition> getSuppressionConditions() {
        return suppressionConditions;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AlarmSuppressionHistoryItem(");
        sb.append("super=").append(super.toString());
        sb.append("suppressionId=").append(String.valueOf(this.suppressionId));
        sb.append(", alarmSuppressionTarget=").append(String.valueOf(this.alarmSuppressionTarget));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", timeEffectiveFrom=").append(String.valueOf(this.timeEffectiveFrom));
        sb.append(", timeEffectiveUntil=").append(String.valueOf(this.timeEffectiveUntil));
        sb.append(", suppressionConditions=").append(String.valueOf(this.suppressionConditions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmSuppressionHistoryItem)) {
            return false;
        }

        AlarmSuppressionHistoryItem other = (AlarmSuppressionHistoryItem) o;
        return java.util.Objects.equals(this.suppressionId, other.suppressionId)
                && java.util.Objects.equals(
                        this.alarmSuppressionTarget, other.alarmSuppressionTarget)
                && java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.timeEffectiveFrom, other.timeEffectiveFrom)
                && java.util.Objects.equals(this.timeEffectiveUntil, other.timeEffectiveUntil)
                && java.util.Objects.equals(this.suppressionConditions, other.suppressionConditions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.suppressionId == null ? 43 : this.suppressionId.hashCode());
        result =
                (result * PRIME)
                        + (this.alarmSuppressionTarget == null
                                ? 43
                                : this.alarmSuppressionTarget.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEffectiveFrom == null ? 43 : this.timeEffectiveFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEffectiveUntil == null
                                ? 43
                                : this.timeEffectiveUntil.hashCode());
        result =
                (result * PRIME)
                        + (this.suppressionConditions == null
                                ? 43
                                : this.suppressionConditions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
