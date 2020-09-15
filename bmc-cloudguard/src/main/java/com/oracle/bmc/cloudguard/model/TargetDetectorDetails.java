/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Overriden settings of a Detector Rule applied on target
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TargetDetectorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TargetDetectorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<DetectorConfiguration> configurations;

        public Builder configurations(java.util.List<DetectorConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionGroups")
        private java.util.List<ConditionGroup> conditionGroups;

        public Builder conditionGroups(java.util.List<ConditionGroup> conditionGroups) {
            this.conditionGroups = conditionGroups;
            this.__explicitlySet__.add("conditionGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
        private Boolean isConfigurationAllowed;

        public Builder isConfigurationAllowed(Boolean isConfigurationAllowed) {
            this.isConfigurationAllowed = isConfigurationAllowed;
            this.__explicitlySet__.add("isConfigurationAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetDetectorDetails build() {
            TargetDetectorDetails __instance__ =
                    new TargetDetectorDetails(
                            isEnabled,
                            riskLevel,
                            configurations,
                            conditionGroups,
                            labels,
                            isConfigurationAllowed);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetDetectorDetails o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .riskLevel(o.getRiskLevel())
                            .configurations(o.getConfigurations())
                            .conditionGroups(o.getConditionGroups())
                            .labels(o.getLabels())
                            .isConfigurationAllowed(o.getIsConfigurationAllowed());

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
     * Enables the control
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    RiskLevel riskLevel;

    /**
     * Configuration details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    java.util.List<DetectorConfiguration> configurations;

    /**
     * Condition group corresponding to each compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionGroups")
    java.util.List<ConditionGroup> conditionGroups;

    /**
     * user defined labels for a detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    java.util.List<String> labels;

    /**
     * configuration allowed or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
    Boolean isConfigurationAllowed;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
