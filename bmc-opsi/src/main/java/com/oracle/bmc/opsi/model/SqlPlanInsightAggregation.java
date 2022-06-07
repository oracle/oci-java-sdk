/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL execution plan Performance statistics.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlPlanInsightAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlPlanInsightAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "planHash",
        "ioTimeInSec",
        "cpuTimeInSec",
        "inefficientWaitTimeInSec",
        "executionsCount"
    })
    public SqlPlanInsightAggregation(
            Long planHash,
            Double ioTimeInSec,
            Double cpuTimeInSec,
            Double inefficientWaitTimeInSec,
            Long executionsCount) {
        super();
        this.planHash = planHash;
        this.ioTimeInSec = ioTimeInSec;
        this.cpuTimeInSec = cpuTimeInSec;
        this.inefficientWaitTimeInSec = inefficientWaitTimeInSec;
        this.executionsCount = executionsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private Long planHash;

        public Builder planHash(Long planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
        private Double ioTimeInSec;

        public Builder ioTimeInSec(Double ioTimeInSec) {
            this.ioTimeInSec = ioTimeInSec;
            this.__explicitlySet__.add("ioTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
        private Double cpuTimeInSec;

        public Builder cpuTimeInSec(Double cpuTimeInSec) {
            this.cpuTimeInSec = cpuTimeInSec;
            this.__explicitlySet__.add("cpuTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
        private Double inefficientWaitTimeInSec;

        public Builder inefficientWaitTimeInSec(Double inefficientWaitTimeInSec) {
            this.inefficientWaitTimeInSec = inefficientWaitTimeInSec;
            this.__explicitlySet__.add("inefficientWaitTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
        private Long executionsCount;

        public Builder executionsCount(Long executionsCount) {
            this.executionsCount = executionsCount;
            this.__explicitlySet__.add("executionsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanInsightAggregation build() {
            SqlPlanInsightAggregation __instance__ =
                    new SqlPlanInsightAggregation(
                            planHash,
                            ioTimeInSec,
                            cpuTimeInSec,
                            inefficientWaitTimeInSec,
                            executionsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanInsightAggregation o) {
            Builder copiedBuilder =
                    planHash(o.getPlanHash())
                            .ioTimeInSec(o.getIoTimeInSec())
                            .cpuTimeInSec(o.getCpuTimeInSec())
                            .inefficientWaitTimeInSec(o.getInefficientWaitTimeInSec())
                            .executionsCount(o.getExecutionsCount());

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
     * Plan hash value for the SQL Execution Plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    private final Long planHash;

    public Long getPlanHash() {
        return planHash;
    }

    /**
     * IO Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
    private final Double ioTimeInSec;

    public Double getIoTimeInSec() {
        return ioTimeInSec;
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
     * Inefficient Wait Time in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inefficientWaitTimeInSec")
    private final Double inefficientWaitTimeInSec;

    public Double getInefficientWaitTimeInSec() {
        return inefficientWaitTimeInSec;
    }

    /**
     * Total number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
    private final Long executionsCount;

    public Long getExecutionsCount() {
        return executionsCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlPlanInsightAggregation(");
        sb.append("planHash=").append(String.valueOf(this.planHash));
        sb.append(", ioTimeInSec=").append(String.valueOf(this.ioTimeInSec));
        sb.append(", cpuTimeInSec=").append(String.valueOf(this.cpuTimeInSec));
        sb.append(", inefficientWaitTimeInSec=")
                .append(String.valueOf(this.inefficientWaitTimeInSec));
        sb.append(", executionsCount=").append(String.valueOf(this.executionsCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlPlanInsightAggregation)) {
            return false;
        }

        SqlPlanInsightAggregation other = (SqlPlanInsightAggregation) o;
        return java.util.Objects.equals(this.planHash, other.planHash)
                && java.util.Objects.equals(this.ioTimeInSec, other.ioTimeInSec)
                && java.util.Objects.equals(this.cpuTimeInSec, other.cpuTimeInSec)
                && java.util.Objects.equals(
                        this.inefficientWaitTimeInSec, other.inefficientWaitTimeInSec)
                && java.util.Objects.equals(this.executionsCount, other.executionsCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planHash == null ? 43 : this.planHash.hashCode());
        result = (result * PRIME) + (this.ioTimeInSec == null ? 43 : this.ioTimeInSec.hashCode());
        result = (result * PRIME) + (this.cpuTimeInSec == null ? 43 : this.cpuTimeInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.inefficientWaitTimeInSec == null
                                ? 43
                                : this.inefficientWaitTimeInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.executionsCount == null ? 43 : this.executionsCount.hashCode());
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
