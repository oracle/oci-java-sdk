/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The information needed to create a new model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateModelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateModelDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "modelVersion",
        "modelType",
        "modelSubType",
        "inferenceUnits",
        "compartmentId",
        "isQuickMode",
        "maxTrainingTimeInHours",
        "language",
        "trainingDataset",
        "testingDataset",
        "validationDataset",
        "componentModels",
        "aliasName",
        "projectId",
        "freeformTags",
        "definedTags"
    })
    public CreateModelDetails(
            String displayName,
            String description,
            String modelVersion,
            Model.ModelType modelType,
            ModelSubType modelSubType,
            Integer inferenceUnits,
            String compartmentId,
            Boolean isQuickMode,
            Double maxTrainingTimeInHours,
            String language,
            Dataset trainingDataset,
            Dataset testingDataset,
            Dataset validationDataset,
            java.util.List<ComponentModel> componentModels,
            String aliasName,
            String projectId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.modelVersion = modelVersion;
        this.modelType = modelType;
        this.modelSubType = modelSubType;
        this.inferenceUnits = inferenceUnits;
        this.compartmentId = compartmentId;
        this.isQuickMode = isQuickMode;
        this.maxTrainingTimeInHours = maxTrainingTimeInHours;
        this.language = language;
        this.trainingDataset = trainingDataset;
        this.testingDataset = testingDataset;
        this.validationDataset = validationDataset;
        this.componentModels = componentModels;
        this.aliasName = aliasName;
        this.projectId = projectId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A human-friendly name for the model, which can be changed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A human-friendly name for the model, which can be changed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** An optional description of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of the model.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The model version */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version
         *
         * @param modelVersion the value to set
         * @return this builder
         */
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }
        /** The type of the Document model. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private Model.ModelType modelType;

        /**
         * The type of the Document model.
         *
         * @param modelType the value to set
         * @return this builder
         */
        public Builder modelType(Model.ModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * Applicable to only PRE_TRAINED_KEY_VALUE_EXTRACTION,
         * PRE_TRAINED_DOCUMENT_ELEMENTS_EXTRACTION.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modelSubType")
        private ModelSubType modelSubType;

        /**
         * Applicable to only PRE_TRAINED_KEY_VALUE_EXTRACTION,
         * PRE_TRAINED_DOCUMENT_ELEMENTS_EXTRACTION.
         *
         * @param modelSubType the value to set
         * @return this builder
         */
        public Builder modelSubType(ModelSubType modelSubType) {
            this.modelSubType = modelSubType;
            this.__explicitlySet__.add("modelSubType");
            return this;
        }
        /** Number of replicas required for this model. */
        @com.fasterxml.jackson.annotation.JsonProperty("inferenceUnits")
        private Integer inferenceUnits;

        /**
         * Number of replicas required for this model.
         *
         * @param inferenceUnits the value to set
         * @return this builder
         */
        public Builder inferenceUnits(Integer inferenceUnits) {
            this.inferenceUnits = inferenceUnits;
            this.__explicitlySet__.add("inferenceUnits");
            return this;
        }
        /** The compartment identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment identifier.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Set to true when experimenting with a new model type or dataset, so the model training is
         * quick, with a predefined low number of passes through the training data.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isQuickMode")
        private Boolean isQuickMode;

        /**
         * Set to true when experimenting with a new model type or dataset, so the model training is
         * quick, with a predefined low number of passes through the training data.
         *
         * @param isQuickMode the value to set
         * @return this builder
         */
        public Builder isQuickMode(Boolean isQuickMode) {
            this.isQuickMode = isQuickMode;
            this.__explicitlySet__.add("isQuickMode");
            return this;
        }
        /** The maximum model training time in hours, expressed as a decimal fraction. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTrainingTimeInHours")
        private Double maxTrainingTimeInHours;

        /**
         * The maximum model training time in hours, expressed as a decimal fraction.
         *
         * @param maxTrainingTimeInHours the value to set
         * @return this builder
         */
        public Builder maxTrainingTimeInHours(Double maxTrainingTimeInHours) {
            this.maxTrainingTimeInHours = maxTrainingTimeInHours;
            this.__explicitlySet__.add("maxTrainingTimeInHours");
            return this;
        }
        /** The document language for model training, abbreviated according to the BCP 47 syntax. */
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private String language;

        /**
         * The document language for model training, abbreviated according to the BCP 47 syntax.
         *
         * @param language the value to set
         * @return this builder
         */
        public Builder language(String language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainingDataset")
        private Dataset trainingDataset;

        public Builder trainingDataset(Dataset trainingDataset) {
            this.trainingDataset = trainingDataset;
            this.__explicitlySet__.add("trainingDataset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("testingDataset")
        private Dataset testingDataset;

        public Builder testingDataset(Dataset testingDataset) {
            this.testingDataset = testingDataset;
            this.__explicitlySet__.add("testingDataset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationDataset")
        private Dataset validationDataset;

        public Builder validationDataset(Dataset validationDataset) {
            this.validationDataset = validationDataset;
            this.__explicitlySet__.add("validationDataset");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) list of
         * active custom Key Value models that need to be composed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("componentModels")
        private java.util.List<ComponentModel> componentModels;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) list of
         * active custom Key Value models that need to be composed.
         *
         * @param componentModels the value to set
         * @return this builder
         */
        public Builder componentModels(java.util.List<ComponentModel> componentModels) {
            this.componentModels = componentModels;
            this.__explicitlySet__.add("componentModels");
            return this;
        }
        /** the alias name of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
        private String aliasName;

        /**
         * the alias name of the model.
         *
         * @param aliasName the value to set
         * @return this builder
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            this.__explicitlySet__.add("aliasName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * project that contains the model.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * project that contains the model.
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
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public CreateModelDetails build() {
            CreateModelDetails model =
                    new CreateModelDetails(
                            this.displayName,
                            this.description,
                            this.modelVersion,
                            this.modelType,
                            this.modelSubType,
                            this.inferenceUnits,
                            this.compartmentId,
                            this.isQuickMode,
                            this.maxTrainingTimeInHours,
                            this.language,
                            this.trainingDataset,
                            this.testingDataset,
                            this.validationDataset,
                            this.componentModels,
                            this.aliasName,
                            this.projectId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateModelDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("modelSubType")) {
                this.modelSubType(model.getModelSubType());
            }
            if (model.wasPropertyExplicitlySet("inferenceUnits")) {
                this.inferenceUnits(model.getInferenceUnits());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isQuickMode")) {
                this.isQuickMode(model.getIsQuickMode());
            }
            if (model.wasPropertyExplicitlySet("maxTrainingTimeInHours")) {
                this.maxTrainingTimeInHours(model.getMaxTrainingTimeInHours());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
            }
            if (model.wasPropertyExplicitlySet("trainingDataset")) {
                this.trainingDataset(model.getTrainingDataset());
            }
            if (model.wasPropertyExplicitlySet("testingDataset")) {
                this.testingDataset(model.getTestingDataset());
            }
            if (model.wasPropertyExplicitlySet("validationDataset")) {
                this.validationDataset(model.getValidationDataset());
            }
            if (model.wasPropertyExplicitlySet("componentModels")) {
                this.componentModels(model.getComponentModels());
            }
            if (model.wasPropertyExplicitlySet("aliasName")) {
                this.aliasName(model.getAliasName());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
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

    /** A human-friendly name for the model, which can be changed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A human-friendly name for the model, which can be changed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** An optional description of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of the model.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The model version */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /** The type of the Document model. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final Model.ModelType modelType;

    /**
     * The type of the Document model.
     *
     * @return the value
     */
    public Model.ModelType getModelType() {
        return modelType;
    }

    /**
     * Applicable to only PRE_TRAINED_KEY_VALUE_EXTRACTION,
     * PRE_TRAINED_DOCUMENT_ELEMENTS_EXTRACTION.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modelSubType")
    private final ModelSubType modelSubType;

    /**
     * Applicable to only PRE_TRAINED_KEY_VALUE_EXTRACTION,
     * PRE_TRAINED_DOCUMENT_ELEMENTS_EXTRACTION.
     *
     * @return the value
     */
    public ModelSubType getModelSubType() {
        return modelSubType;
    }

    /** Number of replicas required for this model. */
    @com.fasterxml.jackson.annotation.JsonProperty("inferenceUnits")
    private final Integer inferenceUnits;

    /**
     * Number of replicas required for this model.
     *
     * @return the value
     */
    public Integer getInferenceUnits() {
        return inferenceUnits;
    }

    /** The compartment identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment identifier.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Set to true when experimenting with a new model type or dataset, so the model training is
     * quick, with a predefined low number of passes through the training data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isQuickMode")
    private final Boolean isQuickMode;

    /**
     * Set to true when experimenting with a new model type or dataset, so the model training is
     * quick, with a predefined low number of passes through the training data.
     *
     * @return the value
     */
    public Boolean getIsQuickMode() {
        return isQuickMode;
    }

    /** The maximum model training time in hours, expressed as a decimal fraction. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTrainingTimeInHours")
    private final Double maxTrainingTimeInHours;

    /**
     * The maximum model training time in hours, expressed as a decimal fraction.
     *
     * @return the value
     */
    public Double getMaxTrainingTimeInHours() {
        return maxTrainingTimeInHours;
    }

    /** The document language for model training, abbreviated according to the BCP 47 syntax. */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final String language;

    /**
     * The document language for model training, abbreviated according to the BCP 47 syntax.
     *
     * @return the value
     */
    public String getLanguage() {
        return language;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("trainingDataset")
    private final Dataset trainingDataset;

    public Dataset getTrainingDataset() {
        return trainingDataset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("testingDataset")
    private final Dataset testingDataset;

    public Dataset getTestingDataset() {
        return testingDataset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validationDataset")
    private final Dataset validationDataset;

    public Dataset getValidationDataset() {
        return validationDataset;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) list of
     * active custom Key Value models that need to be composed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("componentModels")
    private final java.util.List<ComponentModel> componentModels;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) list of
     * active custom Key Value models that need to be composed.
     *
     * @return the value
     */
    public java.util.List<ComponentModel> getComponentModels() {
        return componentModels;
    }

    /** the alias name of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
    private final String aliasName;

    /**
     * the alias name of the model.
     *
     * @return the value
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * project that contains the model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * project that contains the model.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("CreateModelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelSubType=").append(String.valueOf(this.modelSubType));
        sb.append(", inferenceUnits=").append(String.valueOf(this.inferenceUnits));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isQuickMode=").append(String.valueOf(this.isQuickMode));
        sb.append(", maxTrainingTimeInHours=").append(String.valueOf(this.maxTrainingTimeInHours));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", trainingDataset=").append(String.valueOf(this.trainingDataset));
        sb.append(", testingDataset=").append(String.valueOf(this.testingDataset));
        sb.append(", validationDataset=").append(String.valueOf(this.validationDataset));
        sb.append(", componentModels=").append(String.valueOf(this.componentModels));
        sb.append(", aliasName=").append(String.valueOf(this.aliasName));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
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
        if (!(o instanceof CreateModelDetails)) {
            return false;
        }

        CreateModelDetails other = (CreateModelDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelSubType, other.modelSubType)
                && java.util.Objects.equals(this.inferenceUnits, other.inferenceUnits)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isQuickMode, other.isQuickMode)
                && java.util.Objects.equals(
                        this.maxTrainingTimeInHours, other.maxTrainingTimeInHours)
                && java.util.Objects.equals(this.language, other.language)
                && java.util.Objects.equals(this.trainingDataset, other.trainingDataset)
                && java.util.Objects.equals(this.testingDataset, other.testingDataset)
                && java.util.Objects.equals(this.validationDataset, other.validationDataset)
                && java.util.Objects.equals(this.componentModels, other.componentModels)
                && java.util.Objects.equals(this.aliasName, other.aliasName)
                && java.util.Objects.equals(this.projectId, other.projectId)
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
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelSubType == null ? 43 : this.modelSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.inferenceUnits == null ? 43 : this.inferenceUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.isQuickMode == null ? 43 : this.isQuickMode.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTrainingTimeInHours == null
                                ? 43
                                : this.maxTrainingTimeInHours.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result =
                (result * PRIME)
                        + (this.trainingDataset == null ? 43 : this.trainingDataset.hashCode());
        result =
                (result * PRIME)
                        + (this.testingDataset == null ? 43 : this.testingDataset.hashCode());
        result =
                (result * PRIME)
                        + (this.validationDataset == null ? 43 : this.validationDataset.hashCode());
        result =
                (result * PRIME)
                        + (this.componentModels == null ? 43 : this.componentModels.hashCode());
        result = (result * PRIME) + (this.aliasName == null ? 43 : this.aliasName.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
