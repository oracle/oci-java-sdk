/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for the long-term backup schedule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LongTermBackUpScheduleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LongTermBackUpScheduleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "repeatCadence",
        "timeOfBackup",
        "retentionPeriodInDays",
        "isDisabled"
    })
    public LongTermBackUpScheduleDetails(
            RepeatCadence repeatCadence,
            java.util.Date timeOfBackup,
            Integer retentionPeriodInDays,
            Boolean isDisabled) {
        super();
        this.repeatCadence = repeatCadence;
        this.timeOfBackup = timeOfBackup;
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.isDisabled = isDisabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The frequency of the long-term backup schedule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repeatCadence")
        private RepeatCadence repeatCadence;

        /**
         * The frequency of the long-term backup schedule
         * @param repeatCadence the value to set
         * @return this builder
         **/
        public Builder repeatCadence(RepeatCadence repeatCadence) {
            this.repeatCadence = repeatCadence;
            this.__explicitlySet__.add("repeatCadence");
            return this;
        }
        /**
         * The timestamp for the long-term backup schedule. For a MONTHLY cadence, months having fewer days than the provided date will have the backup taken on the last day of that month.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfBackup")
        private java.util.Date timeOfBackup;

        /**
         * The timestamp for the long-term backup schedule. For a MONTHLY cadence, months having fewer days than the provided date will have the backup taken on the last day of that month.
         * @param timeOfBackup the value to set
         * @return this builder
         **/
        public Builder timeOfBackup(java.util.Date timeOfBackup) {
            this.timeOfBackup = timeOfBackup;
            this.__explicitlySet__.add("timeOfBackup");
            return this;
        }
        /**
         * Retention period, in days, for long-term backups
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Integer retentionPeriodInDays;

        /**
         * Retention period, in days, for long-term backups
         * @param retentionPeriodInDays the value to set
         * @return this builder
         **/
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }
        /**
         * Indicates if the long-term backup schedule should be deleted. The default value is {@code FALSE}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
        private Boolean isDisabled;

        /**
         * Indicates if the long-term backup schedule should be deleted. The default value is {@code FALSE}.
         *
         * @param isDisabled the value to set
         * @return this builder
         **/
        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            this.__explicitlySet__.add("isDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LongTermBackUpScheduleDetails build() {
            LongTermBackUpScheduleDetails model =
                    new LongTermBackUpScheduleDetails(
                            this.repeatCadence,
                            this.timeOfBackup,
                            this.retentionPeriodInDays,
                            this.isDisabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LongTermBackUpScheduleDetails model) {
            if (model.wasPropertyExplicitlySet("repeatCadence")) {
                this.repeatCadence(model.getRepeatCadence());
            }
            if (model.wasPropertyExplicitlySet("timeOfBackup")) {
                this.timeOfBackup(model.getTimeOfBackup());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("isDisabled")) {
                this.isDisabled(model.getIsDisabled());
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
     * The frequency of the long-term backup schedule
     **/
    public enum RepeatCadence {
        OneTime("ONE_TIME"),
        Weekly("WEEKLY"),
        Monthly("MONTHLY"),
        Yearly("YEARLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RepeatCadence.class);

        private final String value;
        private static java.util.Map<String, RepeatCadence> map;

        static {
            map = new java.util.HashMap<>();
            for (RepeatCadence v : RepeatCadence.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RepeatCadence(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RepeatCadence create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RepeatCadence', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The frequency of the long-term backup schedule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatCadence")
    private final RepeatCadence repeatCadence;

    /**
     * The frequency of the long-term backup schedule
     * @return the value
     **/
    public RepeatCadence getRepeatCadence() {
        return repeatCadence;
    }

    /**
     * The timestamp for the long-term backup schedule. For a MONTHLY cadence, months having fewer days than the provided date will have the backup taken on the last day of that month.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfBackup")
    private final java.util.Date timeOfBackup;

    /**
     * The timestamp for the long-term backup schedule. For a MONTHLY cadence, months having fewer days than the provided date will have the backup taken on the last day of that month.
     * @return the value
     **/
    public java.util.Date getTimeOfBackup() {
        return timeOfBackup;
    }

    /**
     * Retention period, in days, for long-term backups
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

    /**
     * Retention period, in days, for long-term backups
     * @return the value
     **/
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    /**
     * Indicates if the long-term backup schedule should be deleted. The default value is {@code FALSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
    private final Boolean isDisabled;

    /**
     * Indicates if the long-term backup schedule should be deleted. The default value is {@code FALSE}.
     *
     * @return the value
     **/
    public Boolean getIsDisabled() {
        return isDisabled;
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
        sb.append("LongTermBackUpScheduleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("repeatCadence=").append(String.valueOf(this.repeatCadence));
        sb.append(", timeOfBackup=").append(String.valueOf(this.timeOfBackup));
        sb.append(", retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(", isDisabled=").append(String.valueOf(this.isDisabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LongTermBackUpScheduleDetails)) {
            return false;
        }

        LongTermBackUpScheduleDetails other = (LongTermBackUpScheduleDetails) o;
        return java.util.Objects.equals(this.repeatCadence, other.repeatCadence)
                && java.util.Objects.equals(this.timeOfBackup, other.timeOfBackup)
                && java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
                && java.util.Objects.equals(this.isDisabled, other.isDisabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.repeatCadence == null ? 43 : this.repeatCadence.hashCode());
        result = (result * PRIME) + (this.timeOfBackup == null ? 43 : this.timeOfBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInDays == null
                                ? 43
                                : this.retentionPeriodInDays.hashCode());
        result = (result * PRIME) + (this.isDisabled == null ? 43 : this.isDisabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
