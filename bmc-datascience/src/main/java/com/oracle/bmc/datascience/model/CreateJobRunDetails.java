/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Parameters needed to create a new job run.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateJobRunDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateJobRunDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "projectId",
        "compartmentId",
        "displayName",
        "jobId",
        "jobConfigurationOverrideDetails",
        "jobLogConfigurationOverrideDetails",
        "freeformTags",
        "definedTags"
    })
    public CreateJobRunDetails(
            String projectId,
            String compartmentId,
            String displayName,
            String jobId,
            JobConfigurationDetails jobConfigurationOverrideDetails,
            JobLogConfigurationDetails jobLogConfigurationOverrideDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.projectId = projectId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.jobId = jobId;
        this.jobConfigurationOverrideDetails = jobConfigurationOverrideDetails;
        this.jobLogConfigurationOverrideDetails = jobLogConfigurationOverrideDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
         * @param projectId the value to set
         * @return this builder
         **/
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly display name for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job to create a run for.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobId")
        private String jobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job to create a run for.
         * @param jobId the value to set
         * @return this builder
         **/
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            this.__explicitlySet__.add("jobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationOverrideDetails")
        private JobConfigurationDetails jobConfigurationOverrideDetails;

        public Builder jobConfigurationOverrideDetails(
                JobConfigurationDetails jobConfigurationOverrideDetails) {
            this.jobConfigurationOverrideDetails = jobConfigurationOverrideDetails;
            this.__explicitlySet__.add("jobConfigurationOverrideDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobLogConfigurationOverrideDetails")
        private JobLogConfigurationDetails jobLogConfigurationOverrideDetails;

        public Builder jobLogConfigurationOverrideDetails(
                JobLogConfigurationDetails jobLogConfigurationOverrideDetails) {
            this.jobLogConfigurationOverrideDetails = jobLogConfigurationOverrideDetails;
            this.__explicitlySet__.add("jobLogConfigurationOverrideDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateJobRunDetails build() {
            CreateJobRunDetails model =
                    new CreateJobRunDetails(
                            this.projectId,
                            this.compartmentId,
                            this.displayName,
                            this.jobId,
                            this.jobConfigurationOverrideDetails,
                            this.jobLogConfigurationOverrideDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobRunDetails model) {
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("jobId")) {
                this.jobId(model.getJobId());
            }
            if (model.wasPropertyExplicitlySet("jobConfigurationOverrideDetails")) {
                this.jobConfigurationOverrideDetails(model.getJobConfigurationOverrideDetails());
            }
            if (model.wasPropertyExplicitlySet("jobLogConfigurationOverrideDetails")) {
                this.jobLogConfigurationOverrideDetails(
                        model.getJobLogConfigurationOverrideDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
     * @return the value
     **/
    public String getProjectId() {
        return projectId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly display name for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job to create a run for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobId")
    private final String jobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job to create a run for.
     * @return the value
     **/
    public String getJobId() {
        return jobId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationOverrideDetails")
    private final JobConfigurationDetails jobConfigurationOverrideDetails;

    public JobConfigurationDetails getJobConfigurationOverrideDetails() {
        return jobConfigurationOverrideDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobLogConfigurationOverrideDetails")
    private final JobLogConfigurationDetails jobLogConfigurationOverrideDetails;

    public JobLogConfigurationDetails getJobLogConfigurationOverrideDetails() {
        return jobLogConfigurationOverrideDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateJobRunDetails(");
        sb.append("super=").append(super.toString());
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", jobId=").append(String.valueOf(this.jobId));
        sb.append(", jobConfigurationOverrideDetails=")
                .append(String.valueOf(this.jobConfigurationOverrideDetails));
        sb.append(", jobLogConfigurationOverrideDetails=")
                .append(String.valueOf(this.jobLogConfigurationOverrideDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJobRunDetails)) {
            return false;
        }

        CreateJobRunDetails other = (CreateJobRunDetails) o;
        return java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(
                        this.jobConfigurationOverrideDetails, other.jobConfigurationOverrideDetails)
                && java.util.Objects.equals(
                        this.jobLogConfigurationOverrideDetails,
                        other.jobLogConfigurationOverrideDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result =
                (result * PRIME)
                        + (this.jobConfigurationOverrideDetails == null
                                ? 43
                                : this.jobConfigurationOverrideDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.jobLogConfigurationOverrideDetails == null
                                ? 43
                                : this.jobLogConfigurationOverrideDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
