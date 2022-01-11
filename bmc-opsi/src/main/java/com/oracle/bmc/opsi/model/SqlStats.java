/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlStats.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlStats {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
        private Long planHashValue;

        public Builder planHashValue(Long planHashValue) {
            this.planHashValue = planHashValue;
            this.__explicitlySet__.add("planHashValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastActiveTime")
        private String lastActiveTime;

        public Builder lastActiveTime(String lastActiveTime) {
            this.lastActiveTime = lastActiveTime;
            this.__explicitlySet__.add("lastActiveTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parseCalls")
        private Long parseCalls;

        public Builder parseCalls(Long parseCalls) {
            this.parseCalls = parseCalls;
            this.__explicitlySet__.add("parseCalls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diskReads")
        private Long diskReads;

        public Builder diskReads(Long diskReads) {
            this.diskReads = diskReads;
            this.__explicitlySet__.add("diskReads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("directReads")
        private Long directReads;

        public Builder directReads(Long directReads) {
            this.directReads = directReads;
            this.__explicitlySet__.add("directReads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("directWrites")
        private Long directWrites;

        public Builder directWrites(Long directWrites) {
            this.directWrites = directWrites;
            this.__explicitlySet__.add("directWrites");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bufferGets")
        private Long bufferGets;

        public Builder bufferGets(Long bufferGets) {
            this.bufferGets = bufferGets;
            this.__explicitlySet__.add("bufferGets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rowsProcessed")
        private Long rowsProcessed;

        public Builder rowsProcessed(Long rowsProcessed) {
            this.rowsProcessed = rowsProcessed;
            this.__explicitlySet__.add("rowsProcessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serializableAborts")
        private Long serializableAborts;

        public Builder serializableAborts(Long serializableAborts) {
            this.serializableAborts = serializableAborts;
            this.__explicitlySet__.add("serializableAborts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fetches")
        private Long fetches;

        public Builder fetches(Long fetches) {
            this.fetches = fetches;
            this.__explicitlySet__.add("fetches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executions")
        private Long executions;

        public Builder executions(Long executions) {
            this.executions = executions;
            this.__explicitlySet__.add("executions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("avoidedExecutions")
        private Long avoidedExecutions;

        public Builder avoidedExecutions(Long avoidedExecutions) {
            this.avoidedExecutions = avoidedExecutions;
            this.__explicitlySet__.add("avoidedExecutions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endOfFetchCount")
        private Long endOfFetchCount;

        public Builder endOfFetchCount(Long endOfFetchCount) {
            this.endOfFetchCount = endOfFetchCount;
            this.__explicitlySet__.add("endOfFetchCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loads")
        private Long loads;

        public Builder loads(Long loads) {
            this.loads = loads;
            this.__explicitlySet__.add("loads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionCount")
        private Long versionCount;

        public Builder versionCount(Long versionCount) {
            this.versionCount = versionCount;
            this.__explicitlySet__.add("versionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invalidations")
        private Long invalidations;

        public Builder invalidations(Long invalidations) {
            this.invalidations = invalidations;
            this.__explicitlySet__.add("invalidations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("obsoleteCount")
        private Long obsoleteCount;

        public Builder obsoleteCount(Long obsoleteCount) {
            this.obsoleteCount = obsoleteCount;
            this.__explicitlySet__.add("obsoleteCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pxServersExecutions")
        private Long pxServersExecutions;

        public Builder pxServersExecutions(Long pxServersExecutions) {
            this.pxServersExecutions = pxServersExecutions;
            this.__explicitlySet__.add("pxServersExecutions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInUs")
        private Long cpuTimeInUs;

        public Builder cpuTimeInUs(Long cpuTimeInUs) {
            this.cpuTimeInUs = cpuTimeInUs;
            this.__explicitlySet__.add("cpuTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInUs")
        private Long elapsedTimeInUs;

        public Builder elapsedTimeInUs(Long elapsedTimeInUs) {
            this.elapsedTimeInUs = elapsedTimeInUs;
            this.__explicitlySet__.add("elapsedTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("avgHardParseTimeInUs")
        private Long avgHardParseTimeInUs;

        public Builder avgHardParseTimeInUs(Long avgHardParseTimeInUs) {
            this.avgHardParseTimeInUs = avgHardParseTimeInUs;
            this.__explicitlySet__.add("avgHardParseTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("concurrencyWaitTimeInUs")
        private Long concurrencyWaitTimeInUs;

        public Builder concurrencyWaitTimeInUs(Long concurrencyWaitTimeInUs) {
            this.concurrencyWaitTimeInUs = concurrencyWaitTimeInUs;
            this.__explicitlySet__.add("concurrencyWaitTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationWaitTimeInUs")
        private Long applicationWaitTimeInUs;

        public Builder applicationWaitTimeInUs(Long applicationWaitTimeInUs) {
            this.applicationWaitTimeInUs = applicationWaitTimeInUs;
            this.__explicitlySet__.add("applicationWaitTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterWaitTimeInUs")
        private Long clusterWaitTimeInUs;

        public Builder clusterWaitTimeInUs(Long clusterWaitTimeInUs) {
            this.clusterWaitTimeInUs = clusterWaitTimeInUs;
            this.__explicitlySet__.add("clusterWaitTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userIoWaitTimeInUs")
        private Long userIoWaitTimeInUs;

        public Builder userIoWaitTimeInUs(Long userIoWaitTimeInUs) {
            this.userIoWaitTimeInUs = userIoWaitTimeInUs;
            this.__explicitlySet__.add("userIoWaitTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("plsqlExecTimeInUs")
        private Long plsqlExecTimeInUs;

        public Builder plsqlExecTimeInUs(Long plsqlExecTimeInUs) {
            this.plsqlExecTimeInUs = plsqlExecTimeInUs;
            this.__explicitlySet__.add("plsqlExecTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("javaExecTimeInUs")
        private Long javaExecTimeInUs;

        public Builder javaExecTimeInUs(Long javaExecTimeInUs) {
            this.javaExecTimeInUs = javaExecTimeInUs;
            this.__explicitlySet__.add("javaExecTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sorts")
        private Long sorts;

        public Builder sorts(Long sorts) {
            this.sorts = sorts;
            this.__explicitlySet__.add("sorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sharableMem")
        private Long sharableMem;

        public Builder sharableMem(Long sharableMem) {
            this.sharableMem = sharableMem;
            this.__explicitlySet__.add("sharableMem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSharableMem")
        private Long totalSharableMem;

        public Builder totalSharableMem(Long totalSharableMem) {
            this.totalSharableMem = totalSharableMem;
            this.__explicitlySet__.add("totalSharableMem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeCheckMem")
        private Long typeCheckMem;

        public Builder typeCheckMem(Long typeCheckMem) {
            this.typeCheckMem = typeCheckMem;
            this.__explicitlySet__.add("typeCheckMem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadEligibleBytes")
        private Long ioCellOffloadEligibleBytes;

        public Builder ioCellOffloadEligibleBytes(Long ioCellOffloadEligibleBytes) {
            this.ioCellOffloadEligibleBytes = ioCellOffloadEligibleBytes;
            this.__explicitlySet__.add("ioCellOffloadEligibleBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioInterconnectBytes")
        private Long ioInterconnectBytes;

        public Builder ioInterconnectBytes(Long ioInterconnectBytes) {
            this.ioInterconnectBytes = ioInterconnectBytes;
            this.__explicitlySet__.add("ioInterconnectBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalReadRequests")
        private Long physicalReadRequests;

        public Builder physicalReadRequests(Long physicalReadRequests) {
            this.physicalReadRequests = physicalReadRequests;
            this.__explicitlySet__.add("physicalReadRequests");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalReadBytes")
        private Long physicalReadBytes;

        public Builder physicalReadBytes(Long physicalReadBytes) {
            this.physicalReadBytes = physicalReadBytes;
            this.__explicitlySet__.add("physicalReadBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteRequests")
        private Long physicalWriteRequests;

        public Builder physicalWriteRequests(Long physicalWriteRequests) {
            this.physicalWriteRequests = physicalWriteRequests;
            this.__explicitlySet__.add("physicalWriteRequests");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteBytes")
        private Long physicalWriteBytes;

        public Builder physicalWriteBytes(Long physicalWriteBytes) {
            this.physicalWriteBytes = physicalWriteBytes;
            this.__explicitlySet__.add("physicalWriteBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
        private String exactMatchingSignature;

        public Builder exactMatchingSignature(String exactMatchingSignature) {
            this.exactMatchingSignature = exactMatchingSignature;
            this.__explicitlySet__.add("exactMatchingSignature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
        private String forceMatchingSignature;

        public Builder forceMatchingSignature(String forceMatchingSignature) {
            this.forceMatchingSignature = forceMatchingSignature;
            this.__explicitlySet__.add("forceMatchingSignature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioCellUncompressedBytes")
        private Long ioCellUncompressedBytes;

        public Builder ioCellUncompressedBytes(Long ioCellUncompressedBytes) {
            this.ioCellUncompressedBytes = ioCellUncompressedBytes;
            this.__explicitlySet__.add("ioCellUncompressedBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadReturnedBytes")
        private Long ioCellOffloadReturnedBytes;

        public Builder ioCellOffloadReturnedBytes(Long ioCellOffloadReturnedBytes) {
            this.ioCellOffloadReturnedBytes = ioCellOffloadReturnedBytes;
            this.__explicitlySet__.add("ioCellOffloadReturnedBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("childNumber")
        private Long childNumber;

        public Builder childNumber(Long childNumber) {
            this.childNumber = childNumber;
            this.__explicitlySet__.add("childNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commandType")
        private Long commandType;

        public Builder commandType(Long commandType) {
            this.commandType = commandType;
            this.__explicitlySet__.add("commandType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usersOpening")
        private Long usersOpening;

        public Builder usersOpening(Long usersOpening) {
            this.usersOpening = usersOpening;
            this.__explicitlySet__.add("usersOpening");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usersExecuting")
        private Long usersExecuting;

        public Builder usersExecuting(Long usersExecuting) {
            this.usersExecuting = usersExecuting;
            this.__explicitlySet__.add("usersExecuting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("optimizerCost")
        private Long optimizerCost;

        public Builder optimizerCost(Long optimizerCost) {
            this.optimizerCost = optimizerCost;
            this.__explicitlySet__.add("optimizerCost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fullPlanHashValue")
        private String fullPlanHashValue;

        public Builder fullPlanHashValue(String fullPlanHashValue) {
            this.fullPlanHashValue = fullPlanHashValue;
            this.__explicitlySet__.add("fullPlanHashValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("module")
        private String module;

        public Builder module(String module) {
            this.module = module;
            this.__explicitlySet__.add("module");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlProfile")
        private String sqlProfile;

        public Builder sqlProfile(String sqlProfile) {
            this.sqlProfile = sqlProfile;
            this.__explicitlySet__.add("sqlProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlPatch")
        private String sqlPatch;

        public Builder sqlPatch(String sqlPatch) {
            this.sqlPatch = sqlPatch;
            this.__explicitlySet__.add("sqlPatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlPlanBaseline")
        private String sqlPlanBaseline;

        public Builder sqlPlanBaseline(String sqlPlanBaseline) {
            this.sqlPlanBaseline = sqlPlanBaseline;
            this.__explicitlySet__.add("sqlPlanBaseline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaExecutionCount")
        private Long deltaExecutionCount;

        public Builder deltaExecutionCount(Long deltaExecutionCount) {
            this.deltaExecutionCount = deltaExecutionCount;
            this.__explicitlySet__.add("deltaExecutionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuTime")
        private Long deltaCpuTime;

        public Builder deltaCpuTime(Long deltaCpuTime) {
            this.deltaCpuTime = deltaCpuTime;
            this.__explicitlySet__.add("deltaCpuTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaIoBytes")
        private Long deltaIoBytes;

        public Builder deltaIoBytes(Long deltaIoBytes) {
            this.deltaIoBytes = deltaIoBytes;
            this.__explicitlySet__.add("deltaIoBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuRank")
        private Long deltaCpuRank;

        public Builder deltaCpuRank(Long deltaCpuRank) {
            this.deltaCpuRank = deltaCpuRank;
            this.__explicitlySet__.add("deltaCpuRank");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaExecsRank")
        private Long deltaExecsRank;

        public Builder deltaExecsRank(Long deltaExecsRank) {
            this.deltaExecsRank = deltaExecsRank;
            this.__explicitlySet__.add("deltaExecsRank");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sharableMemRank")
        private Long sharableMemRank;

        public Builder sharableMemRank(Long sharableMemRank) {
            this.sharableMemRank = sharableMemRank;
            this.__explicitlySet__.add("sharableMemRank");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaIoRank")
        private Long deltaIoRank;

        public Builder deltaIoRank(Long deltaIoRank) {
            this.deltaIoRank = deltaIoRank;
            this.__explicitlySet__.add("deltaIoRank");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("harmonicSum")
        private Long harmonicSum;

        public Builder harmonicSum(Long harmonicSum) {
            this.harmonicSum = harmonicSum;
            this.__explicitlySet__.add("harmonicSum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wtHarmonicSum")
        private Long wtHarmonicSum;

        public Builder wtHarmonicSum(Long wtHarmonicSum) {
            this.wtHarmonicSum = wtHarmonicSum;
            this.__explicitlySet__.add("wtHarmonicSum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSqlCount")
        private Long totalSqlCount;

        public Builder totalSqlCount(Long totalSqlCount) {
            this.totalSqlCount = totalSqlCount;
            this.__explicitlySet__.add("totalSqlCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStats build() {
            SqlStats __instance__ =
                    new SqlStats(
                            sqlIdentifier,
                            planHashValue,
                            timeCollected,
                            instanceName,
                            lastActiveTime,
                            parseCalls,
                            diskReads,
                            directReads,
                            directWrites,
                            bufferGets,
                            rowsProcessed,
                            serializableAborts,
                            fetches,
                            executions,
                            avoidedExecutions,
                            endOfFetchCount,
                            loads,
                            versionCount,
                            invalidations,
                            obsoleteCount,
                            pxServersExecutions,
                            cpuTimeInUs,
                            elapsedTimeInUs,
                            avgHardParseTimeInUs,
                            concurrencyWaitTimeInUs,
                            applicationWaitTimeInUs,
                            clusterWaitTimeInUs,
                            userIoWaitTimeInUs,
                            plsqlExecTimeInUs,
                            javaExecTimeInUs,
                            sorts,
                            sharableMem,
                            totalSharableMem,
                            typeCheckMem,
                            ioCellOffloadEligibleBytes,
                            ioInterconnectBytes,
                            physicalReadRequests,
                            physicalReadBytes,
                            physicalWriteRequests,
                            physicalWriteBytes,
                            exactMatchingSignature,
                            forceMatchingSignature,
                            ioCellUncompressedBytes,
                            ioCellOffloadReturnedBytes,
                            childNumber,
                            commandType,
                            usersOpening,
                            usersExecuting,
                            optimizerCost,
                            fullPlanHashValue,
                            module,
                            service,
                            action,
                            sqlProfile,
                            sqlPatch,
                            sqlPlanBaseline,
                            deltaExecutionCount,
                            deltaCpuTime,
                            deltaIoBytes,
                            deltaCpuRank,
                            deltaExecsRank,
                            sharableMemRank,
                            deltaIoRank,
                            harmonicSum,
                            wtHarmonicSum,
                            totalSqlCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStats o) {
            Builder copiedBuilder =
                    sqlIdentifier(o.getSqlIdentifier())
                            .planHashValue(o.getPlanHashValue())
                            .timeCollected(o.getTimeCollected())
                            .instanceName(o.getInstanceName())
                            .lastActiveTime(o.getLastActiveTime())
                            .parseCalls(o.getParseCalls())
                            .diskReads(o.getDiskReads())
                            .directReads(o.getDirectReads())
                            .directWrites(o.getDirectWrites())
                            .bufferGets(o.getBufferGets())
                            .rowsProcessed(o.getRowsProcessed())
                            .serializableAborts(o.getSerializableAborts())
                            .fetches(o.getFetches())
                            .executions(o.getExecutions())
                            .avoidedExecutions(o.getAvoidedExecutions())
                            .endOfFetchCount(o.getEndOfFetchCount())
                            .loads(o.getLoads())
                            .versionCount(o.getVersionCount())
                            .invalidations(o.getInvalidations())
                            .obsoleteCount(o.getObsoleteCount())
                            .pxServersExecutions(o.getPxServersExecutions())
                            .cpuTimeInUs(o.getCpuTimeInUs())
                            .elapsedTimeInUs(o.getElapsedTimeInUs())
                            .avgHardParseTimeInUs(o.getAvgHardParseTimeInUs())
                            .concurrencyWaitTimeInUs(o.getConcurrencyWaitTimeInUs())
                            .applicationWaitTimeInUs(o.getApplicationWaitTimeInUs())
                            .clusterWaitTimeInUs(o.getClusterWaitTimeInUs())
                            .userIoWaitTimeInUs(o.getUserIoWaitTimeInUs())
                            .plsqlExecTimeInUs(o.getPlsqlExecTimeInUs())
                            .javaExecTimeInUs(o.getJavaExecTimeInUs())
                            .sorts(o.getSorts())
                            .sharableMem(o.getSharableMem())
                            .totalSharableMem(o.getTotalSharableMem())
                            .typeCheckMem(o.getTypeCheckMem())
                            .ioCellOffloadEligibleBytes(o.getIoCellOffloadEligibleBytes())
                            .ioInterconnectBytes(o.getIoInterconnectBytes())
                            .physicalReadRequests(o.getPhysicalReadRequests())
                            .physicalReadBytes(o.getPhysicalReadBytes())
                            .physicalWriteRequests(o.getPhysicalWriteRequests())
                            .physicalWriteBytes(o.getPhysicalWriteBytes())
                            .exactMatchingSignature(o.getExactMatchingSignature())
                            .forceMatchingSignature(o.getForceMatchingSignature())
                            .ioCellUncompressedBytes(o.getIoCellUncompressedBytes())
                            .ioCellOffloadReturnedBytes(o.getIoCellOffloadReturnedBytes())
                            .childNumber(o.getChildNumber())
                            .commandType(o.getCommandType())
                            .usersOpening(o.getUsersOpening())
                            .usersExecuting(o.getUsersExecuting())
                            .optimizerCost(o.getOptimizerCost())
                            .fullPlanHashValue(o.getFullPlanHashValue())
                            .module(o.getModule())
                            .service(o.getService())
                            .action(o.getAction())
                            .sqlProfile(o.getSqlProfile())
                            .sqlPatch(o.getSqlPatch())
                            .sqlPlanBaseline(o.getSqlPlanBaseline())
                            .deltaExecutionCount(o.getDeltaExecutionCount())
                            .deltaCpuTime(o.getDeltaCpuTime())
                            .deltaIoBytes(o.getDeltaIoBytes())
                            .deltaCpuRank(o.getDeltaCpuRank())
                            .deltaExecsRank(o.getDeltaExecsRank())
                            .sharableMemRank(o.getSharableMemRank())
                            .deltaIoRank(o.getDeltaIoRank())
                            .harmonicSum(o.getHarmonicSum())
                            .wtHarmonicSum(o.getWtHarmonicSum())
                            .totalSqlCount(o.getTotalSqlCount());

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
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    String sqlIdentifier;

    /**
     * Plan hash value for the SQL Execution Plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
    Long planHashValue;

    /**
     * Collection timestamp
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    java.util.Date timeCollected;

    /**
     * Name of Database Instance
     * Example: {@code "DB10902_1"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    String instanceName;

    /**
     * last_active_time
     * Example: {@code "0000000099CCE300"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastActiveTime")
    String lastActiveTime;

    /**
     * Total integer of parse calls
     *  Example: {@code 60}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parseCalls")
    Long parseCalls;

    /**
     * Number of disk reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskReads")
    Long diskReads;

    /**
     * Number of direct reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("directReads")
    Long directReads;

    /**
     * Number of Direct writes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("directWrites")
    Long directWrites;

    /**
     * Number of Buffer Gets
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bufferGets")
    Long bufferGets;

    /**
     * Number of row processed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowsProcessed")
    Long rowsProcessed;

    /**
     * Number of serializable aborts
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serializableAborts")
    Long serializableAborts;

    /**
     * Number of fetches
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetches")
    Long fetches;

    /**
     * Number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executions")
    Long executions;

    /**
     * Number of executions attempted on this object, but prevented due to the SQL statement being in quarantine
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avoidedExecutions")
    Long avoidedExecutions;

    /**
     * Number of times this cursor was fully executed since the cursor was brought into the library cache
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endOfFetchCount")
    Long endOfFetchCount;

    /**
     * Number of times the object was either loaded or reloaded
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loads")
    Long loads;

    /**
     * Number of cursors present in the cache with this SQL text and plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionCount")
    Long versionCount;

    /**
     * Number of times this child cursor has been invalidated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invalidations")
    Long invalidations;

    /**
     * Number of times that a parent cursor became obsolete
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("obsoleteCount")
    Long obsoleteCount;

    /**
     * Total number of executions performed by parallel execution servers (0 when the statement has never been executed in parallel)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pxServersExecutions")
    Long pxServersExecutions;

    /**
     * CPU time (in microseconds) used by this cursor for parsing, executing, and fetching
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInUs")
    Long cpuTimeInUs;

    /**
     * Elapsed time (in microseconds) used by this cursor for parsing, executing, and fetching.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInUs")
    Long elapsedTimeInUs;

    /**
     * Average hard parse time (in microseconds) used by this cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgHardParseTimeInUs")
    Long avgHardParseTimeInUs;

    /**
     * Concurrency wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("concurrencyWaitTimeInUs")
    Long concurrencyWaitTimeInUs;

    /**
     * Application wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationWaitTimeInUs")
    Long applicationWaitTimeInUs;

    /**
     * Cluster wait time (in microseconds). This value is specific to Oracle RAC
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterWaitTimeInUs")
    Long clusterWaitTimeInUs;

    /**
     * User I/O wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userIoWaitTimeInUs")
    Long userIoWaitTimeInUs;

    /**
     * PL/SQL execution time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plsqlExecTimeInUs")
    Long plsqlExecTimeInUs;

    /**
     * Java execution time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("javaExecTimeInUs")
    Long javaExecTimeInUs;

    /**
     * Number of sorts that were done for the child cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sorts")
    Long sorts;

    /**
     * Total shared memory (in bytes) currently occupied by all cursors with this SQL text and plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharableMem")
    Long sharableMem;

    /**
     * Total shared memory (in bytes) occupied by all cursors with this SQL text and plan if they were to be fully loaded in the shared pool (that is, cursor size)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSharableMem")
    Long totalSharableMem;

    /**
     * Typecheck memory
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeCheckMem")
    Long typeCheckMem;

    /**
     * Number of I/O bytes which can be filtered by the Exadata storage system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadEligibleBytes")
    Long ioCellOffloadEligibleBytes;

    /**
     * Number of I/O bytes exchanged between Oracle Database and the storage system. Typically used for Cache Fusion or parallel queries
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioInterconnectBytes")
    Long ioInterconnectBytes;

    /**
     * Number of physical read I/O requests issued by the monitored SQL. The requests may not be disk reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalReadRequests")
    Long physicalReadRequests;

    /**
     * Number of bytes read from disks by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalReadBytes")
    Long physicalReadBytes;

    /**
     * Number of physical write I/O requests issued by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteRequests")
    Long physicalWriteRequests;

    /**
     * Number of bytes written to disks by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteBytes")
    Long physicalWriteBytes;

    /**
     * exact_matching_signature
     * Example: {@code "18067345456756876713"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
    String exactMatchingSignature;

    /**
     * force_matching_signature
     * Example: {@code "18067345456756876713"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
    String forceMatchingSignature;

    /**
     * Number of uncompressed bytes (that is, size after decompression) that are offloaded to the Exadata cells
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellUncompressedBytes")
    Long ioCellUncompressedBytes;

    /**
     * Number of bytes that are returned by Exadata cell through the regular I/O path
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadReturnedBytes")
    Long ioCellOffloadReturnedBytes;

    /**
     * Number of this child cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childNumber")
    Long childNumber;

    /**
     * Oracle command type definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commandType")
    Long commandType;

    /**
     * Number of users that have any of the child cursors open
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usersOpening")
    Long usersOpening;

    /**
     * Number of users executing the statement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usersExecuting")
    Long usersExecuting;

    /**
     * Cost of this query given by the optimizer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("optimizerCost")
    Long optimizerCost;

    /**
     * Total Number of rows in SQLStats table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fullPlanHashValue")
    String fullPlanHashValue;

    /**
     * Module name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("module")
    String module;

    /**
     * Service name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    String service;

    /**
     * Contains the name of the action that was executing when the SQL statement was first parsed, which is set by calling DBMS_APPLICATION_INFO.SET_ACTION
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    String action;

    /**
     * SQL profile used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlProfile")
    String sqlProfile;

    /**
     * SQL patch used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlPatch")
    String sqlPatch;

    /**
     * SQL plan baseline used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlPlanBaseline")
    String sqlPlanBaseline;

    /**
     * Number of executions for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaExecutionCount")
    Long deltaExecutionCount;

    /**
     * CPU time (in microseconds) for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuTime")
    Long deltaCpuTime;

    /**
     * Number of I/O bytes exchanged between the Oracle database and the storage system for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaIoBytes")
    Long deltaIoBytes;

    /**
     * Rank based on CPU Consumption
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuRank")
    Long deltaCpuRank;

    /**
     * Rank based on number of execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaExecsRank")
    Long deltaExecsRank;

    /**
     * Rank based on sharable memory
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharableMemRank")
    Long sharableMemRank;

    /**
     * Rank based on I/O Consumption
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaIoRank")
    Long deltaIoRank;

    /**
     * Harmonic sum based on ranking parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("harmonicSum")
    Long harmonicSum;

    /**
     * Weight based harmonic sum of ranking parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wtHarmonicSum")
    Long wtHarmonicSum;

    /**
     * Total number of rows in SQLStats table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSqlCount")
    Long totalSqlCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
