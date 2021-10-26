/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The details about the run progress of a Stage in a BuildRun.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "buildPipelineStageType",
    defaultImpl = BuildPipelineStageRunProgress.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeliverArtifactStageRunProgress.class,
        name = "DELIVER_ARTIFACT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WaitStageRunProgress.class,
        name = "WAIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TriggerDeploymentPipelineStageRunProgress.class,
        name = "TRIGGER_DEPLOYMENT_PIPELINE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BuildStageRunProgress.class,
        name = "BUILD"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BuildPipelineStageRunProgress {

    /**
     * BuildRun identifier which can be renamed and is not necessarily unique
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stageDisplayName")
    String stageDisplayName;

    /**
     * Stage id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStageId")
    String buildPipelineStageId;

    /**
     * The time the Stage was started executing. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The time the Stage was finished executing. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;
    /**
     * The current status of the Stage.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current status of the Stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStagePredecessors")
    BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors;
}
