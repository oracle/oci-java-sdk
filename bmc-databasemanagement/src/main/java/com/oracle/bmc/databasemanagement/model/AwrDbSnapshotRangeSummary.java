/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary data for a range of AWR snapshots.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbSnapshotRangeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDbSnapshotRangeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "awrDbId",
        "dbName",
        "instanceList",
        "timeDbStartup",
        "timeFirstSnapshotBegin",
        "timeLatestSnapshotEnd",
        "firstSnapshotId",
        "latestSnapshotId",
        "snapshotCount",
        "snapshotIntervalInMin",
        "containerId",
        "dbVersion",
        "snapshotTimezone"
    })
    public AwrDbSnapshotRangeSummary(
            String awrDbId,
            String dbName,
            java.util.List<Integer> instanceList,
            java.util.Date timeDbStartup,
            java.util.Date timeFirstSnapshotBegin,
            java.util.Date timeLatestSnapshotEnd,
            Integer firstSnapshotId,
            Integer latestSnapshotId,
            Long snapshotCount,
            Integer snapshotIntervalInMin,
            Integer containerId,
            String dbVersion,
            String snapshotTimezone) {
        super();
        this.awrDbId = awrDbId;
        this.dbName = dbName;
        this.instanceList = instanceList;
        this.timeDbStartup = timeDbStartup;
        this.timeFirstSnapshotBegin = timeFirstSnapshotBegin;
        this.timeLatestSnapshotEnd = timeLatestSnapshotEnd;
        this.firstSnapshotId = firstSnapshotId;
        this.latestSnapshotId = latestSnapshotId;
        this.snapshotCount = snapshotCount;
        this.snapshotIntervalInMin = snapshotIntervalInMin;
        this.containerId = containerId;
        this.dbVersion = dbVersion;
        this.snapshotTimezone = snapshotTimezone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("awrDbId")
        private String awrDbId;

        public Builder awrDbId(String awrDbId) {
            this.awrDbId = awrDbId;
            this.__explicitlySet__.add("awrDbId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceList")
        private java.util.List<Integer> instanceList;

        public Builder instanceList(java.util.List<Integer> instanceList) {
            this.instanceList = instanceList;
            this.__explicitlySet__.add("instanceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
        private java.util.Date timeDbStartup;

        public Builder timeDbStartup(java.util.Date timeDbStartup) {
            this.timeDbStartup = timeDbStartup;
            this.__explicitlySet__.add("timeDbStartup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotBegin")
        private java.util.Date timeFirstSnapshotBegin;

        public Builder timeFirstSnapshotBegin(java.util.Date timeFirstSnapshotBegin) {
            this.timeFirstSnapshotBegin = timeFirstSnapshotBegin;
            this.__explicitlySet__.add("timeFirstSnapshotBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSnapshotEnd")
        private java.util.Date timeLatestSnapshotEnd;

        public Builder timeLatestSnapshotEnd(java.util.Date timeLatestSnapshotEnd) {
            this.timeLatestSnapshotEnd = timeLatestSnapshotEnd;
            this.__explicitlySet__.add("timeLatestSnapshotEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("firstSnapshotId")
        private Integer firstSnapshotId;

        public Builder firstSnapshotId(Integer firstSnapshotId) {
            this.firstSnapshotId = firstSnapshotId;
            this.__explicitlySet__.add("firstSnapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latestSnapshotId")
        private Integer latestSnapshotId;

        public Builder latestSnapshotId(Integer latestSnapshotId) {
            this.latestSnapshotId = latestSnapshotId;
            this.__explicitlySet__.add("latestSnapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotCount")
        private Long snapshotCount;

        public Builder snapshotCount(Long snapshotCount) {
            this.snapshotCount = snapshotCount;
            this.__explicitlySet__.add("snapshotCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalInMin")
        private Integer snapshotIntervalInMin;

        public Builder snapshotIntervalInMin(Integer snapshotIntervalInMin) {
            this.snapshotIntervalInMin = snapshotIntervalInMin;
            this.__explicitlySet__.add("snapshotIntervalInMin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("containerId")
        private Integer containerId;

        public Builder containerId(Integer containerId) {
            this.containerId = containerId;
            this.__explicitlySet__.add("containerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotTimezone")
        private String snapshotTimezone;

        public Builder snapshotTimezone(String snapshotTimezone) {
            this.snapshotTimezone = snapshotTimezone;
            this.__explicitlySet__.add("snapshotTimezone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbSnapshotRangeSummary build() {
            AwrDbSnapshotRangeSummary __instance__ =
                    new AwrDbSnapshotRangeSummary(
                            awrDbId,
                            dbName,
                            instanceList,
                            timeDbStartup,
                            timeFirstSnapshotBegin,
                            timeLatestSnapshotEnd,
                            firstSnapshotId,
                            latestSnapshotId,
                            snapshotCount,
                            snapshotIntervalInMin,
                            containerId,
                            dbVersion,
                            snapshotTimezone);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbSnapshotRangeSummary o) {
            Builder copiedBuilder =
                    awrDbId(o.getAwrDbId())
                            .dbName(o.getDbName())
                            .instanceList(o.getInstanceList())
                            .timeDbStartup(o.getTimeDbStartup())
                            .timeFirstSnapshotBegin(o.getTimeFirstSnapshotBegin())
                            .timeLatestSnapshotEnd(o.getTimeLatestSnapshotEnd())
                            .firstSnapshotId(o.getFirstSnapshotId())
                            .latestSnapshotId(o.getLatestSnapshotId())
                            .snapshotCount(o.getSnapshotCount())
                            .snapshotIntervalInMin(o.getSnapshotIntervalInMin())
                            .containerId(o.getContainerId())
                            .dbVersion(o.getDbVersion())
                            .snapshotTimezone(o.getSnapshotTimezone());

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
     * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrDbId")
    private final String awrDbId;

    public String getAwrDbId() {
        return awrDbId;
    }

    /**
     * The name of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    public String getDbName() {
        return dbName;
    }

    /**
     * The database instance numbers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceList")
    private final java.util.List<Integer> instanceList;

    public java.util.List<Integer> getInstanceList() {
        return instanceList;
    }

    /**
     * The timestamp of the database startup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
    private final java.util.Date timeDbStartup;

    public java.util.Date getTimeDbStartup() {
        return timeDbStartup;
    }

    /**
     * The start time of the earliest snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotBegin")
    private final java.util.Date timeFirstSnapshotBegin;

    public java.util.Date getTimeFirstSnapshotBegin() {
        return timeFirstSnapshotBegin;
    }

    /**
     * The end time of the latest snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSnapshotEnd")
    private final java.util.Date timeLatestSnapshotEnd;

    public java.util.Date getTimeLatestSnapshotEnd() {
        return timeLatestSnapshotEnd;
    }

    /**
     * The ID of the earliest snapshot. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstSnapshotId")
    private final Integer firstSnapshotId;

    public Integer getFirstSnapshotId() {
        return firstSnapshotId;
    }

    /**
     * The ID of the latest snapshot. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestSnapshotId")
    private final Integer latestSnapshotId;

    public Integer getLatestSnapshotId() {
        return latestSnapshotId;
    }

    /**
     * The total number of snapshots.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotCount")
    private final Long snapshotCount;

    public Long getSnapshotCount() {
        return snapshotCount;
    }

    /**
     * The interval time between snapshots (in minutes).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalInMin")
    private final Integer snapshotIntervalInMin;

    public Integer getSnapshotIntervalInMin() {
        return snapshotIntervalInMin;
    }

    /**
     * ID of the database container. The database container ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbSnapshotRanges
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerId")
    private final Integer containerId;

    public Integer getContainerId() {
        return containerId;
    }

    /**
     * The version of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The time zone of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotTimezone")
    private final String snapshotTimezone;

    public String getSnapshotTimezone() {
        return snapshotTimezone;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrDbSnapshotRangeSummary(");
        sb.append("awrDbId=").append(String.valueOf(this.awrDbId));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", instanceList=").append(String.valueOf(this.instanceList));
        sb.append(", timeDbStartup=").append(String.valueOf(this.timeDbStartup));
        sb.append(", timeFirstSnapshotBegin=").append(String.valueOf(this.timeFirstSnapshotBegin));
        sb.append(", timeLatestSnapshotEnd=").append(String.valueOf(this.timeLatestSnapshotEnd));
        sb.append(", firstSnapshotId=").append(String.valueOf(this.firstSnapshotId));
        sb.append(", latestSnapshotId=").append(String.valueOf(this.latestSnapshotId));
        sb.append(", snapshotCount=").append(String.valueOf(this.snapshotCount));
        sb.append(", snapshotIntervalInMin=").append(String.valueOf(this.snapshotIntervalInMin));
        sb.append(", containerId=").append(String.valueOf(this.containerId));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", snapshotTimezone=").append(String.valueOf(this.snapshotTimezone));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbSnapshotRangeSummary)) {
            return false;
        }

        AwrDbSnapshotRangeSummary other = (AwrDbSnapshotRangeSummary) o;
        return java.util.Objects.equals(this.awrDbId, other.awrDbId)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.instanceList, other.instanceList)
                && java.util.Objects.equals(this.timeDbStartup, other.timeDbStartup)
                && java.util.Objects.equals(
                        this.timeFirstSnapshotBegin, other.timeFirstSnapshotBegin)
                && java.util.Objects.equals(this.timeLatestSnapshotEnd, other.timeLatestSnapshotEnd)
                && java.util.Objects.equals(this.firstSnapshotId, other.firstSnapshotId)
                && java.util.Objects.equals(this.latestSnapshotId, other.latestSnapshotId)
                && java.util.Objects.equals(this.snapshotCount, other.snapshotCount)
                && java.util.Objects.equals(this.snapshotIntervalInMin, other.snapshotIntervalInMin)
                && java.util.Objects.equals(this.containerId, other.containerId)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.snapshotTimezone, other.snapshotTimezone)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.awrDbId == null ? 43 : this.awrDbId.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.instanceList == null ? 43 : this.instanceList.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDbStartup == null ? 43 : this.timeDbStartup.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSnapshotBegin == null
                                ? 43
                                : this.timeFirstSnapshotBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLatestSnapshotEnd == null
                                ? 43
                                : this.timeLatestSnapshotEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.firstSnapshotId == null ? 43 : this.firstSnapshotId.hashCode());
        result =
                (result * PRIME)
                        + (this.latestSnapshotId == null ? 43 : this.latestSnapshotId.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotCount == null ? 43 : this.snapshotCount.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotIntervalInMin == null
                                ? 43
                                : this.snapshotIntervalInMin.hashCode());
        result = (result * PRIME) + (this.containerId == null ? 43 : this.containerId.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotTimezone == null ? 43 : this.snapshotTimezone.hashCode());
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
