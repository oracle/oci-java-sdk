/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The information about new Comment. <br>
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
        builder = CreatePullRequestCommentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePullRequestCommentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "data",
        "parentId",
        "filePath",
        "commitId",
        "fileType",
        "lineNumber"
    })
    public CreatePullRequestCommentDetails(
            String data,
            String parentId,
            String filePath,
            String commitId,
            PullRequestComment.FileType fileType,
            Integer lineNumber) {
        super();
        this.data = data;
        this.parentId = parentId;
        this.filePath = filePath;
        this.commitId = commitId;
        this.fileType = fileType;
        this.lineNumber = lineNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Content of the Comment. */
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private String data;

        /**
         * Content of the Comment.
         *
         * @param data the value to set
         * @return this builder
         */
        public Builder data(String data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /** ID of parent Comment */
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * ID of parent Comment
         *
         * @param parentId the value to set
         * @return this builder
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /** File path in the commit */
        @com.fasterxml.jackson.annotation.JsonProperty("filePath")
        private String filePath;

        /**
         * File path in the commit
         *
         * @param filePath the value to set
         * @return this builder
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            this.__explicitlySet__.add("filePath");
            return this;
        }
        /** Commit SHA */
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        /**
         * Commit SHA
         *
         * @param commitId the value to set
         * @return this builder
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }
        /** File path in the target commit */
        @com.fasterxml.jackson.annotation.JsonProperty("fileType")
        private PullRequestComment.FileType fileType;

        /**
         * File path in the target commit
         *
         * @param fileType the value to set
         * @return this builder
         */
        public Builder fileType(PullRequestComment.FileType fileType) {
            this.fileType = fileType;
            this.__explicitlySet__.add("fileType");
            return this;
        }
        /** Line number in the file */
        @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
        private Integer lineNumber;

        /**
         * Line number in the file
         *
         * @param lineNumber the value to set
         * @return this builder
         */
        public Builder lineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            this.__explicitlySet__.add("lineNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePullRequestCommentDetails build() {
            CreatePullRequestCommentDetails model =
                    new CreatePullRequestCommentDetails(
                            this.data,
                            this.parentId,
                            this.filePath,
                            this.commitId,
                            this.fileType,
                            this.lineNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePullRequestCommentDetails model) {
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("filePath")) {
                this.filePath(model.getFilePath());
            }
            if (model.wasPropertyExplicitlySet("commitId")) {
                this.commitId(model.getCommitId());
            }
            if (model.wasPropertyExplicitlySet("fileType")) {
                this.fileType(model.getFileType());
            }
            if (model.wasPropertyExplicitlySet("lineNumber")) {
                this.lineNumber(model.getLineNumber());
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

    /** Content of the Comment. */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

    /**
     * Content of the Comment.
     *
     * @return the value
     */
    public String getData() {
        return data;
    }

    /** ID of parent Comment */
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * ID of parent Comment
     *
     * @return the value
     */
    public String getParentId() {
        return parentId;
    }

    /** File path in the commit */
    @com.fasterxml.jackson.annotation.JsonProperty("filePath")
    private final String filePath;

    /**
     * File path in the commit
     *
     * @return the value
     */
    public String getFilePath() {
        return filePath;
    }

    /** Commit SHA */
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

    /**
     * Commit SHA
     *
     * @return the value
     */
    public String getCommitId() {
        return commitId;
    }

    /** File path in the target commit */
    @com.fasterxml.jackson.annotation.JsonProperty("fileType")
    private final PullRequestComment.FileType fileType;

    /**
     * File path in the target commit
     *
     * @return the value
     */
    public PullRequestComment.FileType getFileType() {
        return fileType;
    }

    /** Line number in the file */
    @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
    private final Integer lineNumber;

    /**
     * Line number in the file
     *
     * @return the value
     */
    public Integer getLineNumber() {
        return lineNumber;
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
        sb.append("CreatePullRequestCommentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("data=").append(String.valueOf(this.data));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", filePath=").append(String.valueOf(this.filePath));
        sb.append(", commitId=").append(String.valueOf(this.commitId));
        sb.append(", fileType=").append(String.valueOf(this.fileType));
        sb.append(", lineNumber=").append(String.valueOf(this.lineNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePullRequestCommentDetails)) {
            return false;
        }

        CreatePullRequestCommentDetails other = (CreatePullRequestCommentDetails) o;
        return java.util.Objects.equals(this.data, other.data)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(this.commitId, other.commitId)
                && java.util.Objects.equals(this.fileType, other.fileType)
                && java.util.Objects.equals(this.lineNumber, other.lineNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        result = (result * PRIME) + (this.fileType == null ? 43 : this.fileType.hashCode());
        result = (result * PRIME) + (this.lineNumber == null ? 43 : this.lineNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
