/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Overall Metrics report for Key Value Detection Model. <br>
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
        builder = KeyValueDetectionOverallMetricsReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KeyValueDetectionOverallMetricsReport
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "documentCount",
        "meanAveragePrecision",
        "confidenceEntries"
    })
    public KeyValueDetectionOverallMetricsReport(
            Integer documentCount,
            Float meanAveragePrecision,
            java.util.List<KeyValueDetectionConfidenceEntry> confidenceEntries) {
        super();
        this.documentCount = documentCount;
        this.meanAveragePrecision = meanAveragePrecision;
        this.confidenceEntries = confidenceEntries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total test documents in the label. */
        @com.fasterxml.jackson.annotation.JsonProperty("documentCount")
        private Integer documentCount;

        /**
         * Total test documents in the label.
         *
         * @param documentCount the value to set
         * @return this builder
         */
        public Builder documentCount(Integer documentCount) {
            this.documentCount = documentCount;
            this.__explicitlySet__.add("documentCount");
            return this;
        }
        /** Mean average precision under different thresholds */
        @com.fasterxml.jackson.annotation.JsonProperty("meanAveragePrecision")
        private Float meanAveragePrecision;

        /**
         * Mean average precision under different thresholds
         *
         * @param meanAveragePrecision the value to set
         * @return this builder
         */
        public Builder meanAveragePrecision(Float meanAveragePrecision) {
            this.meanAveragePrecision = meanAveragePrecision;
            this.__explicitlySet__.add("meanAveragePrecision");
            return this;
        }
        /** List of key value detection confidence report. */
        @com.fasterxml.jackson.annotation.JsonProperty("confidenceEntries")
        private java.util.List<KeyValueDetectionConfidenceEntry> confidenceEntries;

        /**
         * List of key value detection confidence report.
         *
         * @param confidenceEntries the value to set
         * @return this builder
         */
        public Builder confidenceEntries(
                java.util.List<KeyValueDetectionConfidenceEntry> confidenceEntries) {
            this.confidenceEntries = confidenceEntries;
            this.__explicitlySet__.add("confidenceEntries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyValueDetectionOverallMetricsReport build() {
            KeyValueDetectionOverallMetricsReport model =
                    new KeyValueDetectionOverallMetricsReport(
                            this.documentCount, this.meanAveragePrecision, this.confidenceEntries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyValueDetectionOverallMetricsReport model) {
            if (model.wasPropertyExplicitlySet("documentCount")) {
                this.documentCount(model.getDocumentCount());
            }
            if (model.wasPropertyExplicitlySet("meanAveragePrecision")) {
                this.meanAveragePrecision(model.getMeanAveragePrecision());
            }
            if (model.wasPropertyExplicitlySet("confidenceEntries")) {
                this.confidenceEntries(model.getConfidenceEntries());
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

    /** Total test documents in the label. */
    @com.fasterxml.jackson.annotation.JsonProperty("documentCount")
    private final Integer documentCount;

    /**
     * Total test documents in the label.
     *
     * @return the value
     */
    public Integer getDocumentCount() {
        return documentCount;
    }

    /** Mean average precision under different thresholds */
    @com.fasterxml.jackson.annotation.JsonProperty("meanAveragePrecision")
    private final Float meanAveragePrecision;

    /**
     * Mean average precision under different thresholds
     *
     * @return the value
     */
    public Float getMeanAveragePrecision() {
        return meanAveragePrecision;
    }

    /** List of key value detection confidence report. */
    @com.fasterxml.jackson.annotation.JsonProperty("confidenceEntries")
    private final java.util.List<KeyValueDetectionConfidenceEntry> confidenceEntries;

    /**
     * List of key value detection confidence report.
     *
     * @return the value
     */
    public java.util.List<KeyValueDetectionConfidenceEntry> getConfidenceEntries() {
        return confidenceEntries;
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
        sb.append("KeyValueDetectionOverallMetricsReport(");
        sb.append("super=").append(super.toString());
        sb.append("documentCount=").append(String.valueOf(this.documentCount));
        sb.append(", meanAveragePrecision=").append(String.valueOf(this.meanAveragePrecision));
        sb.append(", confidenceEntries=").append(String.valueOf(this.confidenceEntries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyValueDetectionOverallMetricsReport)) {
            return false;
        }

        KeyValueDetectionOverallMetricsReport other = (KeyValueDetectionOverallMetricsReport) o;
        return java.util.Objects.equals(this.documentCount, other.documentCount)
                && java.util.Objects.equals(this.meanAveragePrecision, other.meanAveragePrecision)
                && java.util.Objects.equals(this.confidenceEntries, other.confidenceEntries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.documentCount == null ? 43 : this.documentCount.hashCode());
        result =
                (result * PRIME)
                        + (this.meanAveragePrecision == null
                                ? 43
                                : this.meanAveragePrecision.hashCode());
        result =
                (result * PRIME)
                        + (this.confidenceEntries == null ? 43 : this.confidenceEntries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
