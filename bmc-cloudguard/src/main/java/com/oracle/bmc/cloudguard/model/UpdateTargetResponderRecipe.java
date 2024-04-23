/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Parameters to update a responder recipe attached to a target <br>
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
        builder = UpdateTargetResponderRecipe.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateTargetResponderRecipe
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetResponderRecipeId", "responderRules"})
    public UpdateTargetResponderRecipe(
            String targetResponderRecipeId,
            java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules) {
        super();
        this.targetResponderRecipeId = targetResponderRecipeId;
        this.responderRules = responderRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the target responder recipe */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipeId")
        private String targetResponderRecipeId;

        /**
         * Unique identifier for the target responder recipe
         *
         * @param targetResponderRecipeId the value to set
         * @return this builder
         */
        public Builder targetResponderRecipeId(String targetResponderRecipeId) {
            this.targetResponderRecipeId = targetResponderRecipeId;
            this.__explicitlySet__.add("targetResponderRecipeId");
            return this;
        }
        /** List of responder rules to be updated in the target responder recipe */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRules")
        private java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules;

        /**
         * List of responder rules to be updated in the target responder recipe
         *
         * @param responderRules the value to set
         * @return this builder
         */
        public Builder responderRules(
                java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules) {
            this.responderRules = responderRules;
            this.__explicitlySet__.add("responderRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetResponderRecipe build() {
            UpdateTargetResponderRecipe model =
                    new UpdateTargetResponderRecipe(
                            this.targetResponderRecipeId, this.responderRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetResponderRecipe model) {
            if (model.wasPropertyExplicitlySet("targetResponderRecipeId")) {
                this.targetResponderRecipeId(model.getTargetResponderRecipeId());
            }
            if (model.wasPropertyExplicitlySet("responderRules")) {
                this.responderRules(model.getResponderRules());
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

    /** Unique identifier for the target responder recipe */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipeId")
    private final String targetResponderRecipeId;

    /**
     * Unique identifier for the target responder recipe
     *
     * @return the value
     */
    public String getTargetResponderRecipeId() {
        return targetResponderRecipeId;
    }

    /** List of responder rules to be updated in the target responder recipe */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRules")
    private final java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules;

    /**
     * List of responder rules to be updated in the target responder recipe
     *
     * @return the value
     */
    public java.util.List<UpdateTargetRecipeResponderRuleDetails> getResponderRules() {
        return responderRules;
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
        sb.append("UpdateTargetResponderRecipe(");
        sb.append("super=").append(super.toString());
        sb.append("targetResponderRecipeId=").append(String.valueOf(this.targetResponderRecipeId));
        sb.append(", responderRules=").append(String.valueOf(this.responderRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetResponderRecipe)) {
            return false;
        }

        UpdateTargetResponderRecipe other = (UpdateTargetResponderRecipe) o;
        return java.util.Objects.equals(this.targetResponderRecipeId, other.targetResponderRecipeId)
                && java.util.Objects.equals(this.responderRules, other.responderRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetResponderRecipeId == null
                                ? 43
                                : this.targetResponderRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRules == null ? 43 : this.responderRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
