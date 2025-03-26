/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * A recommend stage determines the recommended third-party dependencies that the app should use and (if any) opens a pull request to propose these changes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecommendStage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecommendStage extends RemediationRunStage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remediationRunId")
        private String remediationRunId;

        public Builder remediationRunId(String remediationRunId) {
            this.remediationRunId = remediationRunId;
            this.__explicitlySet__.add("remediationRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("previousStageType")
        private RemediationRunStageType previousStageType;

        public Builder previousStageType(RemediationRunStageType previousStageType) {
            this.previousStageType = previousStageType;
            this.__explicitlySet__.add("previousStageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextStageType")
        private RemediationRunStageType nextStageType;

        public Builder nextStageType(RemediationRunStageType nextStageType) {
            this.nextStageType = nextStageType;
            this.__explicitlySet__.add("nextStageType");
            return this;
        }
        /**
         * Count of recommended application dependencies to update.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedUpdatesCount")
        private Integer recommendedUpdatesCount;

        /**
         * Count of recommended application dependencies to update.
         * @param recommendedUpdatesCount the value to set
         * @return this builder
         **/
        public Builder recommendedUpdatesCount(Integer recommendedUpdatesCount) {
            this.recommendedUpdatesCount = recommendedUpdatesCount;
            this.__explicitlySet__.add("recommendedUpdatesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pullRequestProperties")
        private PullRequestProperties pullRequestProperties;

        public Builder pullRequestProperties(PullRequestProperties pullRequestProperties) {
            this.pullRequestProperties = pullRequestProperties;
            this.__explicitlySet__.add("pullRequestProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendStage build() {
            RecommendStage model =
                    new RecommendStage(
                            this.status,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeFinished,
                            this.summary,
                            this.remediationRunId,
                            this.previousStageType,
                            this.nextStageType,
                            this.recommendedUpdatesCount,
                            this.pullRequestProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendStage model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("remediationRunId")) {
                this.remediationRunId(model.getRemediationRunId());
            }
            if (model.wasPropertyExplicitlySet("previousStageType")) {
                this.previousStageType(model.getPreviousStageType());
            }
            if (model.wasPropertyExplicitlySet("nextStageType")) {
                this.nextStageType(model.getNextStageType());
            }
            if (model.wasPropertyExplicitlySet("recommendedUpdatesCount")) {
                this.recommendedUpdatesCount(model.getRecommendedUpdatesCount());
            }
            if (model.wasPropertyExplicitlySet("pullRequestProperties")) {
                this.pullRequestProperties(model.getPullRequestProperties());
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
    public RecommendStage(
            Status status,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String summary,
            String remediationRunId,
            RemediationRunStageType previousStageType,
            RemediationRunStageType nextStageType,
            Integer recommendedUpdatesCount,
            PullRequestProperties pullRequestProperties) {
        super(
                status,
                timeCreated,
                timeStarted,
                timeFinished,
                summary,
                remediationRunId,
                previousStageType,
                nextStageType);
        this.recommendedUpdatesCount = recommendedUpdatesCount;
        this.pullRequestProperties = pullRequestProperties;
    }

    /**
     * Count of recommended application dependencies to update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedUpdatesCount")
    private final Integer recommendedUpdatesCount;

    /**
     * Count of recommended application dependencies to update.
     * @return the value
     **/
    public Integer getRecommendedUpdatesCount() {
        return recommendedUpdatesCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pullRequestProperties")
    private final PullRequestProperties pullRequestProperties;

    public PullRequestProperties getPullRequestProperties() {
        return pullRequestProperties;
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
        sb.append("RecommendStage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", recommendedUpdatesCount=")
                .append(String.valueOf(this.recommendedUpdatesCount));
        sb.append(", pullRequestProperties=").append(String.valueOf(this.pullRequestProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendStage)) {
            return false;
        }

        RecommendStage other = (RecommendStage) o;
        return java.util.Objects.equals(this.recommendedUpdatesCount, other.recommendedUpdatesCount)
                && java.util.Objects.equals(this.pullRequestProperties, other.pullRequestProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.recommendedUpdatesCount == null
                                ? 43
                                : this.recommendedUpdatesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestProperties == null
                                ? 43
                                : this.pullRequestProperties.hashCode());
        return result;
    }
}
