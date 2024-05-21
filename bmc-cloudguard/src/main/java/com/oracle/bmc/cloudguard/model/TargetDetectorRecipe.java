/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * A TargetDetectorRecipe resource contains a specific instance of one of the
 * supported detector types (for example, activity, configuration, or threat)
 * in which some settings can be modified specifically for a single target.
 * <p>
 * A TargetDetectorRecipe resource:
 * * Is effectively a copy of a DetectorRecipe resource in which users can make
 * very limited changes if it\u2019s Oracle-managed, and more changes if it\u2019s user-managed.
 * * Is visible on the Cloud Guard Targets, Target Details page.
 * * Is located in a specific OCI compartment.
 * * Can be modified by users, programmatically or through the UI.
 * * Changes that can be made here override any settings in the corresponding
 * DetectorRecipe, of which the TargetDetectorRecipe resource is effectively a copy,
 * created when the detector recipe is attached to the target.
 *
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
public final class TargetDetectorRecipe extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        "locks",
        "detectorRecipeType",
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
            java.util.List<ResourceLock> locks,
            DetectorRecipeEnum detectorRecipeType,
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
        this.locks = locks;
        this.detectorRecipeType = detectorRecipeType;
        this.sourceDataRetention = sourceDataRetention;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID for the detector recipe
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for the detector recipe
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Display name of the detector recipe
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the detector recipe
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
         * Compartment OCID of the detector recipe
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID of the detector recipe
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Unique identifier for of original Oracle-managed detector recipe on which the TargetDetectorRecipe is based
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
        private String detectorRecipeId;

        /**
         * Unique identifier for of original Oracle-managed detector recipe on which the TargetDetectorRecipe is based
         * @param detectorRecipeId the value to set
         * @return this builder
         **/
        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = detectorRecipeId;
            this.__explicitlySet__.add("detectorRecipeId");
            return this;
        }
        /**
         * Owner of the detector recipe
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OwnerType owner;

        /**
         * Owner of the detector recipe
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
         * List of detector rules for the detector recipe - user input
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
        private java.util.List<TargetDetectorRecipeDetectorRule> detectorRules;

        /**
         * List of detector rules for the detector recipe - user input
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
         * List of currently enabled detector rules for the detector type for recipe after applying defaults
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("effectiveDetectorRules")
        private java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules;

        /**
         * List of currently enabled detector rules for the detector type for recipe after applying defaults
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
         * The date and time the target detector recipe was last updated. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the target detector recipe was last updated. Format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current lifecycle state of the resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the resource
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Locks associated with this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         * @param locks the value to set
         * @return this builder
         **/
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /**
         * Recipe type ( STANDARD, ENTERPRISE )
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeType")
        private DetectorRecipeEnum detectorRecipeType;

        /**
         * Recipe type ( STANDARD, ENTERPRISE )
         * @param detectorRecipeType the value to set
         * @return this builder
         **/
        public Builder detectorRecipeType(DetectorRecipeEnum detectorRecipeType) {
            this.detectorRecipeType = detectorRecipeType;
            this.__explicitlySet__.add("detectorRecipeType");
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
            TargetDetectorRecipe model =
                    new TargetDetectorRecipe(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.detectorRecipeId,
                            this.owner,
                            this.detector,
                            this.detectorRules,
                            this.effectiveDetectorRules,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.locks,
                            this.detectorRecipeType,
                            this.sourceDataRetention);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetDetectorRecipe model) {
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
            if (model.wasPropertyExplicitlySet("detectorRecipeId")) {
                this.detectorRecipeId(model.getDetectorRecipeId());
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("detectorRecipeType")) {
                this.detectorRecipeType(model.getDetectorRecipeType());
            }
            if (model.wasPropertyExplicitlySet("sourceDataRetention")) {
                this.sourceDataRetention(model.getSourceDataRetention());
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
     * OCID for the detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for the detector recipe
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Display name of the detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the detector recipe
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
     * Compartment OCID of the detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID of the detector recipe
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Unique identifier for of original Oracle-managed detector recipe on which the TargetDetectorRecipe is based
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
    private final String detectorRecipeId;

    /**
     * Unique identifier for of original Oracle-managed detector recipe on which the TargetDetectorRecipe is based
     * @return the value
     **/
    public String getDetectorRecipeId() {
        return detectorRecipeId;
    }

    /**
     * Owner of the detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final OwnerType owner;

    /**
     * Owner of the detector recipe
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
     * List of detector rules for the detector recipe - user input
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
    private final java.util.List<TargetDetectorRecipeDetectorRule> detectorRules;

    /**
     * List of detector rules for the detector recipe - user input
     * @return the value
     **/
    public java.util.List<TargetDetectorRecipeDetectorRule> getDetectorRules() {
        return detectorRules;
    }

    /**
     * List of currently enabled detector rules for the detector type for recipe after applying defaults
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDetectorRules")
    private final java.util.List<TargetDetectorRecipeDetectorRule> effectiveDetectorRules;

    /**
     * List of currently enabled detector rules for the detector type for recipe after applying defaults
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
     * The date and time the target detector recipe was last updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the target detector recipe was last updated. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current lifecycle state of the resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the resource
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Locks associated with this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     * @return the value
     **/
    public java.util.List<ResourceLock> getLocks() {
        return locks;
    }

    /**
     * Recipe type ( STANDARD, ENTERPRISE )
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeType")
    private final DetectorRecipeEnum detectorRecipeType;

    /**
     * Recipe type ( STANDARD, ENTERPRISE )
     * @return the value
     **/
    public DetectorRecipeEnum getDetectorRecipeType() {
        return detectorRecipeType;
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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TargetDetectorRecipe(");
        sb.append("super=").append(super.toString());
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
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(", detectorRecipeType=").append(String.valueOf(this.detectorRecipeType));
        sb.append(", sourceDataRetention=").append(String.valueOf(this.sourceDataRetention));
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
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.detectorRecipeType, other.detectorRecipeType)
                && java.util.Objects.equals(this.sourceDataRetention, other.sourceDataRetention)
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
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRecipeType == null
                                ? 43
                                : this.detectorRecipeType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDataRetention == null
                                ? 43
                                : this.sourceDataRetention.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
