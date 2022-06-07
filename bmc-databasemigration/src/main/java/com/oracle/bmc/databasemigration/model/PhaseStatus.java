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
public final class PhaseStatus {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "status",
        "durationInMs",
        "isAdvisorReportAvailable",
        "extract",
        "logLocation",
        "progress"
    })
    public PhaseStatus(
            OdmsJobPhases name,
            JobPhaseStatus status,
            Integer durationInMs,
            Boolean isAdvisorReportAvailable,
            java.util.List<PhaseExtractEntry> extract,
            LogLocationBucketDetails logLocation,
            Integer progress) {
        super();
        this.name = name;
        this.status = status;
        this.durationInMs = durationInMs;
        this.isAdvisorReportAvailable = isAdvisorReportAvailable;
        this.extract = extract;
        this.logLocation = logLocation;
        this.progress = progress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private OdmsJobPhases name;

        public Builder name(OdmsJobPhases name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobPhaseStatus status;

        public Builder status(JobPhaseStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
        private Integer durationInMs;

        public Builder durationInMs(Integer durationInMs) {
            this.durationInMs = durationInMs;
            this.__explicitlySet__.add("durationInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAdvisorReportAvailable")
        private Boolean isAdvisorReportAvailable;

        public Builder isAdvisorReportAvailable(Boolean isAdvisorReportAvailable) {
            this.isAdvisorReportAvailable = isAdvisorReportAvailable;
            this.__explicitlySet__.add("isAdvisorReportAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extract")
        private java.util.List<PhaseExtractEntry> extract;

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

        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private Integer progress;

        public Builder progress(Integer progress) {
            this.progress = progress;
            this.__explicitlySet__.add("progress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PhaseStatus build() {
            PhaseStatus __instance__ =
                    new PhaseStatus(
                            name,
                            status,
                            durationInMs,
                            isAdvisorReportAvailable,
                            extract,
                            logLocation,
                            progress);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PhaseStatus o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .status(o.getStatus())
                            .durationInMs(o.getDurationInMs())
                            .isAdvisorReportAvailable(o.getIsAdvisorReportAvailable())
                            .extract(o.getExtract())
                            .logLocation(o.getLogLocation())
                            .progress(o.getProgress());

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
     * Phase name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final OdmsJobPhases name;

    public OdmsJobPhases getName() {
        return name;
    }

    /**
     * Phase status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobPhaseStatus status;

    public JobPhaseStatus getStatus() {
        return status;
    }

    /**
     * Duration of the phase in milliseconds
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
    private final Integer durationInMs;

    public Integer getDurationInMs() {
        return durationInMs;
    }

    /**
     * True if a Pre-Migration Advisor report is available for this phase. False or null if no report is available.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAdvisorReportAvailable")
    private final Boolean isAdvisorReportAvailable;

    public Boolean getIsAdvisorReportAvailable() {
        return isAdvisorReportAvailable;
    }

    /**
     * Summary of phase status results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extract")
    private final java.util.List<PhaseExtractEntry> extract;

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

    public Integer getProgress() {
        return progress;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PhaseStatus(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", durationInMs=").append(String.valueOf(this.durationInMs));
        sb.append(", isAdvisorReportAvailable=")
                .append(String.valueOf(this.isAdvisorReportAvailable));
        sb.append(", extract=").append(String.valueOf(this.extract));
        sb.append(", logLocation=").append(String.valueOf(this.logLocation));
        sb.append(", progress=").append(String.valueOf(this.progress));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.extract, other.extract)
                && java.util.Objects.equals(this.logLocation, other.logLocation)
                && java.util.Objects.equals(this.progress, other.progress)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result = (result * PRIME) + (this.extract == null ? 43 : this.extract.hashCode());
        result = (result * PRIME) + (this.logLocation == null ? 43 : this.logLocation.hashCode());
        result = (result * PRIME) + (this.progress == null ? 43 : this.progress.hashCode());
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
