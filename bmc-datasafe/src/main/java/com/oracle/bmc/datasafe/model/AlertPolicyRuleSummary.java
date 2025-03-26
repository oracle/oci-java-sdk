/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A rule associated with an alert policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AlertPolicyRuleSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AlertPolicyRuleSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "description",
        "expression",
        "lifecycleState",
        "displayName",
        "timeCreated"
    })
    public AlertPolicyRuleSummary(
            String key,
            String description,
            String expression,
            AlertPolicyRuleLifecycleState lifecycleState,
            String displayName,
            java.util.Date timeCreated) {
        super();
        this.key = key;
        this.description = description;
        this.expression = expression;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key of the alert policy rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key of the alert policy rule.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Describes the alert policy rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Describes the alert policy rule.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The conditional expression of the alert policy rule which evaluates to boolean value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * The conditional expression of the alert policy rule which evaluates to boolean value.
         * @param expression the value to set
         * @return this builder
         **/
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /**
         * The current state of the alert policy rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AlertPolicyRuleLifecycleState lifecycleState;

        /**
         * The current state of the alert policy rule.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AlertPolicyRuleLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The display name of the alert policy rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the alert policy rule.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Creation date and time of the alert policy rule, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Creation date and time of the alert policy rule, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlertPolicyRuleSummary build() {
            AlertPolicyRuleSummary model =
                    new AlertPolicyRuleSummary(
                            this.key,
                            this.description,
                            this.expression,
                            this.lifecycleState,
                            this.displayName,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlertPolicyRuleSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            return this;
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

    /**
     * The unique key of the alert policy rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key of the alert policy rule.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Describes the alert policy rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Describes the alert policy rule.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The conditional expression of the alert policy rule which evaluates to boolean value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * The conditional expression of the alert policy rule which evaluates to boolean value.
     * @return the value
     **/
    public String getExpression() {
        return expression;
    }

    /**
     * The current state of the alert policy rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AlertPolicyRuleLifecycleState lifecycleState;

    /**
     * The current state of the alert policy rule.
     * @return the value
     **/
    public AlertPolicyRuleLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The display name of the alert policy rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the alert policy rule.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Creation date and time of the alert policy rule, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Creation date and time of the alert policy rule, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AlertPolicyRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlertPolicyRuleSummary)) {
            return false;
        }

        AlertPolicyRuleSummary other = (AlertPolicyRuleSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
