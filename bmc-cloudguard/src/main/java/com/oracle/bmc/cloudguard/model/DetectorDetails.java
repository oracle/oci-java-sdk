/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Detailed information for a detector.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DetectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectorDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "riskLevel",
        "configurations",
        "condition",
        "labels",
        "isConfigurationAllowed",
        "problemThreshold",
        "targetTypes",
        "sightingTypes",
        "description",
        "recommendation",
        "dataSourceId",
        "entitiesMappings"
    })
    public DetectorDetails(
            Boolean isEnabled,
            RiskLevel riskLevel,
            java.util.List<DetectorConfiguration> configurations,
            Condition condition,
            java.util.List<String> labels,
            Boolean isConfigurationAllowed,
            Integer problemThreshold,
            java.util.List<String> targetTypes,
            java.util.List<SightingType> sightingTypes,
            String description,
            String recommendation,
            String dataSourceId,
            java.util.List<EntitiesMapping> entitiesMappings) {
        super();
        this.isEnabled = isEnabled;
        this.riskLevel = riskLevel;
        this.configurations = configurations;
        this.condition = condition;
        this.labels = labels;
        this.isConfigurationAllowed = isConfigurationAllowed;
        this.problemThreshold = problemThreshold;
        this.targetTypes = targetTypes;
        this.sightingTypes = sightingTypes;
        this.description = description;
        this.recommendation = recommendation;
        this.dataSourceId = dataSourceId;
        this.entitiesMappings = entitiesMappings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enablement status for the rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enablement status for the rule
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The risk level for the rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * The risk level for the rule
         * @param riskLevel the value to set
         * @return this builder
         **/
        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }
        /**
         * List of detector rule configurations
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<DetectorConfiguration> configurations;

        /**
         * List of detector rule configurations
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
         * User-defined labels for a detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * User-defined labels for a detector rule
         * @param labels the value to set
         * @return this builder
         **/
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /**
         * Can the rule be configured?
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
        private Boolean isConfigurationAllowed;

        /**
         * Can the rule be configured?
         * @param isConfigurationAllowed the value to set
         * @return this builder
         **/
        public Builder isConfigurationAllowed(Boolean isConfigurationAllowed) {
            this.isConfigurationAllowed = isConfigurationAllowed;
            this.__explicitlySet__.add("isConfigurationAllowed");
            return this;
        }
        /**
         * The point at which an elevated resource risk score creates a problem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemThreshold")
        private Integer problemThreshold;

        /**
         * The point at which an elevated resource risk score creates a problem
         * @param problemThreshold the value to set
         * @return this builder
         **/
        public Builder problemThreshold(Integer problemThreshold) {
            this.problemThreshold = problemThreshold;
            this.__explicitlySet__.add("problemThreshold");
            return this;
        }
        /**
         * List of target types for which the detector rule is applicable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetTypes")
        private java.util.List<String> targetTypes;

        /**
         * List of target types for which the detector rule is applicable
         * @param targetTypes the value to set
         * @return this builder
         **/
        public Builder targetTypes(java.util.List<String> targetTypes) {
            this.targetTypes = targetTypes;
            this.__explicitlySet__.add("targetTypes");
            return this;
        }
        /**
         * List of sighting types
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypes")
        private java.util.List<SightingType> sightingTypes;

        /**
         * List of sighting types
         * @param sightingTypes the value to set
         * @return this builder
         **/
        public Builder sightingTypes(java.util.List<SightingType> sightingTypes) {
            this.sightingTypes = sightingTypes;
            this.__explicitlySet__.add("sightingTypes");
            return this;
        }
        /**
         * Description for detector recipe detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for detector recipe detector rule
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Recommendation for detector recipe detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        /**
         * Recommendation for detector recipe detector rule
         * @param recommendation the value to set
         * @return this builder
         **/
        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }
        /**
         * The ID of the attached data source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
        private String dataSourceId;

        /**
         * The ID of the attached data source
         * @param dataSourceId the value to set
         * @return this builder
         **/
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            this.__explicitlySet__.add("dataSourceId");
            return this;
        }
        /**
         * Data source entities mapping for a detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitiesMappings")
        private java.util.List<EntitiesMapping> entitiesMappings;

        /**
         * Data source entities mapping for a detector rule
         * @param entitiesMappings the value to set
         * @return this builder
         **/
        public Builder entitiesMappings(java.util.List<EntitiesMapping> entitiesMappings) {
            this.entitiesMappings = entitiesMappings;
            this.__explicitlySet__.add("entitiesMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectorDetails build() {
            DetectorDetails model =
                    new DetectorDetails(
                            this.isEnabled,
                            this.riskLevel,
                            this.configurations,
                            this.condition,
                            this.labels,
                            this.isConfigurationAllowed,
                            this.problemThreshold,
                            this.targetTypes,
                            this.sightingTypes,
                            this.description,
                            this.recommendation,
                            this.dataSourceId,
                            this.entitiesMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectorDetails model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
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
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("recommendation")) {
                this.recommendation(model.getRecommendation());
            }
            if (model.wasPropertyExplicitlySet("dataSourceId")) {
                this.dataSourceId(model.getDataSourceId());
            }
            if (model.wasPropertyExplicitlySet("entitiesMappings")) {
                this.entitiesMappings(model.getEntitiesMappings());
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
     * Enablement status for the rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enablement status for the rule
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The risk level for the rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * The risk level for the rule
     * @return the value
     **/
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * List of detector rule configurations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<DetectorConfiguration> configurations;

    /**
     * List of detector rule configurations
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
     * User-defined labels for a detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * User-defined labels for a detector rule
     * @return the value
     **/
    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * Can the rule be configured?
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
    private final Boolean isConfigurationAllowed;

    /**
     * Can the rule be configured?
     * @return the value
     **/
    public Boolean getIsConfigurationAllowed() {
        return isConfigurationAllowed;
    }

    /**
     * The point at which an elevated resource risk score creates a problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemThreshold")
    private final Integer problemThreshold;

    /**
     * The point at which an elevated resource risk score creates a problem
     * @return the value
     **/
    public Integer getProblemThreshold() {
        return problemThreshold;
    }

    /**
     * List of target types for which the detector rule is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetTypes")
    private final java.util.List<String> targetTypes;

    /**
     * List of target types for which the detector rule is applicable
     * @return the value
     **/
    public java.util.List<String> getTargetTypes() {
        return targetTypes;
    }

    /**
     * List of sighting types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypes")
    private final java.util.List<SightingType> sightingTypes;

    /**
     * List of sighting types
     * @return the value
     **/
    public java.util.List<SightingType> getSightingTypes() {
        return sightingTypes;
    }

    /**
     * Description for detector recipe detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for detector recipe detector rule
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Recommendation for detector recipe detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    /**
     * Recommendation for detector recipe detector rule
     * @return the value
     **/
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * The ID of the attached data source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
    private final String dataSourceId;

    /**
     * The ID of the attached data source
     * @return the value
     **/
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * Data source entities mapping for a detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesMappings")
    private final java.util.List<EntitiesMapping> entitiesMappings;

    /**
     * Data source entities mapping for a detector rule
     * @return the value
     **/
    public java.util.List<EntitiesMapping> getEntitiesMappings() {
        return entitiesMappings;
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
        sb.append("DetectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", isConfigurationAllowed=").append(String.valueOf(this.isConfigurationAllowed));
        sb.append(", problemThreshold=").append(String.valueOf(this.problemThreshold));
        sb.append(", targetTypes=").append(String.valueOf(this.targetTypes));
        sb.append(", sightingTypes=").append(String.valueOf(this.sightingTypes));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", recommendation=").append(String.valueOf(this.recommendation));
        sb.append(", dataSourceId=").append(String.valueOf(this.dataSourceId));
        sb.append(", entitiesMappings=").append(String.valueOf(this.entitiesMappings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectorDetails)) {
            return false;
        }

        DetectorDetails other = (DetectorDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(
                        this.isConfigurationAllowed, other.isConfigurationAllowed)
                && java.util.Objects.equals(this.problemThreshold, other.problemThreshold)
                && java.util.Objects.equals(this.targetTypes, other.targetTypes)
                && java.util.Objects.equals(this.sightingTypes, other.sightingTypes)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.recommendation, other.recommendation)
                && java.util.Objects.equals(this.dataSourceId, other.dataSourceId)
                && java.util.Objects.equals(this.entitiesMappings, other.entitiesMappings)
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
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendation == null ? 43 : this.recommendation.hashCode());
        result = (result * PRIME) + (this.dataSourceId == null ? 43 : this.dataSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.entitiesMappings == null ? 43 : this.entitiesMappings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
