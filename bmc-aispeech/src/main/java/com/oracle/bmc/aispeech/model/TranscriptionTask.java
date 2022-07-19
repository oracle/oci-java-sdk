/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Description of Transcription Task.
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
    builder = TranscriptionTask.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TranscriptionTask {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "timeStarted",
        "timeFinished",
        "percentComplete",
        "ttlInDays",
        "modelDetails",
        "audioFormatDetails",
        "fileSizeInBytes",
        "fileDurationInSeconds",
        "inputLocation",
        "outputLocation",
        "lifecycleState",
        "lifecycleDetails"
    })
    public TranscriptionTask(
            String id,
            String displayName,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Integer percentComplete,
            Integer ttlInDays,
            TranscriptionModelDetails modelDetails,
            AudioFormatDetails audioFormatDetails,
            Integer fileSizeInBytes,
            Integer fileDurationInSeconds,
            ObjectLocation inputLocation,
            ObjectLocation outputLocation,
            LifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.percentComplete = percentComplete;
        this.ttlInDays = ttlInDays;
        this.modelDetails = modelDetails;
        this.audioFormatDetails = audioFormatDetails;
        this.fileSizeInBytes = fileSizeInBytes;
        this.fileDurationInSeconds = fileDurationInSeconds;
        this.inputLocation = inputLocation;
        this.outputLocation = outputLocation;
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
         * Task started time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Task started time.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Task finished time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * Task finished time.
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
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
         * Time to live duration in days for tasks. Task will be available till max 90 days.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ttlInDays")
        private Integer ttlInDays;

        /**
         * Time to live duration in days for tasks. Task will be available till max 90 days.
         * @param ttlInDays the value to set
         * @return this builder
         **/
        public Builder ttlInDays(Integer ttlInDays) {
            this.ttlInDays = ttlInDays;
            this.__explicitlySet__.add("ttlInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
        private TranscriptionModelDetails modelDetails;

        public Builder modelDetails(TranscriptionModelDetails modelDetails) {
            this.modelDetails = modelDetails;
            this.__explicitlySet__.add("modelDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("audioFormatDetails")
        private AudioFormatDetails audioFormatDetails;

        public Builder audioFormatDetails(AudioFormatDetails audioFormatDetails) {
            this.audioFormatDetails = audioFormatDetails;
            this.__explicitlySet__.add("audioFormatDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
        private ObjectLocation inputLocation;

        public Builder inputLocation(ObjectLocation inputLocation) {
            this.inputLocation = inputLocation;
            this.__explicitlySet__.add("inputLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
        private ObjectLocation outputLocation;

        public Builder outputLocation(ObjectLocation outputLocation) {
            this.outputLocation = outputLocation;
            this.__explicitlySet__.add("outputLocation");
            return this;
        }
        /**
         * The current state of the Task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Task.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
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

        public TranscriptionTask build() {
            TranscriptionTask __instance__ =
                    new TranscriptionTask(
                            id,
                            displayName,
                            timeStarted,
                            timeFinished,
                            percentComplete,
                            ttlInDays,
                            modelDetails,
                            audioFormatDetails,
                            fileSizeInBytes,
                            fileDurationInSeconds,
                            inputLocation,
                            outputLocation,
                            lifecycleState,
                            lifecycleDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TranscriptionTask o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .percentComplete(o.getPercentComplete())
                            .ttlInDays(o.getTtlInDays())
                            .modelDetails(o.getModelDetails())
                            .audioFormatDetails(o.getAudioFormatDetails())
                            .fileSizeInBytes(o.getFileSizeInBytes())
                            .fileDurationInSeconds(o.getFileDurationInSeconds())
                            .inputLocation(o.getInputLocation())
                            .outputLocation(o.getOutputLocation())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails());

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
     * Task started time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Task started time.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Task finished time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * Task finished time.
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
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
     * Time to live duration in days for tasks. Task will be available till max 90 days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttlInDays")
    private final Integer ttlInDays;

    /**
     * Time to live duration in days for tasks. Task will be available till max 90 days.
     * @return the value
     **/
    public Integer getTtlInDays() {
        return ttlInDays;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
    private final TranscriptionModelDetails modelDetails;

    public TranscriptionModelDetails getModelDetails() {
        return modelDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("audioFormatDetails")
    private final AudioFormatDetails audioFormatDetails;

    public AudioFormatDetails getAudioFormatDetails() {
        return audioFormatDetails;
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

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    private final ObjectLocation inputLocation;

    public ObjectLocation getInputLocation() {
        return inputLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final ObjectLocation outputLocation;

    public ObjectLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * The current state of the Task.
     **/
    public enum LifecycleState {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the Task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Task.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
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
        sb.append("TranscriptionTask(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", ttlInDays=").append(String.valueOf(this.ttlInDays));
        sb.append(", modelDetails=").append(String.valueOf(this.modelDetails));
        sb.append(", audioFormatDetails=").append(String.valueOf(this.audioFormatDetails));
        sb.append(", fileSizeInBytes=").append(String.valueOf(this.fileSizeInBytes));
        sb.append(", fileDurationInSeconds=").append(String.valueOf(this.fileDurationInSeconds));
        sb.append(", inputLocation=").append(String.valueOf(this.inputLocation));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TranscriptionTask)) {
            return false;
        }

        TranscriptionTask other = (TranscriptionTask) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.ttlInDays, other.ttlInDays)
                && java.util.Objects.equals(this.modelDetails, other.modelDetails)
                && java.util.Objects.equals(this.audioFormatDetails, other.audioFormatDetails)
                && java.util.Objects.equals(this.fileSizeInBytes, other.fileSizeInBytes)
                && java.util.Objects.equals(this.fileDurationInSeconds, other.fileDurationInSeconds)
                && java.util.Objects.equals(this.inputLocation, other.inputLocation)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.ttlInDays == null ? 43 : this.ttlInDays.hashCode());
        result = (result * PRIME) + (this.modelDetails == null ? 43 : this.modelDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.audioFormatDetails == null
                                ? 43
                                : this.audioFormatDetails.hashCode());
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
                        + (this.inputLocation == null ? 43 : this.inputLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.outputLocation == null ? 43 : this.outputLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
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
