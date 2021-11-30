/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a tablespace.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Tablespace.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Tablespace {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockSizeBytes")
        private java.math.BigDecimal blockSizeBytes;

        public Builder blockSizeBytes(java.math.BigDecimal blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            this.__explicitlySet__.add("blockSizeBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logging")
        private Logging logging;

        public Builder logging(Logging logging) {
            this.logging = logging;
            this.__explicitlySet__.add("logging");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isForceLogging")
        private Boolean isForceLogging;

        public Builder isForceLogging(Boolean isForceLogging) {
            this.isForceLogging = isForceLogging;
            this.__explicitlySet__.add("isForceLogging");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extentManagement")
        private ExtentManagement extentManagement;

        public Builder extentManagement(ExtentManagement extentManagement) {
            this.extentManagement = extentManagement;
            this.__explicitlySet__.add("extentManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allocationType")
        private AllocationType allocationType;

        public Builder allocationType(AllocationType allocationType) {
            this.allocationType = allocationType;
            this.__explicitlySet__.add("allocationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPluggedIn")
        private Boolean isPluggedIn;

        public Builder isPluggedIn(Boolean isPluggedIn) {
            this.isPluggedIn = isPluggedIn;
            this.__explicitlySet__.add("isPluggedIn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("segmentSpaceManagement")
        private SegmentSpaceManagement segmentSpaceManagement;

        public Builder segmentSpaceManagement(SegmentSpaceManagement segmentSpaceManagement) {
            this.segmentSpaceManagement = segmentSpaceManagement;
            this.__explicitlySet__.add("segmentSpaceManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultTableCompression")
        private DefaultTableCompression defaultTableCompression;

        public Builder defaultTableCompression(DefaultTableCompression defaultTableCompression) {
            this.defaultTableCompression = defaultTableCompression;
            this.__explicitlySet__.add("defaultTableCompression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retention")
        private Retention retention;

        public Builder retention(Retention retention) {
            this.retention = retention;
            this.__explicitlySet__.add("retention");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBigfile")
        private Boolean isBigfile;

        public Builder isBigfile(Boolean isBigfile) {
            this.isBigfile = isBigfile;
            this.__explicitlySet__.add("isBigfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("predicateEvaluation")
        private PredicateEvaluation predicateEvaluation;

        public Builder predicateEvaluation(PredicateEvaluation predicateEvaluation) {
            this.predicateEvaluation = predicateEvaluation;
            this.__explicitlySet__.add("predicateEvaluation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
        private Boolean isEncrypted;

        public Builder isEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            this.__explicitlySet__.add("isEncrypted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compressFor")
        private CompressFor compressFor;

        public Builder compressFor(CompressFor compressFor) {
            this.compressFor = compressFor;
            this.__explicitlySet__.add("compressFor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemory")
        private DefaultInMemory defaultInMemory;

        public Builder defaultInMemory(DefaultInMemory defaultInMemory) {
            this.defaultInMemory = defaultInMemory;
            this.__explicitlySet__.add("defaultInMemory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryPriority")
        private DefaultInMemoryPriority defaultInMemoryPriority;

        public Builder defaultInMemoryPriority(DefaultInMemoryPriority defaultInMemoryPriority) {
            this.defaultInMemoryPriority = defaultInMemoryPriority;
            this.__explicitlySet__.add("defaultInMemoryPriority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryDistribute")
        private DefaultInMemoryDistribute defaultInMemoryDistribute;

        public Builder defaultInMemoryDistribute(
                DefaultInMemoryDistribute defaultInMemoryDistribute) {
            this.defaultInMemoryDistribute = defaultInMemoryDistribute;
            this.__explicitlySet__.add("defaultInMemoryDistribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryCompression")
        private DefaultInMemoryCompression defaultInMemoryCompression;

        public Builder defaultInMemoryCompression(
                DefaultInMemoryCompression defaultInMemoryCompression) {
            this.defaultInMemoryCompression = defaultInMemoryCompression;
            this.__explicitlySet__.add("defaultInMemoryCompression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryDuplicate")
        private DefaultInMemoryDuplicate defaultInMemoryDuplicate;

        public Builder defaultInMemoryDuplicate(DefaultInMemoryDuplicate defaultInMemoryDuplicate) {
            this.defaultInMemoryDuplicate = defaultInMemoryDuplicate;
            this.__explicitlySet__.add("defaultInMemoryDuplicate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shared")
        private Shared shared;

        public Builder shared(Shared shared) {
            this.shared = shared;
            this.__explicitlySet__.add("shared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultIndexCompression")
        private DefaultIndexCompression defaultIndexCompression;

        public Builder defaultIndexCompression(DefaultIndexCompression defaultIndexCompression) {
            this.defaultIndexCompression = defaultIndexCompression;
            this.__explicitlySet__.add("defaultIndexCompression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("indexCompressFor")
        private IndexCompressFor indexCompressFor;

        public Builder indexCompressFor(IndexCompressFor indexCompressFor) {
            this.indexCompressFor = indexCompressFor;
            this.__explicitlySet__.add("indexCompressFor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultCellMemory")
        private String defaultCellMemory;

        public Builder defaultCellMemory(String defaultCellMemory) {
            this.defaultCellMemory = defaultCellMemory;
            this.__explicitlySet__.add("defaultCellMemory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryService")
        private DefaultInMemoryService defaultInMemoryService;

        public Builder defaultInMemoryService(DefaultInMemoryService defaultInMemoryService) {
            this.defaultInMemoryService = defaultInMemoryService;
            this.__explicitlySet__.add("defaultInMemoryService");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryServiceName")
        private String defaultInMemoryServiceName;

        public Builder defaultInMemoryServiceName(String defaultInMemoryServiceName) {
            this.defaultInMemoryServiceName = defaultInMemoryServiceName;
            this.__explicitlySet__.add("defaultInMemoryServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
        private LostWriteProtect lostWriteProtect;

        public Builder lostWriteProtect(LostWriteProtect lostWriteProtect) {
            this.lostWriteProtect = lostWriteProtect;
            this.__explicitlySet__.add("lostWriteProtect");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isChunkTablespace")
        private Boolean isChunkTablespace;

        public Builder isChunkTablespace(Boolean isChunkTablespace) {
            this.isChunkTablespace = isChunkTablespace;
            this.__explicitlySet__.add("isChunkTablespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tempGroup")
        private String tempGroup;

        public Builder tempGroup(String tempGroup) {
            this.tempGroup = tempGroup;
            this.__explicitlySet__.add("tempGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
        private java.math.BigDecimal maxSizeKB;

        public Builder maxSizeKB(java.math.BigDecimal maxSizeKB) {
            this.maxSizeKB = maxSizeKB;
            this.__explicitlySet__.add("maxSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
        private java.math.BigDecimal allocatedSizeKB;

        public Builder allocatedSizeKB(java.math.BigDecimal allocatedSizeKB) {
            this.allocatedSizeKB = allocatedSizeKB;
            this.__explicitlySet__.add("allocatedSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
        private java.math.BigDecimal userSizeKB;

        public Builder userSizeKB(java.math.BigDecimal userSizeKB) {
            this.userSizeKB = userSizeKB;
            this.__explicitlySet__.add("userSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
        private java.math.BigDecimal freeSpaceKB;

        public Builder freeSpaceKB(java.math.BigDecimal freeSpaceKB) {
            this.freeSpaceKB = freeSpaceKB;
            this.__explicitlySet__.add("freeSpaceKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
        private java.math.BigDecimal usedSpaceKB;

        public Builder usedSpaceKB(java.math.BigDecimal usedSpaceKB) {
            this.usedSpaceKB = usedSpaceKB;
            this.__explicitlySet__.add("usedSpaceKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
        private Double usedPercentAvailable;

        public Builder usedPercentAvailable(Double usedPercentAvailable) {
            this.usedPercentAvailable = usedPercentAvailable;
            this.__explicitlySet__.add("usedPercentAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
        private Double usedPercentAllocated;

        public Builder usedPercentAllocated(Double usedPercentAllocated) {
            this.usedPercentAllocated = usedPercentAllocated;
            this.__explicitlySet__.add("usedPercentAllocated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("datafiles")
        private java.util.List<Datafile> datafiles;

        public Builder datafiles(java.util.List<Datafile> datafiles) {
            this.datafiles = datafiles;
            this.__explicitlySet__.add("datafiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Tablespace build() {
            Tablespace __instance__ =
                    new Tablespace(
                            name,
                            type,
                            status,
                            blockSizeBytes,
                            logging,
                            isForceLogging,
                            extentManagement,
                            allocationType,
                            isPluggedIn,
                            segmentSpaceManagement,
                            defaultTableCompression,
                            retention,
                            isBigfile,
                            predicateEvaluation,
                            isEncrypted,
                            compressFor,
                            defaultInMemory,
                            defaultInMemoryPriority,
                            defaultInMemoryDistribute,
                            defaultInMemoryCompression,
                            defaultInMemoryDuplicate,
                            shared,
                            defaultIndexCompression,
                            indexCompressFor,
                            defaultCellMemory,
                            defaultInMemoryService,
                            defaultInMemoryServiceName,
                            lostWriteProtect,
                            isChunkTablespace,
                            tempGroup,
                            maxSizeKB,
                            allocatedSizeKB,
                            userSizeKB,
                            freeSpaceKB,
                            usedSpaceKB,
                            usedPercentAvailable,
                            usedPercentAllocated,
                            datafiles);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Tablespace o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .type(o.getType())
                            .status(o.getStatus())
                            .blockSizeBytes(o.getBlockSizeBytes())
                            .logging(o.getLogging())
                            .isForceLogging(o.getIsForceLogging())
                            .extentManagement(o.getExtentManagement())
                            .allocationType(o.getAllocationType())
                            .isPluggedIn(o.getIsPluggedIn())
                            .segmentSpaceManagement(o.getSegmentSpaceManagement())
                            .defaultTableCompression(o.getDefaultTableCompression())
                            .retention(o.getRetention())
                            .isBigfile(o.getIsBigfile())
                            .predicateEvaluation(o.getPredicateEvaluation())
                            .isEncrypted(o.getIsEncrypted())
                            .compressFor(o.getCompressFor())
                            .defaultInMemory(o.getDefaultInMemory())
                            .defaultInMemoryPriority(o.getDefaultInMemoryPriority())
                            .defaultInMemoryDistribute(o.getDefaultInMemoryDistribute())
                            .defaultInMemoryCompression(o.getDefaultInMemoryCompression())
                            .defaultInMemoryDuplicate(o.getDefaultInMemoryDuplicate())
                            .shared(o.getShared())
                            .defaultIndexCompression(o.getDefaultIndexCompression())
                            .indexCompressFor(o.getIndexCompressFor())
                            .defaultCellMemory(o.getDefaultCellMemory())
                            .defaultInMemoryService(o.getDefaultInMemoryService())
                            .defaultInMemoryServiceName(o.getDefaultInMemoryServiceName())
                            .lostWriteProtect(o.getLostWriteProtect())
                            .isChunkTablespace(o.getIsChunkTablespace())
                            .tempGroup(o.getTempGroup())
                            .maxSizeKB(o.getMaxSizeKB())
                            .allocatedSizeKB(o.getAllocatedSizeKB())
                            .userSizeKB(o.getUserSizeKB())
                            .freeSpaceKB(o.getFreeSpaceKB())
                            .usedSpaceKB(o.getUsedSpaceKB())
                            .usedPercentAvailable(o.getUsedPercentAvailable())
                            .usedPercentAllocated(o.getUsedPercentAllocated())
                            .datafiles(o.getDatafiles());

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
     * The name of the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The type of tablespace.
     **/
    public enum Type {
        Undo("UNDO"),
        LostWriteProtection("LOST_WRITE_PROTECTION"),
        Permanent("PERMANENT"),
        Temporary("TEMPORARY"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * The type of tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;
    /**
     * The status of the tablespace.
     **/
    public enum Status {
        Online("ONLINE"),
        Offline("OFFLINE"),
        ReadOnly("READ_ONLY"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    /**
     * The status of the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The tablespace block size.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockSizeBytes")
    java.math.BigDecimal blockSizeBytes;
    /**
     * The default logging attribute.
     **/
    public enum Logging {
        Logging("LOGGING"),
        Nologging("NOLOGGING"),
        ;

        private final String value;
        private static java.util.Map<String, Logging> map;

        static {
            map = new java.util.HashMap<>();
            for (Logging v : Logging.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Logging: " + key);
        }
    };
    /**
     * The default logging attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    Logging logging;

    /**
     * Indicates whether the tablespace is under Force Logging mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForceLogging")
    Boolean isForceLogging;
    /**
     * Indicates whether the extents in the tablespace are Locally managed or Dictionary managed.
     **/
    public enum ExtentManagement {
        Local("LOCAL"),
        Dictionary("DICTIONARY"),
        ;

        private final String value;
        private static java.util.Map<String, ExtentManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (ExtentManagement v : ExtentManagement.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ExtentManagement: " + key);
        }
    };
    /**
     * Indicates whether the extents in the tablespace are Locally managed or Dictionary managed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extentManagement")
    ExtentManagement extentManagement;
    /**
     * The type of extent allocation in effect for the tablespace.
     **/
    public enum AllocationType {
        System("SYSTEM"),
        Uniform("UNIFORM"),
        User("USER"),
        ;

        private final String value;
        private static java.util.Map<String, AllocationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AllocationType v : AllocationType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid AllocationType: " + key);
        }
    };
    /**
     * The type of extent allocation in effect for the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allocationType")
    AllocationType allocationType;

    /**
     * Indicates whether the tablespace is plugged in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPluggedIn")
    Boolean isPluggedIn;
    /**
     * Indicates whether the free and used segment space in the tablespace is managed using free lists (MANUAL) or bitmaps (AUTO).
     **/
    public enum SegmentSpaceManagement {
        Manual("MANUAL"),
        Auto("AUTO"),
        ;

        private final String value;
        private static java.util.Map<String, SegmentSpaceManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (SegmentSpaceManagement v : SegmentSpaceManagement.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid SegmentSpaceManagement: " + key);
        }
    };
    /**
     * Indicates whether the free and used segment space in the tablespace is managed using free lists (MANUAL) or bitmaps (AUTO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("segmentSpaceManagement")
    SegmentSpaceManagement segmentSpaceManagement;
    /**
     * Indicates whether default table compression is enabled or disabled.
     **/
    public enum DefaultTableCompression {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultTableCompression> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultTableCompression v : DefaultTableCompression.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DefaultTableCompression: " + key);
        }
    };
    /**
     * Indicates whether default table compression is enabled or disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultTableCompression")
    DefaultTableCompression defaultTableCompression;
    /**
     * Indicates whether undo retention guarantee is enabled for the tablespace.
     **/
    public enum Retention {
        Guarantee("GUARANTEE"),
        Noguarantee("NOGUARANTEE"),
        NotApply("NOT_APPLY"),
        ;

        private final String value;
        private static java.util.Map<String, Retention> map;

        static {
            map = new java.util.HashMap<>();
            for (Retention v : Retention.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Retention: " + key);
        }
    };
    /**
     * Indicates whether undo retention guarantee is enabled for the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retention")
    Retention retention;

    /**
     * Indicates whether the tablespace is a Bigfile tablespace or a Smallfile tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBigfile")
    Boolean isBigfile;
    /**
     * Indicates whether predicates are evaluated by Host or by Storage.
     **/
    public enum PredicateEvaluation {
        Host("HOST"),
        Storage("STORAGE"),
        ;

        private final String value;
        private static java.util.Map<String, PredicateEvaluation> map;

        static {
            map = new java.util.HashMap<>();
            for (PredicateEvaluation v : PredicateEvaluation.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid PredicateEvaluation: " + key);
        }
    };
    /**
     * Indicates whether predicates are evaluated by Host or by Storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("predicateEvaluation")
    PredicateEvaluation predicateEvaluation;

    /**
     * Indicates whether the tablespace is encrypted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
    Boolean isEncrypted;
    /**
     * The operation type for which default compression is enabled.
     **/
    public enum CompressFor {
        Basic("BASIC"),
        Advanced("ADVANCED"),
        QueryLow("QUERY_LOW"),
        QueryHigh("QUERY_HIGH"),
        ArchiveLow("ARCHIVE_LOW"),
        ArchiveHigh("ARCHIVE_HIGH"),
        DirectLoadOnly("DIRECT_LOAD_ONLY"),
        ForAllOperations("FOR_ALL_OPERATIONS"),
        ;

        private final String value;
        private static java.util.Map<String, CompressFor> map;

        static {
            map = new java.util.HashMap<>();
            for (CompressFor v : CompressFor.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid CompressFor: " + key);
        }
    };
    /**
     * The operation type for which default compression is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compressFor")
    CompressFor compressFor;
    /**
     * Indicates whether the In-Memory Column Store (IM column store) is by default enabled or disabled for tables in the tablespace.
     **/
    public enum DefaultInMemory {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultInMemory> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemory v : DefaultInMemory.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DefaultInMemory: " + key);
        }
    };
    /**
     * Indicates whether the In-Memory Column Store (IM column store) is by default enabled or disabled for tables in the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemory")
    DefaultInMemory defaultInMemory;
    /**
     * Indicates the default priority for In-Memory Column Store (IM column store) population for the tablespace.
     **/
    public enum DefaultInMemoryPriority {
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),
        Critical("CRITICAL"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultInMemoryPriority> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryPriority v : DefaultInMemoryPriority.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DefaultInMemoryPriority: " + key);
        }
    };
    /**
     * Indicates the default priority for In-Memory Column Store (IM column store) population for the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryPriority")
    DefaultInMemoryPriority defaultInMemoryPriority;
    /**
     * Indicates how the IM column store is distributed by default for the tablespace in an Oracle Real Application Clusters (Oracle RAC) environment.
     **/
    public enum DefaultInMemoryDistribute {
        Auto("AUTO"),
        ByRowidRange("BY_ROWID_RANGE"),
        ByPartition("BY_PARTITION"),
        BySubpartition("BY_SUBPARTITION"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultInMemoryDistribute> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryDistribute v : DefaultInMemoryDistribute.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DefaultInMemoryDistribute: " + key);
        }
    };
    /**
     * Indicates how the IM column store is distributed by default for the tablespace in an Oracle Real Application Clusters (Oracle RAC) environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryDistribute")
    DefaultInMemoryDistribute defaultInMemoryDistribute;
    /**
     * Indicates the default compression level for the IM column store for the tablespace.
     **/
    public enum DefaultInMemoryCompression {
        NoMemcompress("NO_MEMCOMPRESS"),
        ForDml("FOR_DML"),
        ForQueryLow("FOR_QUERY_LOW"),
        ForQueryHigh("FOR_QUERY_HIGH"),
        ForCapacityLow("FOR_CAPACITY_LOW"),
        ForCapacityHigh("FOR_CAPACITY_HIGH"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultInMemoryCompression> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryCompression v : DefaultInMemoryCompression.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DefaultInMemoryCompression: " + key);
        }
    };
    /**
     * Indicates the default compression level for the IM column store for the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryCompression")
    DefaultInMemoryCompression defaultInMemoryCompression;
    /**
     * Indicates the duplicate setting for the IM column store in an Oracle RAC environment.
     **/
    public enum DefaultInMemoryDuplicate {
        NoDuplicate("NO_DUPLICATE"),
        Duplicate("DUPLICATE"),
        DuplicateAll("DUPLICATE_ALL"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultInMemoryDuplicate> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryDuplicate v : DefaultInMemoryDuplicate.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DefaultInMemoryDuplicate: " + key);
        }
    };
    /**
     * Indicates the duplicate setting for the IM column store in an Oracle RAC environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryDuplicate")
    DefaultInMemoryDuplicate defaultInMemoryDuplicate;
    /**
     * Indicates whether the tablespace is for shared tablespace, or for local temporary tablespace for leaf (read-only) instances, or for local temporary tablespace for all instance types.
     **/
    public enum Shared {
        Shared("SHARED"),
        LocalOnLeaf("LOCAL_ON_LEAF"),
        LocalOnAll("LOCAL_ON_ALL"),
        ;

        private final String value;
        private static java.util.Map<String, Shared> map;

        static {
            map = new java.util.HashMap<>();
            for (Shared v : Shared.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Shared: " + key);
        }
    };
    /**
     * Indicates whether the tablespace is for shared tablespace, or for local temporary tablespace for leaf (read-only) instances, or for local temporary tablespace for all instance types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shared")
    Shared shared;
    /**
     * Indicates whether default index compression is enabled or disabled.
     **/
    public enum DefaultIndexCompression {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultIndexCompression> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultIndexCompression v : DefaultIndexCompression.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DefaultIndexCompression: " + key);
        }
    };
    /**
     * Indicates whether default index compression is enabled or disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultIndexCompression")
    DefaultIndexCompression defaultIndexCompression;
    /**
     * The operation type for which default index compression is enabled.
     **/
    public enum IndexCompressFor {
        AdvancedLow("ADVANCED_LOW"),
        AdvancedHigh("ADVANCED_HIGH"),
        ;

        private final String value;
        private static java.util.Map<String, IndexCompressFor> map;

        static {
            map = new java.util.HashMap<>();
            for (IndexCompressFor v : IndexCompressFor.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid IndexCompressFor: " + key);
        }
    };
    /**
     * The operation type for which default index compression is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexCompressFor")
    IndexCompressFor indexCompressFor;

    /**
     * This specifies the default value for the CELLMEMORY attribute that tables created in the tablespace will inherit unless the behavior is overridden explicitly. This column is intended for use with Oracle Exadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCellMemory")
    String defaultCellMemory;
    /**
     * Indicates how the IM column store is populated on various instances by default for the tablespace.
     **/
    public enum DefaultInMemoryService {
        Default("DEFAULT"),
        None("NONE"),
        All("ALL"),
        UserDefined("USER_DEFINED"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultInMemoryService> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultInMemoryService v : DefaultInMemoryService.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DefaultInMemoryService: " + key);
        }
    };
    /**
     * Indicates how the IM column store is populated on various instances by default for the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryService")
    DefaultInMemoryService defaultInMemoryService;

    /**
     * Indicates the service name for the service on which the IM column store should be populated by default for the tablespace. This column has a value only when the corresponding DEF_INMEMORY_SERVICE is USER_DEFINED. In all other cases, this column is null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInMemoryServiceName")
    String defaultInMemoryServiceName;
    /**
     * The lost write protection setting for the tablespace.
     **/
    public enum LostWriteProtect {
        Enabled("ENABLED"),
        ProtectOff("PROTECT_OFF"),
        Suspend("SUSPEND"),
        ;

        private final String value;
        private static java.util.Map<String, LostWriteProtect> map;

        static {
            map = new java.util.HashMap<>();
            for (LostWriteProtect v : LostWriteProtect.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LostWriteProtect: " + key);
        }
    };
    /**
     * The lost write protection setting for the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
    LostWriteProtect lostWriteProtect;

    /**
     * Indicates whether this is a chunk tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isChunkTablespace")
    Boolean isChunkTablespace;

    /**
     * The temporary tablespace group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tempGroup")
    String tempGroup;

    /**
     * The maximum tablespace size in KB. If the tablespace contains any data files with Autoextend enabled, then this column displays the amount of underlying free storage space for the tablespace. For example, if the current tablespace size is 1 GB, the combined maximum size of all its data files is 32 GB, and its underlying storage (for example, ASM or file system storage) has 20 GB of free space, then this column will have a value of approximately 20 GB. If the tablespace contains only data files with autoextend disabled, then this column displays the allocated space for the entire tablespace, that is, the combined size of all data files in the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
    java.math.BigDecimal maxSizeKB;

    /**
     * The allocated tablespace size in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
    java.math.BigDecimal allocatedSizeKB;

    /**
     * The size of the tablespace available for user data in KB. The difference between tablespace size and user data size is used for storing metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
    java.math.BigDecimal userSizeKB;

    /**
     * The free space available in the tablespace in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
    java.math.BigDecimal freeSpaceKB;

    /**
     * The total space used by the tablespace in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
    java.math.BigDecimal usedSpaceKB;

    /**
     * The percentage of used space out of the maximum available space in the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
    Double usedPercentAvailable;

    /**
     * The percentage of used space out of the total allocated space in the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
    Double usedPercentAllocated;

    /**
     * A list of the data files associated with the tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datafiles")
    java.util.List<Datafile> datafiles;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
