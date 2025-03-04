/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Monthly backup policy. <br>
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
        builder = MonthlyBackupPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MonthlyBackupPolicy extends BackupPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
        private Integer retentionDays;

        public Builder retentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            this.__explicitlySet__.add("retentionDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("copyPolicy")
        private BackupCopyPolicy copyPolicy;

        public Builder copyPolicy(BackupCopyPolicy copyPolicy) {
            this.copyPolicy = copyPolicy;
            this.__explicitlySet__.add("copyPolicy");
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
        /**
         * Day of the month when the backup should start. To ensure that the backup runs monthly,
         * the latest day of the month that you can use to schedule a backup is the the 28th day.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("daysOfTheMonth")
        private java.util.List<Integer> daysOfTheMonth;

        /**
         * Day of the month when the backup should start. To ensure that the backup runs monthly,
         * the latest day of the month that you can use to schedule a backup is the the 28th day.
         *
         * @param daysOfTheMonth the value to set
         * @return this builder
         */
        public Builder daysOfTheMonth(java.util.List<Integer> daysOfTheMonth) {
            this.daysOfTheMonth = daysOfTheMonth;
            this.__explicitlySet__.add("daysOfTheMonth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonthlyBackupPolicy build() {
            MonthlyBackupPolicy model =
                    new MonthlyBackupPolicy(
                            this.retentionDays,
                            this.copyPolicy,
                            this.backupStart,
                            this.daysOfTheMonth);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonthlyBackupPolicy model) {
            if (model.wasPropertyExplicitlySet("retentionDays")) {
                this.retentionDays(model.getRetentionDays());
            }
            if (model.wasPropertyExplicitlySet("copyPolicy")) {
                this.copyPolicy(model.getCopyPolicy());
            }
            if (model.wasPropertyExplicitlySet("backupStart")) {
                this.backupStart(model.getBackupStart());
            }
            if (model.wasPropertyExplicitlySet("daysOfTheMonth")) {
                this.daysOfTheMonth(model.getDaysOfTheMonth());
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
    public MonthlyBackupPolicy(
            Integer retentionDays,
            BackupCopyPolicy copyPolicy,
            String backupStart,
            java.util.List<Integer> daysOfTheMonth) {
        super(retentionDays, copyPolicy);
        this.backupStart = backupStart;
        this.daysOfTheMonth = daysOfTheMonth;
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

    /**
     * Day of the month when the backup should start. To ensure that the backup runs monthly, the
     * latest day of the month that you can use to schedule a backup is the the 28th day.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfTheMonth")
    private final java.util.List<Integer> daysOfTheMonth;

    /**
     * Day of the month when the backup should start. To ensure that the backup runs monthly, the
     * latest day of the month that you can use to schedule a backup is the the 28th day.
     *
     * @return the value
     */
    public java.util.List<Integer> getDaysOfTheMonth() {
        return daysOfTheMonth;
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
        sb.append("MonthlyBackupPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", backupStart=").append(String.valueOf(this.backupStart));
        sb.append(", daysOfTheMonth=").append(String.valueOf(this.daysOfTheMonth));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonthlyBackupPolicy)) {
            return false;
        }

        MonthlyBackupPolicy other = (MonthlyBackupPolicy) o;
        return java.util.Objects.equals(this.backupStart, other.backupStart)
                && java.util.Objects.equals(this.daysOfTheMonth, other.daysOfTheMonth)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.backupStart == null ? 43 : this.backupStart.hashCode());
        result =
                (result * PRIME)
                        + (this.daysOfTheMonth == null ? 43 : this.daysOfTheMonth.hashCode());
        return result;
    }
}
