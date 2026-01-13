/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Parameters to update a detector recipe attached to a target. <br>
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
        builder = UpdateTargetDetectorRecipe.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateTargetDetectorRecipe
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetDetectorRecipeId", "detectorRules"})
    public UpdateTargetDetectorRecipe(
            String targetDetectorRecipeId,
            java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules) {
        super();
        this.targetDetectorRecipeId = targetDetectorRecipeId;
        this.detectorRules = detectorRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for target detector recipe */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipeId")
        private String targetDetectorRecipeId;

        /**
         * Unique identifier for target detector recipe
         *
         * @param targetDetectorRecipeId the value to set
         * @return this builder
         */
        public Builder targetDetectorRecipeId(String targetDetectorRecipeId) {
            this.targetDetectorRecipeId = targetDetectorRecipeId;
            this.__explicitlySet__.add("targetDetectorRecipeId");
            return this;
        }
        /** Updates to be applied to detector rules in target detector recipe */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
        private java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules;

        /**
         * Updates to be applied to detector rules in target detector recipe
         *
         * @param detectorRules the value to set
         * @return this builder
         */
        public Builder detectorRules(
                java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules) {
            this.detectorRules = detectorRules;
            this.__explicitlySet__.add("detectorRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetDetectorRecipe build() {
            UpdateTargetDetectorRecipe model =
                    new UpdateTargetDetectorRecipe(this.targetDetectorRecipeId, this.detectorRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetDetectorRecipe model) {
            if (model.wasPropertyExplicitlySet("targetDetectorRecipeId")) {
                this.targetDetectorRecipeId(model.getTargetDetectorRecipeId());
            }
            if (model.wasPropertyExplicitlySet("detectorRules")) {
                this.detectorRules(model.getDetectorRules());
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

    /** Unique identifier for target detector recipe */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDetectorRecipeId")
    private final String targetDetectorRecipeId;

    /**
     * Unique identifier for target detector recipe
     *
     * @return the value
     */
    public String getTargetDetectorRecipeId() {
        return targetDetectorRecipeId;
    }

    /** Updates to be applied to detector rules in target detector recipe */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
    private final java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules;

    /**
     * Updates to be applied to detector rules in target detector recipe
     *
     * @return the value
     */
    public java.util.List<UpdateTargetRecipeDetectorRuleDetails> getDetectorRules() {
        return detectorRules;
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
        sb.append("UpdateTargetDetectorRecipe(");
        sb.append("super=").append(super.toString());
        sb.append("targetDetectorRecipeId=").append(String.valueOf(this.targetDetectorRecipeId));
        sb.append(", detectorRules=").append(String.valueOf(this.detectorRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetDetectorRecipe)) {
            return false;
        }

        UpdateTargetDetectorRecipe other = (UpdateTargetDetectorRecipe) o;
        return java.util.Objects.equals(this.targetDetectorRecipeId, other.targetDetectorRecipeId)
                && java.util.Objects.equals(this.detectorRules, other.detectorRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetDetectorRecipeId == null
                                ? 43
                                : this.targetDetectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRules == null ? 43 : this.detectorRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
