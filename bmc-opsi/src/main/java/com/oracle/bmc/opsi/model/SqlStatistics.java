/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Performance statistics for the SQL. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlStatistics extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Database Time in seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseTimeInSec")
        private Double databaseTimeInSec;

        /**
         * Database Time in seconds
         *
         * @param databaseTimeInSec the value to set
         * @return this builder
         */
        public Builder databaseTimeInSec(Double databaseTimeInSec) {
            this.databaseTimeInSec = databaseTimeInSec;
            this.__explicitlySet__.add("databaseTimeInSec");
            return this;
        }
        /** Number of executions per hour */
        @com.fasterxml.jackson.annotation.JsonProperty("executionsPerHour")
        private Double executionsPerHour;

        /**
         * Number of executions per hour
         *
         * @param executionsPerHour the value to set
         * @return this builder
         */
        public Builder executionsPerHour(Double executionsPerHour) {
            this.executionsPerHour = executionsPerHour;
            this.__explicitlySet__.add("executionsPerHour");
            return this;
        }
        /** Total number of executions */
        @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
        private Long executionsCount;

        /**
         * Total number of executions
         *
         * @param executionsCount the value to set
         * @return this builder
         */
        public Builder executionsCount(Long executionsCount) {
            this.executionsCount = executionsCount;
            this.__explicitlySet__.add("executionsCount");
            return this;
        }
        /** CPU Time in seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
        private Double cpuTimeInSec;

        /**
         * CPU Time in seconds
         *
         * @param cpuTimeInSec the value to set
         * @return this builder
         */
        public Builder cpuTimeInSec(Double cpuTimeInSec) {
            this.cpuTimeInSec = cpuTimeInSec;
            this.__explicitlySet__.add("cpuTimeInSec");
            return this;
        }
        /** I/O Time in seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
        private Double ioTimeInSec;

        /**
         * I/O Time in seconds
         *
         * @param ioTimeInSec the value to set
         * @return this builder
         */
        public Builder ioTimeInSec(Double ioTimeInSec) {
            this.ioTimeInSec = ioTimeInSec;
            this.__explicitlySet__.add("ioTimeInSec");
            return this;
        }
        /** Inefficient Wait Time in seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
        private Double inefficientWaitTimeInSec;

        /**
         * Inefficient Wait Time in seconds
         *
         * @param inefficientWaitTimeInSec the value to set
         * @return this builder
         */
        public Builder inefficientWaitTimeInSec(Double inefficientWaitTimeInSec) {
            this.inefficientWaitTimeInSec = inefficientWaitTimeInSec;
            this.__explicitlySet__.add("inefficientWaitTimeInSec");
            return this;
        }
        /**
         * Response time is the average elaspsed time per execution. It is the ratio of Total
         * Database Time to the number of executions
         */
        @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInSec")
        private Double responseTimeInSec;

        /**
         * Response time is the average elaspsed time per execution. It is the ratio of Total
         * Database Time to the number of executions
         *
         * @param responseTimeInSec the value to set
         * @return this builder
         */
        public Builder responseTimeInSec(Double responseTimeInSec) {
            this.responseTimeInSec = responseTimeInSec;
            this.__explicitlySet__.add("responseTimeInSec");
            return this;
        }
        /** Number of SQL execution plans used by the SQL */
        @com.fasterxml.jackson.annotation.JsonProperty("planCount")
        private Long planCount;

        /**
         * Number of SQL execution plans used by the SQL
         *
         * @param planCount the value to set
         * @return this builder
         */
        public Builder planCount(Long planCount) {
            this.planCount = planCount;
            this.__explicitlySet__.add("planCount");
            return this;
        }
        /**
         * Variability is the ratio of the standard deviation in response time to the mean of
         * response time of the SQL
         */
        @com.fasterxml.jackson.annotation.JsonProperty("variability")
        private Double variability;

        /**
         * Variability is the ratio of the standard deviation in response time to the mean of
         * response time of the SQL
         *
         * @param variability the value to set
         * @return this builder
         */
        public Builder variability(Double variability) {
            this.variability = variability;
            this.__explicitlySet__.add("variability");
            return this;
        }
        /**
         * Average Active Sessions represent the average active sessions at a point in time. It is
         * the number of sessions that are either working or waiting.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("averageActiveSessions")
        private Double averageActiveSessions;

        /**
         * Average Active Sessions represent the average active sessions at a point in time. It is
         * the number of sessions that are either working or waiting.
         *
         * @param averageActiveSessions the value to set
         * @return this builder
         */
        public Builder averageActiveSessions(Double averageActiveSessions) {
            this.averageActiveSessions = averageActiveSessions;
            this.__explicitlySet__.add("averageActiveSessions");
            return this;
        }
        /** Percentage of Database Time */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseTimePct")
        private Double databaseTimePct;

        /**
         * Percentage of Database Time
         *
         * @param databaseTimePct the value to set
         * @return this builder
         */
        public Builder databaseTimePct(Double databaseTimePct) {
            this.databaseTimePct = databaseTimePct;
            this.__explicitlySet__.add("databaseTimePct");
            return this;
        }
        /**
         * Percentage of Inefficiency. It is calculated by Total Database Time divided by Total Wait
         * Time
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
        private Double inefficiencyInPct;

        /**
         * Percentage of Inefficiency. It is calculated by Total Database Time divided by Total Wait
         * Time
         *
         * @param inefficiencyInPct the value to set
         * @return this builder
         */
        public Builder inefficiencyInPct(Double inefficiencyInPct) {
            this.inefficiencyInPct = inefficiencyInPct;
            this.__explicitlySet__.add("inefficiencyInPct");
            return this;
        }
        /** Percent change in CPU Time based on linear regression */
        @com.fasterxml.jackson.annotation.JsonProperty("changeInCpuTimeInPct")
        private Double changeInCpuTimeInPct;

        /**
         * Percent change in CPU Time based on linear regression
         *
         * @param changeInCpuTimeInPct the value to set
         * @return this builder
         */
        public Builder changeInCpuTimeInPct(Double changeInCpuTimeInPct) {
            this.changeInCpuTimeInPct = changeInCpuTimeInPct;
            this.__explicitlySet__.add("changeInCpuTimeInPct");
            return this;
        }
        /** Percent change in IO Time based on linear regression */
        @com.fasterxml.jackson.annotation.JsonProperty("changeInIoTimeInPct")
        private Double changeInIoTimeInPct;

        /**
         * Percent change in IO Time based on linear regression
         *
         * @param changeInIoTimeInPct the value to set
         * @return this builder
         */
        public Builder changeInIoTimeInPct(Double changeInIoTimeInPct) {
            this.changeInIoTimeInPct = changeInIoTimeInPct;
            this.__explicitlySet__.add("changeInIoTimeInPct");
            return this;
        }
        /** Percent change in Inefficient Wait Time based on linear regression */
        @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficientWaitTimeInPct")
        private Double changeInInefficientWaitTimeInPct;

        /**
         * Percent change in Inefficient Wait Time based on linear regression
         *
         * @param changeInInefficientWaitTimeInPct the value to set
         * @return this builder
         */
        public Builder changeInInefficientWaitTimeInPct(Double changeInInefficientWaitTimeInPct) {
            this.changeInInefficientWaitTimeInPct = changeInInefficientWaitTimeInPct;
            this.__explicitlySet__.add("changeInInefficientWaitTimeInPct");
            return this;
        }
        /** Percent change in Response Time based on linear regression */
        @com.fasterxml.jackson.annotation.JsonProperty("changeInResponseTimeInPct")
        private Double changeInResponseTimeInPct;

        /**
         * Percent change in Response Time based on linear regression
         *
         * @param changeInResponseTimeInPct the value to set
         * @return this builder
         */
        public Builder changeInResponseTimeInPct(Double changeInResponseTimeInPct) {
            this.changeInResponseTimeInPct = changeInResponseTimeInPct;
            this.__explicitlySet__.add("changeInResponseTimeInPct");
            return this;
        }
        /** Percent change in Average Active Sessions based on linear regression */
        @com.fasterxml.jackson.annotation.JsonProperty("changeInAverageActiveSessionsInPct")
        private Double changeInAverageActiveSessionsInPct;

        /**
         * Percent change in Average Active Sessions based on linear regression
         *
         * @param changeInAverageActiveSessionsInPct the value to set
         * @return this builder
         */
        public Builder changeInAverageActiveSessionsInPct(
                Double changeInAverageActiveSessionsInPct) {
            this.changeInAverageActiveSessionsInPct = changeInAverageActiveSessionsInPct;
            this.__explicitlySet__.add("changeInAverageActiveSessionsInPct");
            return this;
        }
        /** Percent change in Executions per hour based on linear regression */
        @com.fasterxml.jackson.annotation.JsonProperty("changeInExecutionsPerHourInPct")
        private Double changeInExecutionsPerHourInPct;

        /**
         * Percent change in Executions per hour based on linear regression
         *
         * @param changeInExecutionsPerHourInPct the value to set
         * @return this builder
         */
        public Builder changeInExecutionsPerHourInPct(Double changeInExecutionsPerHourInPct) {
            this.changeInExecutionsPerHourInPct = changeInExecutionsPerHourInPct;
            this.__explicitlySet__.add("changeInExecutionsPerHourInPct");
            return this;
        }
        /** Percent change in Inefficiency based on linear regression */
        @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficiencyInPct")
        private Double changeInInefficiencyInPct;

        /**
         * Percent change in Inefficiency based on linear regression
         *
         * @param changeInInefficiencyInPct the value to set
         * @return this builder
         */
        public Builder changeInInefficiencyInPct(Double changeInInefficiencyInPct) {
            this.changeInInefficiencyInPct = changeInInefficiencyInPct;
            this.__explicitlySet__.add("changeInInefficiencyInPct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStatistics build() {
            SqlStatistics model =
                    new SqlStatistics(
                            this.databaseTimeInSec,
                            this.executionsPerHour,
                            this.executionsCount,
                            this.cpuTimeInSec,
                            this.ioTimeInSec,
                            this.inefficientWaitTimeInSec,
                            this.responseTimeInSec,
                            this.planCount,
                            this.variability,
                            this.averageActiveSessions,
                            this.databaseTimePct,
                            this.inefficiencyInPct,
                            this.changeInCpuTimeInPct,
                            this.changeInIoTimeInPct,
                            this.changeInInefficientWaitTimeInPct,
                            this.changeInResponseTimeInPct,
                            this.changeInAverageActiveSessionsInPct,
                            this.changeInExecutionsPerHourInPct,
                            this.changeInInefficiencyInPct);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStatistics model) {
            if (model.wasPropertyExplicitlySet("databaseTimeInSec")) {
                this.databaseTimeInSec(model.getDatabaseTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("executionsPerHour")) {
                this.executionsPerHour(model.getExecutionsPerHour());
            }
            if (model.wasPropertyExplicitlySet("executionsCount")) {
                this.executionsCount(model.getExecutionsCount());
            }
            if (model.wasPropertyExplicitlySet("cpuTimeInSec")) {
                this.cpuTimeInSec(model.getCpuTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("ioTimeInSec")) {
                this.ioTimeInSec(model.getIoTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("inefficientWaitTimeInSec")) {
                this.inefficientWaitTimeInSec(model.getInefficientWaitTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("responseTimeInSec")) {
                this.responseTimeInSec(model.getResponseTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("planCount")) {
                this.planCount(model.getPlanCount());
            }
            if (model.wasPropertyExplicitlySet("variability")) {
                this.variability(model.getVariability());
            }
            if (model.wasPropertyExplicitlySet("averageActiveSessions")) {
                this.averageActiveSessions(model.getAverageActiveSessions());
            }
            if (model.wasPropertyExplicitlySet("databaseTimePct")) {
                this.databaseTimePct(model.getDatabaseTimePct());
            }
            if (model.wasPropertyExplicitlySet("inefficiencyInPct")) {
                this.inefficiencyInPct(model.getInefficiencyInPct());
            }
            if (model.wasPropertyExplicitlySet("changeInCpuTimeInPct")) {
                this.changeInCpuTimeInPct(model.getChangeInCpuTimeInPct());
            }
            if (model.wasPropertyExplicitlySet("changeInIoTimeInPct")) {
                this.changeInIoTimeInPct(model.getChangeInIoTimeInPct());
            }
            if (model.wasPropertyExplicitlySet("changeInInefficientWaitTimeInPct")) {
                this.changeInInefficientWaitTimeInPct(model.getChangeInInefficientWaitTimeInPct());
            }
            if (model.wasPropertyExplicitlySet("changeInResponseTimeInPct")) {
                this.changeInResponseTimeInPct(model.getChangeInResponseTimeInPct());
            }
            if (model.wasPropertyExplicitlySet("changeInAverageActiveSessionsInPct")) {
                this.changeInAverageActiveSessionsInPct(
                        model.getChangeInAverageActiveSessionsInPct());
            }
            if (model.wasPropertyExplicitlySet("changeInExecutionsPerHourInPct")) {
                this.changeInExecutionsPerHourInPct(model.getChangeInExecutionsPerHourInPct());
            }
            if (model.wasPropertyExplicitlySet("changeInInefficiencyInPct")) {
                this.changeInInefficiencyInPct(model.getChangeInInefficiencyInPct());
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

    /** Database Time in seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseTimeInSec")
    private final Double databaseTimeInSec;

    /**
     * Database Time in seconds
     *
     * @return the value
     */
    public Double getDatabaseTimeInSec() {
        return databaseTimeInSec;
    }

    /** Number of executions per hour */
    @com.fasterxml.jackson.annotation.JsonProperty("executionsPerHour")
    private final Double executionsPerHour;

    /**
     * Number of executions per hour
     *
     * @return the value
     */
    public Double getExecutionsPerHour() {
        return executionsPerHour;
    }

    /** Total number of executions */
    @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
    private final Long executionsCount;

    /**
     * Total number of executions
     *
     * @return the value
     */
    public Long getExecutionsCount() {
        return executionsCount;
    }

    /** CPU Time in seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
    private final Double cpuTimeInSec;

    /**
     * CPU Time in seconds
     *
     * @return the value
     */
    public Double getCpuTimeInSec() {
        return cpuTimeInSec;
    }

    /** I/O Time in seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
    private final Double ioTimeInSec;

    /**
     * I/O Time in seconds
     *
     * @return the value
     */
    public Double getIoTimeInSec() {
        return ioTimeInSec;
    }

    /** Inefficient Wait Time in seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
    private final Double inefficientWaitTimeInSec;

    /**
     * Inefficient Wait Time in seconds
     *
     * @return the value
     */
    public Double getInefficientWaitTimeInSec() {
        return inefficientWaitTimeInSec;
    }

    /**
     * Response time is the average elaspsed time per execution. It is the ratio of Total Database
     * Time to the number of executions
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInSec")
    private final Double responseTimeInSec;

    /**
     * Response time is the average elaspsed time per execution. It is the ratio of Total Database
     * Time to the number of executions
     *
     * @return the value
     */
    public Double getResponseTimeInSec() {
        return responseTimeInSec;
    }

    /** Number of SQL execution plans used by the SQL */
    @com.fasterxml.jackson.annotation.JsonProperty("planCount")
    private final Long planCount;

    /**
     * Number of SQL execution plans used by the SQL
     *
     * @return the value
     */
    public Long getPlanCount() {
        return planCount;
    }

    /**
     * Variability is the ratio of the standard deviation in response time to the mean of response
     * time of the SQL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variability")
    private final Double variability;

    /**
     * Variability is the ratio of the standard deviation in response time to the mean of response
     * time of the SQL
     *
     * @return the value
     */
    public Double getVariability() {
        return variability;
    }

    /**
     * Average Active Sessions represent the average active sessions at a point in time. It is the
     * number of sessions that are either working or waiting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("averageActiveSessions")
    private final Double averageActiveSessions;

    /**
     * Average Active Sessions represent the average active sessions at a point in time. It is the
     * number of sessions that are either working or waiting.
     *
     * @return the value
     */
    public Double getAverageActiveSessions() {
        return averageActiveSessions;
    }

    /** Percentage of Database Time */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseTimePct")
    private final Double databaseTimePct;

    /**
     * Percentage of Database Time
     *
     * @return the value
     */
    public Double getDatabaseTimePct() {
        return databaseTimePct;
    }

    /**
     * Percentage of Inefficiency. It is calculated by Total Database Time divided by Total Wait
     * Time
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inefficiencyInPct")
    private final Double inefficiencyInPct;

    /**
     * Percentage of Inefficiency. It is calculated by Total Database Time divided by Total Wait
     * Time
     *
     * @return the value
     */
    public Double getInefficiencyInPct() {
        return inefficiencyInPct;
    }

    /** Percent change in CPU Time based on linear regression */
    @com.fasterxml.jackson.annotation.JsonProperty("changeInCpuTimeInPct")
    private final Double changeInCpuTimeInPct;

    /**
     * Percent change in CPU Time based on linear regression
     *
     * @return the value
     */
    public Double getChangeInCpuTimeInPct() {
        return changeInCpuTimeInPct;
    }

    /** Percent change in IO Time based on linear regression */
    @com.fasterxml.jackson.annotation.JsonProperty("changeInIoTimeInPct")
    private final Double changeInIoTimeInPct;

    /**
     * Percent change in IO Time based on linear regression
     *
     * @return the value
     */
    public Double getChangeInIoTimeInPct() {
        return changeInIoTimeInPct;
    }

    /** Percent change in Inefficient Wait Time based on linear regression */
    @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficientWaitTimeInPct")
    private final Double changeInInefficientWaitTimeInPct;

    /**
     * Percent change in Inefficient Wait Time based on linear regression
     *
     * @return the value
     */
    public Double getChangeInInefficientWaitTimeInPct() {
        return changeInInefficientWaitTimeInPct;
    }

    /** Percent change in Response Time based on linear regression */
    @com.fasterxml.jackson.annotation.JsonProperty("changeInResponseTimeInPct")
    private final Double changeInResponseTimeInPct;

    /**
     * Percent change in Response Time based on linear regression
     *
     * @return the value
     */
    public Double getChangeInResponseTimeInPct() {
        return changeInResponseTimeInPct;
    }

    /** Percent change in Average Active Sessions based on linear regression */
    @com.fasterxml.jackson.annotation.JsonProperty("changeInAverageActiveSessionsInPct")
    private final Double changeInAverageActiveSessionsInPct;

    /**
     * Percent change in Average Active Sessions based on linear regression
     *
     * @return the value
     */
    public Double getChangeInAverageActiveSessionsInPct() {
        return changeInAverageActiveSessionsInPct;
    }

    /** Percent change in Executions per hour based on linear regression */
    @com.fasterxml.jackson.annotation.JsonProperty("changeInExecutionsPerHourInPct")
    private final Double changeInExecutionsPerHourInPct;

    /**
     * Percent change in Executions per hour based on linear regression
     *
     * @return the value
     */
    public Double getChangeInExecutionsPerHourInPct() {
        return changeInExecutionsPerHourInPct;
    }

    /** Percent change in Inefficiency based on linear regression */
    @com.fasterxml.jackson.annotation.JsonProperty("changeInInefficiencyInPct")
    private final Double changeInInefficiencyInPct;

    /**
     * Percent change in Inefficiency based on linear regression
     *
     * @return the value
     */
    public Double getChangeInInefficiencyInPct() {
        return changeInInefficiencyInPct;
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
        sb.append("SqlStatistics(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
