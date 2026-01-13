/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Details of the initial Cluster of SDDC. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InitialClusterConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InitialClusterConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vsphereType",
        "computeAvailabilityDomain",
        "displayName",
        "instanceDisplayNamePrefix",
        "esxiHostsCount",
        "networkConfiguration",
        "initialCommitment",
        "workloadNetworkCidr",
        "initialHostShapeName",
        "initialHostOcpuCount",
        "isShieldedInstanceEnabled",
        "capacityReservationId",
        "datastores",
        "datastoreClusterIds"
    })
    public InitialClusterConfiguration(
            VsphereTypes vsphereType,
            String computeAvailabilityDomain,
            String displayName,
            String instanceDisplayNamePrefix,
            Integer esxiHostsCount,
            NetworkConfiguration networkConfiguration,
            Commitment initialCommitment,
            String workloadNetworkCidr,
            String initialHostShapeName,
            Float initialHostOcpuCount,
            Boolean isShieldedInstanceEnabled,
            String capacityReservationId,
            java.util.List<DatastoreInfo> datastores,
            java.util.List<String> datastoreClusterIds) {
        super();
        this.vsphereType = vsphereType;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.displayName = displayName;
        this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
        this.esxiHostsCount = esxiHostsCount;
        this.networkConfiguration = networkConfiguration;
        this.initialCommitment = initialCommitment;
        this.workloadNetworkCidr = workloadNetworkCidr;
        this.initialHostShapeName = initialHostShapeName;
        this.initialHostOcpuCount = initialHostOcpuCount;
        this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
        this.capacityReservationId = capacityReservationId;
        this.datastores = datastores;
        this.datastoreClusterIds = datastoreClusterIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** vSphere Cluster types. */
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereType")
        private VsphereTypes vsphereType;

        /**
         * vSphere Cluster types.
         *
         * @param vsphereType the value to set
         * @return this builder
         */
        public Builder vsphereType(VsphereTypes vsphereType) {
            this.vsphereType = vsphereType;
            this.__explicitlySet__.add("vsphereType");
            return this;
        }
        /**
         * The availability domain to create the Cluster's ESXi hosts in. For multi-AD Cluster
         * deployment, set to {@code multi-AD}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        /**
         * The availability domain to create the Cluster's ESXi hosts in. For multi-AD Cluster
         * deployment, set to {@code multi-AD}.
         *
         * @param computeAvailabilityDomain the value to set
         * @return this builder
         */
        public Builder computeAvailabilityDomain(String computeAvailabilityDomain) {
            this.computeAvailabilityDomain = computeAvailabilityDomain;
            this.__explicitlySet__.add("computeAvailabilityDomain");
            return this;
        }
        /**
         * A descriptive name for the Cluster. Cluster name requirements are 1-22 character length
         * limit, Must start with a letter, Must be English letters, numbers, - only, No repeating
         * hyphens, Must be unique within the region. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the Cluster. Cluster name requirements are 1-22 character length
         * limit, Must start with a letter, Must be English letters, numbers, - only, No repeating
         * hyphens, Must be unique within the region. Avoid entering confidential information.
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
         * A prefix used in the name of each ESXi host and Compute instance in the Cluster. If this
         * isn't set, the Cluster's {@code displayName} is used as the prefix.
         *
         * <p>For example, if the value is {@code myCluster}, the ESXi hosts are named {@code
         * myCluster-1}, {@code myCluster-2}, and so on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
        private String instanceDisplayNamePrefix;

        /**
         * A prefix used in the name of each ESXi host and Compute instance in the Cluster. If this
         * isn't set, the Cluster's {@code displayName} is used as the prefix.
         *
         * <p>For example, if the value is {@code myCluster}, the ESXi hosts are named {@code
         * myCluster-1}, {@code myCluster-2}, and so on.
         *
         * @param instanceDisplayNamePrefix the value to set
         * @return this builder
         */
        public Builder instanceDisplayNamePrefix(String instanceDisplayNamePrefix) {
            this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
            this.__explicitlySet__.add("instanceDisplayNamePrefix");
            return this;
        }
        /**
         * The number of ESXi hosts to create in the Cluster. You can add more hosts later (see
         * {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}). Creating a Cluster with a
         * ESXi host count of 1 will be considered a single ESXi host Cluster.
         *
         * <p>*Note:** If you later delete EXSi hosts from a production Cluster to total less than
         * 3, you are still billed for the 3 minimum recommended ESXi hosts. Also, you cannot add
         * more VMware workloads to the Cluster until it again has at least 3 ESXi hosts.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        /**
         * The number of ESXi hosts to create in the Cluster. You can add more hosts later (see
         * {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}). Creating a Cluster with a
         * ESXi host count of 1 will be considered a single ESXi host Cluster.
         *
         * <p>*Note:** If you later delete EXSi hosts from a production Cluster to total less than
         * 3, you are still billed for the 3 minimum recommended ESXi hosts. Also, you cannot add
         * more VMware workloads to the Cluster until it again has at least 3 ESXi hosts.
         *
         * @param esxiHostsCount the value to set
         * @return this builder
         */
        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }
        /**
         * The billing option selected during Cluster creation. {@link
         * #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initialCommitment")
        private Commitment initialCommitment;

        /**
         * The billing option selected during Cluster creation. {@link
         * #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         * @param initialCommitment the value to set
         * @return this builder
         */
        public Builder initialCommitment(Commitment initialCommitment) {
            this.initialCommitment = initialCommitment;
            this.__explicitlySet__.add("initialCommitment");
            return this;
        }
        /**
         * The CIDR block for the IP addresses that VMware VMs in the Cluster use to run application
         * workloads.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
        private String workloadNetworkCidr;

        /**
         * The CIDR block for the IP addresses that VMware VMs in the Cluster use to run application
         * workloads.
         *
         * @param workloadNetworkCidr the value to set
         * @return this builder
         */
        public Builder workloadNetworkCidr(String workloadNetworkCidr) {
            this.workloadNetworkCidr = workloadNetworkCidr;
            this.__explicitlySet__.add("workloadNetworkCidr");
            return this;
        }
        /**
         * The initial compute shape of the Cluster's ESXi hosts. {@link
         * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
        private String initialHostShapeName;

        /**
         * The initial compute shape of the Cluster's ESXi hosts. {@link
         * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         *
         * @param initialHostShapeName the value to set
         * @return this builder
         */
        public Builder initialHostShapeName(String initialHostShapeName) {
            this.initialHostShapeName = initialHostShapeName;
            this.__explicitlySet__.add("initialHostShapeName");
            return this;
        }
        /** The initial OCPU count of the Cluster's ESXi hosts. */
        @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
        private Float initialHostOcpuCount;

        /**
         * The initial OCPU count of the Cluster's ESXi hosts.
         *
         * @param initialHostOcpuCount the value to set
         * @return this builder
         */
        public Builder initialHostOcpuCount(Float initialHostOcpuCount) {
            this.initialHostOcpuCount = initialHostOcpuCount;
            this.__explicitlySet__.add("initialHostOcpuCount");
            return this;
        }
        /** Indicates whether shielded instance is enabled for this Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
        private Boolean isShieldedInstanceEnabled;

        /**
         * Indicates whether shielded instance is enabled for this Cluster.
         *
         * @param isShieldedInstanceEnabled the value to set
         * @return this builder
         */
        public Builder isShieldedInstanceEnabled(Boolean isShieldedInstanceEnabled) {
            this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
            this.__explicitlySet__.add("isShieldedInstanceEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Capacity Reservation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Capacity Reservation.
         *
         * @param capacityReservationId the value to set
         * @return this builder
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /**
         * A list of datastore info for the Cluster. This value is required only when {@code
         * initialHostShapeName} is a standard shape.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("datastores")
        private java.util.List<DatastoreInfo> datastores;

        /**
         * A list of datastore info for the Cluster. This value is required only when {@code
         * initialHostShapeName} is a standard shape.
         *
         * @param datastores the value to set
         * @return this builder
         */
        public Builder datastores(java.util.List<DatastoreInfo> datastores) {
            this.datastores = datastores;
            this.__explicitlySet__.add("datastores");
            return this;
        }
        /** A list of datastore clusters. */
        @com.fasterxml.jackson.annotation.JsonProperty("datastoreClusterIds")
        private java.util.List<String> datastoreClusterIds;

        /**
         * A list of datastore clusters.
         *
         * @param datastoreClusterIds the value to set
         * @return this builder
         */
        public Builder datastoreClusterIds(java.util.List<String> datastoreClusterIds) {
            this.datastoreClusterIds = datastoreClusterIds;
            this.__explicitlySet__.add("datastoreClusterIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InitialClusterConfiguration build() {
            InitialClusterConfiguration model =
                    new InitialClusterConfiguration(
                            this.vsphereType,
                            this.computeAvailabilityDomain,
                            this.displayName,
                            this.instanceDisplayNamePrefix,
                            this.esxiHostsCount,
                            this.networkConfiguration,
                            this.initialCommitment,
                            this.workloadNetworkCidr,
                            this.initialHostShapeName,
                            this.initialHostOcpuCount,
                            this.isShieldedInstanceEnabled,
                            this.capacityReservationId,
                            this.datastores,
                            this.datastoreClusterIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InitialClusterConfiguration model) {
            if (model.wasPropertyExplicitlySet("vsphereType")) {
                this.vsphereType(model.getVsphereType());
            }
            if (model.wasPropertyExplicitlySet("computeAvailabilityDomain")) {
                this.computeAvailabilityDomain(model.getComputeAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("instanceDisplayNamePrefix")) {
                this.instanceDisplayNamePrefix(model.getInstanceDisplayNamePrefix());
            }
            if (model.wasPropertyExplicitlySet("esxiHostsCount")) {
                this.esxiHostsCount(model.getEsxiHostsCount());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
            }
            if (model.wasPropertyExplicitlySet("initialCommitment")) {
                this.initialCommitment(model.getInitialCommitment());
            }
            if (model.wasPropertyExplicitlySet("workloadNetworkCidr")) {
                this.workloadNetworkCidr(model.getWorkloadNetworkCidr());
            }
            if (model.wasPropertyExplicitlySet("initialHostShapeName")) {
                this.initialHostShapeName(model.getInitialHostShapeName());
            }
            if (model.wasPropertyExplicitlySet("initialHostOcpuCount")) {
                this.initialHostOcpuCount(model.getInitialHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("isShieldedInstanceEnabled")) {
                this.isShieldedInstanceEnabled(model.getIsShieldedInstanceEnabled());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("datastores")) {
                this.datastores(model.getDatastores());
            }
            if (model.wasPropertyExplicitlySet("datastoreClusterIds")) {
                this.datastoreClusterIds(model.getDatastoreClusterIds());
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

    /** vSphere Cluster types. */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereType")
    private final VsphereTypes vsphereType;

    /**
     * vSphere Cluster types.
     *
     * @return the value
     */
    public VsphereTypes getVsphereType() {
        return vsphereType;
    }

    /**
     * The availability domain to create the Cluster's ESXi hosts in. For multi-AD Cluster
     * deployment, set to {@code multi-AD}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    /**
     * The availability domain to create the Cluster's ESXi hosts in. For multi-AD Cluster
     * deployment, set to {@code multi-AD}.
     *
     * @return the value
     */
    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * A descriptive name for the Cluster. Cluster name requirements are 1-22 character length
     * limit, Must start with a letter, Must be English letters, numbers, - only, No repeating
     * hyphens, Must be unique within the region. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the Cluster. Cluster name requirements are 1-22 character length
     * limit, Must start with a letter, Must be English letters, numbers, - only, No repeating
     * hyphens, Must be unique within the region. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the Cluster. If this
     * isn't set, the Cluster's {@code displayName} is used as the prefix.
     *
     * <p>For example, if the value is {@code myCluster}, the ESXi hosts are named {@code
     * myCluster-1}, {@code myCluster-2}, and so on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
    private final String instanceDisplayNamePrefix;

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the Cluster. If this
     * isn't set, the Cluster's {@code displayName} is used as the prefix.
     *
     * <p>For example, if the value is {@code myCluster}, the ESXi hosts are named {@code
     * myCluster-1}, {@code myCluster-2}, and so on.
     *
     * @return the value
     */
    public String getInstanceDisplayNamePrefix() {
        return instanceDisplayNamePrefix;
    }

    /**
     * The number of ESXi hosts to create in the Cluster. You can add more hosts later (see {@link
     * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}). Creating a Cluster with a ESXi host
     * count of 1 will be considered a single ESXi host Cluster.
     *
     * <p>*Note:** If you later delete EXSi hosts from a production Cluster to total less than 3,
     * you are still billed for the 3 minimum recommended ESXi hosts. Also, you cannot add more
     * VMware workloads to the Cluster until it again has at least 3 ESXi hosts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    private final Integer esxiHostsCount;

    /**
     * The number of ESXi hosts to create in the Cluster. You can add more hosts later (see {@link
     * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}). Creating a Cluster with a ESXi host
     * count of 1 will be considered a single ESXi host Cluster.
     *
     * <p>*Note:** If you later delete EXSi hosts from a production Cluster to total less than 3,
     * you are still billed for the 3 minimum recommended ESXi hosts. Also, you cannot add more
     * VMware workloads to the Cluster until it again has at least 3 ESXi hosts.
     *
     * @return the value
     */
    public Integer getEsxiHostsCount() {
        return esxiHostsCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * The billing option selected during Cluster creation. {@link
     * #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialCommitment")
    private final Commitment initialCommitment;

    /**
     * The billing option selected during Cluster creation. {@link
     * #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     * @return the value
     */
    public Commitment getInitialCommitment() {
        return initialCommitment;
    }

    /**
     * The CIDR block for the IP addresses that VMware VMs in the Cluster use to run application
     * workloads.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
    private final String workloadNetworkCidr;

    /**
     * The CIDR block for the IP addresses that VMware VMs in the Cluster use to run application
     * workloads.
     *
     * @return the value
     */
    public String getWorkloadNetworkCidr() {
        return workloadNetworkCidr;
    }

    /**
     * The initial compute shape of the Cluster's ESXi hosts. {@link
     * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
    private final String initialHostShapeName;

    /**
     * The initial compute shape of the Cluster's ESXi hosts. {@link
     * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     * @return the value
     */
    public String getInitialHostShapeName() {
        return initialHostShapeName;
    }

    /** The initial OCPU count of the Cluster's ESXi hosts. */
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
    private final Float initialHostOcpuCount;

    /**
     * The initial OCPU count of the Cluster's ESXi hosts.
     *
     * @return the value
     */
    public Float getInitialHostOcpuCount() {
        return initialHostOcpuCount;
    }

    /** Indicates whether shielded instance is enabled for this Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
    private final Boolean isShieldedInstanceEnabled;

    /**
     * Indicates whether shielded instance is enabled for this Cluster.
     *
     * @return the value
     */
    public Boolean getIsShieldedInstanceEnabled() {
        return isShieldedInstanceEnabled;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Capacity Reservation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Capacity Reservation.
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * A list of datastore info for the Cluster. This value is required only when {@code
     * initialHostShapeName} is a standard shape.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datastores")
    private final java.util.List<DatastoreInfo> datastores;

    /**
     * A list of datastore info for the Cluster. This value is required only when {@code
     * initialHostShapeName} is a standard shape.
     *
     * @return the value
     */
    public java.util.List<DatastoreInfo> getDatastores() {
        return datastores;
    }

    /** A list of datastore clusters. */
    @com.fasterxml.jackson.annotation.JsonProperty("datastoreClusterIds")
    private final java.util.List<String> datastoreClusterIds;

    /**
     * A list of datastore clusters.
     *
     * @return the value
     */
    public java.util.List<String> getDatastoreClusterIds() {
        return datastoreClusterIds;
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
        sb.append("InitialClusterConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("vsphereType=").append(String.valueOf(this.vsphereType));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", instanceDisplayNamePrefix=")
                .append(String.valueOf(this.instanceDisplayNamePrefix));
        sb.append(", esxiHostsCount=").append(String.valueOf(this.esxiHostsCount));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(", initialCommitment=").append(String.valueOf(this.initialCommitment));
        sb.append(", workloadNetworkCidr=").append(String.valueOf(this.workloadNetworkCidr));
        sb.append(", initialHostShapeName=").append(String.valueOf(this.initialHostShapeName));
        sb.append(", initialHostOcpuCount=").append(String.valueOf(this.initialHostOcpuCount));
        sb.append(", isShieldedInstanceEnabled=")
                .append(String.valueOf(this.isShieldedInstanceEnabled));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", datastores=").append(String.valueOf(this.datastores));
        sb.append(", datastoreClusterIds=").append(String.valueOf(this.datastoreClusterIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InitialClusterConfiguration)) {
            return false;
        }

        InitialClusterConfiguration other = (InitialClusterConfiguration) o;
        return java.util.Objects.equals(this.vsphereType, other.vsphereType)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.instanceDisplayNamePrefix, other.instanceDisplayNamePrefix)
                && java.util.Objects.equals(this.esxiHostsCount, other.esxiHostsCount)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && java.util.Objects.equals(this.initialCommitment, other.initialCommitment)
                && java.util.Objects.equals(this.workloadNetworkCidr, other.workloadNetworkCidr)
                && java.util.Objects.equals(this.initialHostShapeName, other.initialHostShapeName)
                && java.util.Objects.equals(this.initialHostOcpuCount, other.initialHostOcpuCount)
                && java.util.Objects.equals(
                        this.isShieldedInstanceEnabled, other.isShieldedInstanceEnabled)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.datastores, other.datastores)
                && java.util.Objects.equals(this.datastoreClusterIds, other.datastoreClusterIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vsphereType == null ? 43 : this.vsphereType.hashCode());
        result =
                (result * PRIME)
                        + (this.computeAvailabilityDomain == null
                                ? 43
                                : this.computeAvailabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDisplayNamePrefix == null
                                ? 43
                                : this.instanceDisplayNamePrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiHostsCount == null ? 43 : this.esxiHostsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.initialCommitment == null ? 43 : this.initialCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.workloadNetworkCidr == null
                                ? 43
                                : this.workloadNetworkCidr.hashCode());
        result =
                (result * PRIME)
                        + (this.initialHostShapeName == null
                                ? 43
                                : this.initialHostShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.initialHostOcpuCount == null
                                ? 43
                                : this.initialHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isShieldedInstanceEnabled == null
                                ? 43
                                : this.isShieldedInstanceEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result = (result * PRIME) + (this.datastores == null ? 43 : this.datastores.hashCode());
        result =
                (result * PRIME)
                        + (this.datastoreClusterIds == null
                                ? 43
                                : this.datastoreClusterIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
