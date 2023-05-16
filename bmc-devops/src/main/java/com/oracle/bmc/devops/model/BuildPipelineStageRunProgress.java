/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The details about the run progress of a stage in a build run. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "buildPipelineStageType",
        defaultImpl = BuildPipelineStageRunProgress.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DeliverArtifactStageRunProgress.class,
            name = "DELIVER_ARTIFACT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = WaitStageRunProgress.class,
            name = "WAIT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TriggerDeploymentPipelineStageRunProgress.class,
            name = "TRIGGER_DEPLOYMENT_PIPELINE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = BuildStageRunProgress.class,
            name = "BUILD")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class BuildPipelineStageRunProgress
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stageDisplayName",
        "buildPipelineStageId",
        "timeStarted",
        "timeFinished",
        "status",
        "buildPipelineStagePredecessors"
    })
    protected BuildPipelineStageRunProgress(
            String stageDisplayName,
            String buildPipelineStageId,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Status status,
            BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors) {
        super();
        this.stageDisplayName = stageDisplayName;
        this.buildPipelineStageId = buildPipelineStageId;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.status = status;
        this.buildPipelineStagePredecessors = buildPipelineStagePredecessors;
    }

    /**
     * Build Run display name, which can be renamed and is not necessarily unique. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stageDisplayName")
    private final String stageDisplayName;

    /**
     * Build Run display name, which can be renamed and is not necessarily unique. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getStageDisplayName() {
        return stageDisplayName;
    }

    /** The stage OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStageId")
    private final String buildPipelineStageId;

    /**
     * The stage OCID.
     *
     * @return the value
     */
    public String getBuildPipelineStageId() {
        return buildPipelineStageId;
    }

    /**
     * The time the stage started executing. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the stage started executing. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time the stage finished executing. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time the stage finished executing. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** The current status of the stage. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

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
    /** The current status of the stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status of the stage.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStagePredecessors")
    private final BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors;

    public BuildPipelineStagePredecessorCollection getBuildPipelineStagePredecessors() {
        return buildPipelineStagePredecessors;
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
        sb.append("BuildPipelineStageRunProgress(");
        sb.append("super=").append(super.toString());
        sb.append("stageDisplayName=").append(String.valueOf(this.stageDisplayName));
        sb.append(", buildPipelineStageId=").append(String.valueOf(this.buildPipelineStageId));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", buildPipelineStagePredecessors=")
                .append(String.valueOf(this.buildPipelineStagePredecessors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildPipelineStageRunProgress)) {
            return false;
        }

        BuildPipelineStageRunProgress other = (BuildPipelineStageRunProgress) o;
        return java.util.Objects.equals(this.stageDisplayName, other.stageDisplayName)
                && java.util.Objects.equals(this.buildPipelineStageId, other.buildPipelineStageId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.buildPipelineStagePredecessors, other.buildPipelineStagePredecessors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.stageDisplayName == null ? 43 : this.stageDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.buildPipelineStageId == null
                                ? 43
                                : this.buildPipelineStageId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.buildPipelineStagePredecessors == null
                                ? 43
                                : this.buildPipelineStagePredecessors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
