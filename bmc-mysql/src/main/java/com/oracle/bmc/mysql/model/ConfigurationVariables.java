/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
        "timeZone"
    })
    public ConfigurationVariables(
            CompletionType completionType,
            Boolean bigTables,
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
            String timeZone) {
        super();
        this.completionType = completionType;
        this.bigTables = bigTables;
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
        /** ("default_authentication_plugin") */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationPlugin")
        private DefaultAuthenticationPlugin defaultAuthenticationPlugin;

        /**
         * ("default_authentication_plugin")
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
        /** ("local_infile") */
        @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
        private Boolean localInfile;

        /**
         * ("local_infile")
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationVariables build() {
            ConfigurationVariables model =
                    new ConfigurationVariables(
                            this.completionType,
                            this.bigTables,
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
                            this.timeZone);
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

    /** ("default_authentication_plugin") */
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
    /** ("default_authentication_plugin") */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationPlugin")
    private final DefaultAuthenticationPlugin defaultAuthenticationPlugin;

    /**
     * ("default_authentication_plugin")
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

    /** ("local_infile") */
    @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
    private final Boolean localInfile;

    /**
     * ("local_infile")
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
