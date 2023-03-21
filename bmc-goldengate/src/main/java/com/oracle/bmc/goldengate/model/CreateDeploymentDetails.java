/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Deployment.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDeploymentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDeploymentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "licenseModel",
        "description",
        "compartmentId",
        "freeformTags",
        "definedTags",
        "deploymentBackupId",
        "subnetId",
        "fqdn",
        "nsgIds",
        "isPublic",
        "cpuCoreCount",
        "isAutoScalingEnabled",
        "deploymentType",
        "oggData",
        "maintenanceWindow"
    })
    public CreateDeploymentDetails(
            String displayName,
            LicenseModel licenseModel,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String deploymentBackupId,
            String subnetId,
            String fqdn,
            java.util.List<String> nsgIds,
            Boolean isPublic,
            Integer cpuCoreCount,
            Boolean isAutoScalingEnabled,
            DeploymentType deploymentType,
            CreateOggDeploymentDetails oggData,
            CreateMaintenanceWindowDetails maintenanceWindow) {
        super();
        this.displayName = displayName;
        this.licenseModel = licenseModel;
        this.description = description;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.deploymentBackupId = deploymentBackupId;
        this.subnetId = subnetId;
        this.fqdn = fqdn;
        this.nsgIds = nsgIds;
        this.isPublic = isPublic;
        this.cpuCoreCount = cpuCoreCount;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.deploymentType = deploymentType;
        this.oggData = oggData;
        this.maintenanceWindow = maintenanceWindow;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The Oracle license model that applies to a Deployment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to a Deployment.
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
         * Metadata about this specific object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only.
         * <p>
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only.
         * <p>
         * Example: {@code {"bar-key": "value"}}
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
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentBackupId")
        private String deploymentBackupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup being referenced.
         *
         * @param deploymentBackupId the value to set
         * @return this builder
         **/
        public Builder deploymentBackupId(String deploymentBackupId) {
            this.deploymentBackupId = deploymentBackupId;
            this.__explicitlySet__.add("deploymentBackupId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet being referenced.
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
         * A three-label Fully Qualified Domain Name (FQDN) for a resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

        /**
         * A three-label Fully Qualified Domain Name (FQDN) for a resource.
         *
         * @param fqdn the value to set
         * @return this builder
         **/
        public Builder fqdn(String fqdn) {
            this.fqdn = fqdn;
            this.__explicitlySet__.add("fqdn");
            return this;
        }
        /**
         * An array of Network Security Group OCIDs used to define network access for either Deployments or Connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * An array of Network Security Group OCIDs used to define network access for either Deployments or Connections.
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
         * True if this object is publicly available.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * True if this object is publicly available.
         *
         * @param isPublic the value to set
         * @return this builder
         **/
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }
        /**
         * The Minimum number of OCPUs to be made available for this Deployment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The Minimum number of OCPUs to be made available for this Deployment.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         **/
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * Indicates if auto scaling is enabled for the Deployment's CPU core count.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Indicates if auto scaling is enabled for the Deployment's CPU core count.
         *
         * @param isAutoScalingEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }
        /**
         * The type of deployment, which can be any one of the Allowed values.
         * NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.
         *     Its use is discouraged in favor of 'DATABASE_ORACLE'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The type of deployment, which can be any one of the Allowed values.
         * NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.
         *     Its use is discouraged in favor of 'DATABASE_ORACLE'.
         *
         * @param deploymentType the value to set
         * @return this builder
         **/
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oggData")
        private CreateOggDeploymentDetails oggData;

        public Builder oggData(CreateOggDeploymentDetails oggData) {
            this.oggData = oggData;
            this.__explicitlySet__.add("oggData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private CreateMaintenanceWindowDetails maintenanceWindow;

        public Builder maintenanceWindow(CreateMaintenanceWindowDetails maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDeploymentDetails build() {
            CreateDeploymentDetails model =
                    new CreateDeploymentDetails(
                            this.displayName,
                            this.licenseModel,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.deploymentBackupId,
                            this.subnetId,
                            this.fqdn,
                            this.nsgIds,
                            this.isPublic,
                            this.cpuCoreCount,
                            this.isAutoScalingEnabled,
                            this.deploymentType,
                            this.oggData,
                            this.maintenanceWindow);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDeploymentDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("deploymentBackupId")) {
                this.deploymentBackupId(model.getDeploymentBackupId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("fqdn")) {
                this.fqdn(model.getFqdn());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("isPublic")) {
                this.isPublic(model.getIsPublic());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("oggData")) {
                this.oggData(model.getOggData());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
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
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The Oracle license model that applies to a Deployment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to a Deployment.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * Metadata about this specific object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     * <p>
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     * <p>
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentBackupId")
    private final String deploymentBackupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup being referenced.
     *
     * @return the value
     **/
    public String getDeploymentBackupId() {
        return deploymentBackupId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet being referenced.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * A three-label Fully Qualified Domain Name (FQDN) for a resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

    /**
     * A three-label Fully Qualified Domain Name (FQDN) for a resource.
     *
     * @return the value
     **/
    public String getFqdn() {
        return fqdn;
    }

    /**
     * An array of Network Security Group OCIDs used to define network access for either Deployments or Connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of Network Security Group OCIDs used to define network access for either Deployments or Connections.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * True if this object is publicly available.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * True if this object is publicly available.
     *
     * @return the value
     **/
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * The Minimum number of OCPUs to be made available for this Deployment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The Minimum number of OCPUs to be made available for this Deployment.
     *
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * Indicates if auto scaling is enabled for the Deployment's CPU core count.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Indicates if auto scaling is enabled for the Deployment's CPU core count.
     *
     * @return the value
     **/
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /**
     * The type of deployment, which can be any one of the Allowed values.
     * NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.
     *     Its use is discouraged in favor of 'DATABASE_ORACLE'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The type of deployment, which can be any one of the Allowed values.
     * NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.
     *     Its use is discouraged in favor of 'DATABASE_ORACLE'.
     *
     * @return the value
     **/
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("oggData")
    private final CreateOggDeploymentDetails oggData;

    public CreateOggDeploymentDetails getOggData() {
        return oggData;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final CreateMaintenanceWindowDetails maintenanceWindow;

    public CreateMaintenanceWindowDetails getMaintenanceWindow() {
        return maintenanceWindow;
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
        sb.append("CreateDeploymentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", deploymentBackupId=").append(String.valueOf(this.deploymentBackupId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", oggData=").append(String.valueOf(this.oggData));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDeploymentDetails)) {
            return false;
        }

        CreateDeploymentDetails other = (CreateDeploymentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.deploymentBackupId, other.deploymentBackupId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.oggData, other.oggData)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentBackupId == null
                                ? 43
                                : this.deploymentBackupId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.oggData == null ? 43 : this.oggData.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
