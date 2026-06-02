/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for updating the Autonomous VM cluster.
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
    builder = UpdateAutonomousVmClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAutonomousVmClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maintenanceWindowDetails",
        "licenseModel",
        "freeformTags",
        "definedTags",
        "autonomousDataStorageSizeInTBs",
        "cpuCoreCountPerNode",
        "totalContainerDatabases",
        "timeZone",
        "scanListenerPortTls",
        "scanListenerPortNonTls",
        "isMtlsEnabled",
        "distributionAlgorithm"
    })
    public UpdateAutonomousVmClusterDetails(
            MaintenanceWindow maintenanceWindowDetails,
            LicenseModel licenseModel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Double autonomousDataStorageSizeInTBs,
            Integer cpuCoreCountPerNode,
            Integer totalContainerDatabases,
            String timeZone,
            Integer scanListenerPortTls,
            Integer scanListenerPortNonTls,
            Boolean isMtlsEnabled,
            DistributionAlgorithm distributionAlgorithm) {
        super();
        this.maintenanceWindowDetails = maintenanceWindowDetails;
        this.licenseModel = licenseModel;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.totalContainerDatabases = totalContainerDatabases;
        this.timeZone = timeZone;
        this.scanListenerPortTls = scanListenerPortTls;
        this.scanListenerPortNonTls = scanListenerPortNonTls;
        this.isMtlsEnabled = isMtlsEnabled;
        this.distributionAlgorithm = distributionAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
        private MaintenanceWindow maintenanceWindowDetails;

        public Builder maintenanceWindowDetails(MaintenanceWindow maintenanceWindowDetails) {
            this.maintenanceWindowDetails = maintenanceWindowDetails;
            this.__explicitlySet__.add("maintenanceWindowDetails");
            return this;
        }
        /**
         * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The new value of autonomous data storage (in TBs) for the Autonomous VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
        private Double autonomousDataStorageSizeInTBs;

        /**
         * The new value of autonomous data storage (in TBs) for the Autonomous VM cluster.
         * @param autonomousDataStorageSizeInTBs the value to set
         * @return this builder
         **/
        public Builder autonomousDataStorageSizeInTBs(Double autonomousDataStorageSizeInTBs) {
            this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
            this.__explicitlySet__.add("autonomousDataStorageSizeInTBs");
            return this;
        }
        /**
         * The new value of cpus per Autonomous VM cluster per node for the Autonomous VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
        private Integer cpuCoreCountPerNode;

        /**
         * The new value of cpus per Autonomous VM cluster per node for the Autonomous VM cluster.
         * @param cpuCoreCountPerNode the value to set
         * @return this builder
         **/
        public Builder cpuCoreCountPerNode(Integer cpuCoreCountPerNode) {
            this.cpuCoreCountPerNode = cpuCoreCountPerNode;
            this.__explicitlySet__.add("cpuCoreCountPerNode");
            return this;
        }
        /**
         * The new value of maximum number of ACDs for the Autonomous VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
        private Integer totalContainerDatabases;

        /**
         * The new value of maximum number of ACDs for the Autonomous VM cluster.
         * @param totalContainerDatabases the value to set
         * @return this builder
         **/
        public Builder totalContainerDatabases(Integer totalContainerDatabases) {
            this.totalContainerDatabases = totalContainerDatabases;
            this.__explicitlySet__.add("totalContainerDatabases");
            return this;
        }
        /**
         * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         * @param timeZone the value to set
         * @return this builder
         **/
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * The SCAN Listener TLS port number. Default value is 2484.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
        private Integer scanListenerPortTls;

        /**
         * The SCAN Listener TLS port number. Default value is 2484.
         * @param scanListenerPortTls the value to set
         * @return this builder
         **/
        public Builder scanListenerPortTls(Integer scanListenerPortTls) {
            this.scanListenerPortTls = scanListenerPortTls;
            this.__explicitlySet__.add("scanListenerPortTls");
            return this;
        }
        /**
         * The SCAN Listener Non TLS port number. Default value is 1521.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
        private Integer scanListenerPortNonTls;

        /**
         * The SCAN Listener Non TLS port number. Default value is 1521.
         * @param scanListenerPortNonTls the value to set
         * @return this builder
         **/
        public Builder scanListenerPortNonTls(Integer scanListenerPortNonTls) {
            this.scanListenerPortNonTls = scanListenerPortNonTls;
            this.__explicitlySet__.add("scanListenerPortNonTls");
            return this;
        }
        /**
         * Enable mutual TLS(mTLS) authentication for database. Default is TLS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabled")
        private Boolean isMtlsEnabled;

        /**
         * Enable mutual TLS(mTLS) authentication for database. Default is TLS.
         * @param isMtlsEnabled the value to set
         * @return this builder
         **/
        public Builder isMtlsEnabled(Boolean isMtlsEnabled) {
            this.isMtlsEnabled = isMtlsEnabled;
            this.__explicitlySet__.add("isMtlsEnabled");
            return this;
        }
        /**
         * The distribution algorithm used for the Autonomous VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("distributionAlgorithm")
        private DistributionAlgorithm distributionAlgorithm;

        /**
         * The distribution algorithm used for the Autonomous VM cluster.
         * @param distributionAlgorithm the value to set
         * @return this builder
         **/
        public Builder distributionAlgorithm(DistributionAlgorithm distributionAlgorithm) {
            this.distributionAlgorithm = distributionAlgorithm;
            this.__explicitlySet__.add("distributionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAutonomousVmClusterDetails build() {
            UpdateAutonomousVmClusterDetails model =
                    new UpdateAutonomousVmClusterDetails(
                            this.maintenanceWindowDetails,
                            this.licenseModel,
                            this.freeformTags,
                            this.definedTags,
                            this.autonomousDataStorageSizeInTBs,
                            this.cpuCoreCountPerNode,
                            this.totalContainerDatabases,
                            this.timeZone,
                            this.scanListenerPortTls,
                            this.scanListenerPortNonTls,
                            this.isMtlsEnabled,
                            this.distributionAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAutonomousVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("maintenanceWindowDetails")) {
                this.maintenanceWindowDetails(model.getMaintenanceWindowDetails());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTls")) {
                this.scanListenerPortTls(model.getScanListenerPortTls());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortNonTls")) {
                this.scanListenerPortNonTls(model.getScanListenerPortNonTls());
            }
            if (model.wasPropertyExplicitlySet("isMtlsEnabled")) {
                this.isMtlsEnabled(model.getIsMtlsEnabled());
            }
            if (model.wasPropertyExplicitlySet("distributionAlgorithm")) {
                this.distributionAlgorithm(model.getDistributionAlgorithm());
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

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    private final MaintenanceWindow maintenanceWindowDetails;

    public MaintenanceWindow getMaintenanceWindowDetails() {
        return maintenanceWindowDetails;
    }

    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
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
     * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The new value of autonomous data storage (in TBs) for the Autonomous VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
    private final Double autonomousDataStorageSizeInTBs;

    /**
     * The new value of autonomous data storage (in TBs) for the Autonomous VM cluster.
     * @return the value
     **/
    public Double getAutonomousDataStorageSizeInTBs() {
        return autonomousDataStorageSizeInTBs;
    }

    /**
     * The new value of cpus per Autonomous VM cluster per node for the Autonomous VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
    private final Integer cpuCoreCountPerNode;

    /**
     * The new value of cpus per Autonomous VM cluster per node for the Autonomous VM cluster.
     * @return the value
     **/
    public Integer getCpuCoreCountPerNode() {
        return cpuCoreCountPerNode;
    }

    /**
     * The new value of maximum number of ACDs for the Autonomous VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
    private final Integer totalContainerDatabases;

    /**
     * The new value of maximum number of ACDs for the Autonomous VM cluster.
     * @return the value
     **/
    public Integer getTotalContainerDatabases() {
        return totalContainerDatabases;
    }

    /**
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     * @return the value
     **/
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * The SCAN Listener TLS port number. Default value is 2484.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
    private final Integer scanListenerPortTls;

    /**
     * The SCAN Listener TLS port number. Default value is 2484.
     * @return the value
     **/
    public Integer getScanListenerPortTls() {
        return scanListenerPortTls;
    }

    /**
     * The SCAN Listener Non TLS port number. Default value is 1521.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
    private final Integer scanListenerPortNonTls;

    /**
     * The SCAN Listener Non TLS port number. Default value is 1521.
     * @return the value
     **/
    public Integer getScanListenerPortNonTls() {
        return scanListenerPortNonTls;
    }

    /**
     * Enable mutual TLS(mTLS) authentication for database. Default is TLS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabled")
    private final Boolean isMtlsEnabled;

    /**
     * Enable mutual TLS(mTLS) authentication for database. Default is TLS.
     * @return the value
     **/
    public Boolean getIsMtlsEnabled() {
        return isMtlsEnabled;
    }

    /**
     * The distribution algorithm used for the Autonomous VM cluster.
     **/
    public enum DistributionAlgorithm {
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
    /**
     * The distribution algorithm used for the Autonomous VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("distributionAlgorithm")
    private final DistributionAlgorithm distributionAlgorithm;

    /**
     * The distribution algorithm used for the Autonomous VM cluster.
     * @return the value
     **/
    public DistributionAlgorithm getDistributionAlgorithm() {
        return distributionAlgorithm;
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
        sb.append("UpdateAutonomousVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("maintenanceWindowDetails=")
                .append(String.valueOf(this.maintenanceWindowDetails));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", autonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.autonomousDataStorageSizeInTBs));
        sb.append(", cpuCoreCountPerNode=").append(String.valueOf(this.cpuCoreCountPerNode));
        sb.append(", totalContainerDatabases=")
                .append(String.valueOf(this.totalContainerDatabases));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", scanListenerPortTls=").append(String.valueOf(this.scanListenerPortTls));
        sb.append(", scanListenerPortNonTls=").append(String.valueOf(this.scanListenerPortNonTls));
        sb.append(", isMtlsEnabled=").append(String.valueOf(this.isMtlsEnabled));
        sb.append(", distributionAlgorithm=").append(String.valueOf(this.distributionAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousVmClusterDetails)) {
            return false;
        }

        UpdateAutonomousVmClusterDetails other = (UpdateAutonomousVmClusterDetails) o;
        return java.util.Objects.equals(
                        this.maintenanceWindowDetails, other.maintenanceWindowDetails)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.autonomousDataStorageSizeInTBs, other.autonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(this.cpuCoreCountPerNode, other.cpuCoreCountPerNode)
                && java.util.Objects.equals(
                        this.totalContainerDatabases, other.totalContainerDatabases)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.scanListenerPortTls, other.scanListenerPortTls)
                && java.util.Objects.equals(
                        this.scanListenerPortNonTls, other.scanListenerPortNonTls)
                && java.util.Objects.equals(this.isMtlsEnabled, other.isMtlsEnabled)
                && java.util.Objects.equals(this.distributionAlgorithm, other.distributionAlgorithm)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maintenanceWindowDetails == null
                                ? 43
                                : this.maintenanceWindowDetails.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
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
                        + (this.isMtlsEnabled == null ? 43 : this.isMtlsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.distributionAlgorithm == null
                                ? 43
                                : this.distributionAlgorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
