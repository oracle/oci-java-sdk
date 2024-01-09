/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceLabelCondition <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsSourceLabelCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsSourceLabelCondition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "conditionString",
        "conditionBlock",
        "message",
        "isVisible",
        "blockConditionField",
        "blockConditionOperator",
        "blockConditionValue",
        "labelConditionValue",
        "labelConditionValues",
        "contentExample",
        "isEnabled",
        "fieldName",
        "labelConditionId",
        "isSystem",
        "labelConditionOperator",
        "sourceId",
        "labelDisplayName",
        "storageField",
        "labelName",
        "isInlineLabelExistingInDatabase"
    })
    public LogAnalyticsSourceLabelCondition(
            String conditionString,
            ConditionBlock conditionBlock,
            String message,
            Boolean isVisible,
            String blockConditionField,
            String blockConditionOperator,
            String blockConditionValue,
            String labelConditionValue,
            java.util.List<String> labelConditionValues,
            String contentExample,
            Boolean isEnabled,
            String fieldName,
            Long labelConditionId,
            Boolean isSystem,
            String labelConditionOperator,
            Long sourceId,
            String labelDisplayName,
            String storageField,
            String labelName,
            Boolean isInlineLabelExistingInDatabase) {
        super();
        this.conditionString = conditionString;
        this.conditionBlock = conditionBlock;
        this.message = message;
        this.isVisible = isVisible;
        this.blockConditionField = blockConditionField;
        this.blockConditionOperator = blockConditionOperator;
        this.blockConditionValue = blockConditionValue;
        this.labelConditionValue = labelConditionValue;
        this.labelConditionValues = labelConditionValues;
        this.contentExample = contentExample;
        this.isEnabled = isEnabled;
        this.fieldName = fieldName;
        this.labelConditionId = labelConditionId;
        this.isSystem = isSystem;
        this.labelConditionOperator = labelConditionOperator;
        this.sourceId = sourceId;
        this.labelDisplayName = labelDisplayName;
        this.storageField = storageField;
        this.labelName = labelName;
        this.isInlineLabelExistingInDatabase = isInlineLabelExistingInDatabase;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * String representation of the label condition. This supports specifying multiple condition
         * blocks at various nested levels.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionString")
        private String conditionString;

        /**
         * String representation of the label condition. This supports specifying multiple condition
         * blocks at various nested levels.
         *
         * @param conditionString the value to set
         * @return this builder
         */
        public Builder conditionString(String conditionString) {
            this.conditionString = conditionString;
            this.__explicitlySet__.add("conditionString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionBlock")
        private ConditionBlock conditionBlock;

        public Builder conditionBlock(ConditionBlock conditionBlock) {
            this.conditionBlock = conditionBlock;
            this.__explicitlySet__.add("conditionBlock");
            return this;
        }
        /** The message. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The message.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** A flag indicating whether or not the label condition is visible. */
        @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
        private Boolean isVisible;

        /**
         * A flag indicating whether or not the label condition is visible.
         *
         * @param isVisible the value to set
         * @return this builder
         */
        public Builder isVisible(Boolean isVisible) {
            this.isVisible = isVisible;
            this.__explicitlySet__.add("isVisible");
            return this;
        }
        /** The block condition field. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionField")
        private String blockConditionField;

        /**
         * The block condition field.
         *
         * @param blockConditionField the value to set
         * @return this builder
         */
        public Builder blockConditionField(String blockConditionField) {
            this.blockConditionField = blockConditionField;
            this.__explicitlySet__.add("blockConditionField");
            return this;
        }
        /** The block condition operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionOperator")
        private String blockConditionOperator;

        /**
         * The block condition operator.
         *
         * @param blockConditionOperator the value to set
         * @return this builder
         */
        public Builder blockConditionOperator(String blockConditionOperator) {
            this.blockConditionOperator = blockConditionOperator;
            this.__explicitlySet__.add("blockConditionOperator");
            return this;
        }
        /** The block condition value. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionValue")
        private String blockConditionValue;

        /**
         * The block condition value.
         *
         * @param blockConditionValue the value to set
         * @return this builder
         */
        public Builder blockConditionValue(String blockConditionValue) {
            this.blockConditionValue = blockConditionValue;
            this.__explicitlySet__.add("blockConditionValue");
            return this;
        }
        /** The condition value. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValue")
        private String labelConditionValue;

        /**
         * The condition value.
         *
         * @param labelConditionValue the value to set
         * @return this builder
         */
        public Builder labelConditionValue(String labelConditionValue) {
            this.labelConditionValue = labelConditionValue;
            this.__explicitlySet__.add("labelConditionValue");
            return this;
        }
        /** A list of condition values. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValues")
        private java.util.List<String> labelConditionValues;

        /**
         * A list of condition values.
         *
         * @param labelConditionValues the value to set
         * @return this builder
         */
        public Builder labelConditionValues(java.util.List<String> labelConditionValues) {
            this.labelConditionValues = labelConditionValues;
            this.__explicitlySet__.add("labelConditionValues");
            return this;
        }
        /** The content example. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentExample")
        private String contentExample;

        /**
         * The content example.
         *
         * @param contentExample the value to set
         * @return this builder
         */
        public Builder contentExample(String contentExample) {
            this.contentExample = contentExample;
            this.__explicitlySet__.add("contentExample");
            return this;
        }
        /** A flag inidcating whether or not the condition is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag inidcating whether or not the condition is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The internal field name. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * The internal field name.
         *
         * @param fieldName the value to set
         * @return this builder
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /** The unique identifier of the condition. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionId")
        private Long labelConditionId;

        /**
         * The unique identifier of the condition.
         *
         * @param labelConditionId the value to set
         * @return this builder
         */
        public Builder labelConditionId(Long labelConditionId) {
            this.labelConditionId = labelConditionId;
            this.__explicitlySet__.add("labelConditionId");
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
        /** The condition operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionOperator")
        private String labelConditionOperator;

        /**
         * The condition operator.
         *
         * @param labelConditionOperator the value to set
         * @return this builder
         */
        public Builder labelConditionOperator(String labelConditionOperator) {
            this.labelConditionOperator = labelConditionOperator;
            this.__explicitlySet__.add("labelConditionOperator");
            return this;
        }
        /** The unique identifier of the source. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        /**
         * The unique identifier of the source.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /** The label display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelDisplayName")
        private String labelDisplayName;

        /**
         * The label display name.
         *
         * @param labelDisplayName the value to set
         * @return this builder
         */
        public Builder labelDisplayName(String labelDisplayName) {
            this.labelDisplayName = labelDisplayName;
            this.__explicitlySet__.add("labelDisplayName");
            return this;
        }
        /** The label storage field. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageField")
        private String storageField;

        /**
         * The label storage field.
         *
         * @param storageField the value to set
         * @return this builder
         */
        public Builder storageField(String storageField) {
            this.storageField = storageField;
            this.__explicitlySet__.add("storageField");
            return this;
        }
        /** The label name. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelName")
        private String labelName;

        /**
         * The label name.
         *
         * @param labelName the value to set
         * @return this builder
         */
        public Builder labelName(String labelName) {
            this.labelName = labelName;
            this.__explicitlySet__.add("labelName");
            return this;
        }
        /** A flag indicating whether or not the inline label exists in the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isInlineLabelExistingInDatabase")
        private Boolean isInlineLabelExistingInDatabase;

        /**
         * A flag indicating whether or not the inline label exists in the database.
         *
         * @param isInlineLabelExistingInDatabase the value to set
         * @return this builder
         */
        public Builder isInlineLabelExistingInDatabase(Boolean isInlineLabelExistingInDatabase) {
            this.isInlineLabelExistingInDatabase = isInlineLabelExistingInDatabase;
            this.__explicitlySet__.add("isInlineLabelExistingInDatabase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceLabelCondition build() {
            LogAnalyticsSourceLabelCondition model =
                    new LogAnalyticsSourceLabelCondition(
                            this.conditionString,
                            this.conditionBlock,
                            this.message,
                            this.isVisible,
                            this.blockConditionField,
                            this.blockConditionOperator,
                            this.blockConditionValue,
                            this.labelConditionValue,
                            this.labelConditionValues,
                            this.contentExample,
                            this.isEnabled,
                            this.fieldName,
                            this.labelConditionId,
                            this.isSystem,
                            this.labelConditionOperator,
                            this.sourceId,
                            this.labelDisplayName,
                            this.storageField,
                            this.labelName,
                            this.isInlineLabelExistingInDatabase);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceLabelCondition model) {
            if (model.wasPropertyExplicitlySet("conditionString")) {
                this.conditionString(model.getConditionString());
            }
            if (model.wasPropertyExplicitlySet("conditionBlock")) {
                this.conditionBlock(model.getConditionBlock());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("isVisible")) {
                this.isVisible(model.getIsVisible());
            }
            if (model.wasPropertyExplicitlySet("blockConditionField")) {
                this.blockConditionField(model.getBlockConditionField());
            }
            if (model.wasPropertyExplicitlySet("blockConditionOperator")) {
                this.blockConditionOperator(model.getBlockConditionOperator());
            }
            if (model.wasPropertyExplicitlySet("blockConditionValue")) {
                this.blockConditionValue(model.getBlockConditionValue());
            }
            if (model.wasPropertyExplicitlySet("labelConditionValue")) {
                this.labelConditionValue(model.getLabelConditionValue());
            }
            if (model.wasPropertyExplicitlySet("labelConditionValues")) {
                this.labelConditionValues(model.getLabelConditionValues());
            }
            if (model.wasPropertyExplicitlySet("contentExample")) {
                this.contentExample(model.getContentExample());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("labelConditionId")) {
                this.labelConditionId(model.getLabelConditionId());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("labelConditionOperator")) {
                this.labelConditionOperator(model.getLabelConditionOperator());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("labelDisplayName")) {
                this.labelDisplayName(model.getLabelDisplayName());
            }
            if (model.wasPropertyExplicitlySet("storageField")) {
                this.storageField(model.getStorageField());
            }
            if (model.wasPropertyExplicitlySet("labelName")) {
                this.labelName(model.getLabelName());
            }
            if (model.wasPropertyExplicitlySet("isInlineLabelExistingInDatabase")) {
                this.isInlineLabelExistingInDatabase(model.getIsInlineLabelExistingInDatabase());
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

    /**
     * String representation of the label condition. This supports specifying multiple condition
     * blocks at various nested levels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionString")
    private final String conditionString;

    /**
     * String representation of the label condition. This supports specifying multiple condition
     * blocks at various nested levels.
     *
     * @return the value
     */
    public String getConditionString() {
        return conditionString;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditionBlock")
    private final ConditionBlock conditionBlock;

    public ConditionBlock getConditionBlock() {
        return conditionBlock;
    }

    /** The message. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The message.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** A flag indicating whether or not the label condition is visible. */
    @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
    private final Boolean isVisible;

    /**
     * A flag indicating whether or not the label condition is visible.
     *
     * @return the value
     */
    public Boolean getIsVisible() {
        return isVisible;
    }

    /** The block condition field. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionField")
    private final String blockConditionField;

    /**
     * The block condition field.
     *
     * @return the value
     */
    public String getBlockConditionField() {
        return blockConditionField;
    }

    /** The block condition operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionOperator")
    private final String blockConditionOperator;

    /**
     * The block condition operator.
     *
     * @return the value
     */
    public String getBlockConditionOperator() {
        return blockConditionOperator;
    }

    /** The block condition value. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionValue")
    private final String blockConditionValue;

    /**
     * The block condition value.
     *
     * @return the value
     */
    public String getBlockConditionValue() {
        return blockConditionValue;
    }

    /** The condition value. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValue")
    private final String labelConditionValue;

    /**
     * The condition value.
     *
     * @return the value
     */
    public String getLabelConditionValue() {
        return labelConditionValue;
    }

    /** A list of condition values. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValues")
    private final java.util.List<String> labelConditionValues;

    /**
     * A list of condition values.
     *
     * @return the value
     */
    public java.util.List<String> getLabelConditionValues() {
        return labelConditionValues;
    }

    /** The content example. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentExample")
    private final String contentExample;

    /**
     * The content example.
     *
     * @return the value
     */
    public String getContentExample() {
        return contentExample;
    }

    /** A flag inidcating whether or not the condition is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag inidcating whether or not the condition is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The internal field name. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * The internal field name.
     *
     * @return the value
     */
    public String getFieldName() {
        return fieldName;
    }

    /** The unique identifier of the condition. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionId")
    private final Long labelConditionId;

    /**
     * The unique identifier of the condition.
     *
     * @return the value
     */
    public Long getLabelConditionId() {
        return labelConditionId;
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

    /** The condition operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionOperator")
    private final String labelConditionOperator;

    /**
     * The condition operator.
     *
     * @return the value
     */
    public String getLabelConditionOperator() {
        return labelConditionOperator;
    }

    /** The unique identifier of the source. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    /**
     * The unique identifier of the source.
     *
     * @return the value
     */
    public Long getSourceId() {
        return sourceId;
    }

    /** The label display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelDisplayName")
    private final String labelDisplayName;

    /**
     * The label display name.
     *
     * @return the value
     */
    public String getLabelDisplayName() {
        return labelDisplayName;
    }

    /** The label storage field. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageField")
    private final String storageField;

    /**
     * The label storage field.
     *
     * @return the value
     */
    public String getStorageField() {
        return storageField;
    }

    /** The label name. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelName")
    private final String labelName;

    /**
     * The label name.
     *
     * @return the value
     */
    public String getLabelName() {
        return labelName;
    }

    /** A flag indicating whether or not the inline label exists in the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isInlineLabelExistingInDatabase")
    private final Boolean isInlineLabelExistingInDatabase;

    /**
     * A flag indicating whether or not the inline label exists in the database.
     *
     * @return the value
     */
    public Boolean getIsInlineLabelExistingInDatabase() {
        return isInlineLabelExistingInDatabase;
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
        sb.append("LogAnalyticsSourceLabelCondition(");
        sb.append("super=").append(super.toString());
        sb.append("conditionString=").append(String.valueOf(this.conditionString));
        sb.append(", conditionBlock=").append(String.valueOf(this.conditionBlock));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", isVisible=").append(String.valueOf(this.isVisible));
        sb.append(", blockConditionField=").append(String.valueOf(this.blockConditionField));
        sb.append(", blockConditionOperator=").append(String.valueOf(this.blockConditionOperator));
        sb.append(", blockConditionValue=").append(String.valueOf(this.blockConditionValue));
        sb.append(", labelConditionValue=").append(String.valueOf(this.labelConditionValue));
        sb.append(", labelConditionValues=").append(String.valueOf(this.labelConditionValues));
        sb.append(", contentExample=").append(String.valueOf(this.contentExample));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", labelConditionId=").append(String.valueOf(this.labelConditionId));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", labelConditionOperator=").append(String.valueOf(this.labelConditionOperator));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", labelDisplayName=").append(String.valueOf(this.labelDisplayName));
        sb.append(", storageField=").append(String.valueOf(this.storageField));
        sb.append(", labelName=").append(String.valueOf(this.labelName));
        sb.append(", isInlineLabelExistingInDatabase=")
                .append(String.valueOf(this.isInlineLabelExistingInDatabase));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceLabelCondition)) {
            return false;
        }

        LogAnalyticsSourceLabelCondition other = (LogAnalyticsSourceLabelCondition) o;
        return java.util.Objects.equals(this.conditionString, other.conditionString)
                && java.util.Objects.equals(this.conditionBlock, other.conditionBlock)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.isVisible, other.isVisible)
                && java.util.Objects.equals(this.blockConditionField, other.blockConditionField)
                && java.util.Objects.equals(
                        this.blockConditionOperator, other.blockConditionOperator)
                && java.util.Objects.equals(this.blockConditionValue, other.blockConditionValue)
                && java.util.Objects.equals(this.labelConditionValue, other.labelConditionValue)
                && java.util.Objects.equals(this.labelConditionValues, other.labelConditionValues)
                && java.util.Objects.equals(this.contentExample, other.contentExample)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.labelConditionId, other.labelConditionId)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(
                        this.labelConditionOperator, other.labelConditionOperator)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.labelDisplayName, other.labelDisplayName)
                && java.util.Objects.equals(this.storageField, other.storageField)
                && java.util.Objects.equals(this.labelName, other.labelName)
                && java.util.Objects.equals(
                        this.isInlineLabelExistingInDatabase, other.isInlineLabelExistingInDatabase)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.conditionString == null ? 43 : this.conditionString.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionBlock == null ? 43 : this.conditionBlock.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.isVisible == null ? 43 : this.isVisible.hashCode());
        result =
                (result * PRIME)
                        + (this.blockConditionField == null
                                ? 43
                                : this.blockConditionField.hashCode());
        result =
                (result * PRIME)
                        + (this.blockConditionOperator == null
                                ? 43
                                : this.blockConditionOperator.hashCode());
        result =
                (result * PRIME)
                        + (this.blockConditionValue == null
                                ? 43
                                : this.blockConditionValue.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionValue == null
                                ? 43
                                : this.labelConditionValue.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionValues == null
                                ? 43
                                : this.labelConditionValues.hashCode());
        result =
                (result * PRIME)
                        + (this.contentExample == null ? 43 : this.contentExample.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionId == null ? 43 : this.labelConditionId.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionOperator == null
                                ? 43
                                : this.labelConditionOperator.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.labelDisplayName == null ? 43 : this.labelDisplayName.hashCode());
        result = (result * PRIME) + (this.storageField == null ? 43 : this.storageField.hashCode());
        result = (result * PRIME) + (this.labelName == null ? 43 : this.labelName.hashCode());
        result =
                (result * PRIME)
                        + (this.isInlineLabelExistingInDatabase == null
                                ? 43
                                : this.isInlineLabelExistingInDatabase.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
