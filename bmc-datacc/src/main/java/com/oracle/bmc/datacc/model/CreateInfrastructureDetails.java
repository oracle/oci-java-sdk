/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Request to create Database Infrastructure resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "compartmentId",
        "displayName",
        "systemModel",
        "shape",
        "cloudControlPlaneServer1",
        "cloudControlPlaneServer2",
        "netmask",
        "gateway",
        "adminNetworkcidr",
        "dataDiskPercentage",
        "contacts",
        "dnsServers",
        "ntpServers",
        "clientNetworkBondingMode",
        "backupNetworkBondingMode",
        "cpsNetworkBondingMode",
        "clientNetworkBondingInterface",
        "backupNetworkBondingInterface",
        "cpsNetworkBondingInterface",
        "acfsFileSystemStorageInGbs",
        "corporateProxy",
        "vlanId",
        "maintenanceWindow",
        "freeformTags",
        "definedTags"
    })
    public CreateInfrastructureDetails(
            String description,
            String compartmentId,
            String displayName,
            SystemModelEnum systemModel,
            ShapeEnum shape,
            String cloudControlPlaneServer1,
            String cloudControlPlaneServer2,
            String netmask,
            String gateway,
            String adminNetworkcidr,
            Integer dataDiskPercentage,
            java.util.List<InfrastructureContact> contacts,
            java.util.List<String> dnsServers,
            java.util.List<String> ntpServers,
            NetworkBondingMode clientNetworkBondingMode,
            NetworkBondingMode backupNetworkBondingMode,
            NetworkBondingMode cpsNetworkBondingMode,
            NetworkBondingInterfaceEnum clientNetworkBondingInterface,
            NetworkBondingInterfaceEnum backupNetworkBondingInterface,
            NetworkBondingInterfaceEnum cpsNetworkBondingInterface,
            Double acfsFileSystemStorageInGbs,
            String corporateProxy,
            String vlanId,
            MaintenanceWindow maintenanceWindow,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.systemModel = systemModel;
        this.shape = shape;
        this.cloudControlPlaneServer1 = cloudControlPlaneServer1;
        this.cloudControlPlaneServer2 = cloudControlPlaneServer2;
        this.netmask = netmask;
        this.gateway = gateway;
        this.adminNetworkcidr = adminNetworkcidr;
        this.dataDiskPercentage = dataDiskPercentage;
        this.contacts = contacts;
        this.dnsServers = dnsServers;
        this.ntpServers = ntpServers;
        this.clientNetworkBondingMode = clientNetworkBondingMode;
        this.backupNetworkBondingMode = backupNetworkBondingMode;
        this.cpsNetworkBondingMode = cpsNetworkBondingMode;
        this.clientNetworkBondingInterface = clientNetworkBondingInterface;
        this.backupNetworkBondingInterface = backupNetworkBondingInterface;
        this.cpsNetworkBondingInterface = cpsNetworkBondingInterface;
        this.acfsFileSystemStorageInGbs = acfsFileSystemStorageInGbs;
        this.corporateProxy = corporateProxy;
        this.vlanId = vlanId;
        this.maintenanceWindow = maintenanceWindow;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Database Infrastructure description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Database Infrastructure description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
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
         * The user-friendly name for the Database Infrastructure. The name does not need to be
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Database Infrastructure. The name does not need to be
         * unique.
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
         * Database Infrastructure System Model specification. The system model determines the model
         * of the Database Infrastructure hardware to be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemModel")
        private SystemModelEnum systemModel;

        /**
         * Database Infrastructure System Model specification. The system model determines the model
         * of the Database Infrastructure hardware to be used.
         *
         * @param systemModel the value to set
         * @return this builder
         */
        public Builder systemModel(SystemModelEnum systemModel) {
            this.systemModel = systemModel;
            this.__explicitlySet__.add("systemModel");
            return this;
        }
        /**
         * The shape of the Database Infrastructure. The shape determines the amount of CPU,
         * storage, and memory resources allocated to the instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private ShapeEnum shape;

        /**
         * The shape of the Database Infrastructure. The shape determines the amount of CPU,
         * storage, and memory resources allocated to the instance.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(ShapeEnum shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
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
        /**
         * The CIDR block for the system network. The system network is a private network in
         * Database Infrastructure and is not connected to your corporate network. The system
         * network is used for storage (ASM) traffic, high-performance interconnect traffic and
         * administration of infrastructure components.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminNetworkcidr")
        private String adminNetworkcidr;

        /**
         * The CIDR block for the system network. The system network is a private network in
         * Database Infrastructure and is not connected to your corporate network. The system
         * network is used for storage (ASM) traffic, high-performance interconnect traffic and
         * administration of infrastructure components.
         *
         * @param adminNetworkcidr the value to set
         * @return this builder
         */
        public Builder adminNetworkcidr(String adminNetworkcidr) {
            this.adminNetworkcidr = adminNetworkcidr;
            this.__explicitlySet__.add("adminNetworkcidr");
            return this;
        }
        /**
         * Percentage of disk space assigned for DATA disk group. Remaining disk space will get
         * assiged to RECO disk group
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataDiskPercentage")
        private Integer dataDiskPercentage;

        /**
         * Percentage of disk space assigned for DATA disk group. Remaining disk space will get
         * assiged to RECO disk group
         *
         * @param dataDiskPercentage the value to set
         * @return this builder
         */
        public Builder dataDiskPercentage(Integer dataDiskPercentage) {
            this.dataDiskPercentage = dataDiskPercentage;
            this.__explicitlySet__.add("dataDiskPercentage");
            return this;
        }
        /** The list of contacts for the Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("contacts")
        private java.util.List<InfrastructureContact> contacts;

        /**
         * The list of contacts for the Database Infrastructure.
         *
         * @param contacts the value to set
         * @return this builder
         */
        public Builder contacts(java.util.List<InfrastructureContact> contacts) {
            this.contacts = contacts;
            this.__explicitlySet__.add("contacts");
            return this;
        }
        /** The list of DNS server IP addresses. Maximum of 3 allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsServers")
        private java.util.List<String> dnsServers;

        /**
         * The list of DNS server IP addresses. Maximum of 3 allowed.
         *
         * @param dnsServers the value to set
         * @return this builder
         */
        public Builder dnsServers(java.util.List<String> dnsServers) {
            this.dnsServers = dnsServers;
            this.__explicitlySet__.add("dnsServers");
            return this;
        }
        /** The list of NTP server IP addresses. Maximum of 3 allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("ntpServers")
        private java.util.List<String> ntpServers;

        /**
         * The list of NTP server IP addresses. Maximum of 3 allowed.
         *
         * @param ntpServers the value to set
         * @return this builder
         */
        public Builder ntpServers(java.util.List<String> ntpServers) {
            this.ntpServers = ntpServers;
            this.__explicitlySet__.add("ntpServers");
            return this;
        }
        /** The network bonding mode for Client networks for the Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientNetworkBondingMode")
        private NetworkBondingMode clientNetworkBondingMode;

        /**
         * The network bonding mode for Client networks for the Database Infrastructure.
         *
         * @param clientNetworkBondingMode the value to set
         * @return this builder
         */
        public Builder clientNetworkBondingMode(NetworkBondingMode clientNetworkBondingMode) {
            this.clientNetworkBondingMode = clientNetworkBondingMode;
            this.__explicitlySet__.add("clientNetworkBondingMode");
            return this;
        }
        /** The network bonding mode for Backup networks for the Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkBondingMode")
        private NetworkBondingMode backupNetworkBondingMode;

        /**
         * The network bonding mode for Backup networks for the Database Infrastructure.
         *
         * @param backupNetworkBondingMode the value to set
         * @return this builder
         */
        public Builder backupNetworkBondingMode(NetworkBondingMode backupNetworkBondingMode) {
            this.backupNetworkBondingMode = backupNetworkBondingMode;
            this.__explicitlySet__.add("backupNetworkBondingMode");
            return this;
        }
        /** The network bonding mode for CPS networks for the Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpsNetworkBondingMode")
        private NetworkBondingMode cpsNetworkBondingMode;

        /**
         * The network bonding mode for CPS networks for the Database Infrastructure.
         *
         * @param cpsNetworkBondingMode the value to set
         * @return this builder
         */
        public Builder cpsNetworkBondingMode(NetworkBondingMode cpsNetworkBondingMode) {
            this.cpsNetworkBondingMode = cpsNetworkBondingMode;
            this.__explicitlySet__.add("cpsNetworkBondingMode");
            return this;
        }
        /** The network bonding interface for client network for the Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientNetworkBondingInterface")
        private NetworkBondingInterfaceEnum clientNetworkBondingInterface;

        /**
         * The network bonding interface for client network for the Database Infrastructure.
         *
         * @param clientNetworkBondingInterface the value to set
         * @return this builder
         */
        public Builder clientNetworkBondingInterface(
                NetworkBondingInterfaceEnum clientNetworkBondingInterface) {
            this.clientNetworkBondingInterface = clientNetworkBondingInterface;
            this.__explicitlySet__.add("clientNetworkBondingInterface");
            return this;
        }
        /** The network bonding interface for backup network for the Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkBondingInterface")
        private NetworkBondingInterfaceEnum backupNetworkBondingInterface;

        /**
         * The network bonding interface for backup network for the Database Infrastructure.
         *
         * @param backupNetworkBondingInterface the value to set
         * @return this builder
         */
        public Builder backupNetworkBondingInterface(
                NetworkBondingInterfaceEnum backupNetworkBondingInterface) {
            this.backupNetworkBondingInterface = backupNetworkBondingInterface;
            this.__explicitlySet__.add("backupNetworkBondingInterface");
            return this;
        }
        /** The network bonding interface for CPS network for the Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpsNetworkBondingInterface")
        private NetworkBondingInterfaceEnum cpsNetworkBondingInterface;

        /**
         * The network bonding interface for CPS network for the Database Infrastructure.
         *
         * @param cpsNetworkBondingInterface the value to set
         * @return this builder
         */
        public Builder cpsNetworkBondingInterface(
                NetworkBondingInterfaceEnum cpsNetworkBondingInterface) {
            this.cpsNetworkBondingInterface = cpsNetworkBondingInterface;
            this.__explicitlySet__.add("cpsNetworkBondingInterface");
            return this;
        }
        /**
         * The amount of storage (in GB) in the DATA disk group that is reserved for creating local
         * storage for VM Clusters and application VMs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("acfsFileSystemStorageInGbs")
        private Double acfsFileSystemStorageInGbs;

        /**
         * The amount of storage (in GB) in the DATA disk group that is reserved for creating local
         * storage for VM Clusters and application VMs.
         *
         * @param acfsFileSystemStorageInGbs the value to set
         * @return this builder
         */
        public Builder acfsFileSystemStorageInGbs(Double acfsFileSystemStorageInGbs) {
            this.acfsFileSystemStorageInGbs = acfsFileSystemStorageInGbs;
            this.__explicitlySet__.add("acfsFileSystemStorageInGbs");
            return this;
        }
        /**
         * The corporate network proxy for access to the control plane network. Oracle recommends
         * using an HTTPS proxy when possible for enhanced security.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("corporateProxy")
        private String corporateProxy;

        /**
         * The corporate network proxy for access to the control plane network. Oracle recommends
         * using an HTTPS proxy when possible for enhanced security.
         *
         * @param corporateProxy the value to set
         * @return this builder
         */
        public Builder corporateProxy(String corporateProxy) {
            this.corporateProxy = corporateProxy;
            this.__explicitlySet__.add("corporateProxy");
            return this;
        }
        /** The CPS network VLAN ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * The CPS network VLAN ID.
         *
         * @param vlanId the value to set
         * @return this builder
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
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
         * Simple key-value pair that is applied without any predefined name, type or scope. This
         * tag option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. This
         * tag option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public CreateInfrastructureDetails build() {
            CreateInfrastructureDetails model =
                    new CreateInfrastructureDetails(
                            this.description,
                            this.compartmentId,
                            this.displayName,
                            this.systemModel,
                            this.shape,
                            this.cloudControlPlaneServer1,
                            this.cloudControlPlaneServer2,
                            this.netmask,
                            this.gateway,
                            this.adminNetworkcidr,
                            this.dataDiskPercentage,
                            this.contacts,
                            this.dnsServers,
                            this.ntpServers,
                            this.clientNetworkBondingMode,
                            this.backupNetworkBondingMode,
                            this.cpsNetworkBondingMode,
                            this.clientNetworkBondingInterface,
                            this.backupNetworkBondingInterface,
                            this.cpsNetworkBondingInterface,
                            this.acfsFileSystemStorageInGbs,
                            this.corporateProxy,
                            this.vlanId,
                            this.maintenanceWindow,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("systemModel")) {
                this.systemModel(model.getSystemModel());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
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
            if (model.wasPropertyExplicitlySet("adminNetworkcidr")) {
                this.adminNetworkcidr(model.getAdminNetworkcidr());
            }
            if (model.wasPropertyExplicitlySet("dataDiskPercentage")) {
                this.dataDiskPercentage(model.getDataDiskPercentage());
            }
            if (model.wasPropertyExplicitlySet("contacts")) {
                this.contacts(model.getContacts());
            }
            if (model.wasPropertyExplicitlySet("dnsServers")) {
                this.dnsServers(model.getDnsServers());
            }
            if (model.wasPropertyExplicitlySet("ntpServers")) {
                this.ntpServers(model.getNtpServers());
            }
            if (model.wasPropertyExplicitlySet("clientNetworkBondingMode")) {
                this.clientNetworkBondingMode(model.getClientNetworkBondingMode());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkBondingMode")) {
                this.backupNetworkBondingMode(model.getBackupNetworkBondingMode());
            }
            if (model.wasPropertyExplicitlySet("cpsNetworkBondingMode")) {
                this.cpsNetworkBondingMode(model.getCpsNetworkBondingMode());
            }
            if (model.wasPropertyExplicitlySet("clientNetworkBondingInterface")) {
                this.clientNetworkBondingInterface(model.getClientNetworkBondingInterface());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkBondingInterface")) {
                this.backupNetworkBondingInterface(model.getBackupNetworkBondingInterface());
            }
            if (model.wasPropertyExplicitlySet("cpsNetworkBondingInterface")) {
                this.cpsNetworkBondingInterface(model.getCpsNetworkBondingInterface());
            }
            if (model.wasPropertyExplicitlySet("acfsFileSystemStorageInGbs")) {
                this.acfsFileSystemStorageInGbs(model.getAcfsFileSystemStorageInGbs());
            }
            if (model.wasPropertyExplicitlySet("corporateProxy")) {
                this.corporateProxy(model.getCorporateProxy());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
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

    /** Database Infrastructure description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Database Infrastructure description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
     * The user-friendly name for the Database Infrastructure. The name does not need to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Database Infrastructure. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Database Infrastructure System Model specification. The system model determines the model of
     * the Database Infrastructure hardware to be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemModel")
    private final SystemModelEnum systemModel;

    /**
     * Database Infrastructure System Model specification. The system model determines the model of
     * the Database Infrastructure hardware to be used.
     *
     * @return the value
     */
    public SystemModelEnum getSystemModel() {
        return systemModel;
    }

    /**
     * The shape of the Database Infrastructure. The shape determines the amount of CPU, storage,
     * and memory resources allocated to the instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final ShapeEnum shape;

    /**
     * The shape of the Database Infrastructure. The shape determines the amount of CPU, storage,
     * and memory resources allocated to the instance.
     *
     * @return the value
     */
    public ShapeEnum getShape() {
        return shape;
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

    /**
     * The CIDR block for the system network. The system network is a private network in Database
     * Infrastructure and is not connected to your corporate network. The system network is used for
     * storage (ASM) traffic, high-performance interconnect traffic and administration of
     * infrastructure components.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminNetworkcidr")
    private final String adminNetworkcidr;

    /**
     * The CIDR block for the system network. The system network is a private network in Database
     * Infrastructure and is not connected to your corporate network. The system network is used for
     * storage (ASM) traffic, high-performance interconnect traffic and administration of
     * infrastructure components.
     *
     * @return the value
     */
    public String getAdminNetworkcidr() {
        return adminNetworkcidr;
    }

    /**
     * Percentage of disk space assigned for DATA disk group. Remaining disk space will get assiged
     * to RECO disk group
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataDiskPercentage")
    private final Integer dataDiskPercentage;

    /**
     * Percentage of disk space assigned for DATA disk group. Remaining disk space will get assiged
     * to RECO disk group
     *
     * @return the value
     */
    public Integer getDataDiskPercentage() {
        return dataDiskPercentage;
    }

    /** The list of contacts for the Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("contacts")
    private final java.util.List<InfrastructureContact> contacts;

    /**
     * The list of contacts for the Database Infrastructure.
     *
     * @return the value
     */
    public java.util.List<InfrastructureContact> getContacts() {
        return contacts;
    }

    /** The list of DNS server IP addresses. Maximum of 3 allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServers")
    private final java.util.List<String> dnsServers;

    /**
     * The list of DNS server IP addresses. Maximum of 3 allowed.
     *
     * @return the value
     */
    public java.util.List<String> getDnsServers() {
        return dnsServers;
    }

    /** The list of NTP server IP addresses. Maximum of 3 allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("ntpServers")
    private final java.util.List<String> ntpServers;

    /**
     * The list of NTP server IP addresses. Maximum of 3 allowed.
     *
     * @return the value
     */
    public java.util.List<String> getNtpServers() {
        return ntpServers;
    }

    /** The network bonding mode for Client networks for the Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientNetworkBondingMode")
    private final NetworkBondingMode clientNetworkBondingMode;

    /**
     * The network bonding mode for Client networks for the Database Infrastructure.
     *
     * @return the value
     */
    public NetworkBondingMode getClientNetworkBondingMode() {
        return clientNetworkBondingMode;
    }

    /** The network bonding mode for Backup networks for the Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkBondingMode")
    private final NetworkBondingMode backupNetworkBondingMode;

    /**
     * The network bonding mode for Backup networks for the Database Infrastructure.
     *
     * @return the value
     */
    public NetworkBondingMode getBackupNetworkBondingMode() {
        return backupNetworkBondingMode;
    }

    /** The network bonding mode for CPS networks for the Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpsNetworkBondingMode")
    private final NetworkBondingMode cpsNetworkBondingMode;

    /**
     * The network bonding mode for CPS networks for the Database Infrastructure.
     *
     * @return the value
     */
    public NetworkBondingMode getCpsNetworkBondingMode() {
        return cpsNetworkBondingMode;
    }

    /** The network bonding interface for client network for the Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientNetworkBondingInterface")
    private final NetworkBondingInterfaceEnum clientNetworkBondingInterface;

    /**
     * The network bonding interface for client network for the Database Infrastructure.
     *
     * @return the value
     */
    public NetworkBondingInterfaceEnum getClientNetworkBondingInterface() {
        return clientNetworkBondingInterface;
    }

    /** The network bonding interface for backup network for the Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkBondingInterface")
    private final NetworkBondingInterfaceEnum backupNetworkBondingInterface;

    /**
     * The network bonding interface for backup network for the Database Infrastructure.
     *
     * @return the value
     */
    public NetworkBondingInterfaceEnum getBackupNetworkBondingInterface() {
        return backupNetworkBondingInterface;
    }

    /** The network bonding interface for CPS network for the Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpsNetworkBondingInterface")
    private final NetworkBondingInterfaceEnum cpsNetworkBondingInterface;

    /**
     * The network bonding interface for CPS network for the Database Infrastructure.
     *
     * @return the value
     */
    public NetworkBondingInterfaceEnum getCpsNetworkBondingInterface() {
        return cpsNetworkBondingInterface;
    }

    /**
     * The amount of storage (in GB) in the DATA disk group that is reserved for creating local
     * storage for VM Clusters and application VMs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("acfsFileSystemStorageInGbs")
    private final Double acfsFileSystemStorageInGbs;

    /**
     * The amount of storage (in GB) in the DATA disk group that is reserved for creating local
     * storage for VM Clusters and application VMs.
     *
     * @return the value
     */
    public Double getAcfsFileSystemStorageInGbs() {
        return acfsFileSystemStorageInGbs;
    }

    /**
     * The corporate network proxy for access to the control plane network. Oracle recommends using
     * an HTTPS proxy when possible for enhanced security.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("corporateProxy")
    private final String corporateProxy;

    /**
     * The corporate network proxy for access to the control plane network. Oracle recommends using
     * an HTTPS proxy when possible for enhanced security.
     *
     * @return the value
     */
    public String getCorporateProxy() {
        return corporateProxy;
    }

    /** The CPS network VLAN ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * The CPS network VLAN ID.
     *
     * @return the value
     */
    public String getVlanId() {
        return vlanId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. This tag
     * option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. This tag
     * option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("CreateInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", systemModel=").append(String.valueOf(this.systemModel));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", cloudControlPlaneServer1=")
                .append(String.valueOf(this.cloudControlPlaneServer1));
        sb.append(", cloudControlPlaneServer2=")
                .append(String.valueOf(this.cloudControlPlaneServer2));
        sb.append(", netmask=").append(String.valueOf(this.netmask));
        sb.append(", gateway=").append(String.valueOf(this.gateway));
        sb.append(", adminNetworkcidr=").append(String.valueOf(this.adminNetworkcidr));
        sb.append(", dataDiskPercentage=").append(String.valueOf(this.dataDiskPercentage));
        sb.append(", contacts=").append(String.valueOf(this.contacts));
        sb.append(", dnsServers=").append(String.valueOf(this.dnsServers));
        sb.append(", ntpServers=").append(String.valueOf(this.ntpServers));
        sb.append(", clientNetworkBondingMode=")
                .append(String.valueOf(this.clientNetworkBondingMode));
        sb.append(", backupNetworkBondingMode=")
                .append(String.valueOf(this.backupNetworkBondingMode));
        sb.append(", cpsNetworkBondingMode=").append(String.valueOf(this.cpsNetworkBondingMode));
        sb.append(", clientNetworkBondingInterface=")
                .append(String.valueOf(this.clientNetworkBondingInterface));
        sb.append(", backupNetworkBondingInterface=")
                .append(String.valueOf(this.backupNetworkBondingInterface));
        sb.append(", cpsNetworkBondingInterface=")
                .append(String.valueOf(this.cpsNetworkBondingInterface));
        sb.append(", acfsFileSystemStorageInGbs=")
                .append(String.valueOf(this.acfsFileSystemStorageInGbs));
        sb.append(", corporateProxy=").append(String.valueOf(this.corporateProxy));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
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
        if (!(o instanceof CreateInfrastructureDetails)) {
            return false;
        }

        CreateInfrastructureDetails other = (CreateInfrastructureDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.systemModel, other.systemModel)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(
                        this.cloudControlPlaneServer1, other.cloudControlPlaneServer1)
                && java.util.Objects.equals(
                        this.cloudControlPlaneServer2, other.cloudControlPlaneServer2)
                && java.util.Objects.equals(this.netmask, other.netmask)
                && java.util.Objects.equals(this.gateway, other.gateway)
                && java.util.Objects.equals(this.adminNetworkcidr, other.adminNetworkcidr)
                && java.util.Objects.equals(this.dataDiskPercentage, other.dataDiskPercentage)
                && java.util.Objects.equals(this.contacts, other.contacts)
                && java.util.Objects.equals(this.dnsServers, other.dnsServers)
                && java.util.Objects.equals(this.ntpServers, other.ntpServers)
                && java.util.Objects.equals(
                        this.clientNetworkBondingMode, other.clientNetworkBondingMode)
                && java.util.Objects.equals(
                        this.backupNetworkBondingMode, other.backupNetworkBondingMode)
                && java.util.Objects.equals(this.cpsNetworkBondingMode, other.cpsNetworkBondingMode)
                && java.util.Objects.equals(
                        this.clientNetworkBondingInterface, other.clientNetworkBondingInterface)
                && java.util.Objects.equals(
                        this.backupNetworkBondingInterface, other.backupNetworkBondingInterface)
                && java.util.Objects.equals(
                        this.cpsNetworkBondingInterface, other.cpsNetworkBondingInterface)
                && java.util.Objects.equals(
                        this.acfsFileSystemStorageInGbs, other.acfsFileSystemStorageInGbs)
                && java.util.Objects.equals(this.corporateProxy, other.corporateProxy)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.systemModel == null ? 43 : this.systemModel.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
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
                        + (this.adminNetworkcidr == null ? 43 : this.adminNetworkcidr.hashCode());
        result =
                (result * PRIME)
                        + (this.dataDiskPercentage == null
                                ? 43
                                : this.dataDiskPercentage.hashCode());
        result = (result * PRIME) + (this.contacts == null ? 43 : this.contacts.hashCode());
        result = (result * PRIME) + (this.dnsServers == null ? 43 : this.dnsServers.hashCode());
        result = (result * PRIME) + (this.ntpServers == null ? 43 : this.ntpServers.hashCode());
        result =
                (result * PRIME)
                        + (this.clientNetworkBondingMode == null
                                ? 43
                                : this.clientNetworkBondingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkBondingMode == null
                                ? 43
                                : this.backupNetworkBondingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.cpsNetworkBondingMode == null
                                ? 43
                                : this.cpsNetworkBondingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.clientNetworkBondingInterface == null
                                ? 43
                                : this.clientNetworkBondingInterface.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkBondingInterface == null
                                ? 43
                                : this.backupNetworkBondingInterface.hashCode());
        result =
                (result * PRIME)
                        + (this.cpsNetworkBondingInterface == null
                                ? 43
                                : this.cpsNetworkBondingInterface.hashCode());
        result =
                (result * PRIME)
                        + (this.acfsFileSystemStorageInGbs == null
                                ? 43
                                : this.acfsFileSystemStorageInGbs.hashCode());
        result =
                (result * PRIME)
                        + (this.corporateProxy == null ? 43 : this.corporateProxy.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
