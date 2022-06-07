/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Risk score of a resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceRiskScoreAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceRiskScoreAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({"tactics", "scoreTimestamp", "riskScore", "riskLevel"})
    public ResourceRiskScoreAggregation(
            java.util.List<String> tactics,
            java.math.BigDecimal scoreTimestamp,
            Double riskScore,
            RiskLevel riskLevel) {
        super();
        this.tactics = tactics;
        this.scoreTimestamp = scoreTimestamp;
        this.riskScore = riskScore;
        this.riskLevel = riskLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tactics")
        private java.util.List<String> tactics;

        public Builder tactics(java.util.List<String> tactics) {
            this.tactics = tactics;
            this.__explicitlySet__.add("tactics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scoreTimestamp")
        private java.math.BigDecimal scoreTimestamp;

        public Builder scoreTimestamp(java.math.BigDecimal scoreTimestamp) {
            this.scoreTimestamp = scoreTimestamp;
            this.__explicitlySet__.add("scoreTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Double riskScore;

        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceRiskScoreAggregation build() {
            ResourceRiskScoreAggregation __instance__ =
                    new ResourceRiskScoreAggregation(tactics, scoreTimestamp, riskScore, riskLevel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceRiskScoreAggregation o) {
            Builder copiedBuilder =
                    tactics(o.getTactics())
                            .scoreTimestamp(o.getScoreTimestamp())
                            .riskScore(o.getRiskScore())
                            .riskLevel(o.getRiskLevel());

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
     * Tactics used for evaluating the risk scrore
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tactics")
    private final java.util.List<String> tactics;

    public java.util.List<String> getTactics() {
        return tactics;
    }

    /**
     * The date and time for which the score is calculated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scoreTimestamp")
    private final java.math.BigDecimal scoreTimestamp;

    public java.math.BigDecimal getScoreTimestamp() {
        return scoreTimestamp;
    }

    /**
     * Risk Score
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    private final Double riskScore;

    public Double getRiskScore() {
        return riskScore;
    }

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceRiskScoreAggregation(");
        sb.append("tactics=").append(String.valueOf(this.tactics));
        sb.append(", scoreTimestamp=").append(String.valueOf(this.scoreTimestamp));
        sb.append(", riskScore=").append(String.valueOf(this.riskScore));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceRiskScoreAggregation)) {
            return false;
        }

        ResourceRiskScoreAggregation other = (ResourceRiskScoreAggregation) o;
        return java.util.Objects.equals(this.tactics, other.tactics)
                && java.util.Objects.equals(this.scoreTimestamp, other.scoreTimestamp)
                && java.util.Objects.equals(this.riskScore, other.riskScore)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tactics == null ? 43 : this.tactics.hashCode());
        result =
                (result * PRIME)
                        + (this.scoreTimestamp == null ? 43 : this.scoreTimestamp.hashCode());
        result = (result * PRIME) + (this.riskScore == null ? 43 : this.riskScore.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
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
