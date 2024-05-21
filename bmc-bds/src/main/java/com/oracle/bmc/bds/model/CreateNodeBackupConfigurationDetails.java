/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the NodeBackupConfiguration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateNodeBackupConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateNodeBackupConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "levelTypeDetails",
        "displayName",
        "timezone",
        "schedule",
        "numberOfBackupsToRetain",
        "backupType"
    })
    public CreateNodeBackupConfigurationDetails(
            LevelTypeDetails levelTypeDetails,
            String displayName,
            String timezone,
            String schedule,
            Integer numberOfBackupsToRetain,
            NodeBackup.BackupType backupType) {
        super();
        this.levelTypeDetails = levelTypeDetails;
        this.displayName = displayName;
        this.timezone = timezone;
        this.schedule = schedule;
        this.numberOfBackupsToRetain = numberOfBackupsToRetain;
        this.backupType = backupType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("levelTypeDetails")
        private LevelTypeDetails levelTypeDetails;

        public Builder levelTypeDetails(LevelTypeDetails levelTypeDetails) {
            this.levelTypeDetails = levelTypeDetails;
            this.__explicitlySet__.add("levelTypeDetails");
            return this;
        }
        /**
         * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name
         * does not have to be unique, and it may be changed. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name
         * does not have to be unique, and it may be changed. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The time zone of the execution schedule, in IANA time zone database name format */
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * The time zone of the execution schedule, in IANA time zone database name format
         *
         * @param timezone the value to set
         * @return this builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * Day/time recurrence (specified following RFC 5545) at which to trigger the backup
         * process. Currently only DAILY, WEEKLY and MONTHLY frequency is supported. Days of the
         * week are specified using BYDAY field. Time of the day is specified using BYHOUR. Other
         * fields are not supported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * Day/time recurrence (specified following RFC 5545) at which to trigger the backup
         * process. Currently only DAILY, WEEKLY and MONTHLY frequency is supported. Days of the
         * week are specified using BYDAY field. Time of the day is specified using BYHOUR. Other
         * fields are not supported.
         *
         * @param schedule the value to set
         * @return this builder
         */
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /** Number of backup copies to retain. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfBackupsToRetain")
        private Integer numberOfBackupsToRetain;

        /**
         * Number of backup copies to retain.
         *
         * @param numberOfBackupsToRetain the value to set
         * @return this builder
         */
        public Builder numberOfBackupsToRetain(Integer numberOfBackupsToRetain) {
            this.numberOfBackupsToRetain = numberOfBackupsToRetain;
            this.__explicitlySet__.add("numberOfBackupsToRetain");
            return this;
        }
        /**
         * Incremental backup type includes only the changes since the last backup. Full backup type
         * includes all changes since the volume was created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private NodeBackup.BackupType backupType;

        /**
         * Incremental backup type includes only the changes since the last backup. Full backup type
         * includes all changes since the volume was created.
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(NodeBackup.BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNodeBackupConfigurationDetails build() {
            CreateNodeBackupConfigurationDetails model =
                    new CreateNodeBackupConfigurationDetails(
                            this.levelTypeDetails,
                            this.displayName,
                            this.timezone,
                            this.schedule,
                            this.numberOfBackupsToRetain,
                            this.backupType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNodeBackupConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("levelTypeDetails")) {
                this.levelTypeDetails(model.getLevelTypeDetails());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
            }
            if (model.wasPropertyExplicitlySet("numberOfBackupsToRetain")) {
                this.numberOfBackupsToRetain(model.getNumberOfBackupsToRetain());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
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

    @com.fasterxml.jackson.annotation.JsonProperty("levelTypeDetails")
    private final LevelTypeDetails levelTypeDetails;

    public LevelTypeDetails getLevelTypeDetails() {
        return levelTypeDetails;
    }

    /**
     * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name
     * does not have to be unique, and it may be changed. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name
     * does not have to be unique, and it may be changed. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The time zone of the execution schedule, in IANA time zone database name format */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * The time zone of the execution schedule, in IANA time zone database name format
     *
     * @return the value
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Day/time recurrence (specified following RFC 5545) at which to trigger the backup process.
     * Currently only DAILY, WEEKLY and MONTHLY frequency is supported. Days of the week are
     * specified using BYDAY field. Time of the day is specified using BYHOUR. Other fields are not
     * supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * Day/time recurrence (specified following RFC 5545) at which to trigger the backup process.
     * Currently only DAILY, WEEKLY and MONTHLY frequency is supported. Days of the week are
     * specified using BYDAY field. Time of the day is specified using BYHOUR. Other fields are not
     * supported.
     *
     * @return the value
     */
    public String getSchedule() {
        return schedule;
    }

    /** Number of backup copies to retain. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfBackupsToRetain")
    private final Integer numberOfBackupsToRetain;

    /**
     * Number of backup copies to retain.
     *
     * @return the value
     */
    public Integer getNumberOfBackupsToRetain() {
        return numberOfBackupsToRetain;
    }

    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type
     * includes all changes since the volume was created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final NodeBackup.BackupType backupType;

    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type
     * includes all changes since the volume was created.
     *
     * @return the value
     */
    public NodeBackup.BackupType getBackupType() {
        return backupType;
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
        sb.append("CreateNodeBackupConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("levelTypeDetails=").append(String.valueOf(this.levelTypeDetails));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", numberOfBackupsToRetain=")
                .append(String.valueOf(this.numberOfBackupsToRetain));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNodeBackupConfigurationDetails)) {
            return false;
        }

        CreateNodeBackupConfigurationDetails other = (CreateNodeBackupConfigurationDetails) o;
        return java.util.Objects.equals(this.levelTypeDetails, other.levelTypeDetails)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(
                        this.numberOfBackupsToRetain, other.numberOfBackupsToRetain)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.levelTypeDetails == null ? 43 : this.levelTypeDetails.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfBackupsToRetain == null
                                ? 43
                                : this.numberOfBackupsToRetain.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
