/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.budget.model;

/**
 * The create alert rule details. This is a batch-create.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAlertRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateAlertRuleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AlertType type;

        public Builder type(AlertType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private java.math.BigDecimal threshold;

        public Builder threshold(java.math.BigDecimal threshold) {
            this.threshold = threshold;
            this.__explicitlySet__.add("threshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("thresholdType")
        private ThresholdType thresholdType;

        public Builder thresholdType(ThresholdType thresholdType) {
            this.thresholdType = thresholdType;
            this.__explicitlySet__.add("thresholdType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recipients")
        private String recipients;

        public Builder recipients(String recipients) {
            this.recipients = recipients;
            this.__explicitlySet__.add("recipients");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAlertRuleDetails build() {
            CreateAlertRuleDetails __instance__ =
                    new CreateAlertRuleDetails(
                            displayName,
                            description,
                            type,
                            threshold,
                            thresholdType,
                            recipients,
                            message,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAlertRuleDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .type(o.getType())
                            .threshold(o.getThreshold())
                            .thresholdType(o.getThresholdType())
                            .recipients(o.getRecipients())
                            .message(o.getMessage())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The name of the alert rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The description of the alert rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Type of alert. Valid values are ACTUAL (the alert will trigger based on actual usage) or
     * FORECAST (the alert will trigger based on predicted usage).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    AlertType type;

    /**
     * The threshold for triggering the alert expressed as a whole number or decimal value.
     * If thresholdType is ABSOLUTE, threshold can have at most 12 digits before the decimal point and up to 2 digits after the decimal point.
     * If thresholdType is PERCENTAGE, the maximum value is 10000 and can have up to 2 digits after the decimal point.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    java.math.BigDecimal threshold;

    /**
     * The type of threshold.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thresholdType")
    ThresholdType thresholdType;

    /**
     * The audience that will receive the alert when it triggers. An empty string is interpreted as null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recipients")
    String recipients;

    /**
     * The message to be sent to the recipients when alert rule is triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
