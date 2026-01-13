/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The scheduling details for the quarterly maintenance window. Patching and system updates take
 * place during the maintenance window. <br>
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
        builder = MaintenanceWindow.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceWindow
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "preference",
        "patchingMode",
        "isCustomActionTimeoutEnabled",
        "customActionTimeoutInMins",
        "isMonthlyPatchingEnabled",
        "months",
        "weeksOfMonth",
        "daysOfWeek",
        "hoursOfDay",
        "leadTimeInWeeks",
        "skipRu"
    })
    public MaintenanceWindow(
            Preference preference,
            PatchingMode patchingMode,
            Boolean isCustomActionTimeoutEnabled,
            Integer customActionTimeoutInMins,
            Boolean isMonthlyPatchingEnabled,
            java.util.List<Month> months,
            java.util.List<Integer> weeksOfMonth,
            java.util.List<DayOfWeek> daysOfWeek,
            java.util.List<Integer> hoursOfDay,
            Integer leadTimeInWeeks,
            java.util.List<Boolean> skipRu) {
        super();
        this.preference = preference;
        this.patchingMode = patchingMode;
        this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
        this.customActionTimeoutInMins = customActionTimeoutInMins;
        this.isMonthlyPatchingEnabled = isMonthlyPatchingEnabled;
        this.months = months;
        this.weeksOfMonth = weeksOfMonth;
        this.daysOfWeek = daysOfWeek;
        this.hoursOfDay = hoursOfDay;
        this.leadTimeInWeeks = leadTimeInWeeks;
        this.skipRu = skipRu;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The maintenance window scheduling preference. */
        @com.fasterxml.jackson.annotation.JsonProperty("preference")
        private Preference preference;

        /**
         * The maintenance window scheduling preference.
         *
         * @param preference the value to set
         * @return this builder
         */
        public Builder preference(Preference preference) {
            this.preference = preference;
            this.__explicitlySet__.add("preference");
            return this;
        }
        /**
         * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING".
         * Default value is ROLLING.
         *
         * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
         * [Oracle-Managed Infrastructure Maintenance
         * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
         * for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
        private PatchingMode patchingMode;

        /**
         * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING".
         * Default value is ROLLING.
         *
         * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
         * [Oracle-Managed Infrastructure Maintenance
         * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
         * for more information.
         *
         * @param patchingMode the value to set
         * @return this builder
         */
        public Builder patchingMode(PatchingMode patchingMode) {
            this.patchingMode = patchingMode;
            this.__explicitlySet__.add("patchingMode");
            return this;
        }
        /**
         * If true, enables the configuration of a custom action timeout (waiting period) between
         * database server patching operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
        private Boolean isCustomActionTimeoutEnabled;

        /**
         * If true, enables the configuration of a custom action timeout (waiting period) between
         * database server patching operations.
         *
         * @param isCustomActionTimeoutEnabled the value to set
         * @return this builder
         */
        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
            this.__explicitlySet__.add("isCustomActionTimeoutEnabled");
            return this;
        }
        /**
         * Determines the amount of time the system will wait before the start of each database
         * server patching operation. Custom action timeout is in minutes and valid value is between
         * 15 to 120 (inclusive).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
        private Integer customActionTimeoutInMins;

        /**
         * Determines the amount of time the system will wait before the start of each database
         * server patching operation. Custom action timeout is in minutes and valid value is between
         * 15 to 120 (inclusive).
         *
         * @param customActionTimeoutInMins the value to set
         * @return this builder
         */
        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            this.customActionTimeoutInMins = customActionTimeoutInMins;
            this.__explicitlySet__.add("customActionTimeoutInMins");
            return this;
        }
        /** If true, enables the monthly patching option. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMonthlyPatchingEnabled")
        private Boolean isMonthlyPatchingEnabled;

        /**
         * If true, enables the monthly patching option.
         *
         * @param isMonthlyPatchingEnabled the value to set
         * @return this builder
         */
        public Builder isMonthlyPatchingEnabled(Boolean isMonthlyPatchingEnabled) {
            this.isMonthlyPatchingEnabled = isMonthlyPatchingEnabled;
            this.__explicitlySet__.add("isMonthlyPatchingEnabled");
            return this;
        }
        /** Months during the year when maintenance should be performed. */
        @com.fasterxml.jackson.annotation.JsonProperty("months")
        private java.util.List<Month> months;

        /**
         * Months during the year when maintenance should be performed.
         *
         * @param months the value to set
         * @return this builder
         */
        public Builder months(java.util.List<Month> months) {
            this.months = months;
            this.__explicitlySet__.add("months");
            return this;
        }
        /**
         * Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th,
         * 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end
         * based on calendar dates, not days of the week. For example, to allow maintenance during
         * the 2nd week of the month (from the 8th day to the 14th day of the month), use the value
         * 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28
         * days. Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay
         * parameters to allow you to specify specific days of the week and hours that maintenance
         * will be performed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("weeksOfMonth")
        private java.util.List<Integer> weeksOfMonth;

        /**
         * Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th,
         * 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end
         * based on calendar dates, not days of the week. For example, to allow maintenance during
         * the 2nd week of the month (from the 8th day to the 14th day of the month), use the value
         * 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28
         * days. Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay
         * parameters to allow you to specify specific days of the week and hours that maintenance
         * will be performed.
         *
         * @param weeksOfMonth the value to set
         * @return this builder
         */
        public Builder weeksOfMonth(java.util.List<Integer> weeksOfMonth) {
            this.weeksOfMonth = weeksOfMonth;
            this.__explicitlySet__.add("weeksOfMonth");
            return this;
        }
        /** Days during the week when maintenance should be performed. */
        @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
        private java.util.List<DayOfWeek> daysOfWeek;

        /**
         * Days during the week when maintenance should be performed.
         *
         * @param daysOfWeek the value to set
         * @return this builder
         */
        public Builder daysOfWeek(java.util.List<DayOfWeek> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            this.__explicitlySet__.add("daysOfWeek");
            return this;
        }
        /**
         * The window of hours during the day when maintenance should be performed. The window is a
         * 4 hour slot. Valid values are - 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents
         * time slot 4:00 - 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents
         * time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 -
         * represents time slot 20:00 - 23:59 UTC
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hoursOfDay")
        private java.util.List<Integer> hoursOfDay;

        /**
         * The window of hours during the day when maintenance should be performed. The window is a
         * 4 hour slot. Valid values are - 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents
         * time slot 4:00 - 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents
         * time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 -
         * represents time slot 20:00 - 23:59 UTC
         *
         * @param hoursOfDay the value to set
         * @return this builder
         */
        public Builder hoursOfDay(java.util.List<Integer> hoursOfDay) {
            this.hoursOfDay = hoursOfDay;
            this.__explicitlySet__.add("hoursOfDay");
            return this;
        }
        /**
         * Lead time window allows user to set a lead time to prepare for a down time. The lead time
         * is in weeks and valid value is between 1 to 4.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("leadTimeInWeeks")
        private Integer leadTimeInWeeks;

        /**
         * Lead time window allows user to set a lead time to prepare for a down time. The lead time
         * is in weeks and valid value is between 1 to 4.
         *
         * @param leadTimeInWeeks the value to set
         * @return this builder
         */
        public Builder leadTimeInWeeks(Integer leadTimeInWeeks) {
            this.leadTimeInWeeks = leadTimeInWeeks;
            this.__explicitlySet__.add("leadTimeInWeeks");
            return this;
        }
        /**
         * If true, skips the release update (RU) for the quarter. You cannot skip two consecutive
         * quarters. An RU skip request will only be honoured if the current version of the
         * Autonomous Container Database is supported for current quarter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skipRu")
        private java.util.List<Boolean> skipRu;

        /**
         * If true, skips the release update (RU) for the quarter. You cannot skip two consecutive
         * quarters. An RU skip request will only be honoured if the current version of the
         * Autonomous Container Database is supported for current quarter.
         *
         * @param skipRu the value to set
         * @return this builder
         */
        public Builder skipRu(java.util.List<Boolean> skipRu) {
            this.skipRu = skipRu;
            this.__explicitlySet__.add("skipRu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceWindow build() {
            MaintenanceWindow model =
                    new MaintenanceWindow(
                            this.preference,
                            this.patchingMode,
                            this.isCustomActionTimeoutEnabled,
                            this.customActionTimeoutInMins,
                            this.isMonthlyPatchingEnabled,
                            this.months,
                            this.weeksOfMonth,
                            this.daysOfWeek,
                            this.hoursOfDay,
                            this.leadTimeInWeeks,
                            this.skipRu);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceWindow model) {
            if (model.wasPropertyExplicitlySet("preference")) {
                this.preference(model.getPreference());
            }
            if (model.wasPropertyExplicitlySet("patchingMode")) {
                this.patchingMode(model.getPatchingMode());
            }
            if (model.wasPropertyExplicitlySet("isCustomActionTimeoutEnabled")) {
                this.isCustomActionTimeoutEnabled(model.getIsCustomActionTimeoutEnabled());
            }
            if (model.wasPropertyExplicitlySet("customActionTimeoutInMins")) {
                this.customActionTimeoutInMins(model.getCustomActionTimeoutInMins());
            }
            if (model.wasPropertyExplicitlySet("isMonthlyPatchingEnabled")) {
                this.isMonthlyPatchingEnabled(model.getIsMonthlyPatchingEnabled());
            }
            if (model.wasPropertyExplicitlySet("months")) {
                this.months(model.getMonths());
            }
            if (model.wasPropertyExplicitlySet("weeksOfMonth")) {
                this.weeksOfMonth(model.getWeeksOfMonth());
            }
            if (model.wasPropertyExplicitlySet("daysOfWeek")) {
                this.daysOfWeek(model.getDaysOfWeek());
            }
            if (model.wasPropertyExplicitlySet("hoursOfDay")) {
                this.hoursOfDay(model.getHoursOfDay());
            }
            if (model.wasPropertyExplicitlySet("leadTimeInWeeks")) {
                this.leadTimeInWeeks(model.getLeadTimeInWeeks());
            }
            if (model.wasPropertyExplicitlySet("skipRu")) {
                this.skipRu(model.getSkipRu());
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

    /** The maintenance window scheduling preference. */
    public enum Preference implements com.oracle.bmc.http.internal.BmcEnum {
        NoPreference("NO_PREFERENCE"),
        CustomPreference("CUSTOM_PREFERENCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Preference.class);

        private final String value;
        private static java.util.Map<String, Preference> map;

        static {
            map = new java.util.HashMap<>();
            for (Preference v : Preference.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Preference(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Preference create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Preference', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The maintenance window scheduling preference. */
    @com.fasterxml.jackson.annotation.JsonProperty("preference")
    private final Preference preference;

    /**
     * The maintenance window scheduling preference.
     *
     * @return the value
     */
    public Preference getPreference() {
        return preference;
    }

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     */
    public enum PatchingMode implements com.oracle.bmc.http.internal.BmcEnum {
        Rolling("ROLLING"),
        Nonrolling("NONROLLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchingMode.class);

        private final String value;
        private static java.util.Map<String, PatchingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchingMode v : PatchingMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchingMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
    private final PatchingMode patchingMode;

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     *
     * @return the value
     */
    public PatchingMode getPatchingMode() {
        return patchingMode;
    }

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between
     * database server patching operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
    private final Boolean isCustomActionTimeoutEnabled;

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between
     * database server patching operations.
     *
     * @return the value
     */
    public Boolean getIsCustomActionTimeoutEnabled() {
        return isCustomActionTimeoutEnabled;
    }

    /**
     * Determines the amount of time the system will wait before the start of each database server
     * patching operation. Custom action timeout is in minutes and valid value is between 15 to 120
     * (inclusive).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
    private final Integer customActionTimeoutInMins;

    /**
     * Determines the amount of time the system will wait before the start of each database server
     * patching operation. Custom action timeout is in minutes and valid value is between 15 to 120
     * (inclusive).
     *
     * @return the value
     */
    public Integer getCustomActionTimeoutInMins() {
        return customActionTimeoutInMins;
    }

    /** If true, enables the monthly patching option. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMonthlyPatchingEnabled")
    private final Boolean isMonthlyPatchingEnabled;

    /**
     * If true, enables the monthly patching option.
     *
     * @return the value
     */
    public Boolean getIsMonthlyPatchingEnabled() {
        return isMonthlyPatchingEnabled;
    }

    /** Months during the year when maintenance should be performed. */
    @com.fasterxml.jackson.annotation.JsonProperty("months")
    private final java.util.List<Month> months;

    /**
     * Months during the year when maintenance should be performed.
     *
     * @return the value
     */
    public java.util.List<Month> getMonths() {
        return months;
    }

    /**
     * Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th,
     * 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on
     * calendar dates, not days of the week. For example, to allow maintenance during the 2nd week
     * of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance
     * cannot be scheduled for the fifth week of months that contain more than 28 days. Note that
     * this parameter works in conjunction with the daysOfWeek and hoursOfDay parameters to allow
     * you to specify specific days of the week and hours that maintenance will be performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weeksOfMonth")
    private final java.util.List<Integer> weeksOfMonth;

    /**
     * Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th,
     * 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on
     * calendar dates, not days of the week. For example, to allow maintenance during the 2nd week
     * of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance
     * cannot be scheduled for the fifth week of months that contain more than 28 days. Note that
     * this parameter works in conjunction with the daysOfWeek and hoursOfDay parameters to allow
     * you to specify specific days of the week and hours that maintenance will be performed.
     *
     * @return the value
     */
    public java.util.List<Integer> getWeeksOfMonth() {
        return weeksOfMonth;
    }

    /** Days during the week when maintenance should be performed. */
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
    private final java.util.List<DayOfWeek> daysOfWeek;

    /**
     * Days during the week when maintenance should be performed.
     *
     * @return the value
     */
    public java.util.List<DayOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * The window of hours during the day when maintenance should be performed. The window is a 4
     * hour slot. Valid values are - 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents time
     * slot 4:00 - 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot
     * 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot
     * 20:00 - 23:59 UTC
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hoursOfDay")
    private final java.util.List<Integer> hoursOfDay;

    /**
     * The window of hours during the day when maintenance should be performed. The window is a 4
     * hour slot. Valid values are - 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents time
     * slot 4:00 - 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot
     * 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot
     * 20:00 - 23:59 UTC
     *
     * @return the value
     */
    public java.util.List<Integer> getHoursOfDay() {
        return hoursOfDay;
    }

    /**
     * Lead time window allows user to set a lead time to prepare for a down time. The lead time is
     * in weeks and valid value is between 1 to 4.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("leadTimeInWeeks")
    private final Integer leadTimeInWeeks;

    /**
     * Lead time window allows user to set a lead time to prepare for a down time. The lead time is
     * in weeks and valid value is between 1 to 4.
     *
     * @return the value
     */
    public Integer getLeadTimeInWeeks() {
        return leadTimeInWeeks;
    }

    /**
     * If true, skips the release update (RU) for the quarter. You cannot skip two consecutive
     * quarters. An RU skip request will only be honoured if the current version of the Autonomous
     * Container Database is supported for current quarter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipRu")
    private final java.util.List<Boolean> skipRu;

    /**
     * If true, skips the release update (RU) for the quarter. You cannot skip two consecutive
     * quarters. An RU skip request will only be honoured if the current version of the Autonomous
     * Container Database is supported for current quarter.
     *
     * @return the value
     */
    public java.util.List<Boolean> getSkipRu() {
        return skipRu;
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
        sb.append("MaintenanceWindow(");
        sb.append("super=").append(super.toString());
        sb.append("preference=").append(String.valueOf(this.preference));
        sb.append(", patchingMode=").append(String.valueOf(this.patchingMode));
        sb.append(", isCustomActionTimeoutEnabled=")
                .append(String.valueOf(this.isCustomActionTimeoutEnabled));
        sb.append(", customActionTimeoutInMins=")
                .append(String.valueOf(this.customActionTimeoutInMins));
        sb.append(", isMonthlyPatchingEnabled=")
                .append(String.valueOf(this.isMonthlyPatchingEnabled));
        sb.append(", months=").append(String.valueOf(this.months));
        sb.append(", weeksOfMonth=").append(String.valueOf(this.weeksOfMonth));
        sb.append(", daysOfWeek=").append(String.valueOf(this.daysOfWeek));
        sb.append(", hoursOfDay=").append(String.valueOf(this.hoursOfDay));
        sb.append(", leadTimeInWeeks=").append(String.valueOf(this.leadTimeInWeeks));
        sb.append(", skipRu=").append(String.valueOf(this.skipRu));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceWindow)) {
            return false;
        }

        MaintenanceWindow other = (MaintenanceWindow) o;
        return java.util.Objects.equals(this.preference, other.preference)
                && java.util.Objects.equals(this.patchingMode, other.patchingMode)
                && java.util.Objects.equals(
                        this.isCustomActionTimeoutEnabled, other.isCustomActionTimeoutEnabled)
                && java.util.Objects.equals(
                        this.customActionTimeoutInMins, other.customActionTimeoutInMins)
                && java.util.Objects.equals(
                        this.isMonthlyPatchingEnabled, other.isMonthlyPatchingEnabled)
                && java.util.Objects.equals(this.months, other.months)
                && java.util.Objects.equals(this.weeksOfMonth, other.weeksOfMonth)
                && java.util.Objects.equals(this.daysOfWeek, other.daysOfWeek)
                && java.util.Objects.equals(this.hoursOfDay, other.hoursOfDay)
                && java.util.Objects.equals(this.leadTimeInWeeks, other.leadTimeInWeeks)
                && java.util.Objects.equals(this.skipRu, other.skipRu)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.preference == null ? 43 : this.preference.hashCode());
        result = (result * PRIME) + (this.patchingMode == null ? 43 : this.patchingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.isCustomActionTimeoutEnabled == null
                                ? 43
                                : this.isCustomActionTimeoutEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.customActionTimeoutInMins == null
                                ? 43
                                : this.customActionTimeoutInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.isMonthlyPatchingEnabled == null
                                ? 43
                                : this.isMonthlyPatchingEnabled.hashCode());
        result = (result * PRIME) + (this.months == null ? 43 : this.months.hashCode());
        result = (result * PRIME) + (this.weeksOfMonth == null ? 43 : this.weeksOfMonth.hashCode());
        result = (result * PRIME) + (this.daysOfWeek == null ? 43 : this.daysOfWeek.hashCode());
        result = (result * PRIME) + (this.hoursOfDay == null ? 43 : this.hoursOfDay.hashCode());
        result =
                (result * PRIME)
                        + (this.leadTimeInWeeks == null ? 43 : this.leadTimeInWeeks.hashCode());
        result = (result * PRIME) + (this.skipRu == null ? 43 : this.skipRu.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
