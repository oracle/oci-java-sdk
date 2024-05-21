/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateJobDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "projectId",
        "compartmentId",
        "displayName",
        "description",
        "jobConfigurationDetails",
        "jobInfrastructureConfigurationDetails",
        "jobEnvironmentConfigurationDetails",
        "jobLogConfigurationDetails",
        "jobStorageMountConfigurationDetailsList",
        "freeformTags",
        "definedTags"
    })
    public CreateJobDetails(
            String projectId,
            String compartmentId,
            String displayName,
            String description,
            JobConfigurationDetails jobConfigurationDetails,
            JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails,
            JobEnvironmentConfigurationDetails jobEnvironmentConfigurationDetails,
            JobLogConfigurationDetails jobLogConfigurationDetails,
            java.util.List<StorageMountConfigurationDetails>
                    jobStorageMountConfigurationDetailsList,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.projectId = projectId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.jobConfigurationDetails = jobConfigurationDetails;
        this.jobInfrastructureConfigurationDetails = jobInfrastructureConfigurationDetails;
        this.jobEnvironmentConfigurationDetails = jobEnvironmentConfigurationDetails;
        this.jobLogConfigurationDetails = jobLogConfigurationDetails;
        this.jobStorageMountConfigurationDetailsList = jobStorageMountConfigurationDetailsList;
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
         * A short description of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the job.
         * @param description the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonProperty("jobEnvironmentConfigurationDetails")
        private JobEnvironmentConfigurationDetails jobEnvironmentConfigurationDetails;

        public Builder jobEnvironmentConfigurationDetails(
                JobEnvironmentConfigurationDetails jobEnvironmentConfigurationDetails) {
            this.jobEnvironmentConfigurationDetails = jobEnvironmentConfigurationDetails;
            this.__explicitlySet__.add("jobEnvironmentConfigurationDetails");
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
        /**
         * Collection of JobStorageMountConfigurationDetails.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobStorageMountConfigurationDetailsList")
        private java.util.List<StorageMountConfigurationDetails>
                jobStorageMountConfigurationDetailsList;

        /**
         * Collection of JobStorageMountConfigurationDetails.
         * @param jobStorageMountConfigurationDetailsList the value to set
         * @return this builder
         **/
        public Builder jobStorageMountConfigurationDetailsList(
                java.util.List<StorageMountConfigurationDetails>
                        jobStorageMountConfigurationDetailsList) {
            this.jobStorageMountConfigurationDetailsList = jobStorageMountConfigurationDetailsList;
            this.__explicitlySet__.add("jobStorageMountConfigurationDetailsList");
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

        public CreateJobDetails build() {
            CreateJobDetails model =
                    new CreateJobDetails(
                            this.projectId,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.jobConfigurationDetails,
                            this.jobInfrastructureConfigurationDetails,
                            this.jobEnvironmentConfigurationDetails,
                            this.jobLogConfigurationDetails,
                            this.jobStorageMountConfigurationDetailsList,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobDetails model) {
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("jobConfigurationDetails")) {
                this.jobConfigurationDetails(model.getJobConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("jobInfrastructureConfigurationDetails")) {
                this.jobInfrastructureConfigurationDetails(
                        model.getJobInfrastructureConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("jobEnvironmentConfigurationDetails")) {
                this.jobEnvironmentConfigurationDetails(
                        model.getJobEnvironmentConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("jobLogConfigurationDetails")) {
                this.jobLogConfigurationDetails(model.getJobLogConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("jobStorageMountConfigurationDetailsList")) {
                this.jobStorageMountConfigurationDetailsList(
                        model.getJobStorageMountConfigurationDetailsList());
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
     * A short description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the job.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationDetails")
    private final JobConfigurationDetails jobConfigurationDetails;

    public JobConfigurationDetails getJobConfigurationDetails() {
        return jobConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobInfrastructureConfigurationDetails")
    private final JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails;

    public JobInfrastructureConfigurationDetails getJobInfrastructureConfigurationDetails() {
        return jobInfrastructureConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobEnvironmentConfigurationDetails")
    private final JobEnvironmentConfigurationDetails jobEnvironmentConfigurationDetails;

    public JobEnvironmentConfigurationDetails getJobEnvironmentConfigurationDetails() {
        return jobEnvironmentConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobLogConfigurationDetails")
    private final JobLogConfigurationDetails jobLogConfigurationDetails;

    public JobLogConfigurationDetails getJobLogConfigurationDetails() {
        return jobLogConfigurationDetails;
    }

    /**
     * Collection of JobStorageMountConfigurationDetails.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobStorageMountConfigurationDetailsList")
    private final java.util.List<StorageMountConfigurationDetails>
            jobStorageMountConfigurationDetailsList;

    /**
     * Collection of JobStorageMountConfigurationDetails.
     * @return the value
     **/
    public java.util.List<StorageMountConfigurationDetails>
            getJobStorageMountConfigurationDetailsList() {
        return jobStorageMountConfigurationDetailsList;
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
        sb.append("CreateJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", jobConfigurationDetails=")
                .append(String.valueOf(this.jobConfigurationDetails));
        sb.append(", jobInfrastructureConfigurationDetails=")
                .append(String.valueOf(this.jobInfrastructureConfigurationDetails));
        sb.append(", jobEnvironmentConfigurationDetails=")
                .append(String.valueOf(this.jobEnvironmentConfigurationDetails));
        sb.append(", jobLogConfigurationDetails=")
                .append(String.valueOf(this.jobLogConfigurationDetails));
        sb.append(", jobStorageMountConfigurationDetailsList=")
                .append(String.valueOf(this.jobStorageMountConfigurationDetailsList));
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
        if (!(o instanceof CreateJobDetails)) {
            return false;
        }

        CreateJobDetails other = (CreateJobDetails) o;
        return java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.jobConfigurationDetails, other.jobConfigurationDetails)
                && java.util.Objects.equals(
                        this.jobInfrastructureConfigurationDetails,
                        other.jobInfrastructureConfigurationDetails)
                && java.util.Objects.equals(
                        this.jobEnvironmentConfigurationDetails,
                        other.jobEnvironmentConfigurationDetails)
                && java.util.Objects.equals(
                        this.jobLogConfigurationDetails, other.jobLogConfigurationDetails)
                && java.util.Objects.equals(
                        this.jobStorageMountConfigurationDetailsList,
                        other.jobStorageMountConfigurationDetailsList)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.jobConfigurationDetails == null
                                ? 43
                                : this.jobConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.jobInfrastructureConfigurationDetails == null
                                ? 43
                                : this.jobInfrastructureConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.jobEnvironmentConfigurationDetails == null
                                ? 43
                                : this.jobEnvironmentConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.jobLogConfigurationDetails == null
                                ? 43
                                : this.jobLogConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.jobStorageMountConfigurationDetailsList == null
                                ? 43
                                : this.jobStorageMountConfigurationDetailsList.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
