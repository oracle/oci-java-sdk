/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The information about new Pull Request. <br>
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
        builder = CreatePullRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePullRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "sourceBranch",
        "destinationBranch",
        "repositoryId",
        "sourceRepositoryId",
        "description",
        "reviewers",
        "freeformTags",
        "definedTags"
    })
    public CreatePullRequestDetails(
            String displayName,
            String sourceBranch,
            String destinationBranch,
            String repositoryId,
            String sourceRepositoryId,
            String description,
            java.util.List<CreateReviewerDetails> reviewers,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.sourceBranch = sourceBranch;
        this.destinationBranch = destinationBranch;
        this.repositoryId = repositoryId;
        this.sourceRepositoryId = sourceRepositoryId;
        this.description = description;
        this.reviewers = reviewers;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Pull Request title */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Pull Request title
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The source branch of the pull request. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceBranch")
        private String sourceBranch;

        /**
         * The source branch of the pull request.
         *
         * @param sourceBranch the value to set
         * @return this builder
         */
        public Builder sourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            this.__explicitlySet__.add("sourceBranch");
            return this;
        }
        /**
         * The destination branch of the pull request. If not provided, default branch will be used
         * as the destination branch.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBranch")
        private String destinationBranch;

        /**
         * The destination branch of the pull request. If not provided, default branch will be used
         * as the destination branch.
         *
         * @param destinationBranch the value to set
         * @return this builder
         */
        public Builder destinationBranch(String destinationBranch) {
            this.destinationBranch = destinationBranch;
            this.__explicitlySet__.add("destinationBranch");
            return this;
        }
        /** The OCID of the repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        /**
         * The OCID of the repository.
         *
         * @param repositoryId the value to set
         * @return this builder
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }
        /**
         * The OCID of the forked repository that will act as the source of the changes to be
         * included in the pull request against the parent repository.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRepositoryId")
        private String sourceRepositoryId;

        /**
         * The OCID of the forked repository that will act as the source of the changes to be
         * included in the pull request against the parent repository.
         *
         * @param sourceRepositoryId the value to set
         * @return this builder
         */
        public Builder sourceRepositoryId(String sourceRepositoryId) {
            this.sourceRepositoryId = sourceRepositoryId;
            this.__explicitlySet__.add("sourceRepositoryId");
            return this;
        }
        /** Details of the pull request. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details of the pull request. Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Reviewers for this pull request. */
        @com.fasterxml.jackson.annotation.JsonProperty("reviewers")
        private java.util.List<CreateReviewerDetails> reviewers;

        /**
         * Reviewers for this pull request.
         *
         * @param reviewers the value to set
         * @return this builder
         */
        public Builder reviewers(java.util.List<CreateReviewerDetails> reviewers) {
            this.reviewers = reviewers;
            this.__explicitlySet__.add("reviewers");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePullRequestDetails build() {
            CreatePullRequestDetails model =
                    new CreatePullRequestDetails(
                            this.displayName,
                            this.sourceBranch,
                            this.destinationBranch,
                            this.repositoryId,
                            this.sourceRepositoryId,
                            this.description,
                            this.reviewers,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePullRequestDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sourceBranch")) {
                this.sourceBranch(model.getSourceBranch());
            }
            if (model.wasPropertyExplicitlySet("destinationBranch")) {
                this.destinationBranch(model.getDestinationBranch());
            }
            if (model.wasPropertyExplicitlySet("repositoryId")) {
                this.repositoryId(model.getRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("sourceRepositoryId")) {
                this.sourceRepositoryId(model.getSourceRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("reviewers")) {
                this.reviewers(model.getReviewers());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** Pull Request title */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Pull Request title
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The source branch of the pull request. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBranch")
    private final String sourceBranch;

    /**
     * The source branch of the pull request.
     *
     * @return the value
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    /**
     * The destination branch of the pull request. If not provided, default branch will be used as
     * the destination branch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBranch")
    private final String destinationBranch;

    /**
     * The destination branch of the pull request. If not provided, default branch will be used as
     * the destination branch.
     *
     * @return the value
     */
    public String getDestinationBranch() {
        return destinationBranch;
    }

    /** The OCID of the repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    /**
     * The OCID of the repository.
     *
     * @return the value
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * The OCID of the forked repository that will act as the source of the changes to be included
     * in the pull request against the parent repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRepositoryId")
    private final String sourceRepositoryId;

    /**
     * The OCID of the forked repository that will act as the source of the changes to be included
     * in the pull request against the parent repository.
     *
     * @return the value
     */
    public String getSourceRepositoryId() {
        return sourceRepositoryId;
    }

    /** Details of the pull request. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details of the pull request. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Reviewers for this pull request. */
    @com.fasterxml.jackson.annotation.JsonProperty("reviewers")
    private final java.util.List<CreateReviewerDetails> reviewers;

    /**
     * Reviewers for this pull request.
     *
     * @return the value
     */
    public java.util.List<CreateReviewerDetails> getReviewers() {
        return reviewers;
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
        sb.append("CreatePullRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", sourceBranch=").append(String.valueOf(this.sourceBranch));
        sb.append(", destinationBranch=").append(String.valueOf(this.destinationBranch));
        sb.append(", repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(", sourceRepositoryId=").append(String.valueOf(this.sourceRepositoryId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", reviewers=").append(String.valueOf(this.reviewers));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePullRequestDetails)) {
            return false;
        }

        CreatePullRequestDetails other = (CreatePullRequestDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sourceBranch, other.sourceBranch)
                && java.util.Objects.equals(this.destinationBranch, other.destinationBranch)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.sourceRepositoryId, other.sourceRepositoryId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.reviewers, other.reviewers)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sourceBranch == null ? 43 : this.sourceBranch.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBranch == null ? 43 : this.destinationBranch.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceRepositoryId == null
                                ? 43
                                : this.sourceRepositoryId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.reviewers == null ? 43 : this.reviewers.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
