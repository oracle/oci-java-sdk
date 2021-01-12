/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceLabelCondition
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
    builder = LogAnalyticsSourceLabelCondition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsSourceLabelCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
        private Boolean isVisible;

        public Builder isVisible(Boolean isVisible) {
            this.isVisible = isVisible;
            this.__explicitlySet__.add("isVisible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionField")
        private String blockConditionField;

        public Builder blockConditionField(String blockConditionField) {
            this.blockConditionField = blockConditionField;
            this.__explicitlySet__.add("blockConditionField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionOperator")
        private String blockConditionOperator;

        public Builder blockConditionOperator(String blockConditionOperator) {
            this.blockConditionOperator = blockConditionOperator;
            this.__explicitlySet__.add("blockConditionOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionValue")
        private String blockConditionValue;

        public Builder blockConditionValue(String blockConditionValue) {
            this.blockConditionValue = blockConditionValue;
            this.__explicitlySet__.add("blockConditionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValue")
        private String labelConditionValue;

        public Builder labelConditionValue(String labelConditionValue) {
            this.labelConditionValue = labelConditionValue;
            this.__explicitlySet__.add("labelConditionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValues")
        private java.util.List<String> labelConditionValues;

        public Builder labelConditionValues(java.util.List<String> labelConditionValues) {
            this.labelConditionValues = labelConditionValues;
            this.__explicitlySet__.add("labelConditionValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentExample")
        private String contentExample;

        public Builder contentExample(String contentExample) {
            this.contentExample = contentExample;
            this.__explicitlySet__.add("contentExample");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionId")
        private Long labelConditionId;

        public Builder labelConditionId(Long labelConditionId) {
            this.labelConditionId = labelConditionId;
            this.__explicitlySet__.add("labelConditionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionOperator")
        private String labelConditionOperator;

        public Builder labelConditionOperator(String labelConditionOperator) {
            this.labelConditionOperator = labelConditionOperator;
            this.__explicitlySet__.add("labelConditionOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelDisplayName")
        private String labelDisplayName;

        public Builder labelDisplayName(String labelDisplayName) {
            this.labelDisplayName = labelDisplayName;
            this.__explicitlySet__.add("labelDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageField")
        private String storageField;

        public Builder storageField(String storageField) {
            this.storageField = storageField;
            this.__explicitlySet__.add("storageField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelName")
        private String labelName;

        public Builder labelName(String labelName) {
            this.labelName = labelName;
            this.__explicitlySet__.add("labelName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInlineLabelExistingInDatabase")
        private Boolean isInlineLabelExistingInDatabase;

        public Builder isInlineLabelExistingInDatabase(Boolean isInlineLabelExistingInDatabase) {
            this.isInlineLabelExistingInDatabase = isInlineLabelExistingInDatabase;
            this.__explicitlySet__.add("isInlineLabelExistingInDatabase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceLabelCondition build() {
            LogAnalyticsSourceLabelCondition __instance__ =
                    new LogAnalyticsSourceLabelCondition(
                            message,
                            isVisible,
                            blockConditionField,
                            blockConditionOperator,
                            blockConditionValue,
                            labelConditionValue,
                            labelConditionValues,
                            contentExample,
                            isEnabled,
                            fieldName,
                            labelConditionId,
                            isSystem,
                            labelConditionOperator,
                            sourceId,
                            labelDisplayName,
                            storageField,
                            labelName,
                            isInlineLabelExistingInDatabase);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceLabelCondition o) {
            Builder copiedBuilder =
                    message(o.getMessage())
                            .isVisible(o.getIsVisible())
                            .blockConditionField(o.getBlockConditionField())
                            .blockConditionOperator(o.getBlockConditionOperator())
                            .blockConditionValue(o.getBlockConditionValue())
                            .labelConditionValue(o.getLabelConditionValue())
                            .labelConditionValues(o.getLabelConditionValues())
                            .contentExample(o.getContentExample())
                            .isEnabled(o.getIsEnabled())
                            .fieldName(o.getFieldName())
                            .labelConditionId(o.getLabelConditionId())
                            .isSystem(o.getIsSystem())
                            .labelConditionOperator(o.getLabelConditionOperator())
                            .sourceId(o.getSourceId())
                            .labelDisplayName(o.getLabelDisplayName())
                            .storageField(o.getStorageField())
                            .labelName(o.getLabelName())
                            .isInlineLabelExistingInDatabase(
                                    o.getIsInlineLabelExistingInDatabase());

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
     * message
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;

    /**
     * visible flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
    Boolean isVisible;

    /**
     * block condition field
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionField")
    String blockConditionField;

    /**
     * block condition operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionOperator")
    String blockConditionOperator;

    /**
     * block condition value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionValue")
    String blockConditionValue;

    /**
     * condition value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValue")
    String labelConditionValue;

    /**
     * list of condition values
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValues")
    java.util.List<String> labelConditionValues;

    /**
     * content example
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentExample")
    String contentExample;

    /**
     * enabled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * field internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    String fieldName;

    /**
     * Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionId")
    Long labelConditionId;

    /**
     * is system flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionOperator")
    String labelConditionOperator;

    /**
     * source Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    Long sourceId;

    /**
     * label display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelDisplayName")
    String labelDisplayName;

    /**
     * label storage field
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageField")
    String storageField;

    /**
     * label name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelName")
    String labelName;

    /**
     * inline label exists in DB flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInlineLabelExistingInDatabase")
    Boolean isInlineLabelExistingInDatabase;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
