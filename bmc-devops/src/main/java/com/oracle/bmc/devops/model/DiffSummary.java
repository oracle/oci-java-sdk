/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Response object for showing differences for a file between two revisions.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiffSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DiffSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("areConflictsInFile")
        private Boolean areConflictsInFile;

        public Builder areConflictsInFile(Boolean areConflictsInFile) {
            this.areConflictsInFile = areConflictsInFile;
            this.__explicitlySet__.add("areConflictsInFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLarge")
        private Boolean isLarge;

        public Builder isLarge(Boolean isLarge) {
            this.isLarge = isLarge;
            this.__explicitlySet__.add("isLarge");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBinary")
        private Boolean isBinary;

        public Builder isBinary(Boolean isBinary) {
            this.isBinary = isBinary;
            this.__explicitlySet__.add("isBinary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changes")
        private java.util.List<DiffChunk> changes;

        public Builder changes(java.util.List<DiffChunk> changes) {
            this.changes = changes;
            this.__explicitlySet__.add("changes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiffSummary build() {
            DiffSummary __instance__ =
                    new DiffSummary(
                            oldPath,
                            newPath,
                            oldId,
                            newId,
                            areConflictsInFile,
                            isLarge,
                            isBinary,
                            changes,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiffSummary o) {
            Builder copiedBuilder =
                    oldPath(o.getOldPath())
                            .newPath(o.getNewPath())
                            .oldId(o.getOldId())
                            .newId(o.getNewId())
                            .areConflictsInFile(o.getAreConflictsInFile())
                            .isLarge(o.getIsLarge())
                            .isBinary(o.getIsBinary())
                            .changes(o.getChanges())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The path on the base version to the changed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oldPath")
    String oldPath;

    /**
     * The path on the target version to the changed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newPath")
    String newPath;

    /**
     * The ID of the changed object on the base version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oldId")
    String oldId;

    /**
     * The ID of the changed object on the target version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newId")
    String newId;

    /**
     * Indicates whether the changed file contains conflicts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areConflictsInFile")
    Boolean areConflictsInFile;

    /**
     * Indicates whether the file is large.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLarge")
    Boolean isLarge;

    /**
     * Indicates whether the file is binary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBinary")
    Boolean isBinary;

    /**
     * List of changed section in the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changes")
    java.util.List<DiffChunk> changes;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
