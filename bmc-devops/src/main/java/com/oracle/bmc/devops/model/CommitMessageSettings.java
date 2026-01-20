/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Settings for controlling how commit summaries are appended to the commit message when merging a
 * pull request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CommitMessageSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CommitMessageSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"commitSummariesCount"})
    public CommitMessageSettings(Integer commitSummariesCount) {
        super();
        this.commitSummariesCount = commitSummariesCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of commit summaries to append. Set to 0 to exclude commit summaries. */
        @com.fasterxml.jackson.annotation.JsonProperty("commitSummariesCount")
        private Integer commitSummariesCount;

        /**
         * The number of commit summaries to append. Set to 0 to exclude commit summaries.
         *
         * @param commitSummariesCount the value to set
         * @return this builder
         */
        public Builder commitSummariesCount(Integer commitSummariesCount) {
            this.commitSummariesCount = commitSummariesCount;
            this.__explicitlySet__.add("commitSummariesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitMessageSettings build() {
            CommitMessageSettings model = new CommitMessageSettings(this.commitSummariesCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitMessageSettings model) {
            if (model.wasPropertyExplicitlySet("commitSummariesCount")) {
                this.commitSummariesCount(model.getCommitSummariesCount());
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

    /** The number of commit summaries to append. Set to 0 to exclude commit summaries. */
    @com.fasterxml.jackson.annotation.JsonProperty("commitSummariesCount")
    private final Integer commitSummariesCount;

    /**
     * The number of commit summaries to append. Set to 0 to exclude commit summaries.
     *
     * @return the value
     */
    public Integer getCommitSummariesCount() {
        return commitSummariesCount;
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
        sb.append("CommitMessageSettings(");
        sb.append("super=").append(super.toString());
        sb.append("commitSummariesCount=").append(String.valueOf(this.commitSummariesCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitMessageSettings)) {
            return false;
        }

        CommitMessageSettings other = (CommitMessageSettings) o;
        return java.util.Objects.equals(this.commitSummariesCount, other.commitSummariesCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.commitSummariesCount == null
                                ? 43
                                : this.commitSummariesCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
