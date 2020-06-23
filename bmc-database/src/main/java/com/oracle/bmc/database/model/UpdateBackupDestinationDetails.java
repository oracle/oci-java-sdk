/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * For a RECOVERY_APPLIANCE backup destination, used to update the connection string and/or the list of VPC users.
 * For an NFS backup destination, there are 2 mount types - Self mount used for non-autonomous ExaCC and automated mount used for autonomous on ExaCC.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBackupDestinationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateBackupDestinationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("vpcUsers")
        private java.util.List<String> vpcUsers;

        public Builder vpcUsers(java.util.List<String> vpcUsers) {
            this.vpcUsers = vpcUsers;
            this.__explicitlySet__.add("vpcUsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localMountPointPath")
        private String localMountPointPath;

        public Builder localMountPointPath(String localMountPointPath) {
            this.localMountPointPath = localMountPointPath;
            this.__explicitlySet__.add("localMountPointPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nfsMountType")
        private NfsMountType nfsMountType;

        public Builder nfsMountType(NfsMountType nfsMountType) {
            this.nfsMountType = nfsMountType;
            this.__explicitlySet__.add("nfsMountType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nfsServer")
        private java.util.List<String> nfsServer;

        public Builder nfsServer(java.util.List<String> nfsServer) {
            this.nfsServer = nfsServer;
            this.__explicitlySet__.add("nfsServer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nfsServerExport")
        private String nfsServerExport;

        public Builder nfsServerExport(String nfsServerExport) {
            this.nfsServerExport = nfsServerExport;
            this.__explicitlySet__.add("nfsServerExport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBackupDestinationDetails build() {
            UpdateBackupDestinationDetails __instance__ =
                    new UpdateBackupDestinationDetails(
                            vpcUsers,
                            connectionString,
                            localMountPointPath,
                            nfsMountType,
                            nfsServer,
                            nfsServerExport,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBackupDestinationDetails o) {
            Builder copiedBuilder =
                    vpcUsers(o.getVpcUsers())
                            .connectionString(o.getConnectionString())
                            .localMountPointPath(o.getLocalMountPointPath())
                            .nfsMountType(o.getNfsMountType())
                            .nfsServer(o.getNfsServer())
                            .nfsServerExport(o.getNfsServerExport())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) users that are used to access the Recovery Appliance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vpcUsers")
    java.util.List<String> vpcUsers;

    /**
     * For a RECOVERY_APPLIANCE backup destination, the connection string for connecting to the Recovery Appliance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    String connectionString;

    /**
     * The local directory path on each VM cluster node where the NFS server location is mounted. The local directory path and the NFS server location must each be the same across all of the VM cluster nodes. Ensure that the NFS mount is maintained continuously on all of the VM cluster nodes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localMountPointPath")
    String localMountPointPath;
    /**
     * NFS Mount type for backup destination.
     **/
    public enum NfsMountType {
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
    /**
     * NFS Mount type for backup destination.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nfsMountType")
    NfsMountType nfsMountType;

    /**
     * IP addresses for NFS Auto mount.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nfsServer")
    java.util.List<String> nfsServer;

    /**
     * Specifies the directory on which to mount the file system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nfsServerExport")
    String nfsServerExport;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
