/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Backup destination details, including the list of databases using the backup destination. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BackupDestinationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupDestinationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "type",
        "associatedDatabases",
        "connectionString",
        "vpcUsers",
        "localMountPointPath",
        "nfsMountType",
        "nfsServer",
        "nfsServerExport",
        "lifecycleState",
        "timeCreated",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "totalStorageSizeInGBs",
        "utilizedStorageSizeInGBs",
        "timeAtWhichStorageDetailsAreUpdated"
    })
    public BackupDestinationSummary(
            String id,
            String displayName,
            String compartmentId,
            Type type,
            java.util.List<AssociatedDatabaseDetails> associatedDatabases,
            String connectionString,
            java.util.List<String> vpcUsers,
            String localMountPointPath,
            NfsMountType nfsMountType,
            java.util.List<String> nfsServer,
            String nfsServerExport,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Integer totalStorageSizeInGBs,
            Integer utilizedStorageSizeInGBs,
            java.util.Date timeAtWhichStorageDetailsAreUpdated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.type = type;
        this.associatedDatabases = associatedDatabases;
        this.connectionString = connectionString;
        this.vpcUsers = vpcUsers;
        this.localMountPointPath = localMountPointPath;
        this.nfsMountType = nfsMountType;
        this.nfsServer = nfsServer;
        this.nfsServerExport = nfsServerExport;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.totalStorageSizeInGBs = totalStorageSizeInGBs;
        this.utilizedStorageSizeInGBs = utilizedStorageSizeInGBs;
        this.timeAtWhichStorageDetailsAreUpdated = timeAtWhichStorageDetailsAreUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup destination.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup destination.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The user-provided name of the backup destination. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-provided name of the backup destination.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Type of the backup destination. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type of the backup destination.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** List of databases associated with the backup destination. */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedDatabases")
        private java.util.List<AssociatedDatabaseDetails> associatedDatabases;

        /**
         * List of databases associated with the backup destination.
         *
         * @param associatedDatabases the value to set
         * @return this builder
         */
        public Builder associatedDatabases(
                java.util.List<AssociatedDatabaseDetails> associatedDatabases) {
            this.associatedDatabases = associatedDatabases;
            this.__explicitlySet__.add("associatedDatabases");
            return this;
        }
        /**
         * For a RECOVERY_APPLIANCE backup destination, the connection string for connecting to the
         * Recovery Appliance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * For a RECOVERY_APPLIANCE backup destination, the connection string for connecting to the
         * Recovery Appliance.
         *
         * @param connectionString the value to set
         * @return this builder
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }
        /**
         * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) users that
         * are used to access the Recovery Appliance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vpcUsers")
        private java.util.List<String> vpcUsers;

        /**
         * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) users that
         * are used to access the Recovery Appliance.
         *
         * @param vpcUsers the value to set
         * @return this builder
         */
        public Builder vpcUsers(java.util.List<String> vpcUsers) {
            this.vpcUsers = vpcUsers;
            this.__explicitlySet__.add("vpcUsers");
            return this;
        }
        /**
         * The local directory path on each VM cluster node where the NFS server location is
         * mounted. The local directory path and the NFS server location must each be the same
         * across all of the VM cluster nodes. Ensure that the NFS mount is maintained continuously
         * on all of the VM cluster nodes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localMountPointPath")
        private String localMountPointPath;

        /**
         * The local directory path on each VM cluster node where the NFS server location is
         * mounted. The local directory path and the NFS server location must each be the same
         * across all of the VM cluster nodes. Ensure that the NFS mount is maintained continuously
         * on all of the VM cluster nodes.
         *
         * @param localMountPointPath the value to set
         * @return this builder
         */
        public Builder localMountPointPath(String localMountPointPath) {
            this.localMountPointPath = localMountPointPath;
            this.__explicitlySet__.add("localMountPointPath");
            return this;
        }
        /** NFS Mount type for backup destination. */
        @com.fasterxml.jackson.annotation.JsonProperty("nfsMountType")
        private NfsMountType nfsMountType;

        /**
         * NFS Mount type for backup destination.
         *
         * @param nfsMountType the value to set
         * @return this builder
         */
        public Builder nfsMountType(NfsMountType nfsMountType) {
            this.nfsMountType = nfsMountType;
            this.__explicitlySet__.add("nfsMountType");
            return this;
        }
        /** Host names or IP addresses for NFS Auto mount. */
        @com.fasterxml.jackson.annotation.JsonProperty("nfsServer")
        private java.util.List<String> nfsServer;

        /**
         * Host names or IP addresses for NFS Auto mount.
         *
         * @param nfsServer the value to set
         * @return this builder
         */
        public Builder nfsServer(java.util.List<String> nfsServer) {
            this.nfsServer = nfsServer;
            this.__explicitlySet__.add("nfsServer");
            return this;
        }
        /** Specifies the directory on which to mount the file system */
        @com.fasterxml.jackson.annotation.JsonProperty("nfsServerExport")
        private String nfsServerExport;

        /**
         * Specifies the directory on which to mount the file system
         *
         * @param nfsServerExport the value to set
         * @return this builder
         */
        public Builder nfsServerExport(String nfsServerExport) {
            this.nfsServerExport = nfsServerExport;
            this.__explicitlySet__.add("nfsServerExport");
            return this;
        }
        /** The current lifecycle state of the backup destination. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the backup destination.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The date and time the backup destination was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the backup destination was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * A descriptive text associated with the lifecycleState. Typically contains additional
         * displayable text
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A descriptive text associated with the lifecycleState. Typically contains additional
         * displayable text
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The total storage size of the backup destination in GBs, rounded to the nearest integer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalStorageSizeInGBs")
        private Integer totalStorageSizeInGBs;

        /**
         * The total storage size of the backup destination in GBs, rounded to the nearest integer.
         *
         * @param totalStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder totalStorageSizeInGBs(Integer totalStorageSizeInGBs) {
            this.totalStorageSizeInGBs = totalStorageSizeInGBs;
            this.__explicitlySet__.add("totalStorageSizeInGBs");
            return this;
        }
        /**
         * The total amount of space utilized on the backup destination (in GBs), rounded to the
         * nearest integer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("utilizedStorageSizeInGBs")
        private Integer utilizedStorageSizeInGBs;

        /**
         * The total amount of space utilized on the backup destination (in GBs), rounded to the
         * nearest integer.
         *
         * @param utilizedStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder utilizedStorageSizeInGBs(Integer utilizedStorageSizeInGBs) {
            this.utilizedStorageSizeInGBs = utilizedStorageSizeInGBs;
            this.__explicitlySet__.add("utilizedStorageSizeInGBs");
            return this;
        }
        /**
         * The time when the total storage size and the utilized storage size of the backup
         * destination are updated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAtWhichStorageDetailsAreUpdated")
        private java.util.Date timeAtWhichStorageDetailsAreUpdated;

        /**
         * The time when the total storage size and the utilized storage size of the backup
         * destination are updated.
         *
         * @param timeAtWhichStorageDetailsAreUpdated the value to set
         * @return this builder
         */
        public Builder timeAtWhichStorageDetailsAreUpdated(
                java.util.Date timeAtWhichStorageDetailsAreUpdated) {
            this.timeAtWhichStorageDetailsAreUpdated = timeAtWhichStorageDetailsAreUpdated;
            this.__explicitlySet__.add("timeAtWhichStorageDetailsAreUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupDestinationSummary build() {
            BackupDestinationSummary model =
                    new BackupDestinationSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.type,
                            this.associatedDatabases,
                            this.connectionString,
                            this.vpcUsers,
                            this.localMountPointPath,
                            this.nfsMountType,
                            this.nfsServer,
                            this.nfsServerExport,
                            this.lifecycleState,
                            this.timeCreated,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.totalStorageSizeInGBs,
                            this.utilizedStorageSizeInGBs,
                            this.timeAtWhichStorageDetailsAreUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupDestinationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("associatedDatabases")) {
                this.associatedDatabases(model.getAssociatedDatabases());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("vpcUsers")) {
                this.vpcUsers(model.getVpcUsers());
            }
            if (model.wasPropertyExplicitlySet("localMountPointPath")) {
                this.localMountPointPath(model.getLocalMountPointPath());
            }
            if (model.wasPropertyExplicitlySet("nfsMountType")) {
                this.nfsMountType(model.getNfsMountType());
            }
            if (model.wasPropertyExplicitlySet("nfsServer")) {
                this.nfsServer(model.getNfsServer());
            }
            if (model.wasPropertyExplicitlySet("nfsServerExport")) {
                this.nfsServerExport(model.getNfsServerExport());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("totalStorageSizeInGBs")) {
                this.totalStorageSizeInGBs(model.getTotalStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("utilizedStorageSizeInGBs")) {
                this.utilizedStorageSizeInGBs(model.getUtilizedStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("timeAtWhichStorageDetailsAreUpdated")) {
                this.timeAtWhichStorageDetailsAreUpdated(
                        model.getTimeAtWhichStorageDetailsAreUpdated());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup destination.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup destination.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-provided name of the backup destination. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-provided name of the backup destination.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Type of the backup destination. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Nfs("NFS"),
        RecoveryAppliance("RECOVERY_APPLIANCE"),

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
    /** Type of the backup destination. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type of the backup destination.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** List of databases associated with the backup destination. */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedDatabases")
    private final java.util.List<AssociatedDatabaseDetails> associatedDatabases;

    /**
     * List of databases associated with the backup destination.
     *
     * @return the value
     */
    public java.util.List<AssociatedDatabaseDetails> getAssociatedDatabases() {
        return associatedDatabases;
    }

    /**
     * For a RECOVERY_APPLIANCE backup destination, the connection string for connecting to the
     * Recovery Appliance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * For a RECOVERY_APPLIANCE backup destination, the connection string for connecting to the
     * Recovery Appliance.
     *
     * @return the value
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) users that are
     * used to access the Recovery Appliance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vpcUsers")
    private final java.util.List<String> vpcUsers;

    /**
     * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) users that are
     * used to access the Recovery Appliance.
     *
     * @return the value
     */
    public java.util.List<String> getVpcUsers() {
        return vpcUsers;
    }

    /**
     * The local directory path on each VM cluster node where the NFS server location is mounted.
     * The local directory path and the NFS server location must each be the same across all of the
     * VM cluster nodes. Ensure that the NFS mount is maintained continuously on all of the VM
     * cluster nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localMountPointPath")
    private final String localMountPointPath;

    /**
     * The local directory path on each VM cluster node where the NFS server location is mounted.
     * The local directory path and the NFS server location must each be the same across all of the
     * VM cluster nodes. Ensure that the NFS mount is maintained continuously on all of the VM
     * cluster nodes.
     *
     * @return the value
     */
    public String getLocalMountPointPath() {
        return localMountPointPath;
    }

    /** NFS Mount type for backup destination. */
    public enum NfsMountType implements com.oracle.bmc.http.internal.BmcEnum {
        SelfMount("SELF_MOUNT"),
        AutomatedMount("AUTOMATED_MOUNT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NfsMountType.class);

        private final String value;
        private static java.util.Map<String, NfsMountType> map;

        static {
            map = new java.util.HashMap<>();
            for (NfsMountType v : NfsMountType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NfsMountType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NfsMountType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NfsMountType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** NFS Mount type for backup destination. */
    @com.fasterxml.jackson.annotation.JsonProperty("nfsMountType")
    private final NfsMountType nfsMountType;

    /**
     * NFS Mount type for backup destination.
     *
     * @return the value
     */
    public NfsMountType getNfsMountType() {
        return nfsMountType;
    }

    /** Host names or IP addresses for NFS Auto mount. */
    @com.fasterxml.jackson.annotation.JsonProperty("nfsServer")
    private final java.util.List<String> nfsServer;

    /**
     * Host names or IP addresses for NFS Auto mount.
     *
     * @return the value
     */
    public java.util.List<String> getNfsServer() {
        return nfsServer;
    }

    /** Specifies the directory on which to mount the file system */
    @com.fasterxml.jackson.annotation.JsonProperty("nfsServerExport")
    private final String nfsServerExport;

    /**
     * Specifies the directory on which to mount the file system
     *
     * @return the value
     */
    public String getNfsServerExport() {
        return nfsServerExport;
    }

    /** The current lifecycle state of the backup destination. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Failed("FAILED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current lifecycle state of the backup destination. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the backup destination.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The date and time the backup destination was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the backup destination was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * A descriptive text associated with the lifecycleState. Typically contains additional
     * displayable text
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A descriptive text associated with the lifecycleState. Typically contains additional
     * displayable text
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** The total storage size of the backup destination in GBs, rounded to the nearest integer. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalStorageSizeInGBs")
    private final Integer totalStorageSizeInGBs;

    /**
     * The total storage size of the backup destination in GBs, rounded to the nearest integer.
     *
     * @return the value
     */
    public Integer getTotalStorageSizeInGBs() {
        return totalStorageSizeInGBs;
    }

    /**
     * The total amount of space utilized on the backup destination (in GBs), rounded to the nearest
     * integer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("utilizedStorageSizeInGBs")
    private final Integer utilizedStorageSizeInGBs;

    /**
     * The total amount of space utilized on the backup destination (in GBs), rounded to the nearest
     * integer.
     *
     * @return the value
     */
    public Integer getUtilizedStorageSizeInGBs() {
        return utilizedStorageSizeInGBs;
    }

    /**
     * The time when the total storage size and the utilized storage size of the backup destination
     * are updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAtWhichStorageDetailsAreUpdated")
    private final java.util.Date timeAtWhichStorageDetailsAreUpdated;

    /**
     * The time when the total storage size and the utilized storage size of the backup destination
     * are updated.
     *
     * @return the value
     */
    public java.util.Date getTimeAtWhichStorageDetailsAreUpdated() {
        return timeAtWhichStorageDetailsAreUpdated;
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
        sb.append("BackupDestinationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", associatedDatabases=").append(String.valueOf(this.associatedDatabases));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", vpcUsers=").append(String.valueOf(this.vpcUsers));
        sb.append(", localMountPointPath=").append(String.valueOf(this.localMountPointPath));
        sb.append(", nfsMountType=").append(String.valueOf(this.nfsMountType));
        sb.append(", nfsServer=").append(String.valueOf(this.nfsServer));
        sb.append(", nfsServerExport=").append(String.valueOf(this.nfsServerExport));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", totalStorageSizeInGBs=").append(String.valueOf(this.totalStorageSizeInGBs));
        sb.append(", utilizedStorageSizeInGBs=")
                .append(String.valueOf(this.utilizedStorageSizeInGBs));
        sb.append(", timeAtWhichStorageDetailsAreUpdated=")
                .append(String.valueOf(this.timeAtWhichStorageDetailsAreUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupDestinationSummary)) {
            return false;
        }

        BackupDestinationSummary other = (BackupDestinationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.associatedDatabases, other.associatedDatabases)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.vpcUsers, other.vpcUsers)
                && java.util.Objects.equals(this.localMountPointPath, other.localMountPointPath)
                && java.util.Objects.equals(this.nfsMountType, other.nfsMountType)
                && java.util.Objects.equals(this.nfsServer, other.nfsServer)
                && java.util.Objects.equals(this.nfsServerExport, other.nfsServerExport)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.totalStorageSizeInGBs, other.totalStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.utilizedStorageSizeInGBs, other.utilizedStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.timeAtWhichStorageDetailsAreUpdated,
                        other.timeAtWhichStorageDetailsAreUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedDatabases == null
                                ? 43
                                : this.associatedDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result = (result * PRIME) + (this.vpcUsers == null ? 43 : this.vpcUsers.hashCode());
        result =
                (result * PRIME)
                        + (this.localMountPointPath == null
                                ? 43
                                : this.localMountPointPath.hashCode());
        result = (result * PRIME) + (this.nfsMountType == null ? 43 : this.nfsMountType.hashCode());
        result = (result * PRIME) + (this.nfsServer == null ? 43 : this.nfsServer.hashCode());
        result =
                (result * PRIME)
                        + (this.nfsServerExport == null ? 43 : this.nfsServerExport.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.totalStorageSizeInGBs == null
                                ? 43
                                : this.totalStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.utilizedStorageSizeInGBs == null
                                ? 43
                                : this.utilizedStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAtWhichStorageDetailsAreUpdated == null
                                ? 43
                                : this.timeAtWhichStorageDetailsAreUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
