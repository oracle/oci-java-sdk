/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The configuration of a general processor. <br>
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
        builder = GeneralProcessorConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "processorType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GeneralProcessorConfig extends ProcessorConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The document type. */
        @com.fasterxml.jackson.annotation.JsonProperty("documentType")
        private DocumentType documentType;

        /**
         * The document type.
         *
         * @param documentType the value to set
         * @return this builder
         */
        public Builder documentType(DocumentType documentType) {
            this.documentType = documentType;
            this.__explicitlySet__.add("documentType");
            return this;
        }
        /** The types of document analysis requested. */
        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<DocumentFeature> features;

        /**
         * The types of document analysis requested.
         *
         * @param features the value to set
         * @return this builder
         */
        public Builder features(java.util.List<DocumentFeature> features) {
            this.features = features;
            this.__explicitlySet__.add("features");
            return this;
        }
        /** Whether or not to generate a ZIP file containing the results. */
        @com.fasterxml.jackson.annotation.JsonProperty("isZipOutputEnabled")
        private Boolean isZipOutputEnabled;

        /**
         * Whether or not to generate a ZIP file containing the results.
         *
         * @param isZipOutputEnabled the value to set
         * @return this builder
         */
        public Builder isZipOutputEnabled(Boolean isZipOutputEnabled) {
            this.isZipOutputEnabled = isZipOutputEnabled;
            this.__explicitlySet__.add("isZipOutputEnabled");
            return this;
        }
        /** The document language, abbreviated according to the BCP 47 Language-Tag syntax. */
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private String language;

        /**
         * The document language, abbreviated according to the BCP 47 Language-Tag syntax.
         *
         * @param language the value to set
         * @return this builder
         */
        public Builder language(String language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeneralProcessorConfig build() {
            GeneralProcessorConfig model =
                    new GeneralProcessorConfig(
                            this.documentType,
                            this.features,
                            this.isZipOutputEnabled,
                            this.language);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeneralProcessorConfig model) {
            if (model.wasPropertyExplicitlySet("documentType")) {
                this.documentType(model.getDocumentType());
            }
            if (model.wasPropertyExplicitlySet("features")) {
                this.features(model.getFeatures());
            }
            if (model.wasPropertyExplicitlySet("isZipOutputEnabled")) {
                this.isZipOutputEnabled(model.getIsZipOutputEnabled());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
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
    public GeneralProcessorConfig(
            DocumentType documentType,
            java.util.List<DocumentFeature> features,
            Boolean isZipOutputEnabled,
            String language) {
        super();
        this.documentType = documentType;
        this.features = features;
        this.isZipOutputEnabled = isZipOutputEnabled;
        this.language = language;
    }

    /** The document type. */
    @com.fasterxml.jackson.annotation.JsonProperty("documentType")
    private final DocumentType documentType;

    /**
     * The document type.
     *
     * @return the value
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /** The types of document analysis requested. */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<DocumentFeature> features;

    /**
     * The types of document analysis requested.
     *
     * @return the value
     */
    public java.util.List<DocumentFeature> getFeatures() {
        return features;
    }

    /** Whether or not to generate a ZIP file containing the results. */
    @com.fasterxml.jackson.annotation.JsonProperty("isZipOutputEnabled")
    private final Boolean isZipOutputEnabled;

    /**
     * Whether or not to generate a ZIP file containing the results.
     *
     * @return the value
     */
    public Boolean getIsZipOutputEnabled() {
        return isZipOutputEnabled;
    }

    /** The document language, abbreviated according to the BCP 47 Language-Tag syntax. */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final String language;

    /**
     * The document language, abbreviated according to the BCP 47 Language-Tag syntax.
     *
     * @return the value
     */
    public String getLanguage() {
        return language;
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
        sb.append("GeneralProcessorConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", documentType=").append(String.valueOf(this.documentType));
        sb.append(", features=").append(String.valueOf(this.features));
        sb.append(", isZipOutputEnabled=").append(String.valueOf(this.isZipOutputEnabled));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeneralProcessorConfig)) {
            return false;
        }

        GeneralProcessorConfig other = (GeneralProcessorConfig) o;
        return java.util.Objects.equals(this.documentType, other.documentType)
                && java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(this.isZipOutputEnabled, other.isZipOutputEnabled)
                && java.util.Objects.equals(this.language, other.language)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.documentType == null ? 43 : this.documentType.hashCode());
        result = (result * PRIME) + (this.features == null ? 43 : this.features.hashCode());
        result =
                (result * PRIME)
                        + (this.isZipOutputEnabled == null
                                ? 43
                                : this.isZipOutputEnabled.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        return result;
    }
}
