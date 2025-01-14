/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Parameters to update details for a responder rule for a target responder recipe.
 * TargetResponderRuleDetails contains all configurations associated with the ResponderRule, whereas
 * UpdateTargetResponderRecipeResponderRuleDetails refers to the details that are to be updated for
 * ResponderRule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTargetResponderRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateTargetResponderRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"condition", "configurations", "mode"})
    public UpdateTargetResponderRuleDetails(
            Condition condition,
            java.util.List<ResponderConfiguration> configurations,
            ResponderModeTypes mode) {
        super();
        this.condition = condition;
        this.configurations = configurations;
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
        /** List of responder rule configurations */
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<ResponderConfiguration> configurations;

        /**
         * List of responder rule configurations
         *
         * @param configurations the value to set
         * @return this builder
         */
        public Builder configurations(java.util.List<ResponderConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }
        /** Execution mode for the responder rule */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private ResponderModeTypes mode;

        /**
         * Execution mode for the responder rule
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(ResponderModeTypes mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetResponderRuleDetails build() {
            UpdateTargetResponderRuleDetails model =
                    new UpdateTargetResponderRuleDetails(
                            this.condition, this.configurations, this.mode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetResponderRuleDetails model) {
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
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

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final Condition condition;

    public Condition getCondition() {
        return condition;
    }

    /** List of responder rule configurations */
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<ResponderConfiguration> configurations;

    /**
     * List of responder rule configurations
     *
     * @return the value
     */
    public java.util.List<ResponderConfiguration> getConfigurations() {
        return configurations;
    }

    /** Execution mode for the responder rule */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final ResponderModeTypes mode;

    /**
     * Execution mode for the responder rule
     *
     * @return the value
     */
    public ResponderModeTypes getMode() {
        return mode;
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
        sb.append("UpdateTargetResponderRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("condition=").append(String.valueOf(this.condition));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetResponderRuleDetails)) {
            return false;
        }

        UpdateTargetResponderRuleDetails other = (UpdateTargetResponderRuleDetails) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.configurations, other.configurations)
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
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
