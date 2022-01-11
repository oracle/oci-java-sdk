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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlStatistics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Database Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseTimeInSec")
    Double databaseTimeInSec;

    /**
     * Number of executions per hour
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsPerHour")
    Double executionsPerHour;

    /**
     * Total number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
    Long executionsCount;

    /**
     * CPU Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
    Double cpuTimeInSec;

    /**
     * I/O Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
    Double ioTimeInSec;

    /**
     * Inefficient Wait Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
    Double inefficientWaitTimeInSec;

    /**
     * Response time is the average elaspsed time per execution. It is the ratio of Total Database Time to the number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInSec")
    Double responseTimeInSec;

    /**
     * Number of SQL execution plans used by the SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planCount")
    Long planCount;

    /**
     * Variability is the ratio of the standard deviation in response time to the mean of response time of the SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variability")
    Double variability;

    /**
     * Average Active Sessions represent the average active sessions at a point in time. It is the number of sessions that are either working or waiting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("averageActiveSessions")
    Double averageActiveSessions;

    /**
     * Percentage of Database Time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseTimePct")
    Double databaseTimePct;

    /**
     * Percentage of Inefficiency. It is calculated by Total Database Time divided by Total Wait Time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
    Double inefficiencyInPct;

    /**
     * Percent change in CPU Time based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInCpuTimeInPct")
    Double changeInCpuTimeInPct;

    /**
     * Percent change in IO Time based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInIoTimeInPct")
    Double changeInIoTimeInPct;

    /**
     * Percent change in Inefficient Wait Time based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficientWaitTimeInPct")
    Double changeInInefficientWaitTimeInPct;

    /**
     * Percent change in Response Time based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInResponseTimeInPct")
    Double changeInResponseTimeInPct;

    /**
     * Percent change in Average Active Sessions based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInAverageActiveSessionsInPct")
    Double changeInAverageActiveSessionsInPct;

    /**
     * Percent change in Executions per hour based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInExecutionsPerHourInPct")
    Double changeInExecutionsPerHourInPct;

    /**
     * Percent change in Inefficiency based on linear regression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficiencyInPct")
    Double changeInInefficiencyInPct;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
