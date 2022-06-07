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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsExtendedField.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsExtendedField {
    @Deprecated
    @java.beans.ConstructorProperties({
        "field",
        "extendedFieldDefinition",
        "extendedFieldDefinitionId",
        "fieldName",
        "fieldDisplayName",
        "savedRegularExpressionName",
        "extendedFieldId"
    })
    public LogAnalyticsExtendedField(
            LogAnalyticsField field,
            LogAnalyticsSourceExtendedFieldDefinition extendedFieldDefinition,
            Long extendedFieldDefinitionId,
            String fieldName,
            String fieldDisplayName,
            String savedRegularExpressionName,
            Long extendedFieldId) {
        super();
        this.field = field;
        this.extendedFieldDefinition = extendedFieldDefinition;
        this.extendedFieldDefinitionId = extendedFieldDefinitionId;
        this.fieldName = fieldName;
        this.fieldDisplayName = fieldDisplayName;
        this.savedRegularExpressionName = savedRegularExpressionName;
        this.extendedFieldId = extendedFieldId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final LogAnalyticsField field;

    public LogAnalyticsField getField() {
        return field;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinition")
    private final LogAnalyticsSourceExtendedFieldDefinition extendedFieldDefinition;

    public LogAnalyticsSourceExtendedFieldDefinition getExtendedFieldDefinition() {
        return extendedFieldDefinition;
    }

    /**
     * The extended field unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitionId")
    private final Long extendedFieldDefinitionId;

    public Long getExtendedFieldDefinitionId() {
        return extendedFieldDefinitionId;
    }

    /**
     * The field internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    public String getFieldName() {
        return fieldName;
    }

    /**
     * The field internal display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldDisplayName")
    private final String fieldDisplayName;

    public String getFieldDisplayName() {
        return fieldDisplayName;
    }

    /**
     * The saved regular expression name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedRegularExpressionName")
    private final String savedRegularExpressionName;

    public String getSavedRegularExpressionName() {
        return savedRegularExpressionName;
    }

    /**
     * The extended field unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldId")
    private final Long extendedFieldId;

    public Long getExtendedFieldId() {
        return extendedFieldId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsExtendedField(");
        sb.append("field=").append(String.valueOf(this.field));
        sb.append(", extendedFieldDefinition=")
                .append(String.valueOf(this.extendedFieldDefinition));
        sb.append(", extendedFieldDefinitionId=")
                .append(String.valueOf(this.extendedFieldDefinitionId));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", fieldDisplayName=").append(String.valueOf(this.fieldDisplayName));
        sb.append(", savedRegularExpressionName=")
                .append(String.valueOf(this.savedRegularExpressionName));
        sb.append(", extendedFieldId=").append(String.valueOf(this.extendedFieldId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsExtendedField)) {
            return false;
        }

        LogAnalyticsExtendedField other = (LogAnalyticsExtendedField) o;
        return java.util.Objects.equals(this.field, other.field)
                && java.util.Objects.equals(
                        this.extendedFieldDefinition, other.extendedFieldDefinition)
                && java.util.Objects.equals(
                        this.extendedFieldDefinitionId, other.extendedFieldDefinitionId)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.fieldDisplayName, other.fieldDisplayName)
                && java.util.Objects.equals(
                        this.savedRegularExpressionName, other.savedRegularExpressionName)
                && java.util.Objects.equals(this.extendedFieldId, other.extendedFieldId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedFieldDefinition == null
                                ? 43
                                : this.extendedFieldDefinition.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedFieldDefinitionId == null
                                ? 43
                                : this.extendedFieldDefinitionId.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldDisplayName == null ? 43 : this.fieldDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.savedRegularExpressionName == null
                                ? 43
                                : this.savedRegularExpressionName.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedFieldId == null ? 43 : this.extendedFieldId.hashCode());
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
