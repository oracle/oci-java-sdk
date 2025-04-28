/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * For a RECOVERY_APPLIANCE backup destination, used to update the connection string and/or the list
 * of VPC users. For an NFS backup destination, there are 2 mount types - Self mount used for
 * non-autonomous ExaCC and automated mount used for autonomous on ExaCC. <br>
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
        builder = UpdateBackupDestinationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateBackupDestinationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vpcUsers",
        "connectionString",
        "localMountPointPath",
        "nfsMountType",
        "nfsServer",
        "nfsServerExport",
        "freeformTags",
        "definedTags"
    })
    public UpdateBackupDestinationDetails(
            java.util.List<String> vpcUsers,
            String connectionString,
            String localMountPointPath,
            NfsMountType nfsMountType,
            java.util.List<String> nfsServer,
            String nfsServerExport,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.vpcUsers = vpcUsers;
        this.connectionString = connectionString;
        this.localMountPointPath = localMountPointPath;
        this.nfsMountType = nfsMountType;
        this.nfsServer = nfsServer;
        this.nfsServerExport = nfsServerExport;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** IP addresses for NFS Auto mount. */
        @com.fasterxml.jackson.annotation.JsonProperty("nfsServer")
        private java.util.List<String> nfsServer;

        /**
         * IP addresses for NFS Auto mount.
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBackupDestinationDetails build() {
            UpdateBackupDestinationDetails model =
                    new UpdateBackupDestinationDetails(
                            this.vpcUsers,
                            this.connectionString,
                            this.localMountPointPath,
                            this.nfsMountType,
                            this.nfsServer,
                            this.nfsServerExport,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBackupDestinationDetails model) {
            if (model.wasPropertyExplicitlySet("vpcUsers")) {
                this.vpcUsers(model.getVpcUsers());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
        ;

        private final String value;
        private static java.util.Map<String, NfsMountType> map;

        static {
            map = new java.util.HashMap<>();
            for (NfsMountType v : NfsMountType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid NfsMountType: " + key);
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

    /** IP addresses for NFS Auto mount. */
    @com.fasterxml.jackson.annotation.JsonProperty("nfsServer")
    private final java.util.List<String> nfsServer;

    /**
     * IP addresses for NFS Auto mount.
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateBackupDestinationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vpcUsers=").append(String.valueOf(this.vpcUsers));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", localMountPointPath=").append(String.valueOf(this.localMountPointPath));
        sb.append(", nfsMountType=").append(String.valueOf(this.nfsMountType));
        sb.append(", nfsServer=").append(String.valueOf(this.nfsServer));
        sb.append(", nfsServerExport=").append(String.valueOf(this.nfsServerExport));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBackupDestinationDetails)) {
            return false;
        }

        UpdateBackupDestinationDetails other = (UpdateBackupDestinationDetails) o;
        return java.util.Objects.equals(this.vpcUsers, other.vpcUsers)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.localMountPointPath, other.localMountPointPath)
                && java.util.Objects.equals(this.nfsMountType, other.nfsMountType)
                && java.util.Objects.equals(this.nfsServer, other.nfsServer)
                && java.util.Objects.equals(this.nfsServerExport, other.nfsServerExport)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vpcUsers == null ? 43 : this.vpcUsers.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
