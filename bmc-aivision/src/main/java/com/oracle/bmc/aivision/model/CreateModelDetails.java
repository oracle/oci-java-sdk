/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Information needed to create a new model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateModelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateModelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private Model.ModelType modelType;

        public Builder modelType(Model.ModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isQuickMode")
        private Boolean isQuickMode;

        public Builder isQuickMode(Boolean isQuickMode) {
            this.isQuickMode = isQuickMode;
            this.__explicitlySet__.add("isQuickMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxTrainingDurationInHours")
        private Double maxTrainingDurationInHours;

        public Builder maxTrainingDurationInHours(Double maxTrainingDurationInHours) {
            this.maxTrainingDurationInHours = maxTrainingDurationInHours;
            this.__explicitlySet__.add("maxTrainingDurationInHours");
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

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
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

        public CreateModelDetails build() {
            CreateModelDetails __instance__ =
                    new CreateModelDetails(
                            displayName,
                            description,
                            modelVersion,
                            modelType,
                            compartmentId,
                            isQuickMode,
                            maxTrainingDurationInHours,
                            trainingDataset,
                            testingDataset,
                            validationDataset,
                            projectId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateModelDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .modelVersion(o.getModelVersion())
                            .modelType(o.getModelType())
                            .compartmentId(o.getCompartmentId())
                            .isQuickMode(o.getIsQuickMode())
                            .maxTrainingDurationInHours(o.getMaxTrainingDurationInHours())
                            .trainingDataset(o.getTrainingDataset())
                            .testingDataset(o.getTestingDataset())
                            .validationDataset(o.getValidationDataset())
                            .projectId(o.getProjectId())
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

    /**
     * Human-friendly name for the model, which can be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Optional description of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Model version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    /**
     * What type of Vision model this is.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    Model.ModelType modelType;

    /**
     * Compartment identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Set to true when experimenting with a new model type or dataset so model training is quick, with a predefined low number of passes through the training data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isQuickMode")
    Boolean isQuickMode;

    /**
     * Maximum model training duration in hours, expressed as a decimal fraction.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTrainingDurationInHours")
    Double maxTrainingDurationInHours;

    @com.fasterxml.jackson.annotation.JsonProperty("trainingDataset")
    Dataset trainingDataset;

    @com.fasterxml.jackson.annotation.JsonProperty("testingDataset")
    Dataset testingDataset;

    @com.fasterxml.jackson.annotation.JsonProperty("validationDataset")
    Dataset validationDataset;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project which contains the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    String projectId;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
