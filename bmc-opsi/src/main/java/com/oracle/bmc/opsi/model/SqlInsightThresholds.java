/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Inventory details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlInsightThresholds.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlInsightThresholds
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Degradation Percent Threshold is used to derive degrading SQLs. */
        @com.fasterxml.jackson.annotation.JsonProperty("degradationInPct")
        private Integer degradationInPct;

        /**
         * Degradation Percent Threshold is used to derive degrading SQLs.
         *
         * @param degradationInPct the value to set
         * @return this builder
         */
        public Builder degradationInPct(Integer degradationInPct) {
            this.degradationInPct = degradationInPct;
            this.__explicitlySet__.add("degradationInPct");
            return this;
        }
        /** Variability Percent Threshold is used to derive variant SQLs. */
        @com.fasterxml.jackson.annotation.JsonProperty("variability")
        private Float variability;

        /**
         * Variability Percent Threshold is used to derive variant SQLs.
         *
         * @param variability the value to set
         * @return this builder
         */
        public Builder variability(Float variability) {
            this.variability = variability;
            this.__explicitlySet__.add("variability");
            return this;
        }
        /** Inefficiency Percent Threshold is used to derive inefficient SQLs. */
        @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
        private Integer inefficiencyInPct;

        /**
         * Inefficiency Percent Threshold is used to derive inefficient SQLs.
         *
         * @param inefficiencyInPct the value to set
         * @return this builder
         */
        public Builder inefficiencyInPct(Integer inefficiencyInPct) {
            this.inefficiencyInPct = inefficiencyInPct;
            this.__explicitlySet__.add("inefficiencyInPct");
            return this;
        }
        /**
         * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or variant or
         * inefficient. And these SQLs should also have increasing change in IO Time beyond
         * threshold. Insights are derived using linear regression.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("increaseInIOInPct")
        private Integer increaseInIOInPct;

        /**
         * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or variant or
         * inefficient. And these SQLs should also have increasing change in IO Time beyond
         * threshold. Insights are derived using linear regression.
         *
         * @param increaseInIOInPct the value to set
         * @return this builder
         */
        public Builder increaseInIOInPct(Integer increaseInIOInPct) {
            this.increaseInIOInPct = increaseInIOInPct;
            this.__explicitlySet__.add("increaseInIOInPct");
            return this;
        }
        /**
         * PctIncreaseInCPU is used for deriving insights for SQLs which are degrading or variant or
         * inefficient. And these SQLs should also have increasing change in CPU Time beyond
         * threshold. Insights are derived using linear regression.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("increaseInCPUInPct")
        private Integer increaseInCPUInPct;

        /**
         * PctIncreaseInCPU is used for deriving insights for SQLs which are degrading or variant or
         * inefficient. And these SQLs should also have increasing change in CPU Time beyond
         * threshold. Insights are derived using linear regression.
         *
         * @param increaseInCPUInPct the value to set
         * @return this builder
         */
        public Builder increaseInCPUInPct(Integer increaseInCPUInPct) {
            this.increaseInCPUInPct = increaseInCPUInPct;
            this.__explicitlySet__.add("increaseInCPUInPct");
            return this;
        }
        /**
         * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or variant or
         * inefficient. And these SQLs should also have increasing change in Other Wait Time beyond
         * threshold. Insights are derived using linear regression.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("increaseInInefficientWaitInPct")
        private Integer increaseInInefficientWaitInPct;

        /**
         * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or variant or
         * inefficient. And these SQLs should also have increasing change in Other Wait Time beyond
         * threshold. Insights are derived using linear regression.
         *
         * @param increaseInInefficientWaitInPct the value to set
         * @return this builder
         */
        public Builder increaseInInefficientWaitInPct(Integer increaseInInefficientWaitInPct) {
            this.increaseInInefficientWaitInPct = increaseInInefficientWaitInPct;
            this.__explicitlySet__.add("increaseInInefficientWaitInPct");
            return this;
        }
        /** Improved Percent Threshold is used to derive improving SQLs. */
        @com.fasterxml.jackson.annotation.JsonProperty("improvedInPct")
        private Integer improvedInPct;

        /**
         * Improved Percent Threshold is used to derive improving SQLs.
         *
         * @param improvedInPct the value to set
         * @return this builder
         */
        public Builder improvedInPct(Integer improvedInPct) {
            this.improvedInPct = improvedInPct;
            this.__explicitlySet__.add("improvedInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInsightThresholds build() {
            SqlInsightThresholds model =
                    new SqlInsightThresholds(
                            this.degradationInPct,
                            this.variability,
                            this.inefficiencyInPct,
                            this.increaseInIOInPct,
                            this.increaseInCPUInPct,
                            this.increaseInInefficientWaitInPct,
                            this.improvedInPct);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInsightThresholds model) {
            if (model.wasPropertyExplicitlySet("degradationInPct")) {
                this.degradationInPct(model.getDegradationInPct());
            }
            if (model.wasPropertyExplicitlySet("variability")) {
                this.variability(model.getVariability());
            }
            if (model.wasPropertyExplicitlySet("inefficiencyInPct")) {
                this.inefficiencyInPct(model.getInefficiencyInPct());
            }
            if (model.wasPropertyExplicitlySet("increaseInIOInPct")) {
                this.increaseInIOInPct(model.getIncreaseInIOInPct());
            }
            if (model.wasPropertyExplicitlySet("increaseInCPUInPct")) {
                this.increaseInCPUInPct(model.getIncreaseInCPUInPct());
            }
            if (model.wasPropertyExplicitlySet("increaseInInefficientWaitInPct")) {
                this.increaseInInefficientWaitInPct(model.getIncreaseInInefficientWaitInPct());
            }
            if (model.wasPropertyExplicitlySet("improvedInPct")) {
                this.improvedInPct(model.getImprovedInPct());
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

    /** Degradation Percent Threshold is used to derive degrading SQLs. */
    @com.fasterxml.jackson.annotation.JsonProperty("degradationInPct")
    private final Integer degradationInPct;

    /**
     * Degradation Percent Threshold is used to derive degrading SQLs.
     *
     * @return the value
     */
    public Integer getDegradationInPct() {
        return degradationInPct;
    }

    /** Variability Percent Threshold is used to derive variant SQLs. */
    @com.fasterxml.jackson.annotation.JsonProperty("variability")
    private final Float variability;

    /**
     * Variability Percent Threshold is used to derive variant SQLs.
     *
     * @return the value
     */
    public Float getVariability() {
        return variability;
    }

    /** Inefficiency Percent Threshold is used to derive inefficient SQLs. */
    @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
    private final Integer inefficiencyInPct;

    /**
     * Inefficiency Percent Threshold is used to derive inefficient SQLs.
     *
     * @return the value
     */
    public Integer getInefficiencyInPct() {
        return inefficiencyInPct;
    }

    /**
     * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or variant or
     * inefficient. And these SQLs should also have increasing change in IO Time beyond threshold.
     * Insights are derived using linear regression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("increaseInIOInPct")
    private final Integer increaseInIOInPct;

    /**
     * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or variant or
     * inefficient. And these SQLs should also have increasing change in IO Time beyond threshold.
     * Insights are derived using linear regression.
     *
     * @return the value
     */
    public Integer getIncreaseInIOInPct() {
        return increaseInIOInPct;
    }

    /**
     * PctIncreaseInCPU is used for deriving insights for SQLs which are degrading or variant or
     * inefficient. And these SQLs should also have increasing change in CPU Time beyond threshold.
     * Insights are derived using linear regression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("increaseInCPUInPct")
    private final Integer increaseInCPUInPct;

    /**
     * PctIncreaseInCPU is used for deriving insights for SQLs which are degrading or variant or
     * inefficient. And these SQLs should also have increasing change in CPU Time beyond threshold.
     * Insights are derived using linear regression.
     *
     * @return the value
     */
    public Integer getIncreaseInCPUInPct() {
        return increaseInCPUInPct;
    }

    /**
     * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or variant or
     * inefficient. And these SQLs should also have increasing change in Other Wait Time beyond
     * threshold. Insights are derived using linear regression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("increaseInInefficientWaitInPct")
    private final Integer increaseInInefficientWaitInPct;

    /**
     * PctIncreaseInIO is used for deriving insights for SQLs which are degrading or variant or
     * inefficient. And these SQLs should also have increasing change in Other Wait Time beyond
     * threshold. Insights are derived using linear regression.
     *
     * @return the value
     */
    public Integer getIncreaseInInefficientWaitInPct() {
        return increaseInInefficientWaitInPct;
    }

    /** Improved Percent Threshold is used to derive improving SQLs. */
    @com.fasterxml.jackson.annotation.JsonProperty("improvedInPct")
    private final Integer improvedInPct;

    /**
     * Improved Percent Threshold is used to derive improving SQLs.
     *
     * @return the value
     */
    public Integer getImprovedInPct() {
        return improvedInPct;
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
        sb.append("SqlInsightThresholds(");
        sb.append("super=").append(super.toString());
        sb.append("degradationInPct=").append(String.valueOf(this.degradationInPct));
        sb.append(", variability=").append(String.valueOf(this.variability));
        sb.append(", inefficiencyInPct=").append(String.valueOf(this.inefficiencyInPct));
        sb.append(", increaseInIOInPct=").append(String.valueOf(this.increaseInIOInPct));
        sb.append(", increaseInCPUInPct=").append(String.valueOf(this.increaseInCPUInPct));
        sb.append(", increaseInInefficientWaitInPct=")
                .append(String.valueOf(this.increaseInInefficientWaitInPct));
        sb.append(", improvedInPct=").append(String.valueOf(this.improvedInPct));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
