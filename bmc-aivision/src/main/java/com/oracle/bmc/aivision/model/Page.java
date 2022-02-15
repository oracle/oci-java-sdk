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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Page.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Page {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Document page number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
    Integer pageNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    Dimensions dimensions;

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
     * Words detected on the page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("words")
    java.util.List<Word> words;

    /**
     * Text lines detected on the page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lines")
    java.util.List<Line> lines;

    /**
     * Tables detected on the page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tables")
    java.util.List<Table> tables;

    /**
     * Form fields detected on the page.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentFields")
    java.util.List<DocumentField> documentFields;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
