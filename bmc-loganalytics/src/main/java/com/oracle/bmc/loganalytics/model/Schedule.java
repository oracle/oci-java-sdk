/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Schedule for scheduled task. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = Schedule.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CronSchedule.class, name = "CRON"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FixedFrequencySchedule.class,
            name = "FIXED_FREQUENCY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class Schedule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"misfirePolicy", "timeOfFirstExecution"})
    protected Schedule(MisfirePolicy misfirePolicy, java.util.Date timeOfFirstExecution) {
        super();
        this.misfirePolicy = misfirePolicy;
        this.timeOfFirstExecution = timeOfFirstExecution;
    }

    /** Schedule misfire retry policy. */
    public enum MisfirePolicy implements com.oracle.bmc.http.internal.BmcEnum {
        RetryOnce("RETRY_ONCE"),
        RetryIndefinitely("RETRY_INDEFINITELY"),
        Skip("SKIP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MisfirePolicy.class);

        private final String value;
        private static java.util.Map<String, MisfirePolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (MisfirePolicy v : MisfirePolicy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MisfirePolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MisfirePolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MisfirePolicy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Schedule misfire retry policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("misfirePolicy")
    private final MisfirePolicy misfirePolicy;

    /**
     * Schedule misfire retry policy.
     *
     * @return the value
     */
    public MisfirePolicy getMisfirePolicy() {
        return misfirePolicy;
    }

    /**
     * The date and time the scheduled task should execute first time after create or update;
     * thereafter the task will execute as specified in the schedule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfFirstExecution")
    private final java.util.Date timeOfFirstExecution;

    /**
     * The date and time the scheduled task should execute first time after create or update;
     * thereafter the task will execute as specified in the schedule.
     *
     * @return the value
     */
    public java.util.Date getTimeOfFirstExecution() {
        return timeOfFirstExecution;
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
        sb.append("Schedule(");
        sb.append("super=").append(super.toString());
        sb.append("misfirePolicy=").append(String.valueOf(this.misfirePolicy));
        sb.append(", timeOfFirstExecution=").append(String.valueOf(this.timeOfFirstExecution));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schedule)) {
            return false;
        }

        Schedule other = (Schedule) o;
        return java.util.Objects.equals(this.misfirePolicy, other.misfirePolicy)
                && java.util.Objects.equals(this.timeOfFirstExecution, other.timeOfFirstExecution)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.misfirePolicy == null ? 43 : this.misfirePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfFirstExecution == null
                                ? 43
                                : this.timeOfFirstExecution.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Schedule type discriminator. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        FixedFrequency("FIXED_FREQUENCY"),
        Cron("CRON"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
