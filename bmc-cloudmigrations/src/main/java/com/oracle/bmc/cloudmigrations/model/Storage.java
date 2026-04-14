/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Host storage information <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Storage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Storage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    public Storage(
            String id,
            String address,
            String comment,
            String storageDescription,
            java.util.List<OlvmProperty> driverOptions,
            java.util.List<OlvmProperty> driverSensitiveOptions,
            java.util.List<LogicalUnit> logicalUnits,
            String mountOptions,
            Integer nfsRetrans,
            Integer nfsTimeo,
            NfsVersion nfsVersion,
            Boolean isOverrideLuns,
            String password,
            Integer paths,
            Integer port,
            String portal,
            String target,
            String username,
            Type type,
            String vfsType,
            VolumeGroup volumeGroup) {
        super();
        this.id = id;
        this.address = address;
        this.comment = comment;
        this.storageDescription = storageDescription;
        this.driverOptions = driverOptions;
        this.driverSensitiveOptions = driverSensitiveOptions;
        this.logicalUnits = logicalUnits;
        this.mountOptions = mountOptions;
        this.nfsRetrans = nfsRetrans;
        this.nfsTimeo = nfsTimeo;
        this.nfsVersion = nfsVersion;
        this.isOverrideLuns = isOverrideLuns;
        this.password = password != null ? password.toCharArray() : null;
        this.paths = paths;
        this.port = port;
        this.portal = portal;
        this.target = target;
        this.username = username;
        this.type = type;
        this.vfsType = vfsType;
        this.volumeGroup = volumeGroup;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "address",
        "comment",
        "storageDescription",
        "driverOptions",
        "driverSensitiveOptions",
        "logicalUnits",
        "mountOptions",
        "nfsRetrans",
        "nfsTimeo",
        "nfsVersion",
        "isOverrideLuns",
        "password",
        "paths",
        "port",
        "portal",
        "target",
        "username",
        "type",
        "vfsType",
        "volumeGroup"
    })
    public Storage(
            String id,
            String address,
            String comment,
            String storageDescription,
            java.util.List<OlvmProperty> driverOptions,
            java.util.List<OlvmProperty> driverSensitiveOptions,
            java.util.List<LogicalUnit> logicalUnits,
            String mountOptions,
            Integer nfsRetrans,
            Integer nfsTimeo,
            NfsVersion nfsVersion,
            Boolean isOverrideLuns,
            char[] password,
            Integer paths,
            Integer port,
            String portal,
            String target,
            String username,
            Type type,
            String vfsType,
            VolumeGroup volumeGroup) {
        super();
        this.id = id;
        this.address = address;
        this.comment = comment;
        this.storageDescription = storageDescription;
        this.driverOptions = driverOptions;
        this.driverSensitiveOptions = driverSensitiveOptions;
        this.logicalUnits = logicalUnits;
        this.mountOptions = mountOptions;
        this.nfsRetrans = nfsRetrans;
        this.nfsTimeo = nfsTimeo;
        this.nfsVersion = nfsVersion;
        this.isOverrideLuns = isOverrideLuns;
        this.password = password;
        this.paths = paths;
        this.port = port;
        this.portal = portal;
        this.target = target;
        this.username = username;
        this.type = type;
        this.vfsType = vfsType;
        this.volumeGroup = volumeGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Address of storage domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * Address of storage domain.
         *
         * @param address the value to set
         * @return this builder
         */
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
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
        @com.fasterxml.jackson.annotation.JsonProperty("storageDescription")
        private String storageDescription;

        /**
         * A human-readable description in plain text.
         *
         * @param storageDescription the value to set
         * @return this builder
         */
        public Builder storageDescription(String storageDescription) {
            this.storageDescription = storageDescription;
            this.__explicitlySet__.add("storageDescription");
            return this;
        }
        /** The options to be passed when creating a storage domain using a cinder driver. */
        @com.fasterxml.jackson.annotation.JsonProperty("driverOptions")
        private java.util.List<OlvmProperty> driverOptions;

        /**
         * The options to be passed when creating a storage domain using a cinder driver.
         *
         * @param driverOptions the value to set
         * @return this builder
         */
        public Builder driverOptions(java.util.List<OlvmProperty> driverOptions) {
            this.driverOptions = driverOptions;
            this.__explicitlySet__.add("driverOptions");
            return this;
        }
        /**
         * The options containing sensitive information to be passed when creating a storage domain
         * using a cinder driver.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("driverSensitiveOptions")
        private java.util.List<OlvmProperty> driverSensitiveOptions;

        /**
         * The options containing sensitive information to be passed when creating a storage domain
         * using a cinder driver.
         *
         * @param driverSensitiveOptions the value to set
         * @return this builder
         */
        public Builder driverSensitiveOptions(java.util.List<OlvmProperty> driverSensitiveOptions) {
            this.driverSensitiveOptions = driverSensitiveOptions;
            this.__explicitlySet__.add("driverSensitiveOptions");
            return this;
        }
        /** Logical Units of the host storage */
        @com.fasterxml.jackson.annotation.JsonProperty("logicalUnits")
        private java.util.List<LogicalUnit> logicalUnits;

        /**
         * Logical Units of the host storage
         *
         * @param logicalUnits the value to set
         * @return this builder
         */
        public Builder logicalUnits(java.util.List<LogicalUnit> logicalUnits) {
            this.logicalUnits = logicalUnits;
            this.__explicitlySet__.add("logicalUnits");
            return this;
        }
        /** Mount options */
        @com.fasterxml.jackson.annotation.JsonProperty("mountOptions")
        private String mountOptions;

        /**
         * Mount options
         *
         * @param mountOptions the value to set
         * @return this builder
         */
        public Builder mountOptions(String mountOptions) {
            this.mountOptions = mountOptions;
            this.__explicitlySet__.add("mountOptions");
            return this;
        }
        /** The number of times to retry a request before attempting further recovery actions. */
        @com.fasterxml.jackson.annotation.JsonProperty("nfsRetrans")
        private Integer nfsRetrans;

        /**
         * The number of times to retry a request before attempting further recovery actions.
         *
         * @param nfsRetrans the value to set
         * @return this builder
         */
        public Builder nfsRetrans(Integer nfsRetrans) {
            this.nfsRetrans = nfsRetrans;
            this.__explicitlySet__.add("nfsRetrans");
            return this;
        }
        /** The time in tenths of a second to wait for a response before retrying NFS requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("nfsTimeo")
        private Integer nfsTimeo;

        /**
         * The time in tenths of a second to wait for a response before retrying NFS requests.
         *
         * @param nfsTimeo the value to set
         * @return this builder
         */
        public Builder nfsTimeo(Integer nfsTimeo) {
            this.nfsTimeo = nfsTimeo;
            this.__explicitlySet__.add("nfsTimeo");
            return this;
        }
        /** Version of NFS used. */
        @com.fasterxml.jackson.annotation.JsonProperty("nfsVersion")
        private NfsVersion nfsVersion;

        /**
         * Version of NFS used.
         *
         * @param nfsVersion the value to set
         * @return this builder
         */
        public Builder nfsVersion(NfsVersion nfsVersion) {
            this.nfsVersion = nfsVersion;
            this.__explicitlySet__.add("nfsVersion");
            return this;
        }
        /** Whether to override LUNs */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideLuns")
        private Boolean isOverrideLuns;

        /**
         * Whether to override LUNs
         *
         * @param isOverrideLuns the value to set
         * @return this builder
         */
        public Builder isOverrideLuns(Boolean isOverrideLuns) {
            this.isOverrideLuns = isOverrideLuns;
            this.__explicitlySet__.add("isOverrideLuns");
            return this;
        }
        /** Password of the host storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private char[] password;

        /**
         * Password of the host storage.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(char[] password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        public Builder password(String password) {
            this.password = password != null ? password.toCharArray() : null;
            this.__explicitlySet__.add("password");
            return this;
        }
        /** Paths of the host storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("paths")
        private Integer paths;

        /**
         * Paths of the host storage.
         *
         * @param paths the value to set
         * @return this builder
         */
        public Builder paths(Integer paths) {
            this.paths = paths;
            this.__explicitlySet__.add("paths");
            return this;
        }
        /** Port of the host storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port of the host storage.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Portal of the host storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("portal")
        private String portal;

        /**
         * Portal of the host storage.
         *
         * @param portal the value to set
         * @return this builder
         */
        public Builder portal(String portal) {
            this.portal = portal;
            this.__explicitlySet__.add("portal");
            return this;
        }
        /** Target of the host storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * Target of the host storage.
         *
         * @param target the value to set
         * @return this builder
         */
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /** Username of the host storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * Username of the host storage.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** Type representing a storage domain type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type representing a storage domain type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Type of VFS */
        @com.fasterxml.jackson.annotation.JsonProperty("vfsType")
        private String vfsType;

        /**
         * Type of VFS
         *
         * @param vfsType the value to set
         * @return this builder
         */
        public Builder vfsType(String vfsType) {
            this.vfsType = vfsType;
            this.__explicitlySet__.add("vfsType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroup")
        private VolumeGroup volumeGroup;

        public Builder volumeGroup(VolumeGroup volumeGroup) {
            this.volumeGroup = volumeGroup;
            this.__explicitlySet__.add("volumeGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Storage build() {
            Storage model =
                    new Storage(
                            this.id,
                            this.address,
                            this.comment,
                            this.storageDescription,
                            this.driverOptions,
                            this.driverSensitiveOptions,
                            this.logicalUnits,
                            this.mountOptions,
                            this.nfsRetrans,
                            this.nfsTimeo,
                            this.nfsVersion,
                            this.isOverrideLuns,
                            this.password,
                            this.paths,
                            this.port,
                            this.portal,
                            this.target,
                            this.username,
                            this.type,
                            this.vfsType,
                            this.volumeGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Storage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("storageDescription")) {
                this.storageDescription(model.getStorageDescription());
            }
            if (model.wasPropertyExplicitlySet("driverOptions")) {
                this.driverOptions(model.getDriverOptions());
            }
            if (model.wasPropertyExplicitlySet("driverSensitiveOptions")) {
                this.driverSensitiveOptions(model.getDriverSensitiveOptions());
            }
            if (model.wasPropertyExplicitlySet("logicalUnits")) {
                this.logicalUnits(model.getLogicalUnits());
            }
            if (model.wasPropertyExplicitlySet("mountOptions")) {
                this.mountOptions(model.getMountOptions());
            }
            if (model.wasPropertyExplicitlySet("nfsRetrans")) {
                this.nfsRetrans(model.getNfsRetrans());
            }
            if (model.wasPropertyExplicitlySet("nfsTimeo")) {
                this.nfsTimeo(model.getNfsTimeo());
            }
            if (model.wasPropertyExplicitlySet("nfsVersion")) {
                this.nfsVersion(model.getNfsVersion());
            }
            if (model.wasPropertyExplicitlySet("isOverrideLuns")) {
                this.isOverrideLuns(model.getIsOverrideLuns());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("paths")) {
                this.paths(model.getPaths());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("portal")) {
                this.portal(model.getPortal());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("vfsType")) {
                this.vfsType(model.getVfsType());
            }
            if (model.wasPropertyExplicitlySet("volumeGroup")) {
                this.volumeGroup(model.getVolumeGroup());
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

    /** Address of storage domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * Address of storage domain.
     *
     * @return the value
     */
    public String getAddress() {
        return address;
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
    @com.fasterxml.jackson.annotation.JsonProperty("storageDescription")
    private final String storageDescription;

    /**
     * A human-readable description in plain text.
     *
     * @return the value
     */
    public String getStorageDescription() {
        return storageDescription;
    }

    /** The options to be passed when creating a storage domain using a cinder driver. */
    @com.fasterxml.jackson.annotation.JsonProperty("driverOptions")
    private final java.util.List<OlvmProperty> driverOptions;

    /**
     * The options to be passed when creating a storage domain using a cinder driver.
     *
     * @return the value
     */
    public java.util.List<OlvmProperty> getDriverOptions() {
        return driverOptions;
    }

    /**
     * The options containing sensitive information to be passed when creating a storage domain
     * using a cinder driver.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("driverSensitiveOptions")
    private final java.util.List<OlvmProperty> driverSensitiveOptions;

    /**
     * The options containing sensitive information to be passed when creating a storage domain
     * using a cinder driver.
     *
     * @return the value
     */
    public java.util.List<OlvmProperty> getDriverSensitiveOptions() {
        return driverSensitiveOptions;
    }

    /** Logical Units of the host storage */
    @com.fasterxml.jackson.annotation.JsonProperty("logicalUnits")
    private final java.util.List<LogicalUnit> logicalUnits;

    /**
     * Logical Units of the host storage
     *
     * @return the value
     */
    public java.util.List<LogicalUnit> getLogicalUnits() {
        return logicalUnits;
    }

    /** Mount options */
    @com.fasterxml.jackson.annotation.JsonProperty("mountOptions")
    private final String mountOptions;

    /**
     * Mount options
     *
     * @return the value
     */
    public String getMountOptions() {
        return mountOptions;
    }

    /** The number of times to retry a request before attempting further recovery actions. */
    @com.fasterxml.jackson.annotation.JsonProperty("nfsRetrans")
    private final Integer nfsRetrans;

    /**
     * The number of times to retry a request before attempting further recovery actions.
     *
     * @return the value
     */
    public Integer getNfsRetrans() {
        return nfsRetrans;
    }

    /** The time in tenths of a second to wait for a response before retrying NFS requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("nfsTimeo")
    private final Integer nfsTimeo;

    /**
     * The time in tenths of a second to wait for a response before retrying NFS requests.
     *
     * @return the value
     */
    public Integer getNfsTimeo() {
        return nfsTimeo;
    }

    /** Version of NFS used. */
    public enum NfsVersion implements com.oracle.bmc.http.internal.BmcEnum {
        Auto("AUTO"),
        V3("V3"),
        V4("V4"),
        V40("V4_0"),
        V41("V4_1"),
        V42("V4_2"),
        ;

        private final String value;
        private static java.util.Map<String, NfsVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (NfsVersion v : NfsVersion.values()) {
                map.put(v.getValue(), v);
            }
        }

        NfsVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NfsVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NfsVersion: " + key);
        }
    };
    /** Version of NFS used. */
    @com.fasterxml.jackson.annotation.JsonProperty("nfsVersion")
    private final NfsVersion nfsVersion;

    /**
     * Version of NFS used.
     *
     * @return the value
     */
    public NfsVersion getNfsVersion() {
        return nfsVersion;
    }

    /** Whether to override LUNs */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideLuns")
    private final Boolean isOverrideLuns;

    /**
     * Whether to override LUNs
     *
     * @return the value
     */
    public Boolean getIsOverrideLuns() {
        return isOverrideLuns;
    }

    /** Password of the host storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final char[] password;

    /**
     * Password of the host storage.
     *
     * @return the value
     * @deprecated Use getPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getPassword() {
        return password != null ? new String(password) : null;
    }

    /**
     * Password of the host storage.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    public char[] getPassword__AsCharArray() {
        return password;
    }

    /** Paths of the host storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("paths")
    private final Integer paths;

    /**
     * Paths of the host storage.
     *
     * @return the value
     */
    public Integer getPaths() {
        return paths;
    }

    /** Port of the host storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port of the host storage.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Portal of the host storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("portal")
    private final String portal;

    /**
     * Portal of the host storage.
     *
     * @return the value
     */
    public String getPortal() {
        return portal;
    }

    /** Target of the host storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * Target of the host storage.
     *
     * @return the value
     */
    public String getTarget() {
        return target;
    }

    /** Username of the host storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * Username of the host storage.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** Type representing a storage domain type. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Cinder("CINDER"),
        Fcp("FCP"),
        Glance("GLANCE"),
        Glusterfs("GLUSTERFS"),
        Iscsi("ISCSI"),
        Localfs("LOCALFS"),
        ManagedBlockStorage("MANAGED_BLOCK_STORAGE"),
        Nfs("NFS"),
        Posixfs("POSIXFS"),
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
    /** Type representing a storage domain type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type representing a storage domain type.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** Type of VFS */
    @com.fasterxml.jackson.annotation.JsonProperty("vfsType")
    private final String vfsType;

    /**
     * Type of VFS
     *
     * @return the value
     */
    public String getVfsType() {
        return vfsType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroup")
    private final VolumeGroup volumeGroup;

    public VolumeGroup getVolumeGroup() {
        return volumeGroup;
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
        sb.append("Storage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", address=").append(String.valueOf(this.address));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", storageDescription=").append(String.valueOf(this.storageDescription));
        sb.append(", driverOptions=").append(String.valueOf(this.driverOptions));
        sb.append(", driverSensitiveOptions=").append(String.valueOf(this.driverSensitiveOptions));
        sb.append(", logicalUnits=").append(String.valueOf(this.logicalUnits));
        sb.append(", mountOptions=").append(String.valueOf(this.mountOptions));
        sb.append(", nfsRetrans=").append(String.valueOf(this.nfsRetrans));
        sb.append(", nfsTimeo=").append(String.valueOf(this.nfsTimeo));
        sb.append(", nfsVersion=").append(String.valueOf(this.nfsVersion));
        sb.append(", isOverrideLuns=").append(String.valueOf(this.isOverrideLuns));
        sb.append(", password=").append("<redacted>");
        sb.append(", paths=").append(String.valueOf(this.paths));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", portal=").append(String.valueOf(this.portal));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", vfsType=").append(String.valueOf(this.vfsType));
        sb.append(", volumeGroup=").append(String.valueOf(this.volumeGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Storage)) {
            return false;
        }

        Storage other = (Storage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.storageDescription, other.storageDescription)
                && java.util.Objects.equals(this.driverOptions, other.driverOptions)
                && java.util.Objects.equals(
                        this.driverSensitiveOptions, other.driverSensitiveOptions)
                && java.util.Objects.equals(this.logicalUnits, other.logicalUnits)
                && java.util.Objects.equals(this.mountOptions, other.mountOptions)
                && java.util.Objects.equals(this.nfsRetrans, other.nfsRetrans)
                && java.util.Objects.equals(this.nfsTimeo, other.nfsTimeo)
                && java.util.Objects.equals(this.nfsVersion, other.nfsVersion)
                && java.util.Objects.equals(this.isOverrideLuns, other.isOverrideLuns)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.paths, other.paths)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.portal, other.portal)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.vfsType, other.vfsType)
                && java.util.Objects.equals(this.volumeGroup, other.volumeGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result =
                (result * PRIME)
                        + (this.storageDescription == null
                                ? 43
                                : this.storageDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.driverOptions == null ? 43 : this.driverOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.driverSensitiveOptions == null
                                ? 43
                                : this.driverSensitiveOptions.hashCode());
        result = (result * PRIME) + (this.logicalUnits == null ? 43 : this.logicalUnits.hashCode());
        result = (result * PRIME) + (this.mountOptions == null ? 43 : this.mountOptions.hashCode());
        result = (result * PRIME) + (this.nfsRetrans == null ? 43 : this.nfsRetrans.hashCode());
        result = (result * PRIME) + (this.nfsTimeo == null ? 43 : this.nfsTimeo.hashCode());
        result = (result * PRIME) + (this.nfsVersion == null ? 43 : this.nfsVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverrideLuns == null ? 43 : this.isOverrideLuns.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.paths == null ? 43 : this.paths.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.portal == null ? 43 : this.portal.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.vfsType == null ? 43 : this.vfsType.hashCode());
        result = (result * PRIME) + (this.volumeGroup == null ? 43 : this.volumeGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
