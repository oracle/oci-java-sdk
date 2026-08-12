/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Automatic resource management configuration details for the Globally distributed autonomous database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DistributedAutonomousDatabaseAutoResourceManagementDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DistributedAutonomousDatabaseAutoResourceManagementDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "coolOffPeriodInMinutes",
        "maxMoveRuAttempts",
        "maxMoveRuUnit",
        "mode",
        "actionType",
        "notificationTopicIds",
        "streamIds"
    })
    public DistributedAutonomousDatabaseAutoResourceManagementDetails(
            Boolean isEnabled,
            Integer coolOffPeriodInMinutes,
            Integer maxMoveRuAttempts,
            MaxMoveRuUnit maxMoveRuUnit,
            Mode mode,
            ActionType actionType,
            java.util.List<String> notificationTopicIds,
            java.util.List<String> streamIds) {
        super();
        this.isEnabled = isEnabled;
        this.coolOffPeriodInMinutes = coolOffPeriodInMinutes;
        this.maxMoveRuAttempts = maxMoveRuAttempts;
        this.maxMoveRuUnit = maxMoveRuUnit;
        this.mode = mode;
        this.actionType = actionType;
        this.notificationTopicIds = notificationTopicIds;
        this.streamIds = streamIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Flag indicating if autoResourceManagement is enabled or disabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Flag indicating if autoResourceManagement is enabled or disabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Time period to wait for the database to get stable after autoResourceManagement event.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coolOffPeriodInMinutes")
        private Integer coolOffPeriodInMinutes;

        /**
         * Time period to wait for the database to get stable after autoResourceManagement event.
         * @param coolOffPeriodInMinutes the value to set
         * @return this builder
         **/
        public Builder coolOffPeriodInMinutes(Integer coolOffPeriodInMinutes) {
            this.coolOffPeriodInMinutes = coolOffPeriodInMinutes;
            this.__explicitlySet__.add("coolOffPeriodInMinutes");
            return this;
        }
        /**
         * Maximum number of move replication unit attempts allowed within the configured period per database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxMoveRuAttempts")
        private Integer maxMoveRuAttempts;

        /**
         * Maximum number of move replication unit attempts allowed within the configured period per database.
         * @param maxMoveRuAttempts the value to set
         * @return this builder
         **/
        public Builder maxMoveRuAttempts(Integer maxMoveRuAttempts) {
            this.maxMoveRuAttempts = maxMoveRuAttempts;
            this.__explicitlySet__.add("maxMoveRuAttempts");
            return this;
        }
        /**
         * Time unit applicable to maxMoveRuAttempts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxMoveRuUnit")
        private MaxMoveRuUnit maxMoveRuUnit;

        /**
         * Time unit applicable to maxMoveRuAttempts.
         * @param maxMoveRuUnit the value to set
         * @return this builder
         **/
        public Builder maxMoveRuUnit(MaxMoveRuUnit maxMoveRuUnit) {
            this.maxMoveRuUnit = maxMoveRuUnit;
            this.__explicitlySet__.add("maxMoveRuUnit");
            return this;
        }
        /**
         * Mode of autoResourceManagement execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * Mode of autoResourceManagement execution.
         * @param mode the value to set
         * @return this builder
         **/
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /**
         * The action that will be taken when autoResourceManagement is triggered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        /**
         * The action that will be taken when autoResourceManagement is triggered.
         * @param actionType the value to set
         * @return this builder
         **/
        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /**
         * The list of notification topic ids [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to receive autoResourceManagement events.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicIds")
        private java.util.List<String> notificationTopicIds;

        /**
         * The list of notification topic ids [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to receive autoResourceManagement events.
         * @param notificationTopicIds the value to set
         * @return this builder
         **/
        public Builder notificationTopicIds(java.util.List<String> notificationTopicIds) {
            this.notificationTopicIds = notificationTopicIds;
            this.__explicitlySet__.add("notificationTopicIds");
            return this;
        }
        /**
         * The list of stream ids [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that receive shard-related telemetry.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streamIds")
        private java.util.List<String> streamIds;

        /**
         * The list of stream ids [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that receive shard-related telemetry.
         * @param streamIds the value to set
         * @return this builder
         **/
        public Builder streamIds(java.util.List<String> streamIds) {
            this.streamIds = streamIds;
            this.__explicitlySet__.add("streamIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedAutonomousDatabaseAutoResourceManagementDetails build() {
            DistributedAutonomousDatabaseAutoResourceManagementDetails model =
                    new DistributedAutonomousDatabaseAutoResourceManagementDetails(
                            this.isEnabled,
                            this.coolOffPeriodInMinutes,
                            this.maxMoveRuAttempts,
                            this.maxMoveRuUnit,
                            this.mode,
                            this.actionType,
                            this.notificationTopicIds,
                            this.streamIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedAutonomousDatabaseAutoResourceManagementDetails model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("coolOffPeriodInMinutes")) {
                this.coolOffPeriodInMinutes(model.getCoolOffPeriodInMinutes());
            }
            if (model.wasPropertyExplicitlySet("maxMoveRuAttempts")) {
                this.maxMoveRuAttempts(model.getMaxMoveRuAttempts());
            }
            if (model.wasPropertyExplicitlySet("maxMoveRuUnit")) {
                this.maxMoveRuUnit(model.getMaxMoveRuUnit());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicIds")) {
                this.notificationTopicIds(model.getNotificationTopicIds());
            }
            if (model.wasPropertyExplicitlySet("streamIds")) {
                this.streamIds(model.getStreamIds());
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
     * Flag indicating if autoResourceManagement is enabled or disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Flag indicating if autoResourceManagement is enabled or disabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Time period to wait for the database to get stable after autoResourceManagement event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coolOffPeriodInMinutes")
    private final Integer coolOffPeriodInMinutes;

    /**
     * Time period to wait for the database to get stable after autoResourceManagement event.
     * @return the value
     **/
    public Integer getCoolOffPeriodInMinutes() {
        return coolOffPeriodInMinutes;
    }

    /**
     * Maximum number of move replication unit attempts allowed within the configured period per database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMoveRuAttempts")
    private final Integer maxMoveRuAttempts;

    /**
     * Maximum number of move replication unit attempts allowed within the configured period per database.
     * @return the value
     **/
    public Integer getMaxMoveRuAttempts() {
        return maxMoveRuAttempts;
    }

    /**
     * Time unit applicable to maxMoveRuAttempts.
     **/
    public enum MaxMoveRuUnit {
        Hour("HOUR"),
        Day("DAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaxMoveRuUnit.class);

        private final String value;
        private static java.util.Map<String, MaxMoveRuUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (MaxMoveRuUnit v : MaxMoveRuUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaxMoveRuUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaxMoveRuUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaxMoveRuUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Time unit applicable to maxMoveRuAttempts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMoveRuUnit")
    private final MaxMoveRuUnit maxMoveRuUnit;

    /**
     * Time unit applicable to maxMoveRuAttempts.
     * @return the value
     **/
    public MaxMoveRuUnit getMaxMoveRuUnit() {
        return maxMoveRuUnit;
    }

    /**
     * Mode of autoResourceManagement execution.
     **/
    public enum Mode {
        Automatic("AUTOMATIC"),
        Recommendation("RECOMMENDATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Mode.class);

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Mode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Mode of autoResourceManagement execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * Mode of autoResourceManagement execution.
     * @return the value
     **/
    public Mode getMode() {
        return mode;
    }

    /**
     * The action that will be taken when autoResourceManagement is triggered.
     **/
    public enum ActionType {
        Move("MOVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActionType.class);

        private final String value;
        private static java.util.Map<String, ActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionType v : ActionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action that will be taken when autoResourceManagement is triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final ActionType actionType;

    /**
     * The action that will be taken when autoResourceManagement is triggered.
     * @return the value
     **/
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * The list of notification topic ids [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to receive autoResourceManagement events.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicIds")
    private final java.util.List<String> notificationTopicIds;

    /**
     * The list of notification topic ids [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to receive autoResourceManagement events.
     * @return the value
     **/
    public java.util.List<String> getNotificationTopicIds() {
        return notificationTopicIds;
    }

    /**
     * The list of stream ids [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that receive shard-related telemetry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streamIds")
    private final java.util.List<String> streamIds;

    /**
     * The list of stream ids [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that receive shard-related telemetry.
     * @return the value
     **/
    public java.util.List<String> getStreamIds() {
        return streamIds;
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
        sb.append("DistributedAutonomousDatabaseAutoResourceManagementDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", coolOffPeriodInMinutes=").append(String.valueOf(this.coolOffPeriodInMinutes));
        sb.append(", maxMoveRuAttempts=").append(String.valueOf(this.maxMoveRuAttempts));
        sb.append(", maxMoveRuUnit=").append(String.valueOf(this.maxMoveRuUnit));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", actionType=").append(String.valueOf(this.actionType));
        sb.append(", notificationTopicIds=").append(String.valueOf(this.notificationTopicIds));
        sb.append(", streamIds=").append(String.valueOf(this.streamIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedAutonomousDatabaseAutoResourceManagementDetails)) {
            return false;
        }

        DistributedAutonomousDatabaseAutoResourceManagementDetails other =
                (DistributedAutonomousDatabaseAutoResourceManagementDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(
                        this.coolOffPeriodInMinutes, other.coolOffPeriodInMinutes)
                && java.util.Objects.equals(this.maxMoveRuAttempts, other.maxMoveRuAttempts)
                && java.util.Objects.equals(this.maxMoveRuUnit, other.maxMoveRuUnit)
                && java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.actionType, other.actionType)
                && java.util.Objects.equals(this.notificationTopicIds, other.notificationTopicIds)
                && java.util.Objects.equals(this.streamIds, other.streamIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.coolOffPeriodInMinutes == null
                                ? 43
                                : this.coolOffPeriodInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.maxMoveRuAttempts == null ? 43 : this.maxMoveRuAttempts.hashCode());
        result =
                (result * PRIME)
                        + (this.maxMoveRuUnit == null ? 43 : this.maxMoveRuUnit.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicIds == null
                                ? 43
                                : this.notificationTopicIds.hashCode());
        result = (result * PRIME) + (this.streamIds == null ? 43 : this.streamIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
