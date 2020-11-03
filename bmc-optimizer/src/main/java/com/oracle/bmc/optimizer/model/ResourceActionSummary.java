/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the resource action summary.
 * <p>
 **Caution:** Avoid using any confidential information when you use the API to supply string values.
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
    builder = ResourceActionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourceActionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
        private String categoryId;

        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            this.__explicitlySet__.add("categoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationId")
        private String recommendationId;

        public Builder recommendationId(String recommendationId) {
            this.recommendationId = recommendationId;
            this.__explicitlySet__.add("recommendationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
        private Double estimatedCostSaving;

        public Builder estimatedCostSaving(Double estimatedCostSaving) {
            this.estimatedCostSaving = estimatedCostSaving;
            this.__explicitlySet__.add("estimatedCostSaving");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusBegin")
        private java.util.Date timeStatusBegin;

        public Builder timeStatusBegin(java.util.Date timeStatusBegin) {
            this.timeStatusBegin = timeStatusBegin;
            this.__explicitlySet__.add("timeStatusBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
        private java.util.Date timeStatusEnd;

        public Builder timeStatusEnd(java.util.Date timeStatusEnd) {
            this.timeStatusEnd = timeStatusEnd;
            this.__explicitlySet__.add("timeStatusEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, Object> extendedMetadata;

        public Builder extendedMetadata(java.util.Map<String, Object> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
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

        public ResourceActionSummary build() {
            ResourceActionSummary __instance__ =
                    new ResourceActionSummary(
                            id,
                            categoryId,
                            recommendationId,
                            resourceId,
                            name,
                            resourceType,
                            compartmentId,
                            compartmentName,
                            action,
                            lifecycleState,
                            estimatedCostSaving,
                            status,
                            timeStatusBegin,
                            timeStatusEnd,
                            metadata,
                            extendedMetadata,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceActionSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .categoryId(o.getCategoryId())
                            .recommendationId(o.getRecommendationId())
                            .resourceId(o.getResourceId())
                            .name(o.getName())
                            .resourceType(o.getResourceType())
                            .compartmentId(o.getCompartmentId())
                            .compartmentName(o.getCompartmentName())
                            .action(o.getAction())
                            .lifecycleState(o.getLifecycleState())
                            .estimatedCostSaving(o.getEstimatedCostSaving())
                            .status(o.getStatus())
                            .timeStatusBegin(o.getTimeStatusBegin())
                            .timeStatusEnd(o.getTimeStatusEnd())
                            .metadata(o.getMetadata())
                            .extendedMetadata(o.getExtendedMetadata())
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
     * The unique OCID associated with the resource action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The unique OCID associated with the category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
    String categoryId;

    /**
     * The unique OCID associated with the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationId")
    String recommendationId;

    /**
     * The unique OCID associated with the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * The name assigned to the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The kind of resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    String resourceType;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The name associated with the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    String compartmentName;

    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;

    /**
     * The resource action's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The estimated cost savings, in dollars, for the resource action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
    Double estimatedCostSaving;

    /**
     * The current status of the resource action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The date and time that the resource action entered its current status. The format is defined by RFC3339.
     * <p>
     * For example, \"The status of the resource action changed from `pending` to `current(ignored)` on this date and time.\"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusBegin")
    java.util.Date timeStatusBegin;

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     * <p>
     * For example, \"The current `postponed` status of the resource action will end and change to `pending` on this
     * date and time.\"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
    java.util.Date timeStatusEnd;

    /**
     * Custom metadata key/value pairs for the resource action.
     * <p>
     **Metadata Example**
     * <p>
     * \"metadata\" : {
     *          \"cpuRecommendedShape\": \"VM.Standard1.1\",
     *          \"computeMemoryUtilization\": \"26.05734124418388\",
     *          \"currentShape\": \"VM.Standard1.2\",
     *          \"instanceRecommendedShape\": \"VM.Standard1.1\",
     *          \"computeCpuUtilization\": \"7.930035319720132\",
     *          \"memoryRecommendedShape\": \"None\"
     *       }
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    /**
     * Additional metadata key/value pairs that you provide.
     * They serve the same purpose and functionality as fields in the `metadata` object.
     * <p>
     * They are distinguished from `metadata` fields in that these can be nested JSON objects (whereas `metadata` fields are string/string maps only).
     * <p>
     * For example:
     * <p>
     * `{\"CurrentShape\": {\"name\":\"VM.Standard2.16\"}, \"RecommendedShape\": {\"name\":\"VM.Standard2.8\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    java.util.Map<String, Object> extendedMetadata;

    /**
     * The date and time the resource action details were created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the resource action details were last updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
