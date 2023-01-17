/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Overriden settings of a Detector Rule applied on target <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTargetDetectorRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateTargetDetectorRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"conditionGroups"})
    public UpdateTargetDetectorRuleDetails(java.util.List<ConditionGroup> conditionGroups) {
        super();
        this.conditionGroups = conditionGroups;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Condition group corresponding to each compartment */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionGroups")
        private java.util.List<ConditionGroup> conditionGroups;

        /**
         * Condition group corresponding to each compartment
         *
         * @param conditionGroups the value to set
         * @return this builder
         */
        public Builder conditionGroups(java.util.List<ConditionGroup> conditionGroups) {
            this.conditionGroups = conditionGroups;
            this.__explicitlySet__.add("conditionGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetDetectorRuleDetails build() {
            UpdateTargetDetectorRuleDetails model =
                    new UpdateTargetDetectorRuleDetails(this.conditionGroups);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetDetectorRuleDetails model) {
            if (model.wasPropertyExplicitlySet("conditionGroups")) {
                this.conditionGroups(model.getConditionGroups());
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

    /** Condition group corresponding to each compartment */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionGroups")
    private final java.util.List<ConditionGroup> conditionGroups;

    /**
     * Condition group corresponding to each compartment
     *
     * @return the value
     */
    public java.util.List<ConditionGroup> getConditionGroups() {
        return conditionGroups;
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
        sb.append("UpdateTargetDetectorRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("conditionGroups=").append(String.valueOf(this.conditionGroups));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetDetectorRuleDetails)) {
            return false;
        }

        UpdateTargetDetectorRuleDetails other = (UpdateTargetDetectorRuleDetails) o;
        return java.util.Objects.equals(this.conditionGroups, other.conditionGroups)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.conditionGroups == null ? 43 : this.conditionGroups.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
