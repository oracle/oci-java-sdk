/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * A summary of steps that were skipped during a DR plan execution, including disabled, failed but
 * ignored, timed out but ignored, and canceled steps. <br>
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
        builder = DrPlanExecutionSkippedStepStatusCounts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanExecutionSkippedStepStatusCounts
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalSkipped",
        "disabled",
        "failedIgnored",
        "timedOutIgnored",
        "canceled"
    })
    public DrPlanExecutionSkippedStepStatusCounts(
            Integer totalSkipped,
            Integer disabled,
            Integer failedIgnored,
            Integer timedOutIgnored,
            Integer canceled) {
        super();
        this.totalSkipped = totalSkipped;
        this.disabled = disabled;
        this.failedIgnored = failedIgnored;
        this.timedOutIgnored = timedOutIgnored;
        this.canceled = canceled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of steps that were skipped during a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSkipped")
        private Integer totalSkipped;

        /**
         * The total number of steps that were skipped during a DR plan execution.
         *
         * @param totalSkipped the value to set
         * @return this builder
         */
        public Builder totalSkipped(Integer totalSkipped) {
            this.totalSkipped = totalSkipped;
            this.__explicitlySet__.add("totalSkipped");
            return this;
        }
        /** The total number of disabled steps in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("disabled")
        private Integer disabled;

        /**
         * The total number of disabled steps in a DR plan execution.
         *
         * @param disabled the value to set
         * @return this builder
         */
        public Builder disabled(Integer disabled) {
            this.disabled = disabled;
            this.__explicitlySet__.add("disabled");
            return this;
        }
        /** The total number of steps that failed but were ignored during a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedIgnored")
        private Integer failedIgnored;

        /**
         * The total number of steps that failed but were ignored during a DR plan execution.
         *
         * @param failedIgnored the value to set
         * @return this builder
         */
        public Builder failedIgnored(Integer failedIgnored) {
            this.failedIgnored = failedIgnored;
            this.__explicitlySet__.add("failedIgnored");
            return this;
        }
        /** The total number of steps that timed out but were ignored during a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timedOutIgnored")
        private Integer timedOutIgnored;

        /**
         * The total number of steps that timed out but were ignored during a DR plan execution.
         *
         * @param timedOutIgnored the value to set
         * @return this builder
         */
        public Builder timedOutIgnored(Integer timedOutIgnored) {
            this.timedOutIgnored = timedOutIgnored;
            this.__explicitlySet__.add("timedOutIgnored");
            return this;
        }
        /** The total number of canceled steps in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("canceled")
        private Integer canceled;

        /**
         * The total number of canceled steps in a DR plan execution.
         *
         * @param canceled the value to set
         * @return this builder
         */
        public Builder canceled(Integer canceled) {
            this.canceled = canceled;
            this.__explicitlySet__.add("canceled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanExecutionSkippedStepStatusCounts build() {
            DrPlanExecutionSkippedStepStatusCounts model =
                    new DrPlanExecutionSkippedStepStatusCounts(
                            this.totalSkipped,
                            this.disabled,
                            this.failedIgnored,
                            this.timedOutIgnored,
                            this.canceled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanExecutionSkippedStepStatusCounts model) {
            if (model.wasPropertyExplicitlySet("totalSkipped")) {
                this.totalSkipped(model.getTotalSkipped());
            }
            if (model.wasPropertyExplicitlySet("disabled")) {
                this.disabled(model.getDisabled());
            }
            if (model.wasPropertyExplicitlySet("failedIgnored")) {
                this.failedIgnored(model.getFailedIgnored());
            }
            if (model.wasPropertyExplicitlySet("timedOutIgnored")) {
                this.timedOutIgnored(model.getTimedOutIgnored());
            }
            if (model.wasPropertyExplicitlySet("canceled")) {
                this.canceled(model.getCanceled());
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

    /** The total number of steps that were skipped during a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSkipped")
    private final Integer totalSkipped;

    /**
     * The total number of steps that were skipped during a DR plan execution.
     *
     * @return the value
     */
    public Integer getTotalSkipped() {
        return totalSkipped;
    }

    /** The total number of disabled steps in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("disabled")
    private final Integer disabled;

    /**
     * The total number of disabled steps in a DR plan execution.
     *
     * @return the value
     */
    public Integer getDisabled() {
        return disabled;
    }

    /** The total number of steps that failed but were ignored during a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedIgnored")
    private final Integer failedIgnored;

    /**
     * The total number of steps that failed but were ignored during a DR plan execution.
     *
     * @return the value
     */
    public Integer getFailedIgnored() {
        return failedIgnored;
    }

    /** The total number of steps that timed out but were ignored during a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timedOutIgnored")
    private final Integer timedOutIgnored;

    /**
     * The total number of steps that timed out but were ignored during a DR plan execution.
     *
     * @return the value
     */
    public Integer getTimedOutIgnored() {
        return timedOutIgnored;
    }

    /** The total number of canceled steps in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("canceled")
    private final Integer canceled;

    /**
     * The total number of canceled steps in a DR plan execution.
     *
     * @return the value
     */
    public Integer getCanceled() {
        return canceled;
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
        sb.append("DrPlanExecutionSkippedStepStatusCounts(");
        sb.append("super=").append(super.toString());
        sb.append("totalSkipped=").append(String.valueOf(this.totalSkipped));
        sb.append(", disabled=").append(String.valueOf(this.disabled));
        sb.append(", failedIgnored=").append(String.valueOf(this.failedIgnored));
        sb.append(", timedOutIgnored=").append(String.valueOf(this.timedOutIgnored));
        sb.append(", canceled=").append(String.valueOf(this.canceled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanExecutionSkippedStepStatusCounts)) {
            return false;
        }

        DrPlanExecutionSkippedStepStatusCounts other = (DrPlanExecutionSkippedStepStatusCounts) o;
        return java.util.Objects.equals(this.totalSkipped, other.totalSkipped)
                && java.util.Objects.equals(this.disabled, other.disabled)
                && java.util.Objects.equals(this.failedIgnored, other.failedIgnored)
                && java.util.Objects.equals(this.timedOutIgnored, other.timedOutIgnored)
                && java.util.Objects.equals(this.canceled, other.canceled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalSkipped == null ? 43 : this.totalSkipped.hashCode());
        result = (result * PRIME) + (this.disabled == null ? 43 : this.disabled.hashCode());
        result =
                (result * PRIME)
                        + (this.failedIgnored == null ? 43 : this.failedIgnored.hashCode());
        result =
                (result * PRIME)
                        + (this.timedOutIgnored == null ? 43 : this.timedOutIgnored.hashCode());
        result = (result * PRIME) + (this.canceled == null ? 43 : this.canceled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
