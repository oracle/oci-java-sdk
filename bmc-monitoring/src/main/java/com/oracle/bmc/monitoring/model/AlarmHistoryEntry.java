/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring.model;

/**
 * An alarm history entry indicating a description of the entry and the time that the entry occurred.
 * If the entry corresponds to a state transition, such as OK to Firing, then the entry also includes a transition timestamp.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AlarmHistoryEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AlarmHistoryEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestampTriggered")
        private java.util.Date timestampTriggered;

        public Builder timestampTriggered(java.util.Date timestampTriggered) {
            this.timestampTriggered = timestampTriggered;
            this.__explicitlySet__.add("timestampTriggered");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmHistoryEntry build() {
            AlarmHistoryEntry __instance__ =
                    new AlarmHistoryEntry(summary, timestamp, timestampTriggered);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmHistoryEntry o) {
            Builder copiedBuilder =
                    summary(o.getSummary())
                            .timestamp(o.getTimestamp())
                            .timestampTriggered(o.getTimestampTriggered());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Description for this alarm history entry. Avoid entering confidential information.
     * <p>
     * Example 1 - alarm state history entry: `The alarm state is FIRING`
     * <p>
     * Example 2 - alarm state transition history entry: `State transitioned from OK to Firing`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    String summary;

    /**
     * Timestamp for this alarm history entry. Format defined by RFC3339.
     * <p>
     * Example: `2019-02-01T01:02:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    /**
     * Timestamp for the transition of the alarm state. For example, the time when the alarm transitioned from OK to Firing.
     * Available for state transition entries only. Note: A three-minute lag for this value accounts for any late-arriving metrics.
     * <p>
     * Example: `2019-02-01T0:59:00.789Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestampTriggered")
    java.util.Date timestampTriggered;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
