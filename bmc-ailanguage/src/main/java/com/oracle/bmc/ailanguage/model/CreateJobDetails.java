/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Job creation detail which will have documents on which language services need to run prediction along with output folder
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateJobDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "inputLocation",
        "inputConfiguration",
        "modelMetadataDetails",
        "outputLocation"
    })
    public CreateJobDetails(
            String displayName,
            String description,
            String compartmentId,
            InputLocation inputLocation,
            InputConfiguration inputConfiguration,
            java.util.List<ModelMetadataDetails> modelMetadataDetails,
            ObjectPrefixOutputLocation outputLocation) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.inputLocation = inputLocation;
        this.inputConfiguration = inputConfiguration;
        this.modelMetadataDetails = modelMetadataDetails;
        this.outputLocation = outputLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name for the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the job.
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

        @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
        private InputLocation inputLocation;

        public Builder inputLocation(InputLocation inputLocation) {
            this.inputLocation = inputLocation;
            this.__explicitlySet__.add("inputLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputConfiguration")
        private InputConfiguration inputConfiguration;

        public Builder inputConfiguration(InputConfiguration inputConfiguration) {
            this.inputConfiguration = inputConfiguration;
            this.__explicitlySet__.add("inputConfiguration");
            return this;
        }
        /**
         * training model details
         * For this release only one model is allowed to be input here.
         * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelMetadataDetails")
        private java.util.List<ModelMetadataDetails> modelMetadataDetails;

        /**
         * training model details
         * For this release only one model is allowed to be input here.
         * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
         *
         * @param modelMetadataDetails the value to set
         * @return this builder
         **/
        public Builder modelMetadataDetails(
                java.util.List<ModelMetadataDetails> modelMetadataDetails) {
            this.modelMetadataDetails = modelMetadataDetails;
            this.__explicitlySet__.add("modelMetadataDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
        private ObjectPrefixOutputLocation outputLocation;

        public Builder outputLocation(ObjectPrefixOutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            this.__explicitlySet__.add("outputLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateJobDetails build() {
            CreateJobDetails model =
                    new CreateJobDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.inputLocation,
                            this.inputConfiguration,
                            this.modelMetadataDetails,
                            this.outputLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("inputLocation")) {
                this.inputLocation(model.getInputLocation());
            }
            if (model.wasPropertyExplicitlySet("inputConfiguration")) {
                this.inputConfiguration(model.getInputConfiguration());
            }
            if (model.wasPropertyExplicitlySet("modelMetadataDetails")) {
                this.modelMetadataDetails(model.getModelMetadataDetails());
            }
            if (model.wasPropertyExplicitlySet("outputLocation")) {
                this.outputLocation(model.getOutputLocation());
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
     * A user-friendly display name for the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the job.
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

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    private final InputLocation inputLocation;

    public InputLocation getInputLocation() {
        return inputLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputConfiguration")
    private final InputConfiguration inputConfiguration;

    public InputConfiguration getInputConfiguration() {
        return inputConfiguration;
    }

    /**
     * training model details
     * For this release only one model is allowed to be input here.
     * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelMetadataDetails")
    private final java.util.List<ModelMetadataDetails> modelMetadataDetails;

    /**
     * training model details
     * For this release only one model is allowed to be input here.
     * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
     *
     * @return the value
     **/
    public java.util.List<ModelMetadataDetails> getModelMetadataDetails() {
        return modelMetadataDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final ObjectPrefixOutputLocation outputLocation;

    public ObjectPrefixOutputLocation getOutputLocation() {
        return outputLocation;
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
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", inputLocation=").append(String.valueOf(this.inputLocation));
        sb.append(", inputConfiguration=").append(String.valueOf(this.inputConfiguration));
        sb.append(", modelMetadataDetails=").append(String.valueOf(this.modelMetadataDetails));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
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
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.inputLocation, other.inputLocation)
                && java.util.Objects.equals(this.inputConfiguration, other.inputConfiguration)
                && java.util.Objects.equals(this.modelMetadataDetails, other.modelMetadataDetails)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.inputLocation == null ? 43 : this.inputLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.inputConfiguration == null
                                ? 43
                                : this.inputConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.modelMetadataDetails == null
                                ? 43
                                : this.modelMetadataDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.outputLocation == null ? 43 : this.outputLocation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
