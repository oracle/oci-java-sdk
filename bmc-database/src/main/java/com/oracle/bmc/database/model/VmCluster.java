/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the VM cluster resource. Applies to Exadata Cloud@Customer instances only.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VmCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VmCluster {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "lastPatchHistoryEntryId",
        "lifecycleState",
        "displayName",
        "timeCreated",
        "lifecycleDetails",
        "timeZone",
        "isLocalBackupEnabled",
        "exadataInfrastructureId",
        "isSparseDiskgroupEnabled",
        "vmClusterNetworkId",
        "cpusEnabled",
        "ocpusEnabled",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "dataStorageSizeInTBs",
        "dataStorageSizeInGBs",
        "shape",
        "giVersion",
        "systemVersion",
        "sshPublicKeys",
        "licenseModel",
        "dbServers",
        "freeformTags",
        "definedTags",
        "dataCollectionOptions"
    })
    public VmCluster(
            String id,
            String compartmentId,
            String lastPatchHistoryEntryId,
            LifecycleState lifecycleState,
            String displayName,
            java.util.Date timeCreated,
            String lifecycleDetails,
            String timeZone,
            Boolean isLocalBackupEnabled,
            String exadataInfrastructureId,
            Boolean isSparseDiskgroupEnabled,
            String vmClusterNetworkId,
            Integer cpusEnabled,
            Float ocpusEnabled,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            Double dataStorageSizeInTBs,
            Double dataStorageSizeInGBs,
            String shape,
            String giVersion,
            String systemVersion,
            java.util.List<String> sshPublicKeys,
            LicenseModel licenseModel,
            java.util.List<String> dbServers,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            DataCollectionOptions dataCollectionOptions) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.lastPatchHistoryEntryId = lastPatchHistoryEntryId;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.timeZone = timeZone;
        this.isLocalBackupEnabled = isLocalBackupEnabled;
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.isSparseDiskgroupEnabled = isSparseDiskgroupEnabled;
        this.vmClusterNetworkId = vmClusterNetworkId;
        this.cpusEnabled = cpusEnabled;
        this.ocpusEnabled = ocpusEnabled;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.shape = shape;
        this.giVersion = giVersion;
        this.systemVersion = systemVersion;
        this.sshPublicKeys = sshPublicKeys;
        this.licenseModel = licenseModel;
        this.dbServers = dbServers;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dataCollectionOptions = dataCollectionOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last patch history. This value is updated as soon as a patch operation starts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastPatchHistoryEntryId")
        private String lastPatchHistoryEntryId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last patch history. This value is updated as soon as a patch operation starts.
         * @param lastPatchHistoryEntryId the value to set
         * @return this builder
         **/
        public Builder lastPatchHistoryEntryId(String lastPatchHistoryEntryId) {
            this.lastPatchHistoryEntryId = lastPatchHistoryEntryId;
            this.__explicitlySet__.add("lastPatchHistoryEntryId");
            return this;
        }
        /**
         * The current state of the VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the VM cluster.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The user-friendly name for the Exadata Cloud@Customer VM cluster. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Exadata Cloud@Customer VM cluster. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time that the VM cluster was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the VM cluster was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Additional information about the current lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         * @param timeZone the value to set
         * @return this builder
         **/
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * If true, database backup on local Exadata storage is configured for the VM cluster. If false, database backup on local Exadata storage is not available in the VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
        private Boolean isLocalBackupEnabled;

        /**
         * If true, database backup on local Exadata storage is configured for the VM cluster. If false, database backup on local Exadata storage is not available in the VM cluster.
         *
         * @param isLocalBackupEnabled the value to set
         * @return this builder
         **/
        public Builder isLocalBackupEnabled(Boolean isLocalBackupEnabled) {
            this.isLocalBackupEnabled = isLocalBackupEnabled;
            this.__explicitlySet__.add("isLocalBackupEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
         * @param exadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
            return this;
        }
        /**
         * If true, sparse disk group is configured for the VM cluster. If false, sparse disk group is not created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSparseDiskgroupEnabled")
        private Boolean isSparseDiskgroupEnabled;

        /**
         * If true, sparse disk group is configured for the VM cluster. If false, sparse disk group is not created.
         *
         * @param isSparseDiskgroupEnabled the value to set
         * @return this builder
         **/
        public Builder isSparseDiskgroupEnabled(Boolean isSparseDiskgroupEnabled) {
            this.isSparseDiskgroupEnabled = isSparseDiskgroupEnabled;
            this.__explicitlySet__.add("isSparseDiskgroupEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterNetworkId")
        private String vmClusterNetworkId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
         * @param vmClusterNetworkId the value to set
         * @return this builder
         **/
        public Builder vmClusterNetworkId(String vmClusterNetworkId) {
            this.vmClusterNetworkId = vmClusterNetworkId;
            this.__explicitlySet__.add("vmClusterNetworkId");
            return this;
        }
        /**
         * The number of enabled CPU cores.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
        private Integer cpusEnabled;

        /**
         * The number of enabled CPU cores.
         * @param cpusEnabled the value to set
         * @return this builder
         **/
        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = cpusEnabled;
            this.__explicitlySet__.add("cpusEnabled");
            return this;
        }
        /**
         * The number of enabled OCPU cores.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpusEnabled")
        private Float ocpusEnabled;

        /**
         * The number of enabled OCPU cores.
         * @param ocpusEnabled the value to set
         * @return this builder
         **/
        public Builder ocpusEnabled(Float ocpusEnabled) {
            this.ocpusEnabled = ocpusEnabled;
            this.__explicitlySet__.add("ocpusEnabled");
            return this;
        }
        /**
         * The memory allocated in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The memory allocated in GBs.
         * @param memorySizeInGBs the value to set
         * @return this builder
         **/
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /**
         * The local node storage allocated in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The local node storage allocated in GBs.
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /**
         * Size, in terabytes, of the DATA disk group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        /**
         * Size, in terabytes, of the DATA disk group.
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /**
         * Size of the DATA disk group in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Double dataStorageSizeInGBs;

        /**
         * Size of the DATA disk group in GBs.
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInGBs(Double dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and memory resources allocated to the instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and memory resources allocated to the instance.
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
         * The Oracle Grid Infrastructure software version for the VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
        private String giVersion;

        /**
         * The Oracle Grid Infrastructure software version for the VM cluster.
         * @param giVersion the value to set
         * @return this builder
         **/
        public Builder giVersion(String giVersion) {
            this.giVersion = giVersion;
            this.__explicitlySet__.add("giVersion");
            return this;
        }
        /**
         * Operating system version of the image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
        private String systemVersion;

        /**
         * Operating system version of the image.
         * @param systemVersion the value to set
         * @return this builder
         **/
        public Builder systemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            this.__explicitlySet__.add("systemVersion");
            return this;
        }
        /**
         * The public key portion of one or more key pairs used for SSH access to the VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the VM cluster.
         * @param sshPublicKeys the value to set
         * @return this builder
         **/
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /**
         * The Oracle license model that applies to the VM cluster. The default is LICENSE_INCLUDED.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the VM cluster. The default is LICENSE_INCLUDED.
         *
         * @param licenseModel the value to set
         * @return this builder
         **/
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * The list of Db server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<String> dbServers;

        /**
         * The list of Db server.
         * @param dbServers the value to set
         * @return this builder
         **/
        public Builder dbServers(java.util.List<String> dbServers) {
            this.dbServers = dbServers;
            this.__explicitlySet__.add("dbServers");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmCluster build() {
            VmCluster __instance__ =
                    new VmCluster(
                            id,
                            compartmentId,
                            lastPatchHistoryEntryId,
                            lifecycleState,
                            displayName,
                            timeCreated,
                            lifecycleDetails,
                            timeZone,
                            isLocalBackupEnabled,
                            exadataInfrastructureId,
                            isSparseDiskgroupEnabled,
                            vmClusterNetworkId,
                            cpusEnabled,
                            ocpusEnabled,
                            memorySizeInGBs,
                            dbNodeStorageSizeInGBs,
                            dataStorageSizeInTBs,
                            dataStorageSizeInGBs,
                            shape,
                            giVersion,
                            systemVersion,
                            sshPublicKeys,
                            licenseModel,
                            dbServers,
                            freeformTags,
                            definedTags,
                            dataCollectionOptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmCluster o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .lastPatchHistoryEntryId(o.getLastPatchHistoryEntryId())
                            .lifecycleState(o.getLifecycleState())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeZone(o.getTimeZone())
                            .isLocalBackupEnabled(o.getIsLocalBackupEnabled())
                            .exadataInfrastructureId(o.getExadataInfrastructureId())
                            .isSparseDiskgroupEnabled(o.getIsSparseDiskgroupEnabled())
                            .vmClusterNetworkId(o.getVmClusterNetworkId())
                            .cpusEnabled(o.getCpusEnabled())
                            .ocpusEnabled(o.getOcpusEnabled())
                            .memorySizeInGBs(o.getMemorySizeInGBs())
                            .dbNodeStorageSizeInGBs(o.getDbNodeStorageSizeInGBs())
                            .dataStorageSizeInTBs(o.getDataStorageSizeInTBs())
                            .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                            .shape(o.getShape())
                            .giVersion(o.getGiVersion())
                            .systemVersion(o.getSystemVersion())
                            .sshPublicKeys(o.getSshPublicKeys())
                            .licenseModel(o.getLicenseModel())
                            .dbServers(o.getDbServers())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .dataCollectionOptions(o.getDataCollectionOptions());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last patch history. This value is updated as soon as a patch operation starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastPatchHistoryEntryId")
    private final String lastPatchHistoryEntryId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last patch history. This value is updated as soon as a patch operation starts.
     * @return the value
     **/
    public String getLastPatchHistoryEntryId() {
        return lastPatchHistoryEntryId;
    }

    /**
     * The current state of the VM cluster.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current state of the VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the VM cluster.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The user-friendly name for the Exadata Cloud@Customer VM cluster. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata Cloud@Customer VM cluster. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time that the VM cluster was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the VM cluster was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     * @return the value
     **/
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * If true, database backup on local Exadata storage is configured for the VM cluster. If false, database backup on local Exadata storage is not available in the VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
    private final Boolean isLocalBackupEnabled;

    /**
     * If true, database backup on local Exadata storage is configured for the VM cluster. If false, database backup on local Exadata storage is not available in the VM cluster.
     *
     * @return the value
     **/
    public Boolean getIsLocalBackupEnabled() {
        return isLocalBackupEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    private final String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     * @return the value
     **/
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }

    /**
     * If true, sparse disk group is configured for the VM cluster. If false, sparse disk group is not created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSparseDiskgroupEnabled")
    private final Boolean isSparseDiskgroupEnabled;

    /**
     * If true, sparse disk group is configured for the VM cluster. If false, sparse disk group is not created.
     *
     * @return the value
     **/
    public Boolean getIsSparseDiskgroupEnabled() {
        return isSparseDiskgroupEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterNetworkId")
    private final String vmClusterNetworkId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     * @return the value
     **/
    public String getVmClusterNetworkId() {
        return vmClusterNetworkId;
    }

    /**
     * The number of enabled CPU cores.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
    private final Integer cpusEnabled;

    /**
     * The number of enabled CPU cores.
     * @return the value
     **/
    public Integer getCpusEnabled() {
        return cpusEnabled;
    }

    /**
     * The number of enabled OCPU cores.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpusEnabled")
    private final Float ocpusEnabled;

    /**
     * The number of enabled OCPU cores.
     * @return the value
     **/
    public Float getOcpusEnabled() {
        return ocpusEnabled;
    }

    /**
     * The memory allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The memory allocated in GBs.
     * @return the value
     **/
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The local node storage allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The local node storage allocated in GBs.
     * @return the value
     **/
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /**
     * Size, in terabytes, of the DATA disk group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Double dataStorageSizeInTBs;

    /**
     * Size, in terabytes, of the DATA disk group.
     * @return the value
     **/
    public Double getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /**
     * Size of the DATA disk group in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Double dataStorageSizeInGBs;

    /**
     * Size of the DATA disk group in GBs.
     * @return the value
     **/
    public Double getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and memory resources allocated to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and memory resources allocated to the instance.
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * The Oracle Grid Infrastructure software version for the VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
    private final String giVersion;

    /**
     * The Oracle Grid Infrastructure software version for the VM cluster.
     * @return the value
     **/
    public String getGiVersion() {
        return giVersion;
    }

    /**
     * Operating system version of the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
    private final String systemVersion;

    /**
     * Operating system version of the image.
     * @return the value
     **/
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the VM cluster.
     * @return the value
     **/
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The Oracle license model that applies to the VM cluster. The default is LICENSE_INCLUDED.
     *
     **/
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LicenseModel.class);

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'LicenseModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle license model that applies to the VM cluster. The default is LICENSE_INCLUDED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the VM cluster. The default is LICENSE_INCLUDED.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The list of Db server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<String> dbServers;

    /**
     * The list of Db server.
     * @return the value
     **/
    public java.util.List<String> getDbServers() {
        return dbServers;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
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
        sb.append("VmCluster(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lastPatchHistoryEntryId=")
                .append(String.valueOf(this.lastPatchHistoryEntryId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", isLocalBackupEnabled=").append(String.valueOf(this.isLocalBackupEnabled));
        sb.append(", exadataInfrastructureId=")
                .append(String.valueOf(this.exadataInfrastructureId));
        sb.append(", isSparseDiskgroupEnabled=")
                .append(String.valueOf(this.isSparseDiskgroupEnabled));
        sb.append(", vmClusterNetworkId=").append(String.valueOf(this.vmClusterNetworkId));
        sb.append(", cpusEnabled=").append(String.valueOf(this.cpusEnabled));
        sb.append(", ocpusEnabled=").append(String.valueOf(this.ocpusEnabled));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(", systemVersion=").append(String.valueOf(this.systemVersion));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", dbServers=").append(String.valueOf(this.dbServers));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmCluster)) {
            return false;
        }

        VmCluster other = (VmCluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.lastPatchHistoryEntryId, other.lastPatchHistoryEntryId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.isLocalBackupEnabled, other.isLocalBackupEnabled)
                && java.util.Objects.equals(
                        this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(
                        this.isSparseDiskgroupEnabled, other.isSparseDiskgroupEnabled)
                && java.util.Objects.equals(this.vmClusterNetworkId, other.vmClusterNetworkId)
                && java.util.Objects.equals(this.cpusEnabled, other.cpusEnabled)
                && java.util.Objects.equals(this.ocpusEnabled, other.ocpusEnabled)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.systemVersion, other.systemVersion)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.dbServers, other.dbServers)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lastPatchHistoryEntryId == null
                                ? 43
                                : this.lastPatchHistoryEntryId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalBackupEnabled == null
                                ? 43
                                : this.isLocalBackupEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.isSparseDiskgroupEnabled == null
                                ? 43
                                : this.isSparseDiskgroupEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterNetworkId == null
                                ? 43
                                : this.vmClusterNetworkId.hashCode());
        result = (result * PRIME) + (this.cpusEnabled == null ? 43 : this.cpusEnabled.hashCode());
        result = (result * PRIME) + (this.ocpusEnabled == null ? 43 : this.ocpusEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVersion == null ? 43 : this.systemVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
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
