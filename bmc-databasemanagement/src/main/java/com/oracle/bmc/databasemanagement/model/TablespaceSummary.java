/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of a tablespace. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TablespaceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TablespaceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "status",
        "blockSizeBytes",
        "logging",
        "isForceLogging",
        "extentManagement",
        "allocationType",
        "isPluggedIn",
        "segmentSpaceManagement",
        "defaultTableCompression",
        "retention",
        "isBigfile",
        "predicateEvaluation",
        "isEncrypted",
        "compressFor",
        "defaultInMemory",
        "defaultInMemoryPriority",
        "defaultInMemoryDistribute",
        "defaultInMemoryCompression",
        "defaultInMemoryDuplicate",
        "shared",
        "defaultIndexCompression",
        "indexCompressFor",
        "defaultCellMemory",
        "defaultInMemoryService",
        "defaultInMemoryServiceName",
        "lostWriteProtect",
        "isChunkTablespace",
        "tempGroup",
        "maxSizeKB",
        "allocatedSizeKB",
        "userSizeKB",
        "freeSpaceKB",
        "usedSpaceKB",
        "usedPercentAvailable",
        "usedPercentAllocated",
        "isDefault",
        "datafiles"
    })
    public TablespaceSummary(
            String name,
            Type type,
            Status status,
            java.math.BigDecimal blockSizeBytes,
            Logging logging,
            Boolean isForceLogging,
            ExtentManagement extentManagement,
            AllocationType allocationType,
            Boolean isPluggedIn,
            SegmentSpaceManagement segmentSpaceManagement,
            DefaultTableCompression defaultTableCompression,
            Retention retention,
            Boolean isBigfile,
            PredicateEvaluation predicateEvaluation,
            Boolean isEncrypted,
            CompressFor compressFor,
            DefaultInMemory defaultInMemory,
            DefaultInMemoryPriority defaultInMemoryPriority,
            DefaultInMemoryDistribute defaultInMemoryDistribute,
            DefaultInMemoryCompression defaultInMemoryCompression,
            DefaultInMemoryDuplicate defaultInMemoryDuplicate,
            Shared shared,
            DefaultIndexCompression defaultIndexCompression,
            IndexCompressFor indexCompressFor,
            String defaultCellMemory,
            DefaultInMemoryService defaultInMemoryService,
            String defaultInMemoryServiceName,
            LostWriteProtect lostWriteProtect,
            Boolean isChunkTablespace,
            String tempGroup,
            java.math.BigDecimal maxSizeKB,
            java.math.BigDecimal allocatedSizeKB,
            java.math.BigDecimal userSizeKB,
            java.math.BigDecimal freeSpaceKB,
            java.math.BigDecimal usedSpaceKB,
            Double usedPercentAvailable,
            Double usedPercentAllocated,
            Boolean isDefault,
            java.util.List<Datafile> datafiles) {
        super();
        this.name = name;
        this.type = type;
        this.status = status;
        this.blockSizeBytes = blockSizeBytes;
        this.logging = logging;
        this.isForceLogging = isForceLogging;
        this.extentManagement = extentManagement;
        this.allocationType = allocationType;
        this.isPluggedIn = isPluggedIn;
        this.segmentSpaceManagement = segmentSpaceManagement;
        this.defaultTableCompression = defaultTableCompression;
        this.retention = retention;
        this.isBigfile = isBigfile;
        this.predicateEvaluation = predicateEvaluation;
        this.isEncrypted = isEncrypted;
        this.compressFor = compressFor;
        this.defaultInMemory = defaultInMemory;
        this.defaultInMemoryPriority = defaultInMemoryPriority;
        this.defaultInMemoryDistribute = defaultInMemoryDistribute;
        this.defaultInMemoryCompression = defaultInMemoryCompression;
        this.defaultInMemoryDuplicate = defaultInMemoryDuplicate;
        this.shared = shared;
        this.defaultIndexCompression = defaultIndexCompression;
        this.indexCompressFor = indexCompressFor;
        this.defaultCellMemory = defaultCellMemory;
        this.defaultInMemoryService = defaultInMemoryService;
        this.defaultInMemoryServiceName = defaultInMemoryServiceName;
        this.lostWriteProtect = lostWriteProtect;
        this.isChunkTablespace = isChunkTablespace;
        this.tempGroup = tempGroup;
        this.maxSizeKB = maxSizeKB;
        this.allocatedSizeKB = allocatedSizeKB;
        this.userSizeKB = userSizeKB;
        this.freeSpaceKB = freeSpaceKB;
        this.usedSpaceKB = usedSpaceKB;
        this.usedPercentAvailable = usedPercentAvailable;
        this.usedPercentAllocated = usedPercentAllocated;
        this.isDefault = isDefault;
        this.datafiles = datafiles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the tablespace.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The type of tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of tablespace.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The status of the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the tablespace.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The tablespace block size. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockSizeBytes")
        private java.math.BigDecimal blockSizeBytes;

        /**
         * The tablespace block size.
         *
         * @param blockSizeBytes the value to set
         * @return this builder
         */
        public Builder blockSizeBytes(java.math.BigDecimal blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            this.__explicitlySet__.add("blockSizeBytes");
            return this;
        }
        /** The default logging attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("logging")
        private Logging logging;

        /**
         * The default logging attribute.
         *
         * @param logging the value to set
         * @return this builder
         */
        public Builder logging(Logging logging) {
            this.logging = logging;
            this.__explicitlySet__.add("logging");
            return this;
        }
        /** Indicates whether the tablespace is under Force Logging mode. */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceLogging")
        private Boolean isForceLogging;

        /**
         * Indicates whether the tablespace is under Force Logging mode.
         *
         * @param isForceLogging the value to set
         * @return this builder
         */
        public Builder isForceLogging(Boolean isForceLogging) {
            this.isForceLogging = isForceLogging;
            this.__explicitlySet__.add("isForceLogging");
            return this;
        }
        /**
         * Indicates whether the extents in the tablespace are Locally managed or Dictionary
         * managed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extentManagement")
        private ExtentManagement extentManagement;

        /**
         * Indicates whether the extents in the tablespace are Locally managed or Dictionary
         * managed.
         *
         * @param extentManagement the value to set
         * @return this builder
         */
        public Builder extentManagement(ExtentManagement extentManagement) {
            this.extentManagement = extentManagement;
            this.__explicitlySet__.add("extentManagement");
            return this;
        }
        /** The type of extent allocation in effect for the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("allocationType")
        private AllocationType allocationType;

        /**
         * The type of extent allocation in effect for the tablespace.
         *
         * @param allocationType the value to set
         * @return this builder
         */
        public Builder allocationType(AllocationType allocationType) {
            this.allocationType = allocationType;
            this.__explicitlySet__.add("allocationType");
            return this;
        }
        /** Indicates whether the tablespace is plugged in. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPluggedIn")
        private Boolean isPluggedIn;

        /**
         * Indicates whether the tablespace is plugged in.
         *
         * @param isPluggedIn the value to set
         * @return this builder
         */
        public Builder isPluggedIn(Boolean isPluggedIn) {
            this.isPluggedIn = isPluggedIn;
            this.__explicitlySet__.add("isPluggedIn");
            return this;
        }
        /**
         * Indicates whether the free and used segment space in the tablespace is managed using free
         * lists (MANUAL) or bitmaps (AUTO).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("segmentSpaceManagement")
        private SegmentSpaceManagement segmentSpaceManagement;

        /**
         * Indicates whether the free and used segment space in the tablespace is managed using free
         * lists (MANUAL) or bitmaps (AUTO).
         *
         * @param segmentSpaceManagement the value to set
         * @return this builder
         */
        public Builder segmentSpaceManagement(SegmentSpaceManagement segmentSpaceManagement) {
            this.segmentSpaceManagement = segmentSpaceManagement;
            this.__explicitlySet__.add("segmentSpaceManagement");
            return this;
        }
        /** Indicates whether default table compression is enabled or disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultTableCompression")
        private DefaultTableCompression defaultTableCompression;

        /**
         * Indicates whether default table compression is enabled or disabled.
         *
         * @param defaultTableCompression the value to set
         * @return this builder
         */
        public Builder defaultTableCompression(DefaultTableCompression defaultTableCompression) {
            this.defaultTableCompression = defaultTableCompression;
            this.__explicitlySet__.add("defaultTableCompression");
            return this;
        }
        /** Indicates whether undo retention guarantee is enabled for the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("retention")
        private Retention retention;

        /**
         * Indicates whether undo retention guarantee is enabled for the tablespace.
         *
         * @param retention the value to set
         * @return this builder
         */
        public Builder retention(Retention retention) {
            this.retention = retention;
            this.__explicitlySet__.add("retention");
            return this;
        }
        /** Indicates whether the tablespace is a Bigfile tablespace or a Smallfile tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBigfile")
        private Boolean isBigfile;

        /**
         * Indicates whether the tablespace is a Bigfile tablespace or a Smallfile tablespace.
         *
         * @param isBigfile the value to set
         * @return this builder
         */
        public Builder isBigfile(Boolean isBigfile) {
            this.isBigfile = isBigfile;
            this.__explicitlySet__.add("isBigfile");
            return this;
        }
        /** Indicates whether predicates are evaluated by Host or by Storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("predicateEvaluation")
        private PredicateEvaluation predicateEvaluation;

        /**
         * Indicates whether predicates are evaluated by Host or by Storage.
         *
         * @param predicateEvaluation the value to set
         * @return this builder
         */
        public Builder predicateEvaluation(PredicateEvaluation predicateEvaluation) {
            this.predicateEvaluation = predicateEvaluation;
            this.__explicitlySet__.add("predicateEvaluation");
            return this;
        }
        /** Indicates whether the tablespace is encrypted. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
        private Boolean isEncrypted;

        /**
         * Indicates whether the tablespace is encrypted.
         *
         * @param isEncrypted the value to set
         * @return this builder
         */
        public Builder isEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            this.__explicitlySet__.add("isEncrypted");
            return this;
        }
        /** The operation type for which default compression is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("compressFor")
        private CompressFor compressFor;

        /**
         * The operation type for which default compression is enabled.
         *
         * @param compressFor the value to set
         * @return this builder
         */
        public Builder compressFor(CompressFor compressFor) {
            this.compressFor = compressFor;
            this.__explicitlySet__.add("compressFor");
            return this;
        }
        /**
         * Indicates whether the In-Memory Column Store (IM column store) is by default enabled or
         * disabled for tables in the tablespace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemory")
        private DefaultInMemory defaultInMemory;

        /**
         * Indicates whether the In-Memory Column Store (IM column store) is by default enabled or
         * disabled for tables in the tablespace.
         *
         * @param defaultInMemory the value to set
         * @return this builder
         */
        public Builder defaultInMemory(DefaultInMemory defaultInMemory) {
            this.defaultInMemory = defaultInMemory;
            this.__explicitlySet__.add("defaultInMemory");
            return this;
        }
        /**
         * Indicates the default priority for In-Memory Column Store (IM column store) population
         * for the tablespace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryPriority")
        private DefaultInMemoryPriority defaultInMemoryPriority;

        /**
         * Indicates the default priority for In-Memory Column Store (IM column store) population
         * for the tablespace.
         *
         * @param defaultInMemoryPriority the value to set
         * @return this builder
         */
        public Builder defaultInMemoryPriority(DefaultInMemoryPriority defaultInMemoryPriority) {
            this.defaultInMemoryPriority = defaultInMemoryPriority;
            this.__explicitlySet__.add("defaultInMemoryPriority");
            return this;
        }
        /**
         * Indicates how the IM column store is distributed by default for the tablespace in an
         * Oracle Real Application Clusters (Oracle RAC) environment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryDistribute")
        private DefaultInMemoryDistribute defaultInMemoryDistribute;

        /**
         * Indicates how the IM column store is distributed by default for the tablespace in an
         * Oracle Real Application Clusters (Oracle RAC) environment.
         *
         * @param defaultInMemoryDistribute the value to set
         * @return this builder
         */
        public Builder defaultInMemoryDistribute(
                DefaultInMemoryDistribute defaultInMemoryDistribute) {
            this.defaultInMemoryDistribute = defaultInMemoryDistribute;
            this.__explicitlySet__.add("defaultInMemoryDistribute");
            return this;
        }
        /** Indicates the default compression level for the IM column store for the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryCompression")
        private DefaultInMemoryCompression defaultInMemoryCompression;

        /**
         * Indicates the default compression level for the IM column store for the tablespace.
         *
         * @param defaultInMemoryCompression the value to set
         * @return this builder
         */
        public Builder defaultInMemoryCompression(
                DefaultInMemoryCompression defaultInMemoryCompression) {
            this.defaultInMemoryCompression = defaultInMemoryCompression;
            this.__explicitlySet__.add("defaultInMemoryCompression");
            return this;
        }
        /** Indicates the duplicate setting for the IM column store in an Oracle RAC environment. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryDuplicate")
        private DefaultInMemoryDuplicate defaultInMemoryDuplicate;

        /**
         * Indicates the duplicate setting for the IM column store in an Oracle RAC environment.
         *
         * @param defaultInMemoryDuplicate the value to set
         * @return this builder
         */
        public Builder defaultInMemoryDuplicate(DefaultInMemoryDuplicate defaultInMemoryDuplicate) {
            this.defaultInMemoryDuplicate = defaultInMemoryDuplicate;
            this.__explicitlySet__.add("defaultInMemoryDuplicate");
            return this;
        }
        /**
         * Indicates whether the tablespace is for shared tablespace, or for local temporary
         * tablespace for leaf (read-only) instances, or for local temporary tablespace for all
         * instance types.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shared")
        private Shared shared;

        /**
         * Indicates whether the tablespace is for shared tablespace, or for local temporary
         * tablespace for leaf (read-only) instances, or for local temporary tablespace for all
         * instance types.
         *
         * @param shared the value to set
         * @return this builder
         */
        public Builder shared(Shared shared) {
            this.shared = shared;
            this.__explicitlySet__.add("shared");
            return this;
        }
        /** Indicates whether default index compression is enabled or disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultIndexCompression")
        private DefaultIndexCompression defaultIndexCompression;

        /**
         * Indicates whether default index compression is enabled or disabled.
         *
         * @param defaultIndexCompression the value to set
         * @return this builder
         */
        public Builder defaultIndexCompression(DefaultIndexCompression defaultIndexCompression) {
            this.defaultIndexCompression = defaultIndexCompression;
            this.__explicitlySet__.add("defaultIndexCompression");
            return this;
        }
        /** The operation type for which default index compression is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("indexCompressFor")
        private IndexCompressFor indexCompressFor;

        /**
         * The operation type for which default index compression is enabled.
         *
         * @param indexCompressFor the value to set
         * @return this builder
         */
        public Builder indexCompressFor(IndexCompressFor indexCompressFor) {
            this.indexCompressFor = indexCompressFor;
            this.__explicitlySet__.add("indexCompressFor");
            return this;
        }
        /**
         * This specifies the default value for the CELLMEMORY attribute that tables created in the
         * tablespace will inherit unless the behavior is overridden explicitly. This column is
         * intended for use with Oracle Exadata.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultCellMemory")
        private String defaultCellMemory;

        /**
         * This specifies the default value for the CELLMEMORY attribute that tables created in the
         * tablespace will inherit unless the behavior is overridden explicitly. This column is
         * intended for use with Oracle Exadata.
         *
         * @param defaultCellMemory the value to set
         * @return this builder
         */
        public Builder defaultCellMemory(String defaultCellMemory) {
            this.defaultCellMemory = defaultCellMemory;
            this.__explicitlySet__.add("defaultCellMemory");
            return this;
        }
        /**
         * Indicates how the IM column store is populated on various instances by default for the
         * tablespace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryService")
        private DefaultInMemoryService defaultInMemoryService;

        /**
         * Indicates how the IM column store is populated on various instances by default for the
         * tablespace.
         *
         * @param defaultInMemoryService the value to set
         * @return this builder
         */
        public Builder defaultInMemoryService(DefaultInMemoryService defaultInMemoryService) {
            this.defaultInMemoryService = defaultInMemoryService;
            this.__explicitlySet__.add("defaultInMemoryService");
            return this;
        }
        /**
         * Indicates the service name for the service on which the IM column store should be
         * populated by default for the tablespace. This column has a value only when the
         * corresponding DEF_INMEMORY_SERVICE is USER_DEFINED. In all other cases, this column is
         * null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryServiceName")
        private String defaultInMemoryServiceName;

        /**
         * Indicates the service name for the service on which the IM column store should be
         * populated by default for the tablespace. This column has a value only when the
         * corresponding DEF_INMEMORY_SERVICE is USER_DEFINED. In all other cases, this column is
         * null.
         *
         * @param defaultInMemoryServiceName the value to set
         * @return this builder
         */
        public Builder defaultInMemoryServiceName(String defaultInMemoryServiceName) {
            this.defaultInMemoryServiceName = defaultInMemoryServiceName;
            this.__explicitlySet__.add("defaultInMemoryServiceName");
            return this;
        }
        /** The lost write protection setting for the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
        private LostWriteProtect lostWriteProtect;

        /**
         * The lost write protection setting for the tablespace.
         *
         * @param lostWriteProtect the value to set
         * @return this builder
         */
        public Builder lostWriteProtect(LostWriteProtect lostWriteProtect) {
            this.lostWriteProtect = lostWriteProtect;
            this.__explicitlySet__.add("lostWriteProtect");
            return this;
        }
        /** Indicates whether this is a chunk tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("isChunkTablespace")
        private Boolean isChunkTablespace;

        /**
         * Indicates whether this is a chunk tablespace.
         *
         * @param isChunkTablespace the value to set
         * @return this builder
         */
        public Builder isChunkTablespace(Boolean isChunkTablespace) {
            this.isChunkTablespace = isChunkTablespace;
            this.__explicitlySet__.add("isChunkTablespace");
            return this;
        }
        /** The temporary tablespace group. */
        @com.fasterxml.jackson.annotation.JsonProperty("tempGroup")
        private String tempGroup;

        /**
         * The temporary tablespace group.
         *
         * @param tempGroup the value to set
         * @return this builder
         */
        public Builder tempGroup(String tempGroup) {
            this.tempGroup = tempGroup;
            this.__explicitlySet__.add("tempGroup");
            return this;
        }
        /**
         * The maximum tablespace size in KB. If the tablespace contains any data files with
         * Autoextend enabled, then this column displays the amount of underlying free storage space
         * for the tablespace. For example, if the current tablespace size is 1 GB, the combined
         * maximum size of all its data files is 32 GB, and its underlying storage (for example, ASM
         * or file system storage) has 20 GB of free space, then this column will have a value of
         * approximately 20 GB. If the tablespace contains only data files with autoextend disabled,
         * then this column displays the allocated space for the entire tablespace, that is, the
         * combined size of all data files in the tablespace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
        private java.math.BigDecimal maxSizeKB;

        /**
         * The maximum tablespace size in KB. If the tablespace contains any data files with
         * Autoextend enabled, then this column displays the amount of underlying free storage space
         * for the tablespace. For example, if the current tablespace size is 1 GB, the combined
         * maximum size of all its data files is 32 GB, and its underlying storage (for example, ASM
         * or file system storage) has 20 GB of free space, then this column will have a value of
         * approximately 20 GB. If the tablespace contains only data files with autoextend disabled,
         * then this column displays the allocated space for the entire tablespace, that is, the
         * combined size of all data files in the tablespace.
         *
         * @param maxSizeKB the value to set
         * @return this builder
         */
        public Builder maxSizeKB(java.math.BigDecimal maxSizeKB) {
            this.maxSizeKB = maxSizeKB;
            this.__explicitlySet__.add("maxSizeKB");
            return this;
        }
        /** The allocated tablespace size in KB. */
        @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
        private java.math.BigDecimal allocatedSizeKB;

        /**
         * The allocated tablespace size in KB.
         *
         * @param allocatedSizeKB the value to set
         * @return this builder
         */
        public Builder allocatedSizeKB(java.math.BigDecimal allocatedSizeKB) {
            this.allocatedSizeKB = allocatedSizeKB;
            this.__explicitlySet__.add("allocatedSizeKB");
            return this;
        }
        /**
         * The size of the tablespace available for user data in KB. The difference between
         * tablespace size and user data size is used for storing metadata.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
        private java.math.BigDecimal userSizeKB;

        /**
         * The size of the tablespace available for user data in KB. The difference between
         * tablespace size and user data size is used for storing metadata.
         *
         * @param userSizeKB the value to set
         * @return this builder
         */
        public Builder userSizeKB(java.math.BigDecimal userSizeKB) {
            this.userSizeKB = userSizeKB;
            this.__explicitlySet__.add("userSizeKB");
            return this;
        }
        /** The free space available in the tablespace in KB. */
        @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
        private java.math.BigDecimal freeSpaceKB;

        /**
         * The free space available in the tablespace in KB.
         *
         * @param freeSpaceKB the value to set
         * @return this builder
         */
        public Builder freeSpaceKB(java.math.BigDecimal freeSpaceKB) {
            this.freeSpaceKB = freeSpaceKB;
            this.__explicitlySet__.add("freeSpaceKB");
            return this;
        }
        /** The total space used by the tablespace in KB. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
        private java.math.BigDecimal usedSpaceKB;

        /**
         * The total space used by the tablespace in KB.
         *
         * @param usedSpaceKB the value to set
         * @return this builder
         */
        public Builder usedSpaceKB(java.math.BigDecimal usedSpaceKB) {
            this.usedSpaceKB = usedSpaceKB;
            this.__explicitlySet__.add("usedSpaceKB");
            return this;
        }
        /** The percentage of used space out of the maximum available space in the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
        private Double usedPercentAvailable;

        /**
         * The percentage of used space out of the maximum available space in the tablespace.
         *
         * @param usedPercentAvailable the value to set
         * @return this builder
         */
        public Builder usedPercentAvailable(Double usedPercentAvailable) {
            this.usedPercentAvailable = usedPercentAvailable;
            this.__explicitlySet__.add("usedPercentAvailable");
            return this;
        }
        /** The percentage of used space out of the total allocated space in the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
        private Double usedPercentAllocated;

        /**
         * The percentage of used space out of the total allocated space in the tablespace.
         *
         * @param usedPercentAllocated the value to set
         * @return this builder
         */
        public Builder usedPercentAllocated(Double usedPercentAllocated) {
            this.usedPercentAllocated = usedPercentAllocated;
            this.__explicitlySet__.add("usedPercentAllocated");
            return this;
        }
        /** Indicates whether this is the default tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether this is the default tablespace.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /** A list of the data files associated with the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("datafiles")
        private java.util.List<Datafile> datafiles;

        /**
         * A list of the data files associated with the tablespace.
         *
         * @param datafiles the value to set
         * @return this builder
         */
        public Builder datafiles(java.util.List<Datafile> datafiles) {
            this.datafiles = datafiles;
            this.__explicitlySet__.add("datafiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TablespaceSummary build() {
            TablespaceSummary model =
                    new TablespaceSummary(
                            this.name,
                            this.type,
                            this.status,
                            this.blockSizeBytes,
                            this.logging,
                            this.isForceLogging,
                            this.extentManagement,
                            this.allocationType,
                            this.isPluggedIn,
                            this.segmentSpaceManagement,
                            this.defaultTableCompression,
                            this.retention,
                            this.isBigfile,
                            this.predicateEvaluation,
                            this.isEncrypted,
                            this.compressFor,
                            this.defaultInMemory,
                            this.defaultInMemoryPriority,
                            this.defaultInMemoryDistribute,
                            this.defaultInMemoryCompression,
                            this.defaultInMemoryDuplicate,
                            this.shared,
                            this.defaultIndexCompression,
                            this.indexCompressFor,
                            this.defaultCellMemory,
                            this.defaultInMemoryService,
                            this.defaultInMemoryServiceName,
                            this.lostWriteProtect,
                            this.isChunkTablespace,
                            this.tempGroup,
                            this.maxSizeKB,
                            this.allocatedSizeKB,
                            this.userSizeKB,
                            this.freeSpaceKB,
                            this.usedSpaceKB,
                            this.usedPercentAvailable,
                            this.usedPercentAllocated,
                            this.isDefault,
                            this.datafiles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TablespaceSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("blockSizeBytes")) {
                this.blockSizeBytes(model.getBlockSizeBytes());
            }
            if (model.wasPropertyExplicitlySet("logging")) {
                this.logging(model.getLogging());
            }
            if (model.wasPropertyExplicitlySet("isForceLogging")) {
                this.isForceLogging(model.getIsForceLogging());
            }
            if (model.wasPropertyExplicitlySet("extentManagement")) {
                this.extentManagement(model.getExtentManagement());
            }
            if (model.wasPropertyExplicitlySet("allocationType")) {
                this.allocationType(model.getAllocationType());
            }
            if (model.wasPropertyExplicitlySet("isPluggedIn")) {
                this.isPluggedIn(model.getIsPluggedIn());
            }
            if (model.wasPropertyExplicitlySet("segmentSpaceManagement")) {
                this.segmentSpaceManagement(model.getSegmentSpaceManagement());
            }
            if (model.wasPropertyExplicitlySet("defaultTableCompression")) {
                this.defaultTableCompression(model.getDefaultTableCompression());
            }
            if (model.wasPropertyExplicitlySet("retention")) {
                this.retention(model.getRetention());
            }
            if (model.wasPropertyExplicitlySet("isBigfile")) {
                this.isBigfile(model.getIsBigfile());
            }
            if (model.wasPropertyExplicitlySet("predicateEvaluation")) {
                this.predicateEvaluation(model.getPredicateEvaluation());
            }
            if (model.wasPropertyExplicitlySet("isEncrypted")) {
                this.isEncrypted(model.getIsEncrypted());
            }
            if (model.wasPropertyExplicitlySet("compressFor")) {
                this.compressFor(model.getCompressFor());
            }
            if (model.wasPropertyExplicitlySet("defaultInMemory")) {
                this.defaultInMemory(model.getDefaultInMemory());
            }
            if (model.wasPropertyExplicitlySet("defaultInMemoryPriority")) {
                this.defaultInMemoryPriority(model.getDefaultInMemoryPriority());
            }
            if (model.wasPropertyExplicitlySet("defaultInMemoryDistribute")) {
                this.defaultInMemoryDistribute(model.getDefaultInMemoryDistribute());
            }
            if (model.wasPropertyExplicitlySet("defaultInMemoryCompression")) {
                this.defaultInMemoryCompression(model.getDefaultInMemoryCompression());
            }
            if (model.wasPropertyExplicitlySet("defaultInMemoryDuplicate")) {
                this.defaultInMemoryDuplicate(model.getDefaultInMemoryDuplicate());
            }
            if (model.wasPropertyExplicitlySet("shared")) {
                this.shared(model.getShared());
            }
            if (model.wasPropertyExplicitlySet("defaultIndexCompression")) {
                this.defaultIndexCompression(model.getDefaultIndexCompression());
            }
            if (model.wasPropertyExplicitlySet("indexCompressFor")) {
                this.indexCompressFor(model.getIndexCompressFor());
            }
            if (model.wasPropertyExplicitlySet("defaultCellMemory")) {
                this.defaultCellMemory(model.getDefaultCellMemory());
            }
            if (model.wasPropertyExplicitlySet("defaultInMemoryService")) {
                this.defaultInMemoryService(model.getDefaultInMemoryService());
            }
            if (model.wasPropertyExplicitlySet("defaultInMemoryServiceName")) {
                this.defaultInMemoryServiceName(model.getDefaultInMemoryServiceName());
            }
            if (model.wasPropertyExplicitlySet("lostWriteProtect")) {
                this.lostWriteProtect(model.getLostWriteProtect());
            }
            if (model.wasPropertyExplicitlySet("isChunkTablespace")) {
                this.isChunkTablespace(model.getIsChunkTablespace());
            }
            if (model.wasPropertyExplicitlySet("tempGroup")) {
                this.tempGroup(model.getTempGroup());
            }
            if (model.wasPropertyExplicitlySet("maxSizeKB")) {
                this.maxSizeKB(model.getMaxSizeKB());
            }
            if (model.wasPropertyExplicitlySet("allocatedSizeKB")) {
                this.allocatedSizeKB(model.getAllocatedSizeKB());
            }
            if (model.wasPropertyExplicitlySet("userSizeKB")) {
                this.userSizeKB(model.getUserSizeKB());
            }
            if (model.wasPropertyExplicitlySet("freeSpaceKB")) {
                this.freeSpaceKB(model.getFreeSpaceKB());
            }
            if (model.wasPropertyExplicitlySet("usedSpaceKB")) {
                this.usedSpaceKB(model.getUsedSpaceKB());
            }
            if (model.wasPropertyExplicitlySet("usedPercentAvailable")) {
                this.usedPercentAvailable(model.getUsedPercentAvailable());
            }
            if (model.wasPropertyExplicitlySet("usedPercentAllocated")) {
                this.usedPercentAllocated(model.getUsedPercentAllocated());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("datafiles")) {
                this.datafiles(model.getDatafiles());
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

    /** The name of the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the tablespace.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of tablespace. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Undo("UNDO"),
        LostWriteProtection("LOST_WRITE_PROTECTION"),
        Permanent("PERMANENT"),
        Temporary("TEMPORARY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The type of tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of tablespace.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** The status of the tablespace. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Online("ONLINE"),
        Offline("OFFLINE"),
        ReadOnly("READ_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the tablespace.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The tablespace block size. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockSizeBytes")
    private final java.math.BigDecimal blockSizeBytes;

    /**
     * The tablespace block size.
     *
     * @return the value
     */
    public java.math.BigDecimal getBlockSizeBytes() {
        return blockSizeBytes;
    }

    /** The default logging attribute. */
    public enum Logging implements com.oracle.bmc.http.internal.BmcEnum {
        Logging("LOGGING"),
        Nologging("NOLOGGING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Logging.class);

        private final String value;
        private static java.util.Map<String, Logging> map;

        static {
            map = new java.util.HashMap<>();
            for (Logging v : Logging.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Logging(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Logging create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Logging', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The default logging attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    private final Logging logging;

    /**
     * The default logging attribute.
     *
     * @return the value
     */
    public Logging getLogging() {
        return logging;
    }

    /** Indicates whether the tablespace is under Force Logging mode. */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceLogging")
    private final Boolean isForceLogging;

    /**
     * Indicates whether the tablespace is under Force Logging mode.
     *
     * @return the value
     */
    public Boolean getIsForceLogging() {
        return isForceLogging;
    }

    /**
     * Indicates whether the extents in the tablespace are Locally managed or Dictionary managed.
     */
    public enum ExtentManagement implements com.oracle.bmc.http.internal.BmcEnum {
        Local("LOCAL"),
        Dictionary("DICTIONARY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExtentManagement.class);

        private final String value;
        private static java.util.Map<String, ExtentManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (ExtentManagement v : ExtentManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExtentManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExtentManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExtentManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the extents in the tablespace are Locally managed or Dictionary managed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extentManagement")
    private final ExtentManagement extentManagement;

    /**
     * Indicates whether the extents in the tablespace are Locally managed or Dictionary managed.
     *
     * @return the value
     */
    public ExtentManagement getExtentManagement() {
        return extentManagement;
    }

    /** The type of extent allocation in effect for the tablespace. */
    public enum AllocationType implements com.oracle.bmc.http.internal.BmcEnum {
        System("SYSTEM"),
        Uniform("UNIFORM"),
        User("USER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AllocationType.class);

        private final String value;
        private static java.util.Map<String, AllocationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AllocationType v : AllocationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllocationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllocationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllocationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of extent allocation in effect for the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("allocationType")
    private final AllocationType allocationType;

    /**
     * The type of extent allocation in effect for the tablespace.
     *
     * @return the value
     */
    public AllocationType getAllocationType() {
        return allocationType;
    }

    /** Indicates whether the tablespace is plugged in. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPluggedIn")
    private final Boolean isPluggedIn;

    /**
     * Indicates whether the tablespace is plugged in.
     *
     * @return the value
     */
    public Boolean getIsPluggedIn() {
        return isPluggedIn;
    }

    /**
     * Indicates whether the free and used segment space in the tablespace is managed using free
     * lists (MANUAL) or bitmaps (AUTO).
     */
    public enum SegmentSpaceManagement implements com.oracle.bmc.http.internal.BmcEnum {
        Manual("MANUAL"),
        Auto("AUTO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SegmentSpaceManagement.class);

        private final String value;
        private static java.util.Map<String, SegmentSpaceManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (SegmentSpaceManagement v : SegmentSpaceManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SegmentSpaceManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SegmentSpaceManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SegmentSpaceManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the free and used segment space in the tablespace is managed using free
     * lists (MANUAL) or bitmaps (AUTO).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("segmentSpaceManagement")
    private final SegmentSpaceManagement segmentSpaceManagement;

    /**
     * Indicates whether the free and used segment space in the tablespace is managed using free
     * lists (MANUAL) or bitmaps (AUTO).
     *
     * @return the value
     */
    public SegmentSpaceManagement getSegmentSpaceManagement() {
        return segmentSpaceManagement;
    }

    /** Indicates whether default table compression is enabled or disabled. */
    public enum DefaultTableCompression implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultTableCompression.class);

        private final String value;
        private static java.util.Map<String, DefaultTableCompression> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultTableCompression v : DefaultTableCompression.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultTableCompression(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultTableCompression create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultTableCompression', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether default table compression is enabled or disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultTableCompression")
    private final DefaultTableCompression defaultTableCompression;

    /**
     * Indicates whether default table compression is enabled or disabled.
     *
     * @return the value
     */
    public DefaultTableCompression getDefaultTableCompression() {
        return defaultTableCompression;
    }

    /** Indicates whether undo retention guarantee is enabled for the tablespace. */
    public enum Retention implements com.oracle.bmc.http.internal.BmcEnum {
        Guarantee("GUARANTEE"),
        Noguarantee("NOGUARANTEE"),
        NotApply("NOT_APPLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Retention.class);

        private final String value;
        private static java.util.Map<String, Retention> map;

        static {
            map = new java.util.HashMap<>();
            for (Retention v : Retention.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Retention(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Retention create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Retention', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether undo retention guarantee is enabled for the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("retention")
    private final Retention retention;

    /**
     * Indicates whether undo retention guarantee is enabled for the tablespace.
     *
     * @return the value
     */
    public Retention getRetention() {
        return retention;
    }

    /** Indicates whether the tablespace is a Bigfile tablespace or a Smallfile tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBigfile")
    private final Boolean isBigfile;

    /**
     * Indicates whether the tablespace is a Bigfile tablespace or a Smallfile tablespace.
     *
     * @return the value
     */
    public Boolean getIsBigfile() {
        return isBigfile;
    }

    /** Indicates whether predicates are evaluated by Host or by Storage. */
    public enum PredicateEvaluation implements com.oracle.bmc.http.internal.BmcEnum {
        Host("HOST"),
        Storage("STORAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PredicateEvaluation.class);

        private final String value;
        private static java.util.Map<String, PredicateEvaluation> map;

        static {
            map = new java.util.HashMap<>();
            for (PredicateEvaluation v : PredicateEvaluation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PredicateEvaluation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PredicateEvaluation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PredicateEvaluation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether predicates are evaluated by Host or by Storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("predicateEvaluation")
    private final PredicateEvaluation predicateEvaluation;

    /**
     * Indicates whether predicates are evaluated by Host or by Storage.
     *
     * @return the value
     */
    public PredicateEvaluation getPredicateEvaluation() {
        return predicateEvaluation;
    }

    /** Indicates whether the tablespace is encrypted. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
    private final Boolean isEncrypted;

    /**
     * Indicates whether the tablespace is encrypted.
     *
     * @return the value
     */
    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    /** The operation type for which default compression is enabled. */
    public enum CompressFor implements com.oracle.bmc.http.internal.BmcEnum {
        Basic("BASIC"),
        Advanced("ADVANCED"),
        QueryLow("QUERY_LOW"),
        QueryHigh("QUERY_HIGH"),
        ArchiveLow("ARCHIVE_LOW"),
        ArchiveHigh("ARCHIVE_HIGH"),
        DirectLoadOnly("DIRECT_LOAD_ONLY"),
        ForAllOperations("FOR_ALL_OPERATIONS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CompressFor.class);

        private final String value;
        private static java.util.Map<String, CompressFor> map;

        static {
            map = new java.util.HashMap<>();
            for (CompressFor v : CompressFor.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CompressFor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CompressFor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CompressFor', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The operation type for which default compression is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("compressFor")
    private final CompressFor compressFor;

    /**
     * The operation type for which default compression is enabled.
     *
     * @return the value
     */
    public CompressFor getCompressFor() {
        return compressFor;
    }

    /**
     * Indicates whether the In-Memory Column Store (IM column store) is by default enabled or
     * disabled for tables in the tablespace.
     */
    public enum DefaultInMemory implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultInMemory.class);

        private final String value;
        private static java.util.Map<String, DefaultInMemory> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemory v : DefaultInMemory.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultInMemory(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultInMemory create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultInMemory', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the In-Memory Column Store (IM column store) is by default enabled or
     * disabled for tables in the tablespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemory")
    private final DefaultInMemory defaultInMemory;

    /**
     * Indicates whether the In-Memory Column Store (IM column store) is by default enabled or
     * disabled for tables in the tablespace.
     *
     * @return the value
     */
    public DefaultInMemory getDefaultInMemory() {
        return defaultInMemory;
    }

    /**
     * Indicates the default priority for In-Memory Column Store (IM column store) population for
     * the tablespace.
     */
    public enum DefaultInMemoryPriority implements com.oracle.bmc.http.internal.BmcEnum {
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),
        Critical("CRITICAL"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultInMemoryPriority.class);

        private final String value;
        private static java.util.Map<String, DefaultInMemoryPriority> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryPriority v : DefaultInMemoryPriority.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultInMemoryPriority(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultInMemoryPriority create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultInMemoryPriority', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates the default priority for In-Memory Column Store (IM column store) population for
     * the tablespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryPriority")
    private final DefaultInMemoryPriority defaultInMemoryPriority;

    /**
     * Indicates the default priority for In-Memory Column Store (IM column store) population for
     * the tablespace.
     *
     * @return the value
     */
    public DefaultInMemoryPriority getDefaultInMemoryPriority() {
        return defaultInMemoryPriority;
    }

    /**
     * Indicates how the IM column store is distributed by default for the tablespace in an Oracle
     * Real Application Clusters (Oracle RAC) environment.
     */
    public enum DefaultInMemoryDistribute implements com.oracle.bmc.http.internal.BmcEnum {
        Auto("AUTO"),
        ByRowidRange("BY_ROWID_RANGE"),
        ByPartition("BY_PARTITION"),
        BySubpartition("BY_SUBPARTITION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultInMemoryDistribute.class);

        private final String value;
        private static java.util.Map<String, DefaultInMemoryDistribute> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryDistribute v : DefaultInMemoryDistribute.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultInMemoryDistribute(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultInMemoryDistribute create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultInMemoryDistribute', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how the IM column store is distributed by default for the tablespace in an Oracle
     * Real Application Clusters (Oracle RAC) environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryDistribute")
    private final DefaultInMemoryDistribute defaultInMemoryDistribute;

    /**
     * Indicates how the IM column store is distributed by default for the tablespace in an Oracle
     * Real Application Clusters (Oracle RAC) environment.
     *
     * @return the value
     */
    public DefaultInMemoryDistribute getDefaultInMemoryDistribute() {
        return defaultInMemoryDistribute;
    }

    /** Indicates the default compression level for the IM column store for the tablespace. */
    public enum DefaultInMemoryCompression implements com.oracle.bmc.http.internal.BmcEnum {
        NoMemcompress("NO_MEMCOMPRESS"),
        ForDml("FOR_DML"),
        ForQueryLow("FOR_QUERY_LOW"),
        ForQueryHigh("FOR_QUERY_HIGH"),
        ForCapacityLow("FOR_CAPACITY_LOW"),
        ForCapacityHigh("FOR_CAPACITY_HIGH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultInMemoryCompression.class);

        private final String value;
        private static java.util.Map<String, DefaultInMemoryCompression> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryCompression v : DefaultInMemoryCompression.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultInMemoryCompression(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultInMemoryCompression create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultInMemoryCompression', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates the default compression level for the IM column store for the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryCompression")
    private final DefaultInMemoryCompression defaultInMemoryCompression;

    /**
     * Indicates the default compression level for the IM column store for the tablespace.
     *
     * @return the value
     */
    public DefaultInMemoryCompression getDefaultInMemoryCompression() {
        return defaultInMemoryCompression;
    }

    /** Indicates the duplicate setting for the IM column store in an Oracle RAC environment. */
    public enum DefaultInMemoryDuplicate implements com.oracle.bmc.http.internal.BmcEnum {
        NoDuplicate("NO_DUPLICATE"),
        Duplicate("DUPLICATE"),
        DuplicateAll("DUPLICATE_ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultInMemoryDuplicate.class);

        private final String value;
        private static java.util.Map<String, DefaultInMemoryDuplicate> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryDuplicate v : DefaultInMemoryDuplicate.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultInMemoryDuplicate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultInMemoryDuplicate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultInMemoryDuplicate', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates the duplicate setting for the IM column store in an Oracle RAC environment. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryDuplicate")
    private final DefaultInMemoryDuplicate defaultInMemoryDuplicate;

    /**
     * Indicates the duplicate setting for the IM column store in an Oracle RAC environment.
     *
     * @return the value
     */
    public DefaultInMemoryDuplicate getDefaultInMemoryDuplicate() {
        return defaultInMemoryDuplicate;
    }

    /**
     * Indicates whether the tablespace is for shared tablespace, or for local temporary tablespace
     * for leaf (read-only) instances, or for local temporary tablespace for all instance types.
     */
    public enum Shared implements com.oracle.bmc.http.internal.BmcEnum {
        Shared("SHARED"),
        LocalOnLeaf("LOCAL_ON_LEAF"),
        LocalOnAll("LOCAL_ON_ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Shared.class);

        private final String value;
        private static java.util.Map<String, Shared> map;

        static {
            map = new java.util.HashMap<>();
            for (Shared v : Shared.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Shared(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Shared create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Shared', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the tablespace is for shared tablespace, or for local temporary tablespace
     * for leaf (read-only) instances, or for local temporary tablespace for all instance types.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shared")
    private final Shared shared;

    /**
     * Indicates whether the tablespace is for shared tablespace, or for local temporary tablespace
     * for leaf (read-only) instances, or for local temporary tablespace for all instance types.
     *
     * @return the value
     */
    public Shared getShared() {
        return shared;
    }

    /** Indicates whether default index compression is enabled or disabled. */
    public enum DefaultIndexCompression implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultIndexCompression.class);

        private final String value;
        private static java.util.Map<String, DefaultIndexCompression> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultIndexCompression v : DefaultIndexCompression.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultIndexCompression(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultIndexCompression create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultIndexCompression', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether default index compression is enabled or disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultIndexCompression")
    private final DefaultIndexCompression defaultIndexCompression;

    /**
     * Indicates whether default index compression is enabled or disabled.
     *
     * @return the value
     */
    public DefaultIndexCompression getDefaultIndexCompression() {
        return defaultIndexCompression;
    }

    /** The operation type for which default index compression is enabled. */
    public enum IndexCompressFor implements com.oracle.bmc.http.internal.BmcEnum {
        AdvancedLow("ADVANCED_LOW"),
        AdvancedHigh("ADVANCED_HIGH"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IndexCompressFor.class);

        private final String value;
        private static java.util.Map<String, IndexCompressFor> map;

        static {
            map = new java.util.HashMap<>();
            for (IndexCompressFor v : IndexCompressFor.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IndexCompressFor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IndexCompressFor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IndexCompressFor', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The operation type for which default index compression is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("indexCompressFor")
    private final IndexCompressFor indexCompressFor;

    /**
     * The operation type for which default index compression is enabled.
     *
     * @return the value
     */
    public IndexCompressFor getIndexCompressFor() {
        return indexCompressFor;
    }

    /**
     * This specifies the default value for the CELLMEMORY attribute that tables created in the
     * tablespace will inherit unless the behavior is overridden explicitly. This column is intended
     * for use with Oracle Exadata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCellMemory")
    private final String defaultCellMemory;

    /**
     * This specifies the default value for the CELLMEMORY attribute that tables created in the
     * tablespace will inherit unless the behavior is overridden explicitly. This column is intended
     * for use with Oracle Exadata.
     *
     * @return the value
     */
    public String getDefaultCellMemory() {
        return defaultCellMemory;
    }

    /**
     * Indicates how the IM column store is populated on various instances by default for the
     * tablespace.
     */
    public enum DefaultInMemoryService implements com.oracle.bmc.http.internal.BmcEnum {
        Default("DEFAULT"),
        None("NONE"),
        All("ALL"),
        UserDefined("USER_DEFINED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultInMemoryService.class);

        private final String value;
        private static java.util.Map<String, DefaultInMemoryService> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryService v : DefaultInMemoryService.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultInMemoryService(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultInMemoryService create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultInMemoryService', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how the IM column store is populated on various instances by default for the
     * tablespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryService")
    private final DefaultInMemoryService defaultInMemoryService;

    /**
     * Indicates how the IM column store is populated on various instances by default for the
     * tablespace.
     *
     * @return the value
     */
    public DefaultInMemoryService getDefaultInMemoryService() {
        return defaultInMemoryService;
    }

    /**
     * Indicates the service name for the service on which the IM column store should be populated
     * by default for the tablespace. This column has a value only when the corresponding
     * DEF_INMEMORY_SERVICE is USER_DEFINED. In all other cases, this column is null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryServiceName")
    private final String defaultInMemoryServiceName;

    /**
     * Indicates the service name for the service on which the IM column store should be populated
     * by default for the tablespace. This column has a value only when the corresponding
     * DEF_INMEMORY_SERVICE is USER_DEFINED. In all other cases, this column is null.
     *
     * @return the value
     */
    public String getDefaultInMemoryServiceName() {
        return defaultInMemoryServiceName;
    }

    /** The lost write protection setting for the tablespace. */
    public enum LostWriteProtect implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        ProtectOff("PROTECT_OFF"),
        Suspend("SUSPEND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LostWriteProtect.class);

        private final String value;
        private static java.util.Map<String, LostWriteProtect> map;

        static {
            map = new java.util.HashMap<>();
            for (LostWriteProtect v : LostWriteProtect.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LostWriteProtect(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LostWriteProtect create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LostWriteProtect', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The lost write protection setting for the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
    private final LostWriteProtect lostWriteProtect;

    /**
     * The lost write protection setting for the tablespace.
     *
     * @return the value
     */
    public LostWriteProtect getLostWriteProtect() {
        return lostWriteProtect;
    }

    /** Indicates whether this is a chunk tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("isChunkTablespace")
    private final Boolean isChunkTablespace;

    /**
     * Indicates whether this is a chunk tablespace.
     *
     * @return the value
     */
    public Boolean getIsChunkTablespace() {
        return isChunkTablespace;
    }

    /** The temporary tablespace group. */
    @com.fasterxml.jackson.annotation.JsonProperty("tempGroup")
    private final String tempGroup;

    /**
     * The temporary tablespace group.
     *
     * @return the value
     */
    public String getTempGroup() {
        return tempGroup;
    }

    /**
     * The maximum tablespace size in KB. If the tablespace contains any data files with Autoextend
     * enabled, then this column displays the amount of underlying free storage space for the
     * tablespace. For example, if the current tablespace size is 1 GB, the combined maximum size of
     * all its data files is 32 GB, and its underlying storage (for example, ASM or file system
     * storage) has 20 GB of free space, then this column will have a value of approximately 20 GB.
     * If the tablespace contains only data files with autoextend disabled, then this column
     * displays the allocated space for the entire tablespace, that is, the combined size of all
     * data files in the tablespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
    private final java.math.BigDecimal maxSizeKB;

    /**
     * The maximum tablespace size in KB. If the tablespace contains any data files with Autoextend
     * enabled, then this column displays the amount of underlying free storage space for the
     * tablespace. For example, if the current tablespace size is 1 GB, the combined maximum size of
     * all its data files is 32 GB, and its underlying storage (for example, ASM or file system
     * storage) has 20 GB of free space, then this column will have a value of approximately 20 GB.
     * If the tablespace contains only data files with autoextend disabled, then this column
     * displays the allocated space for the entire tablespace, that is, the combined size of all
     * data files in the tablespace.
     *
     * @return the value
     */
    public java.math.BigDecimal getMaxSizeKB() {
        return maxSizeKB;
    }

    /** The allocated tablespace size in KB. */
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
    private final java.math.BigDecimal allocatedSizeKB;

    /**
     * The allocated tablespace size in KB.
     *
     * @return the value
     */
    public java.math.BigDecimal getAllocatedSizeKB() {
        return allocatedSizeKB;
    }

    /**
     * The size of the tablespace available for user data in KB. The difference between tablespace
     * size and user data size is used for storing metadata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
    private final java.math.BigDecimal userSizeKB;

    /**
     * The size of the tablespace available for user data in KB. The difference between tablespace
     * size and user data size is used for storing metadata.
     *
     * @return the value
     */
    public java.math.BigDecimal getUserSizeKB() {
        return userSizeKB;
    }

    /** The free space available in the tablespace in KB. */
    @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
    private final java.math.BigDecimal freeSpaceKB;

    /**
     * The free space available in the tablespace in KB.
     *
     * @return the value
     */
    public java.math.BigDecimal getFreeSpaceKB() {
        return freeSpaceKB;
    }

    /** The total space used by the tablespace in KB. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
    private final java.math.BigDecimal usedSpaceKB;

    /**
     * The total space used by the tablespace in KB.
     *
     * @return the value
     */
    public java.math.BigDecimal getUsedSpaceKB() {
        return usedSpaceKB;
    }

    /** The percentage of used space out of the maximum available space in the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
    private final Double usedPercentAvailable;

    /**
     * The percentage of used space out of the maximum available space in the tablespace.
     *
     * @return the value
     */
    public Double getUsedPercentAvailable() {
        return usedPercentAvailable;
    }

    /** The percentage of used space out of the total allocated space in the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
    private final Double usedPercentAllocated;

    /**
     * The percentage of used space out of the total allocated space in the tablespace.
     *
     * @return the value
     */
    public Double getUsedPercentAllocated() {
        return usedPercentAllocated;
    }

    /** Indicates whether this is the default tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether this is the default tablespace.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /** A list of the data files associated with the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("datafiles")
    private final java.util.List<Datafile> datafiles;

    /**
     * A list of the data files associated with the tablespace.
     *
     * @return the value
     */
    public java.util.List<Datafile> getDatafiles() {
        return datafiles;
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
        sb.append("TablespaceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", blockSizeBytes=").append(String.valueOf(this.blockSizeBytes));
        sb.append(", logging=").append(String.valueOf(this.logging));
        sb.append(", isForceLogging=").append(String.valueOf(this.isForceLogging));
        sb.append(", extentManagement=").append(String.valueOf(this.extentManagement));
        sb.append(", allocationType=").append(String.valueOf(this.allocationType));
        sb.append(", isPluggedIn=").append(String.valueOf(this.isPluggedIn));
        sb.append(", segmentSpaceManagement=").append(String.valueOf(this.segmentSpaceManagement));
        sb.append(", defaultTableCompression=")
                .append(String.valueOf(this.defaultTableCompression));
        sb.append(", retention=").append(String.valueOf(this.retention));
        sb.append(", isBigfile=").append(String.valueOf(this.isBigfile));
        sb.append(", predicateEvaluation=").append(String.valueOf(this.predicateEvaluation));
        sb.append(", isEncrypted=").append(String.valueOf(this.isEncrypted));
        sb.append(", compressFor=").append(String.valueOf(this.compressFor));
        sb.append(", defaultInMemory=").append(String.valueOf(this.defaultInMemory));
        sb.append(", defaultInMemoryPriority=")
                .append(String.valueOf(this.defaultInMemoryPriority));
        sb.append(", defaultInMemoryDistribute=")
                .append(String.valueOf(this.defaultInMemoryDistribute));
        sb.append(", defaultInMemoryCompression=")
                .append(String.valueOf(this.defaultInMemoryCompression));
        sb.append(", defaultInMemoryDuplicate=")
                .append(String.valueOf(this.defaultInMemoryDuplicate));
        sb.append(", shared=").append(String.valueOf(this.shared));
        sb.append(", defaultIndexCompression=")
                .append(String.valueOf(this.defaultIndexCompression));
        sb.append(", indexCompressFor=").append(String.valueOf(this.indexCompressFor));
        sb.append(", defaultCellMemory=").append(String.valueOf(this.defaultCellMemory));
        sb.append(", defaultInMemoryService=").append(String.valueOf(this.defaultInMemoryService));
        sb.append(", defaultInMemoryServiceName=")
                .append(String.valueOf(this.defaultInMemoryServiceName));
        sb.append(", lostWriteProtect=").append(String.valueOf(this.lostWriteProtect));
        sb.append(", isChunkTablespace=").append(String.valueOf(this.isChunkTablespace));
        sb.append(", tempGroup=").append(String.valueOf(this.tempGroup));
        sb.append(", maxSizeKB=").append(String.valueOf(this.maxSizeKB));
        sb.append(", allocatedSizeKB=").append(String.valueOf(this.allocatedSizeKB));
        sb.append(", userSizeKB=").append(String.valueOf(this.userSizeKB));
        sb.append(", freeSpaceKB=").append(String.valueOf(this.freeSpaceKB));
        sb.append(", usedSpaceKB=").append(String.valueOf(this.usedSpaceKB));
        sb.append(", usedPercentAvailable=").append(String.valueOf(this.usedPercentAvailable));
        sb.append(", usedPercentAllocated=").append(String.valueOf(this.usedPercentAllocated));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", datafiles=").append(String.valueOf(this.datafiles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TablespaceSummary)) {
            return false;
        }

        TablespaceSummary other = (TablespaceSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.blockSizeBytes, other.blockSizeBytes)
                && java.util.Objects.equals(this.logging, other.logging)
                && java.util.Objects.equals(this.isForceLogging, other.isForceLogging)
                && java.util.Objects.equals(this.extentManagement, other.extentManagement)
                && java.util.Objects.equals(this.allocationType, other.allocationType)
                && java.util.Objects.equals(this.isPluggedIn, other.isPluggedIn)
                && java.util.Objects.equals(
                        this.segmentSpaceManagement, other.segmentSpaceManagement)
                && java.util.Objects.equals(
                        this.defaultTableCompression, other.defaultTableCompression)
                && java.util.Objects.equals(this.retention, other.retention)
                && java.util.Objects.equals(this.isBigfile, other.isBigfile)
                && java.util.Objects.equals(this.predicateEvaluation, other.predicateEvaluation)
                && java.util.Objects.equals(this.isEncrypted, other.isEncrypted)
                && java.util.Objects.equals(this.compressFor, other.compressFor)
                && java.util.Objects.equals(this.defaultInMemory, other.defaultInMemory)
                && java.util.Objects.equals(
                        this.defaultInMemoryPriority, other.defaultInMemoryPriority)
                && java.util.Objects.equals(
                        this.defaultInMemoryDistribute, other.defaultInMemoryDistribute)
                && java.util.Objects.equals(
                        this.defaultInMemoryCompression, other.defaultInMemoryCompression)
                && java.util.Objects.equals(
                        this.defaultInMemoryDuplicate, other.defaultInMemoryDuplicate)
                && java.util.Objects.equals(this.shared, other.shared)
                && java.util.Objects.equals(
                        this.defaultIndexCompression, other.defaultIndexCompression)
                && java.util.Objects.equals(this.indexCompressFor, other.indexCompressFor)
                && java.util.Objects.equals(this.defaultCellMemory, other.defaultCellMemory)
                && java.util.Objects.equals(
                        this.defaultInMemoryService, other.defaultInMemoryService)
                && java.util.Objects.equals(
                        this.defaultInMemoryServiceName, other.defaultInMemoryServiceName)
                && java.util.Objects.equals(this.lostWriteProtect, other.lostWriteProtect)
                && java.util.Objects.equals(this.isChunkTablespace, other.isChunkTablespace)
                && java.util.Objects.equals(this.tempGroup, other.tempGroup)
                && java.util.Objects.equals(this.maxSizeKB, other.maxSizeKB)
                && java.util.Objects.equals(this.allocatedSizeKB, other.allocatedSizeKB)
                && java.util.Objects.equals(this.userSizeKB, other.userSizeKB)
                && java.util.Objects.equals(this.freeSpaceKB, other.freeSpaceKB)
                && java.util.Objects.equals(this.usedSpaceKB, other.usedSpaceKB)
                && java.util.Objects.equals(this.usedPercentAvailable, other.usedPercentAvailable)
                && java.util.Objects.equals(this.usedPercentAllocated, other.usedPercentAllocated)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.datafiles, other.datafiles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.blockSizeBytes == null ? 43 : this.blockSizeBytes.hashCode());
        result = (result * PRIME) + (this.logging == null ? 43 : this.logging.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceLogging == null ? 43 : this.isForceLogging.hashCode());
        result =
                (result * PRIME)
                        + (this.extentManagement == null ? 43 : this.extentManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.allocationType == null ? 43 : this.allocationType.hashCode());
        result = (result * PRIME) + (this.isPluggedIn == null ? 43 : this.isPluggedIn.hashCode());
        result =
                (result * PRIME)
                        + (this.segmentSpaceManagement == null
                                ? 43
                                : this.segmentSpaceManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultTableCompression == null
                                ? 43
                                : this.defaultTableCompression.hashCode());
        result = (result * PRIME) + (this.retention == null ? 43 : this.retention.hashCode());
        result = (result * PRIME) + (this.isBigfile == null ? 43 : this.isBigfile.hashCode());
        result =
                (result * PRIME)
                        + (this.predicateEvaluation == null
                                ? 43
                                : this.predicateEvaluation.hashCode());
        result = (result * PRIME) + (this.isEncrypted == null ? 43 : this.isEncrypted.hashCode());
        result = (result * PRIME) + (this.compressFor == null ? 43 : this.compressFor.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultInMemory == null ? 43 : this.defaultInMemory.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultInMemoryPriority == null
                                ? 43
                                : this.defaultInMemoryPriority.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultInMemoryDistribute == null
                                ? 43
                                : this.defaultInMemoryDistribute.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultInMemoryCompression == null
                                ? 43
                                : this.defaultInMemoryCompression.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultInMemoryDuplicate == null
                                ? 43
                                : this.defaultInMemoryDuplicate.hashCode());
        result = (result * PRIME) + (this.shared == null ? 43 : this.shared.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultIndexCompression == null
                                ? 43
                                : this.defaultIndexCompression.hashCode());
        result =
                (result * PRIME)
                        + (this.indexCompressFor == null ? 43 : this.indexCompressFor.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultCellMemory == null ? 43 : this.defaultCellMemory.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultInMemoryService == null
                                ? 43
                                : this.defaultInMemoryService.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultInMemoryServiceName == null
                                ? 43
                                : this.defaultInMemoryServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.lostWriteProtect == null ? 43 : this.lostWriteProtect.hashCode());
        result =
                (result * PRIME)
                        + (this.isChunkTablespace == null ? 43 : this.isChunkTablespace.hashCode());
        result = (result * PRIME) + (this.tempGroup == null ? 43 : this.tempGroup.hashCode());
        result = (result * PRIME) + (this.maxSizeKB == null ? 43 : this.maxSizeKB.hashCode());
        result =
                (result * PRIME)
                        + (this.allocatedSizeKB == null ? 43 : this.allocatedSizeKB.hashCode());
        result = (result * PRIME) + (this.userSizeKB == null ? 43 : this.userSizeKB.hashCode());
        result = (result * PRIME) + (this.freeSpaceKB == null ? 43 : this.freeSpaceKB.hashCode());
        result = (result * PRIME) + (this.usedSpaceKB == null ? 43 : this.usedSpaceKB.hashCode());
        result =
                (result * PRIME)
                        + (this.usedPercentAvailable == null
                                ? 43
                                : this.usedPercentAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.usedPercentAllocated == null
                                ? 43
                                : this.usedPercentAllocated.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.datafiles == null ? 43 : this.datafiles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
