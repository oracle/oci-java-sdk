/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Patch operation list summary by status record. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchOperationsSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchOperationsSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "scheduledPatchOpsCount",
        "runningPatchOpsCount",
        "successfulPatchOpsCount",
        "warningsPatchOpsCount",
        "failedPatchOpsCount"
    })
    public PatchOperationsSummary(
            Integer scheduledPatchOpsCount,
            Integer runningPatchOpsCount,
            Integer successfulPatchOpsCount,
            Integer warningsPatchOpsCount,
            Integer failedPatchOpsCount) {
        super();
        this.scheduledPatchOpsCount = scheduledPatchOpsCount;
        this.runningPatchOpsCount = runningPatchOpsCount;
        this.successfulPatchOpsCount = successfulPatchOpsCount;
        this.warningsPatchOpsCount = warningsPatchOpsCount;
        this.failedPatchOpsCount = failedPatchOpsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of scheduled Patch operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledPatchOpsCount")
        private Integer scheduledPatchOpsCount;

        /**
         * Total number of scheduled Patch operations.
         *
         * @param scheduledPatchOpsCount the value to set
         * @return this builder
         */
        public Builder scheduledPatchOpsCount(Integer scheduledPatchOpsCount) {
            this.scheduledPatchOpsCount = scheduledPatchOpsCount;
            this.__explicitlySet__.add("scheduledPatchOpsCount");
            return this;
        }
        /** Total number of in progress Patch operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("runningPatchOpsCount")
        private Integer runningPatchOpsCount;

        /**
         * Total number of in progress Patch operations.
         *
         * @param runningPatchOpsCount the value to set
         * @return this builder
         */
        public Builder runningPatchOpsCount(Integer runningPatchOpsCount) {
            this.runningPatchOpsCount = runningPatchOpsCount;
            this.__explicitlySet__.add("runningPatchOpsCount");
            return this;
        }
        /** Total number of successful Patch operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("successfulPatchOpsCount")
        private Integer successfulPatchOpsCount;

        /**
         * Total number of successful Patch operations.
         *
         * @param successfulPatchOpsCount the value to set
         * @return this builder
         */
        public Builder successfulPatchOpsCount(Integer successfulPatchOpsCount) {
            this.successfulPatchOpsCount = successfulPatchOpsCount;
            this.__explicitlySet__.add("successfulPatchOpsCount");
            return this;
        }
        /** Total number of Patch operations that have warnings. */
        @com.fasterxml.jackson.annotation.JsonProperty("warningsPatchOpsCount")
        private Integer warningsPatchOpsCount;

        /**
         * Total number of Patch operations that have warnings.
         *
         * @param warningsPatchOpsCount the value to set
         * @return this builder
         */
        public Builder warningsPatchOpsCount(Integer warningsPatchOpsCount) {
            this.warningsPatchOpsCount = warningsPatchOpsCount;
            this.__explicitlySet__.add("warningsPatchOpsCount");
            return this;
        }
        /** Total number of failed Patch operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedPatchOpsCount")
        private Integer failedPatchOpsCount;

        /**
         * Total number of failed Patch operations.
         *
         * @param failedPatchOpsCount the value to set
         * @return this builder
         */
        public Builder failedPatchOpsCount(Integer failedPatchOpsCount) {
            this.failedPatchOpsCount = failedPatchOpsCount;
            this.__explicitlySet__.add("failedPatchOpsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchOperationsSummary build() {
            PatchOperationsSummary model =
                    new PatchOperationsSummary(
                            this.scheduledPatchOpsCount,
                            this.runningPatchOpsCount,
                            this.successfulPatchOpsCount,
                            this.warningsPatchOpsCount,
                            this.failedPatchOpsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchOperationsSummary model) {
            if (model.wasPropertyExplicitlySet("scheduledPatchOpsCount")) {
                this.scheduledPatchOpsCount(model.getScheduledPatchOpsCount());
            }
            if (model.wasPropertyExplicitlySet("runningPatchOpsCount")) {
                this.runningPatchOpsCount(model.getRunningPatchOpsCount());
            }
            if (model.wasPropertyExplicitlySet("successfulPatchOpsCount")) {
                this.successfulPatchOpsCount(model.getSuccessfulPatchOpsCount());
            }
            if (model.wasPropertyExplicitlySet("warningsPatchOpsCount")) {
                this.warningsPatchOpsCount(model.getWarningsPatchOpsCount());
            }
            if (model.wasPropertyExplicitlySet("failedPatchOpsCount")) {
                this.failedPatchOpsCount(model.getFailedPatchOpsCount());
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

    /** Total number of scheduled Patch operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledPatchOpsCount")
    private final Integer scheduledPatchOpsCount;

    /**
     * Total number of scheduled Patch operations.
     *
     * @return the value
     */
    public Integer getScheduledPatchOpsCount() {
        return scheduledPatchOpsCount;
    }

    /** Total number of in progress Patch operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("runningPatchOpsCount")
    private final Integer runningPatchOpsCount;

    /**
     * Total number of in progress Patch operations.
     *
     * @return the value
     */
    public Integer getRunningPatchOpsCount() {
        return runningPatchOpsCount;
    }

    /** Total number of successful Patch operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("successfulPatchOpsCount")
    private final Integer successfulPatchOpsCount;

    /**
     * Total number of successful Patch operations.
     *
     * @return the value
     */
    public Integer getSuccessfulPatchOpsCount() {
        return successfulPatchOpsCount;
    }

    /** Total number of Patch operations that have warnings. */
    @com.fasterxml.jackson.annotation.JsonProperty("warningsPatchOpsCount")
    private final Integer warningsPatchOpsCount;

    /**
     * Total number of Patch operations that have warnings.
     *
     * @return the value
     */
    public Integer getWarningsPatchOpsCount() {
        return warningsPatchOpsCount;
    }

    /** Total number of failed Patch operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedPatchOpsCount")
    private final Integer failedPatchOpsCount;

    /**
     * Total number of failed Patch operations.
     *
     * @return the value
     */
    public Integer getFailedPatchOpsCount() {
        return failedPatchOpsCount;
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
        sb.append("PatchOperationsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("scheduledPatchOpsCount=").append(String.valueOf(this.scheduledPatchOpsCount));
        sb.append(", runningPatchOpsCount=").append(String.valueOf(this.runningPatchOpsCount));
        sb.append(", successfulPatchOpsCount=")
                .append(String.valueOf(this.successfulPatchOpsCount));
        sb.append(", warningsPatchOpsCount=").append(String.valueOf(this.warningsPatchOpsCount));
        sb.append(", failedPatchOpsCount=").append(String.valueOf(this.failedPatchOpsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchOperationsSummary)) {
            return false;
        }

        PatchOperationsSummary other = (PatchOperationsSummary) o;
        return java.util.Objects.equals(this.scheduledPatchOpsCount, other.scheduledPatchOpsCount)
                && java.util.Objects.equals(this.runningPatchOpsCount, other.runningPatchOpsCount)
                && java.util.Objects.equals(
                        this.successfulPatchOpsCount, other.successfulPatchOpsCount)
                && java.util.Objects.equals(this.warningsPatchOpsCount, other.warningsPatchOpsCount)
                && java.util.Objects.equals(this.failedPatchOpsCount, other.failedPatchOpsCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.scheduledPatchOpsCount == null
                                ? 43
                                : this.scheduledPatchOpsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.runningPatchOpsCount == null
                                ? 43
                                : this.runningPatchOpsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.successfulPatchOpsCount == null
                                ? 43
                                : this.successfulPatchOpsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.warningsPatchOpsCount == null
                                ? 43
                                : this.warningsPatchOpsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.failedPatchOpsCount == null
                                ? 43
                                : this.failedPatchOpsCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
