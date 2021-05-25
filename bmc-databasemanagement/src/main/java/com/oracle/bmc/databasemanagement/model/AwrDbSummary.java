/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The AWR summary for a database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwrDbSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AwrDbSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        public AwrDbSummary build() {
            AwrDbSummary __instance__ =
                    new AwrDbSummary(
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
        public Builder copy(AwrDbSummary o) {
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

    /**
     * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrDbId")
    String awrDbId;

    /**
     * The name of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    String dbName;

    /**
     * The database instance numbers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceList")
    java.util.List<Integer> instanceList;

    /**
     * The timestamp of the database startup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
    java.util.Date timeDbStartup;

    /**
     * The start time of the earliest snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotBegin")
    java.util.Date timeFirstSnapshotBegin;

    /**
     * The end time of the latest snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSnapshotEnd")
    java.util.Date timeLatestSnapshotEnd;

    /**
     * The ID of the earliest snapshot. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstSnapshotId")
    Integer firstSnapshotId;

    /**
     * The ID of the latest snapshot. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestSnapshotId")
    Integer latestSnapshotId;

    /**
     * The total number of snapshots.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotCount")
    Long snapshotCount;

    /**
     * The interval time between snapshots (in minutes).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalInMin")
    Integer snapshotIntervalInMin;

    /**
     * ID of the database container. The database container ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbSnapshotRanges
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerId")
    Integer containerId;

    /**
     * The version of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    String dbVersion;

    /**
     * The time zone of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotTimezone")
    String snapshotTimezone;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
