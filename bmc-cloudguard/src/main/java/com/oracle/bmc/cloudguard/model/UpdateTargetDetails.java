/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information to be updated.
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
    builder = UpdateTargetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTargetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "lifecycleState",
        "targetDetectorRecipes",
        "targetResponderRecipes",
        "freeformTags",
        "definedTags"
    })
    public UpdateTargetDetails(
            String displayName,
            LifecycleState lifecycleState,
            java.util.List<UpdateTargetDetectorRecipe> targetDetectorRecipes,
            java.util.List<UpdateTargetResponderRecipe> targetResponderRecipes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.targetDetectorRecipes = targetDetectorRecipes;
        this.targetResponderRecipes = targetResponderRecipes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipes")
        private java.util.List<UpdateTargetDetectorRecipe> targetDetectorRecipes;

        public Builder targetDetectorRecipes(
                java.util.List<UpdateTargetDetectorRecipe> targetDetectorRecipes) {
            this.targetDetectorRecipes = targetDetectorRecipes;
            this.__explicitlySet__.add("targetDetectorRecipes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipes")
        private java.util.List<UpdateTargetResponderRecipe> targetResponderRecipes;

        public Builder targetResponderRecipes(
                java.util.List<UpdateTargetResponderRecipe> targetResponderRecipes) {
            this.targetResponderRecipes = targetResponderRecipes;
            this.__explicitlySet__.add("targetResponderRecipes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetDetails build() {
            UpdateTargetDetails __instance__ =
                    new UpdateTargetDetails(
                            displayName,
                            lifecycleState,
                            targetDetectorRecipes,
                            targetResponderRecipes,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .targetDetectorRecipes(o.getTargetDetectorRecipes())
                            .targetResponderRecipes(o.getTargetResponderRecipes())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * DetectorTemplate identifier.
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The current state of the Target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The details of target detector recipes to be updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipes")
    private final java.util.List<UpdateTargetDetectorRecipe> targetDetectorRecipes;

    public java.util.List<UpdateTargetDetectorRecipe> getTargetDetectorRecipes() {
        return targetDetectorRecipes;
    }

    /**
     * The details of target responder recipes to be updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipes")
    private final java.util.List<UpdateTargetResponderRecipe> targetResponderRecipes;

    public java.util.List<UpdateTargetResponderRecipe> getTargetResponderRecipes() {
        return targetResponderRecipes;
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

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateTargetDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", targetDetectorRecipes=").append(String.valueOf(this.targetDetectorRecipes));
        sb.append(", targetResponderRecipes=").append(String.valueOf(this.targetResponderRecipes));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetDetails)) {
            return false;
        }

        UpdateTargetDetails other = (UpdateTargetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.targetDetectorRecipes, other.targetDetectorRecipes)
                && java.util.Objects.equals(
                        this.targetResponderRecipes, other.targetResponderRecipes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
