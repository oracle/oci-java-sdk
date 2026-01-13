/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Summary of the Pull Request. <br>
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
        builder = PullRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PullRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "description",
        "repositoryId",
        "sourceRepositoryId",
        "sourceBranch",
        "destinationBranch",
        "sourceCommitIdAtTermination",
        "mergeBaseCommitIdAtTermination",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "totalComments",
        "totalReviewers",
        "createdBy",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public PullRequestSummary(
            String id,
            String displayName,
            String compartmentId,
            String description,
            String repositoryId,
            String sourceRepositoryId,
            String sourceBranch,
            String destinationBranch,
            String sourceCommitIdAtTermination,
            String mergeBaseCommitIdAtTermination,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            PullRequest.LifecycleState lifecycleState,
            PullRequest.LifecycleDetails lifecycleDetails,
            Integer totalComments,
            Integer totalReviewers,
            PrincipalDetails createdBy,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.repositoryId = repositoryId;
        this.sourceRepositoryId = sourceRepositoryId;
        this.sourceBranch = sourceBranch;
        this.destinationBranch = destinationBranch;
        this.sourceCommitIdAtTermination = sourceCommitIdAtTermination;
        this.mergeBaseCommitIdAtTermination = mergeBaseCommitIdAtTermination;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.totalComments = totalComments;
        this.totalReviewers = totalReviewers;
        this.createdBy = createdBy;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Pull Request title, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Pull Request title, can be renamed
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        /** DevOps Repository Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        /**
         * DevOps Repository Identifier
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
        /** The review branch which contains the changes to be reviewed. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceBranch")
        private String sourceBranch;

        /**
         * The review branch which contains the changes to be reviewed.
         *
         * @param sourceBranch the value to set
         * @return this builder
         */
        public Builder sourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            this.__explicitlySet__.add("sourceBranch");
            return this;
        }
        /** The destination branch against which the changes are to be reviewed. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBranch")
        private String destinationBranch;

        /**
         * The destination branch against which the changes are to be reviewed.
         *
         * @param destinationBranch the value to set
         * @return this builder
         */
        public Builder destinationBranch(String destinationBranch) {
            this.destinationBranch = destinationBranch;
            this.__explicitlySet__.add("destinationBranch");
            return this;
        }
        /**
         * The source branch commit ID when the Pull Request status was last changed to merged or
         * closed
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceCommitIdAtTermination")
        private String sourceCommitIdAtTermination;

        /**
         * The source branch commit ID when the Pull Request status was last changed to merged or
         * closed
         *
         * @param sourceCommitIdAtTermination the value to set
         * @return this builder
         */
        public Builder sourceCommitIdAtTermination(String sourceCommitIdAtTermination) {
            this.sourceCommitIdAtTermination = sourceCommitIdAtTermination;
            this.__explicitlySet__.add("sourceCommitIdAtTermination");
            return this;
        }
        /**
         * The merge base commit ID when the Pull Request status was last changed to merged or
         * closed
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mergeBaseCommitIdAtTermination")
        private String mergeBaseCommitIdAtTermination;

        /**
         * The merge base commit ID when the Pull Request status was last changed to merged or
         * closed
         *
         * @param mergeBaseCommitIdAtTermination the value to set
         * @return this builder
         */
        public Builder mergeBaseCommitIdAtTermination(String mergeBaseCommitIdAtTermination) {
            this.mergeBaseCommitIdAtTermination = mergeBaseCommitIdAtTermination;
            this.__explicitlySet__.add("mergeBaseCommitIdAtTermination");
            return this;
        }
        /** The time the the Pull Request was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the Pull Request was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the Pull Request was updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Pull Request was updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Pull Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private PullRequest.LifecycleState lifecycleState;

        /**
         * The current state of the Pull Request.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(PullRequest.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The status of the Pull Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private PullRequest.LifecycleDetails lifecycleDetails;

        /**
         * The status of the Pull Request.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(PullRequest.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The total number of comments on the pull request. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalComments")
        private Integer totalComments;

        /**
         * The total number of comments on the pull request.
         *
         * @param totalComments the value to set
         * @return this builder
         */
        public Builder totalComments(Integer totalComments) {
            this.totalComments = totalComments;
            this.__explicitlySet__.add("totalComments");
            return this;
        }
        /** The total number of reviewers on the pull request. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalReviewers")
        private Integer totalReviewers;

        /**
         * The total number of reviewers on the pull request.
         *
         * @param totalReviewers the value to set
         * @return this builder
         */
        public Builder totalReviewers(Integer totalReviewers) {
            this.totalReviewers = totalReviewers;
            this.__explicitlySet__.add("totalReviewers");
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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

        public PullRequestSummary build() {
            PullRequestSummary model =
                    new PullRequestSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.repositoryId,
                            this.sourceRepositoryId,
                            this.sourceBranch,
                            this.destinationBranch,
                            this.sourceCommitIdAtTermination,
                            this.mergeBaseCommitIdAtTermination,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.totalComments,
                            this.totalReviewers,
                            this.createdBy,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PullRequestSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("repositoryId")) {
                this.repositoryId(model.getRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("sourceRepositoryId")) {
                this.sourceRepositoryId(model.getSourceRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("sourceBranch")) {
                this.sourceBranch(model.getSourceBranch());
            }
            if (model.wasPropertyExplicitlySet("destinationBranch")) {
                this.destinationBranch(model.getDestinationBranch());
            }
            if (model.wasPropertyExplicitlySet("sourceCommitIdAtTermination")) {
                this.sourceCommitIdAtTermination(model.getSourceCommitIdAtTermination());
            }
            if (model.wasPropertyExplicitlySet("mergeBaseCommitIdAtTermination")) {
                this.mergeBaseCommitIdAtTermination(model.getMergeBaseCommitIdAtTermination());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("totalComments")) {
                this.totalComments(model.getTotalComments());
            }
            if (model.wasPropertyExplicitlySet("totalReviewers")) {
                this.totalReviewers(model.getTotalReviewers());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
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

    /** Unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Pull Request title, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Pull Request title, can be renamed
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /** DevOps Repository Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    /**
     * DevOps Repository Identifier
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

    /** The review branch which contains the changes to be reviewed. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBranch")
    private final String sourceBranch;

    /**
     * The review branch which contains the changes to be reviewed.
     *
     * @return the value
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    /** The destination branch against which the changes are to be reviewed. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBranch")
    private final String destinationBranch;

    /**
     * The destination branch against which the changes are to be reviewed.
     *
     * @return the value
     */
    public String getDestinationBranch() {
        return destinationBranch;
    }

    /**
     * The source branch commit ID when the Pull Request status was last changed to merged or closed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceCommitIdAtTermination")
    private final String sourceCommitIdAtTermination;

    /**
     * The source branch commit ID when the Pull Request status was last changed to merged or closed
     *
     * @return the value
     */
    public String getSourceCommitIdAtTermination() {
        return sourceCommitIdAtTermination;
    }

    /**
     * The merge base commit ID when the Pull Request status was last changed to merged or closed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mergeBaseCommitIdAtTermination")
    private final String mergeBaseCommitIdAtTermination;

    /**
     * The merge base commit ID when the Pull Request status was last changed to merged or closed
     *
     * @return the value
     */
    public String getMergeBaseCommitIdAtTermination() {
        return mergeBaseCommitIdAtTermination;
    }

    /** The time the the Pull Request was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Pull Request was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Pull Request was updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Pull Request was updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Pull Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final PullRequest.LifecycleState lifecycleState;

    /**
     * The current state of the Pull Request.
     *
     * @return the value
     */
    public PullRequest.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The status of the Pull Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final PullRequest.LifecycleDetails lifecycleDetails;

    /**
     * The status of the Pull Request.
     *
     * @return the value
     */
    public PullRequest.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The total number of comments on the pull request. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalComments")
    private final Integer totalComments;

    /**
     * The total number of comments on the pull request.
     *
     * @return the value
     */
    public Integer getTotalComments() {
        return totalComments;
    }

    /** The total number of reviewers on the pull request. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalReviewers")
    private final Integer totalReviewers;

    /**
     * The total number of reviewers on the pull request.
     *
     * @return the value
     */
    public Integer getTotalReviewers() {
        return totalReviewers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final PrincipalDetails createdBy;

    public PrincipalDetails getCreatedBy() {
        return createdBy;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
        sb.append("PullRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(", sourceRepositoryId=").append(String.valueOf(this.sourceRepositoryId));
        sb.append(", sourceBranch=").append(String.valueOf(this.sourceBranch));
        sb.append(", destinationBranch=").append(String.valueOf(this.destinationBranch));
        sb.append(", sourceCommitIdAtTermination=")
                .append(String.valueOf(this.sourceCommitIdAtTermination));
        sb.append(", mergeBaseCommitIdAtTermination=")
                .append(String.valueOf(this.mergeBaseCommitIdAtTermination));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", totalComments=").append(String.valueOf(this.totalComments));
        sb.append(", totalReviewers=").append(String.valueOf(this.totalReviewers));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
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
        if (!(o instanceof PullRequestSummary)) {
            return false;
        }

        PullRequestSummary other = (PullRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.sourceRepositoryId, other.sourceRepositoryId)
                && java.util.Objects.equals(this.sourceBranch, other.sourceBranch)
                && java.util.Objects.equals(this.destinationBranch, other.destinationBranch)
                && java.util.Objects.equals(
                        this.sourceCommitIdAtTermination, other.sourceCommitIdAtTermination)
                && java.util.Objects.equals(
                        this.mergeBaseCommitIdAtTermination, other.mergeBaseCommitIdAtTermination)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.totalComments, other.totalComments)
                && java.util.Objects.equals(this.totalReviewers, other.totalReviewers)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceRepositoryId == null
                                ? 43
                                : this.sourceRepositoryId.hashCode());
        result = (result * PRIME) + (this.sourceBranch == null ? 43 : this.sourceBranch.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBranch == null ? 43 : this.destinationBranch.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceCommitIdAtTermination == null
                                ? 43
                                : this.sourceCommitIdAtTermination.hashCode());
        result =
                (result * PRIME)
                        + (this.mergeBaseCommitIdAtTermination == null
                                ? 43
                                : this.mergeBaseCommitIdAtTermination.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.totalComments == null ? 43 : this.totalComments.hashCode());
        result =
                (result * PRIME)
                        + (this.totalReviewers == null ? 43 : this.totalReviewers.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
