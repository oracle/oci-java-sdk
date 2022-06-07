/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Inventory details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlInsightThresholds.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlInsightThresholds {
    @Deprecated
    @java.beans.ConstructorProperties({
        "degradationInPct",
        "variability",
        "inefficiencyInPct",
        "increaseInIOInPct",
        "increaseInCPUInPct",
        "increaseInInefficientWaitInPct",
        "improvedInPct"
    })
    public SqlInsightThresholds(
            Integer degradationInPct,
            Float variability,
            Integer inefficiencyInPct,
            Integer increaseInIOInPct,
            Integer increaseInCPUInPct,
            Integer increaseInInefficientWaitInPct,
            Integer improvedInPct) {
        super();
        this.degradationInPct = degradationInPct;
        this.variability = variability;
        this.inefficiencyInPct = inefficiencyInPct;
        this.increaseInIOInPct = increaseInIOInPct;
        this.increaseInCPUInPct = increaseInCPUInPct;
        this.increaseInInefficientWaitInPct = increaseInInefficientWaitInPct;
        this.improvedInPct = improvedInPct;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("degradationInPct")
        private Integer degradationInPct;

        public Builder degradationInPct(Integer degradationInPct) {
            this.degradationInPct = degradationInPct;
            this.__explicitlySet__.add("degradationInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("variability")
        private Float variability;

        public Builder variability(Float variability) {
            this.variability = variability;
            this.__explicitlySet__.add("variability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
        private Integer inefficiencyInPct;

        public Builder inefficiencyInPct(Integer inefficiencyInPct) {
            this.inefficiencyInPct = inefficiencyInPct;
            this.__explicitlySet__.add("inefficiencyInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("increaseInIOInPct")
        private Integer increaseInIOInPct;

        public Builder increaseInIOInPct(Integer increaseInIOInPct) {
            this.increaseInIOInPct = increaseInIOInPct;
            this.__explicitlySet__.add("increaseInIOInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("increaseInCPUInPct")
        private Integer increaseInCPUInPct;

        public Builder increaseInCPUInPct(Integer increaseInCPUInPct) {
            this.increaseInCPUInPct = increaseInCPUInPct;
            this.__explicitlySet__.add("increaseInCPUInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("increaseInInefficientWaitInPct")
        private Integer increaseInInefficientWaitInPct;

        public Builder increaseInInefficientWaitInPct(Integer increaseInInefficientWaitInPct) {
            this.increaseInInefficientWaitInPct = increaseInInefficientWaitInPct;
            this.__explicitlySet__.add("increaseInInefficientWaitInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("improvedInPct")
        private Integer improvedInPct;

        public Builder improvedInPct(Integer improvedInPct) {
            this.improvedInPct = improvedInPct;
            this.__explicitlySet__.add("improvedInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInsightThresholds build() {
            SqlInsightThresholds __instance__ =
                    new SqlInsightThresholds(
                            degradationInPct,
                            variability,
                            inefficiencyInPct,
                            increaseInIOInPct,
                            increaseInCPUInPct,
                            increaseInInefficientWaitInPct,
                            improvedInPct);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInsightThresholds o) {
            Builder copiedBuilder =
                    degradationInPct(o.getDegradationInPct())
                            .variability(o.getVariability())
                            .inefficiencyInPct(o.getInefficiencyInPct())
                            .increaseInIOInPct(o.getIncreaseInIOInPct())
                            .increaseInCPUInPct(o.getIncreaseInCPUInPct())
                            .increaseInInefficientWaitInPct(o.getIncreaseInInefficientWaitInPct())
                            .improvedInPct(o.getImprovedInPct());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Degradation Percent Threshold is used to derive degrading SQLs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("degradationInPct")
    private final Integer degradationInPct;

    public Integer getDegradationInPct() {
        return degradationInPct;
    }

    /**
     * Variability Percent Threshold is used to derive variant SQLs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variability")
    private final Float variability;

    public Float getVariability() {
        return variability;
    }

    /**
     * Inefficiency Percent Threshold is used to derive inefficient SQLs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
    private final Integer inefficiencyInPct;

    public Integer getInefficiencyInPct() {
        return inefficiencyInPct;
    }

    /**
     * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or
     * variant or inefficient. And these SQLs should also have increasing change in IO Time
     * beyond threshold. Insights are derived using linear regression.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("increaseInIOInPct")
    private final Integer increaseInIOInPct;

    public Integer getIncreaseInIOInPct() {
        return increaseInIOInPct;
    }

    /**
     * PctIncreaseInCPU is used for deriving insights for SQLs which are degrading or
     * variant or inefficient. And these SQLs should also have increasing change in CPU Time
     * beyond threshold. Insights are derived using linear regression.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("increaseInCPUInPct")
    private final Integer increaseInCPUInPct;

    public Integer getIncreaseInCPUInPct() {
        return increaseInCPUInPct;
    }

    /**
     * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or
     * variant or inefficient. And these SQLs should also have increasing change in
     * Other Wait Time beyond threshold. Insights are derived using linear regression.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("increaseInInefficientWaitInPct")
    private final Integer increaseInInefficientWaitInPct;

    public Integer getIncreaseInInefficientWaitInPct() {
        return increaseInInefficientWaitInPct;
    }

    /**
     * Improved Percent Threshold is used to derive improving SQLs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("improvedInPct")
    private final Integer improvedInPct;

    public Integer getImprovedInPct() {
        return improvedInPct;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlInsightThresholds(");
        sb.append("degradationInPct=").append(String.valueOf(this.degradationInPct));
        sb.append(", variability=").append(String.valueOf(this.variability));
        sb.append(", inefficiencyInPct=").append(String.valueOf(this.inefficiencyInPct));
        sb.append(", increaseInIOInPct=").append(String.valueOf(this.increaseInIOInPct));
        sb.append(", increaseInCPUInPct=").append(String.valueOf(this.increaseInCPUInPct));
        sb.append(", increaseInInefficientWaitInPct=")
                .append(String.valueOf(this.increaseInInefficientWaitInPct));
        sb.append(", improvedInPct=").append(String.valueOf(this.improvedInPct));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlInsightThresholds)) {
            return false;
        }

        SqlInsightThresholds other = (SqlInsightThresholds) o;
        return java.util.Objects.equals(this.degradationInPct, other.degradationInPct)
                && java.util.Objects.equals(this.variability, other.variability)
                && java.util.Objects.equals(this.inefficiencyInPct, other.inefficiencyInPct)
                && java.util.Objects.equals(this.increaseInIOInPct, other.increaseInIOInPct)
                && java.util.Objects.equals(this.increaseInCPUInPct, other.increaseInCPUInPct)
                && java.util.Objects.equals(
                        this.increaseInInefficientWaitInPct, other.increaseInInefficientWaitInPct)
                && java.util.Objects.equals(this.improvedInPct, other.improvedInPct)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.degradationInPct == null ? 43 : this.degradationInPct.hashCode());
        result = (result * PRIME) + (this.variability == null ? 43 : this.variability.hashCode());
        result =
                (result * PRIME)
                        + (this.inefficiencyInPct == null ? 43 : this.inefficiencyInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.increaseInIOInPct == null ? 43 : this.increaseInIOInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.increaseInCPUInPct == null
                                ? 43
                                : this.increaseInCPUInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.increaseInInefficientWaitInPct == null
                                ? 43
                                : this.increaseInInefficientWaitInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.improvedInPct == null ? 43 : this.improvedInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
