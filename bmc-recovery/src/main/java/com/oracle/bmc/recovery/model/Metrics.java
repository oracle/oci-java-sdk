/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Backup performance and storage utilization metrics for the protected database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Metrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Metrics extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "backupSpaceUsedInGBs",
        "backupSpaceEstimateInGBs",
        "unprotectedWindowInSeconds",
        "dbSizeInGBs",
        "isRedoLogsEnabled",
        "retentionPeriodInDays",
        "currentRetentionPeriodInSeconds"
    })
    public Metrics(
            Float backupSpaceUsedInGBs,
            Float backupSpaceEstimateInGBs,
            Float unprotectedWindowInSeconds,
            Float dbSizeInGBs,
            Boolean isRedoLogsEnabled,
            Float retentionPeriodInDays,
            Float currentRetentionPeriodInSeconds) {
        super();
        this.backupSpaceUsedInGBs = backupSpaceUsedInGBs;
        this.backupSpaceEstimateInGBs = backupSpaceEstimateInGBs;
        this.unprotectedWindowInSeconds = unprotectedWindowInSeconds;
        this.dbSizeInGBs = dbSizeInGBs;
        this.isRedoLogsEnabled = isRedoLogsEnabled;
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.currentRetentionPeriodInSeconds = currentRetentionPeriodInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Backup storage space, in gigabytes, utilized by the protected database. Oracle charges
         * for the total storage used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSpaceUsedInGBs")
        private Float backupSpaceUsedInGBs;

        /**
         * Backup storage space, in gigabytes, utilized by the protected database. Oracle charges
         * for the total storage used.
         *
         * @param backupSpaceUsedInGBs the value to set
         * @return this builder
         */
        public Builder backupSpaceUsedInGBs(Float backupSpaceUsedInGBs) {
            this.backupSpaceUsedInGBs = backupSpaceUsedInGBs;
            this.__explicitlySet__.add("backupSpaceUsedInGBs");
            return this;
        }
        /**
         * The estimated backup storage space, in gigabytes, required to meet the recovery window
         * goal, including foot print and backups for the protected database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSpaceEstimateInGBs")
        private Float backupSpaceEstimateInGBs;

        /**
         * The estimated backup storage space, in gigabytes, required to meet the recovery window
         * goal, including foot print and backups for the protected database.
         *
         * @param backupSpaceEstimateInGBs the value to set
         * @return this builder
         */
        public Builder backupSpaceEstimateInGBs(Float backupSpaceEstimateInGBs) {
            this.backupSpaceEstimateInGBs = backupSpaceEstimateInGBs;
            this.__explicitlySet__.add("backupSpaceEstimateInGBs");
            return this;
        }
        /**
         * This is the time window when there is data loss exposure. The point after which recovery
         * is impossible unless additional redo is available. This is the time we received the last
         * backup or last redo-log shipped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unprotectedWindowInSeconds")
        private Float unprotectedWindowInSeconds;

        /**
         * This is the time window when there is data loss exposure. The point after which recovery
         * is impossible unless additional redo is available. This is the time we received the last
         * backup or last redo-log shipped.
         *
         * @param unprotectedWindowInSeconds the value to set
         * @return this builder
         */
        public Builder unprotectedWindowInSeconds(Float unprotectedWindowInSeconds) {
            this.unprotectedWindowInSeconds = unprotectedWindowInSeconds;
            this.__explicitlySet__.add("unprotectedWindowInSeconds");
            return this;
        }
        /**
         * The estimated space, in gigabytes, consumed by the protected database. The database size
         * is based on the size of the data files in the catalog, and does not include archive logs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSizeInGBs")
        private Float dbSizeInGBs;

        /**
         * The estimated space, in gigabytes, consumed by the protected database. The database size
         * is based on the size of the data files in the catalog, and does not include archive logs.
         *
         * @param dbSizeInGBs the value to set
         * @return this builder
         */
        public Builder dbSizeInGBs(Float dbSizeInGBs) {
            this.dbSizeInGBs = dbSizeInGBs;
            this.__explicitlySet__.add("dbSizeInGBs");
            return this;
        }
        /**
         * The value TRUE indicates that the protected database is configured to use Real-time data
         * protection, and redo-data is sent from the protected database to Recovery Service.
         * Real-time data protection substantially reduces the window of potential data loss that
         * exists between successive archived redo log backups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLogsEnabled")
        private Boolean isRedoLogsEnabled;

        /**
         * The value TRUE indicates that the protected database is configured to use Real-time data
         * protection, and redo-data is sent from the protected database to Recovery Service.
         * Real-time data protection substantially reduces the window of potential data loss that
         * exists between successive archived redo log backups.
         *
         * @param isRedoLogsEnabled the value to set
         * @return this builder
         */
        public Builder isRedoLogsEnabled(Boolean isRedoLogsEnabled) {
            this.isRedoLogsEnabled = isRedoLogsEnabled;
            this.__explicitlySet__.add("isRedoLogsEnabled");
            return this;
        }
        /** The maximum number of days to retain backups for a protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Float retentionPeriodInDays;

        /**
         * The maximum number of days to retain backups for a protected database.
         *
         * @param retentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodInDays(Float retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }
        /** Number of seconds backups are currently retained for this database. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentRetentionPeriodInSeconds")
        private Float currentRetentionPeriodInSeconds;

        /**
         * Number of seconds backups are currently retained for this database.
         *
         * @param currentRetentionPeriodInSeconds the value to set
         * @return this builder
         */
        public Builder currentRetentionPeriodInSeconds(Float currentRetentionPeriodInSeconds) {
            this.currentRetentionPeriodInSeconds = currentRetentionPeriodInSeconds;
            this.__explicitlySet__.add("currentRetentionPeriodInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Metrics build() {
            Metrics model =
                    new Metrics(
                            this.backupSpaceUsedInGBs,
                            this.backupSpaceEstimateInGBs,
                            this.unprotectedWindowInSeconds,
                            this.dbSizeInGBs,
                            this.isRedoLogsEnabled,
                            this.retentionPeriodInDays,
                            this.currentRetentionPeriodInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Metrics model) {
            if (model.wasPropertyExplicitlySet("backupSpaceUsedInGBs")) {
                this.backupSpaceUsedInGBs(model.getBackupSpaceUsedInGBs());
            }
            if (model.wasPropertyExplicitlySet("backupSpaceEstimateInGBs")) {
                this.backupSpaceEstimateInGBs(model.getBackupSpaceEstimateInGBs());
            }
            if (model.wasPropertyExplicitlySet("unprotectedWindowInSeconds")) {
                this.unprotectedWindowInSeconds(model.getUnprotectedWindowInSeconds());
            }
            if (model.wasPropertyExplicitlySet("dbSizeInGBs")) {
                this.dbSizeInGBs(model.getDbSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("isRedoLogsEnabled")) {
                this.isRedoLogsEnabled(model.getIsRedoLogsEnabled());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("currentRetentionPeriodInSeconds")) {
                this.currentRetentionPeriodInSeconds(model.getCurrentRetentionPeriodInSeconds());
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
     * Backup storage space, in gigabytes, utilized by the protected database. Oracle charges for
     * the total storage used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSpaceUsedInGBs")
    private final Float backupSpaceUsedInGBs;

    /**
     * Backup storage space, in gigabytes, utilized by the protected database. Oracle charges for
     * the total storage used.
     *
     * @return the value
     */
    public Float getBackupSpaceUsedInGBs() {
        return backupSpaceUsedInGBs;
    }

    /**
     * The estimated backup storage space, in gigabytes, required to meet the recovery window goal,
     * including foot print and backups for the protected database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSpaceEstimateInGBs")
    private final Float backupSpaceEstimateInGBs;

    /**
     * The estimated backup storage space, in gigabytes, required to meet the recovery window goal,
     * including foot print and backups for the protected database.
     *
     * @return the value
     */
    public Float getBackupSpaceEstimateInGBs() {
        return backupSpaceEstimateInGBs;
    }

    /**
     * This is the time window when there is data loss exposure. The point after which recovery is
     * impossible unless additional redo is available. This is the time we received the last backup
     * or last redo-log shipped.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unprotectedWindowInSeconds")
    private final Float unprotectedWindowInSeconds;

    /**
     * This is the time window when there is data loss exposure. The point after which recovery is
     * impossible unless additional redo is available. This is the time we received the last backup
     * or last redo-log shipped.
     *
     * @return the value
     */
    public Float getUnprotectedWindowInSeconds() {
        return unprotectedWindowInSeconds;
    }

    /**
     * The estimated space, in gigabytes, consumed by the protected database. The database size is
     * based on the size of the data files in the catalog, and does not include archive logs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSizeInGBs")
    private final Float dbSizeInGBs;

    /**
     * The estimated space, in gigabytes, consumed by the protected database. The database size is
     * based on the size of the data files in the catalog, and does not include archive logs.
     *
     * @return the value
     */
    public Float getDbSizeInGBs() {
        return dbSizeInGBs;
    }

    /**
     * The value TRUE indicates that the protected database is configured to use Real-time data
     * protection, and redo-data is sent from the protected database to Recovery Service. Real-time
     * data protection substantially reduces the window of potential data loss that exists between
     * successive archived redo log backups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLogsEnabled")
    private final Boolean isRedoLogsEnabled;

    /**
     * The value TRUE indicates that the protected database is configured to use Real-time data
     * protection, and redo-data is sent from the protected database to Recovery Service. Real-time
     * data protection substantially reduces the window of potential data loss that exists between
     * successive archived redo log backups.
     *
     * @return the value
     */
    public Boolean getIsRedoLogsEnabled() {
        return isRedoLogsEnabled;
    }

    /** The maximum number of days to retain backups for a protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Float retentionPeriodInDays;

    /**
     * The maximum number of days to retain backups for a protected database.
     *
     * @return the value
     */
    public Float getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    /** Number of seconds backups are currently retained for this database. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentRetentionPeriodInSeconds")
    private final Float currentRetentionPeriodInSeconds;

    /**
     * Number of seconds backups are currently retained for this database.
     *
     * @return the value
     */
    public Float getCurrentRetentionPeriodInSeconds() {
        return currentRetentionPeriodInSeconds;
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
        sb.append("Metrics(");
        sb.append("super=").append(super.toString());
        sb.append("backupSpaceUsedInGBs=").append(String.valueOf(this.backupSpaceUsedInGBs));
        sb.append(", backupSpaceEstimateInGBs=")
                .append(String.valueOf(this.backupSpaceEstimateInGBs));
        sb.append(", unprotectedWindowInSeconds=")
                .append(String.valueOf(this.unprotectedWindowInSeconds));
        sb.append(", dbSizeInGBs=").append(String.valueOf(this.dbSizeInGBs));
        sb.append(", isRedoLogsEnabled=").append(String.valueOf(this.isRedoLogsEnabled));
        sb.append(", retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(", currentRetentionPeriodInSeconds=")
                .append(String.valueOf(this.currentRetentionPeriodInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Metrics)) {
            return false;
        }

        Metrics other = (Metrics) o;
        return java.util.Objects.equals(this.backupSpaceUsedInGBs, other.backupSpaceUsedInGBs)
                && java.util.Objects.equals(
                        this.backupSpaceEstimateInGBs, other.backupSpaceEstimateInGBs)
                && java.util.Objects.equals(
                        this.unprotectedWindowInSeconds, other.unprotectedWindowInSeconds)
                && java.util.Objects.equals(this.dbSizeInGBs, other.dbSizeInGBs)
                && java.util.Objects.equals(this.isRedoLogsEnabled, other.isRedoLogsEnabled)
                && java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
                && java.util.Objects.equals(
                        this.currentRetentionPeriodInSeconds, other.currentRetentionPeriodInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backupSpaceUsedInGBs == null
                                ? 43
                                : this.backupSpaceUsedInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSpaceEstimateInGBs == null
                                ? 43
                                : this.backupSpaceEstimateInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.unprotectedWindowInSeconds == null
                                ? 43
                                : this.unprotectedWindowInSeconds.hashCode());
        result = (result * PRIME) + (this.dbSizeInGBs == null ? 43 : this.dbSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.isRedoLogsEnabled == null ? 43 : this.isRedoLogsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInDays == null
                                ? 43
                                : this.retentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.currentRetentionPeriodInSeconds == null
                                ? 43
                                : this.currentRetentionPeriodInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
