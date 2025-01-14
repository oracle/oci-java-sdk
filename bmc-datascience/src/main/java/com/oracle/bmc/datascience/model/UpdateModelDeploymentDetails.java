/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details for updating a model deployment. You can update {@code
 * modelDeploymentConfigurationDetails} and change {@code instanceShapeName} and {@code modelId}
 * when the model deployment is in the ACTIVE lifecycle state. The {@code bandwidthMbps} or {@code
 * instanceCount} can only be updated while the model deployment is in the {@code INACTIVE} state.
 * Changes to the {@code bandwidthMbps} or {@code instanceCount} will take effect the next time the
 * {@code ActivateModelDeployment} action is invoked on the model deployment resource. <br>
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
        builder = UpdateModelDeploymentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateModelDeploymentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "modelDeploymentConfigurationDetails",
        "categoryLogDetails",
        "freeformTags",
        "definedTags"
    })
    public UpdateModelDeploymentDetails(
            String displayName,
            String description,
            UpdateModelDeploymentConfigurationDetails modelDeploymentConfigurationDetails,
            UpdateCategoryLogDetails categoryLogDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.modelDeploymentConfigurationDetails = modelDeploymentConfigurationDetails;
        this.categoryLogDetails = categoryLogDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name for the resource. Does not have to be unique, and can be
         * modified. Avoid entering confidential information. Example: {@code My ModelDeployment}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource. Does not have to be unique, and can be
         * modified. Avoid entering confidential information. Example: {@code My ModelDeployment}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A short description of the model deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the model deployment.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentConfigurationDetails")
        private UpdateModelDeploymentConfigurationDetails modelDeploymentConfigurationDetails;

        public Builder modelDeploymentConfigurationDetails(
                UpdateModelDeploymentConfigurationDetails modelDeploymentConfigurationDetails) {
            this.modelDeploymentConfigurationDetails = modelDeploymentConfigurationDetails;
            this.__explicitlySet__.add("modelDeploymentConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("categoryLogDetails")
        private UpdateCategoryLogDetails categoryLogDetails;

        public Builder categoryLogDetails(UpdateCategoryLogDetails categoryLogDetails) {
            this.categoryLogDetails = categoryLogDetails;
            this.__explicitlySet__.add("categoryLogDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
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
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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

        public UpdateModelDeploymentDetails build() {
            UpdateModelDeploymentDetails model =
                    new UpdateModelDeploymentDetails(
                            this.displayName,
                            this.description,
                            this.modelDeploymentConfigurationDetails,
                            this.categoryLogDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelDeploymentDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("modelDeploymentConfigurationDetails")) {
                this.modelDeploymentConfigurationDetails(
                        model.getModelDeploymentConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("categoryLogDetails")) {
                this.categoryLogDetails(model.getCategoryLogDetails());
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
     * A user-friendly display name for the resource. Does not have to be unique, and can be
     * modified. Avoid entering confidential information. Example: {@code My ModelDeployment}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource. Does not have to be unique, and can be
     * modified. Avoid entering confidential information. Example: {@code My ModelDeployment}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A short description of the model deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the model deployment.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentConfigurationDetails")
    private final UpdateModelDeploymentConfigurationDetails modelDeploymentConfigurationDetails;

    public UpdateModelDeploymentConfigurationDetails getModelDeploymentConfigurationDetails() {
        return modelDeploymentConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("categoryLogDetails")
    private final UpdateCategoryLogDetails categoryLogDetails;

    public UpdateCategoryLogDetails getCategoryLogDetails() {
        return categoryLogDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
        sb.append("UpdateModelDeploymentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelDeploymentConfigurationDetails=")
                .append(String.valueOf(this.modelDeploymentConfigurationDetails));
        sb.append(", categoryLogDetails=").append(String.valueOf(this.categoryLogDetails));
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
        if (!(o instanceof UpdateModelDeploymentDetails)) {
            return false;
        }

        UpdateModelDeploymentDetails other = (UpdateModelDeploymentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.modelDeploymentConfigurationDetails,
                        other.modelDeploymentConfigurationDetails)
                && java.util.Objects.equals(this.categoryLogDetails, other.categoryLogDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
