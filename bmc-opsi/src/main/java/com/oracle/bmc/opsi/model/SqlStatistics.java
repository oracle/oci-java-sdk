/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Performance statistics for the SQL.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlStatistics {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseTimeInSec",
        "executionsPerHour",
        "executionsCount",
        "cpuTimeInSec",
        "ioTimeInSec",
        "inefficientWaitTimeInSec",
        "responseTimeInSec",
        "planCount",
        "variability",
        "averageActiveSessions",
        "databaseTimePct",
        "inefficiencyInPct",
        "changeInCpuTimeInPct",
        "changeInIoTimeInPct",
        "changeInInefficientWaitTimeInPct",
        "changeInResponseTimeInPct",
        "changeInAverageActiveSessionsInPct",
        "changeInExecutionsPerHourInPct",
        "changeInInefficiencyInPct"
    })
    public SqlStatistics(
            Double databaseTimeInSec,
            Double executionsPerHour,
            Long executionsCount,
            Double cpuTimeInSec,
            Double ioTimeInSec,
            Double inefficientWaitTimeInSec,
            Double responseTimeInSec,
            Long planCount,
            Double variability,
            Double averageActiveSessions,
            Double databaseTimePct,
            Double inefficiencyInPct,
            Double changeInCpuTimeInPct,
            Double changeInIoTimeInPct,
            Double changeInInefficientWaitTimeInPct,
            Double changeInResponseTimeInPct,
            Double changeInAverageActiveSessionsInPct,
            Double changeInExecutionsPerHourInPct,
            Double changeInInefficiencyInPct) {
        super();
        this.databaseTimeInSec = databaseTimeInSec;
        this.executionsPerHour = executionsPerHour;
        this.executionsCount = executionsCount;
        this.cpuTimeInSec = cpuTimeInSec;
        this.ioTimeInSec = ioTimeInSec;
        this.inefficientWaitTimeInSec = inefficientWaitTimeInSec;
        this.responseTimeInSec = responseTimeInSec;
        this.planCount = planCount;
        this.variability = variability;
        this.averageActiveSessions = averageActiveSessions;
        this.databaseTimePct = databaseTimePct;
        this.inefficiencyInPct = inefficiencyInPct;
        this.changeInCpuTimeInPct = changeInCpuTimeInPct;
        this.changeInIoTimeInPct = changeInIoTimeInPct;
        this.changeInInefficientWaitTimeInPct = changeInInefficientWaitTimeInPct;
        this.changeInResponseTimeInPct = changeInResponseTimeInPct;
        this.changeInAverageActiveSessionsInPct = changeInAverageActiveSessionsInPct;
        this.changeInExecutionsPerHourInPct = changeInExecutionsPerHourInPct;
        this.changeInInefficiencyInPct = changeInInefficiencyInPct;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("databaseTimeInSec")
        private Double databaseTimeInSec;

        public Builder databaseTimeInSec(Double databaseTimeInSec) {
            this.databaseTimeInSec = databaseTimeInSec;
            this.__explicitlySet__.add("databaseTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionsPerHour")
        private Double executionsPerHour;

        public Builder executionsPerHour(Double executionsPerHour) {
            this.executionsPerHour = executionsPerHour;
            this.__explicitlySet__.add("executionsPerHour");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
        private Long executionsCount;

        public Builder executionsCount(Long executionsCount) {
            this.executionsCount = executionsCount;
            this.__explicitlySet__.add("executionsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
        private Double cpuTimeInSec;

        public Builder cpuTimeInSec(Double cpuTimeInSec) {
            this.cpuTimeInSec = cpuTimeInSec;
            this.__explicitlySet__.add("cpuTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
        private Double ioTimeInSec;

        public Builder ioTimeInSec(Double ioTimeInSec) {
            this.ioTimeInSec = ioTimeInSec;
            this.__explicitlySet__.add("ioTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
        private Double inefficientWaitTimeInSec;

        public Builder inefficientWaitTimeInSec(Double inefficientWaitTimeInSec) {
            this.inefficientWaitTimeInSec = inefficientWaitTimeInSec;
            this.__explicitlySet__.add("inefficientWaitTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInSec")
        private Double responseTimeInSec;

        public Builder responseTimeInSec(Double responseTimeInSec) {
            this.responseTimeInSec = responseTimeInSec;
            this.__explicitlySet__.add("responseTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planCount")
        private Long planCount;

        public Builder planCount(Long planCount) {
            this.planCount = planCount;
            this.__explicitlySet__.add("planCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("variability")
        private Double variability;

        public Builder variability(Double variability) {
            this.variability = variability;
            this.__explicitlySet__.add("variability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("averageActiveSessions")
        private Double averageActiveSessions;

        public Builder averageActiveSessions(Double averageActiveSessions) {
            this.averageActiveSessions = averageActiveSessions;
            this.__explicitlySet__.add("averageActiveSessions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseTimePct")
        private Double databaseTimePct;

        public Builder databaseTimePct(Double databaseTimePct) {
            this.databaseTimePct = databaseTimePct;
            this.__explicitlySet__.add("databaseTimePct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
        private Double inefficiencyInPct;

        public Builder inefficiencyInPct(Double inefficiencyInPct) {
            this.inefficiencyInPct = inefficiencyInPct;
            this.__explicitlySet__.add("inefficiencyInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeInCpuTimeInPct")
        private Double changeInCpuTimeInPct;

        public Builder changeInCpuTimeInPct(Double changeInCpuTimeInPct) {
            this.changeInCpuTimeInPct = changeInCpuTimeInPct;
            this.__explicitlySet__.add("changeInCpuTimeInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeInIoTimeInPct")
        private Double changeInIoTimeInPct;

        public Builder changeInIoTimeInPct(Double changeInIoTimeInPct) {
            this.changeInIoTimeInPct = changeInIoTimeInPct;
            this.__explicitlySet__.add("changeInIoTimeInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficientWaitTimeInPct")
        private Double changeInInefficientWaitTimeInPct;

        public Builder changeInInefficientWaitTimeInPct(Double changeInInefficientWaitTimeInPct) {
            this.changeInInefficientWaitTimeInPct = changeInInefficientWaitTimeInPct;
            this.__explicitlySet__.add("changeInInefficientWaitTimeInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeInResponseTimeInPct")
        private Double changeInResponseTimeInPct;

        public Builder changeInResponseTimeInPct(Double changeInResponseTimeInPct) {
            this.changeInResponseTimeInPct = changeInResponseTimeInPct;
            this.__explicitlySet__.add("changeInResponseTimeInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeInAverageActiveSessionsInPct")
        private Double changeInAverageActiveSessionsInPct;

        public Builder changeInAverageActiveSessionsInPct(
                Double changeInAverageActiveSessionsInPct) {
            this.changeInAverageActiveSessionsInPct = changeInAverageActiveSessionsInPct;
            this.__explicitlySet__.add("changeInAverageActiveSessionsInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeInExecutionsPerHourInPct")
        private Double changeInExecutionsPerHourInPct;

        public Builder changeInExecutionsPerHourInPct(Double changeInExecutionsPerHourInPct) {
            this.changeInExecutionsPerHourInPct = changeInExecutionsPerHourInPct;
            this.__explicitlySet__.add("changeInExecutionsPerHourInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficiencyInPct")
        private Double changeInInefficiencyInPct;

        public Builder changeInInefficiencyInPct(Double changeInInefficiencyInPct) {
            this.changeInInefficiencyInPct = changeInInefficiencyInPct;
            this.__explicitlySet__.add("changeInInefficiencyInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStatistics build() {
            SqlStatistics __instance__ =
                    new SqlStatistics(
                            databaseTimeInSec,
                            executionsPerHour,
                            executionsCount,
                            cpuTimeInSec,
                            ioTimeInSec,
                            inefficientWaitTimeInSec,
                            responseTimeInSec,
                            planCount,
                            variability,
                            averageActiveSessions,
                            databaseTimePct,
                            inefficiencyInPct,
                            changeInCpuTimeInPct,
                            changeInIoTimeInPct,
                            changeInInefficientWaitTimeInPct,
                            changeInResponseTimeInPct,
                            changeInAverageActiveSessionsInPct,
                            changeInExecutionsPerHourInPct,
                            changeInInefficiencyInPct);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStatistics o) {
            Builder copiedBuilder =
                    databaseTimeInSec(o.getDatabaseTimeInSec())
                            .executionsPerHour(o.getExecutionsPerHour())
                            .executionsCount(o.getExecutionsCount())
                            .cpuTimeInSec(o.getCpuTimeInSec())
                            .ioTimeInSec(o.getIoTimeInSec())
                            .inefficientWaitTimeInSec(o.getInefficientWaitTimeInSec())
                            .responseTimeInSec(o.getResponseTimeInSec())
                            .planCount(o.getPlanCount())
                            .variability(o.getVariability())
                            .averageActiveSessions(o.getAverageActiveSessions())
                            .databaseTimePct(o.getDatabaseTimePct())
                            .inefficiencyInPct(o.getInefficiencyInPct())
                            .changeInCpuTimeInPct(o.getChangeInCpuTimeInPct())
                            .changeInIoTimeInPct(o.getChangeInIoTimeInPct())
                            .changeInInefficientWaitTimeInPct(
                                    o.getChangeInInefficientWaitTimeInPct())
                            .changeInResponseTimeInPct(o.getChangeInResponseTimeInPct())
                            .changeInAverageActiveSessionsInPct(
                                    o.getChangeInAverageActiveSessionsInPct())
                            .changeInExecutionsPerHourInPct(o.getChangeInExecutionsPerHourInPct())
                            .changeInInefficiencyInPct(o.getChangeInInefficiencyInPct());

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
     * Database Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseTimeInSec")
    private final Double databaseTimeInSec;

    public Double getDatabaseTimeInSec() {
        return databaseTimeInSec;
    }

    /**
     * Number of executions per hour
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsPerHour")
    private final Double executionsPerHour;

    public Double getExecutionsPerHour() {
        return executionsPerHour;
    }

    /**
     * Total number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
    private final Long executionsCount;

    public Long getExecutionsCount() {
        return executionsCount;
    }

    /**
     * CPU Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
    private final Double cpuTimeInSec;

    public Double getCpuTimeInSec() {
        return cpuTimeInSec;
    }

    /**
     * I/O Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
    private final Double ioTimeInSec;

    public Double getIoTimeInSec() {
        return ioTimeInSec;
    }

    /**
     * Inefficient Wait Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
    private final Double inefficientWaitTimeInSec;

    public Double getInefficientWaitTimeInSec() {
        return inefficientWaitTimeInSec;
    }

    /**
     * Response time is the average elaspsed time per execution. It is the ratio of Total Database Time to the number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInSec")
    private final Double responseTimeInSec;

    public Double getResponseTimeInSec() {
        return responseTimeInSec;
    }

    /**
     * Number of SQL execution plans used by the SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planCount")
    private final Long planCount;

    public Long getPlanCount() {
        return planCount;
    }

    /**
     * Variability is the ratio of the standard deviation in response time to the mean of response time of the SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variability")
    private final Double variability;

    public Double getVariability() {
        return variability;
    }

    /**
     * Average Active Sessions represent the average active sessions at a point in time. It is the number of sessions that are either working or waiting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("averageActiveSessions")
    private final Double averageActiveSessions;

    public Double getAverageActiveSessions() {
        return averageActiveSessions;
    }

    /**
     * Percentage of Database Time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseTimePct")
    private final Double databaseTimePct;

    public Double getDatabaseTimePct() {
        return databaseTimePct;
    }

    /**
     * Percentage of Inefficiency. It is calculated by Total Database Time divided by Total Wait Time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
    private final Double inefficiencyInPct;

    public Double getInefficiencyInPct() {
        return inefficiencyInPct;
    }

    /**
     * Percent change in CPU Time based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInCpuTimeInPct")
    private final Double changeInCpuTimeInPct;

    public Double getChangeInCpuTimeInPct() {
        return changeInCpuTimeInPct;
    }

    /**
     * Percent change in IO Time based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInIoTimeInPct")
    private final Double changeInIoTimeInPct;

    public Double getChangeInIoTimeInPct() {
        return changeInIoTimeInPct;
    }

    /**
     * Percent change in Inefficient Wait Time based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficientWaitTimeInPct")
    private final Double changeInInefficientWaitTimeInPct;

    public Double getChangeInInefficientWaitTimeInPct() {
        return changeInInefficientWaitTimeInPct;
    }

    /**
     * Percent change in Response Time based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInResponseTimeInPct")
    private final Double changeInResponseTimeInPct;

    public Double getChangeInResponseTimeInPct() {
        return changeInResponseTimeInPct;
    }

    /**
     * Percent change in Average Active Sessions based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInAverageActiveSessionsInPct")
    private final Double changeInAverageActiveSessionsInPct;

    public Double getChangeInAverageActiveSessionsInPct() {
        return changeInAverageActiveSessionsInPct;
    }

    /**
     * Percent change in Executions per hour based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInExecutionsPerHourInPct")
    private final Double changeInExecutionsPerHourInPct;

    public Double getChangeInExecutionsPerHourInPct() {
        return changeInExecutionsPerHourInPct;
    }

    /**
     * Percent change in Inefficiency based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficiencyInPct")
    private final Double changeInInefficiencyInPct;

    public Double getChangeInInefficiencyInPct() {
        return changeInInefficiencyInPct;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlStatistics(");
        sb.append("databaseTimeInSec=").append(String.valueOf(this.databaseTimeInSec));
        sb.append(", executionsPerHour=").append(String.valueOf(this.executionsPerHour));
        sb.append(", executionsCount=").append(String.valueOf(this.executionsCount));
        sb.append(", cpuTimeInSec=").append(String.valueOf(this.cpuTimeInSec));
        sb.append(", ioTimeInSec=").append(String.valueOf(this.ioTimeInSec));
        sb.append(", inefficientWaitTimeInSec=")
                .append(String.valueOf(this.inefficientWaitTimeInSec));
        sb.append(", responseTimeInSec=").append(String.valueOf(this.responseTimeInSec));
        sb.append(", planCount=").append(String.valueOf(this.planCount));
        sb.append(", variability=").append(String.valueOf(this.variability));
        sb.append(", averageActiveSessions=").append(String.valueOf(this.averageActiveSessions));
        sb.append(", databaseTimePct=").append(String.valueOf(this.databaseTimePct));
        sb.append(", inefficiencyInPct=").append(String.valueOf(this.inefficiencyInPct));
        sb.append(", changeInCpuTimeInPct=").append(String.valueOf(this.changeInCpuTimeInPct));
        sb.append(", changeInIoTimeInPct=").append(String.valueOf(this.changeInIoTimeInPct));
        sb.append(", changeInInefficientWaitTimeInPct=")
                .append(String.valueOf(this.changeInInefficientWaitTimeInPct));
        sb.append(", changeInResponseTimeInPct=")
                .append(String.valueOf(this.changeInResponseTimeInPct));
        sb.append(", changeInAverageActiveSessionsInPct=")
                .append(String.valueOf(this.changeInAverageActiveSessionsInPct));
        sb.append(", changeInExecutionsPerHourInPct=")
                .append(String.valueOf(this.changeInExecutionsPerHourInPct));
        sb.append(", changeInInefficiencyInPct=")
                .append(String.valueOf(this.changeInInefficiencyInPct));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlStatistics)) {
            return false;
        }

        SqlStatistics other = (SqlStatistics) o;
        return java.util.Objects.equals(this.databaseTimeInSec, other.databaseTimeInSec)
                && java.util.Objects.equals(this.executionsPerHour, other.executionsPerHour)
                && java.util.Objects.equals(this.executionsCount, other.executionsCount)
                && java.util.Objects.equals(this.cpuTimeInSec, other.cpuTimeInSec)
                && java.util.Objects.equals(this.ioTimeInSec, other.ioTimeInSec)
                && java.util.Objects.equals(
                        this.inefficientWaitTimeInSec, other.inefficientWaitTimeInSec)
                && java.util.Objects.equals(this.responseTimeInSec, other.responseTimeInSec)
                && java.util.Objects.equals(this.planCount, other.planCount)
                && java.util.Objects.equals(this.variability, other.variability)
                && java.util.Objects.equals(this.averageActiveSessions, other.averageActiveSessions)
                && java.util.Objects.equals(this.databaseTimePct, other.databaseTimePct)
                && java.util.Objects.equals(this.inefficiencyInPct, other.inefficiencyInPct)
                && java.util.Objects.equals(this.changeInCpuTimeInPct, other.changeInCpuTimeInPct)
                && java.util.Objects.equals(this.changeInIoTimeInPct, other.changeInIoTimeInPct)
                && java.util.Objects.equals(
                        this.changeInInefficientWaitTimeInPct,
                        other.changeInInefficientWaitTimeInPct)
                && java.util.Objects.equals(
                        this.changeInResponseTimeInPct, other.changeInResponseTimeInPct)
                && java.util.Objects.equals(
                        this.changeInAverageActiveSessionsInPct,
                        other.changeInAverageActiveSessionsInPct)
                && java.util.Objects.equals(
                        this.changeInExecutionsPerHourInPct, other.changeInExecutionsPerHourInPct)
                && java.util.Objects.equals(
                        this.changeInInefficiencyInPct, other.changeInInefficiencyInPct)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseTimeInSec == null ? 43 : this.databaseTimeInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.executionsPerHour == null ? 43 : this.executionsPerHour.hashCode());
        result =
                (result * PRIME)
                        + (this.executionsCount == null ? 43 : this.executionsCount.hashCode());
        result = (result * PRIME) + (this.cpuTimeInSec == null ? 43 : this.cpuTimeInSec.hashCode());
        result = (result * PRIME) + (this.ioTimeInSec == null ? 43 : this.ioTimeInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.inefficientWaitTimeInSec == null
                                ? 43
                                : this.inefficientWaitTimeInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.responseTimeInSec == null ? 43 : this.responseTimeInSec.hashCode());
        result = (result * PRIME) + (this.planCount == null ? 43 : this.planCount.hashCode());
        result = (result * PRIME) + (this.variability == null ? 43 : this.variability.hashCode());
        result =
                (result * PRIME)
                        + (this.averageActiveSessions == null
                                ? 43
                                : this.averageActiveSessions.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseTimePct == null ? 43 : this.databaseTimePct.hashCode());
        result =
                (result * PRIME)
                        + (this.inefficiencyInPct == null ? 43 : this.inefficiencyInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.changeInCpuTimeInPct == null
                                ? 43
                                : this.changeInCpuTimeInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.changeInIoTimeInPct == null
                                ? 43
                                : this.changeInIoTimeInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.changeInInefficientWaitTimeInPct == null
                                ? 43
                                : this.changeInInefficientWaitTimeInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.changeInResponseTimeInPct == null
                                ? 43
                                : this.changeInResponseTimeInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.changeInAverageActiveSessionsInPct == null
                                ? 43
                                : this.changeInAverageActiveSessionsInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.changeInExecutionsPerHourInPct == null
                                ? 43
                                : this.changeInExecutionsPerHourInPct.hashCode());
        result =
                (result * PRIME)
                        + (this.changeInInefficiencyInPct == null
                                ? 43
                                : this.changeInInefficiencyInPct.hashCode());
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
