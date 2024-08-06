/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Abstract of Pull Request Comment likes. <br>
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
        builder = PullRequestCommentLikeCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PullRequestCommentLikeCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"users", "totalLikes"})
    public PullRequestCommentLikeCollection(
            java.util.List<PrincipalDetails> users, Integer totalLikes) {
        super();
        this.users = users;
        this.totalLikes = totalLikes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of liked users of whom liked the pull request comment (max size is 50). */
        @com.fasterxml.jackson.annotation.JsonProperty("users")
        private java.util.List<PrincipalDetails> users;

        /**
         * List of liked users of whom liked the pull request comment (max size is 50).
         *
         * @param users the value to set
         * @return this builder
         */
        public Builder users(java.util.List<PrincipalDetails> users) {
            this.users = users;
            this.__explicitlySet__.add("users");
            return this;
        }
        /** Total like counter */
        @com.fasterxml.jackson.annotation.JsonProperty("totalLikes")
        private Integer totalLikes;

        /**
         * Total like counter
         *
         * @param totalLikes the value to set
         * @return this builder
         */
        public Builder totalLikes(Integer totalLikes) {
            this.totalLikes = totalLikes;
            this.__explicitlySet__.add("totalLikes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PullRequestCommentLikeCollection build() {
            PullRequestCommentLikeCollection model =
                    new PullRequestCommentLikeCollection(this.users, this.totalLikes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PullRequestCommentLikeCollection model) {
            if (model.wasPropertyExplicitlySet("users")) {
                this.users(model.getUsers());
            }
            if (model.wasPropertyExplicitlySet("totalLikes")) {
                this.totalLikes(model.getTotalLikes());
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

    /** List of liked users of whom liked the pull request comment (max size is 50). */
    @com.fasterxml.jackson.annotation.JsonProperty("users")
    private final java.util.List<PrincipalDetails> users;

    /**
     * List of liked users of whom liked the pull request comment (max size is 50).
     *
     * @return the value
     */
    public java.util.List<PrincipalDetails> getUsers() {
        return users;
    }

    /** Total like counter */
    @com.fasterxml.jackson.annotation.JsonProperty("totalLikes")
    private final Integer totalLikes;

    /**
     * Total like counter
     *
     * @return the value
     */
    public Integer getTotalLikes() {
        return totalLikes;
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
        sb.append("PullRequestCommentLikeCollection(");
        sb.append("super=").append(super.toString());
        sb.append("users=").append(String.valueOf(this.users));
        sb.append(", totalLikes=").append(String.valueOf(this.totalLikes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PullRequestCommentLikeCollection)) {
            return false;
        }

        PullRequestCommentLikeCollection other = (PullRequestCommentLikeCollection) o;
        return java.util.Objects.equals(this.users, other.users)
                && java.util.Objects.equals(this.totalLikes, other.totalLikes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.users == null ? 43 : this.users.hashCode());
        result = (result * PRIME) + (this.totalLikes == null ? 43 : this.totalLikes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
