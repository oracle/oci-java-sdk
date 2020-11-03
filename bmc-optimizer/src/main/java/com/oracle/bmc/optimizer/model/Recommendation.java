/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the recommendation.
 * <p>
 **Caution:** Avoid using any confidential information when you supply string values using the API.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Recommendation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Recommendation {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
        private String categoryId;

        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            this.__explicitlySet__.add("categoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importance")
        private Importance importance;

        public Builder importance(Importance importance) {
            this.importance = importance;
            this.__explicitlySet__.add("importance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceCounts")
        private java.util.List<ResourceCount> resourceCounts;

        public Builder resourceCounts(java.util.List<ResourceCount> resourceCounts) {
            this.resourceCounts = resourceCounts;
            this.__explicitlySet__.add("resourceCounts");
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

        @com.fasterxml.jackson.annotation.JsonProperty("supportedLevels")
        private SupportedLevels supportedLevels;

        public Builder supportedLevels(SupportedLevels supportedLevels) {
            this.supportedLevels = supportedLevels;
            this.__explicitlySet__.add("supportedLevels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Recommendation build() {
            Recommendation __instance__ =
                    new Recommendation(
                            id,
                            compartmentId,
                            categoryId,
                            name,
                            description,
                            importance,
                            resourceCounts,
                            lifecycleState,
                            estimatedCostSaving,
                            status,
                            timeStatusBegin,
                            timeStatusEnd,
                            timeCreated,
                            timeUpdated,
                            supportedLevels);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recommendation o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .categoryId(o.getCategoryId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .importance(o.getImportance())
                            .resourceCounts(o.getResourceCounts())
                            .lifecycleState(o.getLifecycleState())
                            .estimatedCostSaving(o.getEstimatedCostSaving())
                            .status(o.getStatus())
                            .timeStatusBegin(o.getTimeStatusBegin())
                            .timeStatusEnd(o.getTimeStatusEnd())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .supportedLevels(o.getSupportedLevels());

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
     * The unique OCID associated with the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the tenancy. The tenancy is the root compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The unique OCID associated with the category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
    String categoryId;

    /**
     * The name assigned to the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Text describing the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The level of importance assigned to the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importance")
    Importance importance;

    /**
     * An array of `ResourceCount` objects grouped by the status of the resource actions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCounts")
    java.util.List<ResourceCount> resourceCounts;

    /**
     * The recommendation's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The estimated cost savings, in dollars, for the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
    Double estimatedCostSaving;

    /**
     * The current status of the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The date and time that the recommendation entered its current status. The format is defined by RFC3339.
     * <p>
     * For example, \"The status of the recommendation changed from `pending` to `current(ignored)` on this date and time.\"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusBegin")
    java.util.Date timeStatusBegin;

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     * <p>
     * For example, \"The current `postponed` status of the recommendation will end and change to `pending` on this
     * date and time.\"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
    java.util.Date timeStatusEnd;

    /**
     * The date and time the recommendation details were created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the recommendation details were last updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonProperty("supportedLevels")
    SupportedLevels supportedLevels;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
