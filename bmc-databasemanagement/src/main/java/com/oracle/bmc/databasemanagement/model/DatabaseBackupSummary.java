/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the High Availability (HA) and backup for a database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseBackupSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseBackupSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "backupStatus",
        "timeBackupCompleted",
        "backupDurationInSeconds",
        "backupType",
        "backupDestination",
        "backupSizeInGBs"
    })
    public DatabaseBackupSummary(
            String backupStatus,
            java.util.Date timeBackupCompleted,
            Integer backupDurationInSeconds,
            String backupType,
            BackupDestination backupDestination,
            Float backupSizeInGBs) {
        super();
        this.backupStatus = backupStatus;
        this.timeBackupCompleted = timeBackupCompleted;
        this.backupDurationInSeconds = backupDurationInSeconds;
        this.backupType = backupType;
        this.backupDestination = backupDestination;
        this.backupSizeInGBs = backupSizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The backup status of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupStatus")
        private String backupStatus;

        /**
         * The backup status of the database.
         *
         * @param backupStatus the value to set
         * @return this builder
         */
        public Builder backupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            this.__explicitlySet__.add("backupStatus");
            return this;
        }
        /**
         * The database backup completion date and time in UTC in ISO-8601 format, which is
         * "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBackupCompleted")
        private java.util.Date timeBackupCompleted;

        /**
         * The database backup completion date and time in UTC in ISO-8601 format, which is
         * "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param timeBackupCompleted the value to set
         * @return this builder
         */
        public Builder timeBackupCompleted(java.util.Date timeBackupCompleted) {
            this.timeBackupCompleted = timeBackupCompleted;
            this.__explicitlySet__.add("timeBackupCompleted");
            return this;
        }
        /** The backup duration of the database in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDurationInSeconds")
        private Integer backupDurationInSeconds;

        /**
         * The backup duration of the database in seconds.
         *
         * @param backupDurationInSeconds the value to set
         * @return this builder
         */
        public Builder backupDurationInSeconds(Integer backupDurationInSeconds) {
            this.backupDurationInSeconds = backupDurationInSeconds;
            this.__explicitlySet__.add("backupDurationInSeconds");
            return this;
        }
        /** The backup type of the database (FULL/INCREMENTAL). */
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private String backupType;

        /**
         * The backup type of the database (FULL/INCREMENTAL).
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(String backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /** The backup destination of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestination")
        private BackupDestination backupDestination;

        /**
         * The backup destination of the database.
         *
         * @param backupDestination the value to set
         * @return this builder
         */
        public Builder backupDestination(BackupDestination backupDestination) {
            this.backupDestination = backupDestination;
            this.__explicitlySet__.add("backupDestination");
            return this;
        }
        /** The backup size of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
        private Float backupSizeInGBs;

        /**
         * The backup size of the database.
         *
         * @param backupSizeInGBs the value to set
         * @return this builder
         */
        public Builder backupSizeInGBs(Float backupSizeInGBs) {
            this.backupSizeInGBs = backupSizeInGBs;
            this.__explicitlySet__.add("backupSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseBackupSummary build() {
            DatabaseBackupSummary model =
                    new DatabaseBackupSummary(
                            this.backupStatus,
                            this.timeBackupCompleted,
                            this.backupDurationInSeconds,
                            this.backupType,
                            this.backupDestination,
                            this.backupSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseBackupSummary model) {
            if (model.wasPropertyExplicitlySet("backupStatus")) {
                this.backupStatus(model.getBackupStatus());
            }
            if (model.wasPropertyExplicitlySet("timeBackupCompleted")) {
                this.timeBackupCompleted(model.getTimeBackupCompleted());
            }
            if (model.wasPropertyExplicitlySet("backupDurationInSeconds")) {
                this.backupDurationInSeconds(model.getBackupDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
            }
            if (model.wasPropertyExplicitlySet("backupDestination")) {
                this.backupDestination(model.getBackupDestination());
            }
            if (model.wasPropertyExplicitlySet("backupSizeInGBs")) {
                this.backupSizeInGBs(model.getBackupSizeInGBs());
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

    /** The backup status of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupStatus")
    private final String backupStatus;

    /**
     * The backup status of the database.
     *
     * @return the value
     */
    public String getBackupStatus() {
        return backupStatus;
    }

    /**
     * The database backup completion date and time in UTC in ISO-8601 format, which is
     * "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackupCompleted")
    private final java.util.Date timeBackupCompleted;

    /**
     * The database backup completion date and time in UTC in ISO-8601 format, which is
     * "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     * @return the value
     */
    public java.util.Date getTimeBackupCompleted() {
        return timeBackupCompleted;
    }

    /** The backup duration of the database in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDurationInSeconds")
    private final Integer backupDurationInSeconds;

    /**
     * The backup duration of the database in seconds.
     *
     * @return the value
     */
    public Integer getBackupDurationInSeconds() {
        return backupDurationInSeconds;
    }

    /** The backup type of the database (FULL/INCREMENTAL). */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final String backupType;

    /**
     * The backup type of the database (FULL/INCREMENTAL).
     *
     * @return the value
     */
    public String getBackupType() {
        return backupType;
    }

    /** The backup destination of the database. */
    public enum BackupDestination implements com.oracle.bmc.http.internal.BmcEnum {
        Disk("DISK"),
        Tape("TAPE"),
        Nfs("NFS"),
        Local("LOCAL"),
        Dbrs("DBRS"),
        ObjectStore("OBJECT_STORE"),
        RecoveryAppliance("RECOVERY_APPLIANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupDestination.class);

        private final String value;
        private static java.util.Map<String, BackupDestination> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupDestination v : BackupDestination.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupDestination(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupDestination create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupDestination', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The backup destination of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestination")
    private final BackupDestination backupDestination;

    /**
     * The backup destination of the database.
     *
     * @return the value
     */
    public BackupDestination getBackupDestination() {
        return backupDestination;
    }

    /** The backup size of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
    private final Float backupSizeInGBs;

    /**
     * The backup size of the database.
     *
     * @return the value
     */
    public Float getBackupSizeInGBs() {
        return backupSizeInGBs;
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
        sb.append("DatabaseBackupSummary(");
        sb.append("super=").append(super.toString());
        sb.append("backupStatus=").append(String.valueOf(this.backupStatus));
        sb.append(", timeBackupCompleted=").append(String.valueOf(this.timeBackupCompleted));
        sb.append(", backupDurationInSeconds=")
                .append(String.valueOf(this.backupDurationInSeconds));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(", backupDestination=").append(String.valueOf(this.backupDestination));
        sb.append(", backupSizeInGBs=").append(String.valueOf(this.backupSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseBackupSummary)) {
            return false;
        }

        DatabaseBackupSummary other = (DatabaseBackupSummary) o;
        return java.util.Objects.equals(this.backupStatus, other.backupStatus)
                && java.util.Objects.equals(this.timeBackupCompleted, other.timeBackupCompleted)
                && java.util.Objects.equals(
                        this.backupDurationInSeconds, other.backupDurationInSeconds)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.backupDestination, other.backupDestination)
                && java.util.Objects.equals(this.backupSizeInGBs, other.backupSizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.backupStatus == null ? 43 : this.backupStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBackupCompleted == null
                                ? 43
                                : this.timeBackupCompleted.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDurationInSeconds == null
                                ? 43
                                : this.backupDurationInSeconds.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDestination == null ? 43 : this.backupDestination.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSizeInGBs == null ? 43 : this.backupSizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
