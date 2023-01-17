/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceExtendedFieldDefinition <br>
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
        builder = LogAnalyticsSourceExtendedFieldDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourceExtendedFieldDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "field",
        "displayRegularExpression",
        "extendedFields",
        "baseFieldName",
        "baseFieldLogText",
        "conditionDataType",
        "conditionField",
        "conditionOperator",
        "conditionValue",
        "convertedRegularExpression",
        "isEnabled",
        "extendedFieldDefinitionId",
        "isSystem",
        "regularExpression",
        "sourceId",
        "timeUpdated"
    })
    public LogAnalyticsSourceExtendedFieldDefinition(
            LogAnalyticsField field,
            String displayRegularExpression,
            java.util.List<LogAnalyticsExtendedField> extendedFields,
            String baseFieldName,
            String baseFieldLogText,
            String conditionDataType,
            String conditionField,
            String conditionOperator,
            String conditionValue,
            String convertedRegularExpression,
            Boolean isEnabled,
            Long extendedFieldDefinitionId,
            Boolean isSystem,
            String regularExpression,
            Long sourceId,
            java.util.Date timeUpdated) {
        super();
        this.field = field;
        this.displayRegularExpression = displayRegularExpression;
        this.extendedFields = extendedFields;
        this.baseFieldName = baseFieldName;
        this.baseFieldLogText = baseFieldLogText;
        this.conditionDataType = conditionDataType;
        this.conditionField = conditionField;
        this.conditionOperator = conditionOperator;
        this.conditionValue = conditionValue;
        this.convertedRegularExpression = convertedRegularExpression;
        this.isEnabled = isEnabled;
        this.extendedFieldDefinitionId = extendedFieldDefinitionId;
        this.isSystem = isSystem;
        this.regularExpression = regularExpression;
        this.sourceId = sourceId;
        this.timeUpdated = timeUpdated;
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
        /** The regular expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayRegularExpression")
        private String displayRegularExpression;

        /**
         * The regular expression.
         *
         * @param displayRegularExpression the value to set
         * @return this builder
         */
        public Builder displayRegularExpression(String displayRegularExpression) {
            this.displayRegularExpression = displayRegularExpression;
            this.__explicitlySet__.add("displayRegularExpression");
            return this;
        }
        /** An array of extended fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedFields")
        private java.util.List<LogAnalyticsExtendedField> extendedFields;

        /**
         * An array of extended fields.
         *
         * @param extendedFields the value to set
         * @return this builder
         */
        public Builder extendedFields(java.util.List<LogAnalyticsExtendedField> extendedFields) {
            this.extendedFields = extendedFields;
            this.__explicitlySet__.add("extendedFields");
            return this;
        }
        /** The base field internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseFieldName")
        private String baseFieldName;

        /**
         * The base field internal name.
         *
         * @param baseFieldName the value to set
         * @return this builder
         */
        public Builder baseFieldName(String baseFieldName) {
            this.baseFieldName = baseFieldName;
            this.__explicitlySet__.add("baseFieldName");
            return this;
        }
        /** The base field log text. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseFieldLogText")
        private String baseFieldLogText;

        /**
         * The base field log text.
         *
         * @param baseFieldLogText the value to set
         * @return this builder
         */
        public Builder baseFieldLogText(String baseFieldLogText) {
            this.baseFieldLogText = baseFieldLogText;
            this.__explicitlySet__.add("baseFieldLogText");
            return this;
        }
        /** The conditional data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionDataType")
        private String conditionDataType;

        /**
         * The conditional data type.
         *
         * @param conditionDataType the value to set
         * @return this builder
         */
        public Builder conditionDataType(String conditionDataType) {
            this.conditionDataType = conditionDataType;
            this.__explicitlySet__.add("conditionDataType");
            return this;
        }
        /** The onditional field. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionField")
        private String conditionField;

        /**
         * The onditional field.
         *
         * @param conditionField the value to set
         * @return this builder
         */
        public Builder conditionField(String conditionField) {
            this.conditionField = conditionField;
            this.__explicitlySet__.add("conditionField");
            return this;
        }
        /** The conditional operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionOperator")
        private String conditionOperator;

        /**
         * The conditional operator.
         *
         * @param conditionOperator the value to set
         * @return this builder
         */
        public Builder conditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            this.__explicitlySet__.add("conditionOperator");
            return this;
        }
        /** The conditional value. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionValue")
        private String conditionValue;

        /**
         * The conditional value.
         *
         * @param conditionValue the value to set
         * @return this builder
         */
        public Builder conditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            this.__explicitlySet__.add("conditionValue");
            return this;
        }
        /** The converted regular expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("convertedRegularExpression")
        private String convertedRegularExpression;

        /**
         * The converted regular expression.
         *
         * @param convertedRegularExpression the value to set
         * @return this builder
         */
        public Builder convertedRegularExpression(String convertedRegularExpression) {
            this.convertedRegularExpression = convertedRegularExpression;
            this.__explicitlySet__.add("convertedRegularExpression");
            return this;
        }
        /** A flag inidcating whether or not the extended definition is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag inidcating whether or not the extended definition is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The extended field definition unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitionId")
        private Long extendedFieldDefinitionId;

        /**
         * The extended field definition unique identifier.
         *
         * @param extendedFieldDefinitionId the value to set
         * @return this builder
         */
        public Builder extendedFieldDefinitionId(Long extendedFieldDefinitionId) {
            this.extendedFieldDefinitionId = extendedFieldDefinitionId;
            this.__explicitlySet__.add("extendedFieldDefinitionId");
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
        /** The regular expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
        private String regularExpression;

        /**
         * The regular expression.
         *
         * @param regularExpression the value to set
         * @return this builder
         */
        public Builder regularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            this.__explicitlySet__.add("regularExpression");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceExtendedFieldDefinition build() {
            LogAnalyticsSourceExtendedFieldDefinition model =
                    new LogAnalyticsSourceExtendedFieldDefinition(
                            this.field,
                            this.displayRegularExpression,
                            this.extendedFields,
                            this.baseFieldName,
                            this.baseFieldLogText,
                            this.conditionDataType,
                            this.conditionField,
                            this.conditionOperator,
                            this.conditionValue,
                            this.convertedRegularExpression,
                            this.isEnabled,
                            this.extendedFieldDefinitionId,
                            this.isSystem,
                            this.regularExpression,
                            this.sourceId,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceExtendedFieldDefinition model) {
            if (model.wasPropertyExplicitlySet("field")) {
                this.field(model.getField());
            }
            if (model.wasPropertyExplicitlySet("displayRegularExpression")) {
                this.displayRegularExpression(model.getDisplayRegularExpression());
            }
            if (model.wasPropertyExplicitlySet("extendedFields")) {
                this.extendedFields(model.getExtendedFields());
            }
            if (model.wasPropertyExplicitlySet("baseFieldName")) {
                this.baseFieldName(model.getBaseFieldName());
            }
            if (model.wasPropertyExplicitlySet("baseFieldLogText")) {
                this.baseFieldLogText(model.getBaseFieldLogText());
            }
            if (model.wasPropertyExplicitlySet("conditionDataType")) {
                this.conditionDataType(model.getConditionDataType());
            }
            if (model.wasPropertyExplicitlySet("conditionField")) {
                this.conditionField(model.getConditionField());
            }
            if (model.wasPropertyExplicitlySet("conditionOperator")) {
                this.conditionOperator(model.getConditionOperator());
            }
            if (model.wasPropertyExplicitlySet("conditionValue")) {
                this.conditionValue(model.getConditionValue());
            }
            if (model.wasPropertyExplicitlySet("convertedRegularExpression")) {
                this.convertedRegularExpression(model.getConvertedRegularExpression());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("extendedFieldDefinitionId")) {
                this.extendedFieldDefinitionId(model.getExtendedFieldDefinitionId());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("regularExpression")) {
                this.regularExpression(model.getRegularExpression());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final LogAnalyticsField field;

    public LogAnalyticsField getField() {
        return field;
    }

    /** The regular expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayRegularExpression")
    private final String displayRegularExpression;

    /**
     * The regular expression.
     *
     * @return the value
     */
    public String getDisplayRegularExpression() {
        return displayRegularExpression;
    }

    /** An array of extended fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFields")
    private final java.util.List<LogAnalyticsExtendedField> extendedFields;

    /**
     * An array of extended fields.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsExtendedField> getExtendedFields() {
        return extendedFields;
    }

    /** The base field internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseFieldName")
    private final String baseFieldName;

    /**
     * The base field internal name.
     *
     * @return the value
     */
    public String getBaseFieldName() {
        return baseFieldName;
    }

    /** The base field log text. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseFieldLogText")
    private final String baseFieldLogText;

    /**
     * The base field log text.
     *
     * @return the value
     */
    public String getBaseFieldLogText() {
        return baseFieldLogText;
    }

    /** The conditional data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionDataType")
    private final String conditionDataType;

    /**
     * The conditional data type.
     *
     * @return the value
     */
    public String getConditionDataType() {
        return conditionDataType;
    }

    /** The onditional field. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionField")
    private final String conditionField;

    /**
     * The onditional field.
     *
     * @return the value
     */
    public String getConditionField() {
        return conditionField;
    }

    /** The conditional operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionOperator")
    private final String conditionOperator;

    /**
     * The conditional operator.
     *
     * @return the value
     */
    public String getConditionOperator() {
        return conditionOperator;
    }

    /** The conditional value. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionValue")
    private final String conditionValue;

    /**
     * The conditional value.
     *
     * @return the value
     */
    public String getConditionValue() {
        return conditionValue;
    }

    /** The converted regular expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("convertedRegularExpression")
    private final String convertedRegularExpression;

    /**
     * The converted regular expression.
     *
     * @return the value
     */
    public String getConvertedRegularExpression() {
        return convertedRegularExpression;
    }

    /** A flag inidcating whether or not the extended definition is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag inidcating whether or not the extended definition is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The extended field definition unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitionId")
    private final Long extendedFieldDefinitionId;

    /**
     * The extended field definition unique identifier.
     *
     * @return the value
     */
    public Long getExtendedFieldDefinitionId() {
        return extendedFieldDefinitionId;
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

    /** The regular expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
    private final String regularExpression;

    /**
     * The regular expression.
     *
     * @return the value
     */
    public String getRegularExpression() {
        return regularExpression;
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
        sb.append("LogAnalyticsSourceExtendedFieldDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("field=").append(String.valueOf(this.field));
        sb.append(", displayRegularExpression=")
                .append(String.valueOf(this.displayRegularExpression));
        sb.append(", extendedFields=").append(String.valueOf(this.extendedFields));
        sb.append(", baseFieldName=").append(String.valueOf(this.baseFieldName));
        sb.append(", baseFieldLogText=").append(String.valueOf(this.baseFieldLogText));
        sb.append(", conditionDataType=").append(String.valueOf(this.conditionDataType));
        sb.append(", conditionField=").append(String.valueOf(this.conditionField));
        sb.append(", conditionOperator=").append(String.valueOf(this.conditionOperator));
        sb.append(", conditionValue=").append(String.valueOf(this.conditionValue));
        sb.append(", convertedRegularExpression=")
                .append(String.valueOf(this.convertedRegularExpression));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", extendedFieldDefinitionId=")
                .append(String.valueOf(this.extendedFieldDefinitionId));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", regularExpression=").append(String.valueOf(this.regularExpression));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceExtendedFieldDefinition)) {
            return false;
        }

        LogAnalyticsSourceExtendedFieldDefinition other =
                (LogAnalyticsSourceExtendedFieldDefinition) o;
        return java.util.Objects.equals(this.field, other.field)
                && java.util.Objects.equals(
                        this.displayRegularExpression, other.displayRegularExpression)
                && java.util.Objects.equals(this.extendedFields, other.extendedFields)
                && java.util.Objects.equals(this.baseFieldName, other.baseFieldName)
                && java.util.Objects.equals(this.baseFieldLogText, other.baseFieldLogText)
                && java.util.Objects.equals(this.conditionDataType, other.conditionDataType)
                && java.util.Objects.equals(this.conditionField, other.conditionField)
                && java.util.Objects.equals(this.conditionOperator, other.conditionOperator)
                && java.util.Objects.equals(this.conditionValue, other.conditionValue)
                && java.util.Objects.equals(
                        this.convertedRegularExpression, other.convertedRegularExpression)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(
                        this.extendedFieldDefinitionId, other.extendedFieldDefinitionId)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.regularExpression, other.regularExpression)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result =
                (result * PRIME)
                        + (this.displayRegularExpression == null
                                ? 43
                                : this.displayRegularExpression.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedFields == null ? 43 : this.extendedFields.hashCode());
        result =
                (result * PRIME)
                        + (this.baseFieldName == null ? 43 : this.baseFieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.baseFieldLogText == null ? 43 : this.baseFieldLogText.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionDataType == null ? 43 : this.conditionDataType.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionField == null ? 43 : this.conditionField.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionOperator == null ? 43 : this.conditionOperator.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionValue == null ? 43 : this.conditionValue.hashCode());
        result =
                (result * PRIME)
                        + (this.convertedRegularExpression == null
                                ? 43
                                : this.convertedRegularExpression.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedFieldDefinitionId == null
                                ? 43
                                : this.extendedFieldDefinitionId.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.regularExpression == null ? 43 : this.regularExpression.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
