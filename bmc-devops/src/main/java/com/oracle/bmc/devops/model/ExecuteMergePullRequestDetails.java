/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The information about the merge. <br>
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
        builder = ExecuteMergePullRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "actionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecuteMergePullRequestDetails extends MergePullRequestDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The commit message to be shown for this pull request in the destination branch after
         * merge is done.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
        private String commitMessage;

        /**
         * The commit message to be shown for this pull request in the destination branch after
         * merge is done.
         *
         * @param commitMessage the value to set
         * @return this builder
         */
        public Builder commitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            this.__explicitlySet__.add("commitMessage");
            return this;
        }
        /** the strategy of merging. */
        @com.fasterxml.jackson.annotation.JsonProperty("mergeStrategy")
        private MergeStrategy mergeStrategy;

        /**
         * the strategy of merging.
         *
         * @param mergeStrategy the value to set
         * @return this builder
         */
        public Builder mergeStrategy(MergeStrategy mergeStrategy) {
            this.mergeStrategy = mergeStrategy;
            this.__explicitlySet__.add("mergeStrategy");
            return this;
        }
        /** What needs to happen after the merge is done successfully. */
        @com.fasterxml.jackson.annotation.JsonProperty("postMergeAction")
        private PostMergeAction postMergeAction;

        /**
         * What needs to happen after the merge is done successfully.
         *
         * @param postMergeAction the value to set
         * @return this builder
         */
        public Builder postMergeAction(PostMergeAction postMergeAction) {
            this.postMergeAction = postMergeAction;
            this.__explicitlySet__.add("postMergeAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteMergePullRequestDetails build() {
            ExecuteMergePullRequestDetails model =
                    new ExecuteMergePullRequestDetails(
                            this.commitMessage, this.mergeStrategy, this.postMergeAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteMergePullRequestDetails model) {
            if (model.wasPropertyExplicitlySet("commitMessage")) {
                this.commitMessage(model.getCommitMessage());
            }
            if (model.wasPropertyExplicitlySet("mergeStrategy")) {
                this.mergeStrategy(model.getMergeStrategy());
            }
            if (model.wasPropertyExplicitlySet("postMergeAction")) {
                this.postMergeAction(model.getPostMergeAction());
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
    public ExecuteMergePullRequestDetails(
            String commitMessage, MergeStrategy mergeStrategy, PostMergeAction postMergeAction) {
        super();
        this.commitMessage = commitMessage;
        this.mergeStrategy = mergeStrategy;
        this.postMergeAction = postMergeAction;
    }

    /**
     * The commit message to be shown for this pull request in the destination branch after merge is
     * done.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
    private final String commitMessage;

    /**
     * The commit message to be shown for this pull request in the destination branch after merge is
     * done.
     *
     * @return the value
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /** the strategy of merging. */
    @com.fasterxml.jackson.annotation.JsonProperty("mergeStrategy")
    private final MergeStrategy mergeStrategy;

    /**
     * the strategy of merging.
     *
     * @return the value
     */
    public MergeStrategy getMergeStrategy() {
        return mergeStrategy;
    }

    /** What needs to happen after the merge is done successfully. */
    public enum PostMergeAction implements com.oracle.bmc.http.internal.BmcEnum {
        DeleteSourceBranch("DELETE_SOURCE_BRANCH"),
        KeepSourceBranch("KEEP_SOURCE_BRANCH"),
        ;

        private final String value;
        private static java.util.Map<String, PostMergeAction> map;

        static {
            map = new java.util.HashMap<>();
            for (PostMergeAction v : PostMergeAction.values()) {
                map.put(v.getValue(), v);
            }
        }

        PostMergeAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PostMergeAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PostMergeAction: " + key);
        }
    };
    /** What needs to happen after the merge is done successfully. */
    @com.fasterxml.jackson.annotation.JsonProperty("postMergeAction")
    private final PostMergeAction postMergeAction;

    /**
     * What needs to happen after the merge is done successfully.
     *
     * @return the value
     */
    public PostMergeAction getPostMergeAction() {
        return postMergeAction;
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
        sb.append("ExecuteMergePullRequestDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", commitMessage=").append(String.valueOf(this.commitMessage));
        sb.append(", mergeStrategy=").append(String.valueOf(this.mergeStrategy));
        sb.append(", postMergeAction=").append(String.valueOf(this.postMergeAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteMergePullRequestDetails)) {
            return false;
        }

        ExecuteMergePullRequestDetails other = (ExecuteMergePullRequestDetails) o;
        return java.util.Objects.equals(this.commitMessage, other.commitMessage)
                && java.util.Objects.equals(this.mergeStrategy, other.mergeStrategy)
                && java.util.Objects.equals(this.postMergeAction, other.postMergeAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.commitMessage == null ? 43 : this.commitMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.mergeStrategy == null ? 43 : this.mergeStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.postMergeAction == null ? 43 : this.postMergeAction.hashCode());
        return result;
    }
}
