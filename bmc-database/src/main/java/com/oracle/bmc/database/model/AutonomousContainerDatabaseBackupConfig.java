/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Backup options for the Autonomous Container Database.
 *
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
    builder = AutonomousContainerDatabaseBackupConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousContainerDatabaseBackupConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"backupDestinationDetails", "recoveryWindowInDays"})
    public AutonomousContainerDatabaseBackupConfig(
            java.util.List<BackupDestinationDetails> backupDestinationDetails,
            Integer recoveryWindowInDays) {
        super();
        this.backupDestinationDetails = backupDestinationDetails;
        this.recoveryWindowInDays = recoveryWindowInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Backup destination details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
        private java.util.List<BackupDestinationDetails> backupDestinationDetails;

        /**
         * Backup destination details.
         * @param backupDestinationDetails the value to set
         * @return this builder
         **/
        public Builder backupDestinationDetails(
                java.util.List<BackupDestinationDetails> backupDestinationDetails) {
            this.backupDestinationDetails = backupDestinationDetails;
            this.__explicitlySet__.add("backupDestinationDetails");
            return this;
        }
        /**
         * Number of days between the current and the earliest point of recoverability covered by automatic backups.
         * This value applies to automatic backups. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
         * When the value is updated, it is applied to all existing automatic backups.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
        private Integer recoveryWindowInDays;

        /**
         * Number of days between the current and the earliest point of recoverability covered by automatic backups.
         * This value applies to automatic backups. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
         * When the value is updated, it is applied to all existing automatic backups.
         *
         * @param recoveryWindowInDays the value to set
         * @return this builder
         **/
        public Builder recoveryWindowInDays(Integer recoveryWindowInDays) {
            this.recoveryWindowInDays = recoveryWindowInDays;
            this.__explicitlySet__.add("recoveryWindowInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousContainerDatabaseBackupConfig build() {
            AutonomousContainerDatabaseBackupConfig __instance__ =
                    new AutonomousContainerDatabaseBackupConfig(
                            backupDestinationDetails, recoveryWindowInDays);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousContainerDatabaseBackupConfig o) {
            Builder copiedBuilder =
                    backupDestinationDetails(o.getBackupDestinationDetails())
                            .recoveryWindowInDays(o.getRecoveryWindowInDays());

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
     * Backup destination details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
    private final java.util.List<BackupDestinationDetails> backupDestinationDetails;

    /**
     * Backup destination details.
     * @return the value
     **/
    public java.util.List<BackupDestinationDetails> getBackupDestinationDetails() {
        return backupDestinationDetails;
    }

    /**
     * Number of days between the current and the earliest point of recoverability covered by automatic backups.
     * This value applies to automatic backups. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
     * When the value is updated, it is applied to all existing automatic backups.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
    private final Integer recoveryWindowInDays;

    /**
     * Number of days between the current and the earliest point of recoverability covered by automatic backups.
     * This value applies to automatic backups. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
     * When the value is updated, it is applied to all existing automatic backups.
     *
     * @return the value
     **/
    public Integer getRecoveryWindowInDays() {
        return recoveryWindowInDays;
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
        sb.append("AutonomousContainerDatabaseBackupConfig(");
        sb.append("backupDestinationDetails=")
                .append(String.valueOf(this.backupDestinationDetails));
        sb.append(", recoveryWindowInDays=").append(String.valueOf(this.recoveryWindowInDays));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousContainerDatabaseBackupConfig)) {
            return false;
        }

        AutonomousContainerDatabaseBackupConfig other = (AutonomousContainerDatabaseBackupConfig) o;
        return java.util.Objects.equals(
                        this.backupDestinationDetails, other.backupDestinationDetails)
                && java.util.Objects.equals(this.recoveryWindowInDays, other.recoveryWindowInDays)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
