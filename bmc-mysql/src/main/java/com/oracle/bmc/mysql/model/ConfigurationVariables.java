/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConfigurationVariables.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ConfigurationVariables {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * ("completion_type")
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CompletionType {
        NoChain("NO_CHAIN"),
        Chain("CHAIN"),
        Release("RELEASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    CompletionType completionType;
    /**
     * ("default_authentication_plugin")
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DefaultAuthenticationPlugin {
        MysqlNativePassword("mysql_native_password"),
        Sha256Password("sha256_password"),
        CachingSha2Password("caching_sha2_password"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    DefaultAuthenticationPlugin defaultAuthenticationPlugin;
    /**
     * ("transaction_isolation")
     **/
    @lombok.extern.slf4j.Slf4j
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
    TransactionIsolation transactionIsolation;

    /**
     * ("innodb_ft_server_stopword_table")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtServerStopwordTable")
    String innodbFtServerStopwordTable;

    /**
     * ("mandatory_roles")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mandatoryRoles")
    String mandatoryRoles;

    /**
     * ("autocommit")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autocommit")
    Boolean autocommit;

    /**
     * ("foreign_key_checks")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("foreignKeyChecks")
    Boolean foreignKeyChecks;
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
    @lombok.extern.slf4j.Slf4j
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
    GroupReplicationConsistency groupReplicationConsistency;

    /**
     * ("innodb_ft_enable_stopword")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtEnableStopword")
    Boolean innodbFtEnableStopword;

    /**
     * ("local_infile")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localInfile")
    Boolean localInfile;

    /**
     * ("mysql_firewall_mode")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlFirewallMode")
    Boolean mysqlFirewallMode;

    /**
     * ("mysqlx_enable_hello_notice") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxEnableHelloNotice")
    Boolean mysqlxEnableHelloNotice;

    /**
     * ("sql_require_primary_key")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlRequirePrimaryKey")
    Boolean sqlRequirePrimaryKey;

    /**
     * ("sql_warnings")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlWarnings")
    Boolean sqlWarnings;

    /**
     * ("binlog_expire_logs_seconds") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("binlogExpireLogsSeconds")
    Integer binlogExpireLogsSeconds;

    /**
     * ("innodb_buffer_pool_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolSize")
    Long innodbBufferPoolSize;

    /**
     * ("innodb_ft_result_cache_limit")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtResultCacheLimit")
    Integer innodbFtResultCacheLimit;

    /**
     * ("max_connections")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
    Integer maxConnections;

    /**
     * ("max_prepared_stmt_count")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxPreparedStmtCount")
    Integer maxPreparedStmtCount;

    /**
     * ("connect_timeout")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeout")
    Integer connectTimeout;

    /**
     * ("cte_max_recursion_depth")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cteMaxRecursionDepth")
    Integer cteMaxRecursionDepth;

    /**
     * ("generated_random_password_length") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("generatedRandomPasswordLength")
    Integer generatedRandomPasswordLength;

    /**
     * ("information_schema_stats_expiry")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("informationSchemaStatsExpiry")
    Integer informationSchemaStatsExpiry;

    /**
     * ("innodb_buffer_pool_instances")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbBufferPoolInstances")
    Integer innodbBufferPoolInstances;

    /**
     * ("innodb_ft_max_token_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMaxTokenSize")
    Integer innodbFtMaxTokenSize;

    /**
     * ("innodb_ft_min_token_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtMinTokenSize")
    Integer innodbFtMinTokenSize;

    /**
     * ("innodb_ft_num_word_optimize")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbFtNumWordOptimize")
    Integer innodbFtNumWordOptimize;

    /**
     * ("innodb_lock_wait_timeout")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbLockWaitTimeout")
    Integer innodbLockWaitTimeout;

    /**
     * ("innodb_max_purge_lag")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLag")
    Integer innodbMaxPurgeLag;

    /**
     * ("innodb_max_purge_lag_delay")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("innodbMaxPurgeLagDelay")
    Integer innodbMaxPurgeLagDelay;

    /**
     * ("max_execution_time")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxExecutionTime")
    Integer maxExecutionTime;

    /**
     * ("mysqlx_connect_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxConnectTimeout")
    Integer mysqlxConnectTimeout;

    /**
     * ("mysqlx_document_id_unique_prefix") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDocumentIdUniquePrefix")
    Integer mysqlxDocumentIdUniquePrefix;

    /**
     * ("mysqlx_idle_worker_thread_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxIdleWorkerThreadTimeout")
    Integer mysqlxIdleWorkerThreadTimeout;

    /**
     * ("mysqlx_interactive_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxInteractiveTimeout")
    Integer mysqlxInteractiveTimeout;

    /**
     * ("mysqlx_max_allowed_packet") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMaxAllowedPacket")
    Integer mysqlxMaxAllowedPacket;

    /**
     * ("mysqlx_min_worker_threads") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxMinWorkerThreads")
    Integer mysqlxMinWorkerThreads;

    /**
     * ("mysqlx_read_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxReadTimeout")
    Integer mysqlxReadTimeout;

    /**
     * ("mysqlx_wait_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWaitTimeout")
    Integer mysqlxWaitTimeout;

    /**
     * ("mysqlx_write_timeout") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxWriteTimeout")
    Integer mysqlxWriteTimeout;

    /**
     * ("parser_max_mem_size")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserMaxMemSize")
    Integer parserMaxMemSize;

    /**
     * ("query_alloc_block_size") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryAllocBlockSize")
    Integer queryAllocBlockSize;

    /**
     * ("query_prealloc_size") DEPRECATED -- variable should not be settable and will be ignored
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryPreallocSize")
    Integer queryPreallocSize;

    /**
     * ("sql_mode")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlMode")
    String sqlMode;

    /**
     * Set the default compression level for the deflate algorithm. ("mysqlx_deflate_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateDefaultCompressionLevel")
    Integer mysqlxDeflateDefaultCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the deflate algorithm. ("mysqlx_deflate_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxDeflateMaxClientCompressionLevel")
    Integer mysqlxDeflateMaxClientCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the lz4 algorithm. ("mysqlx_lz4_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4MaxClientCompressionLevel")
    Integer mysqlxLz4MaxClientCompressionLevel;

    /**
     * Set the default compression level for the lz4 algorithm. ("mysqlx_lz4_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxLz4DefaultCompressionLevel")
    Integer mysqlxLz4DefaultCompressionLevel;

    /**
     * Limit the upper bound of accepted compression levels for the zstd algorithm. ("mysqlx_zstd_max_client_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdMaxClientCompressionLevel")
    Integer mysqlxZstdMaxClientCompressionLevel;

    /**
     * Set the default compression level for the zstd algorithm. ("mysqlx_zstd_default_compression_level")
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlxZstdDefaultCompressionLevel")
    Integer mysqlxZstdDefaultCompressionLevel;

    /**
     * DEPRECATED -- typo of mysqlx_zstd_default_compression_level. variable will be ignored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlZstdDefaultCompressionLevel")
    Integer mysqlZstdDefaultCompressionLevel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
