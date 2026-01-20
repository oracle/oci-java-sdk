/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The model group type deployment. <br>
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
        builder = ModelGroupDeploymentConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deploymentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelGroupDeploymentConfigurationDetails
        extends ModelDeploymentConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("modelGroupConfigurationDetails")
        private ModelGroupConfigurationDetails modelGroupConfigurationDetails;

        public Builder modelGroupConfigurationDetails(
                ModelGroupConfigurationDetails modelGroupConfigurationDetails) {
            this.modelGroupConfigurationDetails = modelGroupConfigurationDetails;
            this.__explicitlySet__.add("modelGroupConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureConfigurationDetails")
        private InfrastructureConfigurationDetails infrastructureConfigurationDetails;

        public Builder infrastructureConfigurationDetails(
                InfrastructureConfigurationDetails infrastructureConfigurationDetails) {
            this.infrastructureConfigurationDetails = infrastructureConfigurationDetails;
            this.__explicitlySet__.add("infrastructureConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("environmentConfigurationDetails")
        private ModelDeploymentEnvironmentConfigurationDetails environmentConfigurationDetails;

        public Builder environmentConfigurationDetails(
                ModelDeploymentEnvironmentConfigurationDetails environmentConfigurationDetails) {
            this.environmentConfigurationDetails = environmentConfigurationDetails;
            this.__explicitlySet__.add("environmentConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelGroupDeploymentConfigurationDetails build() {
            ModelGroupDeploymentConfigurationDetails model =
                    new ModelGroupDeploymentConfigurationDetails(
                            this.modelGroupConfigurationDetails,
                            this.infrastructureConfigurationDetails,
                            this.environmentConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelGroupDeploymentConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("modelGroupConfigurationDetails")) {
                this.modelGroupConfigurationDetails(model.getModelGroupConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("infrastructureConfigurationDetails")) {
                this.infrastructureConfigurationDetails(
                        model.getInfrastructureConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("environmentConfigurationDetails")) {
                this.environmentConfigurationDetails(model.getEnvironmentConfigurationDetails());
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

    @Deprecated
    public ModelGroupDeploymentConfigurationDetails(
            ModelGroupConfigurationDetails modelGroupConfigurationDetails,
            InfrastructureConfigurationDetails infrastructureConfigurationDetails,
            ModelDeploymentEnvironmentConfigurationDetails environmentConfigurationDetails) {
        super();
        this.modelGroupConfigurationDetails = modelGroupConfigurationDetails;
        this.infrastructureConfigurationDetails = infrastructureConfigurationDetails;
        this.environmentConfigurationDetails = environmentConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelGroupConfigurationDetails")
    private final ModelGroupConfigurationDetails modelGroupConfigurationDetails;

    public ModelGroupConfigurationDetails getModelGroupConfigurationDetails() {
        return modelGroupConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureConfigurationDetails")
    private final InfrastructureConfigurationDetails infrastructureConfigurationDetails;

    public InfrastructureConfigurationDetails getInfrastructureConfigurationDetails() {
        return infrastructureConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("environmentConfigurationDetails")
    private final ModelDeploymentEnvironmentConfigurationDetails environmentConfigurationDetails;

    public ModelDeploymentEnvironmentConfigurationDetails getEnvironmentConfigurationDetails() {
        return environmentConfigurationDetails;
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
        sb.append("ModelGroupDeploymentConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", modelGroupConfigurationDetails=")
                .append(String.valueOf(this.modelGroupConfigurationDetails));
        sb.append(", infrastructureConfigurationDetails=")
                .append(String.valueOf(this.infrastructureConfigurationDetails));
        sb.append(", environmentConfigurationDetails=")
                .append(String.valueOf(this.environmentConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelGroupDeploymentConfigurationDetails)) {
            return false;
        }

        ModelGroupDeploymentConfigurationDetails other =
                (ModelGroupDeploymentConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.modelGroupConfigurationDetails, other.modelGroupConfigurationDetails)
                && java.util.Objects.equals(
                        this.infrastructureConfigurationDetails,
                        other.infrastructureConfigurationDetails)
                && java.util.Objects.equals(
                        this.environmentConfigurationDetails, other.environmentConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.modelGroupConfigurationDetails == null
                                ? 43
                                : this.modelGroupConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureConfigurationDetails == null
                                ? 43
                                : this.infrastructureConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentConfigurationDetails == null
                                ? 43
                                : this.environmentConfigurationDetails.hashCode());
        return result;
    }
}
