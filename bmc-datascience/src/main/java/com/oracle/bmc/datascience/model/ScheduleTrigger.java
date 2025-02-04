/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The trigger of the schedule can be UNIX cron or iCal expression or simple interval <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "triggerType",
        defaultImpl = ScheduleTrigger.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ScheduleICalTrigger.class,
            name = "ICAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ScheduleIntervalTrigger.class,
            name = "INTERVAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ScheduleCronTrigger.class,
            name = "CRON")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ScheduleTrigger extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd"})
    protected ScheduleTrigger(java.util.Date timeStart, java.util.Date timeEnd) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    /**
     * The schedule starting date time, if null, System set the time when schedule is created.
     * Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * The schedule starting date time, if null, System set the time when schedule is created.
     * Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * The schedule end date time, if null, the schedule will never expire. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The schedule end date time, if null, the schedule will never expire. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
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
        sb.append("ScheduleTrigger(");
        sb.append("super=").append(super.toString());
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleTrigger)) {
            return false;
        }

        ScheduleTrigger other = (ScheduleTrigger) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The schedule trigger type */
    public enum TriggerType implements com.oracle.bmc.http.internal.BmcEnum {
        Cron("CRON"),
        Interval("INTERVAL"),
        Ical("ICAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggerType.class);

        private final String value;
        private static java.util.Map<String, TriggerType> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggerType v : TriggerType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggerType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggerType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggerType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
