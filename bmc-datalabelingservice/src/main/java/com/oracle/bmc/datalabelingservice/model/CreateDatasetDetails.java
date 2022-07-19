/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice.model;

/**
 * Parameters needed to create a new Dataset. A Dataset allows a user to describe the data source that provides the Records and how Annotations should be applied to the Records.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDatasetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDatasetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "annotationFormat",
        "datasetSourceDetails",
        "datasetFormatDetails",
        "initialRecordGenerationConfiguration",
        "labelSet",
        "labelingInstructions",
        "freeformTags",
        "definedTags"
    })
    public CreateDatasetDetails(
            String displayName,
            String description,
            String compartmentId,
            String annotationFormat,
            DatasetSourceDetails datasetSourceDetails,
            DatasetFormatDetails datasetFormatDetails,
            InitialRecordGenerationConfiguration initialRecordGenerationConfiguration,
            LabelSet labelSet,
            String labelingInstructions,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.annotationFormat = annotationFormat;
        this.datasetSourceDetails = datasetSourceDetails;
        this.datasetFormatDetails = datasetFormatDetails;
        this.initialRecordGenerationConfiguration = initialRecordGenerationConfiguration;
        this.labelSet = labelSet;
        this.labelingInstructions = labelingInstructions;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A user provided description of the dataset
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user provided description of the dataset
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The OCID of the compartment of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment of the resource.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The annotation format name required for labeling records.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("annotationFormat")
        private String annotationFormat;

        /**
         * The annotation format name required for labeling records.
         * @param annotationFormat the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonProperty("initialRecordGenerationConfiguration")
        private InitialRecordGenerationConfiguration initialRecordGenerationConfiguration;

        public Builder initialRecordGenerationConfiguration(
                InitialRecordGenerationConfiguration initialRecordGenerationConfiguration) {
            this.initialRecordGenerationConfiguration = initialRecordGenerationConfiguration;
            this.__explicitlySet__.add("initialRecordGenerationConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelSet")
        private LabelSet labelSet;

        public Builder labelSet(LabelSet labelSet) {
            this.labelSet = labelSet;
            this.__explicitlySet__.add("labelSet");
            return this;
        }
        /**
         * The labeling instructions for human labelers in rich text format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labelingInstructions")
        private String labelingInstructions;

        /**
         * The labeling instructions for human labelers in rich text format
         * @param labelingInstructions the value to set
         * @return this builder
         **/
        public Builder labelingInstructions(String labelingInstructions) {
            this.labelingInstructions = labelingInstructions;
            this.__explicitlySet__.add("labelingInstructions");
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
         * The defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags for this resource. Each key is predefined and scoped to a namespace.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatasetDetails build() {
            CreateDatasetDetails __instance__ =
                    new CreateDatasetDetails(
                            displayName,
                            description,
                            compartmentId,
                            annotationFormat,
                            datasetSourceDetails,
                            datasetFormatDetails,
                            initialRecordGenerationConfiguration,
                            labelSet,
                            labelingInstructions,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatasetDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .annotationFormat(o.getAnnotationFormat())
                            .datasetSourceDetails(o.getDatasetSourceDetails())
                            .datasetFormatDetails(o.getDatasetFormatDetails())
                            .initialRecordGenerationConfiguration(
                                    o.getInitialRecordGenerationConfiguration())
                            .labelSet(o.getLabelSet())
                            .labelingInstructions(o.getLabelingInstructions())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A user-friendly display name for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user provided description of the dataset
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user provided description of the dataset
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the compartment of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment of the resource.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The annotation format name required for labeling records.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("annotationFormat")
    private final String annotationFormat;

    /**
     * The annotation format name required for labeling records.
     * @return the value
     **/
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

    @com.fasterxml.jackson.annotation.JsonProperty("initialRecordGenerationConfiguration")
    private final InitialRecordGenerationConfiguration initialRecordGenerationConfiguration;

    public InitialRecordGenerationConfiguration getInitialRecordGenerationConfiguration() {
        return initialRecordGenerationConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("labelSet")
    private final LabelSet labelSet;

    public LabelSet getLabelSet() {
        return labelSet;
    }

    /**
     * The labeling instructions for human labelers in rich text format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelingInstructions")
    private final String labelingInstructions;

    /**
     * The labeling instructions for human labelers in rich text format
     * @return the value
     **/
    public String getLabelingInstructions() {
        return labelingInstructions;
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
     * The defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateDatasetDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", annotationFormat=").append(String.valueOf(this.annotationFormat));
        sb.append(", datasetSourceDetails=").append(String.valueOf(this.datasetSourceDetails));
        sb.append(", datasetFormatDetails=").append(String.valueOf(this.datasetFormatDetails));
        sb.append(", initialRecordGenerationConfiguration=")
                .append(String.valueOf(this.initialRecordGenerationConfiguration));
        sb.append(", labelSet=").append(String.valueOf(this.labelSet));
        sb.append(", labelingInstructions=").append(String.valueOf(this.labelingInstructions));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatasetDetails)) {
            return false;
        }

        CreateDatasetDetails other = (CreateDatasetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.annotationFormat, other.annotationFormat)
                && java.util.Objects.equals(this.datasetSourceDetails, other.datasetSourceDetails)
                && java.util.Objects.equals(this.datasetFormatDetails, other.datasetFormatDetails)
                && java.util.Objects.equals(
                        this.initialRecordGenerationConfiguration,
                        other.initialRecordGenerationConfiguration)
                && java.util.Objects.equals(this.labelSet, other.labelSet)
                && java.util.Objects.equals(this.labelingInstructions, other.labelingInstructions)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.initialRecordGenerationConfiguration == null
                                ? 43
                                : this.initialRecordGenerationConfiguration.hashCode());
        result = (result * PRIME) + (this.labelSet == null ? 43 : this.labelSet.hashCode());
        result =
                (result * PRIME)
                        + (this.labelingInstructions == null
                                ? 43
                                : this.labelingInstructions.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
