/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Backup options for the standby Autonomous Container Database. <br>
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
        builder = PeerAutonomousContainerDatabaseBackupConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PeerAutonomousContainerDatabaseBackupConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"backupDestinationDetails", "recoveryWindowInDays"})
    public PeerAutonomousContainerDatabaseBackupConfig(
            java.util.List<BackupDestinationDetails> backupDestinationDetails,
            Integer recoveryWindowInDays) {
        super();
        this.backupDestinationDetails = backupDestinationDetails;
        this.recoveryWindowInDays = recoveryWindowInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Backup destination details. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
        private java.util.List<BackupDestinationDetails> backupDestinationDetails;

        /**
         * Backup destination details.
         *
         * @param backupDestinationDetails the value to set
         * @return this builder
         */
        public Builder backupDestinationDetails(
                java.util.List<BackupDestinationDetails> backupDestinationDetails) {
            this.backupDestinationDetails = backupDestinationDetails;
            this.__explicitlySet__.add("backupDestinationDetails");
            return this;
        }
        /**
         * Number of days between the current and the earliest point of recoverability covered by
         * automatic backups. This value applies to automatic backups. After a new automatic backup
         * has been created, Oracle removes old automatic backups that are created before the
         * window. When the value is updated, it is applied to all existing automatic backups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
        private Integer recoveryWindowInDays;

        /**
         * Number of days between the current and the earliest point of recoverability covered by
         * automatic backups. This value applies to automatic backups. After a new automatic backup
         * has been created, Oracle removes old automatic backups that are created before the
         * window. When the value is updated, it is applied to all existing automatic backups.
         *
         * @param recoveryWindowInDays the value to set
         * @return this builder
         */
        public Builder recoveryWindowInDays(Integer recoveryWindowInDays) {
            this.recoveryWindowInDays = recoveryWindowInDays;
            this.__explicitlySet__.add("recoveryWindowInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeerAutonomousContainerDatabaseBackupConfig build() {
            PeerAutonomousContainerDatabaseBackupConfig model =
                    new PeerAutonomousContainerDatabaseBackupConfig(
                            this.backupDestinationDetails, this.recoveryWindowInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeerAutonomousContainerDatabaseBackupConfig model) {
            if (model.wasPropertyExplicitlySet("backupDestinationDetails")) {
                this.backupDestinationDetails(model.getBackupDestinationDetails());
            }
            if (model.wasPropertyExplicitlySet("recoveryWindowInDays")) {
                this.recoveryWindowInDays(model.getRecoveryWindowInDays());
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

    /** Backup destination details. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
    private final java.util.List<BackupDestinationDetails> backupDestinationDetails;

    /**
     * Backup destination details.
     *
     * @return the value
     */
    public java.util.List<BackupDestinationDetails> getBackupDestinationDetails() {
        return backupDestinationDetails;
    }

    /**
     * Number of days between the current and the earliest point of recoverability covered by
     * automatic backups. This value applies to automatic backups. After a new automatic backup has
     * been created, Oracle removes old automatic backups that are created before the window. When
     * the value is updated, it is applied to all existing automatic backups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
    private final Integer recoveryWindowInDays;

    /**
     * Number of days between the current and the earliest point of recoverability covered by
     * automatic backups. This value applies to automatic backups. After a new automatic backup has
     * been created, Oracle removes old automatic backups that are created before the window. When
     * the value is updated, it is applied to all existing automatic backups.
     *
     * @return the value
     */
    public Integer getRecoveryWindowInDays() {
        return recoveryWindowInDays;
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
        sb.append("PeerAutonomousContainerDatabaseBackupConfig(");
        sb.append("super=").append(super.toString());
        sb.append("backupDestinationDetails=")
                .append(String.valueOf(this.backupDestinationDetails));
        sb.append(", recoveryWindowInDays=").append(String.valueOf(this.recoveryWindowInDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeerAutonomousContainerDatabaseBackupConfig)) {
            return false;
        }

        PeerAutonomousContainerDatabaseBackupConfig other =
                (PeerAutonomousContainerDatabaseBackupConfig) o;
        return java.util.Objects.equals(
                        this.backupDestinationDetails, other.backupDestinationDetails)
                && java.util.Objects.equals(this.recoveryWindowInDays, other.recoveryWindowInDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backupDestinationDetails == null
                                ? 43
                                : this.backupDestinationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryWindowInDays == null
                                ? 43
                                : this.recoveryWindowInDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
