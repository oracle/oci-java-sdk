/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous Data Guard standby database details.
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
    builder = AutonomousDatabaseStandbySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDatabaseStandbySummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lagTimeInSeconds",
        "lifecycleState",
        "lifecycleDetails",
        "timeDataGuardRoleChanged"
    })
    public AutonomousDatabaseStandbySummary(
            Integer lagTimeInSeconds,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeDataGuardRoleChanged) {
        super();
        this.lagTimeInSeconds = lagTimeInSeconds;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeDataGuardRoleChanged = timeDataGuardRoleChanged;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The amount of time, in seconds, that the data of the standby database lags the data of the primary database. Can be used to determine the potential data loss in the event of a failover.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lagTimeInSeconds")
        private Integer lagTimeInSeconds;

        /**
         * The amount of time, in seconds, that the data of the standby database lags the data of the primary database. Can be used to determine the potential data loss in the event of a failover.
         * @param lagTimeInSeconds the value to set
         * @return this builder
         **/
        public Builder lagTimeInSeconds(Integer lagTimeInSeconds) {
            this.lagTimeInSeconds = lagTimeInSeconds;
            this.__explicitlySet__.add("lagTimeInSeconds");
            return this;
        }
        /**
         * The current state of the Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Autonomous Database.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Additional information about the current lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the Autonomous Data Guard role was switched for the standby Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataGuardRoleChanged")
        private java.util.Date timeDataGuardRoleChanged;

        /**
         * The date and time the Autonomous Data Guard role was switched for the standby Autonomous Database.
         * @param timeDataGuardRoleChanged the value to set
         * @return this builder
         **/
        public Builder timeDataGuardRoleChanged(java.util.Date timeDataGuardRoleChanged) {
            this.timeDataGuardRoleChanged = timeDataGuardRoleChanged;
            this.__explicitlySet__.add("timeDataGuardRoleChanged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseStandbySummary build() {
            AutonomousDatabaseStandbySummary __instance__ =
                    new AutonomousDatabaseStandbySummary(
                            lagTimeInSeconds,
                            lifecycleState,
                            lifecycleDetails,
                            timeDataGuardRoleChanged);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseStandbySummary o) {
            Builder copiedBuilder =
                    lagTimeInSeconds(o.getLagTimeInSeconds())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeDataGuardRoleChanged(o.getTimeDataGuardRoleChanged());

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
     * The amount of time, in seconds, that the data of the standby database lags the data of the primary database. Can be used to determine the potential data loss in the event of a failover.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lagTimeInSeconds")
    private final Integer lagTimeInSeconds;

    /**
     * The amount of time, in seconds, that the data of the standby database lags the data of the primary database. Can be used to determine the potential data loss in the event of a failover.
     * @return the value
     **/
    public Integer getLagTimeInSeconds() {
        return lagTimeInSeconds;
    }

    /**
     * The current state of the Autonomous Database.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        Starting("STARTING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Unavailable("UNAVAILABLE"),
        RestoreInProgress("RESTORE_IN_PROGRESS"),
        RestoreFailed("RESTORE_FAILED"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        ScaleInProgress("SCALE_IN_PROGRESS"),
        AvailableNeedsAttention("AVAILABLE_NEEDS_ATTENTION"),
        Updating("UPDATING"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        Restarting("RESTARTING"),
        Recreating("RECREATING"),
        RoleChangeInProgress("ROLE_CHANGE_IN_PROGRESS"),
        Upgrading("UPGRADING"),
        Inaccessible("INACCESSIBLE"),
        Standby("STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current state of the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Autonomous Database.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the Autonomous Data Guard role was switched for the standby Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataGuardRoleChanged")
    private final java.util.Date timeDataGuardRoleChanged;

    /**
     * The date and time the Autonomous Data Guard role was switched for the standby Autonomous Database.
     * @return the value
     **/
    public java.util.Date getTimeDataGuardRoleChanged() {
        return timeDataGuardRoleChanged;
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
        sb.append("AutonomousDatabaseStandbySummary(");
        sb.append("lagTimeInSeconds=").append(String.valueOf(this.lagTimeInSeconds));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeDataGuardRoleChanged=")
                .append(String.valueOf(this.timeDataGuardRoleChanged));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseStandbySummary)) {
            return false;
        }

        AutonomousDatabaseStandbySummary other = (AutonomousDatabaseStandbySummary) o;
        return java.util.Objects.equals(this.lagTimeInSeconds, other.lagTimeInSeconds)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.timeDataGuardRoleChanged, other.timeDataGuardRoleChanged)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lagTimeInSeconds == null ? 43 : this.lagTimeInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataGuardRoleChanged == null
                                ? 43
                                : this.timeDataGuardRoleChanged.hashCode());
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
