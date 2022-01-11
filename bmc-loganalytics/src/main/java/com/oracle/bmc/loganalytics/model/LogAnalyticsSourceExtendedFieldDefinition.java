/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceExtendedFieldDefinition
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
    builder = LogAnalyticsSourceExtendedFieldDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsSourceExtendedFieldDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("field")
        private LogAnalyticsField field;

        public Builder field(LogAnalyticsField field) {
            this.field = field;
            this.__explicitlySet__.add("field");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayRegularExpression")
        private String displayRegularExpression;

        public Builder displayRegularExpression(String displayRegularExpression) {
            this.displayRegularExpression = displayRegularExpression;
            this.__explicitlySet__.add("displayRegularExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedFields")
        private java.util.List<LogAnalyticsExtendedField> extendedFields;

        public Builder extendedFields(java.util.List<LogAnalyticsExtendedField> extendedFields) {
            this.extendedFields = extendedFields;
            this.__explicitlySet__.add("extendedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("baseFieldName")
        private String baseFieldName;

        public Builder baseFieldName(String baseFieldName) {
            this.baseFieldName = baseFieldName;
            this.__explicitlySet__.add("baseFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("baseFieldLogText")
        private String baseFieldLogText;

        public Builder baseFieldLogText(String baseFieldLogText) {
            this.baseFieldLogText = baseFieldLogText;
            this.__explicitlySet__.add("baseFieldLogText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionDataType")
        private String conditionDataType;

        public Builder conditionDataType(String conditionDataType) {
            this.conditionDataType = conditionDataType;
            this.__explicitlySet__.add("conditionDataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionField")
        private String conditionField;

        public Builder conditionField(String conditionField) {
            this.conditionField = conditionField;
            this.__explicitlySet__.add("conditionField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionOperator")
        private String conditionOperator;

        public Builder conditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            this.__explicitlySet__.add("conditionOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionValue")
        private String conditionValue;

        public Builder conditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            this.__explicitlySet__.add("conditionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("convertedRegularExpression")
        private String convertedRegularExpression;

        public Builder convertedRegularExpression(String convertedRegularExpression) {
            this.convertedRegularExpression = convertedRegularExpression;
            this.__explicitlySet__.add("convertedRegularExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitionId")
        private Long extendedFieldDefinitionId;

        public Builder extendedFieldDefinitionId(Long extendedFieldDefinitionId) {
            this.extendedFieldDefinitionId = extendedFieldDefinitionId;
            this.__explicitlySet__.add("extendedFieldDefinitionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
        private String regularExpression;

        public Builder regularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            this.__explicitlySet__.add("regularExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceExtendedFieldDefinition build() {
            LogAnalyticsSourceExtendedFieldDefinition __instance__ =
                    new LogAnalyticsSourceExtendedFieldDefinition(
                            field,
                            displayRegularExpression,
                            extendedFields,
                            baseFieldName,
                            baseFieldLogText,
                            conditionDataType,
                            conditionField,
                            conditionOperator,
                            conditionValue,
                            convertedRegularExpression,
                            isEnabled,
                            extendedFieldDefinitionId,
                            isSystem,
                            regularExpression,
                            sourceId,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceExtendedFieldDefinition o) {
            Builder copiedBuilder =
                    field(o.getField())
                            .displayRegularExpression(o.getDisplayRegularExpression())
                            .extendedFields(o.getExtendedFields())
                            .baseFieldName(o.getBaseFieldName())
                            .baseFieldLogText(o.getBaseFieldLogText())
                            .conditionDataType(o.getConditionDataType())
                            .conditionField(o.getConditionField())
                            .conditionOperator(o.getConditionOperator())
                            .conditionValue(o.getConditionValue())
                            .convertedRegularExpression(o.getConvertedRegularExpression())
                            .isEnabled(o.getIsEnabled())
                            .extendedFieldDefinitionId(o.getExtendedFieldDefinitionId())
                            .isSystem(o.getIsSystem())
                            .regularExpression(o.getRegularExpression())
                            .sourceId(o.getSourceId())
                            .timeUpdated(o.getTimeUpdated());

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

    @com.fasterxml.jackson.annotation.JsonProperty("field")
    LogAnalyticsField field;

    /**
     * The regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayRegularExpression")
    String displayRegularExpression;

    /**
     * An array of extended fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFields")
    java.util.List<LogAnalyticsExtendedField> extendedFields;

    /**
     * The base field internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseFieldName")
    String baseFieldName;

    /**
     * The base field log text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseFieldLogText")
    String baseFieldLogText;

    /**
     * The conditional data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionDataType")
    String conditionDataType;

    /**
     * The onditional field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionField")
    String conditionField;

    /**
     * The conditional operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionOperator")
    String conditionOperator;

    /**
     * The conditional value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionValue")
    String conditionValue;

    /**
     * The converted regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("convertedRegularExpression")
    String convertedRegularExpression;

    /**
     * A flag inidcating whether or not the extended definition is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The extended field definition unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitionId")
    Long extendedFieldDefinitionId;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * The regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
    String regularExpression;

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    Long sourceId;

    /**
     * The last updated date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
