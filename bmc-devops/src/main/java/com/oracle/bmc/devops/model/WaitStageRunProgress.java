/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies Wait stage specific run details. <br>
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
        builder = WaitStageRunProgress.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "buildPipelineStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WaitStageRunProgress extends BuildPipelineStageRunProgress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stageDisplayName")
        private String stageDisplayName;

        public Builder stageDisplayName(String stageDisplayName) {
            this.stageDisplayName = stageDisplayName;
            this.__explicitlySet__.add("stageDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStageId")
        private String buildPipelineStageId;

        public Builder buildPipelineStageId(String buildPipelineStageId) {
            this.buildPipelineStageId = buildPipelineStageId;
            this.__explicitlySet__.add("buildPipelineStageId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStagePredecessors")
        private BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors;

        public Builder buildPipelineStagePredecessors(
                BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors) {
            this.buildPipelineStagePredecessors = buildPipelineStagePredecessors;
            this.__explicitlySet__.add("buildPipelineStagePredecessors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WaitStageRunProgress build() {
            WaitStageRunProgress model =
                    new WaitStageRunProgress(
                            this.stageDisplayName,
                            this.buildPipelineStageId,
                            this.timeStarted,
                            this.timeFinished,
                            this.status,
                            this.buildPipelineStagePredecessors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WaitStageRunProgress model) {
            if (model.wasPropertyExplicitlySet("stageDisplayName")) {
                this.stageDisplayName(model.getStageDisplayName());
            }
            if (model.wasPropertyExplicitlySet("buildPipelineStageId")) {
                this.buildPipelineStageId(model.getBuildPipelineStageId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("buildPipelineStagePredecessors")) {
                this.buildPipelineStagePredecessors(model.getBuildPipelineStagePredecessors());
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
    public WaitStageRunProgress(
            String stageDisplayName,
            String buildPipelineStageId,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Status status,
            BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors) {
        super(
                stageDisplayName,
                buildPipelineStageId,
                timeStarted,
                timeFinished,
                status,
                buildPipelineStagePredecessors);
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
        sb.append("WaitStageRunProgress(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaitStageRunProgress)) {
            return false;
        }

        WaitStageRunProgress other = (WaitStageRunProgress) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
