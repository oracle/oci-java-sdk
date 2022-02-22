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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TranscriptionTask.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TranscriptionTask {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttlInDays")
        private Integer ttlInDays;

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

        @com.fasterxml.jackson.annotation.JsonProperty("fileSizeInBytes")
        private Integer fileSizeInBytes;

        public Builder fileSizeInBytes(Integer fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            this.__explicitlySet__.add("fileSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileDurationInSeconds")
        private Integer fileDurationInSeconds;

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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

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

    /**
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Task name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Task started time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * Task finished time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    /**
     * How much progress the operation has made, vs the total amount of work that must be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    Integer percentComplete;

    /**
     * Time to live duration in days for tasks. Task will be available till max 90 days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttlInDays")
    Integer ttlInDays;

    @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
    TranscriptionModelDetails modelDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("audioFormatDetails")
    AudioFormatDetails audioFormatDetails;

    /**
     * Size of input file in Bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSizeInBytes")
    Integer fileSizeInBytes;

    /**
     * Duration of input file in Seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileDurationInSeconds")
    Integer fileDurationInSeconds;

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    ObjectLocation inputLocation;

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    ObjectLocation outputLocation;
    /**
     * The current state of the Task.
     **/
    @lombok.extern.slf4j.Slf4j
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
    LifecycleState lifecycleState;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
