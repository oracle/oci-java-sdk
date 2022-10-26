/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL execution plan Performance statistics. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlPlanInsightAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SqlPlanInsightAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Plan hash value for the SQL Execution Plan */
        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private Long planHash;

        /**
         * Plan hash value for the SQL Execution Plan
         *
         * @param planHash the value to set
         * @return this builder
         */
        public Builder planHash(Long planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }
        /** IO Time in seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
        private Double ioTimeInSec;

        /**
         * IO Time in seconds
         *
         * @param ioTimeInSec the value to set
         * @return this builder
         */
        public Builder ioTimeInSec(Double ioTimeInSec) {
            this.ioTimeInSec = ioTimeInSec;
            this.__explicitlySet__.add("ioTimeInSec");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanInsightAggregation build() {
            SqlPlanInsightAggregation model =
                    new SqlPlanInsightAggregation(
                            this.planHash,
                            this.ioTimeInSec,
                            this.cpuTimeInSec,
                            this.inefficientWaitTimeInSec,
                            this.executionsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanInsightAggregation model) {
            if (model.wasPropertyExplicitlySet("planHash")) {
                this.planHash(model.getPlanHash());
            }
            if (model.wasPropertyExplicitlySet("ioTimeInSec")) {
                this.ioTimeInSec(model.getIoTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("cpuTimeInSec")) {
                this.cpuTimeInSec(model.getCpuTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("inefficientWaitTimeInSec")) {
                this.inefficientWaitTimeInSec(model.getInefficientWaitTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("executionsCount")) {
                this.executionsCount(model.getExecutionsCount());
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

    /** Plan hash value for the SQL Execution Plan */
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    private final Long planHash;

    /**
     * Plan hash value for the SQL Execution Plan
     *
     * @return the value
     */
    public Long getPlanHash() {
        return planHash;
    }

    /** IO Time in seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
    private final Double ioTimeInSec;

    /**
     * IO Time in seconds
     *
     * @return the value
     */
    public Double getIoTimeInSec() {
        return ioTimeInSec;
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
        sb.append("SqlPlanInsightAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("planHash=").append(String.valueOf(this.planHash));
        sb.append(", ioTimeInSec=").append(String.valueOf(this.ioTimeInSec));
        sb.append(", cpuTimeInSec=").append(String.valueOf(this.cpuTimeInSec));
        sb.append(", inefficientWaitTimeInSec=")
                .append(String.valueOf(this.inefficientWaitTimeInSec));
        sb.append(", executionsCount=").append(String.valueOf(this.executionsCount));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
