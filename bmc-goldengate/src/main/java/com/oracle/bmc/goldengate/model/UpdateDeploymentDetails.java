/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to use to update a Deployment. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDeploymentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDeploymentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "licenseModel",
        "isByolCpuCoreCountLimitEnabled",
        "byolCpuCoreCountLimit",
        "environmentType",
        "description",
        "freeformTags",
        "definedTags",
        "nsgIds",
        "subnetId",
        "loadBalancerSubnetId",
        "isPublic",
        "fqdn",
        "cpuCoreCount",
        "isAutoScalingEnabled",
        "placements",
        "securityAttributes",
        "oggData",
        "maintenanceWindow",
        "maintenanceConfiguration",
        "backupSchedule"
    })
    public UpdateDeploymentDetails(
            String displayName,
            LicenseModel licenseModel,
            Boolean isByolCpuCoreCountLimitEnabled,
            Integer byolCpuCoreCountLimit,
            EnvironmentType environmentType,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> nsgIds,
            String subnetId,
            String loadBalancerSubnetId,
            Boolean isPublic,
            String fqdn,
            Integer cpuCoreCount,
            Boolean isAutoScalingEnabled,
            java.util.List<DeploymentPlacementDetails> placements,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            UpdateOggDeploymentDetails oggData,
            UpdateMaintenanceWindowDetails maintenanceWindow,
            UpdateMaintenanceConfigurationDetails maintenanceConfiguration,
            UpdateBackupScheduleDetails backupSchedule) {
        super();
        this.displayName = displayName;
        this.licenseModel = licenseModel;
        this.isByolCpuCoreCountLimitEnabled = isByolCpuCoreCountLimitEnabled;
        this.byolCpuCoreCountLimit = byolCpuCoreCountLimit;
        this.environmentType = environmentType;
        this.description = description;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.nsgIds = nsgIds;
        this.subnetId = subnetId;
        this.loadBalancerSubnetId = loadBalancerSubnetId;
        this.isPublic = isPublic;
        this.fqdn = fqdn;
        this.cpuCoreCount = cpuCoreCount;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.placements = placements;
        this.securityAttributes = securityAttributes;
        this.oggData = oggData;
        this.maintenanceWindow = maintenanceWindow;
        this.maintenanceConfiguration = maintenanceConfiguration;
        this.backupSchedule = backupSchedule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * Flag to allow to configure the 'Bring Your Own License' (BYOL) license type CPU limit. If
         * enabled, the exact number of CPUs must be provided via byolCpuCoreCountLimit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isByolCpuCoreCountLimitEnabled")
        private Boolean isByolCpuCoreCountLimitEnabled;

        /**
         * Flag to allow to configure the 'Bring Your Own License' (BYOL) license type CPU limit. If
         * enabled, the exact number of CPUs must be provided via byolCpuCoreCountLimit.
         *
         * @param isByolCpuCoreCountLimitEnabled the value to set
         * @return this builder
         */
        public Builder isByolCpuCoreCountLimitEnabled(Boolean isByolCpuCoreCountLimitEnabled) {
            this.isByolCpuCoreCountLimitEnabled = isByolCpuCoreCountLimitEnabled;
            this.__explicitlySet__.add("isByolCpuCoreCountLimitEnabled");
            return this;
        }
        /**
         * The maximum number of CPUs allowed with a 'Bring Your Own License' (BYOL) license type.
         * Any CPU usage above this limit is considered as License Included and billed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("byolCpuCoreCountLimit")
        private Integer byolCpuCoreCountLimit;

        /**
         * The maximum number of CPUs allowed with a 'Bring Your Own License' (BYOL) license type.
         * Any CPU usage above this limit is considered as License Included and billed.
         *
         * @param byolCpuCoreCountLimit the value to set
         * @return this builder
         */
        public Builder byolCpuCoreCountLimit(Integer byolCpuCoreCountLimit) {
            this.byolCpuCoreCountLimit = byolCpuCoreCountLimit;
            this.__explicitlySet__.add("byolCpuCoreCountLimit");
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
        /** An array of local peers of deployment */
        @com.fasterxml.jackson.annotation.JsonProperty("placements")
        private java.util.List<DeploymentPlacementDetails> placements;

        /**
         * An array of local peers of deployment
         *
         * @param placements the value to set
         * @return this builder
         */
        public Builder placements(java.util.List<DeploymentPlacementDetails> placements) {
            this.placements = placements;
            this.__explicitlySet__.add("placements");
            return this;
        }
        /**
         * Security attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode":
         * "enforce"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode":
         * "enforce"}}}}
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

        @com.fasterxml.jackson.annotation.JsonProperty("oggData")
        private UpdateOggDeploymentDetails oggData;

        public Builder oggData(UpdateOggDeploymentDetails oggData) {
            this.oggData = oggData;
            this.__explicitlySet__.add("oggData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private UpdateMaintenanceWindowDetails maintenanceWindow;

        public Builder maintenanceWindow(UpdateMaintenanceWindowDetails maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceConfiguration")
        private UpdateMaintenanceConfigurationDetails maintenanceConfiguration;

        public Builder maintenanceConfiguration(
                UpdateMaintenanceConfigurationDetails maintenanceConfiguration) {
            this.maintenanceConfiguration = maintenanceConfiguration;
            this.__explicitlySet__.add("maintenanceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupSchedule")
        private UpdateBackupScheduleDetails backupSchedule;

        public Builder backupSchedule(UpdateBackupScheduleDetails backupSchedule) {
            this.backupSchedule = backupSchedule;
            this.__explicitlySet__.add("backupSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDeploymentDetails build() {
            UpdateDeploymentDetails model =
                    new UpdateDeploymentDetails(
                            this.displayName,
                            this.licenseModel,
                            this.isByolCpuCoreCountLimitEnabled,
                            this.byolCpuCoreCountLimit,
                            this.environmentType,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.nsgIds,
                            this.subnetId,
                            this.loadBalancerSubnetId,
                            this.isPublic,
                            this.fqdn,
                            this.cpuCoreCount,
                            this.isAutoScalingEnabled,
                            this.placements,
                            this.securityAttributes,
                            this.oggData,
                            this.maintenanceWindow,
                            this.maintenanceConfiguration,
                            this.backupSchedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDeploymentDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("isByolCpuCoreCountLimitEnabled")) {
                this.isByolCpuCoreCountLimitEnabled(model.getIsByolCpuCoreCountLimitEnabled());
            }
            if (model.wasPropertyExplicitlySet("byolCpuCoreCountLimit")) {
                this.byolCpuCoreCountLimit(model.getByolCpuCoreCountLimit());
            }
            if (model.wasPropertyExplicitlySet("environmentType")) {
                this.environmentType(model.getEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerSubnetId")) {
                this.loadBalancerSubnetId(model.getLoadBalancerSubnetId());
            }
            if (model.wasPropertyExplicitlySet("isPublic")) {
                this.isPublic(model.getIsPublic());
            }
            if (model.wasPropertyExplicitlySet("fqdn")) {
                this.fqdn(model.getFqdn());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("placements")) {
                this.placements(model.getPlacements());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("oggData")) {
                this.oggData(model.getOggData());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("maintenanceConfiguration")) {
                this.maintenanceConfiguration(model.getMaintenanceConfiguration());
            }
            if (model.wasPropertyExplicitlySet("backupSchedule")) {
                this.backupSchedule(model.getBackupSchedule());
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
     * Flag to allow to configure the 'Bring Your Own License' (BYOL) license type CPU limit. If
     * enabled, the exact number of CPUs must be provided via byolCpuCoreCountLimit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isByolCpuCoreCountLimitEnabled")
    private final Boolean isByolCpuCoreCountLimitEnabled;

    /**
     * Flag to allow to configure the 'Bring Your Own License' (BYOL) license type CPU limit. If
     * enabled, the exact number of CPUs must be provided via byolCpuCoreCountLimit.
     *
     * @return the value
     */
    public Boolean getIsByolCpuCoreCountLimitEnabled() {
        return isByolCpuCoreCountLimitEnabled;
    }

    /**
     * The maximum number of CPUs allowed with a 'Bring Your Own License' (BYOL) license type. Any
     * CPU usage above this limit is considered as License Included and billed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("byolCpuCoreCountLimit")
    private final Integer byolCpuCoreCountLimit;

    /**
     * The maximum number of CPUs allowed with a 'Bring Your Own License' (BYOL) license type. Any
     * CPU usage above this limit is considered as License Included and billed.
     *
     * @return the value
     */
    public Integer getByolCpuCoreCountLimit() {
        return byolCpuCoreCountLimit;
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

    /** An array of local peers of deployment */
    @com.fasterxml.jackson.annotation.JsonProperty("placements")
    private final java.util.List<DeploymentPlacementDetails> placements;

    /**
     * An array of local peers of deployment
     *
     * @return the value
     */
    public java.util.List<DeploymentPlacementDetails> getPlacements() {
        return placements;
    }

    /**
     * Security attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("oggData")
    private final UpdateOggDeploymentDetails oggData;

    public UpdateOggDeploymentDetails getOggData() {
        return oggData;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final UpdateMaintenanceWindowDetails maintenanceWindow;

    public UpdateMaintenanceWindowDetails getMaintenanceWindow() {
        return maintenanceWindow;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceConfiguration")
    private final UpdateMaintenanceConfigurationDetails maintenanceConfiguration;

    public UpdateMaintenanceConfigurationDetails getMaintenanceConfiguration() {
        return maintenanceConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupSchedule")
    private final UpdateBackupScheduleDetails backupSchedule;

    public UpdateBackupScheduleDetails getBackupSchedule() {
        return backupSchedule;
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
        sb.append("UpdateDeploymentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", isByolCpuCoreCountLimitEnabled=")
                .append(String.valueOf(this.isByolCpuCoreCountLimitEnabled));
        sb.append(", byolCpuCoreCountLimit=").append(String.valueOf(this.byolCpuCoreCountLimit));
        sb.append(", environmentType=").append(String.valueOf(this.environmentType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", loadBalancerSubnetId=").append(String.valueOf(this.loadBalancerSubnetId));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", placements=").append(String.valueOf(this.placements));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", oggData=").append(String.valueOf(this.oggData));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", maintenanceConfiguration=")
                .append(String.valueOf(this.maintenanceConfiguration));
        sb.append(", backupSchedule=").append(String.valueOf(this.backupSchedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDeploymentDetails)) {
            return false;
        }

        UpdateDeploymentDetails other = (UpdateDeploymentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(
                        this.isByolCpuCoreCountLimitEnabled, other.isByolCpuCoreCountLimitEnabled)
                && java.util.Objects.equals(this.byolCpuCoreCountLimit, other.byolCpuCoreCountLimit)
                && java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.loadBalancerSubnetId, other.loadBalancerSubnetId)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.placements, other.placements)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.oggData, other.oggData)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(
                        this.maintenanceConfiguration, other.maintenanceConfiguration)
                && java.util.Objects.equals(this.backupSchedule, other.backupSchedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.isByolCpuCoreCountLimitEnabled == null
                                ? 43
                                : this.isByolCpuCoreCountLimitEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.byolCpuCoreCountLimit == null
                                ? 43
                                : this.byolCpuCoreCountLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerSubnetId == null
                                ? 43
                                : this.loadBalancerSubnetId.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result = (result * PRIME) + (this.placements == null ? 43 : this.placements.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.oggData == null ? 43 : this.oggData.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceConfiguration == null
                                ? 43
                                : this.maintenanceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSchedule == null ? 43 : this.backupSchedule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
