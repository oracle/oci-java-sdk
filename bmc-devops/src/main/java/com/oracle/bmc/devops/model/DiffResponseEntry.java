/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Entry for description of change on a file.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DiffResponseEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DiffResponseEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("changeType")
        private String changeType;

        public Builder changeType(String changeType) {
            this.changeType = changeType;
            this.__explicitlySet__.add("changeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oldPath")
        private String oldPath;

        public Builder oldPath(String oldPath) {
            this.oldPath = oldPath;
            this.__explicitlySet__.add("oldPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newPath")
        private String newPath;

        public Builder newPath(String newPath) {
            this.newPath = newPath;
            this.__explicitlySet__.add("newPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oldId")
        private String oldId;

        public Builder oldId(String oldId) {
            this.oldId = oldId;
            this.__explicitlySet__.add("oldId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newId")
        private String newId;

        public Builder newId(String newId) {
            this.newId = newId;
            this.__explicitlySet__.add("newId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
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

        @com.fasterxml.jackson.annotation.JsonProperty("areConflictsInFile")
        private Boolean areConflictsInFile;

        public Builder areConflictsInFile(Boolean areConflictsInFile) {
            this.areConflictsInFile = areConflictsInFile;
            this.__explicitlySet__.add("areConflictsInFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiffResponseEntry build() {
            DiffResponseEntry __instance__ =
                    new DiffResponseEntry(
                            changeType,
                            objectType,
                            commitId,
                            oldPath,
                            newPath,
                            oldId,
                            newId,
                            url,
                            addedLinesCount,
                            deletedLinesCount,
                            areConflictsInFile);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiffResponseEntry o) {
            Builder copiedBuilder =
                    changeType(o.getChangeType())
                            .objectType(o.getObjectType())
                            .commitId(o.getCommitId())
                            .oldPath(o.getOldPath())
                            .newPath(o.getNewPath())
                            .oldId(o.getOldId())
                            .newId(o.getNewId())
                            .url(o.getUrl())
                            .addedLinesCount(o.getAddedLinesCount())
                            .deletedLinesCount(o.getDeletedLinesCount())
                            .areConflictsInFile(o.getAreConflictsInFile());

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
     * Type of change made to file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeType")
    String changeType;

    /**
     * The type of the changed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    String objectType;

    /**
     * The ID of the commit where the change is coming from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    String commitId;

    /**
     * The path on the target to the changed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oldPath")
    String oldPath;

    /**
     * The path on the source to the changed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newPath")
    String newPath;

    /**
     * The ID of the changed object on the target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oldId")
    String oldId;

    /**
     * The ID of the changed object on the source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newId")
    String newId;

    /**
     * The URL of the changed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    String url;

    /**
     * The number of lines added in whole difference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addedLinesCount")
    Integer addedLinesCount;

    /**
     * The number of lines deleted in whole difference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedLinesCount")
    Integer deletedLinesCount;

    /**
     * Indicates whether the changed file contains conflicts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areConflictsInFile")
    Boolean areConflictsInFile;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
