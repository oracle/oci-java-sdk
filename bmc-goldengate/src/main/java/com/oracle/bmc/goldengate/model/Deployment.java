/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * A container for your OCI GoldenGate resources, such as the OCI GoldenGate deployment console.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Deployment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Deployment extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "availabilityDomain",
        "faultDomain",
        "deploymentRole",
        "timeRoleChanged",
        "sourceDeploymentId",
        "placements",
        "deploymentBackupId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleSubState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "locks",
        "isHealthy",
        "subnetId",
        "loadBalancerSubnetId",
        "loadBalancerId",
        "fqdn",
        "licenseModel",
        "environmentType",
        "category",
        "cpuCoreCount",
        "isAutoScalingEnabled",
        "nsgIds",
        "isPublic",
        "publicIpAddress",
        "privateIpAddress",
        "deploymentUrl",
        "systemTags",
        "isLatestVersion",
        "timeUpgradeRequired",
        "storageUtilizationInBytes",
        "isStorageUtilizationLimitExceeded",
        "deploymentType",
        "oggData",
        "deploymentDiagnosticData",
        "maintenanceWindow",
        "timeOfNextMaintenance",
        "nextMaintenanceActionType",
        "nextMaintenanceDescription",
        "maintenanceConfiguration",
        "timeOggVersionSupportedUntil",
        "backupSchedule",
        "timeLastBackupScheduled",
        "timeNextBackupScheduled",
        "ingressIps"
    })
    public Deployment(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String availabilityDomain,
            String faultDomain,
            DeploymentRole deploymentRole,
            java.util.Date timeRoleChanged,
            String sourceDeploymentId,
            java.util.List<DeploymentPlacementInfo> placements,
            String deploymentBackupId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            LifecycleSubState lifecycleSubState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<ResourceLock> locks,
            Boolean isHealthy,
            String subnetId,
            String loadBalancerSubnetId,
            String loadBalancerId,
            String fqdn,
            LicenseModel licenseModel,
            EnvironmentType environmentType,
            DeploymentCategory category,
            Integer cpuCoreCount,
            Boolean isAutoScalingEnabled,
            java.util.List<String> nsgIds,
            Boolean isPublic,
            String publicIpAddress,
            String privateIpAddress,
            String deploymentUrl,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isLatestVersion,
            java.util.Date timeUpgradeRequired,
            Long storageUtilizationInBytes,
            Boolean isStorageUtilizationLimitExceeded,
            DeploymentType deploymentType,
            OggDeployment oggData,
            DeploymentDiagnosticData deploymentDiagnosticData,
            MaintenanceWindow maintenanceWindow,
            java.util.Date timeOfNextMaintenance,
            MaintenanceActionType nextMaintenanceActionType,
            String nextMaintenanceDescription,
            MaintenanceConfiguration maintenanceConfiguration,
            java.util.Date timeOggVersionSupportedUntil,
            BackupSchedule backupSchedule,
            java.util.Date timeLastBackupScheduled,
            java.util.Date timeNextBackupScheduled,
            java.util.List<IngressIpDetails> ingressIps) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.deploymentRole = deploymentRole;
        this.timeRoleChanged = timeRoleChanged;
        this.sourceDeploymentId = sourceDeploymentId;
        this.placements = placements;
        this.deploymentBackupId = deploymentBackupId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleSubState = lifecycleSubState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.locks = locks;
        this.isHealthy = isHealthy;
        this.subnetId = subnetId;
        this.loadBalancerSubnetId = loadBalancerSubnetId;
        this.loadBalancerId = loadBalancerId;
        this.fqdn = fqdn;
        this.licenseModel = licenseModel;
        this.environmentType = environmentType;
        this.category = category;
        this.cpuCoreCount = cpuCoreCount;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.nsgIds = nsgIds;
        this.isPublic = isPublic;
        this.publicIpAddress = publicIpAddress;
        this.privateIpAddress = privateIpAddress;
        this.deploymentUrl = deploymentUrl;
        this.systemTags = systemTags;
        this.isLatestVersion = isLatestVersion;
        this.timeUpgradeRequired = timeUpgradeRequired;
        this.storageUtilizationInBytes = storageUtilizationInBytes;
        this.isStorageUtilizationLimitExceeded = isStorageUtilizationLimitExceeded;
        this.deploymentType = deploymentType;
        this.oggData = oggData;
        this.deploymentDiagnosticData = deploymentDiagnosticData;
        this.maintenanceWindow = maintenanceWindow;
        this.timeOfNextMaintenance = timeOfNextMaintenance;
        this.nextMaintenanceActionType = nextMaintenanceActionType;
        this.nextMaintenanceDescription = nextMaintenanceDescription;
        this.maintenanceConfiguration = maintenanceConfiguration;
        this.timeOggVersionSupportedUntil = timeOggVersionSupportedUntil;
        this.backupSchedule = backupSchedule;
        this.timeLastBackupScheduled = timeLastBackupScheduled;
        this.timeNextBackupScheduled = timeNextBackupScheduled;
        this.ingressIps = ingressIps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Metadata about this specific object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
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
         * compartment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment being referenced.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The availability domain of a placement. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of a placement.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The fault domain of a placement. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain of a placement.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /** The type of the deployment role. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentRole")
        private DeploymentRole deploymentRole;

        /**
         * The type of the deployment role.
         *
         * @param deploymentRole the value to set
         * @return this builder
         */
        public Builder deploymentRole(DeploymentRole deploymentRole) {
            this.deploymentRole = deploymentRole;
            this.__explicitlySet__.add("deploymentRole");
            return this;
        }
        /**
         * The time of the last role change. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRoleChanged")
        private java.util.Date timeRoleChanged;

        /**
         * The time of the last role change. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeRoleChanged the value to set
         * @return this builder
         */
        public Builder timeRoleChanged(java.util.Date timeRoleChanged) {
            this.timeRoleChanged = timeRoleChanged;
            this.__explicitlySet__.add("timeRoleChanged");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDeploymentId")
        private String sourceDeploymentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         *
         * @param sourceDeploymentId the value to set
         * @return this builder
         */
        public Builder sourceDeploymentId(String sourceDeploymentId) {
            this.sourceDeploymentId = sourceDeploymentId;
            this.__explicitlySet__.add("sourceDeploymentId");
            return this;
        }
        /** An array of local peers of deployment */
        @com.fasterxml.jackson.annotation.JsonProperty("placements")
        private java.util.List<DeploymentPlacementInfo> placements;

        /**
         * An array of local peers of deployment
         *
         * @param placements the value to set
         * @return this builder
         */
        public Builder placements(java.util.List<DeploymentPlacementInfo> placements) {
            this.placements = placements;
            this.__explicitlySet__.add("placements");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentBackupId")
        private String deploymentBackupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup being referenced.
         *
         * @param deploymentBackupId the value to set
         * @return this builder
         */
        public Builder deploymentBackupId(String deploymentBackupId) {
            this.deploymentBackupId = deploymentBackupId;
            this.__explicitlySet__.add("deploymentBackupId");
            return this;
        }
        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Possible lifecycle states. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Possible lifecycle states.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Possible GGS lifecycle sub-states. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubState")
        private LifecycleSubState lifecycleSubState;

        /**
         * Possible GGS lifecycle sub-states.
         *
         * @param lifecycleSubState the value to set
         * @return this builder
         */
        public Builder lifecycleSubState(LifecycleSubState lifecycleSubState) {
            this.lifecycleSubState = lifecycleSubState;
            this.__explicitlySet__.add("lifecycleSubState");
            return this;
        }
        /**
         * Describes the object's current state in detail. For example, it can be used to provide
         * actionable information for a resource in a Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Describes the object's current state in detail. For example, it can be used to provide
         * actionable information for a resource in a Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only.
         *
         * <p>Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only.
         *
         * <p>Example: {@code {"bar-key": "value"}}
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
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /** True if all of the aggregate resources are working correctly. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHealthy")
        private Boolean isHealthy;

        /**
         * True if all of the aggregate resources are working correctly.
         *
         * @param isHealthy the value to set
         * @return this builder
         */
        public Builder isHealthy(Boolean isHealthy) {
            this.isHealthy = isHealthy;
            this.__explicitlySet__.add("isHealthy");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet of the deployment's private endpoint. The subnet must be a private subnet. For
         * backward compatibility, public subnets are allowed until May 31 2025, after which the
         * private subnet will be enforced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet of the deployment's private endpoint. The subnet must be a private subnet. For
         * backward compatibility, public subnets are allowed until May 31 2025, after which the
         * private subnet will be enforced.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * public subnet in the customer tenancy. Can be provided only for public deployments. If
         * provided, the loadbalancer will be created in this subnet instead of the service tenancy.
         * For backward compatibility, this is an optional property. It will become mandatory for
         * public deployments after October 1, 2024.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerSubnetId")
        private String loadBalancerSubnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * public subnet in the customer tenancy. Can be provided only for public deployments. If
         * provided, the loadbalancer will be created in this subnet instead of the service tenancy.
         * For backward compatibility, this is an optional property. It will become mandatory for
         * public deployments after October 1, 2024.
         *
         * @param loadBalancerSubnetId the value to set
         * @return this builder
         */
        public Builder loadBalancerSubnetId(String loadBalancerSubnetId) {
            this.loadBalancerSubnetId = loadBalancerSubnetId;
            this.__explicitlySet__.add("loadBalancerSubnetId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * loadbalancer in the customer's subnet. The loadbalancer of the public deployment created
         * in the customer subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * loadbalancer in the customer's subnet. The loadbalancer of the public deployment created
         * in the customer subnet.
         *
         * @param loadBalancerId the value to set
         * @return this builder
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /** A three-label Fully Qualified Domain Name (FQDN) for a resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

        /**
         * A three-label Fully Qualified Domain Name (FQDN) for a resource.
         *
         * @param fqdn the value to set
         * @return this builder
         */
        public Builder fqdn(String fqdn) {
            this.fqdn = fqdn;
            this.__explicitlySet__.add("fqdn");
            return this;
        }
        /** The Oracle license model that applies to a Deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to a Deployment.
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
         * Specifies whether the deployment is used in a production or development/testing
         * environment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
        private EnvironmentType environmentType;

        /**
         * Specifies whether the deployment is used in a production or development/testing
         * environment.
         *
         * @param environmentType the value to set
         * @return this builder
         */
        public Builder environmentType(EnvironmentType environmentType) {
            this.environmentType = environmentType;
            this.__explicitlySet__.add("environmentType");
            return this;
        }
        /**
         * The deployment category defines the broad separation of the deployment type into three
         * categories. Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and
         * 'DATA_TRANSFORMS'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private DeploymentCategory category;

        /**
         * The deployment category defines the broad separation of the deployment type into three
         * categories. Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and
         * 'DATA_TRANSFORMS'.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(DeploymentCategory category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** The Minimum number of OCPUs to be made available for this Deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The Minimum number of OCPUs to be made available for this Deployment.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /** Indicates if auto scaling is enabled for the Deployment's CPU core count. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Indicates if auto scaling is enabled for the Deployment's CPU core count.
         *
         * @param isAutoScalingEnabled the value to set
         * @return this builder
         */
        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }
        /**
         * An array of Network Security Group OCIDs used to define network access for either
         * Deployments or Connections.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * An array of Network Security Group OCIDs used to define network access for either
         * Deployments or Connections.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** True if this object is publicly available. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * True if this object is publicly available.
         *
         * @param isPublic the value to set
         * @return this builder
         */
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }
        /** The public IP address representing the access point for the Deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicIpAddress")
        private String publicIpAddress;

        /**
         * The public IP address representing the access point for the Deployment.
         *
         * @param publicIpAddress the value to set
         * @return this builder
         */
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            this.__explicitlySet__.add("publicIpAddress");
            return this;
        }
        /**
         * The private IP address in the customer's VCN representing the access point for the
         * associated endpoint service in the GoldenGate service VCN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIpAddress")
        private String privateIpAddress;

        /**
         * The private IP address in the customer's VCN representing the access point for the
         * associated endpoint service in the GoldenGate service VCN.
         *
         * @param privateIpAddress the value to set
         * @return this builder
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            this.__explicitlySet__.add("privateIpAddress");
            return this;
        }
        /** The URL of a resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentUrl")
        private String deploymentUrl;

        /**
         * The URL of a resource.
         *
         * @param deploymentUrl the value to set
         * @return this builder
         */
        public Builder deploymentUrl(String deploymentUrl) {
            this.deploymentUrl = deploymentUrl;
            this.__explicitlySet__.add("deploymentUrl");
            return this;
        }
        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Indicates if the resource is the the latest available version. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLatestVersion")
        private Boolean isLatestVersion;

        /**
         * Indicates if the resource is the the latest available version.
         *
         * @param isLatestVersion the value to set
         * @return this builder
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            this.__explicitlySet__.add("isLatestVersion");
            return this;
        }
        /**
         * Note: Deprecated: Use timeOfNextMaintenance instead, or related upgrade records to check,
         * when deployment will be forced to upgrade to a newer version. Old description: The date
         * the existing version in use will no longer be considered as usable and an upgrade will be
         * required. This date is typically 6 months after the version was released for use by GGS.
         * The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpgradeRequired")
        private java.util.Date timeUpgradeRequired;

        /**
         * Note: Deprecated: Use timeOfNextMaintenance instead, or related upgrade records to check,
         * when deployment will be forced to upgrade to a newer version. Old description: The date
         * the existing version in use will no longer be considered as usable and an upgrade will be
         * required. This date is typically 6 months after the version was released for use by GGS.
         * The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2016-08-25T21:10:29.600Z}.
         *
         * @param timeUpgradeRequired the value to set
         * @return this builder
         */
        public Builder timeUpgradeRequired(java.util.Date timeUpgradeRequired) {
            this.timeUpgradeRequired = timeUpgradeRequired;
            this.__explicitlySet__.add("timeUpgradeRequired");
            return this;
        }
        /** The amount of storage being utilized (in bytes) */
        @com.fasterxml.jackson.annotation.JsonProperty("storageUtilizationInBytes")
        private Long storageUtilizationInBytes;

        /**
         * The amount of storage being utilized (in bytes)
         *
         * @param storageUtilizationInBytes the value to set
         * @return this builder
         */
        public Builder storageUtilizationInBytes(Long storageUtilizationInBytes) {
            this.storageUtilizationInBytes = storageUtilizationInBytes;
            this.__explicitlySet__.add("storageUtilizationInBytes");
            return this;
        }
        /**
         * Deprecated: This field is not updated and will be removed in future versions. If storage
         * utilization exceeds the limit, the respective warning message will appear in deployment
         * messages, which can be accessed through /messages?deploymentId=. Indicator will be true
         * if the amount of storage being utilized exceeds the allowable storage utilization limit.
         * Exceeding the limit may be an indication of a misconfiguration of the deployment's
         * GoldenGate service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStorageUtilizationLimitExceeded")
        private Boolean isStorageUtilizationLimitExceeded;

        /**
         * Deprecated: This field is not updated and will be removed in future versions. If storage
         * utilization exceeds the limit, the respective warning message will appear in deployment
         * messages, which can be accessed through /messages?deploymentId=. Indicator will be true
         * if the amount of storage being utilized exceeds the allowable storage utilization limit.
         * Exceeding the limit may be an indication of a misconfiguration of the deployment's
         * GoldenGate service.
         *
         * @param isStorageUtilizationLimitExceeded the value to set
         * @return this builder
         */
        public Builder isStorageUtilizationLimitExceeded(
                Boolean isStorageUtilizationLimitExceeded) {
            this.isStorageUtilizationLimitExceeded = isStorageUtilizationLimitExceeded;
            this.__explicitlySet__.add("isStorageUtilizationLimitExceeded");
            return this;
        }
        /**
         * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the
         * value 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in
         * favor of 'DATABASE_ORACLE'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the
         * value 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in
         * favor of 'DATABASE_ORACLE'.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oggData")
        private OggDeployment oggData;

        public Builder oggData(OggDeployment oggData) {
            this.oggData = oggData;
            this.__explicitlySet__.add("oggData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deploymentDiagnosticData")
        private DeploymentDiagnosticData deploymentDiagnosticData;

        public Builder deploymentDiagnosticData(DeploymentDiagnosticData deploymentDiagnosticData) {
            this.deploymentDiagnosticData = deploymentDiagnosticData;
            this.__explicitlySet__.add("deploymentDiagnosticData");
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
         * The time of next maintenance schedule. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextMaintenance")
        private java.util.Date timeOfNextMaintenance;

        /**
         * The time of next maintenance schedule. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeOfNextMaintenance the value to set
         * @return this builder
         */
        public Builder timeOfNextMaintenance(java.util.Date timeOfNextMaintenance) {
            this.timeOfNextMaintenance = timeOfNextMaintenance;
            this.__explicitlySet__.add("timeOfNextMaintenance");
            return this;
        }
        /** Type of the next maintenance. */
        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceActionType")
        private MaintenanceActionType nextMaintenanceActionType;

        /**
         * Type of the next maintenance.
         *
         * @param nextMaintenanceActionType the value to set
         * @return this builder
         */
        public Builder nextMaintenanceActionType(MaintenanceActionType nextMaintenanceActionType) {
            this.nextMaintenanceActionType = nextMaintenanceActionType;
            this.__explicitlySet__.add("nextMaintenanceActionType");
            return this;
        }
        /** Description of the next maintenance. */
        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceDescription")
        private String nextMaintenanceDescription;

        /**
         * Description of the next maintenance.
         *
         * @param nextMaintenanceDescription the value to set
         * @return this builder
         */
        public Builder nextMaintenanceDescription(String nextMaintenanceDescription) {
            this.nextMaintenanceDescription = nextMaintenanceDescription;
            this.__explicitlySet__.add("nextMaintenanceDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceConfiguration")
        private MaintenanceConfiguration maintenanceConfiguration;

        public Builder maintenanceConfiguration(MaintenanceConfiguration maintenanceConfiguration) {
            this.maintenanceConfiguration = maintenanceConfiguration;
            this.__explicitlySet__.add("maintenanceConfiguration");
            return this;
        }
        /**
         * The time until OGG version is supported. After this date has passed OGG version will not
         * be available anymore. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOggVersionSupportedUntil")
        private java.util.Date timeOggVersionSupportedUntil;

        /**
         * The time until OGG version is supported. After this date has passed OGG version will not
         * be available anymore. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeOggVersionSupportedUntil the value to set
         * @return this builder
         */
        public Builder timeOggVersionSupportedUntil(java.util.Date timeOggVersionSupportedUntil) {
            this.timeOggVersionSupportedUntil = timeOggVersionSupportedUntil;
            this.__explicitlySet__.add("timeOggVersionSupportedUntil");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupSchedule")
        private BackupSchedule backupSchedule;

        public Builder backupSchedule(BackupSchedule backupSchedule) {
            this.backupSchedule = backupSchedule;
            this.__explicitlySet__.add("backupSchedule");
            return this;
        }
        /**
         * The timestamp of last deployment backup scheduled. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-25T18:19:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastBackupScheduled")
        private java.util.Date timeLastBackupScheduled;

        /**
         * The timestamp of last deployment backup scheduled. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-25T18:19:29.600Z}.
         *
         * @param timeLastBackupScheduled the value to set
         * @return this builder
         */
        public Builder timeLastBackupScheduled(java.util.Date timeLastBackupScheduled) {
            this.timeLastBackupScheduled = timeLastBackupScheduled;
            this.__explicitlySet__.add("timeLastBackupScheduled");
            return this;
        }
        /**
         * The timestamp of next deployment backup scheduled. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextBackupScheduled")
        private java.util.Date timeNextBackupScheduled;

        /**
         * The timestamp of next deployment backup scheduled. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
         *
         * @param timeNextBackupScheduled the value to set
         * @return this builder
         */
        public Builder timeNextBackupScheduled(java.util.Date timeNextBackupScheduled) {
            this.timeNextBackupScheduled = timeNextBackupScheduled;
            this.__explicitlySet__.add("timeNextBackupScheduled");
            return this;
        }
        /**
         * List of ingress IP addresses from where the GoldenGate deployment connects to this
         * connection's privateIp. Customers may optionally set up ingress security rules to
         * restrict traffic from these IP addresses.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ingressIps")
        private java.util.List<IngressIpDetails> ingressIps;

        /**
         * List of ingress IP addresses from where the GoldenGate deployment connects to this
         * connection's privateIp. Customers may optionally set up ingress security rules to
         * restrict traffic from these IP addresses.
         *
         * @param ingressIps the value to set
         * @return this builder
         */
        public Builder ingressIps(java.util.List<IngressIpDetails> ingressIps) {
            this.ingressIps = ingressIps;
            this.__explicitlySet__.add("ingressIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Deployment build() {
            Deployment model =
                    new Deployment(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.deploymentRole,
                            this.timeRoleChanged,
                            this.sourceDeploymentId,
                            this.placements,
                            this.deploymentBackupId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleSubState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.locks,
                            this.isHealthy,
                            this.subnetId,
                            this.loadBalancerSubnetId,
                            this.loadBalancerId,
                            this.fqdn,
                            this.licenseModel,
                            this.environmentType,
                            this.category,
                            this.cpuCoreCount,
                            this.isAutoScalingEnabled,
                            this.nsgIds,
                            this.isPublic,
                            this.publicIpAddress,
                            this.privateIpAddress,
                            this.deploymentUrl,
                            this.systemTags,
                            this.isLatestVersion,
                            this.timeUpgradeRequired,
                            this.storageUtilizationInBytes,
                            this.isStorageUtilizationLimitExceeded,
                            this.deploymentType,
                            this.oggData,
                            this.deploymentDiagnosticData,
                            this.maintenanceWindow,
                            this.timeOfNextMaintenance,
                            this.nextMaintenanceActionType,
                            this.nextMaintenanceDescription,
                            this.maintenanceConfiguration,
                            this.timeOggVersionSupportedUntil,
                            this.backupSchedule,
                            this.timeLastBackupScheduled,
                            this.timeNextBackupScheduled,
                            this.ingressIps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Deployment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("deploymentRole")) {
                this.deploymentRole(model.getDeploymentRole());
            }
            if (model.wasPropertyExplicitlySet("timeRoleChanged")) {
                this.timeRoleChanged(model.getTimeRoleChanged());
            }
            if (model.wasPropertyExplicitlySet("sourceDeploymentId")) {
                this.sourceDeploymentId(model.getSourceDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("placements")) {
                this.placements(model.getPlacements());
            }
            if (model.wasPropertyExplicitlySet("deploymentBackupId")) {
                this.deploymentBackupId(model.getDeploymentBackupId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleSubState")) {
                this.lifecycleSubState(model.getLifecycleSubState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("isHealthy")) {
                this.isHealthy(model.getIsHealthy());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerSubnetId")) {
                this.loadBalancerSubnetId(model.getLoadBalancerSubnetId());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerId")) {
                this.loadBalancerId(model.getLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("fqdn")) {
                this.fqdn(model.getFqdn());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("environmentType")) {
                this.environmentType(model.getEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("isPublic")) {
                this.isPublic(model.getIsPublic());
            }
            if (model.wasPropertyExplicitlySet("publicIpAddress")) {
                this.publicIpAddress(model.getPublicIpAddress());
            }
            if (model.wasPropertyExplicitlySet("privateIpAddress")) {
                this.privateIpAddress(model.getPrivateIpAddress());
            }
            if (model.wasPropertyExplicitlySet("deploymentUrl")) {
                this.deploymentUrl(model.getDeploymentUrl());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("isLatestVersion")) {
                this.isLatestVersion(model.getIsLatestVersion());
            }
            if (model.wasPropertyExplicitlySet("timeUpgradeRequired")) {
                this.timeUpgradeRequired(model.getTimeUpgradeRequired());
            }
            if (model.wasPropertyExplicitlySet("storageUtilizationInBytes")) {
                this.storageUtilizationInBytes(model.getStorageUtilizationInBytes());
            }
            if (model.wasPropertyExplicitlySet("isStorageUtilizationLimitExceeded")) {
                this.isStorageUtilizationLimitExceeded(
                        model.getIsStorageUtilizationLimitExceeded());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("oggData")) {
                this.oggData(model.getOggData());
            }
            if (model.wasPropertyExplicitlySet("deploymentDiagnosticData")) {
                this.deploymentDiagnosticData(model.getDeploymentDiagnosticData());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("timeOfNextMaintenance")) {
                this.timeOfNextMaintenance(model.getTimeOfNextMaintenance());
            }
            if (model.wasPropertyExplicitlySet("nextMaintenanceActionType")) {
                this.nextMaintenanceActionType(model.getNextMaintenanceActionType());
            }
            if (model.wasPropertyExplicitlySet("nextMaintenanceDescription")) {
                this.nextMaintenanceDescription(model.getNextMaintenanceDescription());
            }
            if (model.wasPropertyExplicitlySet("maintenanceConfiguration")) {
                this.maintenanceConfiguration(model.getMaintenanceConfiguration());
            }
            if (model.wasPropertyExplicitlySet("timeOggVersionSupportedUntil")) {
                this.timeOggVersionSupportedUntil(model.getTimeOggVersionSupportedUntil());
            }
            if (model.wasPropertyExplicitlySet("backupSchedule")) {
                this.backupSchedule(model.getBackupSchedule());
            }
            if (model.wasPropertyExplicitlySet("timeLastBackupScheduled")) {
                this.timeLastBackupScheduled(model.getTimeLastBackupScheduled());
            }
            if (model.wasPropertyExplicitlySet("timeNextBackupScheduled")) {
                this.timeNextBackupScheduled(model.getTimeNextBackupScheduled());
            }
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Metadata about this specific object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The availability domain of a placement. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of a placement.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The fault domain of a placement. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain of a placement.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /** The type of the deployment role. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentRole")
    private final DeploymentRole deploymentRole;

    /**
     * The type of the deployment role.
     *
     * @return the value
     */
    public DeploymentRole getDeploymentRole() {
        return deploymentRole;
    }

    /**
     * The time of the last role change. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRoleChanged")
    private final java.util.Date timeRoleChanged;

    /**
     * The time of the last role change. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeRoleChanged() {
        return timeRoleChanged;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDeploymentId")
    private final String sourceDeploymentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     *
     * @return the value
     */
    public String getSourceDeploymentId() {
        return sourceDeploymentId;
    }

    /** An array of local peers of deployment */
    @com.fasterxml.jackson.annotation.JsonProperty("placements")
    private final java.util.List<DeploymentPlacementInfo> placements;

    /**
     * An array of local peers of deployment
     *
     * @return the value
     */
    public java.util.List<DeploymentPlacementInfo> getPlacements() {
        return placements;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentBackupId")
    private final String deploymentBackupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup being referenced.
     *
     * @return the value
     */
    public String getDeploymentBackupId() {
        return deploymentBackupId;
    }

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Possible lifecycle states. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Possible lifecycle states.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Possible GGS lifecycle sub-states. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubState")
    private final LifecycleSubState lifecycleSubState;

    /**
     * Possible GGS lifecycle sub-states.
     *
     * @return the value
     */
    public LifecycleSubState getLifecycleSubState() {
        return lifecycleSubState;
    }

    /**
     * Describes the object's current state in detail. For example, it can be used to provide
     * actionable information for a resource in a Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Describes the object's current state in detail. For example, it can be used to provide
     * actionable information for a resource in a Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
    }

    /** True if all of the aggregate resources are working correctly. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHealthy")
    private final Boolean isHealthy;

    /**
     * True if all of the aggregate resources are working correctly.
     *
     * @return the value
     */
    public Boolean getIsHealthy() {
        return isHealthy;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet of the deployment's private endpoint. The subnet must be a private subnet. For
     * backward compatibility, public subnets are allowed until May 31 2025, after which the private
     * subnet will be enforced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet of the deployment's private endpoint. The subnet must be a private subnet. For
     * backward compatibility, public subnets are allowed until May 31 2025, after which the private
     * subnet will be enforced.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a public
     * subnet in the customer tenancy. Can be provided only for public deployments. If provided, the
     * loadbalancer will be created in this subnet instead of the service tenancy. For backward
     * compatibility, this is an optional property. It will become mandatory for public deployments
     * after October 1, 2024.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerSubnetId")
    private final String loadBalancerSubnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a public
     * subnet in the customer tenancy. Can be provided only for public deployments. If provided, the
     * loadbalancer will be created in this subnet instead of the service tenancy. For backward
     * compatibility, this is an optional property. It will become mandatory for public deployments
     * after October 1, 2024.
     *
     * @return the value
     */
    public String getLoadBalancerSubnetId() {
        return loadBalancerSubnetId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * loadbalancer in the customer's subnet. The loadbalancer of the public deployment created in
     * the customer subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * loadbalancer in the customer's subnet. The loadbalancer of the public deployment created in
     * the customer subnet.
     *
     * @return the value
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /** A three-label Fully Qualified Domain Name (FQDN) for a resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

    /**
     * A three-label Fully Qualified Domain Name (FQDN) for a resource.
     *
     * @return the value
     */
    public String getFqdn() {
        return fqdn;
    }

    /** The Oracle license model that applies to a Deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to a Deployment.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * Specifies whether the deployment is used in a production or development/testing environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
    private final EnvironmentType environmentType;

    /**
     * Specifies whether the deployment is used in a production or development/testing environment.
     *
     * @return the value
     */
    public EnvironmentType getEnvironmentType() {
        return environmentType;
    }

    /**
     * The deployment category defines the broad separation of the deployment type into three
     * categories. Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and
     * 'DATA_TRANSFORMS'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final DeploymentCategory category;

    /**
     * The deployment category defines the broad separation of the deployment type into three
     * categories. Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and
     * 'DATA_TRANSFORMS'.
     *
     * @return the value
     */
    public DeploymentCategory getCategory() {
        return category;
    }

    /** The Minimum number of OCPUs to be made available for this Deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The Minimum number of OCPUs to be made available for this Deployment.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /** Indicates if auto scaling is enabled for the Deployment's CPU core count. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Indicates if auto scaling is enabled for the Deployment's CPU core count.
     *
     * @return the value
     */
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /**
     * An array of Network Security Group OCIDs used to define network access for either Deployments
     * or Connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of Network Security Group OCIDs used to define network access for either Deployments
     * or Connections.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /** True if this object is publicly available. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * True if this object is publicly available.
     *
     * @return the value
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /** The public IP address representing the access point for the Deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicIpAddress")
    private final String publicIpAddress;

    /**
     * The public IP address representing the access point for the Deployment.
     *
     * @return the value
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    /**
     * The private IP address in the customer's VCN representing the access point for the associated
     * endpoint service in the GoldenGate service VCN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIpAddress")
    private final String privateIpAddress;

    /**
     * The private IP address in the customer's VCN representing the access point for the associated
     * endpoint service in the GoldenGate service VCN.
     *
     * @return the value
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /** The URL of a resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentUrl")
    private final String deploymentUrl;

    /**
     * The URL of a resource.
     *
     * @return the value
     */
    public String getDeploymentUrl() {
        return deploymentUrl;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Indicates if the resource is the the latest available version. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLatestVersion")
    private final Boolean isLatestVersion;

    /**
     * Indicates if the resource is the the latest available version.
     *
     * @return the value
     */
    public Boolean getIsLatestVersion() {
        return isLatestVersion;
    }

    /**
     * Note: Deprecated: Use timeOfNextMaintenance instead, or related upgrade records to check,
     * when deployment will be forced to upgrade to a newer version. Old description: The date the
     * existing version in use will no longer be considered as usable and an upgrade will be
     * required. This date is typically 6 months after the version was released for use by GGS. The
     * format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
     * 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpgradeRequired")
    private final java.util.Date timeUpgradeRequired;

    /**
     * Note: Deprecated: Use timeOfNextMaintenance instead, or related upgrade records to check,
     * when deployment will be forced to upgrade to a newer version. Old description: The date the
     * existing version in use will no longer be considered as usable and an upgrade will be
     * required. This date is typically 6 months after the version was released for use by GGS. The
     * format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
     * 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeUpgradeRequired() {
        return timeUpgradeRequired;
    }

    /** The amount of storage being utilized (in bytes) */
    @com.fasterxml.jackson.annotation.JsonProperty("storageUtilizationInBytes")
    private final Long storageUtilizationInBytes;

    /**
     * The amount of storage being utilized (in bytes)
     *
     * @return the value
     */
    public Long getStorageUtilizationInBytes() {
        return storageUtilizationInBytes;
    }

    /**
     * Deprecated: This field is not updated and will be removed in future versions. If storage
     * utilization exceeds the limit, the respective warning message will appear in deployment
     * messages, which can be accessed through /messages?deploymentId=. Indicator will be true if
     * the amount of storage being utilized exceeds the allowable storage utilization limit.
     * Exceeding the limit may be an indication of a misconfiguration of the deployment's GoldenGate
     * service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStorageUtilizationLimitExceeded")
    private final Boolean isStorageUtilizationLimitExceeded;

    /**
     * Deprecated: This field is not updated and will be removed in future versions. If storage
     * utilization exceeds the limit, the respective warning message will appear in deployment
     * messages, which can be accessed through /messages?deploymentId=. Indicator will be true if
     * the amount of storage being utilized exceeds the allowable storage utilization limit.
     * Exceeding the limit may be an indication of a misconfiguration of the deployment's GoldenGate
     * service.
     *
     * @return the value
     */
    public Boolean getIsStorageUtilizationLimitExceeded() {
        return isStorageUtilizationLimitExceeded;
    }

    /**
     * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the value
     * 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in favor of
     * 'DATABASE_ORACLE'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the value
     * 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in favor of
     * 'DATABASE_ORACLE'.
     *
     * @return the value
     */
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("oggData")
    private final OggDeployment oggData;

    public OggDeployment getOggData() {
        return oggData;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deploymentDiagnosticData")
    private final DeploymentDiagnosticData deploymentDiagnosticData;

    public DeploymentDiagnosticData getDeploymentDiagnosticData() {
        return deploymentDiagnosticData;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * The time of next maintenance schedule. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextMaintenance")
    private final java.util.Date timeOfNextMaintenance;

    /**
     * The time of next maintenance schedule. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeOfNextMaintenance() {
        return timeOfNextMaintenance;
    }

    /** Type of the next maintenance. */
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceActionType")
    private final MaintenanceActionType nextMaintenanceActionType;

    /**
     * Type of the next maintenance.
     *
     * @return the value
     */
    public MaintenanceActionType getNextMaintenanceActionType() {
        return nextMaintenanceActionType;
    }

    /** Description of the next maintenance. */
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceDescription")
    private final String nextMaintenanceDescription;

    /**
     * Description of the next maintenance.
     *
     * @return the value
     */
    public String getNextMaintenanceDescription() {
        return nextMaintenanceDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceConfiguration")
    private final MaintenanceConfiguration maintenanceConfiguration;

    public MaintenanceConfiguration getMaintenanceConfiguration() {
        return maintenanceConfiguration;
    }

    /**
     * The time until OGG version is supported. After this date has passed OGG version will not be
     * available anymore. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOggVersionSupportedUntil")
    private final java.util.Date timeOggVersionSupportedUntil;

    /**
     * The time until OGG version is supported. After this date has passed OGG version will not be
     * available anymore. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeOggVersionSupportedUntil() {
        return timeOggVersionSupportedUntil;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupSchedule")
    private final BackupSchedule backupSchedule;

    public BackupSchedule getBackupSchedule() {
        return backupSchedule;
    }

    /**
     * The timestamp of last deployment backup scheduled. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-25T18:19:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastBackupScheduled")
    private final java.util.Date timeLastBackupScheduled;

    /**
     * The timestamp of last deployment backup scheduled. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-25T18:19:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeLastBackupScheduled() {
        return timeLastBackupScheduled;
    }

    /**
     * The timestamp of next deployment backup scheduled. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextBackupScheduled")
    private final java.util.Date timeNextBackupScheduled;

    /**
     * The timestamp of next deployment backup scheduled. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-26T20:19:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeNextBackupScheduled() {
        return timeNextBackupScheduled;
    }

    /**
     * List of ingress IP addresses from where the GoldenGate deployment connects to this
     * connection's privateIp. Customers may optionally set up ingress security rules to restrict
     * traffic from these IP addresses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressIps")
    private final java.util.List<IngressIpDetails> ingressIps;

    /**
     * List of ingress IP addresses from where the GoldenGate deployment connects to this
     * connection's privateIp. Customers may optionally set up ingress security rules to restrict
     * traffic from these IP addresses.
     *
     * @return the value
     */
    public java.util.List<IngressIpDetails> getIngressIps() {
        return ingressIps;
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
        sb.append("Deployment(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", deploymentRole=").append(String.valueOf(this.deploymentRole));
        sb.append(", timeRoleChanged=").append(String.valueOf(this.timeRoleChanged));
        sb.append(", sourceDeploymentId=").append(String.valueOf(this.sourceDeploymentId));
        sb.append(", placements=").append(String.valueOf(this.placements));
        sb.append(", deploymentBackupId=").append(String.valueOf(this.deploymentBackupId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleSubState=").append(String.valueOf(this.lifecycleSubState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(", isHealthy=").append(String.valueOf(this.isHealthy));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", loadBalancerSubnetId=").append(String.valueOf(this.loadBalancerSubnetId));
        sb.append(", loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", environmentType=").append(String.valueOf(this.environmentType));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", publicIpAddress=").append(String.valueOf(this.publicIpAddress));
        sb.append(", privateIpAddress=").append(String.valueOf(this.privateIpAddress));
        sb.append(", deploymentUrl=").append(String.valueOf(this.deploymentUrl));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", isLatestVersion=").append(String.valueOf(this.isLatestVersion));
        sb.append(", timeUpgradeRequired=").append(String.valueOf(this.timeUpgradeRequired));
        sb.append(", storageUtilizationInBytes=")
                .append(String.valueOf(this.storageUtilizationInBytes));
        sb.append(", isStorageUtilizationLimitExceeded=")
                .append(String.valueOf(this.isStorageUtilizationLimitExceeded));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", oggData=").append(String.valueOf(this.oggData));
        sb.append(", deploymentDiagnosticData=")
                .append(String.valueOf(this.deploymentDiagnosticData));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", timeOfNextMaintenance=").append(String.valueOf(this.timeOfNextMaintenance));
        sb.append(", nextMaintenanceActionType=")
                .append(String.valueOf(this.nextMaintenanceActionType));
        sb.append(", nextMaintenanceDescription=")
                .append(String.valueOf(this.nextMaintenanceDescription));
        sb.append(", maintenanceConfiguration=")
                .append(String.valueOf(this.maintenanceConfiguration));
        sb.append(", timeOggVersionSupportedUntil=")
                .append(String.valueOf(this.timeOggVersionSupportedUntil));
        sb.append(", backupSchedule=").append(String.valueOf(this.backupSchedule));
        sb.append(", timeLastBackupScheduled=")
                .append(String.valueOf(this.timeLastBackupScheduled));
        sb.append(", timeNextBackupScheduled=")
                .append(String.valueOf(this.timeNextBackupScheduled));
        sb.append(", ingressIps=").append(String.valueOf(this.ingressIps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Deployment)) {
            return false;
        }

        Deployment other = (Deployment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.deploymentRole, other.deploymentRole)
                && java.util.Objects.equals(this.timeRoleChanged, other.timeRoleChanged)
                && java.util.Objects.equals(this.sourceDeploymentId, other.sourceDeploymentId)
                && java.util.Objects.equals(this.placements, other.placements)
                && java.util.Objects.equals(this.deploymentBackupId, other.deploymentBackupId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleSubState, other.lifecycleSubState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.isHealthy, other.isHealthy)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.loadBalancerSubnetId, other.loadBalancerSubnetId)
                && java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.publicIpAddress, other.publicIpAddress)
                && java.util.Objects.equals(this.privateIpAddress, other.privateIpAddress)
                && java.util.Objects.equals(this.deploymentUrl, other.deploymentUrl)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.isLatestVersion, other.isLatestVersion)
                && java.util.Objects.equals(this.timeUpgradeRequired, other.timeUpgradeRequired)
                && java.util.Objects.equals(
                        this.storageUtilizationInBytes, other.storageUtilizationInBytes)
                && java.util.Objects.equals(
                        this.isStorageUtilizationLimitExceeded,
                        other.isStorageUtilizationLimitExceeded)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.oggData, other.oggData)
                && java.util.Objects.equals(
                        this.deploymentDiagnosticData, other.deploymentDiagnosticData)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.timeOfNextMaintenance, other.timeOfNextMaintenance)
                && java.util.Objects.equals(
                        this.nextMaintenanceActionType, other.nextMaintenanceActionType)
                && java.util.Objects.equals(
                        this.nextMaintenanceDescription, other.nextMaintenanceDescription)
                && java.util.Objects.equals(
                        this.maintenanceConfiguration, other.maintenanceConfiguration)
                && java.util.Objects.equals(
                        this.timeOggVersionSupportedUntil, other.timeOggVersionSupportedUntil)
                && java.util.Objects.equals(this.backupSchedule, other.backupSchedule)
                && java.util.Objects.equals(
                        this.timeLastBackupScheduled, other.timeLastBackupScheduled)
                && java.util.Objects.equals(
                        this.timeNextBackupScheduled, other.timeNextBackupScheduled)
                && java.util.Objects.equals(this.ingressIps, other.ingressIps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentRole == null ? 43 : this.deploymentRole.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRoleChanged == null ? 43 : this.timeRoleChanged.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDeploymentId == null
                                ? 43
                                : this.sourceDeploymentId.hashCode());
        result = (result * PRIME) + (this.placements == null ? 43 : this.placements.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentBackupId == null
                                ? 43
                                : this.deploymentBackupId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleSubState == null ? 43 : this.lifecycleSubState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + (this.isHealthy == null ? 43 : this.isHealthy.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerSubnetId == null
                                ? 43
                                : this.loadBalancerSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result =
                (result * PRIME)
                        + (this.publicIpAddress == null ? 43 : this.publicIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.privateIpAddress == null ? 43 : this.privateIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentUrl == null ? 43 : this.deploymentUrl.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.isLatestVersion == null ? 43 : this.isLatestVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpgradeRequired == null
                                ? 43
                                : this.timeUpgradeRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUtilizationInBytes == null
                                ? 43
                                : this.storageUtilizationInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.isStorageUtilizationLimitExceeded == null
                                ? 43
                                : this.isStorageUtilizationLimitExceeded.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.oggData == null ? 43 : this.oggData.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentDiagnosticData == null
                                ? 43
                                : this.deploymentDiagnosticData.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfNextMaintenance == null
                                ? 43
                                : this.timeOfNextMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.nextMaintenanceActionType == null
                                ? 43
                                : this.nextMaintenanceActionType.hashCode());
        result =
                (result * PRIME)
                        + (this.nextMaintenanceDescription == null
                                ? 43
                                : this.nextMaintenanceDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceConfiguration == null
                                ? 43
                                : this.maintenanceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOggVersionSupportedUntil == null
                                ? 43
                                : this.timeOggVersionSupportedUntil.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSchedule == null ? 43 : this.backupSchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastBackupScheduled == null
                                ? 43
                                : this.timeLastBackupScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNextBackupScheduled == null
                                ? 43
                                : this.timeNextBackupScheduled.hashCode());
        result = (result * PRIME) + (this.ingressIps == null ? 43 : this.ingressIps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
