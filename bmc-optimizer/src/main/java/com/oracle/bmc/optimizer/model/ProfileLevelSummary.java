/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the profile level summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProfileLevelSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProfileLevelSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationName")
        private String recommendationName;

        public Builder recommendationName(String recommendationName) {
            this.recommendationName = recommendationName;
            this.__explicitlySet__.add("recommendationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<EvaluatedMetric> metrics;

        public Builder metrics(java.util.List<EvaluatedMetric> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultInterval")
        private Integer defaultInterval;

        public Builder defaultInterval(Integer defaultInterval) {
            this.defaultInterval = defaultInterval;
            this.__explicitlySet__.add("defaultInterval");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validIntervals")
        private java.util.List<Integer> validIntervals;

        public Builder validIntervals(java.util.List<Integer> validIntervals) {
            this.validIntervals = validIntervals;
            this.__explicitlySet__.add("validIntervals");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfileLevelSummary build() {
            ProfileLevelSummary __instance__ =
                    new ProfileLevelSummary(
                            name,
                            recommendationName,
                            metrics,
                            defaultInterval,
                            validIntervals,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileLevelSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .recommendationName(o.getRecommendationName())
                            .metrics(o.getMetrics())
                            .defaultInterval(o.getDefaultInterval())
                            .validIntervals(o.getValidIntervals())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * A unique name for the profile level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The name of the recommendation this profile level applies to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationName")
    String recommendationName;

    /**
     * The metrics that will be evaluated by profiles using this profile level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    java.util.List<EvaluatedMetric> metrics;

    /**
     * The default aggregation interval (in days) for profiles using this profile level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInterval")
    Integer defaultInterval;

    /**
     * An array of aggregation intervals (in days) allowed for profiles using this profile level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validIntervals")
    java.util.List<Integer> validIntervals;

    /**
     * The date and time the category details were created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the category details were last updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
