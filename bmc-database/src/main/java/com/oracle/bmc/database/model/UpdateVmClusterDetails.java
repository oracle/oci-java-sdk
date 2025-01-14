/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for updating the VM cluster. Applies to Exadata Cloud@Customer instances only. For
 * details on updating a cloud VM cluster in an Exadata Cloud Service instance, see {@link
 * #updateCloudVmClusterDetails(UpdateCloudVmClusterDetailsRequest) updateCloudVmClusterDetails}
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateVmClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateVmClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cpuCoreCount",
        "ocpuCount",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "dataStorageSizeInTBs",
        "dataStorageSizeInGBs",
        "licenseModel",
        "sshPublicKeys",
        "version",
        "updateDetails",
        "freeformTags",
        "definedTags",
        "dataCollectionOptions",
        "fileSystemConfigurationDetails",
        "cloudAutomationUpdateDetails"
    })
    public UpdateVmClusterDetails(
            Integer cpuCoreCount,
            Float ocpuCount,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            Double dataStorageSizeInTBs,
            Double dataStorageSizeInGBs,
            LicenseModel licenseModel,
            java.util.List<String> sshPublicKeys,
            PatchDetails version,
            VmClusterUpdateDetails updateDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            DataCollectionOptions dataCollectionOptions,
            java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails,
            CloudAutomationUpdateDetails cloudAutomationUpdateDetails) {
        super();
        this.cpuCoreCount = cpuCoreCount;
        this.ocpuCount = ocpuCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.licenseModel = licenseModel;
        this.sshPublicKeys = sshPublicKeys;
        this.version = version;
        this.updateDetails = updateDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dataCollectionOptions = dataCollectionOptions;
        this.fileSystemConfigurationDetails = fileSystemConfigurationDetails;
        this.cloudAutomationUpdateDetails = cloudAutomationUpdateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of CPU cores to enable for the VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores to enable for the VM cluster.
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
         * The number of OCPU cores to enable for the VM cluster. Only 1 decimal place is allowed
         * for the fractional part.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        /**
         * The number of OCPU cores to enable for the VM cluster. Only 1 decimal place is allowed
         * for the fractional part.
         *
         * @param ocpuCount the value to set
         * @return this builder
         */
        public Builder ocpuCount(Float ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /** The memory to be allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The memory to be allocated in GBs.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /** The local node storage to be allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The local node storage to be allocated in GBs.
         *
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /** The data disk group size to be allocated in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        /**
         * The data disk group size to be allocated in TBs.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /** The data disk group size to be allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Double dataStorageSizeInGBs;

        /**
         * The data disk group size to be allocated in GBs.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Double dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The Oracle license model that applies to the VM cluster. The default is
         * BRING_YOUR_OWN_LICENSE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the VM cluster. The default is
         * BRING_YOUR_OWN_LICENSE.
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
         * The public key portion of one or more key pairs used for SSH access to the VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the VM cluster.
         *
         * @param sshPublicKeys the value to set
         * @return this builder
         */
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private PatchDetails version;

        public Builder version(PatchDetails version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateDetails")
        private VmClusterUpdateDetails updateDetails;

        public Builder updateDetails(VmClusterUpdateDetails updateDetails) {
            this.updateDetails = updateDetails;
            this.__explicitlySet__.add("updateDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }
        /** Details of the file system configuration of the VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemConfigurationDetails")
        private java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails;

        /**
         * Details of the file system configuration of the VM cluster.
         *
         * @param fileSystemConfigurationDetails the value to set
         * @return this builder
         */
        public Builder fileSystemConfigurationDetails(
                java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails) {
            this.fileSystemConfigurationDetails = fileSystemConfigurationDetails;
            this.__explicitlySet__.add("fileSystemConfigurationDetails");
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

        public UpdateVmClusterDetails build() {
            UpdateVmClusterDetails model =
                    new UpdateVmClusterDetails(
                            this.cpuCoreCount,
                            this.ocpuCount,
                            this.memorySizeInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.dataStorageSizeInTBs,
                            this.dataStorageSizeInGBs,
                            this.licenseModel,
                            this.sshPublicKeys,
                            this.version,
                            this.updateDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.dataCollectionOptions,
                            this.fileSystemConfigurationDetails,
                            this.cloudAutomationUpdateDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dbNodeStorageSizeInGBs")) {
                this.dbNodeStorageSizeInGBs(model.getDbNodeStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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
            if (model.wasPropertyExplicitlySet("fileSystemConfigurationDetails")) {
                this.fileSystemConfigurationDetails(model.getFileSystemConfigurationDetails());
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

    /** The number of CPU cores to enable for the VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores to enable for the VM cluster.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The number of OCPU cores to enable for the VM cluster. Only 1 decimal place is allowed for
     * the fractional part.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of OCPU cores to enable for the VM cluster. Only 1 decimal place is allowed for
     * the fractional part.
     *
     * @return the value
     */
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /** The memory to be allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The memory to be allocated in GBs.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /** The local node storage to be allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The local node storage to be allocated in GBs.
     *
     * @return the value
     */
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /** The data disk group size to be allocated in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Double dataStorageSizeInTBs;

    /**
     * The data disk group size to be allocated in TBs.
     *
     * @return the value
     */
    public Double getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /** The data disk group size to be allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Double dataStorageSizeInGBs;

    /**
     * The data disk group size to be allocated in GBs.
     *
     * @return the value
     */
    public Double getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The Oracle license model that applies to the VM cluster. The default is
     * BRING_YOUR_OWN_LICENSE.
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
     * The Oracle license model that applies to the VM cluster. The default is
     * BRING_YOUR_OWN_LICENSE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the VM cluster. The default is
     * BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /** The public key portion of one or more key pairs used for SSH access to the VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the VM cluster.
     *
     * @return the value
     */
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final PatchDetails version;

    public PatchDetails getVersion() {
        return version;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("updateDetails")
    private final VmClusterUpdateDetails updateDetails;

    public VmClusterUpdateDetails getUpdateDetails() {
        return updateDetails;
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

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    /** Details of the file system configuration of the VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemConfigurationDetails")
    private final java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails;

    /**
     * Details of the file system configuration of the VM cluster.
     *
     * @return the value
     */
    public java.util.List<FileSystemConfigurationDetail> getFileSystemConfigurationDetails() {
        return fileSystemConfigurationDetails;
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
        sb.append("UpdateVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", updateDetails=").append(String.valueOf(this.updateDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", fileSystemConfigurationDetails=")
                .append(String.valueOf(this.fileSystemConfigurationDetails));
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
        if (!(o instanceof UpdateVmClusterDetails)) {
            return false;
        }

        UpdateVmClusterDetails other = (UpdateVmClusterDetails) o;
        return java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.updateDetails, other.updateDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(
                        this.fileSystemConfigurationDetails, other.fileSystemConfigurationDetails)
                && java.util.Objects.equals(
                        this.cloudAutomationUpdateDetails, other.cloudAutomationUpdateDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
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
                        + (this.fileSystemConfigurationDetails == null
                                ? 43
                                : this.fileSystemConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutomationUpdateDetails == null
                                ? 43
                                : this.cloudAutomationUpdateDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
