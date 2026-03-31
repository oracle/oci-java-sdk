/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the fleet health metrics.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExadataInfrastructureFleetHealthMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataInfrastructureFleetHealthMetrics
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compareBaselineTime",
        "compareTargetTime",
        "compareType",
        "exadataInfrastructureFleetSummary",
        "fleetExadataInfrastructures"
    })
    public ExadataInfrastructureFleetHealthMetrics(
            String compareBaselineTime,
            String compareTargetTime,
            CompareType compareType,
            ExadataInfrastructureFleetSummary exadataInfrastructureFleetSummary,
            java.util.List<ExadataInfrastructureUsageMetrics> fleetExadataInfrastructures) {
        super();
        this.compareBaselineTime = compareBaselineTime;
        this.compareTargetTime = compareTargetTime;
        this.compareType = compareType;
        this.exadataInfrastructureFleetSummary = exadataInfrastructureFleetSummary;
        this.fleetExadataInfrastructures = fleetExadataInfrastructures;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The baseline date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         * This is the date and time against which percentage change is calculated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compareBaselineTime")
        private String compareBaselineTime;

        /**
         * The baseline date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         * This is the date and time against which percentage change is calculated.
         *
         * @param compareBaselineTime the value to set
         * @return this builder
         **/
        public Builder compareBaselineTime(String compareBaselineTime) {
            this.compareBaselineTime = compareBaselineTime;
            this.__explicitlySet__.add("compareBaselineTime");
            return this;
        }
        /**
         * The target date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         * All the metrics are returned for the target date and time and the percentage change
         * is calculated against the baseline date and time.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compareTargetTime")
        private String compareTargetTime;

        /**
         * The target date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         * All the metrics are returned for the target date and time and the percentage change
         * is calculated against the baseline date and time.
         *
         * @param compareTargetTime the value to set
         * @return this builder
         **/
        public Builder compareTargetTime(String compareTargetTime) {
            this.compareTargetTime = compareTargetTime;
            this.__explicitlySet__.add("compareTargetTime");
            return this;
        }
        /**
         * The time window used for metrics comparison.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compareType")
        private CompareType compareType;

        /**
         * The time window used for metrics comparison.
         * @param compareType the value to set
         * @return this builder
         **/
        public Builder compareType(CompareType compareType) {
            this.compareType = compareType;
            this.__explicitlySet__.add("compareType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureFleetSummary")
        private ExadataInfrastructureFleetSummary exadataInfrastructureFleetSummary;

        public Builder exadataInfrastructureFleetSummary(
                ExadataInfrastructureFleetSummary exadataInfrastructureFleetSummary) {
            this.exadataInfrastructureFleetSummary = exadataInfrastructureFleetSummary;
            this.__explicitlySet__.add("exadataInfrastructureFleetSummary");
            return this;
        }
        /**
         * A list of the Exadata infrastructures present in the fleet and their usage metrics.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fleetExadataInfrastructures")
        private java.util.List<ExadataInfrastructureUsageMetrics> fleetExadataInfrastructures;

        /**
         * A list of the Exadata infrastructures present in the fleet and their usage metrics.
         * @param fleetExadataInfrastructures the value to set
         * @return this builder
         **/
        public Builder fleetExadataInfrastructures(
                java.util.List<ExadataInfrastructureUsageMetrics> fleetExadataInfrastructures) {
            this.fleetExadataInfrastructures = fleetExadataInfrastructures;
            this.__explicitlySet__.add("fleetExadataInfrastructures");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInfrastructureFleetHealthMetrics build() {
            ExadataInfrastructureFleetHealthMetrics model =
                    new ExadataInfrastructureFleetHealthMetrics(
                            this.compareBaselineTime,
                            this.compareTargetTime,
                            this.compareType,
                            this.exadataInfrastructureFleetSummary,
                            this.fleetExadataInfrastructures);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInfrastructureFleetHealthMetrics model) {
            if (model.wasPropertyExplicitlySet("compareBaselineTime")) {
                this.compareBaselineTime(model.getCompareBaselineTime());
            }
            if (model.wasPropertyExplicitlySet("compareTargetTime")) {
                this.compareTargetTime(model.getCompareTargetTime());
            }
            if (model.wasPropertyExplicitlySet("compareType")) {
                this.compareType(model.getCompareType());
            }
            if (model.wasPropertyExplicitlySet("exadataInfrastructureFleetSummary")) {
                this.exadataInfrastructureFleetSummary(
                        model.getExadataInfrastructureFleetSummary());
            }
            if (model.wasPropertyExplicitlySet("fleetExadataInfrastructures")) {
                this.fleetExadataInfrastructures(model.getFleetExadataInfrastructures());
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
     * The baseline date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * This is the date and time against which percentage change is calculated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compareBaselineTime")
    private final String compareBaselineTime;

    /**
     * The baseline date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * This is the date and time against which percentage change is calculated.
     *
     * @return the value
     **/
    public String getCompareBaselineTime() {
        return compareBaselineTime;
    }

    /**
     * The target date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * All the metrics are returned for the target date and time and the percentage change
     * is calculated against the baseline date and time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compareTargetTime")
    private final String compareTargetTime;

    /**
     * The target date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * All the metrics are returned for the target date and time and the percentage change
     * is calculated against the baseline date and time.
     *
     * @return the value
     **/
    public String getCompareTargetTime() {
        return compareTargetTime;
    }

    /**
     * The time window used for metrics comparison.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compareType")
    private final CompareType compareType;

    /**
     * The time window used for metrics comparison.
     * @return the value
     **/
    public CompareType getCompareType() {
        return compareType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureFleetSummary")
    private final ExadataInfrastructureFleetSummary exadataInfrastructureFleetSummary;

    public ExadataInfrastructureFleetSummary getExadataInfrastructureFleetSummary() {
        return exadataInfrastructureFleetSummary;
    }

    /**
     * A list of the Exadata infrastructures present in the fleet and their usage metrics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fleetExadataInfrastructures")
    private final java.util.List<ExadataInfrastructureUsageMetrics> fleetExadataInfrastructures;

    /**
     * A list of the Exadata infrastructures present in the fleet and their usage metrics.
     * @return the value
     **/
    public java.util.List<ExadataInfrastructureUsageMetrics> getFleetExadataInfrastructures() {
        return fleetExadataInfrastructures;
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
        sb.append("ExadataInfrastructureFleetHealthMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("compareBaselineTime=").append(String.valueOf(this.compareBaselineTime));
        sb.append(", compareTargetTime=").append(String.valueOf(this.compareTargetTime));
        sb.append(", compareType=").append(String.valueOf(this.compareType));
        sb.append(", exadataInfrastructureFleetSummary=")
                .append(String.valueOf(this.exadataInfrastructureFleetSummary));
        sb.append(", fleetExadataInfrastructures=")
                .append(String.valueOf(this.fleetExadataInfrastructures));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInfrastructureFleetHealthMetrics)) {
            return false;
        }

        ExadataInfrastructureFleetHealthMetrics other = (ExadataInfrastructureFleetHealthMetrics) o;
        return java.util.Objects.equals(this.compareBaselineTime, other.compareBaselineTime)
                && java.util.Objects.equals(this.compareTargetTime, other.compareTargetTime)
                && java.util.Objects.equals(this.compareType, other.compareType)
                && java.util.Objects.equals(
                        this.exadataInfrastructureFleetSummary,
                        other.exadataInfrastructureFleetSummary)
                && java.util.Objects.equals(
                        this.fleetExadataInfrastructures, other.fleetExadataInfrastructures)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compareBaselineTime == null
                                ? 43
                                : this.compareBaselineTime.hashCode());
        result =
                (result * PRIME)
                        + (this.compareTargetTime == null ? 43 : this.compareTargetTime.hashCode());
        result = (result * PRIME) + (this.compareType == null ? 43 : this.compareType.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureFleetSummary == null
                                ? 43
                                : this.exadataInfrastructureFleetSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.fleetExadataInfrastructures == null
                                ? 43
                                : this.fleetExadataInfrastructures.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
