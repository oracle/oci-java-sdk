/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The details of how to analyze a document.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyzeDocumentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnalyzeDocumentDetails {
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
        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<DocumentFeature> features;

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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

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

        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private DocumentLanguage language;

        public Builder language(DocumentLanguage language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("documentType")
        private DocumentType documentType;

        public Builder documentType(DocumentType documentType) {
            this.documentType = documentType;
            this.__explicitlySet__.add("documentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyzeDocumentDetails build() {
            AnalyzeDocumentDetails __instance__ =
                    new AnalyzeDocumentDetails(
                            features,
                            document,
                            compartmentId,
                            outputLocation,
                            language,
                            documentType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeDocumentDetails o) {
            Builder copiedBuilder =
                    features(o.getFeatures())
                            .document(o.getDocument())
                            .compartmentId(o.getCompartmentId())
                            .outputLocation(o.getOutputLocation())
                            .language(o.getLanguage())
                            .documentType(o.getDocumentType());

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
     * The types of document analysis requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<DocumentFeature> features;

    public java.util.List<DocumentFeature> getFeatures() {
        return features;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("document")
    private final DocumentDetails document;

    public DocumentDetails getDocument() {
        return document;
    }

    /**
     * The OCID of the compartment that calls the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final OutputLocation outputLocation;

    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * The document language, abbreviated according to ISO 639-2.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final DocumentLanguage language;

    public DocumentLanguage getLanguage() {
        return language;
    }

    /**
     * The document type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentType")
    private final DocumentType documentType;

    public DocumentType getDocumentType() {
        return documentType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeDocumentDetails(");
        sb.append("features=").append(String.valueOf(this.features));
        sb.append(", document=").append(String.valueOf(this.document));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", documentType=").append(String.valueOf(this.documentType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
