/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for creating a Data Guard association for a virtual machine DB system
 * database. For this type of DB system database, the {@code creationType} should be {@code
 * NewDbSystem}. A new DB system will be launched to create the standby database.
 *
 * <p>To create a Data Guard association for a database in a bare metal or Exadata DB system, use
 * the {@link
 * #createDataGuardAssociationToExistingDbSystemDetails(CreateDataGuardAssociationToExistingDbSystemDetailsRequest)
 * createDataGuardAssociationToExistingDbSystemDetails} subtype instead. <br>
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
        builder = CreateDataGuardAssociationWithNewDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "creationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
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

        @com.fasterxml.jackson.annotation.JsonProperty("sourceEncryptionKeyLocationDetails")
        private EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails;

        public Builder sourceEncryptionKeyLocationDetails(
                EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails) {
            this.sourceEncryptionKeyLocationDetails = sourceEncryptionKeyLocationDetails;
            this.__explicitlySet__.add("sourceEncryptionKeyLocationDetails");
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
         * The user-friendly name of the DB system that will contain the the standby database. The
         * display name does not have to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name of the DB system that will contain the the standby database. The
         * display name does not have to be unique.
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
         * The name of the availability domain that the standby database DB system will be located
         * in. For example- "Uocm:PHX-AD-1".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the standby database DB system will be located
         * in. For example- "Uocm:PHX-AD-1".
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The virtual machine DB system shape to launch for the standby database in the Data Guard
         * association. The shape determines the number of CPU cores and the amount of memory
         * available for the DB system. Only virtual machine shapes are valid options. If you do not
         * supply this parameter, the default shape is the shape of the primary DB system.
         *
         * <p>To get a list of all shapes, use the {@link
         * #listDbSystemShapes(ListDbSystemShapesRequest) listDbSystemShapes} operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The virtual machine DB system shape to launch for the standby database in the Data Guard
         * association. The shape determines the number of CPU cores and the amount of memory
         * available for the DB system. Only virtual machine shapes are valid options. If you do not
         * supply this parameter, the default shape is the shape of the primary DB system.
         *
         * <p>To get a list of all shapes, use the {@link
         * #listDbSystemShapes(ListDbSystemShapesRequest) listDbSystemShapes} operation.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The number of CPU cores available for AMD-based virtual machine DB systems. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores available for AMD-based virtual machine DB systems.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The block storage volume performance level. Valid values are {@code BALANCED} and {@code
         * HIGH_PERFORMANCE}. See [Block Volume
         * Performance](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm)
         * for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageVolumePerformanceMode")
        private StorageVolumePerformanceMode storageVolumePerformanceMode;

        /**
         * The block storage volume performance level. Valid values are {@code BALANCED} and {@code
         * HIGH_PERFORMANCE}. See [Block Volume
         * Performance](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm)
         * for more information.
         *
         * @param storageVolumePerformanceMode the value to set
         * @return this builder
         */
        public Builder storageVolumePerformanceMode(
                StorageVolumePerformanceMode storageVolumePerformanceMode) {
            this.storageVolumePerformanceMode = storageVolumePerformanceMode;
            this.__explicitlySet__.add("storageVolumePerformanceMode");
            return this;
        }
        /**
         * The compute model for Base Database Service. This is required if using the {@code
         * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify
         * {@code computeModel} to a non-null value. The ECPU compute model is the recommended
         * model, and the OCPU compute model is legacy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private ComputeModel computeModel;

        /**
         * The compute model for Base Database Service. This is required if using the {@code
         * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify
         * {@code computeModel} to a non-null value. The ECPU compute model is the recommended
         * model, and the OCPU compute model is legacy.
         *
         * @param computeModel the value to set
         * @return this builder
         */
        public Builder computeModel(ComputeModel computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
            return this;
        }
        /** The number of compute servers for the DB system. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Integer computeCount;

        /**
         * The number of compute servers for the DB system.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Integer computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /**
         * The number of nodes to launch for the DB system of the standby in the Data Guard
         * association. For a 2-node RAC virtual machine DB system, specify either 1 or 2. If you do
         * not supply this parameter, the default is the node count of the primary DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes to launch for the DB system of the standby in the Data Guard
         * association. For a 2-node RAC virtual machine DB system, specify either 1 or 2. If you do
         * not supply this parameter, the default is the node count of the primary DB system.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /**
         * The OCID of the subnet the DB system is associated with. **Subnet Restrictions:** - For
         * 1- and 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.16.16/28
         *
         * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
         * instance. Specifying an overlapping subnet will cause the private interconnect to
         * malfunction. This restriction applies to both the client subnet and backup subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet the DB system is associated with. **Subnet Restrictions:** - For
         * 1- and 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.16.16/28
         *
         * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
         * instance. Specifying an overlapping subnet will cause the private interconnect to
         * malfunction. This restriction applies to both the client subnet and backup subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * network security groups (NSGs) to which this resource belongs. Setting this to an empty
         * list removes all resources from all NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds
         * restrictions:** - A network security group (NSG) is optional for Autonomous AI Databases
         * with private access. The nsgIds list can be empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * network security groups (NSGs) to which this resource belongs. Setting this to an empty
         * list removes all resources from all NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds
         * restrictions:** - A network security group (NSG) is optional for Autonomous AI Databases
         * with private access. The nsgIds list can be empty.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * A list of the
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * network security groups (NSGs) that the backup network of this DB system belongs to.
         * Setting this to an empty array after the list is created removes the resource from all
         * NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         * Applicable only to Exadata systems.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
        private java.util.List<String> backupNetworkNsgIds;

        /**
         * A list of the
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * network security groups (NSGs) that the backup network of this DB system belongs to.
         * Setting this to an empty array after the list is created removes the resource from all
         * NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         * Applicable only to Exadata systems.
         *
         * @param backupNetworkNsgIds the value to set
         * @return this builder
         */
        public Builder backupNetworkNsgIds(java.util.List<String> backupNetworkNsgIds) {
            this.backupNetworkNsgIds = backupNetworkNsgIds;
            this.__explicitlySet__.add("backupNetworkNsgIds");
            return this;
        }
        /** The hostname for the DB node. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname for the DB node.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * A domain name used for the DB system. If the Oracle-provided Internet and VCN Resolver is
         * enabled for the specified subnet, the domain name for the subnet is used (do not provide
         * one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * A domain name used for the DB system. If the Oracle-provided Internet and VCN Resolver is
         * enabled for the specified subnet, the domain name for the subnet is used (do not provide
         * one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
         *
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * The time zone of the dataguard standby DB system. For details, see [DB System Time
         * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone of the dataguard standby DB system. For details, see [DB System Time
         * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * A Fault Domain is a grouping of hardware and infrastructure within an availability
         * domain. Fault Domains let you distribute your instances so that they are not on the same
         * physical hardware within a single availability domain. A hardware failure or maintenance
         * that affects one Fault Domain does not affect DB systems in other Fault Domains.
         *
         * <p>If you do not specify the Fault Domain, the system selects one for you. To change the
         * Fault Domain for a DB system, terminate it and launch a new DB system in the preferred
         * Fault Domain.
         *
         * <p>If the node count is greater than 1, you can specify which Fault Domains these nodes
         * will be distributed into. The system assigns your nodes automatically to the Fault
         * Domains you specify so that no Fault Domain contains more than one node.
         *
         * <p>To get a list of Fault Domains, use the {@link
         * #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the Identity
         * and Access Management Service API.
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
        private java.util.List<String> faultDomains;

        /**
         * A Fault Domain is a grouping of hardware and infrastructure within an availability
         * domain. Fault Domains let you distribute your instances so that they are not on the same
         * physical hardware within a single availability domain. A hardware failure or maintenance
         * that affects one Fault Domain does not affect DB systems in other Fault Domains.
         *
         * <p>If you do not specify the Fault Domain, the system selects one for you. To change the
         * Fault Domain for a DB system, terminate it and launch a new DB system in the preferred
         * Fault Domain.
         *
         * <p>If the node count is greater than 1, you can specify which Fault Domains these nodes
         * will be distributed into. The system assigns your nodes automatically to the Fault
         * Domains you specify so that no Fault Domain contains more than one node.
         *
         * <p>To get a list of Fault Domains, use the {@link
         * #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the Identity
         * and Access Management Service API.
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         *
         * @param faultDomains the value to set
         * @return this builder
         */
        public Builder faultDomains(java.util.List<String> faultDomains) {
            this.faultDomains = faultDomains;
            this.__explicitlySet__.add("faultDomains");
            return this;
        }
        /**
         * The IPv4 address from the provided OCI subnet which needs to be assigned to the VNIC. If
         * not provided, it will be auto-assigned with an available IPv4 address from the subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * The IPv4 address from the provided OCI subnet which needs to be assigned to the VNIC. If
         * not provided, it will be auto-assigned with an available IPv4 address from the subnet.
         *
         * @param privateIp the value to set
         * @return this builder
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /**
         * The IPv6 address from the provided OCI subnet which needs to be assigned to the VNIC. If
         * not provided, it will be auto-assigned with an available IPv6 address from the subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIpV6")
        private String privateIpV6;

        /**
         * The IPv6 address from the provided OCI subnet which needs to be assigned to the VNIC. If
         * not provided, it will be auto-assigned with an available IPv6 address from the subnet.
         *
         * @param privateIpV6 the value to set
         * @return this builder
         */
        public Builder privateIpV6(String privateIpV6) {
            this.privateIpV6 = privateIpV6;
            this.__explicitlySet__.add("privateIpV6");
            return this;
        }
        /**
         * The Oracle license model that applies to all the databases on the dataguard standby DB
         * system. The default is LICENSE_INCLUDED. Bring your own license (BYOL) allows you to
         * select the DB edition using the optional parameter, for Autonomous AI Database
         * Serverless.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to all the databases on the dataguard standby DB
         * system. The default is LICENSE_INCLUDED. Bring your own license (BYOL) allows you to
         * select the DB edition using the optional parameter, for Autonomous AI Database
         * Serverless.
         *
         * @param licenseModel the value to set
         * @return this builder
         */
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemFreeformTags")
        private java.util.Map<String, String> dbSystemFreeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param dbSystemFreeformTags the value to set
         * @return this builder
         */
        public Builder dbSystemFreeformTags(java.util.Map<String, String> dbSystemFreeformTags) {
            this.dbSystemFreeformTags = dbSystemFreeformTags;
            this.__explicitlySet__.add("dbSystemFreeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemDefinedTags")
        private java.util.Map<String, java.util.Map<String, Object>> dbSystemDefinedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param dbSystemDefinedTags the value to set
         * @return this builder
         */
        public Builder dbSystemDefinedTags(
                java.util.Map<String, java.util.Map<String, Object>> dbSystemDefinedTags) {
            this.dbSystemDefinedTags = dbSystemDefinedTags;
            this.__explicitlySet__.add("dbSystemDefinedTags");
            return this;
        }
        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemSecurityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> dbSystemSecurityAttributes;

        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         *
         * @param dbSystemSecurityAttributes the value to set
         * @return this builder
         */
        public Builder dbSystemSecurityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> dbSystemSecurityAttributes) {
            this.dbSystemSecurityAttributes = dbSystemSecurityAttributes;
            this.__explicitlySet__.add("dbSystemSecurityAttributes");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseFreeformTags")
        private java.util.Map<String, String> databaseFreeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param databaseFreeformTags the value to set
         * @return this builder
         */
        public Builder databaseFreeformTags(java.util.Map<String, String> databaseFreeformTags) {
            this.databaseFreeformTags = databaseFreeformTags;
            this.__explicitlySet__.add("databaseFreeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseDefinedTags")
        private java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param databaseDefinedTags the value to set
         * @return this builder
         */
        public Builder databaseDefinedTags(
                java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags) {
            this.databaseDefinedTags = databaseDefinedTags;
            this.__explicitlySet__.add("databaseDefinedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group of the Exadata Infrastructure or Db System.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group of the Exadata Infrastructure or Db System.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataGuardAssociationWithNewDbSystemDetails build() {
            CreateDataGuardAssociationWithNewDbSystemDetails model =
                    new CreateDataGuardAssociationWithNewDbSystemDetails(
                            this.databaseSoftwareImageId,
                            this.databaseAdminPassword,
                            this.sourceEncryptionKeyLocationDetails,
                            this.protectionMode,
                            this.transportType,
                            this.isActiveDataGuardEnabled,
                            this.peerDbUniqueName,
                            this.peerSidPrefix,
                            this.displayName,
                            this.availabilityDomain,
                            this.shape,
                            this.cpuCoreCount,
                            this.storageVolumePerformanceMode,
                            this.computeModel,
                            this.computeCount,
                            this.nodeCount,
                            this.subnetId,
                            this.nsgIds,
                            this.backupNetworkNsgIds,
                            this.hostname,
                            this.domain,
                            this.timeZone,
                            this.faultDomains,
                            this.privateIp,
                            this.privateIpV6,
                            this.licenseModel,
                            this.dbSystemFreeformTags,
                            this.dbSystemDefinedTags,
                            this.dbSystemSecurityAttributes,
                            this.databaseFreeformTags,
                            this.databaseDefinedTags,
                            this.dataCollectionOptions,
                            this.clusterPlacementGroupId,
                            this.subscriptionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataGuardAssociationWithNewDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageId")) {
                this.databaseSoftwareImageId(model.getDatabaseSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("databaseAdminPassword")) {
                this.databaseAdminPassword(model.getDatabaseAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("sourceEncryptionKeyLocationDetails")) {
                this.sourceEncryptionKeyLocationDetails(
                        model.getSourceEncryptionKeyLocationDetails());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
            }
            if (model.wasPropertyExplicitlySet("isActiveDataGuardEnabled")) {
                this.isActiveDataGuardEnabled(model.getIsActiveDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("peerDbUniqueName")) {
                this.peerDbUniqueName(model.getPeerDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("peerSidPrefix")) {
                this.peerSidPrefix(model.getPeerSidPrefix());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("storageVolumePerformanceMode")) {
                this.storageVolumePerformanceMode(model.getStorageVolumePerformanceMode());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkNsgIds")) {
                this.backupNetworkNsgIds(model.getBackupNetworkNsgIds());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("faultDomains")) {
                this.faultDomains(model.getFaultDomains());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("privateIpV6")) {
                this.privateIpV6(model.getPrivateIpV6());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("dbSystemFreeformTags")) {
                this.dbSystemFreeformTags(model.getDbSystemFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("dbSystemDefinedTags")) {
                this.dbSystemDefinedTags(model.getDbSystemDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dbSystemSecurityAttributes")) {
                this.dbSystemSecurityAttributes(model.getDbSystemSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("databaseFreeformTags")) {
                this.databaseFreeformTags(model.getDatabaseFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("databaseDefinedTags")) {
                this.databaseDefinedTags(model.getDatabaseDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
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

    @Deprecated
    public CreateDataGuardAssociationWithNewDbSystemDetails(
            String databaseSoftwareImageId,
            String databaseAdminPassword,
            EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails,
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
            ComputeModel computeModel,
            Integer computeCount,
            Integer nodeCount,
            String subnetId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            String hostname,
            String domain,
            String timeZone,
            java.util.List<String> faultDomains,
            String privateIp,
            String privateIpV6,
            LicenseModel licenseModel,
            java.util.Map<String, String> dbSystemFreeformTags,
            java.util.Map<String, java.util.Map<String, Object>> dbSystemDefinedTags,
            java.util.Map<String, java.util.Map<String, Object>> dbSystemSecurityAttributes,
            java.util.Map<String, String> databaseFreeformTags,
            java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags,
            DataCollectionOptions dataCollectionOptions,
            String clusterPlacementGroupId,
            String subscriptionId) {
        super(
                databaseSoftwareImageId,
                databaseAdminPassword,
                sourceEncryptionKeyLocationDetails,
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
        this.computeModel = computeModel;
        this.computeCount = computeCount;
        this.nodeCount = nodeCount;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.hostname = hostname;
        this.domain = domain;
        this.timeZone = timeZone;
        this.faultDomains = faultDomains;
        this.privateIp = privateIp;
        this.privateIpV6 = privateIpV6;
        this.licenseModel = licenseModel;
        this.dbSystemFreeformTags = dbSystemFreeformTags;
        this.dbSystemDefinedTags = dbSystemDefinedTags;
        this.dbSystemSecurityAttributes = dbSystemSecurityAttributes;
        this.databaseFreeformTags = databaseFreeformTags;
        this.databaseDefinedTags = databaseDefinedTags;
        this.dataCollectionOptions = dataCollectionOptions;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.subscriptionId = subscriptionId;
    }

    /**
     * The user-friendly name of the DB system that will contain the the standby database. The
     * display name does not have to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name of the DB system that will contain the the standby database. The
     * display name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The name of the availability domain that the standby database DB system will be located in.
     * For example- "Uocm:PHX-AD-1".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the standby database DB system will be located in.
     * For example- "Uocm:PHX-AD-1".
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The virtual machine DB system shape to launch for the standby database in the Data Guard
     * association. The shape determines the number of CPU cores and the amount of memory available
     * for the DB system. Only virtual machine shapes are valid options. If you do not supply this
     * parameter, the default shape is the shape of the primary DB system.
     *
     * <p>To get a list of all shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest)
     * listDbSystemShapes} operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The virtual machine DB system shape to launch for the standby database in the Data Guard
     * association. The shape determines the number of CPU cores and the amount of memory available
     * for the DB system. Only virtual machine shapes are valid options. If you do not supply this
     * parameter, the default shape is the shape of the primary DB system.
     *
     * <p>To get a list of all shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest)
     * listDbSystemShapes} operation.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The number of CPU cores available for AMD-based virtual machine DB systems. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores available for AMD-based virtual machine DB systems.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code
     * HIGH_PERFORMANCE}. See [Block Volume
     * Performance](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm)
     * for more information.
     */
    public enum StorageVolumePerformanceMode implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code
     * HIGH_PERFORMANCE}. See [Block Volume
     * Performance](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm)
     * for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageVolumePerformanceMode")
    private final StorageVolumePerformanceMode storageVolumePerformanceMode;

    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code
     * HIGH_PERFORMANCE}. See [Block Volume
     * Performance](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm)
     * for more information.
     *
     * @return the value
     */
    public StorageVolumePerformanceMode getStorageVolumePerformanceMode() {
        return storageVolumePerformanceMode;
    }

    /**
     * The compute model for Base Database Service. This is required if using the {@code
     * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code
     * computeModel} to a non-null value. The ECPU compute model is the recommended model, and the
     * OCPU compute model is legacy.
     */
    public enum ComputeModel implements com.oracle.bmc.http.internal.BmcEnum {
        Ecpu("ECPU"),
        Ocpu("OCPU"),
        ;

        private final String value;
        private static java.util.Map<String, ComputeModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeModel v : ComputeModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        ComputeModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ComputeModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ComputeModel: " + key);
        }
    };
    /**
     * The compute model for Base Database Service. This is required if using the {@code
     * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code
     * computeModel} to a non-null value. The ECPU compute model is the recommended model, and the
     * OCPU compute model is legacy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final ComputeModel computeModel;

    /**
     * The compute model for Base Database Service. This is required if using the {@code
     * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code
     * computeModel} to a non-null value. The ECPU compute model is the recommended model, and the
     * OCPU compute model is legacy.
     *
     * @return the value
     */
    public ComputeModel getComputeModel() {
        return computeModel;
    }

    /** The number of compute servers for the DB system. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Integer computeCount;

    /**
     * The number of compute servers for the DB system.
     *
     * @return the value
     */
    public Integer getComputeCount() {
        return computeCount;
    }

    /**
     * The number of nodes to launch for the DB system of the standby in the Data Guard association.
     * For a 2-node RAC virtual machine DB system, specify either 1 or 2. If you do not supply this
     * parameter, the default is the node count of the primary DB system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes to launch for the DB system of the standby in the Data Guard association.
     * For a 2-node RAC virtual machine DB system, specify either 1 or 2. If you do not supply this
     * parameter, the default is the node count of the primary DB system.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * The OCID of the subnet the DB system is associated with. **Subnet Restrictions:** - For 1-
     * and 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.16.16/28
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and backup subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet the DB system is associated with. **Subnet Restrictions:** - For 1-
     * and 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.16.16/28
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and backup subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * for the network security groups (NSGs) to which this resource belongs. Setting this to an
     * empty list removes all resources from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:** - A network security group (NSG) is optional for Autonomous AI
     * Databases with private access. The nsgIds list can be empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * for the network security groups (NSGs) to which this resource belongs. Setting this to an
     * empty list removes all resources from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:** - A network security group (NSG) is optional for Autonomous AI
     * Databases with private access. The nsgIds list can be empty.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * of the network security groups (NSGs) that the backup network of this DB system belongs to.
     * Setting this to an empty array after the list is created removes the resource from all NSGs.
     * For more information about NSGs, see [Security
     * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable
     * only to Exadata systems.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
    private final java.util.List<String> backupNetworkNsgIds;

    /**
     * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * of the network security groups (NSGs) that the backup network of this DB system belongs to.
     * Setting this to an empty array after the list is created removes the resource from all NSGs.
     * For more information about NSGs, see [Security
     * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable
     * only to Exadata systems.
     *
     * @return the value
     */
    public java.util.List<String> getBackupNetworkNsgIds() {
        return backupNetworkNsgIds;
    }

    /** The hostname for the DB node. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname for the DB node.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * A domain name used for the DB system. If the Oracle-provided Internet and VCN Resolver is
     * enabled for the specified subnet, the domain name for the subnet is used (do not provide
     * one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * A domain name used for the DB system. If the Oracle-provided Internet and VCN Resolver is
     * enabled for the specified subnet, the domain name for the subnet is used (do not provide
     * one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /**
     * The time zone of the dataguard standby DB system. For details, see [DB System Time
     * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone of the dataguard standby DB system. For details, see [DB System Time
     * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * A Fault Domain is a grouping of hardware and infrastructure within an availability domain.
     * Fault Domains let you distribute your instances so that they are not on the same physical
     * hardware within a single availability domain. A hardware failure or maintenance that affects
     * one Fault Domain does not affect DB systems in other Fault Domains.
     *
     * <p>If you do not specify the Fault Domain, the system selects one for you. To change the
     * Fault Domain for a DB system, terminate it and launch a new DB system in the preferred Fault
     * Domain.
     *
     * <p>If the node count is greater than 1, you can specify which Fault Domains these nodes will
     * be distributed into. The system assigns your nodes automatically to the Fault Domains you
     * specify so that no Fault Domain contains more than one node.
     *
     * <p>To get a list of Fault Domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
    private final java.util.List<String> faultDomains;

    /**
     * A Fault Domain is a grouping of hardware and infrastructure within an availability domain.
     * Fault Domains let you distribute your instances so that they are not on the same physical
     * hardware within a single availability domain. A hardware failure or maintenance that affects
     * one Fault Domain does not affect DB systems in other Fault Domains.
     *
     * <p>If you do not specify the Fault Domain, the system selects one for you. To change the
     * Fault Domain for a DB system, terminate it and launch a new DB system in the preferred Fault
     * Domain.
     *
     * <p>If the node count is greater than 1, you can specify which Fault Domains these nodes will
     * be distributed into. The system assigns your nodes automatically to the Fault Domains you
     * specify so that no Fault Domain contains more than one node.
     *
     * <p>To get a list of Fault Domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     *
     * @return the value
     */
    public java.util.List<String> getFaultDomains() {
        return faultDomains;
    }

    /**
     * The IPv4 address from the provided OCI subnet which needs to be assigned to the VNIC. If not
     * provided, it will be auto-assigned with an available IPv4 address from the subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * The IPv4 address from the provided OCI subnet which needs to be assigned to the VNIC. If not
     * provided, it will be auto-assigned with an available IPv4 address from the subnet.
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * The IPv6 address from the provided OCI subnet which needs to be assigned to the VNIC. If not
     * provided, it will be auto-assigned with an available IPv6 address from the subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIpV6")
    private final String privateIpV6;

    /**
     * The IPv6 address from the provided OCI subnet which needs to be assigned to the VNIC. If not
     * provided, it will be auto-assigned with an available IPv6 address from the subnet.
     *
     * @return the value
     */
    public String getPrivateIpV6() {
        return privateIpV6;
    }

    /**
     * The Oracle license model that applies to all the databases on the dataguard standby DB
     * system. The default is LICENSE_INCLUDED. Bring your own license (BYOL) allows you to select
     * the DB edition using the optional parameter, for Autonomous AI Database Serverless.
     */
    public enum LicenseModel implements com.oracle.bmc.http.internal.BmcEnum {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),
        ;

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LicenseModel: " + key);
        }
    };
    /**
     * The Oracle license model that applies to all the databases on the dataguard standby DB
     * system. The default is LICENSE_INCLUDED. Bring your own license (BYOL) allows you to select
     * the DB edition using the optional parameter, for Autonomous AI Database Serverless.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to all the databases on the dataguard standby DB
     * system. The default is LICENSE_INCLUDED. Bring your own license (BYOL) allows you to select
     * the DB edition using the optional parameter, for Autonomous AI Database Serverless.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemFreeformTags")
    private final java.util.Map<String, String> dbSystemFreeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDbSystemFreeformTags() {
        return dbSystemFreeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemDefinedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> dbSystemDefinedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDbSystemDefinedTags() {
        return dbSystemDefinedTags;
    }

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemSecurityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> dbSystemSecurityAttributes;

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDbSystemSecurityAttributes() {
        return dbSystemSecurityAttributes;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseFreeformTags")
    private final java.util.Map<String, String> databaseFreeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDatabaseFreeformTags() {
        return databaseFreeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDefinedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDatabaseDefinedTags() {
        return databaseDefinedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group of the Exadata Infrastructure or Db System.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group of the Exadata Infrastructure or Db System.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
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
        sb.append("CreateDataGuardAssociationWithNewDbSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", storageVolumePerformanceMode=")
                .append(String.valueOf(this.storageVolumePerformanceMode));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", faultDomains=").append(String.valueOf(this.faultDomains));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", privateIpV6=").append(String.valueOf(this.privateIpV6));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", dbSystemFreeformTags=").append(String.valueOf(this.dbSystemFreeformTags));
        sb.append(", dbSystemDefinedTags=").append(String.valueOf(this.dbSystemDefinedTags));
        sb.append(", dbSystemSecurityAttributes=")
                .append(String.valueOf(this.dbSystemSecurityAttributes));
        sb.append(", databaseFreeformTags=").append(String.valueOf(this.databaseFreeformTags));
        sb.append(", databaseDefinedTags=").append(String.valueOf(this.databaseDefinedTags));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
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
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.faultDomains, other.faultDomains)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.privateIpV6, other.privateIpV6)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.dbSystemFreeformTags, other.dbSystemFreeformTags)
                && java.util.Objects.equals(this.dbSystemDefinedTags, other.dbSystemDefinedTags)
                && java.util.Objects.equals(
                        this.dbSystemSecurityAttributes, other.dbSystemSecurityAttributes)
                && java.util.Objects.equals(this.databaseFreeformTags, other.databaseFreeformTags)
                && java.util.Objects.equals(this.databaseDefinedTags, other.databaseDefinedTags)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && super.equals(other);
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
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkNsgIds == null
                                ? 43
                                : this.backupNetworkNsgIds.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.faultDomains == null ? 43 : this.faultDomains.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result = (result * PRIME) + (this.privateIpV6 == null ? 43 : this.privateIpV6.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemFreeformTags == null
                                ? 43
                                : this.dbSystemFreeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemDefinedTags == null
                                ? 43
                                : this.dbSystemDefinedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemSecurityAttributes == null
                                ? 43
                                : this.dbSystemSecurityAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseFreeformTags == null
                                ? 43
                                : this.databaseFreeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDefinedTags == null
                                ? 43
                                : this.databaseDefinedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        return result;
    }
}
