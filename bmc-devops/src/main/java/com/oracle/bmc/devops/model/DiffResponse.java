/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Response object for obtaining list of changed files.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiffResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiffResponse {
    @Deprecated
    @java.beans.ConstructorProperties({
        "areAllChangesIncluded",
        "changeTypeCount",
        "commonCommit",
        "commitsAheadCount",
        "commitsBehindCount",
        "addedLinesCount",
        "deletedLinesCount",
        "changes"
    })
    public DiffResponse(
            Boolean areAllChangesIncluded,
            java.util.Map<String, Integer> changeTypeCount,
            String commonCommit,
            Integer commitsAheadCount,
            Integer commitsBehindCount,
            Integer addedLinesCount,
            Integer deletedLinesCount,
            java.util.List<DiffResponseEntry> changes) {
        super();
        this.areAllChangesIncluded = areAllChangesIncluded;
        this.changeTypeCount = changeTypeCount;
        this.commonCommit = commonCommit;
        this.commitsAheadCount = commitsAheadCount;
        this.commitsBehindCount = commitsBehindCount;
        this.addedLinesCount = addedLinesCount;
        this.deletedLinesCount = deletedLinesCount;
        this.changes = changes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Boolean value to indicate if all changes are included in the response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areAllChangesIncluded")
        private Boolean areAllChangesIncluded;

        /**
         * Boolean value to indicate if all changes are included in the response.
         * @param areAllChangesIncluded the value to set
         * @return this builder
         **/
        public Builder areAllChangesIncluded(Boolean areAllChangesIncluded) {
            this.areAllChangesIncluded = areAllChangesIncluded;
            this.__explicitlySet__.add("areAllChangesIncluded");
            return this;
        }
        /**
         * Count of each type of change in difference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("changeTypeCount")
        private java.util.Map<String, Integer> changeTypeCount;

        /**
         * Count of each type of change in difference.
         * @param changeTypeCount the value to set
         * @return this builder
         **/
        public Builder changeTypeCount(java.util.Map<String, Integer> changeTypeCount) {
            this.changeTypeCount = changeTypeCount;
            this.__explicitlySet__.add("changeTypeCount");
            return this;
        }
        /**
         * The ID of the common commit between source and target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commonCommit")
        private String commonCommit;

        /**
         * The ID of the common commit between source and target.
         * @param commonCommit the value to set
         * @return this builder
         **/
        public Builder commonCommit(String commonCommit) {
            this.commonCommit = commonCommit;
            this.__explicitlySet__.add("commonCommit");
            return this;
        }
        /**
         * The number of commits source is ahead of target by.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitsAheadCount")
        private Integer commitsAheadCount;

        /**
         * The number of commits source is ahead of target by.
         * @param commitsAheadCount the value to set
         * @return this builder
         **/
        public Builder commitsAheadCount(Integer commitsAheadCount) {
            this.commitsAheadCount = commitsAheadCount;
            this.__explicitlySet__.add("commitsAheadCount");
            return this;
        }
        /**
         * The number of commits source is behind target by.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitsBehindCount")
        private Integer commitsBehindCount;

        /**
         * The number of commits source is behind target by.
         * @param commitsBehindCount the value to set
         * @return this builder
         **/
        public Builder commitsBehindCount(Integer commitsBehindCount) {
            this.commitsBehindCount = commitsBehindCount;
            this.__explicitlySet__.add("commitsBehindCount");
            return this;
        }
        /**
         * The number of lines added in whole difference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addedLinesCount")
        private Integer addedLinesCount;

        /**
         * The number of lines added in whole difference.
         * @param addedLinesCount the value to set
         * @return this builder
         **/
        public Builder addedLinesCount(Integer addedLinesCount) {
            this.addedLinesCount = addedLinesCount;
            this.__explicitlySet__.add("addedLinesCount");
            return this;
        }
        /**
         * The number of lines deleted in whole difference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deletedLinesCount")
        private Integer deletedLinesCount;

        /**
         * The number of lines deleted in whole difference.
         * @param deletedLinesCount the value to set
         * @return this builder
         **/
        public Builder deletedLinesCount(Integer deletedLinesCount) {
            this.deletedLinesCount = deletedLinesCount;
            this.__explicitlySet__.add("deletedLinesCount");
            return this;
        }
        /**
         * List of changes in the difference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("changes")
        private java.util.List<DiffResponseEntry> changes;

        /**
         * List of changes in the difference.
         * @param changes the value to set
         * @return this builder
         **/
        public Builder changes(java.util.List<DiffResponseEntry> changes) {
            this.changes = changes;
            this.__explicitlySet__.add("changes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiffResponse build() {
            DiffResponse __instance__ =
                    new DiffResponse(
                            areAllChangesIncluded,
                            changeTypeCount,
                            commonCommit,
                            commitsAheadCount,
                            commitsBehindCount,
                            addedLinesCount,
                            deletedLinesCount,
                            changes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiffResponse o) {
            Builder copiedBuilder =
                    areAllChangesIncluded(o.getAreAllChangesIncluded())
                            .changeTypeCount(o.getChangeTypeCount())
                            .commonCommit(o.getCommonCommit())
                            .commitsAheadCount(o.getCommitsAheadCount())
                            .commitsBehindCount(o.getCommitsBehindCount())
                            .addedLinesCount(o.getAddedLinesCount())
                            .deletedLinesCount(o.getDeletedLinesCount())
                            .changes(o.getChanges());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Boolean value to indicate if all changes are included in the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areAllChangesIncluded")
    private final Boolean areAllChangesIncluded;

    /**
     * Boolean value to indicate if all changes are included in the response.
     * @return the value
     **/
    public Boolean getAreAllChangesIncluded() {
        return areAllChangesIncluded;
    }

    /**
     * Count of each type of change in difference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeTypeCount")
    private final java.util.Map<String, Integer> changeTypeCount;

    /**
     * Count of each type of change in difference.
     * @return the value
     **/
    public java.util.Map<String, Integer> getChangeTypeCount() {
        return changeTypeCount;
    }

    /**
     * The ID of the common commit between source and target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonCommit")
    private final String commonCommit;

    /**
     * The ID of the common commit between source and target.
     * @return the value
     **/
    public String getCommonCommit() {
        return commonCommit;
    }

    /**
     * The number of commits source is ahead of target by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitsAheadCount")
    private final Integer commitsAheadCount;

    /**
     * The number of commits source is ahead of target by.
     * @return the value
     **/
    public Integer getCommitsAheadCount() {
        return commitsAheadCount;
    }

    /**
     * The number of commits source is behind target by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitsBehindCount")
    private final Integer commitsBehindCount;

    /**
     * The number of commits source is behind target by.
     * @return the value
     **/
    public Integer getCommitsBehindCount() {
        return commitsBehindCount;
    }

    /**
     * The number of lines added in whole difference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addedLinesCount")
    private final Integer addedLinesCount;

    /**
     * The number of lines added in whole difference.
     * @return the value
     **/
    public Integer getAddedLinesCount() {
        return addedLinesCount;
    }

    /**
     * The number of lines deleted in whole difference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedLinesCount")
    private final Integer deletedLinesCount;

    /**
     * The number of lines deleted in whole difference.
     * @return the value
     **/
    public Integer getDeletedLinesCount() {
        return deletedLinesCount;
    }

    /**
     * List of changes in the difference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changes")
    private final java.util.List<DiffResponseEntry> changes;

    /**
     * List of changes in the difference.
     * @return the value
     **/
    public java.util.List<DiffResponseEntry> getChanges() {
        return changes;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DiffResponse(");
        sb.append("areAllChangesIncluded=").append(String.valueOf(this.areAllChangesIncluded));
        sb.append(", changeTypeCount=").append(String.valueOf(this.changeTypeCount));
        sb.append(", commonCommit=").append(String.valueOf(this.commonCommit));
        sb.append(", commitsAheadCount=").append(String.valueOf(this.commitsAheadCount));
        sb.append(", commitsBehindCount=").append(String.valueOf(this.commitsBehindCount));
        sb.append(", addedLinesCount=").append(String.valueOf(this.addedLinesCount));
        sb.append(", deletedLinesCount=").append(String.valueOf(this.deletedLinesCount));
        sb.append(", changes=").append(String.valueOf(this.changes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiffResponse)) {
            return false;
        }

        DiffResponse other = (DiffResponse) o;
        return java.util.Objects.equals(this.areAllChangesIncluded, other.areAllChangesIncluded)
                && java.util.Objects.equals(this.changeTypeCount, other.changeTypeCount)
                && java.util.Objects.equals(this.commonCommit, other.commonCommit)
                && java.util.Objects.equals(this.commitsAheadCount, other.commitsAheadCount)
                && java.util.Objects.equals(this.commitsBehindCount, other.commitsBehindCount)
                && java.util.Objects.equals(this.addedLinesCount, other.addedLinesCount)
                && java.util.Objects.equals(this.deletedLinesCount, other.deletedLinesCount)
                && java.util.Objects.equals(this.changes, other.changes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.areAllChangesIncluded == null
                                ? 43
                                : this.areAllChangesIncluded.hashCode());
        result =
                (result * PRIME)
                        + (this.changeTypeCount == null ? 43 : this.changeTypeCount.hashCode());
        result = (result * PRIME) + (this.commonCommit == null ? 43 : this.commonCommit.hashCode());
        result =
                (result * PRIME)
                        + (this.commitsAheadCount == null ? 43 : this.commitsAheadCount.hashCode());
        result =
                (result * PRIME)
                        + (this.commitsBehindCount == null
                                ? 43
                                : this.commitsBehindCount.hashCode());
        result =
                (result * PRIME)
                        + (this.addedLinesCount == null ? 43 : this.addedLinesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.deletedLinesCount == null ? 43 : this.deletedLinesCount.hashCode());
        result = (result * PRIME) + (this.changes == null ? 43 : this.changes.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
