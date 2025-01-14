/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * A remediation run stage is one step of an remediation run. Each stage provides output logs and
 * has a specific type. The stages are: DETECT, RECOMMEND, VERIFY, and APPLY. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = RemediationRunStage.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RecommendStage.class,
            name = "RECOMMEND"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = VerifyStage.class, name = "VERIFY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ApplyStage.class, name = "APPLY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DetectStage.class, name = "DETECT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class RemediationRunStage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "timeCreated",
        "timeStarted",
        "timeFinished",
        "summary",
        "remediationRunId",
        "previousStageType",
        "nextStageType"
    })
    protected RemediationRunStage(
            Status status,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String summary,
            String remediationRunId,
            RemediationRunStageType previousStageType,
            RemediationRunStageType nextStageType) {
        super();
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.summary = summary;
        this.remediationRunId = remediationRunId;
        this.previousStageType = previousStageType;
        this.nextStageType = nextStageType;
    }

    /** The current status of a remediation run stage. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Created("CREATED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
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
    /** The current status of a remediation run stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status of a remediation run stage.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * The creation date and time of the remediation run stage (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The creation date and time of the remediation run stage (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time of the start of the remediation run stage (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time of the start of the remediation run stage (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time of the finish of the remediation run stage (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time of the finish of the remediation run stage (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** Information about the current step within the stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * Information about the current step within the stage.
     *
     * @return the value
     */
    public String getSummary() {
        return summary;
    }

    /**
     * The Oracle Cloud identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * remediation run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remediationRunId")
    private final String remediationRunId;

    /**
     * The Oracle Cloud identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * remediation run.
     *
     * @return the value
     */
    public String getRemediationRunId() {
        return remediationRunId;
    }

    /** The previous type of stage in the remediation run. */
    @com.fasterxml.jackson.annotation.JsonProperty("previousStageType")
    private final RemediationRunStageType previousStageType;

    /**
     * The previous type of stage in the remediation run.
     *
     * @return the value
     */
    public RemediationRunStageType getPreviousStageType() {
        return previousStageType;
    }

    /** The next type of stage in the remediation run. */
    @com.fasterxml.jackson.annotation.JsonProperty("nextStageType")
    private final RemediationRunStageType nextStageType;

    /**
     * The next type of stage in the remediation run.
     *
     * @return the value
     */
    public RemediationRunStageType getNextStageType() {
        return nextStageType;
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
        sb.append("RemediationRunStage(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", remediationRunId=").append(String.valueOf(this.remediationRunId));
        sb.append(", previousStageType=").append(String.valueOf(this.previousStageType));
        sb.append(", nextStageType=").append(String.valueOf(this.nextStageType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemediationRunStage)) {
            return false;
        }

        RemediationRunStage other = (RemediationRunStage) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.remediationRunId, other.remediationRunId)
                && java.util.Objects.equals(this.previousStageType, other.previousStageType)
                && java.util.Objects.equals(this.nextStageType, other.nextStageType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result =
                (result * PRIME)
                        + (this.remediationRunId == null ? 43 : this.remediationRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.previousStageType == null ? 43 : this.previousStageType.hashCode());
        result =
                (result * PRIME)
                        + (this.nextStageType == null ? 43 : this.nextStageType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
