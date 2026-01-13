/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for the create Exadata VM cluster on Exascale Infrastructure operation. Applies to
 * Exadata Database Service on Exascale Infrastructure only. <br>
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
        builder = CreateExadbVmClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateExadbVmClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "availabilityDomain",
        "subnetId",
        "backupSubnetId",
        "clusterName",
        "displayName",
        "hostname",
        "domain",
        "sshPublicKeys",
        "licenseModel",
        "timeZone",
        "scanListenerPortTcp",
        "scanListenerPortTcpSsl",
        "privateZoneId",
        "shape",
        "nodeCount",
        "totalECpuCount",
        "enabledECpuCount",
        "vmFileSystemStorage",
        "exascaleDbStorageVaultId",
        "nsgIds",
        "backupNetworkNsgIds",
        "gridImageId",
        "systemVersion",
        "freeformTags",
        "definedTags",
        "securityAttributes",
        "dataCollectionOptions",
        "subscriptionId",
        "shapeAttribute"
    })
    public CreateExadbVmClusterDetails(
            String compartmentId,
            String availabilityDomain,
            String subnetId,
            String backupSubnetId,
            String clusterName,
            String displayName,
            String hostname,
            String domain,
            java.util.List<String> sshPublicKeys,
            LicenseModel licenseModel,
            String timeZone,
            Integer scanListenerPortTcp,
            Integer scanListenerPortTcpSsl,
            String privateZoneId,
            String shape,
            Integer nodeCount,
            Integer totalECpuCount,
            Integer enabledECpuCount,
            ExadbVmClusterStorageDetails vmFileSystemStorage,
            String exascaleDbStorageVaultId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            String gridImageId,
            String systemVersion,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            DataCollectionOptions dataCollectionOptions,
            String subscriptionId,
            ShapeAttribute shapeAttribute) {
        super();
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.backupSubnetId = backupSubnetId;
        this.clusterName = clusterName;
        this.displayName = displayName;
        this.hostname = hostname;
        this.domain = domain;
        this.sshPublicKeys = sshPublicKeys;
        this.licenseModel = licenseModel;
        this.timeZone = timeZone;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
        this.privateZoneId = privateZoneId;
        this.shape = shape;
        this.nodeCount = nodeCount;
        this.totalECpuCount = totalECpuCount;
        this.enabledECpuCount = enabledECpuCount;
        this.vmFileSystemStorage = vmFileSystemStorage;
        this.exascaleDbStorageVaultId = exascaleDbStorageVaultId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.gridImageId = gridImageId;
        this.systemVersion = systemVersion;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.dataCollectionOptions = dataCollectionOptions;
        this.subscriptionId = subscriptionId;
        this.shapeAttribute = shapeAttribute;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
        /**
         * The name of the availability domain in which the Exadata VM cluster on Exascale
         * Infrastructure is located.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain in which the Exadata VM cluster on Exascale
         * Infrastructure is located.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the Exadata VM cluster on Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the Exadata VM cluster on Exascale Infrastructure.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
        private String backupSubnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
         *
         * @param backupSubnetId the value to set
         * @return this builder
         */
        public Builder backupSubnetId(String backupSubnetId) {
            this.backupSubnetId = backupSubnetId;
            this.__explicitlySet__.add("backupSubnetId");
            return this;
        }
        /**
         * The cluster name for Exadata VM cluster on Exascale Infrastructure. The cluster name must
         * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
         * permitted. The cluster name can be no longer than 11 characters and is not case
         * sensitive.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        /**
         * The cluster name for Exadata VM cluster on Exascale Infrastructure. The cluster name must
         * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
         * permitted. The cluster name can be no longer than 11 characters and is not case
         * sensitive.
         *
         * @param clusterName the value to set
         * @return this builder
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }
        /**
         * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name
         * does not need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name
         * does not need to be unique.
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
         * The hostname for the Exadata VM cluster on Exascale Infrastructure. The hostname must
         * begin with an alphabetic character, and can contain alphanumeric characters and hyphens
         * (-). For Exadata systems, the maximum length of the hostname is 12 characters.
         *
         * <p>The maximum length of the combined hostname and domain is 63 characters.
         *
         * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, then the
         * Exadata VM cluster on Exascale Infrastructure will fail to provision.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname for the Exadata VM cluster on Exascale Infrastructure. The hostname must
         * begin with an alphabetic character, and can contain alphanumeric characters and hyphens
         * (-). For Exadata systems, the maximum length of the hostname is 12 characters.
         *
         * <p>The maximum length of the combined hostname and domain is 63 characters.
         *
         * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, then the
         * Exadata VM cluster on Exascale Infrastructure will fail to provision.
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
         * A domain name used for the Exadata VM cluster on Exascale Infrastructure. If the
         * Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the
         * domain name for the subnet is used (do not provide one). Otherwise, provide a valid DNS
         * domain name. Hyphens (-) are not permitted. Applies to Exadata Database Service on
         * Exascale Infrastructure only.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * A domain name used for the Exadata VM cluster on Exascale Infrastructure. If the
         * Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the
         * domain name for the subnet is used (do not provide one). Otherwise, provide a valid DNS
         * domain name. Hyphens (-) are not permitted. Applies to Exadata Database Service on
         * Exascale Infrastructure only.
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
         * The public key portion of one or more key pairs used for SSH access to the Exadata VM
         * cluster on Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the Exadata VM
         * cluster on Exascale Infrastructure.
         *
         * @param sshPublicKeys the value to set
         * @return this builder
         */
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /**
         * The Oracle license model that applies to the Exadata VM cluster on Exascale
         * Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Exadata VM cluster on Exascale
         * Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
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
         * The time zone to use for the Exadata VM cluster on Exascale Infrastructure. For details,
         * see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the Exadata VM cluster on Exascale Infrastructure. For details,
         * see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /** The TCP Single Client Access Name (SCAN) port. The default port is 1521. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
        private Integer scanListenerPortTcp;

        /**
         * The TCP Single Client Access Name (SCAN) port. The default port is 1521.
         *
         * @param scanListenerPortTcp the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            this.scanListenerPortTcp = scanListenerPortTcp;
            this.__explicitlySet__.add("scanListenerPortTcp");
            return this;
        }
        /**
         * The Secured Communication (TCPS) protocol Single Client Access Name (SCAN) port. The
         * default port is 2484.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
        private Integer scanListenerPortTcpSsl;

        /**
         * The Secured Communication (TCPS) protocol Single Client Access Name (SCAN) port. The
         * default port is 2484.
         *
         * @param scanListenerPortTcpSsl the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
            this.__explicitlySet__.add("scanListenerPortTcpSsl");
            return this;
        }
        /** The private zone ID in which you want DNS records to be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateZoneId")
        private String privateZoneId;

        /**
         * The private zone ID in which you want DNS records to be created.
         *
         * @param privateZoneId the value to set
         * @return this builder
         */
        public Builder privateZoneId(String privateZoneId) {
            this.privateZoneId = privateZoneId;
            this.__explicitlySet__.add("privateZoneId");
            return this;
        }
        /** The shape of the Exadata VM cluster on Exascale Infrastructure resource */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the Exadata VM cluster on Exascale Infrastructure resource
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The number of nodes in the Exadata VM cluster on Exascale Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes in the Exadata VM cluster on Exascale Infrastructure.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalECpuCount")
        private Integer totalECpuCount;

        /**
         * The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure.
         *
         * @param totalECpuCount the value to set
         * @return this builder
         */
        public Builder totalECpuCount(Integer totalECpuCount) {
            this.totalECpuCount = totalECpuCount;
            this.__explicitlySet__.add("totalECpuCount");
            return this;
        }
        /** The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("enabledECpuCount")
        private Integer enabledECpuCount;

        /**
         * The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure.
         *
         * @param enabledECpuCount the value to set
         * @return this builder
         */
        public Builder enabledECpuCount(Integer enabledECpuCount) {
            this.enabledECpuCount = enabledECpuCount;
            this.__explicitlySet__.add("enabledECpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmFileSystemStorage")
        private ExadbVmClusterStorageDetails vmFileSystemStorage;

        public Builder vmFileSystemStorage(ExadbVmClusterStorageDetails vmFileSystemStorage) {
            this.vmFileSystemStorage = vmFileSystemStorage;
            this.__explicitlySet__.add("vmFileSystemStorage");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata Database Storage Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exascaleDbStorageVaultId")
        private String exascaleDbStorageVaultId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata Database Storage Vault.
         *
         * @param exascaleDbStorageVaultId the value to set
         * @return this builder
         */
        public Builder exascaleDbStorageVaultId(String exascaleDbStorageVaultId) {
            this.exascaleDbStorageVaultId = exascaleDbStorageVaultId;
            this.__explicitlySet__.add("exascaleDbStorageVaultId");
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
        /**
         * Grid Setup will be done using this grid image id.
         *
         * <p>The grid image ID can be obtained using the API
         * /20160918/giVersions/{majorVersion}/minorVersions?compartmentId=<compartmentId>&shapeFamily=EXADB_XS&availabilityDomain=<AD
         * name>. The list of supported major versions can be obtained using the API
         * /20160918/giVersions?compartmentId=<compartmentId>&shape=ExaDbXS&availabilityDomain=<AD
         * name>
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gridImageId")
        private String gridImageId;

        /**
         * Grid Setup will be done using this grid image id.
         *
         * <p>The grid image ID can be obtained using the API
         * /20160918/giVersions/{majorVersion}/minorVersions?compartmentId=<compartmentId>&shapeFamily=EXADB_XS&availabilityDomain=<AD
         * name>. The list of supported major versions can be obtained using the API
         * /20160918/giVersions?compartmentId=<compartmentId>&shape=ExaDbXS&availabilityDomain=<AD
         * name>
         *
         * @param gridImageId the value to set
         * @return this builder
         */
        public Builder gridImageId(String gridImageId) {
            this.gridImageId = gridImageId;
            this.__explicitlySet__.add("gridImageId");
            return this;
        }
        /** Operating system version of the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
        private String systemVersion;

        /**
         * Operating system version of the image.
         *
         * @param systemVersion the value to set
         * @return this builder
         */
        public Builder systemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            this.__explicitlySet__.add("systemVersion");
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
        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
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
        /**
         * The type of Exascale storage used for Exadata VM cluster. The default is SMART_STORAGE
         * which supports Oracle Database 23ai and later
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeAttribute")
        private ShapeAttribute shapeAttribute;

        /**
         * The type of Exascale storage used for Exadata VM cluster. The default is SMART_STORAGE
         * which supports Oracle Database 23ai and later
         *
         * @param shapeAttribute the value to set
         * @return this builder
         */
        public Builder shapeAttribute(ShapeAttribute shapeAttribute) {
            this.shapeAttribute = shapeAttribute;
            this.__explicitlySet__.add("shapeAttribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExadbVmClusterDetails build() {
            CreateExadbVmClusterDetails model =
                    new CreateExadbVmClusterDetails(
                            this.compartmentId,
                            this.availabilityDomain,
                            this.subnetId,
                            this.backupSubnetId,
                            this.clusterName,
                            this.displayName,
                            this.hostname,
                            this.domain,
                            this.sshPublicKeys,
                            this.licenseModel,
                            this.timeZone,
                            this.scanListenerPortTcp,
                            this.scanListenerPortTcpSsl,
                            this.privateZoneId,
                            this.shape,
                            this.nodeCount,
                            this.totalECpuCount,
                            this.enabledECpuCount,
                            this.vmFileSystemStorage,
                            this.exascaleDbStorageVaultId,
                            this.nsgIds,
                            this.backupNetworkNsgIds,
                            this.gridImageId,
                            this.systemVersion,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes,
                            this.dataCollectionOptions,
                            this.subscriptionId,
                            this.shapeAttribute);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExadbVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("backupSubnetId")) {
                this.backupSubnetId(model.getBackupSubnetId());
            }
            if (model.wasPropertyExplicitlySet("clusterName")) {
                this.clusterName(model.getClusterName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcp")) {
                this.scanListenerPortTcp(model.getScanListenerPortTcp());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcpSsl")) {
                this.scanListenerPortTcpSsl(model.getScanListenerPortTcpSsl());
            }
            if (model.wasPropertyExplicitlySet("privateZoneId")) {
                this.privateZoneId(model.getPrivateZoneId());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("totalECpuCount")) {
                this.totalECpuCount(model.getTotalECpuCount());
            }
            if (model.wasPropertyExplicitlySet("enabledECpuCount")) {
                this.enabledECpuCount(model.getEnabledECpuCount());
            }
            if (model.wasPropertyExplicitlySet("vmFileSystemStorage")) {
                this.vmFileSystemStorage(model.getVmFileSystemStorage());
            }
            if (model.wasPropertyExplicitlySet("exascaleDbStorageVaultId")) {
                this.exascaleDbStorageVaultId(model.getExascaleDbStorageVaultId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkNsgIds")) {
                this.backupNetworkNsgIds(model.getBackupNetworkNsgIds());
            }
            if (model.wasPropertyExplicitlySet("gridImageId")) {
                this.gridImageId(model.getGridImageId());
            }
            if (model.wasPropertyExplicitlySet("systemVersion")) {
                this.systemVersion(model.getSystemVersion());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("shapeAttribute")) {
                this.shapeAttribute(model.getShapeAttribute());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the availability domain in which the Exadata VM cluster on Exascale
     * Infrastructure is located.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain in which the Exadata VM cluster on Exascale
     * Infrastructure is located.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    private final String backupSubnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public String getBackupSubnetId() {
        return backupSubnetId;
    }

    /**
     * The cluster name for Exadata VM cluster on Exascale Infrastructure. The cluster name must
     * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
     * permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    /**
     * The cluster name for Exadata VM cluster on Exascale Infrastructure. The cluster name must
     * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
     * permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     *
     * @return the value
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name does
     * not need to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name does
     * not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The hostname for the Exadata VM cluster on Exascale Infrastructure. The hostname must begin
     * with an alphabetic character, and can contain alphanumeric characters and hyphens (-). For
     * Exadata systems, the maximum length of the hostname is 12 characters.
     *
     * <p>The maximum length of the combined hostname and domain is 63 characters.
     *
     * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, then the
     * Exadata VM cluster on Exascale Infrastructure will fail to provision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname for the Exadata VM cluster on Exascale Infrastructure. The hostname must begin
     * with an alphabetic character, and can contain alphanumeric characters and hyphens (-). For
     * Exadata systems, the maximum length of the hostname is 12 characters.
     *
     * <p>The maximum length of the combined hostname and domain is 63 characters.
     *
     * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, then the
     * Exadata VM cluster on Exascale Infrastructure will fail to provision.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * A domain name used for the Exadata VM cluster on Exascale Infrastructure. If the
     * Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the
     * domain name for the subnet is used (do not provide one). Otherwise, provide a valid DNS
     * domain name. Hyphens (-) are not permitted. Applies to Exadata Database Service on Exascale
     * Infrastructure only.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * A domain name used for the Exadata VM cluster on Exascale Infrastructure. If the
     * Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the
     * domain name for the subnet is used (do not provide one). Otherwise, provide a valid DNS
     * domain name. Hyphens (-) are not permitted. Applies to Exadata Database Service on Exascale
     * Infrastructure only.
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the Exadata VM cluster
     * on Exascale Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the Exadata VM cluster
     * on Exascale Infrastructure.
     *
     * @return the value
     */
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure.
     * The default is BRING_YOUR_OWN_LICENSE.
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
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure.
     * The default is BRING_YOUR_OWN_LICENSE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure.
     * The default is BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The time zone to use for the Exadata VM cluster on Exascale Infrastructure. For details, see
     * [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the Exadata VM cluster on Exascale Infrastructure. For details, see
     * [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /** The TCP Single Client Access Name (SCAN) port. The default port is 1521. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
    private final Integer scanListenerPortTcp;

    /**
     * The TCP Single Client Access Name (SCAN) port. The default port is 1521.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcp() {
        return scanListenerPortTcp;
    }

    /**
     * The Secured Communication (TCPS) protocol Single Client Access Name (SCAN) port. The default
     * port is 2484.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
    private final Integer scanListenerPortTcpSsl;

    /**
     * The Secured Communication (TCPS) protocol Single Client Access Name (SCAN) port. The default
     * port is 2484.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcpSsl() {
        return scanListenerPortTcpSsl;
    }

    /** The private zone ID in which you want DNS records to be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateZoneId")
    private final String privateZoneId;

    /**
     * The private zone ID in which you want DNS records to be created.
     *
     * @return the value
     */
    public String getPrivateZoneId() {
        return privateZoneId;
    }

    /** The shape of the Exadata VM cluster on Exascale Infrastructure resource */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the Exadata VM cluster on Exascale Infrastructure resource
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The number of nodes in the Exadata VM cluster on Exascale Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes in the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalECpuCount")
    private final Integer totalECpuCount;

    /**
     * The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public Integer getTotalECpuCount() {
        return totalECpuCount;
    }

    /** The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("enabledECpuCount")
    private final Integer enabledECpuCount;

    /**
     * The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public Integer getEnabledECpuCount() {
        return enabledECpuCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vmFileSystemStorage")
    private final ExadbVmClusterStorageDetails vmFileSystemStorage;

    public ExadbVmClusterStorageDetails getVmFileSystemStorage() {
        return vmFileSystemStorage;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Database Storage Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exascaleDbStorageVaultId")
    private final String exascaleDbStorageVaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Database Storage Vault.
     *
     * @return the value
     */
    public String getExascaleDbStorageVaultId() {
        return exascaleDbStorageVaultId;
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

    /**
     * Grid Setup will be done using this grid image id.
     *
     * <p>The grid image ID can be obtained using the API
     * /20160918/giVersions/{majorVersion}/minorVersions?compartmentId=<compartmentId>&shapeFamily=EXADB_XS&availabilityDomain=<AD
     * name>. The list of supported major versions can be obtained using the API
     * /20160918/giVersions?compartmentId=<compartmentId>&shape=ExaDbXS&availabilityDomain=<AD name>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gridImageId")
    private final String gridImageId;

    /**
     * Grid Setup will be done using this grid image id.
     *
     * <p>The grid image ID can be obtained using the API
     * /20160918/giVersions/{majorVersion}/minorVersions?compartmentId=<compartmentId>&shapeFamily=EXADB_XS&availabilityDomain=<AD
     * name>. The list of supported major versions can be obtained using the API
     * /20160918/giVersions?compartmentId=<compartmentId>&shape=ExaDbXS&availabilityDomain=<AD name>
     *
     * @return the value
     */
    public String getGridImageId() {
        return gridImageId;
    }

    /** Operating system version of the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
    private final String systemVersion;

    /**
     * Operating system version of the image.
     *
     * @return the value
     */
    public String getSystemVersion() {
        return systemVersion;
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

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
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

    /**
     * The type of Exascale storage used for Exadata VM cluster. The default is SMART_STORAGE which
     * supports Oracle Database 23ai and later
     */
    public enum ShapeAttribute implements com.oracle.bmc.http.internal.BmcEnum {
        SmartStorage("SMART_STORAGE"),
        BlockStorage("BLOCK_STORAGE"),
        ;

        private final String value;
        private static java.util.Map<String, ShapeAttribute> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeAttribute v : ShapeAttribute.values()) {
                map.put(v.getValue(), v);
            }
        }

        ShapeAttribute(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeAttribute create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ShapeAttribute: " + key);
        }
    };
    /**
     * The type of Exascale storage used for Exadata VM cluster. The default is SMART_STORAGE which
     * supports Oracle Database 23ai and later
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeAttribute")
    private final ShapeAttribute shapeAttribute;

    /**
     * The type of Exascale storage used for Exadata VM cluster. The default is SMART_STORAGE which
     * supports Oracle Database 23ai and later
     *
     * @return the value
     */
    public ShapeAttribute getShapeAttribute() {
        return shapeAttribute;
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
        sb.append("CreateExadbVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", backupSubnetId=").append(String.valueOf(this.backupSubnetId));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", scanListenerPortTcp=").append(String.valueOf(this.scanListenerPortTcp));
        sb.append(", scanListenerPortTcpSsl=").append(String.valueOf(this.scanListenerPortTcpSsl));
        sb.append(", privateZoneId=").append(String.valueOf(this.privateZoneId));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", totalECpuCount=").append(String.valueOf(this.totalECpuCount));
        sb.append(", enabledECpuCount=").append(String.valueOf(this.enabledECpuCount));
        sb.append(", vmFileSystemStorage=").append(String.valueOf(this.vmFileSystemStorage));
        sb.append(", exascaleDbStorageVaultId=")
                .append(String.valueOf(this.exascaleDbStorageVaultId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", gridImageId=").append(String.valueOf(this.gridImageId));
        sb.append(", systemVersion=").append(String.valueOf(this.systemVersion));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", shapeAttribute=").append(String.valueOf(this.shapeAttribute));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExadbVmClusterDetails)) {
            return false;
        }

        CreateExadbVmClusterDetails other = (CreateExadbVmClusterDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.backupSubnetId, other.backupSubnetId)
                && java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.scanListenerPortTcp, other.scanListenerPortTcp)
                && java.util.Objects.equals(
                        this.scanListenerPortTcpSsl, other.scanListenerPortTcpSsl)
                && java.util.Objects.equals(this.privateZoneId, other.privateZoneId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.totalECpuCount, other.totalECpuCount)
                && java.util.Objects.equals(this.enabledECpuCount, other.enabledECpuCount)
                && java.util.Objects.equals(this.vmFileSystemStorage, other.vmFileSystemStorage)
                && java.util.Objects.equals(
                        this.exascaleDbStorageVaultId, other.exascaleDbStorageVaultId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(this.gridImageId, other.gridImageId)
                && java.util.Objects.equals(this.systemVersion, other.systemVersion)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.shapeAttribute, other.shapeAttribute)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSubnetId == null ? 43 : this.backupSubnetId.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcp == null
                                ? 43
                                : this.scanListenerPortTcp.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcpSsl == null
                                ? 43
                                : this.scanListenerPortTcpSsl.hashCode());
        result =
                (result * PRIME)
                        + (this.privateZoneId == null ? 43 : this.privateZoneId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalECpuCount == null ? 43 : this.totalECpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.enabledECpuCount == null ? 43 : this.enabledECpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.vmFileSystemStorage == null
                                ? 43
                                : this.vmFileSystemStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.exascaleDbStorageVaultId == null
                                ? 43
                                : this.exascaleDbStorageVaultId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkNsgIds == null
                                ? 43
                                : this.backupNetworkNsgIds.hashCode());
        result = (result * PRIME) + (this.gridImageId == null ? 43 : this.gridImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVersion == null ? 43 : this.systemVersion.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.shapeAttribute == null ? 43 : this.shapeAttribute.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
