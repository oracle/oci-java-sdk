/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiffResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DiffResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("areAllChangesIncluded")
        private Boolean areAllChangesIncluded;

        public Builder areAllChangesIncluded(Boolean areAllChangesIncluded) {
            this.areAllChangesIncluded = areAllChangesIncluded;
            this.__explicitlySet__.add("areAllChangesIncluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeTypeCount")
        private java.util.Map<String, Integer> changeTypeCount;

        public Builder changeTypeCount(java.util.Map<String, Integer> changeTypeCount) {
            this.changeTypeCount = changeTypeCount;
            this.__explicitlySet__.add("changeTypeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commonCommit")
        private String commonCommit;

        public Builder commonCommit(String commonCommit) {
            this.commonCommit = commonCommit;
            this.__explicitlySet__.add("commonCommit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitsAheadCount")
        private Integer commitsAheadCount;

        public Builder commitsAheadCount(Integer commitsAheadCount) {
            this.commitsAheadCount = commitsAheadCount;
            this.__explicitlySet__.add("commitsAheadCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitsBehindCount")
        private Integer commitsBehindCount;

        public Builder commitsBehindCount(Integer commitsBehindCount) {
            this.commitsBehindCount = commitsBehindCount;
            this.__explicitlySet__.add("commitsBehindCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addedLinesCount")
        private Integer addedLinesCount;

        public Builder addedLinesCount(Integer addedLinesCount) {
            this.addedLinesCount = addedLinesCount;
            this.__explicitlySet__.add("addedLinesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deletedLinesCount")
        private Integer deletedLinesCount;

        public Builder deletedLinesCount(Integer deletedLinesCount) {
            this.deletedLinesCount = deletedLinesCount;
            this.__explicitlySet__.add("deletedLinesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changes")
        private java.util.List<DiffResponseEntry> changes;

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

    /**
     * Boolean for whether all changes are included in the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areAllChangesIncluded")
    Boolean areAllChangesIncluded;

    /**
     * Count of each type of change in diff.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeTypeCount")
    java.util.Map<String, Integer> changeTypeCount;

    /**
     * The ID of the common commit between source and target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonCommit")
    String commonCommit;

    /**
     * The number of commits source is ahead of target by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitsAheadCount")
    Integer commitsAheadCount;

    /**
     * The number of commits source is behind target by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitsBehindCount")
    Integer commitsBehindCount;

    /**
     * The number of lines added in whole diff.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addedLinesCount")
    Integer addedLinesCount;

    /**
     * The number of lines deleted in whole diff.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedLinesCount")
    Integer deletedLinesCount;

    /**
     * List of changes in the diff.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changes")
    java.util.List<DiffResponseEntry> changes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
