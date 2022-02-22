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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceRiskScoreAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourceRiskScoreAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Tactics used for evaluating the risk scrore
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tactics")
    java.util.List<String> tactics;

    /**
     * The date and time for which the score is calculated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scoreTimestamp")
    java.math.BigDecimal scoreTimestamp;

    /**
     * Risk Score
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    Double riskScore;

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    RiskLevel riskLevel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
