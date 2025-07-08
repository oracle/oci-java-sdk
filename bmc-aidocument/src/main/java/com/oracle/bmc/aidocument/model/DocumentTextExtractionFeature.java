/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Text recognition <br>
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
        builder = DocumentTextExtractionFeature.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "featureType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DocumentTextExtractionFeature extends DocumentFeature {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether or not to generate a searchable PDF file. */
        @com.fasterxml.jackson.annotation.JsonProperty("generateSearchablePdf")
        private Boolean generateSearchablePdf;

        /**
         * Whether or not to generate a searchable PDF file.
         *
         * @param generateSearchablePdf the value to set
         * @return this builder
         */
        public Builder generateSearchablePdf(Boolean generateSearchablePdf) {
            this.generateSearchablePdf = generateSearchablePdf;
            this.__explicitlySet__.add("generateSearchablePdf");
            return this;
        }
        /** Unique identifier custom model OCID that should be used for inference. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * Unique identifier custom model OCID that should be used for inference.
         *
         * @param modelId the value to set
         * @return this builder
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /** Whether checkbox detection feature is enabled or disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("selectionMarkDetection")
        private Boolean selectionMarkDetection;

        /**
         * Whether checkbox detection feature is enabled or disabled.
         *
         * @param selectionMarkDetection the value to set
         * @return this builder
         */
        public Builder selectionMarkDetection(Boolean selectionMarkDetection) {
            this.selectionMarkDetection = selectionMarkDetection;
            this.__explicitlySet__.add("selectionMarkDetection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentTextExtractionFeature build() {
            DocumentTextExtractionFeature model =
                    new DocumentTextExtractionFeature(
                            this.generateSearchablePdf, this.modelId, this.selectionMarkDetection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentTextExtractionFeature model) {
            if (model.wasPropertyExplicitlySet("generateSearchablePdf")) {
                this.generateSearchablePdf(model.getGenerateSearchablePdf());
            }
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("selectionMarkDetection")) {
                this.selectionMarkDetection(model.getSelectionMarkDetection());
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
    public DocumentTextExtractionFeature(
            Boolean generateSearchablePdf, String modelId, Boolean selectionMarkDetection) {
        super();
        this.generateSearchablePdf = generateSearchablePdf;
        this.modelId = modelId;
        this.selectionMarkDetection = selectionMarkDetection;
    }

    /** Whether or not to generate a searchable PDF file. */
    @com.fasterxml.jackson.annotation.JsonProperty("generateSearchablePdf")
    private final Boolean generateSearchablePdf;

    /**
     * Whether or not to generate a searchable PDF file.
     *
     * @return the value
     */
    public Boolean getGenerateSearchablePdf() {
        return generateSearchablePdf;
    }

    /** Unique identifier custom model OCID that should be used for inference. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * Unique identifier custom model OCID that should be used for inference.
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    /** Whether checkbox detection feature is enabled or disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("selectionMarkDetection")
    private final Boolean selectionMarkDetection;

    /**
     * Whether checkbox detection feature is enabled or disabled.
     *
     * @return the value
     */
    public Boolean getSelectionMarkDetection() {
        return selectionMarkDetection;
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
        sb.append("DocumentTextExtractionFeature(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", generateSearchablePdf=").append(String.valueOf(this.generateSearchablePdf));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", selectionMarkDetection=").append(String.valueOf(this.selectionMarkDetection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentTextExtractionFeature)) {
            return false;
        }

        DocumentTextExtractionFeature other = (DocumentTextExtractionFeature) o;
        return java.util.Objects.equals(this.generateSearchablePdf, other.generateSearchablePdf)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(
                        this.selectionMarkDetection, other.selectionMarkDetection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.generateSearchablePdf == null
                                ? 43
                                : this.generateSearchablePdf.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result =
                (result * PRIME)
                        + (this.selectionMarkDetection == null
                                ? 43
                                : this.selectionMarkDetection.hashCode());
        return result;
    }
}
