/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentTextExtractionFeature build() {
            DocumentTextExtractionFeature model =
                    new DocumentTextExtractionFeature(this.generateSearchablePdf);
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
    public DocumentTextExtractionFeature(Boolean generateSearchablePdf) {
        super();
        this.generateSearchablePdf = generateSearchablePdf;
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
        return result;
    }
}
