/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Backup Options To use any of the API operations, you must be authorized in an IAM policy. If
 * you're not authorized, talk to an administrator. If you're an administrator who needs to write
 * policies to give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedDbBackupConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedDbBackupConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isAutoBackupEnabled",
        "recoveryWindowInDays",
        "autoBackupWindow",
        "autoFullBackupWindow",
        "autoFullBackupDay",
        "canRunImmediateFullBackup",
        "isRemoteBackupEnabled",
        "remoteRegion",
        "backupDestinationDetails",
        "backupDeletionPolicy"
    })
    public DistributedDbBackupConfig(
            Boolean isAutoBackupEnabled,
            Integer recoveryWindowInDays,
            AutoBackupWindow autoBackupWindow,
            AutoFullBackupWindow autoFullBackupWindow,
            AutoFullBackupDay autoFullBackupDay,
            Boolean canRunImmediateFullBackup,
            Boolean isRemoteBackupEnabled,
            String remoteRegion,
            java.util.List<DistributedDbBackupDestination> backupDestinationDetails,
            BackupDeletionPolicy backupDeletionPolicy) {
        super();
        this.isAutoBackupEnabled = isAutoBackupEnabled;
        this.recoveryWindowInDays = recoveryWindowInDays;
        this.autoBackupWindow = autoBackupWindow;
        this.autoFullBackupWindow = autoFullBackupWindow;
        this.autoFullBackupDay = autoFullBackupDay;
        this.canRunImmediateFullBackup = canRunImmediateFullBackup;
        this.isRemoteBackupEnabled = isRemoteBackupEnabled;
        this.remoteRegion = remoteRegion;
        this.backupDestinationDetails = backupDestinationDetails;
        this.backupDeletionPolicy = backupDeletionPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If set to true, configures automatic backups. If you previously used RMAN or dbcli to
         * configure backups and then you switch to using the Console or the API for backups, a new
         * backup configuration is created and associated with your database. This means that you
         * can no longer rely on your previously configured unmanaged backups to work.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoBackupEnabled")
        private Boolean isAutoBackupEnabled;

        /**
         * If set to true, configures automatic backups. If you previously used RMAN or dbcli to
         * configure backups and then you switch to using the Console or the API for backups, a new
         * backup configuration is created and associated with your database. This means that you
         * can no longer rely on your previously configured unmanaged backups to work.
         *
         * @param isAutoBackupEnabled the value to set
         * @return this builder
         */
        public Builder isAutoBackupEnabled(Boolean isAutoBackupEnabled) {
            this.isAutoBackupEnabled = isAutoBackupEnabled;
            this.__explicitlySet__.add("isAutoBackupEnabled");
            return this;
        }
        /**
         * Number of days between the current and the earliest point of recoverability covered by
         * automatic backups. This value applies to automatic backups only. After a new automatic
         * backup has been created, Oracle removes old automatic backups that are created before the
         * window. When the value is updated, it is applied to all existing automatic backups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
        private Integer recoveryWindowInDays;

        /**
         * Number of days between the current and the earliest point of recoverability covered by
         * automatic backups. This value applies to automatic backups only. After a new automatic
         * backup has been created, Oracle removes old automatic backups that are created before the
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
        /**
         * Time window selected for initiating automatic backup for the database system. There are
         * twelve available two-hour time windows. If no option is selected, a start time between
         * 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For example,
         * if the user selects SLOT_TWO from the enum list, the automatic backup job will start in
         * between 2:00 AM (inclusive) to 4:00 AM (exclusive). Example: {@code SLOT_TWO}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoBackupWindow")
        private AutoBackupWindow autoBackupWindow;

        /**
         * Time window selected for initiating automatic backup for the database system. There are
         * twelve available two-hour time windows. If no option is selected, a start time between
         * 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For example,
         * if the user selects SLOT_TWO from the enum list, the automatic backup job will start in
         * between 2:00 AM (inclusive) to 4:00 AM (exclusive). Example: {@code SLOT_TWO}
         *
         * @param autoBackupWindow the value to set
         * @return this builder
         */
        public Builder autoBackupWindow(AutoBackupWindow autoBackupWindow) {
            this.autoBackupWindow = autoBackupWindow;
            this.__explicitlySet__.add("autoBackupWindow");
            return this;
        }
        /**
         * Time window selected for initiating full backup for the database system. There are twelve
         * available two-hour time windows. If no option is selected, the value is null and a start
         * time between 12:00 AM to 7:00 AM in the region of the database is automatically chosen.
         * For example, if the user selects SLOT_TWO from the enum list, the automatic backup job
         * will start in between 2:00 AM (inclusive) to 4:00 AM (exclusive). Example: {@code
         * SLOT_TWO}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoFullBackupWindow")
        private AutoFullBackupWindow autoFullBackupWindow;

        /**
         * Time window selected for initiating full backup for the database system. There are twelve
         * available two-hour time windows. If no option is selected, the value is null and a start
         * time between 12:00 AM to 7:00 AM in the region of the database is automatically chosen.
         * For example, if the user selects SLOT_TWO from the enum list, the automatic backup job
         * will start in between 2:00 AM (inclusive) to 4:00 AM (exclusive). Example: {@code
         * SLOT_TWO}
         *
         * @param autoFullBackupWindow the value to set
         * @return this builder
         */
        public Builder autoFullBackupWindow(AutoFullBackupWindow autoFullBackupWindow) {
            this.autoFullBackupWindow = autoFullBackupWindow;
            this.__explicitlySet__.add("autoFullBackupWindow");
            return this;
        }
        /**
         * Day of the week the full backup should be applied on the database system. If no option is
         * selected, the value is null and we will default to Sunday.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoFullBackupDay")
        private AutoFullBackupDay autoFullBackupDay;

        /**
         * Day of the week the full backup should be applied on the database system. If no option is
         * selected, the value is null and we will default to Sunday.
         *
         * @param autoFullBackupDay the value to set
         * @return this builder
         */
        public Builder autoFullBackupDay(AutoFullBackupDay autoFullBackupDay) {
            this.autoFullBackupDay = autoFullBackupDay;
            this.__explicitlySet__.add("autoFullBackupDay");
            return this;
        }
        /**
         * If set to true, configures automatic full backups in the local region (the region of the
         * DB system) for the first backup run immediately.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canRunImmediateFullBackup")
        private Boolean canRunImmediateFullBackup;

        /**
         * If set to true, configures automatic full backups in the local region (the region of the
         * DB system) for the first backup run immediately.
         *
         * @param canRunImmediateFullBackup the value to set
         * @return this builder
         */
        public Builder canRunImmediateFullBackup(Boolean canRunImmediateFullBackup) {
            this.canRunImmediateFullBackup = canRunImmediateFullBackup;
            this.__explicitlySet__.add("canRunImmediateFullBackup");
            return this;
        }
        /**
         * If set to true, configures automatic incremental backups in the local region (the region
         * of the DB system) and the remote region with a default frequency of 1 hour. If you
         * previously used RMAN or dbcli to configure backups, using the Console or the API for
         * manged backups creates a new backup configuration for your database. The new
         * configuration replaces the configuration created with RMAN or dbcli. This means that you
         * can no longer rely on your previously configured unmanaged backups to work.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRemoteBackupEnabled")
        private Boolean isRemoteBackupEnabled;

        /**
         * If set to true, configures automatic incremental backups in the local region (the region
         * of the DB system) and the remote region with a default frequency of 1 hour. If you
         * previously used RMAN or dbcli to configure backups, using the Console or the API for
         * manged backups creates a new backup configuration for your database. The new
         * configuration replaces the configuration created with RMAN or dbcli. This means that you
         * can no longer rely on your previously configured unmanaged backups to work.
         *
         * @param isRemoteBackupEnabled the value to set
         * @return this builder
         */
        public Builder isRemoteBackupEnabled(Boolean isRemoteBackupEnabled) {
            this.isRemoteBackupEnabled = isRemoteBackupEnabled;
            this.__explicitlySet__.add("isRemoteBackupEnabled");
            return this;
        }
        /**
         * The name of the remote region where the remote automatic incremental backups will be
         * stored. For information about valid region names, see [Regions and Availability
         * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteRegion")
        private String remoteRegion;

        /**
         * The name of the remote region where the remote automatic incremental backups will be
         * stored. For information about valid region names, see [Regions and Availability
         * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
         *
         * @param remoteRegion the value to set
         * @return this builder
         */
        public Builder remoteRegion(String remoteRegion) {
            this.remoteRegion = remoteRegion;
            this.__explicitlySet__.add("remoteRegion");
            return this;
        }
        /** Backup destination details. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
        private java.util.List<DistributedDbBackupDestination> backupDestinationDetails;

        /**
         * Backup destination details.
         *
         * @param backupDestinationDetails the value to set
         * @return this builder
         */
        public Builder backupDestinationDetails(
                java.util.List<DistributedDbBackupDestination> backupDestinationDetails) {
            this.backupDestinationDetails = backupDestinationDetails;
            this.__explicitlySet__.add("backupDestinationDetails");
            return this;
        }
        /**
         * This defines when the backups will be deleted. - IMMEDIATE option keep the backup for
         * predefined time i.e 72 hours and then delete permanently... - RETAIN will keep the
         * backups as per the policy defined for database backups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDeletionPolicy")
        private BackupDeletionPolicy backupDeletionPolicy;

        /**
         * This defines when the backups will be deleted. - IMMEDIATE option keep the backup for
         * predefined time i.e 72 hours and then delete permanently... - RETAIN will keep the
         * backups as per the policy defined for database backups.
         *
         * @param backupDeletionPolicy the value to set
         * @return this builder
         */
        public Builder backupDeletionPolicy(BackupDeletionPolicy backupDeletionPolicy) {
            this.backupDeletionPolicy = backupDeletionPolicy;
            this.__explicitlySet__.add("backupDeletionPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedDbBackupConfig build() {
            DistributedDbBackupConfig model =
                    new DistributedDbBackupConfig(
                            this.isAutoBackupEnabled,
                            this.recoveryWindowInDays,
                            this.autoBackupWindow,
                            this.autoFullBackupWindow,
                            this.autoFullBackupDay,
                            this.canRunImmediateFullBackup,
                            this.isRemoteBackupEnabled,
                            this.remoteRegion,
                            this.backupDestinationDetails,
                            this.backupDeletionPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDbBackupConfig model) {
            if (model.wasPropertyExplicitlySet("isAutoBackupEnabled")) {
                this.isAutoBackupEnabled(model.getIsAutoBackupEnabled());
            }
            if (model.wasPropertyExplicitlySet("recoveryWindowInDays")) {
                this.recoveryWindowInDays(model.getRecoveryWindowInDays());
            }
            if (model.wasPropertyExplicitlySet("autoBackupWindow")) {
                this.autoBackupWindow(model.getAutoBackupWindow());
            }
            if (model.wasPropertyExplicitlySet("autoFullBackupWindow")) {
                this.autoFullBackupWindow(model.getAutoFullBackupWindow());
            }
            if (model.wasPropertyExplicitlySet("autoFullBackupDay")) {
                this.autoFullBackupDay(model.getAutoFullBackupDay());
            }
            if (model.wasPropertyExplicitlySet("canRunImmediateFullBackup")) {
                this.canRunImmediateFullBackup(model.getCanRunImmediateFullBackup());
            }
            if (model.wasPropertyExplicitlySet("isRemoteBackupEnabled")) {
                this.isRemoteBackupEnabled(model.getIsRemoteBackupEnabled());
            }
            if (model.wasPropertyExplicitlySet("remoteRegion")) {
                this.remoteRegion(model.getRemoteRegion());
            }
            if (model.wasPropertyExplicitlySet("backupDestinationDetails")) {
                this.backupDestinationDetails(model.getBackupDestinationDetails());
            }
            if (model.wasPropertyExplicitlySet("backupDeletionPolicy")) {
                this.backupDeletionPolicy(model.getBackupDeletionPolicy());
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
     * If set to true, configures automatic backups. If you previously used RMAN or dbcli to
     * configure backups and then you switch to using the Console or the API for backups, a new
     * backup configuration is created and associated with your database. This means that you can no
     * longer rely on your previously configured unmanaged backups to work.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoBackupEnabled")
    private final Boolean isAutoBackupEnabled;

    /**
     * If set to true, configures automatic backups. If you previously used RMAN or dbcli to
     * configure backups and then you switch to using the Console or the API for backups, a new
     * backup configuration is created and associated with your database. This means that you can no
     * longer rely on your previously configured unmanaged backups to work.
     *
     * @return the value
     */
    public Boolean getIsAutoBackupEnabled() {
        return isAutoBackupEnabled;
    }

    /**
     * Number of days between the current and the earliest point of recoverability covered by
     * automatic backups. This value applies to automatic backups only. After a new automatic backup
     * has been created, Oracle removes old automatic backups that are created before the window.
     * When the value is updated, it is applied to all existing automatic backups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
    private final Integer recoveryWindowInDays;

    /**
     * Number of days between the current and the earliest point of recoverability covered by
     * automatic backups. This value applies to automatic backups only. After a new automatic backup
     * has been created, Oracle removes old automatic backups that are created before the window.
     * When the value is updated, it is applied to all existing automatic backups.
     *
     * @return the value
     */
    public Integer getRecoveryWindowInDays() {
        return recoveryWindowInDays;
    }

    /**
     * Time window selected for initiating automatic backup for the database system. There are
     * twelve available two-hour time windows. If no option is selected, a start time between 12:00
     * AM to 7:00 AM in the region of the database is automatically chosen. For example, if the user
     * selects SLOT_TWO from the enum list, the automatic backup job will start in between 2:00 AM
     * (inclusive) to 4:00 AM (exclusive). Example: {@code SLOT_TWO}
     */
    public enum AutoBackupWindow implements com.oracle.bmc.http.internal.BmcEnum {
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
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * Time window selected for initiating automatic backup for the database system. There are
     * twelve available two-hour time windows. If no option is selected, a start time between 12:00
     * AM to 7:00 AM in the region of the database is automatically chosen. For example, if the user
     * selects SLOT_TWO from the enum list, the automatic backup job will start in between 2:00 AM
     * (inclusive) to 4:00 AM (exclusive). Example: {@code SLOT_TWO}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoBackupWindow")
    private final AutoBackupWindow autoBackupWindow;

    /**
     * Time window selected for initiating automatic backup for the database system. There are
     * twelve available two-hour time windows. If no option is selected, a start time between 12:00
     * AM to 7:00 AM in the region of the database is automatically chosen. For example, if the user
     * selects SLOT_TWO from the enum list, the automatic backup job will start in between 2:00 AM
     * (inclusive) to 4:00 AM (exclusive). Example: {@code SLOT_TWO}
     *
     * @return the value
     */
    public AutoBackupWindow getAutoBackupWindow() {
        return autoBackupWindow;
    }

    /**
     * Time window selected for initiating full backup for the database system. There are twelve
     * available two-hour time windows. If no option is selected, the value is null and a start time
     * between 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For
     * example, if the user selects SLOT_TWO from the enum list, the automatic backup job will start
     * in between 2:00 AM (inclusive) to 4:00 AM (exclusive). Example: {@code SLOT_TWO}
     */
    public enum AutoFullBackupWindow implements com.oracle.bmc.http.internal.BmcEnum {
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
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutoFullBackupWindow.class);

        private final String value;
        private static java.util.Map<String, AutoFullBackupWindow> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoFullBackupWindow v : AutoFullBackupWindow.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutoFullBackupWindow(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoFullBackupWindow create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutoFullBackupWindow', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Time window selected for initiating full backup for the database system. There are twelve
     * available two-hour time windows. If no option is selected, the value is null and a start time
     * between 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For
     * example, if the user selects SLOT_TWO from the enum list, the automatic backup job will start
     * in between 2:00 AM (inclusive) to 4:00 AM (exclusive). Example: {@code SLOT_TWO}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoFullBackupWindow")
    private final AutoFullBackupWindow autoFullBackupWindow;

    /**
     * Time window selected for initiating full backup for the database system. There are twelve
     * available two-hour time windows. If no option is selected, the value is null and a start time
     * between 12:00 AM to 7:00 AM in the region of the database is automatically chosen. For
     * example, if the user selects SLOT_TWO from the enum list, the automatic backup job will start
     * in between 2:00 AM (inclusive) to 4:00 AM (exclusive). Example: {@code SLOT_TWO}
     *
     * @return the value
     */
    public AutoFullBackupWindow getAutoFullBackupWindow() {
        return autoFullBackupWindow;
    }

    /**
     * Day of the week the full backup should be applied on the database system. If no option is
     * selected, the value is null and we will default to Sunday.
     */
    public enum AutoFullBackupDay implements com.oracle.bmc.http.internal.BmcEnum {
        Sunday("SUNDAY"),
        Monday("MONDAY"),
        Tuesday("TUESDAY"),
        Wednesday("WEDNESDAY"),
        Thursday("THURSDAY"),
        Friday("FRIDAY"),
        Saturday("SATURDAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutoFullBackupDay.class);

        private final String value;
        private static java.util.Map<String, AutoFullBackupDay> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoFullBackupDay v : AutoFullBackupDay.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutoFullBackupDay(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoFullBackupDay create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutoFullBackupDay', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Day of the week the full backup should be applied on the database system. If no option is
     * selected, the value is null and we will default to Sunday.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoFullBackupDay")
    private final AutoFullBackupDay autoFullBackupDay;

    /**
     * Day of the week the full backup should be applied on the database system. If no option is
     * selected, the value is null and we will default to Sunday.
     *
     * @return the value
     */
    public AutoFullBackupDay getAutoFullBackupDay() {
        return autoFullBackupDay;
    }

    /**
     * If set to true, configures automatic full backups in the local region (the region of the DB
     * system) for the first backup run immediately.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canRunImmediateFullBackup")
    private final Boolean canRunImmediateFullBackup;

    /**
     * If set to true, configures automatic full backups in the local region (the region of the DB
     * system) for the first backup run immediately.
     *
     * @return the value
     */
    public Boolean getCanRunImmediateFullBackup() {
        return canRunImmediateFullBackup;
    }

    /**
     * If set to true, configures automatic incremental backups in the local region (the region of
     * the DB system) and the remote region with a default frequency of 1 hour. If you previously
     * used RMAN or dbcli to configure backups, using the Console or the API for manged backups
     * creates a new backup configuration for your database. The new configuration replaces the
     * configuration created with RMAN or dbcli. This means that you can no longer rely on your
     * previously configured unmanaged backups to work.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRemoteBackupEnabled")
    private final Boolean isRemoteBackupEnabled;

    /**
     * If set to true, configures automatic incremental backups in the local region (the region of
     * the DB system) and the remote region with a default frequency of 1 hour. If you previously
     * used RMAN or dbcli to configure backups, using the Console or the API for manged backups
     * creates a new backup configuration for your database. The new configuration replaces the
     * configuration created with RMAN or dbcli. This means that you can no longer rely on your
     * previously configured unmanaged backups to work.
     *
     * @return the value
     */
    public Boolean getIsRemoteBackupEnabled() {
        return isRemoteBackupEnabled;
    }

    /**
     * The name of the remote region where the remote automatic incremental backups will be stored.
     * For information about valid region names, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteRegion")
    private final String remoteRegion;

    /**
     * The name of the remote region where the remote automatic incremental backups will be stored.
     * For information about valid region names, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
     *
     * @return the value
     */
    public String getRemoteRegion() {
        return remoteRegion;
    }

    /** Backup destination details. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationDetails")
    private final java.util.List<DistributedDbBackupDestination> backupDestinationDetails;

    /**
     * Backup destination details.
     *
     * @return the value
     */
    public java.util.List<DistributedDbBackupDestination> getBackupDestinationDetails() {
        return backupDestinationDetails;
    }

    /**
     * This defines when the backups will be deleted. - IMMEDIATE option keep the backup for
     * predefined time i.e 72 hours and then delete permanently... - RETAIN will keep the backups as
     * per the policy defined for database backups.
     */
    public enum BackupDeletionPolicy implements com.oracle.bmc.http.internal.BmcEnum {
        DeleteImmediately("DELETE_IMMEDIATELY"),
        DeleteAfterRetentionPeriod("DELETE_AFTER_RETENTION_PERIOD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupDeletionPolicy.class);

        private final String value;
        private static java.util.Map<String, BackupDeletionPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupDeletionPolicy v : BackupDeletionPolicy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupDeletionPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupDeletionPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupDeletionPolicy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This defines when the backups will be deleted. - IMMEDIATE option keep the backup for
     * predefined time i.e 72 hours and then delete permanently... - RETAIN will keep the backups as
     * per the policy defined for database backups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDeletionPolicy")
    private final BackupDeletionPolicy backupDeletionPolicy;

    /**
     * This defines when the backups will be deleted. - IMMEDIATE option keep the backup for
     * predefined time i.e 72 hours and then delete permanently... - RETAIN will keep the backups as
     * per the policy defined for database backups.
     *
     * @return the value
     */
    public BackupDeletionPolicy getBackupDeletionPolicy() {
        return backupDeletionPolicy;
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
        sb.append("DistributedDbBackupConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isAutoBackupEnabled=").append(String.valueOf(this.isAutoBackupEnabled));
        sb.append(", recoveryWindowInDays=").append(String.valueOf(this.recoveryWindowInDays));
        sb.append(", autoBackupWindow=").append(String.valueOf(this.autoBackupWindow));
        sb.append(", autoFullBackupWindow=").append(String.valueOf(this.autoFullBackupWindow));
        sb.append(", autoFullBackupDay=").append(String.valueOf(this.autoFullBackupDay));
        sb.append(", canRunImmediateFullBackup=")
                .append(String.valueOf(this.canRunImmediateFullBackup));
        sb.append(", isRemoteBackupEnabled=").append(String.valueOf(this.isRemoteBackupEnabled));
        sb.append(", remoteRegion=").append(String.valueOf(this.remoteRegion));
        sb.append(", backupDestinationDetails=")
                .append(String.valueOf(this.backupDestinationDetails));
        sb.append(", backupDeletionPolicy=").append(String.valueOf(this.backupDeletionPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedDbBackupConfig)) {
            return false;
        }

        DistributedDbBackupConfig other = (DistributedDbBackupConfig) o;
        return java.util.Objects.equals(this.isAutoBackupEnabled, other.isAutoBackupEnabled)
                && java.util.Objects.equals(this.recoveryWindowInDays, other.recoveryWindowInDays)
                && java.util.Objects.equals(this.autoBackupWindow, other.autoBackupWindow)
                && java.util.Objects.equals(this.autoFullBackupWindow, other.autoFullBackupWindow)
                && java.util.Objects.equals(this.autoFullBackupDay, other.autoFullBackupDay)
                && java.util.Objects.equals(
                        this.canRunImmediateFullBackup, other.canRunImmediateFullBackup)
                && java.util.Objects.equals(this.isRemoteBackupEnabled, other.isRemoteBackupEnabled)
                && java.util.Objects.equals(this.remoteRegion, other.remoteRegion)
                && java.util.Objects.equals(
                        this.backupDestinationDetails, other.backupDestinationDetails)
                && java.util.Objects.equals(this.backupDeletionPolicy, other.backupDeletionPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isAutoBackupEnabled == null
                                ? 43
                                : this.isAutoBackupEnabled.hashCode());
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
                        + (this.autoFullBackupWindow == null
                                ? 43
                                : this.autoFullBackupWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.autoFullBackupDay == null ? 43 : this.autoFullBackupDay.hashCode());
        result =
                (result * PRIME)
                        + (this.canRunImmediateFullBackup == null
                                ? 43
                                : this.canRunImmediateFullBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.isRemoteBackupEnabled == null
                                ? 43
                                : this.isRemoteBackupEnabled.hashCode());
        result = (result * PRIME) + (this.remoteRegion == null ? 43 : this.remoteRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDestinationDetails == null
                                ? 43
                                : this.backupDestinationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDeletionPolicy == null
                                ? 43
                                : this.backupDeletionPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
