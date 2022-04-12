/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Machine-learned Model.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Model.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Model {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private ModelType modelType;

        public Builder modelType(ModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("trainedDurationInHours")
        private Double trainedDurationInHours;

        public Builder trainedDurationInHours(Double trainedDurationInHours) {
            this.trainedDurationInHours = trainedDurationInHours;
            this.__explicitlySet__.add("trainedDurationInHours");
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

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Float precision;

        public Builder precision(Float precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recall")
        private Float recall;

        public Builder recall(Float recall) {
            this.recall = recall;
            this.__explicitlySet__.add("recall");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("averagePrecision")
        private Float averagePrecision;

        public Builder averagePrecision(Float averagePrecision) {
            this.averagePrecision = averagePrecision;
            this.__explicitlySet__.add("averagePrecision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidenceThreshold")
        private Float confidenceThreshold;

        public Builder confidenceThreshold(Float confidenceThreshold) {
            this.confidenceThreshold = confidenceThreshold;
            this.__explicitlySet__.add("confidenceThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalImageCount")
        private Integer totalImageCount;

        public Builder totalImageCount(Integer totalImageCount) {
            this.totalImageCount = totalImageCount;
            this.__explicitlySet__.add("totalImageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("testImageCount")
        private Integer testImageCount;

        public Builder testImageCount(Integer testImageCount) {
            this.testImageCount = testImageCount;
            this.__explicitlySet__.add("testImageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private String metrics;

        public Builder metrics(String metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Model build() {
            Model __instance__ =
                    new Model(
                            id,
                            displayName,
                            description,
                            compartmentId,
                            modelType,
                            isQuickMode,
                            maxTrainingDurationInHours,
                            trainedDurationInHours,
                            trainingDataset,
                            testingDataset,
                            validationDataset,
                            modelVersion,
                            projectId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            precision,
                            recall,
                            averagePrecision,
                            confidenceThreshold,
                            totalImageCount,
                            testImageCount,
                            metrics,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Model o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .modelType(o.getModelType())
                            .isQuickMode(o.getIsQuickMode())
                            .maxTrainingDurationInHours(o.getMaxTrainingDurationInHours())
                            .trainedDurationInHours(o.getTrainedDurationInHours())
                            .trainingDataset(o.getTrainingDataset())
                            .testingDataset(o.getTestingDataset())
                            .validationDataset(o.getValidationDataset())
                            .modelVersion(o.getModelVersion())
                            .projectId(o.getProjectId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .precision(o.getPrecision())
                            .recall(o.getRecall())
                            .averagePrecision(o.getAveragePrecision())
                            .confidenceThreshold(o.getConfidenceThreshold())
                            .totalImageCount(o.getTotalImageCount())
                            .testImageCount(o.getTestImageCount())
                            .metrics(o.getMetrics())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * A unique identifier that is immutable after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * A human-friendly name for the model, which can be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * An optional description of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The compartment identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;
    /**
     * What type of Vision model this is.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ModelType {
        ImageClassification("IMAGE_CLASSIFICATION"),
        ObjectDetection("OBJECT_DETECTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * What type of Vision model this is.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    ModelType modelType;

    /**
     * Set to true when experimenting with a new model type or dataset, so model training is quick, with a predefined low number of passes through the training data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isQuickMode")
    Boolean isQuickMode;

    /**
     * The maximum model training duration in hours, expressed as a decimal fraction.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTrainingDurationInHours")
    Double maxTrainingDurationInHours;

    /**
     * The total hours actually used for model training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainedDurationInHours")
    Double trainedDurationInHours;

    @com.fasterxml.jackson.annotation.JsonProperty("trainingDataset")
    Dataset trainingDataset;

    @com.fasterxml.jackson.annotation.JsonProperty("testingDataset")
    Dataset testingDataset;

    @com.fasterxml.jackson.annotation.JsonProperty("validationDataset")
    Dataset validationDataset;

    /**
     * The version of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project that contains the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    String projectId;

    /**
     * When the model was created, as an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * When the model was updated, as an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
    /**
     * The current state of the model.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * A message describing the current state in more detail, that can provide actionable information if training failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The precision of the trained model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    Float precision;

    /**
     * Recall of the trained model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recall")
    Float recall;

    /**
     * The mean average precision of the trained model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("averagePrecision")
    Float averagePrecision;

    /**
     * The intersection over the union threshold used for calculating precision and recall.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidenceThreshold")
    Float confidenceThreshold;

    /**
     * The number of images in the dataset used to train, validate, and test the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalImageCount")
    Integer totalImageCount;

    /**
     * The number of images set aside for evaluating model performance metrics after training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testImageCount")
    Integer testImageCount;

    /**
     * The complete set of per-label metrics for successfully trained models.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    String metrics;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
     * For example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * For example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
