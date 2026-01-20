/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * One page document analysis result. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Page.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Page extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pageNumber",
        "dimensions",
        "detectedDocumentTypes",
        "detectedLanguages",
        "words",
        "lines",
        "tables",
        "documentFields",
        "signatures",
        "barCodes",
        "selectionMarks"
    })
    public Page(
            Integer pageNumber,
            Dimensions dimensions,
            java.util.List<DetectedDocumentType> detectedDocumentTypes,
            java.util.List<DetectedLanguage> detectedLanguages,
            java.util.List<Word> words,
            java.util.List<Line> lines,
            java.util.List<Table> tables,
            java.util.List<DocumentField> documentFields,
            java.util.List<Signature> signatures,
            java.util.List<BarCode> barCodes,
            java.util.List<SelectionMark> selectionMarks) {
        super();
        this.pageNumber = pageNumber;
        this.dimensions = dimensions;
        this.detectedDocumentTypes = detectedDocumentTypes;
        this.detectedLanguages = detectedLanguages;
        this.words = words;
        this.lines = lines;
        this.tables = tables;
        this.documentFields = documentFields;
        this.signatures = signatures;
        this.barCodes = barCodes;
        this.selectionMarks = selectionMarks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The document page number. */
        @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
        private Integer pageNumber;

        /**
         * The document page number.
         *
         * @param pageNumber the value to set
         * @return this builder
         */
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
        /** The words detected on the page. */
        @com.fasterxml.jackson.annotation.JsonProperty("words")
        private java.util.List<Word> words;

        /**
         * The words detected on the page.
         *
         * @param words the value to set
         * @return this builder
         */
        public Builder words(java.util.List<Word> words) {
            this.words = words;
            this.__explicitlySet__.add("words");
            return this;
        }
        /** The lines of text detected on the page. */
        @com.fasterxml.jackson.annotation.JsonProperty("lines")
        private java.util.List<Line> lines;

        /**
         * The lines of text detected on the page.
         *
         * @param lines the value to set
         * @return this builder
         */
        public Builder lines(java.util.List<Line> lines) {
            this.lines = lines;
            this.__explicitlySet__.add("lines");
            return this;
        }
        /** The tables detected on the page. */
        @com.fasterxml.jackson.annotation.JsonProperty("tables")
        private java.util.List<Table> tables;

        /**
         * The tables detected on the page.
         *
         * @param tables the value to set
         * @return this builder
         */
        public Builder tables(java.util.List<Table> tables) {
            this.tables = tables;
            this.__explicitlySet__.add("tables");
            return this;
        }
        /** The form fields detected on the page. */
        @com.fasterxml.jackson.annotation.JsonProperty("documentFields")
        private java.util.List<DocumentField> documentFields;

        /**
         * The form fields detected on the page.
         *
         * @param documentFields the value to set
         * @return this builder
         */
        public Builder documentFields(java.util.List<DocumentField> documentFields) {
            this.documentFields = documentFields;
            this.__explicitlySet__.add("documentFields");
            return this;
        }
        /** The signatures detected on the page. */
        @com.fasterxml.jackson.annotation.JsonProperty("signatures")
        private java.util.List<Signature> signatures;

        /**
         * The signatures detected on the page.
         *
         * @param signatures the value to set
         * @return this builder
         */
        public Builder signatures(java.util.List<Signature> signatures) {
            this.signatures = signatures;
            this.__explicitlySet__.add("signatures");
            return this;
        }
        /** The bar codes detected on the page. */
        @com.fasterxml.jackson.annotation.JsonProperty("barCodes")
        private java.util.List<BarCode> barCodes;

        /**
         * The bar codes detected on the page.
         *
         * @param barCodes the value to set
         * @return this builder
         */
        public Builder barCodes(java.util.List<BarCode> barCodes) {
            this.barCodes = barCodes;
            this.__explicitlySet__.add("barCodes");
            return this;
        }
        /** The checkboxes and selection marks detected on the page. */
        @com.fasterxml.jackson.annotation.JsonProperty("selectionMarks")
        private java.util.List<SelectionMark> selectionMarks;

        /**
         * The checkboxes and selection marks detected on the page.
         *
         * @param selectionMarks the value to set
         * @return this builder
         */
        public Builder selectionMarks(java.util.List<SelectionMark> selectionMarks) {
            this.selectionMarks = selectionMarks;
            this.__explicitlySet__.add("selectionMarks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Page build() {
            Page model =
                    new Page(
                            this.pageNumber,
                            this.dimensions,
                            this.detectedDocumentTypes,
                            this.detectedLanguages,
                            this.words,
                            this.lines,
                            this.tables,
                            this.documentFields,
                            this.signatures,
                            this.barCodes,
                            this.selectionMarks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Page model) {
            if (model.wasPropertyExplicitlySet("pageNumber")) {
                this.pageNumber(model.getPageNumber());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("detectedDocumentTypes")) {
                this.detectedDocumentTypes(model.getDetectedDocumentTypes());
            }
            if (model.wasPropertyExplicitlySet("detectedLanguages")) {
                this.detectedLanguages(model.getDetectedLanguages());
            }
            if (model.wasPropertyExplicitlySet("words")) {
                this.words(model.getWords());
            }
            if (model.wasPropertyExplicitlySet("lines")) {
                this.lines(model.getLines());
            }
            if (model.wasPropertyExplicitlySet("tables")) {
                this.tables(model.getTables());
            }
            if (model.wasPropertyExplicitlySet("documentFields")) {
                this.documentFields(model.getDocumentFields());
            }
            if (model.wasPropertyExplicitlySet("signatures")) {
                this.signatures(model.getSignatures());
            }
            if (model.wasPropertyExplicitlySet("barCodes")) {
                this.barCodes(model.getBarCodes());
            }
            if (model.wasPropertyExplicitlySet("selectionMarks")) {
                this.selectionMarks(model.getSelectionMarks());
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

    /** The document page number. */
    @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
    private final Integer pageNumber;

    /**
     * The document page number.
     *
     * @return the value
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final Dimensions dimensions;

    public Dimensions getDimensions() {
        return dimensions;
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

    /** The words detected on the page. */
    @com.fasterxml.jackson.annotation.JsonProperty("words")
    private final java.util.List<Word> words;

    /**
     * The words detected on the page.
     *
     * @return the value
     */
    public java.util.List<Word> getWords() {
        return words;
    }

    /** The lines of text detected on the page. */
    @com.fasterxml.jackson.annotation.JsonProperty("lines")
    private final java.util.List<Line> lines;

    /**
     * The lines of text detected on the page.
     *
     * @return the value
     */
    public java.util.List<Line> getLines() {
        return lines;
    }

    /** The tables detected on the page. */
    @com.fasterxml.jackson.annotation.JsonProperty("tables")
    private final java.util.List<Table> tables;

    /**
     * The tables detected on the page.
     *
     * @return the value
     */
    public java.util.List<Table> getTables() {
        return tables;
    }

    /** The form fields detected on the page. */
    @com.fasterxml.jackson.annotation.JsonProperty("documentFields")
    private final java.util.List<DocumentField> documentFields;

    /**
     * The form fields detected on the page.
     *
     * @return the value
     */
    public java.util.List<DocumentField> getDocumentFields() {
        return documentFields;
    }

    /** The signatures detected on the page. */
    @com.fasterxml.jackson.annotation.JsonProperty("signatures")
    private final java.util.List<Signature> signatures;

    /**
     * The signatures detected on the page.
     *
     * @return the value
     */
    public java.util.List<Signature> getSignatures() {
        return signatures;
    }

    /** The bar codes detected on the page. */
    @com.fasterxml.jackson.annotation.JsonProperty("barCodes")
    private final java.util.List<BarCode> barCodes;

    /**
     * The bar codes detected on the page.
     *
     * @return the value
     */
    public java.util.List<BarCode> getBarCodes() {
        return barCodes;
    }

    /** The checkboxes and selection marks detected on the page. */
    @com.fasterxml.jackson.annotation.JsonProperty("selectionMarks")
    private final java.util.List<SelectionMark> selectionMarks;

    /**
     * The checkboxes and selection marks detected on the page.
     *
     * @return the value
     */
    public java.util.List<SelectionMark> getSelectionMarks() {
        return selectionMarks;
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
        sb.append("Page(");
        sb.append("super=").append(super.toString());
        sb.append("pageNumber=").append(String.valueOf(this.pageNumber));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", detectedDocumentTypes=").append(String.valueOf(this.detectedDocumentTypes));
        sb.append(", detectedLanguages=").append(String.valueOf(this.detectedLanguages));
        sb.append(", words=").append(String.valueOf(this.words));
        sb.append(", lines=").append(String.valueOf(this.lines));
        sb.append(", tables=").append(String.valueOf(this.tables));
        sb.append(", documentFields=").append(String.valueOf(this.documentFields));
        sb.append(", signatures=").append(String.valueOf(this.signatures));
        sb.append(", barCodes=").append(String.valueOf(this.barCodes));
        sb.append(", selectionMarks=").append(String.valueOf(this.selectionMarks));
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
                && java.util.Objects.equals(this.signatures, other.signatures)
                && java.util.Objects.equals(this.barCodes, other.barCodes)
                && java.util.Objects.equals(this.selectionMarks, other.selectionMarks)
                && super.equals(other);
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
        result = (result * PRIME) + (this.signatures == null ? 43 : this.signatures.hashCode());
        result = (result * PRIME) + (this.barCodes == null ? 43 : this.barCodes.hashCode());
        result =
                (result * PRIME)
                        + (this.selectionMarks == null ? 43 : this.selectionMarks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
