/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information to be updated in DetectorRecipe <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTargetDetectorRecipeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateTargetDetectorRecipeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "detectorRecipeId",
        "isValidationOnlyQuery",
        "detectorRules"
    })
    public UpdateTargetDetectorRecipeDetails(
            String detectorRecipeId,
            Boolean isValidationOnlyQuery,
            java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules) {
        super();
        this.detectorRecipeId = detectorRecipeId;
        this.isValidationOnlyQuery = isValidationOnlyQuery;
        this.detectorRules = detectorRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Detector recipe identifier associated with the target */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
        private String detectorRecipeId;

        /**
         * Detector recipe identifier associated with the target
         *
         * @param detectorRecipeId the value to set
         * @return this builder
         */
        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = detectorRecipeId;
            this.__explicitlySet__.add("detectorRecipeId");
            return this;
        }
        /** When enabled, validation is performed for attaching the detector recipe. */
        @com.fasterxml.jackson.annotation.JsonProperty("isValidationOnlyQuery")
        private Boolean isValidationOnlyQuery;

        /**
         * When enabled, validation is performed for attaching the detector recipe.
         *
         * @param isValidationOnlyQuery the value to set
         * @return this builder
         */
        public Builder isValidationOnlyQuery(Boolean isValidationOnlyQuery) {
            this.isValidationOnlyQuery = isValidationOnlyQuery;
            this.__explicitlySet__.add("isValidationOnlyQuery");
            return this;
        }
        /** Update detector rules associated with detector recipe in a target. */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
        private java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules;

        /**
         * Update detector rules associated with detector recipe in a target.
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

        public UpdateTargetDetectorRecipeDetails build() {
            UpdateTargetDetectorRecipeDetails model =
                    new UpdateTargetDetectorRecipeDetails(
                            this.detectorRecipeId, this.isValidationOnlyQuery, this.detectorRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetDetectorRecipeDetails model) {
            if (model.wasPropertyExplicitlySet("detectorRecipeId")) {
                this.detectorRecipeId(model.getDetectorRecipeId());
            }
            if (model.wasPropertyExplicitlySet("isValidationOnlyQuery")) {
                this.isValidationOnlyQuery(model.getIsValidationOnlyQuery());
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

    /** Detector recipe identifier associated with the target */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
    private final String detectorRecipeId;

    /**
     * Detector recipe identifier associated with the target
     *
     * @return the value
     */
    public String getDetectorRecipeId() {
        return detectorRecipeId;
    }

    /** When enabled, validation is performed for attaching the detector recipe. */
    @com.fasterxml.jackson.annotation.JsonProperty("isValidationOnlyQuery")
    private final Boolean isValidationOnlyQuery;

    /**
     * When enabled, validation is performed for attaching the detector recipe.
     *
     * @return the value
     */
    public Boolean getIsValidationOnlyQuery() {
        return isValidationOnlyQuery;
    }

    /** Update detector rules associated with detector recipe in a target. */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
    private final java.util.List<UpdateTargetRecipeDetectorRuleDetails> detectorRules;

    /**
     * Update detector rules associated with detector recipe in a target.
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
        sb.append("UpdateTargetDetectorRecipeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("detectorRecipeId=").append(String.valueOf(this.detectorRecipeId));
        sb.append(", isValidationOnlyQuery=").append(String.valueOf(this.isValidationOnlyQuery));
        sb.append(", detectorRules=").append(String.valueOf(this.detectorRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetDetectorRecipeDetails)) {
            return false;
        }

        UpdateTargetDetectorRecipeDetails other = (UpdateTargetDetectorRecipeDetails) o;
        return java.util.Objects.equals(this.detectorRecipeId, other.detectorRecipeId)
                && java.util.Objects.equals(this.isValidationOnlyQuery, other.isValidationOnlyQuery)
                && java.util.Objects.equals(this.detectorRules, other.detectorRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.detectorRecipeId == null ? 43 : this.detectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.isValidationOnlyQuery == null
                                ? 43
                                : this.isValidationOnlyQuery.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRules == null ? 43 : this.detectorRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
