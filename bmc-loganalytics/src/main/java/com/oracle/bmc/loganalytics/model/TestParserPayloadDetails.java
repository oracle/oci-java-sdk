/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * TestParserPayloadDetails
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
    builder = TestParserPayloadDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TestParserPayloadDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private UiParserTestMetadata metadata;

        public Builder metadata(UiParserTestMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
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
        private Long isHidden;

        public Builder isHidden(Long isHidden) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("shouldTokenizeOriginalText")
        private Boolean shouldTokenizeOriginalText;

        public Builder shouldTokenizeOriginalText(Boolean shouldTokenizeOriginalText) {
            this.shouldTokenizeOriginalText = shouldTokenizeOriginalText;
            this.__explicitlySet__.add("shouldTokenizeOriginalText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestParserPayloadDetails build() {
            TestParserPayloadDetails __instance__ =
                    new TestParserPayloadDetails(
                            content,
                            description,
                            displayName,
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
                            metadata,
                            parserIgnorelineCharacters,
                            isHidden,
                            parserSequence,
                            parserTimezone,
                            isParserWrittenOnce,
                            parserFunctions,
                            shouldTokenizeOriginalText,
                            type);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestParserPayloadDetails o) {
            Builder copiedBuilder =
                    content(o.getContent())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
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
                            .metadata(o.getMetadata())
                            .parserIgnorelineCharacters(o.getParserIgnorelineCharacters())
                            .isHidden(o.getIsHidden())
                            .parserSequence(o.getParserSequence())
                            .parserTimezone(o.getParserTimezone())
                            .isParserWrittenOnce(o.getIsParserWrittenOnce())
                            .parserFunctions(o.getParserFunctions())
                            .shouldTokenizeOriginalText(o.getShouldTokenizeOriginalText())
                            .type(o.getType());

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
     * content
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    String content;

    /**
     * description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * encoding
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    String encoding;

    /**
     * exampleContent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
    String exampleContent;

    /**
     * fieldMaps
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldMaps")
    java.util.List<LogAnalyticsParserField> fieldMaps;

    /**
     * footerRegex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("footerContent")
    String footerContent;

    /**
     * headerContent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerContent")
    String headerContent;

    /**
     * name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * isDefault
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    Boolean isDefault;

    /**
     * isSingleLineContent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleLineContent")
    Boolean isSingleLineContent;

    /**
     * isSystem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * language
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    String language;

    /**
     * lastUpdatedDate
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * logTypeTestRequestVersion
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logTypeTestRequestVersion")
    Integer logTypeTestRequestVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    UiParserTestMetadata metadata;

    /**
     * parser ignore linechars
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserIgnorelineCharacters")
    String parserIgnorelineCharacters;

    /**
     * parser is hidden
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    Long isHidden;

    /**
     * parser seq
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserSequence")
    Integer parserSequence;

    /**
     * parser timezone
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserTimezone")
    String parserTimezone;

    /**
     * isParserWrittenOnce
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isParserWrittenOnce")
    Boolean isParserWrittenOnce;

    /**
     * plugin instance list
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctions")
    java.util.List<LogAnalyticsParserFunction> parserFunctions;

    /**
     * tokenize original text
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldTokenizeOriginalText")
    Boolean shouldTokenizeOriginalText;
    /**
     * type
     **/
    public enum Type {
        Xml("XML"),
        Json("JSON"),
        Regex("REGEX"),
        Odl("ODL"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
