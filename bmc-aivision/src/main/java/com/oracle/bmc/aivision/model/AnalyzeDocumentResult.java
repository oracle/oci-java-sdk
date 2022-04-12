/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The document analysis results.
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
    builder = AnalyzeDocumentResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AnalyzeDocumentResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("documentMetadata")
        private DocumentMetadata documentMetadata;

        public Builder documentMetadata(DocumentMetadata documentMetadata) {
            this.documentMetadata = documentMetadata;
            this.__explicitlySet__.add("documentMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pages")
        private java.util.List<Page> pages;

        public Builder pages(java.util.List<Page> pages) {
            this.pages = pages;
            this.__explicitlySet__.add("pages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detectedDocumentTypes")
        private java.util.List<DetectedDocumentType> detectedDocumentTypes;

        public Builder detectedDocumentTypes(
                java.util.List<DetectedDocumentType> detectedDocumentTypes) {
            this.detectedDocumentTypes = detectedDocumentTypes;
            this.__explicitlySet__.add("detectedDocumentTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detectedLanguages")
        private java.util.List<DetectedLanguage> detectedLanguages;

        public Builder detectedLanguages(java.util.List<DetectedLanguage> detectedLanguages) {
            this.detectedLanguages = detectedLanguages;
            this.__explicitlySet__.add("detectedLanguages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("documentClassificationModelVersion")
        private String documentClassificationModelVersion;

        public Builder documentClassificationModelVersion(
                String documentClassificationModelVersion) {
            this.documentClassificationModelVersion = documentClassificationModelVersion;
            this.__explicitlySet__.add("documentClassificationModelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("languageClassificationModelVersion")
        private String languageClassificationModelVersion;

        public Builder languageClassificationModelVersion(
                String languageClassificationModelVersion) {
            this.languageClassificationModelVersion = languageClassificationModelVersion;
            this.__explicitlySet__.add("languageClassificationModelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
        private String textDetectionModelVersion;

        public Builder textDetectionModelVersion(String textDetectionModelVersion) {
            this.textDetectionModelVersion = textDetectionModelVersion;
            this.__explicitlySet__.add("textDetectionModelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyValueDetectionModelVersion")
        private String keyValueDetectionModelVersion;

        public Builder keyValueDetectionModelVersion(String keyValueDetectionModelVersion) {
            this.keyValueDetectionModelVersion = keyValueDetectionModelVersion;
            this.__explicitlySet__.add("keyValueDetectionModelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableDetectionModelVersion")
        private String tableDetectionModelVersion;

        public Builder tableDetectionModelVersion(String tableDetectionModelVersion) {
            this.tableDetectionModelVersion = tableDetectionModelVersion;
            this.__explicitlySet__.add("tableDetectionModelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<ProcessingError> errors;

        public Builder errors(java.util.List<ProcessingError> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("searchablePdf")
        private byte[] searchablePdf;

        public Builder searchablePdf(byte[] searchablePdf) {
            this.searchablePdf = searchablePdf;
            this.__explicitlySet__.add("searchablePdf");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyzeDocumentResult build() {
            AnalyzeDocumentResult __instance__ =
                    new AnalyzeDocumentResult(
                            documentMetadata,
                            pages,
                            detectedDocumentTypes,
                            detectedLanguages,
                            documentClassificationModelVersion,
                            languageClassificationModelVersion,
                            textDetectionModelVersion,
                            keyValueDetectionModelVersion,
                            tableDetectionModelVersion,
                            errors,
                            searchablePdf);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeDocumentResult o) {
            Builder copiedBuilder =
                    documentMetadata(o.getDocumentMetadata())
                            .pages(o.getPages())
                            .detectedDocumentTypes(o.getDetectedDocumentTypes())
                            .detectedLanguages(o.getDetectedLanguages())
                            .documentClassificationModelVersion(
                                    o.getDocumentClassificationModelVersion())
                            .languageClassificationModelVersion(
                                    o.getLanguageClassificationModelVersion())
                            .textDetectionModelVersion(o.getTextDetectionModelVersion())
                            .keyValueDetectionModelVersion(o.getKeyValueDetectionModelVersion())
                            .tableDetectionModelVersion(o.getTableDetectionModelVersion())
                            .errors(o.getErrors())
                            .searchablePdf(o.getSearchablePdf());

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

    @com.fasterxml.jackson.annotation.JsonProperty("documentMetadata")
    DocumentMetadata documentMetadata;

    /**
     * The array of a Page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pages")
    java.util.List<Page> pages;

    /**
     * An array of detected document types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectedDocumentTypes")
    java.util.List<DetectedDocumentType> detectedDocumentTypes;

    /**
     * An array of detected languages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectedLanguages")
    java.util.List<DetectedLanguage> detectedLanguages;

    /**
     * The document classification model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentClassificationModelVersion")
    String documentClassificationModelVersion;

    /**
     * The document language classification model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageClassificationModelVersion")
    String languageClassificationModelVersion;

    /**
     * The document text detection model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
    String textDetectionModelVersion;

    /**
     * The document keyValue detection model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyValueDetectionModelVersion")
    String keyValueDetectionModelVersion;

    /**
     * The document table detection model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableDetectionModelVersion")
    String tableDetectionModelVersion;

    /**
     * The errors encountered during document analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    java.util.List<ProcessingError> errors;

    /**
     * The searchable PDF file that was generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchablePdf")
    byte[] searchablePdf;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
