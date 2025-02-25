/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * User-defined service variables. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigurationVariables.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigurationVariables
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "completionType",
        "bigTables",
        "characterSetServer",
        "collationServer",
        "connectionMemoryChunkSize",
        "connectionMemoryLimit",
        "defaultAuthenticationPlugin",
        "globalConnectionMemoryLimit",
        "globalConnectionMemoryTracking",
        "transactionIsolation",
        "innodbFtServerStopwordTable",
        "mandatoryRoles",
        "autocommit",
        "foreignKeyChecks",
        "groupReplicationConsistency",
        "groupConcatMaxLen",
        "innodbFtEnableStopword",
        "innodbLogWriterThreads",
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
        "maxBinlogCacheSize",
        "maxConnectErrors",
        "maxHeapTableSize",
        "maxConnections",
        "maxPreparedStmtCount",
        "connectTimeout",
        "cteMaxRecursionDepth",
        "generatedRandomPasswordLength",
        "informationSchemaStatsExpiry",
        "innodbBufferPoolDumpPct",
        "innodbBufferPoolInstances",
        "innodbDdlBufferSize",
        "innodbDdlThreads",
        "innodbFtMaxTokenSize",
        "innodbFtMinTokenSize",
        "innodbFtNumWordOptimize",
        "innodbLockWaitTimeout",
        "innodbMaxPurgeLag",
        "innodbMaxPurgeLagDelay",
        "interactiveTimeout",
        "innodbStatsPersistentSamplePages",
        "innodbStatsTransientSamplePages",
        "innodbStrictMode",
        "maxAllowedPacket",
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
        "netReadTimeout",
        "netWriteTimeout",
        "parserMaxMemSize",
        "queryAllocBlockSize",
        "queryPreallocSize",
        "regexpTimeLimit",
        "sqlMode",
        "tmpTableSize",
        "mysqlxDeflateDefaultCompressionLevel",
        "mysqlxDeflateMaxClientCompressionLevel",
        "mysqlxLz4MaxClientCompressionLevel",
        "mysqlxLz4DefaultCompressionLevel",
        "mysqlxZstdMaxClientCompressionLevel",
        "mysqlxZstdDefaultCompressionLevel",
        "mysqlZstdDefaultCompressionLevel",
        "sortBufferSize",
        "waitTimeout",
        "threadPoolDedicatedListeners",
        "threadPoolMaxTransactionsLimit",
        "timeZone",
        "blockEncryptionMode",
        "binlogGroupCommitSyncDelay",
        "binlogGroupCommitSyncNoDelayCount",
        "replicaNetTimeout",
        "requireSecureTransport",
        "innodbRedoLogCapacity",
        "threadPoolTransactionDelay",
        "threadPoolQueryThreadsPerGroup",
        "explainFormat",
        "explicitDefaultsForTimestamp",
        "sqlGenerateInvisiblePrimaryKey",
        "temptableMaxRam",
        "innodbChangeBuffering",
        "innodbAdaptiveHashIndex",
        "innodbUndoLogTruncate",
        "tableDefinitionCache",
        "tableOpenCache",
        "relayLogSpaceLimit",
        "optimizerSwitch",
        "replicaTypeConversions",
        "replicaParallelWorkers",
        "skipNameResolve",
        "maxUserConnections",
        "joinBufferSize",
        "maxSeeksForKey",
        "rangeOptimizerMaxMemSize",
        "autoIncrementIncrement",
        "autoIncrementOffset",
        "innodbAutoincLockMode",
        "innodbRollbackOnTimeout",
        "innodbOnlineAlterLogMaxSize",
        "innodbSortBufferSize",
        "innodbNumaInterleave",
        "threadPoolSize",
        "longQueryTime"
    })
    public ConfigurationVariables(
            CompletionType completionType,
            Boolean bigTables,
            CharacterSetServer characterSetServer,
            CollationServer collationServer,
            Integer connectionMemoryChunkSize,
            Long connectionMemoryLimit,
            DefaultAuthenticationPlugin defaultAuthenticationPlugin,
            Long globalConnectionMemoryLimit,
            Boolean globalConnectionMemoryTracking,
            TransactionIsolation transactionIsolation,
            String innodbFtServerStopwordTable,
            String mandatoryRoles,
            Boolean autocommit,
            Boolean foreignKeyChecks,
            GroupReplicationConsistency groupReplicationConsistency,
            Long groupConcatMaxLen,
            Boolean innodbFtEnableStopword,
            Boolean innodbLogWriterThreads,
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
            Long innodbFtResultCacheLimit,
            Long maxBinlogCacheSize,
            Long maxConnectErrors,
            Long maxHeapTableSize,
            Integer maxConnections,
            Integer maxPreparedStmtCount,
            Integer connectTimeout,
            Long cteMaxRecursionDepth,
            Integer generatedRandomPasswordLength,
            Integer informationSchemaStatsExpiry,
            Integer innodbBufferPoolDumpPct,
            Integer innodbBufferPoolInstances,
            Long innodbDdlBufferSize,
            Integer innodbDdlThreads,
            Integer innodbFtMaxTokenSize,
            Integer innodbFtMinTokenSize,
            Integer innodbFtNumWordOptimize,
            Integer innodbLockWaitTimeout,
            Long innodbMaxPurgeLag,
            Integer innodbMaxPurgeLagDelay,
            Integer interactiveTimeout,
            Long innodbStatsPersistentSamplePages,
            Long innodbStatsTransientSamplePages,
            Boolean innodbStrictMode,
            Integer maxAllowedPacket,
            Long maxExecutionTime,
            Integer mysqlxConnectTimeout,
            Integer mysqlxDocumentIdUniquePrefix,
            Integer mysqlxIdleWorkerThreadTimeout,
            Integer mysqlxInteractiveTimeout,
            Integer mysqlxMaxAllowedPacket,
            Integer mysqlxMinWorkerThreads,
            Integer mysqlxReadTimeout,
            Integer mysqlxWaitTimeout,
            Integer mysqlxWriteTimeout,
            Integer netReadTimeout,
            Integer netWriteTimeout,
            Long parserMaxMemSize,
            Long queryAllocBlockSize,
            Long queryPreallocSize,
            Integer regexpTimeLimit,
            String sqlMode,
            Long tmpTableSize,
            Integer mysqlxDeflateDefaultCompressionLevel,
            Integer mysqlxDeflateMaxClientCompressionLevel,
            Integer mysqlxLz4MaxClientCompressionLevel,
            Integer mysqlxLz4DefaultCompressionLevel,
            Integer mysqlxZstdMaxClientCompressionLevel,
            Integer mysqlxZstdDefaultCompressionLevel,
            Integer mysqlZstdDefaultCompressionLevel,
            Long sortBufferSize,
            Integer waitTimeout,
            Boolean threadPoolDedicatedListeners,
            Integer threadPoolMaxTransactionsLimit,
            String timeZone,
            String blockEncryptionMode,
            Integer binlogGroupCommitSyncDelay,
            Integer binlogGroupCommitSyncNoDelayCount,
            Integer replicaNetTimeout,
            Boolean requireSecureTransport,
            Long innodbRedoLogCapacity,
            Integer threadPoolTransactionDelay,
            Integer threadPoolQueryThreadsPerGroup,
            ExplainFormat explainFormat,
            Boolean explicitDefaultsForTimestamp,
            Boolean sqlGenerateInvisiblePrimaryKey,
            Long temptableMaxRam,
            InnodbChangeBuffering innodbChangeBuffering,
            Boolean innodbAdaptiveHashIndex,
            Boolean innodbUndoLogTruncate,
            Integer tableDefinitionCache,
            Integer tableOpenCache,
            Long relayLogSpaceLimit,
            String optimizerSwitch,
            String replicaTypeConversions,
            Integer replicaParallelWorkers,
            Boolean skipNameResolve,
            Long maxUserConnections,
            Long joinBufferSize,
            Long maxSeeksForKey,
            Long rangeOptimizerMaxMemSize,
            Integer autoIncrementIncrement,
            Integer autoIncrementOffset,
            Integer innodbAutoincLockMode,
            Boolean innodbRollbackOnTimeout,
            Long innodbOnlineAlterLogMaxSize,
            Integer innodbSortBufferSize,
            Boolean innodbNumaInterleave,
            Integer threadPoolSize,
            Integer longQueryTime) {
        super();
        this.completionType = completionType;
        this.bigTables = bigTables;
        this.characterSetServer = characterSetServer;
        this.collationServer = collationServer;
        this.connectionMemoryChunkSize = connectionMemoryChunkSize;
        this.connectionMemoryLimit = connectionMemoryLimit;
        this.defaultAuthenticationPlugin = defaultAuthenticationPlugin;
        this.globalConnectionMemoryLimit = globalConnectionMemoryLimit;
        this.globalConnectionMemoryTracking = globalConnectionMemoryTracking;
        this.transactionIsolation = transactionIsolation;
        this.innodbFtServerStopwordTable = innodbFtServerStopwordTable;
        this.mandatoryRoles = mandatoryRoles;
        this.autocommit = autocommit;
        this.foreignKeyChecks = foreignKeyChecks;
        this.groupReplicationConsistency = groupReplicationConsistency;
        this.groupConcatMaxLen = groupConcatMaxLen;
        this.innodbFtEnableStopword = innodbFtEnableStopword;
        this.innodbLogWriterThreads = innodbLogWriterThreads;
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
        this.maxBinlogCacheSize = maxBinlogCacheSize;
        this.maxConnectErrors = maxConnectErrors;
        this.maxHeapTableSize = maxHeapTableSize;
        this.maxConnections = maxConnections;
        this.maxPreparedStmtCount = maxPreparedStmtCount;
        this.connectTimeout = connectTimeout;
        this.cteMaxRecursionDepth = cteMaxRecursionDepth;
        this.generatedRandomPasswordLength = generatedRandomPasswordLength;
        this.informationSchemaStatsExpiry = informationSchemaStatsExpiry;
        this.innodbBufferPoolDumpPct = innodbBufferPoolDumpPct;
        this.innodbBufferPoolInstances = innodbBufferPoolInstances;
        this.innodbDdlBufferSize = innodbDdlBufferSize;
        this.innodbDdlThreads = innodbDdlThreads;
        this.innodbFtMaxTokenSize = innodbFtMaxTokenSize;
        this.innodbFtMinTokenSize = innodbFtMinTokenSize;
        this.innodbFtNumWordOptimize = innodbFtNumWordOptimize;
        this.innodbLockWaitTimeout = innodbLockWaitTimeout;
        this.innodbMaxPurgeLag = innodbMaxPurgeLag;
        this.innodbMaxPurgeLagDelay = innodbMaxPurgeLagDelay;
        this.interactiveTimeout = interactiveTimeout;
        this.innodbStatsPersistentSamplePages = innodbStatsPersistentSamplePages;
        this.innodbStatsTransientSamplePages = innodbStatsTransientSamplePages;
        this.innodbStrictMode = innodbStrictMode;
        this.maxAllowedPacket = maxAllowedPacket;
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
        this.netReadTimeout = netReadTimeout;
        this.netWriteTimeout = netWriteTimeout;
        this.parserMaxMemSize = parserMaxMemSize;
        this.queryAllocBlockSize = queryAllocBlockSize;
        this.queryPreallocSize = queryPreallocSize;
        this.regexpTimeLimit = regexpTimeLimit;
        this.sqlMode = sqlMode;
        this.tmpTableSize = tmpTableSize;
        this.mysqlxDeflateDefaultCompressionLevel = mysqlxDeflateDefaultCompressionLevel;
        this.mysqlxDeflateMaxClientCompressionLevel = mysqlxDeflateMaxClientCompressionLevel;
        this.mysqlxLz4MaxClientCompressionLevel = mysqlxLz4MaxClientCompressionLevel;
        this.mysqlxLz4DefaultCompressionLevel = mysqlxLz4DefaultCompressionLevel;
        this.mysqlxZstdMaxClientCompressionLevel = mysqlxZstdMaxClientCompressionLevel;
        this.mysqlxZstdDefaultCompressionLevel = mysqlxZstdDefaultCompressionLevel;
        this.mysqlZstdDefaultCompressionLevel = mysqlZstdDefaultCompressionLevel;
        this.sortBufferSize = sortBufferSize;
        this.waitTimeout = waitTimeout;
        this.threadPoolDedicatedListeners = threadPoolDedicatedListeners;
        this.threadPoolMaxTransactionsLimit = threadPoolMaxTransactionsLimit;
        this.timeZone = timeZone;
        this.blockEncryptionMode = blockEncryptionMode;
        this.binlogGroupCommitSyncDelay = binlogGroupCommitSyncDelay;
        this.binlogGroupCommitSyncNoDelayCount = binlogGroupCommitSyncNoDelayCount;
        this.replicaNetTimeout = replicaNetTimeout;
        this.requireSecureTransport = requireSecureTransport;
        this.innodbRedoLogCapacity = innodbRedoLogCapacity;
        this.threadPoolTransactionDelay = threadPoolTransactionDelay;
        this.threadPoolQueryThreadsPerGroup = threadPoolQueryThreadsPerGroup;
        this.explainFormat = explainFormat;
        this.explicitDefaultsForTimestamp = explicitDefaultsForTimestamp;
        this.sqlGenerateInvisiblePrimaryKey = sqlGenerateInvisiblePrimaryKey;
        this.temptableMaxRam = temptableMaxRam;
        this.innodbChangeBuffering = innodbChangeBuffering;
        this.innodbAdaptiveHashIndex = innodbAdaptiveHashIndex;
        this.innodbUndoLogTruncate = innodbUndoLogTruncate;
        this.tableDefinitionCache = tableDefinitionCache;
        this.tableOpenCache = tableOpenCache;
        this.relayLogSpaceLimit = relayLogSpaceLimit;
        this.optimizerSwitch = optimizerSwitch;
        this.replicaTypeConversions = replicaTypeConversions;
        this.replicaParallelWorkers = replicaParallelWorkers;
        this.skipNameResolve = skipNameResolve;
        this.maxUserConnections = maxUserConnections;
        this.joinBufferSize = joinBufferSize;
        this.maxSeeksForKey = maxSeeksForKey;
        this.rangeOptimizerMaxMemSize = rangeOptimizerMaxMemSize;
        this.autoIncrementIncrement = autoIncrementIncrement;
        this.autoIncrementOffset = autoIncrementOffset;
        this.innodbAutoincLockMode = innodbAutoincLockMode;
        this.innodbRollbackOnTimeout = innodbRollbackOnTimeout;
        this.innodbOnlineAlterLogMaxSize = innodbOnlineAlterLogMaxSize;
        this.innodbSortBufferSize = innodbSortBufferSize;
        this.innodbNumaInterleave = innodbNumaInterleave;
        this.threadPoolSize = threadPoolSize;
        this.longQueryTime = longQueryTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ("completion_type") */
        @com.fasterxml.jackson.annotation.JsonProperty("completionType")
        private CompletionType completionType;

        /**
         * ("completion_type")
         *
         * @param completionType the value to set
         * @return this builder
         */
        public Builder completionType(CompletionType completionType) {
            this.completionType = completionType;
            this.__explicitlySet__.add("completionType");
            return this;
        }
        /**
         * If enabled, the server stores all temporary tables on disk rather than in memory.
         *
         * <p>bigTables corresponds to the MySQL server variable
         * [big_tables](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_big_tables).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bigTables")
        private Boolean bigTables;

        /**
         * If enabled, the server stores all temporary tables on disk rather than in memory.
         *
         * <p>bigTables corresponds to the MySQL server variable
         * [big_tables](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_big_tables).
         *
         * @param bigTables the value to set
         * @return this builder
         */
        public Builder bigTables(Boolean bigTables) {
            this.bigTables = bigTables;
            this.__explicitlySet__.add("bigTables");
            return this;
        }
        /**
         * The server's default character set. If you set this variable, you should also set
         * collation_server to specify the collation for the character set.
         *
         * <p>characterSetServer corresponds to the MySQL server variable
         * [character_set_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_character_set_server).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("characterSetServer")
        private CharacterSetServer characterSetServer;

        /**
         * The server's default character set. If you set this variable, you should also set
         * collation_server to specify the collation for the character set.
         *
         * <p>characterSetServer corresponds to the MySQL server variable
         * [character_set_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_character_set_server).
         *
         * @param characterSetServer the value to set
         * @return this builder
         */
        public Builder characterSetServer(CharacterSetServer characterSetServer) {
            this.characterSetServer = characterSetServer;
            this.__explicitlySet__.add("characterSetServer");
            return this;
        }
        /**
         * The server's default collation.
         *
         * <p>collationServer corresponds to the MySQL server variable
         * [collation_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_collation_server).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("collationServer")
        private CollationServer collationServer;

        /**
         * The server's default collation.
         *
         * <p>collationServer corresponds to the MySQL server variable
         * [collation_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_collation_server).
         *
         * @param collationServer the value to set
         * @return this builder
         */
        public Builder collationServer(CollationServer collationServer) {
            this.collationServer = collationServer;
            this.__explicitlySet__.add("collationServer");
            return this;
        }
        /**
         * Set the chunking size for updates to the global memory usage counter
         * Global_connection_memory.
         *
         * <p>connectionMemoryChunkSize corresponds to the MySQL system variable
         * [connection_memory_chunk_size](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_connection_memory_chunk_size).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionMemoryChunkSize")
        private Integer connectionMemoryChunkSize;

        /**
         * Set the chunking size for updates to the global memory usage counter
         * Global_connection_memory.
         *
         * <p>connectionMemoryChunkSize corresponds to the MySQL system variable
         * [connection_memory_chunk_size](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_connection_memory_chunk_size).
         *
         * @param connectionMemoryChunkSize the value to set
         * @return this builder
         */
        public Builder connectionMemoryChunkSize(Integer connectionMemoryChunkSize) {
            this.connectionMemoryChunkSize = connectionMemoryChunkSize;
            this.__explicitlySet__.add("connectionMemoryChunkSize");
            return this;
        }
        /**
         * Set the maximum amount of memory that can be used by a single user connection.
         *
         * <p>connectionMemoryLimit corresponds to the MySQL system variable
         * [connection_memory_limit](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_connection_memory_limit).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionMemoryLimit")
        private Long connectionMemoryLimit;

        /**
         * Set the maximum amount of memory that can be used by a single user connection.
         *
         * <p>connectionMemoryLimit corresponds to the MySQL system variable
         * [connection_memory_limit](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_connection_memory_limit).
         *
         * @param connectionMemoryLimit the value to set
         * @return this builder
         */
        public Builder connectionMemoryLimit(Long connectionMemoryLimit) {
            this.connectionMemoryLimit = connectionMemoryLimit;
            this.__explicitlySet__.add("connectionMemoryLimit");
            return this;
        }
        /**
         * The default authentication plugin. This must be a plugin that uses internal credentials
         * storage, so these values are permitted: mysql_native_password, sha256_password,
         * caching_sha2_password.
         *
         * <p>As of MySQL 8.0.27, which introduces multifactor authentication,
         * default_authentication_plugin is still used, but in conjunction with and at a lower
         * precedence than the authentication_policy system variable. For details, see The Default
         * Authentication Plugin. Because of this diminished role, default_authentication_plugin is
         * deprecated as of MySQL 8.0.27 and subject to removal in a future MySQL version.
         *
         * <p>defaultAuthenticationPlugin corresponds to the MySQL system variable
         * [default_authentication_plugin](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_default_authentication_plugin).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationPlugin")
        private DefaultAuthenticationPlugin defaultAuthenticationPlugin;

        /**
         * The default authentication plugin. This must be a plugin that uses internal credentials
         * storage, so these values are permitted: mysql_native_password, sha256_password,
         * caching_sha2_password.
         *
         * <p>As of MySQL 8.0.27, which introduces multifactor authentication,
         * default_authentication_plugin is still used, but in conjunction with and at a lower
         * precedence than the authentication_policy system variable. For details, see The Default
         * Authentication Plugin. Because of this diminished role, default_authentication_plugin is
         * deprecated as of MySQL 8.0.27 and subject to removal in a future MySQL version.
         *
         * <p>defaultAuthenticationPlugin corresponds to the MySQL system variable
         * [default_authentication_plugin](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_default_authentication_plugin).
         *
         * @param defaultAuthenticationPlugin the value to set
         * @return this builder
         */
        public Builder defaultAuthenticationPlugin(
                DefaultAuthenticationPlugin defaultAuthenticationPlugin) {
            this.defaultAuthenticationPlugin = defaultAuthenticationPlugin;
            this.__explicitlySet__.add("defaultAuthenticationPlugin");
            return this;
        }
        /**
         * Set the total amount of memory that can be used by all user connections.
         *
         * <p>globalConnectionMemoryLimit corresponds to the MySQL system variable
         * [global_connection_memory_limit](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_global_connection_memory_limit).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("globalConnectionMemoryLimit")
        private Long globalConnectionMemoryLimit;

        /**
         * Set the total amount of memory that can be used by all user connections.
         *
         * <p>globalConnectionMemoryLimit corresponds to the MySQL system variable
         * [global_connection_memory_limit](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_global_connection_memory_limit).
         *
         * @param globalConnectionMemoryLimit the value to set
         * @return this builder
         */
        public Builder globalConnectionMemoryLimit(Long globalConnectionMemoryLimit) {
            this.globalConnectionMemoryLimit = globalConnectionMemoryLimit;
            this.__explicitlySet__.add("globalConnectionMemoryLimit");
            return this;
        }
        /**
         * Determines whether the MySQL server calculates Global_connection_memory.
         *
         * <p>globalConnectionMemoryTracking corresponds to the MySQL system variable
         * [global_connection_memory_tracking](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_global_connection_memory_tracking).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("globalConnectionMemoryTracking")
        private Boolean globalConnectionMemoryTracking;

        /**
         * Determines whether the MySQL server calculates Global_connection_memory.
         *
         * <p>globalConnectionMemoryTracking corresponds to the MySQL system variable
         * [global_connection_memory_tracking](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_global_connection_memory_tracking).
         *
         * @param globalConnectionMemoryTracking the value to set
         * @return this builder
         */
        public Builder globalConnectionMemoryTracking(Boolean globalConnectionMemoryTracking) {
            this.globalConnectionMemoryTracking = globalConnectionMemoryTracking;
            this.__explicitlySet__.add("globalConnectionMemoryTracking");
            return this;
        }
        /** ("transaction_isolation") */
        @com.fasterxml.jackson.annotation.JsonProperty("transactionIsolation")
        private TransactionIsolation transactionIsolation;

        /**
         * ("transaction_isolation")
         *
         * @param transactionIsolation the value to set
         * @return this builder
         */
        public Builder transactionIsolation(TransactionIsolation transactionIsolation) {
            this.transactionIsolation = transactionIsolation;
            this.__explicitlySet__.add("transactionIsolation");
            return this;
        }
        /** ("innodb_ft_server_stopword_table") */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtServerStopwordTable")
        private String innodbFtServerStopwordTable;

        /**
         * ("innodb_ft_server_stopword_table")
         *
         * @param innodbFtServerStopwordTable the value to set
         * @return this builder
         */
        public Builder innodbFtServerStopwordTable(String innodbFtServerStopwordTable) {
            this.innodbFtServerStopwordTable = innodbFtServerStopwordTable;
            this.__explicitlySet__.add("innodbFtServerStopwordTable");
            return this;
        }
        /** ("mandatory_roles") */
        @com.fasterxml.jackson.annotation.JsonProperty("mandatoryRoles")
        private String mandatoryRoles;

        /**
         * ("mandatory_roles")
         *
         * @param mandatoryRoles the value to set
         * @return this builder
         */
        public Builder mandatoryRoles(String mandatoryRoles) {
            this.mandatoryRoles = mandatoryRoles;
            this.__explicitlySet__.add("mandatoryRoles");
            return this;
        }
        /** ("autocommit") */
        @com.fasterxml.jackson.annotation.JsonProperty("autocommit")
        private Boolean autocommit;

        /**
         * ("autocommit")
         *
         * @param autocommit the value to set
         * @return this builder
         */
        public Builder autocommit(Boolean autocommit) {
            this.autocommit = autocommit;
            this.__explicitlySet__.add("autocommit");
            return this;
        }
        /** ("foreign_key_checks") */
        @com.fasterxml.jackson.annotation.JsonProperty("foreignKeyChecks")
        private Boolean foreignKeyChecks;

        /**
         * ("foreign_key_checks")
         *
         * @param foreignKeyChecks the value to set
         * @return this builder
         */
        public Builder foreignKeyChecks(Boolean foreignKeyChecks) {
            this.foreignKeyChecks = foreignKeyChecks;
            this.__explicitlySet__.add("foreignKeyChecks");
            return this;
        }
        /**
         * - EVENTUAL: Both RO and RW transactions do not wait for preceding transactions to be
         * applied before executing. A RW transaction does not wait for other members to apply a
         * transaction. This means that a transaction could be externalized on one member before the
         * others. This also means that in the event of a primary failover, the new primary can
         * accept new RO and RW transactions before the previous primary transactions are all
         * applied. RO transactions could result in outdated values, RW transactions could result in
         * a rollback due to conflicts. - BEFORE_ON_PRIMARY_FAILOVER: New RO or RW transactions with
         * a newly elected primary that is applying backlog from the old primary are held (not
         * applied) until any backlog has been applied. This ensures that when a primary failover
         * happens, intentionally or not, clients always see the latest value on the primary. This
         * guarantees consistency, but means that clients must be able to handle the delay in the
         * event that a backlog is being applied. Usually this delay should be minimal, but does
         * depend on the size of the backlog. - BEFORE: A RW transaction waits for all preceding
         * transactions to complete before being applied. A RO transaction waits for all preceding
         * transactions to complete before being executed. This ensures that this transaction reads
         * the latest value by only affecting the latency of the transaction. This reduces the
         * overhead of synchronization on every RW transaction, by ensuring synchronization is used
         * only on RO transactions. This consistency level also includes the consistency guarantees
         * provided by BEFORE_ON_PRIMARY_FAILOVER. - AFTER: A RW transaction waits until its changes
         * have been applied to all of the other members. This value has no effect on RO
         * transactions. This mode ensures that when a transaction is committed on the local member,
         * any subsequent transaction reads the written value or a more recent value on any group
         * member. Use this mode with a group that is used for predominantly RO operations to ensure
         * that applied RW transactions are applied everywhere once they commit. This could be used
         * by your application to ensure that subsequent reads fetch the latest data which includes
         * the latest writes. This reduces the overhead of synchronization on every RO transaction,
         * by ensuring synchronization is used only on RW transactions. This consistency level also
         * includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER. -
         * BEFORE_AND_AFTER: A RW transaction waits for 1) all preceding transactions to complete
         * before being applied and 2) until its changes have been applied on other members. A RO
         * transaction waits for all preceding transactions to complete before execution takes
         * place. This consistency level also includes the consistency guarantees provided by
         * BEFORE_ON_PRIMARY_FAILOVER.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupReplicationConsistency")
        private GroupReplicationConsistency groupReplicationConsistency;

        /**
         * - EVENTUAL: Both RO and RW transactions do not wait for preceding transactions to be
         * applied before executing. A RW transaction does not wait for other members to apply a
         * transaction. This means that a transaction could be externalized on one member before the
         * others. This also means that in the event of a primary failover, the new primary can
         * accept new RO and RW transactions before the previous primary transactions are all
         * applied. RO transactions could result in outdated values, RW transactions could result in
         * a rollback due to conflicts. - BEFORE_ON_PRIMARY_FAILOVER: New RO or RW transactions with
         * a newly elected primary that is applying backlog from the old primary are held (not
         * applied) until any backlog has been applied. This ensures that when a primary failover
         * happens, intentionally or not, clients always see the latest value on the primary. This
         * guarantees consistency, but means that clients must be able to handle the delay in the
         * event that a backlog is being applied. Usually this delay should be minimal, but does
         * depend on the size of the backlog. - BEFORE: A RW transaction waits for all preceding
         * transactions to complete before being applied. A RO transaction waits for all preceding
         * transactions to complete before being executed. This ensures that this transaction reads
         * the latest value by only affecting the latency of the transaction. This reduces the
         * overhead of synchronization on every RW transaction, by ensuring synchronization is used
         * only on RO transactions. This consistency level also includes the consistency guarantees
         * provided by BEFORE_ON_PRIMARY_FAILOVER. - AFTER: A RW transaction waits until its changes
         * have been applied to all of the other members. This value has no effect on RO
         * transactions. This mode ensures that when a transaction is committed on the local member,
         * any subsequent transaction reads the written value or a more recent value on any group
         * member. Use this mode with a group that is used for predominantly RO operations to ensure
         * that applied RW transactions are applied everywhere once they commit. This could be used
         * by your application to ensure that subsequent reads fetch the latest data which includes
         * the latest writes. This reduces the overhead of synchronization on every RO transaction,
         * by ensuring synchronization is used only on RW transactions. This consistency level also
         * includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER. -
         * BEFORE_AND_AFTER: A RW transaction waits for 1) all preceding transactions to complete
         * before being applied and 2) until its changes have been applied on other members. A RO
         * transaction waits for all preceding transactions to complete before execution takes
         * place. This consistency level also includes the consistency guarantees provided by
         * BEFORE_ON_PRIMARY_FAILOVER.
         *
         * @param groupReplicationConsistency the value to set
         * @return this builder
         */
        public Builder groupReplicationConsistency(
                GroupReplicationConsistency groupReplicationConsistency) {
            this.groupReplicationConsistency = groupReplicationConsistency;
            this.__explicitlySet__.add("groupReplicationConsistency");
            return this;
        }
        /**
         * Specifies the maximum permitted result length in bytes for the GROUP_CONCAT() function.
         *
         * <p>This is the MySQL variable "group_concat_max_len". For more information, please see
         * the [MySQL
         * documentation](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_group_concat_max_len)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupConcatMaxLen")
        private Long groupConcatMaxLen;

        /**
         * Specifies the maximum permitted result length in bytes for the GROUP_CONCAT() function.
         *
         * <p>This is the MySQL variable "group_concat_max_len". For more information, please see
         * the [MySQL
         * documentation](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_group_concat_max_len)
         *
         * @param groupConcatMaxLen the value to set
         * @return this builder
         */
        public Builder groupConcatMaxLen(Long groupConcatMaxLen) {
            this.groupConcatMaxLen = groupConcatMaxLen;
            this.__explicitlySet__.add("groupConcatMaxLen");
            return this;
        }
        /** ("innodb_ft_enable_stopword") */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtEnableStopword")
        private Boolean innodbFtEnableStopword;

        /**
         * ("innodb_ft_enable_stopword")
         *
         * @param innodbFtEnableStopword the value to set
         * @return this builder
         */
        public Builder innodbFtEnableStopword(Boolean innodbFtEnableStopword) {
            this.innodbFtEnableStopword = innodbFtEnableStopword;
            this.__explicitlySet__.add("innodbFtEnableStopword");
            return this;
        }
        /**
         * Enables dedicated log writer threads for writing redo log records from the log buffer to
         * the system buffers and flushing the system buffers to the redo log files.
         *
         * <p>This is the MySQL variable "innodb_log_writer_threads". For more information, please
         * see the [MySQL
         * documentation](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_log_writer_threads)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbLogWriterThreads")
        private Boolean innodbLogWriterThreads;

        /**
         * Enables dedicated log writer threads for writing redo log records from the log buffer to
         * the system buffers and flushing the system buffers to the redo log files.
         *
         * <p>This is the MySQL variable "innodb_log_writer_threads". For more information, please
         * see the [MySQL
         * documentation](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_log_writer_threads)
         *
         * @param innodbLogWriterThreads the value to set
         * @return this builder
         */
        public Builder innodbLogWriterThreads(Boolean innodbLogWriterThreads) {
            this.innodbLogWriterThreads = innodbLogWriterThreads;
            this.__explicitlySet__.add("innodbLogWriterThreads");
            return this;
        }
        /**
         * This variable controls server-side LOCAL capability for LOAD DATA statements. Depending
         * on the local_infile setting, the server refuses or permits local data loading by clients
         * that have LOCAL enabled on the client side.
         *
         * <p>local_infile corresponds to the MySQL Server system variable
         * [local_infile](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_local_infile)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
        private Boolean localInfile;

        /**
         * This variable controls server-side LOCAL capability for LOAD DATA statements. Depending
         * on the local_infile setting, the server refuses or permits local data loading by clients
         * that have LOCAL enabled on the client side.
         *
         * <p>local_infile corresponds to the MySQL Server system variable
         * [local_infile](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_local_infile)
         *
         * @param localInfile the value to set
         * @return this builder
         */
        public Builder localInfile(Boolean localInfile) {
            this.localInfile = localInfile;
            this.__explicitlySet__.add("localInfile");
            return this;
        }
        /** ("mysql_firewall_mode") */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlFirewallMode")
        private Boolean mysqlFirewallMode;

        /**
         * ("mysql_firewall_mode")
         *
         * @param mysqlFirewallMode the value to set
         * @return this builder
         */
        public Builder mysqlFirewallMode(Boolean mysqlFirewallMode) {
            this.mysqlFirewallMode = mysqlFirewallMode;
            this.__explicitlySet__.add("mysqlFirewallMode");
            return this;
        }
        /**
         * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be
         * ignored
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxEnableHelloNotice")
        private Boolean mysqlxEnableHelloNotice;

        /**
         * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be
         * ignored
         *
         * @param mysqlxEnableHelloNotice the value to set
         * @return this builder
         */
        public Builder mysqlxEnableHelloNotice(Boolean mysqlxEnableHelloNotice) {
            this.mysqlxEnableHelloNotice = mysqlxEnableHelloNotice;
            this.__explicitlySet__.add("mysqlxEnableHelloNotice");
            return this;
        }
        /** ("sql_require_primary_key") */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlRequirePrimaryKey")
        private Boolean sqlRequirePrimaryKey;

        /**
         * ("sql_require_primary_key")
         *
         * @param sqlRequirePrimaryKey the value to set
         * @return this builder
         */
        public Builder sqlRequirePrimaryKey(Boolean sqlRequirePrimaryKey) {
            this.sqlRequirePrimaryKey = sqlRequirePrimaryKey;
            this.__explicitlySet__.add("sqlRequirePrimaryKey");
            return this;
        }
        /** ("sql_warnings") */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlWarnings")
        private Boolean sqlWarnings;

        /**
         * ("sql_warnings")
         *
         * @param sqlWarnings the value to set
         * @return this builder
         */
        public Builder sqlWarnings(Boolean sqlWarnings) {
            this.sqlWarnings = sqlWarnings;
            this.__explicitlySet__.add("sqlWarnings");
            return this;
        }
        /**
         * Sets the binary log expiration period in seconds. binlogExpireLogsSeconds corresponds to
         * the MySQL binary logging system variable
         * [binlog_expire_logs_seconds](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_expire_logs_seconds).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("binlogExpireLogsSeconds")
        private Integer binlogExpireLogsSeconds;

        /**
         * Sets the binary log expiration period in seconds. binlogExpireLogsSeconds corresponds to
         * the MySQL binary logging system variable
         * [binlog_expire_logs_seconds](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_expire_logs_seconds).
         *
         * @param binlogExpireLogsSeconds the value to set
         * @return this builder
         */
        public Builder binlogExpireLogsSeconds(Integer binlogExpireLogsSeconds) {
            this.binlogExpireLogsSeconds = binlogExpireLogsSeconds;
            this.__explicitlySet__.add("binlogExpireLogsSeconds");
            return this;
        }
        /**
         * Configures the amount of table metadata added to the binary log when using row-based
         * logging. binlogRowMetadata corresponds to the MySQL binary logging system variable
         * [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("binlogRowMetadata")
        private BinlogRowMetadata binlogRowMetadata;

        /**
         * Configures the amount of table metadata added to the binary log when using row-based
         * logging. binlogRowMetadata corresponds to the MySQL binary logging system variable
         * [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
         *
         * @param binlogRowMetadata the value to set
         * @return this builder
         */
        public Builder binlogRowMetadata(BinlogRowMetadata binlogRowMetadata) {
            this.binlogRowMetadata = binlogRowMetadata;
            this.__explicitlySet__.add("binlogRowMetadata");
            return this;
        }
        /**
         * When set to PARTIAL_JSON, this enables use of a space-efficient binary log format for
         * updates that modify only a small portion of a JSON document. binlogRowValueOptions
         * corresponds to the MySQL binary logging system variable
         * [binlog_row_value_options](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_value_options).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("binlogRowValueOptions")
        private String binlogRowValueOptions;

        /**
         * When set to PARTIAL_JSON, this enables use of a space-efficient binary log format for
         * updates that modify only a small portion of a JSON document. binlogRowValueOptions
         * corresponds to the MySQL binary logging system variable
         * [binlog_row_value_options](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_value_options).
         *
         * @param binlogRowValueOptions the value to set
         * @return this builder
         */
        public Builder binlogRowValueOptions(String binlogRowValueOptions) {
            this.binlogRowValueOptions = binlogRowValueOptions;
            this.__explicitlySet__.add("binlogRowValueOptions");
            return this;
        }
        /**
         * Enables compression for transactions that are written to binary log files on this server.
         * binlogTransactionCompression corresponds to the MySQL binary logging system variable
         * [binlog_transaction_compression](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_transaction_compression).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("binlogTransactionCompression")
        private Boolean binlogTransactionCompression;

        /**
         * Enables compression for transactions that are written to binary log files on this server.
         * binlogTransactionCompression corresponds to the MySQL binary logging system variable
         * [binlog_transaction_compression](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_transaction_compression).
         *
         * @param binlogTransactionCompression the value to set
         * @return this builder
         */
        public Builder binlogTransactionCompression(Boolean binlogTransactionCompression) {
            this.binlogTransactionCompression = binlogTransactionCompression;
            this.__explicitlySet__.add("binlogTransactionCompression");
            return this;
        }
        /**
         * The size (in bytes) of the buffer pool, that is, the memory area where InnoDB caches
         * table and index data.
         *
         * <p>innodbBufferPoolSize corresponds to the MySQL server system variable
         * [innodb_buffer_pool_size](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_buffer_pool_size).
         *
         * <p>The default and maximum values depend on the amount of RAM provisioned by the shape.
         * See [Default User
         * Variables](https://docs.cloud.oracle.com/mysql-database/doc/configuring-db-system.html#GUID-B5504C19-F6F4-4DAB-8506-189A4E8F4A6A).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolSize")
        private Long innodbBufferPoolSize;

        /**
         * The size (in bytes) of the buffer pool, that is, the memory area where InnoDB caches
         * table and index data.
         *
         * <p>innodbBufferPoolSize corresponds to the MySQL server system variable
         * [innodb_buffer_pool_size](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_buffer_pool_size).
         *
         * <p>The default and maximum values depend on the amount of RAM provisioned by the shape.
         * See [Default User
         * Variables](https://docs.cloud.oracle.com/mysql-database/doc/configuring-db-system.html#GUID-B5504C19-F6F4-4DAB-8506-189A4E8F4A6A).
         *
         * @param innodbBufferPoolSize the value to set
         * @return this builder
         */
        public Builder innodbBufferPoolSize(Long innodbBufferPoolSize) {
            this.innodbBufferPoolSize = innodbBufferPoolSize;
            this.__explicitlySet__.add("innodbBufferPoolSize");
            return this;
        }
        /** ("innodb_ft_result_cache_limit") */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtResultCacheLimit")
        private Long innodbFtResultCacheLimit;

        /**
         * ("innodb_ft_result_cache_limit")
         *
         * @param innodbFtResultCacheLimit the value to set
         * @return this builder
         */
        public Builder innodbFtResultCacheLimit(Long innodbFtResultCacheLimit) {
            this.innodbFtResultCacheLimit = innodbFtResultCacheLimit;
            this.__explicitlySet__.add("innodbFtResultCacheLimit");
            return this;
        }
        /**
         * Sets the size of the transaction cache.
         *
         * <p>maxBinlogCacheSize corresponds to the MySQL server system variable
         * [max_binlog_cache_size](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_max_binlog_cache_size).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxBinlogCacheSize")
        private Long maxBinlogCacheSize;

        /**
         * Sets the size of the transaction cache.
         *
         * <p>maxBinlogCacheSize corresponds to the MySQL server system variable
         * [max_binlog_cache_size](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_max_binlog_cache_size).
         *
         * @param maxBinlogCacheSize the value to set
         * @return this builder
         */
        public Builder maxBinlogCacheSize(Long maxBinlogCacheSize) {
            this.maxBinlogCacheSize = maxBinlogCacheSize;
            this.__explicitlySet__.add("maxBinlogCacheSize");
            return this;
        }
        /** ("max_connect_errors") */
        @com.fasterxml.jackson.annotation.JsonProperty("maxConnectErrors")
        private Long maxConnectErrors;

        /**
         * ("max_connect_errors")
         *
         * @param maxConnectErrors the value to set
         * @return this builder
         */
        public Builder maxConnectErrors(Long maxConnectErrors) {
            this.maxConnectErrors = maxConnectErrors;
            this.__explicitlySet__.add("maxConnectErrors");
            return this;
        }
        /**
         * This variable sets the maximum size to which user-created MEMORY tables are permitted to
         * grow.
         *
         * <p>maxHeapTableSize corresponds to the MySQL system variable
         * [max_heap_table_size](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_heap_table_size)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxHeapTableSize")
        private Long maxHeapTableSize;

        /**
         * This variable sets the maximum size to which user-created MEMORY tables are permitted to
         * grow.
         *
         * <p>maxHeapTableSize corresponds to the MySQL system variable
         * [max_heap_table_size](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_heap_table_size)
         *
         * @param maxHeapTableSize the value to set
         * @return this builder
         */
        public Builder maxHeapTableSize(Long maxHeapTableSize) {
            this.maxHeapTableSize = maxHeapTableSize;
            this.__explicitlySet__.add("maxHeapTableSize");
            return this;
        }
        /** ("max_connections") */
        @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
        private Integer maxConnections;

        /**
         * ("max_connections")
         *
         * @param maxConnections the value to set
         * @return this builder
         */
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            this.__explicitlySet__.add("maxConnections");
            return this;
        }
        /** ("max_prepared_stmt_count") */
        @com.fasterxml.jackson.annotation.JsonProperty("maxPreparedStmtCount")
        private Integer maxPreparedStmtCount;

        /**
         * ("max_prepared_stmt_count")
         *
         * @param maxPreparedStmtCount the value to set
         * @return this builder
         */
        public Builder maxPreparedStmtCount(Integer maxPreparedStmtCount) {
            this.maxPreparedStmtCount = maxPreparedStmtCount;
            this.__explicitlySet__.add("maxPreparedStmtCount");
            return this;
        }
        /**
         * The number of seconds that the mysqld server waits for a connect packet before responding
         * with Bad handshake.
         *
         * <p>connectTimeout corresponds to the MySQL system variable
         * [connect_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_connect_timeout)
         *
         * <p>Increasing the connect_timeout value might help if clients frequently encounter errors
         * of the form "Lost connection to MySQL server at 'XXX', system error: errno".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectTimeout")
        private Integer connectTimeout;

        /**
         * The number of seconds that the mysqld server waits for a connect packet before responding
         * with Bad handshake.
         *
         * <p>connectTimeout corresponds to the MySQL system variable
         * [connect_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_connect_timeout)
         *
         * <p>Increasing the connect_timeout value might help if clients frequently encounter errors
         * of the form "Lost connection to MySQL server at 'XXX', system error: errno".
         *
         * @param connectTimeout the value to set
         * @return this builder
         */
        public Builder connectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            this.__explicitlySet__.add("connectTimeout");
            return this;
        }
        /** ("cte_max_recursion_depth") */
        @com.fasterxml.jackson.annotation.JsonProperty("cteMaxRecursionDepth")
        private Long cteMaxRecursionDepth;

        /**
         * ("cte_max_recursion_depth")
         *
         * @param cteMaxRecursionDepth the value to set
         * @return this builder
         */
        public Builder cteMaxRecursionDepth(Long cteMaxRecursionDepth) {
            this.cteMaxRecursionDepth = cteMaxRecursionDepth;
            this.__explicitlySet__.add("cteMaxRecursionDepth");
            return this;
        }
        /**
         * ("generated_random_password_length") DEPRECATED -- variable should not be settable and
         * will be ignored
         */
        @com.fasterxml.jackson.annotation.JsonProperty("generatedRandomPasswordLength")
        private Integer generatedRandomPasswordLength;

        /**
         * ("generated_random_password_length") DEPRECATED -- variable should not be settable and
         * will be ignored
         *
         * @param generatedRandomPasswordLength the value to set
         * @return this builder
         */
        public Builder generatedRandomPasswordLength(Integer generatedRandomPasswordLength) {
            this.generatedRandomPasswordLength = generatedRandomPasswordLength;
            this.__explicitlySet__.add("generatedRandomPasswordLength");
            return this;
        }
        /** ("information_schema_stats_expiry") */
        @com.fasterxml.jackson.annotation.JsonProperty("informationSchemaStatsExpiry")
        private Integer informationSchemaStatsExpiry;

        /**
         * ("information_schema_stats_expiry")
         *
         * @param informationSchemaStatsExpiry the value to set
         * @return this builder
         */
        public Builder informationSchemaStatsExpiry(Integer informationSchemaStatsExpiry) {
            this.informationSchemaStatsExpiry = informationSchemaStatsExpiry;
            this.__explicitlySet__.add("informationSchemaStatsExpiry");
            return this;
        }
        /**
         * Specifies the percentage of the most recently used pages for each buffer pool to read out
         * and dump.
         *
         * <p>innodbBufferPoolDumpPct corresponds to the MySQL InnoDB system variable
         * [innodb_buffer_pool_dump_pct](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_buffer_pool_dump_pct).
         *
         * <p>The range is 1 to 100. The default value is 25.
         *
         * <p>For example, if there are 4 buffer pools with 100 pages each, and
         * innodb_buffer_pool_dump_pct is set to 25, the 25 most recently used pages from each
         * buffer pool are dumped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolDumpPct")
        private Integer innodbBufferPoolDumpPct;

        /**
         * Specifies the percentage of the most recently used pages for each buffer pool to read out
         * and dump.
         *
         * <p>innodbBufferPoolDumpPct corresponds to the MySQL InnoDB system variable
         * [innodb_buffer_pool_dump_pct](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_buffer_pool_dump_pct).
         *
         * <p>The range is 1 to 100. The default value is 25.
         *
         * <p>For example, if there are 4 buffer pools with 100 pages each, and
         * innodb_buffer_pool_dump_pct is set to 25, the 25 most recently used pages from each
         * buffer pool are dumped.
         *
         * @param innodbBufferPoolDumpPct the value to set
         * @return this builder
         */
        public Builder innodbBufferPoolDumpPct(Integer innodbBufferPoolDumpPct) {
            this.innodbBufferPoolDumpPct = innodbBufferPoolDumpPct;
            this.__explicitlySet__.add("innodbBufferPoolDumpPct");
            return this;
        }
        /** ("innodb_buffer_pool_instances") */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolInstances")
        private Integer innodbBufferPoolInstances;

        /**
         * ("innodb_buffer_pool_instances")
         *
         * @param innodbBufferPoolInstances the value to set
         * @return this builder
         */
        public Builder innodbBufferPoolInstances(Integer innodbBufferPoolInstances) {
            this.innodbBufferPoolInstances = innodbBufferPoolInstances;
            this.__explicitlySet__.add("innodbBufferPoolInstances");
            return this;
        }
        /**
         * innodbDdlBufferSize corresponds to the MySQL system variable [innodb_ddl_buffer_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_ddl_buffer_size)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbDdlBufferSize")
        private Long innodbDdlBufferSize;

        /**
         * innodbDdlBufferSize corresponds to the MySQL system variable [innodb_ddl_buffer_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_ddl_buffer_size)
         *
         * @param innodbDdlBufferSize the value to set
         * @return this builder
         */
        public Builder innodbDdlBufferSize(Long innodbDdlBufferSize) {
            this.innodbDdlBufferSize = innodbDdlBufferSize;
            this.__explicitlySet__.add("innodbDdlBufferSize");
            return this;
        }
        /**
         * innodbDdlThreads corresponds to the MySQL system variable [innodb_ddl_threads]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_ddl_threads)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbDdlThreads")
        private Integer innodbDdlThreads;

        /**
         * innodbDdlThreads corresponds to the MySQL system variable [innodb_ddl_threads]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_ddl_threads)
         *
         * @param innodbDdlThreads the value to set
         * @return this builder
         */
        public Builder innodbDdlThreads(Integer innodbDdlThreads) {
            this.innodbDdlThreads = innodbDdlThreads;
            this.__explicitlySet__.add("innodbDdlThreads");
            return this;
        }
        /** ("innodb_ft_max_token_size") */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMaxTokenSize")
        private Integer innodbFtMaxTokenSize;

        /**
         * ("innodb_ft_max_token_size")
         *
         * @param innodbFtMaxTokenSize the value to set
         * @return this builder
         */
        public Builder innodbFtMaxTokenSize(Integer innodbFtMaxTokenSize) {
            this.innodbFtMaxTokenSize = innodbFtMaxTokenSize;
            this.__explicitlySet__.add("innodbFtMaxTokenSize");
            return this;
        }
        /** ("innodb_ft_min_token_size") */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMinTokenSize")
        private Integer innodbFtMinTokenSize;

        /**
         * ("innodb_ft_min_token_size")
         *
         * @param innodbFtMinTokenSize the value to set
         * @return this builder
         */
        public Builder innodbFtMinTokenSize(Integer innodbFtMinTokenSize) {
            this.innodbFtMinTokenSize = innodbFtMinTokenSize;
            this.__explicitlySet__.add("innodbFtMinTokenSize");
            return this;
        }
        /** ("innodb_ft_num_word_optimize") */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtNumWordOptimize")
        private Integer innodbFtNumWordOptimize;

        /**
         * ("innodb_ft_num_word_optimize")
         *
         * @param innodbFtNumWordOptimize the value to set
         * @return this builder
         */
        public Builder innodbFtNumWordOptimize(Integer innodbFtNumWordOptimize) {
            this.innodbFtNumWordOptimize = innodbFtNumWordOptimize;
            this.__explicitlySet__.add("innodbFtNumWordOptimize");
            return this;
        }
        /** ("innodb_lock_wait_timeout") */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbLockWaitTimeout")
        private Integer innodbLockWaitTimeout;

        /**
         * ("innodb_lock_wait_timeout")
         *
         * @param innodbLockWaitTimeout the value to set
         * @return this builder
         */
        public Builder innodbLockWaitTimeout(Integer innodbLockWaitTimeout) {
            this.innodbLockWaitTimeout = innodbLockWaitTimeout;
            this.__explicitlySet__.add("innodbLockWaitTimeout");
            return this;
        }
        /**
         * The desired maximum purge lag in terms of transactions.
         *
         * <p>InnoDB maintains a list of transactions that have index records delete-marked by
         * UPDATE or DELETE operations. The length of the list is the purge lag.
         *
         * <p>If this value is exceeded, a delay is imposed on INSERT, UPDATE, and DELETE operations
         * to allow time for purge to catch up.
         *
         * <p>The default value is 0, which means there is no maximum purge lag and no delay.
         *
         * <p>innodbMaxPurgeLag corresponds to the MySQL server system variable
         * [innodb_max_purge_lag](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_max_purge_lag).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLag")
        private Long innodbMaxPurgeLag;

        /**
         * The desired maximum purge lag in terms of transactions.
         *
         * <p>InnoDB maintains a list of transactions that have index records delete-marked by
         * UPDATE or DELETE operations. The length of the list is the purge lag.
         *
         * <p>If this value is exceeded, a delay is imposed on INSERT, UPDATE, and DELETE operations
         * to allow time for purge to catch up.
         *
         * <p>The default value is 0, which means there is no maximum purge lag and no delay.
         *
         * <p>innodbMaxPurgeLag corresponds to the MySQL server system variable
         * [innodb_max_purge_lag](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_max_purge_lag).
         *
         * @param innodbMaxPurgeLag the value to set
         * @return this builder
         */
        public Builder innodbMaxPurgeLag(Long innodbMaxPurgeLag) {
            this.innodbMaxPurgeLag = innodbMaxPurgeLag;
            this.__explicitlySet__.add("innodbMaxPurgeLag");
            return this;
        }
        /**
         * The maximum delay in microseconds for the delay imposed when the innodb_max_purge_lag
         * threshold is exceeded.
         *
         * <p>The specified innodb_max_purge_lag_delay value is an upper limit on the delay period.
         *
         * <p>innodbMaxPurgeLagDelay corresponds to the MySQL server system variable
         * [innodb_max_purge_lag_delay](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_max_purge_lag_delay).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLagDelay")
        private Integer innodbMaxPurgeLagDelay;

        /**
         * The maximum delay in microseconds for the delay imposed when the innodb_max_purge_lag
         * threshold is exceeded.
         *
         * <p>The specified innodb_max_purge_lag_delay value is an upper limit on the delay period.
         *
         * <p>innodbMaxPurgeLagDelay corresponds to the MySQL server system variable
         * [innodb_max_purge_lag_delay](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_max_purge_lag_delay).
         *
         * @param innodbMaxPurgeLagDelay the value to set
         * @return this builder
         */
        public Builder innodbMaxPurgeLagDelay(Integer innodbMaxPurgeLagDelay) {
            this.innodbMaxPurgeLagDelay = innodbMaxPurgeLagDelay;
            this.__explicitlySet__.add("innodbMaxPurgeLagDelay");
            return this;
        }
        /**
         * The number of seconds the server waits for activity on an interactive connection before
         * closing it.
         *
         * <p>interactiveTimeout corresponds to the MySQL system variable.
         * [interactive_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_interactive_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("interactiveTimeout")
        private Integer interactiveTimeout;

        /**
         * The number of seconds the server waits for activity on an interactive connection before
         * closing it.
         *
         * <p>interactiveTimeout corresponds to the MySQL system variable.
         * [interactive_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_interactive_timeout)
         *
         * @param interactiveTimeout the value to set
         * @return this builder
         */
        public Builder interactiveTimeout(Integer interactiveTimeout) {
            this.interactiveTimeout = interactiveTimeout;
            this.__explicitlySet__.add("interactiveTimeout");
            return this;
        }
        /**
         * The number of index pages to sample when estimating cardinality and other statistics for
         * an indexed column, such as those calculated by ANALYZE TABLE.
         *
         * <p>innodbStatsPersistentSamplePages corresponds to the MySQL InnoDB system variable
         * [innodb_stats_persistent_sample_pages](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_stats_persistent_sample_pages)
         *
         * <p>innodb_stats_persistent_sample_pages only applies when innodb_stats_persistent is
         * enabled for a table; when innodb_stats_persistent is disabled,
         * innodb_stats_transient_sample_pages applies instead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbStatsPersistentSamplePages")
        private Long innodbStatsPersistentSamplePages;

        /**
         * The number of index pages to sample when estimating cardinality and other statistics for
         * an indexed column, such as those calculated by ANALYZE TABLE.
         *
         * <p>innodbStatsPersistentSamplePages corresponds to the MySQL InnoDB system variable
         * [innodb_stats_persistent_sample_pages](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_stats_persistent_sample_pages)
         *
         * <p>innodb_stats_persistent_sample_pages only applies when innodb_stats_persistent is
         * enabled for a table; when innodb_stats_persistent is disabled,
         * innodb_stats_transient_sample_pages applies instead.
         *
         * @param innodbStatsPersistentSamplePages the value to set
         * @return this builder
         */
        public Builder innodbStatsPersistentSamplePages(Long innodbStatsPersistentSamplePages) {
            this.innodbStatsPersistentSamplePages = innodbStatsPersistentSamplePages;
            this.__explicitlySet__.add("innodbStatsPersistentSamplePages");
            return this;
        }
        /**
         * The number of index pages to sample when estimating cardinality and other statistics for
         * an indexed column, such as those calculated by [ANALYZE
         * TABLE](https://dev.mysql.com/doc/refman/8.0/en/analyze-table.html).
         *
         * <p>innodbStatsTransientSamplePages corresponds to the MySQL InnoDB system variable
         * [innodb_stats_transient_sample_pages](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_stats_transient_sample_pages)
         *
         * <p>innodb_stats_transient_sample_pages only applies when innodb_stats_persistent is
         * disabled for a table; when innodb_stats_persistent is enabled,
         * innodb_stats_persistent_sample_pages applies instead.
         *
         * <p>innodb_stats_persistent is ON by default and cannot be changed. It is possible to
         * override it using the STATS_PERSISTENT clause of the [CREATE
         * TABLE](https://dev.mysql.com/doc/refman/8.0/en/create-table.html) and [ALTER
         * TABLE](https://dev.mysql.com/doc/refman/8.0/en/alter-table.html) statements.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbStatsTransientSamplePages")
        private Long innodbStatsTransientSamplePages;

        /**
         * The number of index pages to sample when estimating cardinality and other statistics for
         * an indexed column, such as those calculated by [ANALYZE
         * TABLE](https://dev.mysql.com/doc/refman/8.0/en/analyze-table.html).
         *
         * <p>innodbStatsTransientSamplePages corresponds to the MySQL InnoDB system variable
         * [innodb_stats_transient_sample_pages](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_stats_transient_sample_pages)
         *
         * <p>innodb_stats_transient_sample_pages only applies when innodb_stats_persistent is
         * disabled for a table; when innodb_stats_persistent is enabled,
         * innodb_stats_persistent_sample_pages applies instead.
         *
         * <p>innodb_stats_persistent is ON by default and cannot be changed. It is possible to
         * override it using the STATS_PERSISTENT clause of the [CREATE
         * TABLE](https://dev.mysql.com/doc/refman/8.0/en/create-table.html) and [ALTER
         * TABLE](https://dev.mysql.com/doc/refman/8.0/en/alter-table.html) statements.
         *
         * @param innodbStatsTransientSamplePages the value to set
         * @return this builder
         */
        public Builder innodbStatsTransientSamplePages(Long innodbStatsTransientSamplePages) {
            this.innodbStatsTransientSamplePages = innodbStatsTransientSamplePages;
            this.__explicitlySet__.add("innodbStatsTransientSamplePages");
            return this;
        }
        /**
         * When you enable innodbStrictMode, the InnoDB storage engine returns errors instead of
         * warnings for invalid or incompatible table options.
         *
         * <p>innodbStrictMode corresponds to the MySQL InnoDB system variable
         * [innodb_strict_mode](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_strict_mode)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbStrictMode")
        private Boolean innodbStrictMode;

        /**
         * When you enable innodbStrictMode, the InnoDB storage engine returns errors instead of
         * warnings for invalid or incompatible table options.
         *
         * <p>innodbStrictMode corresponds to the MySQL InnoDB system variable
         * [innodb_strict_mode](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_strict_mode)
         *
         * @param innodbStrictMode the value to set
         * @return this builder
         */
        public Builder innodbStrictMode(Boolean innodbStrictMode) {
            this.innodbStrictMode = innodbStrictMode;
            this.__explicitlySet__.add("innodbStrictMode");
            return this;
        }
        /**
         * The maximum size of one packet or any generated/intermediate string.
         *
         * <p>This is the mysql variable "max_allowed_packet".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAllowedPacket")
        private Integer maxAllowedPacket;

        /**
         * The maximum size of one packet or any generated/intermediate string.
         *
         * <p>This is the mysql variable "max_allowed_packet".
         *
         * @param maxAllowedPacket the value to set
         * @return this builder
         */
        public Builder maxAllowedPacket(Integer maxAllowedPacket) {
            this.maxAllowedPacket = maxAllowedPacket;
            this.__explicitlySet__.add("maxAllowedPacket");
            return this;
        }
        /** ("max_execution_time") */
        @com.fasterxml.jackson.annotation.JsonProperty("maxExecutionTime")
        private Long maxExecutionTime;

        /**
         * ("max_execution_time")
         *
         * @param maxExecutionTime the value to set
         * @return this builder
         */
        public Builder maxExecutionTime(Long maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            this.__explicitlySet__.add("maxExecutionTime");
            return this;
        }
        /**
         * The number of seconds X Plugin waits for the first packet to be received from newly
         * connected clients.
         *
         * <p>mysqlxConnectTimeout corresponds to the MySQL X Plugin system variable
         * [mysqlx_connect_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_connect_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxConnectTimeout")
        private Integer mysqlxConnectTimeout;

        /**
         * The number of seconds X Plugin waits for the first packet to be received from newly
         * connected clients.
         *
         * <p>mysqlxConnectTimeout corresponds to the MySQL X Plugin system variable
         * [mysqlx_connect_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_connect_timeout)
         *
         * @param mysqlxConnectTimeout the value to set
         * @return this builder
         */
        public Builder mysqlxConnectTimeout(Integer mysqlxConnectTimeout) {
            this.mysqlxConnectTimeout = mysqlxConnectTimeout;
            this.__explicitlySet__.add("mysqlxConnectTimeout");
            return this;
        }
        /**
         * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and
         * will be ignored
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDocumentIdUniquePrefix")
        private Integer mysqlxDocumentIdUniquePrefix;

        /**
         * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and
         * will be ignored
         *
         * @param mysqlxDocumentIdUniquePrefix the value to set
         * @return this builder
         */
        public Builder mysqlxDocumentIdUniquePrefix(Integer mysqlxDocumentIdUniquePrefix) {
            this.mysqlxDocumentIdUniquePrefix = mysqlxDocumentIdUniquePrefix;
            this.__explicitlySet__.add("mysqlxDocumentIdUniquePrefix");
            return this;
        }
        /**
         * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and
         * will be ignored
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxIdleWorkerThreadTimeout")
        private Integer mysqlxIdleWorkerThreadTimeout;

        /**
         * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and
         * will be ignored
         *
         * @param mysqlxIdleWorkerThreadTimeout the value to set
         * @return this builder
         */
        public Builder mysqlxIdleWorkerThreadTimeout(Integer mysqlxIdleWorkerThreadTimeout) {
            this.mysqlxIdleWorkerThreadTimeout = mysqlxIdleWorkerThreadTimeout;
            this.__explicitlySet__.add("mysqlxIdleWorkerThreadTimeout");
            return this;
        }
        /**
         * The number of seconds to wait for interactive clients to timeout.
         *
         * <p>mysqlxInteractiveTimeout corresponds to the MySQL X Plugin system variable.
         * [mysqlx_interactive_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_interactive_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxInteractiveTimeout")
        private Integer mysqlxInteractiveTimeout;

        /**
         * The number of seconds to wait for interactive clients to timeout.
         *
         * <p>mysqlxInteractiveTimeout corresponds to the MySQL X Plugin system variable.
         * [mysqlx_interactive_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_interactive_timeout)
         *
         * @param mysqlxInteractiveTimeout the value to set
         * @return this builder
         */
        public Builder mysqlxInteractiveTimeout(Integer mysqlxInteractiveTimeout) {
            this.mysqlxInteractiveTimeout = mysqlxInteractiveTimeout;
            this.__explicitlySet__.add("mysqlxInteractiveTimeout");
            return this;
        }
        /**
         * The maximum size of network packets that can be received by X Plugin.
         *
         * <p>This is the mysql variable "mysqlx_max_allowed_packet".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMaxAllowedPacket")
        private Integer mysqlxMaxAllowedPacket;

        /**
         * The maximum size of network packets that can be received by X Plugin.
         *
         * <p>This is the mysql variable "mysqlx_max_allowed_packet".
         *
         * @param mysqlxMaxAllowedPacket the value to set
         * @return this builder
         */
        public Builder mysqlxMaxAllowedPacket(Integer mysqlxMaxAllowedPacket) {
            this.mysqlxMaxAllowedPacket = mysqlxMaxAllowedPacket;
            this.__explicitlySet__.add("mysqlxMaxAllowedPacket");
            return this;
        }
        /**
         * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be
         * ignored
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMinWorkerThreads")
        private Integer mysqlxMinWorkerThreads;

        /**
         * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be
         * ignored
         *
         * @param mysqlxMinWorkerThreads the value to set
         * @return this builder
         */
        public Builder mysqlxMinWorkerThreads(Integer mysqlxMinWorkerThreads) {
            this.mysqlxMinWorkerThreads = mysqlxMinWorkerThreads;
            this.__explicitlySet__.add("mysqlxMinWorkerThreads");
            return this;
        }
        /**
         * The number of seconds that X Plugin waits for blocking read operations to complete. After
         * this time, if the read operation is not successful, X Plugin closes the connection and
         * returns a warning notice with the error code ER_IO_READ_ERROR to the client application.
         *
         * <p>mysqlxReadTimeout corresponds to the MySQL X Plugin system variable
         * [mysqlx_read_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_read_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxReadTimeout")
        private Integer mysqlxReadTimeout;

        /**
         * The number of seconds that X Plugin waits for blocking read operations to complete. After
         * this time, if the read operation is not successful, X Plugin closes the connection and
         * returns a warning notice with the error code ER_IO_READ_ERROR to the client application.
         *
         * <p>mysqlxReadTimeout corresponds to the MySQL X Plugin system variable
         * [mysqlx_read_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_read_timeout)
         *
         * @param mysqlxReadTimeout the value to set
         * @return this builder
         */
        public Builder mysqlxReadTimeout(Integer mysqlxReadTimeout) {
            this.mysqlxReadTimeout = mysqlxReadTimeout;
            this.__explicitlySet__.add("mysqlxReadTimeout");
            return this;
        }
        /**
         * The number of seconds that X Plugin waits for activity on a connection.
         *
         * <p>mysqlxWaitTimeout corresponds to the MySQL X Plugin system variable.
         * [mysqlx_wait_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_wait_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWaitTimeout")
        private Integer mysqlxWaitTimeout;

        /**
         * The number of seconds that X Plugin waits for activity on a connection.
         *
         * <p>mysqlxWaitTimeout corresponds to the MySQL X Plugin system variable.
         * [mysqlx_wait_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_wait_timeout)
         *
         * @param mysqlxWaitTimeout the value to set
         * @return this builder
         */
        public Builder mysqlxWaitTimeout(Integer mysqlxWaitTimeout) {
            this.mysqlxWaitTimeout = mysqlxWaitTimeout;
            this.__explicitlySet__.add("mysqlxWaitTimeout");
            return this;
        }
        /**
         * The number of seconds that X Plugin waits for blocking write operations to complete.
         * After this time, if the write operation is not successful, X Plugin closes the
         * connection.
         *
         * <p>mysqlxReadmysqlxWriteTimeoutTimeout corresponds to the MySQL X Plugin system variable
         * [mysqlx_write_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_write_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWriteTimeout")
        private Integer mysqlxWriteTimeout;

        /**
         * The number of seconds that X Plugin waits for blocking write operations to complete.
         * After this time, if the write operation is not successful, X Plugin closes the
         * connection.
         *
         * <p>mysqlxReadmysqlxWriteTimeoutTimeout corresponds to the MySQL X Plugin system variable
         * [mysqlx_write_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_write_timeout)
         *
         * @param mysqlxWriteTimeout the value to set
         * @return this builder
         */
        public Builder mysqlxWriteTimeout(Integer mysqlxWriteTimeout) {
            this.mysqlxWriteTimeout = mysqlxWriteTimeout;
            this.__explicitlySet__.add("mysqlxWriteTimeout");
            return this;
        }
        /**
         * The number of seconds to wait for more data from a connection before aborting the read.
         *
         * <p>netReadTimeout corresponds to the MySQL system variable
         * [net_read_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_net_read_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("netReadTimeout")
        private Integer netReadTimeout;

        /**
         * The number of seconds to wait for more data from a connection before aborting the read.
         *
         * <p>netReadTimeout corresponds to the MySQL system variable
         * [net_read_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_net_read_timeout)
         *
         * @param netReadTimeout the value to set
         * @return this builder
         */
        public Builder netReadTimeout(Integer netReadTimeout) {
            this.netReadTimeout = netReadTimeout;
            this.__explicitlySet__.add("netReadTimeout");
            return this;
        }
        /**
         * The number of seconds to wait for a block to be written to a connection before aborting
         * the write.
         *
         * <p>netWriteTimeout corresponds to the MySQL system variable
         * [net_write_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_net_write_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("netWriteTimeout")
        private Integer netWriteTimeout;

        /**
         * The number of seconds to wait for a block to be written to a connection before aborting
         * the write.
         *
         * <p>netWriteTimeout corresponds to the MySQL system variable
         * [net_write_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_net_write_timeout)
         *
         * @param netWriteTimeout the value to set
         * @return this builder
         */
        public Builder netWriteTimeout(Integer netWriteTimeout) {
            this.netWriteTimeout = netWriteTimeout;
            this.__explicitlySet__.add("netWriteTimeout");
            return this;
        }
        /** ("parser_max_mem_size") */
        @com.fasterxml.jackson.annotation.JsonProperty("parserMaxMemSize")
        private Long parserMaxMemSize;

        /**
         * ("parser_max_mem_size")
         *
         * @param parserMaxMemSize the value to set
         * @return this builder
         */
        public Builder parserMaxMemSize(Long parserMaxMemSize) {
            this.parserMaxMemSize = parserMaxMemSize;
            this.__explicitlySet__.add("parserMaxMemSize");
            return this;
        }
        /**
         * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be
         * ignored
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryAllocBlockSize")
        private Long queryAllocBlockSize;

        /**
         * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be
         * ignored
         *
         * @param queryAllocBlockSize the value to set
         * @return this builder
         */
        public Builder queryAllocBlockSize(Long queryAllocBlockSize) {
            this.queryAllocBlockSize = queryAllocBlockSize;
            this.__explicitlySet__.add("queryAllocBlockSize");
            return this;
        }
        /**
         * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryPreallocSize")
        private Long queryPreallocSize;

        /**
         * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
         *
         * @param queryPreallocSize the value to set
         * @return this builder
         */
        public Builder queryPreallocSize(Long queryPreallocSize) {
            this.queryPreallocSize = queryPreallocSize;
            this.__explicitlySet__.add("queryPreallocSize");
            return this;
        }
        /**
         * regexpTimeLimit corresponds to the MySQL system variable [regexp_time_limit]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_regexp_time_limit)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("regexpTimeLimit")
        private Integer regexpTimeLimit;

        /**
         * regexpTimeLimit corresponds to the MySQL system variable [regexp_time_limit]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_regexp_time_limit)
         *
         * @param regexpTimeLimit the value to set
         * @return this builder
         */
        public Builder regexpTimeLimit(Integer regexpTimeLimit) {
            this.regexpTimeLimit = regexpTimeLimit;
            this.__explicitlySet__.add("regexpTimeLimit");
            return this;
        }
        /** ("sql_mode") */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlMode")
        private String sqlMode;

        /**
         * ("sql_mode")
         *
         * @param sqlMode the value to set
         * @return this builder
         */
        public Builder sqlMode(String sqlMode) {
            this.sqlMode = sqlMode;
            this.__explicitlySet__.add("sqlMode");
            return this;
        }
        /**
         * The maximum size of internal in-memory temporary tables. This variable does not apply to
         * user-created MEMORY tables.
         *
         * <p>tmp_table_size corresponds to the MySQL system variable
         * [tmp_table_size](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_tmp_table_size)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tmpTableSize")
        private Long tmpTableSize;

        /**
         * The maximum size of internal in-memory temporary tables. This variable does not apply to
         * user-created MEMORY tables.
         *
         * <p>tmp_table_size corresponds to the MySQL system variable
         * [tmp_table_size](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_tmp_table_size)
         *
         * @param tmpTableSize the value to set
         * @return this builder
         */
        public Builder tmpTableSize(Long tmpTableSize) {
            this.tmpTableSize = tmpTableSize;
            this.__explicitlySet__.add("tmpTableSize");
            return this;
        }
        /**
         * Set the default compression level for the deflate algorithm.
         * ("mysqlx_deflate_default_compression_level")
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateDefaultCompressionLevel")
        private Integer mysqlxDeflateDefaultCompressionLevel;

        /**
         * Set the default compression level for the deflate algorithm.
         * ("mysqlx_deflate_default_compression_level")
         *
         * @param mysqlxDeflateDefaultCompressionLevel the value to set
         * @return this builder
         */
        public Builder mysqlxDeflateDefaultCompressionLevel(
                Integer mysqlxDeflateDefaultCompressionLevel) {
            this.mysqlxDeflateDefaultCompressionLevel = mysqlxDeflateDefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxDeflateDefaultCompressionLevel");
            return this;
        }
        /**
         * Limit the upper bound of accepted compression levels for the deflate algorithm.
         * ("mysqlx_deflate_max_client_compression_level")
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateMaxClientCompressionLevel")
        private Integer mysqlxDeflateMaxClientCompressionLevel;

        /**
         * Limit the upper bound of accepted compression levels for the deflate algorithm.
         * ("mysqlx_deflate_max_client_compression_level")
         *
         * @param mysqlxDeflateMaxClientCompressionLevel the value to set
         * @return this builder
         */
        public Builder mysqlxDeflateMaxClientCompressionLevel(
                Integer mysqlxDeflateMaxClientCompressionLevel) {
            this.mysqlxDeflateMaxClientCompressionLevel = mysqlxDeflateMaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxDeflateMaxClientCompressionLevel");
            return this;
        }
        /**
         * Limit the upper bound of accepted compression levels for the lz4 algorithm.
         * ("mysqlx_lz4_max_client_compression_level")
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4MaxClientCompressionLevel")
        private Integer mysqlxLz4MaxClientCompressionLevel;

        /**
         * Limit the upper bound of accepted compression levels for the lz4 algorithm.
         * ("mysqlx_lz4_max_client_compression_level")
         *
         * @param mysqlxLz4MaxClientCompressionLevel the value to set
         * @return this builder
         */
        public Builder mysqlxLz4MaxClientCompressionLevel(
                Integer mysqlxLz4MaxClientCompressionLevel) {
            this.mysqlxLz4MaxClientCompressionLevel = mysqlxLz4MaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxLz4MaxClientCompressionLevel");
            return this;
        }
        /**
         * Set the default compression level for the lz4 algorithm.
         * ("mysqlx_lz4_default_compression_level")
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4DefaultCompressionLevel")
        private Integer mysqlxLz4DefaultCompressionLevel;

        /**
         * Set the default compression level for the lz4 algorithm.
         * ("mysqlx_lz4_default_compression_level")
         *
         * @param mysqlxLz4DefaultCompressionLevel the value to set
         * @return this builder
         */
        public Builder mysqlxLz4DefaultCompressionLevel(Integer mysqlxLz4DefaultCompressionLevel) {
            this.mysqlxLz4DefaultCompressionLevel = mysqlxLz4DefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxLz4DefaultCompressionLevel");
            return this;
        }
        /**
         * Limit the upper bound of accepted compression levels for the zstd algorithm.
         * ("mysqlx_zstd_max_client_compression_level")
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdMaxClientCompressionLevel")
        private Integer mysqlxZstdMaxClientCompressionLevel;

        /**
         * Limit the upper bound of accepted compression levels for the zstd algorithm.
         * ("mysqlx_zstd_max_client_compression_level")
         *
         * @param mysqlxZstdMaxClientCompressionLevel the value to set
         * @return this builder
         */
        public Builder mysqlxZstdMaxClientCompressionLevel(
                Integer mysqlxZstdMaxClientCompressionLevel) {
            this.mysqlxZstdMaxClientCompressionLevel = mysqlxZstdMaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxZstdMaxClientCompressionLevel");
            return this;
        }
        /**
         * Set the default compression level for the zstd algorithm.
         * ("mysqlx_zstd_default_compression_level")
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdDefaultCompressionLevel")
        private Integer mysqlxZstdDefaultCompressionLevel;

        /**
         * Set the default compression level for the zstd algorithm.
         * ("mysqlx_zstd_default_compression_level")
         *
         * @param mysqlxZstdDefaultCompressionLevel the value to set
         * @return this builder
         */
        public Builder mysqlxZstdDefaultCompressionLevel(
                Integer mysqlxZstdDefaultCompressionLevel) {
            this.mysqlxZstdDefaultCompressionLevel = mysqlxZstdDefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxZstdDefaultCompressionLevel");
            return this;
        }
        /**
         * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlZstdDefaultCompressionLevel")
        private Integer mysqlZstdDefaultCompressionLevel;

        /**
         * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
         *
         * @param mysqlZstdDefaultCompressionLevel the value to set
         * @return this builder
         */
        public Builder mysqlZstdDefaultCompressionLevel(Integer mysqlZstdDefaultCompressionLevel) {
            this.mysqlZstdDefaultCompressionLevel = mysqlZstdDefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlZstdDefaultCompressionLevel");
            return this;
        }
        /**
         * Each session that must perform a sort allocates a buffer of this size.
         *
         * <p>sortBufferSize corresponds to the MySQL system variable
         * [sort_buffer_size](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_sort_buffer_size)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sortBufferSize")
        private Long sortBufferSize;

        /**
         * Each session that must perform a sort allocates a buffer of this size.
         *
         * <p>sortBufferSize corresponds to the MySQL system variable
         * [sort_buffer_size](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_sort_buffer_size)
         *
         * @param sortBufferSize the value to set
         * @return this builder
         */
        public Builder sortBufferSize(Long sortBufferSize) {
            this.sortBufferSize = sortBufferSize;
            this.__explicitlySet__.add("sortBufferSize");
            return this;
        }
        /**
         * The number of seconds the server waits for activity on a noninteractive connection before
         * closing it.
         *
         * <p>waitTimeout corresponds to the MySQL system variable.
         * [wait_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_wait_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("waitTimeout")
        private Integer waitTimeout;

        /**
         * The number of seconds the server waits for activity on a noninteractive connection before
         * closing it.
         *
         * <p>waitTimeout corresponds to the MySQL system variable.
         * [wait_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_wait_timeout)
         *
         * @param waitTimeout the value to set
         * @return this builder
         */
        public Builder waitTimeout(Integer waitTimeout) {
            this.waitTimeout = waitTimeout;
            this.__explicitlySet__.add("waitTimeout");
            return this;
        }
        /**
         * Controls whether the thread pool uses dedicated listener threads. If enabled, a listener
         * thread in each thread group is dedicated to the task of listening for network events from
         * clients, ensuring that the maximum number of query worker threads is no more than the
         * value specified by threadPoolMaxTransactionsLimit. threadPoolDedicatedListeners
         * corresponds to the MySQL Database Service-specific system variable
         * thread_pool_dedicated_listeners.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threadPoolDedicatedListeners")
        private Boolean threadPoolDedicatedListeners;

        /**
         * Controls whether the thread pool uses dedicated listener threads. If enabled, a listener
         * thread in each thread group is dedicated to the task of listening for network events from
         * clients, ensuring that the maximum number of query worker threads is no more than the
         * value specified by threadPoolMaxTransactionsLimit. threadPoolDedicatedListeners
         * corresponds to the MySQL Database Service-specific system variable
         * thread_pool_dedicated_listeners.
         *
         * @param threadPoolDedicatedListeners the value to set
         * @return this builder
         */
        public Builder threadPoolDedicatedListeners(Boolean threadPoolDedicatedListeners) {
            this.threadPoolDedicatedListeners = threadPoolDedicatedListeners;
            this.__explicitlySet__.add("threadPoolDedicatedListeners");
            return this;
        }
        /**
         * Limits the maximum number of open transactions to the defined value. The default value is
         * 0, which enforces no limit. threadPoolMaxTransactionsLimit corresponds to the MySQL
         * Database Service-specific system variable thread_pool_max_transactions_limit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threadPoolMaxTransactionsLimit")
        private Integer threadPoolMaxTransactionsLimit;

        /**
         * Limits the maximum number of open transactions to the defined value. The default value is
         * 0, which enforces no limit. threadPoolMaxTransactionsLimit corresponds to the MySQL
         * Database Service-specific system variable thread_pool_max_transactions_limit.
         *
         * @param threadPoolMaxTransactionsLimit the value to set
         * @return this builder
         */
        public Builder threadPoolMaxTransactionsLimit(Integer threadPoolMaxTransactionsLimit) {
            this.threadPoolMaxTransactionsLimit = threadPoolMaxTransactionsLimit;
            this.__explicitlySet__.add("threadPoolMaxTransactionsLimit");
            return this;
        }
        /**
         * Initializes the time zone for each client that connects.
         *
         * <p>This corresponds to the MySQL System Variable "time_zone".
         *
         * <p>The values can be given in one of the following formats, none of which are
         * case-sensitive:
         *
         * <p>- As a string indicating an offset from UTC of the form [H]H:MM, prefixed with a + or
         * -, such as '+10:00', '-6:00', or '+05:30'. The permitted range is '-13:59' to '+14:00',
         * inclusive. - As a named time zone, as defined by the "IANA Time Zone database", such as
         * 'Europe/Helsinki', 'US/Eastern', 'MET', or 'UTC'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * Initializes the time zone for each client that connects.
         *
         * <p>This corresponds to the MySQL System Variable "time_zone".
         *
         * <p>The values can be given in one of the following formats, none of which are
         * case-sensitive:
         *
         * <p>- As a string indicating an offset from UTC of the form [H]H:MM, prefixed with a + or
         * -, such as '+10:00', '-6:00', or '+05:30'. The permitted range is '-13:59' to '+14:00',
         * inclusive. - As a named time zone, as defined by the "IANA Time Zone database", such as
         * 'Europe/Helsinki', 'US/Eastern', 'MET', or 'UTC'.
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * This variable controls the block encryption mode for block-based algorithms such as AES.
         * It affects encryption for AES_ENCRYPT() and AES_DECRYPT().
         *
         * <p>block_encryption_mode takes a value in aes-keylen-mode format, where keylen is the key
         * length in bits and mode is the encryption mode. The value is not case-sensitive.
         * Permitted keylen values are 128, 192, and 256. Permitted mode values are ECB, CBC, CFB1,
         * CFB8, CFB128, and OFB.
         *
         * <p>block_encryption_mode corresponds to the MySQL Server Administration system variable
         * [block_encryption_mode](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_block_encryption_mode)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockEncryptionMode")
        private String blockEncryptionMode;

        /**
         * This variable controls the block encryption mode for block-based algorithms such as AES.
         * It affects encryption for AES_ENCRYPT() and AES_DECRYPT().
         *
         * <p>block_encryption_mode takes a value in aes-keylen-mode format, where keylen is the key
         * length in bits and mode is the encryption mode. The value is not case-sensitive.
         * Permitted keylen values are 128, 192, and 256. Permitted mode values are ECB, CBC, CFB1,
         * CFB8, CFB128, and OFB.
         *
         * <p>block_encryption_mode corresponds to the MySQL Server Administration system variable
         * [block_encryption_mode](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_block_encryption_mode)
         *
         * @param blockEncryptionMode the value to set
         * @return this builder
         */
        public Builder blockEncryptionMode(String blockEncryptionMode) {
            this.blockEncryptionMode = blockEncryptionMode;
            this.__explicitlySet__.add("blockEncryptionMode");
            return this;
        }
        /**
         * Controls how many microseconds the binary log commit waits before synchronizing the
         * binary log file to disk. There is no delay by default. Setting this variable to a
         * microsecond delay enables more transactions to be synchronized together to disk at once,
         * reducing the overall time to commit a group of transactions because the larger groups
         * required fewer time units per group.
         *
         * <p>binlogGroupCommitSyncDelay corresponds to the MySQL Replication system variable
         * [binlog_group_commit_sync_delay](https://dev.mysql.com/doc/refman/5.7/en/replication-options-binary-log.html#sysvar_binlog_group_commit_sync_delay)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("binlogGroupCommitSyncDelay")
        private Integer binlogGroupCommitSyncDelay;

        /**
         * Controls how many microseconds the binary log commit waits before synchronizing the
         * binary log file to disk. There is no delay by default. Setting this variable to a
         * microsecond delay enables more transactions to be synchronized together to disk at once,
         * reducing the overall time to commit a group of transactions because the larger groups
         * required fewer time units per group.
         *
         * <p>binlogGroupCommitSyncDelay corresponds to the MySQL Replication system variable
         * [binlog_group_commit_sync_delay](https://dev.mysql.com/doc/refman/5.7/en/replication-options-binary-log.html#sysvar_binlog_group_commit_sync_delay)
         *
         * @param binlogGroupCommitSyncDelay the value to set
         * @return this builder
         */
        public Builder binlogGroupCommitSyncDelay(Integer binlogGroupCommitSyncDelay) {
            this.binlogGroupCommitSyncDelay = binlogGroupCommitSyncDelay;
            this.__explicitlySet__.add("binlogGroupCommitSyncDelay");
            return this;
        }
        /**
         * The maximum number of transactions to wait for before aborting the current delay as
         * specified by binlog_group_commit_sync_delay. If binlog_group_commit_sync_delay is set to
         * 0, then this option has no effect.
         *
         * <p>binlogGroupCommitSyncNoDelayCount corresponds to the MySQL Replication system variable
         * [binlog_group_commit_sync_no_delay_count](https://dev.mysql.com/doc/refman/5.7/en/replication-options-binary-log.html#sysvar_binlog_group_commit_sync_no_delay_count)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("binlogGroupCommitSyncNoDelayCount")
        private Integer binlogGroupCommitSyncNoDelayCount;

        /**
         * The maximum number of transactions to wait for before aborting the current delay as
         * specified by binlog_group_commit_sync_delay. If binlog_group_commit_sync_delay is set to
         * 0, then this option has no effect.
         *
         * <p>binlogGroupCommitSyncNoDelayCount corresponds to the MySQL Replication system variable
         * [binlog_group_commit_sync_no_delay_count](https://dev.mysql.com/doc/refman/5.7/en/replication-options-binary-log.html#sysvar_binlog_group_commit_sync_no_delay_count)
         *
         * @param binlogGroupCommitSyncNoDelayCount the value to set
         * @return this builder
         */
        public Builder binlogGroupCommitSyncNoDelayCount(
                Integer binlogGroupCommitSyncNoDelayCount) {
            this.binlogGroupCommitSyncNoDelayCount = binlogGroupCommitSyncNoDelayCount;
            this.__explicitlySet__.add("binlogGroupCommitSyncNoDelayCount");
            return this;
        }
        /**
         * Specifies the number of seconds to wait for more data or a heartbeat signal from the
         * source before the replica considers the connection broken, aborts the read, and tries to
         * reconnect. Setting this variable has no immediate effect. The state of the variable
         * applies on all subsequent START REPLICA commands.
         *
         * <p>replicaNetTimeout corresponds to the MySQL Replica server system variable
         * [replica_net_timeout](https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_net_timeout)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaNetTimeout")
        private Integer replicaNetTimeout;

        /**
         * Specifies the number of seconds to wait for more data or a heartbeat signal from the
         * source before the replica considers the connection broken, aborts the read, and tries to
         * reconnect. Setting this variable has no immediate effect. The state of the variable
         * applies on all subsequent START REPLICA commands.
         *
         * <p>replicaNetTimeout corresponds to the MySQL Replica server system variable
         * [replica_net_timeout](https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_net_timeout)
         *
         * @param replicaNetTimeout the value to set
         * @return this builder
         */
        public Builder replicaNetTimeout(Integer replicaNetTimeout) {
            this.replicaNetTimeout = replicaNetTimeout;
            this.__explicitlySet__.add("replicaNetTimeout");
            return this;
        }
        /**
         * Whether client connections to the server are required to use some form of secure
         * transport. When this variable is enabled, the server permits only TCP/IP connections
         * encrypted using TLS/SSL, or connections that use a socket file or shared memory. The
         * server rejects nonsecure connection attempts, which fail with an
         * ER_SECURE_TRANSPORT_REQUIRED error.
         *
         * <p>require_secure_transport corresponds to the MySQL Server Administration system
         * variable
         * [require_secure_transport](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_require_secure_transport)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requireSecureTransport")
        private Boolean requireSecureTransport;

        /**
         * Whether client connections to the server are required to use some form of secure
         * transport. When this variable is enabled, the server permits only TCP/IP connections
         * encrypted using TLS/SSL, or connections that use a socket file or shared memory. The
         * server rejects nonsecure connection attempts, which fail with an
         * ER_SECURE_TRANSPORT_REQUIRED error.
         *
         * <p>require_secure_transport corresponds to the MySQL Server Administration system
         * variable
         * [require_secure_transport](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_require_secure_transport)
         *
         * @param requireSecureTransport the value to set
         * @return this builder
         */
        public Builder requireSecureTransport(Boolean requireSecureTransport) {
            this.requireSecureTransport = requireSecureTransport;
            this.__explicitlySet__.add("requireSecureTransport");
            return this;
        }
        /**
         * Defines the amount of disk space occupied by redo log files. innodb_redo_log_capacity
         * supercedes the innodb_log_files_in_group and innodb_log_file_size variables, which are
         * both ignored if innodb_redo_log_capacity is defined. If innodb_redo_log_capacity is not
         * defined, and if neither innodb_log_file_size or innodb_log_files_in_group are defined,
         * then the default innodb_redo_log_capacity value is used.
         *
         * <p>innodbRedoLogCapacity corresponds to the InnoDB Startup Options and System Variables
         * [innodb_redo_log_capacity](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_redo_log_capacity)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbRedoLogCapacity")
        private Long innodbRedoLogCapacity;

        /**
         * Defines the amount of disk space occupied by redo log files. innodb_redo_log_capacity
         * supercedes the innodb_log_files_in_group and innodb_log_file_size variables, which are
         * both ignored if innodb_redo_log_capacity is defined. If innodb_redo_log_capacity is not
         * defined, and if neither innodb_log_file_size or innodb_log_files_in_group are defined,
         * then the default innodb_redo_log_capacity value is used.
         *
         * <p>innodbRedoLogCapacity corresponds to the InnoDB Startup Options and System Variables
         * [innodb_redo_log_capacity](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_redo_log_capacity)
         *
         * @param innodbRedoLogCapacity the value to set
         * @return this builder
         */
        public Builder innodbRedoLogCapacity(Long innodbRedoLogCapacity) {
            this.innodbRedoLogCapacity = innodbRedoLogCapacity;
            this.__explicitlySet__.add("innodbRedoLogCapacity");
            return this;
        }
        /**
         * The delay period before executing a new transaction, in milliseconds. The maximum value
         * is 300000 (5 minutes). A transaction delay can be used in cases where parallel
         * transactions affect the performance of other operations due to resource contention. For
         * example, if parallel transactions affect index creation or an online buffer pool resizing
         * operation, you can configure a transaction delay to reduce resource contention while
         * those operations are running.
         *
         * <p>threadPoolTransactionDelay corresponds to the MySQL Server system variable
         * [thread_pool_transaction_delay](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_transaction_delay)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threadPoolTransactionDelay")
        private Integer threadPoolTransactionDelay;

        /**
         * The delay period before executing a new transaction, in milliseconds. The maximum value
         * is 300000 (5 minutes). A transaction delay can be used in cases where parallel
         * transactions affect the performance of other operations due to resource contention. For
         * example, if parallel transactions affect index creation or an online buffer pool resizing
         * operation, you can configure a transaction delay to reduce resource contention while
         * those operations are running.
         *
         * <p>threadPoolTransactionDelay corresponds to the MySQL Server system variable
         * [thread_pool_transaction_delay](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_transaction_delay)
         *
         * @param threadPoolTransactionDelay the value to set
         * @return this builder
         */
        public Builder threadPoolTransactionDelay(Integer threadPoolTransactionDelay) {
            this.threadPoolTransactionDelay = threadPoolTransactionDelay;
            this.__explicitlySet__.add("threadPoolTransactionDelay");
            return this;
        }
        /**
         * The maximum number of query threads permitted in a thread group. The maximum value is
         * 4096, but if thread_pool_max_transactions_limit is set,
         * thread_pool_query_threads_per_group must not exceed that value. The default value of 1
         * means there is one active query thread in each thread group, which works well for many
         * loads. When you are using the high concurrency thread pool algorithm
         * (thread_pool_algorithm = 1), consider increasing the value if you experience slower
         * response times due to long-running transactions.
         *
         * <p>threadPoolQueryThreadsPerGroup corresponds to the MySQL Server system variable
         * [thread_pool_query_threads_per_group](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_query_threads_per_group)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threadPoolQueryThreadsPerGroup")
        private Integer threadPoolQueryThreadsPerGroup;

        /**
         * The maximum number of query threads permitted in a thread group. The maximum value is
         * 4096, but if thread_pool_max_transactions_limit is set,
         * thread_pool_query_threads_per_group must not exceed that value. The default value of 1
         * means there is one active query thread in each thread group, which works well for many
         * loads. When you are using the high concurrency thread pool algorithm
         * (thread_pool_algorithm = 1), consider increasing the value if you experience slower
         * response times due to long-running transactions.
         *
         * <p>threadPoolQueryThreadsPerGroup corresponds to the MySQL Server system variable
         * [thread_pool_query_threads_per_group](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_query_threads_per_group)
         *
         * @param threadPoolQueryThreadsPerGroup the value to set
         * @return this builder
         */
        public Builder threadPoolQueryThreadsPerGroup(Integer threadPoolQueryThreadsPerGroup) {
            this.threadPoolQueryThreadsPerGroup = threadPoolQueryThreadsPerGroup;
            this.__explicitlySet__.add("threadPoolQueryThreadsPerGroup");
            return this;
        }
        /**
         * This variable determines the default output format used by EXPLAIN in the absence of a
         * FORMAT option when displaying a query execution plan.
         *
         * <p>explainFormat corresponds to the MySQL system variable
         * [explain_format](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explain_format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("explainFormat")
        private ExplainFormat explainFormat;

        /**
         * This variable determines the default output format used by EXPLAIN in the absence of a
         * FORMAT option when displaying a query execution plan.
         *
         * <p>explainFormat corresponds to the MySQL system variable
         * [explain_format](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explain_format).
         *
         * @param explainFormat the value to set
         * @return this builder
         */
        public Builder explainFormat(ExplainFormat explainFormat) {
            this.explainFormat = explainFormat;
            this.__explicitlySet__.add("explainFormat");
            return this;
        }
        /**
         * This system variable determines whether the server enables certain nonstandard behaviors
         * for default values and NULL-value handling in TIMESTAMP columns. By default,
         * explicit_defaults_for_timestamp is enabled, which disables the nonstandard behaviors.
         * Disabling explicit_defaults_for_timestamp results in a warning.
         *
         * <p>explicit_defaults_for_timestamp corresponds to the MySQL Server Administration system
         * variable
         * [explicit_defaults_for_timestamp](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explicit_defaults_for_timestamp)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("explicitDefaultsForTimestamp")
        private Boolean explicitDefaultsForTimestamp;

        /**
         * This system variable determines whether the server enables certain nonstandard behaviors
         * for default values and NULL-value handling in TIMESTAMP columns. By default,
         * explicit_defaults_for_timestamp is enabled, which disables the nonstandard behaviors.
         * Disabling explicit_defaults_for_timestamp results in a warning.
         *
         * <p>explicit_defaults_for_timestamp corresponds to the MySQL Server Administration system
         * variable
         * [explicit_defaults_for_timestamp](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explicit_defaults_for_timestamp)
         *
         * @param explicitDefaultsForTimestamp the value to set
         * @return this builder
         */
        public Builder explicitDefaultsForTimestamp(Boolean explicitDefaultsForTimestamp) {
            this.explicitDefaultsForTimestamp = explicitDefaultsForTimestamp;
            this.__explicitlySet__.add("explicitDefaultsForTimestamp");
            return this;
        }
        /**
         * Whether GIPK mode is in effect, in which case a MySQL replication source server adds a
         * generated invisible primary key to any InnoDB table that is created without one.
         *
         * <p>sqlGenerateInvisiblePrimaryKey corresponds to the MySQL system variable
         * [sql_generate_invisible_primary_key]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_sql_generate_invisible_primary_key).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlGenerateInvisiblePrimaryKey")
        private Boolean sqlGenerateInvisiblePrimaryKey;

        /**
         * Whether GIPK mode is in effect, in which case a MySQL replication source server adds a
         * generated invisible primary key to any InnoDB table that is created without one.
         *
         * <p>sqlGenerateInvisiblePrimaryKey corresponds to the MySQL system variable
         * [sql_generate_invisible_primary_key]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_sql_generate_invisible_primary_key).
         *
         * @param sqlGenerateInvisiblePrimaryKey the value to set
         * @return this builder
         */
        public Builder sqlGenerateInvisiblePrimaryKey(Boolean sqlGenerateInvisiblePrimaryKey) {
            this.sqlGenerateInvisiblePrimaryKey = sqlGenerateInvisiblePrimaryKey;
            this.__explicitlySet__.add("sqlGenerateInvisiblePrimaryKey");
            return this;
        }
        /**
         * Defines the maximum amount of memory that can be occupied by the TempTable storage engine
         * before it starts storing data on disk. The default value is 1073741824 bytes (1GiB). For
         * more information, see Section 10.4.4, \u201CInternal Temporary Table Use in MySQL\u201D.
         *
         * <p>temptableMaxRam corresponds to the MySQL system variable [temptable_max_ram]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_temptable_max_ram).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("temptableMaxRam")
        private Long temptableMaxRam;

        /**
         * Defines the maximum amount of memory that can be occupied by the TempTable storage engine
         * before it starts storing data on disk. The default value is 1073741824 bytes (1GiB). For
         * more information, see Section 10.4.4, \u201CInternal Temporary Table Use in MySQL\u201D.
         *
         * <p>temptableMaxRam corresponds to the MySQL system variable [temptable_max_ram]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_temptable_max_ram).
         *
         * @param temptableMaxRam the value to set
         * @return this builder
         */
        public Builder temptableMaxRam(Long temptableMaxRam) {
            this.temptableMaxRam = temptableMaxRam;
            this.__explicitlySet__.add("temptableMaxRam");
            return this;
        }
        /**
         * Whether InnoDB performs change buffering, an optimization that delays write operations to
         * secondary indexes so that the I/O operations can be performed sequentially. Permitted
         * values are described in the following table. Values may also be specified numerically.
         *
         * <p>innodbChangeBuffering corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_change_buffering]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_change_buffering).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbChangeBuffering")
        private InnodbChangeBuffering innodbChangeBuffering;

        /**
         * Whether InnoDB performs change buffering, an optimization that delays write operations to
         * secondary indexes so that the I/O operations can be performed sequentially. Permitted
         * values are described in the following table. Values may also be specified numerically.
         *
         * <p>innodbChangeBuffering corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_change_buffering]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_change_buffering).
         *
         * @param innodbChangeBuffering the value to set
         * @return this builder
         */
        public Builder innodbChangeBuffering(InnodbChangeBuffering innodbChangeBuffering) {
            this.innodbChangeBuffering = innodbChangeBuffering;
            this.__explicitlySet__.add("innodbChangeBuffering");
            return this;
        }
        /**
         * Whether the InnoDB adaptive hash index is enabled or disabled. It may be desirable,
         * depending on your workload, to dynamically enable or disable adaptive hash indexing to
         * improve query performance. Because the adaptive hash index may not be useful for all
         * workloads, conduct benchmarks with it both enabled and disabled, using realistic
         * workloads.
         *
         * <p>innodbAdaptiveHashIndex corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_adaptive_hash_index]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_adaptive_hash_index).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbAdaptiveHashIndex")
        private Boolean innodbAdaptiveHashIndex;

        /**
         * Whether the InnoDB adaptive hash index is enabled or disabled. It may be desirable,
         * depending on your workload, to dynamically enable or disable adaptive hash indexing to
         * improve query performance. Because the adaptive hash index may not be useful for all
         * workloads, conduct benchmarks with it both enabled and disabled, using realistic
         * workloads.
         *
         * <p>innodbAdaptiveHashIndex corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_adaptive_hash_index]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_adaptive_hash_index).
         *
         * @param innodbAdaptiveHashIndex the value to set
         * @return this builder
         */
        public Builder innodbAdaptiveHashIndex(Boolean innodbAdaptiveHashIndex) {
            this.innodbAdaptiveHashIndex = innodbAdaptiveHashIndex;
            this.__explicitlySet__.add("innodbAdaptiveHashIndex");
            return this;
        }
        /**
         * When enabled, undo tablespaces that exceed the threshold value defined by
         * innodb_max_undo_log_size are marked for truncation. Only undo tablespaces can be
         * truncated. Truncating undo logs that reside in the system tablespace is not supported.
         * For truncation to occur, there must be at least two undo tablespaces.
         *
         * <p>innodbUndoLogTruncate corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_undo_log_truncate]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_undo_log_truncate).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbUndoLogTruncate")
        private Boolean innodbUndoLogTruncate;

        /**
         * When enabled, undo tablespaces that exceed the threshold value defined by
         * innodb_max_undo_log_size are marked for truncation. Only undo tablespaces can be
         * truncated. Truncating undo logs that reside in the system tablespace is not supported.
         * For truncation to occur, there must be at least two undo tablespaces.
         *
         * <p>innodbUndoLogTruncate corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_undo_log_truncate]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_undo_log_truncate).
         *
         * @param innodbUndoLogTruncate the value to set
         * @return this builder
         */
        public Builder innodbUndoLogTruncate(Boolean innodbUndoLogTruncate) {
            this.innodbUndoLogTruncate = innodbUndoLogTruncate;
            this.__explicitlySet__.add("innodbUndoLogTruncate");
            return this;
        }
        /**
         * The number of table definitions that can be stored in the table definition cache. If you
         * use a large number of tables, you can create a large table definition cache to speed up
         * opening of tables. The table definition cache takes less space and does not use file
         * descriptors, unlike the normal table cache.
         *
         * <p>table_definition_cache corresponds to the MySQL Server Administration system variable
         * [table_definition_cache](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_table_definition_cache)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tableDefinitionCache")
        private Integer tableDefinitionCache;

        /**
         * The number of table definitions that can be stored in the table definition cache. If you
         * use a large number of tables, you can create a large table definition cache to speed up
         * opening of tables. The table definition cache takes less space and does not use file
         * descriptors, unlike the normal table cache.
         *
         * <p>table_definition_cache corresponds to the MySQL Server Administration system variable
         * [table_definition_cache](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_table_definition_cache)
         *
         * @param tableDefinitionCache the value to set
         * @return this builder
         */
        public Builder tableDefinitionCache(Integer tableDefinitionCache) {
            this.tableDefinitionCache = tableDefinitionCache;
            this.__explicitlySet__.add("tableDefinitionCache");
            return this;
        }
        /**
         * The number of open tables for all threads. Increasing this value increases the number of
         * file descriptors that mysqld requires.
         *
         * <p>table_open_cache corresponds to the MySQL Server Administration system variable
         * [table_open_cache](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_table_open_cache)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tableOpenCache")
        private Integer tableOpenCache;

        /**
         * The number of open tables for all threads. Increasing this value increases the number of
         * file descriptors that mysqld requires.
         *
         * <p>table_open_cache corresponds to the MySQL Server Administration system variable
         * [table_open_cache](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_table_open_cache)
         *
         * @param tableOpenCache the value to set
         * @return this builder
         */
        public Builder tableOpenCache(Integer tableOpenCache) {
            this.tableOpenCache = tableOpenCache;
            this.__explicitlySet__.add("tableOpenCache");
            return this;
        }
        /**
         * The maximum amount of space to use for all relay logs.
         *
         * <p>relayLogSpaceLimit corresponds to the MySQL Replica Server Options variable
         * [relay_log_space_limit]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_relay_log_space_limit).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("relayLogSpaceLimit")
        private Long relayLogSpaceLimit;

        /**
         * The maximum amount of space to use for all relay logs.
         *
         * <p>relayLogSpaceLimit corresponds to the MySQL Replica Server Options variable
         * [relay_log_space_limit]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_relay_log_space_limit).
         *
         * @param relayLogSpaceLimit the value to set
         * @return this builder
         */
        public Builder relayLogSpaceLimit(Long relayLogSpaceLimit) {
            this.relayLogSpaceLimit = relayLogSpaceLimit;
            this.__explicitlySet__.add("relayLogSpaceLimit");
            return this;
        }
        /**
         * The optimizer_switch system variable enables control over optimizer behavior. The value
         * of this variable is a set of flags, each of which has a value of on or off to indicate
         * whether the corresponding optimizer behavior is enabled or disabled. This variable has
         * global and session values and can be changed at runtime. The global default can be set at
         * server startup.
         *
         * <p>Setting hypergraph_optimizer=on for cloud builds below 9.0.0 will fail.
         *
         * <p>optimizerSwitch corresponds to the MySQL Server System variable [optimizer_switch]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_optimizer_switch).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("optimizerSwitch")
        private String optimizerSwitch;

        /**
         * The optimizer_switch system variable enables control over optimizer behavior. The value
         * of this variable is a set of flags, each of which has a value of on or off to indicate
         * whether the corresponding optimizer behavior is enabled or disabled. This variable has
         * global and session values and can be changed at runtime. The global default can be set at
         * server startup.
         *
         * <p>Setting hypergraph_optimizer=on for cloud builds below 9.0.0 will fail.
         *
         * <p>optimizerSwitch corresponds to the MySQL Server System variable [optimizer_switch]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_optimizer_switch).
         *
         * @param optimizerSwitch the value to set
         * @return this builder
         */
        public Builder optimizerSwitch(String optimizerSwitch) {
            this.optimizerSwitch = optimizerSwitch;
            this.__explicitlySet__.add("optimizerSwitch");
            return this;
        }
        /**
         * From MySQL 8.0.26, use replica_type_conversions in place of slave_type_conversions, which
         * is deprecated from that release. In releases before MySQL 8.0.26, use
         * slave_type_conversions.
         *
         * <p>replica_type_conversions controls the type conversion mode in effect on the replica
         * when using row-based replication. Its value is a comma-delimited set of zero or more
         * elements from the list: ALL_LOSSY, ALL_NON_LOSSY, ALL_SIGNED, ALL_UNSIGNED. Set this
         * variable to an empty string to disallow type conversions between the source and the
         * replica. Setting this variable takes effect for all replication channels immediately,
         * including running channels.
         *
         * <p>replica_type_conversions corresponds to the MySQL Replica Server Options variable
         * [replica_type_conversions]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_type_conversions).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaTypeConversions")
        private String replicaTypeConversions;

        /**
         * From MySQL 8.0.26, use replica_type_conversions in place of slave_type_conversions, which
         * is deprecated from that release. In releases before MySQL 8.0.26, use
         * slave_type_conversions.
         *
         * <p>replica_type_conversions controls the type conversion mode in effect on the replica
         * when using row-based replication. Its value is a comma-delimited set of zero or more
         * elements from the list: ALL_LOSSY, ALL_NON_LOSSY, ALL_SIGNED, ALL_UNSIGNED. Set this
         * variable to an empty string to disallow type conversions between the source and the
         * replica. Setting this variable takes effect for all replication channels immediately,
         * including running channels.
         *
         * <p>replica_type_conversions corresponds to the MySQL Replica Server Options variable
         * [replica_type_conversions]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_type_conversions).
         *
         * @param replicaTypeConversions the value to set
         * @return this builder
         */
        public Builder replicaTypeConversions(String replicaTypeConversions) {
            this.replicaTypeConversions = replicaTypeConversions;
            this.__explicitlySet__.add("replicaTypeConversions");
            return this;
        }
        /**
         * Beginning with MySQL 8.0.26, slave_parallel_workers is deprecated, and you should use
         * replica_parallel_workers instead. (Prior to MySQL 8.0.26, you must use
         * slave_parallel_workers to set the number of applier threads.)
         *
         * <p>replicaParallelWorkers corresponds to the MySQL Replica Server Options variable
         * [replica_parallel_workers]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_parallel_workers).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaParallelWorkers")
        private Integer replicaParallelWorkers;

        /**
         * Beginning with MySQL 8.0.26, slave_parallel_workers is deprecated, and you should use
         * replica_parallel_workers instead. (Prior to MySQL 8.0.26, you must use
         * slave_parallel_workers to set the number of applier threads.)
         *
         * <p>replicaParallelWorkers corresponds to the MySQL Replica Server Options variable
         * [replica_parallel_workers]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_parallel_workers).
         *
         * @param replicaParallelWorkers the value to set
         * @return this builder
         */
        public Builder replicaParallelWorkers(Integer replicaParallelWorkers) {
            this.replicaParallelWorkers = replicaParallelWorkers;
            this.__explicitlySet__.add("replicaParallelWorkers");
            return this;
        }
        /**
         * Whether to resolve host names when checking client connections. If this variable is OFF,
         * mysqld resolves host names when checking client connections. If it is ON, mysqld uses
         * only IP numbers; in this case, all Host column values in the grant tables must be IP
         * addresses. See Section 7.1.12.3, \u201CDNS Lookups and the Host Cache\u201D.
         *
         * <p>skipNameResolve corresponds to the MySQL Server System variable [skip_name_resolve]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_skip_name_resolve).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skipNameResolve")
        private Boolean skipNameResolve;

        /**
         * Whether to resolve host names when checking client connections. If this variable is OFF,
         * mysqld resolves host names when checking client connections. If it is ON, mysqld uses
         * only IP numbers; in this case, all Host column values in the grant tables must be IP
         * addresses. See Section 7.1.12.3, \u201CDNS Lookups and the Host Cache\u201D.
         *
         * <p>skipNameResolve corresponds to the MySQL Server System variable [skip_name_resolve]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_skip_name_resolve).
         *
         * @param skipNameResolve the value to set
         * @return this builder
         */
        public Builder skipNameResolve(Boolean skipNameResolve) {
            this.skipNameResolve = skipNameResolve;
            this.__explicitlySet__.add("skipNameResolve");
            return this;
        }
        /**
         * The maximum number of simultaneous connections permitted to any given MySQL user account.
         * A value of 0 (the default) means \u201Cno limit.\u201D This variable has a global value
         * that can be set at server startup or runtime. It also has a read-only session value that
         * indicates the effective simultaneous-connection limit that applies to the account
         * associated with the current session.
         *
         * <p>maxUserConnections corresponds to the MySQL Server System variable
         * [max_user_connections]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_user_connections).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxUserConnections")
        private Long maxUserConnections;

        /**
         * The maximum number of simultaneous connections permitted to any given MySQL user account.
         * A value of 0 (the default) means \u201Cno limit.\u201D This variable has a global value
         * that can be set at server startup or runtime. It also has a read-only session value that
         * indicates the effective simultaneous-connection limit that applies to the account
         * associated with the current session.
         *
         * <p>maxUserConnections corresponds to the MySQL Server System variable
         * [max_user_connections]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_user_connections).
         *
         * @param maxUserConnections the value to set
         * @return this builder
         */
        public Builder maxUserConnections(Long maxUserConnections) {
            this.maxUserConnections = maxUserConnections;
            this.__explicitlySet__.add("maxUserConnections");
            return this;
        }
        /**
         * The minimum size of the buffer that is used for plain index scans, range index scans, and
         * joins that do not use indexes and thus perform full table scans. In MySQL 8.0.18 and
         * later, this variable also controls the amount of memory used for hash joins. Normally,
         * the best way to get fast joins is to add indexes. Increase the value of join_buffer_size
         * to get a faster full join when adding indexes is not possible. One join buffer is
         * allocated for each full join between two tables. For a complex join between several
         * tables for which indexes are not used, multiple join buffers might be necessary.
         *
         * <p>joinBufferSize corresponds to the MySQL Server System variable [join_buffer_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_join_buffer_size).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("joinBufferSize")
        private Long joinBufferSize;

        /**
         * The minimum size of the buffer that is used for plain index scans, range index scans, and
         * joins that do not use indexes and thus perform full table scans. In MySQL 8.0.18 and
         * later, this variable also controls the amount of memory used for hash joins. Normally,
         * the best way to get fast joins is to add indexes. Increase the value of join_buffer_size
         * to get a faster full join when adding indexes is not possible. One join buffer is
         * allocated for each full join between two tables. For a complex join between several
         * tables for which indexes are not used, multiple join buffers might be necessary.
         *
         * <p>joinBufferSize corresponds to the MySQL Server System variable [join_buffer_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_join_buffer_size).
         *
         * @param joinBufferSize the value to set
         * @return this builder
         */
        public Builder joinBufferSize(Long joinBufferSize) {
            this.joinBufferSize = joinBufferSize;
            this.__explicitlySet__.add("joinBufferSize");
            return this;
        }
        /**
         * Limit the assumed maximum number of seeks when looking up rows based on a key. The MySQL
         * optimizer assumes that no more than this number of key seeks are required when searching
         * for matching rows in a table by scanning an index, regardless of the actual cardinality
         * of the index (see Section 15.7.7.22, \u201CSHOW INDEX Statement\u201D). By setting this
         * to a low value (say, 100), you can force MySQL to prefer indexes instead of table scans.
         *
         * <p>maxSeeksForKey corresponds to the MySQL Server System variable [max_seeks_for_key]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_seeks_for_key).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSeeksForKey")
        private Long maxSeeksForKey;

        /**
         * Limit the assumed maximum number of seeks when looking up rows based on a key. The MySQL
         * optimizer assumes that no more than this number of key seeks are required when searching
         * for matching rows in a table by scanning an index, regardless of the actual cardinality
         * of the index (see Section 15.7.7.22, \u201CSHOW INDEX Statement\u201D). By setting this
         * to a low value (say, 100), you can force MySQL to prefer indexes instead of table scans.
         *
         * <p>maxSeeksForKey corresponds to the MySQL Server System variable [max_seeks_for_key]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_seeks_for_key).
         *
         * @param maxSeeksForKey the value to set
         * @return this builder
         */
        public Builder maxSeeksForKey(Long maxSeeksForKey) {
            this.maxSeeksForKey = maxSeeksForKey;
            this.__explicitlySet__.add("maxSeeksForKey");
            return this;
        }
        /**
         * The limit on memory consumption for the range optimizer. A value of 0 means \u201Cno
         * limit.\u201D If an execution plan considered by the optimizer uses the range access
         * method but the optimizer estimates that the amount of memory needed for this method would
         * exceed the limit, it abandons the plan and considers other plans.
         *
         * <p>rangeOptimizerMaxMemSize corresponds to the MySQL Server System variable
         * [range_optimizer_max_mem_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_range_optimizer_max_mem_size).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeOptimizerMaxMemSize")
        private Long rangeOptimizerMaxMemSize;

        /**
         * The limit on memory consumption for the range optimizer. A value of 0 means \u201Cno
         * limit.\u201D If an execution plan considered by the optimizer uses the range access
         * method but the optimizer estimates that the amount of memory needed for this method would
         * exceed the limit, it abandons the plan and considers other plans.
         *
         * <p>rangeOptimizerMaxMemSize corresponds to the MySQL Server System variable
         * [range_optimizer_max_mem_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_range_optimizer_max_mem_size).
         *
         * @param rangeOptimizerMaxMemSize the value to set
         * @return this builder
         */
        public Builder rangeOptimizerMaxMemSize(Long rangeOptimizerMaxMemSize) {
            this.rangeOptimizerMaxMemSize = rangeOptimizerMaxMemSize;
            this.__explicitlySet__.add("rangeOptimizerMaxMemSize");
            return this;
        }
        /**
         * auto_increment_increment and auto_increment_offset are intended for use with circular
         * (source-to-source) replication, and can be used to control the operation of
         * AUTO_INCREMENT columns. Both variables have global and session values, and each can
         * assume an integer value between 1 and 65,535 inclusive.
         *
         * <p>autoIncrementIncrement corresponds to the MySQL Replication Source Options variable
         * [auto_increment_increment]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-source.html#sysvar_auto_increment_increment).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoIncrementIncrement")
        private Integer autoIncrementIncrement;

        /**
         * auto_increment_increment and auto_increment_offset are intended for use with circular
         * (source-to-source) replication, and can be used to control the operation of
         * AUTO_INCREMENT columns. Both variables have global and session values, and each can
         * assume an integer value between 1 and 65,535 inclusive.
         *
         * <p>autoIncrementIncrement corresponds to the MySQL Replication Source Options variable
         * [auto_increment_increment]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-source.html#sysvar_auto_increment_increment).
         *
         * @param autoIncrementIncrement the value to set
         * @return this builder
         */
        public Builder autoIncrementIncrement(Integer autoIncrementIncrement) {
            this.autoIncrementIncrement = autoIncrementIncrement;
            this.__explicitlySet__.add("autoIncrementIncrement");
            return this;
        }
        /**
         * This variable has a default value of 1. If it is left with its default value, and Group
         * Replication is started on the server in multi-primary mode, it is changed to the server
         * ID.
         *
         * <p>autoIncrementOffset corresponds to the MySQL Replication Source Options variable
         * [auto_increment_offset]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-source.html#sysvar_auto_increment_offset).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoIncrementOffset")
        private Integer autoIncrementOffset;

        /**
         * This variable has a default value of 1. If it is left with its default value, and Group
         * Replication is started on the server in multi-primary mode, it is changed to the server
         * ID.
         *
         * <p>autoIncrementOffset corresponds to the MySQL Replication Source Options variable
         * [auto_increment_offset]
         * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-source.html#sysvar_auto_increment_offset).
         *
         * @param autoIncrementOffset the value to set
         * @return this builder
         */
        public Builder autoIncrementOffset(Integer autoIncrementOffset) {
            this.autoIncrementOffset = autoIncrementOffset;
            this.__explicitlySet__.add("autoIncrementOffset");
            return this;
        }
        /**
         * The lock mode to use for generating auto-increment values. Permissible values are 0, 1,
         * or 2, for traditional, consecutive, or interleaved, respectively.
         *
         * <p>innodbAutoincLockMode corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_autoinc_lock_mode]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_autoinc_lock_mode).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbAutoincLockMode")
        private Integer innodbAutoincLockMode;

        /**
         * The lock mode to use for generating auto-increment values. Permissible values are 0, 1,
         * or 2, for traditional, consecutive, or interleaved, respectively.
         *
         * <p>innodbAutoincLockMode corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_autoinc_lock_mode]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_autoinc_lock_mode).
         *
         * @param innodbAutoincLockMode the value to set
         * @return this builder
         */
        public Builder innodbAutoincLockMode(Integer innodbAutoincLockMode) {
            this.innodbAutoincLockMode = innodbAutoincLockMode;
            this.__explicitlySet__.add("innodbAutoincLockMode");
            return this;
        }
        /**
         * InnoDB rolls back only the last statement on a transaction timeout by default. If
         * --innodb-rollback-on-timeout is specified, a transaction timeout causes InnoDB to abort
         * and roll back the entire transaction.
         *
         * <p>innodbRollbackOnTimeout corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_rollback_on_timeout]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_rollback_on_timeout).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbRollbackOnTimeout")
        private Boolean innodbRollbackOnTimeout;

        /**
         * InnoDB rolls back only the last statement on a transaction timeout by default. If
         * --innodb-rollback-on-timeout is specified, a transaction timeout causes InnoDB to abort
         * and roll back the entire transaction.
         *
         * <p>innodbRollbackOnTimeout corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_rollback_on_timeout]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_rollback_on_timeout).
         *
         * @param innodbRollbackOnTimeout the value to set
         * @return this builder
         */
        public Builder innodbRollbackOnTimeout(Boolean innodbRollbackOnTimeout) {
            this.innodbRollbackOnTimeout = innodbRollbackOnTimeout;
            this.__explicitlySet__.add("innodbRollbackOnTimeout");
            return this;
        }
        /**
         * Specifies an upper limit in bytes on the size of the temporary log files used during
         * online DDL operations for InnoDB tables. There is one such log file for each index being
         * created or table being altered. This log file stores data inserted, updated, or deleted
         * in the table during the DDL operation.
         *
         * <p>innodbOnlineAlterLogMaxSize corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_online_alter_log_max_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_online_alter_log_max_size).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbOnlineAlterLogMaxSize")
        private Long innodbOnlineAlterLogMaxSize;

        /**
         * Specifies an upper limit in bytes on the size of the temporary log files used during
         * online DDL operations for InnoDB tables. There is one such log file for each index being
         * created or table being altered. This log file stores data inserted, updated, or deleted
         * in the table during the DDL operation.
         *
         * <p>innodbOnlineAlterLogMaxSize corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_online_alter_log_max_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_online_alter_log_max_size).
         *
         * @param innodbOnlineAlterLogMaxSize the value to set
         * @return this builder
         */
        public Builder innodbOnlineAlterLogMaxSize(Long innodbOnlineAlterLogMaxSize) {
            this.innodbOnlineAlterLogMaxSize = innodbOnlineAlterLogMaxSize;
            this.__explicitlySet__.add("innodbOnlineAlterLogMaxSize");
            return this;
        }
        /**
         * This variable defines:
         *
         * <p>The sort buffer size for online DDL operations that create or rebuild secondary
         * indexes. However, as of MySQL 8.0.27, this responsibility is subsumed by the
         * innodb_ddl_buffer_size variable.
         *
         * <p>The amount by which the temporary log file is extended when recording concurrent DML
         * during an online DDL operation, and the size of the temporary log file read buffer and
         * write buffer.
         *
         * <p>innodbSortBufferSize corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_sort_buffer_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_sort_buffer_size).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbSortBufferSize")
        private Integer innodbSortBufferSize;

        /**
         * This variable defines:
         *
         * <p>The sort buffer size for online DDL operations that create or rebuild secondary
         * indexes. However, as of MySQL 8.0.27, this responsibility is subsumed by the
         * innodb_ddl_buffer_size variable.
         *
         * <p>The amount by which the temporary log file is extended when recording concurrent DML
         * during an online DDL operation, and the size of the temporary log file read buffer and
         * write buffer.
         *
         * <p>innodbSortBufferSize corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_sort_buffer_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_sort_buffer_size).
         *
         * @param innodbSortBufferSize the value to set
         * @return this builder
         */
        public Builder innodbSortBufferSize(Integer innodbSortBufferSize) {
            this.innodbSortBufferSize = innodbSortBufferSize;
            this.__explicitlySet__.add("innodbSortBufferSize");
            return this;
        }
        /**
         * Enables the NUMA interleave memory policy for allocation of the InnoDB buffer pool. When
         * innodb_numa_interleave is enabled, the NUMA memory policy is set to MPOL_INTERLEAVE for
         * the mysqld process. After the InnoDB buffer pool is allocated, the NUMA memory policy is
         * set back to MPOL_DEFAULT. For the innodb_numa_interleave option to be available, MySQL
         * must be compiled on a NUMA-enabled Linux system.
         *
         * <p>innodbNumaInterleave corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_numa_interleave]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_numa_interleave).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("innodbNumaInterleave")
        private Boolean innodbNumaInterleave;

        /**
         * Enables the NUMA interleave memory policy for allocation of the InnoDB buffer pool. When
         * innodb_numa_interleave is enabled, the NUMA memory policy is set to MPOL_INTERLEAVE for
         * the mysqld process. After the InnoDB buffer pool is allocated, the NUMA memory policy is
         * set back to MPOL_DEFAULT. For the innodb_numa_interleave option to be available, MySQL
         * must be compiled on a NUMA-enabled Linux system.
         *
         * <p>innodbNumaInterleave corresponds to the MySQL InnoDB Startup Options and System
         * Variables [innodb_numa_interleave]
         * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_numa_interleave).
         *
         * @param innodbNumaInterleave the value to set
         * @return this builder
         */
        public Builder innodbNumaInterleave(Boolean innodbNumaInterleave) {
            this.innodbNumaInterleave = innodbNumaInterleave;
            this.__explicitlySet__.add("innodbNumaInterleave");
            return this;
        }
        /**
         * The number of thread groups in the thread pool. This is the most important parameter
         * controlling thread pool performance. It affects how many statements can execute
         * simultaneously. If a value outside the range of permissible values is specified, the
         * thread pool plugin does not load and the server writes a message to the error log.
         *
         * <p>threadPoolSize corresponds to the MySQL Server System variable [thread_pool_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_size).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threadPoolSize")
        private Integer threadPoolSize;

        /**
         * The number of thread groups in the thread pool. This is the most important parameter
         * controlling thread pool performance. It affects how many statements can execute
         * simultaneously. If a value outside the range of permissible values is specified, the
         * thread pool plugin does not load and the server writes a message to the error log.
         *
         * <p>threadPoolSize corresponds to the MySQL Server System variable [thread_pool_size]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_size).
         *
         * @param threadPoolSize the value to set
         * @return this builder
         */
        public Builder threadPoolSize(Integer threadPoolSize) {
            this.threadPoolSize = threadPoolSize;
            this.__explicitlySet__.add("threadPoolSize");
            return this;
        }
        /**
         * If a query takes longer than this many seconds, the server increments the Slow_queries
         * status variable. If the slow query log is enabled, the query is logged to the slow query
         * log file. This value is measured in real time, not CPU time, so a query that is under the
         * threshold on a lightly loaded system might be above the threshold on a heavily loaded
         * one.
         *
         * <p>longQueryTime corresponds to the MySQL Server System variable [long_query_time]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_long_query_time).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("longQueryTime")
        private Integer longQueryTime;

        /**
         * If a query takes longer than this many seconds, the server increments the Slow_queries
         * status variable. If the slow query log is enabled, the query is logged to the slow query
         * log file. This value is measured in real time, not CPU time, so a query that is under the
         * threshold on a lightly loaded system might be above the threshold on a heavily loaded
         * one.
         *
         * <p>longQueryTime corresponds to the MySQL Server System variable [long_query_time]
         * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_long_query_time).
         *
         * @param longQueryTime the value to set
         * @return this builder
         */
        public Builder longQueryTime(Integer longQueryTime) {
            this.longQueryTime = longQueryTime;
            this.__explicitlySet__.add("longQueryTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationVariables build() {
            ConfigurationVariables model =
                    new ConfigurationVariables(
                            this.completionType,
                            this.bigTables,
                            this.characterSetServer,
                            this.collationServer,
                            this.connectionMemoryChunkSize,
                            this.connectionMemoryLimit,
                            this.defaultAuthenticationPlugin,
                            this.globalConnectionMemoryLimit,
                            this.globalConnectionMemoryTracking,
                            this.transactionIsolation,
                            this.innodbFtServerStopwordTable,
                            this.mandatoryRoles,
                            this.autocommit,
                            this.foreignKeyChecks,
                            this.groupReplicationConsistency,
                            this.groupConcatMaxLen,
                            this.innodbFtEnableStopword,
                            this.innodbLogWriterThreads,
                            this.localInfile,
                            this.mysqlFirewallMode,
                            this.mysqlxEnableHelloNotice,
                            this.sqlRequirePrimaryKey,
                            this.sqlWarnings,
                            this.binlogExpireLogsSeconds,
                            this.binlogRowMetadata,
                            this.binlogRowValueOptions,
                            this.binlogTransactionCompression,
                            this.innodbBufferPoolSize,
                            this.innodbFtResultCacheLimit,
                            this.maxBinlogCacheSize,
                            this.maxConnectErrors,
                            this.maxHeapTableSize,
                            this.maxConnections,
                            this.maxPreparedStmtCount,
                            this.connectTimeout,
                            this.cteMaxRecursionDepth,
                            this.generatedRandomPasswordLength,
                            this.informationSchemaStatsExpiry,
                            this.innodbBufferPoolDumpPct,
                            this.innodbBufferPoolInstances,
                            this.innodbDdlBufferSize,
                            this.innodbDdlThreads,
                            this.innodbFtMaxTokenSize,
                            this.innodbFtMinTokenSize,
                            this.innodbFtNumWordOptimize,
                            this.innodbLockWaitTimeout,
                            this.innodbMaxPurgeLag,
                            this.innodbMaxPurgeLagDelay,
                            this.interactiveTimeout,
                            this.innodbStatsPersistentSamplePages,
                            this.innodbStatsTransientSamplePages,
                            this.innodbStrictMode,
                            this.maxAllowedPacket,
                            this.maxExecutionTime,
                            this.mysqlxConnectTimeout,
                            this.mysqlxDocumentIdUniquePrefix,
                            this.mysqlxIdleWorkerThreadTimeout,
                            this.mysqlxInteractiveTimeout,
                            this.mysqlxMaxAllowedPacket,
                            this.mysqlxMinWorkerThreads,
                            this.mysqlxReadTimeout,
                            this.mysqlxWaitTimeout,
                            this.mysqlxWriteTimeout,
                            this.netReadTimeout,
                            this.netWriteTimeout,
                            this.parserMaxMemSize,
                            this.queryAllocBlockSize,
                            this.queryPreallocSize,
                            this.regexpTimeLimit,
                            this.sqlMode,
                            this.tmpTableSize,
                            this.mysqlxDeflateDefaultCompressionLevel,
                            this.mysqlxDeflateMaxClientCompressionLevel,
                            this.mysqlxLz4MaxClientCompressionLevel,
                            this.mysqlxLz4DefaultCompressionLevel,
                            this.mysqlxZstdMaxClientCompressionLevel,
                            this.mysqlxZstdDefaultCompressionLevel,
                            this.mysqlZstdDefaultCompressionLevel,
                            this.sortBufferSize,
                            this.waitTimeout,
                            this.threadPoolDedicatedListeners,
                            this.threadPoolMaxTransactionsLimit,
                            this.timeZone,
                            this.blockEncryptionMode,
                            this.binlogGroupCommitSyncDelay,
                            this.binlogGroupCommitSyncNoDelayCount,
                            this.replicaNetTimeout,
                            this.requireSecureTransport,
                            this.innodbRedoLogCapacity,
                            this.threadPoolTransactionDelay,
                            this.threadPoolQueryThreadsPerGroup,
                            this.explainFormat,
                            this.explicitDefaultsForTimestamp,
                            this.sqlGenerateInvisiblePrimaryKey,
                            this.temptableMaxRam,
                            this.innodbChangeBuffering,
                            this.innodbAdaptiveHashIndex,
                            this.innodbUndoLogTruncate,
                            this.tableDefinitionCache,
                            this.tableOpenCache,
                            this.relayLogSpaceLimit,
                            this.optimizerSwitch,
                            this.replicaTypeConversions,
                            this.replicaParallelWorkers,
                            this.skipNameResolve,
                            this.maxUserConnections,
                            this.joinBufferSize,
                            this.maxSeeksForKey,
                            this.rangeOptimizerMaxMemSize,
                            this.autoIncrementIncrement,
                            this.autoIncrementOffset,
                            this.innodbAutoincLockMode,
                            this.innodbRollbackOnTimeout,
                            this.innodbOnlineAlterLogMaxSize,
                            this.innodbSortBufferSize,
                            this.innodbNumaInterleave,
                            this.threadPoolSize,
                            this.longQueryTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationVariables model) {
            if (model.wasPropertyExplicitlySet("completionType")) {
                this.completionType(model.getCompletionType());
            }
            if (model.wasPropertyExplicitlySet("bigTables")) {
                this.bigTables(model.getBigTables());
            }
            if (model.wasPropertyExplicitlySet("characterSetServer")) {
                this.characterSetServer(model.getCharacterSetServer());
            }
            if (model.wasPropertyExplicitlySet("collationServer")) {
                this.collationServer(model.getCollationServer());
            }
            if (model.wasPropertyExplicitlySet("connectionMemoryChunkSize")) {
                this.connectionMemoryChunkSize(model.getConnectionMemoryChunkSize());
            }
            if (model.wasPropertyExplicitlySet("connectionMemoryLimit")) {
                this.connectionMemoryLimit(model.getConnectionMemoryLimit());
            }
            if (model.wasPropertyExplicitlySet("defaultAuthenticationPlugin")) {
                this.defaultAuthenticationPlugin(model.getDefaultAuthenticationPlugin());
            }
            if (model.wasPropertyExplicitlySet("globalConnectionMemoryLimit")) {
                this.globalConnectionMemoryLimit(model.getGlobalConnectionMemoryLimit());
            }
            if (model.wasPropertyExplicitlySet("globalConnectionMemoryTracking")) {
                this.globalConnectionMemoryTracking(model.getGlobalConnectionMemoryTracking());
            }
            if (model.wasPropertyExplicitlySet("transactionIsolation")) {
                this.transactionIsolation(model.getTransactionIsolation());
            }
            if (model.wasPropertyExplicitlySet("innodbFtServerStopwordTable")) {
                this.innodbFtServerStopwordTable(model.getInnodbFtServerStopwordTable());
            }
            if (model.wasPropertyExplicitlySet("mandatoryRoles")) {
                this.mandatoryRoles(model.getMandatoryRoles());
            }
            if (model.wasPropertyExplicitlySet("autocommit")) {
                this.autocommit(model.getAutocommit());
            }
            if (model.wasPropertyExplicitlySet("foreignKeyChecks")) {
                this.foreignKeyChecks(model.getForeignKeyChecks());
            }
            if (model.wasPropertyExplicitlySet("groupReplicationConsistency")) {
                this.groupReplicationConsistency(model.getGroupReplicationConsistency());
            }
            if (model.wasPropertyExplicitlySet("groupConcatMaxLen")) {
                this.groupConcatMaxLen(model.getGroupConcatMaxLen());
            }
            if (model.wasPropertyExplicitlySet("innodbFtEnableStopword")) {
                this.innodbFtEnableStopword(model.getInnodbFtEnableStopword());
            }
            if (model.wasPropertyExplicitlySet("innodbLogWriterThreads")) {
                this.innodbLogWriterThreads(model.getInnodbLogWriterThreads());
            }
            if (model.wasPropertyExplicitlySet("localInfile")) {
                this.localInfile(model.getLocalInfile());
            }
            if (model.wasPropertyExplicitlySet("mysqlFirewallMode")) {
                this.mysqlFirewallMode(model.getMysqlFirewallMode());
            }
            if (model.wasPropertyExplicitlySet("mysqlxEnableHelloNotice")) {
                this.mysqlxEnableHelloNotice(model.getMysqlxEnableHelloNotice());
            }
            if (model.wasPropertyExplicitlySet("sqlRequirePrimaryKey")) {
                this.sqlRequirePrimaryKey(model.getSqlRequirePrimaryKey());
            }
            if (model.wasPropertyExplicitlySet("sqlWarnings")) {
                this.sqlWarnings(model.getSqlWarnings());
            }
            if (model.wasPropertyExplicitlySet("binlogExpireLogsSeconds")) {
                this.binlogExpireLogsSeconds(model.getBinlogExpireLogsSeconds());
            }
            if (model.wasPropertyExplicitlySet("binlogRowMetadata")) {
                this.binlogRowMetadata(model.getBinlogRowMetadata());
            }
            if (model.wasPropertyExplicitlySet("binlogRowValueOptions")) {
                this.binlogRowValueOptions(model.getBinlogRowValueOptions());
            }
            if (model.wasPropertyExplicitlySet("binlogTransactionCompression")) {
                this.binlogTransactionCompression(model.getBinlogTransactionCompression());
            }
            if (model.wasPropertyExplicitlySet("innodbBufferPoolSize")) {
                this.innodbBufferPoolSize(model.getInnodbBufferPoolSize());
            }
            if (model.wasPropertyExplicitlySet("innodbFtResultCacheLimit")) {
                this.innodbFtResultCacheLimit(model.getInnodbFtResultCacheLimit());
            }
            if (model.wasPropertyExplicitlySet("maxBinlogCacheSize")) {
                this.maxBinlogCacheSize(model.getMaxBinlogCacheSize());
            }
            if (model.wasPropertyExplicitlySet("maxConnectErrors")) {
                this.maxConnectErrors(model.getMaxConnectErrors());
            }
            if (model.wasPropertyExplicitlySet("maxHeapTableSize")) {
                this.maxHeapTableSize(model.getMaxHeapTableSize());
            }
            if (model.wasPropertyExplicitlySet("maxConnections")) {
                this.maxConnections(model.getMaxConnections());
            }
            if (model.wasPropertyExplicitlySet("maxPreparedStmtCount")) {
                this.maxPreparedStmtCount(model.getMaxPreparedStmtCount());
            }
            if (model.wasPropertyExplicitlySet("connectTimeout")) {
                this.connectTimeout(model.getConnectTimeout());
            }
            if (model.wasPropertyExplicitlySet("cteMaxRecursionDepth")) {
                this.cteMaxRecursionDepth(model.getCteMaxRecursionDepth());
            }
            if (model.wasPropertyExplicitlySet("generatedRandomPasswordLength")) {
                this.generatedRandomPasswordLength(model.getGeneratedRandomPasswordLength());
            }
            if (model.wasPropertyExplicitlySet("informationSchemaStatsExpiry")) {
                this.informationSchemaStatsExpiry(model.getInformationSchemaStatsExpiry());
            }
            if (model.wasPropertyExplicitlySet("innodbBufferPoolDumpPct")) {
                this.innodbBufferPoolDumpPct(model.getInnodbBufferPoolDumpPct());
            }
            if (model.wasPropertyExplicitlySet("innodbBufferPoolInstances")) {
                this.innodbBufferPoolInstances(model.getInnodbBufferPoolInstances());
            }
            if (model.wasPropertyExplicitlySet("innodbDdlBufferSize")) {
                this.innodbDdlBufferSize(model.getInnodbDdlBufferSize());
            }
            if (model.wasPropertyExplicitlySet("innodbDdlThreads")) {
                this.innodbDdlThreads(model.getInnodbDdlThreads());
            }
            if (model.wasPropertyExplicitlySet("innodbFtMaxTokenSize")) {
                this.innodbFtMaxTokenSize(model.getInnodbFtMaxTokenSize());
            }
            if (model.wasPropertyExplicitlySet("innodbFtMinTokenSize")) {
                this.innodbFtMinTokenSize(model.getInnodbFtMinTokenSize());
            }
            if (model.wasPropertyExplicitlySet("innodbFtNumWordOptimize")) {
                this.innodbFtNumWordOptimize(model.getInnodbFtNumWordOptimize());
            }
            if (model.wasPropertyExplicitlySet("innodbLockWaitTimeout")) {
                this.innodbLockWaitTimeout(model.getInnodbLockWaitTimeout());
            }
            if (model.wasPropertyExplicitlySet("innodbMaxPurgeLag")) {
                this.innodbMaxPurgeLag(model.getInnodbMaxPurgeLag());
            }
            if (model.wasPropertyExplicitlySet("innodbMaxPurgeLagDelay")) {
                this.innodbMaxPurgeLagDelay(model.getInnodbMaxPurgeLagDelay());
            }
            if (model.wasPropertyExplicitlySet("interactiveTimeout")) {
                this.interactiveTimeout(model.getInteractiveTimeout());
            }
            if (model.wasPropertyExplicitlySet("innodbStatsPersistentSamplePages")) {
                this.innodbStatsPersistentSamplePages(model.getInnodbStatsPersistentSamplePages());
            }
            if (model.wasPropertyExplicitlySet("innodbStatsTransientSamplePages")) {
                this.innodbStatsTransientSamplePages(model.getInnodbStatsTransientSamplePages());
            }
            if (model.wasPropertyExplicitlySet("innodbStrictMode")) {
                this.innodbStrictMode(model.getInnodbStrictMode());
            }
            if (model.wasPropertyExplicitlySet("maxAllowedPacket")) {
                this.maxAllowedPacket(model.getMaxAllowedPacket());
            }
            if (model.wasPropertyExplicitlySet("maxExecutionTime")) {
                this.maxExecutionTime(model.getMaxExecutionTime());
            }
            if (model.wasPropertyExplicitlySet("mysqlxConnectTimeout")) {
                this.mysqlxConnectTimeout(model.getMysqlxConnectTimeout());
            }
            if (model.wasPropertyExplicitlySet("mysqlxDocumentIdUniquePrefix")) {
                this.mysqlxDocumentIdUniquePrefix(model.getMysqlxDocumentIdUniquePrefix());
            }
            if (model.wasPropertyExplicitlySet("mysqlxIdleWorkerThreadTimeout")) {
                this.mysqlxIdleWorkerThreadTimeout(model.getMysqlxIdleWorkerThreadTimeout());
            }
            if (model.wasPropertyExplicitlySet("mysqlxInteractiveTimeout")) {
                this.mysqlxInteractiveTimeout(model.getMysqlxInteractiveTimeout());
            }
            if (model.wasPropertyExplicitlySet("mysqlxMaxAllowedPacket")) {
                this.mysqlxMaxAllowedPacket(model.getMysqlxMaxAllowedPacket());
            }
            if (model.wasPropertyExplicitlySet("mysqlxMinWorkerThreads")) {
                this.mysqlxMinWorkerThreads(model.getMysqlxMinWorkerThreads());
            }
            if (model.wasPropertyExplicitlySet("mysqlxReadTimeout")) {
                this.mysqlxReadTimeout(model.getMysqlxReadTimeout());
            }
            if (model.wasPropertyExplicitlySet("mysqlxWaitTimeout")) {
                this.mysqlxWaitTimeout(model.getMysqlxWaitTimeout());
            }
            if (model.wasPropertyExplicitlySet("mysqlxWriteTimeout")) {
                this.mysqlxWriteTimeout(model.getMysqlxWriteTimeout());
            }
            if (model.wasPropertyExplicitlySet("netReadTimeout")) {
                this.netReadTimeout(model.getNetReadTimeout());
            }
            if (model.wasPropertyExplicitlySet("netWriteTimeout")) {
                this.netWriteTimeout(model.getNetWriteTimeout());
            }
            if (model.wasPropertyExplicitlySet("parserMaxMemSize")) {
                this.parserMaxMemSize(model.getParserMaxMemSize());
            }
            if (model.wasPropertyExplicitlySet("queryAllocBlockSize")) {
                this.queryAllocBlockSize(model.getQueryAllocBlockSize());
            }
            if (model.wasPropertyExplicitlySet("queryPreallocSize")) {
                this.queryPreallocSize(model.getQueryPreallocSize());
            }
            if (model.wasPropertyExplicitlySet("regexpTimeLimit")) {
                this.regexpTimeLimit(model.getRegexpTimeLimit());
            }
            if (model.wasPropertyExplicitlySet("sqlMode")) {
                this.sqlMode(model.getSqlMode());
            }
            if (model.wasPropertyExplicitlySet("tmpTableSize")) {
                this.tmpTableSize(model.getTmpTableSize());
            }
            if (model.wasPropertyExplicitlySet("mysqlxDeflateDefaultCompressionLevel")) {
                this.mysqlxDeflateDefaultCompressionLevel(
                        model.getMysqlxDeflateDefaultCompressionLevel());
            }
            if (model.wasPropertyExplicitlySet("mysqlxDeflateMaxClientCompressionLevel")) {
                this.mysqlxDeflateMaxClientCompressionLevel(
                        model.getMysqlxDeflateMaxClientCompressionLevel());
            }
            if (model.wasPropertyExplicitlySet("mysqlxLz4MaxClientCompressionLevel")) {
                this.mysqlxLz4MaxClientCompressionLevel(
                        model.getMysqlxLz4MaxClientCompressionLevel());
            }
            if (model.wasPropertyExplicitlySet("mysqlxLz4DefaultCompressionLevel")) {
                this.mysqlxLz4DefaultCompressionLevel(model.getMysqlxLz4DefaultCompressionLevel());
            }
            if (model.wasPropertyExplicitlySet("mysqlxZstdMaxClientCompressionLevel")) {
                this.mysqlxZstdMaxClientCompressionLevel(
                        model.getMysqlxZstdMaxClientCompressionLevel());
            }
            if (model.wasPropertyExplicitlySet("mysqlxZstdDefaultCompressionLevel")) {
                this.mysqlxZstdDefaultCompressionLevel(
                        model.getMysqlxZstdDefaultCompressionLevel());
            }
            if (model.wasPropertyExplicitlySet("mysqlZstdDefaultCompressionLevel")) {
                this.mysqlZstdDefaultCompressionLevel(model.getMysqlZstdDefaultCompressionLevel());
            }
            if (model.wasPropertyExplicitlySet("sortBufferSize")) {
                this.sortBufferSize(model.getSortBufferSize());
            }
            if (model.wasPropertyExplicitlySet("waitTimeout")) {
                this.waitTimeout(model.getWaitTimeout());
            }
            if (model.wasPropertyExplicitlySet("threadPoolDedicatedListeners")) {
                this.threadPoolDedicatedListeners(model.getThreadPoolDedicatedListeners());
            }
            if (model.wasPropertyExplicitlySet("threadPoolMaxTransactionsLimit")) {
                this.threadPoolMaxTransactionsLimit(model.getThreadPoolMaxTransactionsLimit());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("blockEncryptionMode")) {
                this.blockEncryptionMode(model.getBlockEncryptionMode());
            }
            if (model.wasPropertyExplicitlySet("binlogGroupCommitSyncDelay")) {
                this.binlogGroupCommitSyncDelay(model.getBinlogGroupCommitSyncDelay());
            }
            if (model.wasPropertyExplicitlySet("binlogGroupCommitSyncNoDelayCount")) {
                this.binlogGroupCommitSyncNoDelayCount(
                        model.getBinlogGroupCommitSyncNoDelayCount());
            }
            if (model.wasPropertyExplicitlySet("replicaNetTimeout")) {
                this.replicaNetTimeout(model.getReplicaNetTimeout());
            }
            if (model.wasPropertyExplicitlySet("requireSecureTransport")) {
                this.requireSecureTransport(model.getRequireSecureTransport());
            }
            if (model.wasPropertyExplicitlySet("innodbRedoLogCapacity")) {
                this.innodbRedoLogCapacity(model.getInnodbRedoLogCapacity());
            }
            if (model.wasPropertyExplicitlySet("threadPoolTransactionDelay")) {
                this.threadPoolTransactionDelay(model.getThreadPoolTransactionDelay());
            }
            if (model.wasPropertyExplicitlySet("threadPoolQueryThreadsPerGroup")) {
                this.threadPoolQueryThreadsPerGroup(model.getThreadPoolQueryThreadsPerGroup());
            }
            if (model.wasPropertyExplicitlySet("explainFormat")) {
                this.explainFormat(model.getExplainFormat());
            }
            if (model.wasPropertyExplicitlySet("explicitDefaultsForTimestamp")) {
                this.explicitDefaultsForTimestamp(model.getExplicitDefaultsForTimestamp());
            }
            if (model.wasPropertyExplicitlySet("sqlGenerateInvisiblePrimaryKey")) {
                this.sqlGenerateInvisiblePrimaryKey(model.getSqlGenerateInvisiblePrimaryKey());
            }
            if (model.wasPropertyExplicitlySet("temptableMaxRam")) {
                this.temptableMaxRam(model.getTemptableMaxRam());
            }
            if (model.wasPropertyExplicitlySet("innodbChangeBuffering")) {
                this.innodbChangeBuffering(model.getInnodbChangeBuffering());
            }
            if (model.wasPropertyExplicitlySet("innodbAdaptiveHashIndex")) {
                this.innodbAdaptiveHashIndex(model.getInnodbAdaptiveHashIndex());
            }
            if (model.wasPropertyExplicitlySet("innodbUndoLogTruncate")) {
                this.innodbUndoLogTruncate(model.getInnodbUndoLogTruncate());
            }
            if (model.wasPropertyExplicitlySet("tableDefinitionCache")) {
                this.tableDefinitionCache(model.getTableDefinitionCache());
            }
            if (model.wasPropertyExplicitlySet("tableOpenCache")) {
                this.tableOpenCache(model.getTableOpenCache());
            }
            if (model.wasPropertyExplicitlySet("relayLogSpaceLimit")) {
                this.relayLogSpaceLimit(model.getRelayLogSpaceLimit());
            }
            if (model.wasPropertyExplicitlySet("optimizerSwitch")) {
                this.optimizerSwitch(model.getOptimizerSwitch());
            }
            if (model.wasPropertyExplicitlySet("replicaTypeConversions")) {
                this.replicaTypeConversions(model.getReplicaTypeConversions());
            }
            if (model.wasPropertyExplicitlySet("replicaParallelWorkers")) {
                this.replicaParallelWorkers(model.getReplicaParallelWorkers());
            }
            if (model.wasPropertyExplicitlySet("skipNameResolve")) {
                this.skipNameResolve(model.getSkipNameResolve());
            }
            if (model.wasPropertyExplicitlySet("maxUserConnections")) {
                this.maxUserConnections(model.getMaxUserConnections());
            }
            if (model.wasPropertyExplicitlySet("joinBufferSize")) {
                this.joinBufferSize(model.getJoinBufferSize());
            }
            if (model.wasPropertyExplicitlySet("maxSeeksForKey")) {
                this.maxSeeksForKey(model.getMaxSeeksForKey());
            }
            if (model.wasPropertyExplicitlySet("rangeOptimizerMaxMemSize")) {
                this.rangeOptimizerMaxMemSize(model.getRangeOptimizerMaxMemSize());
            }
            if (model.wasPropertyExplicitlySet("autoIncrementIncrement")) {
                this.autoIncrementIncrement(model.getAutoIncrementIncrement());
            }
            if (model.wasPropertyExplicitlySet("autoIncrementOffset")) {
                this.autoIncrementOffset(model.getAutoIncrementOffset());
            }
            if (model.wasPropertyExplicitlySet("innodbAutoincLockMode")) {
                this.innodbAutoincLockMode(model.getInnodbAutoincLockMode());
            }
            if (model.wasPropertyExplicitlySet("innodbRollbackOnTimeout")) {
                this.innodbRollbackOnTimeout(model.getInnodbRollbackOnTimeout());
            }
            if (model.wasPropertyExplicitlySet("innodbOnlineAlterLogMaxSize")) {
                this.innodbOnlineAlterLogMaxSize(model.getInnodbOnlineAlterLogMaxSize());
            }
            if (model.wasPropertyExplicitlySet("innodbSortBufferSize")) {
                this.innodbSortBufferSize(model.getInnodbSortBufferSize());
            }
            if (model.wasPropertyExplicitlySet("innodbNumaInterleave")) {
                this.innodbNumaInterleave(model.getInnodbNumaInterleave());
            }
            if (model.wasPropertyExplicitlySet("threadPoolSize")) {
                this.threadPoolSize(model.getThreadPoolSize());
            }
            if (model.wasPropertyExplicitlySet("longQueryTime")) {
                this.longQueryTime(model.getLongQueryTime());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** ("completion_type") */
    public enum CompletionType implements com.oracle.bmc.http.internal.BmcEnum {
        NoChain("NO_CHAIN"),
        Chain("CHAIN"),
        Release("RELEASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** ("completion_type") */
    @com.fasterxml.jackson.annotation.JsonProperty("completionType")
    private final CompletionType completionType;

    /**
     * ("completion_type")
     *
     * @return the value
     */
    public CompletionType getCompletionType() {
        return completionType;
    }

    /**
     * If enabled, the server stores all temporary tables on disk rather than in memory.
     *
     * <p>bigTables corresponds to the MySQL server variable
     * [big_tables](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_big_tables).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bigTables")
    private final Boolean bigTables;

    /**
     * If enabled, the server stores all temporary tables on disk rather than in memory.
     *
     * <p>bigTables corresponds to the MySQL server variable
     * [big_tables](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_big_tables).
     *
     * @return the value
     */
    public Boolean getBigTables() {
        return bigTables;
    }

    /**
     * The server's default character set. If you set this variable, you should also set
     * collation_server to specify the collation for the character set.
     *
     * <p>characterSetServer corresponds to the MySQL server variable
     * [character_set_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_character_set_server).
     */
    public enum CharacterSetServer implements com.oracle.bmc.http.internal.BmcEnum {
        Armscii8("ARMSCII8"),
        Ascii("ASCII"),
        Big5("BIG5"),
        Binary("BINARY"),
        Cp1250("CP1250"),
        Cp1251("CP1251"),
        Cp1256("CP1256"),
        Cp1257("CP1257"),
        Cp850("CP850"),
        Cp852("CP852"),
        Cp866("CP866"),
        Cp932("CP932"),
        Dec8("DEC8"),
        Eucjpms("EUCJPMS"),
        Euckr("EUCKR"),
        Gb18030("GB18030"),
        Gb2312("GB2312"),
        Gbk("GBK"),
        Geostd8("GEOSTD8"),
        Greek("GREEK"),
        Hebrew("HEBREW"),
        Hp8("HP8"),
        Keybcs2("KEYBCS2"),
        Koi8R("KOI8R"),
        Koi8U("KOI8U"),
        Latin1("LATIN1"),
        Latin2("LATIN2"),
        Latin5("LATIN5"),
        Latin7("LATIN7"),
        Macce("MACCE"),
        Macroman("MACROMAN"),
        Sjis("SJIS"),
        Swe7("SWE7"),
        Tis620("TIS620"),
        Ucs2("UCS2"),
        Ujis("UJIS"),
        Utf16("UTF16"),
        Utf16Le("UTF16LE"),
        Utf32("UTF32"),
        Utf8Mb3("UTF8MB3"),
        Utf8Mb4("UTF8MB4"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CharacterSetServer.class);

        private final String value;
        private static java.util.Map<String, CharacterSetServer> map;

        static {
            map = new java.util.HashMap<>();
            for (CharacterSetServer v : CharacterSetServer.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CharacterSetServer(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CharacterSetServer create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CharacterSetServer', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The server's default character set. If you set this variable, you should also set
     * collation_server to specify the collation for the character set.
     *
     * <p>characterSetServer corresponds to the MySQL server variable
     * [character_set_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_character_set_server).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("characterSetServer")
    private final CharacterSetServer characterSetServer;

    /**
     * The server's default character set. If you set this variable, you should also set
     * collation_server to specify the collation for the character set.
     *
     * <p>characterSetServer corresponds to the MySQL server variable
     * [character_set_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_character_set_server).
     *
     * @return the value
     */
    public CharacterSetServer getCharacterSetServer() {
        return characterSetServer;
    }

    /**
     * The server's default collation.
     *
     * <p>collationServer corresponds to the MySQL server variable
     * [collation_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_collation_server).
     */
    public enum CollationServer implements com.oracle.bmc.http.internal.BmcEnum {
        Armscii8GeneralCi("ARMSCII8_GENERAL_CI"),
        Armscii8Bin("ARMSCII8_BIN"),
        AsciiGeneralCi("ASCII_GENERAL_CI"),
        AsciiBin("ASCII_BIN"),
        Big5ChineseCi("BIG5_CHINESE_CI"),
        Big5Bin("BIG5_BIN"),
        Binary("BINARY"),
        Cp1250GeneralCi("CP1250_GENERAL_CI"),
        Cp1250Bin("CP1250_BIN"),
        Cp1250CroatianCi("CP1250_CROATIAN_CI"),
        Cp1250CzechCs("CP1250_CZECH_CS"),
        Cp1250PolishCi("CP1250_POLISH_CI"),
        Cp1251GeneralCi("CP1251_GENERAL_CI"),
        Cp1251Bin("CP1251_BIN"),
        Cp1251BulgarianCi("CP1251_BULGARIAN_CI"),
        Cp1251GeneralCs("CP1251_GENERAL_CS"),
        Cp1251UkrainianCi("CP1251_UKRAINIAN_CI"),
        Cp1256GeneralCi("CP1256_GENERAL_CI"),
        Cp1256Bin("CP1256_BIN"),
        Cp1257GeneralCi("CP1257_GENERAL_CI"),
        Cp1257Bin("CP1257_BIN"),
        Cp1257LithuanianCi("CP1257_LITHUANIAN_CI"),
        Cp850GeneralCi("CP850_GENERAL_CI"),
        Cp850Bin("CP850_BIN"),
        Cp852GeneralCi("CP852_GENERAL_CI"),
        Cp852Bin("CP852_BIN"),
        Cp866GeneralCi("CP866_GENERAL_CI"),
        Cp866Bin("CP866_BIN"),
        Cp932JapaneseCi("CP932_JAPANESE_CI"),
        Cp932Bin("CP932_BIN"),
        Dec8SwedishCi("DEC8_SWEDISH_CI"),
        Dec8Bin("DEC8_BIN"),
        EucjpmsJapaneseCi("EUCJPMS_JAPANESE_CI"),
        EucjpmsBin("EUCJPMS_BIN"),
        EuckrKoreanCi("EUCKR_KOREAN_CI"),
        EuckrBin("EUCKR_BIN"),
        Gb18030ChineseCi("GB18030_CHINESE_CI"),
        Gb18030Bin("GB18030_BIN"),
        Gb18030Unicode520Ci("GB18030_UNICODE_520_CI"),
        Gb2312ChineseCi("GB2312_CHINESE_CI"),
        Gb2312Bin("GB2312_BIN"),
        GbkChineseCi("GBK_CHINESE_CI"),
        GbkBin("GBK_BIN"),
        Geostd8GeneralCi("GEOSTD8_GENERAL_CI"),
        Geostd8Bin("GEOSTD8_BIN"),
        GreekGeneralCi("GREEK_GENERAL_CI"),
        GreekBin("GREEK_BIN"),
        HebrewGeneralCi("HEBREW_GENERAL_CI"),
        HebrewBin("HEBREW_BIN"),
        Hp8EnglishCi("HP8_ENGLISH_CI"),
        Hp8Bin("HP8_BIN"),
        Keybcs2GeneralCi("KEYBCS2_GENERAL_CI"),
        Keybcs2Bin("KEYBCS2_BIN"),
        Koi8RGeneralCi("KOI8R_GENERAL_CI"),
        Koi8RBin("KOI8R_BIN"),
        Koi8UGeneralCi("KOI8U_GENERAL_CI"),
        Koi8UBin("KOI8U_BIN"),
        Latin1SwedishCi("LATIN1_SWEDISH_CI"),
        Latin1Bin("LATIN1_BIN"),
        Latin1DanishCi("LATIN1_DANISH_CI"),
        Latin1GeneralCi("LATIN1_GENERAL_CI"),
        Latin1GeneralCs("LATIN1_GENERAL_CS"),
        Latin1German1Ci("LATIN1_GERMAN1_CI"),
        Latin1German2Ci("LATIN1_GERMAN2_CI"),
        Latin1SpanishCi("LATIN1_SPANISH_CI"),
        Latin2GeneralCi("LATIN2_GENERAL_CI"),
        Latin2Bin("LATIN2_BIN"),
        Latin2CroatianCi("LATIN2_CROATIAN_CI"),
        Latin2CzechCs("LATIN2_CZECH_CS"),
        Latin2HungarianCi("LATIN2_HUNGARIAN_CI"),
        Latin5TurkishCi("LATIN5_TURKISH_CI"),
        Latin5Bin("LATIN5_BIN"),
        Latin7GeneralCi("LATIN7_GENERAL_CI"),
        Latin7Bin("LATIN7_BIN"),
        Latin7EstonianCs("LATIN7_ESTONIAN_CS"),
        Latin7GeneralCs("LATIN7_GENERAL_CS"),
        MacceGeneralCi("MACCE_GENERAL_CI"),
        MacceBin("MACCE_BIN"),
        MacromanGeneralCi("MACROMAN_GENERAL_CI"),
        MacromanBin("MACROMAN_BIN"),
        SjisJapaneseCi("SJIS_JAPANESE_CI"),
        SjisBin("SJIS_BIN"),
        Swe7SwedishCi("SWE7_SWEDISH_CI"),
        Swe7Bin("SWE7_BIN"),
        Tis620ThaiCi("TIS620_THAI_CI"),
        Tis620Bin("TIS620_BIN"),
        Ucs2GeneralCi("UCS2_GENERAL_CI"),
        Ucs2Bin("UCS2_BIN"),
        Ucs2CroatianCi("UCS2_CROATIAN_CI"),
        Ucs2CzechCi("UCS2_CZECH_CI"),
        Ucs2DanishCi("UCS2_DANISH_CI"),
        Ucs2EsperantoCi("UCS2_ESPERANTO_CI"),
        Ucs2EstonianCi("UCS2_ESTONIAN_CI"),
        Ucs2GeneralMysql500Ci("UCS2_GENERAL_MYSQL500_CI"),
        Ucs2German2Ci("UCS2_GERMAN2_CI"),
        Ucs2HungarianCi("UCS2_HUNGARIAN_CI"),
        Ucs2IcelandicCi("UCS2_ICELANDIC_CI"),
        Ucs2LatvianCi("UCS2_LATVIAN_CI"),
        Ucs2LithuanianCi("UCS2_LITHUANIAN_CI"),
        Ucs2PersianCi("UCS2_PERSIAN_CI"),
        Ucs2PolishCi("UCS2_POLISH_CI"),
        Ucs2RomanianCi("UCS2_ROMANIAN_CI"),
        Ucs2RomanCi("UCS2_ROMAN_CI"),
        Ucs2SinhalaCi("UCS2_SINHALA_CI"),
        Ucs2SlovakCi("UCS2_SLOVAK_CI"),
        Ucs2SlovenianCi("UCS2_SLOVENIAN_CI"),
        Ucs2Spanish2Ci("UCS2_SPANISH2_CI"),
        Ucs2SpanishCi("UCS2_SPANISH_CI"),
        Ucs2SwedishCi("UCS2_SWEDISH_CI"),
        Ucs2TurkishCi("UCS2_TURKISH_CI"),
        Ucs2Unicode520Ci("UCS2_UNICODE_520_CI"),
        Ucs2UnicodeCi("UCS2_UNICODE_CI"),
        Ucs2VietnameseCi("UCS2_VIETNAMESE_CI"),
        UjisJapaneseCi("UJIS_JAPANESE_CI"),
        UjisBin("UJIS_BIN"),
        Utf16GeneralCi("UTF16_GENERAL_CI"),
        Utf16Bin("UTF16_BIN"),
        Utf16CroatianCi("UTF16_CROATIAN_CI"),
        Utf16CzechCi("UTF16_CZECH_CI"),
        Utf16DanishCi("UTF16_DANISH_CI"),
        Utf16EsperantoCi("UTF16_ESPERANTO_CI"),
        Utf16EstonianCi("UTF16_ESTONIAN_CI"),
        Utf16German2Ci("UTF16_GERMAN2_CI"),
        Utf16HungarianCi("UTF16_HUNGARIAN_CI"),
        Utf16IcelandicCi("UTF16_ICELANDIC_CI"),
        Utf16LatvianCi("UTF16_LATVIAN_CI"),
        Utf16LithuanianCi("UTF16_LITHUANIAN_CI"),
        Utf16PersianCi("UTF16_PERSIAN_CI"),
        Utf16PolishCi("UTF16_POLISH_CI"),
        Utf16RomanianCi("UTF16_ROMANIAN_CI"),
        Utf16RomanCi("UTF16_ROMAN_CI"),
        Utf16SinhalaCi("UTF16_SINHALA_CI"),
        Utf16SlovakCi("UTF16_SLOVAK_CI"),
        Utf16SlovenianCi("UTF16_SLOVENIAN_CI"),
        Utf16Spanish2Ci("UTF16_SPANISH2_CI"),
        Utf16SpanishCi("UTF16_SPANISH_CI"),
        Utf16SwedishCi("UTF16_SWEDISH_CI"),
        Utf16TurkishCi("UTF16_TURKISH_CI"),
        Utf16Unicode520Ci("UTF16_UNICODE_520_CI"),
        Utf16UnicodeCi("UTF16_UNICODE_CI"),
        Utf16VietnameseCi("UTF16_VIETNAMESE_CI"),
        Utf16LeGeneralCi("UTF16LE_GENERAL_CI"),
        Utf16LeBin("UTF16LE_BIN"),
        Utf32GeneralCi("UTF32_GENERAL_CI"),
        Utf32Bin("UTF32_BIN"),
        Utf32CroatianCi("UTF32_CROATIAN_CI"),
        Utf32CzechCi("UTF32_CZECH_CI"),
        Utf32DanishCi("UTF32_DANISH_CI"),
        Utf32EsperantoCi("UTF32_ESPERANTO_CI"),
        Utf32EstonianCi("UTF32_ESTONIAN_CI"),
        Utf32German2Ci("UTF32_GERMAN2_CI"),
        Utf32HungarianCi("UTF32_HUNGARIAN_CI"),
        Utf32IcelandicCi("UTF32_ICELANDIC_CI"),
        Utf32LatvianCi("UTF32_LATVIAN_CI"),
        Utf32LithuanianCi("UTF32_LITHUANIAN_CI"),
        Utf32PersianCi("UTF32_PERSIAN_CI"),
        Utf32PolishCi("UTF32_POLISH_CI"),
        Utf32RomanianCi("UTF32_ROMANIAN_CI"),
        Utf32RomanCi("UTF32_ROMAN_CI"),
        Utf32SinhalaCi("UTF32_SINHALA_CI"),
        Utf32SlovakCi("UTF32_SLOVAK_CI"),
        Utf32SlovenianCi("UTF32_SLOVENIAN_CI"),
        Utf32Spanish2Ci("UTF32_SPANISH2_CI"),
        Utf32SpanishCi("UTF32_SPANISH_CI"),
        Utf32SwedishCi("UTF32_SWEDISH_CI"),
        Utf32TurkishCi("UTF32_TURKISH_CI"),
        Utf32Unicode520Ci("UTF32_UNICODE_520_CI"),
        Utf32UnicodeCi("UTF32_UNICODE_CI"),
        Utf32VietnameseCi("UTF32_VIETNAMESE_CI"),
        Utf8GeneralCi("UTF8_GENERAL_CI"),
        Utf8Bin("UTF8_BIN"),
        Utf8CroatianCi("UTF8_CROATIAN_CI"),
        Utf8CzechCi("UTF8_CZECH_CI"),
        Utf8DanishCi("UTF8_DANISH_CI"),
        Utf8EsperantoCi("UTF8_ESPERANTO_CI"),
        Utf8EstonianCi("UTF8_ESTONIAN_CI"),
        Utf8GeneralMysql500Ci("UTF8_GENERAL_MYSQL500_CI"),
        Utf8German2Ci("UTF8_GERMAN2_CI"),
        Utf8HungarianCi("UTF8_HUNGARIAN_CI"),
        Utf8IcelandicCi("UTF8_ICELANDIC_CI"),
        Utf8LatvianCi("UTF8_LATVIAN_CI"),
        Utf8LithuanianCi("UTF8_LITHUANIAN_CI"),
        Utf8PersianCi("UTF8_PERSIAN_CI"),
        Utf8PolishCi("UTF8_POLISH_CI"),
        Utf8RomanianCi("UTF8_ROMANIAN_CI"),
        Utf8RomanCi("UTF8_ROMAN_CI"),
        Utf8SinhalaCi("UTF8_SINHALA_CI"),
        Utf8SlovakCi("UTF8_SLOVAK_CI"),
        Utf8SlovenianCi("UTF8_SLOVENIAN_CI"),
        Utf8Spanish2Ci("UTF8_SPANISH2_CI"),
        Utf8SpanishCi("UTF8_SPANISH_CI"),
        Utf8SwedishCi("UTF8_SWEDISH_CI"),
        Utf8TolowerCi("UTF8_TOLOWER_CI"),
        Utf8TurkishCi("UTF8_TURKISH_CI"),
        Utf8Unicode520Ci("UTF8_UNICODE_520_CI"),
        Utf8UnicodeCi("UTF8_UNICODE_CI"),
        Utf8VietnameseCi("UTF8_VIETNAMESE_CI"),
        Utf8Mb40900AiCi("UTF8MB4_0900_AI_CI"),
        Utf8Mb40900AsCi("UTF8MB4_0900_AS_CI"),
        Utf8Mb40900AsCs("UTF8MB4_0900_AS_CS"),
        Utf8Mb40900Bin("UTF8MB4_0900_BIN"),
        Utf8Mb4Bin("UTF8MB4_BIN"),
        Utf8Mb4CroatianCi("UTF8MB4_CROATIAN_CI"),
        Utf8Mb4Cs0900AiCi("UTF8MB4_CS_0900_AI_CI"),
        Utf8Mb4Cs0900AsCs("UTF8MB4_CS_0900_AS_CS"),
        Utf8Mb4CzechCi("UTF8MB4_CZECH_CI"),
        Utf8Mb4DanishCi("UTF8MB4_DANISH_CI"),
        Utf8Mb4Da0900AiCi("UTF8MB4_DA_0900_AI_CI"),
        Utf8Mb4Da0900AsCs("UTF8MB4_DA_0900_AS_CS"),
        Utf8Mb4DePb0900AiCi("UTF8MB4_DE_PB_0900_AI_CI"),
        Utf8Mb4DePb0900AsCs("UTF8MB4_DE_PB_0900_AS_CS"),
        Utf8Mb4Eo0900AiCi("UTF8MB4_EO_0900_AI_CI"),
        Utf8Mb4Eo0900AsCs("UTF8MB4_EO_0900_AS_CS"),
        Utf8Mb4EsperantoCi("UTF8MB4_ESPERANTO_CI"),
        Utf8Mb4EstonianCi("UTF8MB4_ESTONIAN_CI"),
        Utf8Mb4Es0900AiCi("UTF8MB4_ES_0900_AI_CI"),
        Utf8Mb4Es0900AsCs("UTF8MB4_ES_0900_AS_CS"),
        Utf8Mb4EsTrad0900AiCi("UTF8MB4_ES_TRAD_0900_AI_CI"),
        Utf8Mb4EsTrad0900AsCs("UTF8MB4_ES_TRAD_0900_AS_CS"),
        Utf8Mb4Et0900AiCi("UTF8MB4_ET_0900_AI_CI"),
        Utf8Mb4Et0900AsCs("UTF8MB4_ET_0900_AS_CS"),
        Utf8Mb4GeneralCi("UTF8MB4_GENERAL_CI"),
        Utf8Mb4German2Ci("UTF8MB4_GERMAN2_CI"),
        Utf8Mb4Hr0900AiCi("UTF8MB4_HR_0900_AI_CI"),
        Utf8Mb4Hr0900AsCs("UTF8MB4_HR_0900_AS_CS"),
        Utf8Mb4HungarianCi("UTF8MB4_HUNGARIAN_CI"),
        Utf8Mb4Hu0900AiCi("UTF8MB4_HU_0900_AI_CI"),
        Utf8Mb4Hu0900AsCs("UTF8MB4_HU_0900_AS_CS"),
        Utf8Mb4IcelandicCi("UTF8MB4_ICELANDIC_CI"),
        Utf8Mb4Is0900AiCi("UTF8MB4_IS_0900_AI_CI"),
        Utf8Mb4Is0900AsCs("UTF8MB4_IS_0900_AS_CS"),
        Utf8Mb4Ja0900AsCs("UTF8MB4_JA_0900_AS_CS"),
        Utf8Mb4Ja0900AsCsKs("UTF8MB4_JA_0900_AS_CS_KS"),
        Utf8Mb4LatvianCi("UTF8MB4_LATVIAN_CI"),
        Utf8Mb4La0900AiCi("UTF8MB4_LA_0900_AI_CI"),
        Utf8Mb4La0900AsCs("UTF8MB4_LA_0900_AS_CS"),
        Utf8Mb4LithuanianCi("UTF8MB4_LITHUANIAN_CI"),
        Utf8Mb4Lt0900AiCi("UTF8MB4_LT_0900_AI_CI"),
        Utf8Mb4Lt0900AsCs("UTF8MB4_LT_0900_AS_CS"),
        Utf8Mb4Lv0900AiCi("UTF8MB4_LV_0900_AI_CI"),
        Utf8Mb4Lv0900AsCs("UTF8MB4_LV_0900_AS_CS"),
        Utf8Mb4PersianCi("UTF8MB4_PERSIAN_CI"),
        Utf8Mb4Pl0900AiCi("UTF8MB4_PL_0900_AI_CI"),
        Utf8Mb4Pl0900AsCs("UTF8MB4_PL_0900_AS_CS"),
        Utf8Mb4PolishCi("UTF8MB4_POLISH_CI"),
        Utf8Mb4RomanianCi("UTF8MB4_ROMANIAN_CI"),
        Utf8Mb4RomanCi("UTF8MB4_ROMAN_CI"),
        Utf8Mb4Ro0900AiCi("UTF8MB4_RO_0900_AI_CI"),
        Utf8Mb4Ro0900AsCs("UTF8MB4_RO_0900_AS_CS"),
        Utf8Mb4Ru0900AiCi("UTF8MB4_RU_0900_AI_CI"),
        Utf8Mb4Ru0900AsCs("UTF8MB4_RU_0900_AS_CS"),
        Utf8Mb4SinhalaCi("UTF8MB4_SINHALA_CI"),
        Utf8Mb4Sk0900AiCi("UTF8MB4_SK_0900_AI_CI"),
        Utf8Mb4Sk0900AsCs("UTF8MB4_SK_0900_AS_CS"),
        Utf8Mb4SlovakCi("UTF8MB4_SLOVAK_CI"),
        Utf8Mb4SlovenianCi("UTF8MB4_SLOVENIAN_CI"),
        Utf8Mb4Sl0900AiCi("UTF8MB4_SL_0900_AI_CI"),
        Utf8Mb4Sl0900AsCs("UTF8MB4_SL_0900_AS_CS"),
        Utf8Mb4Spanish2Ci("UTF8MB4_SPANISH2_CI"),
        Utf8Mb4SpanishCi("UTF8MB4_SPANISH_CI"),
        Utf8Mb4Sv0900AiCi("UTF8MB4_SV_0900_AI_CI"),
        Utf8Mb4Sv0900AsCs("UTF8MB4_SV_0900_AS_CS"),
        Utf8Mb4SwedishCi("UTF8MB4_SWEDISH_CI"),
        Utf8Mb4Tr0900AiCi("UTF8MB4_TR_0900_AI_CI"),
        Utf8Mb4Tr0900AsCs("UTF8MB4_TR_0900_AS_CS"),
        Utf8Mb4TurkishCi("UTF8MB4_TURKISH_CI"),
        Utf8Mb4Unicode520Ci("UTF8MB4_UNICODE_520_CI"),
        Utf8Mb4UnicodeCi("UTF8MB4_UNICODE_CI"),
        Utf8Mb4VietnameseCi("UTF8MB4_VIETNAMESE_CI"),
        Utf8Mb4Vi0900AiCi("UTF8MB4_VI_0900_AI_CI"),
        Utf8Mb4Vi0900AsCs("UTF8MB4_VI_0900_AS_CS"),
        Utf8Mb4Zh0900AsCs("UTF8MB4_ZH_0900_AS_CS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CollationServer.class);

        private final String value;
        private static java.util.Map<String, CollationServer> map;

        static {
            map = new java.util.HashMap<>();
            for (CollationServer v : CollationServer.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CollationServer(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CollationServer create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CollationServer', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The server's default collation.
     *
     * <p>collationServer corresponds to the MySQL server variable
     * [collation_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_collation_server).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collationServer")
    private final CollationServer collationServer;

    /**
     * The server's default collation.
     *
     * <p>collationServer corresponds to the MySQL server variable
     * [collation_server](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_collation_server).
     *
     * @return the value
     */
    public CollationServer getCollationServer() {
        return collationServer;
    }

    /**
     * Set the chunking size for updates to the global memory usage counter
     * Global_connection_memory.
     *
     * <p>connectionMemoryChunkSize corresponds to the MySQL system variable
     * [connection_memory_chunk_size](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_connection_memory_chunk_size).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionMemoryChunkSize")
    private final Integer connectionMemoryChunkSize;

    /**
     * Set the chunking size for updates to the global memory usage counter
     * Global_connection_memory.
     *
     * <p>connectionMemoryChunkSize corresponds to the MySQL system variable
     * [connection_memory_chunk_size](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_connection_memory_chunk_size).
     *
     * @return the value
     */
    public Integer getConnectionMemoryChunkSize() {
        return connectionMemoryChunkSize;
    }

    /**
     * Set the maximum amount of memory that can be used by a single user connection.
     *
     * <p>connectionMemoryLimit corresponds to the MySQL system variable
     * [connection_memory_limit](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_connection_memory_limit).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionMemoryLimit")
    private final Long connectionMemoryLimit;

    /**
     * Set the maximum amount of memory that can be used by a single user connection.
     *
     * <p>connectionMemoryLimit corresponds to the MySQL system variable
     * [connection_memory_limit](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_connection_memory_limit).
     *
     * @return the value
     */
    public Long getConnectionMemoryLimit() {
        return connectionMemoryLimit;
    }

    /**
     * The default authentication plugin. This must be a plugin that uses internal credentials
     * storage, so these values are permitted: mysql_native_password, sha256_password,
     * caching_sha2_password.
     *
     * <p>As of MySQL 8.0.27, which introduces multifactor authentication,
     * default_authentication_plugin is still used, but in conjunction with and at a lower
     * precedence than the authentication_policy system variable. For details, see The Default
     * Authentication Plugin. Because of this diminished role, default_authentication_plugin is
     * deprecated as of MySQL 8.0.27 and subject to removal in a future MySQL version.
     *
     * <p>defaultAuthenticationPlugin corresponds to the MySQL system variable
     * [default_authentication_plugin](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_default_authentication_plugin).
     */
    public enum DefaultAuthenticationPlugin implements com.oracle.bmc.http.internal.BmcEnum {
        MysqlNativePassword("mysql_native_password"),
        Sha256Password("sha256_password"),
        CachingSha2Password("caching_sha2_password"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The default authentication plugin. This must be a plugin that uses internal credentials
     * storage, so these values are permitted: mysql_native_password, sha256_password,
     * caching_sha2_password.
     *
     * <p>As of MySQL 8.0.27, which introduces multifactor authentication,
     * default_authentication_plugin is still used, but in conjunction with and at a lower
     * precedence than the authentication_policy system variable. For details, see The Default
     * Authentication Plugin. Because of this diminished role, default_authentication_plugin is
     * deprecated as of MySQL 8.0.27 and subject to removal in a future MySQL version.
     *
     * <p>defaultAuthenticationPlugin corresponds to the MySQL system variable
     * [default_authentication_plugin](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_default_authentication_plugin).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationPlugin")
    private final DefaultAuthenticationPlugin defaultAuthenticationPlugin;

    /**
     * The default authentication plugin. This must be a plugin that uses internal credentials
     * storage, so these values are permitted: mysql_native_password, sha256_password,
     * caching_sha2_password.
     *
     * <p>As of MySQL 8.0.27, which introduces multifactor authentication,
     * default_authentication_plugin is still used, but in conjunction with and at a lower
     * precedence than the authentication_policy system variable. For details, see The Default
     * Authentication Plugin. Because of this diminished role, default_authentication_plugin is
     * deprecated as of MySQL 8.0.27 and subject to removal in a future MySQL version.
     *
     * <p>defaultAuthenticationPlugin corresponds to the MySQL system variable
     * [default_authentication_plugin](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_default_authentication_plugin).
     *
     * @return the value
     */
    public DefaultAuthenticationPlugin getDefaultAuthenticationPlugin() {
        return defaultAuthenticationPlugin;
    }

    /**
     * Set the total amount of memory that can be used by all user connections.
     *
     * <p>globalConnectionMemoryLimit corresponds to the MySQL system variable
     * [global_connection_memory_limit](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_global_connection_memory_limit).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("globalConnectionMemoryLimit")
    private final Long globalConnectionMemoryLimit;

    /**
     * Set the total amount of memory that can be used by all user connections.
     *
     * <p>globalConnectionMemoryLimit corresponds to the MySQL system variable
     * [global_connection_memory_limit](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_global_connection_memory_limit).
     *
     * @return the value
     */
    public Long getGlobalConnectionMemoryLimit() {
        return globalConnectionMemoryLimit;
    }

    /**
     * Determines whether the MySQL server calculates Global_connection_memory.
     *
     * <p>globalConnectionMemoryTracking corresponds to the MySQL system variable
     * [global_connection_memory_tracking](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_global_connection_memory_tracking).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("globalConnectionMemoryTracking")
    private final Boolean globalConnectionMemoryTracking;

    /**
     * Determines whether the MySQL server calculates Global_connection_memory.
     *
     * <p>globalConnectionMemoryTracking corresponds to the MySQL system variable
     * [global_connection_memory_tracking](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_global_connection_memory_tracking).
     *
     * @return the value
     */
    public Boolean getGlobalConnectionMemoryTracking() {
        return globalConnectionMemoryTracking;
    }

    /** ("transaction_isolation") */
    public enum TransactionIsolation implements com.oracle.bmc.http.internal.BmcEnum {
        ReadUncommitted("READ-UNCOMMITTED"),
        ReadCommited("READ-COMMITED"),
        ReadCommitted("READ-COMMITTED"),
        RepeatableRead("REPEATABLE-READ"),
        Serializable("SERIALIZABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** ("transaction_isolation") */
    @com.fasterxml.jackson.annotation.JsonProperty("transactionIsolation")
    private final TransactionIsolation transactionIsolation;

    /**
     * ("transaction_isolation")
     *
     * @return the value
     */
    public TransactionIsolation getTransactionIsolation() {
        return transactionIsolation;
    }

    /** ("innodb_ft_server_stopword_table") */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtServerStopwordTable")
    private final String innodbFtServerStopwordTable;

    /**
     * ("innodb_ft_server_stopword_table")
     *
     * @return the value
     */
    public String getInnodbFtServerStopwordTable() {
        return innodbFtServerStopwordTable;
    }

    /** ("mandatory_roles") */
    @com.fasterxml.jackson.annotation.JsonProperty("mandatoryRoles")
    private final String mandatoryRoles;

    /**
     * ("mandatory_roles")
     *
     * @return the value
     */
    public String getMandatoryRoles() {
        return mandatoryRoles;
    }

    /** ("autocommit") */
    @com.fasterxml.jackson.annotation.JsonProperty("autocommit")
    private final Boolean autocommit;

    /**
     * ("autocommit")
     *
     * @return the value
     */
    public Boolean getAutocommit() {
        return autocommit;
    }

    /** ("foreign_key_checks") */
    @com.fasterxml.jackson.annotation.JsonProperty("foreignKeyChecks")
    private final Boolean foreignKeyChecks;

    /**
     * ("foreign_key_checks")
     *
     * @return the value
     */
    public Boolean getForeignKeyChecks() {
        return foreignKeyChecks;
    }

    /**
     * - EVENTUAL: Both RO and RW transactions do not wait for preceding transactions to be applied
     * before executing. A RW transaction does not wait for other members to apply a transaction.
     * This means that a transaction could be externalized on one member before the others. This
     * also means that in the event of a primary failover, the new primary can accept new RO and RW
     * transactions before the previous primary transactions are all applied. RO transactions could
     * result in outdated values, RW transactions could result in a rollback due to conflicts. -
     * BEFORE_ON_PRIMARY_FAILOVER: New RO or RW transactions with a newly elected primary that is
     * applying backlog from the old primary are held (not applied) until any backlog has been
     * applied. This ensures that when a primary failover happens, intentionally or not, clients
     * always see the latest value on the primary. This guarantees consistency, but means that
     * clients must be able to handle the delay in the event that a backlog is being applied.
     * Usually this delay should be minimal, but does depend on the size of the backlog. - BEFORE: A
     * RW transaction waits for all preceding transactions to complete before being applied. A RO
     * transaction waits for all preceding transactions to complete before being executed. This
     * ensures that this transaction reads the latest value by only affecting the latency of the
     * transaction. This reduces the overhead of synchronization on every RW transaction, by
     * ensuring synchronization is used only on RO transactions. This consistency level also
     * includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER. - AFTER: A RW
     * transaction waits until its changes have been applied to all of the other members. This value
     * has no effect on RO transactions. This mode ensures that when a transaction is committed on
     * the local member, any subsequent transaction reads the written value or a more recent value
     * on any group member. Use this mode with a group that is used for predominantly RO operations
     * to ensure that applied RW transactions are applied everywhere once they commit. This could be
     * used by your application to ensure that subsequent reads fetch the latest data which includes
     * the latest writes. This reduces the overhead of synchronization on every RO transaction, by
     * ensuring synchronization is used only on RW transactions. This consistency level also
     * includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER. -
     * BEFORE_AND_AFTER: A RW transaction waits for 1) all preceding transactions to complete before
     * being applied and 2) until its changes have been applied on other members. A RO transaction
     * waits for all preceding transactions to complete before execution takes place. This
     * consistency level also includes the consistency guarantees provided by
     * BEFORE_ON_PRIMARY_FAILOVER.
     */
    public enum GroupReplicationConsistency implements com.oracle.bmc.http.internal.BmcEnum {
        Eventual("EVENTUAL"),
        BeforeOnPrimaryFailover("BEFORE_ON_PRIMARY_FAILOVER"),
        Before("BEFORE"),
        After("AFTER"),
        BeforeAndAfter("BEFORE_AND_AFTER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * - EVENTUAL: Both RO and RW transactions do not wait for preceding transactions to be applied
     * before executing. A RW transaction does not wait for other members to apply a transaction.
     * This means that a transaction could be externalized on one member before the others. This
     * also means that in the event of a primary failover, the new primary can accept new RO and RW
     * transactions before the previous primary transactions are all applied. RO transactions could
     * result in outdated values, RW transactions could result in a rollback due to conflicts. -
     * BEFORE_ON_PRIMARY_FAILOVER: New RO or RW transactions with a newly elected primary that is
     * applying backlog from the old primary are held (not applied) until any backlog has been
     * applied. This ensures that when a primary failover happens, intentionally or not, clients
     * always see the latest value on the primary. This guarantees consistency, but means that
     * clients must be able to handle the delay in the event that a backlog is being applied.
     * Usually this delay should be minimal, but does depend on the size of the backlog. - BEFORE: A
     * RW transaction waits for all preceding transactions to complete before being applied. A RO
     * transaction waits for all preceding transactions to complete before being executed. This
     * ensures that this transaction reads the latest value by only affecting the latency of the
     * transaction. This reduces the overhead of synchronization on every RW transaction, by
     * ensuring synchronization is used only on RO transactions. This consistency level also
     * includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER. - AFTER: A RW
     * transaction waits until its changes have been applied to all of the other members. This value
     * has no effect on RO transactions. This mode ensures that when a transaction is committed on
     * the local member, any subsequent transaction reads the written value or a more recent value
     * on any group member. Use this mode with a group that is used for predominantly RO operations
     * to ensure that applied RW transactions are applied everywhere once they commit. This could be
     * used by your application to ensure that subsequent reads fetch the latest data which includes
     * the latest writes. This reduces the overhead of synchronization on every RO transaction, by
     * ensuring synchronization is used only on RW transactions. This consistency level also
     * includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER. -
     * BEFORE_AND_AFTER: A RW transaction waits for 1) all preceding transactions to complete before
     * being applied and 2) until its changes have been applied on other members. A RO transaction
     * waits for all preceding transactions to complete before execution takes place. This
     * consistency level also includes the consistency guarantees provided by
     * BEFORE_ON_PRIMARY_FAILOVER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupReplicationConsistency")
    private final GroupReplicationConsistency groupReplicationConsistency;

    /**
     * - EVENTUAL: Both RO and RW transactions do not wait for preceding transactions to be applied
     * before executing. A RW transaction does not wait for other members to apply a transaction.
     * This means that a transaction could be externalized on one member before the others. This
     * also means that in the event of a primary failover, the new primary can accept new RO and RW
     * transactions before the previous primary transactions are all applied. RO transactions could
     * result in outdated values, RW transactions could result in a rollback due to conflicts. -
     * BEFORE_ON_PRIMARY_FAILOVER: New RO or RW transactions with a newly elected primary that is
     * applying backlog from the old primary are held (not applied) until any backlog has been
     * applied. This ensures that when a primary failover happens, intentionally or not, clients
     * always see the latest value on the primary. This guarantees consistency, but means that
     * clients must be able to handle the delay in the event that a backlog is being applied.
     * Usually this delay should be minimal, but does depend on the size of the backlog. - BEFORE: A
     * RW transaction waits for all preceding transactions to complete before being applied. A RO
     * transaction waits for all preceding transactions to complete before being executed. This
     * ensures that this transaction reads the latest value by only affecting the latency of the
     * transaction. This reduces the overhead of synchronization on every RW transaction, by
     * ensuring synchronization is used only on RO transactions. This consistency level also
     * includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER. - AFTER: A RW
     * transaction waits until its changes have been applied to all of the other members. This value
     * has no effect on RO transactions. This mode ensures that when a transaction is committed on
     * the local member, any subsequent transaction reads the written value or a more recent value
     * on any group member. Use this mode with a group that is used for predominantly RO operations
     * to ensure that applied RW transactions are applied everywhere once they commit. This could be
     * used by your application to ensure that subsequent reads fetch the latest data which includes
     * the latest writes. This reduces the overhead of synchronization on every RO transaction, by
     * ensuring synchronization is used only on RW transactions. This consistency level also
     * includes the consistency guarantees provided by BEFORE_ON_PRIMARY_FAILOVER. -
     * BEFORE_AND_AFTER: A RW transaction waits for 1) all preceding transactions to complete before
     * being applied and 2) until its changes have been applied on other members. A RO transaction
     * waits for all preceding transactions to complete before execution takes place. This
     * consistency level also includes the consistency guarantees provided by
     * BEFORE_ON_PRIMARY_FAILOVER.
     *
     * @return the value
     */
    public GroupReplicationConsistency getGroupReplicationConsistency() {
        return groupReplicationConsistency;
    }

    /**
     * Specifies the maximum permitted result length in bytes for the GROUP_CONCAT() function.
     *
     * <p>This is the MySQL variable "group_concat_max_len". For more information, please see the
     * [MySQL
     * documentation](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_group_concat_max_len)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupConcatMaxLen")
    private final Long groupConcatMaxLen;

    /**
     * Specifies the maximum permitted result length in bytes for the GROUP_CONCAT() function.
     *
     * <p>This is the MySQL variable "group_concat_max_len". For more information, please see the
     * [MySQL
     * documentation](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_group_concat_max_len)
     *
     * @return the value
     */
    public Long getGroupConcatMaxLen() {
        return groupConcatMaxLen;
    }

    /** ("innodb_ft_enable_stopword") */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtEnableStopword")
    private final Boolean innodbFtEnableStopword;

    /**
     * ("innodb_ft_enable_stopword")
     *
     * @return the value
     */
    public Boolean getInnodbFtEnableStopword() {
        return innodbFtEnableStopword;
    }

    /**
     * Enables dedicated log writer threads for writing redo log records from the log buffer to the
     * system buffers and flushing the system buffers to the redo log files.
     *
     * <p>This is the MySQL variable "innodb_log_writer_threads". For more information, please see
     * the [MySQL
     * documentation](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_log_writer_threads)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbLogWriterThreads")
    private final Boolean innodbLogWriterThreads;

    /**
     * Enables dedicated log writer threads for writing redo log records from the log buffer to the
     * system buffers and flushing the system buffers to the redo log files.
     *
     * <p>This is the MySQL variable "innodb_log_writer_threads". For more information, please see
     * the [MySQL
     * documentation](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_log_writer_threads)
     *
     * @return the value
     */
    public Boolean getInnodbLogWriterThreads() {
        return innodbLogWriterThreads;
    }

    /**
     * This variable controls server-side LOCAL capability for LOAD DATA statements. Depending on
     * the local_infile setting, the server refuses or permits local data loading by clients that
     * have LOCAL enabled on the client side.
     *
     * <p>local_infile corresponds to the MySQL Server system variable
     * [local_infile](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_local_infile)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
    private final Boolean localInfile;

    /**
     * This variable controls server-side LOCAL capability for LOAD DATA statements. Depending on
     * the local_infile setting, the server refuses or permits local data loading by clients that
     * have LOCAL enabled on the client side.
     *
     * <p>local_infile corresponds to the MySQL Server system variable
     * [local_infile](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_local_infile)
     *
     * @return the value
     */
    public Boolean getLocalInfile() {
        return localInfile;
    }

    /** ("mysql_firewall_mode") */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlFirewallMode")
    private final Boolean mysqlFirewallMode;

    /**
     * ("mysql_firewall_mode")
     *
     * @return the value
     */
    public Boolean getMysqlFirewallMode() {
        return mysqlFirewallMode;
    }

    /**
     * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be
     * ignored
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxEnableHelloNotice")
    private final Boolean mysqlxEnableHelloNotice;

    /**
     * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be
     * ignored
     *
     * @return the value
     */
    public Boolean getMysqlxEnableHelloNotice() {
        return mysqlxEnableHelloNotice;
    }

    /** ("sql_require_primary_key") */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlRequirePrimaryKey")
    private final Boolean sqlRequirePrimaryKey;

    /**
     * ("sql_require_primary_key")
     *
     * @return the value
     */
    public Boolean getSqlRequirePrimaryKey() {
        return sqlRequirePrimaryKey;
    }

    /** ("sql_warnings") */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlWarnings")
    private final Boolean sqlWarnings;

    /**
     * ("sql_warnings")
     *
     * @return the value
     */
    public Boolean getSqlWarnings() {
        return sqlWarnings;
    }

    /**
     * Sets the binary log expiration period in seconds. binlogExpireLogsSeconds corresponds to the
     * MySQL binary logging system variable
     * [binlog_expire_logs_seconds](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_expire_logs_seconds).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binlogExpireLogsSeconds")
    private final Integer binlogExpireLogsSeconds;

    /**
     * Sets the binary log expiration period in seconds. binlogExpireLogsSeconds corresponds to the
     * MySQL binary logging system variable
     * [binlog_expire_logs_seconds](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_expire_logs_seconds).
     *
     * @return the value
     */
    public Integer getBinlogExpireLogsSeconds() {
        return binlogExpireLogsSeconds;
    }

    /**
     * Configures the amount of table metadata added to the binary log when using row-based logging.
     * binlogRowMetadata corresponds to the MySQL binary logging system variable
     * [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
     */
    public enum BinlogRowMetadata implements com.oracle.bmc.http.internal.BmcEnum {
        Full("FULL"),
        Minimal("MINIMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * binlogRowMetadata corresponds to the MySQL binary logging system variable
     * [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binlogRowMetadata")
    private final BinlogRowMetadata binlogRowMetadata;

    /**
     * Configures the amount of table metadata added to the binary log when using row-based logging.
     * binlogRowMetadata corresponds to the MySQL binary logging system variable
     * [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
     *
     * @return the value
     */
    public BinlogRowMetadata getBinlogRowMetadata() {
        return binlogRowMetadata;
    }

    /**
     * When set to PARTIAL_JSON, this enables use of a space-efficient binary log format for updates
     * that modify only a small portion of a JSON document. binlogRowValueOptions corresponds to the
     * MySQL binary logging system variable
     * [binlog_row_value_options](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_value_options).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binlogRowValueOptions")
    private final String binlogRowValueOptions;

    /**
     * When set to PARTIAL_JSON, this enables use of a space-efficient binary log format for updates
     * that modify only a small portion of a JSON document. binlogRowValueOptions corresponds to the
     * MySQL binary logging system variable
     * [binlog_row_value_options](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_value_options).
     *
     * @return the value
     */
    public String getBinlogRowValueOptions() {
        return binlogRowValueOptions;
    }

    /**
     * Enables compression for transactions that are written to binary log files on this server.
     * binlogTransactionCompression corresponds to the MySQL binary logging system variable
     * [binlog_transaction_compression](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_transaction_compression).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binlogTransactionCompression")
    private final Boolean binlogTransactionCompression;

    /**
     * Enables compression for transactions that are written to binary log files on this server.
     * binlogTransactionCompression corresponds to the MySQL binary logging system variable
     * [binlog_transaction_compression](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_transaction_compression).
     *
     * @return the value
     */
    public Boolean getBinlogTransactionCompression() {
        return binlogTransactionCompression;
    }

    /**
     * The size (in bytes) of the buffer pool, that is, the memory area where InnoDB caches table
     * and index data.
     *
     * <p>innodbBufferPoolSize corresponds to the MySQL server system variable
     * [innodb_buffer_pool_size](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_buffer_pool_size).
     *
     * <p>The default and maximum values depend on the amount of RAM provisioned by the shape. See
     * [Default User
     * Variables](https://docs.cloud.oracle.com/mysql-database/doc/configuring-db-system.html#GUID-B5504C19-F6F4-4DAB-8506-189A4E8F4A6A).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolSize")
    private final Long innodbBufferPoolSize;

    /**
     * The size (in bytes) of the buffer pool, that is, the memory area where InnoDB caches table
     * and index data.
     *
     * <p>innodbBufferPoolSize corresponds to the MySQL server system variable
     * [innodb_buffer_pool_size](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_buffer_pool_size).
     *
     * <p>The default and maximum values depend on the amount of RAM provisioned by the shape. See
     * [Default User
     * Variables](https://docs.cloud.oracle.com/mysql-database/doc/configuring-db-system.html#GUID-B5504C19-F6F4-4DAB-8506-189A4E8F4A6A).
     *
     * @return the value
     */
    public Long getInnodbBufferPoolSize() {
        return innodbBufferPoolSize;
    }

    /** ("innodb_ft_result_cache_limit") */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtResultCacheLimit")
    private final Long innodbFtResultCacheLimit;

    /**
     * ("innodb_ft_result_cache_limit")
     *
     * @return the value
     */
    public Long getInnodbFtResultCacheLimit() {
        return innodbFtResultCacheLimit;
    }

    /**
     * Sets the size of the transaction cache.
     *
     * <p>maxBinlogCacheSize corresponds to the MySQL server system variable
     * [max_binlog_cache_size](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_max_binlog_cache_size).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxBinlogCacheSize")
    private final Long maxBinlogCacheSize;

    /**
     * Sets the size of the transaction cache.
     *
     * <p>maxBinlogCacheSize corresponds to the MySQL server system variable
     * [max_binlog_cache_size](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_max_binlog_cache_size).
     *
     * @return the value
     */
    public Long getMaxBinlogCacheSize() {
        return maxBinlogCacheSize;
    }

    /** ("max_connect_errors") */
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnectErrors")
    private final Long maxConnectErrors;

    /**
     * ("max_connect_errors")
     *
     * @return the value
     */
    public Long getMaxConnectErrors() {
        return maxConnectErrors;
    }

    /**
     * This variable sets the maximum size to which user-created MEMORY tables are permitted to
     * grow.
     *
     * <p>maxHeapTableSize corresponds to the MySQL system variable
     * [max_heap_table_size](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_heap_table_size)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxHeapTableSize")
    private final Long maxHeapTableSize;

    /**
     * This variable sets the maximum size to which user-created MEMORY tables are permitted to
     * grow.
     *
     * <p>maxHeapTableSize corresponds to the MySQL system variable
     * [max_heap_table_size](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_heap_table_size)
     *
     * @return the value
     */
    public Long getMaxHeapTableSize() {
        return maxHeapTableSize;
    }

    /** ("max_connections") */
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
    private final Integer maxConnections;

    /**
     * ("max_connections")
     *
     * @return the value
     */
    public Integer getMaxConnections() {
        return maxConnections;
    }

    /** ("max_prepared_stmt_count") */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPreparedStmtCount")
    private final Integer maxPreparedStmtCount;

    /**
     * ("max_prepared_stmt_count")
     *
     * @return the value
     */
    public Integer getMaxPreparedStmtCount() {
        return maxPreparedStmtCount;
    }

    /**
     * The number of seconds that the mysqld server waits for a connect packet before responding
     * with Bad handshake.
     *
     * <p>connectTimeout corresponds to the MySQL system variable
     * [connect_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_connect_timeout)
     *
     * <p>Increasing the connect_timeout value might help if clients frequently encounter errors of
     * the form "Lost connection to MySQL server at 'XXX', system error: errno".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeout")
    private final Integer connectTimeout;

    /**
     * The number of seconds that the mysqld server waits for a connect packet before responding
     * with Bad handshake.
     *
     * <p>connectTimeout corresponds to the MySQL system variable
     * [connect_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_connect_timeout)
     *
     * <p>Increasing the connect_timeout value might help if clients frequently encounter errors of
     * the form "Lost connection to MySQL server at 'XXX', system error: errno".
     *
     * @return the value
     */
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    /** ("cte_max_recursion_depth") */
    @com.fasterxml.jackson.annotation.JsonProperty("cteMaxRecursionDepth")
    private final Long cteMaxRecursionDepth;

    /**
     * ("cte_max_recursion_depth")
     *
     * @return the value
     */
    public Long getCteMaxRecursionDepth() {
        return cteMaxRecursionDepth;
    }

    /**
     * ("generated_random_password_length") DEPRECATED -- variable should not be settable and will
     * be ignored
     */
    @com.fasterxml.jackson.annotation.JsonProperty("generatedRandomPasswordLength")
    private final Integer generatedRandomPasswordLength;

    /**
     * ("generated_random_password_length") DEPRECATED -- variable should not be settable and will
     * be ignored
     *
     * @return the value
     */
    public Integer getGeneratedRandomPasswordLength() {
        return generatedRandomPasswordLength;
    }

    /** ("information_schema_stats_expiry") */
    @com.fasterxml.jackson.annotation.JsonProperty("informationSchemaStatsExpiry")
    private final Integer informationSchemaStatsExpiry;

    /**
     * ("information_schema_stats_expiry")
     *
     * @return the value
     */
    public Integer getInformationSchemaStatsExpiry() {
        return informationSchemaStatsExpiry;
    }

    /**
     * Specifies the percentage of the most recently used pages for each buffer pool to read out and
     * dump.
     *
     * <p>innodbBufferPoolDumpPct corresponds to the MySQL InnoDB system variable
     * [innodb_buffer_pool_dump_pct](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_buffer_pool_dump_pct).
     *
     * <p>The range is 1 to 100. The default value is 25.
     *
     * <p>For example, if there are 4 buffer pools with 100 pages each, and
     * innodb_buffer_pool_dump_pct is set to 25, the 25 most recently used pages from each buffer
     * pool are dumped.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolDumpPct")
    private final Integer innodbBufferPoolDumpPct;

    /**
     * Specifies the percentage of the most recently used pages for each buffer pool to read out and
     * dump.
     *
     * <p>innodbBufferPoolDumpPct corresponds to the MySQL InnoDB system variable
     * [innodb_buffer_pool_dump_pct](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_buffer_pool_dump_pct).
     *
     * <p>The range is 1 to 100. The default value is 25.
     *
     * <p>For example, if there are 4 buffer pools with 100 pages each, and
     * innodb_buffer_pool_dump_pct is set to 25, the 25 most recently used pages from each buffer
     * pool are dumped.
     *
     * @return the value
     */
    public Integer getInnodbBufferPoolDumpPct() {
        return innodbBufferPoolDumpPct;
    }

    /** ("innodb_buffer_pool_instances") */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolInstances")
    private final Integer innodbBufferPoolInstances;

    /**
     * ("innodb_buffer_pool_instances")
     *
     * @return the value
     */
    public Integer getInnodbBufferPoolInstances() {
        return innodbBufferPoolInstances;
    }

    /**
     * innodbDdlBufferSize corresponds to the MySQL system variable [innodb_ddl_buffer_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_ddl_buffer_size)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbDdlBufferSize")
    private final Long innodbDdlBufferSize;

    /**
     * innodbDdlBufferSize corresponds to the MySQL system variable [innodb_ddl_buffer_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_ddl_buffer_size)
     *
     * @return the value
     */
    public Long getInnodbDdlBufferSize() {
        return innodbDdlBufferSize;
    }

    /**
     * innodbDdlThreads corresponds to the MySQL system variable [innodb_ddl_threads]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_ddl_threads)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbDdlThreads")
    private final Integer innodbDdlThreads;

    /**
     * innodbDdlThreads corresponds to the MySQL system variable [innodb_ddl_threads]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_ddl_threads)
     *
     * @return the value
     */
    public Integer getInnodbDdlThreads() {
        return innodbDdlThreads;
    }

    /** ("innodb_ft_max_token_size") */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMaxTokenSize")
    private final Integer innodbFtMaxTokenSize;

    /**
     * ("innodb_ft_max_token_size")
     *
     * @return the value
     */
    public Integer getInnodbFtMaxTokenSize() {
        return innodbFtMaxTokenSize;
    }

    /** ("innodb_ft_min_token_size") */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMinTokenSize")
    private final Integer innodbFtMinTokenSize;

    /**
     * ("innodb_ft_min_token_size")
     *
     * @return the value
     */
    public Integer getInnodbFtMinTokenSize() {
        return innodbFtMinTokenSize;
    }

    /** ("innodb_ft_num_word_optimize") */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtNumWordOptimize")
    private final Integer innodbFtNumWordOptimize;

    /**
     * ("innodb_ft_num_word_optimize")
     *
     * @return the value
     */
    public Integer getInnodbFtNumWordOptimize() {
        return innodbFtNumWordOptimize;
    }

    /** ("innodb_lock_wait_timeout") */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbLockWaitTimeout")
    private final Integer innodbLockWaitTimeout;

    /**
     * ("innodb_lock_wait_timeout")
     *
     * @return the value
     */
    public Integer getInnodbLockWaitTimeout() {
        return innodbLockWaitTimeout;
    }

    /**
     * The desired maximum purge lag in terms of transactions.
     *
     * <p>InnoDB maintains a list of transactions that have index records delete-marked by UPDATE or
     * DELETE operations. The length of the list is the purge lag.
     *
     * <p>If this value is exceeded, a delay is imposed on INSERT, UPDATE, and DELETE operations to
     * allow time for purge to catch up.
     *
     * <p>The default value is 0, which means there is no maximum purge lag and no delay.
     *
     * <p>innodbMaxPurgeLag corresponds to the MySQL server system variable
     * [innodb_max_purge_lag](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_max_purge_lag).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLag")
    private final Long innodbMaxPurgeLag;

    /**
     * The desired maximum purge lag in terms of transactions.
     *
     * <p>InnoDB maintains a list of transactions that have index records delete-marked by UPDATE or
     * DELETE operations. The length of the list is the purge lag.
     *
     * <p>If this value is exceeded, a delay is imposed on INSERT, UPDATE, and DELETE operations to
     * allow time for purge to catch up.
     *
     * <p>The default value is 0, which means there is no maximum purge lag and no delay.
     *
     * <p>innodbMaxPurgeLag corresponds to the MySQL server system variable
     * [innodb_max_purge_lag](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_max_purge_lag).
     *
     * @return the value
     */
    public Long getInnodbMaxPurgeLag() {
        return innodbMaxPurgeLag;
    }

    /**
     * The maximum delay in microseconds for the delay imposed when the innodb_max_purge_lag
     * threshold is exceeded.
     *
     * <p>The specified innodb_max_purge_lag_delay value is an upper limit on the delay period.
     *
     * <p>innodbMaxPurgeLagDelay corresponds to the MySQL server system variable
     * [innodb_max_purge_lag_delay](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_max_purge_lag_delay).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLagDelay")
    private final Integer innodbMaxPurgeLagDelay;

    /**
     * The maximum delay in microseconds for the delay imposed when the innodb_max_purge_lag
     * threshold is exceeded.
     *
     * <p>The specified innodb_max_purge_lag_delay value is an upper limit on the delay period.
     *
     * <p>innodbMaxPurgeLagDelay corresponds to the MySQL server system variable
     * [innodb_max_purge_lag_delay](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_max_purge_lag_delay).
     *
     * @return the value
     */
    public Integer getInnodbMaxPurgeLagDelay() {
        return innodbMaxPurgeLagDelay;
    }

    /**
     * The number of seconds the server waits for activity on an interactive connection before
     * closing it.
     *
     * <p>interactiveTimeout corresponds to the MySQL system variable.
     * [interactive_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_interactive_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interactiveTimeout")
    private final Integer interactiveTimeout;

    /**
     * The number of seconds the server waits for activity on an interactive connection before
     * closing it.
     *
     * <p>interactiveTimeout corresponds to the MySQL system variable.
     * [interactive_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_interactive_timeout)
     *
     * @return the value
     */
    public Integer getInteractiveTimeout() {
        return interactiveTimeout;
    }

    /**
     * The number of index pages to sample when estimating cardinality and other statistics for an
     * indexed column, such as those calculated by ANALYZE TABLE.
     *
     * <p>innodbStatsPersistentSamplePages corresponds to the MySQL InnoDB system variable
     * [innodb_stats_persistent_sample_pages](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_stats_persistent_sample_pages)
     *
     * <p>innodb_stats_persistent_sample_pages only applies when innodb_stats_persistent is enabled
     * for a table; when innodb_stats_persistent is disabled, innodb_stats_transient_sample_pages
     * applies instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbStatsPersistentSamplePages")
    private final Long innodbStatsPersistentSamplePages;

    /**
     * The number of index pages to sample when estimating cardinality and other statistics for an
     * indexed column, such as those calculated by ANALYZE TABLE.
     *
     * <p>innodbStatsPersistentSamplePages corresponds to the MySQL InnoDB system variable
     * [innodb_stats_persistent_sample_pages](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_stats_persistent_sample_pages)
     *
     * <p>innodb_stats_persistent_sample_pages only applies when innodb_stats_persistent is enabled
     * for a table; when innodb_stats_persistent is disabled, innodb_stats_transient_sample_pages
     * applies instead.
     *
     * @return the value
     */
    public Long getInnodbStatsPersistentSamplePages() {
        return innodbStatsPersistentSamplePages;
    }

    /**
     * The number of index pages to sample when estimating cardinality and other statistics for an
     * indexed column, such as those calculated by [ANALYZE
     * TABLE](https://dev.mysql.com/doc/refman/8.0/en/analyze-table.html).
     *
     * <p>innodbStatsTransientSamplePages corresponds to the MySQL InnoDB system variable
     * [innodb_stats_transient_sample_pages](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_stats_transient_sample_pages)
     *
     * <p>innodb_stats_transient_sample_pages only applies when innodb_stats_persistent is disabled
     * for a table; when innodb_stats_persistent is enabled, innodb_stats_persistent_sample_pages
     * applies instead.
     *
     * <p>innodb_stats_persistent is ON by default and cannot be changed. It is possible to override
     * it using the STATS_PERSISTENT clause of the [CREATE
     * TABLE](https://dev.mysql.com/doc/refman/8.0/en/create-table.html) and [ALTER
     * TABLE](https://dev.mysql.com/doc/refman/8.0/en/alter-table.html) statements.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbStatsTransientSamplePages")
    private final Long innodbStatsTransientSamplePages;

    /**
     * The number of index pages to sample when estimating cardinality and other statistics for an
     * indexed column, such as those calculated by [ANALYZE
     * TABLE](https://dev.mysql.com/doc/refman/8.0/en/analyze-table.html).
     *
     * <p>innodbStatsTransientSamplePages corresponds to the MySQL InnoDB system variable
     * [innodb_stats_transient_sample_pages](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_stats_transient_sample_pages)
     *
     * <p>innodb_stats_transient_sample_pages only applies when innodb_stats_persistent is disabled
     * for a table; when innodb_stats_persistent is enabled, innodb_stats_persistent_sample_pages
     * applies instead.
     *
     * <p>innodb_stats_persistent is ON by default and cannot be changed. It is possible to override
     * it using the STATS_PERSISTENT clause of the [CREATE
     * TABLE](https://dev.mysql.com/doc/refman/8.0/en/create-table.html) and [ALTER
     * TABLE](https://dev.mysql.com/doc/refman/8.0/en/alter-table.html) statements.
     *
     * @return the value
     */
    public Long getInnodbStatsTransientSamplePages() {
        return innodbStatsTransientSamplePages;
    }

    /**
     * When you enable innodbStrictMode, the InnoDB storage engine returns errors instead of
     * warnings for invalid or incompatible table options.
     *
     * <p>innodbStrictMode corresponds to the MySQL InnoDB system variable
     * [innodb_strict_mode](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_strict_mode)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbStrictMode")
    private final Boolean innodbStrictMode;

    /**
     * When you enable innodbStrictMode, the InnoDB storage engine returns errors instead of
     * warnings for invalid or incompatible table options.
     *
     * <p>innodbStrictMode corresponds to the MySQL InnoDB system variable
     * [innodb_strict_mode](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_strict_mode)
     *
     * @return the value
     */
    public Boolean getInnodbStrictMode() {
        return innodbStrictMode;
    }

    /**
     * The maximum size of one packet or any generated/intermediate string.
     *
     * <p>This is the mysql variable "max_allowed_packet".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAllowedPacket")
    private final Integer maxAllowedPacket;

    /**
     * The maximum size of one packet or any generated/intermediate string.
     *
     * <p>This is the mysql variable "max_allowed_packet".
     *
     * @return the value
     */
    public Integer getMaxAllowedPacket() {
        return maxAllowedPacket;
    }

    /** ("max_execution_time") */
    @com.fasterxml.jackson.annotation.JsonProperty("maxExecutionTime")
    private final Long maxExecutionTime;

    /**
     * ("max_execution_time")
     *
     * @return the value
     */
    public Long getMaxExecutionTime() {
        return maxExecutionTime;
    }

    /**
     * The number of seconds X Plugin waits for the first packet to be received from newly connected
     * clients.
     *
     * <p>mysqlxConnectTimeout corresponds to the MySQL X Plugin system variable
     * [mysqlx_connect_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_connect_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxConnectTimeout")
    private final Integer mysqlxConnectTimeout;

    /**
     * The number of seconds X Plugin waits for the first packet to be received from newly connected
     * clients.
     *
     * <p>mysqlxConnectTimeout corresponds to the MySQL X Plugin system variable
     * [mysqlx_connect_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_connect_timeout)
     *
     * @return the value
     */
    public Integer getMysqlxConnectTimeout() {
        return mysqlxConnectTimeout;
    }

    /**
     * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and will
     * be ignored
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDocumentIdUniquePrefix")
    private final Integer mysqlxDocumentIdUniquePrefix;

    /**
     * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and will
     * be ignored
     *
     * @return the value
     */
    public Integer getMysqlxDocumentIdUniquePrefix() {
        return mysqlxDocumentIdUniquePrefix;
    }

    /**
     * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and will
     * be ignored
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxIdleWorkerThreadTimeout")
    private final Integer mysqlxIdleWorkerThreadTimeout;

    /**
     * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and will
     * be ignored
     *
     * @return the value
     */
    public Integer getMysqlxIdleWorkerThreadTimeout() {
        return mysqlxIdleWorkerThreadTimeout;
    }

    /**
     * The number of seconds to wait for interactive clients to timeout.
     *
     * <p>mysqlxInteractiveTimeout corresponds to the MySQL X Plugin system variable.
     * [mysqlx_interactive_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_interactive_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxInteractiveTimeout")
    private final Integer mysqlxInteractiveTimeout;

    /**
     * The number of seconds to wait for interactive clients to timeout.
     *
     * <p>mysqlxInteractiveTimeout corresponds to the MySQL X Plugin system variable.
     * [mysqlx_interactive_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_interactive_timeout)
     *
     * @return the value
     */
    public Integer getMysqlxInteractiveTimeout() {
        return mysqlxInteractiveTimeout;
    }

    /**
     * The maximum size of network packets that can be received by X Plugin.
     *
     * <p>This is the mysql variable "mysqlx_max_allowed_packet".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMaxAllowedPacket")
    private final Integer mysqlxMaxAllowedPacket;

    /**
     * The maximum size of network packets that can be received by X Plugin.
     *
     * <p>This is the mysql variable "mysqlx_max_allowed_packet".
     *
     * @return the value
     */
    public Integer getMysqlxMaxAllowedPacket() {
        return mysqlxMaxAllowedPacket;
    }

    /**
     * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be
     * ignored
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMinWorkerThreads")
    private final Integer mysqlxMinWorkerThreads;

    /**
     * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be
     * ignored
     *
     * @return the value
     */
    public Integer getMysqlxMinWorkerThreads() {
        return mysqlxMinWorkerThreads;
    }

    /**
     * The number of seconds that X Plugin waits for blocking read operations to complete. After
     * this time, if the read operation is not successful, X Plugin closes the connection and
     * returns a warning notice with the error code ER_IO_READ_ERROR to the client application.
     *
     * <p>mysqlxReadTimeout corresponds to the MySQL X Plugin system variable
     * [mysqlx_read_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_read_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxReadTimeout")
    private final Integer mysqlxReadTimeout;

    /**
     * The number of seconds that X Plugin waits for blocking read operations to complete. After
     * this time, if the read operation is not successful, X Plugin closes the connection and
     * returns a warning notice with the error code ER_IO_READ_ERROR to the client application.
     *
     * <p>mysqlxReadTimeout corresponds to the MySQL X Plugin system variable
     * [mysqlx_read_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_read_timeout)
     *
     * @return the value
     */
    public Integer getMysqlxReadTimeout() {
        return mysqlxReadTimeout;
    }

    /**
     * The number of seconds that X Plugin waits for activity on a connection.
     *
     * <p>mysqlxWaitTimeout corresponds to the MySQL X Plugin system variable.
     * [mysqlx_wait_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_wait_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWaitTimeout")
    private final Integer mysqlxWaitTimeout;

    /**
     * The number of seconds that X Plugin waits for activity on a connection.
     *
     * <p>mysqlxWaitTimeout corresponds to the MySQL X Plugin system variable.
     * [mysqlx_wait_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_wait_timeout)
     *
     * @return the value
     */
    public Integer getMysqlxWaitTimeout() {
        return mysqlxWaitTimeout;
    }

    /**
     * The number of seconds that X Plugin waits for blocking write operations to complete. After
     * this time, if the write operation is not successful, X Plugin closes the connection.
     *
     * <p>mysqlxReadmysqlxWriteTimeoutTimeout corresponds to the MySQL X Plugin system variable
     * [mysqlx_write_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_write_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWriteTimeout")
    private final Integer mysqlxWriteTimeout;

    /**
     * The number of seconds that X Plugin waits for blocking write operations to complete. After
     * this time, if the write operation is not successful, X Plugin closes the connection.
     *
     * <p>mysqlxReadmysqlxWriteTimeoutTimeout corresponds to the MySQL X Plugin system variable
     * [mysqlx_write_timeout](https://dev.mysql.com/doc/refman/8.0/en/x-plugin-options-system-variables.html#sysvar_mysqlx_write_timeout)
     *
     * @return the value
     */
    public Integer getMysqlxWriteTimeout() {
        return mysqlxWriteTimeout;
    }

    /**
     * The number of seconds to wait for more data from a connection before aborting the read.
     *
     * <p>netReadTimeout corresponds to the MySQL system variable
     * [net_read_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_net_read_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("netReadTimeout")
    private final Integer netReadTimeout;

    /**
     * The number of seconds to wait for more data from a connection before aborting the read.
     *
     * <p>netReadTimeout corresponds to the MySQL system variable
     * [net_read_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_net_read_timeout)
     *
     * @return the value
     */
    public Integer getNetReadTimeout() {
        return netReadTimeout;
    }

    /**
     * The number of seconds to wait for a block to be written to a connection before aborting the
     * write.
     *
     * <p>netWriteTimeout corresponds to the MySQL system variable
     * [net_write_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_net_write_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("netWriteTimeout")
    private final Integer netWriteTimeout;

    /**
     * The number of seconds to wait for a block to be written to a connection before aborting the
     * write.
     *
     * <p>netWriteTimeout corresponds to the MySQL system variable
     * [net_write_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_net_write_timeout)
     *
     * @return the value
     */
    public Integer getNetWriteTimeout() {
        return netWriteTimeout;
    }

    /** ("parser_max_mem_size") */
    @com.fasterxml.jackson.annotation.JsonProperty("parserMaxMemSize")
    private final Long parserMaxMemSize;

    /**
     * ("parser_max_mem_size")
     *
     * @return the value
     */
    public Long getParserMaxMemSize() {
        return parserMaxMemSize;
    }

    /**
     * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be ignored
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryAllocBlockSize")
    private final Long queryAllocBlockSize;

    /**
     * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be ignored
     *
     * @return the value
     */
    public Long getQueryAllocBlockSize() {
        return queryAllocBlockSize;
    }

    /** ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored */
    @com.fasterxml.jackson.annotation.JsonProperty("queryPreallocSize")
    private final Long queryPreallocSize;

    /**
     * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
     *
     * @return the value
     */
    public Long getQueryPreallocSize() {
        return queryPreallocSize;
    }

    /**
     * regexpTimeLimit corresponds to the MySQL system variable [regexp_time_limit]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_regexp_time_limit)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regexpTimeLimit")
    private final Integer regexpTimeLimit;

    /**
     * regexpTimeLimit corresponds to the MySQL system variable [regexp_time_limit]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_regexp_time_limit)
     *
     * @return the value
     */
    public Integer getRegexpTimeLimit() {
        return regexpTimeLimit;
    }

    /** ("sql_mode") */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlMode")
    private final String sqlMode;

    /**
     * ("sql_mode")
     *
     * @return the value
     */
    public String getSqlMode() {
        return sqlMode;
    }

    /**
     * The maximum size of internal in-memory temporary tables. This variable does not apply to
     * user-created MEMORY tables.
     *
     * <p>tmp_table_size corresponds to the MySQL system variable
     * [tmp_table_size](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_tmp_table_size)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tmpTableSize")
    private final Long tmpTableSize;

    /**
     * The maximum size of internal in-memory temporary tables. This variable does not apply to
     * user-created MEMORY tables.
     *
     * <p>tmp_table_size corresponds to the MySQL system variable
     * [tmp_table_size](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_tmp_table_size)
     *
     * @return the value
     */
    public Long getTmpTableSize() {
        return tmpTableSize;
    }

    /**
     * Set the default compression level for the deflate algorithm.
     * ("mysqlx_deflate_default_compression_level")
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateDefaultCompressionLevel")
    private final Integer mysqlxDeflateDefaultCompressionLevel;

    /**
     * Set the default compression level for the deflate algorithm.
     * ("mysqlx_deflate_default_compression_level")
     *
     * @return the value
     */
    public Integer getMysqlxDeflateDefaultCompressionLevel() {
        return mysqlxDeflateDefaultCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the deflate algorithm.
     * ("mysqlx_deflate_max_client_compression_level")
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateMaxClientCompressionLevel")
    private final Integer mysqlxDeflateMaxClientCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the deflate algorithm.
     * ("mysqlx_deflate_max_client_compression_level")
     *
     * @return the value
     */
    public Integer getMysqlxDeflateMaxClientCompressionLevel() {
        return mysqlxDeflateMaxClientCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the lz4 algorithm.
     * ("mysqlx_lz4_max_client_compression_level")
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4MaxClientCompressionLevel")
    private final Integer mysqlxLz4MaxClientCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the lz4 algorithm.
     * ("mysqlx_lz4_max_client_compression_level")
     *
     * @return the value
     */
    public Integer getMysqlxLz4MaxClientCompressionLevel() {
        return mysqlxLz4MaxClientCompressionLevel;
    }

    /**
     * Set the default compression level for the lz4 algorithm.
     * ("mysqlx_lz4_default_compression_level")
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4DefaultCompressionLevel")
    private final Integer mysqlxLz4DefaultCompressionLevel;

    /**
     * Set the default compression level for the lz4 algorithm.
     * ("mysqlx_lz4_default_compression_level")
     *
     * @return the value
     */
    public Integer getMysqlxLz4DefaultCompressionLevel() {
        return mysqlxLz4DefaultCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the zstd algorithm.
     * ("mysqlx_zstd_max_client_compression_level")
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdMaxClientCompressionLevel")
    private final Integer mysqlxZstdMaxClientCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the zstd algorithm.
     * ("mysqlx_zstd_max_client_compression_level")
     *
     * @return the value
     */
    public Integer getMysqlxZstdMaxClientCompressionLevel() {
        return mysqlxZstdMaxClientCompressionLevel;
    }

    /**
     * Set the default compression level for the zstd algorithm.
     * ("mysqlx_zstd_default_compression_level")
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdDefaultCompressionLevel")
    private final Integer mysqlxZstdDefaultCompressionLevel;

    /**
     * Set the default compression level for the zstd algorithm.
     * ("mysqlx_zstd_default_compression_level")
     *
     * @return the value
     */
    public Integer getMysqlxZstdDefaultCompressionLevel() {
        return mysqlxZstdDefaultCompressionLevel;
    }

    /** DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored. */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlZstdDefaultCompressionLevel")
    private final Integer mysqlZstdDefaultCompressionLevel;

    /**
     * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
     *
     * @return the value
     */
    public Integer getMysqlZstdDefaultCompressionLevel() {
        return mysqlZstdDefaultCompressionLevel;
    }

    /**
     * Each session that must perform a sort allocates a buffer of this size.
     *
     * <p>sortBufferSize corresponds to the MySQL system variable
     * [sort_buffer_size](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_sort_buffer_size)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sortBufferSize")
    private final Long sortBufferSize;

    /**
     * Each session that must perform a sort allocates a buffer of this size.
     *
     * <p>sortBufferSize corresponds to the MySQL system variable
     * [sort_buffer_size](https://dev.mysql.com/doc/refman/en/server-system-variables.html#sysvar_sort_buffer_size)
     *
     * @return the value
     */
    public Long getSortBufferSize() {
        return sortBufferSize;
    }

    /**
     * The number of seconds the server waits for activity on a noninteractive connection before
     * closing it.
     *
     * <p>waitTimeout corresponds to the MySQL system variable.
     * [wait_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_wait_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("waitTimeout")
    private final Integer waitTimeout;

    /**
     * The number of seconds the server waits for activity on a noninteractive connection before
     * closing it.
     *
     * <p>waitTimeout corresponds to the MySQL system variable.
     * [wait_timeout](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_wait_timeout)
     *
     * @return the value
     */
    public Integer getWaitTimeout() {
        return waitTimeout;
    }

    /**
     * Controls whether the thread pool uses dedicated listener threads. If enabled, a listener
     * thread in each thread group is dedicated to the task of listening for network events from
     * clients, ensuring that the maximum number of query worker threads is no more than the value
     * specified by threadPoolMaxTransactionsLimit. threadPoolDedicatedListeners corresponds to the
     * MySQL Database Service-specific system variable thread_pool_dedicated_listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threadPoolDedicatedListeners")
    private final Boolean threadPoolDedicatedListeners;

    /**
     * Controls whether the thread pool uses dedicated listener threads. If enabled, a listener
     * thread in each thread group is dedicated to the task of listening for network events from
     * clients, ensuring that the maximum number of query worker threads is no more than the value
     * specified by threadPoolMaxTransactionsLimit. threadPoolDedicatedListeners corresponds to the
     * MySQL Database Service-specific system variable thread_pool_dedicated_listeners.
     *
     * @return the value
     */
    public Boolean getThreadPoolDedicatedListeners() {
        return threadPoolDedicatedListeners;
    }

    /**
     * Limits the maximum number of open transactions to the defined value. The default value is 0,
     * which enforces no limit. threadPoolMaxTransactionsLimit corresponds to the MySQL Database
     * Service-specific system variable thread_pool_max_transactions_limit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threadPoolMaxTransactionsLimit")
    private final Integer threadPoolMaxTransactionsLimit;

    /**
     * Limits the maximum number of open transactions to the defined value. The default value is 0,
     * which enforces no limit. threadPoolMaxTransactionsLimit corresponds to the MySQL Database
     * Service-specific system variable thread_pool_max_transactions_limit.
     *
     * @return the value
     */
    public Integer getThreadPoolMaxTransactionsLimit() {
        return threadPoolMaxTransactionsLimit;
    }

    /**
     * Initializes the time zone for each client that connects.
     *
     * <p>This corresponds to the MySQL System Variable "time_zone".
     *
     * <p>The values can be given in one of the following formats, none of which are case-sensitive:
     *
     * <p>- As a string indicating an offset from UTC of the form [H]H:MM, prefixed with a + or -,
     * such as '+10:00', '-6:00', or '+05:30'. The permitted range is '-13:59' to '+14:00',
     * inclusive. - As a named time zone, as defined by the "IANA Time Zone database", such as
     * 'Europe/Helsinki', 'US/Eastern', 'MET', or 'UTC'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * Initializes the time zone for each client that connects.
     *
     * <p>This corresponds to the MySQL System Variable "time_zone".
     *
     * <p>The values can be given in one of the following formats, none of which are case-sensitive:
     *
     * <p>- As a string indicating an offset from UTC of the form [H]H:MM, prefixed with a + or -,
     * such as '+10:00', '-6:00', or '+05:30'. The permitted range is '-13:59' to '+14:00',
     * inclusive. - As a named time zone, as defined by the "IANA Time Zone database", such as
     * 'Europe/Helsinki', 'US/Eastern', 'MET', or 'UTC'.
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * This variable controls the block encryption mode for block-based algorithms such as AES. It
     * affects encryption for AES_ENCRYPT() and AES_DECRYPT().
     *
     * <p>block_encryption_mode takes a value in aes-keylen-mode format, where keylen is the key
     * length in bits and mode is the encryption mode. The value is not case-sensitive. Permitted
     * keylen values are 128, 192, and 256. Permitted mode values are ECB, CBC, CFB1, CFB8, CFB128,
     * and OFB.
     *
     * <p>block_encryption_mode corresponds to the MySQL Server Administration system variable
     * [block_encryption_mode](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_block_encryption_mode)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockEncryptionMode")
    private final String blockEncryptionMode;

    /**
     * This variable controls the block encryption mode for block-based algorithms such as AES. It
     * affects encryption for AES_ENCRYPT() and AES_DECRYPT().
     *
     * <p>block_encryption_mode takes a value in aes-keylen-mode format, where keylen is the key
     * length in bits and mode is the encryption mode. The value is not case-sensitive. Permitted
     * keylen values are 128, 192, and 256. Permitted mode values are ECB, CBC, CFB1, CFB8, CFB128,
     * and OFB.
     *
     * <p>block_encryption_mode corresponds to the MySQL Server Administration system variable
     * [block_encryption_mode](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_block_encryption_mode)
     *
     * @return the value
     */
    public String getBlockEncryptionMode() {
        return blockEncryptionMode;
    }

    /**
     * Controls how many microseconds the binary log commit waits before synchronizing the binary
     * log file to disk. There is no delay by default. Setting this variable to a microsecond delay
     * enables more transactions to be synchronized together to disk at once, reducing the overall
     * time to commit a group of transactions because the larger groups required fewer time units
     * per group.
     *
     * <p>binlogGroupCommitSyncDelay corresponds to the MySQL Replication system variable
     * [binlog_group_commit_sync_delay](https://dev.mysql.com/doc/refman/5.7/en/replication-options-binary-log.html#sysvar_binlog_group_commit_sync_delay)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binlogGroupCommitSyncDelay")
    private final Integer binlogGroupCommitSyncDelay;

    /**
     * Controls how many microseconds the binary log commit waits before synchronizing the binary
     * log file to disk. There is no delay by default. Setting this variable to a microsecond delay
     * enables more transactions to be synchronized together to disk at once, reducing the overall
     * time to commit a group of transactions because the larger groups required fewer time units
     * per group.
     *
     * <p>binlogGroupCommitSyncDelay corresponds to the MySQL Replication system variable
     * [binlog_group_commit_sync_delay](https://dev.mysql.com/doc/refman/5.7/en/replication-options-binary-log.html#sysvar_binlog_group_commit_sync_delay)
     *
     * @return the value
     */
    public Integer getBinlogGroupCommitSyncDelay() {
        return binlogGroupCommitSyncDelay;
    }

    /**
     * The maximum number of transactions to wait for before aborting the current delay as specified
     * by binlog_group_commit_sync_delay. If binlog_group_commit_sync_delay is set to 0, then this
     * option has no effect.
     *
     * <p>binlogGroupCommitSyncNoDelayCount corresponds to the MySQL Replication system variable
     * [binlog_group_commit_sync_no_delay_count](https://dev.mysql.com/doc/refman/5.7/en/replication-options-binary-log.html#sysvar_binlog_group_commit_sync_no_delay_count)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binlogGroupCommitSyncNoDelayCount")
    private final Integer binlogGroupCommitSyncNoDelayCount;

    /**
     * The maximum number of transactions to wait for before aborting the current delay as specified
     * by binlog_group_commit_sync_delay. If binlog_group_commit_sync_delay is set to 0, then this
     * option has no effect.
     *
     * <p>binlogGroupCommitSyncNoDelayCount corresponds to the MySQL Replication system variable
     * [binlog_group_commit_sync_no_delay_count](https://dev.mysql.com/doc/refman/5.7/en/replication-options-binary-log.html#sysvar_binlog_group_commit_sync_no_delay_count)
     *
     * @return the value
     */
    public Integer getBinlogGroupCommitSyncNoDelayCount() {
        return binlogGroupCommitSyncNoDelayCount;
    }

    /**
     * Specifies the number of seconds to wait for more data or a heartbeat signal from the source
     * before the replica considers the connection broken, aborts the read, and tries to reconnect.
     * Setting this variable has no immediate effect. The state of the variable applies on all
     * subsequent START REPLICA commands.
     *
     * <p>replicaNetTimeout corresponds to the MySQL Replica server system variable
     * [replica_net_timeout](https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_net_timeout)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaNetTimeout")
    private final Integer replicaNetTimeout;

    /**
     * Specifies the number of seconds to wait for more data or a heartbeat signal from the source
     * before the replica considers the connection broken, aborts the read, and tries to reconnect.
     * Setting this variable has no immediate effect. The state of the variable applies on all
     * subsequent START REPLICA commands.
     *
     * <p>replicaNetTimeout corresponds to the MySQL Replica server system variable
     * [replica_net_timeout](https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_net_timeout)
     *
     * @return the value
     */
    public Integer getReplicaNetTimeout() {
        return replicaNetTimeout;
    }

    /**
     * Whether client connections to the server are required to use some form of secure transport.
     * When this variable is enabled, the server permits only TCP/IP connections encrypted using
     * TLS/SSL, or connections that use a socket file or shared memory. The server rejects nonsecure
     * connection attempts, which fail with an ER_SECURE_TRANSPORT_REQUIRED error.
     *
     * <p>require_secure_transport corresponds to the MySQL Server Administration system variable
     * [require_secure_transport](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_require_secure_transport)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requireSecureTransport")
    private final Boolean requireSecureTransport;

    /**
     * Whether client connections to the server are required to use some form of secure transport.
     * When this variable is enabled, the server permits only TCP/IP connections encrypted using
     * TLS/SSL, or connections that use a socket file or shared memory. The server rejects nonsecure
     * connection attempts, which fail with an ER_SECURE_TRANSPORT_REQUIRED error.
     *
     * <p>require_secure_transport corresponds to the MySQL Server Administration system variable
     * [require_secure_transport](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_require_secure_transport)
     *
     * @return the value
     */
    public Boolean getRequireSecureTransport() {
        return requireSecureTransport;
    }

    /**
     * Defines the amount of disk space occupied by redo log files. innodb_redo_log_capacity
     * supercedes the innodb_log_files_in_group and innodb_log_file_size variables, which are both
     * ignored if innodb_redo_log_capacity is defined. If innodb_redo_log_capacity is not defined,
     * and if neither innodb_log_file_size or innodb_log_files_in_group are defined, then the
     * default innodb_redo_log_capacity value is used.
     *
     * <p>innodbRedoLogCapacity corresponds to the InnoDB Startup Options and System Variables
     * [innodb_redo_log_capacity](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_redo_log_capacity)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbRedoLogCapacity")
    private final Long innodbRedoLogCapacity;

    /**
     * Defines the amount of disk space occupied by redo log files. innodb_redo_log_capacity
     * supercedes the innodb_log_files_in_group and innodb_log_file_size variables, which are both
     * ignored if innodb_redo_log_capacity is defined. If innodb_redo_log_capacity is not defined,
     * and if neither innodb_log_file_size or innodb_log_files_in_group are defined, then the
     * default innodb_redo_log_capacity value is used.
     *
     * <p>innodbRedoLogCapacity corresponds to the InnoDB Startup Options and System Variables
     * [innodb_redo_log_capacity](https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_redo_log_capacity)
     *
     * @return the value
     */
    public Long getInnodbRedoLogCapacity() {
        return innodbRedoLogCapacity;
    }

    /**
     * The delay period before executing a new transaction, in milliseconds. The maximum value is
     * 300000 (5 minutes). A transaction delay can be used in cases where parallel transactions
     * affect the performance of other operations due to resource contention. For example, if
     * parallel transactions affect index creation or an online buffer pool resizing operation, you
     * can configure a transaction delay to reduce resource contention while those operations are
     * running.
     *
     * <p>threadPoolTransactionDelay corresponds to the MySQL Server system variable
     * [thread_pool_transaction_delay](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_transaction_delay)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threadPoolTransactionDelay")
    private final Integer threadPoolTransactionDelay;

    /**
     * The delay period before executing a new transaction, in milliseconds. The maximum value is
     * 300000 (5 minutes). A transaction delay can be used in cases where parallel transactions
     * affect the performance of other operations due to resource contention. For example, if
     * parallel transactions affect index creation or an online buffer pool resizing operation, you
     * can configure a transaction delay to reduce resource contention while those operations are
     * running.
     *
     * <p>threadPoolTransactionDelay corresponds to the MySQL Server system variable
     * [thread_pool_transaction_delay](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_transaction_delay)
     *
     * @return the value
     */
    public Integer getThreadPoolTransactionDelay() {
        return threadPoolTransactionDelay;
    }

    /**
     * The maximum number of query threads permitted in a thread group. The maximum value is 4096,
     * but if thread_pool_max_transactions_limit is set, thread_pool_query_threads_per_group must
     * not exceed that value. The default value of 1 means there is one active query thread in each
     * thread group, which works well for many loads. When you are using the high concurrency thread
     * pool algorithm (thread_pool_algorithm = 1), consider increasing the value if you experience
     * slower response times due to long-running transactions.
     *
     * <p>threadPoolQueryThreadsPerGroup corresponds to the MySQL Server system variable
     * [thread_pool_query_threads_per_group](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_query_threads_per_group)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threadPoolQueryThreadsPerGroup")
    private final Integer threadPoolQueryThreadsPerGroup;

    /**
     * The maximum number of query threads permitted in a thread group. The maximum value is 4096,
     * but if thread_pool_max_transactions_limit is set, thread_pool_query_threads_per_group must
     * not exceed that value. The default value of 1 means there is one active query thread in each
     * thread group, which works well for many loads. When you are using the high concurrency thread
     * pool algorithm (thread_pool_algorithm = 1), consider increasing the value if you experience
     * slower response times due to long-running transactions.
     *
     * <p>threadPoolQueryThreadsPerGroup corresponds to the MySQL Server system variable
     * [thread_pool_query_threads_per_group](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_query_threads_per_group)
     *
     * @return the value
     */
    public Integer getThreadPoolQueryThreadsPerGroup() {
        return threadPoolQueryThreadsPerGroup;
    }

    /**
     * This variable determines the default output format used by EXPLAIN in the absence of a FORMAT
     * option when displaying a query execution plan.
     *
     * <p>explainFormat corresponds to the MySQL system variable
     * [explain_format](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explain_format).
     */
    public enum ExplainFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Traditional("TRADITIONAL"),
        Json("JSON"),
        Tree("TREE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExplainFormat.class);

        private final String value;
        private static java.util.Map<String, ExplainFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (ExplainFormat v : ExplainFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExplainFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExplainFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExplainFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This variable determines the default output format used by EXPLAIN in the absence of a FORMAT
     * option when displaying a query execution plan.
     *
     * <p>explainFormat corresponds to the MySQL system variable
     * [explain_format](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explain_format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("explainFormat")
    private final ExplainFormat explainFormat;

    /**
     * This variable determines the default output format used by EXPLAIN in the absence of a FORMAT
     * option when displaying a query execution plan.
     *
     * <p>explainFormat corresponds to the MySQL system variable
     * [explain_format](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explain_format).
     *
     * @return the value
     */
    public ExplainFormat getExplainFormat() {
        return explainFormat;
    }

    /**
     * This system variable determines whether the server enables certain nonstandard behaviors for
     * default values and NULL-value handling in TIMESTAMP columns. By default,
     * explicit_defaults_for_timestamp is enabled, which disables the nonstandard behaviors.
     * Disabling explicit_defaults_for_timestamp results in a warning.
     *
     * <p>explicit_defaults_for_timestamp corresponds to the MySQL Server Administration system
     * variable
     * [explicit_defaults_for_timestamp](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explicit_defaults_for_timestamp)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("explicitDefaultsForTimestamp")
    private final Boolean explicitDefaultsForTimestamp;

    /**
     * This system variable determines whether the server enables certain nonstandard behaviors for
     * default values and NULL-value handling in TIMESTAMP columns. By default,
     * explicit_defaults_for_timestamp is enabled, which disables the nonstandard behaviors.
     * Disabling explicit_defaults_for_timestamp results in a warning.
     *
     * <p>explicit_defaults_for_timestamp corresponds to the MySQL Server Administration system
     * variable
     * [explicit_defaults_for_timestamp](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_explicit_defaults_for_timestamp)
     *
     * @return the value
     */
    public Boolean getExplicitDefaultsForTimestamp() {
        return explicitDefaultsForTimestamp;
    }

    /**
     * Whether GIPK mode is in effect, in which case a MySQL replication source server adds a
     * generated invisible primary key to any InnoDB table that is created without one.
     *
     * <p>sqlGenerateInvisiblePrimaryKey corresponds to the MySQL system variable
     * [sql_generate_invisible_primary_key]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_sql_generate_invisible_primary_key).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlGenerateInvisiblePrimaryKey")
    private final Boolean sqlGenerateInvisiblePrimaryKey;

    /**
     * Whether GIPK mode is in effect, in which case a MySQL replication source server adds a
     * generated invisible primary key to any InnoDB table that is created without one.
     *
     * <p>sqlGenerateInvisiblePrimaryKey corresponds to the MySQL system variable
     * [sql_generate_invisible_primary_key]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_sql_generate_invisible_primary_key).
     *
     * @return the value
     */
    public Boolean getSqlGenerateInvisiblePrimaryKey() {
        return sqlGenerateInvisiblePrimaryKey;
    }

    /**
     * Defines the maximum amount of memory that can be occupied by the TempTable storage engine
     * before it starts storing data on disk. The default value is 1073741824 bytes (1GiB). For more
     * information, see Section 10.4.4, \u201CInternal Temporary Table Use in MySQL\u201D.
     *
     * <p>temptableMaxRam corresponds to the MySQL system variable [temptable_max_ram]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_temptable_max_ram).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temptableMaxRam")
    private final Long temptableMaxRam;

    /**
     * Defines the maximum amount of memory that can be occupied by the TempTable storage engine
     * before it starts storing data on disk. The default value is 1073741824 bytes (1GiB). For more
     * information, see Section 10.4.4, \u201CInternal Temporary Table Use in MySQL\u201D.
     *
     * <p>temptableMaxRam corresponds to the MySQL system variable [temptable_max_ram]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_temptable_max_ram).
     *
     * @return the value
     */
    public Long getTemptableMaxRam() {
        return temptableMaxRam;
    }

    /**
     * Whether InnoDB performs change buffering, an optimization that delays write operations to
     * secondary indexes so that the I/O operations can be performed sequentially. Permitted values
     * are described in the following table. Values may also be specified numerically.
     *
     * <p>innodbChangeBuffering corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_change_buffering]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_change_buffering).
     */
    public enum InnodbChangeBuffering implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Inserts("INSERTS"),
        Deletes("DELETES"),
        Changes("CHANGES"),
        Purges("PURGES"),
        All("ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InnodbChangeBuffering.class);

        private final String value;
        private static java.util.Map<String, InnodbChangeBuffering> map;

        static {
            map = new java.util.HashMap<>();
            for (InnodbChangeBuffering v : InnodbChangeBuffering.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InnodbChangeBuffering(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InnodbChangeBuffering create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InnodbChangeBuffering', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Whether InnoDB performs change buffering, an optimization that delays write operations to
     * secondary indexes so that the I/O operations can be performed sequentially. Permitted values
     * are described in the following table. Values may also be specified numerically.
     *
     * <p>innodbChangeBuffering corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_change_buffering]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_change_buffering).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbChangeBuffering")
    private final InnodbChangeBuffering innodbChangeBuffering;

    /**
     * Whether InnoDB performs change buffering, an optimization that delays write operations to
     * secondary indexes so that the I/O operations can be performed sequentially. Permitted values
     * are described in the following table. Values may also be specified numerically.
     *
     * <p>innodbChangeBuffering corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_change_buffering]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_change_buffering).
     *
     * @return the value
     */
    public InnodbChangeBuffering getInnodbChangeBuffering() {
        return innodbChangeBuffering;
    }

    /**
     * Whether the InnoDB adaptive hash index is enabled or disabled. It may be desirable, depending
     * on your workload, to dynamically enable or disable adaptive hash indexing to improve query
     * performance. Because the adaptive hash index may not be useful for all workloads, conduct
     * benchmarks with it both enabled and disabled, using realistic workloads.
     *
     * <p>innodbAdaptiveHashIndex corresponds to the MySQL InnoDB Startup Options and System
     * Variables [innodb_adaptive_hash_index]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_adaptive_hash_index).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbAdaptiveHashIndex")
    private final Boolean innodbAdaptiveHashIndex;

    /**
     * Whether the InnoDB adaptive hash index is enabled or disabled. It may be desirable, depending
     * on your workload, to dynamically enable or disable adaptive hash indexing to improve query
     * performance. Because the adaptive hash index may not be useful for all workloads, conduct
     * benchmarks with it both enabled and disabled, using realistic workloads.
     *
     * <p>innodbAdaptiveHashIndex corresponds to the MySQL InnoDB Startup Options and System
     * Variables [innodb_adaptive_hash_index]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_adaptive_hash_index).
     *
     * @return the value
     */
    public Boolean getInnodbAdaptiveHashIndex() {
        return innodbAdaptiveHashIndex;
    }

    /**
     * When enabled, undo tablespaces that exceed the threshold value defined by
     * innodb_max_undo_log_size are marked for truncation. Only undo tablespaces can be truncated.
     * Truncating undo logs that reside in the system tablespace is not supported. For truncation to
     * occur, there must be at least two undo tablespaces.
     *
     * <p>innodbUndoLogTruncate corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_undo_log_truncate]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_undo_log_truncate).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbUndoLogTruncate")
    private final Boolean innodbUndoLogTruncate;

    /**
     * When enabled, undo tablespaces that exceed the threshold value defined by
     * innodb_max_undo_log_size are marked for truncation. Only undo tablespaces can be truncated.
     * Truncating undo logs that reside in the system tablespace is not supported. For truncation to
     * occur, there must be at least two undo tablespaces.
     *
     * <p>innodbUndoLogTruncate corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_undo_log_truncate]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_undo_log_truncate).
     *
     * @return the value
     */
    public Boolean getInnodbUndoLogTruncate() {
        return innodbUndoLogTruncate;
    }

    /**
     * The number of table definitions that can be stored in the table definition cache. If you use
     * a large number of tables, you can create a large table definition cache to speed up opening
     * of tables. The table definition cache takes less space and does not use file descriptors,
     * unlike the normal table cache.
     *
     * <p>table_definition_cache corresponds to the MySQL Server Administration system variable
     * [table_definition_cache](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_table_definition_cache)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tableDefinitionCache")
    private final Integer tableDefinitionCache;

    /**
     * The number of table definitions that can be stored in the table definition cache. If you use
     * a large number of tables, you can create a large table definition cache to speed up opening
     * of tables. The table definition cache takes less space and does not use file descriptors,
     * unlike the normal table cache.
     *
     * <p>table_definition_cache corresponds to the MySQL Server Administration system variable
     * [table_definition_cache](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_table_definition_cache)
     *
     * @return the value
     */
    public Integer getTableDefinitionCache() {
        return tableDefinitionCache;
    }

    /**
     * The number of open tables for all threads. Increasing this value increases the number of file
     * descriptors that mysqld requires.
     *
     * <p>table_open_cache corresponds to the MySQL Server Administration system variable
     * [table_open_cache](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_table_open_cache)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tableOpenCache")
    private final Integer tableOpenCache;

    /**
     * The number of open tables for all threads. Increasing this value increases the number of file
     * descriptors that mysqld requires.
     *
     * <p>table_open_cache corresponds to the MySQL Server Administration system variable
     * [table_open_cache](https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_table_open_cache)
     *
     * @return the value
     */
    public Integer getTableOpenCache() {
        return tableOpenCache;
    }

    /**
     * The maximum amount of space to use for all relay logs.
     *
     * <p>relayLogSpaceLimit corresponds to the MySQL Replica Server Options variable
     * [relay_log_space_limit]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_relay_log_space_limit).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relayLogSpaceLimit")
    private final Long relayLogSpaceLimit;

    /**
     * The maximum amount of space to use for all relay logs.
     *
     * <p>relayLogSpaceLimit corresponds to the MySQL Replica Server Options variable
     * [relay_log_space_limit]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_relay_log_space_limit).
     *
     * @return the value
     */
    public Long getRelayLogSpaceLimit() {
        return relayLogSpaceLimit;
    }

    /**
     * The optimizer_switch system variable enables control over optimizer behavior. The value of
     * this variable is a set of flags, each of which has a value of on or off to indicate whether
     * the corresponding optimizer behavior is enabled or disabled. This variable has global and
     * session values and can be changed at runtime. The global default can be set at server
     * startup.
     *
     * <p>Setting hypergraph_optimizer=on for cloud builds below 9.0.0 will fail.
     *
     * <p>optimizerSwitch corresponds to the MySQL Server System variable [optimizer_switch]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_optimizer_switch).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("optimizerSwitch")
    private final String optimizerSwitch;

    /**
     * The optimizer_switch system variable enables control over optimizer behavior. The value of
     * this variable is a set of flags, each of which has a value of on or off to indicate whether
     * the corresponding optimizer behavior is enabled or disabled. This variable has global and
     * session values and can be changed at runtime. The global default can be set at server
     * startup.
     *
     * <p>Setting hypergraph_optimizer=on for cloud builds below 9.0.0 will fail.
     *
     * <p>optimizerSwitch corresponds to the MySQL Server System variable [optimizer_switch]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_optimizer_switch).
     *
     * @return the value
     */
    public String getOptimizerSwitch() {
        return optimizerSwitch;
    }

    /**
     * From MySQL 8.0.26, use replica_type_conversions in place of slave_type_conversions, which is
     * deprecated from that release. In releases before MySQL 8.0.26, use slave_type_conversions.
     *
     * <p>replica_type_conversions controls the type conversion mode in effect on the replica when
     * using row-based replication. Its value is a comma-delimited set of zero or more elements from
     * the list: ALL_LOSSY, ALL_NON_LOSSY, ALL_SIGNED, ALL_UNSIGNED. Set this variable to an empty
     * string to disallow type conversions between the source and the replica. Setting this variable
     * takes effect for all replication channels immediately, including running channels.
     *
     * <p>replica_type_conversions corresponds to the MySQL Replica Server Options variable
     * [replica_type_conversions]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_type_conversions).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaTypeConversions")
    private final String replicaTypeConversions;

    /**
     * From MySQL 8.0.26, use replica_type_conversions in place of slave_type_conversions, which is
     * deprecated from that release. In releases before MySQL 8.0.26, use slave_type_conversions.
     *
     * <p>replica_type_conversions controls the type conversion mode in effect on the replica when
     * using row-based replication. Its value is a comma-delimited set of zero or more elements from
     * the list: ALL_LOSSY, ALL_NON_LOSSY, ALL_SIGNED, ALL_UNSIGNED. Set this variable to an empty
     * string to disallow type conversions between the source and the replica. Setting this variable
     * takes effect for all replication channels immediately, including running channels.
     *
     * <p>replica_type_conversions corresponds to the MySQL Replica Server Options variable
     * [replica_type_conversions]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_type_conversions).
     *
     * @return the value
     */
    public String getReplicaTypeConversions() {
        return replicaTypeConversions;
    }

    /**
     * Beginning with MySQL 8.0.26, slave_parallel_workers is deprecated, and you should use
     * replica_parallel_workers instead. (Prior to MySQL 8.0.26, you must use slave_parallel_workers
     * to set the number of applier threads.)
     *
     * <p>replicaParallelWorkers corresponds to the MySQL Replica Server Options variable
     * [replica_parallel_workers]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_parallel_workers).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaParallelWorkers")
    private final Integer replicaParallelWorkers;

    /**
     * Beginning with MySQL 8.0.26, slave_parallel_workers is deprecated, and you should use
     * replica_parallel_workers instead. (Prior to MySQL 8.0.26, you must use slave_parallel_workers
     * to set the number of applier threads.)
     *
     * <p>replicaParallelWorkers corresponds to the MySQL Replica Server Options variable
     * [replica_parallel_workers]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-replica.html#sysvar_replica_parallel_workers).
     *
     * @return the value
     */
    public Integer getReplicaParallelWorkers() {
        return replicaParallelWorkers;
    }

    /**
     * Whether to resolve host names when checking client connections. If this variable is OFF,
     * mysqld resolves host names when checking client connections. If it is ON, mysqld uses only IP
     * numbers; in this case, all Host column values in the grant tables must be IP addresses. See
     * Section 7.1.12.3, \u201CDNS Lookups and the Host Cache\u201D.
     *
     * <p>skipNameResolve corresponds to the MySQL Server System variable [skip_name_resolve]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_skip_name_resolve).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipNameResolve")
    private final Boolean skipNameResolve;

    /**
     * Whether to resolve host names when checking client connections. If this variable is OFF,
     * mysqld resolves host names when checking client connections. If it is ON, mysqld uses only IP
     * numbers; in this case, all Host column values in the grant tables must be IP addresses. See
     * Section 7.1.12.3, \u201CDNS Lookups and the Host Cache\u201D.
     *
     * <p>skipNameResolve corresponds to the MySQL Server System variable [skip_name_resolve]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_skip_name_resolve).
     *
     * @return the value
     */
    public Boolean getSkipNameResolve() {
        return skipNameResolve;
    }

    /**
     * The maximum number of simultaneous connections permitted to any given MySQL user account. A
     * value of 0 (the default) means \u201Cno limit.\u201D This variable has a global value that
     * can be set at server startup or runtime. It also has a read-only session value that indicates
     * the effective simultaneous-connection limit that applies to the account associated with the
     * current session.
     *
     * <p>maxUserConnections corresponds to the MySQL Server System variable [max_user_connections]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_user_connections).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxUserConnections")
    private final Long maxUserConnections;

    /**
     * The maximum number of simultaneous connections permitted to any given MySQL user account. A
     * value of 0 (the default) means \u201Cno limit.\u201D This variable has a global value that
     * can be set at server startup or runtime. It also has a read-only session value that indicates
     * the effective simultaneous-connection limit that applies to the account associated with the
     * current session.
     *
     * <p>maxUserConnections corresponds to the MySQL Server System variable [max_user_connections]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_user_connections).
     *
     * @return the value
     */
    public Long getMaxUserConnections() {
        return maxUserConnections;
    }

    /**
     * The minimum size of the buffer that is used for plain index scans, range index scans, and
     * joins that do not use indexes and thus perform full table scans. In MySQL 8.0.18 and later,
     * this variable also controls the amount of memory used for hash joins. Normally, the best way
     * to get fast joins is to add indexes. Increase the value of join_buffer_size to get a faster
     * full join when adding indexes is not possible. One join buffer is allocated for each full
     * join between two tables. For a complex join between several tables for which indexes are not
     * used, multiple join buffers might be necessary.
     *
     * <p>joinBufferSize corresponds to the MySQL Server System variable [join_buffer_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_join_buffer_size).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("joinBufferSize")
    private final Long joinBufferSize;

    /**
     * The minimum size of the buffer that is used for plain index scans, range index scans, and
     * joins that do not use indexes and thus perform full table scans. In MySQL 8.0.18 and later,
     * this variable also controls the amount of memory used for hash joins. Normally, the best way
     * to get fast joins is to add indexes. Increase the value of join_buffer_size to get a faster
     * full join when adding indexes is not possible. One join buffer is allocated for each full
     * join between two tables. For a complex join between several tables for which indexes are not
     * used, multiple join buffers might be necessary.
     *
     * <p>joinBufferSize corresponds to the MySQL Server System variable [join_buffer_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_join_buffer_size).
     *
     * @return the value
     */
    public Long getJoinBufferSize() {
        return joinBufferSize;
    }

    /**
     * Limit the assumed maximum number of seeks when looking up rows based on a key. The MySQL
     * optimizer assumes that no more than this number of key seeks are required when searching for
     * matching rows in a table by scanning an index, regardless of the actual cardinality of the
     * index (see Section 15.7.7.22, \u201CSHOW INDEX Statement\u201D). By setting this to a low
     * value (say, 100), you can force MySQL to prefer indexes instead of table scans.
     *
     * <p>maxSeeksForKey corresponds to the MySQL Server System variable [max_seeks_for_key]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_seeks_for_key).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSeeksForKey")
    private final Long maxSeeksForKey;

    /**
     * Limit the assumed maximum number of seeks when looking up rows based on a key. The MySQL
     * optimizer assumes that no more than this number of key seeks are required when searching for
     * matching rows in a table by scanning an index, regardless of the actual cardinality of the
     * index (see Section 15.7.7.22, \u201CSHOW INDEX Statement\u201D). By setting this to a low
     * value (say, 100), you can force MySQL to prefer indexes instead of table scans.
     *
     * <p>maxSeeksForKey corresponds to the MySQL Server System variable [max_seeks_for_key]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_max_seeks_for_key).
     *
     * @return the value
     */
    public Long getMaxSeeksForKey() {
        return maxSeeksForKey;
    }

    /**
     * The limit on memory consumption for the range optimizer. A value of 0 means \u201Cno
     * limit.\u201D If an execution plan considered by the optimizer uses the range access method
     * but the optimizer estimates that the amount of memory needed for this method would exceed the
     * limit, it abandons the plan and considers other plans.
     *
     * <p>rangeOptimizerMaxMemSize corresponds to the MySQL Server System variable
     * [range_optimizer_max_mem_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_range_optimizer_max_mem_size).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeOptimizerMaxMemSize")
    private final Long rangeOptimizerMaxMemSize;

    /**
     * The limit on memory consumption for the range optimizer. A value of 0 means \u201Cno
     * limit.\u201D If an execution plan considered by the optimizer uses the range access method
     * but the optimizer estimates that the amount of memory needed for this method would exceed the
     * limit, it abandons the plan and considers other plans.
     *
     * <p>rangeOptimizerMaxMemSize corresponds to the MySQL Server System variable
     * [range_optimizer_max_mem_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_range_optimizer_max_mem_size).
     *
     * @return the value
     */
    public Long getRangeOptimizerMaxMemSize() {
        return rangeOptimizerMaxMemSize;
    }

    /**
     * auto_increment_increment and auto_increment_offset are intended for use with circular
     * (source-to-source) replication, and can be used to control the operation of AUTO_INCREMENT
     * columns. Both variables have global and session values, and each can assume an integer value
     * between 1 and 65,535 inclusive.
     *
     * <p>autoIncrementIncrement corresponds to the MySQL Replication Source Options variable
     * [auto_increment_increment]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-source.html#sysvar_auto_increment_increment).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoIncrementIncrement")
    private final Integer autoIncrementIncrement;

    /**
     * auto_increment_increment and auto_increment_offset are intended for use with circular
     * (source-to-source) replication, and can be used to control the operation of AUTO_INCREMENT
     * columns. Both variables have global and session values, and each can assume an integer value
     * between 1 and 65,535 inclusive.
     *
     * <p>autoIncrementIncrement corresponds to the MySQL Replication Source Options variable
     * [auto_increment_increment]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-source.html#sysvar_auto_increment_increment).
     *
     * @return the value
     */
    public Integer getAutoIncrementIncrement() {
        return autoIncrementIncrement;
    }

    /**
     * This variable has a default value of 1. If it is left with its default value, and Group
     * Replication is started on the server in multi-primary mode, it is changed to the server ID.
     *
     * <p>autoIncrementOffset corresponds to the MySQL Replication Source Options variable
     * [auto_increment_offset]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-source.html#sysvar_auto_increment_offset).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoIncrementOffset")
    private final Integer autoIncrementOffset;

    /**
     * This variable has a default value of 1. If it is left with its default value, and Group
     * Replication is started on the server in multi-primary mode, it is changed to the server ID.
     *
     * <p>autoIncrementOffset corresponds to the MySQL Replication Source Options variable
     * [auto_increment_offset]
     * (https://dev.mysql.com/doc/refman/8.0/en/replication-options-source.html#sysvar_auto_increment_offset).
     *
     * @return the value
     */
    public Integer getAutoIncrementOffset() {
        return autoIncrementOffset;
    }

    /**
     * The lock mode to use for generating auto-increment values. Permissible values are 0, 1, or 2,
     * for traditional, consecutive, or interleaved, respectively.
     *
     * <p>innodbAutoincLockMode corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_autoinc_lock_mode]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_autoinc_lock_mode).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbAutoincLockMode")
    private final Integer innodbAutoincLockMode;

    /**
     * The lock mode to use for generating auto-increment values. Permissible values are 0, 1, or 2,
     * for traditional, consecutive, or interleaved, respectively.
     *
     * <p>innodbAutoincLockMode corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_autoinc_lock_mode]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_autoinc_lock_mode).
     *
     * @return the value
     */
    public Integer getInnodbAutoincLockMode() {
        return innodbAutoincLockMode;
    }

    /**
     * InnoDB rolls back only the last statement on a transaction timeout by default. If
     * --innodb-rollback-on-timeout is specified, a transaction timeout causes InnoDB to abort and
     * roll back the entire transaction.
     *
     * <p>innodbRollbackOnTimeout corresponds to the MySQL InnoDB Startup Options and System
     * Variables [innodb_rollback_on_timeout]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_rollback_on_timeout).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbRollbackOnTimeout")
    private final Boolean innodbRollbackOnTimeout;

    /**
     * InnoDB rolls back only the last statement on a transaction timeout by default. If
     * --innodb-rollback-on-timeout is specified, a transaction timeout causes InnoDB to abort and
     * roll back the entire transaction.
     *
     * <p>innodbRollbackOnTimeout corresponds to the MySQL InnoDB Startup Options and System
     * Variables [innodb_rollback_on_timeout]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_rollback_on_timeout).
     *
     * @return the value
     */
    public Boolean getInnodbRollbackOnTimeout() {
        return innodbRollbackOnTimeout;
    }

    /**
     * Specifies an upper limit in bytes on the size of the temporary log files used during online
     * DDL operations for InnoDB tables. There is one such log file for each index being created or
     * table being altered. This log file stores data inserted, updated, or deleted in the table
     * during the DDL operation.
     *
     * <p>innodbOnlineAlterLogMaxSize corresponds to the MySQL InnoDB Startup Options and System
     * Variables [innodb_online_alter_log_max_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_online_alter_log_max_size).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbOnlineAlterLogMaxSize")
    private final Long innodbOnlineAlterLogMaxSize;

    /**
     * Specifies an upper limit in bytes on the size of the temporary log files used during online
     * DDL operations for InnoDB tables. There is one such log file for each index being created or
     * table being altered. This log file stores data inserted, updated, or deleted in the table
     * during the DDL operation.
     *
     * <p>innodbOnlineAlterLogMaxSize corresponds to the MySQL InnoDB Startup Options and System
     * Variables [innodb_online_alter_log_max_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_online_alter_log_max_size).
     *
     * @return the value
     */
    public Long getInnodbOnlineAlterLogMaxSize() {
        return innodbOnlineAlterLogMaxSize;
    }

    /**
     * This variable defines:
     *
     * <p>The sort buffer size for online DDL operations that create or rebuild secondary indexes.
     * However, as of MySQL 8.0.27, this responsibility is subsumed by the innodb_ddl_buffer_size
     * variable.
     *
     * <p>The amount by which the temporary log file is extended when recording concurrent DML
     * during an online DDL operation, and the size of the temporary log file read buffer and write
     * buffer.
     *
     * <p>innodbSortBufferSize corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_sort_buffer_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_sort_buffer_size).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbSortBufferSize")
    private final Integer innodbSortBufferSize;

    /**
     * This variable defines:
     *
     * <p>The sort buffer size for online DDL operations that create or rebuild secondary indexes.
     * However, as of MySQL 8.0.27, this responsibility is subsumed by the innodb_ddl_buffer_size
     * variable.
     *
     * <p>The amount by which the temporary log file is extended when recording concurrent DML
     * during an online DDL operation, and the size of the temporary log file read buffer and write
     * buffer.
     *
     * <p>innodbSortBufferSize corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_sort_buffer_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_sort_buffer_size).
     *
     * @return the value
     */
    public Integer getInnodbSortBufferSize() {
        return innodbSortBufferSize;
    }

    /**
     * Enables the NUMA interleave memory policy for allocation of the InnoDB buffer pool. When
     * innodb_numa_interleave is enabled, the NUMA memory policy is set to MPOL_INTERLEAVE for the
     * mysqld process. After the InnoDB buffer pool is allocated, the NUMA memory policy is set back
     * to MPOL_DEFAULT. For the innodb_numa_interleave option to be available, MySQL must be
     * compiled on a NUMA-enabled Linux system.
     *
     * <p>innodbNumaInterleave corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_numa_interleave]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_numa_interleave).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodbNumaInterleave")
    private final Boolean innodbNumaInterleave;

    /**
     * Enables the NUMA interleave memory policy for allocation of the InnoDB buffer pool. When
     * innodb_numa_interleave is enabled, the NUMA memory policy is set to MPOL_INTERLEAVE for the
     * mysqld process. After the InnoDB buffer pool is allocated, the NUMA memory policy is set back
     * to MPOL_DEFAULT. For the innodb_numa_interleave option to be available, MySQL must be
     * compiled on a NUMA-enabled Linux system.
     *
     * <p>innodbNumaInterleave corresponds to the MySQL InnoDB Startup Options and System Variables
     * [innodb_numa_interleave]
     * (https://dev.mysql.com/doc/refman/8.0/en/innodb-parameters.html#sysvar_innodb_numa_interleave).
     *
     * @return the value
     */
    public Boolean getInnodbNumaInterleave() {
        return innodbNumaInterleave;
    }

    /**
     * The number of thread groups in the thread pool. This is the most important parameter
     * controlling thread pool performance. It affects how many statements can execute
     * simultaneously. If a value outside the range of permissible values is specified, the thread
     * pool plugin does not load and the server writes a message to the error log.
     *
     * <p>threadPoolSize corresponds to the MySQL Server System variable [thread_pool_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_size).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threadPoolSize")
    private final Integer threadPoolSize;

    /**
     * The number of thread groups in the thread pool. This is the most important parameter
     * controlling thread pool performance. It affects how many statements can execute
     * simultaneously. If a value outside the range of permissible values is specified, the thread
     * pool plugin does not load and the server writes a message to the error log.
     *
     * <p>threadPoolSize corresponds to the MySQL Server System variable [thread_pool_size]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_thread_pool_size).
     *
     * @return the value
     */
    public Integer getThreadPoolSize() {
        return threadPoolSize;
    }

    /**
     * If a query takes longer than this many seconds, the server increments the Slow_queries status
     * variable. If the slow query log is enabled, the query is logged to the slow query log file.
     * This value is measured in real time, not CPU time, so a query that is under the threshold on
     * a lightly loaded system might be above the threshold on a heavily loaded one.
     *
     * <p>longQueryTime corresponds to the MySQL Server System variable [long_query_time]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_long_query_time).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("longQueryTime")
    private final Integer longQueryTime;

    /**
     * If a query takes longer than this many seconds, the server increments the Slow_queries status
     * variable. If the slow query log is enabled, the query is logged to the slow query log file.
     * This value is measured in real time, not CPU time, so a query that is under the threshold on
     * a lightly loaded system might be above the threshold on a heavily loaded one.
     *
     * <p>longQueryTime corresponds to the MySQL Server System variable [long_query_time]
     * (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_long_query_time).
     *
     * @return the value
     */
    public Integer getLongQueryTime() {
        return longQueryTime;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConfigurationVariables(");
        sb.append("super=").append(super.toString());
        sb.append("completionType=").append(String.valueOf(this.completionType));
        sb.append(", bigTables=").append(String.valueOf(this.bigTables));
        sb.append(", characterSetServer=").append(String.valueOf(this.characterSetServer));
        sb.append(", collationServer=").append(String.valueOf(this.collationServer));
        sb.append(", connectionMemoryChunkSize=")
                .append(String.valueOf(this.connectionMemoryChunkSize));
        sb.append(", connectionMemoryLimit=").append(String.valueOf(this.connectionMemoryLimit));
        sb.append(", defaultAuthenticationPlugin=")
                .append(String.valueOf(this.defaultAuthenticationPlugin));
        sb.append(", globalConnectionMemoryLimit=")
                .append(String.valueOf(this.globalConnectionMemoryLimit));
        sb.append(", globalConnectionMemoryTracking=")
                .append(String.valueOf(this.globalConnectionMemoryTracking));
        sb.append(", transactionIsolation=").append(String.valueOf(this.transactionIsolation));
        sb.append(", innodbFtServerStopwordTable=")
                .append(String.valueOf(this.innodbFtServerStopwordTable));
        sb.append(", mandatoryRoles=").append(String.valueOf(this.mandatoryRoles));
        sb.append(", autocommit=").append(String.valueOf(this.autocommit));
        sb.append(", foreignKeyChecks=").append(String.valueOf(this.foreignKeyChecks));
        sb.append(", groupReplicationConsistency=")
                .append(String.valueOf(this.groupReplicationConsistency));
        sb.append(", groupConcatMaxLen=").append(String.valueOf(this.groupConcatMaxLen));
        sb.append(", innodbFtEnableStopword=").append(String.valueOf(this.innodbFtEnableStopword));
        sb.append(", innodbLogWriterThreads=").append(String.valueOf(this.innodbLogWriterThreads));
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
        sb.append(", maxBinlogCacheSize=").append(String.valueOf(this.maxBinlogCacheSize));
        sb.append(", maxConnectErrors=").append(String.valueOf(this.maxConnectErrors));
        sb.append(", maxHeapTableSize=").append(String.valueOf(this.maxHeapTableSize));
        sb.append(", maxConnections=").append(String.valueOf(this.maxConnections));
        sb.append(", maxPreparedStmtCount=").append(String.valueOf(this.maxPreparedStmtCount));
        sb.append(", connectTimeout=").append(String.valueOf(this.connectTimeout));
        sb.append(", cteMaxRecursionDepth=").append(String.valueOf(this.cteMaxRecursionDepth));
        sb.append(", generatedRandomPasswordLength=")
                .append(String.valueOf(this.generatedRandomPasswordLength));
        sb.append(", informationSchemaStatsExpiry=")
                .append(String.valueOf(this.informationSchemaStatsExpiry));
        sb.append(", innodbBufferPoolDumpPct=")
                .append(String.valueOf(this.innodbBufferPoolDumpPct));
        sb.append(", innodbBufferPoolInstances=")
                .append(String.valueOf(this.innodbBufferPoolInstances));
        sb.append(", innodbDdlBufferSize=").append(String.valueOf(this.innodbDdlBufferSize));
        sb.append(", innodbDdlThreads=").append(String.valueOf(this.innodbDdlThreads));
        sb.append(", innodbFtMaxTokenSize=").append(String.valueOf(this.innodbFtMaxTokenSize));
        sb.append(", innodbFtMinTokenSize=").append(String.valueOf(this.innodbFtMinTokenSize));
        sb.append(", innodbFtNumWordOptimize=")
                .append(String.valueOf(this.innodbFtNumWordOptimize));
        sb.append(", innodbLockWaitTimeout=").append(String.valueOf(this.innodbLockWaitTimeout));
        sb.append(", innodbMaxPurgeLag=").append(String.valueOf(this.innodbMaxPurgeLag));
        sb.append(", innodbMaxPurgeLagDelay=").append(String.valueOf(this.innodbMaxPurgeLagDelay));
        sb.append(", interactiveTimeout=").append(String.valueOf(this.interactiveTimeout));
        sb.append(", innodbStatsPersistentSamplePages=")
                .append(String.valueOf(this.innodbStatsPersistentSamplePages));
        sb.append(", innodbStatsTransientSamplePages=")
                .append(String.valueOf(this.innodbStatsTransientSamplePages));
        sb.append(", innodbStrictMode=").append(String.valueOf(this.innodbStrictMode));
        sb.append(", maxAllowedPacket=").append(String.valueOf(this.maxAllowedPacket));
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
        sb.append(", netReadTimeout=").append(String.valueOf(this.netReadTimeout));
        sb.append(", netWriteTimeout=").append(String.valueOf(this.netWriteTimeout));
        sb.append(", parserMaxMemSize=").append(String.valueOf(this.parserMaxMemSize));
        sb.append(", queryAllocBlockSize=").append(String.valueOf(this.queryAllocBlockSize));
        sb.append(", queryPreallocSize=").append(String.valueOf(this.queryPreallocSize));
        sb.append(", regexpTimeLimit=").append(String.valueOf(this.regexpTimeLimit));
        sb.append(", sqlMode=").append(String.valueOf(this.sqlMode));
        sb.append(", tmpTableSize=").append(String.valueOf(this.tmpTableSize));
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
        sb.append(", sortBufferSize=").append(String.valueOf(this.sortBufferSize));
        sb.append(", waitTimeout=").append(String.valueOf(this.waitTimeout));
        sb.append(", threadPoolDedicatedListeners=")
                .append(String.valueOf(this.threadPoolDedicatedListeners));
        sb.append(", threadPoolMaxTransactionsLimit=")
                .append(String.valueOf(this.threadPoolMaxTransactionsLimit));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", blockEncryptionMode=").append(String.valueOf(this.blockEncryptionMode));
        sb.append(", binlogGroupCommitSyncDelay=")
                .append(String.valueOf(this.binlogGroupCommitSyncDelay));
        sb.append(", binlogGroupCommitSyncNoDelayCount=")
                .append(String.valueOf(this.binlogGroupCommitSyncNoDelayCount));
        sb.append(", replicaNetTimeout=").append(String.valueOf(this.replicaNetTimeout));
        sb.append(", requireSecureTransport=").append(String.valueOf(this.requireSecureTransport));
        sb.append(", innodbRedoLogCapacity=").append(String.valueOf(this.innodbRedoLogCapacity));
        sb.append(", threadPoolTransactionDelay=")
                .append(String.valueOf(this.threadPoolTransactionDelay));
        sb.append(", threadPoolQueryThreadsPerGroup=")
                .append(String.valueOf(this.threadPoolQueryThreadsPerGroup));
        sb.append(", explainFormat=").append(String.valueOf(this.explainFormat));
        sb.append(", explicitDefaultsForTimestamp=")
                .append(String.valueOf(this.explicitDefaultsForTimestamp));
        sb.append(", sqlGenerateInvisiblePrimaryKey=")
                .append(String.valueOf(this.sqlGenerateInvisiblePrimaryKey));
        sb.append(", temptableMaxRam=").append(String.valueOf(this.temptableMaxRam));
        sb.append(", innodbChangeBuffering=").append(String.valueOf(this.innodbChangeBuffering));
        sb.append(", innodbAdaptiveHashIndex=")
                .append(String.valueOf(this.innodbAdaptiveHashIndex));
        sb.append(", innodbUndoLogTruncate=").append(String.valueOf(this.innodbUndoLogTruncate));
        sb.append(", tableDefinitionCache=").append(String.valueOf(this.tableDefinitionCache));
        sb.append(", tableOpenCache=").append(String.valueOf(this.tableOpenCache));
        sb.append(", relayLogSpaceLimit=").append(String.valueOf(this.relayLogSpaceLimit));
        sb.append(", optimizerSwitch=").append(String.valueOf(this.optimizerSwitch));
        sb.append(", replicaTypeConversions=").append(String.valueOf(this.replicaTypeConversions));
        sb.append(", replicaParallelWorkers=").append(String.valueOf(this.replicaParallelWorkers));
        sb.append(", skipNameResolve=").append(String.valueOf(this.skipNameResolve));
        sb.append(", maxUserConnections=").append(String.valueOf(this.maxUserConnections));
        sb.append(", joinBufferSize=").append(String.valueOf(this.joinBufferSize));
        sb.append(", maxSeeksForKey=").append(String.valueOf(this.maxSeeksForKey));
        sb.append(", rangeOptimizerMaxMemSize=")
                .append(String.valueOf(this.rangeOptimizerMaxMemSize));
        sb.append(", autoIncrementIncrement=").append(String.valueOf(this.autoIncrementIncrement));
        sb.append(", autoIncrementOffset=").append(String.valueOf(this.autoIncrementOffset));
        sb.append(", innodbAutoincLockMode=").append(String.valueOf(this.innodbAutoincLockMode));
        sb.append(", innodbRollbackOnTimeout=")
                .append(String.valueOf(this.innodbRollbackOnTimeout));
        sb.append(", innodbOnlineAlterLogMaxSize=")
                .append(String.valueOf(this.innodbOnlineAlterLogMaxSize));
        sb.append(", innodbSortBufferSize=").append(String.valueOf(this.innodbSortBufferSize));
        sb.append(", innodbNumaInterleave=").append(String.valueOf(this.innodbNumaInterleave));
        sb.append(", threadPoolSize=").append(String.valueOf(this.threadPoolSize));
        sb.append(", longQueryTime=").append(String.valueOf(this.longQueryTime));
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
                && java.util.Objects.equals(this.bigTables, other.bigTables)
                && java.util.Objects.equals(this.characterSetServer, other.characterSetServer)
                && java.util.Objects.equals(this.collationServer, other.collationServer)
                && java.util.Objects.equals(
                        this.connectionMemoryChunkSize, other.connectionMemoryChunkSize)
                && java.util.Objects.equals(this.connectionMemoryLimit, other.connectionMemoryLimit)
                && java.util.Objects.equals(
                        this.defaultAuthenticationPlugin, other.defaultAuthenticationPlugin)
                && java.util.Objects.equals(
                        this.globalConnectionMemoryLimit, other.globalConnectionMemoryLimit)
                && java.util.Objects.equals(
                        this.globalConnectionMemoryTracking, other.globalConnectionMemoryTracking)
                && java.util.Objects.equals(this.transactionIsolation, other.transactionIsolation)
                && java.util.Objects.equals(
                        this.innodbFtServerStopwordTable, other.innodbFtServerStopwordTable)
                && java.util.Objects.equals(this.mandatoryRoles, other.mandatoryRoles)
                && java.util.Objects.equals(this.autocommit, other.autocommit)
                && java.util.Objects.equals(this.foreignKeyChecks, other.foreignKeyChecks)
                && java.util.Objects.equals(
                        this.groupReplicationConsistency, other.groupReplicationConsistency)
                && java.util.Objects.equals(this.groupConcatMaxLen, other.groupConcatMaxLen)
                && java.util.Objects.equals(
                        this.innodbFtEnableStopword, other.innodbFtEnableStopword)
                && java.util.Objects.equals(
                        this.innodbLogWriterThreads, other.innodbLogWriterThreads)
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
                && java.util.Objects.equals(this.maxBinlogCacheSize, other.maxBinlogCacheSize)
                && java.util.Objects.equals(this.maxConnectErrors, other.maxConnectErrors)
                && java.util.Objects.equals(this.maxHeapTableSize, other.maxHeapTableSize)
                && java.util.Objects.equals(this.maxConnections, other.maxConnections)
                && java.util.Objects.equals(this.maxPreparedStmtCount, other.maxPreparedStmtCount)
                && java.util.Objects.equals(this.connectTimeout, other.connectTimeout)
                && java.util.Objects.equals(this.cteMaxRecursionDepth, other.cteMaxRecursionDepth)
                && java.util.Objects.equals(
                        this.generatedRandomPasswordLength, other.generatedRandomPasswordLength)
                && java.util.Objects.equals(
                        this.informationSchemaStatsExpiry, other.informationSchemaStatsExpiry)
                && java.util.Objects.equals(
                        this.innodbBufferPoolDumpPct, other.innodbBufferPoolDumpPct)
                && java.util.Objects.equals(
                        this.innodbBufferPoolInstances, other.innodbBufferPoolInstances)
                && java.util.Objects.equals(this.innodbDdlBufferSize, other.innodbDdlBufferSize)
                && java.util.Objects.equals(this.innodbDdlThreads, other.innodbDdlThreads)
                && java.util.Objects.equals(this.innodbFtMaxTokenSize, other.innodbFtMaxTokenSize)
                && java.util.Objects.equals(this.innodbFtMinTokenSize, other.innodbFtMinTokenSize)
                && java.util.Objects.equals(
                        this.innodbFtNumWordOptimize, other.innodbFtNumWordOptimize)
                && java.util.Objects.equals(this.innodbLockWaitTimeout, other.innodbLockWaitTimeout)
                && java.util.Objects.equals(this.innodbMaxPurgeLag, other.innodbMaxPurgeLag)
                && java.util.Objects.equals(
                        this.innodbMaxPurgeLagDelay, other.innodbMaxPurgeLagDelay)
                && java.util.Objects.equals(this.interactiveTimeout, other.interactiveTimeout)
                && java.util.Objects.equals(
                        this.innodbStatsPersistentSamplePages,
                        other.innodbStatsPersistentSamplePages)
                && java.util.Objects.equals(
                        this.innodbStatsTransientSamplePages, other.innodbStatsTransientSamplePages)
                && java.util.Objects.equals(this.innodbStrictMode, other.innodbStrictMode)
                && java.util.Objects.equals(this.maxAllowedPacket, other.maxAllowedPacket)
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
                && java.util.Objects.equals(this.netReadTimeout, other.netReadTimeout)
                && java.util.Objects.equals(this.netWriteTimeout, other.netWriteTimeout)
                && java.util.Objects.equals(this.parserMaxMemSize, other.parserMaxMemSize)
                && java.util.Objects.equals(this.queryAllocBlockSize, other.queryAllocBlockSize)
                && java.util.Objects.equals(this.queryPreallocSize, other.queryPreallocSize)
                && java.util.Objects.equals(this.regexpTimeLimit, other.regexpTimeLimit)
                && java.util.Objects.equals(this.sqlMode, other.sqlMode)
                && java.util.Objects.equals(this.tmpTableSize, other.tmpTableSize)
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
                && java.util.Objects.equals(this.sortBufferSize, other.sortBufferSize)
                && java.util.Objects.equals(this.waitTimeout, other.waitTimeout)
                && java.util.Objects.equals(
                        this.threadPoolDedicatedListeners, other.threadPoolDedicatedListeners)
                && java.util.Objects.equals(
                        this.threadPoolMaxTransactionsLimit, other.threadPoolMaxTransactionsLimit)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.blockEncryptionMode, other.blockEncryptionMode)
                && java.util.Objects.equals(
                        this.binlogGroupCommitSyncDelay, other.binlogGroupCommitSyncDelay)
                && java.util.Objects.equals(
                        this.binlogGroupCommitSyncNoDelayCount,
                        other.binlogGroupCommitSyncNoDelayCount)
                && java.util.Objects.equals(this.replicaNetTimeout, other.replicaNetTimeout)
                && java.util.Objects.equals(
                        this.requireSecureTransport, other.requireSecureTransport)
                && java.util.Objects.equals(this.innodbRedoLogCapacity, other.innodbRedoLogCapacity)
                && java.util.Objects.equals(
                        this.threadPoolTransactionDelay, other.threadPoolTransactionDelay)
                && java.util.Objects.equals(
                        this.threadPoolQueryThreadsPerGroup, other.threadPoolQueryThreadsPerGroup)
                && java.util.Objects.equals(this.explainFormat, other.explainFormat)
                && java.util.Objects.equals(
                        this.explicitDefaultsForTimestamp, other.explicitDefaultsForTimestamp)
                && java.util.Objects.equals(
                        this.sqlGenerateInvisiblePrimaryKey, other.sqlGenerateInvisiblePrimaryKey)
                && java.util.Objects.equals(this.temptableMaxRam, other.temptableMaxRam)
                && java.util.Objects.equals(this.innodbChangeBuffering, other.innodbChangeBuffering)
                && java.util.Objects.equals(
                        this.innodbAdaptiveHashIndex, other.innodbAdaptiveHashIndex)
                && java.util.Objects.equals(this.innodbUndoLogTruncate, other.innodbUndoLogTruncate)
                && java.util.Objects.equals(this.tableDefinitionCache, other.tableDefinitionCache)
                && java.util.Objects.equals(this.tableOpenCache, other.tableOpenCache)
                && java.util.Objects.equals(this.relayLogSpaceLimit, other.relayLogSpaceLimit)
                && java.util.Objects.equals(this.optimizerSwitch, other.optimizerSwitch)
                && java.util.Objects.equals(
                        this.replicaTypeConversions, other.replicaTypeConversions)
                && java.util.Objects.equals(
                        this.replicaParallelWorkers, other.replicaParallelWorkers)
                && java.util.Objects.equals(this.skipNameResolve, other.skipNameResolve)
                && java.util.Objects.equals(this.maxUserConnections, other.maxUserConnections)
                && java.util.Objects.equals(this.joinBufferSize, other.joinBufferSize)
                && java.util.Objects.equals(this.maxSeeksForKey, other.maxSeeksForKey)
                && java.util.Objects.equals(
                        this.rangeOptimizerMaxMemSize, other.rangeOptimizerMaxMemSize)
                && java.util.Objects.equals(
                        this.autoIncrementIncrement, other.autoIncrementIncrement)
                && java.util.Objects.equals(this.autoIncrementOffset, other.autoIncrementOffset)
                && java.util.Objects.equals(this.innodbAutoincLockMode, other.innodbAutoincLockMode)
                && java.util.Objects.equals(
                        this.innodbRollbackOnTimeout, other.innodbRollbackOnTimeout)
                && java.util.Objects.equals(
                        this.innodbOnlineAlterLogMaxSize, other.innodbOnlineAlterLogMaxSize)
                && java.util.Objects.equals(this.innodbSortBufferSize, other.innodbSortBufferSize)
                && java.util.Objects.equals(this.innodbNumaInterleave, other.innodbNumaInterleave)
                && java.util.Objects.equals(this.threadPoolSize, other.threadPoolSize)
                && java.util.Objects.equals(this.longQueryTime, other.longQueryTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.completionType == null ? 43 : this.completionType.hashCode());
        result = (result * PRIME) + (this.bigTables == null ? 43 : this.bigTables.hashCode());
        result =
                (result * PRIME)
                        + (this.characterSetServer == null
                                ? 43
                                : this.characterSetServer.hashCode());
        result =
                (result * PRIME)
                        + (this.collationServer == null ? 43 : this.collationServer.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionMemoryChunkSize == null
                                ? 43
                                : this.connectionMemoryChunkSize.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionMemoryLimit == null
                                ? 43
                                : this.connectionMemoryLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultAuthenticationPlugin == null
                                ? 43
                                : this.defaultAuthenticationPlugin.hashCode());
        result =
                (result * PRIME)
                        + (this.globalConnectionMemoryLimit == null
                                ? 43
                                : this.globalConnectionMemoryLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.globalConnectionMemoryTracking == null
                                ? 43
                                : this.globalConnectionMemoryTracking.hashCode());
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
                        + (this.groupConcatMaxLen == null ? 43 : this.groupConcatMaxLen.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbFtEnableStopword == null
                                ? 43
                                : this.innodbFtEnableStopword.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbLogWriterThreads == null
                                ? 43
                                : this.innodbLogWriterThreads.hashCode());
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
                        + (this.maxBinlogCacheSize == null
                                ? 43
                                : this.maxBinlogCacheSize.hashCode());
        result =
                (result * PRIME)
                        + (this.maxConnectErrors == null ? 43 : this.maxConnectErrors.hashCode());
        result =
                (result * PRIME)
                        + (this.maxHeapTableSize == null ? 43 : this.maxHeapTableSize.hashCode());
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
                        + (this.innodbBufferPoolDumpPct == null
                                ? 43
                                : this.innodbBufferPoolDumpPct.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbBufferPoolInstances == null
                                ? 43
                                : this.innodbBufferPoolInstances.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbDdlBufferSize == null
                                ? 43
                                : this.innodbDdlBufferSize.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbDdlThreads == null ? 43 : this.innodbDdlThreads.hashCode());
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
                        + (this.interactiveTimeout == null
                                ? 43
                                : this.interactiveTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbStatsPersistentSamplePages == null
                                ? 43
                                : this.innodbStatsPersistentSamplePages.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbStatsTransientSamplePages == null
                                ? 43
                                : this.innodbStatsTransientSamplePages.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbStrictMode == null ? 43 : this.innodbStrictMode.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAllowedPacket == null ? 43 : this.maxAllowedPacket.hashCode());
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
                        + (this.netReadTimeout == null ? 43 : this.netReadTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.netWriteTimeout == null ? 43 : this.netWriteTimeout.hashCode());
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
        result =
                (result * PRIME)
                        + (this.regexpTimeLimit == null ? 43 : this.regexpTimeLimit.hashCode());
        result = (result * PRIME) + (this.sqlMode == null ? 43 : this.sqlMode.hashCode());
        result = (result * PRIME) + (this.tmpTableSize == null ? 43 : this.tmpTableSize.hashCode());
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
                        + (this.sortBufferSize == null ? 43 : this.sortBufferSize.hashCode());
        result = (result * PRIME) + (this.waitTimeout == null ? 43 : this.waitTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.threadPoolDedicatedListeners == null
                                ? 43
                                : this.threadPoolDedicatedListeners.hashCode());
        result =
                (result * PRIME)
                        + (this.threadPoolMaxTransactionsLimit == null
                                ? 43
                                : this.threadPoolMaxTransactionsLimit.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.blockEncryptionMode == null
                                ? 43
                                : this.blockEncryptionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.binlogGroupCommitSyncDelay == null
                                ? 43
                                : this.binlogGroupCommitSyncDelay.hashCode());
        result =
                (result * PRIME)
                        + (this.binlogGroupCommitSyncNoDelayCount == null
                                ? 43
                                : this.binlogGroupCommitSyncNoDelayCount.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaNetTimeout == null ? 43 : this.replicaNetTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.requireSecureTransport == null
                                ? 43
                                : this.requireSecureTransport.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbRedoLogCapacity == null
                                ? 43
                                : this.innodbRedoLogCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.threadPoolTransactionDelay == null
                                ? 43
                                : this.threadPoolTransactionDelay.hashCode());
        result =
                (result * PRIME)
                        + (this.threadPoolQueryThreadsPerGroup == null
                                ? 43
                                : this.threadPoolQueryThreadsPerGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.explainFormat == null ? 43 : this.explainFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.explicitDefaultsForTimestamp == null
                                ? 43
                                : this.explicitDefaultsForTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlGenerateInvisiblePrimaryKey == null
                                ? 43
                                : this.sqlGenerateInvisiblePrimaryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.temptableMaxRam == null ? 43 : this.temptableMaxRam.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbChangeBuffering == null
                                ? 43
                                : this.innodbChangeBuffering.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbAdaptiveHashIndex == null
                                ? 43
                                : this.innodbAdaptiveHashIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbUndoLogTruncate == null
                                ? 43
                                : this.innodbUndoLogTruncate.hashCode());
        result =
                (result * PRIME)
                        + (this.tableDefinitionCache == null
                                ? 43
                                : this.tableDefinitionCache.hashCode());
        result =
                (result * PRIME)
                        + (this.tableOpenCache == null ? 43 : this.tableOpenCache.hashCode());
        result =
                (result * PRIME)
                        + (this.relayLogSpaceLimit == null
                                ? 43
                                : this.relayLogSpaceLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.optimizerSwitch == null ? 43 : this.optimizerSwitch.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaTypeConversions == null
                                ? 43
                                : this.replicaTypeConversions.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaParallelWorkers == null
                                ? 43
                                : this.replicaParallelWorkers.hashCode());
        result =
                (result * PRIME)
                        + (this.skipNameResolve == null ? 43 : this.skipNameResolve.hashCode());
        result =
                (result * PRIME)
                        + (this.maxUserConnections == null
                                ? 43
                                : this.maxUserConnections.hashCode());
        result =
                (result * PRIME)
                        + (this.joinBufferSize == null ? 43 : this.joinBufferSize.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSeeksForKey == null ? 43 : this.maxSeeksForKey.hashCode());
        result =
                (result * PRIME)
                        + (this.rangeOptimizerMaxMemSize == null
                                ? 43
                                : this.rangeOptimizerMaxMemSize.hashCode());
        result =
                (result * PRIME)
                        + (this.autoIncrementIncrement == null
                                ? 43
                                : this.autoIncrementIncrement.hashCode());
        result =
                (result * PRIME)
                        + (this.autoIncrementOffset == null
                                ? 43
                                : this.autoIncrementOffset.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbAutoincLockMode == null
                                ? 43
                                : this.innodbAutoincLockMode.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbRollbackOnTimeout == null
                                ? 43
                                : this.innodbRollbackOnTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbOnlineAlterLogMaxSize == null
                                ? 43
                                : this.innodbOnlineAlterLogMaxSize.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbSortBufferSize == null
                                ? 43
                                : this.innodbSortBufferSize.hashCode());
        result =
                (result * PRIME)
                        + (this.innodbNumaInterleave == null
                                ? 43
                                : this.innodbNumaInterleave.hashCode());
        result =
                (result * PRIME)
                        + (this.threadPoolSize == null ? 43 : this.threadPoolSize.hashCode());
        result =
                (result * PRIME)
                        + (this.longQueryTime == null ? 43 : this.longQueryTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
