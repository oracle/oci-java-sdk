/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * A summary of properties for the specified alarm and its current evaluation status.
 * For information about alarms, see
 * [Alarms Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#AlarmsOverview).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about endpoints and signing API requests, see
 * [About the API](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm).
 * For information about available SDKs and tools, see
 * [SDKS and Other Tools](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/sdks.htm).
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
    builder = AlarmStatusSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AlarmStatusSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "severity",
        "ruleName",
        "timestampTriggered",
        "alarmSummary",
        "status",
        "suppression"
    })
    public AlarmStatusSummary(
            String id,
            String displayName,
            Severity severity,
            String ruleName,
            java.util.Date timestampTriggered,
            String alarmSummary,
            Status status,
            Suppression suppression) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.severity = severity;
        this.ruleName = ruleName;
        this.timestampTriggered = timestampTriggered;
        this.alarmSummary = alarmSummary;
        this.status = status;
        this.suppression = suppression;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The configured name of the alarm.
         * <p>
         * Example: {@code High CPU Utilization}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The configured name of the alarm.
         * <p>
         * Example: {@code High CPU Utilization}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The perceived type of response required when the alarm is in the "FIRING" state.
         * <p>
         * Example: {@code CRITICAL}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The perceived type of response required when the alarm is in the "FIRING" state.
         * <p>
         * Example: {@code CRITICAL}
         *
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Identifier of the alarm's base values for alarm evaluation, for use when the alarm contains overrides.
         * Default value is {@code BASE}. For information about alarm overrides, see {@link #alarmOverride(AlarmOverrideRequest) alarmOverride}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
        private String ruleName;

        /**
         * Identifier of the alarm's base values for alarm evaluation, for use when the alarm contains overrides.
         * Default value is {@code BASE}. For information about alarm overrides, see {@link #alarmOverride(AlarmOverrideRequest) alarmOverride}.
         *
         * @param ruleName the value to set
         * @return this builder
         **/
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            this.__explicitlySet__.add("ruleName");
            return this;
        }
        /**
         * Timestamp for the transition of the alarm state. For example, the time when the alarm transitioned from OK to Firing.
         * Note: A three-minute lag for this value accounts for any late-arriving metrics.
         * <p>
         * Example: {@code 2023-02-01T01:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestampTriggered")
        private java.util.Date timestampTriggered;

        /**
         * Timestamp for the transition of the alarm state. For example, the time when the alarm transitioned from OK to Firing.
         * Note: A three-minute lag for this value accounts for any late-arriving metrics.
         * <p>
         * Example: {@code 2023-02-01T01:02:29.600Z}
         *
         * @param timestampTriggered the value to set
         * @return this builder
         **/
        public Builder timestampTriggered(java.util.Date timestampTriggered) {
            this.timestampTriggered = timestampTriggered;
            this.__explicitlySet__.add("timestampTriggered");
            return this;
        }
        /**
         * Customizable alarm summary ({@code alarmSummary} [alarm message parameter](https://docs.cloud.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
         * Optionally include [dynamic variables](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * The alarm summary appears within the body of the alarm message and in responses to
         * {@link #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus}
         * {@link #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and
         * {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alarmSummary")
        private String alarmSummary;

        /**
         * Customizable alarm summary ({@code alarmSummary} [alarm message parameter](https://docs.cloud.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
         * Optionally include [dynamic variables](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * The alarm summary appears within the body of the alarm message and in responses to
         * {@link #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus}
         * {@link #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and
         * {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
         *
         * @param alarmSummary the value to set
         * @return this builder
         **/
        public Builder alarmSummary(String alarmSummary) {
            this.alarmSummary = alarmSummary;
            this.__explicitlySet__.add("alarmSummary");
            return this;
        }
        /**
         * The status of this alarm.
         * Status is collective, across all metric streams in the alarm.
         * To list alarm status for each metric stream, use {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
         * <p>
         * Example: {@code FIRING}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of this alarm.
         * Status is collective, across all metric streams in the alarm.
         * To list alarm status for each metric stream, use {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
         * <p>
         * Example: {@code FIRING}
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The configuration details for suppressing an alarm.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("suppression")
        private Suppression suppression;

        /**
         * The configuration details for suppressing an alarm.
         *
         * @param suppression the value to set
         * @return this builder
         **/
        public Builder suppression(Suppression suppression) {
            this.suppression = suppression;
            this.__explicitlySet__.add("suppression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmStatusSummary build() {
            AlarmStatusSummary model =
                    new AlarmStatusSummary(
                            this.id,
                            this.displayName,
                            this.severity,
                            this.ruleName,
                            this.timestampTriggered,
                            this.alarmSummary,
                            this.status,
                            this.suppression);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmStatusSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("ruleName")) {
                this.ruleName(model.getRuleName());
            }
            if (model.wasPropertyExplicitlySet("timestampTriggered")) {
                this.timestampTriggered(model.getTimestampTriggered());
            }
            if (model.wasPropertyExplicitlySet("alarmSummary")) {
                this.alarmSummary(model.getAlarmSummary());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("suppression")) {
                this.suppression(model.getSuppression());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The configured name of the alarm.
     * <p>
     * Example: {@code High CPU Utilization}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The configured name of the alarm.
     * <p>
     * Example: {@code High CPU Utilization}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The perceived type of response required when the alarm is in the "FIRING" state.
     * <p>
     * Example: {@code CRITICAL}
     *
     **/
    public enum Severity {
        Critical("CRITICAL"),
        Error("ERROR"),
        Warning("WARNING"),
        Info("INFO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Severity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The perceived type of response required when the alarm is in the "FIRING" state.
     * <p>
     * Example: {@code CRITICAL}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The perceived type of response required when the alarm is in the "FIRING" state.
     * <p>
     * Example: {@code CRITICAL}
     *
     * @return the value
     **/
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Identifier of the alarm's base values for alarm evaluation, for use when the alarm contains overrides.
     * Default value is {@code BASE}. For information about alarm overrides, see {@link #alarmOverride(AlarmOverrideRequest) alarmOverride}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
    private final String ruleName;

    /**
     * Identifier of the alarm's base values for alarm evaluation, for use when the alarm contains overrides.
     * Default value is {@code BASE}. For information about alarm overrides, see {@link #alarmOverride(AlarmOverrideRequest) alarmOverride}.
     *
     * @return the value
     **/
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Timestamp for the transition of the alarm state. For example, the time when the alarm transitioned from OK to Firing.
     * Note: A three-minute lag for this value accounts for any late-arriving metrics.
     * <p>
     * Example: {@code 2023-02-01T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestampTriggered")
    private final java.util.Date timestampTriggered;

    /**
     * Timestamp for the transition of the alarm state. For example, the time when the alarm transitioned from OK to Firing.
     * Note: A three-minute lag for this value accounts for any late-arriving metrics.
     * <p>
     * Example: {@code 2023-02-01T01:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimestampTriggered() {
        return timestampTriggered;
    }

    /**
     * Customizable alarm summary ({@code alarmSummary} [alarm message parameter](https://docs.cloud.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
     * Optionally include [dynamic variables](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * The alarm summary appears within the body of the alarm message and in responses to
     * {@link #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus}
     * {@link #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and
     * {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alarmSummary")
    private final String alarmSummary;

    /**
     * Customizable alarm summary ({@code alarmSummary} [alarm message parameter](https://docs.cloud.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
     * Optionally include [dynamic variables](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * The alarm summary appears within the body of the alarm message and in responses to
     * {@link #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus}
     * {@link #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and
     * {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     *
     * @return the value
     **/
    public String getAlarmSummary() {
        return alarmSummary;
    }

    /**
     * The status of this alarm.
     * Status is collective, across all metric streams in the alarm.
     * To list alarm status for each metric stream, use {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     * <p>
     * Example: {@code FIRING}
     *
     **/
    public enum Status {
        Firing("FIRING"),
        Ok("OK"),
        Suspended("SUSPENDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of this alarm.
     * Status is collective, across all metric streams in the alarm.
     * To list alarm status for each metric stream, use {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     * <p>
     * Example: {@code FIRING}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of this alarm.
     * Status is collective, across all metric streams in the alarm.
     * To list alarm status for each metric stream, use {@link #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     * <p>
     * Example: {@code FIRING}
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The configuration details for suppressing an alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suppression")
    private final Suppression suppression;

    /**
     * The configuration details for suppressing an alarm.
     *
     * @return the value
     **/
    public Suppression getSuppression() {
        return suppression;
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
        sb.append("AlarmStatusSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", ruleName=").append(String.valueOf(this.ruleName));
        sb.append(", timestampTriggered=").append(String.valueOf(this.timestampTriggered));
        sb.append(", alarmSummary=").append(String.valueOf(this.alarmSummary));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", suppression=").append(String.valueOf(this.suppression));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmStatusSummary)) {
            return false;
        }

        AlarmStatusSummary other = (AlarmStatusSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.ruleName, other.ruleName)
                && java.util.Objects.equals(this.timestampTriggered, other.timestampTriggered)
                && java.util.Objects.equals(this.alarmSummary, other.alarmSummary)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.suppression, other.suppression)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.ruleName == null ? 43 : this.ruleName.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampTriggered == null
                                ? 43
                                : this.timestampTriggered.hashCode());
        result = (result * PRIME) + (this.alarmSummary == null ? 43 : this.alarmSummary.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.suppression == null ? 43 : this.suppression.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
