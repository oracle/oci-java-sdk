/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of day based horizontal scaling schedule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DayBasedHorizontalScalingScheduleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "scheduleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DayBasedHorizontalScalingScheduleDetails
        extends HorizontalScalingScheduleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Time of day and horizontal scaling configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAndHorizontalScalingConfig")
        private java.util.List<TimeAndHorizontalScalingConfig> timeAndHorizontalScalingConfig;

        /**
         * Time of day and horizontal scaling configuration.
         *
         * @param timeAndHorizontalScalingConfig the value to set
         * @return this builder
         */
        public Builder timeAndHorizontalScalingConfig(
                java.util.List<TimeAndHorizontalScalingConfig> timeAndHorizontalScalingConfig) {
            this.timeAndHorizontalScalingConfig = timeAndHorizontalScalingConfig;
            this.__explicitlySet__.add("timeAndHorizontalScalingConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DayBasedHorizontalScalingScheduleDetails build() {
            DayBasedHorizontalScalingScheduleDetails model =
                    new DayBasedHorizontalScalingScheduleDetails(
                            this.timeAndHorizontalScalingConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DayBasedHorizontalScalingScheduleDetails model) {
            if (model.wasPropertyExplicitlySet("timeAndHorizontalScalingConfig")) {
                this.timeAndHorizontalScalingConfig(model.getTimeAndHorizontalScalingConfig());
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

    @Deprecated
    public DayBasedHorizontalScalingScheduleDetails(
            java.util.List<TimeAndHorizontalScalingConfig> timeAndHorizontalScalingConfig) {
        super();
        this.timeAndHorizontalScalingConfig = timeAndHorizontalScalingConfig;
    }

    /** Time of day and horizontal scaling configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAndHorizontalScalingConfig")
    private final java.util.List<TimeAndHorizontalScalingConfig> timeAndHorizontalScalingConfig;

    /**
     * Time of day and horizontal scaling configuration.
     *
     * @return the value
     */
    public java.util.List<TimeAndHorizontalScalingConfig> getTimeAndHorizontalScalingConfig() {
        return timeAndHorizontalScalingConfig;
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
        sb.append("DayBasedHorizontalScalingScheduleDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeAndHorizontalScalingConfig=")
                .append(String.valueOf(this.timeAndHorizontalScalingConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DayBasedHorizontalScalingScheduleDetails)) {
            return false;
        }

        DayBasedHorizontalScalingScheduleDetails other =
                (DayBasedHorizontalScalingScheduleDetails) o;
        return java.util.Objects.equals(
                        this.timeAndHorizontalScalingConfig, other.timeAndHorizontalScalingConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.timeAndHorizontalScalingConfig == null
                                ? 43
                                : this.timeAndHorizontalScalingConfig.hashCode());
        return result;
    }
}
