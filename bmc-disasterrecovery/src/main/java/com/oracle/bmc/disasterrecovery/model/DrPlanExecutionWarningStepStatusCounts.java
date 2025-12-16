/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * A summary of steps that encountered warnings during a DR plan execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DrPlanExecutionWarningStepStatusCounts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanExecutionWarningStepStatusCounts
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalWarnings", "warningsIgnored"})
    public DrPlanExecutionWarningStepStatusCounts(Integer totalWarnings, Integer warningsIgnored) {
        super();
        this.totalWarnings = totalWarnings;
        this.warningsIgnored = warningsIgnored;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of steps that encountered warnings in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalWarnings")
        private Integer totalWarnings;

        /**
         * The total number of steps that encountered warnings in a DR plan execution.
         *
         * @param totalWarnings the value to set
         * @return this builder
         */
        public Builder totalWarnings(Integer totalWarnings) {
            this.totalWarnings = totalWarnings;
            this.__explicitlySet__.add("totalWarnings");
            return this;
        }
        /** The total number of steps with warnings that were ignored during a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("warningsIgnored")
        private Integer warningsIgnored;

        /**
         * The total number of steps with warnings that were ignored during a DR plan execution.
         *
         * @param warningsIgnored the value to set
         * @return this builder
         */
        public Builder warningsIgnored(Integer warningsIgnored) {
            this.warningsIgnored = warningsIgnored;
            this.__explicitlySet__.add("warningsIgnored");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanExecutionWarningStepStatusCounts build() {
            DrPlanExecutionWarningStepStatusCounts model =
                    new DrPlanExecutionWarningStepStatusCounts(
                            this.totalWarnings, this.warningsIgnored);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanExecutionWarningStepStatusCounts model) {
            if (model.wasPropertyExplicitlySet("totalWarnings")) {
                this.totalWarnings(model.getTotalWarnings());
            }
            if (model.wasPropertyExplicitlySet("warningsIgnored")) {
                this.warningsIgnored(model.getWarningsIgnored());
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

    /** The total number of steps that encountered warnings in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalWarnings")
    private final Integer totalWarnings;

    /**
     * The total number of steps that encountered warnings in a DR plan execution.
     *
     * @return the value
     */
    public Integer getTotalWarnings() {
        return totalWarnings;
    }

    /** The total number of steps with warnings that were ignored during a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("warningsIgnored")
    private final Integer warningsIgnored;

    /**
     * The total number of steps with warnings that were ignored during a DR plan execution.
     *
     * @return the value
     */
    public Integer getWarningsIgnored() {
        return warningsIgnored;
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
        sb.append("DrPlanExecutionWarningStepStatusCounts(");
        sb.append("super=").append(super.toString());
        sb.append("totalWarnings=").append(String.valueOf(this.totalWarnings));
        sb.append(", warningsIgnored=").append(String.valueOf(this.warningsIgnored));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanExecutionWarningStepStatusCounts)) {
            return false;
        }

        DrPlanExecutionWarningStepStatusCounts other = (DrPlanExecutionWarningStepStatusCounts) o;
        return java.util.Objects.equals(this.totalWarnings, other.totalWarnings)
                && java.util.Objects.equals(this.warningsIgnored, other.warningsIgnored)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalWarnings == null ? 43 : this.totalWarnings.hashCode());
        result =
                (result * PRIME)
                        + (this.warningsIgnored == null ? 43 : this.warningsIgnored.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
