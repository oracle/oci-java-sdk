/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * A categorized summary of step execution statuses and their corresponding counts. <br>
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
        builder = DrPlanExecutionStepStatusCounts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanExecutionStepStatusCounts
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalSteps",
        "remainingSteps",
        "skippedSteps",
        "successfulSteps",
        "warningSteps",
        "failedSteps"
    })
    public DrPlanExecutionStepStatusCounts(
            Integer totalSteps,
            DrPlanExecutionRemainingStepStatusCounts remainingSteps,
            DrPlanExecutionSkippedStepStatusCounts skippedSteps,
            DrPlanExecutionSuccessfulStepStatusCounts successfulSteps,
            DrPlanExecutionWarningStepStatusCounts warningSteps,
            DrPlanExecutionFailedStepStatusCounts failedSteps) {
        super();
        this.totalSteps = totalSteps;
        this.remainingSteps = remainingSteps;
        this.skippedSteps = skippedSteps;
        this.successfulSteps = successfulSteps;
        this.warningSteps = warningSteps;
        this.failedSteps = failedSteps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of steps in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSteps")
        private Integer totalSteps;

        /**
         * The total number of steps in a DR plan execution.
         *
         * @param totalSteps the value to set
         * @return this builder
         */
        public Builder totalSteps(Integer totalSteps) {
            this.totalSteps = totalSteps;
            this.__explicitlySet__.add("totalSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingSteps")
        private DrPlanExecutionRemainingStepStatusCounts remainingSteps;

        public Builder remainingSteps(DrPlanExecutionRemainingStepStatusCounts remainingSteps) {
            this.remainingSteps = remainingSteps;
            this.__explicitlySet__.add("remainingSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skippedSteps")
        private DrPlanExecutionSkippedStepStatusCounts skippedSteps;

        public Builder skippedSteps(DrPlanExecutionSkippedStepStatusCounts skippedSteps) {
            this.skippedSteps = skippedSteps;
            this.__explicitlySet__.add("skippedSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("successfulSteps")
        private DrPlanExecutionSuccessfulStepStatusCounts successfulSteps;

        public Builder successfulSteps(DrPlanExecutionSuccessfulStepStatusCounts successfulSteps) {
            this.successfulSteps = successfulSteps;
            this.__explicitlySet__.add("successfulSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningSteps")
        private DrPlanExecutionWarningStepStatusCounts warningSteps;

        public Builder warningSteps(DrPlanExecutionWarningStepStatusCounts warningSteps) {
            this.warningSteps = warningSteps;
            this.__explicitlySet__.add("warningSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failedSteps")
        private DrPlanExecutionFailedStepStatusCounts failedSteps;

        public Builder failedSteps(DrPlanExecutionFailedStepStatusCounts failedSteps) {
            this.failedSteps = failedSteps;
            this.__explicitlySet__.add("failedSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanExecutionStepStatusCounts build() {
            DrPlanExecutionStepStatusCounts model =
                    new DrPlanExecutionStepStatusCounts(
                            this.totalSteps,
                            this.remainingSteps,
                            this.skippedSteps,
                            this.successfulSteps,
                            this.warningSteps,
                            this.failedSteps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanExecutionStepStatusCounts model) {
            if (model.wasPropertyExplicitlySet("totalSteps")) {
                this.totalSteps(model.getTotalSteps());
            }
            if (model.wasPropertyExplicitlySet("remainingSteps")) {
                this.remainingSteps(model.getRemainingSteps());
            }
            if (model.wasPropertyExplicitlySet("skippedSteps")) {
                this.skippedSteps(model.getSkippedSteps());
            }
            if (model.wasPropertyExplicitlySet("successfulSteps")) {
                this.successfulSteps(model.getSuccessfulSteps());
            }
            if (model.wasPropertyExplicitlySet("warningSteps")) {
                this.warningSteps(model.getWarningSteps());
            }
            if (model.wasPropertyExplicitlySet("failedSteps")) {
                this.failedSteps(model.getFailedSteps());
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

    /** The total number of steps in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSteps")
    private final Integer totalSteps;

    /**
     * The total number of steps in a DR plan execution.
     *
     * @return the value
     */
    public Integer getTotalSteps() {
        return totalSteps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("remainingSteps")
    private final DrPlanExecutionRemainingStepStatusCounts remainingSteps;

    public DrPlanExecutionRemainingStepStatusCounts getRemainingSteps() {
        return remainingSteps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("skippedSteps")
    private final DrPlanExecutionSkippedStepStatusCounts skippedSteps;

    public DrPlanExecutionSkippedStepStatusCounts getSkippedSteps() {
        return skippedSteps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("successfulSteps")
    private final DrPlanExecutionSuccessfulStepStatusCounts successfulSteps;

    public DrPlanExecutionSuccessfulStepStatusCounts getSuccessfulSteps() {
        return successfulSteps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("warningSteps")
    private final DrPlanExecutionWarningStepStatusCounts warningSteps;

    public DrPlanExecutionWarningStepStatusCounts getWarningSteps() {
        return warningSteps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("failedSteps")
    private final DrPlanExecutionFailedStepStatusCounts failedSteps;

    public DrPlanExecutionFailedStepStatusCounts getFailedSteps() {
        return failedSteps;
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
        sb.append("DrPlanExecutionStepStatusCounts(");
        sb.append("super=").append(super.toString());
        sb.append("totalSteps=").append(String.valueOf(this.totalSteps));
        sb.append(", remainingSteps=").append(String.valueOf(this.remainingSteps));
        sb.append(", skippedSteps=").append(String.valueOf(this.skippedSteps));
        sb.append(", successfulSteps=").append(String.valueOf(this.successfulSteps));
        sb.append(", warningSteps=").append(String.valueOf(this.warningSteps));
        sb.append(", failedSteps=").append(String.valueOf(this.failedSteps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanExecutionStepStatusCounts)) {
            return false;
        }

        DrPlanExecutionStepStatusCounts other = (DrPlanExecutionStepStatusCounts) o;
        return java.util.Objects.equals(this.totalSteps, other.totalSteps)
                && java.util.Objects.equals(this.remainingSteps, other.remainingSteps)
                && java.util.Objects.equals(this.skippedSteps, other.skippedSteps)
                && java.util.Objects.equals(this.successfulSteps, other.successfulSteps)
                && java.util.Objects.equals(this.warningSteps, other.warningSteps)
                && java.util.Objects.equals(this.failedSteps, other.failedSteps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalSteps == null ? 43 : this.totalSteps.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingSteps == null ? 43 : this.remainingSteps.hashCode());
        result = (result * PRIME) + (this.skippedSteps == null ? 43 : this.skippedSteps.hashCode());
        result =
                (result * PRIME)
                        + (this.successfulSteps == null ? 43 : this.successfulSteps.hashCode());
        result = (result * PRIME) + (this.warningSteps == null ? 43 : this.warningSteps.hashCode());
        result = (result * PRIME) + (this.failedSteps == null ? 43 : this.failedSteps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
