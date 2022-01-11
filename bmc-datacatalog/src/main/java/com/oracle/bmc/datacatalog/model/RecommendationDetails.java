/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of a recommendation.
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
    builder = RecommendationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RecommendationDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationType")
        private RecommendationType recommendationType;

        public Builder recommendationType(RecommendationType recommendationType) {
            this.recommendationType = recommendationType;
            this.__explicitlySet__.add("recommendationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationStatus")
        private RecommendationStatus recommendationStatus;

        public Builder recommendationStatus(RecommendationStatus recommendationStatus) {
            this.recommendationStatus = recommendationStatus;
            this.__explicitlySet__.add("recommendationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidenceScore")
        private Float confidenceScore;

        public Builder confidenceScore(Float confidenceScore) {
            this.confidenceScore = confidenceScore;
            this.__explicitlySet__.add("confidenceScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectKey")
        private String sourceObjectKey;

        public Builder sourceObjectKey(String sourceObjectKey) {
            this.sourceObjectKey = sourceObjectKey;
            this.__explicitlySet__.add("sourceObjectKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
        private String sourceObjectName;

        public Builder sourceObjectName(String sourceObjectName) {
            this.sourceObjectName = sourceObjectName;
            this.__explicitlySet__.add("sourceObjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectType")
        private RecommendationResourceType sourceObjectType;

        public Builder sourceObjectType(RecommendationResourceType sourceObjectType) {
            this.sourceObjectType = sourceObjectType;
            this.__explicitlySet__.add("sourceObjectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetObjectKey")
        private String targetObjectKey;

        public Builder targetObjectKey(String targetObjectKey) {
            this.targetObjectKey = targetObjectKey;
            this.__explicitlySet__.add("targetObjectKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetObjectName")
        private String targetObjectName;

        public Builder targetObjectName(String targetObjectName) {
            this.targetObjectName = targetObjectName;
            this.__explicitlySet__.add("targetObjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetObjectType")
        private RecommendationResourceType targetObjectType;

        public Builder targetObjectType(RecommendationResourceType targetObjectType) {
            this.targetObjectType = targetObjectType;
            this.__explicitlySet__.add("targetObjectType");
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

        public RecommendationDetails build() {
            RecommendationDetails __instance__ =
                    new RecommendationDetails(
                            recommendationKey,
                            recommendationType,
                            recommendationStatus,
                            confidenceScore,
                            sourceObjectKey,
                            sourceObjectName,
                            sourceObjectType,
                            targetObjectKey,
                            targetObjectName,
                            targetObjectType,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendationDetails o) {
            Builder copiedBuilder =
                    recommendationKey(o.getRecommendationKey())
                            .recommendationType(o.getRecommendationType())
                            .recommendationStatus(o.getRecommendationStatus())
                            .confidenceScore(o.getConfidenceScore())
                            .sourceObjectKey(o.getSourceObjectKey())
                            .sourceObjectName(o.getSourceObjectName())
                            .sourceObjectType(o.getSourceObjectType())
                            .targetObjectKey(o.getTargetObjectKey())
                            .targetObjectName(o.getTargetObjectName())
                            .targetObjectType(o.getTargetObjectType())
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
     * Type of recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationType")
    RecommendationType recommendationType;

    /**
     * Status of a recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationStatus")
    RecommendationStatus recommendationStatus;

    /**
     * Level of confidence, on a scale between 0 and 1, that the recommendation is applicable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidenceScore")
    Float confidenceScore;

    /**
     * Unique identifier of the source object; the one for which a recommendation is made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectKey")
    String sourceObjectKey;

    /**
     * Name of the source object; the one for which a recommendation is made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
    String sourceObjectName;

    /**
     * Type of the source object; the one for which a recommendation is made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectType")
    RecommendationResourceType sourceObjectType;

    /**
     * Unique identifier of the target object; the one which has been recommended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObjectKey")
    String targetObjectKey;

    /**
     * Name of the target object; the one which has been recommended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObjectName")
    String targetObjectName;

    /**
     * Type of the target object; the one which has been recommended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObjectType")
    RecommendationResourceType targetObjectType;

    /**
     * A map of maps that contains additional properties which are specific to the associated objects.
     * Each associated object defines it's set of required and optional properties.
     * Example: {@code {
     *             "DataEntity": {
     *               "parentId": "entityId"
     *             },
     *             "Term": {
     *               "parentId": "glossaryId"
     *             }
     *           }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
