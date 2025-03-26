/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The configuration details for retrieving alarm history.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AlarmHistoryCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AlarmHistoryCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"alarmId", "isEnabled", "entries"})
    public AlarmHistoryCollection(
            String alarmId, Boolean isEnabled, java.util.List<AlarmHistoryEntry> entries) {
        super();
        this.alarmId = alarmId;
        this.isEnabled = isEnabled;
        this.entries = entries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm to retrieve history for.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alarmId")
        private String alarmId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm to retrieve history for.
         *
         * @param alarmId the value to set
         * @return this builder
         **/
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            this.__explicitlySet__.add("alarmId");
            return this;
        }
        /**
         * Whether the alarm is enabled.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether the alarm is enabled.
         * <p>
         * Example: {@code true}
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The set of history entries retrieved for the alarm.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<AlarmHistoryEntry> entries;

        /**
         * The set of history entries retrieved for the alarm.
         *
         * @param entries the value to set
         * @return this builder
         **/
        public Builder entries(java.util.List<AlarmHistoryEntry> entries) {
            this.entries = entries;
            this.__explicitlySet__.add("entries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmHistoryCollection build() {
            AlarmHistoryCollection model =
                    new AlarmHistoryCollection(this.alarmId, this.isEnabled, this.entries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmHistoryCollection model) {
            if (model.wasPropertyExplicitlySet("alarmId")) {
                this.alarmId(model.getAlarmId());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("entries")) {
                this.entries(model.getEntries());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm to retrieve history for.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alarmId")
    private final String alarmId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm to retrieve history for.
     *
     * @return the value
     **/
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * Whether the alarm is enabled.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether the alarm is enabled.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The set of history entries retrieved for the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    private final java.util.List<AlarmHistoryEntry> entries;

    /**
     * The set of history entries retrieved for the alarm.
     *
     * @return the value
     **/
    public java.util.List<AlarmHistoryEntry> getEntries() {
        return entries;
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
        sb.append("AlarmHistoryCollection(");
        sb.append("super=").append(super.toString());
        sb.append("alarmId=").append(String.valueOf(this.alarmId));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", entries=").append(String.valueOf(this.entries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmHistoryCollection)) {
            return false;
        }

        AlarmHistoryCollection other = (AlarmHistoryCollection) o;
        return java.util.Objects.equals(this.alarmId, other.alarmId)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.entries, other.entries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alarmId == null ? 43 : this.alarmId.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.entries == null ? 43 : this.entries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
