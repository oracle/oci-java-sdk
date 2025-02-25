/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Response object for showing differences for a file between two commits.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FileDiffResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FileDiffResponse extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "oldPath",
        "newPath",
        "oldId",
        "newId",
        "areConflictsInFile",
        "isLarge",
        "isBinary",
        "changes"
    })
    public FileDiffResponse(
            String oldPath,
            String newPath,
            String oldId,
            String newId,
            Boolean areConflictsInFile,
            Boolean isLarge,
            Boolean isBinary,
            java.util.List<DiffChunk> changes) {
        super();
        this.oldPath = oldPath;
        this.newPath = newPath;
        this.oldId = oldId;
        this.newId = newId;
        this.areConflictsInFile = areConflictsInFile;
        this.isLarge = isLarge;
        this.isBinary = isBinary;
        this.changes = changes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The path on the base version to the changed object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oldPath")
        private String oldPath;

        /**
         * The path on the base version to the changed object.
         * @param oldPath the value to set
         * @return this builder
         **/
        public Builder oldPath(String oldPath) {
            this.oldPath = oldPath;
            this.__explicitlySet__.add("oldPath");
            return this;
        }
        /**
         * The path on the target version to the changed object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("newPath")
        private String newPath;

        /**
         * The path on the target version to the changed object.
         * @param newPath the value to set
         * @return this builder
         **/
        public Builder newPath(String newPath) {
            this.newPath = newPath;
            this.__explicitlySet__.add("newPath");
            return this;
        }
        /**
         * The ID of the changed object on the base version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oldId")
        private String oldId;

        /**
         * The ID of the changed object on the base version.
         * @param oldId the value to set
         * @return this builder
         **/
        public Builder oldId(String oldId) {
            this.oldId = oldId;
            this.__explicitlySet__.add("oldId");
            return this;
        }
        /**
         * The ID of the changed object on the target version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("newId")
        private String newId;

        /**
         * The ID of the changed object on the target version.
         * @param newId the value to set
         * @return this builder
         **/
        public Builder newId(String newId) {
            this.newId = newId;
            this.__explicitlySet__.add("newId");
            return this;
        }
        /**
         * Indicates whether the changed file contains conflicts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areConflictsInFile")
        private Boolean areConflictsInFile;

        /**
         * Indicates whether the changed file contains conflicts.
         * @param areConflictsInFile the value to set
         * @return this builder
         **/
        public Builder areConflictsInFile(Boolean areConflictsInFile) {
            this.areConflictsInFile = areConflictsInFile;
            this.__explicitlySet__.add("areConflictsInFile");
            return this;
        }
        /**
         * Indicates whether the file is large.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLarge")
        private Boolean isLarge;

        /**
         * Indicates whether the file is large.
         * @param isLarge the value to set
         * @return this builder
         **/
        public Builder isLarge(Boolean isLarge) {
            this.isLarge = isLarge;
            this.__explicitlySet__.add("isLarge");
            return this;
        }
        /**
         * Indicates whether the file is binary.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBinary")
        private Boolean isBinary;

        /**
         * Indicates whether the file is binary.
         * @param isBinary the value to set
         * @return this builder
         **/
        public Builder isBinary(Boolean isBinary) {
            this.isBinary = isBinary;
            this.__explicitlySet__.add("isBinary");
            return this;
        }
        /**
         * List of changed section in the file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("changes")
        private java.util.List<DiffChunk> changes;

        /**
         * List of changed section in the file.
         * @param changes the value to set
         * @return this builder
         **/
        public Builder changes(java.util.List<DiffChunk> changes) {
            this.changes = changes;
            this.__explicitlySet__.add("changes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileDiffResponse build() {
            FileDiffResponse model =
                    new FileDiffResponse(
                            this.oldPath,
                            this.newPath,
                            this.oldId,
                            this.newId,
                            this.areConflictsInFile,
                            this.isLarge,
                            this.isBinary,
                            this.changes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileDiffResponse model) {
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
            if (model.wasPropertyExplicitlySet("areConflictsInFile")) {
                this.areConflictsInFile(model.getAreConflictsInFile());
            }
            if (model.wasPropertyExplicitlySet("isLarge")) {
                this.isLarge(model.getIsLarge());
            }
            if (model.wasPropertyExplicitlySet("isBinary")) {
                this.isBinary(model.getIsBinary());
            }
            if (model.wasPropertyExplicitlySet("changes")) {
                this.changes(model.getChanges());
            }
            return this;
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
     * The path on the base version to the changed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oldPath")
    private final String oldPath;

    /**
     * The path on the base version to the changed object.
     * @return the value
     **/
    public String getOldPath() {
        return oldPath;
    }

    /**
     * The path on the target version to the changed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newPath")
    private final String newPath;

    /**
     * The path on the target version to the changed object.
     * @return the value
     **/
    public String getNewPath() {
        return newPath;
    }

    /**
     * The ID of the changed object on the base version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oldId")
    private final String oldId;

    /**
     * The ID of the changed object on the base version.
     * @return the value
     **/
    public String getOldId() {
        return oldId;
    }

    /**
     * The ID of the changed object on the target version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newId")
    private final String newId;

    /**
     * The ID of the changed object on the target version.
     * @return the value
     **/
    public String getNewId() {
        return newId;
    }

    /**
     * Indicates whether the changed file contains conflicts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areConflictsInFile")
    private final Boolean areConflictsInFile;

    /**
     * Indicates whether the changed file contains conflicts.
     * @return the value
     **/
    public Boolean getAreConflictsInFile() {
        return areConflictsInFile;
    }

    /**
     * Indicates whether the file is large.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLarge")
    private final Boolean isLarge;

    /**
     * Indicates whether the file is large.
     * @return the value
     **/
    public Boolean getIsLarge() {
        return isLarge;
    }

    /**
     * Indicates whether the file is binary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBinary")
    private final Boolean isBinary;

    /**
     * Indicates whether the file is binary.
     * @return the value
     **/
    public Boolean getIsBinary() {
        return isBinary;
    }

    /**
     * List of changed section in the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changes")
    private final java.util.List<DiffChunk> changes;

    /**
     * List of changed section in the file.
     * @return the value
     **/
    public java.util.List<DiffChunk> getChanges() {
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
        sb.append("FileDiffResponse(");
        sb.append("super=").append(super.toString());
        sb.append("oldPath=").append(String.valueOf(this.oldPath));
        sb.append(", newPath=").append(String.valueOf(this.newPath));
        sb.append(", oldId=").append(String.valueOf(this.oldId));
        sb.append(", newId=").append(String.valueOf(this.newId));
        sb.append(", areConflictsInFile=").append(String.valueOf(this.areConflictsInFile));
        sb.append(", isLarge=").append(String.valueOf(this.isLarge));
        sb.append(", isBinary=").append(String.valueOf(this.isBinary));
        sb.append(", changes=").append(String.valueOf(this.changes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileDiffResponse)) {
            return false;
        }

        FileDiffResponse other = (FileDiffResponse) o;
        return java.util.Objects.equals(this.oldPath, other.oldPath)
                && java.util.Objects.equals(this.newPath, other.newPath)
                && java.util.Objects.equals(this.oldId, other.oldId)
                && java.util.Objects.equals(this.newId, other.newId)
                && java.util.Objects.equals(this.areConflictsInFile, other.areConflictsInFile)
                && java.util.Objects.equals(this.isLarge, other.isLarge)
                && java.util.Objects.equals(this.isBinary, other.isBinary)
                && java.util.Objects.equals(this.changes, other.changes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.oldPath == null ? 43 : this.oldPath.hashCode());
        result = (result * PRIME) + (this.newPath == null ? 43 : this.newPath.hashCode());
        result = (result * PRIME) + (this.oldId == null ? 43 : this.oldId.hashCode());
        result = (result * PRIME) + (this.newId == null ? 43 : this.newId.hashCode());
        result =
                (result * PRIME)
                        + (this.areConflictsInFile == null
                                ? 43
                                : this.areConflictsInFile.hashCode());
        result = (result * PRIME) + (this.isLarge == null ? 43 : this.isLarge.hashCode());
        result = (result * PRIME) + (this.isBinary == null ? 43 : this.isBinary.hashCode());
        result = (result * PRIME) + (this.changes == null ? 43 : this.changes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
