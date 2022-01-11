/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourcePattern
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
    builder = LogAnalyticsSourcePattern.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsSourcePattern {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("convertedText")
        private String convertedText;

        public Builder convertedText(String convertedText) {
            this.convertedText = convertedText;
            this.__explicitlySet__.add("convertedText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbParserId")
        private Long dbParserId;

        public Builder dbParserId(Long dbParserId) {
            this.dbParserId = dbParserId;
            this.__explicitlySet__.add("dbParserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbPatternDateTimeColumns")
        private String dbPatternDateTimeColumns;

        public Builder dbPatternDateTimeColumns(String dbPatternDateTimeColumns) {
            this.dbPatternDateTimeColumns = dbPatternDateTimeColumns;
            this.__explicitlySet__.add("dbPatternDateTimeColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbPatternDateTimeField")
        private String dbPatternDateTimeField;

        public Builder dbPatternDateTimeField(String dbPatternDateTimeField) {
            this.dbPatternDateTimeField = dbPatternDateTimeField;
            this.__explicitlySet__.add("dbPatternDateTimeField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbPatternSequenceColumn")
        private String dbPatternSequenceColumn;

        public Builder dbPatternSequenceColumn(String dbPatternSequenceColumn) {
            this.dbPatternSequenceColumn = dbPatternSequenceColumn;
            this.__explicitlySet__.add("dbPatternSequenceColumn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<LogAnalyticsParserField> fields;

        public Builder fields(java.util.List<LogAnalyticsParserField> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInclude")
        private Boolean isInclude;

        public Builder isInclude(Boolean isInclude) {
            this.isInclude = isInclude;
            this.__explicitlySet__.add("isInclude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternFilter")
        private LogAnalyticsPatternFilter patternFilter;

        public Builder patternFilter(LogAnalyticsPatternFilter patternFilter) {
            this.patternFilter = patternFilter;
            this.__explicitlySet__.add("patternFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternId")
        private Long patternId;

        public Builder patternId(Long patternId) {
            this.patternId = patternId;
            this.__explicitlySet__.add("patternId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAgentWarningSuppressed")
        private Boolean isAgentWarningSuppressed;

        public Builder isAgentWarningSuppressed(Boolean isAgentWarningSuppressed) {
            this.isAgentWarningSuppressed = isAgentWarningSuppressed;
            this.__explicitlySet__.add("isAgentWarningSuppressed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternText")
        private String patternText;

        public Builder patternText(String patternText) {
            this.patternText = patternText;
            this.__explicitlySet__.add("patternText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternType")
        private Long patternType;

        public Builder patternType(Long patternType) {
            this.patternType = patternType;
            this.__explicitlySet__.add("patternType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private java.util.List<String> entityType;

        public Builder entityType(java.util.List<String> entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourcePattern build() {
            LogAnalyticsSourcePattern __instance__ =
                    new LogAnalyticsSourcePattern(
                            convertedText,
                            dbParserId,
                            dbPatternDateTimeColumns,
                            dbPatternDateTimeField,
                            dbPatternSequenceColumn,
                            fields,
                            isInclude,
                            isDefault,
                            patternFilter,
                            alias,
                            description,
                            isEnabled,
                            patternId,
                            isSystem,
                            sourceId,
                            isAgentWarningSuppressed,
                            patternText,
                            patternType,
                            entityType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourcePattern o) {
            Builder copiedBuilder =
                    convertedText(o.getConvertedText())
                            .dbParserId(o.getDbParserId())
                            .dbPatternDateTimeColumns(o.getDbPatternDateTimeColumns())
                            .dbPatternDateTimeField(o.getDbPatternDateTimeField())
                            .dbPatternSequenceColumn(o.getDbPatternSequenceColumn())
                            .fields(o.getFields())
                            .isInclude(o.getIsInclude())
                            .isDefault(o.getIsDefault())
                            .patternFilter(o.getPatternFilter())
                            .alias(o.getAlias())
                            .description(o.getDescription())
                            .isEnabled(o.getIsEnabled())
                            .patternId(o.getPatternId())
                            .isSystem(o.getIsSystem())
                            .sourceId(o.getSourceId())
                            .isAgentWarningSuppressed(o.getIsAgentWarningSuppressed())
                            .patternText(o.getPatternText())
                            .patternType(o.getPatternType())
                            .entityType(o.getEntityType());

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
     * The converted text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("convertedText")
    String convertedText;

    /**
     * The parser unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbParserId")
    Long dbParserId;

    /**
     * The date time columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbPatternDateTimeColumns")
    String dbPatternDateTimeColumns;

    /**
     * The date time field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbPatternDateTimeField")
    String dbPatternDateTimeField;

    /**
     * The sequence column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbPatternSequenceColumn")
    String dbPatternSequenceColumn;

    /**
     * The parser field list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    java.util.List<LogAnalyticsParserField> fields;

    /**
     * A flag indicating if this is source pattern is included.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInclude")
    Boolean isInclude;

    /**
     * A flag indicating if this is the default source pattern.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    Boolean isDefault;

    @com.fasterxml.jackson.annotation.JsonProperty("patternFilter")
    LogAnalyticsPatternFilter patternFilter;

    /**
     * The source pattern alias.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    String alias;

    /**
     * The source pattern description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * A flag inidcating whether or not the source pattern is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The source pattern unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternId")
    Long patternId;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    Long sourceId;

    /**
     * A flag indicating whether or not agent warnings are suppressed for
     * this source pattern.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAgentWarningSuppressed")
    Boolean isAgentWarningSuppressed;

    /**
     * The pattern text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternText")
    String patternText;

    /**
     * The pattern type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternType")
    Long patternType;

    /**
     * The source entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    java.util.List<String> entityType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
