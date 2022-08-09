/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to update a tablespace.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateTablespaceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTablespaceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "name",
        "type",
        "fileSize",
        "status",
        "isAutoExtensible",
        "autoExtendNextSize",
        "autoExtendMaxSize",
        "isMaxSizeUnlimited",
        "isDefault"
    })
    public UpdateTablespaceDetails(
            TablespaceAdminCredentialDetails credentialDetails,
            String name,
            Type type,
            TablespaceStorageSize fileSize,
            Status status,
            Boolean isAutoExtensible,
            TablespaceStorageSize autoExtendNextSize,
            TablespaceStorageSize autoExtendMaxSize,
            Boolean isMaxSizeUnlimited,
            Boolean isDefault) {
        super();
        this.credentialDetails = credentialDetails;
        this.name = name;
        this.type = type;
        this.fileSize = fileSize;
        this.status = status;
        this.isAutoExtensible = isAutoExtensible;
        this.autoExtendNextSize = autoExtendNextSize;
        this.autoExtendMaxSize = autoExtendMaxSize;
        this.isMaxSizeUnlimited = isMaxSizeUnlimited;
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
        /**
         * The name of the tablespace. It must be unique within a database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the tablespace. It must be unique within a database.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The type of tablespace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of tablespace.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The size of each data file or temp file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSize")
        private TablespaceStorageSize fileSize;

        /**
         * The size of each data file or temp file.
         *
         * @param fileSize the value to set
         * @return this builder
         **/
        public Builder fileSize(TablespaceStorageSize fileSize) {
            this.fileSize = fileSize;
            this.__explicitlySet__.add("fileSize");
            return this;
        }
        /**
         * The status of the tablespace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the tablespace.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Specifies whether the data file or temp file can be extended automatically.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
        private Boolean isAutoExtensible;

        /**
         * Specifies whether the data file or temp file can be extended automatically.
         *
         * @param isAutoExtensible the value to set
         * @return this builder
         **/
        public Builder isAutoExtensible(Boolean isAutoExtensible) {
            this.isAutoExtensible = isAutoExtensible;
            this.__explicitlySet__.add("isAutoExtensible");
            return this;
        }
        /**
         * The size of the next increment of disk space to be allocated automatically when more extents are required.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoExtendNextSize")
        private TablespaceStorageSize autoExtendNextSize;

        /**
         * The size of the next increment of disk space to be allocated automatically when more extents are required.
         *
         * @param autoExtendNextSize the value to set
         * @return this builder
         **/
        public Builder autoExtendNextSize(TablespaceStorageSize autoExtendNextSize) {
            this.autoExtendNextSize = autoExtendNextSize;
            this.__explicitlySet__.add("autoExtendNextSize");
            return this;
        }
        /**
         * The maximum disk space allowed for automatic extension of the data files or temp files.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoExtendMaxSize")
        private TablespaceStorageSize autoExtendMaxSize;

        /**
         * The maximum disk space allowed for automatic extension of the data files or temp files.
         *
         * @param autoExtendMaxSize the value to set
         * @return this builder
         **/
        public Builder autoExtendMaxSize(TablespaceStorageSize autoExtendMaxSize) {
            this.autoExtendMaxSize = autoExtendMaxSize;
            this.__explicitlySet__.add("autoExtendMaxSize");
            return this;
        }
        /**
         * Specifies whether the disk space of the data file or temp file can be limited.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMaxSizeUnlimited")
        private Boolean isMaxSizeUnlimited;

        /**
         * Specifies whether the disk space of the data file or temp file can be limited.
         *
         * @param isMaxSizeUnlimited the value to set
         * @return this builder
         **/
        public Builder isMaxSizeUnlimited(Boolean isMaxSizeUnlimited) {
            this.isMaxSizeUnlimited = isMaxSizeUnlimited;
            this.__explicitlySet__.add("isMaxSizeUnlimited");
            return this;
        }
        /**
         * Specifies whether the tablespace is the default tablespace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Specifies whether the tablespace is the default tablespace.
         *
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTablespaceDetails build() {
            UpdateTablespaceDetails model =
                    new UpdateTablespaceDetails(
                            this.credentialDetails,
                            this.name,
                            this.type,
                            this.fileSize,
                            this.status,
                            this.isAutoExtensible,
                            this.autoExtendNextSize,
                            this.autoExtendMaxSize,
                            this.isMaxSizeUnlimited,
                            this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTablespaceDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("fileSize")) {
                this.fileSize(model.getFileSize());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            return this;
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

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final TablespaceAdminCredentialDetails credentialDetails;

    public TablespaceAdminCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /**
     * The name of the tablespace. It must be unique within a database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the tablespace. It must be unique within a database.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

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
    private final Type type;

    /**
     * The type of tablespace.
     *
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The size of each data file or temp file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSize")
    private final TablespaceStorageSize fileSize;

    /**
     * The size of each data file or temp file.
     *
     * @return the value
     **/
    public TablespaceStorageSize getFileSize() {
        return fileSize;
    }

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
    private final Status status;

    /**
     * The status of the tablespace.
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Specifies whether the data file or temp file can be extended automatically.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
    private final Boolean isAutoExtensible;

    /**
     * Specifies whether the data file or temp file can be extended automatically.
     *
     * @return the value
     **/
    public Boolean getIsAutoExtensible() {
        return isAutoExtensible;
    }

    /**
     * The size of the next increment of disk space to be allocated automatically when more extents are required.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoExtendNextSize")
    private final TablespaceStorageSize autoExtendNextSize;

    /**
     * The size of the next increment of disk space to be allocated automatically when more extents are required.
     *
     * @return the value
     **/
    public TablespaceStorageSize getAutoExtendNextSize() {
        return autoExtendNextSize;
    }

    /**
     * The maximum disk space allowed for automatic extension of the data files or temp files.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoExtendMaxSize")
    private final TablespaceStorageSize autoExtendMaxSize;

    /**
     * The maximum disk space allowed for automatic extension of the data files or temp files.
     *
     * @return the value
     **/
    public TablespaceStorageSize getAutoExtendMaxSize() {
        return autoExtendMaxSize;
    }

    /**
     * Specifies whether the disk space of the data file or temp file can be limited.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMaxSizeUnlimited")
    private final Boolean isMaxSizeUnlimited;

    /**
     * Specifies whether the disk space of the data file or temp file can be limited.
     *
     * @return the value
     **/
    public Boolean getIsMaxSizeUnlimited() {
        return isMaxSizeUnlimited;
    }

    /**
     * Specifies whether the tablespace is the default tablespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Specifies whether the tablespace is the default tablespace.
     *
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
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
        sb.append("UpdateTablespaceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", fileSize=").append(String.valueOf(this.fileSize));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", isAutoExtensible=").append(String.valueOf(this.isAutoExtensible));
        sb.append(", autoExtendNextSize=").append(String.valueOf(this.autoExtendNextSize));
        sb.append(", autoExtendMaxSize=").append(String.valueOf(this.autoExtendMaxSize));
        sb.append(", isMaxSizeUnlimited=").append(String.valueOf(this.isMaxSizeUnlimited));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTablespaceDetails)) {
            return false;
        }

        UpdateTablespaceDetails other = (UpdateTablespaceDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.fileSize, other.fileSize)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.isAutoExtensible, other.isAutoExtensible)
                && java.util.Objects.equals(this.autoExtendNextSize, other.autoExtendNextSize)
                && java.util.Objects.equals(this.autoExtendMaxSize, other.autoExtendMaxSize)
                && java.util.Objects.equals(this.isMaxSizeUnlimited, other.isMaxSizeUnlimited)
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
        result = (result * PRIME) + (this.fileSize == null ? 43 : this.fileSize.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
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
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
