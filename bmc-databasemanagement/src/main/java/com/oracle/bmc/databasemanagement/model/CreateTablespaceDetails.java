/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to create a tablespace. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateTablespaceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateTablespaceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "name",
        "type",
        "isBigfile",
        "dataFiles",
        "fileCount",
        "fileSize",
        "isReusable",
        "isAutoExtensible",
        "autoExtendNextSize",
        "autoExtendMaxSize",
        "isMaxSizeUnlimited",
        "blockSizeInKilobytes",
        "isEncrypted",
        "encryptionAlgorithm",
        "defaultCompress",
        "status",
        "extentManagement",
        "extentUniformSize",
        "segmentManagement",
        "isDefault"
    })
    public CreateTablespaceDetails(
            TablespaceAdminCredentialDetails credentialDetails,
            String name,
            Type type,
            Boolean isBigfile,
            java.util.List<String> dataFiles,
            Integer fileCount,
            TablespaceStorageSize fileSize,
            Boolean isReusable,
            Boolean isAutoExtensible,
            TablespaceStorageSize autoExtendNextSize,
            TablespaceStorageSize autoExtendMaxSize,
            Boolean isMaxSizeUnlimited,
            Integer blockSizeInKilobytes,
            Boolean isEncrypted,
            String encryptionAlgorithm,
            DefaultCompress defaultCompress,
            Status status,
            ExtentManagement extentManagement,
            TablespaceStorageSize extentUniformSize,
            SegmentManagement segmentManagement,
            Boolean isDefault) {
        super();
        this.credentialDetails = credentialDetails;
        this.name = name;
        this.type = type;
        this.isBigfile = isBigfile;
        this.dataFiles = dataFiles;
        this.fileCount = fileCount;
        this.fileSize = fileSize;
        this.isReusable = isReusable;
        this.isAutoExtensible = isAutoExtensible;
        this.autoExtendNextSize = autoExtendNextSize;
        this.autoExtendMaxSize = autoExtendMaxSize;
        this.isMaxSizeUnlimited = isMaxSizeUnlimited;
        this.blockSizeInKilobytes = blockSizeInKilobytes;
        this.isEncrypted = isEncrypted;
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.defaultCompress = defaultCompress;
        this.status = status;
        this.extentManagement = extentManagement;
        this.extentUniformSize = extentUniformSize;
        this.segmentManagement = segmentManagement;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private TablespaceAdminCredentialDetails credentialDetails;

        public Builder credentialDetails(TablespaceAdminCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }
        /** The name of the tablespace. It must be unique within a database. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the tablespace. It must be unique within a database.
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
        /**
         * Specifies whether the tablespace is a bigfile or smallfile tablespace. A bigfile
         * tablespace contains only one data file or temp file, which can contain up to
         * approximately 4 billion (232) blocks. A smallfile tablespace is a traditional Oracle
         * tablespace, which can contain 1022 data files or temp files, each of which can contain up
         * to approximately 4 million (222) blocks.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isBigfile")
        private Boolean isBigfile;

        /**
         * Specifies whether the tablespace is a bigfile or smallfile tablespace. A bigfile
         * tablespace contains only one data file or temp file, which can contain up to
         * approximately 4 billion (232) blocks. A smallfile tablespace is a traditional Oracle
         * tablespace, which can contain 1022 data files or temp files, each of which can contain up
         * to approximately 4 million (222) blocks.
         *
         * @param isBigfile the value to set
         * @return this builder
         */
        public Builder isBigfile(Boolean isBigfile) {
            this.isBigfile = isBigfile;
            this.__explicitlySet__.add("isBigfile");
            return this;
        }
        /** The list of data files or temp files created for the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataFiles")
        private java.util.List<String> dataFiles;

        /**
         * The list of data files or temp files created for the tablespace.
         *
         * @param dataFiles the value to set
         * @return this builder
         */
        public Builder dataFiles(java.util.List<String> dataFiles) {
            this.dataFiles = dataFiles;
            this.__explicitlySet__.add("dataFiles");
            return this;
        }
        /**
         * The number of data files or temp files created for the tablespace. This is for Oracle
         * Managed Files only.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fileCount")
        private Integer fileCount;

        /**
         * The number of data files or temp files created for the tablespace. This is for Oracle
         * Managed Files only.
         *
         * @param fileCount the value to set
         * @return this builder
         */
        public Builder fileCount(Integer fileCount) {
            this.fileCount = fileCount;
            this.__explicitlySet__.add("fileCount");
            return this;
        }
        /** The size of each data file or temp file. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSize")
        private TablespaceStorageSize fileSize;

        /**
         * The size of each data file or temp file.
         *
         * @param fileSize the value to set
         * @return this builder
         */
        public Builder fileSize(TablespaceStorageSize fileSize) {
            this.fileSize = fileSize;
            this.__explicitlySet__.add("fileSize");
            return this;
        }
        /**
         * Specifies whether Oracle can reuse the data file or temp file. Reuse is only allowed when
         * the file name is provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isReusable")
        private Boolean isReusable;

        /**
         * Specifies whether Oracle can reuse the data file or temp file. Reuse is only allowed when
         * the file name is provided.
         *
         * @param isReusable the value to set
         * @return this builder
         */
        public Builder isReusable(Boolean isReusable) {
            this.isReusable = isReusable;
            this.__explicitlySet__.add("isReusable");
            return this;
        }
        /** Specifies whether the data file or temp file can be extended automatically. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
        private Boolean isAutoExtensible;

        /**
         * Specifies whether the data file or temp file can be extended automatically.
         *
         * @param isAutoExtensible the value to set
         * @return this builder
         */
        public Builder isAutoExtensible(Boolean isAutoExtensible) {
            this.isAutoExtensible = isAutoExtensible;
            this.__explicitlySet__.add("isAutoExtensible");
            return this;
        }
        /**
         * The size of the next increment of disk space to be allocated automatically when more
         * extents are required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoExtendNextSize")
        private TablespaceStorageSize autoExtendNextSize;

        /**
         * The size of the next increment of disk space to be allocated automatically when more
         * extents are required.
         *
         * @param autoExtendNextSize the value to set
         * @return this builder
         */
        public Builder autoExtendNextSize(TablespaceStorageSize autoExtendNextSize) {
            this.autoExtendNextSize = autoExtendNextSize;
            this.__explicitlySet__.add("autoExtendNextSize");
            return this;
        }
        /**
         * The maximum disk space allowed for automatic extension of the data files or temp files.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoExtendMaxSize")
        private TablespaceStorageSize autoExtendMaxSize;

        /**
         * The maximum disk space allowed for automatic extension of the data files or temp files.
         *
         * @param autoExtendMaxSize the value to set
         * @return this builder
         */
        public Builder autoExtendMaxSize(TablespaceStorageSize autoExtendMaxSize) {
            this.autoExtendMaxSize = autoExtendMaxSize;
            this.__explicitlySet__.add("autoExtendMaxSize");
            return this;
        }
        /** Specifies whether the disk space of the data file or temp file can be limited. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMaxSizeUnlimited")
        private Boolean isMaxSizeUnlimited;

        /**
         * Specifies whether the disk space of the data file or temp file can be limited.
         *
         * @param isMaxSizeUnlimited the value to set
         * @return this builder
         */
        public Builder isMaxSizeUnlimited(Boolean isMaxSizeUnlimited) {
            this.isMaxSizeUnlimited = isMaxSizeUnlimited;
            this.__explicitlySet__.add("isMaxSizeUnlimited");
            return this;
        }
        /** Block size for the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockSizeInKilobytes")
        private Integer blockSizeInKilobytes;

        /**
         * Block size for the tablespace.
         *
         * @param blockSizeInKilobytes the value to set
         * @return this builder
         */
        public Builder blockSizeInKilobytes(Integer blockSizeInKilobytes) {
            this.blockSizeInKilobytes = blockSizeInKilobytes;
            this.__explicitlySet__.add("blockSizeInKilobytes");
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
        /** The name of the encryption algorithm to be used for tablespace encryption. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private String encryptionAlgorithm;

        /**
         * The name of the encryption algorithm to be used for tablespace encryption.
         *
         * @param encryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }
        /** The default compression of data for all tables created in the tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultCompress")
        private DefaultCompress defaultCompress;

        /**
         * The default compression of data for all tables created in the tablespace.
         *
         * @param defaultCompress the value to set
         * @return this builder
         */
        public Builder defaultCompress(DefaultCompress defaultCompress) {
            this.defaultCompress = defaultCompress;
            this.__explicitlySet__.add("defaultCompress");
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
        /** Specifies how the extents of the tablespace should be managed. */
        @com.fasterxml.jackson.annotation.JsonProperty("extentManagement")
        private ExtentManagement extentManagement;

        /**
         * Specifies how the extents of the tablespace should be managed.
         *
         * @param extentManagement the value to set
         * @return this builder
         */
        public Builder extentManagement(ExtentManagement extentManagement) {
            this.extentManagement = extentManagement;
            this.__explicitlySet__.add("extentManagement");
            return this;
        }
        /**
         * The size of the extent when the tablespace is managed with uniform extents of a specific
         * size.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extentUniformSize")
        private TablespaceStorageSize extentUniformSize;

        /**
         * The size of the extent when the tablespace is managed with uniform extents of a specific
         * size.
         *
         * @param extentUniformSize the value to set
         * @return this builder
         */
        public Builder extentUniformSize(TablespaceStorageSize extentUniformSize) {
            this.extentUniformSize = extentUniformSize;
            this.__explicitlySet__.add("extentUniformSize");
            return this;
        }
        /** Specifies whether tablespace segment management should be automatic or manual. */
        @com.fasterxml.jackson.annotation.JsonProperty("segmentManagement")
        private SegmentManagement segmentManagement;

        /**
         * Specifies whether tablespace segment management should be automatic or manual.
         *
         * @param segmentManagement the value to set
         * @return this builder
         */
        public Builder segmentManagement(SegmentManagement segmentManagement) {
            this.segmentManagement = segmentManagement;
            this.__explicitlySet__.add("segmentManagement");
            return this;
        }
        /** Specifies whether the tablespace is the default tablespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Specifies whether the tablespace is the default tablespace.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTablespaceDetails build() {
            CreateTablespaceDetails model =
                    new CreateTablespaceDetails(
                            this.credentialDetails,
                            this.name,
                            this.type,
                            this.isBigfile,
                            this.dataFiles,
                            this.fileCount,
                            this.fileSize,
                            this.isReusable,
                            this.isAutoExtensible,
                            this.autoExtendNextSize,
                            this.autoExtendMaxSize,
                            this.isMaxSizeUnlimited,
                            this.blockSizeInKilobytes,
                            this.isEncrypted,
                            this.encryptionAlgorithm,
                            this.defaultCompress,
                            this.status,
                            this.extentManagement,
                            this.extentUniformSize,
                            this.segmentManagement,
                            this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTablespaceDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isBigfile")) {
                this.isBigfile(model.getIsBigfile());
            }
            if (model.wasPropertyExplicitlySet("dataFiles")) {
                this.dataFiles(model.getDataFiles());
            }
            if (model.wasPropertyExplicitlySet("fileCount")) {
                this.fileCount(model.getFileCount());
            }
            if (model.wasPropertyExplicitlySet("fileSize")) {
                this.fileSize(model.getFileSize());
            }
            if (model.wasPropertyExplicitlySet("isReusable")) {
                this.isReusable(model.getIsReusable());
            }
            if (model.wasPropertyExplicitlySet("isAutoExtensible")) {
                this.isAutoExtensible(model.getIsAutoExtensible());
            }
            if (model.wasPropertyExplicitlySet("autoExtendNextSize")) {
                this.autoExtendNextSize(model.getAutoExtendNextSize());
            }
            if (model.wasPropertyExplicitlySet("autoExtendMaxSize")) {
                this.autoExtendMaxSize(model.getAutoExtendMaxSize());
            }
            if (model.wasPropertyExplicitlySet("isMaxSizeUnlimited")) {
                this.isMaxSizeUnlimited(model.getIsMaxSizeUnlimited());
            }
            if (model.wasPropertyExplicitlySet("blockSizeInKilobytes")) {
                this.blockSizeInKilobytes(model.getBlockSizeInKilobytes());
            }
            if (model.wasPropertyExplicitlySet("isEncrypted")) {
                this.isEncrypted(model.getIsEncrypted());
            }
            if (model.wasPropertyExplicitlySet("encryptionAlgorithm")) {
                this.encryptionAlgorithm(model.getEncryptionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("defaultCompress")) {
                this.defaultCompress(model.getDefaultCompress());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("extentManagement")) {
                this.extentManagement(model.getExtentManagement());
            }
            if (model.wasPropertyExplicitlySet("extentUniformSize")) {
                this.extentUniformSize(model.getExtentUniformSize());
            }
            if (model.wasPropertyExplicitlySet("segmentManagement")) {
                this.segmentManagement(model.getSegmentManagement());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
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

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final TablespaceAdminCredentialDetails credentialDetails;

    public TablespaceAdminCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /** The name of the tablespace. It must be unique within a database. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the tablespace. It must be unique within a database.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of tablespace. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
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

    /**
     * Specifies whether the tablespace is a bigfile or smallfile tablespace. A bigfile tablespace
     * contains only one data file or temp file, which can contain up to approximately 4 billion
     * (232) blocks. A smallfile tablespace is a traditional Oracle tablespace, which can contain
     * 1022 data files or temp files, each of which can contain up to approximately 4 million (222)
     * blocks.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isBigfile")
    private final Boolean isBigfile;

    /**
     * Specifies whether the tablespace is a bigfile or smallfile tablespace. A bigfile tablespace
     * contains only one data file or temp file, which can contain up to approximately 4 billion
     * (232) blocks. A smallfile tablespace is a traditional Oracle tablespace, which can contain
     * 1022 data files or temp files, each of which can contain up to approximately 4 million (222)
     * blocks.
     *
     * @return the value
     */
    public Boolean getIsBigfile() {
        return isBigfile;
    }

    /** The list of data files or temp files created for the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataFiles")
    private final java.util.List<String> dataFiles;

    /**
     * The list of data files or temp files created for the tablespace.
     *
     * @return the value
     */
    public java.util.List<String> getDataFiles() {
        return dataFiles;
    }

    /**
     * The number of data files or temp files created for the tablespace. This is for Oracle Managed
     * Files only.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileCount")
    private final Integer fileCount;

    /**
     * The number of data files or temp files created for the tablespace. This is for Oracle Managed
     * Files only.
     *
     * @return the value
     */
    public Integer getFileCount() {
        return fileCount;
    }

    /** The size of each data file or temp file. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSize")
    private final TablespaceStorageSize fileSize;

    /**
     * The size of each data file or temp file.
     *
     * @return the value
     */
    public TablespaceStorageSize getFileSize() {
        return fileSize;
    }

    /**
     * Specifies whether Oracle can reuse the data file or temp file. Reuse is only allowed when the
     * file name is provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isReusable")
    private final Boolean isReusable;

    /**
     * Specifies whether Oracle can reuse the data file or temp file. Reuse is only allowed when the
     * file name is provided.
     *
     * @return the value
     */
    public Boolean getIsReusable() {
        return isReusable;
    }

    /** Specifies whether the data file or temp file can be extended automatically. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
    private final Boolean isAutoExtensible;

    /**
     * Specifies whether the data file or temp file can be extended automatically.
     *
     * @return the value
     */
    public Boolean getIsAutoExtensible() {
        return isAutoExtensible;
    }

    /**
     * The size of the next increment of disk space to be allocated automatically when more extents
     * are required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoExtendNextSize")
    private final TablespaceStorageSize autoExtendNextSize;

    /**
     * The size of the next increment of disk space to be allocated automatically when more extents
     * are required.
     *
     * @return the value
     */
    public TablespaceStorageSize getAutoExtendNextSize() {
        return autoExtendNextSize;
    }

    /** The maximum disk space allowed for automatic extension of the data files or temp files. */
    @com.fasterxml.jackson.annotation.JsonProperty("autoExtendMaxSize")
    private final TablespaceStorageSize autoExtendMaxSize;

    /**
     * The maximum disk space allowed for automatic extension of the data files or temp files.
     *
     * @return the value
     */
    public TablespaceStorageSize getAutoExtendMaxSize() {
        return autoExtendMaxSize;
    }

    /** Specifies whether the disk space of the data file or temp file can be limited. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMaxSizeUnlimited")
    private final Boolean isMaxSizeUnlimited;

    /**
     * Specifies whether the disk space of the data file or temp file can be limited.
     *
     * @return the value
     */
    public Boolean getIsMaxSizeUnlimited() {
        return isMaxSizeUnlimited;
    }

    /** Block size for the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockSizeInKilobytes")
    private final Integer blockSizeInKilobytes;

    /**
     * Block size for the tablespace.
     *
     * @return the value
     */
    public Integer getBlockSizeInKilobytes() {
        return blockSizeInKilobytes;
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

    /** The name of the encryption algorithm to be used for tablespace encryption. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    private final String encryptionAlgorithm;

    /**
     * The name of the encryption algorithm to be used for tablespace encryption.
     *
     * @return the value
     */
    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /** The default compression of data for all tables created in the tablespace. */
    public enum DefaultCompress implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** The default compression of data for all tables created in the tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCompress")
    private final DefaultCompress defaultCompress;

    /**
     * The default compression of data for all tables created in the tablespace.
     *
     * @return the value
     */
    public DefaultCompress getDefaultCompress() {
        return defaultCompress;
    }

    /** The status of the tablespace. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
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

    /** Specifies how the extents of the tablespace should be managed. */
    public enum ExtentManagement implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** Specifies how the extents of the tablespace should be managed. */
    @com.fasterxml.jackson.annotation.JsonProperty("extentManagement")
    private final ExtentManagement extentManagement;

    /**
     * Specifies how the extents of the tablespace should be managed.
     *
     * @return the value
     */
    public ExtentManagement getExtentManagement() {
        return extentManagement;
    }

    /**
     * The size of the extent when the tablespace is managed with uniform extents of a specific
     * size.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extentUniformSize")
    private final TablespaceStorageSize extentUniformSize;

    /**
     * The size of the extent when the tablespace is managed with uniform extents of a specific
     * size.
     *
     * @return the value
     */
    public TablespaceStorageSize getExtentUniformSize() {
        return extentUniformSize;
    }

    /** Specifies whether tablespace segment management should be automatic or manual. */
    public enum SegmentManagement implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** Specifies whether tablespace segment management should be automatic or manual. */
    @com.fasterxml.jackson.annotation.JsonProperty("segmentManagement")
    private final SegmentManagement segmentManagement;

    /**
     * Specifies whether tablespace segment management should be automatic or manual.
     *
     * @return the value
     */
    public SegmentManagement getSegmentManagement() {
        return segmentManagement;
    }

    /** Specifies whether the tablespace is the default tablespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Specifies whether the tablespace is the default tablespace.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
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
        sb.append("CreateTablespaceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isBigfile=").append(String.valueOf(this.isBigfile));
        sb.append(", dataFiles=").append(String.valueOf(this.dataFiles));
        sb.append(", fileCount=").append(String.valueOf(this.fileCount));
        sb.append(", fileSize=").append(String.valueOf(this.fileSize));
        sb.append(", isReusable=").append(String.valueOf(this.isReusable));
        sb.append(", isAutoExtensible=").append(String.valueOf(this.isAutoExtensible));
        sb.append(", autoExtendNextSize=").append(String.valueOf(this.autoExtendNextSize));
        sb.append(", autoExtendMaxSize=").append(String.valueOf(this.autoExtendMaxSize));
        sb.append(", isMaxSizeUnlimited=").append(String.valueOf(this.isMaxSizeUnlimited));
        sb.append(", blockSizeInKilobytes=").append(String.valueOf(this.blockSizeInKilobytes));
        sb.append(", isEncrypted=").append(String.valueOf(this.isEncrypted));
        sb.append(", encryptionAlgorithm=").append(String.valueOf(this.encryptionAlgorithm));
        sb.append(", defaultCompress=").append(String.valueOf(this.defaultCompress));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", extentManagement=").append(String.valueOf(this.extentManagement));
        sb.append(", extentUniformSize=").append(String.valueOf(this.extentUniformSize));
        sb.append(", segmentManagement=").append(String.valueOf(this.segmentManagement));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTablespaceDetails)) {
            return false;
        }

        CreateTablespaceDetails other = (CreateTablespaceDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isBigfile, other.isBigfile)
                && java.util.Objects.equals(this.dataFiles, other.dataFiles)
                && java.util.Objects.equals(this.fileCount, other.fileCount)
                && java.util.Objects.equals(this.fileSize, other.fileSize)
                && java.util.Objects.equals(this.isReusable, other.isReusable)
                && java.util.Objects.equals(this.isAutoExtensible, other.isAutoExtensible)
                && java.util.Objects.equals(this.autoExtendNextSize, other.autoExtendNextSize)
                && java.util.Objects.equals(this.autoExtendMaxSize, other.autoExtendMaxSize)
                && java.util.Objects.equals(this.isMaxSizeUnlimited, other.isMaxSizeUnlimited)
                && java.util.Objects.equals(this.blockSizeInKilobytes, other.blockSizeInKilobytes)
                && java.util.Objects.equals(this.isEncrypted, other.isEncrypted)
                && java.util.Objects.equals(this.encryptionAlgorithm, other.encryptionAlgorithm)
                && java.util.Objects.equals(this.defaultCompress, other.defaultCompress)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.extentManagement, other.extentManagement)
                && java.util.Objects.equals(this.extentUniformSize, other.extentUniformSize)
                && java.util.Objects.equals(this.segmentManagement, other.segmentManagement)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isBigfile == null ? 43 : this.isBigfile.hashCode());
        result = (result * PRIME) + (this.dataFiles == null ? 43 : this.dataFiles.hashCode());
        result = (result * PRIME) + (this.fileCount == null ? 43 : this.fileCount.hashCode());
        result = (result * PRIME) + (this.fileSize == null ? 43 : this.fileSize.hashCode());
        result = (result * PRIME) + (this.isReusable == null ? 43 : this.isReusable.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoExtensible == null ? 43 : this.isAutoExtensible.hashCode());
        result =
                (result * PRIME)
                        + (this.autoExtendNextSize == null
                                ? 43
                                : this.autoExtendNextSize.hashCode());
        result =
                (result * PRIME)
                        + (this.autoExtendMaxSize == null ? 43 : this.autoExtendMaxSize.hashCode());
        result =
                (result * PRIME)
                        + (this.isMaxSizeUnlimited == null
                                ? 43
                                : this.isMaxSizeUnlimited.hashCode());
        result =
                (result * PRIME)
                        + (this.blockSizeInKilobytes == null
                                ? 43
                                : this.blockSizeInKilobytes.hashCode());
        result = (result * PRIME) + (this.isEncrypted == null ? 43 : this.isEncrypted.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionAlgorithm == null
                                ? 43
                                : this.encryptionAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultCompress == null ? 43 : this.defaultCompress.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.extentManagement == null ? 43 : this.extentManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.extentUniformSize == null ? 43 : this.extentUniformSize.hashCode());
        result =
                (result * PRIME)
                        + (this.segmentManagement == null ? 43 : this.segmentManagement.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
