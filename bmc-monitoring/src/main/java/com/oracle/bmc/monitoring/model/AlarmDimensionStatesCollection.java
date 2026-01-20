/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The list of current alarm state entries for each metric stream that matches the filters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AlarmDimensionStatesCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AlarmDimensionStatesCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "alarmId",
        "isEnabled",
        "isNotificationsPerMetricDimensionEnabled",
        "items"
    })
    public AlarmDimensionStatesCollection(
            String alarmId,
            Boolean isEnabled,
            Boolean isNotificationsPerMetricDimensionEnabled,
            java.util.List<AlarmDimensionStatesEntry> items) {
        super();
        this.alarmId = alarmId;
        this.isEnabled = isEnabled;
        this.isNotificationsPerMetricDimensionEnabled = isNotificationsPerMetricDimensionEnabled;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * alarm to retrieve alarm state entries for.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alarmId")
        private String alarmId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * alarm to retrieve alarm state entries for.
         *
         * @param alarmId the value to set
         * @return this builder
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            this.__explicitlySet__.add("alarmId");
            return this;
        }
        /**
         * Whether the alarm is enabled.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether the alarm is enabled.
         *
         * <p>Example: {@code true}
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * When set to {@code true}, splits alarm notifications per metric stream. When set to
         * {@code false}, groups alarm notifications across metric streams.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isNotificationsPerMetricDimensionEnabled")
        private Boolean isNotificationsPerMetricDimensionEnabled;

        /**
         * When set to {@code true}, splits alarm notifications per metric stream. When set to
         * {@code false}, groups alarm notifications across metric streams.
         *
         * @param isNotificationsPerMetricDimensionEnabled the value to set
         * @return this builder
         */
        public Builder isNotificationsPerMetricDimensionEnabled(
                Boolean isNotificationsPerMetricDimensionEnabled) {
            this.isNotificationsPerMetricDimensionEnabled =
                    isNotificationsPerMetricDimensionEnabled;
            this.__explicitlySet__.add("isNotificationsPerMetricDimensionEnabled");
            return this;
        }
        /** Array of alarm state entries. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AlarmDimensionStatesEntry> items;

        /**
         * Array of alarm state entries.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<AlarmDimensionStatesEntry> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmDimensionStatesCollection build() {
            AlarmDimensionStatesCollection model =
                    new AlarmDimensionStatesCollection(
                            this.alarmId,
                            this.isEnabled,
                            this.isNotificationsPerMetricDimensionEnabled,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmDimensionStatesCollection model) {
            if (model.wasPropertyExplicitlySet("alarmId")) {
                this.alarmId(model.getAlarmId());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isNotificationsPerMetricDimensionEnabled")) {
                this.isNotificationsPerMetricDimensionEnabled(
                        model.getIsNotificationsPerMetricDimensionEnabled());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * alarm to retrieve alarm state entries for.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alarmId")
    private final String alarmId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * alarm to retrieve alarm state entries for.
     *
     * @return the value
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * Whether the alarm is enabled.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether the alarm is enabled.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * When set to {@code true}, splits alarm notifications per metric stream. When set to {@code
     * false}, groups alarm notifications across metric streams.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isNotificationsPerMetricDimensionEnabled")
    private final Boolean isNotificationsPerMetricDimensionEnabled;

    /**
     * When set to {@code true}, splits alarm notifications per metric stream. When set to {@code
     * false}, groups alarm notifications across metric streams.
     *
     * @return the value
     */
    public Boolean getIsNotificationsPerMetricDimensionEnabled() {
        return isNotificationsPerMetricDimensionEnabled;
    }

    /** Array of alarm state entries. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AlarmDimensionStatesEntry> items;

    /**
     * Array of alarm state entries.
     *
     * @return the value
     */
    public java.util.List<AlarmDimensionStatesEntry> getItems() {
        return items;
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
        sb.append("AlarmDimensionStatesCollection(");
        sb.append("super=").append(super.toString());
        sb.append("alarmId=").append(String.valueOf(this.alarmId));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isNotificationsPerMetricDimensionEnabled=")
                .append(String.valueOf(this.isNotificationsPerMetricDimensionEnabled));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmDimensionStatesCollection)) {
            return false;
        }

        AlarmDimensionStatesCollection other = (AlarmDimensionStatesCollection) o;
        return java.util.Objects.equals(this.alarmId, other.alarmId)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(
                        this.isNotificationsPerMetricDimensionEnabled,
                        other.isNotificationsPerMetricDimensionEnabled)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alarmId == null ? 43 : this.alarmId.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isNotificationsPerMetricDimensionEnabled == null
                                ? 43
                                : this.isNotificationsPerMetricDimensionEnabled.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
