/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Overriden settings of a Detector Rule applied on target <br>
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
        builder = TargetDetectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TargetDetectorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "riskLevel",
        "configurations",
        "conditionGroups",
        "labels",
        "isConfigurationAllowed",
        "problemThreshold",
        "targetTypes",
        "sightingTypes"
    })
    public TargetDetectorDetails(
            Boolean isEnabled,
            RiskLevel riskLevel,
            java.util.List<DetectorConfiguration> configurations,
            java.util.List<ConditionGroup> conditionGroups,
            java.util.List<String> labels,
            Boolean isConfigurationAllowed,
            Integer problemThreshold,
            java.util.List<String> targetTypes,
            java.util.List<SightingType> sightingTypes) {
        super();
        this.isEnabled = isEnabled;
        this.riskLevel = riskLevel;
        this.configurations = configurations;
        this.conditionGroups = conditionGroups;
        this.labels = labels;
        this.isConfigurationAllowed = isConfigurationAllowed;
        this.problemThreshold = problemThreshold;
        this.targetTypes = targetTypes;
        this.sightingTypes = sightingTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Enables the control */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables the control
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The Risk Level */
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * The Risk Level
         *
         * @param riskLevel the value to set
         * @return this builder
         */
        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }
        /** Configuration details */
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<DetectorConfiguration> configurations;

        /**
         * Configuration details
         *
         * @param configurations the value to set
         * @return this builder
         */
        public Builder configurations(java.util.List<DetectorConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }
        /** Condition group corresponding to each compartment */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionGroups")
        private java.util.List<ConditionGroup> conditionGroups;

        /**
         * Condition group corresponding to each compartment
         *
         * @param conditionGroups the value to set
         * @return this builder
         */
        public Builder conditionGroups(java.util.List<ConditionGroup> conditionGroups) {
            this.conditionGroups = conditionGroups;
            this.__explicitlySet__.add("conditionGroups");
            return this;
        }
        /** user defined labels for a detector rule */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * user defined labels for a detector rule
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /** configuration allowed or not */
        @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
        private Boolean isConfigurationAllowed;

        /**
         * configuration allowed or not
         *
         * @param isConfigurationAllowed the value to set
         * @return this builder
         */
        public Builder isConfigurationAllowed(Boolean isConfigurationAllowed) {
            this.isConfigurationAllowed = isConfigurationAllowed;
            this.__explicitlySet__.add("isConfigurationAllowed");
            return this;
        }
        /** Cutover point for an elevated resource Risk Score to create a Problem */
        @com.fasterxml.jackson.annotation.JsonProperty("problemThreshold")
        private Integer problemThreshold;

        /**
         * Cutover point for an elevated resource Risk Score to create a Problem
         *
         * @param problemThreshold the value to set
         * @return this builder
         */
        public Builder problemThreshold(Integer problemThreshold) {
            this.problemThreshold = problemThreshold;
            this.__explicitlySet__.add("problemThreshold");
            return this;
        }
        /** List of target types for which the detector rule is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("targetTypes")
        private java.util.List<String> targetTypes;

        /**
         * List of target types for which the detector rule is applicable
         *
         * @param targetTypes the value to set
         * @return this builder
         */
        public Builder targetTypes(java.util.List<String> targetTypes) {
            this.targetTypes = targetTypes;
            this.__explicitlySet__.add("targetTypes");
            return this;
        }
        /** List of sighting types */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypes")
        private java.util.List<SightingType> sightingTypes;

        /**
         * List of sighting types
         *
         * @param sightingTypes the value to set
         * @return this builder
         */
        public Builder sightingTypes(java.util.List<SightingType> sightingTypes) {
            this.sightingTypes = sightingTypes;
            this.__explicitlySet__.add("sightingTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetDetectorDetails build() {
            TargetDetectorDetails model =
                    new TargetDetectorDetails(
                            this.isEnabled,
                            this.riskLevel,
                            this.configurations,
                            this.conditionGroups,
                            this.labels,
                            this.isConfigurationAllowed,
                            this.problemThreshold,
                            this.targetTypes,
                            this.sightingTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetDetectorDetails model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
            }
            if (model.wasPropertyExplicitlySet("conditionGroups")) {
                this.conditionGroups(model.getConditionGroups());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("isConfigurationAllowed")) {
                this.isConfigurationAllowed(model.getIsConfigurationAllowed());
            }
            if (model.wasPropertyExplicitlySet("problemThreshold")) {
                this.problemThreshold(model.getProblemThreshold());
            }
            if (model.wasPropertyExplicitlySet("targetTypes")) {
                this.targetTypes(model.getTargetTypes());
            }
            if (model.wasPropertyExplicitlySet("sightingTypes")) {
                this.sightingTypes(model.getSightingTypes());
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

    /** Enables the control */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables the control
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The Risk Level */
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * The Risk Level
     *
     * @return the value
     */
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /** Configuration details */
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<DetectorConfiguration> configurations;

    /**
     * Configuration details
     *
     * @return the value
     */
    public java.util.List<DetectorConfiguration> getConfigurations() {
        return configurations;
    }

    /** Condition group corresponding to each compartment */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionGroups")
    private final java.util.List<ConditionGroup> conditionGroups;

    /**
     * Condition group corresponding to each compartment
     *
     * @return the value
     */
    public java.util.List<ConditionGroup> getConditionGroups() {
        return conditionGroups;
    }

    /** user defined labels for a detector rule */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * user defined labels for a detector rule
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
    }

    /** configuration allowed or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
    private final Boolean isConfigurationAllowed;

    /**
     * configuration allowed or not
     *
     * @return the value
     */
    public Boolean getIsConfigurationAllowed() {
        return isConfigurationAllowed;
    }

    /** Cutover point for an elevated resource Risk Score to create a Problem */
    @com.fasterxml.jackson.annotation.JsonProperty("problemThreshold")
    private final Integer problemThreshold;

    /**
     * Cutover point for an elevated resource Risk Score to create a Problem
     *
     * @return the value
     */
    public Integer getProblemThreshold() {
        return problemThreshold;
    }

    /** List of target types for which the detector rule is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("targetTypes")
    private final java.util.List<String> targetTypes;

    /**
     * List of target types for which the detector rule is applicable
     *
     * @return the value
     */
    public java.util.List<String> getTargetTypes() {
        return targetTypes;
    }

    /** List of sighting types */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypes")
    private final java.util.List<SightingType> sightingTypes;

    /**
     * List of sighting types
     *
     * @return the value
     */
    public java.util.List<SightingType> getSightingTypes() {
        return sightingTypes;
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
        sb.append("TargetDetectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", conditionGroups=").append(String.valueOf(this.conditionGroups));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", isConfigurationAllowed=").append(String.valueOf(this.isConfigurationAllowed));
        sb.append(", problemThreshold=").append(String.valueOf(this.problemThreshold));
        sb.append(", targetTypes=").append(String.valueOf(this.targetTypes));
        sb.append(", sightingTypes=").append(String.valueOf(this.sightingTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDetectorDetails)) {
            return false;
        }

        TargetDetectorDetails other = (TargetDetectorDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.conditionGroups, other.conditionGroups)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(
                        this.isConfigurationAllowed, other.isConfigurationAllowed)
                && java.util.Objects.equals(this.problemThreshold, other.problemThreshold)
                && java.util.Objects.equals(this.targetTypes, other.targetTypes)
                && java.util.Objects.equals(this.sightingTypes, other.sightingTypes)
                && super.equals(other);
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
        result =
                (result * PRIME)
                        + (this.conditionGroups == null ? 43 : this.conditionGroups.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.isConfigurationAllowed == null
                                ? 43
                                : this.isConfigurationAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.problemThreshold == null ? 43 : this.problemThreshold.hashCode());
        result = (result * PRIME) + (this.targetTypes == null ? 43 : this.targetTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.sightingTypes == null ? 43 : this.sightingTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
