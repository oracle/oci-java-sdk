/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to destroy operations.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DestroyJobOperationDetailsSummary.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DestroyJobOperationDetailsSummary extends JobOperationDetailsSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
        private DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

        public Builder executionPlanStrategy(
                DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
            this.executionPlanStrategy = executionPlanStrategy;
            this.__explicitlySet__.add("executionPlanStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DestroyJobOperationDetailsSummary build() {
            DestroyJobOperationDetailsSummary __instance__ =
                    new DestroyJobOperationDetailsSummary(executionPlanStrategy);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DestroyJobOperationDetailsSummary o) {
            Builder copiedBuilder = executionPlanStrategy(o.getExecutionPlanStrategy());

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

    @Deprecated
    public DestroyJobOperationDetailsSummary(
            DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
        super();
        this.executionPlanStrategy = executionPlanStrategy;
    }

    /**
     * Specifies the source of the execution plan to apply.
     * Currently, only `AUTO_APPROVED` is allowed, which indicates that the job
     * will be run without an execution plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
    DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
