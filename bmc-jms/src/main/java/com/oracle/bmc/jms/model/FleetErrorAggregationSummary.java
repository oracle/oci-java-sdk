/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * High level view of fleet error aggregations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FleetErrorAggregationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FleetErrorAggregationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"healthyFleetCount", "fleetErrorAggregations"})
    public FleetErrorAggregationSummary(
            Integer healthyFleetCount,
            java.util.List<FleetErrorAggregation> fleetErrorAggregations) {
        super();
        this.healthyFleetCount = healthyFleetCount;
        this.fleetErrorAggregations = fleetErrorAggregations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Count of fleets with no problems. */
        @com.fasterxml.jackson.annotation.JsonProperty("healthyFleetCount")
        private Integer healthyFleetCount;

        /**
         * Count of fleets with no problems.
         *
         * @param healthyFleetCount the value to set
         * @return this builder
         */
        public Builder healthyFleetCount(Integer healthyFleetCount) {
            this.healthyFleetCount = healthyFleetCount;
            this.__explicitlySet__.add("healthyFleetCount");
            return this;
        }
        /** List of fleet error aggregations. */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetErrorAggregations")
        private java.util.List<FleetErrorAggregation> fleetErrorAggregations;

        /**
         * List of fleet error aggregations.
         *
         * @param fleetErrorAggregations the value to set
         * @return this builder
         */
        public Builder fleetErrorAggregations(
                java.util.List<FleetErrorAggregation> fleetErrorAggregations) {
            this.fleetErrorAggregations = fleetErrorAggregations;
            this.__explicitlySet__.add("fleetErrorAggregations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetErrorAggregationSummary build() {
            FleetErrorAggregationSummary model =
                    new FleetErrorAggregationSummary(
                            this.healthyFleetCount, this.fleetErrorAggregations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetErrorAggregationSummary model) {
            if (model.wasPropertyExplicitlySet("healthyFleetCount")) {
                this.healthyFleetCount(model.getHealthyFleetCount());
            }
            if (model.wasPropertyExplicitlySet("fleetErrorAggregations")) {
                this.fleetErrorAggregations(model.getFleetErrorAggregations());
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

    /** Count of fleets with no problems. */
    @com.fasterxml.jackson.annotation.JsonProperty("healthyFleetCount")
    private final Integer healthyFleetCount;

    /**
     * Count of fleets with no problems.
     *
     * @return the value
     */
    public Integer getHealthyFleetCount() {
        return healthyFleetCount;
    }

    /** List of fleet error aggregations. */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetErrorAggregations")
    private final java.util.List<FleetErrorAggregation> fleetErrorAggregations;

    /**
     * List of fleet error aggregations.
     *
     * @return the value
     */
    public java.util.List<FleetErrorAggregation> getFleetErrorAggregations() {
        return fleetErrorAggregations;
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
        sb.append("FleetErrorAggregationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("healthyFleetCount=").append(String.valueOf(this.healthyFleetCount));
        sb.append(", fleetErrorAggregations=").append(String.valueOf(this.fleetErrorAggregations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetErrorAggregationSummary)) {
            return false;
        }

        FleetErrorAggregationSummary other = (FleetErrorAggregationSummary) o;
        return java.util.Objects.equals(this.healthyFleetCount, other.healthyFleetCount)
                && java.util.Objects.equals(
                        this.fleetErrorAggregations, other.fleetErrorAggregations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.healthyFleetCount == null ? 43 : this.healthyFleetCount.hashCode());
        result =
                (result * PRIME)
                        + (this.fleetErrorAggregations == null
                                ? 43
                                : this.fleetErrorAggregations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
