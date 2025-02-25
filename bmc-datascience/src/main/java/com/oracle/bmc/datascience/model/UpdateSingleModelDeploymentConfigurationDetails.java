/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The single model type deployment for update.
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
    builder = UpdateSingleModelDeploymentConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deploymentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateSingleModelDeploymentConfigurationDetails
        extends UpdateModelDeploymentConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("modelConfigurationDetails")
        private UpdateModelConfigurationDetails modelConfigurationDetails;

        public Builder modelConfigurationDetails(
                UpdateModelConfigurationDetails modelConfigurationDetails) {
            this.modelConfigurationDetails = modelConfigurationDetails;
            this.__explicitlySet__.add("modelConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("environmentConfigurationDetails")
        private UpdateModelDeploymentEnvironmentConfigurationDetails
                environmentConfigurationDetails;

        public Builder environmentConfigurationDetails(
                UpdateModelDeploymentEnvironmentConfigurationDetails
                        environmentConfigurationDetails) {
            this.environmentConfigurationDetails = environmentConfigurationDetails;
            this.__explicitlySet__.add("environmentConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSingleModelDeploymentConfigurationDetails build() {
            UpdateSingleModelDeploymentConfigurationDetails model =
                    new UpdateSingleModelDeploymentConfigurationDetails(
                            this.modelConfigurationDetails, this.environmentConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSingleModelDeploymentConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("modelConfigurationDetails")) {
                this.modelConfigurationDetails(model.getModelConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("environmentConfigurationDetails")) {
                this.environmentConfigurationDetails(model.getEnvironmentConfigurationDetails());
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

    @Deprecated
    public UpdateSingleModelDeploymentConfigurationDetails(
            UpdateModelConfigurationDetails modelConfigurationDetails,
            UpdateModelDeploymentEnvironmentConfigurationDetails environmentConfigurationDetails) {
        super();
        this.modelConfigurationDetails = modelConfigurationDetails;
        this.environmentConfigurationDetails = environmentConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelConfigurationDetails")
    private final UpdateModelConfigurationDetails modelConfigurationDetails;

    public UpdateModelConfigurationDetails getModelConfigurationDetails() {
        return modelConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("environmentConfigurationDetails")
    private final UpdateModelDeploymentEnvironmentConfigurationDetails
            environmentConfigurationDetails;

    public UpdateModelDeploymentEnvironmentConfigurationDetails
            getEnvironmentConfigurationDetails() {
        return environmentConfigurationDetails;
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
        sb.append("UpdateSingleModelDeploymentConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", modelConfigurationDetails=")
                .append(String.valueOf(this.modelConfigurationDetails));
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
        if (!(o instanceof UpdateSingleModelDeploymentConfigurationDetails)) {
            return false;
        }

        UpdateSingleModelDeploymentConfigurationDetails other =
                (UpdateSingleModelDeploymentConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.modelConfigurationDetails, other.modelConfigurationDetails)
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
                        + (this.modelConfigurationDetails == null
                                ? 43
                                : this.modelConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentConfigurationDetails == null
                                ? 43
                                : this.environmentConfigurationDetails.hashCode());
        return result;
    }
}
