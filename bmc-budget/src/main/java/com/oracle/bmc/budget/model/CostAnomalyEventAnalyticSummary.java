/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * A CostAnomalyEventAnalyticSummary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CostAnomalyEventAnalyticSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CostAnomalyEventAnalyticSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"count", "averageCostImpact", "averageCostVariance"})
    public CostAnomalyEventAnalyticSummary(
            Integer count, Double averageCostImpact, Double averageCostVariance) {
        super();
        this.count = count;
        this.averageCostImpact = averageCostImpact;
        this.averageCostVariance = averageCostVariance;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of cost anomaly events in the given time period. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of cost anomaly events in the given time period.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /** The average cost impact of the anomaly events in the given time period. */
        @com.fasterxml.jackson.annotation.JsonProperty("averageCostImpact")
        private Double averageCostImpact;

        /**
         * The average cost impact of the anomaly events in the given time period.
         *
         * @param averageCostImpact the value to set
         * @return this builder
         */
        public Builder averageCostImpact(Double averageCostImpact) {
            this.averageCostImpact = averageCostImpact;
            this.__explicitlySet__.add("averageCostImpact");
            return this;
        }
        /** The average cost variance of the anomaly events in the given time period. */
        @com.fasterxml.jackson.annotation.JsonProperty("averageCostVariance")
        private Double averageCostVariance;

        /**
         * The average cost variance of the anomaly events in the given time period.
         *
         * @param averageCostVariance the value to set
         * @return this builder
         */
        public Builder averageCostVariance(Double averageCostVariance) {
            this.averageCostVariance = averageCostVariance;
            this.__explicitlySet__.add("averageCostVariance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CostAnomalyEventAnalyticSummary build() {
            CostAnomalyEventAnalyticSummary model =
                    new CostAnomalyEventAnalyticSummary(
                            this.count, this.averageCostImpact, this.averageCostVariance);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CostAnomalyEventAnalyticSummary model) {
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("averageCostImpact")) {
                this.averageCostImpact(model.getAverageCostImpact());
            }
            if (model.wasPropertyExplicitlySet("averageCostVariance")) {
                this.averageCostVariance(model.getAverageCostVariance());
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

    /** The number of cost anomaly events in the given time period. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of cost anomaly events in the given time period.
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
    }

    /** The average cost impact of the anomaly events in the given time period. */
    @com.fasterxml.jackson.annotation.JsonProperty("averageCostImpact")
    private final Double averageCostImpact;

    /**
     * The average cost impact of the anomaly events in the given time period.
     *
     * @return the value
     */
    public Double getAverageCostImpact() {
        return averageCostImpact;
    }

    /** The average cost variance of the anomaly events in the given time period. */
    @com.fasterxml.jackson.annotation.JsonProperty("averageCostVariance")
    private final Double averageCostVariance;

    /**
     * The average cost variance of the anomaly events in the given time period.
     *
     * @return the value
     */
    public Double getAverageCostVariance() {
        return averageCostVariance;
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
        sb.append("CostAnomalyEventAnalyticSummary(");
        sb.append("super=").append(super.toString());
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", averageCostImpact=").append(String.valueOf(this.averageCostImpact));
        sb.append(", averageCostVariance=").append(String.valueOf(this.averageCostVariance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CostAnomalyEventAnalyticSummary)) {
            return false;
        }

        CostAnomalyEventAnalyticSummary other = (CostAnomalyEventAnalyticSummary) o;
        return java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.averageCostImpact, other.averageCostImpact)
                && java.util.Objects.equals(this.averageCostVariance, other.averageCostVariance)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result =
                (result * PRIME)
                        + (this.averageCostImpact == null ? 43 : this.averageCostImpact.hashCode());
        result =
                (result * PRIME)
                        + (this.averageCostVariance == null
                                ? 43
                                : this.averageCostVariance.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
