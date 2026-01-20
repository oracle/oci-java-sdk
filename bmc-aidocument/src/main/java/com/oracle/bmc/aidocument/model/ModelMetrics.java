/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Trained Model Metrics. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = ModelMetrics.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedDocumentElementsExtractionModelDetails.class,
            name = "PRE_TRAINED_DOCUMENT_ELEMENTS_EXTRACTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DocumentClassificationModelMetrics.class,
            name = "DOCUMENT_CLASSIFICATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PretrainedDocumentClassificationModelDetails.class,
            name = "PRE_TRAINED_DOCUMENT_CLASSIFICATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PretrainedTableExtractionModelDetails.class,
            name = "PRE_TRAINED_TABLE_EXTRACTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = KeyValueDetectionModelMetrics.class,
            name = "KEY_VALUE_EXTRACTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PretrainedKeyValueExtractionModelDetails.class,
            name = "PRE_TRAINED_KEY_VALUE_EXTRACTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PretrainedTextExtractionModelDetails.class,
            name = "PRE_TRAINED_TEXT_EXTRACTION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ModelMetrics extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"datasetSummary"})
    protected ModelMetrics(DatasetSummary datasetSummary) {
        super();
        this.datasetSummary = datasetSummary;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("datasetSummary")
    private final DatasetSummary datasetSummary;

    public DatasetSummary getDatasetSummary() {
        return datasetSummary;
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
        sb.append("ModelMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("datasetSummary=").append(String.valueOf(this.datasetSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelMetrics)) {
            return false;
        }

        ModelMetrics other = (ModelMetrics) o;
        return java.util.Objects.equals(this.datasetSummary, other.datasetSummary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.datasetSummary == null ? 43 : this.datasetSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of custom model trained. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        KeyValueExtraction("KEY_VALUE_EXTRACTION"),
        DocumentClassification("DOCUMENT_CLASSIFICATION"),
        PreTrainedTextExtraction("PRE_TRAINED_TEXT_EXTRACTION"),
        PreTrainedTableExtraction("PRE_TRAINED_TABLE_EXTRACTION"),
        PreTrainedKeyValueExtraction("PRE_TRAINED_KEY_VALUE_EXTRACTION"),
        PreTrainedDocumentClassification("PRE_TRAINED_DOCUMENT_CLASSIFICATION"),
        PreTrainedDocumentElementsExtraction("PRE_TRAINED_DOCUMENT_ELEMENTS_EXTRACTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

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
}
