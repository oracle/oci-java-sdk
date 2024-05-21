/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Parameters to use to update a responder recipe responder rule.
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
    builder = UpdateResponderRecipeResponderRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateResponderRecipeResponderRule
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"responderRuleId", "details"})
    public UpdateResponderRecipeResponderRule(
            String responderRuleId, UpdateResponderRuleDetails details) {
        super();
        this.responderRuleId = responderRuleId;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the responder rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        /**
         * Unique identifier for the responder rule
         * @param responderRuleId the value to set
         * @return this builder
         **/
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private UpdateResponderRuleDetails details;

        public Builder details(UpdateResponderRuleDetails details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateResponderRecipeResponderRule build() {
            UpdateResponderRecipeResponderRule model =
                    new UpdateResponderRecipeResponderRule(this.responderRuleId, this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateResponderRecipeResponderRule model) {
            if (model.wasPropertyExplicitlySet("responderRuleId")) {
                this.responderRuleId(model.getResponderRuleId());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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
     * Unique identifier for the responder rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    private final String responderRuleId;

    /**
     * Unique identifier for the responder rule
     * @return the value
     **/
    public String getResponderRuleId() {
        return responderRuleId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final UpdateResponderRuleDetails details;

    public UpdateResponderRuleDetails getDetails() {
        return details;
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
        sb.append("UpdateResponderRecipeResponderRule(");
        sb.append("super=").append(super.toString());
        sb.append("responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateResponderRecipeResponderRule)) {
            return false;
        }

        UpdateResponderRecipeResponderRule other = (UpdateResponderRecipeResponderRule) o;
        return java.util.Objects.equals(this.responderRuleId, other.responderRuleId)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.responderRuleId == null ? 43 : this.responderRuleId.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
