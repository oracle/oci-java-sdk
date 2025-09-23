/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.model;

/**
 * To use any of the API operations, you must be authorized by an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PerformanceTuningAnalysis.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PerformanceTuningAnalysis
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "workRequestId",
        "compartmentId",
        "analysisProjectName",
        "warningCount",
        "result",
        "resultObjectStoragePath",
        "artifactObjectStoragePath",
        "timeCreated",
        "timeStarted",
        "timeFinished",
        "createdBy"
    })
    public PerformanceTuningAnalysis(
            String id,
            String workRequestId,
            String compartmentId,
            String analysisProjectName,
            Integer warningCount,
            Result result,
            String resultObjectStoragePath,
            String artifactObjectStoragePath,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Principal createdBy) {
        super();
        this.id = id;
        this.workRequestId = workRequestId;
        this.compartmentId = compartmentId;
        this.analysisProjectName = analysisProjectName;
        this.warningCount = warningCount;
        this.result = result;
        this.resultObjectStoragePath = resultObjectStoragePath;
        this.artifactObjectStoragePath = artifactObjectStoragePath;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.createdBy = createdBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Performance Tuning Analysis.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Performance Tuning Analysis.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Work Request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Work Request.
         *
         * @param workRequestId the value to set
         * @return this builder
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Name of the analysis project. */
        @com.fasterxml.jackson.annotation.JsonProperty("analysisProjectName")
        private String analysisProjectName;

        /**
         * Name of the analysis project.
         *
         * @param analysisProjectName the value to set
         * @return this builder
         */
        public Builder analysisProjectName(String analysisProjectName) {
            this.analysisProjectName = analysisProjectName;
            this.__explicitlySet__.add("analysisProjectName");
            return this;
        }
        /** Number of warnings in the Performance Tuning Analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("warningCount")
        private Integer warningCount;

        /**
         * Number of warnings in the Performance Tuning Analysis.
         *
         * @param warningCount the value to set
         * @return this builder
         */
        public Builder warningCount(Integer warningCount) {
            this.warningCount = warningCount;
            this.__explicitlySet__.add("warningCount");
            return this;
        }
        /** Possible Performance Tuning Result statuses. */
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private Result result;

        /**
         * Possible Performance Tuning Result statuses.
         *
         * @param result the value to set
         * @return this builder
         */
        public Builder result(Result result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }
        /** Object storage path to the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("resultObjectStoragePath")
        private String resultObjectStoragePath;

        /**
         * Object storage path to the analysis.
         *
         * @param resultObjectStoragePath the value to set
         * @return this builder
         */
        public Builder resultObjectStoragePath(String resultObjectStoragePath) {
            this.resultObjectStoragePath = resultObjectStoragePath;
            this.__explicitlySet__.add("resultObjectStoragePath");
            return this;
        }
        /** Object storage path to the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactObjectStoragePath")
        private String artifactObjectStoragePath;

        /**
         * Object storage path to the artifact.
         *
         * @param artifactObjectStoragePath the value to set
         * @return this builder
         */
        public Builder artifactObjectStoragePath(String artifactObjectStoragePath) {
            this.artifactObjectStoragePath = artifactObjectStoragePath;
            this.__explicitlySet__.add("artifactObjectStoragePath");
            return this;
        }
        /**
         * The date and time the Performance Tuning Analysis was created, in the format defined by
         * [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Performance Tuning Analysis was created, in the format defined by
         * [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the Performance Tuning Analysis was started, in the format defined by
         * [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the Performance Tuning Analysis was started, in the format defined by
         * [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the Performance Tuning Analysis was finished, in the format defined by
         * [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the Performance Tuning Analysis was finished, in the format defined by
         * [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private Principal createdBy;

        public Builder createdBy(Principal createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PerformanceTuningAnalysis build() {
            PerformanceTuningAnalysis model =
                    new PerformanceTuningAnalysis(
                            this.id,
                            this.workRequestId,
                            this.compartmentId,
                            this.analysisProjectName,
                            this.warningCount,
                            this.result,
                            this.resultObjectStoragePath,
                            this.artifactObjectStoragePath,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeFinished,
                            this.createdBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PerformanceTuningAnalysis model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("analysisProjectName")) {
                this.analysisProjectName(model.getAnalysisProjectName());
            }
            if (model.wasPropertyExplicitlySet("warningCount")) {
                this.warningCount(model.getWarningCount());
            }
            if (model.wasPropertyExplicitlySet("result")) {
                this.result(model.getResult());
            }
            if (model.wasPropertyExplicitlySet("resultObjectStoragePath")) {
                this.resultObjectStoragePath(model.getResultObjectStoragePath());
            }
            if (model.wasPropertyExplicitlySet("artifactObjectStoragePath")) {
                this.artifactObjectStoragePath(model.getArtifactObjectStoragePath());
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
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Performance Tuning Analysis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Performance Tuning Analysis.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Work
     * Request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Work
     * Request.
     *
     * @return the value
     */
    public String getWorkRequestId() {
        return workRequestId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Name of the analysis project. */
    @com.fasterxml.jackson.annotation.JsonProperty("analysisProjectName")
    private final String analysisProjectName;

    /**
     * Name of the analysis project.
     *
     * @return the value
     */
    public String getAnalysisProjectName() {
        return analysisProjectName;
    }

    /** Number of warnings in the Performance Tuning Analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("warningCount")
    private final Integer warningCount;

    /**
     * Number of warnings in the Performance Tuning Analysis.
     *
     * @return the value
     */
    public Integer getWarningCount() {
        return warningCount;
    }

    /** Possible Performance Tuning Result statuses. */
    public enum Result implements com.oracle.bmc.http.internal.BmcEnum {
        ActionRecommended("ACTION_RECOMMENDED"),
        NoWarnings("NO_WARNINGS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Result.class);

        private final String value;
        private static java.util.Map<String, Result> map;

        static {
            map = new java.util.HashMap<>();
            for (Result v : Result.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Result(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Result create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Result', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Possible Performance Tuning Result statuses. */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final Result result;

    /**
     * Possible Performance Tuning Result statuses.
     *
     * @return the value
     */
    public Result getResult() {
        return result;
    }

    /** Object storage path to the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("resultObjectStoragePath")
    private final String resultObjectStoragePath;

    /**
     * Object storage path to the analysis.
     *
     * @return the value
     */
    public String getResultObjectStoragePath() {
        return resultObjectStoragePath;
    }

    /** Object storage path to the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactObjectStoragePath")
    private final String artifactObjectStoragePath;

    /**
     * Object storage path to the artifact.
     *
     * @return the value
     */
    public String getArtifactObjectStoragePath() {
        return artifactObjectStoragePath;
    }

    /**
     * The date and time the Performance Tuning Analysis was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Performance Tuning Analysis was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Performance Tuning Analysis was started, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the Performance Tuning Analysis was started, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the Performance Tuning Analysis was finished, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the Performance Tuning Analysis was finished, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final Principal createdBy;

    public Principal getCreatedBy() {
        return createdBy;
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
        sb.append("PerformanceTuningAnalysis(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", analysisProjectName=").append(String.valueOf(this.analysisProjectName));
        sb.append(", warningCount=").append(String.valueOf(this.warningCount));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(", resultObjectStoragePath=")
                .append(String.valueOf(this.resultObjectStoragePath));
        sb.append(", artifactObjectStoragePath=")
                .append(String.valueOf(this.artifactObjectStoragePath));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerformanceTuningAnalysis)) {
            return false;
        }

        PerformanceTuningAnalysis other = (PerformanceTuningAnalysis) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.analysisProjectName, other.analysisProjectName)
                && java.util.Objects.equals(this.warningCount, other.warningCount)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(
                        this.resultObjectStoragePath, other.resultObjectStoragePath)
                && java.util.Objects.equals(
                        this.artifactObjectStoragePath, other.artifactObjectStoragePath)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisProjectName == null
                                ? 43
                                : this.analysisProjectName.hashCode());
        result = (result * PRIME) + (this.warningCount == null ? 43 : this.warningCount.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result =
                (result * PRIME)
                        + (this.resultObjectStoragePath == null
                                ? 43
                                : this.resultObjectStoragePath.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactObjectStoragePath == null
                                ? 43
                                : this.artifactObjectStoragePath.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
