/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * An alarm history entry indicating a description of the entry and the time that the entry
 * occurred. If the entry corresponds to a state transition, such as OK to Firing, then the entry
 * also includes a transition timestamp. <br>
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
        builder = AlarmHistoryEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AlarmHistoryEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "alarmSummary",
        "summary",
        "timestamp",
        "timestampTriggered"
    })
    public AlarmHistoryEntry(
            String alarmSummary,
            String summary,
            java.util.Date timestamp,
            java.util.Date timestampTriggered) {
        super();
        this.alarmSummary = alarmSummary;
        this.summary = summary;
        this.timestamp = timestamp;
        this.timestampTriggered = timestampTriggered;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Customizable alarm summary ({@code alarmSummary} [alarm message
         * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
         * Optionally include [dynamic
         * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * The alarm summary appears within the body of the alarm message and in responses to {@link
         * #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus} {@link
         * #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and {@link
         * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alarmSummary")
        private String alarmSummary;

        /**
         * Customizable alarm summary ({@code alarmSummary} [alarm message
         * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
         * Optionally include [dynamic
         * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * The alarm summary appears within the body of the alarm message and in responses to {@link
         * #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus} {@link
         * #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and {@link
         * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
         *
         * @param alarmSummary the value to set
         * @return this builder
         */
        public Builder alarmSummary(String alarmSummary) {
            this.alarmSummary = alarmSummary;
            this.__explicitlySet__.add("alarmSummary");
            return this;
        }
        /**
         * Description for this alarm history entry.
         *
         * <p>Example 1 - alarm state history entry: {@code The alarm state is FIRING}
         *
         * <p>Example 2 - alarm state transition history entry: {@code State transitioned from OK to
         * Firing}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * Description for this alarm history entry.
         *
         * <p>Example 1 - alarm state history entry: {@code The alarm state is FIRING}
         *
         * <p>Example 2 - alarm state transition history entry: {@code State transitioned from OK to
         * Firing}
         *
         * @param summary the value to set
         * @return this builder
         */
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /**
         * Timestamp for this alarm history entry. Format defined by RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Timestamp for this alarm history entry. Format defined by RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * Timestamp for the transition of the alarm state. For example, the time when the alarm
         * transitioned from OK to Firing. Available for state transition entries only. Note: A
         * three-minute lag for this value accounts for any late-arriving metrics.
         *
         * <p>Example: {@code 2023-02-01T0:59:00.789Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestampTriggered")
        private java.util.Date timestampTriggered;

        /**
         * Timestamp for the transition of the alarm state. For example, the time when the alarm
         * transitioned from OK to Firing. Available for state transition entries only. Note: A
         * three-minute lag for this value accounts for any late-arriving metrics.
         *
         * <p>Example: {@code 2023-02-01T0:59:00.789Z}
         *
         * @param timestampTriggered the value to set
         * @return this builder
         */
        public Builder timestampTriggered(java.util.Date timestampTriggered) {
            this.timestampTriggered = timestampTriggered;
            this.__explicitlySet__.add("timestampTriggered");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmHistoryEntry build() {
            AlarmHistoryEntry model =
                    new AlarmHistoryEntry(
                            this.alarmSummary,
                            this.summary,
                            this.timestamp,
                            this.timestampTriggered);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmHistoryEntry model) {
            if (model.wasPropertyExplicitlySet("alarmSummary")) {
                this.alarmSummary(model.getAlarmSummary());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("timestampTriggered")) {
                this.timestampTriggered(model.getTimestampTriggered());
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
     * Customizable alarm summary ({@code alarmSummary} [alarm message
     * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
     * Optionally include [dynamic
     * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * The alarm summary appears within the body of the alarm message and in responses to {@link
     * #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus} {@link
     * #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and {@link
     * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alarmSummary")
    private final String alarmSummary;

    /**
     * Customizable alarm summary ({@code alarmSummary} [alarm message
     * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
     * Optionally include [dynamic
     * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * The alarm summary appears within the body of the alarm message and in responses to {@link
     * #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus} {@link
     * #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and {@link
     * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     *
     * @return the value
     */
    public String getAlarmSummary() {
        return alarmSummary;
    }

    /**
     * Description for this alarm history entry.
     *
     * <p>Example 1 - alarm state history entry: {@code The alarm state is FIRING}
     *
     * <p>Example 2 - alarm state transition history entry: {@code State transitioned from OK to
     * Firing}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * Description for this alarm history entry.
     *
     * <p>Example 1 - alarm state history entry: {@code The alarm state is FIRING}
     *
     * <p>Example 2 - alarm state transition history entry: {@code State transitioned from OK to
     * Firing}
     *
     * @return the value
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Timestamp for this alarm history entry. Format defined by RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Timestamp for this alarm history entry. Format defined by RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp for the transition of the alarm state. For example, the time when the alarm
     * transitioned from OK to Firing. Available for state transition entries only. Note: A
     * three-minute lag for this value accounts for any late-arriving metrics.
     *
     * <p>Example: {@code 2023-02-01T0:59:00.789Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestampTriggered")
    private final java.util.Date timestampTriggered;

    /**
     * Timestamp for the transition of the alarm state. For example, the time when the alarm
     * transitioned from OK to Firing. Available for state transition entries only. Note: A
     * three-minute lag for this value accounts for any late-arriving metrics.
     *
     * <p>Example: {@code 2023-02-01T0:59:00.789Z}
     *
     * @return the value
     */
    public java.util.Date getTimestampTriggered() {
        return timestampTriggered;
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
        sb.append("AlarmHistoryEntry(");
        sb.append("super=").append(super.toString());
        sb.append("alarmSummary=").append(String.valueOf(this.alarmSummary));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", timestampTriggered=").append(String.valueOf(this.timestampTriggered));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmHistoryEntry)) {
            return false;
        }

        AlarmHistoryEntry other = (AlarmHistoryEntry) o;
        return java.util.Objects.equals(this.alarmSummary, other.alarmSummary)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.timestampTriggered, other.timestampTriggered)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alarmSummary == null ? 43 : this.alarmSummary.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampTriggered == null
                                ? 43
                                : this.timestampTriggered.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
