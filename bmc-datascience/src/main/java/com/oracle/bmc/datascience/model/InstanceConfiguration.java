/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The model deployment instance configuration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class InstanceConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceShapeName",
        "modelDeploymentInstanceShapeConfigDetails"
    })
    public InstanceConfiguration(
            String instanceShapeName,
            ModelDeploymentInstanceShapeConfigDetails modelDeploymentInstanceShapeConfigDetails) {
        super();
        this.instanceShapeName = instanceShapeName;
        this.modelDeploymentInstanceShapeConfigDetails = modelDeploymentInstanceShapeConfigDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The shape used to launch the model deployment instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeName")
        private String instanceShapeName;

        /**
         * The shape used to launch the model deployment instances.
         *
         * @param instanceShapeName the value to set
         * @return this builder
         */
        public Builder instanceShapeName(String instanceShapeName) {
            this.instanceShapeName = instanceShapeName;
            this.__explicitlySet__.add("instanceShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentInstanceShapeConfigDetails")
        private ModelDeploymentInstanceShapeConfigDetails modelDeploymentInstanceShapeConfigDetails;

        public Builder modelDeploymentInstanceShapeConfigDetails(
                ModelDeploymentInstanceShapeConfigDetails
                        modelDeploymentInstanceShapeConfigDetails) {
            this.modelDeploymentInstanceShapeConfigDetails =
                    modelDeploymentInstanceShapeConfigDetails;
            this.__explicitlySet__.add("modelDeploymentInstanceShapeConfigDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfiguration build() {
            InstanceConfiguration model =
                    new InstanceConfiguration(
                            this.instanceShapeName, this.modelDeploymentInstanceShapeConfigDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfiguration model) {
            if (model.wasPropertyExplicitlySet("instanceShapeName")) {
                this.instanceShapeName(model.getInstanceShapeName());
            }
            if (model.wasPropertyExplicitlySet("modelDeploymentInstanceShapeConfigDetails")) {
                this.modelDeploymentInstanceShapeConfigDetails(
                        model.getModelDeploymentInstanceShapeConfigDetails());
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

    /** The shape used to launch the model deployment instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeName")
    private final String instanceShapeName;

    /**
     * The shape used to launch the model deployment instances.
     *
     * @return the value
     */
    public String getInstanceShapeName() {
        return instanceShapeName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentInstanceShapeConfigDetails")
    private final ModelDeploymentInstanceShapeConfigDetails
            modelDeploymentInstanceShapeConfigDetails;

    public ModelDeploymentInstanceShapeConfigDetails
            getModelDeploymentInstanceShapeConfigDetails() {
        return modelDeploymentInstanceShapeConfigDetails;
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
        sb.append("InstanceConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("instanceShapeName=").append(String.valueOf(this.instanceShapeName));
        sb.append(", modelDeploymentInstanceShapeConfigDetails=")
                .append(String.valueOf(this.modelDeploymentInstanceShapeConfigDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfiguration)) {
            return false;
        }

        InstanceConfiguration other = (InstanceConfiguration) o;
        return java.util.Objects.equals(this.instanceShapeName, other.instanceShapeName)
                && java.util.Objects.equals(
                        this.modelDeploymentInstanceShapeConfigDetails,
                        other.modelDeploymentInstanceShapeConfigDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.instanceShapeName == null ? 43 : this.instanceShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.modelDeploymentInstanceShapeConfigDetails == null
                                ? 43
                                : this.modelDeploymentInstanceShapeConfigDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
