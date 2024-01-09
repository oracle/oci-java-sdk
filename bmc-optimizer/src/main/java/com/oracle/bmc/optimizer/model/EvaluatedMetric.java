/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * One of the metrics that will be evaluated by profiles using this profile level. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EvaluatedMetric.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EvaluatedMetric
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "statistic", "threshold", "target"})
    public EvaluatedMetric(String name, String statistic, Double threshold, Double target) {
        super();
        this.name = name;
        this.statistic = statistic;
        this.threshold = threshold;
        this.target = target;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the metric (e.g., {@code CpuUtilization}). */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the metric (e.g., {@code CpuUtilization}).
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The name of the statistic (e.g., {@code p95}). */
        @com.fasterxml.jackson.annotation.JsonProperty("statistic")
        private String statistic;

        /**
         * The name of the statistic (e.g., {@code p95}).
         *
         * @param statistic the value to set
         * @return this builder
         */
        public Builder statistic(String statistic) {
            this.statistic = statistic;
            this.__explicitlySet__.add("statistic");
            return this;
        }
        /** The threshold that must be crossed for the recommendation to appear. */
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private Double threshold;

        /**
         * The threshold that must be crossed for the recommendation to appear.
         *
         * @param threshold the value to set
         * @return this builder
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            this.__explicitlySet__.add("threshold");
            return this;
        }
        /** Optional. The metric value that the recommendation will target. */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private Double target;

        /**
         * Optional. The metric value that the recommendation will target.
         *
         * @param target the value to set
         * @return this builder
         */
        public Builder target(Double target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EvaluatedMetric build() {
            EvaluatedMetric model =
                    new EvaluatedMetric(this.name, this.statistic, this.threshold, this.target);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EvaluatedMetric model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("statistic")) {
                this.statistic(model.getStatistic());
            }
            if (model.wasPropertyExplicitlySet("threshold")) {
                this.threshold(model.getThreshold());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
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

    /** The name of the metric (e.g., {@code CpuUtilization}). */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the metric (e.g., {@code CpuUtilization}).
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The name of the statistic (e.g., {@code p95}). */
    @com.fasterxml.jackson.annotation.JsonProperty("statistic")
    private final String statistic;

    /**
     * The name of the statistic (e.g., {@code p95}).
     *
     * @return the value
     */
    public String getStatistic() {
        return statistic;
    }

    /** The threshold that must be crossed for the recommendation to appear. */
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Double threshold;

    /**
     * The threshold that must be crossed for the recommendation to appear.
     *
     * @return the value
     */
    public Double getThreshold() {
        return threshold;
    }

    /** Optional. The metric value that the recommendation will target. */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final Double target;

    /**
     * Optional. The metric value that the recommendation will target.
     *
     * @return the value
     */
    public Double getTarget() {
        return target;
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
        sb.append("EvaluatedMetric(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", statistic=").append(String.valueOf(this.statistic));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EvaluatedMetric)) {
            return false;
        }

        EvaluatedMetric other = (EvaluatedMetric) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.statistic, other.statistic)
                && java.util.Objects.equals(this.threshold, other.threshold)
                && java.util.Objects.equals(this.target, other.target)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.statistic == null ? 43 : this.statistic.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
