/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Risk score of a resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceRiskScoreAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceRiskScoreAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** List of tactics used for evaluating the risk score */
        @com.fasterxml.jackson.annotation.JsonProperty("tactics")
        private java.util.List<String> tactics;

        /**
         * List of tactics used for evaluating the risk score
         *
         * @param tactics the value to set
         * @return this builder
         */
        public Builder tactics(java.util.List<String> tactics) {
            this.tactics = tactics;
            this.__explicitlySet__.add("tactics");
            return this;
        }
        /** The date and time for which the score is calculated. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("scoreTimestamp")
        private java.math.BigDecimal scoreTimestamp;

        /**
         * The date and time for which the score is calculated. Format defined by RFC3339.
         *
         * @param scoreTimestamp the value to set
         * @return this builder
         */
        public Builder scoreTimestamp(java.math.BigDecimal scoreTimestamp) {
            this.scoreTimestamp = scoreTimestamp;
            this.__explicitlySet__.add("scoreTimestamp");
            return this;
        }
        /** The risk score */
        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Double riskScore;

        /**
         * The risk score
         *
         * @param riskScore the value to set
         * @return this builder
         */
        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }
        /** The risk level */
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * The risk level
         *
         * @param riskLevel the value to set
         * @return this builder
         */
        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceRiskScoreAggregation build() {
            ResourceRiskScoreAggregation model =
                    new ResourceRiskScoreAggregation(
                            this.tactics, this.scoreTimestamp, this.riskScore, this.riskLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceRiskScoreAggregation model) {
            if (model.wasPropertyExplicitlySet("tactics")) {
                this.tactics(model.getTactics());
            }
            if (model.wasPropertyExplicitlySet("scoreTimestamp")) {
                this.scoreTimestamp(model.getScoreTimestamp());
            }
            if (model.wasPropertyExplicitlySet("riskScore")) {
                this.riskScore(model.getRiskScore());
            }
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
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

    /** List of tactics used for evaluating the risk score */
    @com.fasterxml.jackson.annotation.JsonProperty("tactics")
    private final java.util.List<String> tactics;

    /**
     * List of tactics used for evaluating the risk score
     *
     * @return the value
     */
    public java.util.List<String> getTactics() {
        return tactics;
    }

    /** The date and time for which the score is calculated. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("scoreTimestamp")
    private final java.math.BigDecimal scoreTimestamp;

    /**
     * The date and time for which the score is calculated. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.math.BigDecimal getScoreTimestamp() {
        return scoreTimestamp;
    }

    /** The risk score */
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    private final Double riskScore;

    /**
     * The risk score
     *
     * @return the value
     */
    public Double getRiskScore() {
        return riskScore;
    }

    /** The risk level */
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * The risk level
     *
     * @return the value
     */
    public RiskLevel getRiskLevel() {
        return riskLevel;
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
        sb.append("ResourceRiskScoreAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("tactics=").append(String.valueOf(this.tactics));
        sb.append(", scoreTimestamp=").append(String.valueOf(this.scoreTimestamp));
        sb.append(", riskScore=").append(String.valueOf(this.riskScore));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
