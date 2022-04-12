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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyzeDocumentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AnalyzeDocumentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The types of document analysis requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    java.util.List<DocumentFeature> features;

    @com.fasterxml.jackson.annotation.JsonProperty("document")
    DocumentDetails document;

    /**
     * The OCID of the compartment that calls the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    OutputLocation outputLocation;

    /**
     * The document language, abbreviated according to ISO 639-2.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    DocumentLanguage language;

    /**
     * The document type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentType")
    DocumentType documentType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
