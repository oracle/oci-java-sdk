/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information required to create TargetResponderRecipe
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
    builder = CreateTargetResponderRecipeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTargetResponderRecipeDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"responderRecipeId", "responderRules"})
    public CreateTargetResponderRecipeDetails(
            String responderRecipeId,
            java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules) {
        super();
        this.responderRecipeId = responderRecipeId;
        this.responderRules = responderRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Identifier for ResponderRecipe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderRecipeId")
        private String responderRecipeId;

        /**
         * Identifier for ResponderRecipe.
         * @param responderRecipeId the value to set
         * @return this builder
         **/
        public Builder responderRecipeId(String responderRecipeId) {
            this.responderRecipeId = responderRecipeId;
            this.__explicitlySet__.add("responderRecipeId");
            return this;
        }
        /**
         * Override responder rules associated with reponder recipe in a target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderRules")
        private java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules;

        /**
         * Override responder rules associated with reponder recipe in a target.
         * @param responderRules the value to set
         * @return this builder
         **/
        public Builder responderRules(
                java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules) {
            this.responderRules = responderRules;
            this.__explicitlySet__.add("responderRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTargetResponderRecipeDetails build() {
            CreateTargetResponderRecipeDetails model =
                    new CreateTargetResponderRecipeDetails(
                            this.responderRecipeId, this.responderRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTargetResponderRecipeDetails model) {
            if (model.wasPropertyExplicitlySet("responderRecipeId")) {
                this.responderRecipeId(model.getResponderRecipeId());
            }
            if (model.wasPropertyExplicitlySet("responderRules")) {
                this.responderRules(model.getResponderRules());
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
     * Identifier for ResponderRecipe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRecipeId")
    private final String responderRecipeId;

    /**
     * Identifier for ResponderRecipe.
     * @return the value
     **/
    public String getResponderRecipeId() {
        return responderRecipeId;
    }

    /**
     * Override responder rules associated with reponder recipe in a target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRules")
    private final java.util.List<UpdateTargetRecipeResponderRuleDetails> responderRules;

    /**
     * Override responder rules associated with reponder recipe in a target.
     * @return the value
     **/
    public java.util.List<UpdateTargetRecipeResponderRuleDetails> getResponderRules() {
        return responderRules;
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
        sb.append("CreateTargetResponderRecipeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("responderRecipeId=").append(String.valueOf(this.responderRecipeId));
        sb.append(", responderRules=").append(String.valueOf(this.responderRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTargetResponderRecipeDetails)) {
            return false;
        }

        CreateTargetResponderRecipeDetails other = (CreateTargetResponderRecipeDetails) o;
        return java.util.Objects.equals(this.responderRecipeId, other.responderRecipeId)
                && java.util.Objects.equals(this.responderRules, other.responderRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.responderRecipeId == null ? 43 : this.responderRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRules == null ? 43 : this.responderRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
