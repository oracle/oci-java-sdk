/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The details of how to analyze a document. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AnalyzeDocumentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnalyzeDocumentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "features",
        "document",
        "compartmentId",
        "outputLocation",
        "language",
        "documentType"
    })
    public AnalyzeDocumentDetails(
            java.util.List<DocumentFeature> features,
            DocumentDetails document,
            String compartmentId,
            OutputLocation outputLocation,
            DocumentLanguage language,
            DocumentType documentType) {
        super();
        this.features = features;
        this.document = document;
        this.compartmentId = compartmentId;
        this.outputLocation = outputLocation;
        this.language = language;
        this.documentType = documentType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("document")
        private DocumentDetails document;

        public Builder document(DocumentDetails document) {
            this.document = document;
            this.__explicitlySet__.add("document");
            return this;
        }
        /** The OCID of the compartment that calls the API. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that calls the API.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
        private OutputLocation outputLocation;

        public Builder outputLocation(OutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            this.__explicitlySet__.add("outputLocation");
            return this;
        }
        /** The document language, abbreviated according to ISO 639-2. */
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private DocumentLanguage language;

        /**
         * The document language, abbreviated according to ISO 639-2.
         *
         * @param language the value to set
         * @return this builder
         */
        public Builder language(DocumentLanguage language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyzeDocumentDetails build() {
            AnalyzeDocumentDetails model =
                    new AnalyzeDocumentDetails(
                            this.features,
                            this.document,
                            this.compartmentId,
                            this.outputLocation,
                            this.language,
                            this.documentType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeDocumentDetails model) {
            if (model.wasPropertyExplicitlySet("features")) {
                this.features(model.getFeatures());
            }
            if (model.wasPropertyExplicitlySet("document")) {
                this.document(model.getDocument());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("outputLocation")) {
                this.outputLocation(model.getOutputLocation());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
            }
            if (model.wasPropertyExplicitlySet("documentType")) {
                this.documentType(model.getDocumentType());
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

    @com.fasterxml.jackson.annotation.JsonProperty("document")
    private final DocumentDetails document;

    public DocumentDetails getDocument() {
        return document;
    }

    /** The OCID of the compartment that calls the API. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that calls the API.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final OutputLocation outputLocation;

    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /** The document language, abbreviated according to ISO 639-2. */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final DocumentLanguage language;

    /**
     * The document language, abbreviated according to ISO 639-2.
     *
     * @return the value
     */
    public DocumentLanguage getLanguage() {
        return language;
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
        sb.append("AnalyzeDocumentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("features=").append(String.valueOf(this.features));
        sb.append(", document=").append(String.valueOf(this.document));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", documentType=").append(String.valueOf(this.documentType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeDocumentDetails)) {
            return false;
        }

        AnalyzeDocumentDetails other = (AnalyzeDocumentDetails) o;
        return java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(this.document, other.document)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
                && java.util.Objects.equals(this.language, other.language)
                && java.util.Objects.equals(this.documentType, other.documentType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.features == null ? 43 : this.features.hashCode());
        result = (result * PRIME) + (this.document == null ? 43 : this.document.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.outputLocation == null ? 43 : this.outputLocation.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result = (result * PRIME) + (this.documentType == null ? 43 : this.documentType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
