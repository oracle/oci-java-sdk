/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for upgrading the operating system and Oracle Grid Infrastructure (GI) of a DB system.
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
    builder = UpgradeDbSystemDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpgradeDbSystemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotRetentionPeriodInDays")
        private Integer snapshotRetentionPeriodInDays;

        public Builder snapshotRetentionPeriodInDays(Integer snapshotRetentionPeriodInDays) {
            this.snapshotRetentionPeriodInDays = snapshotRetentionPeriodInDays;
            this.__explicitlySet__.add("snapshotRetentionPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newGiVersion")
        private String newGiVersion;

        public Builder newGiVersion(String newGiVersion) {
            this.newGiVersion = newGiVersion;
            this.__explicitlySet__.add("newGiVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSnapshotRetentionDaysForceUpdated")
        private Boolean isSnapshotRetentionDaysForceUpdated;

        public Builder isSnapshotRetentionDaysForceUpdated(
                Boolean isSnapshotRetentionDaysForceUpdated) {
            this.isSnapshotRetentionDaysForceUpdated = isSnapshotRetentionDaysForceUpdated;
            this.__explicitlySet__.add("isSnapshotRetentionDaysForceUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeDbSystemDetails build() {
            UpgradeDbSystemDetails __instance__ =
                    new UpgradeDbSystemDetails(
                            action,
                            snapshotRetentionPeriodInDays,
                            newGiVersion,
                            isSnapshotRetentionDaysForceUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeDbSystemDetails o) {
            Builder copiedBuilder =
                    action(o.getAction())
                            .snapshotRetentionPeriodInDays(o.getSnapshotRetentionPeriodInDays())
                            .newGiVersion(o.getNewGiVersion())
                            .isSnapshotRetentionDaysForceUpdated(
                                    o.getIsSnapshotRetentionDaysForceUpdated());

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
     * The operating system upgrade action.
     **/
    public enum Action {
        Precheck("PRECHECK"),
        Rollback("ROLLBACK"),
        UpdateSnapshotRetentionDays("UPDATE_SNAPSHOT_RETENTION_DAYS"),
        Upgrade("UPGRADE"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /**
     * The operating system upgrade action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;

    /**
     * The retention period, in days, for the snapshot that allows you to perform a rollback of the upgrade operation. After this number of days passes, you cannot roll back the upgrade.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotRetentionPeriodInDays")
    Integer snapshotRetentionPeriodInDays;

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newGiVersion")
    String newGiVersion;

    /**
     * If true, rollback time is updated even if operating system upgrade history contains errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSnapshotRetentionDaysForceUpdated")
    Boolean isSnapshotRetentionDaysForceUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
