/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for updating the Autonomous VM cluster. <br>
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
        builder = UpdateAutonomousVmClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAutonomousVmClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maintenanceWindowDetails",
        "licenseModel",
        "freeformTags",
        "definedTags",
        "autonomousDataStorageSizeInTBs",
        "cpuCoreCountPerNode",
        "totalContainerDatabases"
    })
    public UpdateAutonomousVmClusterDetails(
            MaintenanceWindow maintenanceWindowDetails,
            LicenseModel licenseModel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Double autonomousDataStorageSizeInTBs,
            Integer cpuCoreCountPerNode,
            Integer totalContainerDatabases) {
        super();
        this.maintenanceWindowDetails = maintenanceWindowDetails;
        this.licenseModel = licenseModel;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.totalContainerDatabases = totalContainerDatabases;
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
         * The Oracle license model that applies to the Autonomous VM cluster. The default is
         * BRING_YOUR_OWN_LICENSE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Autonomous VM cluster. The default is
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
                            this.totalContainerDatabases);
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

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    private final MaintenanceWindow maintenanceWindowDetails;

    public MaintenanceWindow getMaintenanceWindowDetails() {
        return maintenanceWindowDetails;
    }

    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is
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
     * The Oracle license model that applies to the Autonomous VM cluster. The default is
     * BRING_YOUR_OWN_LICENSE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is
     * BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
