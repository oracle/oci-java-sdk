/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Description of Target.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Target.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Target extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "description",
        "targetResourceType",
        "targetResourceId",
        "recipeCount",
        "targetDetectorRecipes",
        "targetResponderRecipes",
        "targetDetails",
        "inheritedByCompartments",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecyleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Target(
            String id,
            String displayName,
            String compartmentId,
            String description,
            TargetResourceType targetResourceType,
            String targetResourceId,
            Integer recipeCount,
            java.util.List<TargetDetectorRecipe> targetDetectorRecipes,
            java.util.List<TargetResponderRecipe> targetResponderRecipes,
            TargetDetails targetDetails,
            java.util.List<String> inheritedByCompartments,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecyleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.targetResourceType = targetResourceType;
        this.targetResourceId = targetResourceId;
        this.recipeCount = recipeCount;
        this.targetDetectorRecipes = targetDetectorRecipes;
        this.targetResponderRecipes = targetResponderRecipes;
        this.targetDetails = targetDetails;
        this.inheritedByCompartments = inheritedByCompartments;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecyleDetails = lifecyleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Target display name, can be renamed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Target display name, can be renamed.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier where the resource is created
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier where the resource is created
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The target description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The target description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * possible type of targets
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
        private TargetResourceType targetResourceType;

        /**
         * possible type of targets
         * @param targetResourceType the value to set
         * @return this builder
         **/
        public Builder targetResourceType(TargetResourceType targetResourceType) {
            this.targetResourceType = targetResourceType;
            this.__explicitlySet__.add("targetResourceType");
            return this;
        }
        /**
         * Resource ID which the target uses to monitor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        /**
         * Resource ID which the target uses to monitor
         * @param targetResourceId the value to set
         * @return this builder
         **/
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }
        /**
         * Total number of recipes attached to target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recipeCount")
        private Integer recipeCount;

        /**
         * Total number of recipes attached to target
         * @param recipeCount the value to set
         * @return this builder
         **/
        public Builder recipeCount(Integer recipeCount) {
            this.recipeCount = recipeCount;
            this.__explicitlySet__.add("recipeCount");
            return this;
        }
        /**
         * List of detector recipes associated with target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipes")
        private java.util.List<TargetDetectorRecipe> targetDetectorRecipes;

        /**
         * List of detector recipes associated with target
         * @param targetDetectorRecipes the value to set
         * @return this builder
         **/
        public Builder targetDetectorRecipes(
                java.util.List<TargetDetectorRecipe> targetDetectorRecipes) {
            this.targetDetectorRecipes = targetDetectorRecipes;
            this.__explicitlySet__.add("targetDetectorRecipes");
            return this;
        }
        /**
         * List of responder recipes associated with target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipes")
        private java.util.List<TargetResponderRecipe> targetResponderRecipes;

        /**
         * List of responder recipes associated with target
         * @param targetResponderRecipes the value to set
         * @return this builder
         **/
        public Builder targetResponderRecipes(
                java.util.List<TargetResponderRecipe> targetResponderRecipes) {
            this.targetResponderRecipes = targetResponderRecipes;
            this.__explicitlySet__.add("targetResponderRecipes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDetails")
        private TargetDetails targetDetails;

        public Builder targetDetails(TargetDetails targetDetails) {
            this.targetDetails = targetDetails;
            this.__explicitlySet__.add("targetDetails");
            return this;
        }
        /**
         * List of inherited compartments
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inheritedByCompartments")
        private java.util.List<String> inheritedByCompartments;

        /**
         * List of inherited compartments
         * @param inheritedByCompartments the value to set
         * @return this builder
         **/
        public Builder inheritedByCompartments(java.util.List<String> inheritedByCompartments) {
            this.inheritedByCompartments = inheritedByCompartments;
            this.__explicitlySet__.add("inheritedByCompartments");
            return this;
        }
        /**
         * The date and time the target was created. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the target was created. Format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the target was updated. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the target was updated. Format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the Target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Target.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
        private String lifecyleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecyleDetails the value to set
         * @return this builder
         **/
        public Builder lifecyleDetails(String lifecyleDetails) {
            this.lifecyleDetails = lifecyleDetails;
            this.__explicitlySet__.add("lifecyleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         * <p>
         * Avoid entering confidential information.
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Target build() {
            Target model =
                    new Target(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.targetResourceType,
                            this.targetResourceId,
                            this.recipeCount,
                            this.targetDetectorRecipes,
                            this.targetResponderRecipes,
                            this.targetDetails,
                            this.inheritedByCompartments,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecyleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Target model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("targetResourceType")) {
                this.targetResourceType(model.getTargetResourceType());
            }
            if (model.wasPropertyExplicitlySet("targetResourceId")) {
                this.targetResourceId(model.getTargetResourceId());
            }
            if (model.wasPropertyExplicitlySet("recipeCount")) {
                this.recipeCount(model.getRecipeCount());
            }
            if (model.wasPropertyExplicitlySet("targetDetectorRecipes")) {
                this.targetDetectorRecipes(model.getTargetDetectorRecipes());
            }
            if (model.wasPropertyExplicitlySet("targetResponderRecipes")) {
                this.targetResponderRecipes(model.getTargetResponderRecipes());
            }
            if (model.wasPropertyExplicitlySet("targetDetails")) {
                this.targetDetails(model.getTargetDetails());
            }
            if (model.wasPropertyExplicitlySet("inheritedByCompartments")) {
                this.inheritedByCompartments(model.getInheritedByCompartments());
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
            if (model.wasPropertyExplicitlySet("lifecyleDetails")) {
                this.lifecyleDetails(model.getLifecyleDetails());
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
     * Unique identifier that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Target display name, can be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Target display name, can be renamed.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier where the resource is created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier where the resource is created
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The target description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The target description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * possible type of targets
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
    private final TargetResourceType targetResourceType;

    /**
     * possible type of targets
     * @return the value
     **/
    public TargetResourceType getTargetResourceType() {
        return targetResourceType;
    }

    /**
     * Resource ID which the target uses to monitor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    private final String targetResourceId;

    /**
     * Resource ID which the target uses to monitor
     * @return the value
     **/
    public String getTargetResourceId() {
        return targetResourceId;
    }

    /**
     * Total number of recipes attached to target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recipeCount")
    private final Integer recipeCount;

    /**
     * Total number of recipes attached to target
     * @return the value
     **/
    public Integer getRecipeCount() {
        return recipeCount;
    }

    /**
     * List of detector recipes associated with target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipes")
    private final java.util.List<TargetDetectorRecipe> targetDetectorRecipes;

    /**
     * List of detector recipes associated with target
     * @return the value
     **/
    public java.util.List<TargetDetectorRecipe> getTargetDetectorRecipes() {
        return targetDetectorRecipes;
    }

    /**
     * List of responder recipes associated with target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipes")
    private final java.util.List<TargetResponderRecipe> targetResponderRecipes;

    /**
     * List of responder recipes associated with target
     * @return the value
     **/
    public java.util.List<TargetResponderRecipe> getTargetResponderRecipes() {
        return targetResponderRecipes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetDetails")
    private final TargetDetails targetDetails;

    public TargetDetails getTargetDetails() {
        return targetDetails;
    }

    /**
     * List of inherited compartments
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inheritedByCompartments")
    private final java.util.List<String> inheritedByCompartments;

    /**
     * List of inherited compartments
     * @return the value
     **/
    public java.util.List<String> getInheritedByCompartments() {
        return inheritedByCompartments;
    }

    /**
     * The date and time the target was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the target was created. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the target was updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the target was updated. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the Target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Target.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
    private final String lifecyleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecyleDetails() {
        return lifecyleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Target(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(", targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(", recipeCount=").append(String.valueOf(this.recipeCount));
        sb.append(", targetDetectorRecipes=").append(String.valueOf(this.targetDetectorRecipes));
        sb.append(", targetResponderRecipes=").append(String.valueOf(this.targetResponderRecipes));
        sb.append(", targetDetails=").append(String.valueOf(this.targetDetails));
        sb.append(", inheritedByCompartments=")
                .append(String.valueOf(this.inheritedByCompartments));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecyleDetails=").append(String.valueOf(this.lifecyleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Target)) {
            return false;
        }

        Target other = (Target) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(this.recipeCount, other.recipeCount)
                && java.util.Objects.equals(this.targetDetectorRecipes, other.targetDetectorRecipes)
                && java.util.Objects.equals(
                        this.targetResponderRecipes, other.targetResponderRecipes)
                && java.util.Objects.equals(this.targetDetails, other.targetDetails)
                && java.util.Objects.equals(
                        this.inheritedByCompartments, other.inheritedByCompartments)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecyleDetails, other.lifecyleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceType == null
                                ? 43
                                : this.targetResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result = (result * PRIME) + (this.recipeCount == null ? 43 : this.recipeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDetectorRecipes == null
                                ? 43
                                : this.targetDetectorRecipes.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResponderRecipes == null
                                ? 43
                                : this.targetResponderRecipes.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDetails == null ? 43 : this.targetDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.inheritedByCompartments == null
                                ? 43
                                : this.inheritedByCompartments.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecyleDetails == null ? 43 : this.lifecyleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
