/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * activity describing comment addition to a pull request
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
    builder = CommentActivitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "activityType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CommentActivitySummary extends PullRequestActivitySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("principal")
        private PrincipalDetails principal;

        public Builder principal(PrincipalDetails principal) {
            this.principal = principal;
            this.__explicitlySet__.add("principal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pullRequestId")
        private String pullRequestId;

        public Builder pullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            this.__explicitlySet__.add("pullRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOccurred")
        private java.util.Date timeOccurred;

        public Builder timeOccurred(java.util.Date timeOccurred) {
            this.timeOccurred = timeOccurred;
            this.__explicitlySet__.add("timeOccurred");
            return this;
        }
        /**
         * Identifier of comment added to a PR
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commentId")
        private String commentId;

        /**
         * Identifier of comment added to a PR
         * @param commentId the value to set
         * @return this builder
         **/
        public Builder commentId(String commentId) {
            this.commentId = commentId;
            this.__explicitlySet__.add("commentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommentActivitySummary build() {
            CommentActivitySummary model =
                    new CommentActivitySummary(
                            this.id,
                            this.principal,
                            this.pullRequestId,
                            this.timeOccurred,
                            this.commentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommentActivitySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("principal")) {
                this.principal(model.getPrincipal());
            }
            if (model.wasPropertyExplicitlySet("pullRequestId")) {
                this.pullRequestId(model.getPullRequestId());
            }
            if (model.wasPropertyExplicitlySet("timeOccurred")) {
                this.timeOccurred(model.getTimeOccurred());
            }
            if (model.wasPropertyExplicitlySet("commentId")) {
                this.commentId(model.getCommentId());
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

    @Deprecated
    public CommentActivitySummary(
            String id,
            PrincipalDetails principal,
            String pullRequestId,
            java.util.Date timeOccurred,
            String commentId) {
        super(id, principal, pullRequestId, timeOccurred);
        this.commentId = commentId;
    }

    /**
     * Identifier of comment added to a PR
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commentId")
    private final String commentId;

    /**
     * Identifier of comment added to a PR
     * @return the value
     **/
    public String getCommentId() {
        return commentId;
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
        sb.append("CommentActivitySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", commentId=").append(String.valueOf(this.commentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommentActivitySummary)) {
            return false;
        }

        CommentActivitySummary other = (CommentActivitySummary) o;
        return java.util.Objects.equals(this.commentId, other.commentId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.commentId == null ? 43 : this.commentId.hashCode());
        return result;
    }
}
