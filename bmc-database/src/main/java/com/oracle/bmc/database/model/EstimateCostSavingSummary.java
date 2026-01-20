/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous AI Database cost savings. <br>
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
        builder = EstimateCostSavingSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EstimateCostSavingSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeStarted",
        "timeEnded",
        "isCpuAutoscale",
        "estimatedUsageWithoutElasticPool",
        "usageWithElasticPool",
        "costSavingsWithElasticPool"
    })
    public EstimateCostSavingSummary(
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Boolean isCpuAutoscale,
            Long estimatedUsageWithoutElasticPool,
            Long usageWithElasticPool,
            Double costSavingsWithElasticPool) {
        super();
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.isCpuAutoscale = isCpuAutoscale;
        this.estimatedUsageWithoutElasticPool = estimatedUsageWithoutElasticPool;
        this.usageWithElasticPool = usageWithElasticPool;
        this.costSavingsWithElasticPool = costSavingsWithElasticPool;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The epoch time at which cost aggregation starts. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The epoch time at which cost aggregation starts.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The epoch time at which cost aggregation ends. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The epoch time at which cost aggregation ends.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** Indicates if CPU autoscaling is applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCpuAutoscale")
        private Boolean isCpuAutoscale;

        /**
         * Indicates if CPU autoscaling is applied.
         *
         * @param isCpuAutoscale the value to set
         * @return this builder
         */
        public Builder isCpuAutoscale(Boolean isCpuAutoscale) {
            this.isCpuAutoscale = isCpuAutoscale;
            this.__explicitlySet__.add("isCpuAutoscale");
            return this;
        }
        /** CPU cost for a given time period under regular billing plan, in ECPU hours. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedUsageWithoutElasticPool")
        private Long estimatedUsageWithoutElasticPool;

        /**
         * CPU cost for a given time period under regular billing plan, in ECPU hours.
         *
         * @param estimatedUsageWithoutElasticPool the value to set
         * @return this builder
         */
        public Builder estimatedUsageWithoutElasticPool(Long estimatedUsageWithoutElasticPool) {
            this.estimatedUsageWithoutElasticPool = estimatedUsageWithoutElasticPool;
            this.__explicitlySet__.add("estimatedUsageWithoutElasticPool");
            return this;
        }
        /** CPU cost for a given time period under elastic pool billing plan, in ECPU hours. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageWithElasticPool")
        private Long usageWithElasticPool;

        /**
         * CPU cost for a given time period under elastic pool billing plan, in ECPU hours.
         *
         * @param usageWithElasticPool the value to set
         * @return this builder
         */
        public Builder usageWithElasticPool(Long usageWithElasticPool) {
            this.usageWithElasticPool = usageWithElasticPool;
            this.__explicitlySet__.add("usageWithElasticPool");
            return this;
        }
        /** Estimated cost savings in percentage with elastic pool utilization. */
        @com.fasterxml.jackson.annotation.JsonProperty("costSavingsWithElasticPool")
        private Double costSavingsWithElasticPool;

        /**
         * Estimated cost savings in percentage with elastic pool utilization.
         *
         * @param costSavingsWithElasticPool the value to set
         * @return this builder
         */
        public Builder costSavingsWithElasticPool(Double costSavingsWithElasticPool) {
            this.costSavingsWithElasticPool = costSavingsWithElasticPool;
            this.__explicitlySet__.add("costSavingsWithElasticPool");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimateCostSavingSummary build() {
            EstimateCostSavingSummary model =
                    new EstimateCostSavingSummary(
                            this.timeStarted,
                            this.timeEnded,
                            this.isCpuAutoscale,
                            this.estimatedUsageWithoutElasticPool,
                            this.usageWithElasticPool,
                            this.costSavingsWithElasticPool);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimateCostSavingSummary model) {
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("isCpuAutoscale")) {
                this.isCpuAutoscale(model.getIsCpuAutoscale());
            }
            if (model.wasPropertyExplicitlySet("estimatedUsageWithoutElasticPool")) {
                this.estimatedUsageWithoutElasticPool(model.getEstimatedUsageWithoutElasticPool());
            }
            if (model.wasPropertyExplicitlySet("usageWithElasticPool")) {
                this.usageWithElasticPool(model.getUsageWithElasticPool());
            }
            if (model.wasPropertyExplicitlySet("costSavingsWithElasticPool")) {
                this.costSavingsWithElasticPool(model.getCostSavingsWithElasticPool());
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

    /** The epoch time at which cost aggregation starts. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The epoch time at which cost aggregation starts.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The epoch time at which cost aggregation ends. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The epoch time at which cost aggregation ends.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** Indicates if CPU autoscaling is applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCpuAutoscale")
    private final Boolean isCpuAutoscale;

    /**
     * Indicates if CPU autoscaling is applied.
     *
     * @return the value
     */
    public Boolean getIsCpuAutoscale() {
        return isCpuAutoscale;
    }

    /** CPU cost for a given time period under regular billing plan, in ECPU hours. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedUsageWithoutElasticPool")
    private final Long estimatedUsageWithoutElasticPool;

    /**
     * CPU cost for a given time period under regular billing plan, in ECPU hours.
     *
     * @return the value
     */
    public Long getEstimatedUsageWithoutElasticPool() {
        return estimatedUsageWithoutElasticPool;
    }

    /** CPU cost for a given time period under elastic pool billing plan, in ECPU hours. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageWithElasticPool")
    private final Long usageWithElasticPool;

    /**
     * CPU cost for a given time period under elastic pool billing plan, in ECPU hours.
     *
     * @return the value
     */
    public Long getUsageWithElasticPool() {
        return usageWithElasticPool;
    }

    /** Estimated cost savings in percentage with elastic pool utilization. */
    @com.fasterxml.jackson.annotation.JsonProperty("costSavingsWithElasticPool")
    private final Double costSavingsWithElasticPool;

    /**
     * Estimated cost savings in percentage with elastic pool utilization.
     *
     * @return the value
     */
    public Double getCostSavingsWithElasticPool() {
        return costSavingsWithElasticPool;
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
        sb.append("EstimateCostSavingSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", isCpuAutoscale=").append(String.valueOf(this.isCpuAutoscale));
        sb.append(", estimatedUsageWithoutElasticPool=")
                .append(String.valueOf(this.estimatedUsageWithoutElasticPool));
        sb.append(", usageWithElasticPool=").append(String.valueOf(this.usageWithElasticPool));
        sb.append(", costSavingsWithElasticPool=")
                .append(String.valueOf(this.costSavingsWithElasticPool));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimateCostSavingSummary)) {
            return false;
        }

        EstimateCostSavingSummary other = (EstimateCostSavingSummary) o;
        return java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.isCpuAutoscale, other.isCpuAutoscale)
                && java.util.Objects.equals(
                        this.estimatedUsageWithoutElasticPool,
                        other.estimatedUsageWithoutElasticPool)
                && java.util.Objects.equals(this.usageWithElasticPool, other.usageWithElasticPool)
                && java.util.Objects.equals(
                        this.costSavingsWithElasticPool, other.costSavingsWithElasticPool)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.isCpuAutoscale == null ? 43 : this.isCpuAutoscale.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedUsageWithoutElasticPool == null
                                ? 43
                                : this.estimatedUsageWithoutElasticPool.hashCode());
        result =
                (result * PRIME)
                        + (this.usageWithElasticPool == null
                                ? 43
                                : this.usageWithElasticPool.hashCode());
        result =
                (result * PRIME)
                        + (this.costSavingsWithElasticPool == null
                                ? 43
                                : this.costSavingsWithElasticPool.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
