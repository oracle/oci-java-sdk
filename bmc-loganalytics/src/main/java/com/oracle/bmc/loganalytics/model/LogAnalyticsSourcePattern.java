/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourcePattern <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsSourcePattern.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourcePattern
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "convertedText",
        "dbParserId",
        "dbPatternDateTimeColumns",
        "dbPatternDateTimeField",
        "dbPatternSequenceColumn",
        "fields",
        "isInclude",
        "isDefault",
        "patternFilter",
        "alias",
        "description",
        "isEnabled",
        "patternId",
        "isSystem",
        "sourceId",
        "isAgentWarningSuppressed",
        "patternText",
        "patternType",
        "entityType"
    })
    public LogAnalyticsSourcePattern(
            String convertedText,
            Long dbParserId,
            String dbPatternDateTimeColumns,
            String dbPatternDateTimeField,
            String dbPatternSequenceColumn,
            java.util.List<LogAnalyticsParserField> fields,
            Boolean isInclude,
            Boolean isDefault,
            LogAnalyticsPatternFilter patternFilter,
            String alias,
            String description,
            Boolean isEnabled,
            Long patternId,
            Boolean isSystem,
            Long sourceId,
            Boolean isAgentWarningSuppressed,
            String patternText,
            Long patternType,
            java.util.List<String> entityType) {
        super();
        this.convertedText = convertedText;
        this.dbParserId = dbParserId;
        this.dbPatternDateTimeColumns = dbPatternDateTimeColumns;
        this.dbPatternDateTimeField = dbPatternDateTimeField;
        this.dbPatternSequenceColumn = dbPatternSequenceColumn;
        this.fields = fields;
        this.isInclude = isInclude;
        this.isDefault = isDefault;
        this.patternFilter = patternFilter;
        this.alias = alias;
        this.description = description;
        this.isEnabled = isEnabled;
        this.patternId = patternId;
        this.isSystem = isSystem;
        this.sourceId = sourceId;
        this.isAgentWarningSuppressed = isAgentWarningSuppressed;
        this.patternText = patternText;
        this.patternType = patternType;
        this.entityType = entityType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The converted text. */
        @com.fasterxml.jackson.annotation.JsonProperty("convertedText")
        private String convertedText;

        /**
         * The converted text.
         *
         * @param convertedText the value to set
         * @return this builder
         */
        public Builder convertedText(String convertedText) {
            this.convertedText = convertedText;
            this.__explicitlySet__.add("convertedText");
            return this;
        }
        /** The parser unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbParserId")
        private Long dbParserId;

        /**
         * The parser unique identifier.
         *
         * @param dbParserId the value to set
         * @return this builder
         */
        public Builder dbParserId(Long dbParserId) {
            this.dbParserId = dbParserId;
            this.__explicitlySet__.add("dbParserId");
            return this;
        }
        /** The date time columns. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbPatternDateTimeColumns")
        private String dbPatternDateTimeColumns;

        /**
         * The date time columns.
         *
         * @param dbPatternDateTimeColumns the value to set
         * @return this builder
         */
        public Builder dbPatternDateTimeColumns(String dbPatternDateTimeColumns) {
            this.dbPatternDateTimeColumns = dbPatternDateTimeColumns;
            this.__explicitlySet__.add("dbPatternDateTimeColumns");
            return this;
        }
        /** The date time field. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbPatternDateTimeField")
        private String dbPatternDateTimeField;

        /**
         * The date time field.
         *
         * @param dbPatternDateTimeField the value to set
         * @return this builder
         */
        public Builder dbPatternDateTimeField(String dbPatternDateTimeField) {
            this.dbPatternDateTimeField = dbPatternDateTimeField;
            this.__explicitlySet__.add("dbPatternDateTimeField");
            return this;
        }
        /** The sequence column. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbPatternSequenceColumn")
        private String dbPatternSequenceColumn;

        /**
         * The sequence column.
         *
         * @param dbPatternSequenceColumn the value to set
         * @return this builder
         */
        public Builder dbPatternSequenceColumn(String dbPatternSequenceColumn) {
            this.dbPatternSequenceColumn = dbPatternSequenceColumn;
            this.__explicitlySet__.add("dbPatternSequenceColumn");
            return this;
        }
        /** The parser field list. */
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<LogAnalyticsParserField> fields;

        /**
         * The parser field list.
         *
         * @param fields the value to set
         * @return this builder
         */
        public Builder fields(java.util.List<LogAnalyticsParserField> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }
        /** A flag indicating if this is source pattern is included. */
        @com.fasterxml.jackson.annotation.JsonProperty("isInclude")
        private Boolean isInclude;

        /**
         * A flag indicating if this is source pattern is included.
         *
         * @param isInclude the value to set
         * @return this builder
         */
        public Builder isInclude(Boolean isInclude) {
            this.isInclude = isInclude;
            this.__explicitlySet__.add("isInclude");
            return this;
        }
        /** A flag indicating if this is the default source pattern. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * A flag indicating if this is the default source pattern.
         *
         * @param isDefault the value to set
         * @return this builder
         */
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
        /** The source pattern alias. */
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * The source pattern alias.
         *
         * @param alias the value to set
         * @return this builder
         */
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }
        /** The source pattern description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The source pattern description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A flag inidcating whether or not the source pattern is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag inidcating whether or not the source pattern is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The source pattern unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("patternId")
        private Long patternId;

        /**
         * The source pattern unique identifier.
         *
         * @param patternId the value to set
         * @return this builder
         */
        public Builder patternId(Long patternId) {
            this.patternId = patternId;
            this.__explicitlySet__.add("patternId");
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
        /** The source unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        /**
         * The source unique identifier.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * A flag indicating whether or not agent warnings are suppressed for this source pattern.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAgentWarningSuppressed")
        private Boolean isAgentWarningSuppressed;

        /**
         * A flag indicating whether or not agent warnings are suppressed for this source pattern.
         *
         * @param isAgentWarningSuppressed the value to set
         * @return this builder
         */
        public Builder isAgentWarningSuppressed(Boolean isAgentWarningSuppressed) {
            this.isAgentWarningSuppressed = isAgentWarningSuppressed;
            this.__explicitlySet__.add("isAgentWarningSuppressed");
            return this;
        }
        /** The pattern text. */
        @com.fasterxml.jackson.annotation.JsonProperty("patternText")
        private String patternText;

        /**
         * The pattern text.
         *
         * @param patternText the value to set
         * @return this builder
         */
        public Builder patternText(String patternText) {
            this.patternText = patternText;
            this.__explicitlySet__.add("patternText");
            return this;
        }
        /** The pattern type. */
        @com.fasterxml.jackson.annotation.JsonProperty("patternType")
        private Long patternType;

        /**
         * The pattern type.
         *
         * @param patternType the value to set
         * @return this builder
         */
        public Builder patternType(Long patternType) {
            this.patternType = patternType;
            this.__explicitlySet__.add("patternType");
            return this;
        }
        /** The source entity type. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private java.util.List<String> entityType;

        /**
         * The source entity type.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(java.util.List<String> entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourcePattern build() {
            LogAnalyticsSourcePattern model =
                    new LogAnalyticsSourcePattern(
                            this.convertedText,
                            this.dbParserId,
                            this.dbPatternDateTimeColumns,
                            this.dbPatternDateTimeField,
                            this.dbPatternSequenceColumn,
                            this.fields,
                            this.isInclude,
                            this.isDefault,
                            this.patternFilter,
                            this.alias,
                            this.description,
                            this.isEnabled,
                            this.patternId,
                            this.isSystem,
                            this.sourceId,
                            this.isAgentWarningSuppressed,
                            this.patternText,
                            this.patternType,
                            this.entityType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourcePattern model) {
            if (model.wasPropertyExplicitlySet("convertedText")) {
                this.convertedText(model.getConvertedText());
            }
            if (model.wasPropertyExplicitlySet("dbParserId")) {
                this.dbParserId(model.getDbParserId());
            }
            if (model.wasPropertyExplicitlySet("dbPatternDateTimeColumns")) {
                this.dbPatternDateTimeColumns(model.getDbPatternDateTimeColumns());
            }
            if (model.wasPropertyExplicitlySet("dbPatternDateTimeField")) {
                this.dbPatternDateTimeField(model.getDbPatternDateTimeField());
            }
            if (model.wasPropertyExplicitlySet("dbPatternSequenceColumn")) {
                this.dbPatternSequenceColumn(model.getDbPatternSequenceColumn());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("isInclude")) {
                this.isInclude(model.getIsInclude());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("patternFilter")) {
                this.patternFilter(model.getPatternFilter());
            }
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("patternId")) {
                this.patternId(model.getPatternId());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("isAgentWarningSuppressed")) {
                this.isAgentWarningSuppressed(model.getIsAgentWarningSuppressed());
            }
            if (model.wasPropertyExplicitlySet("patternText")) {
                this.patternText(model.getPatternText());
            }
            if (model.wasPropertyExplicitlySet("patternType")) {
                this.patternType(model.getPatternType());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
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

    /** The converted text. */
    @com.fasterxml.jackson.annotation.JsonProperty("convertedText")
    private final String convertedText;

    /**
     * The converted text.
     *
     * @return the value
     */
    public String getConvertedText() {
        return convertedText;
    }

    /** The parser unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbParserId")
    private final Long dbParserId;

    /**
     * The parser unique identifier.
     *
     * @return the value
     */
    public Long getDbParserId() {
        return dbParserId;
    }

    /** The date time columns. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbPatternDateTimeColumns")
    private final String dbPatternDateTimeColumns;

    /**
     * The date time columns.
     *
     * @return the value
     */
    public String getDbPatternDateTimeColumns() {
        return dbPatternDateTimeColumns;
    }

    /** The date time field. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbPatternDateTimeField")
    private final String dbPatternDateTimeField;

    /**
     * The date time field.
     *
     * @return the value
     */
    public String getDbPatternDateTimeField() {
        return dbPatternDateTimeField;
    }

    /** The sequence column. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbPatternSequenceColumn")
    private final String dbPatternSequenceColumn;

    /**
     * The sequence column.
     *
     * @return the value
     */
    public String getDbPatternSequenceColumn() {
        return dbPatternSequenceColumn;
    }

    /** The parser field list. */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<LogAnalyticsParserField> fields;

    /**
     * The parser field list.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParserField> getFields() {
        return fields;
    }

    /** A flag indicating if this is source pattern is included. */
    @com.fasterxml.jackson.annotation.JsonProperty("isInclude")
    private final Boolean isInclude;

    /**
     * A flag indicating if this is source pattern is included.
     *
     * @return the value
     */
    public Boolean getIsInclude() {
        return isInclude;
    }

    /** A flag indicating if this is the default source pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * A flag indicating if this is the default source pattern.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patternFilter")
    private final LogAnalyticsPatternFilter patternFilter;

    public LogAnalyticsPatternFilter getPatternFilter() {
        return patternFilter;
    }

    /** The source pattern alias. */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * The source pattern alias.
     *
     * @return the value
     */
    public String getAlias() {
        return alias;
    }

    /** The source pattern description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The source pattern description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** A flag inidcating whether or not the source pattern is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag inidcating whether or not the source pattern is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The source pattern unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("patternId")
    private final Long patternId;

    /**
     * The source pattern unique identifier.
     *
     * @return the value
     */
    public Long getPatternId() {
        return patternId;
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

    /** The source unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    /**
     * The source unique identifier.
     *
     * @return the value
     */
    public Long getSourceId() {
        return sourceId;
    }

    /** A flag indicating whether or not agent warnings are suppressed for this source pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAgentWarningSuppressed")
    private final Boolean isAgentWarningSuppressed;

    /**
     * A flag indicating whether or not agent warnings are suppressed for this source pattern.
     *
     * @return the value
     */
    public Boolean getIsAgentWarningSuppressed() {
        return isAgentWarningSuppressed;
    }

    /** The pattern text. */
    @com.fasterxml.jackson.annotation.JsonProperty("patternText")
    private final String patternText;

    /**
     * The pattern text.
     *
     * @return the value
     */
    public String getPatternText() {
        return patternText;
    }

    /** The pattern type. */
    @com.fasterxml.jackson.annotation.JsonProperty("patternType")
    private final Long patternType;

    /**
     * The pattern type.
     *
     * @return the value
     */
    public Long getPatternType() {
        return patternType;
    }

    /** The source entity type. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final java.util.List<String> entityType;

    /**
     * The source entity type.
     *
     * @return the value
     */
    public java.util.List<String> getEntityType() {
        return entityType;
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
        sb.append("LogAnalyticsSourcePattern(");
        sb.append("super=").append(super.toString());
        sb.append("convertedText=").append(String.valueOf(this.convertedText));
        sb.append(", dbParserId=").append(String.valueOf(this.dbParserId));
        sb.append(", dbPatternDateTimeColumns=")
                .append(String.valueOf(this.dbPatternDateTimeColumns));
        sb.append(", dbPatternDateTimeField=").append(String.valueOf(this.dbPatternDateTimeField));
        sb.append(", dbPatternSequenceColumn=")
                .append(String.valueOf(this.dbPatternSequenceColumn));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", isInclude=").append(String.valueOf(this.isInclude));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", patternFilter=").append(String.valueOf(this.patternFilter));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", patternId=").append(String.valueOf(this.patternId));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", isAgentWarningSuppressed=")
                .append(String.valueOf(this.isAgentWarningSuppressed));
        sb.append(", patternText=").append(String.valueOf(this.patternText));
        sb.append(", patternType=").append(String.valueOf(this.patternType));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourcePattern)) {
            return false;
        }

        LogAnalyticsSourcePattern other = (LogAnalyticsSourcePattern) o;
        return java.util.Objects.equals(this.convertedText, other.convertedText)
                && java.util.Objects.equals(this.dbParserId, other.dbParserId)
                && java.util.Objects.equals(
                        this.dbPatternDateTimeColumns, other.dbPatternDateTimeColumns)
                && java.util.Objects.equals(
                        this.dbPatternDateTimeField, other.dbPatternDateTimeField)
                && java.util.Objects.equals(
                        this.dbPatternSequenceColumn, other.dbPatternSequenceColumn)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.isInclude, other.isInclude)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.patternFilter, other.patternFilter)
                && java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.patternId, other.patternId)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(
                        this.isAgentWarningSuppressed, other.isAgentWarningSuppressed)
                && java.util.Objects.equals(this.patternText, other.patternText)
                && java.util.Objects.equals(this.patternType, other.patternType)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.convertedText == null ? 43 : this.convertedText.hashCode());
        result = (result * PRIME) + (this.dbParserId == null ? 43 : this.dbParserId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbPatternDateTimeColumns == null
                                ? 43
                                : this.dbPatternDateTimeColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.dbPatternDateTimeField == null
                                ? 43
                                : this.dbPatternDateTimeField.hashCode());
        result =
                (result * PRIME)
                        + (this.dbPatternSequenceColumn == null
                                ? 43
                                : this.dbPatternSequenceColumn.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.isInclude == null ? 43 : this.isInclude.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.patternFilter == null ? 43 : this.patternFilter.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.patternId == null ? 43 : this.patternId.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAgentWarningSuppressed == null
                                ? 43
                                : this.isAgentWarningSuppressed.hashCode());
        result = (result * PRIME) + (this.patternText == null ? 43 : this.patternText.hashCode());
        result = (result * PRIME) + (this.patternType == null ? 43 : this.patternType.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
