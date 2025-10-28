/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to update the cross-region disaster recovery (DR) details of the standby Autonomous AI
 * Database Serverless instance. <br>
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
        builder = ChangeDisasterRecoveryConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChangeDisasterRecoveryConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "disasterRecoveryType",
        "timeSnapshotStandbyEnabledTill",
        "isSnapshotStandby",
        "isReplicateAutomaticBackups"
    })
    public ChangeDisasterRecoveryConfigurationDetails(
            DisasterRecoveryType disasterRecoveryType,
            java.util.Date timeSnapshotStandbyEnabledTill,
            Boolean isSnapshotStandby,
            Boolean isReplicateAutomaticBackups) {
        super();
        this.disasterRecoveryType = disasterRecoveryType;
        this.timeSnapshotStandbyEnabledTill = timeSnapshotStandbyEnabledTill;
        this.isSnapshotStandby = isSnapshotStandby;
        this.isReplicateAutomaticBackups = isReplicateAutomaticBackups;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates the disaster recovery (DR) type of the Autonomous AI Database Serverless
         * instance. Autonomous Data Guard (ADG) DR type provides business critical DR with a faster
         * recovery time objective (RTO) during failover or switchover. Backup-based DR type
         * provides lower cost DR with a slower RTO during failover or switchover.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disasterRecoveryType")
        private DisasterRecoveryType disasterRecoveryType;

        /**
         * Indicates the disaster recovery (DR) type of the Autonomous AI Database Serverless
         * instance. Autonomous Data Guard (ADG) DR type provides business critical DR with a faster
         * recovery time objective (RTO) during failover or switchover. Backup-based DR type
         * provides lower cost DR with a slower RTO during failover or switchover.
         *
         * @param disasterRecoveryType the value to set
         * @return this builder
         */
        public Builder disasterRecoveryType(DisasterRecoveryType disasterRecoveryType) {
            this.disasterRecoveryType = disasterRecoveryType;
            this.__explicitlySet__.add("disasterRecoveryType");
            return this;
        }
        /**
         * Time and date stored as an RFC 3339 formatted timestamp string. For example,
         * 2022-01-01T12:00:00.000Z would set a limit for the snapshot standby to be converted back
         * to a cross-region standby database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotStandbyEnabledTill")
        private java.util.Date timeSnapshotStandbyEnabledTill;

        /**
         * Time and date stored as an RFC 3339 formatted timestamp string. For example,
         * 2022-01-01T12:00:00.000Z would set a limit for the snapshot standby to be converted back
         * to a cross-region standby database.
         *
         * @param timeSnapshotStandbyEnabledTill the value to set
         * @return this builder
         */
        public Builder timeSnapshotStandbyEnabledTill(
                java.util.Date timeSnapshotStandbyEnabledTill) {
            this.timeSnapshotStandbyEnabledTill = timeSnapshotStandbyEnabledTill;
            this.__explicitlySet__.add("timeSnapshotStandbyEnabledTill");
            return this;
        }
        /**
         * Indicates if user wants to convert to a snapshot standby. For example, true would set a
         * standby database to snapshot standby database. False would set a snapshot standby
         * database back to regular standby database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSnapshotStandby")
        private Boolean isSnapshotStandby;

        /**
         * Indicates if user wants to convert to a snapshot standby. For example, true would set a
         * standby database to snapshot standby database. False would set a snapshot standby
         * database back to regular standby database.
         *
         * @param isSnapshotStandby the value to set
         * @return this builder
         */
        public Builder isSnapshotStandby(Boolean isSnapshotStandby) {
            this.isSnapshotStandby = isSnapshotStandby;
            this.__explicitlySet__.add("isSnapshotStandby");
            return this;
        }
        /**
         * If true, 7 days worth of backups are replicated across regions for Cross-Region ADB or
         * Backup-Based DR between Primary and Standby. If false, the backups taken on the Primary
         * are not replicated to the Standby database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isReplicateAutomaticBackups")
        private Boolean isReplicateAutomaticBackups;

        /**
         * If true, 7 days worth of backups are replicated across regions for Cross-Region ADB or
         * Backup-Based DR between Primary and Standby. If false, the backups taken on the Primary
         * are not replicated to the Standby database.
         *
         * @param isReplicateAutomaticBackups the value to set
         * @return this builder
         */
        public Builder isReplicateAutomaticBackups(Boolean isReplicateAutomaticBackups) {
            this.isReplicateAutomaticBackups = isReplicateAutomaticBackups;
            this.__explicitlySet__.add("isReplicateAutomaticBackups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeDisasterRecoveryConfigurationDetails build() {
            ChangeDisasterRecoveryConfigurationDetails model =
                    new ChangeDisasterRecoveryConfigurationDetails(
                            this.disasterRecoveryType,
                            this.timeSnapshotStandbyEnabledTill,
                            this.isSnapshotStandby,
                            this.isReplicateAutomaticBackups);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeDisasterRecoveryConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("disasterRecoveryType")) {
                this.disasterRecoveryType(model.getDisasterRecoveryType());
            }
            if (model.wasPropertyExplicitlySet("timeSnapshotStandbyEnabledTill")) {
                this.timeSnapshotStandbyEnabledTill(model.getTimeSnapshotStandbyEnabledTill());
            }
            if (model.wasPropertyExplicitlySet("isSnapshotStandby")) {
                this.isSnapshotStandby(model.getIsSnapshotStandby());
            }
            if (model.wasPropertyExplicitlySet("isReplicateAutomaticBackups")) {
                this.isReplicateAutomaticBackups(model.getIsReplicateAutomaticBackups());
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
     * Indicates the disaster recovery (DR) type of the Autonomous AI Database Serverless instance.
     * Autonomous Data Guard (ADG) DR type provides business critical DR with a faster recovery time
     * objective (RTO) during failover or switchover. Backup-based DR type provides lower cost DR
     * with a slower RTO during failover or switchover.
     */
    public enum DisasterRecoveryType implements com.oracle.bmc.http.internal.BmcEnum {
        Adg("ADG"),
        BackupBased("BACKUP_BASED"),
        ;

        private final String value;
        private static java.util.Map<String, DisasterRecoveryType> map;

        static {
            map = new java.util.HashMap<>();
            for (DisasterRecoveryType v : DisasterRecoveryType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DisasterRecoveryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DisasterRecoveryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DisasterRecoveryType: " + key);
        }
    };
    /**
     * Indicates the disaster recovery (DR) type of the Autonomous AI Database Serverless instance.
     * Autonomous Data Guard (ADG) DR type provides business critical DR with a faster recovery time
     * objective (RTO) during failover or switchover. Backup-based DR type provides lower cost DR
     * with a slower RTO during failover or switchover.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disasterRecoveryType")
    private final DisasterRecoveryType disasterRecoveryType;

    /**
     * Indicates the disaster recovery (DR) type of the Autonomous AI Database Serverless instance.
     * Autonomous Data Guard (ADG) DR type provides business critical DR with a faster recovery time
     * objective (RTO) during failover or switchover. Backup-based DR type provides lower cost DR
     * with a slower RTO during failover or switchover.
     *
     * @return the value
     */
    public DisasterRecoveryType getDisasterRecoveryType() {
        return disasterRecoveryType;
    }

    /**
     * Time and date stored as an RFC 3339 formatted timestamp string. For example,
     * 2022-01-01T12:00:00.000Z would set a limit for the snapshot standby to be converted back to a
     * cross-region standby database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotStandbyEnabledTill")
    private final java.util.Date timeSnapshotStandbyEnabledTill;

    /**
     * Time and date stored as an RFC 3339 formatted timestamp string. For example,
     * 2022-01-01T12:00:00.000Z would set a limit for the snapshot standby to be converted back to a
     * cross-region standby database.
     *
     * @return the value
     */
    public java.util.Date getTimeSnapshotStandbyEnabledTill() {
        return timeSnapshotStandbyEnabledTill;
    }

    /**
     * Indicates if user wants to convert to a snapshot standby. For example, true would set a
     * standby database to snapshot standby database. False would set a snapshot standby database
     * back to regular standby database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSnapshotStandby")
    private final Boolean isSnapshotStandby;

    /**
     * Indicates if user wants to convert to a snapshot standby. For example, true would set a
     * standby database to snapshot standby database. False would set a snapshot standby database
     * back to regular standby database.
     *
     * @return the value
     */
    public Boolean getIsSnapshotStandby() {
        return isSnapshotStandby;
    }

    /**
     * If true, 7 days worth of backups are replicated across regions for Cross-Region ADB or
     * Backup-Based DR between Primary and Standby. If false, the backups taken on the Primary are
     * not replicated to the Standby database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isReplicateAutomaticBackups")
    private final Boolean isReplicateAutomaticBackups;

    /**
     * If true, 7 days worth of backups are replicated across regions for Cross-Region ADB or
     * Backup-Based DR between Primary and Standby. If false, the backups taken on the Primary are
     * not replicated to the Standby database.
     *
     * @return the value
     */
    public Boolean getIsReplicateAutomaticBackups() {
        return isReplicateAutomaticBackups;
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
        sb.append("ChangeDisasterRecoveryConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("disasterRecoveryType=").append(String.valueOf(this.disasterRecoveryType));
        sb.append(", timeSnapshotStandbyEnabledTill=")
                .append(String.valueOf(this.timeSnapshotStandbyEnabledTill));
        sb.append(", isSnapshotStandby=").append(String.valueOf(this.isSnapshotStandby));
        sb.append(", isReplicateAutomaticBackups=")
                .append(String.valueOf(this.isReplicateAutomaticBackups));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDisasterRecoveryConfigurationDetails)) {
            return false;
        }

        ChangeDisasterRecoveryConfigurationDetails other =
                (ChangeDisasterRecoveryConfigurationDetails) o;
        return java.util.Objects.equals(this.disasterRecoveryType, other.disasterRecoveryType)
                && java.util.Objects.equals(
                        this.timeSnapshotStandbyEnabledTill, other.timeSnapshotStandbyEnabledTill)
                && java.util.Objects.equals(this.isSnapshotStandby, other.isSnapshotStandby)
                && java.util.Objects.equals(
                        this.isReplicateAutomaticBackups, other.isReplicateAutomaticBackups)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.disasterRecoveryType == null
                                ? 43
                                : this.disasterRecoveryType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSnapshotStandbyEnabledTill == null
                                ? 43
                                : this.timeSnapshotStandbyEnabledTill.hashCode());
        result =
                (result * PRIME)
                        + (this.isSnapshotStandby == null ? 43 : this.isSnapshotStandby.hashCode());
        result =
                (result * PRIME)
                        + (this.isReplicateAutomaticBackups == null
                                ? 43
                                : this.isReplicateAutomaticBackups.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
