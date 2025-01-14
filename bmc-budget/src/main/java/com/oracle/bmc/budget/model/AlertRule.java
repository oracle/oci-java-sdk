/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * The alert rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AlertRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AlertRule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "budgetId",
        "displayName",
        "type",
        "threshold",
        "thresholdType",
        "lifecycleState",
        "message",
        "description",
        "version",
        "recipients",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags"
    })
    public AlertRule(
            String id,
            String budgetId,
            String displayName,
            AlertType type,
            java.math.BigDecimal threshold,
            ThresholdType thresholdType,
            LifecycleState lifecycleState,
            String message,
            String description,
            Integer version,
            String recipients,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.budgetId = budgetId;
        this.displayName = displayName;
        this.type = type;
        this.threshold = threshold;
        this.thresholdType = thresholdType;
        this.lifecycleState = lifecycleState;
        this.message = message;
        this.description = description;
        this.version = version;
        this.recipients = recipients;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the alert rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the alert rule.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the budget. */
        @com.fasterxml.jackson.annotation.JsonProperty("budgetId")
        private String budgetId;

        /**
         * The OCID of the budget.
         *
         * @param budgetId the value to set
         * @return this builder
         */
        public Builder budgetId(String budgetId) {
            this.budgetId = budgetId;
            this.__explicitlySet__.add("budgetId");
            return this;
        }
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
         * The threshold for triggering the alert. If the thresholdType is PERCENTAGE, the maximum
         * value is 10000.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private java.math.BigDecimal threshold;

        /**
         * The threshold for triggering the alert. If the thresholdType is PERCENTAGE, the maximum
         * value is 10000.
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
        /** The current state of the alert rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the alert rule.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Custom message sent when an alert is triggered. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Custom message sent when an alert is triggered.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
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
        /** The version of the alert rule. Starts from 1 and increments by 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * The version of the alert rule. Starts from 1 and increments by 1.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The delimited list of email addresses to receive the alert when it triggers. Delimiter
         * characters can be a comma, space, TAB, or semicolon.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recipients")
        private String recipients;

        /**
         * The delimited list of email addresses to receive the alert when it triggers. Delimiter
         * characters can be a comma, space, TAB, or semicolon.
         *
         * @param recipients the value to set
         * @return this builder
         */
        public Builder recipients(String recipients) {
            this.recipients = recipients;
            this.__explicitlySet__.add("recipients");
            return this;
        }
        /** The time the budget was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the budget was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the budget was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the budget was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        public AlertRule build() {
            AlertRule model =
                    new AlertRule(
                            this.id,
                            this.budgetId,
                            this.displayName,
                            this.type,
                            this.threshold,
                            this.thresholdType,
                            this.lifecycleState,
                            this.message,
                            this.description,
                            this.version,
                            this.recipients,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlertRule model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("budgetId")) {
                this.budgetId(model.getBudgetId());
            }
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("recipients")) {
                this.recipients(model.getRecipients());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** The OCID of the alert rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the alert rule.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the budget. */
    @com.fasterxml.jackson.annotation.JsonProperty("budgetId")
    private final String budgetId;

    /**
     * The OCID of the budget.
     *
     * @return the value
     */
    public String getBudgetId() {
        return budgetId;
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
     * The threshold for triggering the alert. If the thresholdType is PERCENTAGE, the maximum value
     * is 10000.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final java.math.BigDecimal threshold;

    /**
     * The threshold for triggering the alert. If the thresholdType is PERCENTAGE, the maximum value
     * is 10000.
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

    /** The current state of the alert rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the alert rule.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Custom message sent when an alert is triggered. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Custom message sent when an alert is triggered.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
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

    /** The version of the alert rule. Starts from 1 and increments by 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * The version of the alert rule. Starts from 1 and increments by 1.
     *
     * @return the value
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * The delimited list of email addresses to receive the alert when it triggers. Delimiter
     * characters can be a comma, space, TAB, or semicolon.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recipients")
    private final String recipients;

    /**
     * The delimited list of email addresses to receive the alert when it triggers. Delimiter
     * characters can be a comma, space, TAB, or semicolon.
     *
     * @return the value
     */
    public String getRecipients() {
        return recipients;
    }

    /** The time the budget was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the budget was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the budget was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the budget was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("AlertRule(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", budgetId=").append(String.valueOf(this.budgetId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(", thresholdType=").append(String.valueOf(this.thresholdType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", recipients=").append(String.valueOf(this.recipients));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof AlertRule)) {
            return false;
        }

        AlertRule other = (AlertRule) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.budgetId, other.budgetId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.threshold, other.threshold)
                && java.util.Objects.equals(this.thresholdType, other.thresholdType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.recipients, other.recipients)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.budgetId == null ? 43 : this.budgetId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result =
                (result * PRIME)
                        + (this.thresholdType == null ? 43 : this.thresholdType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.recipients == null ? 43 : this.recipients.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
