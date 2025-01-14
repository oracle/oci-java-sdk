/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Parameters to use to update a detector rule. <br>
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
        builder = UpdateDetectorRecipeDetectorRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDetectorRecipeDetectorRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"detectorRuleId", "details"})
    public UpdateDetectorRecipeDetectorRule(
            String detectorRuleId, UpdateDetectorRuleDetails details) {
        super();
        this.detectorRuleId = detectorRuleId;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Detector recipe rule ID */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
        private String detectorRuleId;

        /**
         * Detector recipe rule ID
         *
         * @param detectorRuleId the value to set
         * @return this builder
         */
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            this.__explicitlySet__.add("detectorRuleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private UpdateDetectorRuleDetails details;

        public Builder details(UpdateDetectorRuleDetails details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDetectorRecipeDetectorRule build() {
            UpdateDetectorRecipeDetectorRule model =
                    new UpdateDetectorRecipeDetectorRule(this.detectorRuleId, this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDetectorRecipeDetectorRule model) {
            if (model.wasPropertyExplicitlySet("detectorRuleId")) {
                this.detectorRuleId(model.getDetectorRuleId());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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

    /** Detector recipe rule ID */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
    private final String detectorRuleId;

    /**
     * Detector recipe rule ID
     *
     * @return the value
     */
    public String getDetectorRuleId() {
        return detectorRuleId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final UpdateDetectorRuleDetails details;

    public UpdateDetectorRuleDetails getDetails() {
        return details;
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
        sb.append("UpdateDetectorRecipeDetectorRule(");
        sb.append("super=").append(super.toString());
        sb.append("detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDetectorRecipeDetectorRule)) {
            return false;
        }

        UpdateDetectorRecipeDetectorRule other = (UpdateDetectorRecipeDetectorRule) o;
        return java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
