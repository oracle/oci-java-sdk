/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LoganParserDetails
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsParser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsParser {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        public LogAnalyticsParser build() {
            LogAnalyticsParser __instance__ =
                    new LogAnalyticsParser(
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
        public Builder copy(LogAnalyticsParser o) {
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

    /**
     * The content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    String content;

    /**
     * The parser description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The parser display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The parser edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    Long editVersion;

    /**
     * The encoding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    String encoding;

    /**
     * The example content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
    String exampleContent;

    /**
     * The parser fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldMaps")
    java.util.List<LogAnalyticsParserField> fieldMaps;

    /**
     * The footer regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("footerContent")
    String footerContent;

    /**
     * The header content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerContent")
    String headerContent;

    /**
     * The parser name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A flag indicating if this is a default parser.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    Boolean isDefault;

    /**
     * A flag indicating if this is a single line content parser.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleLineContent")
    Boolean isSingleLineContent;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * The language.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    String language;

    /**
     * The last updated date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The log type test request .
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logTypeTestRequestVersion")
    Integer logTypeTestRequestVersion;

    /**
     * The mapped parser list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mappedParsers")
    java.util.List<LogAnalyticsParser> mappedParsers;

    /**
     * The line characters for the parser to ignore.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserIgnorelineCharacters")
    String parserIgnorelineCharacters;

    /**
     * A flag indicating if the parser is hidden or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    Boolean isHidden;

    /**
     * The parser sequence.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserSequence")
    Integer parserSequence;

    /**
     * The time zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserTimezone")
    String parserTimezone;

    @com.fasterxml.jackson.annotation.JsonProperty("parserFilter")
    LogAnalyticsParserFilter parserFilter;

    /**
     * A flag indicating whther or not the parser is write once.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isParserWrittenOnce")
    Boolean isParserWrittenOnce;

    /**
     * The parser function list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctions")
    java.util.List<LogAnalyticsParserFunction> parserFunctions;

    /**
     * The number of sources using this parser
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcesCount")
    Long sourcesCount;

    /**
     * The list of sources using this parser.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    java.util.List<LogAnalyticsSource> sources;

    /**
     * A flag indicating whether or not to tokenize the original text.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldTokenizeOriginalText")
    Boolean shouldTokenizeOriginalText;

    /**
     * The parser field delimiter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldDelimiter")
    String fieldDelimiter;

    /**
     * The parser field qualifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldQualifier")
    String fieldQualifier;
    /**
     * The parser type. Default value is REGEX.
     **/
    @lombok.extern.slf4j.Slf4j
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
     * The parser type. Default value is REGEX.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * A flag indicating whether or not the parser has been deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
    Boolean isUserDeleted;

    /**
     * A flag indicating whether the XML parser should consider the namespace(s) while processing the log data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNamespaceAware")
    Boolean isNamespaceAware;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
