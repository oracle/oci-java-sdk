/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The document analysis results. <br>
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
        builder = AnalyzeDocumentResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnalyzeDocumentResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The array of a Page. */
        @com.fasterxml.jackson.annotation.JsonProperty("pages")
        private java.util.List<Page> pages;

        /**
         * The array of a Page.
         *
         * @param pages the value to set
         * @return this builder
         */
        public Builder pages(java.util.List<Page> pages) {
            this.pages = pages;
            this.__explicitlySet__.add("pages");
            return this;
        }
        /** An array of detected document types. */
        @com.fasterxml.jackson.annotation.JsonProperty("detectedDocumentTypes")
        private java.util.List<DetectedDocumentType> detectedDocumentTypes;

        /**
         * An array of detected document types.
         *
         * @param detectedDocumentTypes the value to set
         * @return this builder
         */
        public Builder detectedDocumentTypes(
                java.util.List<DetectedDocumentType> detectedDocumentTypes) {
            this.detectedDocumentTypes = detectedDocumentTypes;
            this.__explicitlySet__.add("detectedDocumentTypes");
            return this;
        }
        /** An array of detected languages. */
        @com.fasterxml.jackson.annotation.JsonProperty("detectedLanguages")
        private java.util.List<DetectedLanguage> detectedLanguages;

        /**
         * An array of detected languages.
         *
         * @param detectedLanguages the value to set
         * @return this builder
         */
        public Builder detectedLanguages(java.util.List<DetectedLanguage> detectedLanguages) {
            this.detectedLanguages = detectedLanguages;
            this.__explicitlySet__.add("detectedLanguages");
            return this;
        }
        /** The document classification model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("documentClassificationModelVersion")
        private String documentClassificationModelVersion;

        /**
         * The document classification model version.
         *
         * @param documentClassificationModelVersion the value to set
         * @return this builder
         */
        public Builder documentClassificationModelVersion(
                String documentClassificationModelVersion) {
            this.documentClassificationModelVersion = documentClassificationModelVersion;
            this.__explicitlySet__.add("documentClassificationModelVersion");
            return this;
        }
        /** The document language classification model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("languageClassificationModelVersion")
        private String languageClassificationModelVersion;

        /**
         * The document language classification model version.
         *
         * @param languageClassificationModelVersion the value to set
         * @return this builder
         */
        public Builder languageClassificationModelVersion(
                String languageClassificationModelVersion) {
            this.languageClassificationModelVersion = languageClassificationModelVersion;
            this.__explicitlySet__.add("languageClassificationModelVersion");
            return this;
        }
        /** The document text detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
        private String textDetectionModelVersion;

        /**
         * The document text detection model version.
         *
         * @param textDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder textDetectionModelVersion(String textDetectionModelVersion) {
            this.textDetectionModelVersion = textDetectionModelVersion;
            this.__explicitlySet__.add("textDetectionModelVersion");
            return this;
        }
        /** The document keyValue detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyValueDetectionModelVersion")
        private String keyValueDetectionModelVersion;

        /**
         * The document keyValue detection model version.
         *
         * @param keyValueDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder keyValueDetectionModelVersion(String keyValueDetectionModelVersion) {
            this.keyValueDetectionModelVersion = keyValueDetectionModelVersion;
            this.__explicitlySet__.add("keyValueDetectionModelVersion");
            return this;
        }
        /** The document table detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("tableDetectionModelVersion")
        private String tableDetectionModelVersion;

        /**
         * The document table detection model version.
         *
         * @param tableDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder tableDetectionModelVersion(String tableDetectionModelVersion) {
            this.tableDetectionModelVersion = tableDetectionModelVersion;
            this.__explicitlySet__.add("tableDetectionModelVersion");
            return this;
        }
        /** The errors encountered during document analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<ProcessingError> errors;

        /**
         * The errors encountered during document analysis.
         *
         * @param errors the value to set
         * @return this builder
         */
        public Builder errors(java.util.List<ProcessingError> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }
        /** The searchable PDF file that was generated. */
        @com.fasterxml.jackson.annotation.JsonProperty("searchablePdf")
        private byte[] searchablePdf;

        /**
         * The searchable PDF file that was generated.
         *
         * @param searchablePdf the value to set
         * @return this builder
         */
        public Builder searchablePdf(byte[] searchablePdf) {
            this.searchablePdf = searchablePdf;
            this.__explicitlySet__.add("searchablePdf");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyzeDocumentResult build() {
            AnalyzeDocumentResult model =
                    new AnalyzeDocumentResult(
                            this.documentMetadata,
                            this.pages,
                            this.detectedDocumentTypes,
                            this.detectedLanguages,
                            this.documentClassificationModelVersion,
                            this.languageClassificationModelVersion,
                            this.textDetectionModelVersion,
                            this.keyValueDetectionModelVersion,
                            this.tableDetectionModelVersion,
                            this.errors,
                            this.searchablePdf);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeDocumentResult model) {
            if (model.wasPropertyExplicitlySet("documentMetadata")) {
                this.documentMetadata(model.getDocumentMetadata());
            }
            if (model.wasPropertyExplicitlySet("pages")) {
                this.pages(model.getPages());
            }
            if (model.wasPropertyExplicitlySet("detectedDocumentTypes")) {
                this.detectedDocumentTypes(model.getDetectedDocumentTypes());
            }
            if (model.wasPropertyExplicitlySet("detectedLanguages")) {
                this.detectedLanguages(model.getDetectedLanguages());
            }
            if (model.wasPropertyExplicitlySet("documentClassificationModelVersion")) {
                this.documentClassificationModelVersion(
                        model.getDocumentClassificationModelVersion());
            }
            if (model.wasPropertyExplicitlySet("languageClassificationModelVersion")) {
                this.languageClassificationModelVersion(
                        model.getLanguageClassificationModelVersion());
            }
            if (model.wasPropertyExplicitlySet("textDetectionModelVersion")) {
                this.textDetectionModelVersion(model.getTextDetectionModelVersion());
            }
            if (model.wasPropertyExplicitlySet("keyValueDetectionModelVersion")) {
                this.keyValueDetectionModelVersion(model.getKeyValueDetectionModelVersion());
            }
            if (model.wasPropertyExplicitlySet("tableDetectionModelVersion")) {
                this.tableDetectionModelVersion(model.getTableDetectionModelVersion());
            }
            if (model.wasPropertyExplicitlySet("errors")) {
                this.errors(model.getErrors());
            }
            if (model.wasPropertyExplicitlySet("searchablePdf")) {
                this.searchablePdf(model.getSearchablePdf());
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

    @com.fasterxml.jackson.annotation.JsonProperty("documentMetadata")
    private final DocumentMetadata documentMetadata;

    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /** The array of a Page. */
    @com.fasterxml.jackson.annotation.JsonProperty("pages")
    private final java.util.List<Page> pages;

    /**
     * The array of a Page.
     *
     * @return the value
     */
    public java.util.List<Page> getPages() {
        return pages;
    }

    /** An array of detected document types. */
    @com.fasterxml.jackson.annotation.JsonProperty("detectedDocumentTypes")
    private final java.util.List<DetectedDocumentType> detectedDocumentTypes;

    /**
     * An array of detected document types.
     *
     * @return the value
     */
    public java.util.List<DetectedDocumentType> getDetectedDocumentTypes() {
        return detectedDocumentTypes;
    }

    /** An array of detected languages. */
    @com.fasterxml.jackson.annotation.JsonProperty("detectedLanguages")
    private final java.util.List<DetectedLanguage> detectedLanguages;

    /**
     * An array of detected languages.
     *
     * @return the value
     */
    public java.util.List<DetectedLanguage> getDetectedLanguages() {
        return detectedLanguages;
    }

    /** The document classification model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("documentClassificationModelVersion")
    private final String documentClassificationModelVersion;

    /**
     * The document classification model version.
     *
     * @return the value
     */
    public String getDocumentClassificationModelVersion() {
        return documentClassificationModelVersion;
    }

    /** The document language classification model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("languageClassificationModelVersion")
    private final String languageClassificationModelVersion;

    /**
     * The document language classification model version.
     *
     * @return the value
     */
    public String getLanguageClassificationModelVersion() {
        return languageClassificationModelVersion;
    }

    /** The document text detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
    private final String textDetectionModelVersion;

    /**
     * The document text detection model version.
     *
     * @return the value
     */
    public String getTextDetectionModelVersion() {
        return textDetectionModelVersion;
    }

    /** The document keyValue detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyValueDetectionModelVersion")
    private final String keyValueDetectionModelVersion;

    /**
     * The document keyValue detection model version.
     *
     * @return the value
     */
    public String getKeyValueDetectionModelVersion() {
        return keyValueDetectionModelVersion;
    }

    /** The document table detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("tableDetectionModelVersion")
    private final String tableDetectionModelVersion;

    /**
     * The document table detection model version.
     *
     * @return the value
     */
    public String getTableDetectionModelVersion() {
        return tableDetectionModelVersion;
    }

    /** The errors encountered during document analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<ProcessingError> errors;

    /**
     * The errors encountered during document analysis.
     *
     * @return the value
     */
    public java.util.List<ProcessingError> getErrors() {
        return errors;
    }

    /** The searchable PDF file that was generated. */
    @com.fasterxml.jackson.annotation.JsonProperty("searchablePdf")
    private final byte[] searchablePdf;

    /**
     * The searchable PDF file that was generated.
     *
     * @return the value
     */
    public byte[] getSearchablePdf() {
        return searchablePdf;
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
        sb.append("AnalyzeDocumentResult(");
        sb.append("super=").append(super.toString());
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
        sb.append(", searchablePdf=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.searchablePdf)
                                : (String.valueOf(this.searchablePdf)
                                        + (this.searchablePdf != null
                                                ? " (byte[" + this.searchablePdf.length + "])"
                                                : ""))));
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
                && java.util.Arrays.equals(this.searchablePdf, other.searchablePdf)
                && super.equals(other);
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
        result = (result * PRIME) + java.util.Arrays.hashCode(this.searchablePdf);
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
