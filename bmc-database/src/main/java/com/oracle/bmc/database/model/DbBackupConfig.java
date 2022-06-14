/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Backup Options
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbBackupConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbBackupConfig {
    @Deprecated
    @java.beans.ConstructorProperties({
        "autoBackupEnabled",
        "recoveryWindowInDays",
        "autoBackupWindow",
        "backupDestinationDetails"
    })
    public DbBackupConfig(
            Boolean autoBackupEnabled,
            Integer recoveryWindowInDays,
            AutoBackupWindow autoBackupWindow,
            java.util.List<BackupDestinationDetails> backupDestinationDetails) {
        super();
        this.autoBackupEnabled = autoBackupEnabled;
        this.recoveryWindowInDays = recoveryWindowInDays;
        this.autoBackupWindow = autoBackupWindow;
        this.backupDestinationDetails = backupDestinationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If set to true, configures automatic backups. If you previously used RMAN or dbcli to configure backups and then you switch to using the Console or the API for backups, a new backup configuration is created and associated with your database. This means that you can no longer rely on your previously configured unmanaged backups to work.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoBackupEnabled")
        private Boolean autoBackupEnabled;

        /**
         * If set to true, configures automatic backups. If you previously used RMAN or dbcli to configure backups and then you switch to using the Console or the API for backups, a new backup configuration is created and associated with your database. This means that you can no longer rely on your previously configured unmanaged backups to work.
         * @param autoBackupEnabled the value to set
         * @return this builder
         **/
        public Builder autoBackupEnabled(Boolean autoBackupEnabled) {
            this.autoBackupEnabled = autoBackupEnabled;
            this.__explicitlySet__.add("autoBackupEnabled");
            return this;
        }
        /**
         * Number of days between the current and the earliest point of recoverability covered by automatic backups.
         * This value applies to automatic backups only. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
         * When the value is updated, it is applied to all existing automatic backups.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
        private Integer recoveryWindowInDays;

        /**
         * Number of days between the current and the earliest point of recoverability covered by automatic backups.
         * This value applies to automatic backups only. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
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
        /**
         * Time window selected for initiating automatic backup for the database system. There are twelve available two-hour time windows. If no option is selected, a start time between 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For example, if the user selects SLOT_TWO from the enum list, the automatic backup job will start in between 2:00 AM (inclusive) to 4:00 AM (exclusive).
         * <p>
         * Example: {@code SLOT_TWO}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoBackupWindow")
        private AutoBackupWindow autoBackupWindow;

        /**
         * Time window selected for initiating automatic backup for the database system. There are twelve available two-hour time windows. If no option is selected, a start time between 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For example, if the user selects SLOT_TWO from the enum list, the automatic backup job will start in between 2:00 AM (inclusive) to 4:00 AM (exclusive).
         * <p>
         * Example: {@code SLOT_TWO}
         *
         * @param autoBackupWindow the value to set
         * @return this builder
         **/
        public Builder autoBackupWindow(AutoBackupWindow autoBackupWindow) {
            this.autoBackupWindow = autoBackupWindow;
            this.__explicitlySet__.add("autoBackupWindow");
            return this;
        }
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbBackupConfig build() {
            DbBackupConfig __instance__ =
                    new DbBackupConfig(
                            autoBackupEnabled,
                            recoveryWindowInDays,
                            autoBackupWindow,
                            backupDestinationDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbBackupConfig o) {
            Builder copiedBuilder =
                    autoBackupEnabled(o.getAutoBackupEnabled())
                            .recoveryWindowInDays(o.getRecoveryWindowInDays())
                            .autoBackupWindow(o.getAutoBackupWindow())
                            .backupDestinationDetails(o.getBackupDestinationDetails());

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
     * If set to true, configures automatic backups. If you previously used RMAN or dbcli to configure backups and then you switch to using the Console or the API for backups, a new backup configuration is created and associated with your database. This means that you can no longer rely on your previously configured unmanaged backups to work.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoBackupEnabled")
    private final Boolean autoBackupEnabled;

    /**
     * If set to true, configures automatic backups. If you previously used RMAN or dbcli to configure backups and then you switch to using the Console or the API for backups, a new backup configuration is created and associated with your database. This means that you can no longer rely on your previously configured unmanaged backups to work.
     * @return the value
     **/
    public Boolean getAutoBackupEnabled() {
        return autoBackupEnabled;
    }

    /**
     * Number of days between the current and the earliest point of recoverability covered by automatic backups.
     * This value applies to automatic backups only. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
     * When the value is updated, it is applied to all existing automatic backups.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
    private final Integer recoveryWindowInDays;

    /**
     * Number of days between the current and the earliest point of recoverability covered by automatic backups.
     * This value applies to automatic backups only. After a new automatic backup has been created, Oracle removes old automatic backups that are created before the window.
     * When the value is updated, it is applied to all existing automatic backups.
     *
     * @return the value
     **/
    public Integer getRecoveryWindowInDays() {
        return recoveryWindowInDays;
    }

    /**
     * Time window selected for initiating automatic backup for the database system. There are twelve available two-hour time windows. If no option is selected, a start time between 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For example, if the user selects SLOT_TWO from the enum list, the automatic backup job will start in between 2:00 AM (inclusive) to 4:00 AM (exclusive).
     * <p>
     * Example: {@code SLOT_TWO}
     *
     **/
    public enum AutoBackupWindow {
        SlotOne("SLOT_ONE"),
        SlotTwo("SLOT_TWO"),
        SlotThree("SLOT_THREE"),
        SlotFour("SLOT_FOUR"),
        SlotFive("SLOT_FIVE"),
        SlotSix("SLOT_SIX"),
        SlotSeven("SLOT_SEVEN"),
        SlotEight("SLOT_EIGHT"),
        SlotNine("SLOT_NINE"),
        SlotTen("SLOT_TEN"),
        SlotEleven("SLOT_ELEVEN"),
        SlotTwelve("SLOT_TWELVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutoBackupWindow.class);

        private final String value;
        private static java.util.Map<String, AutoBackupWindow> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoBackupWindow v : AutoBackupWindow.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutoBackupWindow(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoBackupWindow create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutoBackupWindow', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Time window selected for initiating automatic backup for the database system. There are twelve available two-hour time windows. If no option is selected, a start time between 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For example, if the user selects SLOT_TWO from the enum list, the automatic backup job will start in between 2:00 AM (inclusive) to 4:00 AM (exclusive).
     * <p>
     * Example: {@code SLOT_TWO}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoBackupWindow")
    private final AutoBackupWindow autoBackupWindow;

    /**
     * Time window selected for initiating automatic backup for the database system. There are twelve available two-hour time windows. If no option is selected, a start time between 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For example, if the user selects SLOT_TWO from the enum list, the automatic backup job will start in between 2:00 AM (inclusive) to 4:00 AM (exclusive).
     * <p>
     * Example: {@code SLOT_TWO}
     *
     * @return the value
     **/
    public AutoBackupWindow getAutoBackupWindow() {
        return autoBackupWindow;
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

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbBackupConfig(");
        sb.append("autoBackupEnabled=").append(String.valueOf(this.autoBackupEnabled));
        sb.append(", recoveryWindowInDays=").append(String.valueOf(this.recoveryWindowInDays));
        sb.append(", autoBackupWindow=").append(String.valueOf(this.autoBackupWindow));
        sb.append(", backupDestinationDetails=")
                .append(String.valueOf(this.backupDestinationDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbBackupConfig)) {
            return false;
        }

        DbBackupConfig other = (DbBackupConfig) o;
        return java.util.Objects.equals(this.autoBackupEnabled, other.autoBackupEnabled)
                && java.util.Objects.equals(this.recoveryWindowInDays, other.recoveryWindowInDays)
                && java.util.Objects.equals(this.autoBackupWindow, other.autoBackupWindow)
                && java.util.Objects.equals(
                        this.backupDestinationDetails, other.backupDestinationDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.autoBackupEnabled == null ? 43 : this.autoBackupEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryWindowInDays == null
                                ? 43
                                : this.recoveryWindowInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.autoBackupWindow == null ? 43 : this.autoBackupWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDestinationDetails == null
                                ? 43
                                : this.backupDestinationDetails.hashCode());
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
