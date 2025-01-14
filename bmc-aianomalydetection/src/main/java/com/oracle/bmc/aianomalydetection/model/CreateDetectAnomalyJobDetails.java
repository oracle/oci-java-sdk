/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Base class for the DetectAnomalies async call. It contains the identifier that is used for
 * deciding what type of request this is. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDetectAnomalyJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDetectAnomalyJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "description",
        "displayName",
        "modelId",
        "sensitivity",
        "areAllEstimatesRequired",
        "inputDetails",
        "outputDetails"
    })
    public CreateDetectAnomalyJobDetails(
            String compartmentId,
            String description,
            String displayName,
            String modelId,
            Float sensitivity,
            Boolean areAllEstimatesRequired,
            InputDetails inputDetails,
            OutputDetails outputDetails) {
        super();
        this.compartmentId = compartmentId;
        this.description = description;
        this.displayName = displayName;
        this.modelId = modelId;
        this.sensitivity = sensitivity;
        this.areAllEstimatesRequired = areAllEstimatesRequired;
        this.inputDetails = inputDetails;
        this.outputDetails = outputDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that starts the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that starts the job.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A short description of the detect anomaly job. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the detect anomaly job.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Detect anomaly job display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Detect anomaly job display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the trained model. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * The OCID of the trained model.
         *
         * @param modelId the value to set
         * @return this builder
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /** The value that customer can adjust to control the sensitivity of anomaly detection */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitivity")
        private Float sensitivity;

        /**
         * The value that customer can adjust to control the sensitivity of anomaly detection
         *
         * @param sensitivity the value to set
         * @return this builder
         */
        public Builder sensitivity(Float sensitivity) {
            this.sensitivity = sensitivity;
            this.__explicitlySet__.add("sensitivity");
            return this;
        }
        /**
         * Flag to enable the service to return estimates for all data points rather than just the
         * anomalous data points.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areAllEstimatesRequired")
        private Boolean areAllEstimatesRequired;

        /**
         * Flag to enable the service to return estimates for all data points rather than just the
         * anomalous data points.
         *
         * @param areAllEstimatesRequired the value to set
         * @return this builder
         */
        public Builder areAllEstimatesRequired(Boolean areAllEstimatesRequired) {
            this.areAllEstimatesRequired = areAllEstimatesRequired;
            this.__explicitlySet__.add("areAllEstimatesRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputDetails")
        private InputDetails inputDetails;

        public Builder inputDetails(InputDetails inputDetails) {
            this.inputDetails = inputDetails;
            this.__explicitlySet__.add("inputDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputDetails")
        private OutputDetails outputDetails;

        public Builder outputDetails(OutputDetails outputDetails) {
            this.outputDetails = outputDetails;
            this.__explicitlySet__.add("outputDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDetectAnomalyJobDetails build() {
            CreateDetectAnomalyJobDetails model =
                    new CreateDetectAnomalyJobDetails(
                            this.compartmentId,
                            this.description,
                            this.displayName,
                            this.modelId,
                            this.sensitivity,
                            this.areAllEstimatesRequired,
                            this.inputDetails,
                            this.outputDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDetectAnomalyJobDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("sensitivity")) {
                this.sensitivity(model.getSensitivity());
            }
            if (model.wasPropertyExplicitlySet("areAllEstimatesRequired")) {
                this.areAllEstimatesRequired(model.getAreAllEstimatesRequired());
            }
            if (model.wasPropertyExplicitlySet("inputDetails")) {
                this.inputDetails(model.getInputDetails());
            }
            if (model.wasPropertyExplicitlySet("outputDetails")) {
                this.outputDetails(model.getOutputDetails());
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

    /** The OCID of the compartment that starts the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that starts the job.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A short description of the detect anomaly job. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the detect anomaly job.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Detect anomaly job display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Detect anomaly job display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the trained model. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The OCID of the trained model.
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    /** The value that customer can adjust to control the sensitivity of anomaly detection */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitivity")
    private final Float sensitivity;

    /**
     * The value that customer can adjust to control the sensitivity of anomaly detection
     *
     * @return the value
     */
    public Float getSensitivity() {
        return sensitivity;
    }

    /**
     * Flag to enable the service to return estimates for all data points rather than just the
     * anomalous data points.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areAllEstimatesRequired")
    private final Boolean areAllEstimatesRequired;

    /**
     * Flag to enable the service to return estimates for all data points rather than just the
     * anomalous data points.
     *
     * @return the value
     */
    public Boolean getAreAllEstimatesRequired() {
        return areAllEstimatesRequired;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputDetails")
    private final InputDetails inputDetails;

    public InputDetails getInputDetails() {
        return inputDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputDetails")
    private final OutputDetails outputDetails;

    public OutputDetails getOutputDetails() {
        return outputDetails;
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
        sb.append("CreateDetectAnomalyJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", sensitivity=").append(String.valueOf(this.sensitivity));
        sb.append(", areAllEstimatesRequired=")
                .append(String.valueOf(this.areAllEstimatesRequired));
        sb.append(", inputDetails=").append(String.valueOf(this.inputDetails));
        sb.append(", outputDetails=").append(String.valueOf(this.outputDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDetectAnomalyJobDetails)) {
            return false;
        }

        CreateDetectAnomalyJobDetails other = (CreateDetectAnomalyJobDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.sensitivity, other.sensitivity)
                && java.util.Objects.equals(
                        this.areAllEstimatesRequired, other.areAllEstimatesRequired)
                && java.util.Objects.equals(this.inputDetails, other.inputDetails)
                && java.util.Objects.equals(this.outputDetails, other.outputDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.sensitivity == null ? 43 : this.sensitivity.hashCode());
        result =
                (result * PRIME)
                        + (this.areAllEstimatesRequired == null
                                ? 43
                                : this.areAllEstimatesRequired.hashCode());
        result = (result * PRIME) + (this.inputDetails == null ? 43 : this.inputDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.outputDetails == null ? 43 : this.outputDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
