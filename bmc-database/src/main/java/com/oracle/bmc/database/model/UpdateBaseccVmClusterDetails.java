/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for updating the BaseDB-C@C VM cluster. Applies to Base Database Service on
 * Cloud@Customer instances only. <br>
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
        builder = UpdateBaseccVmClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateBaseccVmClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cpuCoreCount",
        "memorySizeInGBs",
        "dataStorageSizeInGBs",
        "recoStorageSizeInGBs",
        "licenseModel",
        "sshPublicKeys",
        "displayName",
        "additionalVmStorageSizeInGBs",
        "updateDetails",
        "freeformTags",
        "definedTags",
        "dataCollectionOptions",
        "cloudAutomationUpdateDetails"
    })
    public UpdateBaseccVmClusterDetails(
            Integer cpuCoreCount,
            Integer memorySizeInGBs,
            Integer dataStorageSizeInGBs,
            Integer recoStorageSizeInGBs,
            LicenseModel licenseModel,
            java.util.List<String> sshPublicKeys,
            String displayName,
            Integer additionalVmStorageSizeInGBs,
            BaseccVmClusterUpdateDetails updateDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            DataCollectionOptions dataCollectionOptions,
            CloudAutomationUpdateDetails cloudAutomationUpdateDetails) {
        super();
        this.cpuCoreCount = cpuCoreCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.recoStorageSizeInGBs = recoStorageSizeInGBs;
        this.licenseModel = licenseModel;
        this.sshPublicKeys = sshPublicKeys;
        this.displayName = displayName;
        this.additionalVmStorageSizeInGBs = additionalVmStorageSizeInGBs;
        this.updateDetails = updateDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dataCollectionOptions = dataCollectionOptions;
        this.cloudAutomationUpdateDetails = cloudAutomationUpdateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total CPU cores for the BaseDB C@C VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * Total CPU cores for the BaseDB C@C VM cluster.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /**
         * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGBs")
        private Integer recoStorageSizeInGBs;

        /**
         * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         *
         * @param recoStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder recoStorageSizeInGBs(Integer recoStorageSizeInGBs) {
            this.recoStorageSizeInGBs = recoStorageSizeInGBs;
            this.__explicitlySet__.add("recoStorageSizeInGBs");
            return this;
        }
        /**
         * The Oracle license model that applies to the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
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
         * The public key portion of one or more key pairs used for SSH access to the VMs of Base
         * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the VMs of Base
         * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param sshPublicKeys the value to set
         * @return this builder
         */
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /**
         * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster. The name does not need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster. The name does not need to be unique.
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
         * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalVmStorageSizeInGBs")
        private Integer additionalVmStorageSizeInGBs;

        /**
         * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         *
         * @param additionalVmStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder additionalVmStorageSizeInGBs(Integer additionalVmStorageSizeInGBs) {
            this.additionalVmStorageSizeInGBs = additionalVmStorageSizeInGBs;
            this.__explicitlySet__.add("additionalVmStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateDetails")
        private BaseccVmClusterUpdateDetails updateDetails;

        public Builder updateDetails(BaseccVmClusterUpdateDetails updateDetails) {
            this.updateDetails = updateDetails;
            this.__explicitlySet__.add("updateDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutomationUpdateDetails")
        private CloudAutomationUpdateDetails cloudAutomationUpdateDetails;

        public Builder cloudAutomationUpdateDetails(
                CloudAutomationUpdateDetails cloudAutomationUpdateDetails) {
            this.cloudAutomationUpdateDetails = cloudAutomationUpdateDetails;
            this.__explicitlySet__.add("cloudAutomationUpdateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBaseccVmClusterDetails build() {
            UpdateBaseccVmClusterDetails model =
                    new UpdateBaseccVmClusterDetails(
                            this.cpuCoreCount,
                            this.memorySizeInGBs,
                            this.dataStorageSizeInGBs,
                            this.recoStorageSizeInGBs,
                            this.licenseModel,
                            this.sshPublicKeys,
                            this.displayName,
                            this.additionalVmStorageSizeInGBs,
                            this.updateDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.dataCollectionOptions,
                            this.cloudAutomationUpdateDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBaseccVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("recoStorageSizeInGBs")) {
                this.recoStorageSizeInGBs(model.getRecoStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("additionalVmStorageSizeInGBs")) {
                this.additionalVmStorageSizeInGBs(model.getAdditionalVmStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("updateDetails")) {
                this.updateDetails(model.getUpdateDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("cloudAutomationUpdateDetails")) {
                this.cloudAutomationUpdateDetails(model.getCloudAutomationUpdateDetails());
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

    /** Total CPU cores for the BaseDB C@C VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * Total CPU cores for the BaseDB C@C VM cluster.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGBs")
    private final Integer recoStorageSizeInGBs;

    /**
     * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     *
     * @return the value
     */
    public Integer getRecoStorageSizeInGBs() {
        return recoStorageSizeInGBs;
    }

    /**
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
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
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the VMs of Base
     * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the VMs of Base
     * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     */
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
     * cluster. The name does not need to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
     * cluster. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalVmStorageSizeInGBs")
    private final Integer additionalVmStorageSizeInGBs;

    /**
     * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     *
     * @return the value
     */
    public Integer getAdditionalVmStorageSizeInGBs() {
        return additionalVmStorageSizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("updateDetails")
    private final BaseccVmClusterUpdateDetails updateDetails;

    public BaseccVmClusterUpdateDetails getUpdateDetails() {
        return updateDetails;
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

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutomationUpdateDetails")
    private final CloudAutomationUpdateDetails cloudAutomationUpdateDetails;

    public CloudAutomationUpdateDetails getCloudAutomationUpdateDetails() {
        return cloudAutomationUpdateDetails;
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
        sb.append("UpdateBaseccVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", recoStorageSizeInGBs=").append(String.valueOf(this.recoStorageSizeInGBs));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", additionalVmStorageSizeInGBs=")
                .append(String.valueOf(this.additionalVmStorageSizeInGBs));
        sb.append(", updateDetails=").append(String.valueOf(this.updateDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", cloudAutomationUpdateDetails=")
                .append(String.valueOf(this.cloudAutomationUpdateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBaseccVmClusterDetails)) {
            return false;
        }

        UpdateBaseccVmClusterDetails other = (UpdateBaseccVmClusterDetails) o;
        return java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.recoStorageSizeInGBs, other.recoStorageSizeInGBs)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.additionalVmStorageSizeInGBs, other.additionalVmStorageSizeInGBs)
                && java.util.Objects.equals(this.updateDetails, other.updateDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(
                        this.cloudAutomationUpdateDetails, other.cloudAutomationUpdateDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.recoStorageSizeInGBs == null
                                ? 43
                                : this.recoStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalVmStorageSizeInGBs == null
                                ? 43
                                : this.additionalVmStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDetails == null ? 43 : this.updateDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutomationUpdateDetails == null
                                ? 43
                                : this.cloudAutomationUpdateDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
