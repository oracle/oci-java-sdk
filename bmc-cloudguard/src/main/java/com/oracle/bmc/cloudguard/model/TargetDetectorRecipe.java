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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TargetDetectorRecipe.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TargetDetectorRecipe {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
        private String detectorRecipeId;

        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = detectorRecipeId;
            this.__explicitlySet__.add("detectorRecipeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OwnerType owner;

        public Builder owner(OwnerType owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detector")
        private DetectorEnum detector;

        public Builder detector(DetectorEnum detector) {
            this.detector = detector;
            this.__explicitlySet__.add("detector");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
        private java.util.List<TargetDetectorRecipeDetectorRule> detectorRules;

        public Builder detectorRules(
                java.util.List<TargetDetectorRecipeDetectorRule> detectorRules) {
            this.detectorRules = detectorRules;
            this.__explicitlySet__.add("detectorRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("effectiveDetectorRules")
        private java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules;

        public Builder effectiveDetectorRules(
                java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules) {
            this.effectiveDetectorRules = effectiveDetectorRules;
            this.__explicitlySet__.add("effectiveDetectorRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDataRetention")
        private Integer sourceDataRetention;

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

    /**
     * Ocid for detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Display name of detector recipe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detector recipe description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * compartmentId of detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Unique identifier for Detector Recipe of which this is an extension
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
    String detectorRecipeId;

    /**
     * Owner of detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    OwnerType owner;

    /**
     * Type of detector
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detector")
    DetectorEnum detector;

    /**
     * List of detector rules for the detector type for recipe - user input
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
    java.util.List<TargetDetectorRecipeDetectorRule> detectorRules;

    /**
     * List of effective detector rules for the detector type for recipe after applying defaults
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDetectorRules")
    java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules;

    /**
     * The date and time the target detector recipe was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the target detector recipe was updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The number of days for which source data is retained
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDataRetention")
    Integer sourceDataRetention;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
