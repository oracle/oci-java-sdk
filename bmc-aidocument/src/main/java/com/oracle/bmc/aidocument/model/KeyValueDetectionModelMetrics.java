/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Metrics for Document Key Value Detection Model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KeyValueDetectionModelMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KeyValueDetectionModelMetrics extends ModelMetrics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("datasetSummary")
        private DatasetSummary datasetSummary;

        public Builder datasetSummary(DatasetSummary datasetSummary) {
            this.datasetSummary = datasetSummary;
            this.__explicitlySet__.add("datasetSummary");
            return this;
        }
        /**
         * List of metrics entries per label.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labelMetricsReport")
        private java.util.List<KeyValueDetectionLabelMetricsReport> labelMetricsReport;

        /**
         * List of metrics entries per label.
         * @param labelMetricsReport the value to set
         * @return this builder
         **/
        public Builder labelMetricsReport(
                java.util.List<KeyValueDetectionLabelMetricsReport> labelMetricsReport) {
            this.labelMetricsReport = labelMetricsReport;
            this.__explicitlySet__.add("labelMetricsReport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overallMetricsReport")
        private KeyValueDetectionOverallMetricsReport overallMetricsReport;

        public Builder overallMetricsReport(
                KeyValueDetectionOverallMetricsReport overallMetricsReport) {
            this.overallMetricsReport = overallMetricsReport;
            this.__explicitlySet__.add("overallMetricsReport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyValueDetectionModelMetrics build() {
            KeyValueDetectionModelMetrics model =
                    new KeyValueDetectionModelMetrics(
                            this.datasetSummary,
                            this.labelMetricsReport,
                            this.overallMetricsReport);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyValueDetectionModelMetrics model) {
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public KeyValueDetectionModelMetrics(
            DatasetSummary datasetSummary,
            java.util.List<KeyValueDetectionLabelMetricsReport> labelMetricsReport,
            KeyValueDetectionOverallMetricsReport overallMetricsReport) {
        super(datasetSummary);
        this.labelMetricsReport = labelMetricsReport;
        this.overallMetricsReport = overallMetricsReport;
    }

    /**
     * List of metrics entries per label.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelMetricsReport")
    private final java.util.List<KeyValueDetectionLabelMetricsReport> labelMetricsReport;

    /**
     * List of metrics entries per label.
     * @return the value
     **/
    public java.util.List<KeyValueDetectionLabelMetricsReport> getLabelMetricsReport() {
        return labelMetricsReport;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("overallMetricsReport")
    private final KeyValueDetectionOverallMetricsReport overallMetricsReport;

    public KeyValueDetectionOverallMetricsReport getOverallMetricsReport() {
        return overallMetricsReport;
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
        sb.append("KeyValueDetectionModelMetrics(");
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
        if (!(o instanceof KeyValueDetectionModelMetrics)) {
            return false;
        }

        KeyValueDetectionModelMetrics other = (KeyValueDetectionModelMetrics) o;
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
