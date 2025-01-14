/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * A detector recipe is a collection of rules that can be configured to trigger problems that appear
 * on the Cloud Guard Problems page. A DetectorRecipe resource contains settings for a specific
 * detector recipe, plus a list of the detector rules (DetectorRecipeDetectorRule resources)
 * belonging to the DetectorRecipe resource. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DetectorRecipe.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetectorRecipe
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "sourceDetectorRecipeId",
        "detectorRecipeType",
        "owner",
        "detector",
        "detectorRules",
        "effectiveDetectorRules",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "sourceDataRetention",
        "freeformTags",
        "definedTags",
        "systemTags",
        "targetIds"
    })
    public DetectorRecipe(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String sourceDetectorRecipeId,
            DetectorRecipeEnum detectorRecipeType,
            OwnerType owner,
            DetectorEnum detector,
            java.util.List<DetectorRecipeDetectorRule> detectorRules,
            java.util.List<DetectorRecipeDetectorRule> effectiveDetectorRules,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            Integer sourceDataRetention,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<String> targetIds) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.sourceDetectorRecipeId = sourceDetectorRecipeId;
        this.detectorRecipeType = detectorRecipeType;
        this.owner = owner;
        this.detector = detector;
        this.detectorRules = detectorRules;
        this.effectiveDetectorRules = effectiveDetectorRules;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.sourceDataRetention = sourceDataRetention;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.targetIds = targetIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID for detector recipe */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for detector recipe
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name of detector recipe */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of detector recipe
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Detector recipe description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detector recipe description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Compartment OCID of detector recipe */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID of detector recipe
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Recipe OCID of the source recipe to be cloned */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetectorRecipeId")
        private String sourceDetectorRecipeId;

        /**
         * Recipe OCID of the source recipe to be cloned
         *
         * @param sourceDetectorRecipeId the value to set
         * @return this builder
         */
        public Builder sourceDetectorRecipeId(String sourceDetectorRecipeId) {
            this.sourceDetectorRecipeId = sourceDetectorRecipeId;
            this.__explicitlySet__.add("sourceDetectorRecipeId");
            return this;
        }
        /** Recipe type ( STANDARD, ENTERPRISE ) */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeType")
        private DetectorRecipeEnum detectorRecipeType;

        /**
         * Recipe type ( STANDARD, ENTERPRISE )
         *
         * @param detectorRecipeType the value to set
         * @return this builder
         */
        public Builder detectorRecipeType(DetectorRecipeEnum detectorRecipeType) {
            this.detectorRecipeType = detectorRecipeType;
            this.__explicitlySet__.add("detectorRecipeType");
            return this;
        }
        /** Owner of detector recipe */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OwnerType owner;

        /**
         * Owner of detector recipe
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(OwnerType owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** Type of detector */
        @com.fasterxml.jackson.annotation.JsonProperty("detector")
        private DetectorEnum detector;

        /**
         * Type of detector
         *
         * @param detector the value to set
         * @return this builder
         */
        public Builder detector(DetectorEnum detector) {
            this.detector = detector;
            this.__explicitlySet__.add("detector");
            return this;
        }
        /** List of detector rules for the detector type for recipe - user input */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
        private java.util.List<DetectorRecipeDetectorRule> detectorRules;

        /**
         * List of detector rules for the detector type for recipe - user input
         *
         * @param detectorRules the value to set
         * @return this builder
         */
        public Builder detectorRules(java.util.List<DetectorRecipeDetectorRule> detectorRules) {
            this.detectorRules = detectorRules;
            this.__explicitlySet__.add("detectorRules");
            return this;
        }
        /**
         * List of effective detector rules for the detector type for recipe after applying defaults
         */
        @com.fasterxml.jackson.annotation.JsonProperty("effectiveDetectorRules")
        private java.util.List<DetectorRecipeDetectorRule> effectiveDetectorRules;

        /**
         * List of effective detector rules for the detector type for recipe after applying defaults
         *
         * @param effectiveDetectorRules the value to set
         * @return this builder
         */
        public Builder effectiveDetectorRules(
                java.util.List<DetectorRecipeDetectorRule> effectiveDetectorRules) {
            this.effectiveDetectorRules = effectiveDetectorRules;
            this.__explicitlySet__.add("effectiveDetectorRules");
            return this;
        }
        /** The date and time the detector recipe was created Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the detector recipe was created Format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the detector recipe was last updated Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the detector recipe was last updated Format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current lifecycle state of the resource */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the resource
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The number of days for which source data is retained */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDataRetention")
        private Integer sourceDataRetention;

        /**
         * The number of days for which source data is retained
         *
         * @param sourceDataRetention the value to set
         * @return this builder
         */
        public Builder sourceDataRetention(Integer sourceDataRetention) {
            this.sourceDataRetention = sourceDataRetention;
            this.__explicitlySet__.add("sourceDataRetention");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** List of target IDs to which the recipe is attached */
        @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
        private java.util.List<String> targetIds;

        /**
         * List of target IDs to which the recipe is attached
         *
         * @param targetIds the value to set
         * @return this builder
         */
        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            this.__explicitlySet__.add("targetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectorRecipe build() {
            DetectorRecipe model =
                    new DetectorRecipe(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.sourceDetectorRecipeId,
                            this.detectorRecipeType,
                            this.owner,
                            this.detector,
                            this.detectorRules,
                            this.effectiveDetectorRules,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.sourceDataRetention,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.targetIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectorRecipe model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceDetectorRecipeId")) {
                this.sourceDetectorRecipeId(model.getSourceDetectorRecipeId());
            }
            if (model.wasPropertyExplicitlySet("detectorRecipeType")) {
                this.detectorRecipeType(model.getDetectorRecipeType());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("detector")) {
                this.detector(model.getDetector());
            }
            if (model.wasPropertyExplicitlySet("detectorRules")) {
                this.detectorRules(model.getDetectorRules());
            }
            if (model.wasPropertyExplicitlySet("effectiveDetectorRules")) {
                this.effectiveDetectorRules(model.getEffectiveDetectorRules());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("sourceDataRetention")) {
                this.sourceDataRetention(model.getSourceDataRetention());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("targetIds")) {
                this.targetIds(model.getTargetIds());
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

    /** OCID for detector recipe */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for detector recipe
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name of detector recipe */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of detector recipe
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Detector recipe description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detector recipe description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Compartment OCID of detector recipe */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID of detector recipe
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Recipe OCID of the source recipe to be cloned */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetectorRecipeId")
    private final String sourceDetectorRecipeId;

    /**
     * Recipe OCID of the source recipe to be cloned
     *
     * @return the value
     */
    public String getSourceDetectorRecipeId() {
        return sourceDetectorRecipeId;
    }

    /** Recipe type ( STANDARD, ENTERPRISE ) */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeType")
    private final DetectorRecipeEnum detectorRecipeType;

    /**
     * Recipe type ( STANDARD, ENTERPRISE )
     *
     * @return the value
     */
    public DetectorRecipeEnum getDetectorRecipeType() {
        return detectorRecipeType;
    }

    /** Owner of detector recipe */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final OwnerType owner;

    /**
     * Owner of detector recipe
     *
     * @return the value
     */
    public OwnerType getOwner() {
        return owner;
    }

    /** Type of detector */
    @com.fasterxml.jackson.annotation.JsonProperty("detector")
    private final DetectorEnum detector;

    /**
     * Type of detector
     *
     * @return the value
     */
    public DetectorEnum getDetector() {
        return detector;
    }

    /** List of detector rules for the detector type for recipe - user input */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
    private final java.util.List<DetectorRecipeDetectorRule> detectorRules;

    /**
     * List of detector rules for the detector type for recipe - user input
     *
     * @return the value
     */
    public java.util.List<DetectorRecipeDetectorRule> getDetectorRules() {
        return detectorRules;
    }

    /** List of effective detector rules for the detector type for recipe after applying defaults */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDetectorRules")
    private final java.util.List<DetectorRecipeDetectorRule> effectiveDetectorRules;

    /**
     * List of effective detector rules for the detector type for recipe after applying defaults
     *
     * @return the value
     */
    public java.util.List<DetectorRecipeDetectorRule> getEffectiveDetectorRules() {
        return effectiveDetectorRules;
    }

    /** The date and time the detector recipe was created Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the detector recipe was created Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the detector recipe was last updated Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the detector recipe was last updated Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current lifecycle state of the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the resource
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The number of days for which source data is retained */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDataRetention")
    private final Integer sourceDataRetention;

    /**
     * The number of days for which source data is retained
     *
     * @return the value
     */
    public Integer getSourceDataRetention() {
        return sourceDataRetention;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** List of target IDs to which the recipe is attached */
    @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
    private final java.util.List<String> targetIds;

    /**
     * List of target IDs to which the recipe is attached
     *
     * @return the value
     */
    public java.util.List<String> getTargetIds() {
        return targetIds;
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
        sb.append("DetectorRecipe(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceDetectorRecipeId=").append(String.valueOf(this.sourceDetectorRecipeId));
        sb.append(", detectorRecipeType=").append(String.valueOf(this.detectorRecipeType));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", detector=").append(String.valueOf(this.detector));
        sb.append(", detectorRules=").append(String.valueOf(this.detectorRules));
        sb.append(", effectiveDetectorRules=").append(String.valueOf(this.effectiveDetectorRules));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sourceDataRetention=").append(String.valueOf(this.sourceDataRetention));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", targetIds=").append(String.valueOf(this.targetIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectorRecipe)) {
            return false;
        }

        DetectorRecipe other = (DetectorRecipe) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.sourceDetectorRecipeId, other.sourceDetectorRecipeId)
                && java.util.Objects.equals(this.detectorRecipeType, other.detectorRecipeType)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.detector, other.detector)
                && java.util.Objects.equals(this.detectorRules, other.detectorRules)
                && java.util.Objects.equals(
                        this.effectiveDetectorRules, other.effectiveDetectorRules)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sourceDataRetention, other.sourceDataRetention)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && super.equals(other);
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
                        + (this.sourceDetectorRecipeId == null
                                ? 43
                                : this.sourceDetectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRecipeType == null
                                ? 43
                                : this.detectorRecipeType.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
