/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Parameters used to create a new target.
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
    builder = CreateTargetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTargetDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "description",
        "targetResourceType",
        "targetResourceId",
        "targetDetectorRecipes",
        "targetResponderRecipes",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    public CreateTargetDetails(
            String displayName,
            String compartmentId,
            String description,
            TargetResourceType targetResourceType,
            String targetResourceId,
            java.util.List<CreateTargetDetectorRecipeDetails> targetDetectorRecipes,
            java.util.List<CreateTargetResponderRecipeDetails> targetResponderRecipes,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.targetResourceType = targetResourceType;
        this.targetResourceId = targetResourceId;
        this.targetDetectorRecipes = targetDetectorRecipes;
        this.targetResponderRecipes = targetResponderRecipes;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Display name for the target.
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the target.
         * <p>
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment OCID where the resource is created
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID where the resource is created
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
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The target description.
         * <p>
         * Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Type of resource that target support (COMPARTMENT/FACLOUD)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
        private TargetResourceType targetResourceType;

        /**
         * Type of resource that target support (COMPARTMENT/FACLOUD)
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
         * List of detector recipes to attach to target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipes")
        private java.util.List<CreateTargetDetectorRecipeDetails> targetDetectorRecipes;

        /**
         * List of detector recipes to attach to target
         * @param targetDetectorRecipes the value to set
         * @return this builder
         **/
        public Builder targetDetectorRecipes(
                java.util.List<CreateTargetDetectorRecipeDetails> targetDetectorRecipes) {
            this.targetDetectorRecipes = targetDetectorRecipes;
            this.__explicitlySet__.add("targetDetectorRecipes");
            return this;
        }
        /**
         * List of responder recipes to attach to target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipes")
        private java.util.List<CreateTargetResponderRecipeDetails> targetResponderRecipes;

        /**
         * List of responder recipes to attach to target
         * @param targetResponderRecipes the value to set
         * @return this builder
         **/
        public Builder targetResponderRecipes(
                java.util.List<CreateTargetResponderRecipeDetails> targetResponderRecipes) {
            this.targetResponderRecipes = targetResponderRecipes;
            this.__explicitlySet__.add("targetResponderRecipes");
            return this;
        }
        /**
         * The enablement state of the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The enablement state of the detector rule
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTargetDetails build() {
            CreateTargetDetails model =
                    new CreateTargetDetails(
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.targetResourceType,
                            this.targetResourceId,
                            this.targetDetectorRecipes,
                            this.targetResponderRecipes,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTargetDetails model) {
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
            if (model.wasPropertyExplicitlySet("targetDetectorRecipes")) {
                this.targetDetectorRecipes(model.getTargetDetectorRecipes());
            }
            if (model.wasPropertyExplicitlySet("targetResponderRecipes")) {
                this.targetResponderRecipes(model.getTargetResponderRecipes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * Display name for the target.
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the target.
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment OCID where the resource is created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID where the resource is created
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The target description.
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The target description.
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Type of resource that target support (COMPARTMENT/FACLOUD)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
    private final TargetResourceType targetResourceType;

    /**
     * Type of resource that target support (COMPARTMENT/FACLOUD)
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
     * List of detector recipes to attach to target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipes")
    private final java.util.List<CreateTargetDetectorRecipeDetails> targetDetectorRecipes;

    /**
     * List of detector recipes to attach to target
     * @return the value
     **/
    public java.util.List<CreateTargetDetectorRecipeDetails> getTargetDetectorRecipes() {
        return targetDetectorRecipes;
    }

    /**
     * List of responder recipes to attach to target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipes")
    private final java.util.List<CreateTargetResponderRecipeDetails> targetResponderRecipes;

    /**
     * List of responder recipes to attach to target
     * @return the value
     **/
    public java.util.List<CreateTargetResponderRecipeDetails> getTargetResponderRecipes() {
        return targetResponderRecipes;
    }

    /**
     * The enablement state of the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The enablement state of the detector rule
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("CreateTargetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(", targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(", targetDetectorRecipes=").append(String.valueOf(this.targetDetectorRecipes));
        sb.append(", targetResponderRecipes=").append(String.valueOf(this.targetResponderRecipes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTargetDetails)) {
            return false;
        }

        CreateTargetDetails other = (CreateTargetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(this.targetDetectorRecipes, other.targetDetectorRecipes)
                && java.util.Objects.equals(
                        this.targetResponderRecipes, other.targetResponderRecipes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
