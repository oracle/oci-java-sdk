/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the job schedule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JobScheduleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobScheduleDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"startTime", "endTime", "intervalType", "intervalValue"})
    public JobScheduleDetails(
            String startTime, String endTime, IntervalType intervalType, String intervalValue) {
        super();
        this.startTime = startTime;
        this.endTime = endTime;
        this.intervalType = intervalType;
        this.intervalValue = intervalValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The start time of the scheduled job in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private String startTime;

        /**
         * The start time of the scheduled job in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         * @param startTime the value to set
         * @return this builder
         **/
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /**
         * The end time of the scheduled job in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private String endTime;

        /**
         * The end time of the scheduled job in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         * @param endTime the value to set
         * @return this builder
         **/
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }
        /**
         * The interval type for a recurring scheduled job. For a non-recurring (one time) job, NEVER must be specified as the interval type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalType")
        private IntervalType intervalType;

        /**
         * The interval type for a recurring scheduled job. For a non-recurring (one time) job, NEVER must be specified as the interval type.
         * @param intervalType the value to set
         * @return this builder
         **/
        public Builder intervalType(IntervalType intervalType) {
            this.intervalType = intervalType;
            this.__explicitlySet__.add("intervalType");
            return this;
        }
        /**
         * The value for the interval period for a recurring scheduled job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalValue")
        private String intervalValue;

        /**
         * The value for the interval period for a recurring scheduled job.
         * @param intervalValue the value to set
         * @return this builder
         **/
        public Builder intervalValue(String intervalValue) {
            this.intervalValue = intervalValue;
            this.__explicitlySet__.add("intervalValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobScheduleDetails build() {
            JobScheduleDetails __instance__ =
                    new JobScheduleDetails(startTime, endTime, intervalType, intervalValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobScheduleDetails o) {
            Builder copiedBuilder =
                    startTime(o.getStartTime())
                            .endTime(o.getEndTime())
                            .intervalType(o.getIntervalType())
                            .intervalValue(o.getIntervalValue());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The start time of the scheduled job in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final String startTime;

    /**
     * The start time of the scheduled job in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * @return the value
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * The end time of the scheduled job in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final String endTime;

    /**
     * The end time of the scheduled job in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * @return the value
     **/
    public String getEndTime() {
        return endTime;
    }

    /**
     * The interval type for a recurring scheduled job. For a non-recurring (one time) job, NEVER must be specified as the interval type.
     **/
    public enum IntervalType {
        Daily("DAILY"),
        Hourly("HOURLY"),
        Weekly("WEEKLY"),
        Monthly("MONTHLY"),
        Never("NEVER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IntervalType.class);

        private final String value;
        private static java.util.Map<String, IntervalType> map;

        static {
            map = new java.util.HashMap<>();
            for (IntervalType v : IntervalType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IntervalType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IntervalType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IntervalType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The interval type for a recurring scheduled job. For a non-recurring (one time) job, NEVER must be specified as the interval type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalType")
    private final IntervalType intervalType;

    /**
     * The interval type for a recurring scheduled job. For a non-recurring (one time) job, NEVER must be specified as the interval type.
     * @return the value
     **/
    public IntervalType getIntervalType() {
        return intervalType;
    }

    /**
     * The value for the interval period for a recurring scheduled job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalValue")
    private final String intervalValue;

    /**
     * The value for the interval period for a recurring scheduled job.
     * @return the value
     **/
    public String getIntervalValue() {
        return intervalValue;
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
        sb.append("JobScheduleDetails(");
        sb.append("startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", intervalType=").append(String.valueOf(this.intervalType));
        sb.append(", intervalValue=").append(String.valueOf(this.intervalValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobScheduleDetails)) {
            return false;
        }

        JobScheduleDetails other = (JobScheduleDetails) o;
        return java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.intervalType, other.intervalType)
                && java.util.Objects.equals(this.intervalValue, other.intervalValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.intervalType == null ? 43 : this.intervalType.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalValue == null ? 43 : this.intervalValue.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
