/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The Maintenance Policy for the DB System or Read Replica that this model is included in. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaintenanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "windowStartTime",
        "versionPreference",
        "versionTrackPreference",
        "maintenanceScheduleType",
        "timeScheduled",
        "targetVersion"
    })
    public MaintenanceDetails(
            String windowStartTime,
            VersionPreference versionPreference,
            VersionTrackPreference versionTrackPreference,
            MaintenanceScheduleType maintenanceScheduleType,
            java.util.Date timeScheduled,
            String targetVersion) {
        super();
        this.windowStartTime = windowStartTime;
        this.versionPreference = versionPreference;
        this.versionTrackPreference = versionTrackPreference;
        this.maintenanceScheduleType = maintenanceScheduleType;
        this.timeScheduled = timeScheduled;
        this.targetVersion = targetVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The start time of the maintenance window.
         *
         * <p>This string is of the format: "{day-of-week} {time-of-day}".
         *
         * <p>"{day-of-week}" is a case-insensitive string like "mon", "tue", &c.
         *
         * <p>"{time-of-day}" is the "Time" portion of an RFC3339-formatted timestamp. Any second or
         * sub-second time data will be truncated to zero.
         *
         * <p>If you set the read replica maintenance window to "" or if not specified, the read
         * replica is set same as the DB system maintenance window.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("windowStartTime")
        private String windowStartTime;

        /**
         * The start time of the maintenance window.
         *
         * <p>This string is of the format: "{day-of-week} {time-of-day}".
         *
         * <p>"{day-of-week}" is a case-insensitive string like "mon", "tue", &c.
         *
         * <p>"{time-of-day}" is the "Time" portion of an RFC3339-formatted timestamp. Any second or
         * sub-second time data will be truncated to zero.
         *
         * <p>If you set the read replica maintenance window to "" or if not specified, the read
         * replica is set same as the DB system maintenance window.
         *
         * @param windowStartTime the value to set
         * @return this builder
         */
        public Builder windowStartTime(String windowStartTime) {
            this.windowStartTime = windowStartTime;
            this.__explicitlySet__.add("windowStartTime");
            return this;
        }
        /**
         * The preferred version to target when performing an automatic MySQL upgrade.
         *
         * <p>OLDEST: Choose the oldest available MySQL version based on the current version of the
         * DB System. SECOND_NEWEST: Choose the MySQL version before the newest for auto-upgrade.
         * NEWEST: Choose the latest and greatest MySQL version available for auto-upgrade.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("versionPreference")
        private VersionPreference versionPreference;

        /**
         * The preferred version to target when performing an automatic MySQL upgrade.
         *
         * <p>OLDEST: Choose the oldest available MySQL version based on the current version of the
         * DB System. SECOND_NEWEST: Choose the MySQL version before the newest for auto-upgrade.
         * NEWEST: Choose the latest and greatest MySQL version available for auto-upgrade.
         *
         * @param versionPreference the value to set
         * @return this builder
         */
        public Builder versionPreference(VersionPreference versionPreference) {
            this.versionPreference = versionPreference;
            this.__explicitlySet__.add("versionPreference");
            return this;
        }
        /**
         * The preferred version track to target when performing an automatic MySQL upgrade.
         * LONG_TERM_SUPPORT: No MySQL database behavior changes. INNOVATION: Provides access to the
         * latest features and all bug fixes. FOLLOW: Follows the track of the current MySQL
         * version.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("versionTrackPreference")
        private VersionTrackPreference versionTrackPreference;

        /**
         * The preferred version track to target when performing an automatic MySQL upgrade.
         * LONG_TERM_SUPPORT: No MySQL database behavior changes. INNOVATION: Provides access to the
         * latest features and all bug fixes. FOLLOW: Follows the track of the current MySQL
         * version.
         *
         * @param versionTrackPreference the value to set
         * @return this builder
         */
        public Builder versionTrackPreference(VersionTrackPreference versionTrackPreference) {
            this.versionTrackPreference = versionTrackPreference;
            this.__explicitlySet__.add("versionTrackPreference");
            return this;
        }
        /**
         * The maintenance schedule type of the DB system. EARLY: Maintenance schedule follows a
         * cycle where upgrades are performed when versions become deprecated. REGULAR: Maintenance
         * schedule follows the normal cycle where upgrades are performed when versions become
         * unavailable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceScheduleType")
        private MaintenanceScheduleType maintenanceScheduleType;

        /**
         * The maintenance schedule type of the DB system. EARLY: Maintenance schedule follows a
         * cycle where upgrades are performed when versions become deprecated. REGULAR: Maintenance
         * schedule follows the normal cycle where upgrades are performed when versions become
         * unavailable.
         *
         * @param maintenanceScheduleType the value to set
         * @return this builder
         */
        public Builder maintenanceScheduleType(MaintenanceScheduleType maintenanceScheduleType) {
            this.maintenanceScheduleType = maintenanceScheduleType;
            this.__explicitlySet__.add("maintenanceScheduleType");
            return this;
        }
        /**
         * The time the scheduled maintenance is expected to start, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The time the scheduled maintenance is expected to start, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /**
         * The version that is expected to be targeted during the next scheduled maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
        private String targetVersion;

        /**
         * The version that is expected to be targeted during the next scheduled maintenance run.
         *
         * @param targetVersion the value to set
         * @return this builder
         */
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            this.__explicitlySet__.add("targetVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceDetails build() {
            MaintenanceDetails model =
                    new MaintenanceDetails(
                            this.windowStartTime,
                            this.versionPreference,
                            this.versionTrackPreference,
                            this.maintenanceScheduleType,
                            this.timeScheduled,
                            this.targetVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceDetails model) {
            if (model.wasPropertyExplicitlySet("windowStartTime")) {
                this.windowStartTime(model.getWindowStartTime());
            }
            if (model.wasPropertyExplicitlySet("versionPreference")) {
                this.versionPreference(model.getVersionPreference());
            }
            if (model.wasPropertyExplicitlySet("versionTrackPreference")) {
                this.versionTrackPreference(model.getVersionTrackPreference());
            }
            if (model.wasPropertyExplicitlySet("maintenanceScheduleType")) {
                this.maintenanceScheduleType(model.getMaintenanceScheduleType());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("targetVersion")) {
                this.targetVersion(model.getTargetVersion());
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
     * The start time of the maintenance window.
     *
     * <p>This string is of the format: "{day-of-week} {time-of-day}".
     *
     * <p>"{day-of-week}" is a case-insensitive string like "mon", "tue", &c.
     *
     * <p>"{time-of-day}" is the "Time" portion of an RFC3339-formatted timestamp. Any second or
     * sub-second time data will be truncated to zero.
     *
     * <p>If you set the read replica maintenance window to "" or if not specified, the read replica
     * is set same as the DB system maintenance window.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("windowStartTime")
    private final String windowStartTime;

    /**
     * The start time of the maintenance window.
     *
     * <p>This string is of the format: "{day-of-week} {time-of-day}".
     *
     * <p>"{day-of-week}" is a case-insensitive string like "mon", "tue", &c.
     *
     * <p>"{time-of-day}" is the "Time" portion of an RFC3339-formatted timestamp. Any second or
     * sub-second time data will be truncated to zero.
     *
     * <p>If you set the read replica maintenance window to "" or if not specified, the read replica
     * is set same as the DB system maintenance window.
     *
     * @return the value
     */
    public String getWindowStartTime() {
        return windowStartTime;
    }

    /**
     * The preferred version to target when performing an automatic MySQL upgrade.
     *
     * <p>OLDEST: Choose the oldest available MySQL version based on the current version of the DB
     * System. SECOND_NEWEST: Choose the MySQL version before the newest for auto-upgrade. NEWEST:
     * Choose the latest and greatest MySQL version available for auto-upgrade.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versionPreference")
    private final VersionPreference versionPreference;

    /**
     * The preferred version to target when performing an automatic MySQL upgrade.
     *
     * <p>OLDEST: Choose the oldest available MySQL version based on the current version of the DB
     * System. SECOND_NEWEST: Choose the MySQL version before the newest for auto-upgrade. NEWEST:
     * Choose the latest and greatest MySQL version available for auto-upgrade.
     *
     * @return the value
     */
    public VersionPreference getVersionPreference() {
        return versionPreference;
    }

    /**
     * The preferred version track to target when performing an automatic MySQL upgrade.
     * LONG_TERM_SUPPORT: No MySQL database behavior changes. INNOVATION: Provides access to the
     * latest features and all bug fixes. FOLLOW: Follows the track of the current MySQL version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versionTrackPreference")
    private final VersionTrackPreference versionTrackPreference;

    /**
     * The preferred version track to target when performing an automatic MySQL upgrade.
     * LONG_TERM_SUPPORT: No MySQL database behavior changes. INNOVATION: Provides access to the
     * latest features and all bug fixes. FOLLOW: Follows the track of the current MySQL version.
     *
     * @return the value
     */
    public VersionTrackPreference getVersionTrackPreference() {
        return versionTrackPreference;
    }

    /**
     * The maintenance schedule type of the DB system. EARLY: Maintenance schedule follows a cycle
     * where upgrades are performed when versions become deprecated. REGULAR: Maintenance schedule
     * follows the normal cycle where upgrades are performed when versions become unavailable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceScheduleType")
    private final MaintenanceScheduleType maintenanceScheduleType;

    /**
     * The maintenance schedule type of the DB system. EARLY: Maintenance schedule follows a cycle
     * where upgrades are performed when versions become deprecated. REGULAR: Maintenance schedule
     * follows the normal cycle where upgrades are performed when versions become unavailable.
     *
     * @return the value
     */
    public MaintenanceScheduleType getMaintenanceScheduleType() {
        return maintenanceScheduleType;
    }

    /**
     * The time the scheduled maintenance is expected to start, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The time the scheduled maintenance is expected to start, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /** The version that is expected to be targeted during the next scheduled maintenance run. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    private final String targetVersion;

    /**
     * The version that is expected to be targeted during the next scheduled maintenance run.
     *
     * @return the value
     */
    public String getTargetVersion() {
        return targetVersion;
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
        sb.append("MaintenanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("windowStartTime=").append(String.valueOf(this.windowStartTime));
        sb.append(", versionPreference=").append(String.valueOf(this.versionPreference));
        sb.append(", versionTrackPreference=").append(String.valueOf(this.versionTrackPreference));
        sb.append(", maintenanceScheduleType=")
                .append(String.valueOf(this.maintenanceScheduleType));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", targetVersion=").append(String.valueOf(this.targetVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceDetails)) {
            return false;
        }

        MaintenanceDetails other = (MaintenanceDetails) o;
        return java.util.Objects.equals(this.windowStartTime, other.windowStartTime)
                && java.util.Objects.equals(this.versionPreference, other.versionPreference)
                && java.util.Objects.equals(
                        this.versionTrackPreference, other.versionTrackPreference)
                && java.util.Objects.equals(
                        this.maintenanceScheduleType, other.maintenanceScheduleType)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.targetVersion, other.targetVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.windowStartTime == null ? 43 : this.windowStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.versionPreference == null ? 43 : this.versionPreference.hashCode());
        result =
                (result * PRIME)
                        + (this.versionTrackPreference == null
                                ? 43
                                : this.versionTrackPreference.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceScheduleType == null
                                ? 43
                                : this.maintenanceScheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.targetVersion == null ? 43 : this.targetVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
