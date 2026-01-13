/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * A summary of remaining steps in a DR plan execution, including queued, paused, and in-progress
 * steps. <br>
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
        builder = DrPlanExecutionRemainingStepStatusCounts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanExecutionRemainingStepStatusCounts
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalRemaining", "queued", "paused", "inProgress"})
    public DrPlanExecutionRemainingStepStatusCounts(
            Integer totalRemaining, Integer queued, Integer paused, Integer inProgress) {
        super();
        this.totalRemaining = totalRemaining;
        this.queued = queued;
        this.paused = paused;
        this.inProgress = inProgress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of remaining steps in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalRemaining")
        private Integer totalRemaining;

        /**
         * The total number of remaining steps in a DR plan execution.
         *
         * @param totalRemaining the value to set
         * @return this builder
         */
        public Builder totalRemaining(Integer totalRemaining) {
            this.totalRemaining = totalRemaining;
            this.__explicitlySet__.add("totalRemaining");
            return this;
        }
        /** The total number of queued steps in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("queued")
        private Integer queued;

        /**
         * The total number of queued steps in a DR plan execution.
         *
         * @param queued the value to set
         * @return this builder
         */
        public Builder queued(Integer queued) {
            this.queued = queued;
            this.__explicitlySet__.add("queued");
            return this;
        }
        /** The total number of paused steps in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("paused")
        private Integer paused;

        /**
         * The total number of paused steps in a DR plan execution.
         *
         * @param paused the value to set
         * @return this builder
         */
        public Builder paused(Integer paused) {
            this.paused = paused;
            this.__explicitlySet__.add("paused");
            return this;
        }
        /** The total number of steps in progress during a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("inProgress")
        private Integer inProgress;

        /**
         * The total number of steps in progress during a DR plan execution.
         *
         * @param inProgress the value to set
         * @return this builder
         */
        public Builder inProgress(Integer inProgress) {
            this.inProgress = inProgress;
            this.__explicitlySet__.add("inProgress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanExecutionRemainingStepStatusCounts build() {
            DrPlanExecutionRemainingStepStatusCounts model =
                    new DrPlanExecutionRemainingStepStatusCounts(
                            this.totalRemaining, this.queued, this.paused, this.inProgress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanExecutionRemainingStepStatusCounts model) {
            if (model.wasPropertyExplicitlySet("totalRemaining")) {
                this.totalRemaining(model.getTotalRemaining());
            }
            if (model.wasPropertyExplicitlySet("queued")) {
                this.queued(model.getQueued());
            }
            if (model.wasPropertyExplicitlySet("paused")) {
                this.paused(model.getPaused());
            }
            if (model.wasPropertyExplicitlySet("inProgress")) {
                this.inProgress(model.getInProgress());
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

    /** The total number of remaining steps in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalRemaining")
    private final Integer totalRemaining;

    /**
     * The total number of remaining steps in a DR plan execution.
     *
     * @return the value
     */
    public Integer getTotalRemaining() {
        return totalRemaining;
    }

    /** The total number of queued steps in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("queued")
    private final Integer queued;

    /**
     * The total number of queued steps in a DR plan execution.
     *
     * @return the value
     */
    public Integer getQueued() {
        return queued;
    }

    /** The total number of paused steps in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("paused")
    private final Integer paused;

    /**
     * The total number of paused steps in a DR plan execution.
     *
     * @return the value
     */
    public Integer getPaused() {
        return paused;
    }

    /** The total number of steps in progress during a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("inProgress")
    private final Integer inProgress;

    /**
     * The total number of steps in progress during a DR plan execution.
     *
     * @return the value
     */
    public Integer getInProgress() {
        return inProgress;
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
        sb.append("DrPlanExecutionRemainingStepStatusCounts(");
        sb.append("super=").append(super.toString());
        sb.append("totalRemaining=").append(String.valueOf(this.totalRemaining));
        sb.append(", queued=").append(String.valueOf(this.queued));
        sb.append(", paused=").append(String.valueOf(this.paused));
        sb.append(", inProgress=").append(String.valueOf(this.inProgress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanExecutionRemainingStepStatusCounts)) {
            return false;
        }

        DrPlanExecutionRemainingStepStatusCounts other =
                (DrPlanExecutionRemainingStepStatusCounts) o;
        return java.util.Objects.equals(this.totalRemaining, other.totalRemaining)
                && java.util.Objects.equals(this.queued, other.queued)
                && java.util.Objects.equals(this.paused, other.paused)
                && java.util.Objects.equals(this.inProgress, other.inProgress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalRemaining == null ? 43 : this.totalRemaining.hashCode());
        result = (result * PRIME) + (this.queued == null ? 43 : this.queued.hashCode());
        result = (result * PRIME) + (this.paused == null ? 43 : this.paused.hashCode());
        result = (result * PRIME) + (this.inProgress == null ? 43 : this.inProgress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
