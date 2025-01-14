/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Configuration that applies the patch in batches, the batch size is a user defined parameter. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BatchingBasedPatchingConfigs.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "patchingConfigStrategy")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BatchingBasedPatchingConfigs extends PatchingConfigs {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** How many nodes to be patched and rebooted in each iteration. */
        @com.fasterxml.jackson.annotation.JsonProperty("batchSize")
        private Integer batchSize;

        /**
         * How many nodes to be patched and rebooted in each iteration.
         *
         * @param batchSize the value to set
         * @return this builder
         */
        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            this.__explicitlySet__.add("batchSize");
            return this;
        }
        /** The wait time between batches in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("waitTimeBetweenBatchInSeconds")
        private Integer waitTimeBetweenBatchInSeconds;

        /**
         * The wait time between batches in seconds.
         *
         * @param waitTimeBetweenBatchInSeconds the value to set
         * @return this builder
         */
        public Builder waitTimeBetweenBatchInSeconds(Integer waitTimeBetweenBatchInSeconds) {
            this.waitTimeBetweenBatchInSeconds = waitTimeBetweenBatchInSeconds;
            this.__explicitlySet__.add("waitTimeBetweenBatchInSeconds");
            return this;
        }
        /**
         * Acceptable number of failed-to-be-patched nodes in each batch. The maximum number of
         * failed-to-patch nodes cannot exceed 20% of the number of nodes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toleranceThresholdPerBatch")
        private Integer toleranceThresholdPerBatch;

        /**
         * Acceptable number of failed-to-be-patched nodes in each batch. The maximum number of
         * failed-to-patch nodes cannot exceed 20% of the number of nodes.
         *
         * @param toleranceThresholdPerBatch the value to set
         * @return this builder
         */
        public Builder toleranceThresholdPerBatch(Integer toleranceThresholdPerBatch) {
            this.toleranceThresholdPerBatch = toleranceThresholdPerBatch;
            this.__explicitlySet__.add("toleranceThresholdPerBatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchingBasedPatchingConfigs build() {
            BatchingBasedPatchingConfigs model =
                    new BatchingBasedPatchingConfigs(
                            this.batchSize,
                            this.waitTimeBetweenBatchInSeconds,
                            this.toleranceThresholdPerBatch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchingBasedPatchingConfigs model) {
            if (model.wasPropertyExplicitlySet("batchSize")) {
                this.batchSize(model.getBatchSize());
            }
            if (model.wasPropertyExplicitlySet("waitTimeBetweenBatchInSeconds")) {
                this.waitTimeBetweenBatchInSeconds(model.getWaitTimeBetweenBatchInSeconds());
            }
            if (model.wasPropertyExplicitlySet("toleranceThresholdPerBatch")) {
                this.toleranceThresholdPerBatch(model.getToleranceThresholdPerBatch());
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

    @Deprecated
    public BatchingBasedPatchingConfigs(
            Integer batchSize,
            Integer waitTimeBetweenBatchInSeconds,
            Integer toleranceThresholdPerBatch) {
        super();
        this.batchSize = batchSize;
        this.waitTimeBetweenBatchInSeconds = waitTimeBetweenBatchInSeconds;
        this.toleranceThresholdPerBatch = toleranceThresholdPerBatch;
    }

    /** How many nodes to be patched and rebooted in each iteration. */
    @com.fasterxml.jackson.annotation.JsonProperty("batchSize")
    private final Integer batchSize;

    /**
     * How many nodes to be patched and rebooted in each iteration.
     *
     * @return the value
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /** The wait time between batches in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("waitTimeBetweenBatchInSeconds")
    private final Integer waitTimeBetweenBatchInSeconds;

    /**
     * The wait time between batches in seconds.
     *
     * @return the value
     */
    public Integer getWaitTimeBetweenBatchInSeconds() {
        return waitTimeBetweenBatchInSeconds;
    }

    /**
     * Acceptable number of failed-to-be-patched nodes in each batch. The maximum number of
     * failed-to-patch nodes cannot exceed 20% of the number of nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toleranceThresholdPerBatch")
    private final Integer toleranceThresholdPerBatch;

    /**
     * Acceptable number of failed-to-be-patched nodes in each batch. The maximum number of
     * failed-to-patch nodes cannot exceed 20% of the number of nodes.
     *
     * @return the value
     */
    public Integer getToleranceThresholdPerBatch() {
        return toleranceThresholdPerBatch;
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
        sb.append("BatchingBasedPatchingConfigs(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", batchSize=").append(String.valueOf(this.batchSize));
        sb.append(", waitTimeBetweenBatchInSeconds=")
                .append(String.valueOf(this.waitTimeBetweenBatchInSeconds));
        sb.append(", toleranceThresholdPerBatch=")
                .append(String.valueOf(this.toleranceThresholdPerBatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchingBasedPatchingConfigs)) {
            return false;
        }

        BatchingBasedPatchingConfigs other = (BatchingBasedPatchingConfigs) o;
        return java.util.Objects.equals(this.batchSize, other.batchSize)
                && java.util.Objects.equals(
                        this.waitTimeBetweenBatchInSeconds, other.waitTimeBetweenBatchInSeconds)
                && java.util.Objects.equals(
                        this.toleranceThresholdPerBatch, other.toleranceThresholdPerBatch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.batchSize == null ? 43 : this.batchSize.hashCode());
        result =
                (result * PRIME)
                        + (this.waitTimeBetweenBatchInSeconds == null
                                ? 43
                                : this.waitTimeBetweenBatchInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.toleranceThresholdPerBatch == null
                                ? 43
                                : this.toleranceThresholdPerBatch.hashCode());
        return result;
    }
}
