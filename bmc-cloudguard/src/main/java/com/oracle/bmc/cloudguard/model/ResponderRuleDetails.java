/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of ResponderRule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResponderRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResponderRuleDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"condition", "configurations", "isEnabled", "mode"})
    public ResponderRuleDetails(
            Condition condition,
            java.util.List<ResponderConfiguration> configurations,
            Boolean isEnabled,
            ResponderModeTypes mode) {
        super();
        this.condition = condition;
        this.configurations = configurations;
        this.isEnabled = isEnabled;
        this.mode = mode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Condition condition;

        public Builder condition(Condition condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * ResponderRule configurations
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<ResponderConfiguration> configurations;

        /**
         * ResponderRule configurations
         * @param configurations the value to set
         * @return this builder
         **/
        public Builder configurations(java.util.List<ResponderConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }
        /**
         * Identifies state for ResponderRule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Identifies state for ResponderRule
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Execution Mode for ResponderRule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private ResponderModeTypes mode;

        /**
         * Execution Mode for ResponderRule
         * @param mode the value to set
         * @return this builder
         **/
        public Builder mode(ResponderModeTypes mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponderRuleDetails build() {
            ResponderRuleDetails model =
                    new ResponderRuleDetails(
                            this.condition, this.configurations, this.isEnabled, this.mode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponderRuleDetails model) {
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
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

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final Condition condition;

    public Condition getCondition() {
        return condition;
    }

    /**
     * ResponderRule configurations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<ResponderConfiguration> configurations;

    /**
     * ResponderRule configurations
     * @return the value
     **/
    public java.util.List<ResponderConfiguration> getConfigurations() {
        return configurations;
    }

    /**
     * Identifies state for ResponderRule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Identifies state for ResponderRule
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Execution Mode for ResponderRule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final ResponderModeTypes mode;

    /**
     * Execution Mode for ResponderRule
     * @return the value
     **/
    public ResponderModeTypes getMode() {
        return mode;
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
        sb.append("ResponderRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("condition=").append(String.valueOf(this.condition));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponderRuleDetails)) {
            return false;
        }

        ResponderRuleDetails other = (ResponderRuleDetails) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.mode, other.mode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
