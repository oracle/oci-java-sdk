/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * activity describing reviewer updates to a pull request <br>
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
        builder = ReviewerActivitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "activityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReviewerActivitySummary extends PullRequestActivitySummary {
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
        /** list of reviewers added to a pull request */
        @com.fasterxml.jackson.annotation.JsonProperty("reviewersAdded")
        private java.util.List<PrincipalDetails> reviewersAdded;

        /**
         * list of reviewers added to a pull request
         *
         * @param reviewersAdded the value to set
         * @return this builder
         */
        public Builder reviewersAdded(java.util.List<PrincipalDetails> reviewersAdded) {
            this.reviewersAdded = reviewersAdded;
            this.__explicitlySet__.add("reviewersAdded");
            return this;
        }
        /** list of reviewers removed from a pull request */
        @com.fasterxml.jackson.annotation.JsonProperty("reviewersRemoved")
        private java.util.List<PrincipalDetails> reviewersRemoved;

        /**
         * list of reviewers removed from a pull request
         *
         * @param reviewersRemoved the value to set
         * @return this builder
         */
        public Builder reviewersRemoved(java.util.List<PrincipalDetails> reviewersRemoved) {
            this.reviewersRemoved = reviewersRemoved;
            this.__explicitlySet__.add("reviewersRemoved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReviewerActivitySummary build() {
            ReviewerActivitySummary model =
                    new ReviewerActivitySummary(
                            this.id,
                            this.principal,
                            this.pullRequestId,
                            this.timeOccurred,
                            this.reviewersAdded,
                            this.reviewersRemoved);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReviewerActivitySummary model) {
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
            if (model.wasPropertyExplicitlySet("reviewersAdded")) {
                this.reviewersAdded(model.getReviewersAdded());
            }
            if (model.wasPropertyExplicitlySet("reviewersRemoved")) {
                this.reviewersRemoved(model.getReviewersRemoved());
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

    @Deprecated
    public ReviewerActivitySummary(
            String id,
            PrincipalDetails principal,
            String pullRequestId,
            java.util.Date timeOccurred,
            java.util.List<PrincipalDetails> reviewersAdded,
            java.util.List<PrincipalDetails> reviewersRemoved) {
        super(id, principal, pullRequestId, timeOccurred);
        this.reviewersAdded = reviewersAdded;
        this.reviewersRemoved = reviewersRemoved;
    }

    /** list of reviewers added to a pull request */
    @com.fasterxml.jackson.annotation.JsonProperty("reviewersAdded")
    private final java.util.List<PrincipalDetails> reviewersAdded;

    /**
     * list of reviewers added to a pull request
     *
     * @return the value
     */
    public java.util.List<PrincipalDetails> getReviewersAdded() {
        return reviewersAdded;
    }

    /** list of reviewers removed from a pull request */
    @com.fasterxml.jackson.annotation.JsonProperty("reviewersRemoved")
    private final java.util.List<PrincipalDetails> reviewersRemoved;

    /**
     * list of reviewers removed from a pull request
     *
     * @return the value
     */
    public java.util.List<PrincipalDetails> getReviewersRemoved() {
        return reviewersRemoved;
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
        sb.append("ReviewerActivitySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", reviewersAdded=").append(String.valueOf(this.reviewersAdded));
        sb.append(", reviewersRemoved=").append(String.valueOf(this.reviewersRemoved));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReviewerActivitySummary)) {
            return false;
        }

        ReviewerActivitySummary other = (ReviewerActivitySummary) o;
        return java.util.Objects.equals(this.reviewersAdded, other.reviewersAdded)
                && java.util.Objects.equals(this.reviewersRemoved, other.reviewersRemoved)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.reviewersAdded == null ? 43 : this.reviewersAdded.hashCode());
        result =
                (result * PRIME)
                        + (this.reviewersRemoved == null ? 43 : this.reviewersRemoved.hashCode());
        return result;
    }
}
