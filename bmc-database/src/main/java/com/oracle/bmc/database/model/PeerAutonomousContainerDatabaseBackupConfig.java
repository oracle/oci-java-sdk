/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Backup options for the standby Autonomous Container Database.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PeerAutonomousContainerDatabaseBackupConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PeerAutonomousContainerDatabaseBackupConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
        private java.util.List<BackupDestinationDetails> backupDestinationDetails;

        public Builder backupDestinationDetails(
                java.util.List<BackupDestinationDetails> backupDestinationDetails) {
            this.backupDestinationDetails = backupDestinationDetails;
            this.__explicitlySet__.add("backupDestinationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
        private Integer recoveryWindowInDays;

        public Builder recoveryWindowInDays(Integer recoveryWindowInDays) {
            this.recoveryWindowInDays = recoveryWindowInDays;
            this.__explicitlySet__.add("recoveryWindowInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeerAutonomousContainerDatabaseBackupConfig build() {
            PeerAutonomousContainerDatabaseBackupConfig __instance__ =
                    new PeerAutonomousContainerDatabaseBackupConfig(
                            backupDestinationDetails, recoveryWindowInDays);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeerAutonomousContainerDatabaseBackupConfig o) {
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

    /**
     * Backup destination details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
    java.util.List<BackupDestinationDetails> backupDestinationDetails;

    /**
     * Number of days between the current and the earliest point of recoverability covered by automatic backups.
     * This value applies to automatic backups. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
     * When the value is updated, it is applied to all existing automatic backups.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
    Integer recoveryWindowInDays;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
