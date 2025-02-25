/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * MySql Sql Stats type object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MySqlSqlStats.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MySqlSqlStats extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "digest",
        "timeCollected",
        "commandType",
        "totalRows",
        "perfSchemaUsedPercent",
        "schemaName",
        "execCount",
        "totalLatencyInPs",
        "lockLatencyInPs",
        "errCount",
        "warnCount",
        "rowsAffected",
        "rowsSent",
        "rowsExamined",
        "tmpDiskTables",
        "tmpTables",
        "selectFullJoin",
        "selectFullRangeJoin",
        "selectRange",
        "selectRangeCheck",
        "selectScan",
        "sortMergePasses",
        "sortRange",
        "rowsSorted",
        "sortScan",
        "noIndexUsedCount",
        "noGoodIndexUsedCount",
        "cpuLatencyInPs",
        "maxControlledMemoryInBytes",
        "maxTotalMemoryInBytes",
        "execCountSecondary",
        "timeFirstSeen",
        "timeLastSeen"
    })
    public MySqlSqlStats(
            String digest,
            java.util.Date timeCollected,
            String commandType,
            Long totalRows,
            Long perfSchemaUsedPercent,
            String schemaName,
            Long execCount,
            Long totalLatencyInPs,
            Long lockLatencyInPs,
            Long errCount,
            Long warnCount,
            Long rowsAffected,
            Long rowsSent,
            Long rowsExamined,
            Long tmpDiskTables,
            Long tmpTables,
            Long selectFullJoin,
            Long selectFullRangeJoin,
            Long selectRange,
            Long selectRangeCheck,
            Long selectScan,
            Long sortMergePasses,
            Long sortRange,
            Long rowsSorted,
            Long sortScan,
            Long noIndexUsedCount,
            Long noGoodIndexUsedCount,
            Long cpuLatencyInPs,
            Long maxControlledMemoryInBytes,
            Long maxTotalMemoryInBytes,
            Long execCountSecondary,
            java.util.Date timeFirstSeen,
            java.util.Date timeLastSeen) {
        super();
        this.digest = digest;
        this.timeCollected = timeCollected;
        this.commandType = commandType;
        this.totalRows = totalRows;
        this.perfSchemaUsedPercent = perfSchemaUsedPercent;
        this.schemaName = schemaName;
        this.execCount = execCount;
        this.totalLatencyInPs = totalLatencyInPs;
        this.lockLatencyInPs = lockLatencyInPs;
        this.errCount = errCount;
        this.warnCount = warnCount;
        this.rowsAffected = rowsAffected;
        this.rowsSent = rowsSent;
        this.rowsExamined = rowsExamined;
        this.tmpDiskTables = tmpDiskTables;
        this.tmpTables = tmpTables;
        this.selectFullJoin = selectFullJoin;
        this.selectFullRangeJoin = selectFullRangeJoin;
        this.selectRange = selectRange;
        this.selectRangeCheck = selectRangeCheck;
        this.selectScan = selectScan;
        this.sortMergePasses = sortMergePasses;
        this.sortRange = sortRange;
        this.rowsSorted = rowsSorted;
        this.sortScan = sortScan;
        this.noIndexUsedCount = noIndexUsedCount;
        this.noGoodIndexUsedCount = noGoodIndexUsedCount;
        this.cpuLatencyInPs = cpuLatencyInPs;
        this.maxControlledMemoryInBytes = maxControlledMemoryInBytes;
        this.maxTotalMemoryInBytes = maxTotalMemoryInBytes;
        this.execCountSecondary = execCountSecondary;
        this.timeFirstSeen = timeFirstSeen;
        this.timeLastSeen = timeLastSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique SQL ID Digest for a MySql Statement.
         * Example: {@code "c20fcea11911be36651b7ca7bd3712d4ed9ac1134cee9c6620039e1fb13b5eff"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("digest")
        private String digest;

        /**
         * Unique SQL ID Digest for a MySql Statement.
         * Example: {@code "c20fcea11911be36651b7ca7bd3712d4ed9ac1134cee9c6620039e1fb13b5eff"}
         *
         * @param digest the value to set
         * @return this builder
         **/
        public Builder digest(String digest) {
            this.digest = digest;
            this.__explicitlySet__.add("digest");
            return this;
        }
        /**
         * Collection timestamp.
         * Example: {@code "2020-03-31T00:00:00.000Z"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * Collection timestamp.
         * Example: {@code "2020-03-31T00:00:00.000Z"}
         *
         * @param timeCollected the value to set
         * @return this builder
         **/
        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Type of statement such as select, update or delete.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commandType")
        private String commandType;

        /**
         * Type of statement such as select, update or delete.
         * @param commandType the value to set
         * @return this builder
         **/
        public Builder commandType(String commandType) {
            this.commandType = commandType;
            this.__explicitlySet__.add("commandType");
            return this;
        }
        /**
         * Total number of SQL statements used in collection ranking calculation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalRows")
        private Long totalRows;

        /**
         * Total number of SQL statements used in collection ranking calculation.
         * @param totalRows the value to set
         * @return this builder
         **/
        public Builder totalRows(Long totalRows) {
            this.totalRows = totalRows;
            this.__explicitlySet__.add("totalRows");
            return this;
        }
        /**
         * Percent of SQL statements in the perf schema table relative to max or overflow count set in @@GLOBAL.performance_schema_digests_size.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("perfSchemaUsedPercent")
        private Long perfSchemaUsedPercent;

        /**
         * Percent of SQL statements in the perf schema table relative to max or overflow count set in @@GLOBAL.performance_schema_digests_size.
         * @param perfSchemaUsedPercent the value to set
         * @return this builder
         **/
        public Builder perfSchemaUsedPercent(Long perfSchemaUsedPercent) {
            this.perfSchemaUsedPercent = perfSchemaUsedPercent;
            this.__explicitlySet__.add("perfSchemaUsedPercent");
            return this;
        }
        /**
         * Name of Database Schema.
         * Example: {@code "performance_schema"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * Name of Database Schema.
         * Example: {@code "performance_schema"}
         *
         * @param schemaName the value to set
         * @return this builder
         **/
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /**
         * The total number of times the statement has executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("execCount")
        private Long execCount;

        /**
         * The total number of times the statement has executed.
         * @param execCount the value to set
         * @return this builder
         **/
        public Builder execCount(Long execCount) {
            this.execCount = execCount;
            this.__explicitlySet__.add("execCount");
            return this;
        }
        /**
         * The total wait time (in picoseconds) of timed occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalLatencyInPs")
        private Long totalLatencyInPs;

        /**
         * The total wait time (in picoseconds) of timed occurrences of the statement.
         * @param totalLatencyInPs the value to set
         * @return this builder
         **/
        public Builder totalLatencyInPs(Long totalLatencyInPs) {
            this.totalLatencyInPs = totalLatencyInPs;
            this.__explicitlySet__.add("totalLatencyInPs");
            return this;
        }
        /**
         * The total time waiting (in picoseconds) for locks by timed occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lockLatencyInPs")
        private Long lockLatencyInPs;

        /**
         * The total time waiting (in picoseconds) for locks by timed occurrences of the statement.
         * @param lockLatencyInPs the value to set
         * @return this builder
         **/
        public Builder lockLatencyInPs(Long lockLatencyInPs) {
            this.lockLatencyInPs = lockLatencyInPs;
            this.__explicitlySet__.add("lockLatencyInPs");
            return this;
        }
        /**
         * The total number of errors produced by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errCount")
        private Long errCount;

        /**
         * The total number of errors produced by occurrences of the statement.
         * @param errCount the value to set
         * @return this builder
         **/
        public Builder errCount(Long errCount) {
            this.errCount = errCount;
            this.__explicitlySet__.add("errCount");
            return this;
        }
        /**
         * The total number of warnings produced by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("warnCount")
        private Long warnCount;

        /**
         * The total number of warnings produced by occurrences of the statement.
         * @param warnCount the value to set
         * @return this builder
         **/
        public Builder warnCount(Long warnCount) {
            this.warnCount = warnCount;
            this.__explicitlySet__.add("warnCount");
            return this;
        }
        /**
         * The total number of rows affected by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rowsAffected")
        private Long rowsAffected;

        /**
         * The total number of rows affected by occurrences of the statement.
         * @param rowsAffected the value to set
         * @return this builder
         **/
        public Builder rowsAffected(Long rowsAffected) {
            this.rowsAffected = rowsAffected;
            this.__explicitlySet__.add("rowsAffected");
            return this;
        }
        /**
         * The total number of rows returned by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rowsSent")
        private Long rowsSent;

        /**
         * The total number of rows returned by occurrences of the statement.
         * @param rowsSent the value to set
         * @return this builder
         **/
        public Builder rowsSent(Long rowsSent) {
            this.rowsSent = rowsSent;
            this.__explicitlySet__.add("rowsSent");
            return this;
        }
        /**
         * The total number of rows read from storage engines by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rowsExamined")
        private Long rowsExamined;

        /**
         * The total number of rows read from storage engines by occurrences of the statement.
         * @param rowsExamined the value to set
         * @return this builder
         **/
        public Builder rowsExamined(Long rowsExamined) {
            this.rowsExamined = rowsExamined;
            this.__explicitlySet__.add("rowsExamined");
            return this;
        }
        /**
         * The total number of internal on-disk temporary tables created by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tmpDiskTables")
        private Long tmpDiskTables;

        /**
         * The total number of internal on-disk temporary tables created by occurrences of the statement.
         * @param tmpDiskTables the value to set
         * @return this builder
         **/
        public Builder tmpDiskTables(Long tmpDiskTables) {
            this.tmpDiskTables = tmpDiskTables;
            this.__explicitlySet__.add("tmpDiskTables");
            return this;
        }
        /**
         * The total number of internal in-memory temporary tables created by occurrences of the statement Count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tmpTables")
        private Long tmpTables;

        /**
         * The total number of internal in-memory temporary tables created by occurrences of the statement Count
         * @param tmpTables the value to set
         * @return this builder
         **/
        public Builder tmpTables(Long tmpTables) {
            this.tmpTables = tmpTables;
            this.__explicitlySet__.add("tmpTables");
            return this;
        }
        /**
         * The total number of joins that perform table scans because they do not use indexes by occurrences of the statement. If this value is not 0
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selectFullJoin")
        private Long selectFullJoin;

        /**
         * The total number of joins that perform table scans because they do not use indexes by occurrences of the statement. If this value is not 0
         * @param selectFullJoin the value to set
         * @return this builder
         **/
        public Builder selectFullJoin(Long selectFullJoin) {
            this.selectFullJoin = selectFullJoin;
            this.__explicitlySet__.add("selectFullJoin");
            return this;
        }
        /**
         * The total number of joins that used a range search on a reference table by occurrences of the statement
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selectFullRangeJoin")
        private Long selectFullRangeJoin;

        /**
         * The total number of joins that used a range search on a reference table by occurrences of the statement
         * @param selectFullRangeJoin the value to set
         * @return this builder
         **/
        public Builder selectFullRangeJoin(Long selectFullRangeJoin) {
            this.selectFullRangeJoin = selectFullRangeJoin;
            this.__explicitlySet__.add("selectFullRangeJoin");
            return this;
        }
        /**
         * The total number of joins that used ranges on the first table by occurrences of the statement. This is normally not a critical issue even if the value is quite large. Count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selectRange")
        private Long selectRange;

        /**
         * The total number of joins that used ranges on the first table by occurrences of the statement. This is normally not a critical issue even if the value is quite large. Count
         * @param selectRange the value to set
         * @return this builder
         **/
        public Builder selectRange(Long selectRange) {
            this.selectRange = selectRange;
            this.__explicitlySet__.add("selectRange");
            return this;
        }
        /**
         * The total number of joins without keys that check for key usage after each row by occurrences of the statement. If this is not 0
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selectRangeCheck")
        private Long selectRangeCheck;

        /**
         * The total number of joins without keys that check for key usage after each row by occurrences of the statement. If this is not 0
         * @param selectRangeCheck the value to set
         * @return this builder
         **/
        public Builder selectRangeCheck(Long selectRangeCheck) {
            this.selectRangeCheck = selectRangeCheck;
            this.__explicitlySet__.add("selectRangeCheck");
            return this;
        }
        /**
         * The total number of joins that did a full scan of the first table by occurrences of the statement Count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selectScan")
        private Long selectScan;

        /**
         * The total number of joins that did a full scan of the first table by occurrences of the statement Count
         * @param selectScan the value to set
         * @return this builder
         **/
        public Builder selectScan(Long selectScan) {
            this.selectScan = selectScan;
            this.__explicitlySet__.add("selectScan");
            return this;
        }
        /**
         * The total number of sort merge passes by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortMergePasses")
        private Long sortMergePasses;

        /**
         * The total number of sort merge passes by occurrences of the statement.
         * @param sortMergePasses the value to set
         * @return this builder
         **/
        public Builder sortMergePasses(Long sortMergePasses) {
            this.sortMergePasses = sortMergePasses;
            this.__explicitlySet__.add("sortMergePasses");
            return this;
        }
        /**
         * The total number of sorts that were done using ranges by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortRange")
        private Long sortRange;

        /**
         * The total number of sorts that were done using ranges by occurrences of the statement.
         * @param sortRange the value to set
         * @return this builder
         **/
        public Builder sortRange(Long sortRange) {
            this.sortRange = sortRange;
            this.__explicitlySet__.add("sortRange");
            return this;
        }
        /**
         * The total number of rows sorted by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rowsSorted")
        private Long rowsSorted;

        /**
         * The total number of rows sorted by occurrences of the statement.
         * @param rowsSorted the value to set
         * @return this builder
         **/
        public Builder rowsSorted(Long rowsSorted) {
            this.rowsSorted = rowsSorted;
            this.__explicitlySet__.add("rowsSorted");
            return this;
        }
        /**
         * The total number of sorts that were done by scanning the table by occurrences of the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortScan")
        private Long sortScan;

        /**
         * The total number of sorts that were done by scanning the table by occurrences of the statement.
         * @param sortScan the value to set
         * @return this builder
         **/
        public Builder sortScan(Long sortScan) {
            this.sortScan = sortScan;
            this.__explicitlySet__.add("sortScan");
            return this;
        }
        /**
         * The number of occurences of the statement which performed a table scan without using an index Count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("noIndexUsedCount")
        private Long noIndexUsedCount;

        /**
         * The number of occurences of the statement which performed a table scan without using an index Count
         * @param noIndexUsedCount the value to set
         * @return this builder
         **/
        public Builder noIndexUsedCount(Long noIndexUsedCount) {
            this.noIndexUsedCount = noIndexUsedCount;
            this.__explicitlySet__.add("noIndexUsedCount");
            return this;
        }
        /**
         * The number of occurences of the statement where the server found no good index to use Count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("noGoodIndexUsedCount")
        private Long noGoodIndexUsedCount;

        /**
         * The number of occurences of the statement where the server found no good index to use Count
         * @param noGoodIndexUsedCount the value to set
         * @return this builder
         **/
        public Builder noGoodIndexUsedCount(Long noGoodIndexUsedCount) {
            this.noGoodIndexUsedCount = noGoodIndexUsedCount;
            this.__explicitlySet__.add("noGoodIndexUsedCount");
            return this;
        }
        /**
         * The total time spent on CPU (in picoseconds) for the current thread.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuLatencyInPs")
        private Long cpuLatencyInPs;

        /**
         * The total time spent on CPU (in picoseconds) for the current thread.
         * @param cpuLatencyInPs the value to set
         * @return this builder
         **/
        public Builder cpuLatencyInPs(Long cpuLatencyInPs) {
            this.cpuLatencyInPs = cpuLatencyInPs;
            this.__explicitlySet__.add("cpuLatencyInPs");
            return this;
        }
        /**
         * The maximum amount of controlled memory (in bytes) used by the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxControlledMemoryInBytes")
        private Long maxControlledMemoryInBytes;

        /**
         * The maximum amount of controlled memory (in bytes) used by the statement.
         * @param maxControlledMemoryInBytes the value to set
         * @return this builder
         **/
        public Builder maxControlledMemoryInBytes(Long maxControlledMemoryInBytes) {
            this.maxControlledMemoryInBytes = maxControlledMemoryInBytes;
            this.__explicitlySet__.add("maxControlledMemoryInBytes");
            return this;
        }
        /**
         * The maximum amount of memory (in bytes) used by the statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalMemoryInBytes")
        private Long maxTotalMemoryInBytes;

        /**
         * The maximum amount of memory (in bytes) used by the statement.
         * @param maxTotalMemoryInBytes the value to set
         * @return this builder
         **/
        public Builder maxTotalMemoryInBytes(Long maxTotalMemoryInBytes) {
            this.maxTotalMemoryInBytes = maxTotalMemoryInBytes;
            this.__explicitlySet__.add("maxTotalMemoryInBytes");
            return this;
        }
        /**
         * The total number of times a query was processed on the secondary engine (HEATWAVE) for occurrences of this statement Count.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("execCountSecondary")
        private Long execCountSecondary;

        /**
         * The total number of times a query was processed on the secondary engine (HEATWAVE) for occurrences of this statement Count.
         * @param execCountSecondary the value to set
         * @return this builder
         **/
        public Builder execCountSecondary(Long execCountSecondary) {
            this.execCountSecondary = execCountSecondary;
            this.__explicitlySet__.add("execCountSecondary");
            return this;
        }
        /**
         * The time at which statement was first seen.
         * Example: {@code "2023-01-16 08:04:31.533577"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
        private java.util.Date timeFirstSeen;

        /**
         * The time at which statement was first seen.
         * Example: {@code "2023-01-16 08:04:31.533577"}
         *
         * @param timeFirstSeen the value to set
         * @return this builder
         **/
        public Builder timeFirstSeen(java.util.Date timeFirstSeen) {
            this.timeFirstSeen = timeFirstSeen;
            this.__explicitlySet__.add("timeFirstSeen");
            return this;
        }
        /**
         * The time at which statement was most recently seen for all occurrences of the statement.
         * Example: {@code "2023-01-30 02:17:08.067961"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        /**
         * The time at which statement was most recently seen for all occurrences of the statement.
         * Example: {@code "2023-01-30 02:17:08.067961"}
         *
         * @param timeLastSeen the value to set
         * @return this builder
         **/
        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlSqlStats build() {
            MySqlSqlStats model =
                    new MySqlSqlStats(
                            this.digest,
                            this.timeCollected,
                            this.commandType,
                            this.totalRows,
                            this.perfSchemaUsedPercent,
                            this.schemaName,
                            this.execCount,
                            this.totalLatencyInPs,
                            this.lockLatencyInPs,
                            this.errCount,
                            this.warnCount,
                            this.rowsAffected,
                            this.rowsSent,
                            this.rowsExamined,
                            this.tmpDiskTables,
                            this.tmpTables,
                            this.selectFullJoin,
                            this.selectFullRangeJoin,
                            this.selectRange,
                            this.selectRangeCheck,
                            this.selectScan,
                            this.sortMergePasses,
                            this.sortRange,
                            this.rowsSorted,
                            this.sortScan,
                            this.noIndexUsedCount,
                            this.noGoodIndexUsedCount,
                            this.cpuLatencyInPs,
                            this.maxControlledMemoryInBytes,
                            this.maxTotalMemoryInBytes,
                            this.execCountSecondary,
                            this.timeFirstSeen,
                            this.timeLastSeen);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlSqlStats model) {
            if (model.wasPropertyExplicitlySet("digest")) {
                this.digest(model.getDigest());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("commandType")) {
                this.commandType(model.getCommandType());
            }
            if (model.wasPropertyExplicitlySet("totalRows")) {
                this.totalRows(model.getTotalRows());
            }
            if (model.wasPropertyExplicitlySet("perfSchemaUsedPercent")) {
                this.perfSchemaUsedPercent(model.getPerfSchemaUsedPercent());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("execCount")) {
                this.execCount(model.getExecCount());
            }
            if (model.wasPropertyExplicitlySet("totalLatencyInPs")) {
                this.totalLatencyInPs(model.getTotalLatencyInPs());
            }
            if (model.wasPropertyExplicitlySet("lockLatencyInPs")) {
                this.lockLatencyInPs(model.getLockLatencyInPs());
            }
            if (model.wasPropertyExplicitlySet("errCount")) {
                this.errCount(model.getErrCount());
            }
            if (model.wasPropertyExplicitlySet("warnCount")) {
                this.warnCount(model.getWarnCount());
            }
            if (model.wasPropertyExplicitlySet("rowsAffected")) {
                this.rowsAffected(model.getRowsAffected());
            }
            if (model.wasPropertyExplicitlySet("rowsSent")) {
                this.rowsSent(model.getRowsSent());
            }
            if (model.wasPropertyExplicitlySet("rowsExamined")) {
                this.rowsExamined(model.getRowsExamined());
            }
            if (model.wasPropertyExplicitlySet("tmpDiskTables")) {
                this.tmpDiskTables(model.getTmpDiskTables());
            }
            if (model.wasPropertyExplicitlySet("tmpTables")) {
                this.tmpTables(model.getTmpTables());
            }
            if (model.wasPropertyExplicitlySet("selectFullJoin")) {
                this.selectFullJoin(model.getSelectFullJoin());
            }
            if (model.wasPropertyExplicitlySet("selectFullRangeJoin")) {
                this.selectFullRangeJoin(model.getSelectFullRangeJoin());
            }
            if (model.wasPropertyExplicitlySet("selectRange")) {
                this.selectRange(model.getSelectRange());
            }
            if (model.wasPropertyExplicitlySet("selectRangeCheck")) {
                this.selectRangeCheck(model.getSelectRangeCheck());
            }
            if (model.wasPropertyExplicitlySet("selectScan")) {
                this.selectScan(model.getSelectScan());
            }
            if (model.wasPropertyExplicitlySet("sortMergePasses")) {
                this.sortMergePasses(model.getSortMergePasses());
            }
            if (model.wasPropertyExplicitlySet("sortRange")) {
                this.sortRange(model.getSortRange());
            }
            if (model.wasPropertyExplicitlySet("rowsSorted")) {
                this.rowsSorted(model.getRowsSorted());
            }
            if (model.wasPropertyExplicitlySet("sortScan")) {
                this.sortScan(model.getSortScan());
            }
            if (model.wasPropertyExplicitlySet("noIndexUsedCount")) {
                this.noIndexUsedCount(model.getNoIndexUsedCount());
            }
            if (model.wasPropertyExplicitlySet("noGoodIndexUsedCount")) {
                this.noGoodIndexUsedCount(model.getNoGoodIndexUsedCount());
            }
            if (model.wasPropertyExplicitlySet("cpuLatencyInPs")) {
                this.cpuLatencyInPs(model.getCpuLatencyInPs());
            }
            if (model.wasPropertyExplicitlySet("maxControlledMemoryInBytes")) {
                this.maxControlledMemoryInBytes(model.getMaxControlledMemoryInBytes());
            }
            if (model.wasPropertyExplicitlySet("maxTotalMemoryInBytes")) {
                this.maxTotalMemoryInBytes(model.getMaxTotalMemoryInBytes());
            }
            if (model.wasPropertyExplicitlySet("execCountSecondary")) {
                this.execCountSecondary(model.getExecCountSecondary());
            }
            if (model.wasPropertyExplicitlySet("timeFirstSeen")) {
                this.timeFirstSeen(model.getTimeFirstSeen());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeen")) {
                this.timeLastSeen(model.getTimeLastSeen());
            }
            return this;
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
     * Unique SQL ID Digest for a MySql Statement.
     * Example: {@code "c20fcea11911be36651b7ca7bd3712d4ed9ac1134cee9c6620039e1fb13b5eff"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    private final String digest;

    /**
     * Unique SQL ID Digest for a MySql Statement.
     * Example: {@code "c20fcea11911be36651b7ca7bd3712d4ed9ac1134cee9c6620039e1fb13b5eff"}
     *
     * @return the value
     **/
    public String getDigest() {
        return digest;
    }

    /**
     * Collection timestamp.
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * Collection timestamp.
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     * @return the value
     **/
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /**
     * Type of statement such as select, update or delete.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commandType")
    private final String commandType;

    /**
     * Type of statement such as select, update or delete.
     * @return the value
     **/
    public String getCommandType() {
        return commandType;
    }

    /**
     * Total number of SQL statements used in collection ranking calculation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalRows")
    private final Long totalRows;

    /**
     * Total number of SQL statements used in collection ranking calculation.
     * @return the value
     **/
    public Long getTotalRows() {
        return totalRows;
    }

    /**
     * Percent of SQL statements in the perf schema table relative to max or overflow count set in @@GLOBAL.performance_schema_digests_size.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("perfSchemaUsedPercent")
    private final Long perfSchemaUsedPercent;

    /**
     * Percent of SQL statements in the perf schema table relative to max or overflow count set in @@GLOBAL.performance_schema_digests_size.
     * @return the value
     **/
    public Long getPerfSchemaUsedPercent() {
        return perfSchemaUsedPercent;
    }

    /**
     * Name of Database Schema.
     * Example: {@code "performance_schema"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * Name of Database Schema.
     * Example: {@code "performance_schema"}
     *
     * @return the value
     **/
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * The total number of times the statement has executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("execCount")
    private final Long execCount;

    /**
     * The total number of times the statement has executed.
     * @return the value
     **/
    public Long getExecCount() {
        return execCount;
    }

    /**
     * The total wait time (in picoseconds) of timed occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalLatencyInPs")
    private final Long totalLatencyInPs;

    /**
     * The total wait time (in picoseconds) of timed occurrences of the statement.
     * @return the value
     **/
    public Long getTotalLatencyInPs() {
        return totalLatencyInPs;
    }

    /**
     * The total time waiting (in picoseconds) for locks by timed occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lockLatencyInPs")
    private final Long lockLatencyInPs;

    /**
     * The total time waiting (in picoseconds) for locks by timed occurrences of the statement.
     * @return the value
     **/
    public Long getLockLatencyInPs() {
        return lockLatencyInPs;
    }

    /**
     * The total number of errors produced by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errCount")
    private final Long errCount;

    /**
     * The total number of errors produced by occurrences of the statement.
     * @return the value
     **/
    public Long getErrCount() {
        return errCount;
    }

    /**
     * The total number of warnings produced by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warnCount")
    private final Long warnCount;

    /**
     * The total number of warnings produced by occurrences of the statement.
     * @return the value
     **/
    public Long getWarnCount() {
        return warnCount;
    }

    /**
     * The total number of rows affected by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowsAffected")
    private final Long rowsAffected;

    /**
     * The total number of rows affected by occurrences of the statement.
     * @return the value
     **/
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * The total number of rows returned by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowsSent")
    private final Long rowsSent;

    /**
     * The total number of rows returned by occurrences of the statement.
     * @return the value
     **/
    public Long getRowsSent() {
        return rowsSent;
    }

    /**
     * The total number of rows read from storage engines by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowsExamined")
    private final Long rowsExamined;

    /**
     * The total number of rows read from storage engines by occurrences of the statement.
     * @return the value
     **/
    public Long getRowsExamined() {
        return rowsExamined;
    }

    /**
     * The total number of internal on-disk temporary tables created by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tmpDiskTables")
    private final Long tmpDiskTables;

    /**
     * The total number of internal on-disk temporary tables created by occurrences of the statement.
     * @return the value
     **/
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    /**
     * The total number of internal in-memory temporary tables created by occurrences of the statement Count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tmpTables")
    private final Long tmpTables;

    /**
     * The total number of internal in-memory temporary tables created by occurrences of the statement Count
     * @return the value
     **/
    public Long getTmpTables() {
        return tmpTables;
    }

    /**
     * The total number of joins that perform table scans because they do not use indexes by occurrences of the statement. If this value is not 0
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selectFullJoin")
    private final Long selectFullJoin;

    /**
     * The total number of joins that perform table scans because they do not use indexes by occurrences of the statement. If this value is not 0
     * @return the value
     **/
    public Long getSelectFullJoin() {
        return selectFullJoin;
    }

    /**
     * The total number of joins that used a range search on a reference table by occurrences of the statement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selectFullRangeJoin")
    private final Long selectFullRangeJoin;

    /**
     * The total number of joins that used a range search on a reference table by occurrences of the statement
     * @return the value
     **/
    public Long getSelectFullRangeJoin() {
        return selectFullRangeJoin;
    }

    /**
     * The total number of joins that used ranges on the first table by occurrences of the statement. This is normally not a critical issue even if the value is quite large. Count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selectRange")
    private final Long selectRange;

    /**
     * The total number of joins that used ranges on the first table by occurrences of the statement. This is normally not a critical issue even if the value is quite large. Count
     * @return the value
     **/
    public Long getSelectRange() {
        return selectRange;
    }

    /**
     * The total number of joins without keys that check for key usage after each row by occurrences of the statement. If this is not 0
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selectRangeCheck")
    private final Long selectRangeCheck;

    /**
     * The total number of joins without keys that check for key usage after each row by occurrences of the statement. If this is not 0
     * @return the value
     **/
    public Long getSelectRangeCheck() {
        return selectRangeCheck;
    }

    /**
     * The total number of joins that did a full scan of the first table by occurrences of the statement Count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selectScan")
    private final Long selectScan;

    /**
     * The total number of joins that did a full scan of the first table by occurrences of the statement Count
     * @return the value
     **/
    public Long getSelectScan() {
        return selectScan;
    }

    /**
     * The total number of sort merge passes by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortMergePasses")
    private final Long sortMergePasses;

    /**
     * The total number of sort merge passes by occurrences of the statement.
     * @return the value
     **/
    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    /**
     * The total number of sorts that were done using ranges by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortRange")
    private final Long sortRange;

    /**
     * The total number of sorts that were done using ranges by occurrences of the statement.
     * @return the value
     **/
    public Long getSortRange() {
        return sortRange;
    }

    /**
     * The total number of rows sorted by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowsSorted")
    private final Long rowsSorted;

    /**
     * The total number of rows sorted by occurrences of the statement.
     * @return the value
     **/
    public Long getRowsSorted() {
        return rowsSorted;
    }

    /**
     * The total number of sorts that were done by scanning the table by occurrences of the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortScan")
    private final Long sortScan;

    /**
     * The total number of sorts that were done by scanning the table by occurrences of the statement.
     * @return the value
     **/
    public Long getSortScan() {
        return sortScan;
    }

    /**
     * The number of occurences of the statement which performed a table scan without using an index Count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("noIndexUsedCount")
    private final Long noIndexUsedCount;

    /**
     * The number of occurences of the statement which performed a table scan without using an index Count
     * @return the value
     **/
    public Long getNoIndexUsedCount() {
        return noIndexUsedCount;
    }

    /**
     * The number of occurences of the statement where the server found no good index to use Count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("noGoodIndexUsedCount")
    private final Long noGoodIndexUsedCount;

    /**
     * The number of occurences of the statement where the server found no good index to use Count
     * @return the value
     **/
    public Long getNoGoodIndexUsedCount() {
        return noGoodIndexUsedCount;
    }

    /**
     * The total time spent on CPU (in picoseconds) for the current thread.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuLatencyInPs")
    private final Long cpuLatencyInPs;

    /**
     * The total time spent on CPU (in picoseconds) for the current thread.
     * @return the value
     **/
    public Long getCpuLatencyInPs() {
        return cpuLatencyInPs;
    }

    /**
     * The maximum amount of controlled memory (in bytes) used by the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxControlledMemoryInBytes")
    private final Long maxControlledMemoryInBytes;

    /**
     * The maximum amount of controlled memory (in bytes) used by the statement.
     * @return the value
     **/
    public Long getMaxControlledMemoryInBytes() {
        return maxControlledMemoryInBytes;
    }

    /**
     * The maximum amount of memory (in bytes) used by the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalMemoryInBytes")
    private final Long maxTotalMemoryInBytes;

    /**
     * The maximum amount of memory (in bytes) used by the statement.
     * @return the value
     **/
    public Long getMaxTotalMemoryInBytes() {
        return maxTotalMemoryInBytes;
    }

    /**
     * The total number of times a query was processed on the secondary engine (HEATWAVE) for occurrences of this statement Count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("execCountSecondary")
    private final Long execCountSecondary;

    /**
     * The total number of times a query was processed on the secondary engine (HEATWAVE) for occurrences of this statement Count.
     * @return the value
     **/
    public Long getExecCountSecondary() {
        return execCountSecondary;
    }

    /**
     * The time at which statement was first seen.
     * Example: {@code "2023-01-16 08:04:31.533577"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
    private final java.util.Date timeFirstSeen;

    /**
     * The time at which statement was first seen.
     * Example: {@code "2023-01-16 08:04:31.533577"}
     *
     * @return the value
     **/
    public java.util.Date getTimeFirstSeen() {
        return timeFirstSeen;
    }

    /**
     * The time at which statement was most recently seen for all occurrences of the statement.
     * Example: {@code "2023-01-30 02:17:08.067961"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    private final java.util.Date timeLastSeen;

    /**
     * The time at which statement was most recently seen for all occurrences of the statement.
     * Example: {@code "2023-01-30 02:17:08.067961"}
     *
     * @return the value
     **/
    public java.util.Date getTimeLastSeen() {
        return timeLastSeen;
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
        sb.append("MySqlSqlStats(");
        sb.append("super=").append(super.toString());
        sb.append("digest=").append(String.valueOf(this.digest));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", commandType=").append(String.valueOf(this.commandType));
        sb.append(", totalRows=").append(String.valueOf(this.totalRows));
        sb.append(", perfSchemaUsedPercent=").append(String.valueOf(this.perfSchemaUsedPercent));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", execCount=").append(String.valueOf(this.execCount));
        sb.append(", totalLatencyInPs=").append(String.valueOf(this.totalLatencyInPs));
        sb.append(", lockLatencyInPs=").append(String.valueOf(this.lockLatencyInPs));
        sb.append(", errCount=").append(String.valueOf(this.errCount));
        sb.append(", warnCount=").append(String.valueOf(this.warnCount));
        sb.append(", rowsAffected=").append(String.valueOf(this.rowsAffected));
        sb.append(", rowsSent=").append(String.valueOf(this.rowsSent));
        sb.append(", rowsExamined=").append(String.valueOf(this.rowsExamined));
        sb.append(", tmpDiskTables=").append(String.valueOf(this.tmpDiskTables));
        sb.append(", tmpTables=").append(String.valueOf(this.tmpTables));
        sb.append(", selectFullJoin=").append(String.valueOf(this.selectFullJoin));
        sb.append(", selectFullRangeJoin=").append(String.valueOf(this.selectFullRangeJoin));
        sb.append(", selectRange=").append(String.valueOf(this.selectRange));
        sb.append(", selectRangeCheck=").append(String.valueOf(this.selectRangeCheck));
        sb.append(", selectScan=").append(String.valueOf(this.selectScan));
        sb.append(", sortMergePasses=").append(String.valueOf(this.sortMergePasses));
        sb.append(", sortRange=").append(String.valueOf(this.sortRange));
        sb.append(", rowsSorted=").append(String.valueOf(this.rowsSorted));
        sb.append(", sortScan=").append(String.valueOf(this.sortScan));
        sb.append(", noIndexUsedCount=").append(String.valueOf(this.noIndexUsedCount));
        sb.append(", noGoodIndexUsedCount=").append(String.valueOf(this.noGoodIndexUsedCount));
        sb.append(", cpuLatencyInPs=").append(String.valueOf(this.cpuLatencyInPs));
        sb.append(", maxControlledMemoryInBytes=")
                .append(String.valueOf(this.maxControlledMemoryInBytes));
        sb.append(", maxTotalMemoryInBytes=").append(String.valueOf(this.maxTotalMemoryInBytes));
        sb.append(", execCountSecondary=").append(String.valueOf(this.execCountSecondary));
        sb.append(", timeFirstSeen=").append(String.valueOf(this.timeFirstSeen));
        sb.append(", timeLastSeen=").append(String.valueOf(this.timeLastSeen));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlSqlStats)) {
            return false;
        }

        MySqlSqlStats other = (MySqlSqlStats) o;
        return java.util.Objects.equals(this.digest, other.digest)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.commandType, other.commandType)
                && java.util.Objects.equals(this.totalRows, other.totalRows)
                && java.util.Objects.equals(this.perfSchemaUsedPercent, other.perfSchemaUsedPercent)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.execCount, other.execCount)
                && java.util.Objects.equals(this.totalLatencyInPs, other.totalLatencyInPs)
                && java.util.Objects.equals(this.lockLatencyInPs, other.lockLatencyInPs)
                && java.util.Objects.equals(this.errCount, other.errCount)
                && java.util.Objects.equals(this.warnCount, other.warnCount)
                && java.util.Objects.equals(this.rowsAffected, other.rowsAffected)
                && java.util.Objects.equals(this.rowsSent, other.rowsSent)
                && java.util.Objects.equals(this.rowsExamined, other.rowsExamined)
                && java.util.Objects.equals(this.tmpDiskTables, other.tmpDiskTables)
                && java.util.Objects.equals(this.tmpTables, other.tmpTables)
                && java.util.Objects.equals(this.selectFullJoin, other.selectFullJoin)
                && java.util.Objects.equals(this.selectFullRangeJoin, other.selectFullRangeJoin)
                && java.util.Objects.equals(this.selectRange, other.selectRange)
                && java.util.Objects.equals(this.selectRangeCheck, other.selectRangeCheck)
                && java.util.Objects.equals(this.selectScan, other.selectScan)
                && java.util.Objects.equals(this.sortMergePasses, other.sortMergePasses)
                && java.util.Objects.equals(this.sortRange, other.sortRange)
                && java.util.Objects.equals(this.rowsSorted, other.rowsSorted)
                && java.util.Objects.equals(this.sortScan, other.sortScan)
                && java.util.Objects.equals(this.noIndexUsedCount, other.noIndexUsedCount)
                && java.util.Objects.equals(this.noGoodIndexUsedCount, other.noGoodIndexUsedCount)
                && java.util.Objects.equals(this.cpuLatencyInPs, other.cpuLatencyInPs)
                && java.util.Objects.equals(
                        this.maxControlledMemoryInBytes, other.maxControlledMemoryInBytes)
                && java.util.Objects.equals(this.maxTotalMemoryInBytes, other.maxTotalMemoryInBytes)
                && java.util.Objects.equals(this.execCountSecondary, other.execCountSecondary)
                && java.util.Objects.equals(this.timeFirstSeen, other.timeFirstSeen)
                && java.util.Objects.equals(this.timeLastSeen, other.timeLastSeen)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.digest == null ? 43 : this.digest.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.commandType == null ? 43 : this.commandType.hashCode());
        result = (result * PRIME) + (this.totalRows == null ? 43 : this.totalRows.hashCode());
        result =
                (result * PRIME)
                        + (this.perfSchemaUsedPercent == null
                                ? 43
                                : this.perfSchemaUsedPercent.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.execCount == null ? 43 : this.execCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalLatencyInPs == null ? 43 : this.totalLatencyInPs.hashCode());
        result =
                (result * PRIME)
                        + (this.lockLatencyInPs == null ? 43 : this.lockLatencyInPs.hashCode());
        result = (result * PRIME) + (this.errCount == null ? 43 : this.errCount.hashCode());
        result = (result * PRIME) + (this.warnCount == null ? 43 : this.warnCount.hashCode());
        result = (result * PRIME) + (this.rowsAffected == null ? 43 : this.rowsAffected.hashCode());
        result = (result * PRIME) + (this.rowsSent == null ? 43 : this.rowsSent.hashCode());
        result = (result * PRIME) + (this.rowsExamined == null ? 43 : this.rowsExamined.hashCode());
        result =
                (result * PRIME)
                        + (this.tmpDiskTables == null ? 43 : this.tmpDiskTables.hashCode());
        result = (result * PRIME) + (this.tmpTables == null ? 43 : this.tmpTables.hashCode());
        result =
                (result * PRIME)
                        + (this.selectFullJoin == null ? 43 : this.selectFullJoin.hashCode());
        result =
                (result * PRIME)
                        + (this.selectFullRangeJoin == null
                                ? 43
                                : this.selectFullRangeJoin.hashCode());
        result = (result * PRIME) + (this.selectRange == null ? 43 : this.selectRange.hashCode());
        result =
                (result * PRIME)
                        + (this.selectRangeCheck == null ? 43 : this.selectRangeCheck.hashCode());
        result = (result * PRIME) + (this.selectScan == null ? 43 : this.selectScan.hashCode());
        result =
                (result * PRIME)
                        + (this.sortMergePasses == null ? 43 : this.sortMergePasses.hashCode());
        result = (result * PRIME) + (this.sortRange == null ? 43 : this.sortRange.hashCode());
        result = (result * PRIME) + (this.rowsSorted == null ? 43 : this.rowsSorted.hashCode());
        result = (result * PRIME) + (this.sortScan == null ? 43 : this.sortScan.hashCode());
        result =
                (result * PRIME)
                        + (this.noIndexUsedCount == null ? 43 : this.noIndexUsedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.noGoodIndexUsedCount == null
                                ? 43
                                : this.noGoodIndexUsedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuLatencyInPs == null ? 43 : this.cpuLatencyInPs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxControlledMemoryInBytes == null
                                ? 43
                                : this.maxControlledMemoryInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTotalMemoryInBytes == null
                                ? 43
                                : this.maxTotalMemoryInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.execCountSecondary == null
                                ? 43
                                : this.execCountSecondary.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSeen == null ? 43 : this.timeFirstSeen.hashCode());
        result = (result * PRIME) + (this.timeLastSeen == null ? 43 : this.timeLastSeen.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
