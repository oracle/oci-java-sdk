/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Monitor availability configuration details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailabilityConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AvailabilityConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maxAllowedFailuresPerInterval",
        "minAllowedRunsPerInterval"
    })
    public AvailabilityConfiguration(
            Integer maxAllowedFailuresPerInterval, Integer minAllowedRunsPerInterval) {
        super();
        this.maxAllowedFailuresPerInterval = maxAllowedFailuresPerInterval;
        this.minAllowedRunsPerInterval = minAllowedRunsPerInterval;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Intervals with failed runs more than this value will be classified as UNAVAILABLE. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAllowedFailuresPerInterval")
        private Integer maxAllowedFailuresPerInterval;

        /**
         * Intervals with failed runs more than this value will be classified as UNAVAILABLE.
         *
         * @param maxAllowedFailuresPerInterval the value to set
         * @return this builder
         */
        public Builder maxAllowedFailuresPerInterval(Integer maxAllowedFailuresPerInterval) {
            this.maxAllowedFailuresPerInterval = maxAllowedFailuresPerInterval;
            this.__explicitlySet__.add("maxAllowedFailuresPerInterval");
            return this;
        }
        /**
         * Intervals with runs less than this value will be classified as UNKNOWN and excluded from
         * the availability calculations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minAllowedRunsPerInterval")
        private Integer minAllowedRunsPerInterval;

        /**
         * Intervals with runs less than this value will be classified as UNKNOWN and excluded from
         * the availability calculations.
         *
         * @param minAllowedRunsPerInterval the value to set
         * @return this builder
         */
        public Builder minAllowedRunsPerInterval(Integer minAllowedRunsPerInterval) {
            this.minAllowedRunsPerInterval = minAllowedRunsPerInterval;
            this.__explicitlySet__.add("minAllowedRunsPerInterval");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailabilityConfiguration build() {
            AvailabilityConfiguration model =
                    new AvailabilityConfiguration(
                            this.maxAllowedFailuresPerInterval, this.minAllowedRunsPerInterval);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailabilityConfiguration model) {
            if (model.wasPropertyExplicitlySet("maxAllowedFailuresPerInterval")) {
                this.maxAllowedFailuresPerInterval(model.getMaxAllowedFailuresPerInterval());
            }
            if (model.wasPropertyExplicitlySet("minAllowedRunsPerInterval")) {
                this.minAllowedRunsPerInterval(model.getMinAllowedRunsPerInterval());
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

    /** Intervals with failed runs more than this value will be classified as UNAVAILABLE. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAllowedFailuresPerInterval")
    private final Integer maxAllowedFailuresPerInterval;

    /**
     * Intervals with failed runs more than this value will be classified as UNAVAILABLE.
     *
     * @return the value
     */
    public Integer getMaxAllowedFailuresPerInterval() {
        return maxAllowedFailuresPerInterval;
    }

    /**
     * Intervals with runs less than this value will be classified as UNKNOWN and excluded from the
     * availability calculations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minAllowedRunsPerInterval")
    private final Integer minAllowedRunsPerInterval;

    /**
     * Intervals with runs less than this value will be classified as UNKNOWN and excluded from the
     * availability calculations.
     *
     * @return the value
     */
    public Integer getMinAllowedRunsPerInterval() {
        return minAllowedRunsPerInterval;
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
        sb.append("AvailabilityConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("maxAllowedFailuresPerInterval=")
                .append(String.valueOf(this.maxAllowedFailuresPerInterval));
        sb.append(", minAllowedRunsPerInterval=")
                .append(String.valueOf(this.minAllowedRunsPerInterval));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailabilityConfiguration)) {
            return false;
        }

        AvailabilityConfiguration other = (AvailabilityConfiguration) o;
        return java.util.Objects.equals(
                        this.maxAllowedFailuresPerInterval, other.maxAllowedFailuresPerInterval)
                && java.util.Objects.equals(
                        this.minAllowedRunsPerInterval, other.minAllowedRunsPerInterval)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maxAllowedFailuresPerInterval == null
                                ? 43
                                : this.maxAllowedFailuresPerInterval.hashCode());
        result =
                (result * PRIME)
                        + (this.minAllowedRunsPerInterval == null
                                ? 43
                                : this.minAllowedRunsPerInterval.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
