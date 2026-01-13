/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Reference to Data Science Model Deployment <br>
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
        builder = DataScienceModelDeploymentInstanceComponent.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataScienceModelDeploymentInstanceComponent extends InstanceComponent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }
        /**
         * Name of online prediction use-case (defined in ML Application) for which this Model
         * Deployment serves predictions
         */
        @com.fasterxml.jackson.annotation.JsonProperty("predictionUseCaseName")
        private String predictionUseCaseName;

        /**
         * Name of online prediction use-case (defined in ML Application) for which this Model
         * Deployment serves predictions
         *
         * @param predictionUseCaseName the value to set
         * @return this builder
         */
        public Builder predictionUseCaseName(String predictionUseCaseName) {
            this.predictionUseCaseName = predictionUseCaseName;
            this.__explicitlySet__.add("predictionUseCaseName");
            return this;
        }
        /** OCID of Data Science Model Deployment */
        @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentId")
        private String modelDeploymentId;

        /**
         * OCID of Data Science Model Deployment
         *
         * @param modelDeploymentId the value to set
         * @return this builder
         */
        public Builder modelDeploymentId(String modelDeploymentId) {
            this.modelDeploymentId = modelDeploymentId;
            this.__explicitlySet__.add("modelDeploymentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataScienceModelDeploymentInstanceComponent build() {
            DataScienceModelDeploymentInstanceComponent model =
                    new DataScienceModelDeploymentInstanceComponent(
                            this.name,
                            this.componentName,
                            this.predictionUseCaseName,
                            this.modelDeploymentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataScienceModelDeploymentInstanceComponent model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("predictionUseCaseName")) {
                this.predictionUseCaseName(model.getPredictionUseCaseName());
            }
            if (model.wasPropertyExplicitlySet("modelDeploymentId")) {
                this.modelDeploymentId(model.getModelDeploymentId());
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
    public DataScienceModelDeploymentInstanceComponent(
            String name,
            String componentName,
            String predictionUseCaseName,
            String modelDeploymentId) {
        super(name, componentName);
        this.predictionUseCaseName = predictionUseCaseName;
        this.modelDeploymentId = modelDeploymentId;
    }

    /**
     * Name of online prediction use-case (defined in ML Application) for which this Model
     * Deployment serves predictions
     */
    @com.fasterxml.jackson.annotation.JsonProperty("predictionUseCaseName")
    private final String predictionUseCaseName;

    /**
     * Name of online prediction use-case (defined in ML Application) for which this Model
     * Deployment serves predictions
     *
     * @return the value
     */
    public String getPredictionUseCaseName() {
        return predictionUseCaseName;
    }

    /** OCID of Data Science Model Deployment */
    @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentId")
    private final String modelDeploymentId;

    /**
     * OCID of Data Science Model Deployment
     *
     * @return the value
     */
    public String getModelDeploymentId() {
        return modelDeploymentId;
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
        sb.append("DataScienceModelDeploymentInstanceComponent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", predictionUseCaseName=").append(String.valueOf(this.predictionUseCaseName));
        sb.append(", modelDeploymentId=").append(String.valueOf(this.modelDeploymentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataScienceModelDeploymentInstanceComponent)) {
            return false;
        }

        DataScienceModelDeploymentInstanceComponent other =
                (DataScienceModelDeploymentInstanceComponent) o;
        return java.util.Objects.equals(this.predictionUseCaseName, other.predictionUseCaseName)
                && java.util.Objects.equals(this.modelDeploymentId, other.modelDeploymentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.predictionUseCaseName == null
                                ? 43
                                : this.predictionUseCaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.modelDeploymentId == null ? 43 : this.modelDeploymentId.hashCode());
        return result;
    }
}
