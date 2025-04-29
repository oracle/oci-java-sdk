/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Summary of the model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModelSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "capabilities",
        "lifecycleState",
        "lifecycleDetails",
        "displayName",
        "vendor",
        "version",
        "timeCreated",
        "baseModelId",
        "type",
        "fineTuneDetails",
        "modelMetrics",
        "isLongTermSupported",
        "timeDeprecated",
        "timeOnDemandRetired",
        "timeDedicatedRetired",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ModelSummary(
            String id,
            String compartmentId,
            java.util.List<ModelCapability> capabilities,
            Model.LifecycleState lifecycleState,
            String lifecycleDetails,
            String displayName,
            String vendor,
            String version,
            java.util.Date timeCreated,
            String baseModelId,
            Model.Type type,
            FineTuneDetails fineTuneDetails,
            ModelMetrics modelMetrics,
            Boolean isLongTermSupported,
            java.util.Date timeDeprecated,
            java.util.Date timeOnDemandRetired,
            java.util.Date timeDedicatedRetired,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.capabilities = capabilities;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.displayName = displayName;
        this.vendor = vendor;
        this.version = version;
        this.timeCreated = timeCreated;
        this.baseModelId = baseModelId;
        this.type = type;
        this.fineTuneDetails = fineTuneDetails;
        this.modelMetrics = modelMetrics;
        this.isLongTermSupported = isLongTermSupported;
        this.timeDeprecated = timeDeprecated;
        this.timeOnDemandRetired = timeOnDemandRetired;
        this.timeDedicatedRetired = timeDedicatedRetired;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An ID that uniquely identifies a pretrained or a fine-tuned model. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * An ID that uniquely identifies a pretrained or a fine-tuned model.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The compartment OCID for fine-tuned models. For pretrained models, this value is null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID for fine-tuned models. For pretrained models, this value is null.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Describes what this model can be used for. */
        @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
        private java.util.List<ModelCapability> capabilities;

        /**
         * Describes what this model can be used for.
         *
         * @param capabilities the value to set
         * @return this builder
         */
        public Builder capabilities(java.util.List<ModelCapability> capabilities) {
            this.capabilities = capabilities;
            this.__explicitlySet__.add("capabilities");
            return this;
        }
        /**
         * The lifecycle state of the model.
         *
         * <p>Allowed values are: - ACTIVE - CREATING - DELETING - DELETED - FAILED
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Model.LifecycleState lifecycleState;

        /**
         * The lifecycle state of the model.
         *
         * <p>Allowed values are: - ACTIVE - CREATING - DELETING - DELETED - FAILED
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state of the model with detail that can provide
         * actionable information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state of the model with detail that can provide
         * actionable information.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** A user-friendly name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The provider of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        /**
         * The provider of the model.
         *
         * @param vendor the value to set
         * @return this builder
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }
        /** The version of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the model.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The date and time that the model was created in the format of an RFC3339 datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the model was created in the format of an RFC3339 datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The OCID of the base model that's used for fine-tuning. For pretrained models, the value
         * is null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baseModelId")
        private String baseModelId;

        /**
         * The OCID of the base model that's used for fine-tuning. For pretrained models, the value
         * is null.
         *
         * @param baseModelId the value to set
         * @return this builder
         */
        public Builder baseModelId(String baseModelId) {
            this.baseModelId = baseModelId;
            this.__explicitlySet__.add("baseModelId");
            return this;
        }
        /**
         * The model type indicating whether this is a pretrained/base model or a custom/fine-tuned
         * model.
         *
         * <p>Allowed values are: - BASE - CUSTOM
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Model.Type type;

        /**
         * The model type indicating whether this is a pretrained/base model or a custom/fine-tuned
         * model.
         *
         * <p>Allowed values are: - BASE - CUSTOM
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Model.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fineTuneDetails")
        private FineTuneDetails fineTuneDetails;

        public Builder fineTuneDetails(FineTuneDetails fineTuneDetails) {
            this.fineTuneDetails = fineTuneDetails;
            this.__explicitlySet__.add("fineTuneDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelMetrics")
        private ModelMetrics modelMetrics;

        public Builder modelMetrics(ModelMetrics modelMetrics) {
            this.modelMetrics = modelMetrics;
            this.__explicitlySet__.add("modelMetrics");
            return this;
        }
        /** Whether a model is supported long-term. Applies only to base models. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLongTermSupported")
        private Boolean isLongTermSupported;

        /**
         * Whether a model is supported long-term. Applies only to base models.
         *
         * @param isLongTermSupported the value to set
         * @return this builder
         */
        public Builder isLongTermSupported(Boolean isLongTermSupported) {
            this.isLongTermSupported = isLongTermSupported;
            this.__explicitlySet__.add("isLongTermSupported");
            return this;
        }
        /**
         * Corresponds to the time when the custom model and its associated foundation model will be
         * deprecated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeprecated")
        private java.util.Date timeDeprecated;

        /**
         * Corresponds to the time when the custom model and its associated foundation model will be
         * deprecated.
         *
         * @param timeDeprecated the value to set
         * @return this builder
         */
        public Builder timeDeprecated(java.util.Date timeDeprecated) {
            this.timeDeprecated = timeDeprecated;
            this.__explicitlySet__.add("timeDeprecated");
            return this;
        }
        /**
         * The timestamp indicating when the base model will no longer be available for on-demand
         * usage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOnDemandRetired")
        private java.util.Date timeOnDemandRetired;

        /**
         * The timestamp indicating when the base model will no longer be available for on-demand
         * usage.
         *
         * @param timeOnDemandRetired the value to set
         * @return this builder
         */
        public Builder timeOnDemandRetired(java.util.Date timeOnDemandRetired) {
            this.timeOnDemandRetired = timeOnDemandRetired;
            this.__explicitlySet__.add("timeOnDemandRetired");
            return this;
        }
        /**
         * The timestamp indicating when the custom model and its associated foundation model will
         * be fully retired.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDedicatedRetired")
        private java.util.Date timeDedicatedRetired;

        /**
         * The timestamp indicating when the custom model and its associated foundation model will
         * be fully retired.
         *
         * @param timeDedicatedRetired the value to set
         * @return this builder
         */
        public Builder timeDedicatedRetired(java.util.Date timeDedicatedRetired) {
            this.timeDedicatedRetired = timeDedicatedRetired;
            this.__explicitlySet__.add("timeDedicatedRetired");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelSummary build() {
            ModelSummary model =
                    new ModelSummary(
                            this.id,
                            this.compartmentId,
                            this.capabilities,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.displayName,
                            this.vendor,
                            this.version,
                            this.timeCreated,
                            this.baseModelId,
                            this.type,
                            this.fineTuneDetails,
                            this.modelMetrics,
                            this.isLongTermSupported,
                            this.timeDeprecated,
                            this.timeOnDemandRetired,
                            this.timeDedicatedRetired,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("capabilities")) {
                this.capabilities(model.getCapabilities());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("vendor")) {
                this.vendor(model.getVendor());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("baseModelId")) {
                this.baseModelId(model.getBaseModelId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("fineTuneDetails")) {
                this.fineTuneDetails(model.getFineTuneDetails());
            }
            if (model.wasPropertyExplicitlySet("modelMetrics")) {
                this.modelMetrics(model.getModelMetrics());
            }
            if (model.wasPropertyExplicitlySet("isLongTermSupported")) {
                this.isLongTermSupported(model.getIsLongTermSupported());
            }
            if (model.wasPropertyExplicitlySet("timeDeprecated")) {
                this.timeDeprecated(model.getTimeDeprecated());
            }
            if (model.wasPropertyExplicitlySet("timeOnDemandRetired")) {
                this.timeOnDemandRetired(model.getTimeOnDemandRetired());
            }
            if (model.wasPropertyExplicitlySet("timeDedicatedRetired")) {
                this.timeDedicatedRetired(model.getTimeDedicatedRetired());
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

    /** An ID that uniquely identifies a pretrained or a fine-tuned model. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * An ID that uniquely identifies a pretrained or a fine-tuned model.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The compartment OCID for fine-tuned models. For pretrained models, this value is null. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID for fine-tuned models. For pretrained models, this value is null.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Describes what this model can be used for. */
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    private final java.util.List<ModelCapability> capabilities;

    /**
     * Describes what this model can be used for.
     *
     * @return the value
     */
    public java.util.List<ModelCapability> getCapabilities() {
        return capabilities;
    }

    /**
     * The lifecycle state of the model.
     *
     * <p>Allowed values are: - ACTIVE - CREATING - DELETING - DELETED - FAILED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Model.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the model.
     *
     * <p>Allowed values are: - ACTIVE - CREATING - DELETING - DELETED - FAILED
     *
     * @return the value
     */
    public Model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state of the model with detail that can provide actionable
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state of the model with detail that can provide actionable
     * information.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** A user-friendly name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The provider of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

    /**
     * The provider of the model.
     *
     * @return the value
     */
    public String getVendor() {
        return vendor;
    }

    /** The version of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the model.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The date and time that the model was created in the format of an RFC3339 datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the model was created in the format of an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The OCID of the base model that's used for fine-tuning. For pretrained models, the value is
     * null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseModelId")
    private final String baseModelId;

    /**
     * The OCID of the base model that's used for fine-tuning. For pretrained models, the value is
     * null.
     *
     * @return the value
     */
    public String getBaseModelId() {
        return baseModelId;
    }

    /**
     * The model type indicating whether this is a pretrained/base model or a custom/fine-tuned
     * model.
     *
     * <p>Allowed values are: - BASE - CUSTOM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Model.Type type;

    /**
     * The model type indicating whether this is a pretrained/base model or a custom/fine-tuned
     * model.
     *
     * <p>Allowed values are: - BASE - CUSTOM
     *
     * @return the value
     */
    public Model.Type getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fineTuneDetails")
    private final FineTuneDetails fineTuneDetails;

    public FineTuneDetails getFineTuneDetails() {
        return fineTuneDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelMetrics")
    private final ModelMetrics modelMetrics;

    public ModelMetrics getModelMetrics() {
        return modelMetrics;
    }

    /** Whether a model is supported long-term. Applies only to base models. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLongTermSupported")
    private final Boolean isLongTermSupported;

    /**
     * Whether a model is supported long-term. Applies only to base models.
     *
     * @return the value
     */
    public Boolean getIsLongTermSupported() {
        return isLongTermSupported;
    }

    /**
     * Corresponds to the time when the custom model and its associated foundation model will be
     * deprecated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeprecated")
    private final java.util.Date timeDeprecated;

    /**
     * Corresponds to the time when the custom model and its associated foundation model will be
     * deprecated.
     *
     * @return the value
     */
    public java.util.Date getTimeDeprecated() {
        return timeDeprecated;
    }

    /**
     * The timestamp indicating when the base model will no longer be available for on-demand usage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOnDemandRetired")
    private final java.util.Date timeOnDemandRetired;

    /**
     * The timestamp indicating when the base model will no longer be available for on-demand usage.
     *
     * @return the value
     */
    public java.util.Date getTimeOnDemandRetired() {
        return timeOnDemandRetired;
    }

    /**
     * The timestamp indicating when the custom model and its associated foundation model will be
     * fully retired.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDedicatedRetired")
    private final java.util.Date timeDedicatedRetired;

    /**
     * The timestamp indicating when the custom model and its associated foundation model will be
     * fully retired.
     *
     * @return the value
     */
    public java.util.Date getTimeDedicatedRetired() {
        return timeDedicatedRetired;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ModelSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", capabilities=").append(String.valueOf(this.capabilities));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vendor=").append(String.valueOf(this.vendor));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", baseModelId=").append(String.valueOf(this.baseModelId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", fineTuneDetails=").append(String.valueOf(this.fineTuneDetails));
        sb.append(", modelMetrics=").append(String.valueOf(this.modelMetrics));
        sb.append(", isLongTermSupported=").append(String.valueOf(this.isLongTermSupported));
        sb.append(", timeDeprecated=").append(String.valueOf(this.timeDeprecated));
        sb.append(", timeOnDemandRetired=").append(String.valueOf(this.timeOnDemandRetired));
        sb.append(", timeDedicatedRetired=").append(String.valueOf(this.timeDedicatedRetired));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
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
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.capabilities, other.capabilities)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vendor, other.vendor)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.baseModelId, other.baseModelId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.fineTuneDetails, other.fineTuneDetails)
                && java.util.Objects.equals(this.modelMetrics, other.modelMetrics)
                && java.util.Objects.equals(this.isLongTermSupported, other.isLongTermSupported)
                && java.util.Objects.equals(this.timeDeprecated, other.timeDeprecated)
                && java.util.Objects.equals(this.timeOnDemandRetired, other.timeOnDemandRetired)
                && java.util.Objects.equals(this.timeDedicatedRetired, other.timeDedicatedRetired)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.capabilities == null ? 43 : this.capabilities.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.baseModelId == null ? 43 : this.baseModelId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.fineTuneDetails == null ? 43 : this.fineTuneDetails.hashCode());
        result = (result * PRIME) + (this.modelMetrics == null ? 43 : this.modelMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.isLongTermSupported == null
                                ? 43
                                : this.isLongTermSupported.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDeprecated == null ? 43 : this.timeDeprecated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOnDemandRetired == null
                                ? 43
                                : this.timeOnDemandRetired.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDedicatedRetired == null
                                ? 43
                                : this.timeDedicatedRetired.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
