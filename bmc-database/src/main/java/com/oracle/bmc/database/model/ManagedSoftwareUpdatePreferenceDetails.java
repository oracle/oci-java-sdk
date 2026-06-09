/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Oracle Managed Database Software Updates schedule will be created based on the provided update
 * preferences <br>
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
        builder = ManagedSoftwareUpdatePreferenceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedSoftwareUpdatePreferenceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "daysOfWeek",
        "hourOfDay",
        "updateMode",
        "versionSchemeDetails"
    })
    public ManagedSoftwareUpdatePreferenceDetails(
            java.util.List<ManagedSoftwareUpdateDayOfWeek> daysOfWeek,
            Integer hourOfDay,
            UpdateMode updateMode,
            VersionSchemeDetails versionSchemeDetails) {
        super();
        this.daysOfWeek = daysOfWeek;
        this.hourOfDay = hourOfDay;
        this.updateMode = updateMode;
        this.versionSchemeDetails = versionSchemeDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The update should be applied on the database for the selected days of the week. */
        @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
        private java.util.List<ManagedSoftwareUpdateDayOfWeek> daysOfWeek;

        /**
         * The update should be applied on the database for the selected days of the week.
         *
         * @param daysOfWeek the value to set
         * @return this builder
         */
        public Builder daysOfWeek(java.util.List<ManagedSoftwareUpdateDayOfWeek> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            this.__explicitlySet__.add("daysOfWeek");
            return this;
        }
        /** The update should be applied on the database for the selected hour of the day. */
        @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
        private Integer hourOfDay;

        /**
         * The update should be applied on the database for the selected hour of the day.
         *
         * @param hourOfDay the value to set
         * @return this builder
         */
        public Builder hourOfDay(Integer hourOfDay) {
            this.hourOfDay = hourOfDay;
            this.__explicitlySet__.add("hourOfDay");
            return this;
        }
        /**
         * Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING". Default
         * value is ROLLING. *IMPORTANT*: Non-rolling Database Software update update involves
         * system down time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("updateMode")
        private UpdateMode updateMode;

        /**
         * Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING". Default
         * value is ROLLING. *IMPORTANT*: Non-rolling Database Software update update involves
         * system down time.
         *
         * @param updateMode the value to set
         * @return this builder
         */
        public Builder updateMode(UpdateMode updateMode) {
            this.updateMode = updateMode;
            this.__explicitlySet__.add("updateMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionSchemeDetails")
        private VersionSchemeDetails versionSchemeDetails;

        public Builder versionSchemeDetails(VersionSchemeDetails versionSchemeDetails) {
            this.versionSchemeDetails = versionSchemeDetails;
            this.__explicitlySet__.add("versionSchemeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedSoftwareUpdatePreferenceDetails build() {
            ManagedSoftwareUpdatePreferenceDetails model =
                    new ManagedSoftwareUpdatePreferenceDetails(
                            this.daysOfWeek,
                            this.hourOfDay,
                            this.updateMode,
                            this.versionSchemeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedSoftwareUpdatePreferenceDetails model) {
            if (model.wasPropertyExplicitlySet("daysOfWeek")) {
                this.daysOfWeek(model.getDaysOfWeek());
            }
            if (model.wasPropertyExplicitlySet("hourOfDay")) {
                this.hourOfDay(model.getHourOfDay());
            }
            if (model.wasPropertyExplicitlySet("updateMode")) {
                this.updateMode(model.getUpdateMode());
            }
            if (model.wasPropertyExplicitlySet("versionSchemeDetails")) {
                this.versionSchemeDetails(model.getVersionSchemeDetails());
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

    /** The update should be applied on the database for the selected days of the week. */
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
    private final java.util.List<ManagedSoftwareUpdateDayOfWeek> daysOfWeek;

    /**
     * The update should be applied on the database for the selected days of the week.
     *
     * @return the value
     */
    public java.util.List<ManagedSoftwareUpdateDayOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }

    /** The update should be applied on the database for the selected hour of the day. */
    @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
    private final Integer hourOfDay;

    /**
     * The update should be applied on the database for the selected hour of the day.
     *
     * @return the value
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }

    /**
     * Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING. *IMPORTANT*: Non-rolling Database Software update update involves system
     * down time.
     */
    public enum UpdateMode implements com.oracle.bmc.http.internal.BmcEnum {
        Rolling("ROLLING"),
        Nonrolling("NONROLLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpdateMode.class);

        private final String value;
        private static java.util.Map<String, UpdateMode> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateMode v : UpdateMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING. *IMPORTANT*: Non-rolling Database Software update update involves system
     * down time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateMode")
    private final UpdateMode updateMode;

    /**
     * Oracle Managed Database Software update method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING. *IMPORTANT*: Non-rolling Database Software update update involves system
     * down time.
     *
     * @return the value
     */
    public UpdateMode getUpdateMode() {
        return updateMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionSchemeDetails")
    private final VersionSchemeDetails versionSchemeDetails;

    public VersionSchemeDetails getVersionSchemeDetails() {
        return versionSchemeDetails;
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
        sb.append("ManagedSoftwareUpdatePreferenceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("daysOfWeek=").append(String.valueOf(this.daysOfWeek));
        sb.append(", hourOfDay=").append(String.valueOf(this.hourOfDay));
        sb.append(", updateMode=").append(String.valueOf(this.updateMode));
        sb.append(", versionSchemeDetails=").append(String.valueOf(this.versionSchemeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedSoftwareUpdatePreferenceDetails)) {
            return false;
        }

        ManagedSoftwareUpdatePreferenceDetails other = (ManagedSoftwareUpdatePreferenceDetails) o;
        return java.util.Objects.equals(this.daysOfWeek, other.daysOfWeek)
                && java.util.Objects.equals(this.hourOfDay, other.hourOfDay)
                && java.util.Objects.equals(this.updateMode, other.updateMode)
                && java.util.Objects.equals(this.versionSchemeDetails, other.versionSchemeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.daysOfWeek == null ? 43 : this.daysOfWeek.hashCode());
        result = (result * PRIME) + (this.hourOfDay == null ? 43 : this.hourOfDay.hashCode());
        result = (result * PRIME) + (this.updateMode == null ? 43 : this.updateMode.hashCode());
        result =
                (result * PRIME)
                        + (this.versionSchemeDetails == null
                                ? 43
                                : this.versionSchemeDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
