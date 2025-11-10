/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Base definition for a schema variable, including common metadata such as type, title,
 * description, and validation constraints. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = BaseVariable.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NetworkLoadBalancerId.class,
            name = "OCI_LOADBALANCER_NETWORKLOADBALANCER_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = FileVariable.class, name = "FILE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NatGatewayVariable.class,
            name = "OCI_CORE_NATGATEWAY_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = EnumVariable.class, name = "ENUM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstanceShapeVariable.class,
            name = "OCI_CORE_INSTANCESHAPE_NAME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AutonomousContainerDbVariable.class,
            name = "OCI_DATABASE_AUTONOMOUSCONTAINERDATABASE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataBaseVariable.class,
            name = "OCI_DATABASE_DATABASE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AutonomousDatabaseVersionVariable.class,
            name = "OCI_DATABASE_AUTONOMOUSDATABASEVERSION_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RegionVariable.class,
            name = "OCI_IDENTITY_REGION_NAME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VolumeId.class,
            name = "OCI_CORE_VOLUME_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VcnNetworkSecurityGroupId.class,
            name = "OCI_CORE_VCN_NETWORKSECURITYGROUP_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = IntegerVariable.class,
            name = "INTEGER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseDbNodeId.class,
            name = "OCI_DATABASE_DBNODE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MultilineVariable.class,
            name = "TEXT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PasswordVariable.class,
            name = "PASSWORD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ArrayVariable.class,
            name = "ARRAY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ManagementAgents.class,
            name = "OCI_MGMT_AGENT_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VolumeBackupPoliciesVariable.class,
            name = "OCI_BLOCKSTORAGE_POLICIES_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LogAnalyticsScheduledTasks.class,
            name = "OCI_LOGAN_SCHEDULEDTASK_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = KmsVaultVariable.class,
            name = "OCI_KMS_VAULT_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ServiceGatewayVariable.class,
            name = "OCI_CORE_SERVICEGATEWAY_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LogAnalyticsLogEntities.class,
            name = "OCI_LOGAN_LOGENTITY_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VcnSecListId.class,
            name = "OCI_CORE_VCN_SECLIST_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NsgVariable.class,
            name = "OCI_CORE_NSG_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DynamicGroupsVariable.class,
            name = "OCI_IDENTITY_DYNAMICGROUPS_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OdsProjectVariable.class,
            name = "OCI_ODS_PROJECT_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MountTargetsVariable.class,
            name = "OCI_MOUNT_TARGET_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = IdentityDomainVariable.class,
            name = "OCI_IDENTITY_DOMAINS_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ObjectStorageBucketName.class,
            name = "OCI_STORAGE_OBJECTSTORAGE_BUCKET_NAME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MysqlConfigurationId.class,
            name = "OCI_DATABASE_MYSQL_CONFIGURATION_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FileStorageExportSetId.class,
            name = "OCI_STORAGE_FILESTORAGE_EXPORTSET_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = KmsSecretVariable.class,
            name = "OCI_KMS_SECRET_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatetimeVariable.class,
            name = "DATETIME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseDataguardAssociationId.class,
            name = "OCI_DATABASE_DATAGUARDASSOCIATION_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LogAnalyticsEntityTypes.class,
            name = "OCI_LOGAN_ENTITYTYPE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GroupsVariable.class,
            name = "OCI_IDENTITY_GROUPS_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ApmDomainVariable.class,
            name = "OCI_APM_DOMAIN_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AutonomousDataBaseVariable.class,
            name = "OCI_DATABASE_AUTONOMOUSDATABASE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AvailabilityDomainVariable.class,
            name = "OCI_IDENTITY_AVAILABILITYDOMAIN_NAME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = KubernetesVersionsVariable.class,
            name = "OCI_KUBERNETES_VERSIONS_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LoadBalancerVariable.class,
            name = "OCI_LOADBALANCER_LOADBALANCER_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ImageVariable.class,
            name = "OCI_CORE_IMAGE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LoadBalancerReservedIps.class,
            name = "OCI_LOADBALANCER_LOADBALANCER_RESERVEDIPS_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = KmsKeyVariable.class,
            name = "OCI_KMS_KEY_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LogAnalyticsSources.class,
            name = "OCI_LOGAN_SOURCE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseDataGuardId.class,
            name = "OCI_DATABASE_DATAGUARD_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TagVariable.class,
            name = "OCI_IDENTITY_TAG_VALUE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CloudVmClusterId.class,
            name = "OCI_DATABASE_CLOUDVMCLUSTER_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PrivateEndpointVariable.class,
            name = "OCI_RESOURCEMANAGER_PRIVATEENDPOINT_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ContainerClusterVariable.class,
            name = "OCI_CONTAINER_CLUSTER_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MysqlShapeId.class,
            name = "OCI_DATABASE_MYSQL_SHAPE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VcnVariable.class,
            name = "OCI_CORE_VCN_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CompartmentVariable.class,
            name = "OCI_IDENTITY_COMPARTMENT_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FaultDomainVariable.class,
            name = "OCI_IDENTITY_FAULTDOMAIN_NAME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstanceShapeVariableWithFlex.class,
            name = "OCI_CORE_INSTANCESHAPEWITHFLEX_NAME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StringVariable.class,
            name = "STRING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstanceVariable.class,
            name = "OCI_CORE_INSTANCE_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseExadataId.class,
            name = "OCI_DATABASE_EXADATA_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DbHomeVariable.class,
            name = "OCI_DATABASE_DBHOME_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FileStorageFilesystemId.class,
            name = "OCI_STORAGE_FILESTORAGE_FILESYSTEM_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NumberVariable.class,
            name = "NUMBER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SubnetVariable.class,
            name = "OCI_CORE_SUBNET_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SshPublicKeyVariable.class,
            name = "OCI_CORE_SSH_PUBLICKEY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LogAnalyticsLogGroup.class,
            name = "OCI_LOGAN_LOGGROUP_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = BooleanVariable.class,
            name = "BOOLEAN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DbSystemVariable.class,
            name = "OCI_DATABASE_DBSYSTEM_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FileStorageMountTargetId.class,
            name = "OCI_STORAGE_FILESTORAGE_MOUNTTARGET_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseCdbId.class,
            name = "OCI_DATABASE_CDB_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DbHomeVersionVariable.class,
            name = "OCI_DATABASE_DBHOME_DBVERSION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class BaseVariable extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"title", "description", "isRequired", "visible"})
    protected BaseVariable(String title, String description, Boolean isRequired, String visible) {
        super();
        this.title = title;
        this.description = description;
        this.isRequired = isRequired;
        this.visible = visible;
    }

    /** The display name for the variable as shown in the UI. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The display name for the variable as shown in the UI.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /** Detailed information about this variable's purpose and usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed information about this variable's purpose and usage.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Indicates if this input variable is required for stack execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Indicates if this input variable is required for stack execution.
     *
     * @return the value
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /** Hint to control whether this variable is visible. */
    @com.fasterxml.jackson.annotation.JsonProperty("visible")
    private final String visible;

    /**
     * Hint to control whether this variable is visible.
     *
     * @return the value
     */
    public String getVisible() {
        return visible;
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
        sb.append("BaseVariable(");
        sb.append("super=").append(super.toString());
        sb.append("title=").append(String.valueOf(this.title));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", visible=").append(String.valueOf(this.visible));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseVariable)) {
            return false;
        }

        BaseVariable other = (BaseVariable) o;
        return java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && java.util.Objects.equals(this.visible, other.visible)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.visible == null ? 43 : this.visible.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of the variable. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Array("ARRAY"),
        Boolean("BOOLEAN"),
        Enum("ENUM"),
        Integer("INTEGER"),
        Number("NUMBER"),
        String("STRING"),
        Text("TEXT"),
        File("FILE"),
        Password("PASSWORD"),
        Datetime("DATETIME"),
        Dummy("DUMMY"),
        OciIdentityDomainsId("OCI_IDENTITY_DOMAINS_ID"),
        OciCoreImageId("OCI_CORE_IMAGE_ID"),
        OciCoreInstanceshapewithflexName("OCI_CORE_INSTANCESHAPEWITHFLEX_NAME"),
        OciCoreInstanceshapeName("OCI_CORE_INSTANCESHAPE_NAME"),
        OciCoreNatgatewayId("OCI_CORE_NATGATEWAY_ID"),
        OciCoreInstanceId("OCI_CORE_INSTANCE_ID"),
        OciCoreSubnetId("OCI_CORE_SUBNET_ID"),
        OciCoreServicegatewayId("OCI_CORE_SERVICEGATEWAY_ID"),
        OciLoganLoggroupId("OCI_LOGAN_LOGGROUP_ID"),
        OciLoganScheduledtaskId("OCI_LOGAN_SCHEDULEDTASK_ID"),
        OciLoganLogentityId("OCI_LOGAN_LOGENTITY_ID"),
        OciLoganEntitytypeId("OCI_LOGAN_ENTITYTYPE_ID"),
        OciMgmtAgentId("OCI_MGMT_AGENT_ID"),
        OciLoganSourceId("OCI_LOGAN_SOURCE_ID"),
        OciCoreNsgId("OCI_CORE_NSG_ID"),
        OciCoreVcnId("OCI_CORE_VCN_ID"),
        OciIdentityAvailabilitydomainName("OCI_IDENTITY_AVAILABILITYDOMAIN_NAME"),
        OciIdentityCompartmentId("OCI_IDENTITY_COMPARTMENT_ID"),
        OciIdentityFaultdomainName("OCI_IDENTITY_FAULTDOMAIN_NAME"),
        OciIdentityRegionName("OCI_IDENTITY_REGION_NAME"),
        OciDatabaseDbsystemId("OCI_DATABASE_DBSYSTEM_ID"),
        OciDatabaseDbhomeId("OCI_DATABASE_DBHOME_ID"),
        OciDatabaseDbhomeDbversion("OCI_DATABASE_DBHOME_DBVERSION"),
        OciDatabaseDatabaseId("OCI_DATABASE_DATABASE_ID"),
        OciDatabaseAutonomousdatabaseId("OCI_DATABASE_AUTONOMOUSDATABASE_ID"),
        OciDatabaseAutonomousdatabaseversionId("OCI_DATABASE_AUTONOMOUSDATABASEVERSION_ID"),
        OciDatabaseAutonomouscontainerdatabaseId("OCI_DATABASE_AUTONOMOUSCONTAINERDATABASE_ID"),
        OciKmsKeyId("OCI_KMS_KEY_ID"),
        OciKmsSecretId("OCI_KMS_SECRET_ID"),
        OciContainerClusterId("OCI_CONTAINER_CLUSTER_ID"),
        OciKubernetesVersionsId("OCI_KUBERNETES_VERSIONS_ID"),
        OciBlockstoragePoliciesId("OCI_BLOCKSTORAGE_POLICIES_ID"),
        OciIdentityGroupsId("OCI_IDENTITY_GROUPS_ID"),
        OciIdentityDynamicgroupsId("OCI_IDENTITY_DYNAMICGROUPS_ID"),
        OciLoadbalancerLoadbalancerId("OCI_LOADBALANCER_LOADBALANCER_ID"),
        OciMountTargetId("OCI_MOUNT_TARGET_ID"),
        OciIdentityTagValue("OCI_IDENTITY_TAG_VALUE"),
        OciOdsProjectId("OCI_ODS_PROJECT_ID"),
        OciResourcemanagerPrivateendpointId("OCI_RESOURCEMANAGER_PRIVATEENDPOINT_ID"),
        OciApmDomainId("OCI_APM_DOMAIN_ID"),
        OciCoreSshPublickey("OCI_CORE_SSH_PUBLICKEY"),
        OciKmsVaultId("OCI_KMS_VAULT_ID"),
        OciLoadbalancerNetworkloadbalancerId("OCI_LOADBALANCER_NETWORKLOADBALANCER_ID"),
        OciLoadbalancerLoadbalancerReservedipsId("OCI_LOADBALANCER_LOADBALANCER_RESERVEDIPS_ID"),
        OciDatabaseMysqlShapeId("OCI_DATABASE_MYSQL_SHAPE_ID"),
        OciDatabaseMysqlConfigurationId("OCI_DATABASE_MYSQL_CONFIGURATION_ID"),
        OciStorageFilestorageExportsetId("OCI_STORAGE_FILESTORAGE_EXPORTSET_ID"),
        OciStorageFilestorageFilesystemId("OCI_STORAGE_FILESTORAGE_FILESYSTEM_ID"),
        OciStorageObjectstorageBucketName("OCI_STORAGE_OBJECTSTORAGE_BUCKET_NAME"),
        OciCoreVcnSeclistId("OCI_CORE_VCN_SECLIST_ID"),
        OciCoreVolumeId("OCI_CORE_VOLUME_ID"),
        OciDatabaseDataguardId("OCI_DATABASE_DATAGUARD_ID"),
        OciDatabaseExadataId("OCI_DATABASE_EXADATA_ID"),
        OciDatabaseCloudvmclusterId("OCI_DATABASE_CLOUDVMCLUSTER_ID"),
        OciDatabaseCdbId("OCI_DATABASE_CDB_ID"),
        OciDatabaseDataguardassociationId("OCI_DATABASE_DATAGUARDASSOCIATION_ID"),
        OciDatabaseDbnodeId("OCI_DATABASE_DBNODE_ID"),
        OciCoreVcnNetworksecuritygroupId("OCI_CORE_VCN_NETWORKSECURITYGROUP_ID"),
        OciStorageFilestorageMounttargetId("OCI_STORAGE_FILESTORAGE_MOUNTTARGET_ID"),

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
}
