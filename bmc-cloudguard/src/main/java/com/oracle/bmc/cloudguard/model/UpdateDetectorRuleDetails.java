/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of a Detector Rule to be overriden in Detector Recipe
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
    builder = UpdateDetectorRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDetectorRuleDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "riskLevel",
        "configurations",
        "condition",
        "labels"
    })
    public UpdateDetectorRuleDetails(
            Boolean isEnabled,
            RiskLevel riskLevel,
            java.util.List<DetectorConfiguration> configurations,
            Condition condition,
            java.util.List<String> labels) {
        super();
        this.isEnabled = isEnabled;
        this.riskLevel = riskLevel;
        this.configurations = configurations;
        this.condition = condition;
        this.labels = labels;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enables the control
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables the control
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The Risk Level
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * The Risk Level
         * @param riskLevel the value to set
         * @return this builder
         **/
        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }
        /**
         * Configuration details
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<DetectorConfiguration> configurations;

        /**
         * Configuration details
         * @param configurations the value to set
         * @return this builder
         **/
        public Builder configurations(java.util.List<DetectorConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Condition condition;

        public Builder condition(Condition condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * user defined labels for a detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * user defined labels for a detector rule
         * @param labels the value to set
         * @return this builder
         **/
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDetectorRuleDetails build() {
            UpdateDetectorRuleDetails __instance__ =
                    new UpdateDetectorRuleDetails(
                            isEnabled, riskLevel, configurations, condition, labels);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDetectorRuleDetails o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .riskLevel(o.getRiskLevel())
                            .configurations(o.getConfigurations())
                            .condition(o.getCondition())
                            .labels(o.getLabels());

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

    /**
     * Enables the control
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables the control
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * The Risk Level
     * @return the value
     **/
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * Configuration details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<DetectorConfiguration> configurations;

    /**
     * Configuration details
     * @return the value
     **/
    public java.util.List<DetectorConfiguration> getConfigurations() {
        return configurations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final Condition condition;

    public Condition getCondition() {
        return condition;
    }

    /**
     * user defined labels for a detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * user defined labels for a detector rule
     * @return the value
     **/
    public java.util.List<String> getLabels() {
        return labels;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDetectorRuleDetails(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDetectorRuleDetails)) {
            return false;
        }

        UpdateDetectorRuleDetails other = (UpdateDetectorRuleDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
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
