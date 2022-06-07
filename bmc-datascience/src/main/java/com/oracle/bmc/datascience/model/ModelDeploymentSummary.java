/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Summary information for a model deployment.
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
    builder = ModelDeploymentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModelDeploymentSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "timeCreated",
        "displayName",
        "description",
        "projectId",
        "createdBy",
        "compartmentId",
        "modelDeploymentConfigurationDetails",
        "categoryLogDetails",
        "modelDeploymentUrl",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    public ModelDeploymentSummary(
            String id,
            java.util.Date timeCreated,
            String displayName,
            String description,
            String projectId,
            String createdBy,
            String compartmentId,
            ModelDeploymentConfigurationDetails modelDeploymentConfigurationDetails,
            CategoryLogDetails categoryLogDetails,
            String modelDeploymentUrl,
            ModelDeploymentLifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.timeCreated = timeCreated;
        this.displayName = displayName;
        this.description = description;
        this.projectId = projectId;
        this.createdBy = createdBy;
        this.compartmentId = compartmentId;
        this.modelDeploymentConfigurationDetails = modelDeploymentConfigurationDetails;
        this.categoryLogDetails = categoryLogDetails;
        this.modelDeploymentUrl = modelDeploymentUrl;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentConfigurationDetails")
        private ModelDeploymentConfigurationDetails modelDeploymentConfigurationDetails;

        public Builder modelDeploymentConfigurationDetails(
                ModelDeploymentConfigurationDetails modelDeploymentConfigurationDetails) {
            this.modelDeploymentConfigurationDetails = modelDeploymentConfigurationDetails;
            this.__explicitlySet__.add("modelDeploymentConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("categoryLogDetails")
        private CategoryLogDetails categoryLogDetails;

        public Builder categoryLogDetails(CategoryLogDetails categoryLogDetails) {
            this.categoryLogDetails = categoryLogDetails;
            this.__explicitlySet__.add("categoryLogDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentUrl")
        private String modelDeploymentUrl;

        public Builder modelDeploymentUrl(String modelDeploymentUrl) {
            this.modelDeploymentUrl = modelDeploymentUrl;
            this.__explicitlySet__.add("modelDeploymentUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ModelDeploymentLifecycleState lifecycleState;

        public Builder lifecycleState(ModelDeploymentLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public ModelDeploymentSummary build() {
            ModelDeploymentSummary __instance__ =
                    new ModelDeploymentSummary(
                            id,
                            timeCreated,
                            displayName,
                            description,
                            projectId,
                            createdBy,
                            compartmentId,
                            modelDeploymentConfigurationDetails,
                            categoryLogDetails,
                            modelDeploymentUrl,
                            lifecycleState,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDeploymentSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .timeCreated(o.getTimeCreated())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .projectId(o.getProjectId())
                            .createdBy(o.getCreatedBy())
                            .compartmentId(o.getCompartmentId())
                            .modelDeploymentConfigurationDetails(
                                    o.getModelDeploymentConfigurationDetails())
                            .categoryLogDetails(o.getCategoryLogDetails())
                            .modelDeploymentUrl(o.getModelDeploymentUrl())
                            .lifecycleState(o.getLifecycleState())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The date and time the resource was created, in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: 2019-08-25T21:10:29.41Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * A user-friendly display name for the resource. Does not have to be unique, and can be modified. Avoid entering confidential information.
     * Example: {@code My ModelDeployment}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * A short description of the model deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the model deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    public String getProjectId() {
        return projectId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the model deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model deployment's compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentConfigurationDetails")
    private final ModelDeploymentConfigurationDetails modelDeploymentConfigurationDetails;

    public ModelDeploymentConfigurationDetails getModelDeploymentConfigurationDetails() {
        return modelDeploymentConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("categoryLogDetails")
    private final CategoryLogDetails categoryLogDetails;

    public CategoryLogDetails getCategoryLogDetails() {
        return categoryLogDetails;
    }

    /**
     * The URL to interact with the model deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentUrl")
    private final String modelDeploymentUrl;

    public String getModelDeploymentUrl() {
        return modelDeploymentUrl;
    }

    /**
     * The state of the model deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ModelDeploymentLifecycleState lifecycleState;

    public ModelDeploymentLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

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

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModelDeploymentSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", modelDeploymentConfigurationDetails=")
                .append(String.valueOf(this.modelDeploymentConfigurationDetails));
        sb.append(", categoryLogDetails=").append(String.valueOf(this.categoryLogDetails));
        sb.append(", modelDeploymentUrl=").append(String.valueOf(this.modelDeploymentUrl));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDeploymentSummary)) {
            return false;
        }

        ModelDeploymentSummary other = (ModelDeploymentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.modelDeploymentConfigurationDetails,
                        other.modelDeploymentConfigurationDetails)
                && java.util.Objects.equals(this.categoryLogDetails, other.categoryLogDetails)
                && java.util.Objects.equals(this.modelDeploymentUrl, other.modelDeploymentUrl)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.modelDeploymentConfigurationDetails == null
                                ? 43
                                : this.modelDeploymentConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.categoryLogDetails == null
                                ? 43
                                : this.categoryLogDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.modelDeploymentUrl == null
                                ? 43
                                : this.modelDeploymentUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
