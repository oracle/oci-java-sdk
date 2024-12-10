/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for updating the Exadata VM cluster on Exascale Infrastructure. Applies to Exadata Database Service on Exascale Infrastructure only.
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
    builder = UpdateExadbVmClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateExadbVmClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "totalECpuCount",
        "enabledECpuCount",
        "vmFileSystemStorage",
        "nodeCount",
        "licenseModel",
        "sshPublicKeys",
        "nsgIds",
        "backupNetworkNsgIds",
        "freeformTags",
        "definedTags",
        "securityAttributes",
        "dataCollectionOptions",
        "systemVersion",
        "gridImageId",
        "updateAction"
    })
    public UpdateExadbVmClusterDetails(
            String displayName,
            Integer totalECpuCount,
            Integer enabledECpuCount,
            ExadbVmClusterStorageDetails vmFileSystemStorage,
            Integer nodeCount,
            LicenseModel licenseModel,
            java.util.List<String> sshPublicKeys,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            DataCollectionOptions dataCollectionOptions,
            String systemVersion,
            String gridImageId,
            UpdateAction updateAction) {
        super();
        this.displayName = displayName;
        this.totalECpuCount = totalECpuCount;
        this.enabledECpuCount = enabledECpuCount;
        this.vmFileSystemStorage = vmFileSystemStorage;
        this.nodeCount = nodeCount;
        this.licenseModel = licenseModel;
        this.sshPublicKeys = sshPublicKeys;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.dataCollectionOptions = dataCollectionOptions;
        this.systemVersion = systemVersion;
        this.gridImageId = gridImageId;
        this.updateAction = updateAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("vmFileSystemStorage")
        private ExadbVmClusterStorageDetails vmFileSystemStorage;

        public Builder vmFileSystemStorage(ExadbVmClusterStorageDetails vmFileSystemStorage) {
            this.vmFileSystemStorage = vmFileSystemStorage;
            this.__explicitlySet__.add("vmFileSystemStorage");
            return this;
        }
        /**
         * The number of nodes to be added in the Exadata VM cluster on Exascale Infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes to be added in the Exadata VM cluster on Exascale Infrastructure.
         *
         * @param nodeCount the value to set
         * @return this builder
         **/
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
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
         * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
        private java.util.List<String> backupNetworkNsgIds;

        /**
         * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
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
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         **/
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }
        /**
         * Operating system version of the image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
        private String systemVersion;

        /**
         * Operating system version of the image.
         * @param systemVersion the value to set
         * @return this builder
         **/
        public Builder systemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            this.__explicitlySet__.add("systemVersion");
            return this;
        }
        /**
         * Grid Setup will be done using this grid image id.
         * <p>
         * The grid image id can be extracted from
         * 1. Obtain the supported major versions using API /20160918/giVersions?compartmentId=<compartmentId>&shape=EXADB_XS&availabilityDomain=<AD name>
         * 2. Replace {version} with one of the supported major versions and obtain the supported minor versions using
         * API /20160918/giVersions/{version}/minorVersions?compartmentId=<compartmentId>&shapeFamily=EXADB_XS&availabilityDomain=<AD name>
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gridImageId")
        private String gridImageId;

        /**
         * Grid Setup will be done using this grid image id.
         * <p>
         * The grid image id can be extracted from
         * 1. Obtain the supported major versions using API /20160918/giVersions?compartmentId=<compartmentId>&shape=EXADB_XS&availabilityDomain=<AD name>
         * 2. Replace {version} with one of the supported major versions and obtain the supported minor versions using
         * API /20160918/giVersions/{version}/minorVersions?compartmentId=<compartmentId>&shapeFamily=EXADB_XS&availabilityDomain=<AD name>
         *
         * @param gridImageId the value to set
         * @return this builder
         **/
        public Builder gridImageId(String gridImageId) {
            this.gridImageId = gridImageId;
            this.__explicitlySet__.add("gridImageId");
            return this;
        }
        /**
         * The update action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateAction")
        private UpdateAction updateAction;

        /**
         * The update action.
         * @param updateAction the value to set
         * @return this builder
         **/
        public Builder updateAction(UpdateAction updateAction) {
            this.updateAction = updateAction;
            this.__explicitlySet__.add("updateAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateExadbVmClusterDetails build() {
            UpdateExadbVmClusterDetails model =
                    new UpdateExadbVmClusterDetails(
                            this.displayName,
                            this.totalECpuCount,
                            this.enabledECpuCount,
                            this.vmFileSystemStorage,
                            this.nodeCount,
                            this.licenseModel,
                            this.sshPublicKeys,
                            this.nsgIds,
                            this.backupNetworkNsgIds,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes,
                            this.dataCollectionOptions,
                            this.systemVersion,
                            this.gridImageId,
                            this.updateAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExadbVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("totalECpuCount")) {
                this.totalECpuCount(model.getTotalECpuCount());
            }
            if (model.wasPropertyExplicitlySet("enabledECpuCount")) {
                this.enabledECpuCount(model.getEnabledECpuCount());
            }
            if (model.wasPropertyExplicitlySet("vmFileSystemStorage")) {
                this.vmFileSystemStorage(model.getVmFileSystemStorage());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkNsgIds")) {
                this.backupNetworkNsgIds(model.getBackupNetworkNsgIds());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("systemVersion")) {
                this.systemVersion(model.getSystemVersion());
            }
            if (model.wasPropertyExplicitlySet("gridImageId")) {
                this.gridImageId(model.getGridImageId());
            }
            if (model.wasPropertyExplicitlySet("updateAction")) {
                this.updateAction(model.getUpdateAction());
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

    @com.fasterxml.jackson.annotation.JsonProperty("vmFileSystemStorage")
    private final ExadbVmClusterStorageDetails vmFileSystemStorage;

    public ExadbVmClusterStorageDetails getVmFileSystemStorage() {
        return vmFileSystemStorage;
    }

    /**
     * The number of nodes to be added in the Exadata VM cluster on Exascale Infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes to be added in the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     **/
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     *
     **/
    public enum LicenseModel {
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
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
    private final java.util.List<String> backupNetworkNsgIds;

    /**
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     * @return the value
     **/
    public java.util.List<String> getBackupNetworkNsgIds() {
        return backupNetworkNsgIds;
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
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    /**
     * Operating system version of the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
    private final String systemVersion;

    /**
     * Operating system version of the image.
     * @return the value
     **/
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * Grid Setup will be done using this grid image id.
     * <p>
     * The grid image id can be extracted from
     * 1. Obtain the supported major versions using API /20160918/giVersions?compartmentId=<compartmentId>&shape=EXADB_XS&availabilityDomain=<AD name>
     * 2. Replace {version} with one of the supported major versions and obtain the supported minor versions using
     * API /20160918/giVersions/{version}/minorVersions?compartmentId=<compartmentId>&shapeFamily=EXADB_XS&availabilityDomain=<AD name>
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gridImageId")
    private final String gridImageId;

    /**
     * Grid Setup will be done using this grid image id.
     * <p>
     * The grid image id can be extracted from
     * 1. Obtain the supported major versions using API /20160918/giVersions?compartmentId=<compartmentId>&shape=EXADB_XS&availabilityDomain=<AD name>
     * 2. Replace {version} with one of the supported major versions and obtain the supported minor versions using
     * API /20160918/giVersions/{version}/minorVersions?compartmentId=<compartmentId>&shapeFamily=EXADB_XS&availabilityDomain=<AD name>
     *
     * @return the value
     **/
    public String getGridImageId() {
        return gridImageId;
    }

    /**
     * The update action.
     **/
    public enum UpdateAction {
        RollingApply("ROLLING_APPLY"),
        NonRollingApply("NON_ROLLING_APPLY"),
        Precheck("PRECHECK"),
        Rollback("ROLLBACK"),
        ;

        private final String value;
        private static java.util.Map<String, UpdateAction> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateAction v : UpdateAction.values()) {
                map.put(v.getValue(), v);
            }
        }

        UpdateAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateAction: " + key);
        }
    };
    /**
     * The update action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateAction")
    private final UpdateAction updateAction;

    /**
     * The update action.
     * @return the value
     **/
    public UpdateAction getUpdateAction() {
        return updateAction;
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
        sb.append("UpdateExadbVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", totalECpuCount=").append(String.valueOf(this.totalECpuCount));
        sb.append(", enabledECpuCount=").append(String.valueOf(this.enabledECpuCount));
        sb.append(", vmFileSystemStorage=").append(String.valueOf(this.vmFileSystemStorage));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", systemVersion=").append(String.valueOf(this.systemVersion));
        sb.append(", gridImageId=").append(String.valueOf(this.gridImageId));
        sb.append(", updateAction=").append(String.valueOf(this.updateAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExadbVmClusterDetails)) {
            return false;
        }

        UpdateExadbVmClusterDetails other = (UpdateExadbVmClusterDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.totalECpuCount, other.totalECpuCount)
                && java.util.Objects.equals(this.enabledECpuCount, other.enabledECpuCount)
                && java.util.Objects.equals(this.vmFileSystemStorage, other.vmFileSystemStorage)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(this.systemVersion, other.systemVersion)
                && java.util.Objects.equals(this.gridImageId, other.gridImageId)
                && java.util.Objects.equals(this.updateAction, other.updateAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.totalECpuCount == null ? 43 : this.totalECpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.enabledECpuCount == null ? 43 : this.enabledECpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.vmFileSystemStorage == null
                                ? 43
                                : this.vmFileSystemStorage.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkNsgIds == null
                                ? 43
                                : this.backupNetworkNsgIds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVersion == null ? 43 : this.systemVersion.hashCode());
        result = (result * PRIME) + (this.gridImageId == null ? 43 : this.gridImageId.hashCode());
        result = (result * PRIME) + (this.updateAction == null ? 43 : this.updateAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
