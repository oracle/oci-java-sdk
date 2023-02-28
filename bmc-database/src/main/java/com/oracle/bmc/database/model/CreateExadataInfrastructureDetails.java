/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Request to create Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances
 * only. See {@link
 * #createCloudExadataInfrastructureDetails(CreateCloudExadataInfrastructureDetailsRequest)
 * createCloudExadataInfrastructureDetails} for information on creating a cloud Exadata
 * infrastructure resource in an Exadata Cloud Service instance. <br>
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
        builder = CreateExadataInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateExadataInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "shape",
        "timeZone",
        "cloudControlPlaneServer1",
        "cloudControlPlaneServer2",
        "netmask",
        "gateway",
        "adminNetworkCIDR",
        "infiniBandNetworkCIDR",
        "corporateProxy",
        "contacts",
        "maintenanceWindow",
        "storageCount",
        "computeCount",
        "isMultiRackDeployment",
        "multiRackConfigurationFile",
        "dnsServer",
        "ntpServer",
        "isCpsOfflineReportEnabled",
        "freeformTags",
        "definedTags"
    })
    public CreateExadataInfrastructureDetails(
            String compartmentId,
            String displayName,
            String shape,
            String timeZone,
            String cloudControlPlaneServer1,
            String cloudControlPlaneServer2,
            String netmask,
            String gateway,
            String adminNetworkCIDR,
            String infiniBandNetworkCIDR,
            String corporateProxy,
            java.util.List<ExadataInfrastructureContact> contacts,
            MaintenanceWindow maintenanceWindow,
            Integer storageCount,
            Integer computeCount,
            Boolean isMultiRackDeployment,
            byte[] multiRackConfigurationFile,
            java.util.List<String> dnsServer,
            java.util.List<String> ntpServer,
            Boolean isCpsOfflineReportEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.shape = shape;
        this.timeZone = timeZone;
        this.cloudControlPlaneServer1 = cloudControlPlaneServer1;
        this.cloudControlPlaneServer2 = cloudControlPlaneServer2;
        this.netmask = netmask;
        this.gateway = gateway;
        this.adminNetworkCIDR = adminNetworkCIDR;
        this.infiniBandNetworkCIDR = infiniBandNetworkCIDR;
        this.corporateProxy = corporateProxy;
        this.contacts = contacts;
        this.maintenanceWindow = maintenanceWindow;
        this.storageCount = storageCount;
        this.computeCount = computeCount;
        this.isMultiRackDeployment = isMultiRackDeployment;
        this.multiRackConfigurationFile = multiRackConfigurationFile;
        this.dnsServer = dnsServer;
        this.ntpServer = ntpServer;
        this.isCpsOfflineReportEnabled = isCpsOfflineReportEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * The user-friendly name for the Exadata infrastructure. The name does not need to be
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Exadata infrastructure. The name does not need to be
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
        /** The number of storage servers for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
        private Integer storageCount;

        /**
         * The number of storage servers for the Exadata infrastructure.
         *
         * @param storageCount the value to set
         * @return this builder
         */
        public Builder storageCount(Integer storageCount) {
            this.storageCount = storageCount;
            this.__explicitlySet__.add("storageCount");
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

        public CreateExadataInfrastructureDetails build() {
            CreateExadataInfrastructureDetails model =
                    new CreateExadataInfrastructureDetails(
                            this.compartmentId,
                            this.displayName,
                            this.shape,
                            this.timeZone,
                            this.cloudControlPlaneServer1,
                            this.cloudControlPlaneServer2,
                            this.netmask,
                            this.gateway,
                            this.adminNetworkCIDR,
                            this.infiniBandNetworkCIDR,
                            this.corporateProxy,
                            this.contacts,
                            this.maintenanceWindow,
                            this.storageCount,
                            this.computeCount,
                            this.isMultiRackDeployment,
                            this.multiRackConfigurationFile,
                            this.dnsServer,
                            this.ntpServer,
                            this.isCpsOfflineReportEnabled,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExadataInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("storageCount")) {
                this.storageCount(model.getStorageCount());
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
            if (model.wasPropertyExplicitlySet("dnsServer")) {
                this.dnsServer(model.getDnsServer());
            }
            if (model.wasPropertyExplicitlySet("ntpServer")) {
                this.ntpServer(model.getNtpServer());
            }
            if (model.wasPropertyExplicitlySet("isCpsOfflineReportEnabled")) {
                this.isCpsOfflineReportEnabled(model.getIsCpsOfflineReportEnabled());
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

    /**
     * The user-friendly name for the Exadata infrastructure. The name does not need to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata infrastructure. The name does not need to be unique.
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

    /** The number of storage servers for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
    private final Integer storageCount;

    /**
     * The number of storage servers for the Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getStorageCount() {
        return storageCount;
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
        sb.append("CreateExadataInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", cloudControlPlaneServer1=")
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
        sb.append(", storageCount=").append(String.valueOf(this.storageCount));
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
        sb.append(", dnsServer=").append(String.valueOf(this.dnsServer));
        sb.append(", ntpServer=").append(String.valueOf(this.ntpServer));
        sb.append(", isCpsOfflineReportEnabled=")
                .append(String.valueOf(this.isCpsOfflineReportEnabled));
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
        if (!(o instanceof CreateExadataInfrastructureDetails)) {
            return false;
        }

        CreateExadataInfrastructureDetails other = (CreateExadataInfrastructureDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(
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
                && java.util.Objects.equals(this.storageCount, other.storageCount)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.isMultiRackDeployment, other.isMultiRackDeployment)
                && java.util.Arrays.equals(
                        this.multiRackConfigurationFile, other.multiRackConfigurationFile)
                && java.util.Objects.equals(this.dnsServer, other.dnsServer)
                && java.util.Objects.equals(this.ntpServer, other.ntpServer)
                && java.util.Objects.equals(
                        this.isCpsOfflineReportEnabled, other.isCpsOfflineReportEnabled)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
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
        result = (result * PRIME) + (this.storageCount == null ? 43 : this.storageCount.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiRackDeployment == null
                                ? 43
                                : this.isMultiRackDeployment.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.multiRackConfigurationFile);
        result = (result * PRIME) + (this.dnsServer == null ? 43 : this.dnsServer.hashCode());
        result = (result * PRIME) + (this.ntpServer == null ? 43 : this.ntpServer.hashCode());
        result =
                (result * PRIME)
                        + (this.isCpsOfflineReportEnabled == null
                                ? 43
                                : this.isCpsOfflineReportEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
