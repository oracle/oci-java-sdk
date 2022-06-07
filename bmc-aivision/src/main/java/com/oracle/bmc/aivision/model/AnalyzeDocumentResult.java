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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyzeDocumentResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnalyzeDocumentResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "documentMetadata",
        "pages",
        "detectedDocumentTypes",
        "detectedLanguages",
        "documentClassificationModelVersion",
        "languageClassificationModelVersion",
        "textDetectionModelVersion",
        "keyValueDetectionModelVersion",
        "tableDetectionModelVersion",
        "errors",
        "searchablePdf"
    })
    public AnalyzeDocumentResult(
            DocumentMetadata documentMetadata,
            java.util.List<Page> pages,
            java.util.List<DetectedDocumentType> detectedDocumentTypes,
            java.util.List<DetectedLanguage> detectedLanguages,
            String documentClassificationModelVersion,
            String languageClassificationModelVersion,
            String textDetectionModelVersion,
            String keyValueDetectionModelVersion,
            String tableDetectionModelVersion,
            java.util.List<ProcessingError> errors,
            byte[] searchablePdf) {
        super();
        this.documentMetadata = documentMetadata;
        this.pages = pages;
        this.detectedDocumentTypes = detectedDocumentTypes;
        this.detectedLanguages = detectedLanguages;
        this.documentClassificationModelVersion = documentClassificationModelVersion;
        this.languageClassificationModelVersion = languageClassificationModelVersion;
        this.textDetectionModelVersion = textDetectionModelVersion;
        this.keyValueDetectionModelVersion = keyValueDetectionModelVersion;
        this.tableDetectionModelVersion = tableDetectionModelVersion;
        this.errors = errors;
        this.searchablePdf = searchablePdf;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("documentMetadata")
    private final DocumentMetadata documentMetadata;

    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * The array of a Page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pages")
    private final java.util.List<Page> pages;

    public java.util.List<Page> getPages() {
        return pages;
    }

    /**
     * An array of detected document types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectedDocumentTypes")
    private final java.util.List<DetectedDocumentType> detectedDocumentTypes;

    public java.util.List<DetectedDocumentType> getDetectedDocumentTypes() {
        return detectedDocumentTypes;
    }

    /**
     * An array of detected languages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectedLanguages")
    private final java.util.List<DetectedLanguage> detectedLanguages;

    public java.util.List<DetectedLanguage> getDetectedLanguages() {
        return detectedLanguages;
    }

    /**
     * The document classification model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentClassificationModelVersion")
    private final String documentClassificationModelVersion;

    public String getDocumentClassificationModelVersion() {
        return documentClassificationModelVersion;
    }

    /**
     * The document language classification model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageClassificationModelVersion")
    private final String languageClassificationModelVersion;

    public String getLanguageClassificationModelVersion() {
        return languageClassificationModelVersion;
    }

    /**
     * The document text detection model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
    private final String textDetectionModelVersion;

    public String getTextDetectionModelVersion() {
        return textDetectionModelVersion;
    }

    /**
     * The document keyValue detection model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyValueDetectionModelVersion")
    private final String keyValueDetectionModelVersion;

    public String getKeyValueDetectionModelVersion() {
        return keyValueDetectionModelVersion;
    }

    /**
     * The document table detection model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableDetectionModelVersion")
    private final String tableDetectionModelVersion;

    public String getTableDetectionModelVersion() {
        return tableDetectionModelVersion;
    }

    /**
     * The errors encountered during document analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<ProcessingError> errors;

    public java.util.List<ProcessingError> getErrors() {
        return errors;
    }

    /**
     * The searchable PDF file that was generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchablePdf")
    private final byte[] searchablePdf;

    public byte[] getSearchablePdf() {
        return searchablePdf;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeDocumentResult(");
        sb.append("documentMetadata=").append(String.valueOf(this.documentMetadata));
        sb.append(", pages=").append(String.valueOf(this.pages));
        sb.append(", detectedDocumentTypes=").append(String.valueOf(this.detectedDocumentTypes));
        sb.append(", detectedLanguages=").append(String.valueOf(this.detectedLanguages));
        sb.append(", documentClassificationModelVersion=")
                .append(String.valueOf(this.documentClassificationModelVersion));
        sb.append(", languageClassificationModelVersion=")
                .append(String.valueOf(this.languageClassificationModelVersion));
        sb.append(", textDetectionModelVersion=")
                .append(String.valueOf(this.textDetectionModelVersion));
        sb.append(", keyValueDetectionModelVersion=")
                .append(String.valueOf(this.keyValueDetectionModelVersion));
        sb.append(", tableDetectionModelVersion=")
                .append(String.valueOf(this.tableDetectionModelVersion));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(", searchablePdf=").append(String.valueOf(this.searchablePdf));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeDocumentResult)) {
            return false;
        }

        AnalyzeDocumentResult other = (AnalyzeDocumentResult) o;
        return java.util.Objects.equals(this.documentMetadata, other.documentMetadata)
                && java.util.Objects.equals(this.pages, other.pages)
                && java.util.Objects.equals(this.detectedDocumentTypes, other.detectedDocumentTypes)
                && java.util.Objects.equals(this.detectedLanguages, other.detectedLanguages)
                && java.util.Objects.equals(
                        this.documentClassificationModelVersion,
                        other.documentClassificationModelVersion)
                && java.util.Objects.equals(
                        this.languageClassificationModelVersion,
                        other.languageClassificationModelVersion)
                && java.util.Objects.equals(
                        this.textDetectionModelVersion, other.textDetectionModelVersion)
                && java.util.Objects.equals(
                        this.keyValueDetectionModelVersion, other.keyValueDetectionModelVersion)
                && java.util.Objects.equals(
                        this.tableDetectionModelVersion, other.tableDetectionModelVersion)
                && java.util.Objects.equals(this.errors, other.errors)
                && java.util.Objects.equals(this.searchablePdf, other.searchablePdf)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.documentMetadata == null ? 43 : this.documentMetadata.hashCode());
        result = (result * PRIME) + (this.pages == null ? 43 : this.pages.hashCode());
        result =
                (result * PRIME)
                        + (this.detectedDocumentTypes == null
                                ? 43
                                : this.detectedDocumentTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.detectedLanguages == null ? 43 : this.detectedLanguages.hashCode());
        result =
                (result * PRIME)
                        + (this.documentClassificationModelVersion == null
                                ? 43
                                : this.documentClassificationModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.languageClassificationModelVersion == null
                                ? 43
                                : this.languageClassificationModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.textDetectionModelVersion == null
                                ? 43
                                : this.textDetectionModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.keyValueDetectionModelVersion == null
                                ? 43
                                : this.keyValueDetectionModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.tableDetectionModelVersion == null
                                ? 43
                                : this.tableDetectionModelVersion.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result =
                (result * PRIME)
                        + (this.searchablePdf == null ? 43 : this.searchablePdf.hashCode());
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
