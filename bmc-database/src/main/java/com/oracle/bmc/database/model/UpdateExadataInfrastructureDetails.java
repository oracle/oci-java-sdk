/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Updates the Exadata infrastructure. Applies to Exadata Cloud@Customer instances only. See {@link
 * #updateCloudExadataInfrastructureDetails(UpdateCloudExadataInfrastructureDetailsRequest)
 * updateCloudExadataInfrastructureDetails} for information on updating Exadata Cloud Service cloud
 * Exadata infrastructure resources. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateExadataInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateExadataInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cloudControlPlaneServer1",
        "cloudControlPlaneServer2",
        "netmask",
        "gateway",
        "adminNetworkCIDR",
        "infiniBandNetworkCIDR",
        "corporateProxy",
        "contacts",
        "maintenanceWindow",
        "additionalStorageCount",
        "isMultiRackDeployment",
        "multiRackConfigurationFile",
        "additionalComputeCount",
        "additionalComputeSystemModel",
        "dnsServer",
        "ntpServer",
        "timeZone",
        "isCpsOfflineReportEnabled",
        "networkBondingModeDetails",
        "freeformTags",
        "definedTags"
    })
    public UpdateExadataInfrastructureDetails(
            String cloudControlPlaneServer1,
            String cloudControlPlaneServer2,
            String netmask,
            String gateway,
            String adminNetworkCIDR,
            String infiniBandNetworkCIDR,
            String corporateProxy,
            java.util.List<ExadataInfrastructureContact> contacts,
            MaintenanceWindow maintenanceWindow,
            Integer additionalStorageCount,
            Boolean isMultiRackDeployment,
            byte[] multiRackConfigurationFile,
            Integer additionalComputeCount,
            AdditionalComputeSystemModel additionalComputeSystemModel,
            java.util.List<String> dnsServer,
            java.util.List<String> ntpServer,
            String timeZone,
            Boolean isCpsOfflineReportEnabled,
            NetworkBondingModeDetails networkBondingModeDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.cloudControlPlaneServer1 = cloudControlPlaneServer1;
        this.cloudControlPlaneServer2 = cloudControlPlaneServer2;
        this.netmask = netmask;
        this.gateway = gateway;
        this.adminNetworkCIDR = adminNetworkCIDR;
        this.infiniBandNetworkCIDR = infiniBandNetworkCIDR;
        this.corporateProxy = corporateProxy;
        this.contacts = contacts;
        this.maintenanceWindow = maintenanceWindow;
        this.additionalStorageCount = additionalStorageCount;
        this.isMultiRackDeployment = isMultiRackDeployment;
        this.multiRackConfigurationFile = multiRackConfigurationFile;
        this.additionalComputeCount = additionalComputeCount;
        this.additionalComputeSystemModel = additionalComputeSystemModel;
        this.dnsServer = dnsServer;
        this.ntpServer = ntpServer;
        this.timeZone = timeZone;
        this.isCpsOfflineReportEnabled = isCpsOfflineReportEnabled;
        this.networkBondingModeDetails = networkBondingModeDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
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

        public UpdateExadataInfrastructureDetails build() {
            UpdateExadataInfrastructureDetails model =
                    new UpdateExadataInfrastructureDetails(
                            this.cloudControlPlaneServer1,
                            this.cloudControlPlaneServer2,
                            this.netmask,
                            this.gateway,
                            this.adminNetworkCIDR,
                            this.infiniBandNetworkCIDR,
                            this.corporateProxy,
                            this.contacts,
                            this.maintenanceWindow,
                            this.additionalStorageCount,
                            this.isMultiRackDeployment,
                            this.multiRackConfigurationFile,
                            this.additionalComputeCount,
                            this.additionalComputeSystemModel,
                            this.dnsServer,
                            this.ntpServer,
                            this.timeZone,
                            this.isCpsOfflineReportEnabled,
                            this.networkBondingModeDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExadataInfrastructureDetails model) {
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
            if (model.wasPropertyExplicitlySet("contacts")) {
                this.contacts(model.getContacts());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("additionalStorageCount")) {
                this.additionalStorageCount(model.getAdditionalStorageCount());
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
            if (model.wasPropertyExplicitlySet("dnsServer")) {
                this.dnsServer(model.getDnsServer());
            }
            if (model.wasPropertyExplicitlySet("ntpServer")) {
                this.ntpServer(model.getNtpServer());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("isCpsOfflineReportEnabled")) {
                this.isCpsOfflineReportEnabled(model.getIsCpsOfflineReportEnabled());
            }
            if (model.wasPropertyExplicitlySet("networkBondingModeDetails")) {
                this.networkBondingModeDetails(model.getNetworkBondingModeDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
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
        ;

        private final String value;
        private static java.util.Map<String, AdditionalComputeSystemModel> map;

        static {
            map = new java.util.HashMap<>();
            for (AdditionalComputeSystemModel v : AdditionalComputeSystemModel.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid AdditionalComputeSystemModel: " + key);
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
        sb.append("UpdateExadataInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("cloudControlPlaneServer1=")
                .append(String.valueOf(this.cloudControlPlaneServer1));
        sb.append(", cloudControlPlaneServer2=")
                .append(String.valueOf(this.cloudControlPlaneServer2));
        sb.append(", netmask=").append(String.valueOf(this.netmask));
        sb.append(", gateway=").append(String.valueOf(this.gateway));
        sb.append(", adminNetworkCIDR=").append(String.valueOf(this.adminNetworkCIDR));
        sb.append(", infiniBandNetworkCIDR=").append(String.valueOf(this.infiniBandNetworkCIDR));
        sb.append(", corporateProxy=").append(String.valueOf(this.corporateProxy));
        sb.append(", contacts=").append(String.valueOf(this.contacts));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", additionalStorageCount=").append(String.valueOf(this.additionalStorageCount));
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
        sb.append(", dnsServer=").append(String.valueOf(this.dnsServer));
        sb.append(", ntpServer=").append(String.valueOf(this.ntpServer));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", isCpsOfflineReportEnabled=")
                .append(String.valueOf(this.isCpsOfflineReportEnabled));
        sb.append(", networkBondingModeDetails=")
                .append(String.valueOf(this.networkBondingModeDetails));
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
        if (!(o instanceof UpdateExadataInfrastructureDetails)) {
            return false;
        }

        UpdateExadataInfrastructureDetails other = (UpdateExadataInfrastructureDetails) o;
        return java.util.Objects.equals(
                        this.cloudControlPlaneServer1, other.cloudControlPlaneServer1)
                && java.util.Objects.equals(
                        this.cloudControlPlaneServer2, other.cloudControlPlaneServer2)
                && java.util.Objects.equals(this.netmask, other.netmask)
                && java.util.Objects.equals(this.gateway, other.gateway)
                && java.util.Objects.equals(this.adminNetworkCIDR, other.adminNetworkCIDR)
                && java.util.Objects.equals(this.infiniBandNetworkCIDR, other.infiniBandNetworkCIDR)
                && java.util.Objects.equals(this.corporateProxy, other.corporateProxy)
                && java.util.Objects.equals(this.contacts, other.contacts)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(
                        this.additionalStorageCount, other.additionalStorageCount)
                && java.util.Objects.equals(this.isMultiRackDeployment, other.isMultiRackDeployment)
                && java.util.Arrays.equals(
                        this.multiRackConfigurationFile, other.multiRackConfigurationFile)
                && java.util.Objects.equals(
                        this.additionalComputeCount, other.additionalComputeCount)
                && java.util.Objects.equals(
                        this.additionalComputeSystemModel, other.additionalComputeSystemModel)
                && java.util.Objects.equals(this.dnsServer, other.dnsServer)
                && java.util.Objects.equals(this.ntpServer, other.ntpServer)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(
                        this.isCpsOfflineReportEnabled, other.isCpsOfflineReportEnabled)
                && java.util.Objects.equals(
                        this.networkBondingModeDetails, other.networkBondingModeDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + (this.contacts == null ? 43 : this.contacts.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalStorageCount == null
                                ? 43
                                : this.additionalStorageCount.hashCode());
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
        result = (result * PRIME) + (this.dnsServer == null ? 43 : this.dnsServer.hashCode());
        result = (result * PRIME) + (this.ntpServer == null ? 43 : this.ntpServer.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
