/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserSummary <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsParserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsParserSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "content",
        "description",
        "displayName",
        "editVersion",
        "encoding",
        "exampleContent",
        "fieldMaps",
        "footerContent",
        "headerContent",
        "name",
        "isDefault",
        "isSingleLineContent",
        "isSystem",
        "language",
        "timeUpdated",
        "logTypeTestRequestVersion",
        "mappedParsers",
        "parserIgnorelineCharacters",
        "isHidden",
        "parserSequence",
        "parserTimezone",
        "parserFilter",
        "isParserWrittenOnce",
        "parserFunctions",
        "sourcesCount",
        "sources",
        "shouldTokenizeOriginalText",
        "fieldDelimiter",
        "fieldQualifier",
        "type",
        "isUserDeleted",
        "isNamespaceAware"
    })
    public LogAnalyticsParserSummary(
            String content,
            String description,
            String displayName,
            Long editVersion,
            String encoding,
            String exampleContent,
            java.util.List<LogAnalyticsParserField> fieldMaps,
            String footerContent,
            String headerContent,
            String name,
            Boolean isDefault,
            Boolean isSingleLineContent,
            Boolean isSystem,
            String language,
            java.util.Date timeUpdated,
            Integer logTypeTestRequestVersion,
            java.util.List<LogAnalyticsParser> mappedParsers,
            String parserIgnorelineCharacters,
            Boolean isHidden,
            Integer parserSequence,
            String parserTimezone,
            LogAnalyticsParserFilter parserFilter,
            Boolean isParserWrittenOnce,
            java.util.List<LogAnalyticsParserFunction> parserFunctions,
            Long sourcesCount,
            java.util.List<LogAnalyticsSource> sources,
            Boolean shouldTokenizeOriginalText,
            String fieldDelimiter,
            String fieldQualifier,
            Type type,
            Boolean isUserDeleted,
            Boolean isNamespaceAware) {
        super();
        this.content = content;
        this.description = description;
        this.displayName = displayName;
        this.editVersion = editVersion;
        this.encoding = encoding;
        this.exampleContent = exampleContent;
        this.fieldMaps = fieldMaps;
        this.footerContent = footerContent;
        this.headerContent = headerContent;
        this.name = name;
        this.isDefault = isDefault;
        this.isSingleLineContent = isSingleLineContent;
        this.isSystem = isSystem;
        this.language = language;
        this.timeUpdated = timeUpdated;
        this.logTypeTestRequestVersion = logTypeTestRequestVersion;
        this.mappedParsers = mappedParsers;
        this.parserIgnorelineCharacters = parserIgnorelineCharacters;
        this.isHidden = isHidden;
        this.parserSequence = parserSequence;
        this.parserTimezone = parserTimezone;
        this.parserFilter = parserFilter;
        this.isParserWrittenOnce = isParserWrittenOnce;
        this.parserFunctions = parserFunctions;
        this.sourcesCount = sourcesCount;
        this.sources = sources;
        this.shouldTokenizeOriginalText = shouldTokenizeOriginalText;
        this.fieldDelimiter = fieldDelimiter;
        this.fieldQualifier = fieldQualifier;
        this.type = type;
        this.isUserDeleted = isUserDeleted;
        this.isNamespaceAware = isNamespaceAware;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The content. */
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * The content.
         *
         * @param content the value to set
         * @return this builder
         */
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /** The parser description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The parser description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The parser display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The parser display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The parser edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The parser edit version.
         *
         * @param editVersion the value to set
         * @return this builder
         */
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /** The encoding. */
        @com.fasterxml.jackson.annotation.JsonProperty("encoding")
        private String encoding;

        /**
         * The encoding.
         *
         * @param encoding the value to set
         * @return this builder
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            this.__explicitlySet__.add("encoding");
            return this;
        }
        /** The example content. */
        @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
        private String exampleContent;

        /**
         * The example content.
         *
         * @param exampleContent the value to set
         * @return this builder
         */
        public Builder exampleContent(String exampleContent) {
            this.exampleContent = exampleContent;
            this.__explicitlySet__.add("exampleContent");
            return this;
        }
        /** The parser fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldMaps")
        private java.util.List<LogAnalyticsParserField> fieldMaps;

        /**
         * The parser fields.
         *
         * @param fieldMaps the value to set
         * @return this builder
         */
        public Builder fieldMaps(java.util.List<LogAnalyticsParserField> fieldMaps) {
            this.fieldMaps = fieldMaps;
            this.__explicitlySet__.add("fieldMaps");
            return this;
        }
        /** The footer regular expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("footerContent")
        private String footerContent;

        /**
         * The footer regular expression.
         *
         * @param footerContent the value to set
         * @return this builder
         */
        public Builder footerContent(String footerContent) {
            this.footerContent = footerContent;
            this.__explicitlySet__.add("footerContent");
            return this;
        }
        /** The header content. */
        @com.fasterxml.jackson.annotation.JsonProperty("headerContent")
        private String headerContent;

        /**
         * The header content.
         *
         * @param headerContent the value to set
         * @return this builder
         */
        public Builder headerContent(String headerContent) {
            this.headerContent = headerContent;
            this.__explicitlySet__.add("headerContent");
            return this;
        }
        /** The parser name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The parser name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A flag indicating if this is a default parser. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * A flag indicating if this is a default parser.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /** A flag indicating if this is a single line content parser. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSingleLineContent")
        private Boolean isSingleLineContent;

        /**
         * A flag indicating if this is a single line content parser.
         *
         * @param isSingleLineContent the value to set
         * @return this builder
         */
        public Builder isSingleLineContent(Boolean isSingleLineContent) {
            this.isSingleLineContent = isSingleLineContent;
            this.__explicitlySet__.add("isSingleLineContent");
            return this;
        }
        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         */
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /** The language. */
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private String language;

        /**
         * The language.
         *
         * @param language the value to set
         * @return this builder
         */
        public Builder language(String language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }
        /** The last updated date. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last updated date.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The log type test request version. */
        @com.fasterxml.jackson.annotation.JsonProperty("logTypeTestRequestVersion")
        private Integer logTypeTestRequestVersion;

        /**
         * The log type test request version.
         *
         * @param logTypeTestRequestVersion the value to set
         * @return this builder
         */
        public Builder logTypeTestRequestVersion(Integer logTypeTestRequestVersion) {
            this.logTypeTestRequestVersion = logTypeTestRequestVersion;
            this.__explicitlySet__.add("logTypeTestRequestVersion");
            return this;
        }
        /** The mapped parser list. */
        @com.fasterxml.jackson.annotation.JsonProperty("mappedParsers")
        private java.util.List<LogAnalyticsParser> mappedParsers;

        /**
         * The mapped parser list.
         *
         * @param mappedParsers the value to set
         * @return this builder
         */
        public Builder mappedParsers(java.util.List<LogAnalyticsParser> mappedParsers) {
            this.mappedParsers = mappedParsers;
            this.__explicitlySet__.add("mappedParsers");
            return this;
        }
        /** The line characters for the parser to ignore. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserIgnorelineCharacters")
        private String parserIgnorelineCharacters;

        /**
         * The line characters for the parser to ignore.
         *
         * @param parserIgnorelineCharacters the value to set
         * @return this builder
         */
        public Builder parserIgnorelineCharacters(String parserIgnorelineCharacters) {
            this.parserIgnorelineCharacters = parserIgnorelineCharacters;
            this.__explicitlySet__.add("parserIgnorelineCharacters");
            return this;
        }
        /** A flag indicating if the parser is hidden or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        /**
         * A flag indicating if the parser is hidden or not.
         *
         * @param isHidden the value to set
         * @return this builder
         */
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }
        /** The parser sequence. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserSequence")
        private Integer parserSequence;

        /**
         * The parser sequence.
         *
         * @param parserSequence the value to set
         * @return this builder
         */
        public Builder parserSequence(Integer parserSequence) {
            this.parserSequence = parserSequence;
            this.__explicitlySet__.add("parserSequence");
            return this;
        }
        /** The time zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserTimezone")
        private String parserTimezone;

        /**
         * The time zone.
         *
         * @param parserTimezone the value to set
         * @return this builder
         */
        public Builder parserTimezone(String parserTimezone) {
            this.parserTimezone = parserTimezone;
            this.__explicitlySet__.add("parserTimezone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFilter")
        private LogAnalyticsParserFilter parserFilter;

        public Builder parserFilter(LogAnalyticsParserFilter parserFilter) {
            this.parserFilter = parserFilter;
            this.__explicitlySet__.add("parserFilter");
            return this;
        }
        /** A flag indicating whther or not the parser is write once. */
        @com.fasterxml.jackson.annotation.JsonProperty("isParserWrittenOnce")
        private Boolean isParserWrittenOnce;

        /**
         * A flag indicating whther or not the parser is write once.
         *
         * @param isParserWrittenOnce the value to set
         * @return this builder
         */
        public Builder isParserWrittenOnce(Boolean isParserWrittenOnce) {
            this.isParserWrittenOnce = isParserWrittenOnce;
            this.__explicitlySet__.add("isParserWrittenOnce");
            return this;
        }
        /** The parser function list. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctions")
        private java.util.List<LogAnalyticsParserFunction> parserFunctions;

        /**
         * The parser function list.
         *
         * @param parserFunctions the value to set
         * @return this builder
         */
        public Builder parserFunctions(java.util.List<LogAnalyticsParserFunction> parserFunctions) {
            this.parserFunctions = parserFunctions;
            this.__explicitlySet__.add("parserFunctions");
            return this;
        }
        /** The number of sources using this parser. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourcesCount")
        private Long sourcesCount;

        /**
         * The number of sources using this parser.
         *
         * @param sourcesCount the value to set
         * @return this builder
         */
        public Builder sourcesCount(Long sourcesCount) {
            this.sourcesCount = sourcesCount;
            this.__explicitlySet__.add("sourcesCount");
            return this;
        }
        /** The list of sources using this parser. */
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<LogAnalyticsSource> sources;

        /**
         * The list of sources using this parser.
         *
         * @param sources the value to set
         * @return this builder
         */
        public Builder sources(java.util.List<LogAnalyticsSource> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }
        /** A flag indicating whether or not to tokenize the original text. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldTokenizeOriginalText")
        private Boolean shouldTokenizeOriginalText;

        /**
         * A flag indicating whether or not to tokenize the original text.
         *
         * @param shouldTokenizeOriginalText the value to set
         * @return this builder
         */
        public Builder shouldTokenizeOriginalText(Boolean shouldTokenizeOriginalText) {
            this.shouldTokenizeOriginalText = shouldTokenizeOriginalText;
            this.__explicitlySet__.add("shouldTokenizeOriginalText");
            return this;
        }
        /** The parser field delimiter. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldDelimiter")
        private String fieldDelimiter;

        /**
         * The parser field delimiter.
         *
         * @param fieldDelimiter the value to set
         * @return this builder
         */
        public Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            this.__explicitlySet__.add("fieldDelimiter");
            return this;
        }
        /** The parser field qualifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldQualifier")
        private String fieldQualifier;

        /**
         * The parser field qualifier.
         *
         * @param fieldQualifier the value to set
         * @return this builder
         */
        public Builder fieldQualifier(String fieldQualifier) {
            this.fieldQualifier = fieldQualifier;
            this.__explicitlySet__.add("fieldQualifier");
            return this;
        }
        /** The parser type. Default value is REGEX. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The parser type. Default value is REGEX.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** A flag indicating whether or not the parser has been deleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
        private Boolean isUserDeleted;

        /**
         * A flag indicating whether or not the parser has been deleted.
         *
         * @param isUserDeleted the value to set
         * @return this builder
         */
        public Builder isUserDeleted(Boolean isUserDeleted) {
            this.isUserDeleted = isUserDeleted;
            this.__explicitlySet__.add("isUserDeleted");
            return this;
        }
        /**
         * A flag indicating whether the XML parser should consider the namespace(s) while
         * processing the log data.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isNamespaceAware")
        private Boolean isNamespaceAware;

        /**
         * A flag indicating whether the XML parser should consider the namespace(s) while
         * processing the log data.
         *
         * @param isNamespaceAware the value to set
         * @return this builder
         */
        public Builder isNamespaceAware(Boolean isNamespaceAware) {
            this.isNamespaceAware = isNamespaceAware;
            this.__explicitlySet__.add("isNamespaceAware");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserSummary build() {
            LogAnalyticsParserSummary model =
                    new LogAnalyticsParserSummary(
                            this.content,
                            this.description,
                            this.displayName,
                            this.editVersion,
                            this.encoding,
                            this.exampleContent,
                            this.fieldMaps,
                            this.footerContent,
                            this.headerContent,
                            this.name,
                            this.isDefault,
                            this.isSingleLineContent,
                            this.isSystem,
                            this.language,
                            this.timeUpdated,
                            this.logTypeTestRequestVersion,
                            this.mappedParsers,
                            this.parserIgnorelineCharacters,
                            this.isHidden,
                            this.parserSequence,
                            this.parserTimezone,
                            this.parserFilter,
                            this.isParserWrittenOnce,
                            this.parserFunctions,
                            this.sourcesCount,
                            this.sources,
                            this.shouldTokenizeOriginalText,
                            this.fieldDelimiter,
                            this.fieldQualifier,
                            this.type,
                            this.isUserDeleted,
                            this.isNamespaceAware);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserSummary model) {
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("editVersion")) {
                this.editVersion(model.getEditVersion());
            }
            if (model.wasPropertyExplicitlySet("encoding")) {
                this.encoding(model.getEncoding());
            }
            if (model.wasPropertyExplicitlySet("exampleContent")) {
                this.exampleContent(model.getExampleContent());
            }
            if (model.wasPropertyExplicitlySet("fieldMaps")) {
                this.fieldMaps(model.getFieldMaps());
            }
            if (model.wasPropertyExplicitlySet("footerContent")) {
                this.footerContent(model.getFooterContent());
            }
            if (model.wasPropertyExplicitlySet("headerContent")) {
                this.headerContent(model.getHeaderContent());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("isSingleLineContent")) {
                this.isSingleLineContent(model.getIsSingleLineContent());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("logTypeTestRequestVersion")) {
                this.logTypeTestRequestVersion(model.getLogTypeTestRequestVersion());
            }
            if (model.wasPropertyExplicitlySet("mappedParsers")) {
                this.mappedParsers(model.getMappedParsers());
            }
            if (model.wasPropertyExplicitlySet("parserIgnorelineCharacters")) {
                this.parserIgnorelineCharacters(model.getParserIgnorelineCharacters());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("parserSequence")) {
                this.parserSequence(model.getParserSequence());
            }
            if (model.wasPropertyExplicitlySet("parserTimezone")) {
                this.parserTimezone(model.getParserTimezone());
            }
            if (model.wasPropertyExplicitlySet("parserFilter")) {
                this.parserFilter(model.getParserFilter());
            }
            if (model.wasPropertyExplicitlySet("isParserWrittenOnce")) {
                this.isParserWrittenOnce(model.getIsParserWrittenOnce());
            }
            if (model.wasPropertyExplicitlySet("parserFunctions")) {
                this.parserFunctions(model.getParserFunctions());
            }
            if (model.wasPropertyExplicitlySet("sourcesCount")) {
                this.sourcesCount(model.getSourcesCount());
            }
            if (model.wasPropertyExplicitlySet("sources")) {
                this.sources(model.getSources());
            }
            if (model.wasPropertyExplicitlySet("shouldTokenizeOriginalText")) {
                this.shouldTokenizeOriginalText(model.getShouldTokenizeOriginalText());
            }
            if (model.wasPropertyExplicitlySet("fieldDelimiter")) {
                this.fieldDelimiter(model.getFieldDelimiter());
            }
            if (model.wasPropertyExplicitlySet("fieldQualifier")) {
                this.fieldQualifier(model.getFieldQualifier());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isUserDeleted")) {
                this.isUserDeleted(model.getIsUserDeleted());
            }
            if (model.wasPropertyExplicitlySet("isNamespaceAware")) {
                this.isNamespaceAware(model.getIsNamespaceAware());
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

    /** The content. */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * The content.
     *
     * @return the value
     */
    public String getContent() {
        return content;
    }

    /** The parser description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The parser description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The parser display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The parser display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The parser edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The parser edit version.
     *
     * @return the value
     */
    public Long getEditVersion() {
        return editVersion;
    }

    /** The encoding. */
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    private final String encoding;

    /**
     * The encoding.
     *
     * @return the value
     */
    public String getEncoding() {
        return encoding;
    }

    /** The example content. */
    @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
    private final String exampleContent;

    /**
     * The example content.
     *
     * @return the value
     */
    public String getExampleContent() {
        return exampleContent;
    }

    /** The parser fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldMaps")
    private final java.util.List<LogAnalyticsParserField> fieldMaps;

    /**
     * The parser fields.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParserField> getFieldMaps() {
        return fieldMaps;
    }

    /** The footer regular expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("footerContent")
    private final String footerContent;

    /**
     * The footer regular expression.
     *
     * @return the value
     */
    public String getFooterContent() {
        return footerContent;
    }

    /** The header content. */
    @com.fasterxml.jackson.annotation.JsonProperty("headerContent")
    private final String headerContent;

    /**
     * The header content.
     *
     * @return the value
     */
    public String getHeaderContent() {
        return headerContent;
    }

    /** The parser name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The parser name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A flag indicating if this is a default parser. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * A flag indicating if this is a default parser.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /** A flag indicating if this is a single line content parser. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleLineContent")
    private final Boolean isSingleLineContent;

    /**
     * A flag indicating if this is a single line content parser.
     *
     * @return the value
     */
    public Boolean getIsSingleLineContent() {
        return isSingleLineContent;
    }

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     *
     * @return the value
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /** The language. */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final String language;

    /**
     * The language.
     *
     * @return the value
     */
    public String getLanguage() {
        return language;
    }

    /** The last updated date. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last updated date.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The log type test request version. */
    @com.fasterxml.jackson.annotation.JsonProperty("logTypeTestRequestVersion")
    private final Integer logTypeTestRequestVersion;

    /**
     * The log type test request version.
     *
     * @return the value
     */
    public Integer getLogTypeTestRequestVersion() {
        return logTypeTestRequestVersion;
    }

    /** The mapped parser list. */
    @com.fasterxml.jackson.annotation.JsonProperty("mappedParsers")
    private final java.util.List<LogAnalyticsParser> mappedParsers;

    /**
     * The mapped parser list.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParser> getMappedParsers() {
        return mappedParsers;
    }

    /** The line characters for the parser to ignore. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserIgnorelineCharacters")
    private final String parserIgnorelineCharacters;

    /**
     * The line characters for the parser to ignore.
     *
     * @return the value
     */
    public String getParserIgnorelineCharacters() {
        return parserIgnorelineCharacters;
    }

    /** A flag indicating if the parser is hidden or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    /**
     * A flag indicating if the parser is hidden or not.
     *
     * @return the value
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    /** The parser sequence. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserSequence")
    private final Integer parserSequence;

    /**
     * The parser sequence.
     *
     * @return the value
     */
    public Integer getParserSequence() {
        return parserSequence;
    }

    /** The time zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserTimezone")
    private final String parserTimezone;

    /**
     * The time zone.
     *
     * @return the value
     */
    public String getParserTimezone() {
        return parserTimezone;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parserFilter")
    private final LogAnalyticsParserFilter parserFilter;

    public LogAnalyticsParserFilter getParserFilter() {
        return parserFilter;
    }

    /** A flag indicating whther or not the parser is write once. */
    @com.fasterxml.jackson.annotation.JsonProperty("isParserWrittenOnce")
    private final Boolean isParserWrittenOnce;

    /**
     * A flag indicating whther or not the parser is write once.
     *
     * @return the value
     */
    public Boolean getIsParserWrittenOnce() {
        return isParserWrittenOnce;
    }

    /** The parser function list. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctions")
    private final java.util.List<LogAnalyticsParserFunction> parserFunctions;

    /**
     * The parser function list.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParserFunction> getParserFunctions() {
        return parserFunctions;
    }

    /** The number of sources using this parser. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourcesCount")
    private final Long sourcesCount;

    /**
     * The number of sources using this parser.
     *
     * @return the value
     */
    public Long getSourcesCount() {
        return sourcesCount;
    }

    /** The list of sources using this parser. */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<LogAnalyticsSource> sources;

    /**
     * The list of sources using this parser.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSource> getSources() {
        return sources;
    }

    /** A flag indicating whether or not to tokenize the original text. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldTokenizeOriginalText")
    private final Boolean shouldTokenizeOriginalText;

    /**
     * A flag indicating whether or not to tokenize the original text.
     *
     * @return the value
     */
    public Boolean getShouldTokenizeOriginalText() {
        return shouldTokenizeOriginalText;
    }

    /** The parser field delimiter. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldDelimiter")
    private final String fieldDelimiter;

    /**
     * The parser field delimiter.
     *
     * @return the value
     */
    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    /** The parser field qualifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldQualifier")
    private final String fieldQualifier;

    /**
     * The parser field qualifier.
     *
     * @return the value
     */
    public String getFieldQualifier() {
        return fieldQualifier;
    }

    /** The parser type. Default value is REGEX. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Xml("XML"),
        Json("JSON"),
        Regex("REGEX"),
        Odl("ODL"),
        Delimited("DELIMITED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The parser type. Default value is REGEX. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The parser type. Default value is REGEX.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** A flag indicating whether or not the parser has been deleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
    private final Boolean isUserDeleted;

    /**
     * A flag indicating whether or not the parser has been deleted.
     *
     * @return the value
     */
    public Boolean getIsUserDeleted() {
        return isUserDeleted;
    }

    /**
     * A flag indicating whether the XML parser should consider the namespace(s) while processing
     * the log data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isNamespaceAware")
    private final Boolean isNamespaceAware;

    /**
     * A flag indicating whether the XML parser should consider the namespace(s) while processing
     * the log data.
     *
     * @return the value
     */
    public Boolean getIsNamespaceAware() {
        return isNamespaceAware;
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
        sb.append("LogAnalyticsParserSummary(");
        sb.append("super=").append(super.toString());
        sb.append("content=").append(String.valueOf(this.content));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", encoding=").append(String.valueOf(this.encoding));
        sb.append(", exampleContent=").append(String.valueOf(this.exampleContent));
        sb.append(", fieldMaps=").append(String.valueOf(this.fieldMaps));
        sb.append(", footerContent=").append(String.valueOf(this.footerContent));
        sb.append(", headerContent=").append(String.valueOf(this.headerContent));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", isSingleLineContent=").append(String.valueOf(this.isSingleLineContent));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", logTypeTestRequestVersion=")
                .append(String.valueOf(this.logTypeTestRequestVersion));
        sb.append(", mappedParsers=").append(String.valueOf(this.mappedParsers));
        sb.append(", parserIgnorelineCharacters=")
                .append(String.valueOf(this.parserIgnorelineCharacters));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(", parserSequence=").append(String.valueOf(this.parserSequence));
        sb.append(", parserTimezone=").append(String.valueOf(this.parserTimezone));
        sb.append(", parserFilter=").append(String.valueOf(this.parserFilter));
        sb.append(", isParserWrittenOnce=").append(String.valueOf(this.isParserWrittenOnce));
        sb.append(", parserFunctions=").append(String.valueOf(this.parserFunctions));
        sb.append(", sourcesCount=").append(String.valueOf(this.sourcesCount));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", shouldTokenizeOriginalText=")
                .append(String.valueOf(this.shouldTokenizeOriginalText));
        sb.append(", fieldDelimiter=").append(String.valueOf(this.fieldDelimiter));
        sb.append(", fieldQualifier=").append(String.valueOf(this.fieldQualifier));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isUserDeleted=").append(String.valueOf(this.isUserDeleted));
        sb.append(", isNamespaceAware=").append(String.valueOf(this.isNamespaceAware));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsParserSummary)) {
            return false;
        }

        LogAnalyticsParserSummary other = (LogAnalyticsParserSummary) o;
        return java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.encoding, other.encoding)
                && java.util.Objects.equals(this.exampleContent, other.exampleContent)
                && java.util.Objects.equals(this.fieldMaps, other.fieldMaps)
                && java.util.Objects.equals(this.footerContent, other.footerContent)
                && java.util.Objects.equals(this.headerContent, other.headerContent)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.isSingleLineContent, other.isSingleLineContent)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.language, other.language)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.logTypeTestRequestVersion, other.logTypeTestRequestVersion)
                && java.util.Objects.equals(this.mappedParsers, other.mappedParsers)
                && java.util.Objects.equals(
                        this.parserIgnorelineCharacters, other.parserIgnorelineCharacters)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.parserSequence, other.parserSequence)
                && java.util.Objects.equals(this.parserTimezone, other.parserTimezone)
                && java.util.Objects.equals(this.parserFilter, other.parserFilter)
                && java.util.Objects.equals(this.isParserWrittenOnce, other.isParserWrittenOnce)
                && java.util.Objects.equals(this.parserFunctions, other.parserFunctions)
                && java.util.Objects.equals(this.sourcesCount, other.sourcesCount)
                && java.util.Objects.equals(this.sources, other.sources)
                && java.util.Objects.equals(
                        this.shouldTokenizeOriginalText, other.shouldTokenizeOriginalText)
                && java.util.Objects.equals(this.fieldDelimiter, other.fieldDelimiter)
                && java.util.Objects.equals(this.fieldQualifier, other.fieldQualifier)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isUserDeleted, other.isUserDeleted)
                && java.util.Objects.equals(this.isNamespaceAware, other.isNamespaceAware)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result = (result * PRIME) + (this.encoding == null ? 43 : this.encoding.hashCode());
        result =
                (result * PRIME)
                        + (this.exampleContent == null ? 43 : this.exampleContent.hashCode());
        result = (result * PRIME) + (this.fieldMaps == null ? 43 : this.fieldMaps.hashCode());
        result =
                (result * PRIME)
                        + (this.footerContent == null ? 43 : this.footerContent.hashCode());
        result =
                (result * PRIME)
                        + (this.headerContent == null ? 43 : this.headerContent.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.isSingleLineContent == null
                                ? 43
                                : this.isSingleLineContent.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.logTypeTestRequestVersion == null
                                ? 43
                                : this.logTypeTestRequestVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.mappedParsers == null ? 43 : this.mappedParsers.hashCode());
        result =
                (result * PRIME)
                        + (this.parserIgnorelineCharacters == null
                                ? 43
                                : this.parserIgnorelineCharacters.hashCode());
        result = (result * PRIME) + (this.isHidden == null ? 43 : this.isHidden.hashCode());
        result =
                (result * PRIME)
                        + (this.parserSequence == null ? 43 : this.parserSequence.hashCode());
        result =
                (result * PRIME)
                        + (this.parserTimezone == null ? 43 : this.parserTimezone.hashCode());
        result = (result * PRIME) + (this.parserFilter == null ? 43 : this.parserFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.isParserWrittenOnce == null
                                ? 43
                                : this.isParserWrittenOnce.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFunctions == null ? 43 : this.parserFunctions.hashCode());
        result = (result * PRIME) + (this.sourcesCount == null ? 43 : this.sourcesCount.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldTokenizeOriginalText == null
                                ? 43
                                : this.shouldTokenizeOriginalText.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldDelimiter == null ? 43 : this.fieldDelimiter.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldQualifier == null ? 43 : this.fieldQualifier.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserDeleted == null ? 43 : this.isUserDeleted.hashCode());
        result =
                (result * PRIME)
                        + (this.isNamespaceAware == null ? 43 : this.isNamespaceAware.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
