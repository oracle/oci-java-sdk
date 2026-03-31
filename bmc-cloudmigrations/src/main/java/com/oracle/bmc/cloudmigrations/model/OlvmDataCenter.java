/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * An OLVM Data Center. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmDataCenter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmDataCenter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "comment",
        "description",
        "id",
        "name",
        "isLocal",
        "quotaModeType",
        "dataCenterStatus",
        "storageFormat",
        "supportedVersions",
        "version"
    })
    public OlvmDataCenter(
            String comment,
            String description,
            String id,
            String name,
            Boolean isLocal,
            QuotaModeType quotaModeType,
            DataCenterStatus dataCenterStatus,
            StorageFormat storageFormat,
            java.util.List<OlvmVersion> supportedVersions,
            OlvmVersion version) {
        super();
        this.comment = comment;
        this.description = description;
        this.id = id;
        this.name = name;
        this.isLocal = isLocal;
        this.quotaModeType = quotaModeType;
        this.dataCenterStatus = dataCenterStatus;
        this.storageFormat = storageFormat;
        this.supportedVersions = supportedVersions;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Free text containing comments about this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Free text containing comments about this object.
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /** A human-readable description in plain text. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A human-readable description in plain text.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A human-readable name in plain text. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A human-readable name in plain text.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Whether the data center is local. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLocal")
        private Boolean isLocal;

        /**
         * Whether the data center is local.
         *
         * @param isLocal the value to set
         * @return this builder
         */
        public Builder isLocal(Boolean isLocal) {
            this.isLocal = isLocal;
            this.__explicitlySet__.add("isLocal");
            return this;
        }
        /** The type of quota mode */
        @com.fasterxml.jackson.annotation.JsonProperty("quotaModeType")
        private QuotaModeType quotaModeType;

        /**
         * The type of quota mode
         *
         * @param quotaModeType the value to set
         * @return this builder
         */
        public Builder quotaModeType(QuotaModeType quotaModeType) {
            this.quotaModeType = quotaModeType;
            this.__explicitlySet__.add("quotaModeType");
            return this;
        }
        /** The status of data center */
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenterStatus")
        private DataCenterStatus dataCenterStatus;

        /**
         * The status of data center
         *
         * @param dataCenterStatus the value to set
         * @return this builder
         */
        public Builder dataCenterStatus(DataCenterStatus dataCenterStatus) {
            this.dataCenterStatus = dataCenterStatus;
            this.__explicitlySet__.add("dataCenterStatus");
            return this;
        }
        /** Type which represents a format of storage domain */
        @com.fasterxml.jackson.annotation.JsonProperty("storageFormat")
        private StorageFormat storageFormat;

        /**
         * Type which represents a format of storage domain
         *
         * @param storageFormat the value to set
         * @return this builder
         */
        public Builder storageFormat(StorageFormat storageFormat) {
            this.storageFormat = storageFormat;
            this.__explicitlySet__.add("storageFormat");
            return this;
        }
        /** List of supported versions. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedVersions")
        private java.util.List<OlvmVersion> supportedVersions;

        /**
         * List of supported versions.
         *
         * @param supportedVersions the value to set
         * @return this builder
         */
        public Builder supportedVersions(java.util.List<OlvmVersion> supportedVersions) {
            this.supportedVersions = supportedVersions;
            this.__explicitlySet__.add("supportedVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private OlvmVersion version;

        public Builder version(OlvmVersion version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmDataCenter build() {
            OlvmDataCenter model =
                    new OlvmDataCenter(
                            this.comment,
                            this.description,
                            this.id,
                            this.name,
                            this.isLocal,
                            this.quotaModeType,
                            this.dataCenterStatus,
                            this.storageFormat,
                            this.supportedVersions,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmDataCenter model) {
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isLocal")) {
                this.isLocal(model.getIsLocal());
            }
            if (model.wasPropertyExplicitlySet("quotaModeType")) {
                this.quotaModeType(model.getQuotaModeType());
            }
            if (model.wasPropertyExplicitlySet("dataCenterStatus")) {
                this.dataCenterStatus(model.getDataCenterStatus());
            }
            if (model.wasPropertyExplicitlySet("storageFormat")) {
                this.storageFormat(model.getStorageFormat());
            }
            if (model.wasPropertyExplicitlySet("supportedVersions")) {
                this.supportedVersions(model.getSupportedVersions());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** Free text containing comments about this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Free text containing comments about this object.
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    /** A human-readable description in plain text. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A human-readable description in plain text.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** A unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A human-readable name in plain text. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A human-readable name in plain text.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Whether the data center is local. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLocal")
    private final Boolean isLocal;

    /**
     * Whether the data center is local.
     *
     * @return the value
     */
    public Boolean getIsLocal() {
        return isLocal;
    }

    /** The type of quota mode */
    public enum QuotaModeType implements com.oracle.bmc.http.internal.BmcEnum {
        Audit("AUDIT"),
        Disabled("DISABLED"),
        Enabled("ENABLED"),
        ;

        private final String value;
        private static java.util.Map<String, QuotaModeType> map;

        static {
            map = new java.util.HashMap<>();
            for (QuotaModeType v : QuotaModeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        QuotaModeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static QuotaModeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid QuotaModeType: " + key);
        }
    };
    /** The type of quota mode */
    @com.fasterxml.jackson.annotation.JsonProperty("quotaModeType")
    private final QuotaModeType quotaModeType;

    /**
     * The type of quota mode
     *
     * @return the value
     */
    public QuotaModeType getQuotaModeType() {
        return quotaModeType;
    }

    /** The status of data center */
    public enum DataCenterStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Contend("CONTEND"),
        Maintenance("MAINTENANCE"),
        NotOperational("NOT_OPERATIONAL"),
        Problematic("PROBLEMATIC"),
        Uninitialized("UNINITIALIZED"),
        Up("UP"),
        ;

        private final String value;
        private static java.util.Map<String, DataCenterStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DataCenterStatus v : DataCenterStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        DataCenterStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataCenterStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DataCenterStatus: " + key);
        }
    };
    /** The status of data center */
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenterStatus")
    private final DataCenterStatus dataCenterStatus;

    /**
     * The status of data center
     *
     * @return the value
     */
    public DataCenterStatus getDataCenterStatus() {
        return dataCenterStatus;
    }

    /** Type which represents a format of storage domain */
    public enum StorageFormat implements com.oracle.bmc.http.internal.BmcEnum {
        V1("V1"),
        V2("V2"),
        V3("V3"),
        V4("V4"),
        V5("V5"),
        ;

        private final String value;
        private static java.util.Map<String, StorageFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageFormat v : StorageFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StorageFormat: " + key);
        }
    };
    /** Type which represents a format of storage domain */
    @com.fasterxml.jackson.annotation.JsonProperty("storageFormat")
    private final StorageFormat storageFormat;

    /**
     * Type which represents a format of storage domain
     *
     * @return the value
     */
    public StorageFormat getStorageFormat() {
        return storageFormat;
    }

    /** List of supported versions. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedVersions")
    private final java.util.List<OlvmVersion> supportedVersions;

    /**
     * List of supported versions.
     *
     * @return the value
     */
    public java.util.List<OlvmVersion> getSupportedVersions() {
        return supportedVersions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final OlvmVersion version;

    public OlvmVersion getVersion() {
        return version;
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
        sb.append("OlvmDataCenter(");
        sb.append("super=").append(super.toString());
        sb.append("comment=").append(String.valueOf(this.comment));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isLocal=").append(String.valueOf(this.isLocal));
        sb.append(", quotaModeType=").append(String.valueOf(this.quotaModeType));
        sb.append(", dataCenterStatus=").append(String.valueOf(this.dataCenterStatus));
        sb.append(", storageFormat=").append(String.valueOf(this.storageFormat));
        sb.append(", supportedVersions=").append(String.valueOf(this.supportedVersions));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmDataCenter)) {
            return false;
        }

        OlvmDataCenter other = (OlvmDataCenter) o;
        return java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isLocal, other.isLocal)
                && java.util.Objects.equals(this.quotaModeType, other.quotaModeType)
                && java.util.Objects.equals(this.dataCenterStatus, other.dataCenterStatus)
                && java.util.Objects.equals(this.storageFormat, other.storageFormat)
                && java.util.Objects.equals(this.supportedVersions, other.supportedVersions)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isLocal == null ? 43 : this.isLocal.hashCode());
        result =
                (result * PRIME)
                        + (this.quotaModeType == null ? 43 : this.quotaModeType.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCenterStatus == null ? 43 : this.dataCenterStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.storageFormat == null ? 43 : this.storageFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedVersions == null ? 43 : this.supportedVersions.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
