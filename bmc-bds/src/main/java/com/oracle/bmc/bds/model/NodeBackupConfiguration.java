/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the NodeBackupConfiguration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NodeBackupConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodeBackupConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "bdsInstanceId",
        "displayName",
        "levelTypeDetails",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "timezone",
        "schedule",
        "numberOfBackupsToRetain",
        "backupType"
    })
    public NodeBackupConfiguration(
            String id,
            String bdsInstanceId,
            String displayName,
            LevelTypeDetails levelTypeDetails,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String timezone,
            String schedule,
            Integer numberOfBackupsToRetain,
            NodeBackup.BackupType backupType) {
        super();
        this.id = id;
        this.bdsInstanceId = bdsInstanceId;
        this.displayName = displayName;
        this.levelTypeDetails = levelTypeDetails;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timezone = timezone;
        this.schedule = schedule;
        this.numberOfBackupsToRetain = numberOfBackupsToRetain;
        this.backupType = backupType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier for the NodeBackupConfiguration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier for the NodeBackupConfiguration.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the bdsInstance which is the parent resource id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bdsInstanceId")
        private String bdsInstanceId;

        /**
         * The OCID of the bdsInstance which is the parent resource id.
         * @param bdsInstanceId the value to set
         * @return this builder
         **/
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            this.__explicitlySet__.add("bdsInstanceId");
            return this;
        }
        /**
         * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("levelTypeDetails")
        private LevelTypeDetails levelTypeDetails;

        public Builder levelTypeDetails(LevelTypeDetails levelTypeDetails) {
            this.levelTypeDetails = levelTypeDetails;
            this.__explicitlySet__.add("levelTypeDetails");
            return this;
        }
        /**
         * The state of the NodeBackupConfiguration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the NodeBackupConfiguration.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The time the NodeBackupConfiguration was created, shown as an RFC 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the NodeBackupConfiguration was created, shown as an RFC 3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the NodeBackupConfiguration was updated, shown as an RFC 3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the NodeBackupConfiguration was updated, shown as an RFC 3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time zone of the execution schedule, in IANA time zone database name format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * The time zone of the execution schedule, in IANA time zone database name format
         * @param timezone the value to set
         * @return this builder
         **/
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * Day/time recurrence (specified following RFC 5545) at which to trigger the backup process. Currently only DAILY, WEEKLY and MONTHLY frequency is supported. Days of the week are specified using BYDAY field. Time of the day is specified using BYHOUR. Other fields are not supported.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * Day/time recurrence (specified following RFC 5545) at which to trigger the backup process. Currently only DAILY, WEEKLY and MONTHLY frequency is supported. Days of the week are specified using BYDAY field. Time of the day is specified using BYHOUR. Other fields are not supported.
         *
         * @param schedule the value to set
         * @return this builder
         **/
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /**
         * Number of backup copies to retain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfBackupsToRetain")
        private Integer numberOfBackupsToRetain;

        /**
         * Number of backup copies to retain.
         * @param numberOfBackupsToRetain the value to set
         * @return this builder
         **/
        public Builder numberOfBackupsToRetain(Integer numberOfBackupsToRetain) {
            this.numberOfBackupsToRetain = numberOfBackupsToRetain;
            this.__explicitlySet__.add("numberOfBackupsToRetain");
            return this;
        }
        /**
         * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private NodeBackup.BackupType backupType;

        /**
         * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
         * @param backupType the value to set
         * @return this builder
         **/
        public Builder backupType(NodeBackup.BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeBackupConfiguration build() {
            NodeBackupConfiguration model =
                    new NodeBackupConfiguration(
                            this.id,
                            this.bdsInstanceId,
                            this.displayName,
                            this.levelTypeDetails,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
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
        public Builder copy(NodeBackupConfiguration model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("bdsInstanceId")) {
                this.bdsInstanceId(model.getBdsInstanceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("levelTypeDetails")) {
                this.levelTypeDetails(model.getLevelTypeDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The unique identifier for the NodeBackupConfiguration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier for the NodeBackupConfiguration.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the bdsInstance which is the parent resource id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsInstanceId")
    private final String bdsInstanceId;

    /**
     * The OCID of the bdsInstance which is the parent resource id.
     * @return the value
     **/
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }

    /**
     * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("levelTypeDetails")
    private final LevelTypeDetails levelTypeDetails;

    public LevelTypeDetails getLevelTypeDetails() {
        return levelTypeDetails;
    }

    /**
     * The state of the NodeBackupConfiguration.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
     * The state of the NodeBackupConfiguration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the NodeBackupConfiguration.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The time the NodeBackupConfiguration was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the NodeBackupConfiguration was created, shown as an RFC 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the NodeBackupConfiguration was updated, shown as an RFC 3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the NodeBackupConfiguration was updated, shown as an RFC 3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time zone of the execution schedule, in IANA time zone database name format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * The time zone of the execution schedule, in IANA time zone database name format
     * @return the value
     **/
    public String getTimezone() {
        return timezone;
    }

    /**
     * Day/time recurrence (specified following RFC 5545) at which to trigger the backup process. Currently only DAILY, WEEKLY and MONTHLY frequency is supported. Days of the week are specified using BYDAY field. Time of the day is specified using BYHOUR. Other fields are not supported.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * Day/time recurrence (specified following RFC 5545) at which to trigger the backup process. Currently only DAILY, WEEKLY and MONTHLY frequency is supported. Days of the week are specified using BYDAY field. Time of the day is specified using BYHOUR. Other fields are not supported.
     *
     * @return the value
     **/
    public String getSchedule() {
        return schedule;
    }

    /**
     * Number of backup copies to retain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfBackupsToRetain")
    private final Integer numberOfBackupsToRetain;

    /**
     * Number of backup copies to retain.
     * @return the value
     **/
    public Integer getNumberOfBackupsToRetain() {
        return numberOfBackupsToRetain;
    }

    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final NodeBackup.BackupType backupType;

    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
     * @return the value
     **/
    public NodeBackup.BackupType getBackupType() {
        return backupType;
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
        sb.append("NodeBackupConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", levelTypeDetails=").append(String.valueOf(this.levelTypeDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof NodeBackupConfiguration)) {
            return false;
        }

        NodeBackupConfiguration other = (NodeBackupConfiguration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.levelTypeDetails, other.levelTypeDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.levelTypeDetails == null ? 43 : this.levelTypeDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
