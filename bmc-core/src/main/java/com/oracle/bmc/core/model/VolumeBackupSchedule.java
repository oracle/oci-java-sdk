/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Defines a chronological recurrence pattern for creating scheduled backups at a particular periodicity.
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VolumeBackupSchedule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class VolumeBackupSchedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private BackupType backupType;

        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offsetSeconds")
        private Integer offsetSeconds;

        public Builder offsetSeconds(Integer offsetSeconds) {
            this.offsetSeconds = offsetSeconds;
            this.__explicitlySet__.add("offsetSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("period")
        private Period period;

        public Builder period(Period period) {
            this.period = period;
            this.__explicitlySet__.add("period");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retentionSeconds")
        private Integer retentionSeconds;

        public Builder retentionSeconds(Integer retentionSeconds) {
            this.retentionSeconds = retentionSeconds;
            this.__explicitlySet__.add("retentionSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeBackupSchedule build() {
            VolumeBackupSchedule __instance__ =
                    new VolumeBackupSchedule(backupType, offsetSeconds, period, retentionSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeBackupSchedule o) {
            Builder copiedBuilder =
                    backupType(o.getBackupType())
                            .offsetSeconds(o.getOffsetSeconds())
                            .period(o.getPeriod())
                            .retentionSeconds(o.getRetentionSeconds());

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
     * The type of backup to create.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BackupType {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupType v : BackupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of backup to create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    BackupType backupType;

    /**
     * The number of seconds (positive or negative) that the backup time should be shifted from the default interval boundaries specified by the period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offsetSeconds")
    Integer offsetSeconds;
    /**
     * How often the backup should occur.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Period {
        OneHour("ONE_HOUR"),
        OneDay("ONE_DAY"),
        OneWeek("ONE_WEEK"),
        OneMonth("ONE_MONTH"),
        OneYear("ONE_YEAR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Period> map;

        static {
            map = new java.util.HashMap<>();
            for (Period v : Period.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Period(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Period create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Period', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * How often the backup should occur.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    Period period;

    /**
     * How long, in seconds, backups created by this schedule should be kept until being automatically deleted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retentionSeconds")
    Integer retentionSeconds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
