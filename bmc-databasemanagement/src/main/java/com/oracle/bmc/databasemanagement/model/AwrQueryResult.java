/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The AWR query result.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "awrResultType",
    defaultImpl = AwrQueryResult.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbParameterChangeCollection.class,
        name = "AWRDB_DB_PARAMETER_CHANGE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbCpuUsageCollection.class,
        name = "AWRDB_ASH_CPU_USAGE_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbWaitEventBucketCollection.class,
        name = "AWRDB_EVENT_HISTOGRAM_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbParameterCollection.class,
        name = "AWRDB_DB_PARAMETER_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbSysstatCollection.class,
        name = "AWRDB_SYSSTAT_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbTopWaitEventCollection.class,
        name = "AWRDB_TOP_EVENT_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbSnapshotCollection.class,
        name = "AWRDB_SNAPSHOT_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbCollection.class,
        name = "AWRDB_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbSnapshotRangeCollection.class,
        name = "AWRDB_SNAPSHOT_RANGE_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbReport.class,
        name = "AWRDB_DB_REPORT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbMetricCollection.class,
        name = "AWRDB_METRICS_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbWaitEventCollection.class,
        name = "AWRDB_EVENT_SET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AwrDbSqlReport.class,
        name = "AWRDB_SQL_REPORT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AwrQueryResult {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version", "queryKey", "dbQueryTimeInSecs"})
    protected AwrQueryResult(
            String name, String version, String queryKey, Double dbQueryTimeInSecs) {
        super();
        this.name = name;
        this.version = version;
        this.queryKey = queryKey;
        this.dbQueryTimeInSecs = dbQueryTimeInSecs;
    }

    /**
     * The name of the query result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The version of the query result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    public String getVersion() {
        return version;
    }

    /**
     * The ID assigned to the query instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryKey")
    private final String queryKey;

    public String getQueryKey() {
        return queryKey;
    }

    /**
     * The time taken to query the database tier (in seconds).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbQueryTimeInSecs")
    private final Double dbQueryTimeInSecs;

    public Double getDbQueryTimeInSecs() {
        return dbQueryTimeInSecs;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrQueryResult(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", queryKey=").append(String.valueOf(this.queryKey));
        sb.append(", dbQueryTimeInSecs=").append(String.valueOf(this.dbQueryTimeInSecs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrQueryResult)) {
            return false;
        }

        AwrQueryResult other = (AwrQueryResult) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.queryKey, other.queryKey)
                && java.util.Objects.equals(this.dbQueryTimeInSecs, other.dbQueryTimeInSecs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.queryKey == null ? 43 : this.queryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dbQueryTimeInSecs == null ? 43 : this.dbQueryTimeInSecs.hashCode());
        return result;
    }

    /**
     * The result type of AWR query.
     **/
    public enum AwrResultType {
        AwrdbSet("AWRDB_SET"),
        AwrdbSnapshotRangeSet("AWRDB_SNAPSHOT_RANGE_SET"),
        AwrdbSnapshotSet("AWRDB_SNAPSHOT_SET"),
        AwrdbMetricsSet("AWRDB_METRICS_SET"),
        AwrdbSysstatSet("AWRDB_SYSSTAT_SET"),
        AwrdbTopEventSet("AWRDB_TOP_EVENT_SET"),
        AwrdbEventSet("AWRDB_EVENT_SET"),
        AwrdbEventHistogram("AWRDB_EVENT_HISTOGRAM"),
        AwrdbDbParameterSet("AWRDB_DB_PARAMETER_SET"),
        AwrdbDbParameterChange("AWRDB_DB_PARAMETER_CHANGE"),
        AwrdbAshCpuUsageSet("AWRDB_ASH_CPU_USAGE_SET"),
        AwrdbDbReport("AWRDB_DB_REPORT"),
        AwrdbSqlReport("AWRDB_SQL_REPORT"),
        ;

        private final String value;
        private static java.util.Map<String, AwrResultType> map;

        static {
            map = new java.util.HashMap<>();
            for (AwrResultType v : AwrResultType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AwrResultType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AwrResultType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AwrResultType: " + key);
        }
    };
}
