/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlBucket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlBucket {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "databaseType",
        "timeCollected",
        "sqlIdentifier",
        "planHash",
        "bucketId",
        "executionsCount",
        "cpuTimeInSec",
        "ioTimeInSec",
        "otherWaitTimeInSec",
        "totalTimeInSec"
    })
    public SqlBucket(
            Float version,
            String databaseType,
            java.util.Date timeCollected,
            String sqlIdentifier,
            Long planHash,
            String bucketId,
            Integer executionsCount,
            Float cpuTimeInSec,
            Float ioTimeInSec,
            Float otherWaitTimeInSec,
            Float totalTimeInSec) {
        super();
        this.version = version;
        this.databaseType = databaseType;
        this.timeCollected = timeCollected;
        this.sqlIdentifier = sqlIdentifier;
        this.planHash = planHash;
        this.bucketId = bucketId;
        this.executionsCount = executionsCount;
        this.cpuTimeInSec = cpuTimeInSec;
        this.ioTimeInSec = ioTimeInSec;
        this.otherWaitTimeInSec = otherWaitTimeInSec;
        this.totalTimeInSec = totalTimeInSec;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Version
     * Example: {@code 1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Float version;

    public Float getVersion() {
        return version;
    }

    /**
     * Operations Insights internal representation of the database type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final String databaseType;

    public String getDatabaseType() {
        return databaseType;
    }

    /**
     * Collection timestamp
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    private final String sqlIdentifier;

    public String getSqlIdentifier() {
        return sqlIdentifier;
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
     * SQL Bucket ID, examples <= 3 secs, 3-10 secs, 10-60 secs, 1-5 min, > 5 min
     * Example: {@code "<= 3 secs"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketId")
    private final String bucketId;

    public String getBucketId() {
        return bucketId;
    }

    /**
     * Total number of executions
     * Example: {@code 60}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
    private final Integer executionsCount;

    public Integer getExecutionsCount() {
        return executionsCount;
    }

    /**
     * Total CPU time
     * Example: {@code 1046}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInSec")
    private final Float cpuTimeInSec;

    public Float getCpuTimeInSec() {
        return cpuTimeInSec;
    }

    /**
     * Total IO time
     * Example: {@code 5810}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioTimeInSec")
    private final Float ioTimeInSec;

    public Float getIoTimeInSec() {
        return ioTimeInSec;
    }

    /**
     * Total other wait time
     * Example: {@code 24061}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otherWaitTimeInSec")
    private final Float otherWaitTimeInSec;

    public Float getOtherWaitTimeInSec() {
        return otherWaitTimeInSec;
    }

    /**
     * Total time
     * Example: {@code 30917}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalTimeInSec")
    private final Float totalTimeInSec;

    public Float getTotalTimeInSec() {
        return totalTimeInSec;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlBucket(");
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(", planHash=").append(String.valueOf(this.planHash));
        sb.append(", bucketId=").append(String.valueOf(this.bucketId));
        sb.append(", executionsCount=").append(String.valueOf(this.executionsCount));
        sb.append(", cpuTimeInSec=").append(String.valueOf(this.cpuTimeInSec));
        sb.append(", ioTimeInSec=").append(String.valueOf(this.ioTimeInSec));
        sb.append(", otherWaitTimeInSec=").append(String.valueOf(this.otherWaitTimeInSec));
        sb.append(", totalTimeInSec=").append(String.valueOf(this.totalTimeInSec));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlBucket)) {
            return false;
        }

        SqlBucket other = (SqlBucket) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.planHash, other.planHash)
                && java.util.Objects.equals(this.bucketId, other.bucketId)
                && java.util.Objects.equals(this.executionsCount, other.executionsCount)
                && java.util.Objects.equals(this.cpuTimeInSec, other.cpuTimeInSec)
                && java.util.Objects.equals(this.ioTimeInSec, other.ioTimeInSec)
                && java.util.Objects.equals(this.otherWaitTimeInSec, other.otherWaitTimeInSec)
                && java.util.Objects.equals(this.totalTimeInSec, other.totalTimeInSec)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result = (result * PRIME) + (this.planHash == null ? 43 : this.planHash.hashCode());
        result = (result * PRIME) + (this.bucketId == null ? 43 : this.bucketId.hashCode());
        result =
                (result * PRIME)
                        + (this.executionsCount == null ? 43 : this.executionsCount.hashCode());
        result = (result * PRIME) + (this.cpuTimeInSec == null ? 43 : this.cpuTimeInSec.hashCode());
        result = (result * PRIME) + (this.ioTimeInSec == null ? 43 : this.ioTimeInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.otherWaitTimeInSec == null
                                ? 43
                                : this.otherWaitTimeInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.totalTimeInSec == null ? 43 : this.totalTimeInSec.hashCode());
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
