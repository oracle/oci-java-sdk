/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Entry for description of change on a file. <br>
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
        builder = PullRequestFileChangeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PullRequestFileChangeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "changeType",
        "objectType",
        "commitId",
        "oldPath",
        "newPath",
        "oldId",
        "newId",
        "addedLinesCount",
        "deletedLinesCount",
        "hasConflicts",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public PullRequestFileChangeSummary(
            String changeType,
            String objectType,
            String commitId,
            String oldPath,
            String newPath,
            String oldId,
            String newId,
            Integer addedLinesCount,
            Integer deletedLinesCount,
            Boolean hasConflicts,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.changeType = changeType;
        this.objectType = objectType;
        this.commitId = commitId;
        this.oldPath = oldPath;
        this.newPath = newPath;
        this.oldId = oldId;
        this.newId = newId;
        this.addedLinesCount = addedLinesCount;
        this.deletedLinesCount = deletedLinesCount;
        this.hasConflicts = hasConflicts;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of change made to file. */
        @com.fasterxml.jackson.annotation.JsonProperty("changeType")
        private String changeType;

        /**
         * Type of change made to file.
         *
         * @param changeType the value to set
         * @return this builder
         */
        public Builder changeType(String changeType) {
            this.changeType = changeType;
            this.__explicitlySet__.add("changeType");
            return this;
        }
        /** The type of the changed object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        /**
         * The type of the changed object.
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** The ID of the commit where the change is coming from. */
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        /**
         * The ID of the commit where the change is coming from.
         *
         * @param commitId the value to set
         * @return this builder
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }
        /** The path on the target to the changed object. */
        @com.fasterxml.jackson.annotation.JsonProperty("oldPath")
        private String oldPath;

        /**
         * The path on the target to the changed object.
         *
         * @param oldPath the value to set
         * @return this builder
         */
        public Builder oldPath(String oldPath) {
            this.oldPath = oldPath;
            this.__explicitlySet__.add("oldPath");
            return this;
        }
        /** The path on the source to the changed object. */
        @com.fasterxml.jackson.annotation.JsonProperty("newPath")
        private String newPath;

        /**
         * The path on the source to the changed object.
         *
         * @param newPath the value to set
         * @return this builder
         */
        public Builder newPath(String newPath) {
            this.newPath = newPath;
            this.__explicitlySet__.add("newPath");
            return this;
        }
        /** The ID of the changed object on the target. */
        @com.fasterxml.jackson.annotation.JsonProperty("oldId")
        private String oldId;

        /**
         * The ID of the changed object on the target.
         *
         * @param oldId the value to set
         * @return this builder
         */
        public Builder oldId(String oldId) {
            this.oldId = oldId;
            this.__explicitlySet__.add("oldId");
            return this;
        }
        /** The ID of the changed object on the source. */
        @com.fasterxml.jackson.annotation.JsonProperty("newId")
        private String newId;

        /**
         * The ID of the changed object on the source.
         *
         * @param newId the value to set
         * @return this builder
         */
        public Builder newId(String newId) {
            this.newId = newId;
            this.__explicitlySet__.add("newId");
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
        /** Indicates whether the changed file contains conflicts. */
        @com.fasterxml.jackson.annotation.JsonProperty("hasConflicts")
        private Boolean hasConflicts;

        /**
         * Indicates whether the changed file contains conflicts.
         *
         * @param hasConflicts the value to set
         * @return this builder
         */
        public Builder hasConflicts(Boolean hasConflicts) {
            this.hasConflicts = hasConflicts;
            this.__explicitlySet__.add("hasConflicts");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PullRequestFileChangeSummary build() {
            PullRequestFileChangeSummary model =
                    new PullRequestFileChangeSummary(
                            this.changeType,
                            this.objectType,
                            this.commitId,
                            this.oldPath,
                            this.newPath,
                            this.oldId,
                            this.newId,
                            this.addedLinesCount,
                            this.deletedLinesCount,
                            this.hasConflicts,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PullRequestFileChangeSummary model) {
            if (model.wasPropertyExplicitlySet("changeType")) {
                this.changeType(model.getChangeType());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("commitId")) {
                this.commitId(model.getCommitId());
            }
            if (model.wasPropertyExplicitlySet("oldPath")) {
                this.oldPath(model.getOldPath());
            }
            if (model.wasPropertyExplicitlySet("newPath")) {
                this.newPath(model.getNewPath());
            }
            if (model.wasPropertyExplicitlySet("oldId")) {
                this.oldId(model.getOldId());
            }
            if (model.wasPropertyExplicitlySet("newId")) {
                this.newId(model.getNewId());
            }
            if (model.wasPropertyExplicitlySet("addedLinesCount")) {
                this.addedLinesCount(model.getAddedLinesCount());
            }
            if (model.wasPropertyExplicitlySet("deletedLinesCount")) {
                this.deletedLinesCount(model.getDeletedLinesCount());
            }
            if (model.wasPropertyExplicitlySet("hasConflicts")) {
                this.hasConflicts(model.getHasConflicts());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Type of change made to file. */
    @com.fasterxml.jackson.annotation.JsonProperty("changeType")
    private final String changeType;

    /**
     * Type of change made to file.
     *
     * @return the value
     */
    public String getChangeType() {
        return changeType;
    }

    /** The type of the changed object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    /**
     * The type of the changed object.
     *
     * @return the value
     */
    public String getObjectType() {
        return objectType;
    }

    /** The ID of the commit where the change is coming from. */
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

    /**
     * The ID of the commit where the change is coming from.
     *
     * @return the value
     */
    public String getCommitId() {
        return commitId;
    }

    /** The path on the target to the changed object. */
    @com.fasterxml.jackson.annotation.JsonProperty("oldPath")
    private final String oldPath;

    /**
     * The path on the target to the changed object.
     *
     * @return the value
     */
    public String getOldPath() {
        return oldPath;
    }

    /** The path on the source to the changed object. */
    @com.fasterxml.jackson.annotation.JsonProperty("newPath")
    private final String newPath;

    /**
     * The path on the source to the changed object.
     *
     * @return the value
     */
    public String getNewPath() {
        return newPath;
    }

    /** The ID of the changed object on the target. */
    @com.fasterxml.jackson.annotation.JsonProperty("oldId")
    private final String oldId;

    /**
     * The ID of the changed object on the target.
     *
     * @return the value
     */
    public String getOldId() {
        return oldId;
    }

    /** The ID of the changed object on the source. */
    @com.fasterxml.jackson.annotation.JsonProperty("newId")
    private final String newId;

    /**
     * The ID of the changed object on the source.
     *
     * @return the value
     */
    public String getNewId() {
        return newId;
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

    /** Indicates whether the changed file contains conflicts. */
    @com.fasterxml.jackson.annotation.JsonProperty("hasConflicts")
    private final Boolean hasConflicts;

    /**
     * Indicates whether the changed file contains conflicts.
     *
     * @return the value
     */
    public Boolean getHasConflicts() {
        return hasConflicts;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("PullRequestFileChangeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("changeType=").append(String.valueOf(this.changeType));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", commitId=").append(String.valueOf(this.commitId));
        sb.append(", oldPath=").append(String.valueOf(this.oldPath));
        sb.append(", newPath=").append(String.valueOf(this.newPath));
        sb.append(", oldId=").append(String.valueOf(this.oldId));
        sb.append(", newId=").append(String.valueOf(this.newId));
        sb.append(", addedLinesCount=").append(String.valueOf(this.addedLinesCount));
        sb.append(", deletedLinesCount=").append(String.valueOf(this.deletedLinesCount));
        sb.append(", hasConflicts=").append(String.valueOf(this.hasConflicts));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PullRequestFileChangeSummary)) {
            return false;
        }

        PullRequestFileChangeSummary other = (PullRequestFileChangeSummary) o;
        return java.util.Objects.equals(this.changeType, other.changeType)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.commitId, other.commitId)
                && java.util.Objects.equals(this.oldPath, other.oldPath)
                && java.util.Objects.equals(this.newPath, other.newPath)
                && java.util.Objects.equals(this.oldId, other.oldId)
                && java.util.Objects.equals(this.newId, other.newId)
                && java.util.Objects.equals(this.addedLinesCount, other.addedLinesCount)
                && java.util.Objects.equals(this.deletedLinesCount, other.deletedLinesCount)
                && java.util.Objects.equals(this.hasConflicts, other.hasConflicts)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.changeType == null ? 43 : this.changeType.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        result = (result * PRIME) + (this.oldPath == null ? 43 : this.oldPath.hashCode());
        result = (result * PRIME) + (this.newPath == null ? 43 : this.newPath.hashCode());
        result = (result * PRIME) + (this.oldId == null ? 43 : this.oldId.hashCode());
        result = (result * PRIME) + (this.newId == null ? 43 : this.newId.hashCode());
        result =
                (result * PRIME)
                        + (this.addedLinesCount == null ? 43 : this.addedLinesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.deletedLinesCount == null ? 43 : this.deletedLinesCount.hashCode());
        result = (result * PRIME) + (this.hasConflicts == null ? 43 : this.hasConflicts.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
