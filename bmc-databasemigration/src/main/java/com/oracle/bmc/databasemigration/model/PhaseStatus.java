/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Job phase status details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PhaseStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PhaseStatus extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "status",
        "durationInMs",
        "isAdvisorReportAvailable",
        "issue",
        "action",
        "extract",
        "logLocation",
        "progress"
    })
    public PhaseStatus(
            OdmsJobPhases name,
            JobPhaseStatus status,
            Integer durationInMs,
            Boolean isAdvisorReportAvailable,
            String issue,
            String action,
            java.util.List<PhaseExtractEntry> extract,
            LogLocationBucketDetails logLocation,
            Integer progress) {
        super();
        this.name = name;
        this.status = status;
        this.durationInMs = durationInMs;
        this.isAdvisorReportAvailable = isAdvisorReportAvailable;
        this.issue = issue;
        this.action = action;
        this.extract = extract;
        this.logLocation = logLocation;
        this.progress = progress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Phase name
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private OdmsJobPhases name;

        /**
         * Phase name
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(OdmsJobPhases name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Phase status
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobPhaseStatus status;

        /**
         * Phase status
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(JobPhaseStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Duration of the phase in milliseconds
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
        private Integer durationInMs;

        /**
         * Duration of the phase in milliseconds
         *
         * @param durationInMs the value to set
         * @return this builder
         **/
        public Builder durationInMs(Integer durationInMs) {
            this.durationInMs = durationInMs;
            this.__explicitlySet__.add("durationInMs");
            return this;
        }
        /**
         * True if a Pre-Migration Advisor report is available for this phase. False or null if no report is available.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAdvisorReportAvailable")
        private Boolean isAdvisorReportAvailable;

        /**
         * True if a Pre-Migration Advisor report is available for this phase. False or null if no report is available.
         *
         * @param isAdvisorReportAvailable the value to set
         * @return this builder
         **/
        public Builder isAdvisorReportAvailable(Boolean isAdvisorReportAvailable) {
            this.isAdvisorReportAvailable = isAdvisorReportAvailable;
            this.__explicitlySet__.add("isAdvisorReportAvailable");
            return this;
        }
        /**
         * The text describing the root cause of the reported issue
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issue")
        private String issue;

        /**
         * The text describing the root cause of the reported issue
         *
         * @param issue the value to set
         * @return this builder
         **/
        public Builder issue(String issue) {
            this.issue = issue;
            this.__explicitlySet__.add("issue");
            return this;
        }
        /**
         * The text describing the action required to fix the issue
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * The text describing the action required to fix the issue
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * Summary of phase status results.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extract")
        private java.util.List<PhaseExtractEntry> extract;

        /**
         * Summary of phase status results.
         *
         * @param extract the value to set
         * @return this builder
         **/
        public Builder extract(java.util.List<PhaseExtractEntry> extract) {
            this.extract = extract;
            this.__explicitlySet__.add("extract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
        private LogLocationBucketDetails logLocation;

        public Builder logLocation(LogLocationBucketDetails logLocation) {
            this.logLocation = logLocation;
            this.__explicitlySet__.add("logLocation");
            return this;
        }
        /**
         * Percent progress of job phase.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private Integer progress;

        /**
         * Percent progress of job phase.
         *
         * @param progress the value to set
         * @return this builder
         **/
        public Builder progress(Integer progress) {
            this.progress = progress;
            this.__explicitlySet__.add("progress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PhaseStatus build() {
            PhaseStatus model =
                    new PhaseStatus(
                            this.name,
                            this.status,
                            this.durationInMs,
                            this.isAdvisorReportAvailable,
                            this.issue,
                            this.action,
                            this.extract,
                            this.logLocation,
                            this.progress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PhaseStatus model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("durationInMs")) {
                this.durationInMs(model.getDurationInMs());
            }
            if (model.wasPropertyExplicitlySet("isAdvisorReportAvailable")) {
                this.isAdvisorReportAvailable(model.getIsAdvisorReportAvailable());
            }
            if (model.wasPropertyExplicitlySet("issue")) {
                this.issue(model.getIssue());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("extract")) {
                this.extract(model.getExtract());
            }
            if (model.wasPropertyExplicitlySet("logLocation")) {
                this.logLocation(model.getLogLocation());
            }
            if (model.wasPropertyExplicitlySet("progress")) {
                this.progress(model.getProgress());
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
     * Phase name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final OdmsJobPhases name;

    /**
     * Phase name
     *
     * @return the value
     **/
    public OdmsJobPhases getName() {
        return name;
    }

    /**
     * Phase status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobPhaseStatus status;

    /**
     * Phase status
     *
     * @return the value
     **/
    public JobPhaseStatus getStatus() {
        return status;
    }

    /**
     * Duration of the phase in milliseconds
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
    private final Integer durationInMs;

    /**
     * Duration of the phase in milliseconds
     *
     * @return the value
     **/
    public Integer getDurationInMs() {
        return durationInMs;
    }

    /**
     * True if a Pre-Migration Advisor report is available for this phase. False or null if no report is available.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAdvisorReportAvailable")
    private final Boolean isAdvisorReportAvailable;

    /**
     * True if a Pre-Migration Advisor report is available for this phase. False or null if no report is available.
     *
     * @return the value
     **/
    public Boolean getIsAdvisorReportAvailable() {
        return isAdvisorReportAvailable;
    }

    /**
     * The text describing the root cause of the reported issue
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issue")
    private final String issue;

    /**
     * The text describing the root cause of the reported issue
     *
     * @return the value
     **/
    public String getIssue() {
        return issue;
    }

    /**
     * The text describing the action required to fix the issue
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * The text describing the action required to fix the issue
     *
     * @return the value
     **/
    public String getAction() {
        return action;
    }

    /**
     * Summary of phase status results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extract")
    private final java.util.List<PhaseExtractEntry> extract;

    /**
     * Summary of phase status results.
     *
     * @return the value
     **/
    public java.util.List<PhaseExtractEntry> getExtract() {
        return extract;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
    private final LogLocationBucketDetails logLocation;

    public LogLocationBucketDetails getLogLocation() {
        return logLocation;
    }

    /**
     * Percent progress of job phase.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("progress")
    private final Integer progress;

    /**
     * Percent progress of job phase.
     *
     * @return the value
     **/
    public Integer getProgress() {
        return progress;
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
        sb.append("PhaseStatus(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", durationInMs=").append(String.valueOf(this.durationInMs));
        sb.append(", isAdvisorReportAvailable=")
                .append(String.valueOf(this.isAdvisorReportAvailable));
        sb.append(", issue=").append(String.valueOf(this.issue));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", extract=").append(String.valueOf(this.extract));
        sb.append(", logLocation=").append(String.valueOf(this.logLocation));
        sb.append(", progress=").append(String.valueOf(this.progress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PhaseStatus)) {
            return false;
        }

        PhaseStatus other = (PhaseStatus) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.durationInMs, other.durationInMs)
                && java.util.Objects.equals(
                        this.isAdvisorReportAvailable, other.isAdvisorReportAvailable)
                && java.util.Objects.equals(this.issue, other.issue)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.extract, other.extract)
                && java.util.Objects.equals(this.logLocation, other.logLocation)
                && java.util.Objects.equals(this.progress, other.progress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.durationInMs == null ? 43 : this.durationInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.isAdvisorReportAvailable == null
                                ? 43
                                : this.isAdvisorReportAvailable.hashCode());
        result = (result * PRIME) + (this.issue == null ? 43 : this.issue.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.extract == null ? 43 : this.extract.hashCode());
        result = (result * PRIME) + (this.logLocation == null ? 43 : this.logLocation.hashCode());
        result = (result * PRIME) + (this.progress == null ? 43 : this.progress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
