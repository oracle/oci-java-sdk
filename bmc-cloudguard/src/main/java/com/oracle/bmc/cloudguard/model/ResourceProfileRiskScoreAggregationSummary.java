/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Resource profile risk score trend-line
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
    builder = ResourceProfileRiskScoreAggregationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourceProfileRiskScoreAggregationSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileId")
        private String resourceProfileId;

        public Builder resourceProfileId(String resourceProfileId) {
            this.resourceProfileId = resourceProfileId;
            this.__explicitlySet__.add("resourceProfileId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileDisplayName")
        private String resourceProfileDisplayName;

        public Builder resourceProfileDisplayName(String resourceProfileDisplayName) {
            this.resourceProfileDisplayName = resourceProfileDisplayName;
            this.__explicitlySet__.add("resourceProfileDisplayName");
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

        public ResourceProfileRiskScoreAggregationSummary build() {
            ResourceProfileRiskScoreAggregationSummary __instance__ =
                    new ResourceProfileRiskScoreAggregationSummary(
                            resourceProfileId, resourceProfileDisplayName, riskThreshold, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceProfileRiskScoreAggregationSummary o) {
            Builder copiedBuilder =
                    resourceProfileId(o.getResourceProfileId())
                            .resourceProfileDisplayName(o.getResourceProfileDisplayName())
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
     * OCID for the resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileId")
    String resourceProfileId;

    /**
     * Display name for the resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileDisplayName")
    String resourceProfileDisplayName;

    /**
     * Risk threshold
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
