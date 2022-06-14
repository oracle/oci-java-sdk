/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The run progress details of a build run.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BuildRunProgress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BuildRunProgress {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeStarted",
        "timeFinished",
        "buildPipelineStageRunProgress"
    })
    public BuildRunProgress(
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            java.util.Map<String, BuildPipelineStageRunProgress> buildPipelineStageRunProgress) {
        super();
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.buildPipelineStageRunProgress = buildPipelineStageRunProgress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time the build run started. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the build run started. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time the build run finished. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The time the build run finished. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * Map of stage OCIDs to build pipeline stage run progress model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStageRunProgress")
        private java.util.Map<String, BuildPipelineStageRunProgress> buildPipelineStageRunProgress;

        /**
         * Map of stage OCIDs to build pipeline stage run progress model.
         * @param buildPipelineStageRunProgress the value to set
         * @return this builder
         **/
        public Builder buildPipelineStageRunProgress(
                java.util.Map<String, BuildPipelineStageRunProgress>
                        buildPipelineStageRunProgress) {
            this.buildPipelineStageRunProgress = buildPipelineStageRunProgress;
            this.__explicitlySet__.add("buildPipelineStageRunProgress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BuildRunProgress build() {
            BuildRunProgress __instance__ =
                    new BuildRunProgress(timeStarted, timeFinished, buildPipelineStageRunProgress);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BuildRunProgress o) {
            Builder copiedBuilder =
                    timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .buildPipelineStageRunProgress(o.getBuildPipelineStageRunProgress());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The time the build run started. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the build run started. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time the build run finished. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time the build run finished. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * Map of stage OCIDs to build pipeline stage run progress model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStageRunProgress")
    private final java.util.Map<String, BuildPipelineStageRunProgress>
            buildPipelineStageRunProgress;

    /**
     * Map of stage OCIDs to build pipeline stage run progress model.
     * @return the value
     **/
    public java.util.Map<String, BuildPipelineStageRunProgress> getBuildPipelineStageRunProgress() {
        return buildPipelineStageRunProgress;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BuildRunProgress(");
        sb.append("timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", buildPipelineStageRunProgress=")
                .append(String.valueOf(this.buildPipelineStageRunProgress));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildRunProgress)) {
            return false;
        }

        BuildRunProgress other = (BuildRunProgress) o;
        return java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(
                        this.buildPipelineStageRunProgress, other.buildPipelineStageRunProgress)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.buildPipelineStageRunProgress == null
                                ? 43
                                : this.buildPipelineStageRunProgress.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
