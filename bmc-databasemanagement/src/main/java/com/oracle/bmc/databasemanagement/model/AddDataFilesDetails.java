/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to add data files or temp files to the tablespace.
 *
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
    builder = AddDataFilesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AddDataFilesDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("fileType")
        private FileType fileType;

        public Builder fileType(FileType fileType) {
            this.fileType = fileType;
            this.__explicitlySet__.add("fileType");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddDataFilesDetails build() {
            AddDataFilesDetails __instance__ =
                    new AddDataFilesDetails(
                            credentialDetails,
                            fileType,
                            dataFiles,
                            fileCount,
                            fileSize,
                            isReusable,
                            isAutoExtensible,
                            autoExtendNextSize,
                            autoExtendMaxSize,
                            isMaxSizeUnlimited);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddDataFilesDetails o) {
            Builder copiedBuilder =
                    credentialDetails(o.getCredentialDetails())
                            .fileType(o.getFileType())
                            .dataFiles(o.getDataFiles())
                            .fileCount(o.getFileCount())
                            .fileSize(o.getFileSize())
                            .isReusable(o.getIsReusable())
                            .isAutoExtensible(o.getIsAutoExtensible())
                            .autoExtendNextSize(o.getAutoExtendNextSize())
                            .autoExtendMaxSize(o.getAutoExtendMaxSize())
                            .isMaxSizeUnlimited(o.getIsMaxSizeUnlimited());

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
     * Specifies whether the file is a data file or temp file.
     *
     **/
    public enum FileType {
        Datafile("DATAFILE"),
        Tempfile("TEMPFILE"),
        ;

        private final String value;
        private static java.util.Map<String, FileType> map;

        static {
            map = new java.util.HashMap<>();
            for (FileType v : FileType.values()) {
                map.put(v.getValue(), v);
            }
        }

        FileType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FileType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FileType: " + key);
        }
    };
    /**
     * Specifies whether the file is a data file or temp file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileType")
    FileType fileType;

    /**
     * The list of data files or temp files added to the tablespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataFiles")
    java.util.List<String> dataFiles;

    /**
     * The number of data files or temp files to be added for the tablespace. This is for Oracle Managed Files only.
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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
