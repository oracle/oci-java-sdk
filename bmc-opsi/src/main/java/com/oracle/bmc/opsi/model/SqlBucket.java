/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Sql bucket type object.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlBucket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlBucket {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Float version;

        public Builder version(Float version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private String databaseType;

        public Builder databaseType(String databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private Long planHash;

        public Builder planHash(Long planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketId")
        private String bucketId;

        public Builder bucketId(String bucketId) {
            this.bucketId = bucketId;
            this.__explicitlySet__.add("bucketId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
        private Integer executionsCount;

        public Builder executionsCount(Integer executionsCount) {
            this.executionsCount = executionsCount;
            this.__explicitlySet__.add("executionsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
        private Float cpuTimeInSec;

        public Builder cpuTimeInSec(Float cpuTimeInSec) {
            this.cpuTimeInSec = cpuTimeInSec;
            this.__explicitlySet__.add("cpuTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
        private Float ioTimeInSec;

        public Builder ioTimeInSec(Float ioTimeInSec) {
            this.ioTimeInSec = ioTimeInSec;
            this.__explicitlySet__.add("ioTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("otherWaitTimeInSec")
        private Float otherWaitTimeInSec;

        public Builder otherWaitTimeInSec(Float otherWaitTimeInSec) {
            this.otherWaitTimeInSec = otherWaitTimeInSec;
            this.__explicitlySet__.add("otherWaitTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalTimeInSec")
        private Float totalTimeInSec;

        public Builder totalTimeInSec(Float totalTimeInSec) {
            this.totalTimeInSec = totalTimeInSec;
            this.__explicitlySet__.add("totalTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlBucket build() {
            SqlBucket __instance__ =
                    new SqlBucket(
                            version,
                            databaseType,
                            timeCollected,
                            sqlIdentifier,
                            planHash,
                            bucketId,
                            executionsCount,
                            cpuTimeInSec,
                            ioTimeInSec,
                            otherWaitTimeInSec,
                            totalTimeInSec);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlBucket o) {
            Builder copiedBuilder =
                    version(o.getVersion())
                            .databaseType(o.getDatabaseType())
                            .timeCollected(o.getTimeCollected())
                            .sqlIdentifier(o.getSqlIdentifier())
                            .planHash(o.getPlanHash())
                            .bucketId(o.getBucketId())
                            .executionsCount(o.getExecutionsCount())
                            .cpuTimeInSec(o.getCpuTimeInSec())
                            .ioTimeInSec(o.getIoTimeInSec())
                            .otherWaitTimeInSec(o.getOtherWaitTimeInSec())
                            .totalTimeInSec(o.getTotalTimeInSec());

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
     * Version
     * Example: {@code 1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    Float version;

    /**
     * Operations Insights internal representation of the database type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    String databaseType;

    /**
     * Collection timestamp
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    java.util.Date timeCollected;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    String sqlIdentifier;

    /**
     * Plan hash value for the SQL Execution Plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    Long planHash;

    /**
     * SQL Bucket ID, examples <= 3 secs, 3-10 secs, 10-60 secs, 1-5 min, > 5 min
     * Example: {@code "<= 3 secs"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketId")
    String bucketId;

    /**
     * Total number of executions
     * Example: {@code 60}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
    Integer executionsCount;

    /**
     * Total CPU time
     * Example: {@code 1046}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
    Float cpuTimeInSec;

    /**
     * Total IO time
     * Example: {@code 5810}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
    Float ioTimeInSec;

    /**
     * Total other wait time
     * Example: {@code 24061}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otherWaitTimeInSec")
    Float otherWaitTimeInSec;

    /**
     * Total time
     * Example: {@code 30917}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalTimeInSec")
    Float totalTimeInSec;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
