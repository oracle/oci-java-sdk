/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDatabaseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDatabaseSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "awrSourceDatabaseIdentifier",
        "dbName",
        "instanceList",
        "timeDbStartup",
        "timeFirstSnapshotBegin",
        "timeLatestSnapshotEnd",
        "firstSnapshotIdentifier",
        "latestSnapshotIdentifier",
        "snapshotCount",
        "snapshotIntervalInMin",
        "dbVersion",
        "snapshotTimezone"
    })
    public AwrDatabaseSummary(
            String awrSourceDatabaseIdentifier,
            String dbName,
            java.util.List<Integer> instanceList,
            java.util.Date timeDbStartup,
            java.util.Date timeFirstSnapshotBegin,
            java.util.Date timeLatestSnapshotEnd,
            Integer firstSnapshotIdentifier,
            Integer latestSnapshotIdentifier,
            Long snapshotCount,
            Integer snapshotIntervalInMin,
            String dbVersion,
            String snapshotTimezone) {
        super();
        this.awrSourceDatabaseIdentifier = awrSourceDatabaseIdentifier;
        this.dbName = dbName;
        this.instanceList = instanceList;
        this.timeDbStartup = timeDbStartup;
        this.timeFirstSnapshotBegin = timeFirstSnapshotBegin;
        this.timeLatestSnapshotEnd = timeLatestSnapshotEnd;
        this.firstSnapshotIdentifier = firstSnapshotIdentifier;
        this.latestSnapshotIdentifier = latestSnapshotIdentifier;
        this.snapshotCount = snapshotCount;
        this.snapshotIntervalInMin = snapshotIntervalInMin;
        this.dbVersion = dbVersion;
        this.snapshotTimezone = snapshotTimezone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /awrHubs/{awrHubId}/awrDatabases
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseIdentifier")
        private String awrSourceDatabaseIdentifier;

        /**
         * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /awrHubs/{awrHubId}/awrDatabases
         *
         * @param awrSourceDatabaseIdentifier the value to set
         * @return this builder
         **/
        public Builder awrSourceDatabaseIdentifier(String awrSourceDatabaseIdentifier) {
            this.awrSourceDatabaseIdentifier = awrSourceDatabaseIdentifier;
            this.__explicitlySet__.add("awrSourceDatabaseIdentifier");
            return this;
        }
        /**
         * The name of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The name of the database.
         * @param dbName the value to set
         * @return this builder
         **/
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /**
         * The database instance numbers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceList")
        private java.util.List<Integer> instanceList;

        /**
         * The database instance numbers.
         * @param instanceList the value to set
         * @return this builder
         **/
        public Builder instanceList(java.util.List<Integer> instanceList) {
            this.instanceList = instanceList;
            this.__explicitlySet__.add("instanceList");
            return this;
        }
        /**
         * The timestamp of the database startup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
        private java.util.Date timeDbStartup;

        /**
         * The timestamp of the database startup.
         * @param timeDbStartup the value to set
         * @return this builder
         **/
        public Builder timeDbStartup(java.util.Date timeDbStartup) {
            this.timeDbStartup = timeDbStartup;
            this.__explicitlySet__.add("timeDbStartup");
            return this;
        }
        /**
         * The start time of the earliest snapshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotBegin")
        private java.util.Date timeFirstSnapshotBegin;

        /**
         * The start time of the earliest snapshot.
         * @param timeFirstSnapshotBegin the value to set
         * @return this builder
         **/
        public Builder timeFirstSnapshotBegin(java.util.Date timeFirstSnapshotBegin) {
            this.timeFirstSnapshotBegin = timeFirstSnapshotBegin;
            this.__explicitlySet__.add("timeFirstSnapshotBegin");
            return this;
        }
        /**
         * The end time of the latest snapshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSnapshotEnd")
        private java.util.Date timeLatestSnapshotEnd;

        /**
         * The end time of the latest snapshot.
         * @param timeLatestSnapshotEnd the value to set
         * @return this builder
         **/
        public Builder timeLatestSnapshotEnd(java.util.Date timeLatestSnapshotEnd) {
            this.timeLatestSnapshotEnd = timeLatestSnapshotEnd;
            this.__explicitlySet__.add("timeLatestSnapshotEnd");
            return this;
        }
        /**
         * The ID of the earliest snapshot. The snapshot identifier is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /awrHubs/{awrHubId}/awrDatabaseSnapshots
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firstSnapshotIdentifier")
        private Integer firstSnapshotIdentifier;

        /**
         * The ID of the earliest snapshot. The snapshot identifier is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /awrHubs/{awrHubId}/awrDatabaseSnapshots
         *
         * @param firstSnapshotIdentifier the value to set
         * @return this builder
         **/
        public Builder firstSnapshotIdentifier(Integer firstSnapshotIdentifier) {
            this.firstSnapshotIdentifier = firstSnapshotIdentifier;
            this.__explicitlySet__.add("firstSnapshotIdentifier");
            return this;
        }
        /**
         * The ID of the latest snapshot. The snapshot identifier is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /awrHubs/{awrHubId}/awrDatabaseSnapshots
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latestSnapshotIdentifier")
        private Integer latestSnapshotIdentifier;

        /**
         * The ID of the latest snapshot. The snapshot identifier is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /awrHubs/{awrHubId}/awrDatabaseSnapshots
         *
         * @param latestSnapshotIdentifier the value to set
         * @return this builder
         **/
        public Builder latestSnapshotIdentifier(Integer latestSnapshotIdentifier) {
            this.latestSnapshotIdentifier = latestSnapshotIdentifier;
            this.__explicitlySet__.add("latestSnapshotIdentifier");
            return this;
        }
        /**
         * The total number of snapshots.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotCount")
        private Long snapshotCount;

        /**
         * The total number of snapshots.
         * @param snapshotCount the value to set
         * @return this builder
         **/
        public Builder snapshotCount(Long snapshotCount) {
            this.snapshotCount = snapshotCount;
            this.__explicitlySet__.add("snapshotCount");
            return this;
        }
        /**
         * The interval time between snapshots (in minutes).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalInMin")
        private Integer snapshotIntervalInMin;

        /**
         * The interval time between snapshots (in minutes).
         * @param snapshotIntervalInMin the value to set
         * @return this builder
         **/
        public Builder snapshotIntervalInMin(Integer snapshotIntervalInMin) {
            this.snapshotIntervalInMin = snapshotIntervalInMin;
            this.__explicitlySet__.add("snapshotIntervalInMin");
            return this;
        }
        /**
         * The version of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * The version of the database.
         * @param dbVersion the value to set
         * @return this builder
         **/
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * The time zone of the snapshot. sample -  snapshotTimezone=+0 00:00:00
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotTimezone")
        private String snapshotTimezone;

        /**
         * The time zone of the snapshot. sample -  snapshotTimezone=+0 00:00:00
         * @param snapshotTimezone the value to set
         * @return this builder
         **/
        public Builder snapshotTimezone(String snapshotTimezone) {
            this.snapshotTimezone = snapshotTimezone;
            this.__explicitlySet__.add("snapshotTimezone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDatabaseSummary build() {
            AwrDatabaseSummary __instance__ =
                    new AwrDatabaseSummary(
                            awrSourceDatabaseIdentifier,
                            dbName,
                            instanceList,
                            timeDbStartup,
                            timeFirstSnapshotBegin,
                            timeLatestSnapshotEnd,
                            firstSnapshotIdentifier,
                            latestSnapshotIdentifier,
                            snapshotCount,
                            snapshotIntervalInMin,
                            dbVersion,
                            snapshotTimezone);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDatabaseSummary o) {
            Builder copiedBuilder =
                    awrSourceDatabaseIdentifier(o.getAwrSourceDatabaseIdentifier())
                            .dbName(o.getDbName())
                            .instanceList(o.getInstanceList())
                            .timeDbStartup(o.getTimeDbStartup())
                            .timeFirstSnapshotBegin(o.getTimeFirstSnapshotBegin())
                            .timeLatestSnapshotEnd(o.getTimeLatestSnapshotEnd())
                            .firstSnapshotIdentifier(o.getFirstSnapshotIdentifier())
                            .latestSnapshotIdentifier(o.getLatestSnapshotIdentifier())
                            .snapshotCount(o.getSnapshotCount())
                            .snapshotIntervalInMin(o.getSnapshotIntervalInMin())
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
     * /awrHubs/{awrHubId}/awrDatabases
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseIdentifier")
    private final String awrSourceDatabaseIdentifier;

    /**
     * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /awrHubs/{awrHubId}/awrDatabases
     *
     * @return the value
     **/
    public String getAwrSourceDatabaseIdentifier() {
        return awrSourceDatabaseIdentifier;
    }

    /**
     * The name of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The name of the database.
     * @return the value
     **/
    public String getDbName() {
        return dbName;
    }

    /**
     * The database instance numbers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceList")
    private final java.util.List<Integer> instanceList;

    /**
     * The database instance numbers.
     * @return the value
     **/
    public java.util.List<Integer> getInstanceList() {
        return instanceList;
    }

    /**
     * The timestamp of the database startup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
    private final java.util.Date timeDbStartup;

    /**
     * The timestamp of the database startup.
     * @return the value
     **/
    public java.util.Date getTimeDbStartup() {
        return timeDbStartup;
    }

    /**
     * The start time of the earliest snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotBegin")
    private final java.util.Date timeFirstSnapshotBegin;

    /**
     * The start time of the earliest snapshot.
     * @return the value
     **/
    public java.util.Date getTimeFirstSnapshotBegin() {
        return timeFirstSnapshotBegin;
    }

    /**
     * The end time of the latest snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSnapshotEnd")
    private final java.util.Date timeLatestSnapshotEnd;

    /**
     * The end time of the latest snapshot.
     * @return the value
     **/
    public java.util.Date getTimeLatestSnapshotEnd() {
        return timeLatestSnapshotEnd;
    }

    /**
     * The ID of the earliest snapshot. The snapshot identifier is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /awrHubs/{awrHubId}/awrDatabaseSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstSnapshotIdentifier")
    private final Integer firstSnapshotIdentifier;

    /**
     * The ID of the earliest snapshot. The snapshot identifier is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /awrHubs/{awrHubId}/awrDatabaseSnapshots
     *
     * @return the value
     **/
    public Integer getFirstSnapshotIdentifier() {
        return firstSnapshotIdentifier;
    }

    /**
     * The ID of the latest snapshot. The snapshot identifier is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /awrHubs/{awrHubId}/awrDatabaseSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestSnapshotIdentifier")
    private final Integer latestSnapshotIdentifier;

    /**
     * The ID of the latest snapshot. The snapshot identifier is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /awrHubs/{awrHubId}/awrDatabaseSnapshots
     *
     * @return the value
     **/
    public Integer getLatestSnapshotIdentifier() {
        return latestSnapshotIdentifier;
    }

    /**
     * The total number of snapshots.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotCount")
    private final Long snapshotCount;

    /**
     * The total number of snapshots.
     * @return the value
     **/
    public Long getSnapshotCount() {
        return snapshotCount;
    }

    /**
     * The interval time between snapshots (in minutes).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalInMin")
    private final Integer snapshotIntervalInMin;

    /**
     * The interval time between snapshots (in minutes).
     * @return the value
     **/
    public Integer getSnapshotIntervalInMin() {
        return snapshotIntervalInMin;
    }

    /**
     * The version of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * The version of the database.
     * @return the value
     **/
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The time zone of the snapshot. sample -  snapshotTimezone=+0 00:00:00
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotTimezone")
    private final String snapshotTimezone;

    /**
     * The time zone of the snapshot. sample -  snapshotTimezone=+0 00:00:00
     * @return the value
     **/
    public String getSnapshotTimezone() {
        return snapshotTimezone;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrDatabaseSummary(");
        sb.append("awrSourceDatabaseIdentifier=")
                .append(String.valueOf(this.awrSourceDatabaseIdentifier));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", instanceList=").append(String.valueOf(this.instanceList));
        sb.append(", timeDbStartup=").append(String.valueOf(this.timeDbStartup));
        sb.append(", timeFirstSnapshotBegin=").append(String.valueOf(this.timeFirstSnapshotBegin));
        sb.append(", timeLatestSnapshotEnd=").append(String.valueOf(this.timeLatestSnapshotEnd));
        sb.append(", firstSnapshotIdentifier=")
                .append(String.valueOf(this.firstSnapshotIdentifier));
        sb.append(", latestSnapshotIdentifier=")
                .append(String.valueOf(this.latestSnapshotIdentifier));
        sb.append(", snapshotCount=").append(String.valueOf(this.snapshotCount));
        sb.append(", snapshotIntervalInMin=").append(String.valueOf(this.snapshotIntervalInMin));
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
        if (!(o instanceof AwrDatabaseSummary)) {
            return false;
        }

        AwrDatabaseSummary other = (AwrDatabaseSummary) o;
        return java.util.Objects.equals(
                        this.awrSourceDatabaseIdentifier, other.awrSourceDatabaseIdentifier)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.instanceList, other.instanceList)
                && java.util.Objects.equals(this.timeDbStartup, other.timeDbStartup)
                && java.util.Objects.equals(
                        this.timeFirstSnapshotBegin, other.timeFirstSnapshotBegin)
                && java.util.Objects.equals(this.timeLatestSnapshotEnd, other.timeLatestSnapshotEnd)
                && java.util.Objects.equals(
                        this.firstSnapshotIdentifier, other.firstSnapshotIdentifier)
                && java.util.Objects.equals(
                        this.latestSnapshotIdentifier, other.latestSnapshotIdentifier)
                && java.util.Objects.equals(this.snapshotCount, other.snapshotCount)
                && java.util.Objects.equals(this.snapshotIntervalInMin, other.snapshotIntervalInMin)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.snapshotTimezone, other.snapshotTimezone)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.awrSourceDatabaseIdentifier == null
                                ? 43
                                : this.awrSourceDatabaseIdentifier.hashCode());
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
                        + (this.firstSnapshotIdentifier == null
                                ? 43
                                : this.firstSnapshotIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.latestSnapshotIdentifier == null
                                ? 43
                                : this.latestSnapshotIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotCount == null ? 43 : this.snapshotCount.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotIntervalInMin == null
                                ? 43
                                : this.snapshotIntervalInMin.hashCode());
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
