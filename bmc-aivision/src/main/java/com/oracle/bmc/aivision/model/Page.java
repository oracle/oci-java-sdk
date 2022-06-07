/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * One page document analysis result.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Page.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Page {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pageNumber",
        "dimensions",
        "detectedDocumentTypes",
        "detectedLanguages",
        "words",
        "lines",
        "tables",
        "documentFields"
    })
    public Page(
            Integer pageNumber,
            Dimensions dimensions,
            java.util.List<DetectedDocumentType> detectedDocumentTypes,
            java.util.List<DetectedLanguage> detectedLanguages,
            java.util.List<Word> words,
            java.util.List<Line> lines,
            java.util.List<Table> tables,
            java.util.List<DocumentField> documentFields) {
        super();
        this.pageNumber = pageNumber;
        this.dimensions = dimensions;
        this.detectedDocumentTypes = detectedDocumentTypes;
        this.detectedLanguages = detectedLanguages;
        this.words = words;
        this.lines = lines;
        this.tables = tables;
        this.documentFields = documentFields;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
        private Integer pageNumber;

        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            this.__explicitlySet__.add("pageNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private Dimensions dimensions;

        public Builder dimensions(Dimensions dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
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

        @com.fasterxml.jackson.annotation.JsonProperty("words")
        private java.util.List<Word> words;

        public Builder words(java.util.List<Word> words) {
            this.words = words;
            this.__explicitlySet__.add("words");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lines")
        private java.util.List<Line> lines;

        public Builder lines(java.util.List<Line> lines) {
            this.lines = lines;
            this.__explicitlySet__.add("lines");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tables")
        private java.util.List<Table> tables;

        public Builder tables(java.util.List<Table> tables) {
            this.tables = tables;
            this.__explicitlySet__.add("tables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("documentFields")
        private java.util.List<DocumentField> documentFields;

        public Builder documentFields(java.util.List<DocumentField> documentFields) {
            this.documentFields = documentFields;
            this.__explicitlySet__.add("documentFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Page build() {
            Page __instance__ =
                    new Page(
                            pageNumber,
                            dimensions,
                            detectedDocumentTypes,
                            detectedLanguages,
                            words,
                            lines,
                            tables,
                            documentFields);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Page o) {
            Builder copiedBuilder =
                    pageNumber(o.getPageNumber())
                            .dimensions(o.getDimensions())
                            .detectedDocumentTypes(o.getDetectedDocumentTypes())
                            .detectedLanguages(o.getDetectedLanguages())
                            .words(o.getWords())
                            .lines(o.getLines())
                            .tables(o.getTables())
                            .documentFields(o.getDocumentFields());

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
     * The document page number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
    private final Integer pageNumber;

    public Integer getPageNumber() {
        return pageNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final Dimensions dimensions;

    public Dimensions getDimensions() {
        return dimensions;
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
     * The words detected on the page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("words")
    private final java.util.List<Word> words;

    public java.util.List<Word> getWords() {
        return words;
    }

    /**
     * The lines of text detected on the page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lines")
    private final java.util.List<Line> lines;

    public java.util.List<Line> getLines() {
        return lines;
    }

    /**
     * The tables detected on the page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tables")
    private final java.util.List<Table> tables;

    public java.util.List<Table> getTables() {
        return tables;
    }

    /**
     * The form fields detected on the page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentFields")
    private final java.util.List<DocumentField> documentFields;

    public java.util.List<DocumentField> getDocumentFields() {
        return documentFields;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Page(");
        sb.append("pageNumber=").append(String.valueOf(this.pageNumber));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", detectedDocumentTypes=").append(String.valueOf(this.detectedDocumentTypes));
        sb.append(", detectedLanguages=").append(String.valueOf(this.detectedLanguages));
        sb.append(", words=").append(String.valueOf(this.words));
        sb.append(", lines=").append(String.valueOf(this.lines));
        sb.append(", tables=").append(String.valueOf(this.tables));
        sb.append(", documentFields=").append(String.valueOf(this.documentFields));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Page)) {
            return false;
        }

        Page other = (Page) o;
        return java.util.Objects.equals(this.pageNumber, other.pageNumber)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.detectedDocumentTypes, other.detectedDocumentTypes)
                && java.util.Objects.equals(this.detectedLanguages, other.detectedLanguages)
                && java.util.Objects.equals(this.words, other.words)
                && java.util.Objects.equals(this.lines, other.lines)
                && java.util.Objects.equals(this.tables, other.tables)
                && java.util.Objects.equals(this.documentFields, other.documentFields)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pageNumber == null ? 43 : this.pageNumber.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.detectedDocumentTypes == null
                                ? 43
                                : this.detectedDocumentTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.detectedLanguages == null ? 43 : this.detectedLanguages.hashCode());
        result = (result * PRIME) + (this.words == null ? 43 : this.words.hashCode());
        result = (result * PRIME) + (this.lines == null ? 43 : this.lines.hashCode());
        result = (result * PRIME) + (this.tables == null ? 43 : this.tables.hashCode());
        result =
                (result * PRIME)
                        + (this.documentFields == null ? 43 : this.documentFields.hashCode());
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
