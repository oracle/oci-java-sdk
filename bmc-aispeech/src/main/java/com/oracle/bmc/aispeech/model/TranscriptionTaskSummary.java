/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Summary of the Transcription Task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TranscriptionTaskSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TranscriptionTaskSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "percentComplete",
        "fileSizeInBytes",
        "fileDurationInSeconds",
        "processingDurationInSeconds",
        "timeStarted",
        "timeFinished",
        "lifecycleState",
        "lifecycleDetails"
    })
    public TranscriptionTaskSummary(
            String id,
            String displayName,
            Integer percentComplete,
            Integer fileSizeInBytes,
            Integer fileDurationInSeconds,
            Integer processingDurationInSeconds,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            TranscriptionTask.LifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.percentComplete = percentComplete;
        this.fileSizeInBytes = fileSizeInBytes;
        this.fileDurationInSeconds = fileDurationInSeconds;
        this.processingDurationInSeconds = processingDurationInSeconds;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the task.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly display name for the task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the task.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * How much progress the operation has made, vs the total amount of work that must be performed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        /**
         * How much progress the operation has made, vs the total amount of work that must be performed.
         * @param percentComplete the value to set
         * @return this builder
         **/
        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * Size of input file in Bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSizeInBytes")
        private Integer fileSizeInBytes;

        /**
         * Size of input file in Bytes.
         * @param fileSizeInBytes the value to set
         * @return this builder
         **/
        public Builder fileSizeInBytes(Integer fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            this.__explicitlySet__.add("fileSizeInBytes");
            return this;
        }
        /**
         * Duration of input file in Seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileDurationInSeconds")
        private Integer fileDurationInSeconds;

        /**
         * Duration of input file in Seconds.
         * @param fileDurationInSeconds the value to set
         * @return this builder
         **/
        public Builder fileDurationInSeconds(Integer fileDurationInSeconds) {
            this.fileDurationInSeconds = fileDurationInSeconds;
            this.__explicitlySet__.add("fileDurationInSeconds");
            return this;
        }
        /**
         * Task proccessing duration, which excludes waiting time in the system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("processingDurationInSeconds")
        private Integer processingDurationInSeconds;

        /**
         * Task proccessing duration, which excludes waiting time in the system.
         * @param processingDurationInSeconds the value to set
         * @return this builder
         **/
        public Builder processingDurationInSeconds(Integer processingDurationInSeconds) {
            this.processingDurationInSeconds = processingDurationInSeconds;
            this.__explicitlySet__.add("processingDurationInSeconds");
            return this;
        }
        /**
         * Task started time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Task started time
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Job finished time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * Job finished time
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The current state of the Speech Job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private TranscriptionTask.LifecycleState lifecycleState;

        /**
         * The current state of the Speech Job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(TranscriptionTask.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TranscriptionTaskSummary build() {
            TranscriptionTaskSummary model =
                    new TranscriptionTaskSummary(
                            this.id,
                            this.displayName,
                            this.percentComplete,
                            this.fileSizeInBytes,
                            this.fileDurationInSeconds,
                            this.processingDurationInSeconds,
                            this.timeStarted,
                            this.timeFinished,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TranscriptionTaskSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("fileSizeInBytes")) {
                this.fileSizeInBytes(model.getFileSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("fileDurationInSeconds")) {
                this.fileDurationInSeconds(model.getFileDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("processingDurationInSeconds")) {
                this.processingDurationInSeconds(model.getProcessingDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the task.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly display name for the task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the task.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * How much progress the operation has made, vs the total amount of work that must be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    /**
     * How much progress the operation has made, vs the total amount of work that must be performed.
     * @return the value
     **/
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /**
     * Size of input file in Bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSizeInBytes")
    private final Integer fileSizeInBytes;

    /**
     * Size of input file in Bytes.
     * @return the value
     **/
    public Integer getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    /**
     * Duration of input file in Seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileDurationInSeconds")
    private final Integer fileDurationInSeconds;

    /**
     * Duration of input file in Seconds.
     * @return the value
     **/
    public Integer getFileDurationInSeconds() {
        return fileDurationInSeconds;
    }

    /**
     * Task proccessing duration, which excludes waiting time in the system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processingDurationInSeconds")
    private final Integer processingDurationInSeconds;

    /**
     * Task proccessing duration, which excludes waiting time in the system.
     * @return the value
     **/
    public Integer getProcessingDurationInSeconds() {
        return processingDurationInSeconds;
    }

    /**
     * Task started time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Task started time
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Job finished time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * Job finished time
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The current state of the Speech Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final TranscriptionTask.LifecycleState lifecycleState;

    /**
     * The current state of the Speech Job.
     * @return the value
     **/
    public TranscriptionTask.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("TranscriptionTaskSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", fileSizeInBytes=").append(String.valueOf(this.fileSizeInBytes));
        sb.append(", fileDurationInSeconds=").append(String.valueOf(this.fileDurationInSeconds));
        sb.append(", processingDurationInSeconds=")
                .append(String.valueOf(this.processingDurationInSeconds));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TranscriptionTaskSummary)) {
            return false;
        }

        TranscriptionTaskSummary other = (TranscriptionTaskSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.fileSizeInBytes, other.fileSizeInBytes)
                && java.util.Objects.equals(this.fileDurationInSeconds, other.fileDurationInSeconds)
                && java.util.Objects.equals(
                        this.processingDurationInSeconds, other.processingDurationInSeconds)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSizeInBytes == null ? 43 : this.fileSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.fileDurationInSeconds == null
                                ? 43
                                : this.fileDurationInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.processingDurationInSeconds == null
                                ? 43
                                : this.processingDurationInSeconds.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
