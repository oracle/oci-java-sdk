/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Metrics for Document Classification Model. <br>
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
        builder = DocumentClassificationModelMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DocumentClassificationModelMetrics extends ModelMetrics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("datasetSummary")
        private DatasetSummary datasetSummary;

        public Builder datasetSummary(DatasetSummary datasetSummary) {
            this.datasetSummary = datasetSummary;
            this.__explicitlySet__.add("datasetSummary");
            return this;
        }
        /** List of metrics entries per label. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelMetricsReport")
        private java.util.List<DocumentClassificationLabelMetricsReport> labelMetricsReport;

        /**
         * List of metrics entries per label.
         *
         * @param labelMetricsReport the value to set
         * @return this builder
         */
        public Builder labelMetricsReport(
                java.util.List<DocumentClassificationLabelMetricsReport> labelMetricsReport) {
            this.labelMetricsReport = labelMetricsReport;
            this.__explicitlySet__.add("labelMetricsReport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overallMetricsReport")
        private DocumentClassificationOverallMetricsReport overallMetricsReport;

        public Builder overallMetricsReport(
                DocumentClassificationOverallMetricsReport overallMetricsReport) {
            this.overallMetricsReport = overallMetricsReport;
            this.__explicitlySet__.add("overallMetricsReport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentClassificationModelMetrics build() {
            DocumentClassificationModelMetrics model =
                    new DocumentClassificationModelMetrics(
                            this.datasetSummary,
                            this.labelMetricsReport,
                            this.overallMetricsReport);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentClassificationModelMetrics model) {
            if (model.wasPropertyExplicitlySet("datasetSummary")) {
                this.datasetSummary(model.getDatasetSummary());
            }
            if (model.wasPropertyExplicitlySet("labelMetricsReport")) {
                this.labelMetricsReport(model.getLabelMetricsReport());
            }
            if (model.wasPropertyExplicitlySet("overallMetricsReport")) {
                this.overallMetricsReport(model.getOverallMetricsReport());
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

    @Deprecated
    public DocumentClassificationModelMetrics(
            DatasetSummary datasetSummary,
            java.util.List<DocumentClassificationLabelMetricsReport> labelMetricsReport,
            DocumentClassificationOverallMetricsReport overallMetricsReport) {
        super(datasetSummary);
        this.labelMetricsReport = labelMetricsReport;
        this.overallMetricsReport = overallMetricsReport;
    }

    /** List of metrics entries per label. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelMetricsReport")
    private final java.util.List<DocumentClassificationLabelMetricsReport> labelMetricsReport;

    /**
     * List of metrics entries per label.
     *
     * @return the value
     */
    public java.util.List<DocumentClassificationLabelMetricsReport> getLabelMetricsReport() {
        return labelMetricsReport;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("overallMetricsReport")
    private final DocumentClassificationOverallMetricsReport overallMetricsReport;

    public DocumentClassificationOverallMetricsReport getOverallMetricsReport() {
        return overallMetricsReport;
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
        sb.append("DocumentClassificationModelMetrics(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", labelMetricsReport=").append(String.valueOf(this.labelMetricsReport));
        sb.append(", overallMetricsReport=").append(String.valueOf(this.overallMetricsReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentClassificationModelMetrics)) {
            return false;
        }

        DocumentClassificationModelMetrics other = (DocumentClassificationModelMetrics) o;
        return java.util.Objects.equals(this.labelMetricsReport, other.labelMetricsReport)
                && java.util.Objects.equals(this.overallMetricsReport, other.overallMetricsReport)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.labelMetricsReport == null
                                ? 43
                                : this.labelMetricsReport.hashCode());
        result =
                (result * PRIME)
                        + (this.overallMetricsReport == null
                                ? 43
                                : this.overallMetricsReport.hashCode());
        return result;
    }
}
