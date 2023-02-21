/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external cluster discovered in an external DB system discovery run.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DiscoveredExternalCluster.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "componentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiscoveredExternalCluster extends DiscoveredExternalDbSystemComponent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("componentId")
        private String componentId;

        public Builder componentId(String componentId) {
            this.componentId = componentId;
            this.__explicitlySet__.add("componentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSelectedForMonitoring")
        private Boolean isSelectedForMonitoring;

        public Builder isSelectedForMonitoring(Boolean isSelectedForMonitoring) {
            this.isSelectedForMonitoring = isSelectedForMonitoring;
            this.__explicitlySet__.add("isSelectedForMonitoring");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associatedComponents")
        private java.util.List<AssociatedComponent> associatedComponents;

        public Builder associatedComponents(
                java.util.List<AssociatedComponent> associatedComponents) {
            this.associatedComponents = associatedComponents;
            this.__explicitlySet__.add("associatedComponents");
            return this;
        }
        /**
         * The directory in which Oracle Grid Infrastructure is installed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gridHome")
        private String gridHome;

        /**
         * The directory in which Oracle Grid Infrastructure is installed.
         * @param gridHome the value to set
         * @return this builder
         **/
        public Builder gridHome(String gridHome) {
            this.gridHome = gridHome;
            this.__explicitlySet__.add("gridHome");
            return this;
        }
        /**
         * The version of Oracle Clusterware running in the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of Oracle Clusterware running in the cluster.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Indicates whether the cluster is an Oracle Flex Cluster or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFlexCluster")
        private Boolean isFlexCluster;

        /**
         * Indicates whether the cluster is an Oracle Flex Cluster or not.
         * @param isFlexCluster the value to set
         * @return this builder
         **/
        public Builder isFlexCluster(Boolean isFlexCluster) {
            this.isFlexCluster = isFlexCluster;
            this.__explicitlySet__.add("isFlexCluster");
            return this;
        }
        /**
         * The list of network address configurations of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkConfigurations")
        private java.util.List<ExternalClusterNetworkConfiguration> networkConfigurations;

        /**
         * The list of network address configurations of the external cluster.
         * @param networkConfigurations the value to set
         * @return this builder
         **/
        public Builder networkConfigurations(
                java.util.List<ExternalClusterNetworkConfiguration> networkConfigurations) {
            this.networkConfigurations = networkConfigurations;
            this.__explicitlySet__.add("networkConfigurations");
            return this;
        }
        /**
         * The list of Virtual IP (VIP) configurations of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vipConfigurations")
        private java.util.List<ExternalClusterVipConfiguration> vipConfigurations;

        /**
         * The list of Virtual IP (VIP) configurations of the external cluster.
         * @param vipConfigurations the value to set
         * @return this builder
         **/
        public Builder vipConfigurations(
                java.util.List<ExternalClusterVipConfiguration> vipConfigurations) {
            this.vipConfigurations = vipConfigurations;
            this.__explicitlySet__.add("vipConfigurations");
            return this;
        }
        /**
         * The list of Single Client Access Name (SCAN) configurations of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanConfigurations")
        private java.util.List<ExternalClusterScanListenerConfiguration> scanConfigurations;

        /**
         * The list of Single Client Access Name (SCAN) configurations of the external cluster.
         * @param scanConfigurations the value to set
         * @return this builder
         **/
        public Builder scanConfigurations(
                java.util.List<ExternalClusterScanListenerConfiguration> scanConfigurations) {
            this.scanConfigurations = scanConfigurations;
            this.__explicitlySet__.add("scanConfigurations");
            return this;
        }
        /**
         * The location of the Oracle Cluster Registry (OCR) file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocrFileLocation")
        private String ocrFileLocation;

        /**
         * The location of the Oracle Cluster Registry (OCR) file.
         * @param ocrFileLocation the value to set
         * @return this builder
         **/
        public Builder ocrFileLocation(String ocrFileLocation) {
            this.ocrFileLocation = ocrFileLocation;
            this.__explicitlySet__.add("ocrFileLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterInstances")
        private java.util.List<DiscoveredExternalClusterInstance> clusterInstances;

        public Builder clusterInstances(
                java.util.List<DiscoveredExternalClusterInstance> clusterInstances) {
            this.clusterInstances = clusterInstances;
            this.__explicitlySet__.add("clusterInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveredExternalCluster build() {
            DiscoveredExternalCluster model =
                    new DiscoveredExternalCluster(
                            this.componentId,
                            this.displayName,
                            this.componentName,
                            this.resourceId,
                            this.isSelectedForMonitoring,
                            this.status,
                            this.associatedComponents,
                            this.gridHome,
                            this.version,
                            this.isFlexCluster,
                            this.networkConfigurations,
                            this.vipConfigurations,
                            this.scanConfigurations,
                            this.ocrFileLocation,
                            this.clusterInstances);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveredExternalCluster model) {
            if (model.wasPropertyExplicitlySet("componentId")) {
                this.componentId(model.getComponentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("isSelectedForMonitoring")) {
                this.isSelectedForMonitoring(model.getIsSelectedForMonitoring());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("associatedComponents")) {
                this.associatedComponents(model.getAssociatedComponents());
            }
            if (model.wasPropertyExplicitlySet("gridHome")) {
                this.gridHome(model.getGridHome());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("isFlexCluster")) {
                this.isFlexCluster(model.getIsFlexCluster());
            }
            if (model.wasPropertyExplicitlySet("networkConfigurations")) {
                this.networkConfigurations(model.getNetworkConfigurations());
            }
            if (model.wasPropertyExplicitlySet("vipConfigurations")) {
                this.vipConfigurations(model.getVipConfigurations());
            }
            if (model.wasPropertyExplicitlySet("scanConfigurations")) {
                this.scanConfigurations(model.getScanConfigurations());
            }
            if (model.wasPropertyExplicitlySet("ocrFileLocation")) {
                this.ocrFileLocation(model.getOcrFileLocation());
            }
            if (model.wasPropertyExplicitlySet("clusterInstances")) {
                this.clusterInstances(model.getClusterInstances());
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

    @Deprecated
    public DiscoveredExternalCluster(
            String componentId,
            String displayName,
            String componentName,
            String resourceId,
            Boolean isSelectedForMonitoring,
            Status status,
            java.util.List<AssociatedComponent> associatedComponents,
            String gridHome,
            String version,
            Boolean isFlexCluster,
            java.util.List<ExternalClusterNetworkConfiguration> networkConfigurations,
            java.util.List<ExternalClusterVipConfiguration> vipConfigurations,
            java.util.List<ExternalClusterScanListenerConfiguration> scanConfigurations,
            String ocrFileLocation,
            java.util.List<DiscoveredExternalClusterInstance> clusterInstances) {
        super(
                componentId,
                displayName,
                componentName,
                resourceId,
                isSelectedForMonitoring,
                status,
                associatedComponents);
        this.gridHome = gridHome;
        this.version = version;
        this.isFlexCluster = isFlexCluster;
        this.networkConfigurations = networkConfigurations;
        this.vipConfigurations = vipConfigurations;
        this.scanConfigurations = scanConfigurations;
        this.ocrFileLocation = ocrFileLocation;
        this.clusterInstances = clusterInstances;
    }

    /**
     * The directory in which Oracle Grid Infrastructure is installed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gridHome")
    private final String gridHome;

    /**
     * The directory in which Oracle Grid Infrastructure is installed.
     * @return the value
     **/
    public String getGridHome() {
        return gridHome;
    }

    /**
     * The version of Oracle Clusterware running in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of Oracle Clusterware running in the cluster.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Indicates whether the cluster is an Oracle Flex Cluster or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFlexCluster")
    private final Boolean isFlexCluster;

    /**
     * Indicates whether the cluster is an Oracle Flex Cluster or not.
     * @return the value
     **/
    public Boolean getIsFlexCluster() {
        return isFlexCluster;
    }

    /**
     * The list of network address configurations of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkConfigurations")
    private final java.util.List<ExternalClusterNetworkConfiguration> networkConfigurations;

    /**
     * The list of network address configurations of the external cluster.
     * @return the value
     **/
    public java.util.List<ExternalClusterNetworkConfiguration> getNetworkConfigurations() {
        return networkConfigurations;
    }

    /**
     * The list of Virtual IP (VIP) configurations of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vipConfigurations")
    private final java.util.List<ExternalClusterVipConfiguration> vipConfigurations;

    /**
     * The list of Virtual IP (VIP) configurations of the external cluster.
     * @return the value
     **/
    public java.util.List<ExternalClusterVipConfiguration> getVipConfigurations() {
        return vipConfigurations;
    }

    /**
     * The list of Single Client Access Name (SCAN) configurations of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanConfigurations")
    private final java.util.List<ExternalClusterScanListenerConfiguration> scanConfigurations;

    /**
     * The list of Single Client Access Name (SCAN) configurations of the external cluster.
     * @return the value
     **/
    public java.util.List<ExternalClusterScanListenerConfiguration> getScanConfigurations() {
        return scanConfigurations;
    }

    /**
     * The location of the Oracle Cluster Registry (OCR) file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocrFileLocation")
    private final String ocrFileLocation;

    /**
     * The location of the Oracle Cluster Registry (OCR) file.
     * @return the value
     **/
    public String getOcrFileLocation() {
        return ocrFileLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterInstances")
    private final java.util.List<DiscoveredExternalClusterInstance> clusterInstances;

    public java.util.List<DiscoveredExternalClusterInstance> getClusterInstances() {
        return clusterInstances;
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
        sb.append("DiscoveredExternalCluster(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", gridHome=").append(String.valueOf(this.gridHome));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", isFlexCluster=").append(String.valueOf(this.isFlexCluster));
        sb.append(", networkConfigurations=").append(String.valueOf(this.networkConfigurations));
        sb.append(", vipConfigurations=").append(String.valueOf(this.vipConfigurations));
        sb.append(", scanConfigurations=").append(String.valueOf(this.scanConfigurations));
        sb.append(", ocrFileLocation=").append(String.valueOf(this.ocrFileLocation));
        sb.append(", clusterInstances=").append(String.valueOf(this.clusterInstances));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveredExternalCluster)) {
            return false;
        }

        DiscoveredExternalCluster other = (DiscoveredExternalCluster) o;
        return java.util.Objects.equals(this.gridHome, other.gridHome)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.isFlexCluster, other.isFlexCluster)
                && java.util.Objects.equals(this.networkConfigurations, other.networkConfigurations)
                && java.util.Objects.equals(this.vipConfigurations, other.vipConfigurations)
                && java.util.Objects.equals(this.scanConfigurations, other.scanConfigurations)
                && java.util.Objects.equals(this.ocrFileLocation, other.ocrFileLocation)
                && java.util.Objects.equals(this.clusterInstances, other.clusterInstances)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.gridHome == null ? 43 : this.gridHome.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.isFlexCluster == null ? 43 : this.isFlexCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfigurations == null
                                ? 43
                                : this.networkConfigurations.hashCode());
        result =
                (result * PRIME)
                        + (this.vipConfigurations == null ? 43 : this.vipConfigurations.hashCode());
        result =
                (result * PRIME)
                        + (this.scanConfigurations == null
                                ? 43
                                : this.scanConfigurations.hashCode());
        result =
                (result * PRIME)
                        + (this.ocrFileLocation == null ? 43 : this.ocrFileLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterInstances == null ? 43 : this.clusterInstances.hashCode());
        return result;
    }
}
