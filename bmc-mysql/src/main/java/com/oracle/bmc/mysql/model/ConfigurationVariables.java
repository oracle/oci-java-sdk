/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * User controllable service variables.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConfigurationVariables.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigurationVariables {
    @Deprecated
    @java.beans.ConstructorProperties({
        "completionType",
        "defaultAuthenticationPlugin",
        "transactionIsolation",
        "innodbFtServerStopwordTable",
        "mandatoryRoles",
        "autocommit",
        "foreignKeyChecks",
        "groupReplicationConsistency",
        "innodbFtEnableStopword",
        "localInfile",
        "mysqlFirewallMode",
        "mysqlxEnableHelloNotice",
        "sqlRequirePrimaryKey",
        "sqlWarnings",
        "binlogExpireLogsSeconds",
        "binlogRowMetadata",
        "binlogRowValueOptions",
        "binlogTransactionCompression",
        "innodbBufferPoolSize",
        "innodbFtResultCacheLimit",
        "maxConnections",
        "maxPreparedStmtCount",
        "connectTimeout",
        "cteMaxRecursionDepth",
        "generatedRandomPasswordLength",
        "informationSchemaStatsExpiry",
        "innodbBufferPoolInstances",
        "innodbFtMaxTokenSize",
        "innodbFtMinTokenSize",
        "innodbFtNumWordOptimize",
        "innodbLockWaitTimeout",
        "innodbMaxPurgeLag",
        "innodbMaxPurgeLagDelay",
        "maxExecutionTime",
        "mysqlxConnectTimeout",
        "mysqlxDocumentIdUniquePrefix",
        "mysqlxIdleWorkerThreadTimeout",
        "mysqlxInteractiveTimeout",
        "mysqlxMaxAllowedPacket",
        "mysqlxMinWorkerThreads",
        "mysqlxReadTimeout",
        "mysqlxWaitTimeout",
        "mysqlxWriteTimeout",
        "parserMaxMemSize",
        "queryAllocBlockSize",
        "queryPreallocSize",
        "sqlMode",
        "mysqlxDeflateDefaultCompressionLevel",
        "mysqlxDeflateMaxClientCompressionLevel",
        "mysqlxLz4MaxClientCompressionLevel",
        "mysqlxLz4DefaultCompressionLevel",
        "mysqlxZstdMaxClientCompressionLevel",
        "mysqlxZstdDefaultCompressionLevel",
        "mysqlZstdDefaultCompressionLevel"
    })
    public ConfigurationVariables(
            CompletionType completionType,
            DefaultAuthenticationPlugin defaultAuthenticationPlugin,
            TransactionIsolation transactionIsolation,
            String innodbFtServerStopwordTable,
            String mandatoryRoles,
            Boolean autocommit,
            Boolean foreignKeyChecks,
            GroupReplicationConsistency groupReplicationConsistency,
            Boolean innodbFtEnableStopword,
            Boolean localInfile,
            Boolean mysqlFirewallMode,
            Boolean mysqlxEnableHelloNotice,
            Boolean sqlRequirePrimaryKey,
            Boolean sqlWarnings,
            Integer binlogExpireLogsSeconds,
            BinlogRowMetadata binlogRowMetadata,
            String binlogRowValueOptions,
            Boolean binlogTransactionCompression,
            Long innodbBufferPoolSize,
            Integer innodbFtResultCacheLimit,
            Integer maxConnections,
            Integer maxPreparedStmtCount,
            Integer connectTimeout,
            Integer cteMaxRecursionDepth,
            Integer generatedRandomPasswordLength,
            Integer informationSchemaStatsExpiry,
            Integer innodbBufferPoolInstances,
            Integer innodbFtMaxTokenSize,
            Integer innodbFtMinTokenSize,
            Integer innodbFtNumWordOptimize,
            Integer innodbLockWaitTimeout,
            Integer innodbMaxPurgeLag,
            Integer innodbMaxPurgeLagDelay,
            Integer maxExecutionTime,
            Integer mysqlxConnectTimeout,
            Integer mysqlxDocumentIdUniquePrefix,
            Integer mysqlxIdleWorkerThreadTimeout,
            Integer mysqlxInteractiveTimeout,
            Integer mysqlxMaxAllowedPacket,
            Integer mysqlxMinWorkerThreads,
            Integer mysqlxReadTimeout,
            Integer mysqlxWaitTimeout,
            Integer mysqlxWriteTimeout,
            Integer parserMaxMemSize,
            Integer queryAllocBlockSize,
            Integer queryPreallocSize,
            String sqlMode,
            Integer mysqlxDeflateDefaultCompressionLevel,
            Integer mysqlxDeflateMaxClientCompressionLevel,
            Integer mysqlxLz4MaxClientCompressionLevel,
            Integer mysqlxLz4DefaultCompressionLevel,
            Integer mysqlxZstdMaxClientCompressionLevel,
            Integer mysqlxZstdDefaultCompressionLevel,
            Integer mysqlZstdDefaultCompressionLevel) {
        super();
        this.completionType = completionType;
        this.defaultAuthenticationPlugin = defaultAuthenticationPlugin;
        this.transactionIsolation = transactionIsolation;
        this.innodbFtServerStopwordTable = innodbFtServerStopwordTable;
        this.mandatoryRoles = mandatoryRoles;
        this.autocommit = autocommit;
        this.foreignKeyChecks = foreignKeyChecks;
        this.groupReplicationConsistency = groupReplicationConsistency;
        this.innodbFtEnableStopword = innodbFtEnableStopword;
        this.localInfile = localInfile;
        this.mysqlFirewallMode = mysqlFirewallMode;
        this.mysqlxEnableHelloNotice = mysqlxEnableHelloNotice;
        this.sqlRequirePrimaryKey = sqlRequirePrimaryKey;
        this.sqlWarnings = sqlWarnings;
        this.binlogExpireLogsSeconds = binlogExpireLogsSeconds;
        this.binlogRowMetadata = binlogRowMetadata;
        this.binlogRowValueOptions = binlogRowValueOptions;
        this.binlogTransactionCompression = binlogTransactionCompression;
        this.innodbBufferPoolSize = innodbBufferPoolSize;
        this.innodbFtResultCacheLimit = innodbFtResultCacheLimit;
        this.maxConnections = maxConnections;
        this.maxPreparedStmtCount = maxPreparedStmtCount;
        this.connectTimeout = connectTimeout;
        this.cteMaxRecursionDepth = cteMaxRecursionDepth;
        this.generatedRandomPasswordLength = generatedRandomPasswordLength;
        this.informationSchemaStatsExpiry = informationSchemaStatsExpiry;
        this.innodbBufferPoolInstances = innodbBufferPoolInstances;
        this.innodbFtMaxTokenSize = innodbFtMaxTokenSize;
        this.innodbFtMinTokenSize = innodbFtMinTokenSize;
        this.innodbFtNumWordOptimize = innodbFtNumWordOptimize;
        this.innodbLockWaitTimeout = innodbLockWaitTimeout;
        this.innodbMaxPurgeLag = innodbMaxPurgeLag;
        this.innodbMaxPurgeLagDelay = innodbMaxPurgeLagDelay;
        this.maxExecutionTime = maxExecutionTime;
        this.mysqlxConnectTimeout = mysqlxConnectTimeout;
        this.mysqlxDocumentIdUniquePrefix = mysqlxDocumentIdUniquePrefix;
        this.mysqlxIdleWorkerThreadTimeout = mysqlxIdleWorkerThreadTimeout;
        this.mysqlxInteractiveTimeout = mysqlxInteractiveTimeout;
        this.mysqlxMaxAllowedPacket = mysqlxMaxAllowedPacket;
        this.mysqlxMinWorkerThreads = mysqlxMinWorkerThreads;
        this.mysqlxReadTimeout = mysqlxReadTimeout;
        this.mysqlxWaitTimeout = mysqlxWaitTimeout;
        this.mysqlxWriteTimeout = mysqlxWriteTimeout;
        this.parserMaxMemSize = parserMaxMemSize;
        this.queryAllocBlockSize = queryAllocBlockSize;
        this.queryPreallocSize = queryPreallocSize;
        this.sqlMode = sqlMode;
        this.mysqlxDeflateDefaultCompressionLevel = mysqlxDeflateDefaultCompressionLevel;
        this.mysqlxDeflateMaxClientCompressionLevel = mysqlxDeflateMaxClientCompressionLevel;
        this.mysqlxLz4MaxClientCompressionLevel = mysqlxLz4MaxClientCompressionLevel;
        this.mysqlxLz4DefaultCompressionLevel = mysqlxLz4DefaultCompressionLevel;
        this.mysqlxZstdMaxClientCompressionLevel = mysqlxZstdMaxClientCompressionLevel;
        this.mysqlxZstdDefaultCompressionLevel = mysqlxZstdDefaultCompressionLevel;
        this.mysqlZstdDefaultCompressionLevel = mysqlZstdDefaultCompressionLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("completionType")
        private CompletionType completionType;

        public Builder completionType(CompletionType completionType) {
            this.completionType = completionType;
            this.__explicitlySet__.add("completionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationPlugin")
        private DefaultAuthenticationPlugin defaultAuthenticationPlugin;

        public Builder defaultAuthenticationPlugin(
                DefaultAuthenticationPlugin defaultAuthenticationPlugin) {
            this.defaultAuthenticationPlugin = defaultAuthenticationPlugin;
            this.__explicitlySet__.add("defaultAuthenticationPlugin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transactionIsolation")
        private TransactionIsolation transactionIsolation;

        public Builder transactionIsolation(TransactionIsolation transactionIsolation) {
            this.transactionIsolation = transactionIsolation;
            this.__explicitlySet__.add("transactionIsolation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtServerStopwordTable")
        private String innodbFtServerStopwordTable;

        public Builder innodbFtServerStopwordTable(String innodbFtServerStopwordTable) {
            this.innodbFtServerStopwordTable = innodbFtServerStopwordTable;
            this.__explicitlySet__.add("innodbFtServerStopwordTable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mandatoryRoles")
        private String mandatoryRoles;

        public Builder mandatoryRoles(String mandatoryRoles) {
            this.mandatoryRoles = mandatoryRoles;
            this.__explicitlySet__.add("mandatoryRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autocommit")
        private Boolean autocommit;

        public Builder autocommit(Boolean autocommit) {
            this.autocommit = autocommit;
            this.__explicitlySet__.add("autocommit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("foreignKeyChecks")
        private Boolean foreignKeyChecks;

        public Builder foreignKeyChecks(Boolean foreignKeyChecks) {
            this.foreignKeyChecks = foreignKeyChecks;
            this.__explicitlySet__.add("foreignKeyChecks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupReplicationConsistency")
        private GroupReplicationConsistency groupReplicationConsistency;

        public Builder groupReplicationConsistency(
                GroupReplicationConsistency groupReplicationConsistency) {
            this.groupReplicationConsistency = groupReplicationConsistency;
            this.__explicitlySet__.add("groupReplicationConsistency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtEnableStopword")
        private Boolean innodbFtEnableStopword;

        public Builder innodbFtEnableStopword(Boolean innodbFtEnableStopword) {
            this.innodbFtEnableStopword = innodbFtEnableStopword;
            this.__explicitlySet__.add("innodbFtEnableStopword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
        private Boolean localInfile;

        public Builder localInfile(Boolean localInfile) {
            this.localInfile = localInfile;
            this.__explicitlySet__.add("localInfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlFirewallMode")
        private Boolean mysqlFirewallMode;

        public Builder mysqlFirewallMode(Boolean mysqlFirewallMode) {
            this.mysqlFirewallMode = mysqlFirewallMode;
            this.__explicitlySet__.add("mysqlFirewallMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxEnableHelloNotice")
        private Boolean mysqlxEnableHelloNotice;

        public Builder mysqlxEnableHelloNotice(Boolean mysqlxEnableHelloNotice) {
            this.mysqlxEnableHelloNotice = mysqlxEnableHelloNotice;
            this.__explicitlySet__.add("mysqlxEnableHelloNotice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlRequirePrimaryKey")
        private Boolean sqlRequirePrimaryKey;

        public Builder sqlRequirePrimaryKey(Boolean sqlRequirePrimaryKey) {
            this.sqlRequirePrimaryKey = sqlRequirePrimaryKey;
            this.__explicitlySet__.add("sqlRequirePrimaryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlWarnings")
        private Boolean sqlWarnings;

        public Builder sqlWarnings(Boolean sqlWarnings) {
            this.sqlWarnings = sqlWarnings;
            this.__explicitlySet__.add("sqlWarnings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("binlogExpireLogsSeconds")
        private Integer binlogExpireLogsSeconds;

        public Builder binlogExpireLogsSeconds(Integer binlogExpireLogsSeconds) {
            this.binlogExpireLogsSeconds = binlogExpireLogsSeconds;
            this.__explicitlySet__.add("binlogExpireLogsSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("binlogRowMetadata")
        private BinlogRowMetadata binlogRowMetadata;

        public Builder binlogRowMetadata(BinlogRowMetadata binlogRowMetadata) {
            this.binlogRowMetadata = binlogRowMetadata;
            this.__explicitlySet__.add("binlogRowMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("binlogRowValueOptions")
        private String binlogRowValueOptions;

        public Builder binlogRowValueOptions(String binlogRowValueOptions) {
            this.binlogRowValueOptions = binlogRowValueOptions;
            this.__explicitlySet__.add("binlogRowValueOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("binlogTransactionCompression")
        private Boolean binlogTransactionCompression;

        public Builder binlogTransactionCompression(Boolean binlogTransactionCompression) {
            this.binlogTransactionCompression = binlogTransactionCompression;
            this.__explicitlySet__.add("binlogTransactionCompression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolSize")
        private Long innodbBufferPoolSize;

        public Builder innodbBufferPoolSize(Long innodbBufferPoolSize) {
            this.innodbBufferPoolSize = innodbBufferPoolSize;
            this.__explicitlySet__.add("innodbBufferPoolSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtResultCacheLimit")
        private Integer innodbFtResultCacheLimit;

        public Builder innodbFtResultCacheLimit(Integer innodbFtResultCacheLimit) {
            this.innodbFtResultCacheLimit = innodbFtResultCacheLimit;
            this.__explicitlySet__.add("innodbFtResultCacheLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
        private Integer maxConnections;

        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            this.__explicitlySet__.add("maxConnections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxPreparedStmtCount")
        private Integer maxPreparedStmtCount;

        public Builder maxPreparedStmtCount(Integer maxPreparedStmtCount) {
            this.maxPreparedStmtCount = maxPreparedStmtCount;
            this.__explicitlySet__.add("maxPreparedStmtCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectTimeout")
        private Integer connectTimeout;

        public Builder connectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            this.__explicitlySet__.add("connectTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cteMaxRecursionDepth")
        private Integer cteMaxRecursionDepth;

        public Builder cteMaxRecursionDepth(Integer cteMaxRecursionDepth) {
            this.cteMaxRecursionDepth = cteMaxRecursionDepth;
            this.__explicitlySet__.add("cteMaxRecursionDepth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("generatedRandomPasswordLength")
        private Integer generatedRandomPasswordLength;

        public Builder generatedRandomPasswordLength(Integer generatedRandomPasswordLength) {
            this.generatedRandomPasswordLength = generatedRandomPasswordLength;
            this.__explicitlySet__.add("generatedRandomPasswordLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("informationSchemaStatsExpiry")
        private Integer informationSchemaStatsExpiry;

        public Builder informationSchemaStatsExpiry(Integer informationSchemaStatsExpiry) {
            this.informationSchemaStatsExpiry = informationSchemaStatsExpiry;
            this.__explicitlySet__.add("informationSchemaStatsExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolInstances")
        private Integer innodbBufferPoolInstances;

        public Builder innodbBufferPoolInstances(Integer innodbBufferPoolInstances) {
            this.innodbBufferPoolInstances = innodbBufferPoolInstances;
            this.__explicitlySet__.add("innodbBufferPoolInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMaxTokenSize")
        private Integer innodbFtMaxTokenSize;

        public Builder innodbFtMaxTokenSize(Integer innodbFtMaxTokenSize) {
            this.innodbFtMaxTokenSize = innodbFtMaxTokenSize;
            this.__explicitlySet__.add("innodbFtMaxTokenSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMinTokenSize")
        private Integer innodbFtMinTokenSize;

        public Builder innodbFtMinTokenSize(Integer innodbFtMinTokenSize) {
            this.innodbFtMinTokenSize = innodbFtMinTokenSize;
            this.__explicitlySet__.add("innodbFtMinTokenSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtNumWordOptimize")
        private Integer innodbFtNumWordOptimize;

        public Builder innodbFtNumWordOptimize(Integer innodbFtNumWordOptimize) {
            this.innodbFtNumWordOptimize = innodbFtNumWordOptimize;
            this.__explicitlySet__.add("innodbFtNumWordOptimize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbLockWaitTimeout")
        private Integer innodbLockWaitTimeout;

        public Builder innodbLockWaitTimeout(Integer innodbLockWaitTimeout) {
            this.innodbLockWaitTimeout = innodbLockWaitTimeout;
            this.__explicitlySet__.add("innodbLockWaitTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLag")
        private Integer innodbMaxPurgeLag;

        public Builder innodbMaxPurgeLag(Integer innodbMaxPurgeLag) {
            this.innodbMaxPurgeLag = innodbMaxPurgeLag;
            this.__explicitlySet__.add("innodbMaxPurgeLag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLagDelay")
        private Integer innodbMaxPurgeLagDelay;

        public Builder innodbMaxPurgeLagDelay(Integer innodbMaxPurgeLagDelay) {
            this.innodbMaxPurgeLagDelay = innodbMaxPurgeLagDelay;
            this.__explicitlySet__.add("innodbMaxPurgeLagDelay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxExecutionTime")
        private Integer maxExecutionTime;

        public Builder maxExecutionTime(Integer maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            this.__explicitlySet__.add("maxExecutionTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxConnectTimeout")
        private Integer mysqlxConnectTimeout;

        public Builder mysqlxConnectTimeout(Integer mysqlxConnectTimeout) {
            this.mysqlxConnectTimeout = mysqlxConnectTimeout;
            this.__explicitlySet__.add("mysqlxConnectTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDocumentIdUniquePrefix")
        private Integer mysqlxDocumentIdUniquePrefix;

        public Builder mysqlxDocumentIdUniquePrefix(Integer mysqlxDocumentIdUniquePrefix) {
            this.mysqlxDocumentIdUniquePrefix = mysqlxDocumentIdUniquePrefix;
            this.__explicitlySet__.add("mysqlxDocumentIdUniquePrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxIdleWorkerThreadTimeout")
        private Integer mysqlxIdleWorkerThreadTimeout;

        public Builder mysqlxIdleWorkerThreadTimeout(Integer mysqlxIdleWorkerThreadTimeout) {
            this.mysqlxIdleWorkerThreadTimeout = mysqlxIdleWorkerThreadTimeout;
            this.__explicitlySet__.add("mysqlxIdleWorkerThreadTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxInteractiveTimeout")
        private Integer mysqlxInteractiveTimeout;

        public Builder mysqlxInteractiveTimeout(Integer mysqlxInteractiveTimeout) {
            this.mysqlxInteractiveTimeout = mysqlxInteractiveTimeout;
            this.__explicitlySet__.add("mysqlxInteractiveTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMaxAllowedPacket")
        private Integer mysqlxMaxAllowedPacket;

        public Builder mysqlxMaxAllowedPacket(Integer mysqlxMaxAllowedPacket) {
            this.mysqlxMaxAllowedPacket = mysqlxMaxAllowedPacket;
            this.__explicitlySet__.add("mysqlxMaxAllowedPacket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMinWorkerThreads")
        private Integer mysqlxMinWorkerThreads;

        public Builder mysqlxMinWorkerThreads(Integer mysqlxMinWorkerThreads) {
            this.mysqlxMinWorkerThreads = mysqlxMinWorkerThreads;
            this.__explicitlySet__.add("mysqlxMinWorkerThreads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxReadTimeout")
        private Integer mysqlxReadTimeout;

        public Builder mysqlxReadTimeout(Integer mysqlxReadTimeout) {
            this.mysqlxReadTimeout = mysqlxReadTimeout;
            this.__explicitlySet__.add("mysqlxReadTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWaitTimeout")
        private Integer mysqlxWaitTimeout;

        public Builder mysqlxWaitTimeout(Integer mysqlxWaitTimeout) {
            this.mysqlxWaitTimeout = mysqlxWaitTimeout;
            this.__explicitlySet__.add("mysqlxWaitTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWriteTimeout")
        private Integer mysqlxWriteTimeout;

        public Builder mysqlxWriteTimeout(Integer mysqlxWriteTimeout) {
            this.mysqlxWriteTimeout = mysqlxWriteTimeout;
            this.__explicitlySet__.add("mysqlxWriteTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserMaxMemSize")
        private Integer parserMaxMemSize;

        public Builder parserMaxMemSize(Integer parserMaxMemSize) {
            this.parserMaxMemSize = parserMaxMemSize;
            this.__explicitlySet__.add("parserMaxMemSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryAllocBlockSize")
        private Integer queryAllocBlockSize;

        public Builder queryAllocBlockSize(Integer queryAllocBlockSize) {
            this.queryAllocBlockSize = queryAllocBlockSize;
            this.__explicitlySet__.add("queryAllocBlockSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryPreallocSize")
        private Integer queryPreallocSize;

        public Builder queryPreallocSize(Integer queryPreallocSize) {
            this.queryPreallocSize = queryPreallocSize;
            this.__explicitlySet__.add("queryPreallocSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlMode")
        private String sqlMode;

        public Builder sqlMode(String sqlMode) {
            this.sqlMode = sqlMode;
            this.__explicitlySet__.add("sqlMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateDefaultCompressionLevel")
        private Integer mysqlxDeflateDefaultCompressionLevel;

        public Builder mysqlxDeflateDefaultCompressionLevel(
                Integer mysqlxDeflateDefaultCompressionLevel) {
            this.mysqlxDeflateDefaultCompressionLevel = mysqlxDeflateDefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxDeflateDefaultCompressionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateMaxClientCompressionLevel")
        private Integer mysqlxDeflateMaxClientCompressionLevel;

        public Builder mysqlxDeflateMaxClientCompressionLevel(
                Integer mysqlxDeflateMaxClientCompressionLevel) {
            this.mysqlxDeflateMaxClientCompressionLevel = mysqlxDeflateMaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxDeflateMaxClientCompressionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4MaxClientCompressionLevel")
        private Integer mysqlxLz4MaxClientCompressionLevel;

        public Builder mysqlxLz4MaxClientCompressionLevel(
                Integer mysqlxLz4MaxClientCompressionLevel) {
            this.mysqlxLz4MaxClientCompressionLevel = mysqlxLz4MaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxLz4MaxClientCompressionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4DefaultCompressionLevel")
        private Integer mysqlxLz4DefaultCompressionLevel;

        public Builder mysqlxLz4DefaultCompressionLevel(Integer mysqlxLz4DefaultCompressionLevel) {
            this.mysqlxLz4DefaultCompressionLevel = mysqlxLz4DefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxLz4DefaultCompressionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdMaxClientCompressionLevel")
        private Integer mysqlxZstdMaxClientCompressionLevel;

        public Builder mysqlxZstdMaxClientCompressionLevel(
                Integer mysqlxZstdMaxClientCompressionLevel) {
            this.mysqlxZstdMaxClientCompressionLevel = mysqlxZstdMaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxZstdMaxClientCompressionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdDefaultCompressionLevel")
        private Integer mysqlxZstdDefaultCompressionLevel;

        public Builder mysqlxZstdDefaultCompressionLevel(
                Integer mysqlxZstdDefaultCompressionLevel) {
            this.mysqlxZstdDefaultCompressionLevel = mysqlxZstdDefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxZstdDefaultCompressionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlZstdDefaultCompressionLevel")
        private Integer mysqlZstdDefaultCompressionLevel;

        public Builder mysqlZstdDefaultCompressionLevel(Integer mysqlZstdDefaultCompressionLevel) {
            this.mysqlZstdDefaultCompressionLevel = mysqlZstdDefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlZstdDefaultCompressionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationVariables build() {
            ConfigurationVariables __instance__ =
                    new ConfigurationVariables(
                            completionType,
                            defaultAuthenticationPlugin,
                            transactionIsolation,
                            innodbFtServerStopwordTable,
                            mandatoryRoles,
                            autocommit,
                            foreignKeyChecks,
                            groupReplicationConsistency,
                            innodbFtEnableStopword,
                            localInfile,
                            mysqlFirewallMode,
                            mysqlxEnableHelloNotice,
                            sqlRequirePrimaryKey,
                            sqlWarnings,
                            binlogExpireLogsSeconds,
                            binlogRowMetadata,
                            binlogRowValueOptions,
                            binlogTransactionCompression,
                            innodbBufferPoolSize,
                            innodbFtResultCacheLimit,
                            maxConnections,
                            maxPreparedStmtCount,
                            connectTimeout,
                            cteMaxRecursionDepth,
                            generatedRandomPasswordLength,
                            informationSchemaStatsExpiry,
                            innodbBufferPoolInstances,
                            innodbFtMaxTokenSize,
                            innodbFtMinTokenSize,
                            innodbFtNumWordOptimize,
                            innodbLockWaitTimeout,
                            innodbMaxPurgeLag,
                            innodbMaxPurgeLagDelay,
                            maxExecutionTime,
                            mysqlxConnectTimeout,
                            mysqlxDocumentIdUniquePrefix,
                            mysqlxIdleWorkerThreadTimeout,
                            mysqlxInteractiveTimeout,
                            mysqlxMaxAllowedPacket,
                            mysqlxMinWorkerThreads,
                            mysqlxReadTimeout,
                            mysqlxWaitTimeout,
                            mysqlxWriteTimeout,
                            parserMaxMemSize,
                            queryAllocBlockSize,
                            queryPreallocSize,
                            sqlMode,
                            mysqlxDeflateDefaultCompressionLevel,
                            mysqlxDeflateMaxClientCompressionLevel,
                            mysqlxLz4MaxClientCompressionLevel,
                            mysqlxLz4DefaultCompressionLevel,
                            mysqlxZstdMaxClientCompressionLevel,
                            mysqlxZstdDefaultCompressionLevel,
                            mysqlZstdDefaultCompressionLevel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationVariables o) {
            Builder copiedBuilder =
                    completionType(o.getCompletionType())
                            .defaultAuthenticationPlugin(o.getDefaultAuthenticationPlugin())
                            .transactionIsolation(o.getTransactionIsolation())
                            .innodbFtServerStopwordTable(o.getInnodbFtServerStopwordTable())
                            .mandatoryRoles(o.getMandatoryRoles())
                            .autocommit(o.getAutocommit())
                            .foreignKeyChecks(o.getForeignKeyChecks())
                            .groupReplicationConsistency(o.getGroupReplicationConsistency())
                            .innodbFtEnableStopword(o.getInnodbFtEnableStopword())
                            .localInfile(o.getLocalInfile())
                            .mysqlFirewallMode(o.getMysqlFirewallMode())
                            .mysqlxEnableHelloNotice(o.getMysqlxEnableHelloNotice())
                            .sqlRequirePrimaryKey(o.getSqlRequirePrimaryKey())
                            .sqlWarnings(o.getSqlWarnings())
                            .binlogExpireLogsSeconds(o.getBinlogExpireLogsSeconds())
                            .binlogRowMetadata(o.getBinlogRowMetadata())
                            .binlogRowValueOptions(o.getBinlogRowValueOptions())
                            .binlogTransactionCompression(o.getBinlogTransactionCompression())
                            .innodbBufferPoolSize(o.getInnodbBufferPoolSize())
                            .innodbFtResultCacheLimit(o.getInnodbFtResultCacheLimit())
                            .maxConnections(o.getMaxConnections())
                            .maxPreparedStmtCount(o.getMaxPreparedStmtCount())
                            .connectTimeout(o.getConnectTimeout())
                            .cteMaxRecursionDepth(o.getCteMaxRecursionDepth())
                            .generatedRandomPasswordLength(o.getGeneratedRandomPasswordLength())
                            .informationSchemaStatsExpiry(o.getInformationSchemaStatsExpiry())
                            .innodbBufferPoolInstances(o.getInnodbBufferPoolInstances())
                            .innodbFtMaxTokenSize(o.getInnodbFtMaxTokenSize())
                            .innodbFtMinTokenSize(o.getInnodbFtMinTokenSize())
                            .innodbFtNumWordOptimize(o.getInnodbFtNumWordOptimize())
                            .innodbLockWaitTimeout(o.getInnodbLockWaitTimeout())
                            .innodbMaxPurgeLag(o.getInnodbMaxPurgeLag())
                            .innodbMaxPurgeLagDelay(o.getInnodbMaxPurgeLagDelay())
                            .maxExecutionTime(o.getMaxExecutionTime())
                            .mysqlxConnectTimeout(o.getMysqlxConnectTimeout())
                            .mysqlxDocumentIdUniquePrefix(o.getMysqlxDocumentIdUniquePrefix())
                            .mysqlxIdleWorkerThreadTimeout(o.getMysqlxIdleWorkerThreadTimeout())
                            .mysqlxInteractiveTimeout(o.getMysqlxInteractiveTimeout())
                            .mysqlxMaxAllowedPacket(o.getMysqlxMaxAllowedPacket())
                            .mysqlxMinWorkerThreads(o.getMysqlxMinWorkerThreads())
                            .mysqlxReadTimeout(o.getMysqlxReadTimeout())
                            .mysqlxWaitTimeout(o.getMysqlxWaitTimeout())
                            .mysqlxWriteTimeout(o.getMysqlxWriteTimeout())
                            .parserMaxMemSize(o.getParserMaxMemSize())
                            .queryAllocBlockSize(o.getQueryAllocBlockSize())
                            .queryPreallocSize(o.getQueryPreallocSize())
                            .sqlMode(o.getSqlMode())
                            .mysqlxDeflateDefaultCompressionLevel(
                                    o.getMysqlxDeflateDefaultCompressionLevel())
                            .mysqlxDeflateMaxClientCompressionLevel(
                                    o.getMysqlxDeflateMaxClientCompressionLevel())
                            .mysqlxLz4MaxClientCompressionLevel(
                                    o.getMysqlxLz4MaxClientCompressionLevel())
                            .mysqlxLz4DefaultCompressionLevel(
                                    o.getMysqlxLz4DefaultCompressionLevel())
                            .mysqlxZstdMaxClientCompressionLevel(
                                    o.getMysqlxZstdMaxClientCompressionLevel())
                            .mysqlxZstdDefaultCompressionLevel(
                                    o.getMysqlxZstdDefaultCompressionLevel())
                            .mysqlZstdDefaultCompressionLevel(
                                    o.getMysqlZstdDefaultCompressionLevel());

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
     * ("completion_type")
     **/
    public enum CompletionType {
        NoChain("NO_CHAIN"),
        Chain("CHAIN"),
        Release("RELEASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CompletionType.class);

        private final String value;
        private static java.util.Map<String, CompletionType> map;

        static {
            map = new java.util.HashMap<>();
            for (CompletionType v : CompletionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CompletionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CompletionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CompletionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * ("completion_type")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("completionType")
    private final CompletionType completionType;

    public CompletionType getCompletionType() {
        return completionType;
    }

    /**
     * ("default_authentication_plugin")
     **/
    public enum DefaultAuthenticationPlugin {
        MysqlNativePassword("mysql_native_password"),
        Sha256Password("sha256_password"),
        CachingSha2Password("caching_sha2_password"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultAuthenticationPlugin.class);

        private final String value;
        private static java.util.Map<String, DefaultAuthenticationPlugin> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultAuthenticationPlugin v : DefaultAuthenticationPlugin.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultAuthenticationPlugin(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultAuthenticationPlugin create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultAuthenticationPlugin', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * ("default_authentication_plugin")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationPlugin")
    private final DefaultAuthenticationPlugin defaultAuthenticationPlugin;

    public DefaultAuthenticationPlugin getDefaultAuthenticationPlugin() {
        return defaultAuthenticationPlugin;
    }

    /**
     * ("transaction_isolation")
     **/
    public enum TransactionIsolation {
        ReadUncommitted("READ-UNCOMMITTED"),
        ReadCommited("READ-COMMITED"),
        ReadCommitted("READ-COMMITTED"),
        RepeatableRead("REPEATABLE-READ"),
        Serializable("SERIALIZABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TransactionIsolation.class);

        private final String value;
        private static java.util.Map<String, TransactionIsolation> map;

        static {
            map = new java.util.HashMap<>();
            for (TransactionIsolation v : TransactionIsolation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TransactionIsolation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TransactionIsolation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TransactionIsolation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * ("transaction_isolation")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transactionIsolation")
    private final TransactionIsolation transactionIsolation;

    public TransactionIsolation getTransactionIsolation() {
        return transactionIsolation;
    }

    /**
     * ("innodb_ft_server_stopword_table")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtServerStopwordTable")
    private final String innodbFtServerStopwordTable;

    public String getInnodbFtServerStopwordTable() {
        return innodbFtServerStopwordTable;
    }

    /**
     * ("mandatory_roles")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mandatoryRoles")
    private final String mandatoryRoles;

    public String getMandatoryRoles() {
        return mandatoryRoles;
    }

    /**
     * ("autocommit")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autocommit")
    private final Boolean autocommit;

    public Boolean getAutocommit() {
        return autocommit;
    }

    /**
     * ("foreign_key_checks")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("foreignKeyChecks")
    private final Boolean foreignKeyChecks;

    public Boolean getForeignKeyChecks() {
        return foreignKeyChecks;
    }

    /**
     * - EVENTUAL:
     *     Both RO and RW transactions do not wait for preceding transactions to be applied before executing.
     *     A RW transaction does not wait for other members to apply a transaction. This means that a transaction
     *     could be externalized on one member before the others. This also means that in the event of a primary failover,
     *     the new primary can accept new RO and RW transactions before the previous primary transactions are all applied.
     *     RO transactions could result in outdated values, RW transactions could result in a rollback due to conflicts.
     * - BEFORE_ON_PRIMARY_FAILOVER:
     *     New RO or RW transactions with a newly elected primary that is applying backlog from the old
     *     primary are held (not applied) until any backlog has been applied. This ensures that when a primary failover happens,
     *     intentionally or not, clients always see the latest value on the primary. This guarantees consistency, but means that
     *     clients must be able to handle the delay in the event that a backlog is being applied. Usually this delay should be minimal,
     *     but does depend on the size of the backlog.
     * - BEFORE:
     *     A RW transaction waits for all preceding transactions to complete before being applied. A RO transaction waits for all preceding
     *     transactions to complete before being executed. This ensures that this transaction reads the latest value by only affecting the
     *     latency of the transaction. This reduces the overhead of synchronization on every RW transaction, by ensuring synchronization is
     *     used only on RO transactions. This consistency level also includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER.
     * - AFTER:
     *     A RW transaction waits until its changes have been applied to all of the other members. This value has no effect on RO transactions.
     *     This mode ensures that when a transaction is committed on the local member, any subsequent transaction reads the written value or
     *     a more recent value on any group member. Use this mode with a group that is used for predominantly RO operations to ensure that
     *     applied RW transactions are applied everywhere once they commit. This could be used by your application to ensure that subsequent
     *     reads fetch the latest data which includes the latest writes. This reduces the overhead of synchronization on every RO transaction,
     *     by ensuring synchronization is used only on RW transactions. This consistency level also includes the consistency guarantees
     *     provided by BEFORE_ON_PRIMARY_FAILOVER.
     * - BEFORE_AND_AFTER:
     *     A RW transaction waits for 1) all preceding transactions to complete before being applied and 2) until its changes have been
     *     applied on other members. A RO transaction waits for all preceding transactions to complete before execution takes place.
     *     This consistency level also includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER.
     *
     **/
    public enum GroupReplicationConsistency {
        Eventual("EVENTUAL"),
        BeforeOnPrimaryFailover("BEFORE_ON_PRIMARY_FAILOVER"),
        Before("BEFORE"),
        After("AFTER"),
        BeforeAndAfter("BEFORE_AND_AFTER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GroupReplicationConsistency.class);

        private final String value;
        private static java.util.Map<String, GroupReplicationConsistency> map;

        static {
            map = new java.util.HashMap<>();
            for (GroupReplicationConsistency v : GroupReplicationConsistency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GroupReplicationConsistency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GroupReplicationConsistency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GroupReplicationConsistency', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * - EVENTUAL:
     *     Both RO and RW transactions do not wait for preceding transactions to be applied before executing.
     *     A RW transaction does not wait for other members to apply a transaction. This means that a transaction
     *     could be externalized on one member before the others. This also means that in the event of a primary failover,
     *     the new primary can accept new RO and RW transactions before the previous primary transactions are all applied.
     *     RO transactions could result in outdated values, RW transactions could result in a rollback due to conflicts.
     * - BEFORE_ON_PRIMARY_FAILOVER:
     *     New RO or RW transactions with a newly elected primary that is applying backlog from the old
     *     primary are held (not applied) until any backlog has been applied. This ensures that when a primary failover happens,
     *     intentionally or not, clients always see the latest value on the primary. This guarantees consistency, but means that
     *     clients must be able to handle the delay in the event that a backlog is being applied. Usually this delay should be minimal,
     *     but does depend on the size of the backlog.
     * - BEFORE:
     *     A RW transaction waits for all preceding transactions to complete before being applied. A RO transaction waits for all preceding
     *     transactions to complete before being executed. This ensures that this transaction reads the latest value by only affecting the
     *     latency of the transaction. This reduces the overhead of synchronization on every RW transaction, by ensuring synchronization is
     *     used only on RO transactions. This consistency level also includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER.
     * - AFTER:
     *     A RW transaction waits until its changes have been applied to all of the other members. This value has no effect on RO transactions.
     *     This mode ensures that when a transaction is committed on the local member, any subsequent transaction reads the written value or
     *     a more recent value on any group member. Use this mode with a group that is used for predominantly RO operations to ensure that
     *     applied RW transactions are applied everywhere once they commit. This could be used by your application to ensure that subsequent
     *     reads fetch the latest data which includes the latest writes. This reduces the overhead of synchronization on every RO transaction,
     *     by ensuring synchronization is used only on RW transactions. This consistency level also includes the consistency guarantees
     *     provided by BEFORE_ON_PRIMARY_FAILOVER.
     * - BEFORE_AND_AFTER:
     *     A RW transaction waits for 1) all preceding transactions to complete before being applied and 2) until its changes have been
     *     applied on other members. A RO transaction waits for all preceding transactions to complete before execution takes place.
     *     This consistency level also includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupReplicationConsistency")
    private final GroupReplicationConsistency groupReplicationConsistency;

    public GroupReplicationConsistency getGroupReplicationConsistency() {
        return groupReplicationConsistency;
    }

    /**
     * ("innodb_ft_enable_stopword")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtEnableStopword")
    private final Boolean innodbFtEnableStopword;

    public Boolean getInnodbFtEnableStopword() {
        return innodbFtEnableStopword;
    }

    /**
     * ("local_infile")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
    private final Boolean localInfile;

    public Boolean getLocalInfile() {
        return localInfile;
    }

    /**
     * ("mysql_firewall_mode")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlFirewallMode")
    private final Boolean mysqlFirewallMode;

    public Boolean getMysqlFirewallMode() {
        return mysqlFirewallMode;
    }

    /**
     * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxEnableHelloNotice")
    private final Boolean mysqlxEnableHelloNotice;

    public Boolean getMysqlxEnableHelloNotice() {
        return mysqlxEnableHelloNotice;
    }

    /**
     * ("sql_require_primary_key")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlRequirePrimaryKey")
    private final Boolean sqlRequirePrimaryKey;

    public Boolean getSqlRequirePrimaryKey() {
        return sqlRequirePrimaryKey;
    }

    /**
     * ("sql_warnings")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlWarnings")
    private final Boolean sqlWarnings;

    public Boolean getSqlWarnings() {
        return sqlWarnings;
    }

    /**
     * Sets the binary log expiration period in seconds.
     * binlogExpireLogsSeconds corresponds to the MySQL binary logging system variable [binlog_expire_logs_seconds](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_expire_logs_seconds).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("binlogExpireLogsSeconds")
    private final Integer binlogExpireLogsSeconds;

    public Integer getBinlogExpireLogsSeconds() {
        return binlogExpireLogsSeconds;
    }

    /**
     * Configures the amount of table metadata added to the binary log when using row-based logging.
     * binlogRowMetadata corresponds to the MySQL binary logging system variable [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
     *
     **/
    public enum BinlogRowMetadata {
        Full("FULL"),
        Minimal("MINIMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BinlogRowMetadata.class);

        private final String value;
        private static java.util.Map<String, BinlogRowMetadata> map;

        static {
            map = new java.util.HashMap<>();
            for (BinlogRowMetadata v : BinlogRowMetadata.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BinlogRowMetadata(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BinlogRowMetadata create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BinlogRowMetadata', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Configures the amount of table metadata added to the binary log when using row-based logging.
     * binlogRowMetadata corresponds to the MySQL binary logging system variable [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("binlogRowMetadata")
    private final BinlogRowMetadata binlogRowMetadata;

    public BinlogRowMetadata getBinlogRowMetadata() {
        return binlogRowMetadata;
    }

    /**
     * When set to PARTIAL_JSON, this enables use of a space-efficient binary log format for updates that modify only a small portion of a JSON document.
     * binlogRowValueOptions corresponds to the MySQL binary logging system variable [binlog_row_value_options](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_value_options).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("binlogRowValueOptions")
    private final String binlogRowValueOptions;

    public String getBinlogRowValueOptions() {
        return binlogRowValueOptions;
    }

    /**
     * Enables compression for transactions that are written to binary log files on this server.
     * binlogTransactionCompression corresponds to the MySQL binary logging system variable [binlog_transaction_compression](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_transaction_compression).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("binlogTransactionCompression")
    private final Boolean binlogTransactionCompression;

    public Boolean getBinlogTransactionCompression() {
        return binlogTransactionCompression;
    }

    /**
     * ("innodb_buffer_pool_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolSize")
    private final Long innodbBufferPoolSize;

    public Long getInnodbBufferPoolSize() {
        return innodbBufferPoolSize;
    }

    /**
     * ("innodb_ft_result_cache_limit")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtResultCacheLimit")
    private final Integer innodbFtResultCacheLimit;

    public Integer getInnodbFtResultCacheLimit() {
        return innodbFtResultCacheLimit;
    }

    /**
     * ("max_connections")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
    private final Integer maxConnections;

    public Integer getMaxConnections() {
        return maxConnections;
    }

    /**
     * ("max_prepared_stmt_count")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxPreparedStmtCount")
    private final Integer maxPreparedStmtCount;

    public Integer getMaxPreparedStmtCount() {
        return maxPreparedStmtCount;
    }

    /**
     * ("connect_timeout")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeout")
    private final Integer connectTimeout;

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * ("cte_max_recursion_depth")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cteMaxRecursionDepth")
    private final Integer cteMaxRecursionDepth;

    public Integer getCteMaxRecursionDepth() {
        return cteMaxRecursionDepth;
    }

    /**
     * ("generated_random_password_length") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("generatedRandomPasswordLength")
    private final Integer generatedRandomPasswordLength;

    public Integer getGeneratedRandomPasswordLength() {
        return generatedRandomPasswordLength;
    }

    /**
     * ("information_schema_stats_expiry")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("informationSchemaStatsExpiry")
    private final Integer informationSchemaStatsExpiry;

    public Integer getInformationSchemaStatsExpiry() {
        return informationSchemaStatsExpiry;
    }

    /**
     * ("innodb_buffer_pool_instances")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolInstances")
    private final Integer innodbBufferPoolInstances;

    public Integer getInnodbBufferPoolInstances() {
        return innodbBufferPoolInstances;
    }

    /**
     * ("innodb_ft_max_token_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMaxTokenSize")
    private final Integer innodbFtMaxTokenSize;

    public Integer getInnodbFtMaxTokenSize() {
        return innodbFtMaxTokenSize;
    }

    /**
     * ("innodb_ft_min_token_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMinTokenSize")
    private final Integer innodbFtMinTokenSize;

    public Integer getInnodbFtMinTokenSize() {
        return innodbFtMinTokenSize;
    }

    /**
     * ("innodb_ft_num_word_optimize")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtNumWordOptimize")
    private final Integer innodbFtNumWordOptimize;

    public Integer getInnodbFtNumWordOptimize() {
        return innodbFtNumWordOptimize;
    }

    /**
     * ("innodb_lock_wait_timeout")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbLockWaitTimeout")
    private final Integer innodbLockWaitTimeout;

    public Integer getInnodbLockWaitTimeout() {
        return innodbLockWaitTimeout;
    }

    /**
     * ("innodb_max_purge_lag")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLag")
    private final Integer innodbMaxPurgeLag;

    public Integer getInnodbMaxPurgeLag() {
        return innodbMaxPurgeLag;
    }

    /**
     * ("innodb_max_purge_lag_delay")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLagDelay")
    private final Integer innodbMaxPurgeLagDelay;

    public Integer getInnodbMaxPurgeLagDelay() {
        return innodbMaxPurgeLagDelay;
    }

    /**
     * ("max_execution_time")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxExecutionTime")
    private final Integer maxExecutionTime;

    public Integer getMaxExecutionTime() {
        return maxExecutionTime;
    }

    /**
     * ("mysqlx_connect_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxConnectTimeout")
    private final Integer mysqlxConnectTimeout;

    public Integer getMysqlxConnectTimeout() {
        return mysqlxConnectTimeout;
    }

    /**
     * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDocumentIdUniquePrefix")
    private final Integer mysqlxDocumentIdUniquePrefix;

    public Integer getMysqlxDocumentIdUniquePrefix() {
        return mysqlxDocumentIdUniquePrefix;
    }

    /**
     * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxIdleWorkerThreadTimeout")
    private final Integer mysqlxIdleWorkerThreadTimeout;

    public Integer getMysqlxIdleWorkerThreadTimeout() {
        return mysqlxIdleWorkerThreadTimeout;
    }

    /**
     * ("mysqlx_interactive_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxInteractiveTimeout")
    private final Integer mysqlxInteractiveTimeout;

    public Integer getMysqlxInteractiveTimeout() {
        return mysqlxInteractiveTimeout;
    }

    /**
     * ("mysqlx_max_allowed_packet") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMaxAllowedPacket")
    private final Integer mysqlxMaxAllowedPacket;

    public Integer getMysqlxMaxAllowedPacket() {
        return mysqlxMaxAllowedPacket;
    }

    /**
     * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMinWorkerThreads")
    private final Integer mysqlxMinWorkerThreads;

    public Integer getMysqlxMinWorkerThreads() {
        return mysqlxMinWorkerThreads;
    }

    /**
     * ("mysqlx_read_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxReadTimeout")
    private final Integer mysqlxReadTimeout;

    public Integer getMysqlxReadTimeout() {
        return mysqlxReadTimeout;
    }

    /**
     * ("mysqlx_wait_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWaitTimeout")
    private final Integer mysqlxWaitTimeout;

    public Integer getMysqlxWaitTimeout() {
        return mysqlxWaitTimeout;
    }

    /**
     * ("mysqlx_write_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWriteTimeout")
    private final Integer mysqlxWriteTimeout;

    public Integer getMysqlxWriteTimeout() {
        return mysqlxWriteTimeout;
    }

    /**
     * ("parser_max_mem_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserMaxMemSize")
    private final Integer parserMaxMemSize;

    public Integer getParserMaxMemSize() {
        return parserMaxMemSize;
    }

    /**
     * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryAllocBlockSize")
    private final Integer queryAllocBlockSize;

    public Integer getQueryAllocBlockSize() {
        return queryAllocBlockSize;
    }

    /**
     * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryPreallocSize")
    private final Integer queryPreallocSize;

    public Integer getQueryPreallocSize() {
        return queryPreallocSize;
    }

    /**
     * ("sql_mode")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlMode")
    private final String sqlMode;

    public String getSqlMode() {
        return sqlMode;
    }

    /**
     * Set the default compression level for the deflate algorithm. ("mysqlx_deflate_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateDefaultCompressionLevel")
    private final Integer mysqlxDeflateDefaultCompressionLevel;

    public Integer getMysqlxDeflateDefaultCompressionLevel() {
        return mysqlxDeflateDefaultCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the deflate algorithm. ("mysqlx_deflate_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateMaxClientCompressionLevel")
    private final Integer mysqlxDeflateMaxClientCompressionLevel;

    public Integer getMysqlxDeflateMaxClientCompressionLevel() {
        return mysqlxDeflateMaxClientCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the lz4 algorithm. ("mysqlx_lz4_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4MaxClientCompressionLevel")
    private final Integer mysqlxLz4MaxClientCompressionLevel;

    public Integer getMysqlxLz4MaxClientCompressionLevel() {
        return mysqlxLz4MaxClientCompressionLevel;
    }

    /**
     * Set the default compression level for the lz4 algorithm. ("mysqlx_lz4_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4DefaultCompressionLevel")
    private final Integer mysqlxLz4DefaultCompressionLevel;

    public Integer getMysqlxLz4DefaultCompressionLevel() {
        return mysqlxLz4DefaultCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the zstd algorithm. ("mysqlx_zstd_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdMaxClientCompressionLevel")
    private final Integer mysqlxZstdMaxClientCompressionLevel;

    public Integer getMysqlxZstdMaxClientCompressionLevel() {
        return mysqlxZstdMaxClientCompressionLevel;
    }

    /**
     * Set the default compression level for the zstd algorithm. ("mysqlx_zstd_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdDefaultCompressionLevel")
    private final Integer mysqlxZstdDefaultCompressionLevel;

    public Integer getMysqlxZstdDefaultCompressionLevel() {
        return mysqlxZstdDefaultCompressionLevel;
    }

    /**
     * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlZstdDefaultCompressionLevel")
    private final Integer mysqlZstdDefaultCompressionLevel;

    public Integer getMysqlZstdDefaultCompressionLevel() {
        return mysqlZstdDefaultCompressionLevel;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConfigurationVariables(");
        sb.append("completionType=").append(String.valueOf(this.completionType));
        sb.append(", defaultAuthenticationPlugin=")
                .append(String.valueOf(this.defaultAuthenticationPlugin));
        sb.append(", transactionIsolation=").append(String.valueOf(this.transactionIsolation));
        sb.append(", innodbFtServerStopwordTable=")
                .append(String.valueOf(this.innodbFtServerStopwordTable));
        sb.append(", mandatoryRoles=").append(String.valueOf(this.mandatoryRoles));
        sb.append(", autocommit=").append(String.valueOf(this.autocommit));
        sb.append(", foreignKeyChecks=").append(String.valueOf(this.foreignKeyChecks));
        sb.append(", groupReplicationConsistency=")
                .append(String.valueOf(this.groupReplicationConsistency));
        sb.append(", innodbFtEnableStopword=").append(String.valueOf(this.innodbFtEnableStopword));
        sb.append(", localInfile=").append(String.valueOf(this.localInfile));
        sb.append(", mysqlFirewallMode=").append(String.valueOf(this.mysqlFirewallMode));
        sb.append(", mysqlxEnableHelloNotice=")
                .append(String.valueOf(this.mysqlxEnableHelloNotice));
        sb.append(", sqlRequirePrimaryKey=").append(String.valueOf(this.sqlRequirePrimaryKey));
        sb.append(", sqlWarnings=").append(String.valueOf(this.sqlWarnings));
        sb.append(", binlogExpireLogsSeconds=")
                .append(String.valueOf(this.binlogExpireLogsSeconds));
        sb.append(", binlogRowMetadata=").append(String.valueOf(this.binlogRowMetadata));
        sb.append(", binlogRowValueOptions=").append(String.valueOf(this.binlogRowValueOptions));
        sb.append(", binlogTransactionCompression=")
                .append(String.valueOf(this.binlogTransactionCompression));
        sb.append(", innodbBufferPoolSize=").append(String.valueOf(this.innodbBufferPoolSize));
        sb.append(", innodbFtResultCacheLimit=")
                .append(String.valueOf(this.innodbFtResultCacheLimit));
        sb.append(", maxConnections=").append(String.valueOf(this.maxConnections));
        sb.append(", maxPreparedStmtCount=").append(String.valueOf(this.maxPreparedStmtCount));
        sb.append(", connectTimeout=").append(String.valueOf(this.connectTimeout));
        sb.append(", cteMaxRecursionDepth=").append(String.valueOf(this.cteMaxRecursionDepth));
        sb.append(", generatedRandomPasswordLength=")
                .append(String.valueOf(this.generatedRandomPasswordLength));
        sb.append(", informationSchemaStatsExpiry=")
                .append(String.valueOf(this.informationSchemaStatsExpiry));
        sb.append(", innodbBufferPoolInstances=")
                .append(String.valueOf(this.innodbBufferPoolInstances));
        sb.append(", innodbFtMaxTokenSize=").append(String.valueOf(this.innodbFtMaxTokenSize));
        sb.append(", innodbFtMinTokenSize=").append(String.valueOf(this.innodbFtMinTokenSize));
        sb.append(", innodbFtNumWordOptimize=")
                .append(String.valueOf(this.innodbFtNumWordOptimize));
        sb.append(", innodbLockWaitTimeout=").append(String.valueOf(this.innodbLockWaitTimeout));
        sb.append(", innodbMaxPurgeLag=").append(String.valueOf(this.innodbMaxPurgeLag));
        sb.append(", innodbMaxPurgeLagDelay=").append(String.valueOf(this.innodbMaxPurgeLagDelay));
        sb.append(", maxExecutionTime=").append(String.valueOf(this.maxExecutionTime));
        sb.append(", mysqlxConnectTimeout=").append(String.valueOf(this.mysqlxConnectTimeout));
        sb.append(", mysqlxDocumentIdUniquePrefix=")
                .append(String.valueOf(this.mysqlxDocumentIdUniquePrefix));
        sb.append(", mysqlxIdleWorkerThreadTimeout=")
                .append(String.valueOf(this.mysqlxIdleWorkerThreadTimeout));
        sb.append(", mysqlxInteractiveTimeout=")
                .append(String.valueOf(this.mysqlxInteractiveTimeout));
        sb.append(", mysqlxMaxAllowedPacket=").append(String.valueOf(this.mysqlxMaxAllowedPacket));
        sb.append(", mysqlxMinWorkerThreads=").append(String.valueOf(this.mysqlxMinWorkerThreads));
        sb.append(", mysqlxReadTimeout=").append(String.valueOf(this.mysqlxReadTimeout));
        sb.append(", mysqlxWaitTimeout=").append(String.valueOf(this.mysqlxWaitTimeout));
        sb.append(", mysqlxWriteTimeout=").append(String.valueOf(this.mysqlxWriteTimeout));
        sb.append(", parserMaxMemSize=").append(String.valueOf(this.parserMaxMemSize));
        sb.append(", queryAllocBlockSize=").append(String.valueOf(this.queryAllocBlockSize));
        sb.append(", queryPreallocSize=").append(String.valueOf(this.queryPreallocSize));
        sb.append(", sqlMode=").append(String.valueOf(this.sqlMode));
        sb.append(", mysqlxDeflateDefaultCompressionLevel=")
                .append(String.valueOf(this.mysqlxDeflateDefaultCompressionLevel));
        sb.append(", mysqlxDeflateMaxClientCompressionLevel=")
                .append(String.valueOf(this.mysqlxDeflateMaxClientCompressionLevel));
        sb.append(", mysqlxLz4MaxClientCompressionLevel=")
                .append(String.valueOf(this.mysqlxLz4MaxClientCompressionLevel));
        sb.append(", mysqlxLz4DefaultCompressionLevel=")
                .append(String.valueOf(this.mysqlxLz4DefaultCompressionLevel));
        sb.append(", mysqlxZstdMaxClientCompressionLevel=")
                .append(String.valueOf(this.mysqlxZstdMaxClientCompressionLevel));
        sb.append(", mysqlxZstdDefaultCompressionLevel=")
                .append(String.valueOf(this.mysqlxZstdDefaultCompressionLevel));
        sb.append(", mysqlZstdDefaultCompressionLevel=")
                .append(String.valueOf(this.mysqlZstdDefaultCompressionLevel));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationVariables)) {
            return false;
        }

        ConfigurationVariables other = (ConfigurationVariables) o;
        return java.util.Objects.equals(this.completionType, other.completionType)
                && java.util.Objects.equals(
                        this.defaultAuthenticationPlugin, other.defaultAuthenticationPlugin)
                && java.util.Objects.equals(this.transactionIsolation, other.transactionIsolation)
                && java.util.Objects.equals(
                        this.innodbFtServerStopwordTable, other.innodbFtServerStopwordTable)
                && java.util.Objects.equals(this.mandatoryRoles, other.mandatoryRoles)
                && java.util.Objects.equals(this.autocommit, other.autocommit)
                && java.util.Objects.equals(this.foreignKeyChecks, other.foreignKeyChecks)
                && java.util.Objects.equals(
                        this.groupReplicationConsistency, other.groupReplicationConsistency)
                && java.util.Objects.equals(
                        this.innodbFtEnableStopword, other.innodbFtEnableStopword)
                && java.util.Objects.equals(this.localInfile, other.localInfile)
                && java.util.Objects.equals(this.mysqlFirewallMode, other.mysqlFirewallMode)
                && java.util.Objects.equals(
                        this.mysqlxEnableHelloNotice, other.mysqlxEnableHelloNotice)
                && java.util.Objects.equals(this.sqlRequirePrimaryKey, other.sqlRequirePrimaryKey)
                && java.util.Objects.equals(this.sqlWarnings, other.sqlWarnings)
                && java.util.Objects.equals(
                        this.binlogExpireLogsSeconds, other.binlogExpireLogsSeconds)
                && java.util.Objects.equals(this.binlogRowMetadata, other.binlogRowMetadata)
                && java.util.Objects.equals(this.binlogRowValueOptions, other.binlogRowValueOptions)
                && java.util.Objects.equals(
                        this.binlogTransactionCompression, other.binlogTransactionCompression)
                && java.util.Objects.equals(this.innodbBufferPoolSize, other.innodbBufferPoolSize)
                && java.util.Objects.equals(
                        this.innodbFtResultCacheLimit, other.innodbFtResultCacheLimit)
                && java.util.Objects.equals(this.maxConnections, other.maxConnections)
                && java.util.Objects.equals(this.maxPreparedStmtCount, other.maxPreparedStmtCount)
                && java.util.Objects.equals(this.connectTimeout, other.connectTimeout)
                && java.util.Objects.equals(this.cteMaxRecursionDepth, other.cteMaxRecursionDepth)
                && java.util.Objects.equals(
                        this.generatedRandomPasswordLength, other.generatedRandomPasswordLength)
                && java.util.Objects.equals(
                        this.informationSchemaStatsExpiry, other.informationSchemaStatsExpiry)
                && java.util.Objects.equals(
                        this.innodbBufferPoolInstances, other.innodbBufferPoolInstances)
                && java.util.Objects.equals(this.innodbFtMaxTokenSize, other.innodbFtMaxTokenSize)
                && java.util.Objects.equals(this.innodbFtMinTokenSize, other.innodbFtMinTokenSize)
                && java.util.Objects.equals(
                        this.innodbFtNumWordOptimize, other.innodbFtNumWordOptimize)
                && java.util.Objects.equals(this.innodbLockWaitTimeout, other.innodbLockWaitTimeout)
                && java.util.Objects.equals(this.innodbMaxPurgeLag, other.innodbMaxPurgeLag)
                && java.util.Objects.equals(
                        this.innodbMaxPurgeLagDelay, other.innodbMaxPurgeLagDelay)
                && java.util.Objects.equals(this.maxExecutionTime, other.maxExecutionTime)
                && java.util.Objects.equals(this.mysqlxConnectTimeout, other.mysqlxConnectTimeout)
                && java.util.Objects.equals(
                        this.mysqlxDocumentIdUniquePrefix, other.mysqlxDocumentIdUniquePrefix)
                && java.util.Objects.equals(
                        this.mysqlxIdleWorkerThreadTimeout, other.mysqlxIdleWorkerThreadTimeout)
                && java.util.Objects.equals(
                        this.mysqlxInteractiveTimeout, other.mysqlxInteractiveTimeout)
                && java.util.Objects.equals(
                        this.mysqlxMaxAllowedPacket, other.mysqlxMaxAllowedPacket)
                && java.util.Objects.equals(
                        this.mysqlxMinWorkerThreads, other.mysqlxMinWorkerThreads)
                && java.util.Objects.equals(this.mysqlxReadTimeout, other.mysqlxReadTimeout)
                && java.util.Objects.equals(this.mysqlxWaitTimeout, other.mysqlxWaitTimeout)
                && java.util.Objects.equals(this.mysqlxWriteTimeout, other.mysqlxWriteTimeout)
                && java.util.Objects.equals(this.parserMaxMemSize, other.parserMaxMemSize)
                && java.util.Objects.equals(this.queryAllocBlockSize, other.queryAllocBlockSize)
                && java.util.Objects.equals(this.queryPreallocSize, other.queryPreallocSize)
                && java.util.Objects.equals(this.sqlMode, other.sqlMode)
                && java.util.Objects.equals(
                        this.mysqlxDeflateDefaultCompressionLevel,
                        other.mysqlxDeflateDefaultCompressionLevel)
                && java.util.Objects.equals(
                        this.mysqlxDeflateMaxClientCompressionLevel,
                        other.mysqlxDeflateMaxClientCompressionLevel)
                && java.util.Objects.equals(
                        this.mysqlxLz4MaxClientCompressionLevel,
                        other.mysqlxLz4MaxClientCompressionLevel)
                && java.util.Objects.equals(
                        this.mysqlxLz4DefaultCompressionLevel,
                        other.mysqlxLz4DefaultCompressionLevel)
                && java.util.Objects.equals(
                        this.mysqlxZstdMaxClientCompressionLevel,
                        other.mysqlxZstdMaxClientCompressionLevel)
                && java.util.Objects.equals(
                        this.mysqlxZstdDefaultCompressionLevel,
                        other.mysqlxZstdDefaultCompressionLevel)
                && java.util.Objects.equals(
                        this.mysqlZstdDefaultCompressionLevel,
                        other.mysqlZstdDefaultCompressionLevel)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.completionType == null ? 43 : this.completionType.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultAuthenticationPlugin == null
                                ? 43
                                : this.defaultAuthenticationPlugin.hashCode());
        result =
                (result * PRIME)
                        + (this.transactionIsolation == null
                                ? 43
                                : this.transactionIsolation.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbFtServerStopwordTable == null
                                ? 43
                                : this.innodbFtServerStopwordTable.hashCode());
        result =
                (result * PRIME)
                        + (this.mandatoryRoles == null ? 43 : this.mandatoryRoles.hashCode());
        result = (result * PRIME) + (this.autocommit == null ? 43 : this.autocommit.hashCode());
        result =
                (result * PRIME)
                        + (this.foreignKeyChecks == null ? 43 : this.foreignKeyChecks.hashCode());
        result =
                (result * PRIME)
                        + (this.groupReplicationConsistency == null
                                ? 43
                                : this.groupReplicationConsistency.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbFtEnableStopword == null
                                ? 43
                                : this.innodbFtEnableStopword.hashCode());
        result = (result * PRIME) + (this.localInfile == null ? 43 : this.localInfile.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlFirewallMode == null ? 43 : this.mysqlFirewallMode.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxEnableHelloNotice == null
                                ? 43
                                : this.mysqlxEnableHelloNotice.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlRequirePrimaryKey == null
                                ? 43
                                : this.sqlRequirePrimaryKey.hashCode());
        result = (result * PRIME) + (this.sqlWarnings == null ? 43 : this.sqlWarnings.hashCode());
        result =
                (result * PRIME)
                        + (this.binlogExpireLogsSeconds == null
                                ? 43
                                : this.binlogExpireLogsSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.binlogRowMetadata == null ? 43 : this.binlogRowMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.binlogRowValueOptions == null
                                ? 43
                                : this.binlogRowValueOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.binlogTransactionCompression == null
                                ? 43
                                : this.binlogTransactionCompression.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbBufferPoolSize == null
                                ? 43
                                : this.innodbBufferPoolSize.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbFtResultCacheLimit == null
                                ? 43
                                : this.innodbFtResultCacheLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.maxConnections == null ? 43 : this.maxConnections.hashCode());
        result =
                (result * PRIME)
                        + (this.maxPreparedStmtCount == null
                                ? 43
                                : this.maxPreparedStmtCount.hashCode());
        result =
                (result * PRIME)
                        + (this.connectTimeout == null ? 43 : this.connectTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.cteMaxRecursionDepth == null
                                ? 43
                                : this.cteMaxRecursionDepth.hashCode());
        result =
                (result * PRIME)
                        + (this.generatedRandomPasswordLength == null
                                ? 43
                                : this.generatedRandomPasswordLength.hashCode());
        result =
                (result * PRIME)
                        + (this.informationSchemaStatsExpiry == null
                                ? 43
                                : this.informationSchemaStatsExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbBufferPoolInstances == null
                                ? 43
                                : this.innodbBufferPoolInstances.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbFtMaxTokenSize == null
                                ? 43
                                : this.innodbFtMaxTokenSize.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbFtMinTokenSize == null
                                ? 43
                                : this.innodbFtMinTokenSize.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbFtNumWordOptimize == null
                                ? 43
                                : this.innodbFtNumWordOptimize.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbLockWaitTimeout == null
                                ? 43
                                : this.innodbLockWaitTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbMaxPurgeLag == null ? 43 : this.innodbMaxPurgeLag.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbMaxPurgeLagDelay == null
                                ? 43
                                : this.innodbMaxPurgeLagDelay.hashCode());
        result =
                (result * PRIME)
                        + (this.maxExecutionTime == null ? 43 : this.maxExecutionTime.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxConnectTimeout == null
                                ? 43
                                : this.mysqlxConnectTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxDocumentIdUniquePrefix == null
                                ? 43
                                : this.mysqlxDocumentIdUniquePrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxIdleWorkerThreadTimeout == null
                                ? 43
                                : this.mysqlxIdleWorkerThreadTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxInteractiveTimeout == null
                                ? 43
                                : this.mysqlxInteractiveTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxMaxAllowedPacket == null
                                ? 43
                                : this.mysqlxMaxAllowedPacket.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxMinWorkerThreads == null
                                ? 43
                                : this.mysqlxMinWorkerThreads.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxReadTimeout == null ? 43 : this.mysqlxReadTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxWaitTimeout == null ? 43 : this.mysqlxWaitTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxWriteTimeout == null
                                ? 43
                                : this.mysqlxWriteTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.parserMaxMemSize == null ? 43 : this.parserMaxMemSize.hashCode());
        result =
                (result * PRIME)
                        + (this.queryAllocBlockSize == null
                                ? 43
                                : this.queryAllocBlockSize.hashCode());
        result =
                (result * PRIME)
                        + (this.queryPreallocSize == null ? 43 : this.queryPreallocSize.hashCode());
        result = (result * PRIME) + (this.sqlMode == null ? 43 : this.sqlMode.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxDeflateDefaultCompressionLevel == null
                                ? 43
                                : this.mysqlxDeflateDefaultCompressionLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxDeflateMaxClientCompressionLevel == null
                                ? 43
                                : this.mysqlxDeflateMaxClientCompressionLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxLz4MaxClientCompressionLevel == null
                                ? 43
                                : this.mysqlxLz4MaxClientCompressionLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxLz4DefaultCompressionLevel == null
                                ? 43
                                : this.mysqlxLz4DefaultCompressionLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxZstdMaxClientCompressionLevel == null
                                ? 43
                                : this.mysqlxZstdMaxClientCompressionLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlxZstdDefaultCompressionLevel == null
                                ? 43
                                : this.mysqlxZstdDefaultCompressionLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlZstdDefaultCompressionLevel == null
                                ? 43
                                : this.mysqlZstdDefaultCompressionLevel.hashCode());
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
