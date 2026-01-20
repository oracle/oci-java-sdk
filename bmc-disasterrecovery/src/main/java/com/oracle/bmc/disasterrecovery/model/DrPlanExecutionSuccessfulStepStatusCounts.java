/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * A summary of steps that completed successfully during a DR plan execution. <br>
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
        builder = DrPlanExecutionSuccessfulStepStatusCounts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanExecutionSuccessfulStepStatusCounts
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalSuccessful", "succeeded"})
    public DrPlanExecutionSuccessfulStepStatusCounts(Integer totalSuccessful, Integer succeeded) {
        super();
        this.totalSuccessful = totalSuccessful;
        this.succeeded = succeeded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of successful steps in a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSuccessful")
        private Integer totalSuccessful;

        /**
         * The total number of successful steps in a DR plan execution.
         *
         * @param totalSuccessful the value to set
         * @return this builder
         */
        public Builder totalSuccessful(Integer totalSuccessful) {
            this.totalSuccessful = totalSuccessful;
            this.__explicitlySet__.add("totalSuccessful");
            return this;
        }
        /** The total number of steps that succeeded during a DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("succeeded")
        private Integer succeeded;

        /**
         * The total number of steps that succeeded during a DR plan execution.
         *
         * @param succeeded the value to set
         * @return this builder
         */
        public Builder succeeded(Integer succeeded) {
            this.succeeded = succeeded;
            this.__explicitlySet__.add("succeeded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanExecutionSuccessfulStepStatusCounts build() {
            DrPlanExecutionSuccessfulStepStatusCounts model =
                    new DrPlanExecutionSuccessfulStepStatusCounts(
                            this.totalSuccessful, this.succeeded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanExecutionSuccessfulStepStatusCounts model) {
            if (model.wasPropertyExplicitlySet("totalSuccessful")) {
                this.totalSuccessful(model.getTotalSuccessful());
            }
            if (model.wasPropertyExplicitlySet("succeeded")) {
                this.succeeded(model.getSucceeded());
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

    /** The total number of successful steps in a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSuccessful")
    private final Integer totalSuccessful;

    /**
     * The total number of successful steps in a DR plan execution.
     *
     * @return the value
     */
    public Integer getTotalSuccessful() {
        return totalSuccessful;
    }

    /** The total number of steps that succeeded during a DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("succeeded")
    private final Integer succeeded;

    /**
     * The total number of steps that succeeded during a DR plan execution.
     *
     * @return the value
     */
    public Integer getSucceeded() {
        return succeeded;
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
        sb.append("DrPlanExecutionSuccessfulStepStatusCounts(");
        sb.append("super=").append(super.toString());
        sb.append("totalSuccessful=").append(String.valueOf(this.totalSuccessful));
        sb.append(", succeeded=").append(String.valueOf(this.succeeded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanExecutionSuccessfulStepStatusCounts)) {
            return false;
        }

        DrPlanExecutionSuccessfulStepStatusCounts other =
                (DrPlanExecutionSuccessfulStepStatusCounts) o;
        return java.util.Objects.equals(this.totalSuccessful, other.totalSuccessful)
                && java.util.Objects.equals(this.succeeded, other.succeeded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalSuccessful == null ? 43 : this.totalSuccessful.hashCode());
        result = (result * PRIME) + (this.succeeded == null ? 43 : this.succeeded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
