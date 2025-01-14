/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Summary of progress for the Exadata Fleet Update Job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobProgress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobProgress extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"progressOfOperation"})
    public JobProgress(Integer progressOfOperation) {
        super();
        this.progressOfOperation = progressOfOperation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Percentage of progress against the total to complete the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("progressOfOperation")
        private Integer progressOfOperation;

        /**
         * Percentage of progress against the total to complete the operation.
         *
         * @param progressOfOperation the value to set
         * @return this builder
         */
        public Builder progressOfOperation(Integer progressOfOperation) {
            this.progressOfOperation = progressOfOperation;
            this.__explicitlySet__.add("progressOfOperation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobProgress build() {
            JobProgress model = new JobProgress(this.progressOfOperation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobProgress model) {
            if (model.wasPropertyExplicitlySet("progressOfOperation")) {
                this.progressOfOperation(model.getProgressOfOperation());
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

    /** Percentage of progress against the total to complete the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("progressOfOperation")
    private final Integer progressOfOperation;

    /**
     * Percentage of progress against the total to complete the operation.
     *
     * @return the value
     */
    public Integer getProgressOfOperation() {
        return progressOfOperation;
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
        sb.append("JobProgress(");
        sb.append("super=").append(super.toString());
        sb.append("progressOfOperation=").append(String.valueOf(this.progressOfOperation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobProgress)) {
            return false;
        }

        JobProgress other = (JobProgress) o;
        return java.util.Objects.equals(this.progressOfOperation, other.progressOfOperation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.progressOfOperation == null
                                ? 43
                                : this.progressOfOperation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
