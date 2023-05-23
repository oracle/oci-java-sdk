/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * ExadataInfrastructure <br>
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
        builder = ExadataInfrastructure.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataInfrastructure
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "lifecycleState",
        "displayName",
        "shape",
        "timeZone",
        "cpusEnabled",
        "maxCpuCount",
        "memorySizeInGBs",
        "maxMemoryInGBs",
        "dbNodeStorageSizeInGBs",
        "maxDbNodeStorageInGBs",
        "dataStorageSizeInTBs",
        "maxDataStorageInTBs",
        "rackSerialNumber",
        "storageCount",
        "additionalStorageCount",
        "activatedStorageCount",
        "computeCount",
        "isMultiRackDeployment",
        "multiRackConfigurationFile",
        "additionalComputeCount",
        "additionalComputeSystemModel",
        "cloudControlPlaneServer1",
        "cloudControlPlaneServer2",
        "netmask",
        "gateway",
        "adminNetworkCIDR",
        "infiniBandNetworkCIDR",
        "corporateProxy",
        "dnsServer",
        "ntpServer",
        "timeCreated",
        "lifecycleDetails",
        "csiNumber",
        "contacts",
        "maintenanceSLOStatus",
        "maintenanceWindow",
        "storageServerVersion",
        "dbServerVersion",
        "monthlyDbServerVersion",
        "lastMaintenanceRunId",
        "nextMaintenanceRunId",
        "isCpsOfflineReportEnabled",
        "networkBondingModeDetails",
        "availabilityDomain",
        "freeformTags",
        "definedTags"
    })
    public ExadataInfrastructure(
            String id,
            String compartmentId,
            LifecycleState lifecycleState,
            String displayName,
            String shape,
            String timeZone,
            Integer cpusEnabled,
            Integer maxCpuCount,
            Integer memorySizeInGBs,
            Integer maxMemoryInGBs,
            Integer dbNodeStorageSizeInGBs,
            Integer maxDbNodeStorageInGBs,
            Double dataStorageSizeInTBs,
            Double maxDataStorageInTBs,
            String rackSerialNumber,
            Integer storageCount,
            Integer additionalStorageCount,
            Integer activatedStorageCount,
            Integer computeCount,
            Boolean isMultiRackDeployment,
            byte[] multiRackConfigurationFile,
            Integer additionalComputeCount,
            AdditionalComputeSystemModel additionalComputeSystemModel,
            String cloudControlPlaneServer1,
            String cloudControlPlaneServer2,
            String netmask,
            String gateway,
            String adminNetworkCIDR,
            String infiniBandNetworkCIDR,
            String corporateProxy,
            java.util.List<String> dnsServer,
            java.util.List<String> ntpServer,
            java.util.Date timeCreated,
            String lifecycleDetails,
            String csiNumber,
            java.util.List<ExadataInfrastructureContact> contacts,
            MaintenanceSLOStatus maintenanceSLOStatus,
            MaintenanceWindow maintenanceWindow,
            String storageServerVersion,
            String dbServerVersion,
            String monthlyDbServerVersion,
            String lastMaintenanceRunId,
            String nextMaintenanceRunId,
            Boolean isCpsOfflineReportEnabled,
            NetworkBondingModeDetails networkBondingModeDetails,
            String availabilityDomain,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.shape = shape;
        this.timeZone = timeZone;
        this.cpusEnabled = cpusEnabled;
        this.maxCpuCount = maxCpuCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.maxMemoryInGBs = maxMemoryInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.maxDbNodeStorageInGBs = maxDbNodeStorageInGBs;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.maxDataStorageInTBs = maxDataStorageInTBs;
        this.rackSerialNumber = rackSerialNumber;
        this.storageCount = storageCount;
        this.additionalStorageCount = additionalStorageCount;
        this.activatedStorageCount = activatedStorageCount;
        this.computeCount = computeCount;
        this.isMultiRackDeployment = isMultiRackDeployment;
        this.multiRackConfigurationFile = multiRackConfigurationFile;
        this.additionalComputeCount = additionalComputeCount;
        this.additionalComputeSystemModel = additionalComputeSystemModel;
        this.cloudControlPlaneServer1 = cloudControlPlaneServer1;
        this.cloudControlPlaneServer2 = cloudControlPlaneServer2;
        this.netmask = netmask;
        this.gateway = gateway;
        this.adminNetworkCIDR = adminNetworkCIDR;
        this.infiniBandNetworkCIDR = infiniBandNetworkCIDR;
        this.corporateProxy = corporateProxy;
        this.dnsServer = dnsServer;
        this.ntpServer = ntpServer;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.csiNumber = csiNumber;
        this.contacts = contacts;
        this.maintenanceSLOStatus = maintenanceSLOStatus;
        this.maintenanceWindow = maintenanceWindow;
        this.storageServerVersion = storageServerVersion;
        this.dbServerVersion = dbServerVersion;
        this.monthlyDbServerVersion = monthlyDbServerVersion;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.isCpsOfflineReportEnabled = isCpsOfflineReportEnabled;
        this.networkBondingModeDetails = networkBondingModeDetails;
        this.availabilityDomain = availabilityDomain;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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
        /** The current lifecycle state of the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the Exadata infrastructure.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The user-friendly name for the Exadata Cloud@Customer infrastructure. The name does not
         * need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Exadata Cloud@Customer infrastructure. The name does not
         * need to be unique.
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
         * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage,
         * and memory resources allocated to the instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage,
         * and memory resources allocated to the instance.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure
         * Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure
         * Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /** The number of enabled CPU cores. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
        private Integer cpusEnabled;

        /**
         * The number of enabled CPU cores.
         *
         * @param cpusEnabled the value to set
         * @return this builder
         */
        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = cpusEnabled;
            this.__explicitlySet__.add("cpusEnabled");
            return this;
        }
        /** The total number of CPU cores available. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
        private Integer maxCpuCount;

        /**
         * The total number of CPU cores available.
         *
         * @param maxCpuCount the value to set
         * @return this builder
         */
        public Builder maxCpuCount(Integer maxCpuCount) {
            this.maxCpuCount = maxCpuCount;
            this.__explicitlySet__.add("maxCpuCount");
            return this;
        }
        /** The memory allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The memory allocated in GBs.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /** The total memory available in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
        private Integer maxMemoryInGBs;

        /**
         * The total memory available in GBs.
         *
         * @param maxMemoryInGBs the value to set
         * @return this builder
         */
        public Builder maxMemoryInGBs(Integer maxMemoryInGBs) {
            this.maxMemoryInGBs = maxMemoryInGBs;
            this.__explicitlySet__.add("maxMemoryInGBs");
            return this;
        }
        /** The local node storage allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The local node storage allocated in GBs.
         *
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /** The total local node storage available in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
        private Integer maxDbNodeStorageInGBs;

        /**
         * The total local node storage available in GBs.
         *
         * @param maxDbNodeStorageInGBs the value to set
         * @return this builder
         */
        public Builder maxDbNodeStorageInGBs(Integer maxDbNodeStorageInGBs) {
            this.maxDbNodeStorageInGBs = maxDbNodeStorageInGBs;
            this.__explicitlySet__.add("maxDbNodeStorageInGBs");
            return this;
        }
        /** Size, in terabytes, of the DATA disk group. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        /**
         * Size, in terabytes, of the DATA disk group.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /** The total available DATA disk group size. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxDataStorageInTBs")
        private Double maxDataStorageInTBs;

        /**
         * The total available DATA disk group size.
         *
         * @param maxDataStorageInTBs the value to set
         * @return this builder
         */
        public Builder maxDataStorageInTBs(Double maxDataStorageInTBs) {
            this.maxDataStorageInTBs = maxDataStorageInTBs;
            this.__explicitlySet__.add("maxDataStorageInTBs");
            return this;
        }
        /** The serial number for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("rackSerialNumber")
        private String rackSerialNumber;

        /**
         * The serial number for the Exadata infrastructure.
         *
         * @param rackSerialNumber the value to set
         * @return this builder
         */
        public Builder rackSerialNumber(String rackSerialNumber) {
            this.rackSerialNumber = rackSerialNumber;
            this.__explicitlySet__.add("rackSerialNumber");
            return this;
        }
        /** The number of Exadata storage servers for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
        private Integer storageCount;

        /**
         * The number of Exadata storage servers for the Exadata infrastructure.
         *
         * @param storageCount the value to set
         * @return this builder
         */
        public Builder storageCount(Integer storageCount) {
            this.storageCount = storageCount;
            this.__explicitlySet__.add("storageCount");
            return this;
        }
        /** The requested number of additional storage servers for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalStorageCount")
        private Integer additionalStorageCount;

        /**
         * The requested number of additional storage servers for the Exadata infrastructure.
         *
         * @param additionalStorageCount the value to set
         * @return this builder
         */
        public Builder additionalStorageCount(Integer additionalStorageCount) {
            this.additionalStorageCount = additionalStorageCount;
            this.__explicitlySet__.add("additionalStorageCount");
            return this;
        }
        /**
         * The requested number of additional storage servers activated for the Exadata
         * infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("activatedStorageCount")
        private Integer activatedStorageCount;

        /**
         * The requested number of additional storage servers activated for the Exadata
         * infrastructure.
         *
         * @param activatedStorageCount the value to set
         * @return this builder
         */
        public Builder activatedStorageCount(Integer activatedStorageCount) {
            this.activatedStorageCount = activatedStorageCount;
            this.__explicitlySet__.add("activatedStorageCount");
            return this;
        }
        /** The number of compute servers for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Integer computeCount;

        /**
         * The number of compute servers for the Exadata infrastructure.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Integer computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /** Indicates if deployment is Multi-Rack or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiRackDeployment")
        private Boolean isMultiRackDeployment;

        /**
         * Indicates if deployment is Multi-Rack or not.
         *
         * @param isMultiRackDeployment the value to set
         * @return this builder
         */
        public Builder isMultiRackDeployment(Boolean isMultiRackDeployment) {
            this.isMultiRackDeployment = isMultiRackDeployment;
            this.__explicitlySet__.add("isMultiRackDeployment");
            return this;
        }
        /** The base64 encoded Multi-Rack configuration json file. */
        @com.fasterxml.jackson.annotation.JsonProperty("multiRackConfigurationFile")
        private byte[] multiRackConfigurationFile;

        /**
         * The base64 encoded Multi-Rack configuration json file.
         *
         * @param multiRackConfigurationFile the value to set
         * @return this builder
         */
        public Builder multiRackConfigurationFile(byte[] multiRackConfigurationFile) {
            this.multiRackConfigurationFile = multiRackConfigurationFile;
            this.__explicitlySet__.add("multiRackConfigurationFile");
            return this;
        }
        /** The requested number of additional compute servers for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalComputeCount")
        private Integer additionalComputeCount;

        /**
         * The requested number of additional compute servers for the Exadata infrastructure.
         *
         * @param additionalComputeCount the value to set
         * @return this builder
         */
        public Builder additionalComputeCount(Integer additionalComputeCount) {
            this.additionalComputeCount = additionalComputeCount;
            this.__explicitlySet__.add("additionalComputeCount");
            return this;
        }
        /**
         * Oracle Exadata System Model specification. The system model determines the amount of
         * compute or storage server resources available for use. For more information, please see
         * [System and Shape Configuration Options]
         * (https://docs.oracle.com/en/engineered-systems/exadata-cloud-at-customer/ecccm/ecc-system-config-options.html#GUID-9E090174-5C57-4EB1-9243-B470F9F10D6B)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalComputeSystemModel")
        private AdditionalComputeSystemModel additionalComputeSystemModel;

        /**
         * Oracle Exadata System Model specification. The system model determines the amount of
         * compute or storage server resources available for use. For more information, please see
         * [System and Shape Configuration Options]
         * (https://docs.oracle.com/en/engineered-systems/exadata-cloud-at-customer/ecccm/ecc-system-config-options.html#GUID-9E090174-5C57-4EB1-9243-B470F9F10D6B)
         *
         * @param additionalComputeSystemModel the value to set
         * @return this builder
         */
        public Builder additionalComputeSystemModel(
                AdditionalComputeSystemModel additionalComputeSystemModel) {
            this.additionalComputeSystemModel = additionalComputeSystemModel;
            this.__explicitlySet__.add("additionalComputeSystemModel");
            return this;
        }
        /** The IP address for the first control plane server. */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudControlPlaneServer1")
        private String cloudControlPlaneServer1;

        /**
         * The IP address for the first control plane server.
         *
         * @param cloudControlPlaneServer1 the value to set
         * @return this builder
         */
        public Builder cloudControlPlaneServer1(String cloudControlPlaneServer1) {
            this.cloudControlPlaneServer1 = cloudControlPlaneServer1;
            this.__explicitlySet__.add("cloudControlPlaneServer1");
            return this;
        }
        /** The IP address for the second control plane server. */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudControlPlaneServer2")
        private String cloudControlPlaneServer2;

        /**
         * The IP address for the second control plane server.
         *
         * @param cloudControlPlaneServer2 the value to set
         * @return this builder
         */
        public Builder cloudControlPlaneServer2(String cloudControlPlaneServer2) {
            this.cloudControlPlaneServer2 = cloudControlPlaneServer2;
            this.__explicitlySet__.add("cloudControlPlaneServer2");
            return this;
        }
        /** The netmask for the control plane network. */
        @com.fasterxml.jackson.annotation.JsonProperty("netmask")
        private String netmask;

        /**
         * The netmask for the control plane network.
         *
         * @param netmask the value to set
         * @return this builder
         */
        public Builder netmask(String netmask) {
            this.netmask = netmask;
            this.__explicitlySet__.add("netmask");
            return this;
        }
        /** The gateway for the control plane network. */
        @com.fasterxml.jackson.annotation.JsonProperty("gateway")
        private String gateway;

        /**
         * The gateway for the control plane network.
         *
         * @param gateway the value to set
         * @return this builder
         */
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            this.__explicitlySet__.add("gateway");
            return this;
        }
        /** The CIDR block for the Exadata administration network. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminNetworkCIDR")
        private String adminNetworkCIDR;

        /**
         * The CIDR block for the Exadata administration network.
         *
         * @param adminNetworkCIDR the value to set
         * @return this builder
         */
        public Builder adminNetworkCIDR(String adminNetworkCIDR) {
            this.adminNetworkCIDR = adminNetworkCIDR;
            this.__explicitlySet__.add("adminNetworkCIDR");
            return this;
        }
        /** The CIDR block for the Exadata InfiniBand interconnect. */
        @com.fasterxml.jackson.annotation.JsonProperty("infiniBandNetworkCIDR")
        private String infiniBandNetworkCIDR;

        /**
         * The CIDR block for the Exadata InfiniBand interconnect.
         *
         * @param infiniBandNetworkCIDR the value to set
         * @return this builder
         */
        public Builder infiniBandNetworkCIDR(String infiniBandNetworkCIDR) {
            this.infiniBandNetworkCIDR = infiniBandNetworkCIDR;
            this.__explicitlySet__.add("infiniBandNetworkCIDR");
            return this;
        }
        /** The corporate network proxy for access to the control plane network. */
        @com.fasterxml.jackson.annotation.JsonProperty("corporateProxy")
        private String corporateProxy;

        /**
         * The corporate network proxy for access to the control plane network.
         *
         * @param corporateProxy the value to set
         * @return this builder
         */
        public Builder corporateProxy(String corporateProxy) {
            this.corporateProxy = corporateProxy;
            this.__explicitlySet__.add("corporateProxy");
            return this;
        }
        /** The list of DNS server IP addresses. Maximum of 3 allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsServer")
        private java.util.List<String> dnsServer;

        /**
         * The list of DNS server IP addresses. Maximum of 3 allowed.
         *
         * @param dnsServer the value to set
         * @return this builder
         */
        public Builder dnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            this.__explicitlySet__.add("dnsServer");
            return this;
        }
        /** The list of NTP server IP addresses. Maximum of 3 allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("ntpServer")
        private java.util.List<String> ntpServer;

        /**
         * The list of NTP server IP addresses. Maximum of 3 allowed.
         *
         * @param ntpServer the value to set
         * @return this builder
         */
        public Builder ntpServer(java.util.List<String> ntpServer) {
            this.ntpServer = ntpServer;
            this.__explicitlySet__.add("ntpServer");
            return this;
        }
        /** The date and time the Exadata infrastructure was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Exadata infrastructure was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The CSI Number of the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("csiNumber")
        private String csiNumber;

        /**
         * The CSI Number of the Exadata infrastructure.
         *
         * @param csiNumber the value to set
         * @return this builder
         */
        public Builder csiNumber(String csiNumber) {
            this.csiNumber = csiNumber;
            this.__explicitlySet__.add("csiNumber");
            return this;
        }
        /** The list of contacts for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("contacts")
        private java.util.List<ExadataInfrastructureContact> contacts;

        /**
         * The list of contacts for the Exadata infrastructure.
         *
         * @param contacts the value to set
         * @return this builder
         */
        public Builder contacts(java.util.List<ExadataInfrastructureContact> contacts) {
            this.contacts = contacts;
            this.__explicitlySet__.add("contacts");
            return this;
        }
        /**
         * A field to capture \u2018Maintenance SLO Status\u2019 for the Exadata infrastructure with
         * values \u2018OK\u2019, \u2018DEGRADED\u2019. Default is \u2018OK\u2019 when the
         * infrastructure is provisioned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSLOStatus")
        private MaintenanceSLOStatus maintenanceSLOStatus;

        /**
         * A field to capture \u2018Maintenance SLO Status\u2019 for the Exadata infrastructure with
         * values \u2018OK\u2019, \u2018DEGRADED\u2019. Default is \u2018OK\u2019 when the
         * infrastructure is provisioned.
         *
         * @param maintenanceSLOStatus the value to set
         * @return this builder
         */
        public Builder maintenanceSLOStatus(MaintenanceSLOStatus maintenanceSLOStatus) {
            this.maintenanceSLOStatus = maintenanceSLOStatus;
            this.__explicitlySet__.add("maintenanceSLOStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }
        /** The software version of the storage servers (cells) in the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerVersion")
        private String storageServerVersion;

        /**
         * The software version of the storage servers (cells) in the Exadata infrastructure.
         *
         * @param storageServerVersion the value to set
         * @return this builder
         */
        public Builder storageServerVersion(String storageServerVersion) {
            this.storageServerVersion = storageServerVersion;
            this.__explicitlySet__.add("storageServerVersion");
            return this;
        }
        /** The software version of the database servers (dom0) in the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServerVersion")
        private String dbServerVersion;

        /**
         * The software version of the database servers (dom0) in the Exadata infrastructure.
         *
         * @param dbServerVersion the value to set
         * @return this builder
         */
        public Builder dbServerVersion(String dbServerVersion) {
            this.dbServerVersion = dbServerVersion;
            this.__explicitlySet__.add("dbServerVersion");
            return this;
        }
        /**
         * The monthly software version of the database servers (dom0) in the Exadata
         * infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("monthlyDbServerVersion")
        private String monthlyDbServerVersion;

        /**
         * The monthly software version of the database servers (dom0) in the Exadata
         * infrastructure.
         *
         * @param monthlyDbServerVersion the value to set
         * @return this builder
         */
        public Builder monthlyDbServerVersion(String monthlyDbServerVersion) {
            this.monthlyDbServerVersion = monthlyDbServerVersion;
            this.__explicitlySet__.add("monthlyDbServerVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
        private String lastMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last maintenance run.
         *
         * @param lastMaintenanceRunId the value to set
         * @return this builder
         */
        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = lastMaintenanceRunId;
            this.__explicitlySet__.add("lastMaintenanceRunId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * next maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
        private String nextMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * next maintenance run.
         *
         * @param nextMaintenanceRunId the value to set
         * @return this builder
         */
        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = nextMaintenanceRunId;
            this.__explicitlySet__.add("nextMaintenanceRunId");
            return this;
        }
        /**
         * Indicates whether cps offline diagnostic report is enabled for this Exadata
         * infrastructure. This will allow a customer to quickly check status themselves and fix
         * problems on their end, saving time and frustration for both Oracle and the customer when
         * they find the CPS in a disconnected state.You can enable offline diagnostic report during
         * Exadata infrastructure provisioning. You can also disable or enable it at any time using
         * the UpdateExadatainfrastructure API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCpsOfflineReportEnabled")
        private Boolean isCpsOfflineReportEnabled;

        /**
         * Indicates whether cps offline diagnostic report is enabled for this Exadata
         * infrastructure. This will allow a customer to quickly check status themselves and fix
         * problems on their end, saving time and frustration for both Oracle and the customer when
         * they find the CPS in a disconnected state.You can enable offline diagnostic report during
         * Exadata infrastructure provisioning. You can also disable or enable it at any time using
         * the UpdateExadatainfrastructure API.
         *
         * @param isCpsOfflineReportEnabled the value to set
         * @return this builder
         */
        public Builder isCpsOfflineReportEnabled(Boolean isCpsOfflineReportEnabled) {
            this.isCpsOfflineReportEnabled = isCpsOfflineReportEnabled;
            this.__explicitlySet__.add("isCpsOfflineReportEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkBondingModeDetails")
        private NetworkBondingModeDetails networkBondingModeDetails;

        public Builder networkBondingModeDetails(
                NetworkBondingModeDetails networkBondingModeDetails) {
            this.networkBondingModeDetails = networkBondingModeDetails;
            this.__explicitlySet__.add("networkBondingModeDetails");
            return this;
        }
        /** The name of the availability domain that the Exadata infrastructure is located in. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the Exadata infrastructure is located in.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInfrastructure build() {
            ExadataInfrastructure model =
                    new ExadataInfrastructure(
                            this.id,
                            this.compartmentId,
                            this.lifecycleState,
                            this.displayName,
                            this.shape,
                            this.timeZone,
                            this.cpusEnabled,
                            this.maxCpuCount,
                            this.memorySizeInGBs,
                            this.maxMemoryInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.maxDbNodeStorageInGBs,
                            this.dataStorageSizeInTBs,
                            this.maxDataStorageInTBs,
                            this.rackSerialNumber,
                            this.storageCount,
                            this.additionalStorageCount,
                            this.activatedStorageCount,
                            this.computeCount,
                            this.isMultiRackDeployment,
                            this.multiRackConfigurationFile,
                            this.additionalComputeCount,
                            this.additionalComputeSystemModel,
                            this.cloudControlPlaneServer1,
                            this.cloudControlPlaneServer2,
                            this.netmask,
                            this.gateway,
                            this.adminNetworkCIDR,
                            this.infiniBandNetworkCIDR,
                            this.corporateProxy,
                            this.dnsServer,
                            this.ntpServer,
                            this.timeCreated,
                            this.lifecycleDetails,
                            this.csiNumber,
                            this.contacts,
                            this.maintenanceSLOStatus,
                            this.maintenanceWindow,
                            this.storageServerVersion,
                            this.dbServerVersion,
                            this.monthlyDbServerVersion,
                            this.lastMaintenanceRunId,
                            this.nextMaintenanceRunId,
                            this.isCpsOfflineReportEnabled,
                            this.networkBondingModeDetails,
                            this.availabilityDomain,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInfrastructure model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("cpusEnabled")) {
                this.cpusEnabled(model.getCpusEnabled());
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
            if (model.wasPropertyExplicitlySet("rackSerialNumber")) {
                this.rackSerialNumber(model.getRackSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("storageCount")) {
                this.storageCount(model.getStorageCount());
            }
            if (model.wasPropertyExplicitlySet("additionalStorageCount")) {
                this.additionalStorageCount(model.getAdditionalStorageCount());
            }
            if (model.wasPropertyExplicitlySet("activatedStorageCount")) {
                this.activatedStorageCount(model.getActivatedStorageCount());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("isMultiRackDeployment")) {
                this.isMultiRackDeployment(model.getIsMultiRackDeployment());
            }
            if (model.wasPropertyExplicitlySet("multiRackConfigurationFile")) {
                this.multiRackConfigurationFile(model.getMultiRackConfigurationFile());
            }
            if (model.wasPropertyExplicitlySet("additionalComputeCount")) {
                this.additionalComputeCount(model.getAdditionalComputeCount());
            }
            if (model.wasPropertyExplicitlySet("additionalComputeSystemModel")) {
                this.additionalComputeSystemModel(model.getAdditionalComputeSystemModel());
            }
            if (model.wasPropertyExplicitlySet("cloudControlPlaneServer1")) {
                this.cloudControlPlaneServer1(model.getCloudControlPlaneServer1());
            }
            if (model.wasPropertyExplicitlySet("cloudControlPlaneServer2")) {
                this.cloudControlPlaneServer2(model.getCloudControlPlaneServer2());
            }
            if (model.wasPropertyExplicitlySet("netmask")) {
                this.netmask(model.getNetmask());
            }
            if (model.wasPropertyExplicitlySet("gateway")) {
                this.gateway(model.getGateway());
            }
            if (model.wasPropertyExplicitlySet("adminNetworkCIDR")) {
                this.adminNetworkCIDR(model.getAdminNetworkCIDR());
            }
            if (model.wasPropertyExplicitlySet("infiniBandNetworkCIDR")) {
                this.infiniBandNetworkCIDR(model.getInfiniBandNetworkCIDR());
            }
            if (model.wasPropertyExplicitlySet("corporateProxy")) {
                this.corporateProxy(model.getCorporateProxy());
            }
            if (model.wasPropertyExplicitlySet("dnsServer")) {
                this.dnsServer(model.getDnsServer());
            }
            if (model.wasPropertyExplicitlySet("ntpServer")) {
                this.ntpServer(model.getNtpServer());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("csiNumber")) {
                this.csiNumber(model.getCsiNumber());
            }
            if (model.wasPropertyExplicitlySet("contacts")) {
                this.contacts(model.getContacts());
            }
            if (model.wasPropertyExplicitlySet("maintenanceSLOStatus")) {
                this.maintenanceSLOStatus(model.getMaintenanceSLOStatus());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("storageServerVersion")) {
                this.storageServerVersion(model.getStorageServerVersion());
            }
            if (model.wasPropertyExplicitlySet("dbServerVersion")) {
                this.dbServerVersion(model.getDbServerVersion());
            }
            if (model.wasPropertyExplicitlySet("monthlyDbServerVersion")) {
                this.monthlyDbServerVersion(model.getMonthlyDbServerVersion());
            }
            if (model.wasPropertyExplicitlySet("lastMaintenanceRunId")) {
                this.lastMaintenanceRunId(model.getLastMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("nextMaintenanceRunId")) {
                this.nextMaintenanceRunId(model.getNextMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("isCpsOfflineReportEnabled")) {
                this.isCpsOfflineReportEnabled(model.getIsCpsOfflineReportEnabled());
            }
            if (model.wasPropertyExplicitlySet("networkBondingModeDetails")) {
                this.networkBondingModeDetails(model.getNetworkBondingModeDetails());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** The current lifecycle state of the Exadata infrastructure. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        RequiresActivation("REQUIRES_ACTIVATION"),
        Activating("ACTIVATING"),
        Active("ACTIVE"),
        ActivationFailed("ACTIVATION_FAILED"),
        Failed("FAILED"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Disconnected("DISCONNECTED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        WaitingForConnectivity("WAITING_FOR_CONNECTIVITY"),

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
    /** The current lifecycle state of the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the Exadata infrastructure.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The user-friendly name for the Exadata Cloud@Customer infrastructure. The name does not need
     * to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata Cloud@Customer infrastructure. The name does not need
     * to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and
     * memory resources allocated to the instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and
     * memory resources allocated to the instance.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /**
     * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time
     * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time
     * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /** The number of enabled CPU cores. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
    private final Integer cpusEnabled;

    /**
     * The number of enabled CPU cores.
     *
     * @return the value
     */
    public Integer getCpusEnabled() {
        return cpusEnabled;
    }

    /** The total number of CPU cores available. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
    private final Integer maxCpuCount;

    /**
     * The total number of CPU cores available.
     *
     * @return the value
     */
    public Integer getMaxCpuCount() {
        return maxCpuCount;
    }

    /** The memory allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The memory allocated in GBs.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /** The total memory available in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
    private final Integer maxMemoryInGBs;

    /**
     * The total memory available in GBs.
     *
     * @return the value
     */
    public Integer getMaxMemoryInGBs() {
        return maxMemoryInGBs;
    }

    /** The local node storage allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The local node storage allocated in GBs.
     *
     * @return the value
     */
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /** The total local node storage available in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
    private final Integer maxDbNodeStorageInGBs;

    /**
     * The total local node storage available in GBs.
     *
     * @return the value
     */
    public Integer getMaxDbNodeStorageInGBs() {
        return maxDbNodeStorageInGBs;
    }

    /** Size, in terabytes, of the DATA disk group. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Double dataStorageSizeInTBs;

    /**
     * Size, in terabytes, of the DATA disk group.
     *
     * @return the value
     */
    public Double getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /** The total available DATA disk group size. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxDataStorageInTBs")
    private final Double maxDataStorageInTBs;

    /**
     * The total available DATA disk group size.
     *
     * @return the value
     */
    public Double getMaxDataStorageInTBs() {
        return maxDataStorageInTBs;
    }

    /** The serial number for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("rackSerialNumber")
    private final String rackSerialNumber;

    /**
     * The serial number for the Exadata infrastructure.
     *
     * @return the value
     */
    public String getRackSerialNumber() {
        return rackSerialNumber;
    }

    /** The number of Exadata storage servers for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
    private final Integer storageCount;

    /**
     * The number of Exadata storage servers for the Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getStorageCount() {
        return storageCount;
    }

    /** The requested number of additional storage servers for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalStorageCount")
    private final Integer additionalStorageCount;

    /**
     * The requested number of additional storage servers for the Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getAdditionalStorageCount() {
        return additionalStorageCount;
    }

    /**
     * The requested number of additional storage servers activated for the Exadata infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activatedStorageCount")
    private final Integer activatedStorageCount;

    /**
     * The requested number of additional storage servers activated for the Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getActivatedStorageCount() {
        return activatedStorageCount;
    }

    /** The number of compute servers for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Integer computeCount;

    /**
     * The number of compute servers for the Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getComputeCount() {
        return computeCount;
    }

    /** Indicates if deployment is Multi-Rack or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiRackDeployment")
    private final Boolean isMultiRackDeployment;

    /**
     * Indicates if deployment is Multi-Rack or not.
     *
     * @return the value
     */
    public Boolean getIsMultiRackDeployment() {
        return isMultiRackDeployment;
    }

    /** The base64 encoded Multi-Rack configuration json file. */
    @com.fasterxml.jackson.annotation.JsonProperty("multiRackConfigurationFile")
    private final byte[] multiRackConfigurationFile;

    /**
     * The base64 encoded Multi-Rack configuration json file.
     *
     * @return the value
     */
    public byte[] getMultiRackConfigurationFile() {
        return multiRackConfigurationFile;
    }

    /** The requested number of additional compute servers for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalComputeCount")
    private final Integer additionalComputeCount;

    /**
     * The requested number of additional compute servers for the Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getAdditionalComputeCount() {
        return additionalComputeCount;
    }

    /**
     * Oracle Exadata System Model specification. The system model determines the amount of compute
     * or storage server resources available for use. For more information, please see [System and
     * Shape Configuration Options]
     * (https://docs.oracle.com/en/engineered-systems/exadata-cloud-at-customer/ecccm/ecc-system-config-options.html#GUID-9E090174-5C57-4EB1-9243-B470F9F10D6B)
     */
    public enum AdditionalComputeSystemModel implements com.oracle.bmc.http.internal.BmcEnum {
        X7("X7"),
        X8("X8"),
        X8M("X8M"),
        X9M("X9M"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AdditionalComputeSystemModel.class);

        private final String value;
        private static java.util.Map<String, AdditionalComputeSystemModel> map;

        static {
            map = new java.util.HashMap<>();
            for (AdditionalComputeSystemModel v : AdditionalComputeSystemModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AdditionalComputeSystemModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AdditionalComputeSystemModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AdditionalComputeSystemModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Oracle Exadata System Model specification. The system model determines the amount of compute
     * or storage server resources available for use. For more information, please see [System and
     * Shape Configuration Options]
     * (https://docs.oracle.com/en/engineered-systems/exadata-cloud-at-customer/ecccm/ecc-system-config-options.html#GUID-9E090174-5C57-4EB1-9243-B470F9F10D6B)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalComputeSystemModel")
    private final AdditionalComputeSystemModel additionalComputeSystemModel;

    /**
     * Oracle Exadata System Model specification. The system model determines the amount of compute
     * or storage server resources available for use. For more information, please see [System and
     * Shape Configuration Options]
     * (https://docs.oracle.com/en/engineered-systems/exadata-cloud-at-customer/ecccm/ecc-system-config-options.html#GUID-9E090174-5C57-4EB1-9243-B470F9F10D6B)
     *
     * @return the value
     */
    public AdditionalComputeSystemModel getAdditionalComputeSystemModel() {
        return additionalComputeSystemModel;
    }

    /** The IP address for the first control plane server. */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudControlPlaneServer1")
    private final String cloudControlPlaneServer1;

    /**
     * The IP address for the first control plane server.
     *
     * @return the value
     */
    public String getCloudControlPlaneServer1() {
        return cloudControlPlaneServer1;
    }

    /** The IP address for the second control plane server. */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudControlPlaneServer2")
    private final String cloudControlPlaneServer2;

    /**
     * The IP address for the second control plane server.
     *
     * @return the value
     */
    public String getCloudControlPlaneServer2() {
        return cloudControlPlaneServer2;
    }

    /** The netmask for the control plane network. */
    @com.fasterxml.jackson.annotation.JsonProperty("netmask")
    private final String netmask;

    /**
     * The netmask for the control plane network.
     *
     * @return the value
     */
    public String getNetmask() {
        return netmask;
    }

    /** The gateway for the control plane network. */
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    private final String gateway;

    /**
     * The gateway for the control plane network.
     *
     * @return the value
     */
    public String getGateway() {
        return gateway;
    }

    /** The CIDR block for the Exadata administration network. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminNetworkCIDR")
    private final String adminNetworkCIDR;

    /**
     * The CIDR block for the Exadata administration network.
     *
     * @return the value
     */
    public String getAdminNetworkCIDR() {
        return adminNetworkCIDR;
    }

    /** The CIDR block for the Exadata InfiniBand interconnect. */
    @com.fasterxml.jackson.annotation.JsonProperty("infiniBandNetworkCIDR")
    private final String infiniBandNetworkCIDR;

    /**
     * The CIDR block for the Exadata InfiniBand interconnect.
     *
     * @return the value
     */
    public String getInfiniBandNetworkCIDR() {
        return infiniBandNetworkCIDR;
    }

    /** The corporate network proxy for access to the control plane network. */
    @com.fasterxml.jackson.annotation.JsonProperty("corporateProxy")
    private final String corporateProxy;

    /**
     * The corporate network proxy for access to the control plane network.
     *
     * @return the value
     */
    public String getCorporateProxy() {
        return corporateProxy;
    }

    /** The list of DNS server IP addresses. Maximum of 3 allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServer")
    private final java.util.List<String> dnsServer;

    /**
     * The list of DNS server IP addresses. Maximum of 3 allowed.
     *
     * @return the value
     */
    public java.util.List<String> getDnsServer() {
        return dnsServer;
    }

    /** The list of NTP server IP addresses. Maximum of 3 allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("ntpServer")
    private final java.util.List<String> ntpServer;

    /**
     * The list of NTP server IP addresses. Maximum of 3 allowed.
     *
     * @return the value
     */
    public java.util.List<String> getNtpServer() {
        return ntpServer;
    }

    /** The date and time the Exadata infrastructure was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Exadata infrastructure was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The CSI Number of the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("csiNumber")
    private final String csiNumber;

    /**
     * The CSI Number of the Exadata infrastructure.
     *
     * @return the value
     */
    public String getCsiNumber() {
        return csiNumber;
    }

    /** The list of contacts for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("contacts")
    private final java.util.List<ExadataInfrastructureContact> contacts;

    /**
     * The list of contacts for the Exadata infrastructure.
     *
     * @return the value
     */
    public java.util.List<ExadataInfrastructureContact> getContacts() {
        return contacts;
    }

    /**
     * A field to capture \u2018Maintenance SLO Status\u2019 for the Exadata infrastructure with
     * values \u2018OK\u2019, \u2018DEGRADED\u2019. Default is \u2018OK\u2019 when the
     * infrastructure is provisioned.
     */
    public enum MaintenanceSLOStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Ok("OK"),
        Degraded("DEGRADED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaintenanceSLOStatus.class);

        private final String value;
        private static java.util.Map<String, MaintenanceSLOStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceSLOStatus v : MaintenanceSLOStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceSLOStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceSLOStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceSLOStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A field to capture \u2018Maintenance SLO Status\u2019 for the Exadata infrastructure with
     * values \u2018OK\u2019, \u2018DEGRADED\u2019. Default is \u2018OK\u2019 when the
     * infrastructure is provisioned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSLOStatus")
    private final MaintenanceSLOStatus maintenanceSLOStatus;

    /**
     * A field to capture \u2018Maintenance SLO Status\u2019 for the Exadata infrastructure with
     * values \u2018OK\u2019, \u2018DEGRADED\u2019. Default is \u2018OK\u2019 when the
     * infrastructure is provisioned.
     *
     * @return the value
     */
    public MaintenanceSLOStatus getMaintenanceSLOStatus() {
        return maintenanceSLOStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /** The software version of the storage servers (cells) in the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerVersion")
    private final String storageServerVersion;

    /**
     * The software version of the storage servers (cells) in the Exadata infrastructure.
     *
     * @return the value
     */
    public String getStorageServerVersion() {
        return storageServerVersion;
    }

    /** The software version of the database servers (dom0) in the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServerVersion")
    private final String dbServerVersion;

    /**
     * The software version of the database servers (dom0) in the Exadata infrastructure.
     *
     * @return the value
     */
    public String getDbServerVersion() {
        return dbServerVersion;
    }

    /**
     * The monthly software version of the database servers (dom0) in the Exadata infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monthlyDbServerVersion")
    private final String monthlyDbServerVersion;

    /**
     * The monthly software version of the database servers (dom0) in the Exadata infrastructure.
     *
     * @return the value
     */
    public String getMonthlyDbServerVersion() {
        return monthlyDbServerVersion;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
    private final String lastMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last maintenance run.
     *
     * @return the value
     */
    public String getLastMaintenanceRunId() {
        return lastMaintenanceRunId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * next maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
    private final String nextMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * next maintenance run.
     *
     * @return the value
     */
    public String getNextMaintenanceRunId() {
        return nextMaintenanceRunId;
    }

    /**
     * Indicates whether cps offline diagnostic report is enabled for this Exadata infrastructure.
     * This will allow a customer to quickly check status themselves and fix problems on their end,
     * saving time and frustration for both Oracle and the customer when they find the CPS in a
     * disconnected state.You can enable offline diagnostic report during Exadata infrastructure
     * provisioning. You can also disable or enable it at any time using the
     * UpdateExadatainfrastructure API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCpsOfflineReportEnabled")
    private final Boolean isCpsOfflineReportEnabled;

    /**
     * Indicates whether cps offline diagnostic report is enabled for this Exadata infrastructure.
     * This will allow a customer to quickly check status themselves and fix problems on their end,
     * saving time and frustration for both Oracle and the customer when they find the CPS in a
     * disconnected state.You can enable offline diagnostic report during Exadata infrastructure
     * provisioning. You can also disable or enable it at any time using the
     * UpdateExadatainfrastructure API.
     *
     * @return the value
     */
    public Boolean getIsCpsOfflineReportEnabled() {
        return isCpsOfflineReportEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkBondingModeDetails")
    private final NetworkBondingModeDetails networkBondingModeDetails;

    public NetworkBondingModeDetails getNetworkBondingModeDetails() {
        return networkBondingModeDetails;
    }

    /** The name of the availability domain that the Exadata infrastructure is located in. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the Exadata infrastructure is located in.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
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
        sb.append("ExadataInfrastructure(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", cpusEnabled=").append(String.valueOf(this.cpusEnabled));
        sb.append(", maxCpuCount=").append(String.valueOf(this.maxCpuCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", maxMemoryInGBs=").append(String.valueOf(this.maxMemoryInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", maxDbNodeStorageInGBs=").append(String.valueOf(this.maxDbNodeStorageInGBs));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", maxDataStorageInTBs=").append(String.valueOf(this.maxDataStorageInTBs));
        sb.append(", rackSerialNumber=").append(String.valueOf(this.rackSerialNumber));
        sb.append(", storageCount=").append(String.valueOf(this.storageCount));
        sb.append(", additionalStorageCount=").append(String.valueOf(this.additionalStorageCount));
        sb.append(", activatedStorageCount=").append(String.valueOf(this.activatedStorageCount));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", isMultiRackDeployment=").append(String.valueOf(this.isMultiRackDeployment));
        sb.append(", multiRackConfigurationFile=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.multiRackConfigurationFile)
                                : (String.valueOf(this.multiRackConfigurationFile)
                                        + (this.multiRackConfigurationFile != null
                                                ? " (byte["
                                                        + this.multiRackConfigurationFile.length
                                                        + "])"
                                                : ""))));
        sb.append(", additionalComputeCount=").append(String.valueOf(this.additionalComputeCount));
        sb.append(", additionalComputeSystemModel=")
                .append(String.valueOf(this.additionalComputeSystemModel));
        sb.append(", cloudControlPlaneServer1=")
                .append(String.valueOf(this.cloudControlPlaneServer1));
        sb.append(", cloudControlPlaneServer2=")
                .append(String.valueOf(this.cloudControlPlaneServer2));
        sb.append(", netmask=").append(String.valueOf(this.netmask));
        sb.append(", gateway=").append(String.valueOf(this.gateway));
        sb.append(", adminNetworkCIDR=").append(String.valueOf(this.adminNetworkCIDR));
        sb.append(", infiniBandNetworkCIDR=").append(String.valueOf(this.infiniBandNetworkCIDR));
        sb.append(", corporateProxy=").append(String.valueOf(this.corporateProxy));
        sb.append(", dnsServer=").append(String.valueOf(this.dnsServer));
        sb.append(", ntpServer=").append(String.valueOf(this.ntpServer));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", csiNumber=").append(String.valueOf(this.csiNumber));
        sb.append(", contacts=").append(String.valueOf(this.contacts));
        sb.append(", maintenanceSLOStatus=").append(String.valueOf(this.maintenanceSLOStatus));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", storageServerVersion=").append(String.valueOf(this.storageServerVersion));
        sb.append(", dbServerVersion=").append(String.valueOf(this.dbServerVersion));
        sb.append(", monthlyDbServerVersion=").append(String.valueOf(this.monthlyDbServerVersion));
        sb.append(", lastMaintenanceRunId=").append(String.valueOf(this.lastMaintenanceRunId));
        sb.append(", nextMaintenanceRunId=").append(String.valueOf(this.nextMaintenanceRunId));
        sb.append(", isCpsOfflineReportEnabled=")
                .append(String.valueOf(this.isCpsOfflineReportEnabled));
        sb.append(", networkBondingModeDetails=")
                .append(String.valueOf(this.networkBondingModeDetails));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
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
        if (!(o instanceof ExadataInfrastructure)) {
            return false;
        }

        ExadataInfrastructure other = (ExadataInfrastructure) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.cpusEnabled, other.cpusEnabled)
                && java.util.Objects.equals(this.maxCpuCount, other.maxCpuCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.maxMemoryInGBs, other.maxMemoryInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.maxDbNodeStorageInGBs, other.maxDbNodeStorageInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.maxDataStorageInTBs, other.maxDataStorageInTBs)
                && java.util.Objects.equals(this.rackSerialNumber, other.rackSerialNumber)
                && java.util.Objects.equals(this.storageCount, other.storageCount)
                && java.util.Objects.equals(
                        this.additionalStorageCount, other.additionalStorageCount)
                && java.util.Objects.equals(this.activatedStorageCount, other.activatedStorageCount)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.isMultiRackDeployment, other.isMultiRackDeployment)
                && java.util.Arrays.equals(
                        this.multiRackConfigurationFile, other.multiRackConfigurationFile)
                && java.util.Objects.equals(
                        this.additionalComputeCount, other.additionalComputeCount)
                && java.util.Objects.equals(
                        this.additionalComputeSystemModel, other.additionalComputeSystemModel)
                && java.util.Objects.equals(
                        this.cloudControlPlaneServer1, other.cloudControlPlaneServer1)
                && java.util.Objects.equals(
                        this.cloudControlPlaneServer2, other.cloudControlPlaneServer2)
                && java.util.Objects.equals(this.netmask, other.netmask)
                && java.util.Objects.equals(this.gateway, other.gateway)
                && java.util.Objects.equals(this.adminNetworkCIDR, other.adminNetworkCIDR)
                && java.util.Objects.equals(this.infiniBandNetworkCIDR, other.infiniBandNetworkCIDR)
                && java.util.Objects.equals(this.corporateProxy, other.corporateProxy)
                && java.util.Objects.equals(this.dnsServer, other.dnsServer)
                && java.util.Objects.equals(this.ntpServer, other.ntpServer)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.csiNumber, other.csiNumber)
                && java.util.Objects.equals(this.contacts, other.contacts)
                && java.util.Objects.equals(this.maintenanceSLOStatus, other.maintenanceSLOStatus)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.storageServerVersion, other.storageServerVersion)
                && java.util.Objects.equals(this.dbServerVersion, other.dbServerVersion)
                && java.util.Objects.equals(
                        this.monthlyDbServerVersion, other.monthlyDbServerVersion)
                && java.util.Objects.equals(this.lastMaintenanceRunId, other.lastMaintenanceRunId)
                && java.util.Objects.equals(this.nextMaintenanceRunId, other.nextMaintenanceRunId)
                && java.util.Objects.equals(
                        this.isCpsOfflineReportEnabled, other.isCpsOfflineReportEnabled)
                && java.util.Objects.equals(
                        this.networkBondingModeDetails, other.networkBondingModeDetails)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.cpusEnabled == null ? 43 : this.cpusEnabled.hashCode());
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
                        + (this.rackSerialNumber == null ? 43 : this.rackSerialNumber.hashCode());
        result = (result * PRIME) + (this.storageCount == null ? 43 : this.storageCount.hashCode());
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
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiRackDeployment == null
                                ? 43
                                : this.isMultiRackDeployment.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.multiRackConfigurationFile);
        result =
                (result * PRIME)
                        + (this.additionalComputeCount == null
                                ? 43
                                : this.additionalComputeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalComputeSystemModel == null
                                ? 43
                                : this.additionalComputeSystemModel.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudControlPlaneServer1 == null
                                ? 43
                                : this.cloudControlPlaneServer1.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudControlPlaneServer2 == null
                                ? 43
                                : this.cloudControlPlaneServer2.hashCode());
        result = (result * PRIME) + (this.netmask == null ? 43 : this.netmask.hashCode());
        result = (result * PRIME) + (this.gateway == null ? 43 : this.gateway.hashCode());
        result =
                (result * PRIME)
                        + (this.adminNetworkCIDR == null ? 43 : this.adminNetworkCIDR.hashCode());
        result =
                (result * PRIME)
                        + (this.infiniBandNetworkCIDR == null
                                ? 43
                                : this.infiniBandNetworkCIDR.hashCode());
        result =
                (result * PRIME)
                        + (this.corporateProxy == null ? 43 : this.corporateProxy.hashCode());
        result = (result * PRIME) + (this.dnsServer == null ? 43 : this.dnsServer.hashCode());
        result = (result * PRIME) + (this.ntpServer == null ? 43 : this.ntpServer.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.csiNumber == null ? 43 : this.csiNumber.hashCode());
        result = (result * PRIME) + (this.contacts == null ? 43 : this.contacts.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceSLOStatus == null
                                ? 43
                                : this.maintenanceSLOStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
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
                        + (this.monthlyDbServerVersion == null
                                ? 43
                                : this.monthlyDbServerVersion.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isCpsOfflineReportEnabled == null
                                ? 43
                                : this.isCpsOfflineReportEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.networkBondingModeDetails == null
                                ? 43
                                : this.networkBondingModeDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
