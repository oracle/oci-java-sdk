/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Recommendation Definition.
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
    builder = RecommendationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RecommendationSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private RecommendationType type;

        public Builder type(RecommendationType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.Map<String, String> details;

        public Builder details(java.util.Map<String, String> details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemCount")
        private Long problemCount;

        public Builder problemCount(Long problemCount) {
            this.problemCount = problemCount;
            this.__explicitlySet__.add("problemCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
        private RecommendationLifecycleDetail lifecycleDetail;

        public Builder lifecycleDetail(RecommendationLifecycleDetail lifecycleDetail) {
            this.lifecycleDetail = lifecycleDetail;
            this.__explicitlySet__.add("lifecycleDetail");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendationSummary build() {
            RecommendationSummary __instance__ =
                    new RecommendationSummary(
                            id,
                            type,
                            tenantId,
                            compartmentId,
                            targetId,
                            details,
                            riskLevel,
                            problemCount,
                            lifecycleState,
                            lifecycleDetail,
                            timeCreated,
                            timeUpdated,
                            name,
                            description);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendationSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .type(o.getType())
                            .tenantId(o.getTenantId())
                            .compartmentId(o.getCompartmentId())
                            .targetId(o.getTargetId())
                            .details(o.getDetails())
                            .riskLevel(o.getRiskLevel())
                            .problemCount(o.getProblemCount())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetail(o.getLifecycleDetail())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .name(o.getName())
                            .description(o.getDescription());

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
     * Unique identifier for Recommendation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Recommendation type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    RecommendationType type;

    /**
     * Tenant Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * targetId associated with the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * Recommendation details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    java.util.Map<String, String> details;

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    RiskLevel riskLevel;

    /**
     * Count number of the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemCount")
    Long problemCount;

    /**
     * The current state of the Recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The lifecycleDetail will give more detail on the substate of the lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
    RecommendationLifecycleDetail lifecycleDetail;

    /**
     * problem creating time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * problem updating time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * recommendation string showing on UX
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * description of the recommendation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
