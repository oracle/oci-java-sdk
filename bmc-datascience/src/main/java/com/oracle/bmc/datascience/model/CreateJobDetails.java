/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Parameters needed to create a new job.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationDetails")
        private JobConfigurationDetails jobConfigurationDetails;

        public Builder jobConfigurationDetails(JobConfigurationDetails jobConfigurationDetails) {
            this.jobConfigurationDetails = jobConfigurationDetails;
            this.__explicitlySet__.add("jobConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobInfrastructureConfigurationDetails")
        private JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails;

        public Builder jobInfrastructureConfigurationDetails(
                JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails) {
            this.jobInfrastructureConfigurationDetails = jobInfrastructureConfigurationDetails;
            this.__explicitlySet__.add("jobInfrastructureConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobLogConfigurationDetails")
        private JobLogConfigurationDetails jobLogConfigurationDetails;

        public Builder jobLogConfigurationDetails(
                JobLogConfigurationDetails jobLogConfigurationDetails) {
            this.jobLogConfigurationDetails = jobLogConfigurationDetails;
            this.__explicitlySet__.add("jobLogConfigurationDetails");
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
                            projectId,
                            compartmentId,
                            displayName,
                            description,
                            jobConfigurationDetails,
                            jobInfrastructureConfigurationDetails,
                            jobLogConfigurationDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobDetails o) {
            Builder copiedBuilder =
                    projectId(o.getProjectId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .jobConfigurationDetails(o.getJobConfigurationDetails())
                            .jobInfrastructureConfigurationDetails(
                                    o.getJobInfrastructureConfigurationDetails())
                            .jobLogConfigurationDetails(o.getJobLogConfigurationDetails())
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    String projectId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly display name for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A short description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationDetails")
    JobConfigurationDetails jobConfigurationDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("jobInfrastructureConfigurationDetails")
    JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("jobLogConfigurationDetails")
    JobLogConfigurationDetails jobLogConfigurationDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
