/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances only.
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
    builder = CloudExadataInfrastructureSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudExadataInfrastructureSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "clusterPlacementGroupId",
        "lifecycleState",
        "displayName",
        "shape",
        "availabilityDomain",
        "computeCount",
        "storageCount",
        "totalStorageSizeInGBs",
        "availableStorageSizeInGBs",
        "cpuCount",
        "maxCpuCount",
        "memorySizeInGBs",
        "maxMemoryInGBs",
        "dbNodeStorageSizeInGBs",
        "maxDbNodeStorageInGBs",
        "dataStorageSizeInTBs",
        "maxDataStorageInTBs",
        "additionalStorageCount",
        "activatedStorageCount",
        "timeCreated",
        "lifecycleDetails",
        "maintenanceWindow",
        "lastMaintenanceRunId",
        "nextMaintenanceRunId",
        "freeformTags",
        "definedTags",
        "systemTags",
        "customerContacts",
        "storageServerVersion",
        "dbServerVersion",
        "monthlyStorageServerVersion",
        "monthlyDbServerVersion",
        "definedFileSystemConfigurations"
    })
    public CloudExadataInfrastructureSummary(
            String id,
            String compartmentId,
            String clusterPlacementGroupId,
            LifecycleState lifecycleState,
            String displayName,
            String shape,
            String availabilityDomain,
            Integer computeCount,
            Integer storageCount,
            Integer totalStorageSizeInGBs,
            Integer availableStorageSizeInGBs,
            Integer cpuCount,
            Integer maxCpuCount,
            Integer memorySizeInGBs,
            Integer maxMemoryInGBs,
            Integer dbNodeStorageSizeInGBs,
            Integer maxDbNodeStorageInGBs,
            Double dataStorageSizeInTBs,
            Double maxDataStorageInTBs,
            Integer additionalStorageCount,
            Integer activatedStorageCount,
            java.util.Date timeCreated,
            String lifecycleDetails,
            MaintenanceWindow maintenanceWindow,
            String lastMaintenanceRunId,
            String nextMaintenanceRunId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<CustomerContact> customerContacts,
            String storageServerVersion,
            String dbServerVersion,
            String monthlyStorageServerVersion,
            String monthlyDbServerVersion,
            java.util.List<DefinedFileSystemConfiguration> definedFileSystemConfigurations) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.shape = shape;
        this.availabilityDomain = availabilityDomain;
        this.computeCount = computeCount;
        this.storageCount = storageCount;
        this.totalStorageSizeInGBs = totalStorageSizeInGBs;
        this.availableStorageSizeInGBs = availableStorageSizeInGBs;
        this.cpuCount = cpuCount;
        this.maxCpuCount = maxCpuCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.maxMemoryInGBs = maxMemoryInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.maxDbNodeStorageInGBs = maxDbNodeStorageInGBs;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.maxDataStorageInTBs = maxDataStorageInTBs;
        this.additionalStorageCount = additionalStorageCount;
        this.activatedStorageCount = activatedStorageCount;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.maintenanceWindow = maintenanceWindow;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.customerContacts = customerContacts;
        this.storageServerVersion = storageServerVersion;
        this.dbServerVersion = dbServerVersion;
        this.monthlyStorageServerVersion = monthlyStorageServerVersion;
        this.monthlyDbServerVersion = monthlyDbServerVersion;
        this.definedFileSystemConfigurations = definedFileSystemConfigurations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cluster placement group of the Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cluster placement group of the Exadata Infrastructure.
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         **/
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /**
         * The current lifecycle state of the cloud Exadata infrastructure resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the cloud Exadata infrastructure resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The model name of the cloud Exadata infrastructure resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The model name of the cloud Exadata infrastructure resource.
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
         * The name of the availability domain that the cloud Exadata infrastructure resource is located in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the cloud Exadata infrastructure resource is located in.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The number of compute servers for the cloud Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Integer computeCount;

        /**
         * The number of compute servers for the cloud Exadata infrastructure.
         * @param computeCount the value to set
         * @return this builder
         **/
        public Builder computeCount(Integer computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /**
         * The number of storage servers for the cloud Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
        private Integer storageCount;

        /**
         * The number of storage servers for the cloud Exadata infrastructure.
         * @param storageCount the value to set
         * @return this builder
         **/
        public Builder storageCount(Integer storageCount) {
            this.storageCount = storageCount;
            this.__explicitlySet__.add("storageCount");
            return this;
        }
        /**
         * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalStorageSizeInGBs")
        private Integer totalStorageSizeInGBs;

        /**
         * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
         * @param totalStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder totalStorageSizeInGBs(Integer totalStorageSizeInGBs) {
            this.totalStorageSizeInGBs = totalStorageSizeInGBs;
            this.__explicitlySet__.add("totalStorageSizeInGBs");
            return this;
        }
        /**
         * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableStorageSizeInGBs")
        private Integer availableStorageSizeInGBs;

        /**
         * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
         * @param availableStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder availableStorageSizeInGBs(Integer availableStorageSizeInGBs) {
            this.availableStorageSizeInGBs = availableStorageSizeInGBs;
            this.__explicitlySet__.add("availableStorageSizeInGBs");
            return this;
        }
        /**
         * The total number of CPU cores allocated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private Integer cpuCount;

        /**
         * The total number of CPU cores allocated.
         * @param cpuCount the value to set
         * @return this builder
         **/
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }
        /**
         * The total number of CPU cores available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
        private Integer maxCpuCount;

        /**
         * The total number of CPU cores available.
         * @param maxCpuCount the value to set
         * @return this builder
         **/
        public Builder maxCpuCount(Integer maxCpuCount) {
            this.maxCpuCount = maxCpuCount;
            this.__explicitlySet__.add("maxCpuCount");
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
         * The total memory available in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
        private Integer maxMemoryInGBs;

        /**
         * The total memory available in GBs.
         * @param maxMemoryInGBs the value to set
         * @return this builder
         **/
        public Builder maxMemoryInGBs(Integer maxMemoryInGBs) {
            this.maxMemoryInGBs = maxMemoryInGBs;
            this.__explicitlySet__.add("maxMemoryInGBs");
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
         * The total local node storage available in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
        private Integer maxDbNodeStorageInGBs;

        /**
         * The total local node storage available in GBs.
         * @param maxDbNodeStorageInGBs the value to set
         * @return this builder
         **/
        public Builder maxDbNodeStorageInGBs(Integer maxDbNodeStorageInGBs) {
            this.maxDbNodeStorageInGBs = maxDbNodeStorageInGBs;
            this.__explicitlySet__.add("maxDbNodeStorageInGBs");
            return this;
        }
        /**
         * Size, in terabytes, of the DATA disk group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        /**
         * Size, in terabytes, of the DATA disk group.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /**
         * The total available DATA disk group size.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxDataStorageInTBs")
        private Double maxDataStorageInTBs;

        /**
         * The total available DATA disk group size.
         * @param maxDataStorageInTBs the value to set
         * @return this builder
         **/
        public Builder maxDataStorageInTBs(Double maxDataStorageInTBs) {
            this.maxDataStorageInTBs = maxDataStorageInTBs;
            this.__explicitlySet__.add("maxDataStorageInTBs");
            return this;
        }
        /**
         * The requested number of additional storage servers for the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalStorageCount")
        private Integer additionalStorageCount;

        /**
         * The requested number of additional storage servers for the Exadata infrastructure.
         * @param additionalStorageCount the value to set
         * @return this builder
         **/
        public Builder additionalStorageCount(Integer additionalStorageCount) {
            this.additionalStorageCount = additionalStorageCount;
            this.__explicitlySet__.add("additionalStorageCount");
            return this;
        }
        /**
         * The requested number of additional storage servers activated for the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activatedStorageCount")
        private Integer activatedStorageCount;

        /**
         * The requested number of additional storage servers activated for the Exadata infrastructure.
         * @param activatedStorageCount the value to set
         * @return this builder
         **/
        public Builder activatedStorageCount(Integer activatedStorageCount) {
            this.activatedStorageCount = activatedStorageCount;
            this.__explicitlySet__.add("activatedStorageCount");
            return this;
        }
        /**
         * The date and time the cloud Exadata infrastructure resource was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the cloud Exadata infrastructure resource was created.
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

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
        private String lastMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
         * @param lastMaintenanceRunId the value to set
         * @return this builder
         **/
        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = lastMaintenanceRunId;
            this.__explicitlySet__.add("lastMaintenanceRunId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
        private String nextMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
         * @param nextMaintenanceRunId the value to set
         * @return this builder
         **/
        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = nextMaintenanceRunId;
            this.__explicitlySet__.add("nextMaintenanceRunId");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource.
         * Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators.
         * Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource.
         * Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators.
         * Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
         *
         * @param customerContacts the value to set
         * @return this builder
         **/
        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }
        /**
         * The software version of the storage servers (cells) in the cloud Exadata infrastructure.
         * Example: 20.1.15
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerVersion")
        private String storageServerVersion;

        /**
         * The software version of the storage servers (cells) in the cloud Exadata infrastructure.
         * Example: 20.1.15
         *
         * @param storageServerVersion the value to set
         * @return this builder
         **/
        public Builder storageServerVersion(String storageServerVersion) {
            this.storageServerVersion = storageServerVersion;
            this.__explicitlySet__.add("storageServerVersion");
            return this;
        }
        /**
         * The software version of the database servers (dom0) in the cloud Exadata infrastructure.
         * Example: 20.1.15
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServerVersion")
        private String dbServerVersion;

        /**
         * The software version of the database servers (dom0) in the cloud Exadata infrastructure.
         * Example: 20.1.15
         *
         * @param dbServerVersion the value to set
         * @return this builder
         **/
        public Builder dbServerVersion(String dbServerVersion) {
            this.dbServerVersion = dbServerVersion;
            this.__explicitlySet__.add("dbServerVersion");
            return this;
        }
        /**
         * The monthly software version of the storage servers (cells) in the cloud Exadata infrastructure.
         * Example: 20.1.15
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("monthlyStorageServerVersion")
        private String monthlyStorageServerVersion;

        /**
         * The monthly software version of the storage servers (cells) in the cloud Exadata infrastructure.
         * Example: 20.1.15
         *
         * @param monthlyStorageServerVersion the value to set
         * @return this builder
         **/
        public Builder monthlyStorageServerVersion(String monthlyStorageServerVersion) {
            this.monthlyStorageServerVersion = monthlyStorageServerVersion;
            this.__explicitlySet__.add("monthlyStorageServerVersion");
            return this;
        }
        /**
         * The monthly software version of the database servers (dom0) in the cloud Exadata infrastructure.
         * Example: 20.1.15
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("monthlyDbServerVersion")
        private String monthlyDbServerVersion;

        /**
         * The monthly software version of the database servers (dom0) in the cloud Exadata infrastructure.
         * Example: 20.1.15
         *
         * @param monthlyDbServerVersion the value to set
         * @return this builder
         **/
        public Builder monthlyDbServerVersion(String monthlyDbServerVersion) {
            this.monthlyDbServerVersion = monthlyDbServerVersion;
            this.__explicitlySet__.add("monthlyDbServerVersion");
            return this;
        }
        /**
         * Details of the file system configuration of the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedFileSystemConfigurations")
        private java.util.List<DefinedFileSystemConfiguration> definedFileSystemConfigurations;

        /**
         * Details of the file system configuration of the Exadata infrastructure.
         * @param definedFileSystemConfigurations the value to set
         * @return this builder
         **/
        public Builder definedFileSystemConfigurations(
                java.util.List<DefinedFileSystemConfiguration> definedFileSystemConfigurations) {
            this.definedFileSystemConfigurations = definedFileSystemConfigurations;
            this.__explicitlySet__.add("definedFileSystemConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudExadataInfrastructureSummary build() {
            CloudExadataInfrastructureSummary model =
                    new CloudExadataInfrastructureSummary(
                            this.id,
                            this.compartmentId,
                            this.clusterPlacementGroupId,
                            this.lifecycleState,
                            this.displayName,
                            this.shape,
                            this.availabilityDomain,
                            this.computeCount,
                            this.storageCount,
                            this.totalStorageSizeInGBs,
                            this.availableStorageSizeInGBs,
                            this.cpuCount,
                            this.maxCpuCount,
                            this.memorySizeInGBs,
                            this.maxMemoryInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.maxDbNodeStorageInGBs,
                            this.dataStorageSizeInTBs,
                            this.maxDataStorageInTBs,
                            this.additionalStorageCount,
                            this.activatedStorageCount,
                            this.timeCreated,
                            this.lifecycleDetails,
                            this.maintenanceWindow,
                            this.lastMaintenanceRunId,
                            this.nextMaintenanceRunId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.customerContacts,
                            this.storageServerVersion,
                            this.dbServerVersion,
                            this.monthlyStorageServerVersion,
                            this.monthlyDbServerVersion,
                            this.definedFileSystemConfigurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudExadataInfrastructureSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("storageCount")) {
                this.storageCount(model.getStorageCount());
            }
            if (model.wasPropertyExplicitlySet("totalStorageSizeInGBs")) {
                this.totalStorageSizeInGBs(model.getTotalStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableStorageSizeInGBs")) {
                this.availableStorageSizeInGBs(model.getAvailableStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("cpuCount")) {
                this.cpuCount(model.getCpuCount());
            }
            if (model.wasPropertyExplicitlySet("maxCpuCount")) {
                this.maxCpuCount(model.getMaxCpuCount());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("maxMemoryInGBs")) {
                this.maxMemoryInGBs(model.getMaxMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("dbNodeStorageSizeInGBs")) {
                this.dbNodeStorageSizeInGBs(model.getDbNodeStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("maxDbNodeStorageInGBs")) {
                this.maxDbNodeStorageInGBs(model.getMaxDbNodeStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("maxDataStorageInTBs")) {
                this.maxDataStorageInTBs(model.getMaxDataStorageInTBs());
            }
            if (model.wasPropertyExplicitlySet("additionalStorageCount")) {
                this.additionalStorageCount(model.getAdditionalStorageCount());
            }
            if (model.wasPropertyExplicitlySet("activatedStorageCount")) {
                this.activatedStorageCount(model.getActivatedStorageCount());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("lastMaintenanceRunId")) {
                this.lastMaintenanceRunId(model.getLastMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("nextMaintenanceRunId")) {
                this.nextMaintenanceRunId(model.getNextMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("storageServerVersion")) {
                this.storageServerVersion(model.getStorageServerVersion());
            }
            if (model.wasPropertyExplicitlySet("dbServerVersion")) {
                this.dbServerVersion(model.getDbServerVersion());
            }
            if (model.wasPropertyExplicitlySet("monthlyStorageServerVersion")) {
                this.monthlyStorageServerVersion(model.getMonthlyStorageServerVersion());
            }
            if (model.wasPropertyExplicitlySet("monthlyDbServerVersion")) {
                this.monthlyDbServerVersion(model.getMonthlyDbServerVersion());
            }
            if (model.wasPropertyExplicitlySet("definedFileSystemConfigurations")) {
                this.definedFileSystemConfigurations(model.getDefinedFileSystemConfigurations());
            }
            return this;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cluster placement group of the Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cluster placement group of the Exadata Infrastructure.
     * @return the value
     **/
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /**
     * The current lifecycle state of the cloud Exadata infrastructure resource.
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
     * The current lifecycle state of the cloud Exadata infrastructure resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the cloud Exadata infrastructure resource.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The model name of the cloud Exadata infrastructure resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The model name of the cloud Exadata infrastructure resource.
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * The name of the availability domain that the cloud Exadata infrastructure resource is located in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the cloud Exadata infrastructure resource is located in.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The number of compute servers for the cloud Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Integer computeCount;

    /**
     * The number of compute servers for the cloud Exadata infrastructure.
     * @return the value
     **/
    public Integer getComputeCount() {
        return computeCount;
    }

    /**
     * The number of storage servers for the cloud Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
    private final Integer storageCount;

    /**
     * The number of storage servers for the cloud Exadata infrastructure.
     * @return the value
     **/
    public Integer getStorageCount() {
        return storageCount;
    }

    /**
     * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalStorageSizeInGBs")
    private final Integer totalStorageSizeInGBs;

    /**
     * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     * @return the value
     **/
    public Integer getTotalStorageSizeInGBs() {
        return totalStorageSizeInGBs;
    }

    /**
     * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableStorageSizeInGBs")
    private final Integer availableStorageSizeInGBs;

    /**
     * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     * @return the value
     **/
    public Integer getAvailableStorageSizeInGBs() {
        return availableStorageSizeInGBs;
    }

    /**
     * The total number of CPU cores allocated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    private final Integer cpuCount;

    /**
     * The total number of CPU cores allocated.
     * @return the value
     **/
    public Integer getCpuCount() {
        return cpuCount;
    }

    /**
     * The total number of CPU cores available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
    private final Integer maxCpuCount;

    /**
     * The total number of CPU cores available.
     * @return the value
     **/
    public Integer getMaxCpuCount() {
        return maxCpuCount;
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
     * The total memory available in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
    private final Integer maxMemoryInGBs;

    /**
     * The total memory available in GBs.
     * @return the value
     **/
    public Integer getMaxMemoryInGBs() {
        return maxMemoryInGBs;
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
     * The total local node storage available in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
    private final Integer maxDbNodeStorageInGBs;

    /**
     * The total local node storage available in GBs.
     * @return the value
     **/
    public Integer getMaxDbNodeStorageInGBs() {
        return maxDbNodeStorageInGBs;
    }

    /**
     * Size, in terabytes, of the DATA disk group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Double dataStorageSizeInTBs;

    /**
     * Size, in terabytes, of the DATA disk group.
     *
     * @return the value
     **/
    public Double getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /**
     * The total available DATA disk group size.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDataStorageInTBs")
    private final Double maxDataStorageInTBs;

    /**
     * The total available DATA disk group size.
     * @return the value
     **/
    public Double getMaxDataStorageInTBs() {
        return maxDataStorageInTBs;
    }

    /**
     * The requested number of additional storage servers for the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalStorageCount")
    private final Integer additionalStorageCount;

    /**
     * The requested number of additional storage servers for the Exadata infrastructure.
     * @return the value
     **/
    public Integer getAdditionalStorageCount() {
        return additionalStorageCount;
    }

    /**
     * The requested number of additional storage servers activated for the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activatedStorageCount")
    private final Integer activatedStorageCount;

    /**
     * The requested number of additional storage servers activated for the Exadata infrastructure.
     * @return the value
     **/
    public Integer getActivatedStorageCount() {
        return activatedStorageCount;
    }

    /**
     * The date and time the cloud Exadata infrastructure resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the cloud Exadata infrastructure resource was created.
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

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
    private final String lastMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * @return the value
     **/
    public String getLastMaintenanceRunId() {
        return lastMaintenanceRunId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
    private final String nextMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * @return the value
     **/
    public String getNextMaintenanceRunId() {
        return nextMaintenanceRunId;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource.
     * Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators.
     * Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource.
     * Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators.
     * Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
     *
     * @return the value
     **/
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    /**
     * The software version of the storage servers (cells) in the cloud Exadata infrastructure.
     * Example: 20.1.15
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerVersion")
    private final String storageServerVersion;

    /**
     * The software version of the storage servers (cells) in the cloud Exadata infrastructure.
     * Example: 20.1.15
     *
     * @return the value
     **/
    public String getStorageServerVersion() {
        return storageServerVersion;
    }

    /**
     * The software version of the database servers (dom0) in the cloud Exadata infrastructure.
     * Example: 20.1.15
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServerVersion")
    private final String dbServerVersion;

    /**
     * The software version of the database servers (dom0) in the cloud Exadata infrastructure.
     * Example: 20.1.15
     *
     * @return the value
     **/
    public String getDbServerVersion() {
        return dbServerVersion;
    }

    /**
     * The monthly software version of the storage servers (cells) in the cloud Exadata infrastructure.
     * Example: 20.1.15
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monthlyStorageServerVersion")
    private final String monthlyStorageServerVersion;

    /**
     * The monthly software version of the storage servers (cells) in the cloud Exadata infrastructure.
     * Example: 20.1.15
     *
     * @return the value
     **/
    public String getMonthlyStorageServerVersion() {
        return monthlyStorageServerVersion;
    }

    /**
     * The monthly software version of the database servers (dom0) in the cloud Exadata infrastructure.
     * Example: 20.1.15
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monthlyDbServerVersion")
    private final String monthlyDbServerVersion;

    /**
     * The monthly software version of the database servers (dom0) in the cloud Exadata infrastructure.
     * Example: 20.1.15
     *
     * @return the value
     **/
    public String getMonthlyDbServerVersion() {
        return monthlyDbServerVersion;
    }

    /**
     * Details of the file system configuration of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedFileSystemConfigurations")
    private final java.util.List<DefinedFileSystemConfiguration> definedFileSystemConfigurations;

    /**
     * Details of the file system configuration of the Exadata infrastructure.
     * @return the value
     **/
    public java.util.List<DefinedFileSystemConfiguration> getDefinedFileSystemConfigurations() {
        return definedFileSystemConfigurations;
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
        sb.append("CloudExadataInfrastructureSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", storageCount=").append(String.valueOf(this.storageCount));
        sb.append(", totalStorageSizeInGBs=").append(String.valueOf(this.totalStorageSizeInGBs));
        sb.append(", availableStorageSizeInGBs=")
                .append(String.valueOf(this.availableStorageSizeInGBs));
        sb.append(", cpuCount=").append(String.valueOf(this.cpuCount));
        sb.append(", maxCpuCount=").append(String.valueOf(this.maxCpuCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", maxMemoryInGBs=").append(String.valueOf(this.maxMemoryInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", maxDbNodeStorageInGBs=").append(String.valueOf(this.maxDbNodeStorageInGBs));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", maxDataStorageInTBs=").append(String.valueOf(this.maxDataStorageInTBs));
        sb.append(", additionalStorageCount=").append(String.valueOf(this.additionalStorageCount));
        sb.append(", activatedStorageCount=").append(String.valueOf(this.activatedStorageCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", lastMaintenanceRunId=").append(String.valueOf(this.lastMaintenanceRunId));
        sb.append(", nextMaintenanceRunId=").append(String.valueOf(this.nextMaintenanceRunId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", storageServerVersion=").append(String.valueOf(this.storageServerVersion));
        sb.append(", dbServerVersion=").append(String.valueOf(this.dbServerVersion));
        sb.append(", monthlyStorageServerVersion=")
                .append(String.valueOf(this.monthlyStorageServerVersion));
        sb.append(", monthlyDbServerVersion=").append(String.valueOf(this.monthlyDbServerVersion));
        sb.append(", definedFileSystemConfigurations=")
                .append(String.valueOf(this.definedFileSystemConfigurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudExadataInfrastructureSummary)) {
            return false;
        }

        CloudExadataInfrastructureSummary other = (CloudExadataInfrastructureSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.storageCount, other.storageCount)
                && java.util.Objects.equals(this.totalStorageSizeInGBs, other.totalStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.availableStorageSizeInGBs, other.availableStorageSizeInGBs)
                && java.util.Objects.equals(this.cpuCount, other.cpuCount)
                && java.util.Objects.equals(this.maxCpuCount, other.maxCpuCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.maxMemoryInGBs, other.maxMemoryInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.maxDbNodeStorageInGBs, other.maxDbNodeStorageInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.maxDataStorageInTBs, other.maxDataStorageInTBs)
                && java.util.Objects.equals(
                        this.additionalStorageCount, other.additionalStorageCount)
                && java.util.Objects.equals(this.activatedStorageCount, other.activatedStorageCount)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.lastMaintenanceRunId, other.lastMaintenanceRunId)
                && java.util.Objects.equals(this.nextMaintenanceRunId, other.nextMaintenanceRunId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(this.storageServerVersion, other.storageServerVersion)
                && java.util.Objects.equals(this.dbServerVersion, other.dbServerVersion)
                && java.util.Objects.equals(
                        this.monthlyStorageServerVersion, other.monthlyStorageServerVersion)
                && java.util.Objects.equals(
                        this.monthlyDbServerVersion, other.monthlyDbServerVersion)
                && java.util.Objects.equals(
                        this.definedFileSystemConfigurations, other.definedFileSystemConfigurations)
                && super.equals(other);
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
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result = (result * PRIME) + (this.storageCount == null ? 43 : this.storageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalStorageSizeInGBs == null
                                ? 43
                                : this.totalStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableStorageSizeInGBs == null
                                ? 43
                                : this.availableStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.cpuCount == null ? 43 : this.cpuCount.hashCode());
        result = (result * PRIME) + (this.maxCpuCount == null ? 43 : this.maxCpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxMemoryInGBs == null ? 43 : this.maxMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDbNodeStorageInGBs == null
                                ? 43
                                : this.maxDbNodeStorageInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDataStorageInTBs == null
                                ? 43
                                : this.maxDataStorageInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalStorageCount == null
                                ? 43
                                : this.additionalStorageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.activatedStorageCount == null
                                ? 43
                                : this.activatedStorageCount.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.lastMaintenanceRunId == null
                                ? 43
                                : this.lastMaintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.nextMaintenanceRunId == null
                                ? 43
                                : this.nextMaintenanceRunId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServerVersion == null
                                ? 43
                                : this.storageServerVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.dbServerVersion == null ? 43 : this.dbServerVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.monthlyStorageServerVersion == null
                                ? 43
                                : this.monthlyStorageServerVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.monthlyDbServerVersion == null
                                ? 43
                                : this.monthlyDbServerVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.definedFileSystemConfigurations == null
                                ? 43
                                : this.definedFileSystemConfigurations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
