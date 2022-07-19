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
        /**
         * ("completion_type")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("completionType")
        private CompletionType completionType;

        /**
         * ("completion_type")
         * @param completionType the value to set
         * @return this builder
         **/
        public Builder completionType(CompletionType completionType) {
            this.completionType = completionType;
            this.__explicitlySet__.add("completionType");
            return this;
        }
        /**
         * ("default_authentication_plugin")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationPlugin")
        private DefaultAuthenticationPlugin defaultAuthenticationPlugin;

        /**
         * ("default_authentication_plugin")
         * @param defaultAuthenticationPlugin the value to set
         * @return this builder
         **/
        public Builder defaultAuthenticationPlugin(
                DefaultAuthenticationPlugin defaultAuthenticationPlugin) {
            this.defaultAuthenticationPlugin = defaultAuthenticationPlugin;
            this.__explicitlySet__.add("defaultAuthenticationPlugin");
            return this;
        }
        /**
         * ("transaction_isolation")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transactionIsolation")
        private TransactionIsolation transactionIsolation;

        /**
         * ("transaction_isolation")
         * @param transactionIsolation the value to set
         * @return this builder
         **/
        public Builder transactionIsolation(TransactionIsolation transactionIsolation) {
            this.transactionIsolation = transactionIsolation;
            this.__explicitlySet__.add("transactionIsolation");
            return this;
        }
        /**
         * ("innodb_ft_server_stopword_table")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtServerStopwordTable")
        private String innodbFtServerStopwordTable;

        /**
         * ("innodb_ft_server_stopword_table")
         * @param innodbFtServerStopwordTable the value to set
         * @return this builder
         **/
        public Builder innodbFtServerStopwordTable(String innodbFtServerStopwordTable) {
            this.innodbFtServerStopwordTable = innodbFtServerStopwordTable;
            this.__explicitlySet__.add("innodbFtServerStopwordTable");
            return this;
        }
        /**
         * ("mandatory_roles")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mandatoryRoles")
        private String mandatoryRoles;

        /**
         * ("mandatory_roles")
         * @param mandatoryRoles the value to set
         * @return this builder
         **/
        public Builder mandatoryRoles(String mandatoryRoles) {
            this.mandatoryRoles = mandatoryRoles;
            this.__explicitlySet__.add("mandatoryRoles");
            return this;
        }
        /**
         * ("autocommit")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autocommit")
        private Boolean autocommit;

        /**
         * ("autocommit")
         * @param autocommit the value to set
         * @return this builder
         **/
        public Builder autocommit(Boolean autocommit) {
            this.autocommit = autocommit;
            this.__explicitlySet__.add("autocommit");
            return this;
        }
        /**
         * ("foreign_key_checks")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("foreignKeyChecks")
        private Boolean foreignKeyChecks;

        /**
         * ("foreign_key_checks")
         * @param foreignKeyChecks the value to set
         * @return this builder
         **/
        public Builder foreignKeyChecks(Boolean foreignKeyChecks) {
            this.foreignKeyChecks = foreignKeyChecks;
            this.__explicitlySet__.add("foreignKeyChecks");
            return this;
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
        @com.fasterxml.jackson.annotation.JsonProperty("groupReplicationConsistency")
        private GroupReplicationConsistency groupReplicationConsistency;

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
         * @param groupReplicationConsistency the value to set
         * @return this builder
         **/
        public Builder groupReplicationConsistency(
                GroupReplicationConsistency groupReplicationConsistency) {
            this.groupReplicationConsistency = groupReplicationConsistency;
            this.__explicitlySet__.add("groupReplicationConsistency");
            return this;
        }
        /**
         * ("innodb_ft_enable_stopword")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtEnableStopword")
        private Boolean innodbFtEnableStopword;

        /**
         * ("innodb_ft_enable_stopword")
         * @param innodbFtEnableStopword the value to set
         * @return this builder
         **/
        public Builder innodbFtEnableStopword(Boolean innodbFtEnableStopword) {
            this.innodbFtEnableStopword = innodbFtEnableStopword;
            this.__explicitlySet__.add("innodbFtEnableStopword");
            return this;
        }
        /**
         * ("local_infile")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
        private Boolean localInfile;

        /**
         * ("local_infile")
         * @param localInfile the value to set
         * @return this builder
         **/
        public Builder localInfile(Boolean localInfile) {
            this.localInfile = localInfile;
            this.__explicitlySet__.add("localInfile");
            return this;
        }
        /**
         * ("mysql_firewall_mode")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlFirewallMode")
        private Boolean mysqlFirewallMode;

        /**
         * ("mysql_firewall_mode")
         * @param mysqlFirewallMode the value to set
         * @return this builder
         **/
        public Builder mysqlFirewallMode(Boolean mysqlFirewallMode) {
            this.mysqlFirewallMode = mysqlFirewallMode;
            this.__explicitlySet__.add("mysqlFirewallMode");
            return this;
        }
        /**
         * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxEnableHelloNotice")
        private Boolean mysqlxEnableHelloNotice;

        /**
         * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxEnableHelloNotice the value to set
         * @return this builder
         **/
        public Builder mysqlxEnableHelloNotice(Boolean mysqlxEnableHelloNotice) {
            this.mysqlxEnableHelloNotice = mysqlxEnableHelloNotice;
            this.__explicitlySet__.add("mysqlxEnableHelloNotice");
            return this;
        }
        /**
         * ("sql_require_primary_key")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlRequirePrimaryKey")
        private Boolean sqlRequirePrimaryKey;

        /**
         * ("sql_require_primary_key")
         * @param sqlRequirePrimaryKey the value to set
         * @return this builder
         **/
        public Builder sqlRequirePrimaryKey(Boolean sqlRequirePrimaryKey) {
            this.sqlRequirePrimaryKey = sqlRequirePrimaryKey;
            this.__explicitlySet__.add("sqlRequirePrimaryKey");
            return this;
        }
        /**
         * ("sql_warnings")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlWarnings")
        private Boolean sqlWarnings;

        /**
         * ("sql_warnings")
         * @param sqlWarnings the value to set
         * @return this builder
         **/
        public Builder sqlWarnings(Boolean sqlWarnings) {
            this.sqlWarnings = sqlWarnings;
            this.__explicitlySet__.add("sqlWarnings");
            return this;
        }
        /**
         * Sets the binary log expiration period in seconds.
         * binlogExpireLogsSeconds corresponds to the MySQL binary logging system variable [binlog_expire_logs_seconds](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_expire_logs_seconds).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("binlogExpireLogsSeconds")
        private Integer binlogExpireLogsSeconds;

        /**
         * Sets the binary log expiration period in seconds.
         * binlogExpireLogsSeconds corresponds to the MySQL binary logging system variable [binlog_expire_logs_seconds](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_expire_logs_seconds).
         *
         * @param binlogExpireLogsSeconds the value to set
         * @return this builder
         **/
        public Builder binlogExpireLogsSeconds(Integer binlogExpireLogsSeconds) {
            this.binlogExpireLogsSeconds = binlogExpireLogsSeconds;
            this.__explicitlySet__.add("binlogExpireLogsSeconds");
            return this;
        }
        /**
         * Configures the amount of table metadata added to the binary log when using row-based logging.
         * binlogRowMetadata corresponds to the MySQL binary logging system variable [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("binlogRowMetadata")
        private BinlogRowMetadata binlogRowMetadata;

        /**
         * Configures the amount of table metadata added to the binary log when using row-based logging.
         * binlogRowMetadata corresponds to the MySQL binary logging system variable [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
         *
         * @param binlogRowMetadata the value to set
         * @return this builder
         **/
        public Builder binlogRowMetadata(BinlogRowMetadata binlogRowMetadata) {
            this.binlogRowMetadata = binlogRowMetadata;
            this.__explicitlySet__.add("binlogRowMetadata");
            return this;
        }
        /**
         * When set to PARTIAL_JSON, this enables use of a space-efficient binary log format for updates that modify only a small portion of a JSON document.
         * binlogRowValueOptions corresponds to the MySQL binary logging system variable [binlog_row_value_options](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_value_options).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("binlogRowValueOptions")
        private String binlogRowValueOptions;

        /**
         * When set to PARTIAL_JSON, this enables use of a space-efficient binary log format for updates that modify only a small portion of a JSON document.
         * binlogRowValueOptions corresponds to the MySQL binary logging system variable [binlog_row_value_options](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_value_options).
         *
         * @param binlogRowValueOptions the value to set
         * @return this builder
         **/
        public Builder binlogRowValueOptions(String binlogRowValueOptions) {
            this.binlogRowValueOptions = binlogRowValueOptions;
            this.__explicitlySet__.add("binlogRowValueOptions");
            return this;
        }
        /**
         * Enables compression for transactions that are written to binary log files on this server.
         * binlogTransactionCompression corresponds to the MySQL binary logging system variable [binlog_transaction_compression](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_transaction_compression).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("binlogTransactionCompression")
        private Boolean binlogTransactionCompression;

        /**
         * Enables compression for transactions that are written to binary log files on this server.
         * binlogTransactionCompression corresponds to the MySQL binary logging system variable [binlog_transaction_compression](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_transaction_compression).
         *
         * @param binlogTransactionCompression the value to set
         * @return this builder
         **/
        public Builder binlogTransactionCompression(Boolean binlogTransactionCompression) {
            this.binlogTransactionCompression = binlogTransactionCompression;
            this.__explicitlySet__.add("binlogTransactionCompression");
            return this;
        }
        /**
         * ("innodb_buffer_pool_size")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolSize")
        private Long innodbBufferPoolSize;

        /**
         * ("innodb_buffer_pool_size")
         * @param innodbBufferPoolSize the value to set
         * @return this builder
         **/
        public Builder innodbBufferPoolSize(Long innodbBufferPoolSize) {
            this.innodbBufferPoolSize = innodbBufferPoolSize;
            this.__explicitlySet__.add("innodbBufferPoolSize");
            return this;
        }
        /**
         * ("innodb_ft_result_cache_limit")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtResultCacheLimit")
        private Integer innodbFtResultCacheLimit;

        /**
         * ("innodb_ft_result_cache_limit")
         * @param innodbFtResultCacheLimit the value to set
         * @return this builder
         **/
        public Builder innodbFtResultCacheLimit(Integer innodbFtResultCacheLimit) {
            this.innodbFtResultCacheLimit = innodbFtResultCacheLimit;
            this.__explicitlySet__.add("innodbFtResultCacheLimit");
            return this;
        }
        /**
         * ("max_connections")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
        private Integer maxConnections;

        /**
         * ("max_connections")
         * @param maxConnections the value to set
         * @return this builder
         **/
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            this.__explicitlySet__.add("maxConnections");
            return this;
        }
        /**
         * ("max_prepared_stmt_count")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxPreparedStmtCount")
        private Integer maxPreparedStmtCount;

        /**
         * ("max_prepared_stmt_count")
         * @param maxPreparedStmtCount the value to set
         * @return this builder
         **/
        public Builder maxPreparedStmtCount(Integer maxPreparedStmtCount) {
            this.maxPreparedStmtCount = maxPreparedStmtCount;
            this.__explicitlySet__.add("maxPreparedStmtCount");
            return this;
        }
        /**
         * ("connect_timeout")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectTimeout")
        private Integer connectTimeout;

        /**
         * ("connect_timeout")
         * @param connectTimeout the value to set
         * @return this builder
         **/
        public Builder connectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            this.__explicitlySet__.add("connectTimeout");
            return this;
        }
        /**
         * ("cte_max_recursion_depth")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cteMaxRecursionDepth")
        private Integer cteMaxRecursionDepth;

        /**
         * ("cte_max_recursion_depth")
         * @param cteMaxRecursionDepth the value to set
         * @return this builder
         **/
        public Builder cteMaxRecursionDepth(Integer cteMaxRecursionDepth) {
            this.cteMaxRecursionDepth = cteMaxRecursionDepth;
            this.__explicitlySet__.add("cteMaxRecursionDepth");
            return this;
        }
        /**
         * ("generated_random_password_length") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("generatedRandomPasswordLength")
        private Integer generatedRandomPasswordLength;

        /**
         * ("generated_random_password_length") DEPRECATED -- variable should not be settable and will be ignored
         * @param generatedRandomPasswordLength the value to set
         * @return this builder
         **/
        public Builder generatedRandomPasswordLength(Integer generatedRandomPasswordLength) {
            this.generatedRandomPasswordLength = generatedRandomPasswordLength;
            this.__explicitlySet__.add("generatedRandomPasswordLength");
            return this;
        }
        /**
         * ("information_schema_stats_expiry")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("informationSchemaStatsExpiry")
        private Integer informationSchemaStatsExpiry;

        /**
         * ("information_schema_stats_expiry")
         * @param informationSchemaStatsExpiry the value to set
         * @return this builder
         **/
        public Builder informationSchemaStatsExpiry(Integer informationSchemaStatsExpiry) {
            this.informationSchemaStatsExpiry = informationSchemaStatsExpiry;
            this.__explicitlySet__.add("informationSchemaStatsExpiry");
            return this;
        }
        /**
         * ("innodb_buffer_pool_instances")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolInstances")
        private Integer innodbBufferPoolInstances;

        /**
         * ("innodb_buffer_pool_instances")
         * @param innodbBufferPoolInstances the value to set
         * @return this builder
         **/
        public Builder innodbBufferPoolInstances(Integer innodbBufferPoolInstances) {
            this.innodbBufferPoolInstances = innodbBufferPoolInstances;
            this.__explicitlySet__.add("innodbBufferPoolInstances");
            return this;
        }
        /**
         * ("innodb_ft_max_token_size")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMaxTokenSize")
        private Integer innodbFtMaxTokenSize;

        /**
         * ("innodb_ft_max_token_size")
         * @param innodbFtMaxTokenSize the value to set
         * @return this builder
         **/
        public Builder innodbFtMaxTokenSize(Integer innodbFtMaxTokenSize) {
            this.innodbFtMaxTokenSize = innodbFtMaxTokenSize;
            this.__explicitlySet__.add("innodbFtMaxTokenSize");
            return this;
        }
        /**
         * ("innodb_ft_min_token_size")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMinTokenSize")
        private Integer innodbFtMinTokenSize;

        /**
         * ("innodb_ft_min_token_size")
         * @param innodbFtMinTokenSize the value to set
         * @return this builder
         **/
        public Builder innodbFtMinTokenSize(Integer innodbFtMinTokenSize) {
            this.innodbFtMinTokenSize = innodbFtMinTokenSize;
            this.__explicitlySet__.add("innodbFtMinTokenSize");
            return this;
        }
        /**
         * ("innodb_ft_num_word_optimize")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbFtNumWordOptimize")
        private Integer innodbFtNumWordOptimize;

        /**
         * ("innodb_ft_num_word_optimize")
         * @param innodbFtNumWordOptimize the value to set
         * @return this builder
         **/
        public Builder innodbFtNumWordOptimize(Integer innodbFtNumWordOptimize) {
            this.innodbFtNumWordOptimize = innodbFtNumWordOptimize;
            this.__explicitlySet__.add("innodbFtNumWordOptimize");
            return this;
        }
        /**
         * ("innodb_lock_wait_timeout")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbLockWaitTimeout")
        private Integer innodbLockWaitTimeout;

        /**
         * ("innodb_lock_wait_timeout")
         * @param innodbLockWaitTimeout the value to set
         * @return this builder
         **/
        public Builder innodbLockWaitTimeout(Integer innodbLockWaitTimeout) {
            this.innodbLockWaitTimeout = innodbLockWaitTimeout;
            this.__explicitlySet__.add("innodbLockWaitTimeout");
            return this;
        }
        /**
         * ("innodb_max_purge_lag")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLag")
        private Integer innodbMaxPurgeLag;

        /**
         * ("innodb_max_purge_lag")
         * @param innodbMaxPurgeLag the value to set
         * @return this builder
         **/
        public Builder innodbMaxPurgeLag(Integer innodbMaxPurgeLag) {
            this.innodbMaxPurgeLag = innodbMaxPurgeLag;
            this.__explicitlySet__.add("innodbMaxPurgeLag");
            return this;
        }
        /**
         * ("innodb_max_purge_lag_delay")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLagDelay")
        private Integer innodbMaxPurgeLagDelay;

        /**
         * ("innodb_max_purge_lag_delay")
         * @param innodbMaxPurgeLagDelay the value to set
         * @return this builder
         **/
        public Builder innodbMaxPurgeLagDelay(Integer innodbMaxPurgeLagDelay) {
            this.innodbMaxPurgeLagDelay = innodbMaxPurgeLagDelay;
            this.__explicitlySet__.add("innodbMaxPurgeLagDelay");
            return this;
        }
        /**
         * ("max_execution_time")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxExecutionTime")
        private Integer maxExecutionTime;

        /**
         * ("max_execution_time")
         * @param maxExecutionTime the value to set
         * @return this builder
         **/
        public Builder maxExecutionTime(Integer maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            this.__explicitlySet__.add("maxExecutionTime");
            return this;
        }
        /**
         * ("mysqlx_connect_timeout") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxConnectTimeout")
        private Integer mysqlxConnectTimeout;

        /**
         * ("mysqlx_connect_timeout") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxConnectTimeout the value to set
         * @return this builder
         **/
        public Builder mysqlxConnectTimeout(Integer mysqlxConnectTimeout) {
            this.mysqlxConnectTimeout = mysqlxConnectTimeout;
            this.__explicitlySet__.add("mysqlxConnectTimeout");
            return this;
        }
        /**
         * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDocumentIdUniquePrefix")
        private Integer mysqlxDocumentIdUniquePrefix;

        /**
         * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxDocumentIdUniquePrefix the value to set
         * @return this builder
         **/
        public Builder mysqlxDocumentIdUniquePrefix(Integer mysqlxDocumentIdUniquePrefix) {
            this.mysqlxDocumentIdUniquePrefix = mysqlxDocumentIdUniquePrefix;
            this.__explicitlySet__.add("mysqlxDocumentIdUniquePrefix");
            return this;
        }
        /**
         * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxIdleWorkerThreadTimeout")
        private Integer mysqlxIdleWorkerThreadTimeout;

        /**
         * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxIdleWorkerThreadTimeout the value to set
         * @return this builder
         **/
        public Builder mysqlxIdleWorkerThreadTimeout(Integer mysqlxIdleWorkerThreadTimeout) {
            this.mysqlxIdleWorkerThreadTimeout = mysqlxIdleWorkerThreadTimeout;
            this.__explicitlySet__.add("mysqlxIdleWorkerThreadTimeout");
            return this;
        }
        /**
         * ("mysqlx_interactive_timeout") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxInteractiveTimeout")
        private Integer mysqlxInteractiveTimeout;

        /**
         * ("mysqlx_interactive_timeout") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxInteractiveTimeout the value to set
         * @return this builder
         **/
        public Builder mysqlxInteractiveTimeout(Integer mysqlxInteractiveTimeout) {
            this.mysqlxInteractiveTimeout = mysqlxInteractiveTimeout;
            this.__explicitlySet__.add("mysqlxInteractiveTimeout");
            return this;
        }
        /**
         * ("mysqlx_max_allowed_packet") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMaxAllowedPacket")
        private Integer mysqlxMaxAllowedPacket;

        /**
         * ("mysqlx_max_allowed_packet") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxMaxAllowedPacket the value to set
         * @return this builder
         **/
        public Builder mysqlxMaxAllowedPacket(Integer mysqlxMaxAllowedPacket) {
            this.mysqlxMaxAllowedPacket = mysqlxMaxAllowedPacket;
            this.__explicitlySet__.add("mysqlxMaxAllowedPacket");
            return this;
        }
        /**
         * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMinWorkerThreads")
        private Integer mysqlxMinWorkerThreads;

        /**
         * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxMinWorkerThreads the value to set
         * @return this builder
         **/
        public Builder mysqlxMinWorkerThreads(Integer mysqlxMinWorkerThreads) {
            this.mysqlxMinWorkerThreads = mysqlxMinWorkerThreads;
            this.__explicitlySet__.add("mysqlxMinWorkerThreads");
            return this;
        }
        /**
         * ("mysqlx_read_timeout") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxReadTimeout")
        private Integer mysqlxReadTimeout;

        /**
         * ("mysqlx_read_timeout") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxReadTimeout the value to set
         * @return this builder
         **/
        public Builder mysqlxReadTimeout(Integer mysqlxReadTimeout) {
            this.mysqlxReadTimeout = mysqlxReadTimeout;
            this.__explicitlySet__.add("mysqlxReadTimeout");
            return this;
        }
        /**
         * ("mysqlx_wait_timeout") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWaitTimeout")
        private Integer mysqlxWaitTimeout;

        /**
         * ("mysqlx_wait_timeout") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxWaitTimeout the value to set
         * @return this builder
         **/
        public Builder mysqlxWaitTimeout(Integer mysqlxWaitTimeout) {
            this.mysqlxWaitTimeout = mysqlxWaitTimeout;
            this.__explicitlySet__.add("mysqlxWaitTimeout");
            return this;
        }
        /**
         * ("mysqlx_write_timeout") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWriteTimeout")
        private Integer mysqlxWriteTimeout;

        /**
         * ("mysqlx_write_timeout") DEPRECATED -- variable should not be settable and will be ignored
         * @param mysqlxWriteTimeout the value to set
         * @return this builder
         **/
        public Builder mysqlxWriteTimeout(Integer mysqlxWriteTimeout) {
            this.mysqlxWriteTimeout = mysqlxWriteTimeout;
            this.__explicitlySet__.add("mysqlxWriteTimeout");
            return this;
        }
        /**
         * ("parser_max_mem_size")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserMaxMemSize")
        private Integer parserMaxMemSize;

        /**
         * ("parser_max_mem_size")
         * @param parserMaxMemSize the value to set
         * @return this builder
         **/
        public Builder parserMaxMemSize(Integer parserMaxMemSize) {
            this.parserMaxMemSize = parserMaxMemSize;
            this.__explicitlySet__.add("parserMaxMemSize");
            return this;
        }
        /**
         * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryAllocBlockSize")
        private Integer queryAllocBlockSize;

        /**
         * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be ignored
         * @param queryAllocBlockSize the value to set
         * @return this builder
         **/
        public Builder queryAllocBlockSize(Integer queryAllocBlockSize) {
            this.queryAllocBlockSize = queryAllocBlockSize;
            this.__explicitlySet__.add("queryAllocBlockSize");
            return this;
        }
        /**
         * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryPreallocSize")
        private Integer queryPreallocSize;

        /**
         * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
         * @param queryPreallocSize the value to set
         * @return this builder
         **/
        public Builder queryPreallocSize(Integer queryPreallocSize) {
            this.queryPreallocSize = queryPreallocSize;
            this.__explicitlySet__.add("queryPreallocSize");
            return this;
        }
        /**
         * ("sql_mode")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlMode")
        private String sqlMode;

        /**
         * ("sql_mode")
         * @param sqlMode the value to set
         * @return this builder
         **/
        public Builder sqlMode(String sqlMode) {
            this.sqlMode = sqlMode;
            this.__explicitlySet__.add("sqlMode");
            return this;
        }
        /**
         * Set the default compression level for the deflate algorithm. ("mysqlx_deflate_default_compression_level")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateDefaultCompressionLevel")
        private Integer mysqlxDeflateDefaultCompressionLevel;

        /**
         * Set the default compression level for the deflate algorithm. ("mysqlx_deflate_default_compression_level")
         * @param mysqlxDeflateDefaultCompressionLevel the value to set
         * @return this builder
         **/
        public Builder mysqlxDeflateDefaultCompressionLevel(
                Integer mysqlxDeflateDefaultCompressionLevel) {
            this.mysqlxDeflateDefaultCompressionLevel = mysqlxDeflateDefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxDeflateDefaultCompressionLevel");
            return this;
        }
        /**
         * Limit the upper bound of accepted compression levels for the deflate algorithm. ("mysqlx_deflate_max_client_compression_level")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateMaxClientCompressionLevel")
        private Integer mysqlxDeflateMaxClientCompressionLevel;

        /**
         * Limit the upper bound of accepted compression levels for the deflate algorithm. ("mysqlx_deflate_max_client_compression_level")
         * @param mysqlxDeflateMaxClientCompressionLevel the value to set
         * @return this builder
         **/
        public Builder mysqlxDeflateMaxClientCompressionLevel(
                Integer mysqlxDeflateMaxClientCompressionLevel) {
            this.mysqlxDeflateMaxClientCompressionLevel = mysqlxDeflateMaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxDeflateMaxClientCompressionLevel");
            return this;
        }
        /**
         * Limit the upper bound of accepted compression levels for the lz4 algorithm. ("mysqlx_lz4_max_client_compression_level")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4MaxClientCompressionLevel")
        private Integer mysqlxLz4MaxClientCompressionLevel;

        /**
         * Limit the upper bound of accepted compression levels for the lz4 algorithm. ("mysqlx_lz4_max_client_compression_level")
         * @param mysqlxLz4MaxClientCompressionLevel the value to set
         * @return this builder
         **/
        public Builder mysqlxLz4MaxClientCompressionLevel(
                Integer mysqlxLz4MaxClientCompressionLevel) {
            this.mysqlxLz4MaxClientCompressionLevel = mysqlxLz4MaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxLz4MaxClientCompressionLevel");
            return this;
        }
        /**
         * Set the default compression level for the lz4 algorithm. ("mysqlx_lz4_default_compression_level")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4DefaultCompressionLevel")
        private Integer mysqlxLz4DefaultCompressionLevel;

        /**
         * Set the default compression level for the lz4 algorithm. ("mysqlx_lz4_default_compression_level")
         * @param mysqlxLz4DefaultCompressionLevel the value to set
         * @return this builder
         **/
        public Builder mysqlxLz4DefaultCompressionLevel(Integer mysqlxLz4DefaultCompressionLevel) {
            this.mysqlxLz4DefaultCompressionLevel = mysqlxLz4DefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxLz4DefaultCompressionLevel");
            return this;
        }
        /**
         * Limit the upper bound of accepted compression levels for the zstd algorithm. ("mysqlx_zstd_max_client_compression_level")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdMaxClientCompressionLevel")
        private Integer mysqlxZstdMaxClientCompressionLevel;

        /**
         * Limit the upper bound of accepted compression levels for the zstd algorithm. ("mysqlx_zstd_max_client_compression_level")
         * @param mysqlxZstdMaxClientCompressionLevel the value to set
         * @return this builder
         **/
        public Builder mysqlxZstdMaxClientCompressionLevel(
                Integer mysqlxZstdMaxClientCompressionLevel) {
            this.mysqlxZstdMaxClientCompressionLevel = mysqlxZstdMaxClientCompressionLevel;
            this.__explicitlySet__.add("mysqlxZstdMaxClientCompressionLevel");
            return this;
        }
        /**
         * Set the default compression level for the zstd algorithm. ("mysqlx_zstd_default_compression_level")
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdDefaultCompressionLevel")
        private Integer mysqlxZstdDefaultCompressionLevel;

        /**
         * Set the default compression level for the zstd algorithm. ("mysqlx_zstd_default_compression_level")
         * @param mysqlxZstdDefaultCompressionLevel the value to set
         * @return this builder
         **/
        public Builder mysqlxZstdDefaultCompressionLevel(
                Integer mysqlxZstdDefaultCompressionLevel) {
            this.mysqlxZstdDefaultCompressionLevel = mysqlxZstdDefaultCompressionLevel;
            this.__explicitlySet__.add("mysqlxZstdDefaultCompressionLevel");
            return this;
        }
        /**
         * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlZstdDefaultCompressionLevel")
        private Integer mysqlZstdDefaultCompressionLevel;

        /**
         * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
         * @param mysqlZstdDefaultCompressionLevel the value to set
         * @return this builder
         **/
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

    /**
     * ("completion_type")
     * @return the value
     **/
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

    /**
     * ("default_authentication_plugin")
     * @return the value
     **/
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

    /**
     * ("transaction_isolation")
     * @return the value
     **/
    public TransactionIsolation getTransactionIsolation() {
        return transactionIsolation;
    }

    /**
     * ("innodb_ft_server_stopword_table")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtServerStopwordTable")
    private final String innodbFtServerStopwordTable;

    /**
     * ("innodb_ft_server_stopword_table")
     * @return the value
     **/
    public String getInnodbFtServerStopwordTable() {
        return innodbFtServerStopwordTable;
    }

    /**
     * ("mandatory_roles")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mandatoryRoles")
    private final String mandatoryRoles;

    /**
     * ("mandatory_roles")
     * @return the value
     **/
    public String getMandatoryRoles() {
        return mandatoryRoles;
    }

    /**
     * ("autocommit")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autocommit")
    private final Boolean autocommit;

    /**
     * ("autocommit")
     * @return the value
     **/
    public Boolean getAutocommit() {
        return autocommit;
    }

    /**
     * ("foreign_key_checks")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("foreignKeyChecks")
    private final Boolean foreignKeyChecks;

    /**
     * ("foreign_key_checks")
     * @return the value
     **/
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
     * @return the value
     **/
    public GroupReplicationConsistency getGroupReplicationConsistency() {
        return groupReplicationConsistency;
    }

    /**
     * ("innodb_ft_enable_stopword")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtEnableStopword")
    private final Boolean innodbFtEnableStopword;

    /**
     * ("innodb_ft_enable_stopword")
     * @return the value
     **/
    public Boolean getInnodbFtEnableStopword() {
        return innodbFtEnableStopword;
    }

    /**
     * ("local_infile")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
    private final Boolean localInfile;

    /**
     * ("local_infile")
     * @return the value
     **/
    public Boolean getLocalInfile() {
        return localInfile;
    }

    /**
     * ("mysql_firewall_mode")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlFirewallMode")
    private final Boolean mysqlFirewallMode;

    /**
     * ("mysql_firewall_mode")
     * @return the value
     **/
    public Boolean getMysqlFirewallMode() {
        return mysqlFirewallMode;
    }

    /**
     * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxEnableHelloNotice")
    private final Boolean mysqlxEnableHelloNotice;

    /**
     * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Boolean getMysqlxEnableHelloNotice() {
        return mysqlxEnableHelloNotice;
    }

    /**
     * ("sql_require_primary_key")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlRequirePrimaryKey")
    private final Boolean sqlRequirePrimaryKey;

    /**
     * ("sql_require_primary_key")
     * @return the value
     **/
    public Boolean getSqlRequirePrimaryKey() {
        return sqlRequirePrimaryKey;
    }

    /**
     * ("sql_warnings")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlWarnings")
    private final Boolean sqlWarnings;

    /**
     * ("sql_warnings")
     * @return the value
     **/
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

    /**
     * Sets the binary log expiration period in seconds.
     * binlogExpireLogsSeconds corresponds to the MySQL binary logging system variable [binlog_expire_logs_seconds](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_expire_logs_seconds).
     *
     * @return the value
     **/
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

    /**
     * Configures the amount of table metadata added to the binary log when using row-based logging.
     * binlogRowMetadata corresponds to the MySQL binary logging system variable [binlog_row_metadata](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_metadata).
     *
     * @return the value
     **/
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

    /**
     * When set to PARTIAL_JSON, this enables use of a space-efficient binary log format for updates that modify only a small portion of a JSON document.
     * binlogRowValueOptions corresponds to the MySQL binary logging system variable [binlog_row_value_options](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_row_value_options).
     *
     * @return the value
     **/
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

    /**
     * Enables compression for transactions that are written to binary log files on this server.
     * binlogTransactionCompression corresponds to the MySQL binary logging system variable [binlog_transaction_compression](https://dev.mysql.com/doc/refman/8.0/en/replication-options-binary-log.html#sysvar_binlog_transaction_compression).
     *
     * @return the value
     **/
    public Boolean getBinlogTransactionCompression() {
        return binlogTransactionCompression;
    }

    /**
     * ("innodb_buffer_pool_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolSize")
    private final Long innodbBufferPoolSize;

    /**
     * ("innodb_buffer_pool_size")
     * @return the value
     **/
    public Long getInnodbBufferPoolSize() {
        return innodbBufferPoolSize;
    }

    /**
     * ("innodb_ft_result_cache_limit")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtResultCacheLimit")
    private final Integer innodbFtResultCacheLimit;

    /**
     * ("innodb_ft_result_cache_limit")
     * @return the value
     **/
    public Integer getInnodbFtResultCacheLimit() {
        return innodbFtResultCacheLimit;
    }

    /**
     * ("max_connections")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
    private final Integer maxConnections;

    /**
     * ("max_connections")
     * @return the value
     **/
    public Integer getMaxConnections() {
        return maxConnections;
    }

    /**
     * ("max_prepared_stmt_count")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxPreparedStmtCount")
    private final Integer maxPreparedStmtCount;

    /**
     * ("max_prepared_stmt_count")
     * @return the value
     **/
    public Integer getMaxPreparedStmtCount() {
        return maxPreparedStmtCount;
    }

    /**
     * ("connect_timeout")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeout")
    private final Integer connectTimeout;

    /**
     * ("connect_timeout")
     * @return the value
     **/
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * ("cte_max_recursion_depth")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cteMaxRecursionDepth")
    private final Integer cteMaxRecursionDepth;

    /**
     * ("cte_max_recursion_depth")
     * @return the value
     **/
    public Integer getCteMaxRecursionDepth() {
        return cteMaxRecursionDepth;
    }

    /**
     * ("generated_random_password_length") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("generatedRandomPasswordLength")
    private final Integer generatedRandomPasswordLength;

    /**
     * ("generated_random_password_length") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getGeneratedRandomPasswordLength() {
        return generatedRandomPasswordLength;
    }

    /**
     * ("information_schema_stats_expiry")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("informationSchemaStatsExpiry")
    private final Integer informationSchemaStatsExpiry;

    /**
     * ("information_schema_stats_expiry")
     * @return the value
     **/
    public Integer getInformationSchemaStatsExpiry() {
        return informationSchemaStatsExpiry;
    }

    /**
     * ("innodb_buffer_pool_instances")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolInstances")
    private final Integer innodbBufferPoolInstances;

    /**
     * ("innodb_buffer_pool_instances")
     * @return the value
     **/
    public Integer getInnodbBufferPoolInstances() {
        return innodbBufferPoolInstances;
    }

    /**
     * ("innodb_ft_max_token_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMaxTokenSize")
    private final Integer innodbFtMaxTokenSize;

    /**
     * ("innodb_ft_max_token_size")
     * @return the value
     **/
    public Integer getInnodbFtMaxTokenSize() {
        return innodbFtMaxTokenSize;
    }

    /**
     * ("innodb_ft_min_token_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMinTokenSize")
    private final Integer innodbFtMinTokenSize;

    /**
     * ("innodb_ft_min_token_size")
     * @return the value
     **/
    public Integer getInnodbFtMinTokenSize() {
        return innodbFtMinTokenSize;
    }

    /**
     * ("innodb_ft_num_word_optimize")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtNumWordOptimize")
    private final Integer innodbFtNumWordOptimize;

    /**
     * ("innodb_ft_num_word_optimize")
     * @return the value
     **/
    public Integer getInnodbFtNumWordOptimize() {
        return innodbFtNumWordOptimize;
    }

    /**
     * ("innodb_lock_wait_timeout")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbLockWaitTimeout")
    private final Integer innodbLockWaitTimeout;

    /**
     * ("innodb_lock_wait_timeout")
     * @return the value
     **/
    public Integer getInnodbLockWaitTimeout() {
        return innodbLockWaitTimeout;
    }

    /**
     * ("innodb_max_purge_lag")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLag")
    private final Integer innodbMaxPurgeLag;

    /**
     * ("innodb_max_purge_lag")
     * @return the value
     **/
    public Integer getInnodbMaxPurgeLag() {
        return innodbMaxPurgeLag;
    }

    /**
     * ("innodb_max_purge_lag_delay")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLagDelay")
    private final Integer innodbMaxPurgeLagDelay;

    /**
     * ("innodb_max_purge_lag_delay")
     * @return the value
     **/
    public Integer getInnodbMaxPurgeLagDelay() {
        return innodbMaxPurgeLagDelay;
    }

    /**
     * ("max_execution_time")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxExecutionTime")
    private final Integer maxExecutionTime;

    /**
     * ("max_execution_time")
     * @return the value
     **/
    public Integer getMaxExecutionTime() {
        return maxExecutionTime;
    }

    /**
     * ("mysqlx_connect_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxConnectTimeout")
    private final Integer mysqlxConnectTimeout;

    /**
     * ("mysqlx_connect_timeout") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxConnectTimeout() {
        return mysqlxConnectTimeout;
    }

    /**
     * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDocumentIdUniquePrefix")
    private final Integer mysqlxDocumentIdUniquePrefix;

    /**
     * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxDocumentIdUniquePrefix() {
        return mysqlxDocumentIdUniquePrefix;
    }

    /**
     * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxIdleWorkerThreadTimeout")
    private final Integer mysqlxIdleWorkerThreadTimeout;

    /**
     * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxIdleWorkerThreadTimeout() {
        return mysqlxIdleWorkerThreadTimeout;
    }

    /**
     * ("mysqlx_interactive_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxInteractiveTimeout")
    private final Integer mysqlxInteractiveTimeout;

    /**
     * ("mysqlx_interactive_timeout") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxInteractiveTimeout() {
        return mysqlxInteractiveTimeout;
    }

    /**
     * ("mysqlx_max_allowed_packet") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMaxAllowedPacket")
    private final Integer mysqlxMaxAllowedPacket;

    /**
     * ("mysqlx_max_allowed_packet") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxMaxAllowedPacket() {
        return mysqlxMaxAllowedPacket;
    }

    /**
     * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMinWorkerThreads")
    private final Integer mysqlxMinWorkerThreads;

    /**
     * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxMinWorkerThreads() {
        return mysqlxMinWorkerThreads;
    }

    /**
     * ("mysqlx_read_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxReadTimeout")
    private final Integer mysqlxReadTimeout;

    /**
     * ("mysqlx_read_timeout") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxReadTimeout() {
        return mysqlxReadTimeout;
    }

    /**
     * ("mysqlx_wait_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWaitTimeout")
    private final Integer mysqlxWaitTimeout;

    /**
     * ("mysqlx_wait_timeout") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxWaitTimeout() {
        return mysqlxWaitTimeout;
    }

    /**
     * ("mysqlx_write_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWriteTimeout")
    private final Integer mysqlxWriteTimeout;

    /**
     * ("mysqlx_write_timeout") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getMysqlxWriteTimeout() {
        return mysqlxWriteTimeout;
    }

    /**
     * ("parser_max_mem_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserMaxMemSize")
    private final Integer parserMaxMemSize;

    /**
     * ("parser_max_mem_size")
     * @return the value
     **/
    public Integer getParserMaxMemSize() {
        return parserMaxMemSize;
    }

    /**
     * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryAllocBlockSize")
    private final Integer queryAllocBlockSize;

    /**
     * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getQueryAllocBlockSize() {
        return queryAllocBlockSize;
    }

    /**
     * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryPreallocSize")
    private final Integer queryPreallocSize;

    /**
     * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
     * @return the value
     **/
    public Integer getQueryPreallocSize() {
        return queryPreallocSize;
    }

    /**
     * ("sql_mode")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlMode")
    private final String sqlMode;

    /**
     * ("sql_mode")
     * @return the value
     **/
    public String getSqlMode() {
        return sqlMode;
    }

    /**
     * Set the default compression level for the deflate algorithm. ("mysqlx_deflate_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateDefaultCompressionLevel")
    private final Integer mysqlxDeflateDefaultCompressionLevel;

    /**
     * Set the default compression level for the deflate algorithm. ("mysqlx_deflate_default_compression_level")
     * @return the value
     **/
    public Integer getMysqlxDeflateDefaultCompressionLevel() {
        return mysqlxDeflateDefaultCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the deflate algorithm. ("mysqlx_deflate_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateMaxClientCompressionLevel")
    private final Integer mysqlxDeflateMaxClientCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the deflate algorithm. ("mysqlx_deflate_max_client_compression_level")
     * @return the value
     **/
    public Integer getMysqlxDeflateMaxClientCompressionLevel() {
        return mysqlxDeflateMaxClientCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the lz4 algorithm. ("mysqlx_lz4_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4MaxClientCompressionLevel")
    private final Integer mysqlxLz4MaxClientCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the lz4 algorithm. ("mysqlx_lz4_max_client_compression_level")
     * @return the value
     **/
    public Integer getMysqlxLz4MaxClientCompressionLevel() {
        return mysqlxLz4MaxClientCompressionLevel;
    }

    /**
     * Set the default compression level for the lz4 algorithm. ("mysqlx_lz4_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4DefaultCompressionLevel")
    private final Integer mysqlxLz4DefaultCompressionLevel;

    /**
     * Set the default compression level for the lz4 algorithm. ("mysqlx_lz4_default_compression_level")
     * @return the value
     **/
    public Integer getMysqlxLz4DefaultCompressionLevel() {
        return mysqlxLz4DefaultCompressionLevel;
    }

    /**
     * Limit the upper bound of accepted compression levels for the zstd algorithm. ("mysqlx_zstd_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdMaxClientCompressionLevel")
    private final Integer mysqlxZstdMaxClientCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the zstd algorithm. ("mysqlx_zstd_max_client_compression_level")
     * @return the value
     **/
    public Integer getMysqlxZstdMaxClientCompressionLevel() {
        return mysqlxZstdMaxClientCompressionLevel;
    }

    /**
     * Set the default compression level for the zstd algorithm. ("mysqlx_zstd_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdDefaultCompressionLevel")
    private final Integer mysqlxZstdDefaultCompressionLevel;

    /**
     * Set the default compression level for the zstd algorithm. ("mysqlx_zstd_default_compression_level")
     * @return the value
     **/
    public Integer getMysqlxZstdDefaultCompressionLevel() {
        return mysqlxZstdDefaultCompressionLevel;
    }

    /**
     * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlZstdDefaultCompressionLevel")
    private final Integer mysqlZstdDefaultCompressionLevel;

    /**
     * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
     * @return the value
     **/
    public Integer getMysqlZstdDefaultCompressionLevel() {
        return mysqlZstdDefaultCompressionLevel;
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
