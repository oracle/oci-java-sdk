/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsExtendedField
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
    builder = LogAnalyticsExtendedField.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsExtendedField {
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

        @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinition")
        private LogAnalyticsSourceExtendedFieldDefinition extendedFieldDefinition;

        public Builder extendedFieldDefinition(
                LogAnalyticsSourceExtendedFieldDefinition extendedFieldDefinition) {
            this.extendedFieldDefinition = extendedFieldDefinition;
            this.__explicitlySet__.add("extendedFieldDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitionId")
        private Long extendedFieldDefinitionId;

        public Builder extendedFieldDefinitionId(Long extendedFieldDefinitionId) {
            this.extendedFieldDefinitionId = extendedFieldDefinitionId;
            this.__explicitlySet__.add("extendedFieldDefinitionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldDisplayName")
        private String fieldDisplayName;

        public Builder fieldDisplayName(String fieldDisplayName) {
            this.fieldDisplayName = fieldDisplayName;
            this.__explicitlySet__.add("fieldDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("savedRegularExpressionName")
        private String savedRegularExpressionName;

        public Builder savedRegularExpressionName(String savedRegularExpressionName) {
            this.savedRegularExpressionName = savedRegularExpressionName;
            this.__explicitlySet__.add("savedRegularExpressionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldId")
        private Long extendedFieldId;

        public Builder extendedFieldId(Long extendedFieldId) {
            this.extendedFieldId = extendedFieldId;
            this.__explicitlySet__.add("extendedFieldId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsExtendedField build() {
            LogAnalyticsExtendedField __instance__ =
                    new LogAnalyticsExtendedField(
                            field,
                            extendedFieldDefinition,
                            extendedFieldDefinitionId,
                            fieldName,
                            fieldDisplayName,
                            savedRegularExpressionName,
                            extendedFieldId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsExtendedField o) {
            Builder copiedBuilder =
                    field(o.getField())
                            .extendedFieldDefinition(o.getExtendedFieldDefinition())
                            .extendedFieldDefinitionId(o.getExtendedFieldDefinitionId())
                            .fieldName(o.getFieldName())
                            .fieldDisplayName(o.getFieldDisplayName())
                            .savedRegularExpressionName(o.getSavedRegularExpressionName())
                            .extendedFieldId(o.getExtendedFieldId());

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

    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinition")
    LogAnalyticsSourceExtendedFieldDefinition extendedFieldDefinition;

    /**
     * The extended field unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitionId")
    Long extendedFieldDefinitionId;

    /**
     * The field internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    String fieldName;

    /**
     * The field internal display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldDisplayName")
    String fieldDisplayName;

    /**
     * The saved regular expression name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedRegularExpressionName")
    String savedRegularExpressionName;

    /**
     * The extended field unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldId")
    Long extendedFieldId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
