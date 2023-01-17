/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * The update alert rule details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateAlertRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateAlertRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "type",
        "threshold",
        "thresholdType",
        "recipients",
        "description",
        "message",
        "freeformTags",
        "definedTags"
    })
    public UpdateAlertRuleDetails(
            String displayName,
            AlertType type,
            java.math.BigDecimal threshold,
            ThresholdType thresholdType,
            String recipients,
            String description,
            String message,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.type = type;
        this.threshold = threshold;
        this.thresholdType = thresholdType;
        this.recipients = recipients;
        this.description = description;
        this.message = message;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the alert rule. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the alert rule. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The type of the alert. Valid values are ACTUAL (the alert triggers based on actual
         * usage), or FORECAST (the alert triggers based on predicted usage).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AlertType type;

        /**
         * The type of the alert. Valid values are ACTUAL (the alert triggers based on actual
         * usage), or FORECAST (the alert triggers based on predicted usage).
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(AlertType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The threshold for triggering the alert, expressed as a whole number or decimal value. If
         * the thresholdType is ABSOLUTE, the threshold can have at most 12 digits before the
         * decimal point, and up to two digits after the decimal point. If the thresholdType is
         * PERCENTAGE, the maximum value is 10000 and can have up to two digits after the decimal
         * point.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private java.math.BigDecimal threshold;

        /**
         * The threshold for triggering the alert, expressed as a whole number or decimal value. If
         * the thresholdType is ABSOLUTE, the threshold can have at most 12 digits before the
         * decimal point, and up to two digits after the decimal point. If the thresholdType is
         * PERCENTAGE, the maximum value is 10000 and can have up to two digits after the decimal
         * point.
         *
         * @param threshold the value to set
         * @return this builder
         */
        public Builder threshold(java.math.BigDecimal threshold) {
            this.threshold = threshold;
            this.__explicitlySet__.add("threshold");
            return this;
        }
        /** The type of threshold. */
        @com.fasterxml.jackson.annotation.JsonProperty("thresholdType")
        private ThresholdType thresholdType;

        /**
         * The type of threshold.
         *
         * @param thresholdType the value to set
         * @return this builder
         */
        public Builder thresholdType(ThresholdType thresholdType) {
            this.thresholdType = thresholdType;
            this.__explicitlySet__.add("thresholdType");
            return this;
        }
        /**
         * The audience that receives the alert when it triggers. If you need to clear out this
         * value, pass in an empty string instead of a null value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recipients")
        private String recipients;

        /**
         * The audience that receives the alert when it triggers. If you need to clear out this
         * value, pass in an empty string instead of a null value.
         *
         * @param recipients the value to set
         * @return this builder
         */
        public Builder recipients(String recipients) {
            this.recipients = recipients;
            this.__explicitlySet__.add("recipients");
            return this;
        }
        /** The description of the alert rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the alert rule.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The message to be delivered to the recipients when an alert is triggered. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The message to be delivered to the recipients when an alert is triggered.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAlertRuleDetails build() {
            UpdateAlertRuleDetails model =
                    new UpdateAlertRuleDetails(
                            this.displayName,
                            this.type,
                            this.threshold,
                            this.thresholdType,
                            this.recipients,
                            this.description,
                            this.message,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAlertRuleDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("threshold")) {
                this.threshold(model.getThreshold());
            }
            if (model.wasPropertyExplicitlySet("thresholdType")) {
                this.thresholdType(model.getThresholdType());
            }
            if (model.wasPropertyExplicitlySet("recipients")) {
                this.recipients(model.getRecipients());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The name of the alert rule. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the alert rule. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The type of the alert. Valid values are ACTUAL (the alert triggers based on actual usage), or
     * FORECAST (the alert triggers based on predicted usage).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final AlertType type;

    /**
     * The type of the alert. Valid values are ACTUAL (the alert triggers based on actual usage), or
     * FORECAST (the alert triggers based on predicted usage).
     *
     * @return the value
     */
    public AlertType getType() {
        return type;
    }

    /**
     * The threshold for triggering the alert, expressed as a whole number or decimal value. If the
     * thresholdType is ABSOLUTE, the threshold can have at most 12 digits before the decimal point,
     * and up to two digits after the decimal point. If the thresholdType is PERCENTAGE, the maximum
     * value is 10000 and can have up to two digits after the decimal point.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final java.math.BigDecimal threshold;

    /**
     * The threshold for triggering the alert, expressed as a whole number or decimal value. If the
     * thresholdType is ABSOLUTE, the threshold can have at most 12 digits before the decimal point,
     * and up to two digits after the decimal point. If the thresholdType is PERCENTAGE, the maximum
     * value is 10000 and can have up to two digits after the decimal point.
     *
     * @return the value
     */
    public java.math.BigDecimal getThreshold() {
        return threshold;
    }

    /** The type of threshold. */
    @com.fasterxml.jackson.annotation.JsonProperty("thresholdType")
    private final ThresholdType thresholdType;

    /**
     * The type of threshold.
     *
     * @return the value
     */
    public ThresholdType getThresholdType() {
        return thresholdType;
    }

    /**
     * The audience that receives the alert when it triggers. If you need to clear out this value,
     * pass in an empty string instead of a null value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recipients")
    private final String recipients;

    /**
     * The audience that receives the alert when it triggers. If you need to clear out this value,
     * pass in an empty string instead of a null value.
     *
     * @return the value
     */
    public String getRecipients() {
        return recipients;
    }

    /** The description of the alert rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the alert rule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The message to be delivered to the recipients when an alert is triggered. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The message to be delivered to the recipients when an alert is triggered.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateAlertRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(", thresholdType=").append(String.valueOf(this.thresholdType));
        sb.append(", recipients=").append(String.valueOf(this.recipients));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAlertRuleDetails)) {
            return false;
        }

        UpdateAlertRuleDetails other = (UpdateAlertRuleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.threshold, other.threshold)
                && java.util.Objects.equals(this.thresholdType, other.thresholdType)
                && java.util.Objects.equals(this.recipients, other.recipients)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result =
                (result * PRIME)
                        + (this.thresholdType == null ? 43 : this.thresholdType.hashCode());
        result = (result * PRIME) + (this.recipients == null ? 43 : this.recipients.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
