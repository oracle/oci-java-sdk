/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * A dataset is a logical collection of records. The dataset contains all the information necessary
 * to describe a record's source, format, the type of annotations allowed for the record, and the
 * labels allowed on annotations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Dataset.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Dataset extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "description",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "lifecycleSubstate",
        "annotationFormat",
        "datasetSourceDetails",
        "datasetFormatDetails",
        "labelSet",
        "initialRecordGenerationConfiguration",
        "initialImportDatasetConfiguration",
        "labelingInstructions",
        "freeformTags",
        "definedTags",
        "systemTags",
        "additionalProperties"
    })
    public Dataset(
            String id,
            String displayName,
            String compartmentId,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            LifecycleSubstate lifecycleSubstate,
            String annotationFormat,
            DatasetSourceDetails datasetSourceDetails,
            DatasetFormatDetails datasetFormatDetails,
            LabelSet labelSet,
            InitialRecordGenerationConfiguration initialRecordGenerationConfiguration,
            InitialImportDatasetConfiguration initialImportDatasetConfiguration,
            String labelingInstructions,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Map<String, String> additionalProperties) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleSubstate = lifecycleSubstate;
        this.annotationFormat = annotationFormat;
        this.datasetSourceDetails = datasetSourceDetails;
        this.datasetFormatDetails = datasetFormatDetails;
        this.labelSet = labelSet;
        this.initialRecordGenerationConfiguration = initialRecordGenerationConfiguration;
        this.initialImportDatasetConfiguration = initialImportDatasetConfiguration;
        this.labelingInstructions = labelingInstructions;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the Dataset. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Dataset.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly display name for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment of the resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A user provided description of the dataset */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user provided description of the dataset
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The date and time the resource was created, in the timestamp format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, in the timestamp format defined by RFC3339.
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
         * The date and time the resource was last updated, in the timestamp format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was last updated, in the timestamp format defined by
         * RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The state of a dataset. CREATING - The dataset is being created. It will transition to
         * ACTIVE when it is ready for labeling. ACTIVE - The dataset is ready for labeling.
         * UPDATING - The dataset is being updated. It and its related resources may be unavailable
         * for other updates until it returns to ACTIVE. NEEDS_ATTENTION - A dataset updation
         * operation has failed due to validation or other errors and needs attention. DELETING -
         * The dataset and its related resources are being deleted. DELETED - The dataset has been
         * deleted and is no longer available. FAILED - The dataset has failed due to validation or
         * other errors.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of a dataset. CREATING - The dataset is being created. It will transition to
         * ACTIVE when it is ready for labeling. ACTIVE - The dataset is ready for labeling.
         * UPDATING - The dataset is being updated. It and its related resources may be unavailable
         * for other updates until it returns to ACTIVE. NEEDS_ATTENTION - A dataset updation
         * operation has failed due to validation or other errors and needs attention. DELETING -
         * The dataset and its related resources are being deleted. DELETED - The dataset has been
         * deleted and is no longer available. FAILED - The dataset has failed due to validation or
         * other errors.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in FAILED or NEEDS_ATTENTION state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in FAILED or NEEDS_ATTENTION state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The sub-state of the dataset. IMPORT_DATASET - The dataset is being imported. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
        private LifecycleSubstate lifecycleSubstate;

        /**
         * The sub-state of the dataset. IMPORT_DATASET - The dataset is being imported.
         *
         * @param lifecycleSubstate the value to set
         * @return this builder
         */
        public Builder lifecycleSubstate(LifecycleSubstate lifecycleSubstate) {
            this.lifecycleSubstate = lifecycleSubstate;
            this.__explicitlySet__.add("lifecycleSubstate");
            return this;
        }
        /** The annotation format name required for labeling records. */
        @com.fasterxml.jackson.annotation.JsonProperty("annotationFormat")
        private String annotationFormat;

        /**
         * The annotation format name required for labeling records.
         *
         * @param annotationFormat the value to set
         * @return this builder
         */
        public Builder annotationFormat(String annotationFormat) {
            this.annotationFormat = annotationFormat;
            this.__explicitlySet__.add("annotationFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("datasetSourceDetails")
        private DatasetSourceDetails datasetSourceDetails;

        public Builder datasetSourceDetails(DatasetSourceDetails datasetSourceDetails) {
            this.datasetSourceDetails = datasetSourceDetails;
            this.__explicitlySet__.add("datasetSourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("datasetFormatDetails")
        private DatasetFormatDetails datasetFormatDetails;

        public Builder datasetFormatDetails(DatasetFormatDetails datasetFormatDetails) {
            this.datasetFormatDetails = datasetFormatDetails;
            this.__explicitlySet__.add("datasetFormatDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelSet")
        private LabelSet labelSet;

        public Builder labelSet(LabelSet labelSet) {
            this.labelSet = labelSet;
            this.__explicitlySet__.add("labelSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialRecordGenerationConfiguration")
        private InitialRecordGenerationConfiguration initialRecordGenerationConfiguration;

        public Builder initialRecordGenerationConfiguration(
                InitialRecordGenerationConfiguration initialRecordGenerationConfiguration) {
            this.initialRecordGenerationConfiguration = initialRecordGenerationConfiguration;
            this.__explicitlySet__.add("initialRecordGenerationConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialImportDatasetConfiguration")
        private InitialImportDatasetConfiguration initialImportDatasetConfiguration;

        public Builder initialImportDatasetConfiguration(
                InitialImportDatasetConfiguration initialImportDatasetConfiguration) {
            this.initialImportDatasetConfiguration = initialImportDatasetConfiguration;
            this.__explicitlySet__.add("initialImportDatasetConfiguration");
            return this;
        }
        /** The labeling instructions for human labelers in rich text format */
        @com.fasterxml.jackson.annotation.JsonProperty("labelingInstructions")
        private String labelingInstructions;

        /**
         * The labeling instructions for human labelers in rich text format
         *
         * @param labelingInstructions the value to set
         * @return this builder
         */
        public Builder labelingInstructions(String labelingInstructions) {
            this.labelingInstructions = labelingInstructions;
            this.__explicitlySet__.add("labelingInstructions");
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
         * The defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags for this resource. Each key is predefined and scoped to a namespace. For
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
        /**
         * The usage of system tag keys. These predefined keys are scoped to namespaces. For
         * example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The usage of system tag keys. These predefined keys are scoped to namespaces. For
         * example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalProperties")
        private java.util.Map<String, String> additionalProperties;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         *
         * @param additionalProperties the value to set
         * @return this builder
         */
        public Builder additionalProperties(java.util.Map<String, String> additionalProperties) {
            this.additionalProperties = additionalProperties;
            this.__explicitlySet__.add("additionalProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Dataset build() {
            Dataset model =
                    new Dataset(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.lifecycleSubstate,
                            this.annotationFormat,
                            this.datasetSourceDetails,
                            this.datasetFormatDetails,
                            this.labelSet,
                            this.initialRecordGenerationConfiguration,
                            this.initialImportDatasetConfiguration,
                            this.labelingInstructions,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.additionalProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Dataset model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("lifecycleSubstate")) {
                this.lifecycleSubstate(model.getLifecycleSubstate());
            }
            if (model.wasPropertyExplicitlySet("annotationFormat")) {
                this.annotationFormat(model.getAnnotationFormat());
            }
            if (model.wasPropertyExplicitlySet("datasetSourceDetails")) {
                this.datasetSourceDetails(model.getDatasetSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("datasetFormatDetails")) {
                this.datasetFormatDetails(model.getDatasetFormatDetails());
            }
            if (model.wasPropertyExplicitlySet("labelSet")) {
                this.labelSet(model.getLabelSet());
            }
            if (model.wasPropertyExplicitlySet("initialRecordGenerationConfiguration")) {
                this.initialRecordGenerationConfiguration(
                        model.getInitialRecordGenerationConfiguration());
            }
            if (model.wasPropertyExplicitlySet("initialImportDatasetConfiguration")) {
                this.initialImportDatasetConfiguration(
                        model.getInitialImportDatasetConfiguration());
            }
            if (model.wasPropertyExplicitlySet("labelingInstructions")) {
                this.labelingInstructions(model.getLabelingInstructions());
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
            if (model.wasPropertyExplicitlySet("additionalProperties")) {
                this.additionalProperties(model.getAdditionalProperties());
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

    /** The OCID of the Dataset. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Dataset.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly display name for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment of the resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A user provided description of the dataset */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user provided description of the dataset
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The date and time the resource was created, in the timestamp format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, in the timestamp format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the resource was last updated, in the timestamp format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was last updated, in the timestamp format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The state of a dataset. CREATING - The dataset is being created. It will transition to ACTIVE
     * when it is ready for labeling. ACTIVE - The dataset is ready for labeling. UPDATING - The
     * dataset is being updated. It and its related resources may be unavailable for other updates
     * until it returns to ACTIVE. NEEDS_ATTENTION - A dataset updation operation has failed due to
     * validation or other errors and needs attention. DELETING - The dataset and its related
     * resources are being deleted. DELETED - The dataset has been deleted and is no longer
     * available. FAILED - The dataset has failed due to validation or other errors.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        NeedsAttention("NEEDS_ATTENTION"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
     * The state of a dataset. CREATING - The dataset is being created. It will transition to ACTIVE
     * when it is ready for labeling. ACTIVE - The dataset is ready for labeling. UPDATING - The
     * dataset is being updated. It and its related resources may be unavailable for other updates
     * until it returns to ACTIVE. NEEDS_ATTENTION - A dataset updation operation has failed due to
     * validation or other errors and needs attention. DELETING - The dataset and its related
     * resources are being deleted. DELETED - The dataset has been deleted and is no longer
     * available. FAILED - The dataset has failed due to validation or other errors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of a dataset. CREATING - The dataset is being created. It will transition to ACTIVE
     * when it is ready for labeling. ACTIVE - The dataset is ready for labeling. UPDATING - The
     * dataset is being updated. It and its related resources may be unavailable for other updates
     * until it returns to ACTIVE. NEEDS_ATTENTION - A dataset updation operation has failed due to
     * validation or other errors and needs attention. DELETING - The dataset and its related
     * resources are being deleted. DELETED - The dataset has been deleted and is no longer
     * available. FAILED - The dataset has failed due to validation or other errors.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in FAILED or NEEDS_ATTENTION state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in FAILED or NEEDS_ATTENTION state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The sub-state of the dataset. IMPORT_DATASET - The dataset is being imported. */
    public enum LifecycleSubstate implements com.oracle.bmc.http.internal.BmcEnum {
        ImportDataset("IMPORT_DATASET"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleSubstate.class);

        private final String value;
        private static java.util.Map<String, LifecycleSubstate> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleSubstate v : LifecycleSubstate.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleSubstate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleSubstate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleSubstate', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The sub-state of the dataset. IMPORT_DATASET - The dataset is being imported. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
    private final LifecycleSubstate lifecycleSubstate;

    /**
     * The sub-state of the dataset. IMPORT_DATASET - The dataset is being imported.
     *
     * @return the value
     */
    public LifecycleSubstate getLifecycleSubstate() {
        return lifecycleSubstate;
    }

    /** The annotation format name required for labeling records. */
    @com.fasterxml.jackson.annotation.JsonProperty("annotationFormat")
    private final String annotationFormat;

    /**
     * The annotation format name required for labeling records.
     *
     * @return the value
     */
    public String getAnnotationFormat() {
        return annotationFormat;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("datasetSourceDetails")
    private final DatasetSourceDetails datasetSourceDetails;

    public DatasetSourceDetails getDatasetSourceDetails() {
        return datasetSourceDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("datasetFormatDetails")
    private final DatasetFormatDetails datasetFormatDetails;

    public DatasetFormatDetails getDatasetFormatDetails() {
        return datasetFormatDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("labelSet")
    private final LabelSet labelSet;

    public LabelSet getLabelSet() {
        return labelSet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialRecordGenerationConfiguration")
    private final InitialRecordGenerationConfiguration initialRecordGenerationConfiguration;

    public InitialRecordGenerationConfiguration getInitialRecordGenerationConfiguration() {
        return initialRecordGenerationConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialImportDatasetConfiguration")
    private final InitialImportDatasetConfiguration initialImportDatasetConfiguration;

    public InitialImportDatasetConfiguration getInitialImportDatasetConfiguration() {
        return initialImportDatasetConfiguration;
    }

    /** The labeling instructions for human labelers in rich text format */
    @com.fasterxml.jackson.annotation.JsonProperty("labelingInstructions")
    private final String labelingInstructions;

    /**
     * The labeling instructions for human labelers in rich text format
     *
     * @return the value
     */
    public String getLabelingInstructions() {
        return labelingInstructions;
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
     * The defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The usage of system tag keys. These predefined keys are scoped to namespaces. For example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The usage of system tag keys. These predefined keys are scoped to namespaces. For example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalProperties")
    private final java.util.Map<String, String> additionalProperties;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalProperties() {
        return additionalProperties;
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
        sb.append("Dataset(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleSubstate=").append(String.valueOf(this.lifecycleSubstate));
        sb.append(", annotationFormat=").append(String.valueOf(this.annotationFormat));
        sb.append(", datasetSourceDetails=").append(String.valueOf(this.datasetSourceDetails));
        sb.append(", datasetFormatDetails=").append(String.valueOf(this.datasetFormatDetails));
        sb.append(", labelSet=").append(String.valueOf(this.labelSet));
        sb.append(", initialRecordGenerationConfiguration=")
                .append(String.valueOf(this.initialRecordGenerationConfiguration));
        sb.append(", initialImportDatasetConfiguration=")
                .append(String.valueOf(this.initialImportDatasetConfiguration));
        sb.append(", labelingInstructions=").append(String.valueOf(this.labelingInstructions));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", additionalProperties=").append(String.valueOf(this.additionalProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dataset)) {
            return false;
        }

        Dataset other = (Dataset) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleSubstate, other.lifecycleSubstate)
                && java.util.Objects.equals(this.annotationFormat, other.annotationFormat)
                && java.util.Objects.equals(this.datasetSourceDetails, other.datasetSourceDetails)
                && java.util.Objects.equals(this.datasetFormatDetails, other.datasetFormatDetails)
                && java.util.Objects.equals(this.labelSet, other.labelSet)
                && java.util.Objects.equals(
                        this.initialRecordGenerationConfiguration,
                        other.initialRecordGenerationConfiguration)
                && java.util.Objects.equals(
                        this.initialImportDatasetConfiguration,
                        other.initialImportDatasetConfiguration)
                && java.util.Objects.equals(this.labelingInstructions, other.labelingInstructions)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.additionalProperties, other.additionalProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleSubstate == null ? 43 : this.lifecycleSubstate.hashCode());
        result =
                (result * PRIME)
                        + (this.annotationFormat == null ? 43 : this.annotationFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.datasetSourceDetails == null
                                ? 43
                                : this.datasetSourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.datasetFormatDetails == null
                                ? 43
                                : this.datasetFormatDetails.hashCode());
        result = (result * PRIME) + (this.labelSet == null ? 43 : this.labelSet.hashCode());
        result =
                (result * PRIME)
                        + (this.initialRecordGenerationConfiguration == null
                                ? 43
                                : this.initialRecordGenerationConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.initialImportDatasetConfiguration == null
                                ? 43
                                : this.initialImportDatasetConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.labelingInstructions == null
                                ? 43
                                : this.labelingInstructions.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalProperties == null
                                ? 43
                                : this.additionalProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
