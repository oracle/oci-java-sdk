/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The summary for the record of an OS upgrade action on a DB system. <br>
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
        builder = DbSystemUpgradeHistoryEntrySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbSystemUpgradeHistoryEntrySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "action",
        "newGiVersion",
        "oldGiVersion",
        "oldOsVersion",
        "newOsVersion",
        "snapshotRetentionPeriodInDays",
        "lifecycleState",
        "lifecycleDetails",
        "timeStarted",
        "timeEnded"
    })
    public DbSystemUpgradeHistoryEntrySummary(
            String id,
            Action action,
            String newGiVersion,
            String oldGiVersion,
            String oldOsVersion,
            String newOsVersion,
            Integer snapshotRetentionPeriodInDays,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeStarted,
            java.util.Date timeEnded) {
        super();
        this.id = id;
        this.action = action;
        this.newGiVersion = newGiVersion;
        this.oldGiVersion = oldGiVersion;
        this.oldOsVersion = oldOsVersion;
        this.newOsVersion = newOsVersion;
        this.snapshotRetentionPeriodInDays = snapshotRetentionPeriodInDays;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * upgrade history entry.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * upgrade history entry.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The operating system upgrade action. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The operating system upgrade action.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /** A valid Oracle Grid Infrastructure (GI) software version. */
        @com.fasterxml.jackson.annotation.JsonProperty("newGiVersion")
        private String newGiVersion;

        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         *
         * @param newGiVersion the value to set
         * @return this builder
         */
        public Builder newGiVersion(String newGiVersion) {
            this.newGiVersion = newGiVersion;
            this.__explicitlySet__.add("newGiVersion");
            return this;
        }
        /** A valid Oracle Grid Infrastructure (GI) software version. */
        @com.fasterxml.jackson.annotation.JsonProperty("oldGiVersion")
        private String oldGiVersion;

        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         *
         * @param oldGiVersion the value to set
         * @return this builder
         */
        public Builder oldGiVersion(String oldGiVersion) {
            this.oldGiVersion = oldGiVersion;
            this.__explicitlySet__.add("oldGiVersion");
            return this;
        }
        /** A valid Oracle Software (OS) version eg. Oracle Linux Server release 8 */
        @com.fasterxml.jackson.annotation.JsonProperty("oldOsVersion")
        private String oldOsVersion;

        /**
         * A valid Oracle Software (OS) version eg. Oracle Linux Server release 8
         *
         * @param oldOsVersion the value to set
         * @return this builder
         */
        public Builder oldOsVersion(String oldOsVersion) {
            this.oldOsVersion = oldOsVersion;
            this.__explicitlySet__.add("oldOsVersion");
            return this;
        }
        /** A valid Oracle Software (OS) version eg. Oracle Linux Server release 8 */
        @com.fasterxml.jackson.annotation.JsonProperty("newOsVersion")
        private String newOsVersion;

        /**
         * A valid Oracle Software (OS) version eg. Oracle Linux Server release 8
         *
         * @param newOsVersion the value to set
         * @return this builder
         */
        public Builder newOsVersion(String newOsVersion) {
            this.newOsVersion = newOsVersion;
            this.__explicitlySet__.add("newOsVersion");
            return this;
        }
        /**
         * The retention period, in days, for the snapshot that allows you to perform a rollback of
         * the upgrade operation. After this number of days passes, you cannot roll back the
         * upgrade.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotRetentionPeriodInDays")
        private Integer snapshotRetentionPeriodInDays;

        /**
         * The retention period, in days, for the snapshot that allows you to perform a rollback of
         * the upgrade operation. After this number of days passes, you cannot roll back the
         * upgrade.
         *
         * @param snapshotRetentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder snapshotRetentionPeriodInDays(Integer snapshotRetentionPeriodInDays) {
            this.snapshotRetentionPeriodInDays = snapshotRetentionPeriodInDays;
            this.__explicitlySet__.add("snapshotRetentionPeriodInDays");
            return this;
        }
        /** The current state of the action. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the action.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A descriptive text associated with the lifecycleState. Typically contains additional
         * displayable text.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A descriptive text associated with the lifecycleState. Typically contains additional
         * displayable text.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The date and time when the upgrade action started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time when the upgrade action started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The date and time when the upgrade action completed */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time when the upgrade action completed
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemUpgradeHistoryEntrySummary build() {
            DbSystemUpgradeHistoryEntrySummary model =
                    new DbSystemUpgradeHistoryEntrySummary(
                            this.id,
                            this.action,
                            this.newGiVersion,
                            this.oldGiVersion,
                            this.oldOsVersion,
                            this.newOsVersion,
                            this.snapshotRetentionPeriodInDays,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeStarted,
                            this.timeEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemUpgradeHistoryEntrySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("newGiVersion")) {
                this.newGiVersion(model.getNewGiVersion());
            }
            if (model.wasPropertyExplicitlySet("oldGiVersion")) {
                this.oldGiVersion(model.getOldGiVersion());
            }
            if (model.wasPropertyExplicitlySet("oldOsVersion")) {
                this.oldOsVersion(model.getOldOsVersion());
            }
            if (model.wasPropertyExplicitlySet("newOsVersion")) {
                this.newOsVersion(model.getNewOsVersion());
            }
            if (model.wasPropertyExplicitlySet("snapshotRetentionPeriodInDays")) {
                this.snapshotRetentionPeriodInDays(model.getSnapshotRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * upgrade history entry.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * upgrade history entry.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The operating system upgrade action. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Precheck("PRECHECK"),
        Rollback("ROLLBACK"),
        UpdateSnapshotRetentionDays("UPDATE_SNAPSHOT_RETENTION_DAYS"),
        Upgrade("UPGRADE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The operating system upgrade action. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The operating system upgrade action.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /** A valid Oracle Grid Infrastructure (GI) software version. */
    @com.fasterxml.jackson.annotation.JsonProperty("newGiVersion")
    private final String newGiVersion;

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     *
     * @return the value
     */
    public String getNewGiVersion() {
        return newGiVersion;
    }

    /** A valid Oracle Grid Infrastructure (GI) software version. */
    @com.fasterxml.jackson.annotation.JsonProperty("oldGiVersion")
    private final String oldGiVersion;

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     *
     * @return the value
     */
    public String getOldGiVersion() {
        return oldGiVersion;
    }

    /** A valid Oracle Software (OS) version eg. Oracle Linux Server release 8 */
    @com.fasterxml.jackson.annotation.JsonProperty("oldOsVersion")
    private final String oldOsVersion;

    /**
     * A valid Oracle Software (OS) version eg. Oracle Linux Server release 8
     *
     * @return the value
     */
    public String getOldOsVersion() {
        return oldOsVersion;
    }

    /** A valid Oracle Software (OS) version eg. Oracle Linux Server release 8 */
    @com.fasterxml.jackson.annotation.JsonProperty("newOsVersion")
    private final String newOsVersion;

    /**
     * A valid Oracle Software (OS) version eg. Oracle Linux Server release 8
     *
     * @return the value
     */
    public String getNewOsVersion() {
        return newOsVersion;
    }

    /**
     * The retention period, in days, for the snapshot that allows you to perform a rollback of the
     * upgrade operation. After this number of days passes, you cannot roll back the upgrade.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotRetentionPeriodInDays")
    private final Integer snapshotRetentionPeriodInDays;

    /**
     * The retention period, in days, for the snapshot that allows you to perform a rollback of the
     * upgrade operation. After this number of days passes, you cannot roll back the upgrade.
     *
     * @return the value
     */
    public Integer getSnapshotRetentionPeriodInDays() {
        return snapshotRetentionPeriodInDays;
    }

    /** The current state of the action. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the action. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the action.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A descriptive text associated with the lifecycleState. Typically contains additional
     * displayable text.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A descriptive text associated with the lifecycleState. Typically contains additional
     * displayable text.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The date and time when the upgrade action started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time when the upgrade action started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The date and time when the upgrade action completed */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time when the upgrade action completed
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
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
        sb.append("DbSystemUpgradeHistoryEntrySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", newGiVersion=").append(String.valueOf(this.newGiVersion));
        sb.append(", oldGiVersion=").append(String.valueOf(this.oldGiVersion));
        sb.append(", oldOsVersion=").append(String.valueOf(this.oldOsVersion));
        sb.append(", newOsVersion=").append(String.valueOf(this.newOsVersion));
        sb.append(", snapshotRetentionPeriodInDays=")
                .append(String.valueOf(this.snapshotRetentionPeriodInDays));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemUpgradeHistoryEntrySummary)) {
            return false;
        }

        DbSystemUpgradeHistoryEntrySummary other = (DbSystemUpgradeHistoryEntrySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.newGiVersion, other.newGiVersion)
                && java.util.Objects.equals(this.oldGiVersion, other.oldGiVersion)
                && java.util.Objects.equals(this.oldOsVersion, other.oldOsVersion)
                && java.util.Objects.equals(this.newOsVersion, other.newOsVersion)
                && java.util.Objects.equals(
                        this.snapshotRetentionPeriodInDays, other.snapshotRetentionPeriodInDays)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.newGiVersion == null ? 43 : this.newGiVersion.hashCode());
        result = (result * PRIME) + (this.oldGiVersion == null ? 43 : this.oldGiVersion.hashCode());
        result = (result * PRIME) + (this.oldOsVersion == null ? 43 : this.oldOsVersion.hashCode());
        result = (result * PRIME) + (this.newOsVersion == null ? 43 : this.newOsVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotRetentionPeriodInDays == null
                                ? 43
                                : this.snapshotRetentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
