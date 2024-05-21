/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Sql Stats type object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlStats.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlStats extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlIdentifier",
        "planHashValue",
        "timeCollected",
        "instanceName",
        "lastActiveTime",
        "parseCalls",
        "diskReads",
        "directReads",
        "directWrites",
        "bufferGets",
        "rowsProcessed",
        "serializableAborts",
        "fetches",
        "executions",
        "avoidedExecutions",
        "endOfFetchCount",
        "loads",
        "versionCount",
        "invalidations",
        "obsoleteCount",
        "pxServersExecutions",
        "cpuTimeInUs",
        "elapsedTimeInUs",
        "avgHardParseTimeInUs",
        "concurrencyWaitTimeInUs",
        "applicationWaitTimeInUs",
        "clusterWaitTimeInUs",
        "userIoWaitTimeInUs",
        "plsqlExecTimeInUs",
        "javaExecTimeInUs",
        "sorts",
        "sharableMem",
        "totalSharableMem",
        "typeCheckMem",
        "ioCellOffloadEligibleBytes",
        "ioInterconnectBytes",
        "physicalReadRequests",
        "physicalReadBytes",
        "physicalWriteRequests",
        "physicalWriteBytes",
        "exactMatchingSignature",
        "forceMatchingSignature",
        "ioCellUncompressedBytes",
        "ioCellOffloadReturnedBytes",
        "childNumber",
        "commandType",
        "usersOpening",
        "usersExecuting",
        "optimizerCost",
        "fullPlanHashValue",
        "module",
        "service",
        "action",
        "sqlProfile",
        "sqlPatch",
        "sqlPlanBaseline",
        "deltaExecutionCount",
        "deltaCpuTime",
        "deltaIoBytes",
        "deltaCpuRank",
        "deltaExecsRank",
        "sharableMemRank",
        "deltaIoRank",
        "harmonicSum",
        "wtHarmonicSum",
        "totalSqlCount"
    })
    public SqlStats(
            String sqlIdentifier,
            Long planHashValue,
            java.util.Date timeCollected,
            String instanceName,
            String lastActiveTime,
            Long parseCalls,
            Long diskReads,
            Long directReads,
            Long directWrites,
            Long bufferGets,
            Long rowsProcessed,
            Long serializableAborts,
            Long fetches,
            Long executions,
            Long avoidedExecutions,
            Long endOfFetchCount,
            Long loads,
            Long versionCount,
            Long invalidations,
            Long obsoleteCount,
            Long pxServersExecutions,
            Long cpuTimeInUs,
            Long elapsedTimeInUs,
            Long avgHardParseTimeInUs,
            Long concurrencyWaitTimeInUs,
            Long applicationWaitTimeInUs,
            Long clusterWaitTimeInUs,
            Long userIoWaitTimeInUs,
            Long plsqlExecTimeInUs,
            Long javaExecTimeInUs,
            Long sorts,
            Long sharableMem,
            Long totalSharableMem,
            Long typeCheckMem,
            Long ioCellOffloadEligibleBytes,
            Long ioInterconnectBytes,
            Long physicalReadRequests,
            Long physicalReadBytes,
            Long physicalWriteRequests,
            Long physicalWriteBytes,
            String exactMatchingSignature,
            String forceMatchingSignature,
            Long ioCellUncompressedBytes,
            Long ioCellOffloadReturnedBytes,
            Long childNumber,
            Long commandType,
            Long usersOpening,
            Long usersExecuting,
            Long optimizerCost,
            String fullPlanHashValue,
            String module,
            String service,
            String action,
            String sqlProfile,
            String sqlPatch,
            String sqlPlanBaseline,
            Long deltaExecutionCount,
            Long deltaCpuTime,
            Long deltaIoBytes,
            Long deltaCpuRank,
            Long deltaExecsRank,
            Long sharableMemRank,
            Long deltaIoRank,
            Long harmonicSum,
            Long wtHarmonicSum,
            Long totalSqlCount) {
        super();
        this.sqlIdentifier = sqlIdentifier;
        this.planHashValue = planHashValue;
        this.timeCollected = timeCollected;
        this.instanceName = instanceName;
        this.lastActiveTime = lastActiveTime;
        this.parseCalls = parseCalls;
        this.diskReads = diskReads;
        this.directReads = directReads;
        this.directWrites = directWrites;
        this.bufferGets = bufferGets;
        this.rowsProcessed = rowsProcessed;
        this.serializableAborts = serializableAborts;
        this.fetches = fetches;
        this.executions = executions;
        this.avoidedExecutions = avoidedExecutions;
        this.endOfFetchCount = endOfFetchCount;
        this.loads = loads;
        this.versionCount = versionCount;
        this.invalidations = invalidations;
        this.obsoleteCount = obsoleteCount;
        this.pxServersExecutions = pxServersExecutions;
        this.cpuTimeInUs = cpuTimeInUs;
        this.elapsedTimeInUs = elapsedTimeInUs;
        this.avgHardParseTimeInUs = avgHardParseTimeInUs;
        this.concurrencyWaitTimeInUs = concurrencyWaitTimeInUs;
        this.applicationWaitTimeInUs = applicationWaitTimeInUs;
        this.clusterWaitTimeInUs = clusterWaitTimeInUs;
        this.userIoWaitTimeInUs = userIoWaitTimeInUs;
        this.plsqlExecTimeInUs = plsqlExecTimeInUs;
        this.javaExecTimeInUs = javaExecTimeInUs;
        this.sorts = sorts;
        this.sharableMem = sharableMem;
        this.totalSharableMem = totalSharableMem;
        this.typeCheckMem = typeCheckMem;
        this.ioCellOffloadEligibleBytes = ioCellOffloadEligibleBytes;
        this.ioInterconnectBytes = ioInterconnectBytes;
        this.physicalReadRequests = physicalReadRequests;
        this.physicalReadBytes = physicalReadBytes;
        this.physicalWriteRequests = physicalWriteRequests;
        this.physicalWriteBytes = physicalWriteBytes;
        this.exactMatchingSignature = exactMatchingSignature;
        this.forceMatchingSignature = forceMatchingSignature;
        this.ioCellUncompressedBytes = ioCellUncompressedBytes;
        this.ioCellOffloadReturnedBytes = ioCellOffloadReturnedBytes;
        this.childNumber = childNumber;
        this.commandType = commandType;
        this.usersOpening = usersOpening;
        this.usersExecuting = usersExecuting;
        this.optimizerCost = optimizerCost;
        this.fullPlanHashValue = fullPlanHashValue;
        this.module = module;
        this.service = service;
        this.action = action;
        this.sqlProfile = sqlProfile;
        this.sqlPatch = sqlPatch;
        this.sqlPlanBaseline = sqlPlanBaseline;
        this.deltaExecutionCount = deltaExecutionCount;
        this.deltaCpuTime = deltaCpuTime;
        this.deltaIoBytes = deltaIoBytes;
        this.deltaCpuRank = deltaCpuRank;
        this.deltaExecsRank = deltaExecsRank;
        this.sharableMemRank = sharableMemRank;
        this.deltaIoRank = deltaIoRank;
        this.harmonicSum = harmonicSum;
        this.wtHarmonicSum = wtHarmonicSum;
        this.totalSqlCount = totalSqlCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique SQL_ID for a SQL Statement.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        /**
         * Unique SQL_ID for a SQL Statement.
         *
         * @param sqlIdentifier the value to set
         * @return this builder
         **/
        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }
        /**
         * Plan hash value for the SQL Execution Plan
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
        private Long planHashValue;

        /**
         * Plan hash value for the SQL Execution Plan
         * @param planHashValue the value to set
         * @return this builder
         **/
        public Builder planHashValue(Long planHashValue) {
            this.planHashValue = planHashValue;
            this.__explicitlySet__.add("planHashValue");
            return this;
        }
        /**
         * Collection timestamp
         * Example: {@code "2020-03-31T00:00:00.000Z"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * Collection timestamp
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
         * Name of Database Instance
         * Example: {@code "DB10902_1"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        /**
         * Name of Database Instance
         * Example: {@code "DB10902_1"}
         *
         * @param instanceName the value to set
         * @return this builder
         **/
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }
        /**
         * last_active_time
         * Example: {@code "0000000099CCE300"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastActiveTime")
        private String lastActiveTime;

        /**
         * last_active_time
         * Example: {@code "0000000099CCE300"}
         *
         * @param lastActiveTime the value to set
         * @return this builder
         **/
        public Builder lastActiveTime(String lastActiveTime) {
            this.lastActiveTime = lastActiveTime;
            this.__explicitlySet__.add("lastActiveTime");
            return this;
        }
        /**
         * Total integer of parse calls
         *  Example: {@code 60}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parseCalls")
        private Long parseCalls;

        /**
         * Total integer of parse calls
         *  Example: {@code 60}
         *
         * @param parseCalls the value to set
         * @return this builder
         **/
        public Builder parseCalls(Long parseCalls) {
            this.parseCalls = parseCalls;
            this.__explicitlySet__.add("parseCalls");
            return this;
        }
        /**
         * Number of disk reads
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskReads")
        private Long diskReads;

        /**
         * Number of disk reads
         * @param diskReads the value to set
         * @return this builder
         **/
        public Builder diskReads(Long diskReads) {
            this.diskReads = diskReads;
            this.__explicitlySet__.add("diskReads");
            return this;
        }
        /**
         * Number of direct reads
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("directReads")
        private Long directReads;

        /**
         * Number of direct reads
         * @param directReads the value to set
         * @return this builder
         **/
        public Builder directReads(Long directReads) {
            this.directReads = directReads;
            this.__explicitlySet__.add("directReads");
            return this;
        }
        /**
         * Number of Direct writes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("directWrites")
        private Long directWrites;

        /**
         * Number of Direct writes
         * @param directWrites the value to set
         * @return this builder
         **/
        public Builder directWrites(Long directWrites) {
            this.directWrites = directWrites;
            this.__explicitlySet__.add("directWrites");
            return this;
        }
        /**
         * Number of Buffer Gets
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bufferGets")
        private Long bufferGets;

        /**
         * Number of Buffer Gets
         * @param bufferGets the value to set
         * @return this builder
         **/
        public Builder bufferGets(Long bufferGets) {
            this.bufferGets = bufferGets;
            this.__explicitlySet__.add("bufferGets");
            return this;
        }
        /**
         * Number of row processed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rowsProcessed")
        private Long rowsProcessed;

        /**
         * Number of row processed
         * @param rowsProcessed the value to set
         * @return this builder
         **/
        public Builder rowsProcessed(Long rowsProcessed) {
            this.rowsProcessed = rowsProcessed;
            this.__explicitlySet__.add("rowsProcessed");
            return this;
        }
        /**
         * Number of serializable aborts
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serializableAborts")
        private Long serializableAborts;

        /**
         * Number of serializable aborts
         * @param serializableAborts the value to set
         * @return this builder
         **/
        public Builder serializableAborts(Long serializableAborts) {
            this.serializableAborts = serializableAborts;
            this.__explicitlySet__.add("serializableAborts");
            return this;
        }
        /**
         * Number of fetches
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fetches")
        private Long fetches;

        /**
         * Number of fetches
         * @param fetches the value to set
         * @return this builder
         **/
        public Builder fetches(Long fetches) {
            this.fetches = fetches;
            this.__explicitlySet__.add("fetches");
            return this;
        }
        /**
         * Number of executions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executions")
        private Long executions;

        /**
         * Number of executions
         * @param executions the value to set
         * @return this builder
         **/
        public Builder executions(Long executions) {
            this.executions = executions;
            this.__explicitlySet__.add("executions");
            return this;
        }
        /**
         * Number of executions attempted on this object, but prevented due to the SQL statement being in quarantine
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("avoidedExecutions")
        private Long avoidedExecutions;

        /**
         * Number of executions attempted on this object, but prevented due to the SQL statement being in quarantine
         * @param avoidedExecutions the value to set
         * @return this builder
         **/
        public Builder avoidedExecutions(Long avoidedExecutions) {
            this.avoidedExecutions = avoidedExecutions;
            this.__explicitlySet__.add("avoidedExecutions");
            return this;
        }
        /**
         * Number of times this cursor was fully executed since the cursor was brought into the library cache
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endOfFetchCount")
        private Long endOfFetchCount;

        /**
         * Number of times this cursor was fully executed since the cursor was brought into the library cache
         * @param endOfFetchCount the value to set
         * @return this builder
         **/
        public Builder endOfFetchCount(Long endOfFetchCount) {
            this.endOfFetchCount = endOfFetchCount;
            this.__explicitlySet__.add("endOfFetchCount");
            return this;
        }
        /**
         * Number of times the object was either loaded or reloaded
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loads")
        private Long loads;

        /**
         * Number of times the object was either loaded or reloaded
         * @param loads the value to set
         * @return this builder
         **/
        public Builder loads(Long loads) {
            this.loads = loads;
            this.__explicitlySet__.add("loads");
            return this;
        }
        /**
         * Number of cursors present in the cache with this SQL text and plan
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionCount")
        private Long versionCount;

        /**
         * Number of cursors present in the cache with this SQL text and plan
         * @param versionCount the value to set
         * @return this builder
         **/
        public Builder versionCount(Long versionCount) {
            this.versionCount = versionCount;
            this.__explicitlySet__.add("versionCount");
            return this;
        }
        /**
         * Number of times this child cursor has been invalidated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invalidations")
        private Long invalidations;

        /**
         * Number of times this child cursor has been invalidated
         * @param invalidations the value to set
         * @return this builder
         **/
        public Builder invalidations(Long invalidations) {
            this.invalidations = invalidations;
            this.__explicitlySet__.add("invalidations");
            return this;
        }
        /**
         * Number of times that a parent cursor became obsolete
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("obsoleteCount")
        private Long obsoleteCount;

        /**
         * Number of times that a parent cursor became obsolete
         * @param obsoleteCount the value to set
         * @return this builder
         **/
        public Builder obsoleteCount(Long obsoleteCount) {
            this.obsoleteCount = obsoleteCount;
            this.__explicitlySet__.add("obsoleteCount");
            return this;
        }
        /**
         * Total number of executions performed by parallel execution servers (0 when the statement has never been executed in parallel)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pxServersExecutions")
        private Long pxServersExecutions;

        /**
         * Total number of executions performed by parallel execution servers (0 when the statement has never been executed in parallel)
         * @param pxServersExecutions the value to set
         * @return this builder
         **/
        public Builder pxServersExecutions(Long pxServersExecutions) {
            this.pxServersExecutions = pxServersExecutions;
            this.__explicitlySet__.add("pxServersExecutions");
            return this;
        }
        /**
         * CPU time (in microseconds) used by this cursor for parsing, executing, and fetching
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInUs")
        private Long cpuTimeInUs;

        /**
         * CPU time (in microseconds) used by this cursor for parsing, executing, and fetching
         * @param cpuTimeInUs the value to set
         * @return this builder
         **/
        public Builder cpuTimeInUs(Long cpuTimeInUs) {
            this.cpuTimeInUs = cpuTimeInUs;
            this.__explicitlySet__.add("cpuTimeInUs");
            return this;
        }
        /**
         * Elapsed time (in microseconds) used by this cursor for parsing, executing, and fetching.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInUs")
        private Long elapsedTimeInUs;

        /**
         * Elapsed time (in microseconds) used by this cursor for parsing, executing, and fetching.
         * @param elapsedTimeInUs the value to set
         * @return this builder
         **/
        public Builder elapsedTimeInUs(Long elapsedTimeInUs) {
            this.elapsedTimeInUs = elapsedTimeInUs;
            this.__explicitlySet__.add("elapsedTimeInUs");
            return this;
        }
        /**
         * Average hard parse time (in microseconds) used by this cursor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("avgHardParseTimeInUs")
        private Long avgHardParseTimeInUs;

        /**
         * Average hard parse time (in microseconds) used by this cursor
         * @param avgHardParseTimeInUs the value to set
         * @return this builder
         **/
        public Builder avgHardParseTimeInUs(Long avgHardParseTimeInUs) {
            this.avgHardParseTimeInUs = avgHardParseTimeInUs;
            this.__explicitlySet__.add("avgHardParseTimeInUs");
            return this;
        }
        /**
         * Concurrency wait time (in microseconds)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("concurrencyWaitTimeInUs")
        private Long concurrencyWaitTimeInUs;

        /**
         * Concurrency wait time (in microseconds)
         * @param concurrencyWaitTimeInUs the value to set
         * @return this builder
         **/
        public Builder concurrencyWaitTimeInUs(Long concurrencyWaitTimeInUs) {
            this.concurrencyWaitTimeInUs = concurrencyWaitTimeInUs;
            this.__explicitlySet__.add("concurrencyWaitTimeInUs");
            return this;
        }
        /**
         * Application wait time (in microseconds)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationWaitTimeInUs")
        private Long applicationWaitTimeInUs;

        /**
         * Application wait time (in microseconds)
         * @param applicationWaitTimeInUs the value to set
         * @return this builder
         **/
        public Builder applicationWaitTimeInUs(Long applicationWaitTimeInUs) {
            this.applicationWaitTimeInUs = applicationWaitTimeInUs;
            this.__explicitlySet__.add("applicationWaitTimeInUs");
            return this;
        }
        /**
         * Cluster wait time (in microseconds). This value is specific to Oracle RAC
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterWaitTimeInUs")
        private Long clusterWaitTimeInUs;

        /**
         * Cluster wait time (in microseconds). This value is specific to Oracle RAC
         * @param clusterWaitTimeInUs the value to set
         * @return this builder
         **/
        public Builder clusterWaitTimeInUs(Long clusterWaitTimeInUs) {
            this.clusterWaitTimeInUs = clusterWaitTimeInUs;
            this.__explicitlySet__.add("clusterWaitTimeInUs");
            return this;
        }
        /**
         * User I/O wait time (in microseconds)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userIoWaitTimeInUs")
        private Long userIoWaitTimeInUs;

        /**
         * User I/O wait time (in microseconds)
         * @param userIoWaitTimeInUs the value to set
         * @return this builder
         **/
        public Builder userIoWaitTimeInUs(Long userIoWaitTimeInUs) {
            this.userIoWaitTimeInUs = userIoWaitTimeInUs;
            this.__explicitlySet__.add("userIoWaitTimeInUs");
            return this;
        }
        /**
         * PL/SQL execution time (in microseconds)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("plsqlExecTimeInUs")
        private Long plsqlExecTimeInUs;

        /**
         * PL/SQL execution time (in microseconds)
         * @param plsqlExecTimeInUs the value to set
         * @return this builder
         **/
        public Builder plsqlExecTimeInUs(Long plsqlExecTimeInUs) {
            this.plsqlExecTimeInUs = plsqlExecTimeInUs;
            this.__explicitlySet__.add("plsqlExecTimeInUs");
            return this;
        }
        /**
         * Java execution time (in microseconds)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("javaExecTimeInUs")
        private Long javaExecTimeInUs;

        /**
         * Java execution time (in microseconds)
         * @param javaExecTimeInUs the value to set
         * @return this builder
         **/
        public Builder javaExecTimeInUs(Long javaExecTimeInUs) {
            this.javaExecTimeInUs = javaExecTimeInUs;
            this.__explicitlySet__.add("javaExecTimeInUs");
            return this;
        }
        /**
         * Number of sorts that were done for the child cursor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sorts")
        private Long sorts;

        /**
         * Number of sorts that were done for the child cursor
         * @param sorts the value to set
         * @return this builder
         **/
        public Builder sorts(Long sorts) {
            this.sorts = sorts;
            this.__explicitlySet__.add("sorts");
            return this;
        }
        /**
         * Total shared memory (in bytes) currently occupied by all cursors with this SQL text and plan
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sharableMem")
        private Long sharableMem;

        /**
         * Total shared memory (in bytes) currently occupied by all cursors with this SQL text and plan
         * @param sharableMem the value to set
         * @return this builder
         **/
        public Builder sharableMem(Long sharableMem) {
            this.sharableMem = sharableMem;
            this.__explicitlySet__.add("sharableMem");
            return this;
        }
        /**
         * Total shared memory (in bytes) occupied by all cursors with this SQL text and plan if they were to be fully loaded in the shared pool (that is, cursor size)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSharableMem")
        private Long totalSharableMem;

        /**
         * Total shared memory (in bytes) occupied by all cursors with this SQL text and plan if they were to be fully loaded in the shared pool (that is, cursor size)
         * @param totalSharableMem the value to set
         * @return this builder
         **/
        public Builder totalSharableMem(Long totalSharableMem) {
            this.totalSharableMem = totalSharableMem;
            this.__explicitlySet__.add("totalSharableMem");
            return this;
        }
        /**
         * Typecheck memory
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typeCheckMem")
        private Long typeCheckMem;

        /**
         * Typecheck memory
         * @param typeCheckMem the value to set
         * @return this builder
         **/
        public Builder typeCheckMem(Long typeCheckMem) {
            this.typeCheckMem = typeCheckMem;
            this.__explicitlySet__.add("typeCheckMem");
            return this;
        }
        /**
         * Number of I/O bytes which can be filtered by the Exadata storage system
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadEligibleBytes")
        private Long ioCellOffloadEligibleBytes;

        /**
         * Number of I/O bytes which can be filtered by the Exadata storage system
         * @param ioCellOffloadEligibleBytes the value to set
         * @return this builder
         **/
        public Builder ioCellOffloadEligibleBytes(Long ioCellOffloadEligibleBytes) {
            this.ioCellOffloadEligibleBytes = ioCellOffloadEligibleBytes;
            this.__explicitlySet__.add("ioCellOffloadEligibleBytes");
            return this;
        }
        /**
         * Number of I/O bytes exchanged between Oracle Database and the storage system. Typically used for Cache Fusion or parallel queries
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ioInterconnectBytes")
        private Long ioInterconnectBytes;

        /**
         * Number of I/O bytes exchanged between Oracle Database and the storage system. Typically used for Cache Fusion or parallel queries
         * @param ioInterconnectBytes the value to set
         * @return this builder
         **/
        public Builder ioInterconnectBytes(Long ioInterconnectBytes) {
            this.ioInterconnectBytes = ioInterconnectBytes;
            this.__explicitlySet__.add("ioInterconnectBytes");
            return this;
        }
        /**
         * Number of physical read I/O requests issued by the monitored SQL. The requests may not be disk reads
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("physicalReadRequests")
        private Long physicalReadRequests;

        /**
         * Number of physical read I/O requests issued by the monitored SQL. The requests may not be disk reads
         * @param physicalReadRequests the value to set
         * @return this builder
         **/
        public Builder physicalReadRequests(Long physicalReadRequests) {
            this.physicalReadRequests = physicalReadRequests;
            this.__explicitlySet__.add("physicalReadRequests");
            return this;
        }
        /**
         * Number of bytes read from disks by the monitored SQL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("physicalReadBytes")
        private Long physicalReadBytes;

        /**
         * Number of bytes read from disks by the monitored SQL
         * @param physicalReadBytes the value to set
         * @return this builder
         **/
        public Builder physicalReadBytes(Long physicalReadBytes) {
            this.physicalReadBytes = physicalReadBytes;
            this.__explicitlySet__.add("physicalReadBytes");
            return this;
        }
        /**
         * Number of physical write I/O requests issued by the monitored SQL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteRequests")
        private Long physicalWriteRequests;

        /**
         * Number of physical write I/O requests issued by the monitored SQL
         * @param physicalWriteRequests the value to set
         * @return this builder
         **/
        public Builder physicalWriteRequests(Long physicalWriteRequests) {
            this.physicalWriteRequests = physicalWriteRequests;
            this.__explicitlySet__.add("physicalWriteRequests");
            return this;
        }
        /**
         * Number of bytes written to disks by the monitored SQL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteBytes")
        private Long physicalWriteBytes;

        /**
         * Number of bytes written to disks by the monitored SQL
         * @param physicalWriteBytes the value to set
         * @return this builder
         **/
        public Builder physicalWriteBytes(Long physicalWriteBytes) {
            this.physicalWriteBytes = physicalWriteBytes;
            this.__explicitlySet__.add("physicalWriteBytes");
            return this;
        }
        /**
         * exact_matching_signature
         * Example: {@code "18067345456756876713"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
        private String exactMatchingSignature;

        /**
         * exact_matching_signature
         * Example: {@code "18067345456756876713"}
         *
         * @param exactMatchingSignature the value to set
         * @return this builder
         **/
        public Builder exactMatchingSignature(String exactMatchingSignature) {
            this.exactMatchingSignature = exactMatchingSignature;
            this.__explicitlySet__.add("exactMatchingSignature");
            return this;
        }
        /**
         * force_matching_signature
         * Example: {@code "18067345456756876713"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
        private String forceMatchingSignature;

        /**
         * force_matching_signature
         * Example: {@code "18067345456756876713"}
         *
         * @param forceMatchingSignature the value to set
         * @return this builder
         **/
        public Builder forceMatchingSignature(String forceMatchingSignature) {
            this.forceMatchingSignature = forceMatchingSignature;
            this.__explicitlySet__.add("forceMatchingSignature");
            return this;
        }
        /**
         * Number of uncompressed bytes (that is, size after decompression) that are offloaded to the Exadata cells
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ioCellUncompressedBytes")
        private Long ioCellUncompressedBytes;

        /**
         * Number of uncompressed bytes (that is, size after decompression) that are offloaded to the Exadata cells
         * @param ioCellUncompressedBytes the value to set
         * @return this builder
         **/
        public Builder ioCellUncompressedBytes(Long ioCellUncompressedBytes) {
            this.ioCellUncompressedBytes = ioCellUncompressedBytes;
            this.__explicitlySet__.add("ioCellUncompressedBytes");
            return this;
        }
        /**
         * Number of bytes that are returned by Exadata cell through the regular I/O path
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadReturnedBytes")
        private Long ioCellOffloadReturnedBytes;

        /**
         * Number of bytes that are returned by Exadata cell through the regular I/O path
         * @param ioCellOffloadReturnedBytes the value to set
         * @return this builder
         **/
        public Builder ioCellOffloadReturnedBytes(Long ioCellOffloadReturnedBytes) {
            this.ioCellOffloadReturnedBytes = ioCellOffloadReturnedBytes;
            this.__explicitlySet__.add("ioCellOffloadReturnedBytes");
            return this;
        }
        /**
         * Number of this child cursor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("childNumber")
        private Long childNumber;

        /**
         * Number of this child cursor
         * @param childNumber the value to set
         * @return this builder
         **/
        public Builder childNumber(Long childNumber) {
            this.childNumber = childNumber;
            this.__explicitlySet__.add("childNumber");
            return this;
        }
        /**
         * Oracle command type definition
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commandType")
        private Long commandType;

        /**
         * Oracle command type definition
         * @param commandType the value to set
         * @return this builder
         **/
        public Builder commandType(Long commandType) {
            this.commandType = commandType;
            this.__explicitlySet__.add("commandType");
            return this;
        }
        /**
         * Number of users that have any of the child cursors open
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usersOpening")
        private Long usersOpening;

        /**
         * Number of users that have any of the child cursors open
         * @param usersOpening the value to set
         * @return this builder
         **/
        public Builder usersOpening(Long usersOpening) {
            this.usersOpening = usersOpening;
            this.__explicitlySet__.add("usersOpening");
            return this;
        }
        /**
         * Number of users executing the statement
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usersExecuting")
        private Long usersExecuting;

        /**
         * Number of users executing the statement
         * @param usersExecuting the value to set
         * @return this builder
         **/
        public Builder usersExecuting(Long usersExecuting) {
            this.usersExecuting = usersExecuting;
            this.__explicitlySet__.add("usersExecuting");
            return this;
        }
        /**
         * Cost of this query given by the optimizer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("optimizerCost")
        private Long optimizerCost;

        /**
         * Cost of this query given by the optimizer
         * @param optimizerCost the value to set
         * @return this builder
         **/
        public Builder optimizerCost(Long optimizerCost) {
            this.optimizerCost = optimizerCost;
            this.__explicitlySet__.add("optimizerCost");
            return this;
        }
        /**
         * Total Number of rows in SQLStats table
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fullPlanHashValue")
        private String fullPlanHashValue;

        /**
         * Total Number of rows in SQLStats table
         * @param fullPlanHashValue the value to set
         * @return this builder
         **/
        public Builder fullPlanHashValue(String fullPlanHashValue) {
            this.fullPlanHashValue = fullPlanHashValue;
            this.__explicitlySet__.add("fullPlanHashValue");
            return this;
        }
        /**
         * Module name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("module")
        private String module;

        /**
         * Module name
         * @param module the value to set
         * @return this builder
         **/
        public Builder module(String module) {
            this.module = module;
            this.__explicitlySet__.add("module");
            return this;
        }
        /**
         * Service name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * Service name
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * Contains the name of the action that was executing when the SQL statement was first parsed, which is set by calling DBMS_APPLICATION_INFO.SET_ACTION
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * Contains the name of the action that was executing when the SQL statement was first parsed, which is set by calling DBMS_APPLICATION_INFO.SET_ACTION
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * SQL profile used for this statement, if any
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlProfile")
        private String sqlProfile;

        /**
         * SQL profile used for this statement, if any
         * @param sqlProfile the value to set
         * @return this builder
         **/
        public Builder sqlProfile(String sqlProfile) {
            this.sqlProfile = sqlProfile;
            this.__explicitlySet__.add("sqlProfile");
            return this;
        }
        /**
         * SQL patch used for this statement, if any
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlPatch")
        private String sqlPatch;

        /**
         * SQL patch used for this statement, if any
         * @param sqlPatch the value to set
         * @return this builder
         **/
        public Builder sqlPatch(String sqlPatch) {
            this.sqlPatch = sqlPatch;
            this.__explicitlySet__.add("sqlPatch");
            return this;
        }
        /**
         * SQL plan baseline used for this statement, if any
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlPlanBaseline")
        private String sqlPlanBaseline;

        /**
         * SQL plan baseline used for this statement, if any
         * @param sqlPlanBaseline the value to set
         * @return this builder
         **/
        public Builder sqlPlanBaseline(String sqlPlanBaseline) {
            this.sqlPlanBaseline = sqlPlanBaseline;
            this.__explicitlySet__.add("sqlPlanBaseline");
            return this;
        }
        /**
         * Number of executions for the cursor since the last AWR snapshot
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deltaExecutionCount")
        private Long deltaExecutionCount;

        /**
         * Number of executions for the cursor since the last AWR snapshot
         * @param deltaExecutionCount the value to set
         * @return this builder
         **/
        public Builder deltaExecutionCount(Long deltaExecutionCount) {
            this.deltaExecutionCount = deltaExecutionCount;
            this.__explicitlySet__.add("deltaExecutionCount");
            return this;
        }
        /**
         * CPU time (in microseconds) for the cursor since the last AWR snapshot
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuTime")
        private Long deltaCpuTime;

        /**
         * CPU time (in microseconds) for the cursor since the last AWR snapshot
         * @param deltaCpuTime the value to set
         * @return this builder
         **/
        public Builder deltaCpuTime(Long deltaCpuTime) {
            this.deltaCpuTime = deltaCpuTime;
            this.__explicitlySet__.add("deltaCpuTime");
            return this;
        }
        /**
         * Number of I/O bytes exchanged between the Oracle database and the storage system for the cursor since the last AWR snapshot
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deltaIoBytes")
        private Long deltaIoBytes;

        /**
         * Number of I/O bytes exchanged between the Oracle database and the storage system for the cursor since the last AWR snapshot
         * @param deltaIoBytes the value to set
         * @return this builder
         **/
        public Builder deltaIoBytes(Long deltaIoBytes) {
            this.deltaIoBytes = deltaIoBytes;
            this.__explicitlySet__.add("deltaIoBytes");
            return this;
        }
        /**
         * Rank based on CPU Consumption
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuRank")
        private Long deltaCpuRank;

        /**
         * Rank based on CPU Consumption
         * @param deltaCpuRank the value to set
         * @return this builder
         **/
        public Builder deltaCpuRank(Long deltaCpuRank) {
            this.deltaCpuRank = deltaCpuRank;
            this.__explicitlySet__.add("deltaCpuRank");
            return this;
        }
        /**
         * Rank based on number of execution
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deltaExecsRank")
        private Long deltaExecsRank;

        /**
         * Rank based on number of execution
         * @param deltaExecsRank the value to set
         * @return this builder
         **/
        public Builder deltaExecsRank(Long deltaExecsRank) {
            this.deltaExecsRank = deltaExecsRank;
            this.__explicitlySet__.add("deltaExecsRank");
            return this;
        }
        /**
         * Rank based on sharable memory
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sharableMemRank")
        private Long sharableMemRank;

        /**
         * Rank based on sharable memory
         * @param sharableMemRank the value to set
         * @return this builder
         **/
        public Builder sharableMemRank(Long sharableMemRank) {
            this.sharableMemRank = sharableMemRank;
            this.__explicitlySet__.add("sharableMemRank");
            return this;
        }
        /**
         * Rank based on I/O Consumption
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deltaIoRank")
        private Long deltaIoRank;

        /**
         * Rank based on I/O Consumption
         * @param deltaIoRank the value to set
         * @return this builder
         **/
        public Builder deltaIoRank(Long deltaIoRank) {
            this.deltaIoRank = deltaIoRank;
            this.__explicitlySet__.add("deltaIoRank");
            return this;
        }
        /**
         * Harmonic sum based on ranking parameters
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("harmonicSum")
        private Long harmonicSum;

        /**
         * Harmonic sum based on ranking parameters
         * @param harmonicSum the value to set
         * @return this builder
         **/
        public Builder harmonicSum(Long harmonicSum) {
            this.harmonicSum = harmonicSum;
            this.__explicitlySet__.add("harmonicSum");
            return this;
        }
        /**
         * Weight based harmonic sum of ranking parameters
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wtHarmonicSum")
        private Long wtHarmonicSum;

        /**
         * Weight based harmonic sum of ranking parameters
         * @param wtHarmonicSum the value to set
         * @return this builder
         **/
        public Builder wtHarmonicSum(Long wtHarmonicSum) {
            this.wtHarmonicSum = wtHarmonicSum;
            this.__explicitlySet__.add("wtHarmonicSum");
            return this;
        }
        /**
         * Total number of rows in SQLStats table
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSqlCount")
        private Long totalSqlCount;

        /**
         * Total number of rows in SQLStats table
         * @param totalSqlCount the value to set
         * @return this builder
         **/
        public Builder totalSqlCount(Long totalSqlCount) {
            this.totalSqlCount = totalSqlCount;
            this.__explicitlySet__.add("totalSqlCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStats build() {
            SqlStats model =
                    new SqlStats(
                            this.sqlIdentifier,
                            this.planHashValue,
                            this.timeCollected,
                            this.instanceName,
                            this.lastActiveTime,
                            this.parseCalls,
                            this.diskReads,
                            this.directReads,
                            this.directWrites,
                            this.bufferGets,
                            this.rowsProcessed,
                            this.serializableAborts,
                            this.fetches,
                            this.executions,
                            this.avoidedExecutions,
                            this.endOfFetchCount,
                            this.loads,
                            this.versionCount,
                            this.invalidations,
                            this.obsoleteCount,
                            this.pxServersExecutions,
                            this.cpuTimeInUs,
                            this.elapsedTimeInUs,
                            this.avgHardParseTimeInUs,
                            this.concurrencyWaitTimeInUs,
                            this.applicationWaitTimeInUs,
                            this.clusterWaitTimeInUs,
                            this.userIoWaitTimeInUs,
                            this.plsqlExecTimeInUs,
                            this.javaExecTimeInUs,
                            this.sorts,
                            this.sharableMem,
                            this.totalSharableMem,
                            this.typeCheckMem,
                            this.ioCellOffloadEligibleBytes,
                            this.ioInterconnectBytes,
                            this.physicalReadRequests,
                            this.physicalReadBytes,
                            this.physicalWriteRequests,
                            this.physicalWriteBytes,
                            this.exactMatchingSignature,
                            this.forceMatchingSignature,
                            this.ioCellUncompressedBytes,
                            this.ioCellOffloadReturnedBytes,
                            this.childNumber,
                            this.commandType,
                            this.usersOpening,
                            this.usersExecuting,
                            this.optimizerCost,
                            this.fullPlanHashValue,
                            this.module,
                            this.service,
                            this.action,
                            this.sqlProfile,
                            this.sqlPatch,
                            this.sqlPlanBaseline,
                            this.deltaExecutionCount,
                            this.deltaCpuTime,
                            this.deltaIoBytes,
                            this.deltaCpuRank,
                            this.deltaExecsRank,
                            this.sharableMemRank,
                            this.deltaIoRank,
                            this.harmonicSum,
                            this.wtHarmonicSum,
                            this.totalSqlCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStats model) {
            if (model.wasPropertyExplicitlySet("sqlIdentifier")) {
                this.sqlIdentifier(model.getSqlIdentifier());
            }
            if (model.wasPropertyExplicitlySet("planHashValue")) {
                this.planHashValue(model.getPlanHashValue());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("instanceName")) {
                this.instanceName(model.getInstanceName());
            }
            if (model.wasPropertyExplicitlySet("lastActiveTime")) {
                this.lastActiveTime(model.getLastActiveTime());
            }
            if (model.wasPropertyExplicitlySet("parseCalls")) {
                this.parseCalls(model.getParseCalls());
            }
            if (model.wasPropertyExplicitlySet("diskReads")) {
                this.diskReads(model.getDiskReads());
            }
            if (model.wasPropertyExplicitlySet("directReads")) {
                this.directReads(model.getDirectReads());
            }
            if (model.wasPropertyExplicitlySet("directWrites")) {
                this.directWrites(model.getDirectWrites());
            }
            if (model.wasPropertyExplicitlySet("bufferGets")) {
                this.bufferGets(model.getBufferGets());
            }
            if (model.wasPropertyExplicitlySet("rowsProcessed")) {
                this.rowsProcessed(model.getRowsProcessed());
            }
            if (model.wasPropertyExplicitlySet("serializableAborts")) {
                this.serializableAborts(model.getSerializableAborts());
            }
            if (model.wasPropertyExplicitlySet("fetches")) {
                this.fetches(model.getFetches());
            }
            if (model.wasPropertyExplicitlySet("executions")) {
                this.executions(model.getExecutions());
            }
            if (model.wasPropertyExplicitlySet("avoidedExecutions")) {
                this.avoidedExecutions(model.getAvoidedExecutions());
            }
            if (model.wasPropertyExplicitlySet("endOfFetchCount")) {
                this.endOfFetchCount(model.getEndOfFetchCount());
            }
            if (model.wasPropertyExplicitlySet("loads")) {
                this.loads(model.getLoads());
            }
            if (model.wasPropertyExplicitlySet("versionCount")) {
                this.versionCount(model.getVersionCount());
            }
            if (model.wasPropertyExplicitlySet("invalidations")) {
                this.invalidations(model.getInvalidations());
            }
            if (model.wasPropertyExplicitlySet("obsoleteCount")) {
                this.obsoleteCount(model.getObsoleteCount());
            }
            if (model.wasPropertyExplicitlySet("pxServersExecutions")) {
                this.pxServersExecutions(model.getPxServersExecutions());
            }
            if (model.wasPropertyExplicitlySet("cpuTimeInUs")) {
                this.cpuTimeInUs(model.getCpuTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("elapsedTimeInUs")) {
                this.elapsedTimeInUs(model.getElapsedTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("avgHardParseTimeInUs")) {
                this.avgHardParseTimeInUs(model.getAvgHardParseTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("concurrencyWaitTimeInUs")) {
                this.concurrencyWaitTimeInUs(model.getConcurrencyWaitTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("applicationWaitTimeInUs")) {
                this.applicationWaitTimeInUs(model.getApplicationWaitTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("clusterWaitTimeInUs")) {
                this.clusterWaitTimeInUs(model.getClusterWaitTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("userIoWaitTimeInUs")) {
                this.userIoWaitTimeInUs(model.getUserIoWaitTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("plsqlExecTimeInUs")) {
                this.plsqlExecTimeInUs(model.getPlsqlExecTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("javaExecTimeInUs")) {
                this.javaExecTimeInUs(model.getJavaExecTimeInUs());
            }
            if (model.wasPropertyExplicitlySet("sorts")) {
                this.sorts(model.getSorts());
            }
            if (model.wasPropertyExplicitlySet("sharableMem")) {
                this.sharableMem(model.getSharableMem());
            }
            if (model.wasPropertyExplicitlySet("totalSharableMem")) {
                this.totalSharableMem(model.getTotalSharableMem());
            }
            if (model.wasPropertyExplicitlySet("typeCheckMem")) {
                this.typeCheckMem(model.getTypeCheckMem());
            }
            if (model.wasPropertyExplicitlySet("ioCellOffloadEligibleBytes")) {
                this.ioCellOffloadEligibleBytes(model.getIoCellOffloadEligibleBytes());
            }
            if (model.wasPropertyExplicitlySet("ioInterconnectBytes")) {
                this.ioInterconnectBytes(model.getIoInterconnectBytes());
            }
            if (model.wasPropertyExplicitlySet("physicalReadRequests")) {
                this.physicalReadRequests(model.getPhysicalReadRequests());
            }
            if (model.wasPropertyExplicitlySet("physicalReadBytes")) {
                this.physicalReadBytes(model.getPhysicalReadBytes());
            }
            if (model.wasPropertyExplicitlySet("physicalWriteRequests")) {
                this.physicalWriteRequests(model.getPhysicalWriteRequests());
            }
            if (model.wasPropertyExplicitlySet("physicalWriteBytes")) {
                this.physicalWriteBytes(model.getPhysicalWriteBytes());
            }
            if (model.wasPropertyExplicitlySet("exactMatchingSignature")) {
                this.exactMatchingSignature(model.getExactMatchingSignature());
            }
            if (model.wasPropertyExplicitlySet("forceMatchingSignature")) {
                this.forceMatchingSignature(model.getForceMatchingSignature());
            }
            if (model.wasPropertyExplicitlySet("ioCellUncompressedBytes")) {
                this.ioCellUncompressedBytes(model.getIoCellUncompressedBytes());
            }
            if (model.wasPropertyExplicitlySet("ioCellOffloadReturnedBytes")) {
                this.ioCellOffloadReturnedBytes(model.getIoCellOffloadReturnedBytes());
            }
            if (model.wasPropertyExplicitlySet("childNumber")) {
                this.childNumber(model.getChildNumber());
            }
            if (model.wasPropertyExplicitlySet("commandType")) {
                this.commandType(model.getCommandType());
            }
            if (model.wasPropertyExplicitlySet("usersOpening")) {
                this.usersOpening(model.getUsersOpening());
            }
            if (model.wasPropertyExplicitlySet("usersExecuting")) {
                this.usersExecuting(model.getUsersExecuting());
            }
            if (model.wasPropertyExplicitlySet("optimizerCost")) {
                this.optimizerCost(model.getOptimizerCost());
            }
            if (model.wasPropertyExplicitlySet("fullPlanHashValue")) {
                this.fullPlanHashValue(model.getFullPlanHashValue());
            }
            if (model.wasPropertyExplicitlySet("module")) {
                this.module(model.getModule());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("sqlProfile")) {
                this.sqlProfile(model.getSqlProfile());
            }
            if (model.wasPropertyExplicitlySet("sqlPatch")) {
                this.sqlPatch(model.getSqlPatch());
            }
            if (model.wasPropertyExplicitlySet("sqlPlanBaseline")) {
                this.sqlPlanBaseline(model.getSqlPlanBaseline());
            }
            if (model.wasPropertyExplicitlySet("deltaExecutionCount")) {
                this.deltaExecutionCount(model.getDeltaExecutionCount());
            }
            if (model.wasPropertyExplicitlySet("deltaCpuTime")) {
                this.deltaCpuTime(model.getDeltaCpuTime());
            }
            if (model.wasPropertyExplicitlySet("deltaIoBytes")) {
                this.deltaIoBytes(model.getDeltaIoBytes());
            }
            if (model.wasPropertyExplicitlySet("deltaCpuRank")) {
                this.deltaCpuRank(model.getDeltaCpuRank());
            }
            if (model.wasPropertyExplicitlySet("deltaExecsRank")) {
                this.deltaExecsRank(model.getDeltaExecsRank());
            }
            if (model.wasPropertyExplicitlySet("sharableMemRank")) {
                this.sharableMemRank(model.getSharableMemRank());
            }
            if (model.wasPropertyExplicitlySet("deltaIoRank")) {
                this.deltaIoRank(model.getDeltaIoRank());
            }
            if (model.wasPropertyExplicitlySet("harmonicSum")) {
                this.harmonicSum(model.getHarmonicSum());
            }
            if (model.wasPropertyExplicitlySet("wtHarmonicSum")) {
                this.wtHarmonicSum(model.getWtHarmonicSum());
            }
            if (model.wasPropertyExplicitlySet("totalSqlCount")) {
                this.totalSqlCount(model.getTotalSqlCount());
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
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    private final String sqlIdentifier;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     * @return the value
     **/
    public String getSqlIdentifier() {
        return sqlIdentifier;
    }

    /**
     * Plan hash value for the SQL Execution Plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
    private final Long planHashValue;

    /**
     * Plan hash value for the SQL Execution Plan
     * @return the value
     **/
    public Long getPlanHashValue() {
        return planHashValue;
    }

    /**
     * Collection timestamp
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * Collection timestamp
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     * @return the value
     **/
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /**
     * Name of Database Instance
     * Example: {@code "DB10902_1"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    /**
     * Name of Database Instance
     * Example: {@code "DB10902_1"}
     *
     * @return the value
     **/
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * last_active_time
     * Example: {@code "0000000099CCE300"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastActiveTime")
    private final String lastActiveTime;

    /**
     * last_active_time
     * Example: {@code "0000000099CCE300"}
     *
     * @return the value
     **/
    public String getLastActiveTime() {
        return lastActiveTime;
    }

    /**
     * Total integer of parse calls
     *  Example: {@code 60}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parseCalls")
    private final Long parseCalls;

    /**
     * Total integer of parse calls
     *  Example: {@code 60}
     *
     * @return the value
     **/
    public Long getParseCalls() {
        return parseCalls;
    }

    /**
     * Number of disk reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskReads")
    private final Long diskReads;

    /**
     * Number of disk reads
     * @return the value
     **/
    public Long getDiskReads() {
        return diskReads;
    }

    /**
     * Number of direct reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("directReads")
    private final Long directReads;

    /**
     * Number of direct reads
     * @return the value
     **/
    public Long getDirectReads() {
        return directReads;
    }

    /**
     * Number of Direct writes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("directWrites")
    private final Long directWrites;

    /**
     * Number of Direct writes
     * @return the value
     **/
    public Long getDirectWrites() {
        return directWrites;
    }

    /**
     * Number of Buffer Gets
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bufferGets")
    private final Long bufferGets;

    /**
     * Number of Buffer Gets
     * @return the value
     **/
    public Long getBufferGets() {
        return bufferGets;
    }

    /**
     * Number of row processed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowsProcessed")
    private final Long rowsProcessed;

    /**
     * Number of row processed
     * @return the value
     **/
    public Long getRowsProcessed() {
        return rowsProcessed;
    }

    /**
     * Number of serializable aborts
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serializableAborts")
    private final Long serializableAborts;

    /**
     * Number of serializable aborts
     * @return the value
     **/
    public Long getSerializableAborts() {
        return serializableAborts;
    }

    /**
     * Number of fetches
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetches")
    private final Long fetches;

    /**
     * Number of fetches
     * @return the value
     **/
    public Long getFetches() {
        return fetches;
    }

    /**
     * Number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executions")
    private final Long executions;

    /**
     * Number of executions
     * @return the value
     **/
    public Long getExecutions() {
        return executions;
    }

    /**
     * Number of executions attempted on this object, but prevented due to the SQL statement being in quarantine
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avoidedExecutions")
    private final Long avoidedExecutions;

    /**
     * Number of executions attempted on this object, but prevented due to the SQL statement being in quarantine
     * @return the value
     **/
    public Long getAvoidedExecutions() {
        return avoidedExecutions;
    }

    /**
     * Number of times this cursor was fully executed since the cursor was brought into the library cache
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endOfFetchCount")
    private final Long endOfFetchCount;

    /**
     * Number of times this cursor was fully executed since the cursor was brought into the library cache
     * @return the value
     **/
    public Long getEndOfFetchCount() {
        return endOfFetchCount;
    }

    /**
     * Number of times the object was either loaded or reloaded
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loads")
    private final Long loads;

    /**
     * Number of times the object was either loaded or reloaded
     * @return the value
     **/
    public Long getLoads() {
        return loads;
    }

    /**
     * Number of cursors present in the cache with this SQL text and plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionCount")
    private final Long versionCount;

    /**
     * Number of cursors present in the cache with this SQL text and plan
     * @return the value
     **/
    public Long getVersionCount() {
        return versionCount;
    }

    /**
     * Number of times this child cursor has been invalidated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invalidations")
    private final Long invalidations;

    /**
     * Number of times this child cursor has been invalidated
     * @return the value
     **/
    public Long getInvalidations() {
        return invalidations;
    }

    /**
     * Number of times that a parent cursor became obsolete
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("obsoleteCount")
    private final Long obsoleteCount;

    /**
     * Number of times that a parent cursor became obsolete
     * @return the value
     **/
    public Long getObsoleteCount() {
        return obsoleteCount;
    }

    /**
     * Total number of executions performed by parallel execution servers (0 when the statement has never been executed in parallel)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pxServersExecutions")
    private final Long pxServersExecutions;

    /**
     * Total number of executions performed by parallel execution servers (0 when the statement has never been executed in parallel)
     * @return the value
     **/
    public Long getPxServersExecutions() {
        return pxServersExecutions;
    }

    /**
     * CPU time (in microseconds) used by this cursor for parsing, executing, and fetching
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInUs")
    private final Long cpuTimeInUs;

    /**
     * CPU time (in microseconds) used by this cursor for parsing, executing, and fetching
     * @return the value
     **/
    public Long getCpuTimeInUs() {
        return cpuTimeInUs;
    }

    /**
     * Elapsed time (in microseconds) used by this cursor for parsing, executing, and fetching.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInUs")
    private final Long elapsedTimeInUs;

    /**
     * Elapsed time (in microseconds) used by this cursor for parsing, executing, and fetching.
     * @return the value
     **/
    public Long getElapsedTimeInUs() {
        return elapsedTimeInUs;
    }

    /**
     * Average hard parse time (in microseconds) used by this cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgHardParseTimeInUs")
    private final Long avgHardParseTimeInUs;

    /**
     * Average hard parse time (in microseconds) used by this cursor
     * @return the value
     **/
    public Long getAvgHardParseTimeInUs() {
        return avgHardParseTimeInUs;
    }

    /**
     * Concurrency wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("concurrencyWaitTimeInUs")
    private final Long concurrencyWaitTimeInUs;

    /**
     * Concurrency wait time (in microseconds)
     * @return the value
     **/
    public Long getConcurrencyWaitTimeInUs() {
        return concurrencyWaitTimeInUs;
    }

    /**
     * Application wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationWaitTimeInUs")
    private final Long applicationWaitTimeInUs;

    /**
     * Application wait time (in microseconds)
     * @return the value
     **/
    public Long getApplicationWaitTimeInUs() {
        return applicationWaitTimeInUs;
    }

    /**
     * Cluster wait time (in microseconds). This value is specific to Oracle RAC
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterWaitTimeInUs")
    private final Long clusterWaitTimeInUs;

    /**
     * Cluster wait time (in microseconds). This value is specific to Oracle RAC
     * @return the value
     **/
    public Long getClusterWaitTimeInUs() {
        return clusterWaitTimeInUs;
    }

    /**
     * User I/O wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userIoWaitTimeInUs")
    private final Long userIoWaitTimeInUs;

    /**
     * User I/O wait time (in microseconds)
     * @return the value
     **/
    public Long getUserIoWaitTimeInUs() {
        return userIoWaitTimeInUs;
    }

    /**
     * PL/SQL execution time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plsqlExecTimeInUs")
    private final Long plsqlExecTimeInUs;

    /**
     * PL/SQL execution time (in microseconds)
     * @return the value
     **/
    public Long getPlsqlExecTimeInUs() {
        return plsqlExecTimeInUs;
    }

    /**
     * Java execution time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("javaExecTimeInUs")
    private final Long javaExecTimeInUs;

    /**
     * Java execution time (in microseconds)
     * @return the value
     **/
    public Long getJavaExecTimeInUs() {
        return javaExecTimeInUs;
    }

    /**
     * Number of sorts that were done for the child cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sorts")
    private final Long sorts;

    /**
     * Number of sorts that were done for the child cursor
     * @return the value
     **/
    public Long getSorts() {
        return sorts;
    }

    /**
     * Total shared memory (in bytes) currently occupied by all cursors with this SQL text and plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharableMem")
    private final Long sharableMem;

    /**
     * Total shared memory (in bytes) currently occupied by all cursors with this SQL text and plan
     * @return the value
     **/
    public Long getSharableMem() {
        return sharableMem;
    }

    /**
     * Total shared memory (in bytes) occupied by all cursors with this SQL text and plan if they were to be fully loaded in the shared pool (that is, cursor size)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSharableMem")
    private final Long totalSharableMem;

    /**
     * Total shared memory (in bytes) occupied by all cursors with this SQL text and plan if they were to be fully loaded in the shared pool (that is, cursor size)
     * @return the value
     **/
    public Long getTotalSharableMem() {
        return totalSharableMem;
    }

    /**
     * Typecheck memory
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeCheckMem")
    private final Long typeCheckMem;

    /**
     * Typecheck memory
     * @return the value
     **/
    public Long getTypeCheckMem() {
        return typeCheckMem;
    }

    /**
     * Number of I/O bytes which can be filtered by the Exadata storage system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadEligibleBytes")
    private final Long ioCellOffloadEligibleBytes;

    /**
     * Number of I/O bytes which can be filtered by the Exadata storage system
     * @return the value
     **/
    public Long getIoCellOffloadEligibleBytes() {
        return ioCellOffloadEligibleBytes;
    }

    /**
     * Number of I/O bytes exchanged between Oracle Database and the storage system. Typically used for Cache Fusion or parallel queries
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioInterconnectBytes")
    private final Long ioInterconnectBytes;

    /**
     * Number of I/O bytes exchanged between Oracle Database and the storage system. Typically used for Cache Fusion or parallel queries
     * @return the value
     **/
    public Long getIoInterconnectBytes() {
        return ioInterconnectBytes;
    }

    /**
     * Number of physical read I/O requests issued by the monitored SQL. The requests may not be disk reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalReadRequests")
    private final Long physicalReadRequests;

    /**
     * Number of physical read I/O requests issued by the monitored SQL. The requests may not be disk reads
     * @return the value
     **/
    public Long getPhysicalReadRequests() {
        return physicalReadRequests;
    }

    /**
     * Number of bytes read from disks by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalReadBytes")
    private final Long physicalReadBytes;

    /**
     * Number of bytes read from disks by the monitored SQL
     * @return the value
     **/
    public Long getPhysicalReadBytes() {
        return physicalReadBytes;
    }

    /**
     * Number of physical write I/O requests issued by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteRequests")
    private final Long physicalWriteRequests;

    /**
     * Number of physical write I/O requests issued by the monitored SQL
     * @return the value
     **/
    public Long getPhysicalWriteRequests() {
        return physicalWriteRequests;
    }

    /**
     * Number of bytes written to disks by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteBytes")
    private final Long physicalWriteBytes;

    /**
     * Number of bytes written to disks by the monitored SQL
     * @return the value
     **/
    public Long getPhysicalWriteBytes() {
        return physicalWriteBytes;
    }

    /**
     * exact_matching_signature
     * Example: {@code "18067345456756876713"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
    private final String exactMatchingSignature;

    /**
     * exact_matching_signature
     * Example: {@code "18067345456756876713"}
     *
     * @return the value
     **/
    public String getExactMatchingSignature() {
        return exactMatchingSignature;
    }

    /**
     * force_matching_signature
     * Example: {@code "18067345456756876713"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
    private final String forceMatchingSignature;

    /**
     * force_matching_signature
     * Example: {@code "18067345456756876713"}
     *
     * @return the value
     **/
    public String getForceMatchingSignature() {
        return forceMatchingSignature;
    }

    /**
     * Number of uncompressed bytes (that is, size after decompression) that are offloaded to the Exadata cells
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellUncompressedBytes")
    private final Long ioCellUncompressedBytes;

    /**
     * Number of uncompressed bytes (that is, size after decompression) that are offloaded to the Exadata cells
     * @return the value
     **/
    public Long getIoCellUncompressedBytes() {
        return ioCellUncompressedBytes;
    }

    /**
     * Number of bytes that are returned by Exadata cell through the regular I/O path
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadReturnedBytes")
    private final Long ioCellOffloadReturnedBytes;

    /**
     * Number of bytes that are returned by Exadata cell through the regular I/O path
     * @return the value
     **/
    public Long getIoCellOffloadReturnedBytes() {
        return ioCellOffloadReturnedBytes;
    }

    /**
     * Number of this child cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childNumber")
    private final Long childNumber;

    /**
     * Number of this child cursor
     * @return the value
     **/
    public Long getChildNumber() {
        return childNumber;
    }

    /**
     * Oracle command type definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commandType")
    private final Long commandType;

    /**
     * Oracle command type definition
     * @return the value
     **/
    public Long getCommandType() {
        return commandType;
    }

    /**
     * Number of users that have any of the child cursors open
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usersOpening")
    private final Long usersOpening;

    /**
     * Number of users that have any of the child cursors open
     * @return the value
     **/
    public Long getUsersOpening() {
        return usersOpening;
    }

    /**
     * Number of users executing the statement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usersExecuting")
    private final Long usersExecuting;

    /**
     * Number of users executing the statement
     * @return the value
     **/
    public Long getUsersExecuting() {
        return usersExecuting;
    }

    /**
     * Cost of this query given by the optimizer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("optimizerCost")
    private final Long optimizerCost;

    /**
     * Cost of this query given by the optimizer
     * @return the value
     **/
    public Long getOptimizerCost() {
        return optimizerCost;
    }

    /**
     * Total Number of rows in SQLStats table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fullPlanHashValue")
    private final String fullPlanHashValue;

    /**
     * Total Number of rows in SQLStats table
     * @return the value
     **/
    public String getFullPlanHashValue() {
        return fullPlanHashValue;
    }

    /**
     * Module name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("module")
    private final String module;

    /**
     * Module name
     * @return the value
     **/
    public String getModule() {
        return module;
    }

    /**
     * Service name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * Service name
     * @return the value
     **/
    public String getService() {
        return service;
    }

    /**
     * Contains the name of the action that was executing when the SQL statement was first parsed, which is set by calling DBMS_APPLICATION_INFO.SET_ACTION
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * Contains the name of the action that was executing when the SQL statement was first parsed, which is set by calling DBMS_APPLICATION_INFO.SET_ACTION
     * @return the value
     **/
    public String getAction() {
        return action;
    }

    /**
     * SQL profile used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlProfile")
    private final String sqlProfile;

    /**
     * SQL profile used for this statement, if any
     * @return the value
     **/
    public String getSqlProfile() {
        return sqlProfile;
    }

    /**
     * SQL patch used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlPatch")
    private final String sqlPatch;

    /**
     * SQL patch used for this statement, if any
     * @return the value
     **/
    public String getSqlPatch() {
        return sqlPatch;
    }

    /**
     * SQL plan baseline used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlPlanBaseline")
    private final String sqlPlanBaseline;

    /**
     * SQL plan baseline used for this statement, if any
     * @return the value
     **/
    public String getSqlPlanBaseline() {
        return sqlPlanBaseline;
    }

    /**
     * Number of executions for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaExecutionCount")
    private final Long deltaExecutionCount;

    /**
     * Number of executions for the cursor since the last AWR snapshot
     * @return the value
     **/
    public Long getDeltaExecutionCount() {
        return deltaExecutionCount;
    }

    /**
     * CPU time (in microseconds) for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuTime")
    private final Long deltaCpuTime;

    /**
     * CPU time (in microseconds) for the cursor since the last AWR snapshot
     * @return the value
     **/
    public Long getDeltaCpuTime() {
        return deltaCpuTime;
    }

    /**
     * Number of I/O bytes exchanged between the Oracle database and the storage system for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaIoBytes")
    private final Long deltaIoBytes;

    /**
     * Number of I/O bytes exchanged between the Oracle database and the storage system for the cursor since the last AWR snapshot
     * @return the value
     **/
    public Long getDeltaIoBytes() {
        return deltaIoBytes;
    }

    /**
     * Rank based on CPU Consumption
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuRank")
    private final Long deltaCpuRank;

    /**
     * Rank based on CPU Consumption
     * @return the value
     **/
    public Long getDeltaCpuRank() {
        return deltaCpuRank;
    }

    /**
     * Rank based on number of execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaExecsRank")
    private final Long deltaExecsRank;

    /**
     * Rank based on number of execution
     * @return the value
     **/
    public Long getDeltaExecsRank() {
        return deltaExecsRank;
    }

    /**
     * Rank based on sharable memory
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharableMemRank")
    private final Long sharableMemRank;

    /**
     * Rank based on sharable memory
     * @return the value
     **/
    public Long getSharableMemRank() {
        return sharableMemRank;
    }

    /**
     * Rank based on I/O Consumption
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaIoRank")
    private final Long deltaIoRank;

    /**
     * Rank based on I/O Consumption
     * @return the value
     **/
    public Long getDeltaIoRank() {
        return deltaIoRank;
    }

    /**
     * Harmonic sum based on ranking parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("harmonicSum")
    private final Long harmonicSum;

    /**
     * Harmonic sum based on ranking parameters
     * @return the value
     **/
    public Long getHarmonicSum() {
        return harmonicSum;
    }

    /**
     * Weight based harmonic sum of ranking parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wtHarmonicSum")
    private final Long wtHarmonicSum;

    /**
     * Weight based harmonic sum of ranking parameters
     * @return the value
     **/
    public Long getWtHarmonicSum() {
        return wtHarmonicSum;
    }

    /**
     * Total number of rows in SQLStats table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSqlCount")
    private final Long totalSqlCount;

    /**
     * Total number of rows in SQLStats table
     * @return the value
     **/
    public Long getTotalSqlCount() {
        return totalSqlCount;
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
        sb.append("SqlStats(");
        sb.append("super=").append(super.toString());
        sb.append("sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(", planHashValue=").append(String.valueOf(this.planHashValue));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", lastActiveTime=").append(String.valueOf(this.lastActiveTime));
        sb.append(", parseCalls=").append(String.valueOf(this.parseCalls));
        sb.append(", diskReads=").append(String.valueOf(this.diskReads));
        sb.append(", directReads=").append(String.valueOf(this.directReads));
        sb.append(", directWrites=").append(String.valueOf(this.directWrites));
        sb.append(", bufferGets=").append(String.valueOf(this.bufferGets));
        sb.append(", rowsProcessed=").append(String.valueOf(this.rowsProcessed));
        sb.append(", serializableAborts=").append(String.valueOf(this.serializableAborts));
        sb.append(", fetches=").append(String.valueOf(this.fetches));
        sb.append(", executions=").append(String.valueOf(this.executions));
        sb.append(", avoidedExecutions=").append(String.valueOf(this.avoidedExecutions));
        sb.append(", endOfFetchCount=").append(String.valueOf(this.endOfFetchCount));
        sb.append(", loads=").append(String.valueOf(this.loads));
        sb.append(", versionCount=").append(String.valueOf(this.versionCount));
        sb.append(", invalidations=").append(String.valueOf(this.invalidations));
        sb.append(", obsoleteCount=").append(String.valueOf(this.obsoleteCount));
        sb.append(", pxServersExecutions=").append(String.valueOf(this.pxServersExecutions));
        sb.append(", cpuTimeInUs=").append(String.valueOf(this.cpuTimeInUs));
        sb.append(", elapsedTimeInUs=").append(String.valueOf(this.elapsedTimeInUs));
        sb.append(", avgHardParseTimeInUs=").append(String.valueOf(this.avgHardParseTimeInUs));
        sb.append(", concurrencyWaitTimeInUs=")
                .append(String.valueOf(this.concurrencyWaitTimeInUs));
        sb.append(", applicationWaitTimeInUs=")
                .append(String.valueOf(this.applicationWaitTimeInUs));
        sb.append(", clusterWaitTimeInUs=").append(String.valueOf(this.clusterWaitTimeInUs));
        sb.append(", userIoWaitTimeInUs=").append(String.valueOf(this.userIoWaitTimeInUs));
        sb.append(", plsqlExecTimeInUs=").append(String.valueOf(this.plsqlExecTimeInUs));
        sb.append(", javaExecTimeInUs=").append(String.valueOf(this.javaExecTimeInUs));
        sb.append(", sorts=").append(String.valueOf(this.sorts));
        sb.append(", sharableMem=").append(String.valueOf(this.sharableMem));
        sb.append(", totalSharableMem=").append(String.valueOf(this.totalSharableMem));
        sb.append(", typeCheckMem=").append(String.valueOf(this.typeCheckMem));
        sb.append(", ioCellOffloadEligibleBytes=")
                .append(String.valueOf(this.ioCellOffloadEligibleBytes));
        sb.append(", ioInterconnectBytes=").append(String.valueOf(this.ioInterconnectBytes));
        sb.append(", physicalReadRequests=").append(String.valueOf(this.physicalReadRequests));
        sb.append(", physicalReadBytes=").append(String.valueOf(this.physicalReadBytes));
        sb.append(", physicalWriteRequests=").append(String.valueOf(this.physicalWriteRequests));
        sb.append(", physicalWriteBytes=").append(String.valueOf(this.physicalWriteBytes));
        sb.append(", exactMatchingSignature=").append(String.valueOf(this.exactMatchingSignature));
        sb.append(", forceMatchingSignature=").append(String.valueOf(this.forceMatchingSignature));
        sb.append(", ioCellUncompressedBytes=")
                .append(String.valueOf(this.ioCellUncompressedBytes));
        sb.append(", ioCellOffloadReturnedBytes=")
                .append(String.valueOf(this.ioCellOffloadReturnedBytes));
        sb.append(", childNumber=").append(String.valueOf(this.childNumber));
        sb.append(", commandType=").append(String.valueOf(this.commandType));
        sb.append(", usersOpening=").append(String.valueOf(this.usersOpening));
        sb.append(", usersExecuting=").append(String.valueOf(this.usersExecuting));
        sb.append(", optimizerCost=").append(String.valueOf(this.optimizerCost));
        sb.append(", fullPlanHashValue=").append(String.valueOf(this.fullPlanHashValue));
        sb.append(", module=").append(String.valueOf(this.module));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", sqlProfile=").append(String.valueOf(this.sqlProfile));
        sb.append(", sqlPatch=").append(String.valueOf(this.sqlPatch));
        sb.append(", sqlPlanBaseline=").append(String.valueOf(this.sqlPlanBaseline));
        sb.append(", deltaExecutionCount=").append(String.valueOf(this.deltaExecutionCount));
        sb.append(", deltaCpuTime=").append(String.valueOf(this.deltaCpuTime));
        sb.append(", deltaIoBytes=").append(String.valueOf(this.deltaIoBytes));
        sb.append(", deltaCpuRank=").append(String.valueOf(this.deltaCpuRank));
        sb.append(", deltaExecsRank=").append(String.valueOf(this.deltaExecsRank));
        sb.append(", sharableMemRank=").append(String.valueOf(this.sharableMemRank));
        sb.append(", deltaIoRank=").append(String.valueOf(this.deltaIoRank));
        sb.append(", harmonicSum=").append(String.valueOf(this.harmonicSum));
        sb.append(", wtHarmonicSum=").append(String.valueOf(this.wtHarmonicSum));
        sb.append(", totalSqlCount=").append(String.valueOf(this.totalSqlCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlStats)) {
            return false;
        }

        SqlStats other = (SqlStats) o;
        return java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.planHashValue, other.planHashValue)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.lastActiveTime, other.lastActiveTime)
                && java.util.Objects.equals(this.parseCalls, other.parseCalls)
                && java.util.Objects.equals(this.diskReads, other.diskReads)
                && java.util.Objects.equals(this.directReads, other.directReads)
                && java.util.Objects.equals(this.directWrites, other.directWrites)
                && java.util.Objects.equals(this.bufferGets, other.bufferGets)
                && java.util.Objects.equals(this.rowsProcessed, other.rowsProcessed)
                && java.util.Objects.equals(this.serializableAborts, other.serializableAborts)
                && java.util.Objects.equals(this.fetches, other.fetches)
                && java.util.Objects.equals(this.executions, other.executions)
                && java.util.Objects.equals(this.avoidedExecutions, other.avoidedExecutions)
                && java.util.Objects.equals(this.endOfFetchCount, other.endOfFetchCount)
                && java.util.Objects.equals(this.loads, other.loads)
                && java.util.Objects.equals(this.versionCount, other.versionCount)
                && java.util.Objects.equals(this.invalidations, other.invalidations)
                && java.util.Objects.equals(this.obsoleteCount, other.obsoleteCount)
                && java.util.Objects.equals(this.pxServersExecutions, other.pxServersExecutions)
                && java.util.Objects.equals(this.cpuTimeInUs, other.cpuTimeInUs)
                && java.util.Objects.equals(this.elapsedTimeInUs, other.elapsedTimeInUs)
                && java.util.Objects.equals(this.avgHardParseTimeInUs, other.avgHardParseTimeInUs)
                && java.util.Objects.equals(
                        this.concurrencyWaitTimeInUs, other.concurrencyWaitTimeInUs)
                && java.util.Objects.equals(
                        this.applicationWaitTimeInUs, other.applicationWaitTimeInUs)
                && java.util.Objects.equals(this.clusterWaitTimeInUs, other.clusterWaitTimeInUs)
                && java.util.Objects.equals(this.userIoWaitTimeInUs, other.userIoWaitTimeInUs)
                && java.util.Objects.equals(this.plsqlExecTimeInUs, other.plsqlExecTimeInUs)
                && java.util.Objects.equals(this.javaExecTimeInUs, other.javaExecTimeInUs)
                && java.util.Objects.equals(this.sorts, other.sorts)
                && java.util.Objects.equals(this.sharableMem, other.sharableMem)
                && java.util.Objects.equals(this.totalSharableMem, other.totalSharableMem)
                && java.util.Objects.equals(this.typeCheckMem, other.typeCheckMem)
                && java.util.Objects.equals(
                        this.ioCellOffloadEligibleBytes, other.ioCellOffloadEligibleBytes)
                && java.util.Objects.equals(this.ioInterconnectBytes, other.ioInterconnectBytes)
                && java.util.Objects.equals(this.physicalReadRequests, other.physicalReadRequests)
                && java.util.Objects.equals(this.physicalReadBytes, other.physicalReadBytes)
                && java.util.Objects.equals(this.physicalWriteRequests, other.physicalWriteRequests)
                && java.util.Objects.equals(this.physicalWriteBytes, other.physicalWriteBytes)
                && java.util.Objects.equals(
                        this.exactMatchingSignature, other.exactMatchingSignature)
                && java.util.Objects.equals(
                        this.forceMatchingSignature, other.forceMatchingSignature)
                && java.util.Objects.equals(
                        this.ioCellUncompressedBytes, other.ioCellUncompressedBytes)
                && java.util.Objects.equals(
                        this.ioCellOffloadReturnedBytes, other.ioCellOffloadReturnedBytes)
                && java.util.Objects.equals(this.childNumber, other.childNumber)
                && java.util.Objects.equals(this.commandType, other.commandType)
                && java.util.Objects.equals(this.usersOpening, other.usersOpening)
                && java.util.Objects.equals(this.usersExecuting, other.usersExecuting)
                && java.util.Objects.equals(this.optimizerCost, other.optimizerCost)
                && java.util.Objects.equals(this.fullPlanHashValue, other.fullPlanHashValue)
                && java.util.Objects.equals(this.module, other.module)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.sqlProfile, other.sqlProfile)
                && java.util.Objects.equals(this.sqlPatch, other.sqlPatch)
                && java.util.Objects.equals(this.sqlPlanBaseline, other.sqlPlanBaseline)
                && java.util.Objects.equals(this.deltaExecutionCount, other.deltaExecutionCount)
                && java.util.Objects.equals(this.deltaCpuTime, other.deltaCpuTime)
                && java.util.Objects.equals(this.deltaIoBytes, other.deltaIoBytes)
                && java.util.Objects.equals(this.deltaCpuRank, other.deltaCpuRank)
                && java.util.Objects.equals(this.deltaExecsRank, other.deltaExecsRank)
                && java.util.Objects.equals(this.sharableMemRank, other.sharableMemRank)
                && java.util.Objects.equals(this.deltaIoRank, other.deltaIoRank)
                && java.util.Objects.equals(this.harmonicSum, other.harmonicSum)
                && java.util.Objects.equals(this.wtHarmonicSum, other.wtHarmonicSum)
                && java.util.Objects.equals(this.totalSqlCount, other.totalSqlCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.planHashValue == null ? 43 : this.planHashValue.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
        result =
                (result * PRIME)
                        + (this.lastActiveTime == null ? 43 : this.lastActiveTime.hashCode());
        result = (result * PRIME) + (this.parseCalls == null ? 43 : this.parseCalls.hashCode());
        result = (result * PRIME) + (this.diskReads == null ? 43 : this.diskReads.hashCode());
        result = (result * PRIME) + (this.directReads == null ? 43 : this.directReads.hashCode());
        result = (result * PRIME) + (this.directWrites == null ? 43 : this.directWrites.hashCode());
        result = (result * PRIME) + (this.bufferGets == null ? 43 : this.bufferGets.hashCode());
        result =
                (result * PRIME)
                        + (this.rowsProcessed == null ? 43 : this.rowsProcessed.hashCode());
        result =
                (result * PRIME)
                        + (this.serializableAborts == null
                                ? 43
                                : this.serializableAborts.hashCode());
        result = (result * PRIME) + (this.fetches == null ? 43 : this.fetches.hashCode());
        result = (result * PRIME) + (this.executions == null ? 43 : this.executions.hashCode());
        result =
                (result * PRIME)
                        + (this.avoidedExecutions == null ? 43 : this.avoidedExecutions.hashCode());
        result =
                (result * PRIME)
                        + (this.endOfFetchCount == null ? 43 : this.endOfFetchCount.hashCode());
        result = (result * PRIME) + (this.loads == null ? 43 : this.loads.hashCode());
        result = (result * PRIME) + (this.versionCount == null ? 43 : this.versionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.invalidations == null ? 43 : this.invalidations.hashCode());
        result =
                (result * PRIME)
                        + (this.obsoleteCount == null ? 43 : this.obsoleteCount.hashCode());
        result =
                (result * PRIME)
                        + (this.pxServersExecutions == null
                                ? 43
                                : this.pxServersExecutions.hashCode());
        result = (result * PRIME) + (this.cpuTimeInUs == null ? 43 : this.cpuTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.elapsedTimeInUs == null ? 43 : this.elapsedTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.avgHardParseTimeInUs == null
                                ? 43
                                : this.avgHardParseTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.concurrencyWaitTimeInUs == null
                                ? 43
                                : this.concurrencyWaitTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationWaitTimeInUs == null
                                ? 43
                                : this.applicationWaitTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterWaitTimeInUs == null
                                ? 43
                                : this.clusterWaitTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.userIoWaitTimeInUs == null
                                ? 43
                                : this.userIoWaitTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.plsqlExecTimeInUs == null ? 43 : this.plsqlExecTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.javaExecTimeInUs == null ? 43 : this.javaExecTimeInUs.hashCode());
        result = (result * PRIME) + (this.sorts == null ? 43 : this.sorts.hashCode());
        result = (result * PRIME) + (this.sharableMem == null ? 43 : this.sharableMem.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSharableMem == null ? 43 : this.totalSharableMem.hashCode());
        result = (result * PRIME) + (this.typeCheckMem == null ? 43 : this.typeCheckMem.hashCode());
        result =
                (result * PRIME)
                        + (this.ioCellOffloadEligibleBytes == null
                                ? 43
                                : this.ioCellOffloadEligibleBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.ioInterconnectBytes == null
                                ? 43
                                : this.ioInterconnectBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalReadRequests == null
                                ? 43
                                : this.physicalReadRequests.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalReadBytes == null ? 43 : this.physicalReadBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalWriteRequests == null
                                ? 43
                                : this.physicalWriteRequests.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalWriteBytes == null
                                ? 43
                                : this.physicalWriteBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.exactMatchingSignature == null
                                ? 43
                                : this.exactMatchingSignature.hashCode());
        result =
                (result * PRIME)
                        + (this.forceMatchingSignature == null
                                ? 43
                                : this.forceMatchingSignature.hashCode());
        result =
                (result * PRIME)
                        + (this.ioCellUncompressedBytes == null
                                ? 43
                                : this.ioCellUncompressedBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.ioCellOffloadReturnedBytes == null
                                ? 43
                                : this.ioCellOffloadReturnedBytes.hashCode());
        result = (result * PRIME) + (this.childNumber == null ? 43 : this.childNumber.hashCode());
        result = (result * PRIME) + (this.commandType == null ? 43 : this.commandType.hashCode());
        result = (result * PRIME) + (this.usersOpening == null ? 43 : this.usersOpening.hashCode());
        result =
                (result * PRIME)
                        + (this.usersExecuting == null ? 43 : this.usersExecuting.hashCode());
        result =
                (result * PRIME)
                        + (this.optimizerCost == null ? 43 : this.optimizerCost.hashCode());
        result =
                (result * PRIME)
                        + (this.fullPlanHashValue == null ? 43 : this.fullPlanHashValue.hashCode());
        result = (result * PRIME) + (this.module == null ? 43 : this.module.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.sqlProfile == null ? 43 : this.sqlProfile.hashCode());
        result = (result * PRIME) + (this.sqlPatch == null ? 43 : this.sqlPatch.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlPlanBaseline == null ? 43 : this.sqlPlanBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.deltaExecutionCount == null
                                ? 43
                                : this.deltaExecutionCount.hashCode());
        result = (result * PRIME) + (this.deltaCpuTime == null ? 43 : this.deltaCpuTime.hashCode());
        result = (result * PRIME) + (this.deltaIoBytes == null ? 43 : this.deltaIoBytes.hashCode());
        result = (result * PRIME) + (this.deltaCpuRank == null ? 43 : this.deltaCpuRank.hashCode());
        result =
                (result * PRIME)
                        + (this.deltaExecsRank == null ? 43 : this.deltaExecsRank.hashCode());
        result =
                (result * PRIME)
                        + (this.sharableMemRank == null ? 43 : this.sharableMemRank.hashCode());
        result = (result * PRIME) + (this.deltaIoRank == null ? 43 : this.deltaIoRank.hashCode());
        result = (result * PRIME) + (this.harmonicSum == null ? 43 : this.harmonicSum.hashCode());
        result =
                (result * PRIME)
                        + (this.wtHarmonicSum == null ? 43 : this.wtHarmonicSum.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSqlCount == null ? 43 : this.totalSqlCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
