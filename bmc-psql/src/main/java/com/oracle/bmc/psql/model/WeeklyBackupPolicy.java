/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Weekly backup policy <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WeeklyBackupPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WeeklyBackupPolicy extends BackupPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
        private Integer retentionDays;

        public Builder retentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            this.__explicitlySet__.add("retentionDays");
            return this;
        }
        /** Weekly days */
        @com.fasterxml.jackson.annotation.JsonProperty("daysOfTheWeek")
        private java.util.List<DaysOfTheWeek> daysOfTheWeek;

        /**
         * Weekly days
         *
         * @param daysOfTheWeek the value to set
         * @return this builder
         */
        public Builder daysOfTheWeek(java.util.List<DaysOfTheWeek> daysOfTheWeek) {
            this.daysOfTheWeek = daysOfTheWeek;
            this.__explicitlySet__.add("daysOfTheWeek");
            return this;
        }
        /** Hour of the day when backup starts. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupStart")
        private String backupStart;

        /**
         * Hour of the day when backup starts.
         *
         * @param backupStart the value to set
         * @return this builder
         */
        public Builder backupStart(String backupStart) {
            this.backupStart = backupStart;
            this.__explicitlySet__.add("backupStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WeeklyBackupPolicy build() {
            WeeklyBackupPolicy model =
                    new WeeklyBackupPolicy(
                            this.retentionDays, this.daysOfTheWeek, this.backupStart);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WeeklyBackupPolicy model) {
            if (model.wasPropertyExplicitlySet("retentionDays")) {
                this.retentionDays(model.getRetentionDays());
            }
            if (model.wasPropertyExplicitlySet("daysOfTheWeek")) {
                this.daysOfTheWeek(model.getDaysOfTheWeek());
            }
            if (model.wasPropertyExplicitlySet("backupStart")) {
                this.backupStart(model.getBackupStart());
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

    @Deprecated
    public WeeklyBackupPolicy(
            Integer retentionDays,
            java.util.List<DaysOfTheWeek> daysOfTheWeek,
            String backupStart) {
        super(retentionDays);
        this.daysOfTheWeek = daysOfTheWeek;
        this.backupStart = backupStart;
    }

    /** */
    public enum DaysOfTheWeek implements com.oracle.bmc.http.internal.BmcEnum {
        Sunday("SUNDAY"),
        Monday("MONDAY"),
        Tuesday("TUESDAY"),
        Wednesday("WEDNESDAY"),
        Thursday("THURSDAY"),
        Friday("FRIDAY"),
        Saturday("SATURDAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DaysOfTheWeek.class);

        private final String value;
        private static java.util.Map<String, DaysOfTheWeek> map;

        static {
            map = new java.util.HashMap<>();
            for (DaysOfTheWeek v : DaysOfTheWeek.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DaysOfTheWeek(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DaysOfTheWeek create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DaysOfTheWeek', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Weekly days */
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfTheWeek")
    private final java.util.List<DaysOfTheWeek> daysOfTheWeek;

    /**
     * Weekly days
     *
     * @return the value
     */
    public java.util.List<DaysOfTheWeek> getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    /** Hour of the day when backup starts. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupStart")
    private final String backupStart;

    /**
     * Hour of the day when backup starts.
     *
     * @return the value
     */
    public String getBackupStart() {
        return backupStart;
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
        sb.append("WeeklyBackupPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", daysOfTheWeek=").append(String.valueOf(this.daysOfTheWeek));
        sb.append(", backupStart=").append(String.valueOf(this.backupStart));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WeeklyBackupPolicy)) {
            return false;
        }

        WeeklyBackupPolicy other = (WeeklyBackupPolicy) o;
        return java.util.Objects.equals(this.daysOfTheWeek, other.daysOfTheWeek)
                && java.util.Objects.equals(this.backupStart, other.backupStart)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.daysOfTheWeek == null ? 43 : this.daysOfTheWeek.hashCode());
        result = (result * PRIME) + (this.backupStart == null ? 43 : this.backupStart.hashCode());
        return result;
    }
}
