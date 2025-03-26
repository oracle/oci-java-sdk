/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The metadata about the model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModelSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModelSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "modelType",
        "modelVersion",
        "projectId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "precision",
        "tenancyId",
        "aliasName",
        "trainingDataset",
        "testingDataset",
        "validationDataset",
        "componentModels",
        "isComposedModel",
        "freeformTags",
        "definedTags",
        "systemTags",
        "locks"
    })
    public ModelSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            Model.ModelType modelType,
            String modelVersion,
            String projectId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Model.LifecycleState lifecycleState,
            String lifecycleDetails,
            Float precision,
            String tenancyId,
            String aliasName,
            Dataset trainingDataset,
            Dataset testingDataset,
            Dataset validationDataset,
            java.util.List<ComponentModel> componentModels,
            Boolean isComposedModel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<ResourceLock> locks) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.projectId = projectId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.precision = precision;
        this.tenancyId = tenancyId;
        this.aliasName = aliasName;
        this.trainingDataset = trainingDataset;
        this.testingDataset = testingDataset;
        this.validationDataset = validationDataset;
        this.componentModels = componentModels;
        this.isComposedModel = isComposedModel;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique identifier that is immutable after creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier that is immutable after creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A human-friendly name for the model, which can be changed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A human-friendly name for the model, which can be changed.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * An optional description of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of the model.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The compartment identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment identifier.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The type of the Document model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private Model.ModelType modelType;

        /**
         * The type of the Document model.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(Model.ModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The version of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The version of the model.
         * @param modelVersion the value to set
         * @return this builder
         **/
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project that contains the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project that contains the model.
         * @param projectId the value to set
         * @return this builder
         **/
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * When the model was created, as an RFC3339 datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * When the model was created, as an RFC3339 datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * When the model was modified, as an RFC3339 datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * When the model was modified, as an RFC3339 datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Model.LifecycleState lifecycleState;

        /**
         * The current state of the model.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(Model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail, that can provide actionable information if training failed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail, that can provide actionable information if training failed.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The precision of the trained model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Float precision;

        /**
         * The precision of the trained model.
         * @param precision the value to set
         * @return this builder
         **/
        public Builder precision(Float precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }
        /**
         * The tenancy id of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The tenancy id of the model.
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * the alias name of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
        private String aliasName;

        /**
         * the alias name of the model.
         * @param aliasName the value to set
         * @return this builder
         **/
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            this.__explicitlySet__.add("aliasName");
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) list of active custom Key Value models that need to be composed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("componentModels")
        private java.util.List<ComponentModel> componentModels;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) list of active custom Key Value models that need to be composed.
         * @param componentModels the value to set
         * @return this builder
         **/
        public Builder componentModels(java.util.List<ComponentModel> componentModels) {
            this.componentModels = componentModels;
            this.__explicitlySet__.add("componentModels");
            return this;
        }
        /**
         * Set to true when the model is created by using multiple key value extraction models.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isComposedModel")
        private Boolean isComposedModel;

        /**
         * Set to true when the model is created by using multiple key value extraction models.
         * @param isComposedModel the value to set
         * @return this builder
         **/
        public Builder isComposedModel(Boolean isComposedModel) {
            this.isComposedModel = isComposedModel;
            this.__explicitlySet__.add("isComposedModel");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
         * For example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
         * For example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * For example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * For example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Locks associated with this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         * @param locks the value to set
         * @return this builder
         **/
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelSummary build() {
            ModelSummary model =
                    new ModelSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.modelType,
                            this.modelVersion,
                            this.projectId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.precision,
                            this.tenancyId,
                            this.aliasName,
                            this.trainingDataset,
                            this.testingDataset,
                            this.validationDataset,
                            this.componentModels,
                            this.isComposedModel,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("precision")) {
                this.precision(model.getPrecision());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("aliasName")) {
                this.aliasName(model.getAliasName());
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
            if (model.wasPropertyExplicitlySet("isComposedModel")) {
                this.isComposedModel(model.getIsComposedModel());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
     * A unique identifier that is immutable after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier that is immutable after creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A human-friendly name for the model, which can be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A human-friendly name for the model, which can be changed.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * An optional description of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of the model.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The compartment identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment identifier.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The type of the Document model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final Model.ModelType modelType;

    /**
     * The type of the Document model.
     * @return the value
     **/
    public Model.ModelType getModelType() {
        return modelType;
    }

    /**
     * The version of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The version of the model.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project that contains the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project that contains the model.
     * @return the value
     **/
    public String getProjectId() {
        return projectId;
    }

    /**
     * When the model was created, as an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * When the model was created, as an RFC3339 datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * When the model was modified, as an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * When the model was modified, as an RFC3339 datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Model.LifecycleState lifecycleState;

    /**
     * The current state of the model.
     * @return the value
     **/
    public Model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail, that can provide actionable information if training failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail, that can provide actionable information if training failed.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The precision of the trained model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    private final Float precision;

    /**
     * The precision of the trained model.
     * @return the value
     **/
    public Float getPrecision() {
        return precision;
    }

    /**
     * The tenancy id of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The tenancy id of the model.
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * the alias name of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
    private final String aliasName;

    /**
     * the alias name of the model.
     * @return the value
     **/
    public String getAliasName() {
        return aliasName;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) list of active custom Key Value models that need to be composed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("componentModels")
    private final java.util.List<ComponentModel> componentModels;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) list of active custom Key Value models that need to be composed.
     * @return the value
     **/
    public java.util.List<ComponentModel> getComponentModels() {
        return componentModels;
    }

    /**
     * Set to true when the model is created by using multiple key value extraction models.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isComposedModel")
    private final Boolean isComposedModel;

    /**
     * Set to true when the model is created by using multiple key value extraction models.
     * @return the value
     **/
    public Boolean getIsComposedModel() {
        return isComposedModel;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
     * For example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
     * For example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * For example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * For example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Locks associated with this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     * @return the value
     **/
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("ModelSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", precision=").append(String.valueOf(this.precision));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", aliasName=").append(String.valueOf(this.aliasName));
        sb.append(", trainingDataset=").append(String.valueOf(this.trainingDataset));
        sb.append(", testingDataset=").append(String.valueOf(this.testingDataset));
        sb.append(", validationDataset=").append(String.valueOf(this.validationDataset));
        sb.append(", componentModels=").append(String.valueOf(this.componentModels));
        sb.append(", isComposedModel=").append(String.valueOf(this.isComposedModel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelSummary)) {
            return false;
        }

        ModelSummary other = (ModelSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.aliasName, other.aliasName)
                && java.util.Objects.equals(this.trainingDataset, other.trainingDataset)
                && java.util.Objects.equals(this.testingDataset, other.testingDataset)
                && java.util.Objects.equals(this.validationDataset, other.validationDataset)
                && java.util.Objects.equals(this.componentModels, other.componentModels)
                && java.util.Objects.equals(this.isComposedModel, other.isComposedModel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.aliasName == null ? 43 : this.aliasName.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isComposedModel == null ? 43 : this.isComposedModel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
