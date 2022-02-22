/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Collection of Resource risk scores
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
    builder = ResourceRiskScoreAggregationCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourceRiskScoreAggregationCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private String filterType;

        public Builder filterType(String filterType) {
            this.filterType = filterType;
            this.__explicitlySet__.add("filterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterId")
        private String filterId;

        public Builder filterId(String filterId) {
            this.filterId = filterId;
            this.__explicitlySet__.add("filterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskThreshold")
        private Integer riskThreshold;

        public Builder riskThreshold(Integer riskThreshold) {
            this.riskThreshold = riskThreshold;
            this.__explicitlySet__.add("riskThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ResourceRiskScoreAggregation> items;

        public Builder items(java.util.List<ResourceRiskScoreAggregation> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceRiskScoreAggregationCollection build() {
            ResourceRiskScoreAggregationCollection __instance__ =
                    new ResourceRiskScoreAggregationCollection(
                            filterType, filterId, riskThreshold, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceRiskScoreAggregationCollection o) {
            Builder copiedBuilder =
                    filterType(o.getFilterType())
                            .filterId(o.getFilterId())
                            .riskThreshold(o.getRiskThreshold())
                            .items(o.getItems());

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
     * Type of filter. Valid Values - problem_id and resource_id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    String filterType;

    /**
     * Id value on which risk scores are filtered
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterId")
    String filterId;

    /**
     * Risk Score
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskThreshold")
    Integer riskThreshold;

    /**
     * List of ResourceRiskScoreAggregation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<ResourceRiskScoreAggregation> items;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
