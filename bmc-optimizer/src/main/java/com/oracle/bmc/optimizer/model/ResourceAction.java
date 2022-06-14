/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the resource action.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceAction {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "categoryId",
        "recommendationId",
        "resourceId",
        "name",
        "resourceType",
        "compartmentId",
        "compartmentName",
        "action",
        "lifecycleState",
        "estimatedCostSaving",
        "status",
        "timeStatusBegin",
        "timeStatusEnd",
        "metadata",
        "extendedMetadata",
        "timeCreated",
        "timeUpdated"
    })
    public ResourceAction(
            String id,
            String categoryId,
            String recommendationId,
            String resourceId,
            String name,
            String resourceType,
            String compartmentId,
            String compartmentName,
            Action action,
            LifecycleState lifecycleState,
            Double estimatedCostSaving,
            Status status,
            java.util.Date timeStatusBegin,
            java.util.Date timeStatusEnd,
            java.util.Map<String, String> metadata,
            java.util.Map<String, Object> extendedMetadata,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.categoryId = categoryId;
        this.recommendationId = recommendationId;
        this.resourceId = resourceId;
        this.name = name;
        this.resourceType = resourceType;
        this.compartmentId = compartmentId;
        this.compartmentName = compartmentName;
        this.action = action;
        this.lifecycleState = lifecycleState;
        this.estimatedCostSaving = estimatedCostSaving;
        this.status = status;
        this.timeStatusBegin = timeStatusBegin;
        this.timeStatusEnd = timeStatusEnd;
        this.metadata = metadata;
        this.extendedMetadata = extendedMetadata;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique OCID associated with the resource action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique OCID associated with the resource action.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The unique OCID associated with the category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
        private String categoryId;

        /**
         * The unique OCID associated with the category.
         * @param categoryId the value to set
         * @return this builder
         **/
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            this.__explicitlySet__.add("categoryId");
            return this;
        }
        /**
         * The unique OCID associated with the recommendation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationId")
        private String recommendationId;

        /**
         * The unique OCID associated with the recommendation.
         * @param recommendationId the value to set
         * @return this builder
         **/
        public Builder recommendationId(String recommendationId) {
            this.recommendationId = recommendationId;
            this.__explicitlySet__.add("recommendationId");
            return this;
        }
        /**
         * The unique OCID associated with the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The unique OCID associated with the resource.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The name assigned to the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name assigned to the resource.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The kind of resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The kind of resource.
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name associated with the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        /**
         * The name associated with the compartment.
         * @param compartmentName the value to set
         * @return this builder
         **/
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
        /**
         * The resource action's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The resource action's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The estimated cost savings, in dollars, for the resource action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
        private Double estimatedCostSaving;

        /**
         * The estimated cost savings, in dollars, for the resource action.
         * @param estimatedCostSaving the value to set
         * @return this builder
         **/
        public Builder estimatedCostSaving(Double estimatedCostSaving) {
            this.estimatedCostSaving = estimatedCostSaving;
            this.__explicitlySet__.add("estimatedCostSaving");
            return this;
        }
        /**
         * The current status of the resource action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current status of the resource action.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The date and time that the resource action entered its current status. The format is defined by RFC3339.
         * <p>
         * For example, "The status of the resource action changed from {@code pending} to {@code current(ignored)} on this date and time."
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusBegin")
        private java.util.Date timeStatusBegin;

        /**
         * The date and time that the resource action entered its current status. The format is defined by RFC3339.
         * <p>
         * For example, "The status of the resource action changed from {@code pending} to {@code current(ignored)} on this date and time."
         *
         * @param timeStatusBegin the value to set
         * @return this builder
         **/
        public Builder timeStatusBegin(java.util.Date timeStatusBegin) {
            this.timeStatusBegin = timeStatusBegin;
            this.__explicitlySet__.add("timeStatusBegin");
            return this;
        }
        /**
         * The date and time the current status will change. The format is defined by RFC3339.
         * <p>
         * For example, "The current {@code postponed} status of the resource action will end and change to {@code pending} on this
         * date and time."
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
        private java.util.Date timeStatusEnd;

        /**
         * The date and time the current status will change. The format is defined by RFC3339.
         * <p>
         * For example, "The current {@code postponed} status of the resource action will end and change to {@code pending} on this
         * date and time."
         *
         * @param timeStatusEnd the value to set
         * @return this builder
         **/
        public Builder timeStatusEnd(java.util.Date timeStatusEnd) {
            this.timeStatusEnd = timeStatusEnd;
            this.__explicitlySet__.add("timeStatusEnd");
            return this;
        }
        /**
         * Custom metadata key/value pairs for the resource action.
         * <p>
         **Metadata Example**
         * <p>
         * "metadata" : {
         *          "cpuRecommendedShape": "VM.Standard1.1",
         *          "computeMemoryUtilization": "26.05734124418388",
         *          "currentShape": "VM.Standard1.2",
         *          "instanceRecommendedShape": "VM.Standard1.1",
         *          "computeCpuUtilization": "7.930035319720132",
         *          "memoryRecommendedShape": "None"
         *       }
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Custom metadata key/value pairs for the resource action.
         * <p>
         **Metadata Example**
         * <p>
         * "metadata" : {
         *          "cpuRecommendedShape": "VM.Standard1.1",
         *          "computeMemoryUtilization": "26.05734124418388",
         *          "currentShape": "VM.Standard1.2",
         *          "instanceRecommendedShape": "VM.Standard1.1",
         *          "computeCpuUtilization": "7.930035319720132",
         *          "memoryRecommendedShape": "None"
         *       }
         *
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * Additional metadata key/value pairs that you provide.
         * They serve the same purpose and functionality as fields in the {@code metadata} object.
         * <p>
         * They are distinguished from {@code metadata} fields in that these can be nested JSON objects (whereas {@code metadata} fields are string/string maps only).
         * <p>
         * For example:
         * <p>
         * {@code {"CurrentShape": {"name":"VM.Standard2.16"}, "RecommendedShape": {"name":"VM.Standard2.8"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, Object> extendedMetadata;

        /**
         * Additional metadata key/value pairs that you provide.
         * They serve the same purpose and functionality as fields in the {@code metadata} object.
         * <p>
         * They are distinguished from {@code metadata} fields in that these can be nested JSON objects (whereas {@code metadata} fields are string/string maps only).
         * <p>
         * For example:
         * <p>
         * {@code {"CurrentShape": {"name":"VM.Standard2.16"}, "RecommendedShape": {"name":"VM.Standard2.8"}}}
         *
         * @param extendedMetadata the value to set
         * @return this builder
         **/
        public Builder extendedMetadata(java.util.Map<String, Object> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }
        /**
         * The date and time the resource action details were created, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource action details were created, in the format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the resource action details were last updated, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource action details were last updated, in the format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceAction build() {
            ResourceAction __instance__ =
                    new ResourceAction(
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
        public Builder copy(ResourceAction o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The unique OCID associated with the resource action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique OCID associated with the resource action.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The unique OCID associated with the category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
    private final String categoryId;

    /**
     * The unique OCID associated with the category.
     * @return the value
     **/
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * The unique OCID associated with the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationId")
    private final String recommendationId;

    /**
     * The unique OCID associated with the recommendation.
     * @return the value
     **/
    public String getRecommendationId() {
        return recommendationId;
    }

    /**
     * The unique OCID associated with the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The unique OCID associated with the resource.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The name assigned to the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name assigned to the resource.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The kind of resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The kind of resource.
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name associated with the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    private final String compartmentName;

    /**
     * The name associated with the compartment.
     * @return the value
     **/
    public String getCompartmentName() {
        return compartmentName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    public Action getAction() {
        return action;
    }

    /**
     * The resource action's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The resource action's current state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The estimated cost savings, in dollars, for the resource action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
    private final Double estimatedCostSaving;

    /**
     * The estimated cost savings, in dollars, for the resource action.
     * @return the value
     **/
    public Double getEstimatedCostSaving() {
        return estimatedCostSaving;
    }

    /**
     * The current status of the resource action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status of the resource action.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The date and time that the resource action entered its current status. The format is defined by RFC3339.
     * <p>
     * For example, "The status of the resource action changed from {@code pending} to {@code current(ignored)} on this date and time."
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusBegin")
    private final java.util.Date timeStatusBegin;

    /**
     * The date and time that the resource action entered its current status. The format is defined by RFC3339.
     * <p>
     * For example, "The status of the resource action changed from {@code pending} to {@code current(ignored)} on this date and time."
     *
     * @return the value
     **/
    public java.util.Date getTimeStatusBegin() {
        return timeStatusBegin;
    }

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     * <p>
     * For example, "The current {@code postponed} status of the resource action will end and change to {@code pending} on this
     * date and time."
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
    private final java.util.Date timeStatusEnd;

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     * <p>
     * For example, "The current {@code postponed} status of the resource action will end and change to {@code pending} on this
     * date and time."
     *
     * @return the value
     **/
    public java.util.Date getTimeStatusEnd() {
        return timeStatusEnd;
    }

    /**
     * Custom metadata key/value pairs for the resource action.
     * <p>
     **Metadata Example**
     * <p>
     * "metadata" : {
     *          "cpuRecommendedShape": "VM.Standard1.1",
     *          "computeMemoryUtilization": "26.05734124418388",
     *          "currentShape": "VM.Standard1.2",
     *          "instanceRecommendedShape": "VM.Standard1.1",
     *          "computeCpuUtilization": "7.930035319720132",
     *          "memoryRecommendedShape": "None"
     *       }
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Custom metadata key/value pairs for the resource action.
     * <p>
     **Metadata Example**
     * <p>
     * "metadata" : {
     *          "cpuRecommendedShape": "VM.Standard1.1",
     *          "computeMemoryUtilization": "26.05734124418388",
     *          "currentShape": "VM.Standard1.2",
     *          "instanceRecommendedShape": "VM.Standard1.1",
     *          "computeCpuUtilization": "7.930035319720132",
     *          "memoryRecommendedShape": "None"
     *       }
     *
     * @return the value
     **/
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Additional metadata key/value pairs that you provide.
     * They serve the same purpose and functionality as fields in the {@code metadata} object.
     * <p>
     * They are distinguished from {@code metadata} fields in that these can be nested JSON objects (whereas {@code metadata} fields are string/string maps only).
     * <p>
     * For example:
     * <p>
     * {@code {"CurrentShape": {"name":"VM.Standard2.16"}, "RecommendedShape": {"name":"VM.Standard2.8"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, Object> extendedMetadata;

    /**
     * Additional metadata key/value pairs that you provide.
     * They serve the same purpose and functionality as fields in the {@code metadata} object.
     * <p>
     * They are distinguished from {@code metadata} fields in that these can be nested JSON objects (whereas {@code metadata} fields are string/string maps only).
     * <p>
     * For example:
     * <p>
     * {@code {"CurrentShape": {"name":"VM.Standard2.16"}, "RecommendedShape": {"name":"VM.Standard2.8"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, Object> getExtendedMetadata() {
        return extendedMetadata;
    }

    /**
     * The date and time the resource action details were created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource action details were created, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the resource action details were last updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource action details were last updated, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceAction(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", categoryId=").append(String.valueOf(this.categoryId));
        sb.append(", recommendationId=").append(String.valueOf(this.recommendationId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentName=").append(String.valueOf(this.compartmentName));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", estimatedCostSaving=").append(String.valueOf(this.estimatedCostSaving));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStatusBegin=").append(String.valueOf(this.timeStatusBegin));
        sb.append(", timeStatusEnd=").append(String.valueOf(this.timeStatusEnd));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceAction)) {
            return false;
        }

        ResourceAction other = (ResourceAction) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.categoryId, other.categoryId)
                && java.util.Objects.equals(this.recommendationId, other.recommendationId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compartmentName, other.compartmentName)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.estimatedCostSaving, other.estimatedCostSaving)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStatusBegin, other.timeStatusBegin)
                && java.util.Objects.equals(this.timeStatusEnd, other.timeStatusEnd)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.categoryId == null ? 43 : this.categoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationId == null ? 43 : this.recommendationId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentName == null ? 43 : this.compartmentName.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedCostSaving == null
                                ? 43
                                : this.estimatedCostSaving.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusBegin == null ? 43 : this.timeStatusBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusEnd == null ? 43 : this.timeStatusEnd.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
