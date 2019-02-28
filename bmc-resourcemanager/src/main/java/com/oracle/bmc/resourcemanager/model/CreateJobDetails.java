/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Defines the requirements and properties of a job to create and run against the specified stack.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stackId")
        private String stackId;

        public Builder stackId(String stackId) {
            this.stackId = stackId;
            this.__explicitlySet__.add("stackId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Job.Operation operation;

        public Builder operation(Job.Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyJobPlanResolution")
        private ApplyJobPlanResolution applyJobPlanResolution;

        public Builder applyJobPlanResolution(ApplyJobPlanResolution applyJobPlanResolution) {
            this.applyJobPlanResolution = applyJobPlanResolution;
            this.__explicitlySet__.add("applyJobPlanResolution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateJobDetails build() {
            CreateJobDetails __instance__ =
                    new CreateJobDetails(
                            stackId,
                            displayName,
                            operation,
                            applyJobPlanResolution,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobDetails o) {
            Builder copiedBuilder =
                    stackId(o.getStackId())
                            .displayName(o.getDisplayName())
                            .operation(o.getOperation())
                            .applyJobPlanResolution(o.getApplyJobPlanResolution())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * OCID of the stack that is associated with the current job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stackId")
    String stackId;

    /**
     * Description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Terraform-specific operation to execute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    Job.Operation operation;

    @com.fasterxml.jackson.annotation.JsonProperty("applyJobPlanResolution")
    ApplyJobPlanResolution applyJobPlanResolution;

    /**
     * Free-form tags associated with this resource. Each tag is a key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
