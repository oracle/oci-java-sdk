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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RecommendationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecommendationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "recommendationKey",
        "recommendationType",
        "recommendationStatus",
        "confidenceScore",
        "sourceObjectKey",
        "sourceObjectName",
        "sourceObjectType",
        "targetObjectKey",
        "targetObjectName",
        "targetObjectType",
        "properties"
    })
    public RecommendationDetails(
            String recommendationKey,
            RecommendationType recommendationType,
            RecommendationStatus recommendationStatus,
            Float confidenceScore,
            String sourceObjectKey,
            String sourceObjectName,
            RecommendationResourceType sourceObjectType,
            String targetObjectKey,
            String targetObjectName,
            RecommendationResourceType targetObjectType,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.recommendationKey = recommendationKey;
        this.recommendationType = recommendationType;
        this.recommendationStatus = recommendationStatus;
        this.confidenceScore = confidenceScore;
        this.sourceObjectKey = sourceObjectKey;
        this.sourceObjectName = sourceObjectName;
        this.sourceObjectType = sourceObjectType;
        this.targetObjectKey = targetObjectKey;
        this.targetObjectName = targetObjectName;
        this.targetObjectType = targetObjectType;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique identifier of the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
    private final String recommendationKey;

    public String getRecommendationKey() {
        return recommendationKey;
    }

    /**
     * Type of recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationType")
    private final RecommendationType recommendationType;

    public RecommendationType getRecommendationType() {
        return recommendationType;
    }

    /**
     * Status of a recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationStatus")
    private final RecommendationStatus recommendationStatus;

    public RecommendationStatus getRecommendationStatus() {
        return recommendationStatus;
    }

    /**
     * Level of confidence, on a scale between 0 and 1, that the recommendation is applicable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidenceScore")
    private final Float confidenceScore;

    public Float getConfidenceScore() {
        return confidenceScore;
    }

    /**
     * Unique identifier of the source object; the one for which a recommendation is made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectKey")
    private final String sourceObjectKey;

    public String getSourceObjectKey() {
        return sourceObjectKey;
    }

    /**
     * Name of the source object; the one for which a recommendation is made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
    private final String sourceObjectName;

    public String getSourceObjectName() {
        return sourceObjectName;
    }

    /**
     * Type of the source object; the one for which a recommendation is made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectType")
    private final RecommendationResourceType sourceObjectType;

    public RecommendationResourceType getSourceObjectType() {
        return sourceObjectType;
    }

    /**
     * Unique identifier of the target object; the one which has been recommended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObjectKey")
    private final String targetObjectKey;

    public String getTargetObjectKey() {
        return targetObjectKey;
    }

    /**
     * Name of the target object; the one which has been recommended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObjectName")
    private final String targetObjectName;

    public String getTargetObjectName() {
        return targetObjectName;
    }

    /**
     * Type of the target object; the one which has been recommended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObjectType")
    private final RecommendationResourceType targetObjectType;

    public RecommendationResourceType getTargetObjectType() {
        return targetObjectType;
    }

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
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RecommendationDetails(");
        sb.append("recommendationKey=").append(String.valueOf(this.recommendationKey));
        sb.append(", recommendationType=").append(String.valueOf(this.recommendationType));
        sb.append(", recommendationStatus=").append(String.valueOf(this.recommendationStatus));
        sb.append(", confidenceScore=").append(String.valueOf(this.confidenceScore));
        sb.append(", sourceObjectKey=").append(String.valueOf(this.sourceObjectKey));
        sb.append(", sourceObjectName=").append(String.valueOf(this.sourceObjectName));
        sb.append(", sourceObjectType=").append(String.valueOf(this.sourceObjectType));
        sb.append(", targetObjectKey=").append(String.valueOf(this.targetObjectKey));
        sb.append(", targetObjectName=").append(String.valueOf(this.targetObjectName));
        sb.append(", targetObjectType=").append(String.valueOf(this.targetObjectType));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendationDetails)) {
            return false;
        }

        RecommendationDetails other = (RecommendationDetails) o;
        return java.util.Objects.equals(this.recommendationKey, other.recommendationKey)
                && java.util.Objects.equals(this.recommendationType, other.recommendationType)
                && java.util.Objects.equals(this.recommendationStatus, other.recommendationStatus)
                && java.util.Objects.equals(this.confidenceScore, other.confidenceScore)
                && java.util.Objects.equals(this.sourceObjectKey, other.sourceObjectKey)
                && java.util.Objects.equals(this.sourceObjectName, other.sourceObjectName)
                && java.util.Objects.equals(this.sourceObjectType, other.sourceObjectType)
                && java.util.Objects.equals(this.targetObjectKey, other.targetObjectKey)
                && java.util.Objects.equals(this.targetObjectName, other.targetObjectName)
                && java.util.Objects.equals(this.targetObjectType, other.targetObjectType)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.recommendationKey == null ? 43 : this.recommendationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationType == null
                                ? 43
                                : this.recommendationType.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationStatus == null
                                ? 43
                                : this.recommendationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.confidenceScore == null ? 43 : this.confidenceScore.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceObjectKey == null ? 43 : this.sourceObjectKey.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceObjectName == null ? 43 : this.sourceObjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceObjectType == null ? 43 : this.sourceObjectType.hashCode());
        result =
                (result * PRIME)
                        + (this.targetObjectKey == null ? 43 : this.targetObjectKey.hashCode());
        result =
                (result * PRIME)
                        + (this.targetObjectName == null ? 43 : this.targetObjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetObjectType == null ? 43 : this.targetObjectType.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
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
