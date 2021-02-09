/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of recommendation to be processed.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProcessRecommendationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProcessRecommendationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
        private String recommendationKey;

        public Builder recommendationKey(String recommendationKey) {
            this.recommendationKey = recommendationKey;
            this.__explicitlySet__.add("recommendationKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationStatus")
        private RecommendationStatus recommendationStatus;

        public Builder recommendationStatus(RecommendationStatus recommendationStatus) {
            this.recommendationStatus = recommendationStatus;
            this.__explicitlySet__.add("recommendationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProcessRecommendationDetails build() {
            ProcessRecommendationDetails __instance__ =
                    new ProcessRecommendationDetails(
                            recommendationKey, recommendationStatus, properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProcessRecommendationDetails o) {
            Builder copiedBuilder =
                    recommendationKey(o.getRecommendationKey())
                            .recommendationStatus(o.getRecommendationStatus())
                            .properties(o.getProperties());

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
     * Unique identifier of the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
    String recommendationKey;

    /**
     * The status of a recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationStatus")
    RecommendationStatus recommendationStatus;

    /**
     * A map of maps that contains additional properties which are specific to the associated objects.
     * Each associated object defines it's set of required and optional properties.
     * Example: `{
     *             \"DataEntity\": {
     *               \"parentId\": \"entityId\"
     *             },
     *             \"Term\": {
     *               \"parentId\": \"glossaryId\"
     *             }
     *           }`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
