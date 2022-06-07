/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserSummary
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsParserSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsParserSummary {
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
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encoding")
        private String encoding;

        public Builder encoding(String encoding) {
            this.encoding = encoding;
            this.__explicitlySet__.add("encoding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
        private String exampleContent;

        public Builder exampleContent(String exampleContent) {
            this.exampleContent = exampleContent;
            this.__explicitlySet__.add("exampleContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldMaps")
        private java.util.List<LogAnalyticsParserField> fieldMaps;

        public Builder fieldMaps(java.util.List<LogAnalyticsParserField> fieldMaps) {
            this.fieldMaps = fieldMaps;
            this.__explicitlySet__.add("fieldMaps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("footerContent")
        private String footerContent;

        public Builder footerContent(String footerContent) {
            this.footerContent = footerContent;
            this.__explicitlySet__.add("footerContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerContent")
        private String headerContent;

        public Builder headerContent(String headerContent) {
            this.headerContent = headerContent;
            this.__explicitlySet__.add("headerContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSingleLineContent")
        private Boolean isSingleLineContent;

        public Builder isSingleLineContent(Boolean isSingleLineContent) {
            this.isSingleLineContent = isSingleLineContent;
            this.__explicitlySet__.add("isSingleLineContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private String language;

        public Builder language(String language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logTypeTestRequestVersion")
        private Integer logTypeTestRequestVersion;

        public Builder logTypeTestRequestVersion(Integer logTypeTestRequestVersion) {
            this.logTypeTestRequestVersion = logTypeTestRequestVersion;
            this.__explicitlySet__.add("logTypeTestRequestVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mappedParsers")
        private java.util.List<LogAnalyticsParser> mappedParsers;

        public Builder mappedParsers(java.util.List<LogAnalyticsParser> mappedParsers) {
            this.mappedParsers = mappedParsers;
            this.__explicitlySet__.add("mappedParsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserIgnorelineCharacters")
        private String parserIgnorelineCharacters;

        public Builder parserIgnorelineCharacters(String parserIgnorelineCharacters) {
            this.parserIgnorelineCharacters = parserIgnorelineCharacters;
            this.__explicitlySet__.add("parserIgnorelineCharacters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserSequence")
        private Integer parserSequence;

        public Builder parserSequence(Integer parserSequence) {
            this.parserSequence = parserSequence;
            this.__explicitlySet__.add("parserSequence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserTimezone")
        private String parserTimezone;

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

        @com.fasterxml.jackson.annotation.JsonProperty("isParserWrittenOnce")
        private Boolean isParserWrittenOnce;

        public Builder isParserWrittenOnce(Boolean isParserWrittenOnce) {
            this.isParserWrittenOnce = isParserWrittenOnce;
            this.__explicitlySet__.add("isParserWrittenOnce");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctions")
        private java.util.List<LogAnalyticsParserFunction> parserFunctions;

        public Builder parserFunctions(java.util.List<LogAnalyticsParserFunction> parserFunctions) {
            this.parserFunctions = parserFunctions;
            this.__explicitlySet__.add("parserFunctions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourcesCount")
        private Long sourcesCount;

        public Builder sourcesCount(Long sourcesCount) {
            this.sourcesCount = sourcesCount;
            this.__explicitlySet__.add("sourcesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<LogAnalyticsSource> sources;

        public Builder sources(java.util.List<LogAnalyticsSource> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldTokenizeOriginalText")
        private Boolean shouldTokenizeOriginalText;

        public Builder shouldTokenizeOriginalText(Boolean shouldTokenizeOriginalText) {
            this.shouldTokenizeOriginalText = shouldTokenizeOriginalText;
            this.__explicitlySet__.add("shouldTokenizeOriginalText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldDelimiter")
        private String fieldDelimiter;

        public Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            this.__explicitlySet__.add("fieldDelimiter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldQualifier")
        private String fieldQualifier;

        public Builder fieldQualifier(String fieldQualifier) {
            this.fieldQualifier = fieldQualifier;
            this.__explicitlySet__.add("fieldQualifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
        private Boolean isUserDeleted;

        public Builder isUserDeleted(Boolean isUserDeleted) {
            this.isUserDeleted = isUserDeleted;
            this.__explicitlySet__.add("isUserDeleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isNamespaceAware")
        private Boolean isNamespaceAware;

        public Builder isNamespaceAware(Boolean isNamespaceAware) {
            this.isNamespaceAware = isNamespaceAware;
            this.__explicitlySet__.add("isNamespaceAware");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserSummary build() {
            LogAnalyticsParserSummary __instance__ =
                    new LogAnalyticsParserSummary(
                            content,
                            description,
                            displayName,
                            editVersion,
                            encoding,
                            exampleContent,
                            fieldMaps,
                            footerContent,
                            headerContent,
                            name,
                            isDefault,
                            isSingleLineContent,
                            isSystem,
                            language,
                            timeUpdated,
                            logTypeTestRequestVersion,
                            mappedParsers,
                            parserIgnorelineCharacters,
                            isHidden,
                            parserSequence,
                            parserTimezone,
                            parserFilter,
                            isParserWrittenOnce,
                            parserFunctions,
                            sourcesCount,
                            sources,
                            shouldTokenizeOriginalText,
                            fieldDelimiter,
                            fieldQualifier,
                            type,
                            isUserDeleted,
                            isNamespaceAware);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserSummary o) {
            Builder copiedBuilder =
                    content(o.getContent())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .editVersion(o.getEditVersion())
                            .encoding(o.getEncoding())
                            .exampleContent(o.getExampleContent())
                            .fieldMaps(o.getFieldMaps())
                            .footerContent(o.getFooterContent())
                            .headerContent(o.getHeaderContent())
                            .name(o.getName())
                            .isDefault(o.getIsDefault())
                            .isSingleLineContent(o.getIsSingleLineContent())
                            .isSystem(o.getIsSystem())
                            .language(o.getLanguage())
                            .timeUpdated(o.getTimeUpdated())
                            .logTypeTestRequestVersion(o.getLogTypeTestRequestVersion())
                            .mappedParsers(o.getMappedParsers())
                            .parserIgnorelineCharacters(o.getParserIgnorelineCharacters())
                            .isHidden(o.getIsHidden())
                            .parserSequence(o.getParserSequence())
                            .parserTimezone(o.getParserTimezone())
                            .parserFilter(o.getParserFilter())
                            .isParserWrittenOnce(o.getIsParserWrittenOnce())
                            .parserFunctions(o.getParserFunctions())
                            .sourcesCount(o.getSourcesCount())
                            .sources(o.getSources())
                            .shouldTokenizeOriginalText(o.getShouldTokenizeOriginalText())
                            .fieldDelimiter(o.getFieldDelimiter())
                            .fieldQualifier(o.getFieldQualifier())
                            .type(o.getType())
                            .isUserDeleted(o.getIsUserDeleted())
                            .isNamespaceAware(o.getIsNamespaceAware());

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
     * The content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    public String getContent() {
        return content;
    }

    /**
     * The parser description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The parser display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The parser edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    public Long getEditVersion() {
        return editVersion;
    }

    /**
     * The encoding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    private final String encoding;

    public String getEncoding() {
        return encoding;
    }

    /**
     * The example content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
    private final String exampleContent;

    public String getExampleContent() {
        return exampleContent;
    }

    /**
     * The parser fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldMaps")
    private final java.util.List<LogAnalyticsParserField> fieldMaps;

    public java.util.List<LogAnalyticsParserField> getFieldMaps() {
        return fieldMaps;
    }

    /**
     * The footer regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("footerContent")
    private final String footerContent;

    public String getFooterContent() {
        return footerContent;
    }

    /**
     * The header content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerContent")
    private final String headerContent;

    public String getHeaderContent() {
        return headerContent;
    }

    /**
     * The parser name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * A flag indicating if this is a default parser.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * A flag indicating if this is a single line content parser.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleLineContent")
    private final Boolean isSingleLineContent;

    public Boolean getIsSingleLineContent() {
        return isSingleLineContent;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The language.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final String language;

    public String getLanguage() {
        return language;
    }

    /**
     * The last updated date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The log type test request version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logTypeTestRequestVersion")
    private final Integer logTypeTestRequestVersion;

    public Integer getLogTypeTestRequestVersion() {
        return logTypeTestRequestVersion;
    }

    /**
     * The mapped parser list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mappedParsers")
    private final java.util.List<LogAnalyticsParser> mappedParsers;

    public java.util.List<LogAnalyticsParser> getMappedParsers() {
        return mappedParsers;
    }

    /**
     * The line characters for the parser to ignore.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserIgnorelineCharacters")
    private final String parserIgnorelineCharacters;

    public String getParserIgnorelineCharacters() {
        return parserIgnorelineCharacters;
    }

    /**
     * A flag indicating if the parser is hidden or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * The parser sequence.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserSequence")
    private final Integer parserSequence;

    public Integer getParserSequence() {
        return parserSequence;
    }

    /**
     * The time zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserTimezone")
    private final String parserTimezone;

    public String getParserTimezone() {
        return parserTimezone;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parserFilter")
    private final LogAnalyticsParserFilter parserFilter;

    public LogAnalyticsParserFilter getParserFilter() {
        return parserFilter;
    }

    /**
     * A flag indicating whther or not the parser is write once.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isParserWrittenOnce")
    private final Boolean isParserWrittenOnce;

    public Boolean getIsParserWrittenOnce() {
        return isParserWrittenOnce;
    }

    /**
     * The parser function list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctions")
    private final java.util.List<LogAnalyticsParserFunction> parserFunctions;

    public java.util.List<LogAnalyticsParserFunction> getParserFunctions() {
        return parserFunctions;
    }

    /**
     * The number of sources using this parser.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcesCount")
    private final Long sourcesCount;

    public Long getSourcesCount() {
        return sourcesCount;
    }

    /**
     * The list of sources using this parser.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<LogAnalyticsSource> sources;

    public java.util.List<LogAnalyticsSource> getSources() {
        return sources;
    }

    /**
     * A flag indicating whether or not to tokenize the original text.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldTokenizeOriginalText")
    private final Boolean shouldTokenizeOriginalText;

    public Boolean getShouldTokenizeOriginalText() {
        return shouldTokenizeOriginalText;
    }

    /**
     * The parser field delimiter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldDelimiter")
    private final String fieldDelimiter;

    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    /**
     * The parser field qualifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldQualifier")
    private final String fieldQualifier;

    public String getFieldQualifier() {
        return fieldQualifier;
    }

    /**
     * The parser type.  Default value is REGEX.
     **/
    public enum Type {
        Xml("XML"),
        Json("JSON"),
        Regex("REGEX"),
        Odl("ODL"),
        Delimited("DELIMITED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The parser type.  Default value is REGEX.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    public Type getType() {
        return type;
    }

    /**
     * A flag indicating whether or not the parser has been deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
    private final Boolean isUserDeleted;

    public Boolean getIsUserDeleted() {
        return isUserDeleted;
    }

    /**
     * A flag indicating whether the XML parser should consider the namespace(s) while processing the log data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNamespaceAware")
    private final Boolean isNamespaceAware;

    public Boolean getIsNamespaceAware() {
        return isNamespaceAware;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsParserSummary(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
