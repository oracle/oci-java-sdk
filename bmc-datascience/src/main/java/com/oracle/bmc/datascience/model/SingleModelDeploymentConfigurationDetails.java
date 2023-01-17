/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The single model type deployment.
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
    builder = SingleModelDeploymentConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deploymentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SingleModelDeploymentConfigurationDetails
        extends ModelDeploymentConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("modelConfigurationDetails")
        private ModelConfigurationDetails modelConfigurationDetails;

        public Builder modelConfigurationDetails(
                ModelConfigurationDetails modelConfigurationDetails) {
            this.modelConfigurationDetails = modelConfigurationDetails;
            this.__explicitlySet__.add("modelConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SingleModelDeploymentConfigurationDetails build() {
            SingleModelDeploymentConfigurationDetails model =
                    new SingleModelDeploymentConfigurationDetails(this.modelConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SingleModelDeploymentConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("modelConfigurationDetails")) {
                this.modelConfigurationDetails(model.getModelConfigurationDetails());
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
    public SingleModelDeploymentConfigurationDetails(
            ModelConfigurationDetails modelConfigurationDetails) {
        super();
        this.modelConfigurationDetails = modelConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelConfigurationDetails")
    private final ModelConfigurationDetails modelConfigurationDetails;

    public ModelConfigurationDetails getModelConfigurationDetails() {
        return modelConfigurationDetails;
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
        sb.append("SingleModelDeploymentConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", modelConfigurationDetails=")
                .append(String.valueOf(this.modelConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SingleModelDeploymentConfigurationDetails)) {
            return false;
        }

        SingleModelDeploymentConfigurationDetails other =
                (SingleModelDeploymentConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.modelConfigurationDetails, other.modelConfigurationDetails)
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
        return result;
    }
}
