/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Response object for obtaining summary metric of Pull Request changed files. <br>
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
        builder = PullRequestChangeSummaryMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PullRequestChangeSummaryMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"changedFilesCount", "addedLinesCount", "deletedLinesCount"})
    public PullRequestChangeSummaryMetrics(
            Integer changedFilesCount, Integer addedLinesCount, Integer deletedLinesCount) {
        super();
        this.changedFilesCount = changedFilesCount;
        this.addedLinesCount = addedLinesCount;
        this.deletedLinesCount = deletedLinesCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of lines added in whole difference. */
        @com.fasterxml.jackson.annotation.JsonProperty("changedFilesCount")
        private Integer changedFilesCount;

        /**
         * The number of lines added in whole difference.
         *
         * @param changedFilesCount the value to set
         * @return this builder
         */
        public Builder changedFilesCount(Integer changedFilesCount) {
            this.changedFilesCount = changedFilesCount;
            this.__explicitlySet__.add("changedFilesCount");
            return this;
        }
        /** The number of lines added in whole difference. */
        @com.fasterxml.jackson.annotation.JsonProperty("addedLinesCount")
        private Integer addedLinesCount;

        /**
         * The number of lines added in whole difference.
         *
         * @param addedLinesCount the value to set
         * @return this builder
         */
        public Builder addedLinesCount(Integer addedLinesCount) {
            this.addedLinesCount = addedLinesCount;
            this.__explicitlySet__.add("addedLinesCount");
            return this;
        }
        /** The number of lines deleted in whole difference. */
        @com.fasterxml.jackson.annotation.JsonProperty("deletedLinesCount")
        private Integer deletedLinesCount;

        /**
         * The number of lines deleted in whole difference.
         *
         * @param deletedLinesCount the value to set
         * @return this builder
         */
        public Builder deletedLinesCount(Integer deletedLinesCount) {
            this.deletedLinesCount = deletedLinesCount;
            this.__explicitlySet__.add("deletedLinesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PullRequestChangeSummaryMetrics build() {
            PullRequestChangeSummaryMetrics model =
                    new PullRequestChangeSummaryMetrics(
                            this.changedFilesCount, this.addedLinesCount, this.deletedLinesCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PullRequestChangeSummaryMetrics model) {
            if (model.wasPropertyExplicitlySet("changedFilesCount")) {
                this.changedFilesCount(model.getChangedFilesCount());
            }
            if (model.wasPropertyExplicitlySet("addedLinesCount")) {
                this.addedLinesCount(model.getAddedLinesCount());
            }
            if (model.wasPropertyExplicitlySet("deletedLinesCount")) {
                this.deletedLinesCount(model.getDeletedLinesCount());
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

    /** The number of lines added in whole difference. */
    @com.fasterxml.jackson.annotation.JsonProperty("changedFilesCount")
    private final Integer changedFilesCount;

    /**
     * The number of lines added in whole difference.
     *
     * @return the value
     */
    public Integer getChangedFilesCount() {
        return changedFilesCount;
    }

    /** The number of lines added in whole difference. */
    @com.fasterxml.jackson.annotation.JsonProperty("addedLinesCount")
    private final Integer addedLinesCount;

    /**
     * The number of lines added in whole difference.
     *
     * @return the value
     */
    public Integer getAddedLinesCount() {
        return addedLinesCount;
    }

    /** The number of lines deleted in whole difference. */
    @com.fasterxml.jackson.annotation.JsonProperty("deletedLinesCount")
    private final Integer deletedLinesCount;

    /**
     * The number of lines deleted in whole difference.
     *
     * @return the value
     */
    public Integer getDeletedLinesCount() {
        return deletedLinesCount;
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
        sb.append("PullRequestChangeSummaryMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("changedFilesCount=").append(String.valueOf(this.changedFilesCount));
        sb.append(", addedLinesCount=").append(String.valueOf(this.addedLinesCount));
        sb.append(", deletedLinesCount=").append(String.valueOf(this.deletedLinesCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PullRequestChangeSummaryMetrics)) {
            return false;
        }

        PullRequestChangeSummaryMetrics other = (PullRequestChangeSummaryMetrics) o;
        return java.util.Objects.equals(this.changedFilesCount, other.changedFilesCount)
                && java.util.Objects.equals(this.addedLinesCount, other.addedLinesCount)
                && java.util.Objects.equals(this.deletedLinesCount, other.deletedLinesCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.changedFilesCount == null ? 43 : this.changedFilesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.addedLinesCount == null ? 43 : this.addedLinesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.deletedLinesCount == null ? 43 : this.deletedLinesCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
