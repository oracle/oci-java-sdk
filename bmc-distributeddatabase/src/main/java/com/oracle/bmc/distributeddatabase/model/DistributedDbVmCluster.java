/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * The Exadata VM cluster for Distributed Database Resource
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DistributedDbVmCluster.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DistributedDbVmCluster
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vmClusterId",
        "displayName",
        "subnetId",
        "backupSubnetId",
        "enabledECpuCount",
        "totalECpuCount",
        "vmFileSystemStorageSize",
        "sshPublicKeys",
        "licenseModel",
        "domain",
        "privateZoneId",
        "nsgIds",
        "backupNetworkNsgIds",
        "isDiagnosticsEventsEnabled",
        "isHealthMonitoringEnabled",
        "isIncidentLogsEnabled"
    })
    public DistributedDbVmCluster(
            String vmClusterId,
            String displayName,
            String subnetId,
            String backupSubnetId,
            Integer enabledECpuCount,
            Integer totalECpuCount,
            Integer vmFileSystemStorageSize,
            java.util.List<String> sshPublicKeys,
            LicenseModel licenseModel,
            String domain,
            String privateZoneId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            Boolean isDiagnosticsEventsEnabled,
            Boolean isHealthMonitoringEnabled,
            Boolean isIncidentLogsEnabled) {
        super();
        this.vmClusterId = vmClusterId;
        this.displayName = displayName;
        this.subnetId = subnetId;
        this.backupSubnetId = backupSubnetId;
        this.enabledECpuCount = enabledECpuCount;
        this.totalECpuCount = totalECpuCount;
        this.vmFileSystemStorageSize = vmFileSystemStorageSize;
        this.sshPublicKeys = sshPublicKeys;
        this.licenseModel = licenseModel;
        this.domain = domain;
        this.privateZoneId = privateZoneId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.isDiagnosticsEventsEnabled = isDiagnosticsEventsEnabled;
        this.isHealthMonitoringEnabled = isHealthMonitoringEnabled;
        this.isIncidentLogsEnabled = isIncidentLogsEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata VM cluster on Exascale Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata VM cluster on Exascale Infrastructure.
         * @param vmClusterId the value to set
         * @return this builder
         **/
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }
        /**
         * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the Exadata VM cluster on Exascale Infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the Exadata VM cluster on Exascale Infrastructure.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
        private String backupSubnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
         *
         * @param backupSubnetId the value to set
         * @return this builder
         **/
        public Builder backupSubnetId(String backupSubnetId) {
            this.backupSubnetId = backupSubnetId;
            this.__explicitlySet__.add("backupSubnetId");
            return this;
        }
        /**
         * The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enabledECpuCount")
        private Integer enabledECpuCount;

        /**
         * The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure.
         *
         * @param enabledECpuCount the value to set
         * @return this builder
         **/
        public Builder enabledECpuCount(Integer enabledECpuCount) {
            this.enabledECpuCount = enabledECpuCount;
            this.__explicitlySet__.add("enabledECpuCount");
            return this;
        }
        /**
         * The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalECpuCount")
        private Integer totalECpuCount;

        /**
         * The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure.
         *
         * @param totalECpuCount the value to set
         * @return this builder
         **/
        public Builder totalECpuCount(Integer totalECpuCount) {
            this.totalECpuCount = totalECpuCount;
            this.__explicitlySet__.add("totalECpuCount");
            return this;
        }
        /**
         * File System Storage Size in GBs for Exadata VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmFileSystemStorageSize")
        private Integer vmFileSystemStorageSize;

        /**
         * File System Storage Size in GBs for Exadata VM cluster.
         *
         * @param vmFileSystemStorageSize the value to set
         * @return this builder
         **/
        public Builder vmFileSystemStorageSize(Integer vmFileSystemStorageSize) {
            this.vmFileSystemStorageSize = vmFileSystemStorageSize;
            this.__explicitlySet__.add("vmFileSystemStorageSize");
            return this;
        }
        /**
         * The public key portion of one or more key pairs used for SSH access to the Exadata VM cluster on Exascale Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the Exadata VM cluster on Exascale Infrastructure.
         * @param sshPublicKeys the value to set
         * @return this builder
         **/
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /**
         * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
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
         * A domain name used for the Exadata VM cluster on Exascale Infrastructure.
         * If the Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the domain name for the subnet is used
         * (do not provide one). Otherwise, provide a valid DNS domain name.
         * Hyphens (-) are not permitted. Applies to Exadata Database Service on Exascale Infrastructure only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * A domain name used for the Exadata VM cluster on Exascale Infrastructure.
         * If the Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the domain name for the subnet is used
         * (do not provide one). Otherwise, provide a valid DNS domain name.
         * Hyphens (-) are not permitted. Applies to Exadata Database Service on Exascale Infrastructure only.
         *
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * The private zone ID in which you want DNS records to be created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateZoneId")
        private String privateZoneId;

        /**
         * The private zone ID in which you want DNS records to be created.
         *
         * @param privateZoneId the value to set
         * @return this builder
         **/
        public Builder privateZoneId(String privateZoneId) {
            this.privateZoneId = privateZoneId;
            this.__explicitlySet__.add("privateZoneId");
            return this;
        }
        /**
         * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs.
         * Setting this to an empty list removes all resources from all NSGs.
         * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs.
         * Setting this to an empty list removes all resources from all NSGs.
         * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
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
         * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to.
         * Setting this to an empty array after the list is created removes the resource from all NSGs.
         * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
        private java.util.List<String> backupNetworkNsgIds;

        /**
         * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to.
         * Setting this to an empty array after the list is created removes the resource from all NSGs.
         * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
         *
         * @param backupNetworkNsgIds the value to set
         * @return this builder
         **/
        public Builder backupNetworkNsgIds(java.util.List<String> backupNetworkNsgIds) {
            this.backupNetworkNsgIds = backupNetworkNsgIds;
            this.__explicitlySet__.add("backupNetworkNsgIds");
            return this;
        }
        /**
         * Indicates whether diagnostic collection is enabled for the VM cluster.
         * Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues.
         * Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system.
         * You can enable diagnostic collection during VM cluster provisioning. You can also disable or enable it at any time using the {@code UpdateVmCluster} API.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDiagnosticsEventsEnabled")
        private Boolean isDiagnosticsEventsEnabled;

        /**
         * Indicates whether diagnostic collection is enabled for the VM cluster.
         * Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues.
         * Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system.
         * You can enable diagnostic collection during VM cluster provisioning. You can also disable or enable it at any time using the {@code UpdateVmCluster} API.
         *
         * @param isDiagnosticsEventsEnabled the value to set
         * @return this builder
         **/
        public Builder isDiagnosticsEventsEnabled(Boolean isDiagnosticsEventsEnabled) {
            this.isDiagnosticsEventsEnabled = isDiagnosticsEventsEnabled;
            this.__explicitlySet__.add("isDiagnosticsEventsEnabled");
            return this;
        }
        /**
         * Indicates whether health monitoring is enabled for the VM cluster.
         * Enabling health monitoring allows Oracle to collect diagnostic data and share it with its operations and support personnel.
         * You may also receive notifications for some events. Collecting health diagnostics enables Oracle to provide proactive support and enhanced service for your system.
         * Optionally enable health monitoring while provisioning a system. You can also disable or enable health monitoring anytime using the {@code UpdateVmCluster} API.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHealthMonitoringEnabled")
        private Boolean isHealthMonitoringEnabled;

        /**
         * Indicates whether health monitoring is enabled for the VM cluster.
         * Enabling health monitoring allows Oracle to collect diagnostic data and share it with its operations and support personnel.
         * You may also receive notifications for some events. Collecting health diagnostics enables Oracle to provide proactive support and enhanced service for your system.
         * Optionally enable health monitoring while provisioning a system. You can also disable or enable health monitoring anytime using the {@code UpdateVmCluster} API.
         *
         * @param isHealthMonitoringEnabled the value to set
         * @return this builder
         **/
        public Builder isHealthMonitoringEnabled(Boolean isHealthMonitoringEnabled) {
            this.isHealthMonitoringEnabled = isHealthMonitoringEnabled;
            this.__explicitlySet__.add("isHealthMonitoringEnabled");
            return this;
        }
        /**
         * Indicates whether incident logs and trace collection are enabled for the VM cluster.
         * Enabling incident logs collection allows Oracle to receive Events service notifications for guest VM issues, collect incident logs and traces, and use them to diagnose issues and resolve them.
         * Optionally enable incident logs collection while provisioning a system. You can also disable or enable incident logs collection anytime using the {@code UpdateVmCluster} API.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIncidentLogsEnabled")
        private Boolean isIncidentLogsEnabled;

        /**
         * Indicates whether incident logs and trace collection are enabled for the VM cluster.
         * Enabling incident logs collection allows Oracle to receive Events service notifications for guest VM issues, collect incident logs and traces, and use them to diagnose issues and resolve them.
         * Optionally enable incident logs collection while provisioning a system. You can also disable or enable incident logs collection anytime using the {@code UpdateVmCluster} API.
         *
         * @param isIncidentLogsEnabled the value to set
         * @return this builder
         **/
        public Builder isIncidentLogsEnabled(Boolean isIncidentLogsEnabled) {
            this.isIncidentLogsEnabled = isIncidentLogsEnabled;
            this.__explicitlySet__.add("isIncidentLogsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedDbVmCluster build() {
            DistributedDbVmCluster model =
                    new DistributedDbVmCluster(
                            this.vmClusterId,
                            this.displayName,
                            this.subnetId,
                            this.backupSubnetId,
                            this.enabledECpuCount,
                            this.totalECpuCount,
                            this.vmFileSystemStorageSize,
                            this.sshPublicKeys,
                            this.licenseModel,
                            this.domain,
                            this.privateZoneId,
                            this.nsgIds,
                            this.backupNetworkNsgIds,
                            this.isDiagnosticsEventsEnabled,
                            this.isHealthMonitoringEnabled,
                            this.isIncidentLogsEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDbVmCluster model) {
            if (model.wasPropertyExplicitlySet("vmClusterId")) {
                this.vmClusterId(model.getVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("backupSubnetId")) {
                this.backupSubnetId(model.getBackupSubnetId());
            }
            if (model.wasPropertyExplicitlySet("enabledECpuCount")) {
                this.enabledECpuCount(model.getEnabledECpuCount());
            }
            if (model.wasPropertyExplicitlySet("totalECpuCount")) {
                this.totalECpuCount(model.getTotalECpuCount());
            }
            if (model.wasPropertyExplicitlySet("vmFileSystemStorageSize")) {
                this.vmFileSystemStorageSize(model.getVmFileSystemStorageSize());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("privateZoneId")) {
                this.privateZoneId(model.getPrivateZoneId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkNsgIds")) {
                this.backupNetworkNsgIds(model.getBackupNetworkNsgIds());
            }
            if (model.wasPropertyExplicitlySet("isDiagnosticsEventsEnabled")) {
                this.isDiagnosticsEventsEnabled(model.getIsDiagnosticsEventsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isHealthMonitoringEnabled")) {
                this.isHealthMonitoringEnabled(model.getIsHealthMonitoringEnabled());
            }
            if (model.wasPropertyExplicitlySet("isIncidentLogsEnabled")) {
                this.isIncidentLogsEnabled(model.getIsIncidentLogsEnabled());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata VM cluster on Exascale Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata VM cluster on Exascale Infrastructure.
     * @return the value
     **/
    public String getVmClusterId() {
        return vmClusterId;
    }

    /**
     * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    private final String backupSubnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     **/
    public String getBackupSubnetId() {
        return backupSubnetId;
    }

    /**
     * The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enabledECpuCount")
    private final Integer enabledECpuCount;

    /**
     * The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     **/
    public Integer getEnabledECpuCount() {
        return enabledECpuCount;
    }

    /**
     * The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalECpuCount")
    private final Integer totalECpuCount;

    /**
     * The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     **/
    public Integer getTotalECpuCount() {
        return totalECpuCount;
    }

    /**
     * File System Storage Size in GBs for Exadata VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmFileSystemStorageSize")
    private final Integer vmFileSystemStorageSize;

    /**
     * File System Storage Size in GBs for Exadata VM cluster.
     *
     * @return the value
     **/
    public Integer getVmFileSystemStorageSize() {
        return vmFileSystemStorageSize;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the Exadata VM cluster on Exascale Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the Exadata VM cluster on Exascale Infrastructure.
     * @return the value
     **/
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
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
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * A domain name used for the Exadata VM cluster on Exascale Infrastructure.
     * If the Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the domain name for the subnet is used
     * (do not provide one). Otherwise, provide a valid DNS domain name.
     * Hyphens (-) are not permitted. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * A domain name used for the Exadata VM cluster on Exascale Infrastructure.
     * If the Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the domain name for the subnet is used
     * (do not provide one). Otherwise, provide a valid DNS domain name.
     * Hyphens (-) are not permitted. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * The private zone ID in which you want DNS records to be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateZoneId")
    private final String privateZoneId;

    /**
     * The private zone ID in which you want DNS records to be created.
     *
     * @return the value
     **/
    public String getPrivateZoneId() {
        return privateZoneId;
    }

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs.
     * Setting this to an empty list removes all resources from all NSGs.
     * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs.
     * Setting this to an empty list removes all resources from all NSGs.
     * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to.
     * Setting this to an empty array after the list is created removes the resource from all NSGs.
     * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
    private final java.util.List<String> backupNetworkNsgIds;

    /**
     * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to.
     * Setting this to an empty array after the list is created removes the resource from all NSGs.
     * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     * @return the value
     **/
    public java.util.List<String> getBackupNetworkNsgIds() {
        return backupNetworkNsgIds;
    }

    /**
     * Indicates whether diagnostic collection is enabled for the VM cluster.
     * Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues.
     * Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system.
     * You can enable diagnostic collection during VM cluster provisioning. You can also disable or enable it at any time using the {@code UpdateVmCluster} API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDiagnosticsEventsEnabled")
    private final Boolean isDiagnosticsEventsEnabled;

    /**
     * Indicates whether diagnostic collection is enabled for the VM cluster.
     * Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues.
     * Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system.
     * You can enable diagnostic collection during VM cluster provisioning. You can also disable or enable it at any time using the {@code UpdateVmCluster} API.
     *
     * @return the value
     **/
    public Boolean getIsDiagnosticsEventsEnabled() {
        return isDiagnosticsEventsEnabled;
    }

    /**
     * Indicates whether health monitoring is enabled for the VM cluster.
     * Enabling health monitoring allows Oracle to collect diagnostic data and share it with its operations and support personnel.
     * You may also receive notifications for some events. Collecting health diagnostics enables Oracle to provide proactive support and enhanced service for your system.
     * Optionally enable health monitoring while provisioning a system. You can also disable or enable health monitoring anytime using the {@code UpdateVmCluster} API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHealthMonitoringEnabled")
    private final Boolean isHealthMonitoringEnabled;

    /**
     * Indicates whether health monitoring is enabled for the VM cluster.
     * Enabling health monitoring allows Oracle to collect diagnostic data and share it with its operations and support personnel.
     * You may also receive notifications for some events. Collecting health diagnostics enables Oracle to provide proactive support and enhanced service for your system.
     * Optionally enable health monitoring while provisioning a system. You can also disable or enable health monitoring anytime using the {@code UpdateVmCluster} API.
     *
     * @return the value
     **/
    public Boolean getIsHealthMonitoringEnabled() {
        return isHealthMonitoringEnabled;
    }

    /**
     * Indicates whether incident logs and trace collection are enabled for the VM cluster.
     * Enabling incident logs collection allows Oracle to receive Events service notifications for guest VM issues, collect incident logs and traces, and use them to diagnose issues and resolve them.
     * Optionally enable incident logs collection while provisioning a system. You can also disable or enable incident logs collection anytime using the {@code UpdateVmCluster} API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncidentLogsEnabled")
    private final Boolean isIncidentLogsEnabled;

    /**
     * Indicates whether incident logs and trace collection are enabled for the VM cluster.
     * Enabling incident logs collection allows Oracle to receive Events service notifications for guest VM issues, collect incident logs and traces, and use them to diagnose issues and resolve them.
     * Optionally enable incident logs collection while provisioning a system. You can also disable or enable incident logs collection anytime using the {@code UpdateVmCluster} API.
     *
     * @return the value
     **/
    public Boolean getIsIncidentLogsEnabled() {
        return isIncidentLogsEnabled;
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
        sb.append("DistributedDbVmCluster(");
        sb.append("super=").append(super.toString());
        sb.append("vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", backupSubnetId=").append(String.valueOf(this.backupSubnetId));
        sb.append(", enabledECpuCount=").append(String.valueOf(this.enabledECpuCount));
        sb.append(", totalECpuCount=").append(String.valueOf(this.totalECpuCount));
        sb.append(", vmFileSystemStorageSize=")
                .append(String.valueOf(this.vmFileSystemStorageSize));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", privateZoneId=").append(String.valueOf(this.privateZoneId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", isDiagnosticsEventsEnabled=")
                .append(String.valueOf(this.isDiagnosticsEventsEnabled));
        sb.append(", isHealthMonitoringEnabled=")
                .append(String.valueOf(this.isHealthMonitoringEnabled));
        sb.append(", isIncidentLogsEnabled=").append(String.valueOf(this.isIncidentLogsEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedDbVmCluster)) {
            return false;
        }

        DistributedDbVmCluster other = (DistributedDbVmCluster) o;
        return java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.backupSubnetId, other.backupSubnetId)
                && java.util.Objects.equals(this.enabledECpuCount, other.enabledECpuCount)
                && java.util.Objects.equals(this.totalECpuCount, other.totalECpuCount)
                && java.util.Objects.equals(
                        this.vmFileSystemStorageSize, other.vmFileSystemStorageSize)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.privateZoneId, other.privateZoneId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(
                        this.isDiagnosticsEventsEnabled, other.isDiagnosticsEventsEnabled)
                && java.util.Objects.equals(
                        this.isHealthMonitoringEnabled, other.isHealthMonitoringEnabled)
                && java.util.Objects.equals(this.isIncidentLogsEnabled, other.isIncidentLogsEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSubnetId == null ? 43 : this.backupSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.enabledECpuCount == null ? 43 : this.enabledECpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalECpuCount == null ? 43 : this.totalECpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.vmFileSystemStorageSize == null
                                ? 43
                                : this.vmFileSystemStorageSize.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.privateZoneId == null ? 43 : this.privateZoneId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkNsgIds == null
                                ? 43
                                : this.backupNetworkNsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isDiagnosticsEventsEnabled == null
                                ? 43
                                : this.isDiagnosticsEventsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isHealthMonitoringEnabled == null
                                ? 43
                                : this.isHealthMonitoringEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncidentLogsEnabled == null
                                ? 43
                                : this.isIncidentLogsEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
