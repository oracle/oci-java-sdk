/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for updating the cloud Autonomous VM cluster. <br>
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
        builder = UpdateCloudAutonomousVmClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCloudAutonomousVmClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "displayName",
        "maintenanceWindowDetails",
        "autonomousDataStorageSizeInTBs",
        "cpuCoreCountPerNode",
        "totalContainerDatabases",
        "licenseModel",
        "nsgIds",
        "freeformTags",
        "definedTags",
        "clusterTimeZone",
        "scanListenerPortTls",
        "scanListenerPortNonTls",
        "isMtlsEnabledVmCluster",
        "distributionAlgorithm",
        "securityAttributes"
    })
    public UpdateCloudAutonomousVmClusterDetails(
            String description,
            String displayName,
            MaintenanceWindow maintenanceWindowDetails,
            Double autonomousDataStorageSizeInTBs,
            Integer cpuCoreCountPerNode,
            Integer totalContainerDatabases,
            LicenseModel licenseModel,
            java.util.List<String> nsgIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String clusterTimeZone,
            Integer scanListenerPortTls,
            Integer scanListenerPortNonTls,
            Boolean isMtlsEnabledVmCluster,
            DistributionAlgorithm distributionAlgorithm,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
        super();
        this.description = description;
        this.displayName = displayName;
        this.maintenanceWindowDetails = maintenanceWindowDetails;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.totalContainerDatabases = totalContainerDatabases;
        this.licenseModel = licenseModel;
        this.nsgIds = nsgIds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.clusterTimeZone = clusterTimeZone;
        this.scanListenerPortTls = scanListenerPortTls;
        this.scanListenerPortNonTls = scanListenerPortNonTls;
        this.isMtlsEnabledVmCluster = isMtlsEnabledVmCluster;
        this.distributionAlgorithm = distributionAlgorithm;
        this.securityAttributes = securityAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** User defined description of the cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User defined description of the cloud Autonomous VM cluster.
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
         * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be
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

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
        private MaintenanceWindow maintenanceWindowDetails;

        public Builder maintenanceWindowDetails(MaintenanceWindow maintenanceWindowDetails) {
            this.maintenanceWindowDetails = maintenanceWindowDetails;
            this.__explicitlySet__.add("maintenanceWindowDetails");
            return this;
        }
        /** The new value of autonomous data storage (in TBs) for the Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
        private Double autonomousDataStorageSizeInTBs;

        /**
         * The new value of autonomous data storage (in TBs) for the Autonomous VM cluster.
         *
         * @param autonomousDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder autonomousDataStorageSizeInTBs(Double autonomousDataStorageSizeInTBs) {
            this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
            this.__explicitlySet__.add("autonomousDataStorageSizeInTBs");
            return this;
        }
        /**
         * The new value of cpus per Autonomous VM cluster per node for the Autonomous VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
        private Integer cpuCoreCountPerNode;

        /**
         * The new value of cpus per Autonomous VM cluster per node for the Autonomous VM cluster.
         *
         * @param cpuCoreCountPerNode the value to set
         * @return this builder
         */
        public Builder cpuCoreCountPerNode(Integer cpuCoreCountPerNode) {
            this.cpuCoreCountPerNode = cpuCoreCountPerNode;
            this.__explicitlySet__.add("cpuCoreCountPerNode");
            return this;
        }
        /** The new value of maximum number of ACDs for the Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
        private Integer totalContainerDatabases;

        /**
         * The new value of maximum number of ACDs for the Autonomous VM cluster.
         *
         * @param totalContainerDatabases the value to set
         * @return this builder
         */
        public Builder totalContainerDatabases(Integer totalContainerDatabases) {
            this.totalContainerDatabases = totalContainerDatabases;
            this.__explicitlySet__.add("totalContainerDatabases");
            return this;
        }
        /**
         * The Oracle license model that applies to the Oracle Autonomous AI Database. Bring your
         * own license (BYOL) allows you to apply your current on-premises Oracle software licenses
         * to equivalent, highly automated Oracle services in the cloud. License Included allows you
         * to subscribe to new Oracle AI Database software licenses and the Oracle AI Database
         * service. Note that when provisioning an [Autonomous AI Database on dedicated Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html),
         * this attribute must be null. It is already set at the Autonomous Exadata Infrastructure
         * level. When provisioning an [Autonomous AI Database Serverless]
         * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a
         * value is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}.
         * Bring your own license (BYOL) also allows you to select the DB edition using the optional
         * parameter.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
         * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
         * isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Oracle Autonomous AI Database. Bring your
         * own license (BYOL) allows you to apply your current on-premises Oracle software licenses
         * to equivalent, highly automated Oracle services in the cloud. License Included allows you
         * to subscribe to new Oracle AI Database software licenses and the Oracle AI Database
         * service. Note that when provisioning an [Autonomous AI Database on dedicated Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html),
         * this attribute must be null. It is already set at the Autonomous Exadata Infrastructure
         * level. When provisioning an [Autonomous AI Database Serverless]
         * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a
         * value is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}.
         * Bring your own license (BYOL) also allows you to select the DB edition using the optional
         * parameter.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
         * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
         * isFreeTier.
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
         * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time
         * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterTimeZone")
        private String clusterTimeZone;

        /**
         * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time
         * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         *
         * @param clusterTimeZone the value to set
         * @return this builder
         */
        public Builder clusterTimeZone(String clusterTimeZone) {
            this.clusterTimeZone = clusterTimeZone;
            this.__explicitlySet__.add("clusterTimeZone");
            return this;
        }
        /** The SCAN Listener TLS port. Default is 2484. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
        private Integer scanListenerPortTls;

        /**
         * The SCAN Listener TLS port. Default is 2484.
         *
         * @param scanListenerPortTls the value to set
         * @return this builder
         */
        public Builder scanListenerPortTls(Integer scanListenerPortTls) {
            this.scanListenerPortTls = scanListenerPortTls;
            this.__explicitlySet__.add("scanListenerPortTls");
            return this;
        }
        /** The SCAN Listener Non TLS port. Default is 1521. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
        private Integer scanListenerPortNonTls;

        /**
         * The SCAN Listener Non TLS port. Default is 1521.
         *
         * @param scanListenerPortNonTls the value to set
         * @return this builder
         */
        public Builder scanListenerPortNonTls(Integer scanListenerPortNonTls) {
            this.scanListenerPortNonTls = scanListenerPortNonTls;
            this.__explicitlySet__.add("scanListenerPortNonTls");
            return this;
        }
        /**
         * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster.
         * This is applicable to database TLS Certificates only. Default is TLS
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabledVmCluster")
        private Boolean isMtlsEnabledVmCluster;

        /**
         * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster.
         * This is applicable to database TLS Certificates only. Default is TLS
         *
         * @param isMtlsEnabledVmCluster the value to set
         * @return this builder
         */
        public Builder isMtlsEnabledVmCluster(Boolean isMtlsEnabledVmCluster) {
            this.isMtlsEnabledVmCluster = isMtlsEnabledVmCluster;
            this.__explicitlySet__.add("isMtlsEnabledVmCluster");
            return this;
        }
        /** The distribution algorithm used for the Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("distributionAlgorithm")
        private DistributionAlgorithm distributionAlgorithm;

        /**
         * The distribution algorithm used for the Autonomous VM cluster.
         *
         * @param distributionAlgorithm the value to set
         * @return this builder
         */
        public Builder distributionAlgorithm(DistributionAlgorithm distributionAlgorithm) {
            this.distributionAlgorithm = distributionAlgorithm;
            this.__explicitlySet__.add("distributionAlgorithm");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCloudAutonomousVmClusterDetails build() {
            UpdateCloudAutonomousVmClusterDetails model =
                    new UpdateCloudAutonomousVmClusterDetails(
                            this.description,
                            this.displayName,
                            this.maintenanceWindowDetails,
                            this.autonomousDataStorageSizeInTBs,
                            this.cpuCoreCountPerNode,
                            this.totalContainerDatabases,
                            this.licenseModel,
                            this.nsgIds,
                            this.freeformTags,
                            this.definedTags,
                            this.clusterTimeZone,
                            this.scanListenerPortTls,
                            this.scanListenerPortNonTls,
                            this.isMtlsEnabledVmCluster,
                            this.distributionAlgorithm,
                            this.securityAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCloudAutonomousVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowDetails")) {
                this.maintenanceWindowDetails(model.getMaintenanceWindowDetails());
            }
            if (model.wasPropertyExplicitlySet("autonomousDataStorageSizeInTBs")) {
                this.autonomousDataStorageSizeInTBs(model.getAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCountPerNode")) {
                this.cpuCoreCountPerNode(model.getCpuCoreCountPerNode());
            }
            if (model.wasPropertyExplicitlySet("totalContainerDatabases")) {
                this.totalContainerDatabases(model.getTotalContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("clusterTimeZone")) {
                this.clusterTimeZone(model.getClusterTimeZone());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTls")) {
                this.scanListenerPortTls(model.getScanListenerPortTls());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortNonTls")) {
                this.scanListenerPortNonTls(model.getScanListenerPortNonTls());
            }
            if (model.wasPropertyExplicitlySet("isMtlsEnabledVmCluster")) {
                this.isMtlsEnabledVmCluster(model.getIsMtlsEnabledVmCluster());
            }
            if (model.wasPropertyExplicitlySet("distributionAlgorithm")) {
                this.distributionAlgorithm(model.getDistributionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
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

    /** User defined description of the cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User defined description of the cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be
     * unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be
     * unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    private final MaintenanceWindow maintenanceWindowDetails;

    public MaintenanceWindow getMaintenanceWindowDetails() {
        return maintenanceWindowDetails;
    }

    /** The new value of autonomous data storage (in TBs) for the Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
    private final Double autonomousDataStorageSizeInTBs;

    /**
     * The new value of autonomous data storage (in TBs) for the Autonomous VM cluster.
     *
     * @return the value
     */
    public Double getAutonomousDataStorageSizeInTBs() {
        return autonomousDataStorageSizeInTBs;
    }

    /** The new value of cpus per Autonomous VM cluster per node for the Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
    private final Integer cpuCoreCountPerNode;

    /**
     * The new value of cpus per Autonomous VM cluster per node for the Autonomous VM cluster.
     *
     * @return the value
     */
    public Integer getCpuCoreCountPerNode() {
        return cpuCoreCountPerNode;
    }

    /** The new value of maximum number of ACDs for the Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
    private final Integer totalContainerDatabases;

    /**
     * The new value of maximum number of ACDs for the Autonomous VM cluster.
     *
     * @return the value
     */
    public Integer getTotalContainerDatabases() {
        return totalContainerDatabases;
    }

    /**
     * The Oracle license model that applies to the Oracle Autonomous AI Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle services in the cloud. License Included allows you to
     * subscribe to new Oracle AI Database software licenses and the Oracle AI Database service.
     * Note that when provisioning an [Autonomous AI Database on dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null. It is already set at the Autonomous Exadata Infrastructure level.
     * When provisioning an [Autonomous AI Database Serverless]
     * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value
     * is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your
     * own license (BYOL) also allows you to select the DB edition using the optional parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
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
     * The Oracle license model that applies to the Oracle Autonomous AI Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle services in the cloud. License Included allows you to
     * subscribe to new Oracle AI Database software licenses and the Oracle AI Database service.
     * Note that when provisioning an [Autonomous AI Database on dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null. It is already set at the Autonomous Exadata Infrastructure level.
     * When provisioning an [Autonomous AI Database Serverless]
     * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value
     * is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your
     * own license (BYOL) also allows you to select the DB edition using the optional parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Oracle Autonomous AI Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle services in the cloud. License Included allows you to
     * subscribe to new Oracle AI Database software licenses and the Oracle AI Database service.
     * Note that when provisioning an [Autonomous AI Database on dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null. It is already set at the Autonomous Exadata Infrastructure level.
     * When provisioning an [Autonomous AI Database Serverless]
     * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value
     * is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your
     * own license (BYOL) also allows you to select the DB edition using the optional parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
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
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time
     * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterTimeZone")
    private final String clusterTimeZone;

    /**
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time
     * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getClusterTimeZone() {
        return clusterTimeZone;
    }

    /** The SCAN Listener TLS port. Default is 2484. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
    private final Integer scanListenerPortTls;

    /**
     * The SCAN Listener TLS port. Default is 2484.
     *
     * @return the value
     */
    public Integer getScanListenerPortTls() {
        return scanListenerPortTls;
    }

    /** The SCAN Listener Non TLS port. Default is 1521. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
    private final Integer scanListenerPortNonTls;

    /**
     * The SCAN Listener Non TLS port. Default is 1521.
     *
     * @return the value
     */
    public Integer getScanListenerPortNonTls() {
        return scanListenerPortNonTls;
    }

    /**
     * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster. This
     * is applicable to database TLS Certificates only. Default is TLS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabledVmCluster")
    private final Boolean isMtlsEnabledVmCluster;

    /**
     * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster. This
     * is applicable to database TLS Certificates only. Default is TLS
     *
     * @return the value
     */
    public Boolean getIsMtlsEnabledVmCluster() {
        return isMtlsEnabledVmCluster;
    }

    /** The distribution algorithm used for the Autonomous VM cluster. */
    public enum DistributionAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        ResourceOptimized("RESOURCE_OPTIMIZED"),
        DistributionOptimized("DISTRIBUTION_OPTIMIZED"),
        ;

        private final String value;
        private static java.util.Map<String, DistributionAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (DistributionAlgorithm v : DistributionAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        DistributionAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DistributionAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DistributionAlgorithm: " + key);
        }
    };
    /** The distribution algorithm used for the Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("distributionAlgorithm")
    private final DistributionAlgorithm distributionAlgorithm;

    /**
     * The distribution algorithm used for the Autonomous VM cluster.
     *
     * @return the value
     */
    public DistributionAlgorithm getDistributionAlgorithm() {
        return distributionAlgorithm;
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
        sb.append("UpdateCloudAutonomousVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", maintenanceWindowDetails=")
                .append(String.valueOf(this.maintenanceWindowDetails));
        sb.append(", autonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.autonomousDataStorageSizeInTBs));
        sb.append(", cpuCoreCountPerNode=").append(String.valueOf(this.cpuCoreCountPerNode));
        sb.append(", totalContainerDatabases=")
                .append(String.valueOf(this.totalContainerDatabases));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", clusterTimeZone=").append(String.valueOf(this.clusterTimeZone));
        sb.append(", scanListenerPortTls=").append(String.valueOf(this.scanListenerPortTls));
        sb.append(", scanListenerPortNonTls=").append(String.valueOf(this.scanListenerPortNonTls));
        sb.append(", isMtlsEnabledVmCluster=").append(String.valueOf(this.isMtlsEnabledVmCluster));
        sb.append(", distributionAlgorithm=").append(String.valueOf(this.distributionAlgorithm));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCloudAutonomousVmClusterDetails)) {
            return false;
        }

        UpdateCloudAutonomousVmClusterDetails other = (UpdateCloudAutonomousVmClusterDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.maintenanceWindowDetails, other.maintenanceWindowDetails)
                && java.util.Objects.equals(
                        this.autonomousDataStorageSizeInTBs, other.autonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(this.cpuCoreCountPerNode, other.cpuCoreCountPerNode)
                && java.util.Objects.equals(
                        this.totalContainerDatabases, other.totalContainerDatabases)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.clusterTimeZone, other.clusterTimeZone)
                && java.util.Objects.equals(this.scanListenerPortTls, other.scanListenerPortTls)
                && java.util.Objects.equals(
                        this.scanListenerPortNonTls, other.scanListenerPortNonTls)
                && java.util.Objects.equals(
                        this.isMtlsEnabledVmCluster, other.isMtlsEnabledVmCluster)
                && java.util.Objects.equals(this.distributionAlgorithm, other.distributionAlgorithm)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowDetails == null
                                ? 43
                                : this.maintenanceWindowDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.autonomousDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuCoreCountPerNode == null
                                ? 43
                                : this.cpuCoreCountPerNode.hashCode());
        result =
                (result * PRIME)
                        + (this.totalContainerDatabases == null
                                ? 43
                                : this.totalContainerDatabases.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterTimeZone == null ? 43 : this.clusterTimeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTls == null
                                ? 43
                                : this.scanListenerPortTls.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortNonTls == null
                                ? 43
                                : this.scanListenerPortNonTls.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsEnabledVmCluster == null
                                ? 43
                                : this.isMtlsEnabledVmCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.distributionAlgorithm == null
                                ? 43
                                : this.distributionAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
