/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * User comments created by reviewers during the pull request review.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PullRequestComment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PullRequestComment extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "pullRequestId",
        "data",
        "parentId",
        "filePath",
        "commitId",
        "fileType",
        "lineNumber",
        "likes",
        "status",
        "timeCreated",
        "createdBy",
        "timeUpdated",
        "updatedBy",
        "contextStatus",
        "commentContext"
    })
    public PullRequestComment(
            String id,
            String pullRequestId,
            String data,
            String parentId,
            String filePath,
            String commitId,
            FileType fileType,
            Integer lineNumber,
            PullRequestCommentLikeCollection likes,
            Status status,
            java.util.Date timeCreated,
            PrincipalDetails createdBy,
            java.util.Date timeUpdated,
            PrincipalDetails updatedBy,
            ContextStatus contextStatus,
            java.util.List<DiffLineDetails> commentContext) {
        super();
        this.id = id;
        this.pullRequestId = pullRequestId;
        this.data = data;
        this.parentId = parentId;
        this.filePath = filePath;
        this.commitId = commitId;
        this.fileType = fileType;
        this.lineNumber = lineNumber;
        this.likes = likes;
        this.status = status;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
        this.contextStatus = contextStatus;
        this.commentContext = commentContext;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID of the pull request that this comment belongs to
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pullRequestId")
        private String pullRequestId;

        /**
         * OCID of the pull request that this comment belongs to
         * @param pullRequestId the value to set
         * @return this builder
         **/
        public Builder pullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            this.__explicitlySet__.add("pullRequestId");
            return this;
        }
        /**
         * Content of the Comment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private String data;

        /**
         * Content of the Comment.
         * @param data the value to set
         * @return this builder
         **/
        public Builder data(String data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /**
         * ID of parent Comment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * ID of parent Comment
         * @param parentId the value to set
         * @return this builder
         **/
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /**
         * File path in the commit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filePath")
        private String filePath;

        /**
         * File path in the commit
         * @param filePath the value to set
         * @return this builder
         **/
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            this.__explicitlySet__.add("filePath");
            return this;
        }
        /**
         * Commit SHA
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        /**
         * Commit SHA
         * @param commitId the value to set
         * @return this builder
         **/
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }
        /**
         * File path in the target commit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileType")
        private FileType fileType;

        /**
         * File path in the target commit
         * @param fileType the value to set
         * @return this builder
         **/
        public Builder fileType(FileType fileType) {
            this.fileType = fileType;
            this.__explicitlySet__.add("fileType");
            return this;
        }
        /**
         * Line number in the file
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
        private Integer lineNumber;

        /**
         * Line number in the file
         * @param lineNumber the value to set
         * @return this builder
         **/
        public Builder lineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            this.__explicitlySet__.add("lineNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("likes")
        private PullRequestCommentLikeCollection likes;

        public Builder likes(PullRequestCommentLikeCollection likes) {
            this.likes = likes;
            this.__explicitlySet__.add("likes");
            return this;
        }
        /**
         * Status of the Comment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of the Comment
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Creation timestamp. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Creation timestamp. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private PrincipalDetails createdBy;

        public Builder createdBy(PrincipalDetails createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * Latest update timestamp. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Latest update timestamp. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private PrincipalDetails updatedBy;

        public Builder updatedBy(PrincipalDetails updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }
        /**
         * Shows the status of an inline comments context
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contextStatus")
        private ContextStatus contextStatus;

        /**
         * Shows the status of an inline comments context
         * @param contextStatus the value to set
         * @return this builder
         **/
        public Builder contextStatus(ContextStatus contextStatus) {
            this.contextStatus = contextStatus;
            this.__explicitlySet__.add("contextStatus");
            return this;
        }
        /**
         * 4 line snippet to be displayed as context for inline comments
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commentContext")
        private java.util.List<DiffLineDetails> commentContext;

        /**
         * 4 line snippet to be displayed as context for inline comments
         * @param commentContext the value to set
         * @return this builder
         **/
        public Builder commentContext(java.util.List<DiffLineDetails> commentContext) {
            this.commentContext = commentContext;
            this.__explicitlySet__.add("commentContext");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PullRequestComment build() {
            PullRequestComment model =
                    new PullRequestComment(
                            this.id,
                            this.pullRequestId,
                            this.data,
                            this.parentId,
                            this.filePath,
                            this.commitId,
                            this.fileType,
                            this.lineNumber,
                            this.likes,
                            this.status,
                            this.timeCreated,
                            this.createdBy,
                            this.timeUpdated,
                            this.updatedBy,
                            this.contextStatus,
                            this.commentContext);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PullRequestComment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("pullRequestId")) {
                this.pullRequestId(model.getPullRequestId());
            }
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
            if (model.wasPropertyExplicitlySet("likes")) {
                this.likes(model.getLikes());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("contextStatus")) {
                this.contextStatus(model.getContextStatus());
            }
            if (model.wasPropertyExplicitlySet("commentContext")) {
                this.commentContext(model.getCommentContext());
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
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID of the pull request that this comment belongs to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pullRequestId")
    private final String pullRequestId;

    /**
     * OCID of the pull request that this comment belongs to
     * @return the value
     **/
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * Content of the Comment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

    /**
     * Content of the Comment.
     * @return the value
     **/
    public String getData() {
        return data;
    }

    /**
     * ID of parent Comment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * ID of parent Comment
     * @return the value
     **/
    public String getParentId() {
        return parentId;
    }

    /**
     * File path in the commit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filePath")
    private final String filePath;

    /**
     * File path in the commit
     * @return the value
     **/
    public String getFilePath() {
        return filePath;
    }

    /**
     * Commit SHA
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

    /**
     * Commit SHA
     * @return the value
     **/
    public String getCommitId() {
        return commitId;
    }

    /**
     * File path in the target commit
     **/
    public enum FileType {
        Source("SOURCE"),
        Destination("DESTINATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FileType.class);

        private final String value;
        private static java.util.Map<String, FileType> map;

        static {
            map = new java.util.HashMap<>();
            for (FileType v : FileType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FileType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FileType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FileType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * File path in the target commit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileType")
    private final FileType fileType;

    /**
     * File path in the target commit
     * @return the value
     **/
    public FileType getFileType() {
        return fileType;
    }

    /**
     * Line number in the file
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
    private final Integer lineNumber;

    /**
     * Line number in the file
     * @return the value
     **/
    public Integer getLineNumber() {
        return lineNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("likes")
    private final PullRequestCommentLikeCollection likes;

    public PullRequestCommentLikeCollection getLikes() {
        return likes;
    }

    /**
     * Status of the Comment
     **/
    public enum Status {
        Active("ACTIVE"),
        Outdated("OUTDATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the Comment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of the Comment
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Creation timestamp. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Creation timestamp. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final PrincipalDetails createdBy;

    public PrincipalDetails getCreatedBy() {
        return createdBy;
    }

    /**
     * Latest update timestamp. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Latest update timestamp. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final PrincipalDetails updatedBy;

    public PrincipalDetails getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Shows the status of an inline comments context
     **/
    public enum ContextStatus {
        Processed("PROCESSED"),
        NeedsProcessing("NEEDS_PROCESSING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ContextStatus.class);

        private final String value;
        private static java.util.Map<String, ContextStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ContextStatus v : ContextStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ContextStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContextStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ContextStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Shows the status of an inline comments context
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contextStatus")
    private final ContextStatus contextStatus;

    /**
     * Shows the status of an inline comments context
     * @return the value
     **/
    public ContextStatus getContextStatus() {
        return contextStatus;
    }

    /**
     * 4 line snippet to be displayed as context for inline comments
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commentContext")
    private final java.util.List<DiffLineDetails> commentContext;

    /**
     * 4 line snippet to be displayed as context for inline comments
     * @return the value
     **/
    public java.util.List<DiffLineDetails> getCommentContext() {
        return commentContext;
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
        sb.append("PullRequestComment(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", pullRequestId=").append(String.valueOf(this.pullRequestId));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", filePath=").append(String.valueOf(this.filePath));
        sb.append(", commitId=").append(String.valueOf(this.commitId));
        sb.append(", fileType=").append(String.valueOf(this.fileType));
        sb.append(", lineNumber=").append(String.valueOf(this.lineNumber));
        sb.append(", likes=").append(String.valueOf(this.likes));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", contextStatus=").append(String.valueOf(this.contextStatus));
        sb.append(", commentContext=").append(String.valueOf(this.commentContext));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PullRequestComment)) {
            return false;
        }

        PullRequestComment other = (PullRequestComment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.pullRequestId, other.pullRequestId)
                && java.util.Objects.equals(this.data, other.data)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(this.commitId, other.commitId)
                && java.util.Objects.equals(this.fileType, other.fileType)
                && java.util.Objects.equals(this.lineNumber, other.lineNumber)
                && java.util.Objects.equals(this.likes, other.likes)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.contextStatus, other.contextStatus)
                && java.util.Objects.equals(this.commentContext, other.commentContext)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestId == null ? 43 : this.pullRequestId.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        result = (result * PRIME) + (this.fileType == null ? 43 : this.fileType.hashCode());
        result = (result * PRIME) + (this.lineNumber == null ? 43 : this.lineNumber.hashCode());
        result = (result * PRIME) + (this.likes == null ? 43 : this.likes.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.contextStatus == null ? 43 : this.contextStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.commentContext == null ? 43 : this.commentContext.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
