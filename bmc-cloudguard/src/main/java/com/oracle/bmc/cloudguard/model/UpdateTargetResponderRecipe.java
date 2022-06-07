/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information to be updated in attached Target ResponderRecipe
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
    builder = UpdateTargetResponderRecipe.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTargetResponderRecipe {
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
        @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipeId")
        private String targetResponderRecipeId;

        public Builder targetResponderRecipeId(String targetResponderRecipeId) {
            this.targetResponderRecipeId = targetResponderRecipeId;
            this.__explicitlySet__.add("targetResponderRecipeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderRules")
        private java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules;

        public Builder responderRules(
                java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules) {
            this.responderRules = responderRules;
            this.__explicitlySet__.add("responderRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetResponderRecipe build() {
            UpdateTargetResponderRecipe __instance__ =
                    new UpdateTargetResponderRecipe(targetResponderRecipeId, responderRules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetResponderRecipe o) {
            Builder copiedBuilder =
                    targetResponderRecipeId(o.getTargetResponderRecipeId())
                            .responderRules(o.getResponderRules());

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
     * Identifier for ResponderRecipe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResponderRecipeId")
    private final String targetResponderRecipeId;

    public String getTargetResponderRecipeId() {
        return targetResponderRecipeId;
    }

    /**
     * Update responder rules associated with reponder recipe in a target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRules")
    private final java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules;

    public java.util.List<UpdateTargetRecipeResponderRuleDetails> getResponderRules() {
        return responderRules;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateTargetResponderRecipe(");
        sb.append("targetResponderRecipeId=").append(String.valueOf(this.targetResponderRecipeId));
        sb.append(", responderRules=").append(String.valueOf(this.responderRules));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
