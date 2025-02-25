/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of a detector rule to be created in a detector recipe.
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
    builder = CreateDetectorRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDetectorRuleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceDetectorRuleId",
        "name",
        "description",
        "isEnabled",
        "riskLevel",
        "configurations",
        "condition",
        "labels",
        "recommendation",
        "dataSourceId",
        "entitiesMappings"
    })
    public CreateDetectorRuleDetails(
            String sourceDetectorRuleId,
            String name,
            String description,
            Boolean isEnabled,
            RiskLevel riskLevel,
            java.util.List<DetectorConfiguration> configurations,
            Condition condition,
            java.util.List<String> labels,
            String recommendation,
            String dataSourceId,
            java.util.List<EntitiesMapping> entitiesMappings) {
        super();
        this.sourceDetectorRuleId = sourceDetectorRuleId;
        this.name = name;
        this.description = description;
        this.isEnabled = isEnabled;
        this.riskLevel = riskLevel;
        this.configurations = configurations;
        this.condition = condition;
        this.labels = labels;
        this.recommendation = recommendation;
        this.dataSourceId = dataSourceId;
        this.entitiesMappings = entitiesMappings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ID of source detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetectorRuleId")
        private String sourceDetectorRuleId;

        /**
         * ID of source detector rule
         * @param sourceDetectorRuleId the value to set
         * @return this builder
         **/
        public Builder sourceDetectorRuleId(String sourceDetectorRuleId) {
            this.sourceDetectorRuleId = sourceDetectorRuleId;
            this.__explicitlySet__.add("sourceDetectorRuleId");
            return this;
        }
        /**
         * Name of the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the detector rule
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Description of the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the detector rule
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Enablement state of the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enablement state of the detector rule
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The risk level for the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * The risk level for the detector rule
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
         * User-defined labels for the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * User-defined labels for the detector rule
         * @param labels the value to set
         * @return this builder
         **/
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /**
         * Recommendations for the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        /**
         * Recommendations for the detector rule
         * @param recommendation the value to set
         * @return this builder
         **/
        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }
        /**
         * OCID of the data source which is attached
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
        private String dataSourceId;

        /**
         * OCID of the data source which is attached
         * @param dataSourceId the value to set
         * @return this builder
         **/
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            this.__explicitlySet__.add("dataSourceId");
            return this;
        }
        /**
         * Data source entities mapping for the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitiesMappings")
        private java.util.List<EntitiesMapping> entitiesMappings;

        /**
         * Data source entities mapping for the detector rule
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

        public CreateDetectorRuleDetails build() {
            CreateDetectorRuleDetails model =
                    new CreateDetectorRuleDetails(
                            this.sourceDetectorRuleId,
                            this.name,
                            this.description,
                            this.isEnabled,
                            this.riskLevel,
                            this.configurations,
                            this.condition,
                            this.labels,
                            this.recommendation,
                            this.dataSourceId,
                            this.entitiesMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDetectorRuleDetails model) {
            if (model.wasPropertyExplicitlySet("sourceDetectorRuleId")) {
                this.sourceDetectorRuleId(model.getSourceDetectorRuleId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
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
     * ID of source detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetectorRuleId")
    private final String sourceDetectorRuleId;

    /**
     * ID of source detector rule
     * @return the value
     **/
    public String getSourceDetectorRuleId() {
        return sourceDetectorRuleId;
    }

    /**
     * Name of the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the detector rule
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Description of the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the detector rule
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Enablement state of the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enablement state of the detector rule
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The risk level for the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * The risk level for the detector rule
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
     * User-defined labels for the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * User-defined labels for the detector rule
     * @return the value
     **/
    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * Recommendations for the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    /**
     * Recommendations for the detector rule
     * @return the value
     **/
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * OCID of the data source which is attached
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
    private final String dataSourceId;

    /**
     * OCID of the data source which is attached
     * @return the value
     **/
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * Data source entities mapping for the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesMappings")
    private final java.util.List<EntitiesMapping> entitiesMappings;

    /**
     * Data source entities mapping for the detector rule
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
        sb.append("CreateDetectorRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceDetectorRuleId=").append(String.valueOf(this.sourceDetectorRuleId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", labels=").append(String.valueOf(this.labels));
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
        if (!(o instanceof CreateDetectorRuleDetails)) {
            return false;
        }

        CreateDetectorRuleDetails other = (CreateDetectorRuleDetails) o;
        return java.util.Objects.equals(this.sourceDetectorRuleId, other.sourceDetectorRuleId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.recommendation, other.recommendation)
                && java.util.Objects.equals(this.dataSourceId, other.dataSourceId)
                && java.util.Objects.equals(this.entitiesMappings, other.entitiesMappings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceDetectorRuleId == null
                                ? 43
                                : this.sourceDetectorRuleId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
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
