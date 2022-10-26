/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to resize a data file or temp file within the tablespace. <br>
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
        builder = ResizeDataFileDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ResizeDataFileDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "fileType",
        "dataFile",
        "fileSize",
        "isAutoExtensible",
        "autoExtendNextSize",
        "autoExtendMaxSize",
        "isMaxSizeUnlimited"
    })
    public ResizeDataFileDetails(
            TablespaceAdminCredentialDetails credentialDetails,
            FileType fileType,
            String dataFile,
            TablespaceStorageSize fileSize,
            Boolean isAutoExtensible,
            TablespaceStorageSize autoExtendNextSize,
            TablespaceStorageSize autoExtendMaxSize,
            Boolean isMaxSizeUnlimited) {
        super();
        this.credentialDetails = credentialDetails;
        this.fileType = fileType;
        this.dataFile = dataFile;
        this.fileSize = fileSize;
        this.isAutoExtensible = isAutoExtensible;
        this.autoExtendNextSize = autoExtendNextSize;
        this.autoExtendMaxSize = autoExtendMaxSize;
        this.isMaxSizeUnlimited = isMaxSizeUnlimited;
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
        /** Specifies whether the file is a data file or temp file. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileType")
        private FileType fileType;

        /**
         * Specifies whether the file is a data file or temp file.
         *
         * @param fileType the value to set
         * @return this builder
         */
        public Builder fileType(FileType fileType) {
            this.fileType = fileType;
            this.__explicitlySet__.add("fileType");
            return this;
        }
        /** Name of the data file or temp file to be resized. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataFile")
        private String dataFile;

        /**
         * Name of the data file or temp file to be resized.
         *
         * @param dataFile the value to set
         * @return this builder
         */
        public Builder dataFile(String dataFile) {
            this.dataFile = dataFile;
            this.__explicitlySet__.add("dataFile");
            return this;
        }
        /** The new size of the data file or temp file. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSize")
        private TablespaceStorageSize fileSize;

        /**
         * The new size of the data file or temp file.
         *
         * @param fileSize the value to set
         * @return this builder
         */
        public Builder fileSize(TablespaceStorageSize fileSize) {
            this.fileSize = fileSize;
            this.__explicitlySet__.add("fileSize");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResizeDataFileDetails build() {
            ResizeDataFileDetails model =
                    new ResizeDataFileDetails(
                            this.credentialDetails,
                            this.fileType,
                            this.dataFile,
                            this.fileSize,
                            this.isAutoExtensible,
                            this.autoExtendNextSize,
                            this.autoExtendMaxSize,
                            this.isMaxSizeUnlimited);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResizeDataFileDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("fileType")) {
                this.fileType(model.getFileType());
            }
            if (model.wasPropertyExplicitlySet("dataFile")) {
                this.dataFile(model.getDataFile());
            }
            if (model.wasPropertyExplicitlySet("fileSize")) {
                this.fileSize(model.getFileSize());
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

    /** Specifies whether the file is a data file or temp file. */
    public enum FileType implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** Specifies whether the file is a data file or temp file. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileType")
    private final FileType fileType;

    /**
     * Specifies whether the file is a data file or temp file.
     *
     * @return the value
     */
    public FileType getFileType() {
        return fileType;
    }

    /** Name of the data file or temp file to be resized. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataFile")
    private final String dataFile;

    /**
     * Name of the data file or temp file to be resized.
     *
     * @return the value
     */
    public String getDataFile() {
        return dataFile;
    }

    /** The new size of the data file or temp file. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSize")
    private final TablespaceStorageSize fileSize;

    /**
     * The new size of the data file or temp file.
     *
     * @return the value
     */
    public TablespaceStorageSize getFileSize() {
        return fileSize;
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
        sb.append("ResizeDataFileDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", fileType=").append(String.valueOf(this.fileType));
        sb.append(", dataFile=").append(String.valueOf(this.dataFile));
        sb.append(", fileSize=").append(String.valueOf(this.fileSize));
        sb.append(", isAutoExtensible=").append(String.valueOf(this.isAutoExtensible));
        sb.append(", autoExtendNextSize=").append(String.valueOf(this.autoExtendNextSize));
        sb.append(", autoExtendMaxSize=").append(String.valueOf(this.autoExtendMaxSize));
        sb.append(", isMaxSizeUnlimited=").append(String.valueOf(this.isMaxSizeUnlimited));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResizeDataFileDetails)) {
            return false;
        }

        ResizeDataFileDetails other = (ResizeDataFileDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.fileType, other.fileType)
                && java.util.Objects.equals(this.dataFile, other.dataFile)
                && java.util.Objects.equals(this.fileSize, other.fileSize)
                && java.util.Objects.equals(this.isAutoExtensible, other.isAutoExtensible)
                && java.util.Objects.equals(this.autoExtendNextSize, other.autoExtendNextSize)
                && java.util.Objects.equals(this.autoExtendMaxSize, other.autoExtendMaxSize)
                && java.util.Objects.equals(this.isMaxSizeUnlimited, other.isMaxSizeUnlimited)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result = (result * PRIME) + (this.fileType == null ? 43 : this.fileType.hashCode());
        result = (result * PRIME) + (this.dataFile == null ? 43 : this.dataFile.hashCode());
        result = (result * PRIME) + (this.fileSize == null ? 43 : this.fileSize.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
