/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The information about new Pipeline. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreatePipelineDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePipelineDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "projectId",
        "compartmentId",
        "displayName",
        "description",
        "configurationDetails",
        "logConfigurationDetails",
        "infrastructureConfigurationDetails",
        "storageMountConfigurationDetailsList",
        "parameters",
        "stepDetails",
        "freeformTags",
        "definedTags"
    })
    public CreatePipelineDetails(
            String projectId,
            String compartmentId,
            String displayName,
            String description,
            PipelineConfigurationDetails configurationDetails,
            PipelineLogConfigurationDetails logConfigurationDetails,
            PipelineInfrastructureConfigurationDetails infrastructureConfigurationDetails,
            java.util.List<StorageMountConfigurationDetails> storageMountConfigurationDetailsList,
            java.util.Map<String, String> parameters,
            java.util.List<PipelineStepDetails> stepDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.projectId = projectId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.configurationDetails = configurationDetails;
        this.logConfigurationDetails = logConfigurationDetails;
        this.infrastructureConfigurationDetails = infrastructureConfigurationDetails;
        this.storageMountConfigurationDetailsList = storageMountConfigurationDetailsList;
        this.parameters = parameters;
        this.stepDetails = stepDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * project to associate the pipeline with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * project to associate the pipeline with.
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment where you want to create the pipeline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment where you want to create the pipeline.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A user-friendly display name for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A short description of the pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the pipeline.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
        private PipelineConfigurationDetails configurationDetails;

        public Builder configurationDetails(PipelineConfigurationDetails configurationDetails) {
            this.configurationDetails = configurationDetails;
            this.__explicitlySet__.add("configurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logConfigurationDetails")
        private PipelineLogConfigurationDetails logConfigurationDetails;

        public Builder logConfigurationDetails(
                PipelineLogConfigurationDetails logConfigurationDetails) {
            this.logConfigurationDetails = logConfigurationDetails;
            this.__explicitlySet__.add("logConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureConfigurationDetails")
        private PipelineInfrastructureConfigurationDetails infrastructureConfigurationDetails;

        public Builder infrastructureConfigurationDetails(
                PipelineInfrastructureConfigurationDetails infrastructureConfigurationDetails) {
            this.infrastructureConfigurationDetails = infrastructureConfigurationDetails;
            this.__explicitlySet__.add("infrastructureConfigurationDetails");
            return this;
        }
        /** The storage mount details to mount to the instance running the pipeline step. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageMountConfigurationDetailsList")
        private java.util.List<StorageMountConfigurationDetails>
                storageMountConfigurationDetailsList;

        /**
         * The storage mount details to mount to the instance running the pipeline step.
         *
         * @param storageMountConfigurationDetailsList the value to set
         * @return this builder
         */
        public Builder storageMountConfigurationDetailsList(
                java.util.List<StorageMountConfigurationDetails>
                        storageMountConfigurationDetailsList) {
            this.storageMountConfigurationDetailsList = storageMountConfigurationDetailsList;
            this.__explicitlySet__.add("storageMountConfigurationDetailsList");
            return this;
        }
        /** Parameters used in the pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, String> parameters;

        /**
         * Parameters used in the pipeline.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /** Array of step details for each step. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepDetails")
        private java.util.List<PipelineStepDetails> stepDetails;

        /**
         * Array of step details for each step.
         *
         * @param stepDetails the value to set
         * @return this builder
         */
        public Builder stepDetails(java.util.List<PipelineStepDetails> stepDetails) {
            this.stepDetails = stepDetails;
            this.__explicitlySet__.add("stepDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePipelineDetails build() {
            CreatePipelineDetails model =
                    new CreatePipelineDetails(
                            this.projectId,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.configurationDetails,
                            this.logConfigurationDetails,
                            this.infrastructureConfigurationDetails,
                            this.storageMountConfigurationDetailsList,
                            this.parameters,
                            this.stepDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePipelineDetails model) {
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
            if (model.wasPropertyExplicitlySet("configurationDetails")) {
                this.configurationDetails(model.getConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("logConfigurationDetails")) {
                this.logConfigurationDetails(model.getLogConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("infrastructureConfigurationDetails")) {
                this.infrastructureConfigurationDetails(
                        model.getInfrastructureConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("storageMountConfigurationDetailsList")) {
                this.storageMountConfigurationDetailsList(
                        model.getStorageMountConfigurationDetailsList());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("stepDetails")) {
                this.stepDetails(model.getStepDetails());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * project to associate the pipeline with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * project to associate the pipeline with.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want to create the pipeline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want to create the pipeline.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A user-friendly display name for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A short description of the pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the pipeline.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
    private final PipelineConfigurationDetails configurationDetails;

    public PipelineConfigurationDetails getConfigurationDetails() {
        return configurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logConfigurationDetails")
    private final PipelineLogConfigurationDetails logConfigurationDetails;

    public PipelineLogConfigurationDetails getLogConfigurationDetails() {
        return logConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureConfigurationDetails")
    private final PipelineInfrastructureConfigurationDetails infrastructureConfigurationDetails;

    public PipelineInfrastructureConfigurationDetails getInfrastructureConfigurationDetails() {
        return infrastructureConfigurationDetails;
    }

    /** The storage mount details to mount to the instance running the pipeline step. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageMountConfigurationDetailsList")
    private final java.util.List<StorageMountConfigurationDetails>
            storageMountConfigurationDetailsList;

    /**
     * The storage mount details to mount to the instance running the pipeline step.
     *
     * @return the value
     */
    public java.util.List<StorageMountConfigurationDetails>
            getStorageMountConfigurationDetailsList() {
        return storageMountConfigurationDetailsList;
    }

    /** Parameters used in the pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, String> parameters;

    /**
     * Parameters used in the pipeline.
     *
     * @return the value
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /** Array of step details for each step. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepDetails")
    private final java.util.List<PipelineStepDetails> stepDetails;

    /**
     * Array of step details for each step.
     *
     * @return the value
     */
    public java.util.List<PipelineStepDetails> getStepDetails() {
        return stepDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreatePipelineDetails(");
        sb.append("super=").append(super.toString());
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", configurationDetails=").append(String.valueOf(this.configurationDetails));
        sb.append(", logConfigurationDetails=")
                .append(String.valueOf(this.logConfigurationDetails));
        sb.append(", infrastructureConfigurationDetails=")
                .append(String.valueOf(this.infrastructureConfigurationDetails));
        sb.append(", storageMountConfigurationDetailsList=")
                .append(String.valueOf(this.storageMountConfigurationDetailsList));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", stepDetails=").append(String.valueOf(this.stepDetails));
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
        if (!(o instanceof CreatePipelineDetails)) {
            return false;
        }

        CreatePipelineDetails other = (CreatePipelineDetails) o;
        return java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.configurationDetails, other.configurationDetails)
                && java.util.Objects.equals(
                        this.logConfigurationDetails, other.logConfigurationDetails)
                && java.util.Objects.equals(
                        this.infrastructureConfigurationDetails,
                        other.infrastructureConfigurationDetails)
                && java.util.Objects.equals(
                        this.storageMountConfigurationDetailsList,
                        other.storageMountConfigurationDetailsList)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.stepDetails, other.stepDetails)
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
                        + (this.configurationDetails == null
                                ? 43
                                : this.configurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.logConfigurationDetails == null
                                ? 43
                                : this.logConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureConfigurationDetails == null
                                ? 43
                                : this.infrastructureConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.storageMountConfigurationDetailsList == null
                                ? 43
                                : this.storageMountConfigurationDetailsList.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.stepDetails == null ? 43 : this.stepDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
