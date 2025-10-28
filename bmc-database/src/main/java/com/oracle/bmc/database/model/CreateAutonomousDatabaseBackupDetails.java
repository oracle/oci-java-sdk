/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create an Oracle Autonomous AI Database backup.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAutonomousDatabaseBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutonomousDatabaseBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "autonomousDatabaseId",
        "retentionPeriodInDays",
        "isLongTermBackup",
        "backupDestinationDetails"
    })
    public CreateAutonomousDatabaseBackupDetails(
            String displayName,
            String autonomousDatabaseId,
            Integer retentionPeriodInDays,
            Boolean isLongTermBackup,
            BackupDestinationDetails backupDestinationDetails) {
        super();
        this.displayName = displayName;
        this.autonomousDatabaseId = autonomousDatabaseId;
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.isLongTermBackup = isLongTermBackup;
        this.backupDestinationDetails = backupDestinationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The user-friendly name for the backup. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the backup. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous AI Database backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
        private String autonomousDatabaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous AI Database backup.
         *
         * @param autonomousDatabaseId the value to set
         * @return this builder
         */
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            this.__explicitlySet__.add("autonomousDatabaseId");
            return this;
        }
        /** Retention period, in days, for long-term backups */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Integer retentionPeriodInDays;

        /**
         * Retention period, in days, for long-term backups
         *
         * @param retentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }
        /** Indicates whether the backup is long-term */
        @com.fasterxml.jackson.annotation.JsonProperty("isLongTermBackup")
        private Boolean isLongTermBackup;

        /**
         * Indicates whether the backup is long-term
         *
         * @param isLongTermBackup the value to set
         * @return this builder
         */
        public Builder isLongTermBackup(Boolean isLongTermBackup) {
            this.isLongTermBackup = isLongTermBackup;
            this.__explicitlySet__.add("isLongTermBackup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
        private BackupDestinationDetails backupDestinationDetails;

        public Builder backupDestinationDetails(BackupDestinationDetails backupDestinationDetails) {
            this.backupDestinationDetails = backupDestinationDetails;
            this.__explicitlySet__.add("backupDestinationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousDatabaseBackupDetails build() {
            CreateAutonomousDatabaseBackupDetails model =
                    new CreateAutonomousDatabaseBackupDetails(
                            this.displayName,
                            this.autonomousDatabaseId,
                            this.retentionPeriodInDays,
                            this.isLongTermBackup,
                            this.backupDestinationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousDatabaseBackupDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabaseId")) {
                this.autonomousDatabaseId(model.getAutonomousDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("isLongTermBackup")) {
                this.isLongTermBackup(model.getIsLongTermBackup());
            }
            if (model.wasPropertyExplicitlySet("backupDestinationDetails")) {
                this.backupDestinationDetails(model.getBackupDestinationDetails());
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

    /** The user-friendly name for the backup. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the backup. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous AI Database backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
    private final String autonomousDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous AI Database backup.
     *
     * @return the value
     */
    public String getAutonomousDatabaseId() {
        return autonomousDatabaseId;
    }

    /** Retention period, in days, for long-term backups */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

    /**
     * Retention period, in days, for long-term backups
     *
     * @return the value
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    /** Indicates whether the backup is long-term */
    @com.fasterxml.jackson.annotation.JsonProperty("isLongTermBackup")
    private final Boolean isLongTermBackup;

    /**
     * Indicates whether the backup is long-term
     *
     * @return the value
     */
    public Boolean getIsLongTermBackup() {
        return isLongTermBackup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
    private final BackupDestinationDetails backupDestinationDetails;

    public BackupDestinationDetails getBackupDestinationDetails() {
        return backupDestinationDetails;
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
        sb.append("CreateAutonomousDatabaseBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", autonomousDatabaseId=").append(String.valueOf(this.autonomousDatabaseId));
        sb.append(", retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(", isLongTermBackup=").append(String.valueOf(this.isLongTermBackup));
        sb.append(", backupDestinationDetails=")
                .append(String.valueOf(this.backupDestinationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousDatabaseBackupDetails)) {
            return false;
        }

        CreateAutonomousDatabaseBackupDetails other = (CreateAutonomousDatabaseBackupDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.autonomousDatabaseId, other.autonomousDatabaseId)
                && java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
                && java.util.Objects.equals(this.isLongTermBackup, other.isLongTermBackup)
                && java.util.Objects.equals(
                        this.backupDestinationDetails, other.backupDestinationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseId == null
                                ? 43
                                : this.autonomousDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInDays == null
                                ? 43
                                : this.retentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.isLongTermBackup == null ? 43 : this.isLongTermBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDestinationDetails == null
                                ? 43
                                : this.backupDestinationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
