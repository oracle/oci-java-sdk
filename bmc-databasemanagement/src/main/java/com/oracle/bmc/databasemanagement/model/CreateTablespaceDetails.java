/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to create a tablespace.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateTablespaceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateTablespaceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private TablespaceAdminCredentialDetails credentialDetails;

        public Builder credentialDetails(TablespaceAdminCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("isBigfile")
        private Boolean isBigfile;

        public Builder isBigfile(Boolean isBigfile) {
            this.isBigfile = isBigfile;
            this.__explicitlySet__.add("isBigfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataFiles")
        private java.util.List<String> dataFiles;

        public Builder dataFiles(java.util.List<String> dataFiles) {
            this.dataFiles = dataFiles;
            this.__explicitlySet__.add("dataFiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileCount")
        private Integer fileCount;

        public Builder fileCount(Integer fileCount) {
            this.fileCount = fileCount;
            this.__explicitlySet__.add("fileCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileSize")
        private TablespaceStorageSize fileSize;

        public Builder fileSize(TablespaceStorageSize fileSize) {
            this.fileSize = fileSize;
            this.__explicitlySet__.add("fileSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReusable")
        private Boolean isReusable;

        public Builder isReusable(Boolean isReusable) {
            this.isReusable = isReusable;
            this.__explicitlySet__.add("isReusable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
        private Boolean isAutoExtensible;

        public Builder isAutoExtensible(Boolean isAutoExtensible) {
            this.isAutoExtensible = isAutoExtensible;
            this.__explicitlySet__.add("isAutoExtensible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoExtendNextSize")
        private TablespaceStorageSize autoExtendNextSize;

        public Builder autoExtendNextSize(TablespaceStorageSize autoExtendNextSize) {
            this.autoExtendNextSize = autoExtendNextSize;
            this.__explicitlySet__.add("autoExtendNextSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoExtendMaxSize")
        private TablespaceStorageSize autoExtendMaxSize;

        public Builder autoExtendMaxSize(TablespaceStorageSize autoExtendMaxSize) {
            this.autoExtendMaxSize = autoExtendMaxSize;
            this.__explicitlySet__.add("autoExtendMaxSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMaxSizeUnlimited")
        private Boolean isMaxSizeUnlimited;

        public Builder isMaxSizeUnlimited(Boolean isMaxSizeUnlimited) {
            this.isMaxSizeUnlimited = isMaxSizeUnlimited;
            this.__explicitlySet__.add("isMaxSizeUnlimited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockSizeInKilobytes")
        private Integer blockSizeInKilobytes;

        public Builder blockSizeInKilobytes(Integer blockSizeInKilobytes) {
            this.blockSizeInKilobytes = blockSizeInKilobytes;
            this.__explicitlySet__.add("blockSizeInKilobytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
        private Boolean isEncrypted;

        public Builder isEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            this.__explicitlySet__.add("isEncrypted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private String encryptionAlgorithm;

        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultCompress")
        private DefaultCompress defaultCompress;

        public Builder defaultCompress(DefaultCompress defaultCompress) {
            this.defaultCompress = defaultCompress;
            this.__explicitlySet__.add("defaultCompress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extentManagement")
        private ExtentManagement extentManagement;

        public Builder extentManagement(ExtentManagement extentManagement) {
            this.extentManagement = extentManagement;
            this.__explicitlySet__.add("extentManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extentUniformSize")
        private TablespaceStorageSize extentUniformSize;

        public Builder extentUniformSize(TablespaceStorageSize extentUniformSize) {
            this.extentUniformSize = extentUniformSize;
            this.__explicitlySet__.add("extentUniformSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("segmentManagement")
        private SegmentManagement segmentManagement;

        public Builder segmentManagement(SegmentManagement segmentManagement) {
            this.segmentManagement = segmentManagement;
            this.__explicitlySet__.add("segmentManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTablespaceDetails build() {
            CreateTablespaceDetails __instance__ =
                    new CreateTablespaceDetails(
                            credentialDetails,
                            name,
                            type,
                            isBigfile,
                            dataFiles,
                            fileCount,
                            fileSize,
                            isReusable,
                            isAutoExtensible,
                            autoExtendNextSize,
                            autoExtendMaxSize,
                            isMaxSizeUnlimited,
                            blockSizeInKilobytes,
                            isEncrypted,
                            encryptionAlgorithm,
                            defaultCompress,
                            status,
                            extentManagement,
                            extentUniformSize,
                            segmentManagement,
                            isDefault);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTablespaceDetails o) {
            Builder copiedBuilder =
                    credentialDetails(o.getCredentialDetails())
                            .name(o.getName())
                            .type(o.getType())
                            .isBigfile(o.getIsBigfile())
                            .dataFiles(o.getDataFiles())
                            .fileCount(o.getFileCount())
                            .fileSize(o.getFileSize())
                            .isReusable(o.getIsReusable())
                            .isAutoExtensible(o.getIsAutoExtensible())
                            .autoExtendNextSize(o.getAutoExtendNextSize())
                            .autoExtendMaxSize(o.getAutoExtendMaxSize())
                            .isMaxSizeUnlimited(o.getIsMaxSizeUnlimited())
                            .blockSizeInKilobytes(o.getBlockSizeInKilobytes())
                            .isEncrypted(o.getIsEncrypted())
                            .encryptionAlgorithm(o.getEncryptionAlgorithm())
                            .defaultCompress(o.getDefaultCompress())
                            .status(o.getStatus())
                            .extentManagement(o.getExtentManagement())
                            .extentUniformSize(o.getExtentUniformSize())
                            .segmentManagement(o.getSegmentManagement())
                            .isDefault(o.getIsDefault());

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

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    TablespaceAdminCredentialDetails credentialDetails;

    /**
     * The name of the tablespace. It must be unique within a database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The type of tablespace.
     *
     **/
    public enum Type {
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
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * Specifies whether the tablespace is a bigfile or smallfile tablespace.
     * A bigfile tablespace contains only one data file or temp file, which can contain up to approximately 4 billion (232) blocks.
     * A smallfile tablespace is a traditional Oracle tablespace, which can contain 1022 data files or temp files, each of which can contain up to approximately 4 million (222) blocks.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBigfile")
    Boolean isBigfile;

    /**
     * The list of data files or temp files created for the tablespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataFiles")
    java.util.List<String> dataFiles;

    /**
     * The number of data files or temp files created for the tablespace. This is for Oracle Managed Files only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileCount")
    Integer fileCount;

    /**
     * The size of each data file or temp file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSize")
    TablespaceStorageSize fileSize;

    /**
     * Specifies whether Oracle can reuse the data file or temp file. Reuse is only allowed when the file name is provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReusable")
    Boolean isReusable;

    /**
     * Specifies whether the data file or temp file can be extended automatically.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
    Boolean isAutoExtensible;

    /**
     * The size of the next increment of disk space to be allocated automatically when more extents are required.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoExtendNextSize")
    TablespaceStorageSize autoExtendNextSize;

    /**
     * The maximum disk space allowed for automatic extension of the data files or temp files.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoExtendMaxSize")
    TablespaceStorageSize autoExtendMaxSize;

    /**
     * Specifies whether the disk space of the data file or temp file can be limited.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMaxSizeUnlimited")
    Boolean isMaxSizeUnlimited;

    /**
     * Block size for the tablespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockSizeInKilobytes")
    Integer blockSizeInKilobytes;

    /**
     * Indicates whether the tablespace is encrypted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
    Boolean isEncrypted;

    /**
     * The name of the encryption algorithm to be used for tablespace encryption.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    String encryptionAlgorithm;
    /**
     * The default compression of data for all tables created in the tablespace.
     *
     **/
    public enum DefaultCompress {
        NoCompress("NO_COMPRESS"),
        BasicCompress("BASIC_COMPRESS"),
        ;

        private final String value;
        private static java.util.Map<String, DefaultCompress> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultCompress v : DefaultCompress.values()) {
                map.put(v.getValue(), v);
            }
        }

        DefaultCompress(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultCompress create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DefaultCompress: " + key);
        }
    };
    /**
     * The default compression of data for all tables created in the tablespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCompress")
    DefaultCompress defaultCompress;
    /**
     * The status of the tablespace.
     *
     **/
    public enum Status {
        ReadOnly("READ_ONLY"),
        ReadWrite("READ_WRITE"),
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
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;
    /**
     * Specifies how the extents of the tablespace should be managed.
     *
     **/
    public enum ExtentManagement {
        Autoallocate("AUTOALLOCATE"),
        Uniform("UNIFORM"),
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
     * Specifies how the extents of the tablespace should be managed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extentManagement")
    ExtentManagement extentManagement;

    /**
     * The size of the extent when the tablespace is managed with uniform extents of a specific size.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extentUniformSize")
    TablespaceStorageSize extentUniformSize;
    /**
     * Specifies whether tablespace segment management should be automatic or manual.
     *
     **/
    public enum SegmentManagement {
        Auto("AUTO"),
        Manual("MANUAL"),
        ;

        private final String value;
        private static java.util.Map<String, SegmentManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (SegmentManagement v : SegmentManagement.values()) {
                map.put(v.getValue(), v);
            }
        }

        SegmentManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SegmentManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SegmentManagement: " + key);
        }
    };
    /**
     * Specifies whether tablespace segment management should be automatic or manual.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("segmentManagement")
    SegmentManagement segmentManagement;

    /**
     * Specifies whether the tablespace is the default tablespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    Boolean isDefault;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
