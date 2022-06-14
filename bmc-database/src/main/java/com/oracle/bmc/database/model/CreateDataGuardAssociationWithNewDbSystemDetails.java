/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for creating a Data Guard association for a virtual machine DB system database. For this type of DB system database, the {@code creationType} should be {@code NewDbSystem}. A new DB system will be launched to create the standby database.
 * <p>
 * To create a Data Guard association for a database in a bare metal or Exadata DB system, use the {@link #createDataGuardAssociationToExistingDbSystemDetails(CreateDataGuardAssociationToExistingDbSystemDetailsRequest) createDataGuardAssociationToExistingDbSystemDetails} subtype instead.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataGuardAssociationWithNewDbSystemDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "creationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDataGuardAssociationWithNewDbSystemDetails
        extends CreateDataGuardAssociationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
        private String databaseAdminPassword;

        public Builder databaseAdminPassword(String databaseAdminPassword) {
            this.databaseAdminPassword = databaseAdminPassword;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
        private Boolean isActiveDataGuardEnabled;

        public Builder isActiveDataGuardEnabled(Boolean isActiveDataGuardEnabled) {
            this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
            this.__explicitlySet__.add("isActiveDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerDbUniqueName")
        private String peerDbUniqueName;

        public Builder peerDbUniqueName(String peerDbUniqueName) {
            this.peerDbUniqueName = peerDbUniqueName;
            this.__explicitlySet__.add("peerDbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerSidPrefix")
        private String peerSidPrefix;

        public Builder peerSidPrefix(String peerSidPrefix) {
            this.peerSidPrefix = peerSidPrefix;
            this.__explicitlySet__.add("peerSidPrefix");
            return this;
        }
        /**
         * The user-friendly name of the DB system that will contain the the standby database. The display name does not have to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name of the DB system that will contain the the standby database. The display name does not have to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The name of the availability domain that the standby database DB system will be located in. For example- "Uocm:PHX-AD-1".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the standby database DB system will be located in. For example- "Uocm:PHX-AD-1".
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The virtual machine DB system shape to launch for the standby database in the Data Guard association. The shape determines the number of CPU cores and the amount of memory available for the DB system.
         * Only virtual machine shapes are valid options. If you do not supply this parameter, the default shape is the shape of the primary DB system.
         * <p>
         * To get a list of all shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest) listDbSystemShapes} operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The virtual machine DB system shape to launch for the standby database in the Data Guard association. The shape determines the number of CPU cores and the amount of memory available for the DB system.
         * Only virtual machine shapes are valid options. If you do not supply this parameter, the default shape is the shape of the primary DB system.
         * <p>
         * To get a list of all shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest) listDbSystemShapes} operation.
         *
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The number of OCPU cores available for AMD-based virtual machine DB systems.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of OCPU cores available for AMD-based virtual machine DB systems.
         * @param cpuCoreCount the value to set
         * @return this builder
         **/
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The block storage volume performance level. Valid values are {@code BALANCED} and {@code HIGH_PERFORMANCE}. See [Block Volume Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm) for more information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageVolumePerformanceMode")
        private StorageVolumePerformanceMode storageVolumePerformanceMode;

        /**
         * The block storage volume performance level. Valid values are {@code BALANCED} and {@code HIGH_PERFORMANCE}. See [Block Volume Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm) for more information.
         *
         * @param storageVolumePerformanceMode the value to set
         * @return this builder
         **/
        public Builder storageVolumePerformanceMode(
                StorageVolumePerformanceMode storageVolumePerformanceMode) {
            this.storageVolumePerformanceMode = storageVolumePerformanceMode;
            this.__explicitlySet__.add("storageVolumePerformanceMode");
            return this;
        }
        /**
         * The OCID of the subnet the DB system is associated with.
         * **Subnet Restrictions:**
         * - For 1- and 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.16.16/28
         * <p>
         * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
         * Specifying an overlapping subnet will cause the private interconnect to malfunction.
         * This restriction applies to both the client subnet and backup subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet the DB system is associated with.
         * **Subnet Restrictions:**
         * - For 1- and 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.16.16/28
         * <p>
         * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
         * Specifying an overlapping subnet will cause the private interconnect to malfunction.
         * This restriction applies to both the client subnet and backup subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:**
         * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:**
         * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
        private java.util.List<String> backupNetworkNsgIds;

        /**
         * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
         *
         * @param backupNetworkNsgIds the value to set
         * @return this builder
         **/
        public Builder backupNetworkNsgIds(java.util.List<String> backupNetworkNsgIds) {
            this.backupNetworkNsgIds = backupNetworkNsgIds;
            this.__explicitlySet__.add("backupNetworkNsgIds");
            return this;
        }
        /**
         * The hostname for the DB node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname for the DB node.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataGuardAssociationWithNewDbSystemDetails build() {
            CreateDataGuardAssociationWithNewDbSystemDetails __instance__ =
                    new CreateDataGuardAssociationWithNewDbSystemDetails(
                            databaseSoftwareImageId,
                            databaseAdminPassword,
                            protectionMode,
                            transportType,
                            isActiveDataGuardEnabled,
                            peerDbUniqueName,
                            peerSidPrefix,
                            displayName,
                            availabilityDomain,
                            shape,
                            cpuCoreCount,
                            storageVolumePerformanceMode,
                            subnetId,
                            nsgIds,
                            backupNetworkNsgIds,
                            hostname);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataGuardAssociationWithNewDbSystemDetails o) {
            Builder copiedBuilder =
                    databaseSoftwareImageId(o.getDatabaseSoftwareImageId())
                            .databaseAdminPassword(o.getDatabaseAdminPassword())
                            .protectionMode(o.getProtectionMode())
                            .transportType(o.getTransportType())
                            .isActiveDataGuardEnabled(o.getIsActiveDataGuardEnabled())
                            .peerDbUniqueName(o.getPeerDbUniqueName())
                            .peerSidPrefix(o.getPeerSidPrefix())
                            .displayName(o.getDisplayName())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .shape(o.getShape())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .storageVolumePerformanceMode(o.getStorageVolumePerformanceMode())
                            .subnetId(o.getSubnetId())
                            .nsgIds(o.getNsgIds())
                            .backupNetworkNsgIds(o.getBackupNetworkNsgIds())
                            .hostname(o.getHostname());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateDataGuardAssociationWithNewDbSystemDetails(
            String databaseSoftwareImageId,
            String databaseAdminPassword,
            ProtectionMode protectionMode,
            TransportType transportType,
            Boolean isActiveDataGuardEnabled,
            String peerDbUniqueName,
            String peerSidPrefix,
            String displayName,
            String availabilityDomain,
            String shape,
            Integer cpuCoreCount,
            StorageVolumePerformanceMode storageVolumePerformanceMode,
            String subnetId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            String hostname) {
        super(
                databaseSoftwareImageId,
                databaseAdminPassword,
                protectionMode,
                transportType,
                isActiveDataGuardEnabled,
                peerDbUniqueName,
                peerSidPrefix);
        this.displayName = displayName;
        this.availabilityDomain = availabilityDomain;
        this.shape = shape;
        this.cpuCoreCount = cpuCoreCount;
        this.storageVolumePerformanceMode = storageVolumePerformanceMode;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.hostname = hostname;
    }

    /**
     * The user-friendly name of the DB system that will contain the the standby database. The display name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name of the DB system that will contain the the standby database. The display name does not have to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The name of the availability domain that the standby database DB system will be located in. For example- "Uocm:PHX-AD-1".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the standby database DB system will be located in. For example- "Uocm:PHX-AD-1".
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The virtual machine DB system shape to launch for the standby database in the Data Guard association. The shape determines the number of CPU cores and the amount of memory available for the DB system.
     * Only virtual machine shapes are valid options. If you do not supply this parameter, the default shape is the shape of the primary DB system.
     * <p>
     * To get a list of all shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest) listDbSystemShapes} operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The virtual machine DB system shape to launch for the standby database in the Data Guard association. The shape determines the number of CPU cores and the amount of memory available for the DB system.
     * Only virtual machine shapes are valid options. If you do not supply this parameter, the default shape is the shape of the primary DB system.
     * <p>
     * To get a list of all shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest) listDbSystemShapes} operation.
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * The number of OCPU cores available for AMD-based virtual machine DB systems.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of OCPU cores available for AMD-based virtual machine DB systems.
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code HIGH_PERFORMANCE}. See [Block Volume Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm) for more information.
     *
     **/
    public enum StorageVolumePerformanceMode {
        Balanced("BALANCED"),
        HighPerformance("HIGH_PERFORMANCE"),
        ;

        private final String value;
        private static java.util.Map<String, StorageVolumePerformanceMode> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageVolumePerformanceMode v : StorageVolumePerformanceMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageVolumePerformanceMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageVolumePerformanceMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StorageVolumePerformanceMode: " + key);
        }
    };
    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code HIGH_PERFORMANCE}. See [Block Volume Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm) for more information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageVolumePerformanceMode")
    private final StorageVolumePerformanceMode storageVolumePerformanceMode;

    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code HIGH_PERFORMANCE}. See [Block Volume Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm) for more information.
     *
     * @return the value
     **/
    public StorageVolumePerformanceMode getStorageVolumePerformanceMode() {
        return storageVolumePerformanceMode;
    }

    /**
     * The OCID of the subnet the DB system is associated with.
     * **Subnet Restrictions:**
     * - For 1- and 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.16.16/28
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and backup subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet the DB system is associated with.
     * **Subnet Restrictions:**
     * - For 1- and 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.16.16/28
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and backup subnet.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
    private final java.util.List<String> backupNetworkNsgIds;

    /**
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     * @return the value
     **/
    public java.util.List<String> getBackupNetworkNsgIds() {
        return backupNetworkNsgIds;
    }

    /**
     * The hostname for the DB node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname for the DB node.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDataGuardAssociationWithNewDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", storageVolumePerformanceMode=")
                .append(String.valueOf(this.storageVolumePerformanceMode));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataGuardAssociationWithNewDbSystemDetails)) {
            return false;
        }

        CreateDataGuardAssociationWithNewDbSystemDetails other =
                (CreateDataGuardAssociationWithNewDbSystemDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(
                        this.storageVolumePerformanceMode, other.storageVolumePerformanceMode)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.storageVolumePerformanceMode == null
                                ? 43
                                : this.storageVolumePerformanceMode.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkNsgIds == null
                                ? 43
                                : this.backupNetworkNsgIds.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
