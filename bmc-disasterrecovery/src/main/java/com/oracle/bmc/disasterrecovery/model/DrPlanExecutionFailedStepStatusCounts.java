/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * A summary of steps that failed during a DR plan execution, including failed and timed out steps.
 * <br>
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
        builder = DrPlanExecutionFailedStepStatusCounts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanExecutionFailedStepStatusCounts
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalFailed", "failed", "timedOut"})
    public DrPlanExecutionFailedStepStatusCounts(
            Integer totalFailed, Integer failed, Integer timedOut) {
        super();
        this.totalFailed = totalFailed;
        this.failed = failed;
        this.timedOut = timedOut;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of steps that failed during a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalFailed")
        private Integer totalFailed;

        /**
         * The total number of steps that failed during a DR plan execution.
         *
         * @param totalFailed the value to set
         * @return this builder
         */
        public Builder totalFailed(Integer totalFailed) {
            this.totalFailed = totalFailed;
            this.__explicitlySet__.add("totalFailed");
            return this;
        }
        /** The total number of failed steps in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("failed")
        private Integer failed;

        /**
         * The total number of failed steps in a DR plan execution.
         *
         * @param failed the value to set
         * @return this builder
         */
        public Builder failed(Integer failed) {
            this.failed = failed;
            this.__explicitlySet__.add("failed");
            return this;
        }
        /** The total number of steps that timed out during a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timedOut")
        private Integer timedOut;

        /**
         * The total number of steps that timed out during a DR plan execution.
         *
         * @param timedOut the value to set
         * @return this builder
         */
        public Builder timedOut(Integer timedOut) {
            this.timedOut = timedOut;
            this.__explicitlySet__.add("timedOut");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanExecutionFailedStepStatusCounts build() {
            DrPlanExecutionFailedStepStatusCounts model =
                    new DrPlanExecutionFailedStepStatusCounts(
                            this.totalFailed, this.failed, this.timedOut);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanExecutionFailedStepStatusCounts model) {
            if (model.wasPropertyExplicitlySet("totalFailed")) {
                this.totalFailed(model.getTotalFailed());
            }
            if (model.wasPropertyExplicitlySet("failed")) {
                this.failed(model.getFailed());
            }
            if (model.wasPropertyExplicitlySet("timedOut")) {
                this.timedOut(model.getTimedOut());
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

    /** The total number of steps that failed during a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalFailed")
    private final Integer totalFailed;

    /**
     * The total number of steps that failed during a DR plan execution.
     *
     * @return the value
     */
    public Integer getTotalFailed() {
        return totalFailed;
    }

    /** The total number of failed steps in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("failed")
    private final Integer failed;

    /**
     * The total number of failed steps in a DR plan execution.
     *
     * @return the value
     */
    public Integer getFailed() {
        return failed;
    }

    /** The total number of steps that timed out during a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timedOut")
    private final Integer timedOut;

    /**
     * The total number of steps that timed out during a DR plan execution.
     *
     * @return the value
     */
    public Integer getTimedOut() {
        return timedOut;
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
        sb.append("DrPlanExecutionFailedStepStatusCounts(");
        sb.append("super=").append(super.toString());
        sb.append("totalFailed=").append(String.valueOf(this.totalFailed));
        sb.append(", failed=").append(String.valueOf(this.failed));
        sb.append(", timedOut=").append(String.valueOf(this.timedOut));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanExecutionFailedStepStatusCounts)) {
            return false;
        }

        DrPlanExecutionFailedStepStatusCounts other = (DrPlanExecutionFailedStepStatusCounts) o;
        return java.util.Objects.equals(this.totalFailed, other.totalFailed)
                && java.util.Objects.equals(this.failed, other.failed)
                && java.util.Objects.equals(this.timedOut, other.timedOut)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalFailed == null ? 43 : this.totalFailed.hashCode());
        result = (result * PRIME) + (this.failed == null ? 43 : this.failed.hashCode());
        result = (result * PRIME) + (this.timedOut == null ? 43 : this.timedOut.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
