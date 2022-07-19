/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * **Deprecated** These APIs are deprecated with the introduction of the Autonomous Exadata VM Cluster resource and a shift to a common Exadata Infrastructure resource for all Exadata Cloud-based services, including Autonomous Database on dedicated Exadata infrastructure. For more details, see [Latest Resource Model](https://docs.oracle.com/en/cloud/paas/autonomous-database/flddd/#articletitle).
 * <p>
 * Infrastructure that enables the running of multiple Autonomous Databases within a dedicated DB system.
 * For more information about Autonomous Exadata Infrastructure, see
 * [Oracle Autonomous Database](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about access control and compartments, see
 * [Overview of the Identity Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
 * <p>
 * For information about availability domains, see
 * [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
 * <p>
 * To get a list of availability domains, use the ListAvailabilityDomains operation
 * in the Identity service API.
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
    builder = AutonomousExadataInfrastructureSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousExadataInfrastructureSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "availabilityDomain",
        "subnetId",
        "nsgIds",
        "shape",
        "hostname",
        "domain",
        "lifecycleState",
        "lifecycleDetails",
        "licenseModel",
        "timeCreated",
        "maintenanceWindow",
        "lastMaintenanceRunId",
        "nextMaintenanceRunId",
        "freeformTags",
        "definedTags",
        "scanDnsName",
        "zoneId"
    })
    public AutonomousExadataInfrastructureSummary(
            String id,
            String compartmentId,
            String displayName,
            String availabilityDomain,
            String subnetId,
            java.util.List<String> nsgIds,
            String shape,
            String hostname,
            String domain,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            LicenseModel licenseModel,
            java.util.Date timeCreated,
            MaintenanceWindow maintenanceWindow,
            String lastMaintenanceRunId,
            String nextMaintenanceRunId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String scanDnsName,
            String zoneId) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.shape = shape;
        this.hostname = hostname;
        this.domain = domain;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.licenseModel = licenseModel;
        this.timeCreated = timeCreated;
        this.maintenanceWindow = maintenanceWindow;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.scanDnsName = scanDnsName;
        this.zoneId = zoneId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Autonomous Exadata Infrastructure.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The user-friendly name for the Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous Exadata Infrastructure.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The name of the availability domain that the Autonomous Exadata Infrastructure is located in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the Autonomous Exadata Infrastructure is located in.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the subnet the Autonomous Exadata Infrastructure is associated with.
         * <p>
         **Subnet Restrictions:**
         * - For Autonomous Databases with Autonomous Exadata Infrastructure, do not use a subnet that overlaps with 192.168.128.0/20
         * <p>
         * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
         * Specifying an overlapping subnet will cause the private interconnect to malfunction.
         * This restriction applies to both the client subnet and backup subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet the Autonomous Exadata Infrastructure is associated with.
         * <p>
         **Subnet Restrictions:**
         * - For Autonomous Databases with Autonomous Exadata Infrastructure, do not use a subnet that overlaps with 192.168.128.0/20
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
         * The shape of the Autonomous Exadata Infrastructure. The shape determines resources to allocate to the Autonomous Exadata Infrastructure (CPU cores, memory and storage).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the Autonomous Exadata Infrastructure. The shape determines resources to allocate to the Autonomous Exadata Infrastructure (CPU cores, memory and storage).
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The host name for the Autonomous Exadata Infrastructure node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The host name for the Autonomous Exadata Infrastructure node.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The domain name for the Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * The domain name for the Autonomous Exadata Infrastructure.
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * The current lifecycle state of the Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the Autonomous Exadata Infrastructure.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Additional information about the current lifecycle state of the Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state of the Autonomous Exadata Infrastructure.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The Oracle license model that applies to all databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to all databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
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
         * The date and time the Autonomous Exadata Infrastructure was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Autonomous Exadata Infrastructure was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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
         * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Autonomous Exadata Infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanDnsName")
        private String scanDnsName;

        /**
         * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Autonomous Exadata Infrastructure.
         *
         * @param scanDnsName the value to set
         * @return this builder
         **/
        public Builder scanDnsName(String scanDnsName) {
            this.scanDnsName = scanDnsName;
            this.__explicitlySet__.add("scanDnsName");
            return this;
        }
        /**
         * The OCID of the zone the Autonomous Exadata Infrastructure is associated with.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
        private String zoneId;

        /**
         * The OCID of the zone the Autonomous Exadata Infrastructure is associated with.
         *
         * @param zoneId the value to set
         * @return this builder
         **/
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            this.__explicitlySet__.add("zoneId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousExadataInfrastructureSummary build() {
            AutonomousExadataInfrastructureSummary __instance__ =
                    new AutonomousExadataInfrastructureSummary(
                            id,
                            compartmentId,
                            displayName,
                            availabilityDomain,
                            subnetId,
                            nsgIds,
                            shape,
                            hostname,
                            domain,
                            lifecycleState,
                            lifecycleDetails,
                            licenseModel,
                            timeCreated,
                            maintenanceWindow,
                            lastMaintenanceRunId,
                            nextMaintenanceRunId,
                            freeformTags,
                            definedTags,
                            scanDnsName,
                            zoneId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousExadataInfrastructureSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .subnetId(o.getSubnetId())
                            .nsgIds(o.getNsgIds())
                            .shape(o.getShape())
                            .hostname(o.getHostname())
                            .domain(o.getDomain())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .licenseModel(o.getLicenseModel())
                            .timeCreated(o.getTimeCreated())
                            .maintenanceWindow(o.getMaintenanceWindow())
                            .lastMaintenanceRunId(o.getLastMaintenanceRunId())
                            .nextMaintenanceRunId(o.getNextMaintenanceRunId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .scanDnsName(o.getScanDnsName())
                            .zoneId(o.getZoneId());

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
     * The OCID of the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-friendly name for the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The name of the availability domain that the Autonomous Exadata Infrastructure is located in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the Autonomous Exadata Infrastructure is located in.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the subnet the Autonomous Exadata Infrastructure is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For Autonomous Databases with Autonomous Exadata Infrastructure, do not use a subnet that overlaps with 192.168.128.0/20
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and backup subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet the Autonomous Exadata Infrastructure is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For Autonomous Databases with Autonomous Exadata Infrastructure, do not use a subnet that overlaps with 192.168.128.0/20
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
     * The shape of the Autonomous Exadata Infrastructure. The shape determines resources to allocate to the Autonomous Exadata Infrastructure (CPU cores, memory and storage).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the Autonomous Exadata Infrastructure. The shape determines resources to allocate to the Autonomous Exadata Infrastructure (CPU cores, memory and storage).
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * The host name for the Autonomous Exadata Infrastructure node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The host name for the Autonomous Exadata Infrastructure node.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * The domain name for the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * The domain name for the Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * The current lifecycle state of the Autonomous Exadata Infrastructure.
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
     * The current lifecycle state of the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional information about the current lifecycle state of the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state of the Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The Oracle license model that applies to all databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
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
     * The Oracle license model that applies to all databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to all databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The date and time the Autonomous Exadata Infrastructure was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Autonomous Exadata Infrastructure was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
     * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Autonomous Exadata Infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanDnsName")
    private final String scanDnsName;

    /**
     * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Autonomous Exadata Infrastructure.
     *
     * @return the value
     **/
    public String getScanDnsName() {
        return scanDnsName;
    }

    /**
     * The OCID of the zone the Autonomous Exadata Infrastructure is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
    private final String zoneId;

    /**
     * The OCID of the zone the Autonomous Exadata Infrastructure is associated with.
     *
     * @return the value
     **/
    public String getZoneId() {
        return zoneId;
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
        sb.append("AutonomousExadataInfrastructureSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", lastMaintenanceRunId=").append(String.valueOf(this.lastMaintenanceRunId));
        sb.append(", nextMaintenanceRunId=").append(String.valueOf(this.nextMaintenanceRunId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", scanDnsName=").append(String.valueOf(this.scanDnsName));
        sb.append(", zoneId=").append(String.valueOf(this.zoneId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousExadataInfrastructureSummary)) {
            return false;
        }

        AutonomousExadataInfrastructureSummary other = (AutonomousExadataInfrastructureSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.lastMaintenanceRunId, other.lastMaintenanceRunId)
                && java.util.Objects.equals(this.nextMaintenanceRunId, other.nextMaintenanceRunId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.scanDnsName, other.scanDnsName)
                && java.util.Objects.equals(this.zoneId, other.zoneId)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
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
        result = (result * PRIME) + (this.scanDnsName == null ? 43 : this.scanDnsName.hashCode());
        result = (result * PRIME) + (this.zoneId == null ? 43 : this.zoneId.hashCode());
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
