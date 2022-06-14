/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Target Detector recipe
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
    builder = TargetDetectorRecipe.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TargetDetectorRecipe {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "detectorRecipeId",
        "owner",
        "detector",
        "detectorRules",
        "effectiveDetectorRules",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "sourceDataRetention"
    })
    public TargetDetectorRecipe(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String detectorRecipeId,
            OwnerType owner,
            DetectorEnum detector,
            java.util.List<TargetDetectorRecipeDetectorRule> detectorRules,
            java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            Integer sourceDataRetention) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.detectorRecipeId = detectorRecipeId;
        this.owner = owner;
        this.detector = detector;
        this.detectorRules = detectorRules;
        this.effectiveDetectorRules = effectiveDetectorRules;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.sourceDataRetention = sourceDataRetention;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Ocid for detector recipe
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Ocid for detector recipe
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Display name of detector recipe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of detector recipe.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Detector recipe description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detector recipe description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * compartmentId of detector recipe
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * compartmentId of detector recipe
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Unique identifier for Detector Recipe of which this is an extension
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
        private String detectorRecipeId;

        /**
         * Unique identifier for Detector Recipe of which this is an extension
         * @param detectorRecipeId the value to set
         * @return this builder
         **/
        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = detectorRecipeId;
            this.__explicitlySet__.add("detectorRecipeId");
            return this;
        }
        /**
         * Owner of detector recipe
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OwnerType owner;

        /**
         * Owner of detector recipe
         * @param owner the value to set
         * @return this builder
         **/
        public Builder owner(OwnerType owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * Type of detector
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detector")
        private DetectorEnum detector;

        /**
         * Type of detector
         * @param detector the value to set
         * @return this builder
         **/
        public Builder detector(DetectorEnum detector) {
            this.detector = detector;
            this.__explicitlySet__.add("detector");
            return this;
        }
        /**
         * List of detector rules for the detector type for recipe - user input
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
        private java.util.List<TargetDetectorRecipeDetectorRule> detectorRules;

        /**
         * List of detector rules for the detector type for recipe - user input
         * @param detectorRules the value to set
         * @return this builder
         **/
        public Builder detectorRules(
                java.util.List<TargetDetectorRecipeDetectorRule> detectorRules) {
            this.detectorRules = detectorRules;
            this.__explicitlySet__.add("detectorRules");
            return this;
        }
        /**
         * List of effective detector rules for the detector type for recipe after applying defaults
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("effectiveDetectorRules")
        private java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules;

        /**
         * List of effective detector rules for the detector type for recipe after applying defaults
         * @param effectiveDetectorRules the value to set
         * @return this builder
         **/
        public Builder effectiveDetectorRules(
                java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules) {
            this.effectiveDetectorRules = effectiveDetectorRules;
            this.__explicitlySet__.add("effectiveDetectorRules");
            return this;
        }
        /**
         * The date and time the target detector recipe was created. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the target detector recipe was created. Format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the target detector recipe was updated. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the target detector recipe was updated. Format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The number of days for which source data is retained
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDataRetention")
        private Integer sourceDataRetention;

        /**
         * The number of days for which source data is retained
         * @param sourceDataRetention the value to set
         * @return this builder
         **/
        public Builder sourceDataRetention(Integer sourceDataRetention) {
            this.sourceDataRetention = sourceDataRetention;
            this.__explicitlySet__.add("sourceDataRetention");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetDetectorRecipe build() {
            TargetDetectorRecipe __instance__ =
                    new TargetDetectorRecipe(
                            id,
                            displayName,
                            description,
                            compartmentId,
                            detectorRecipeId,
                            owner,
                            detector,
                            detectorRules,
                            effectiveDetectorRules,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            sourceDataRetention);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetDetectorRecipe o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .detectorRecipeId(o.getDetectorRecipeId())
                            .owner(o.getOwner())
                            .detector(o.getDetector())
                            .detectorRules(o.getDetectorRules())
                            .effectiveDetectorRules(o.getEffectiveDetectorRules())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .sourceDataRetention(o.getSourceDataRetention());

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
     * Ocid for detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Ocid for detector recipe
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Display name of detector recipe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of detector recipe.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detector recipe description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detector recipe description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * compartmentId of detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * compartmentId of detector recipe
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Unique identifier for Detector Recipe of which this is an extension
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
    private final String detectorRecipeId;

    /**
     * Unique identifier for Detector Recipe of which this is an extension
     * @return the value
     **/
    public String getDetectorRecipeId() {
        return detectorRecipeId;
    }

    /**
     * Owner of detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final OwnerType owner;

    /**
     * Owner of detector recipe
     * @return the value
     **/
    public OwnerType getOwner() {
        return owner;
    }

    /**
     * Type of detector
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detector")
    private final DetectorEnum detector;

    /**
     * Type of detector
     * @return the value
     **/
    public DetectorEnum getDetector() {
        return detector;
    }

    /**
     * List of detector rules for the detector type for recipe - user input
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
    private final java.util.List<TargetDetectorRecipeDetectorRule> detectorRules;

    /**
     * List of detector rules for the detector type for recipe - user input
     * @return the value
     **/
    public java.util.List<TargetDetectorRecipeDetectorRule> getDetectorRules() {
        return detectorRules;
    }

    /**
     * List of effective detector rules for the detector type for recipe after applying defaults
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDetectorRules")
    private final java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules;

    /**
     * List of effective detector rules for the detector type for recipe after applying defaults
     * @return the value
     **/
    public java.util.List<TargetDetectorRecipeDetectorRule> getEffectiveDetectorRules() {
        return effectiveDetectorRules;
    }

    /**
     * The date and time the target detector recipe was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the target detector recipe was created. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the target detector recipe was updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the target detector recipe was updated. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the resource.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The number of days for which source data is retained
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDataRetention")
    private final Integer sourceDataRetention;

    /**
     * The number of days for which source data is retained
     * @return the value
     **/
    public Integer getSourceDataRetention() {
        return sourceDataRetention;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TargetDetectorRecipe(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", detectorRecipeId=").append(String.valueOf(this.detectorRecipeId));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", detector=").append(String.valueOf(this.detector));
        sb.append(", detectorRules=").append(String.valueOf(this.detectorRules));
        sb.append(", effectiveDetectorRules=").append(String.valueOf(this.effectiveDetectorRules));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sourceDataRetention=").append(String.valueOf(this.sourceDataRetention));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDetectorRecipe)) {
            return false;
        }

        TargetDetectorRecipe other = (TargetDetectorRecipe) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.detectorRecipeId, other.detectorRecipeId)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.detector, other.detector)
                && java.util.Objects.equals(this.detectorRules, other.detectorRules)
                && java.util.Objects.equals(
                        this.effectiveDetectorRules, other.effectiveDetectorRules)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sourceDataRetention, other.sourceDataRetention)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRecipeId == null ? 43 : this.detectorRecipeId.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.detector == null ? 43 : this.detector.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRules == null ? 43 : this.detectorRules.hashCode());
        result =
                (result * PRIME)
                        + (this.effectiveDetectorRules == null
                                ? 43
                                : this.effectiveDetectorRules.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDataRetention == null
                                ? 43
                                : this.sourceDataRetention.hashCode());
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
