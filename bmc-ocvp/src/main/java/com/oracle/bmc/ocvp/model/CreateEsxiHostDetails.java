/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Details of the ESXi host to add to the Cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateEsxiHostDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateEsxiHostDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterId",
        "displayName",
        "billingDonorHostId",
        "currentCommitment",
        "nextCommitment",
        "computeAvailabilityDomain",
        "hostShapeName",
        "hostOcpuCount",
        "capacityReservationId",
        "esxiSoftwareVersion",
        "freeformTags",
        "definedTags"
    })
    public CreateEsxiHostDetails(
            String clusterId,
            String displayName,
            String billingDonorHostId,
            Commitment currentCommitment,
            Commitment nextCommitment,
            String computeAvailabilityDomain,
            String hostShapeName,
            Float hostOcpuCount,
            String capacityReservationId,
            String esxiSoftwareVersion,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.clusterId = clusterId;
        this.displayName = displayName;
        this.billingDonorHostId = billingDonorHostId;
        this.currentCommitment = currentCommitment;
        this.nextCommitment = nextCommitment;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.hostShapeName = hostShapeName;
        this.hostOcpuCount = hostOcpuCount;
        this.capacityReservationId = capacityReservationId;
        this.esxiSoftwareVersion = esxiSoftwareVersion;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Cluster to add the ESXi host to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Cluster to add the ESXi host to.
         *
         * @param clusterId the value to set
         * @return this builder
         **/
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /**
         * A descriptive name for the ESXi host. It's changeable.
         * Esxi Host name requirements are 1-16 character length limit, Must start with a letter,
         * Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the Cluster.
         * <p>
         * If this attribute is not specified, the Cluster's {@code instanceDisplayNamePrefix} attribute is used
         * to name and incrementally number the ESXi host. For example, if you're creating the fourth
         * ESXi host in the Cluster, and {@code instanceDisplayNamePrefix} is {@code MyCluster}, the host's display
         * name is {@code MyCluster-4}.
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the ESXi host. It's changeable.
         * Esxi Host name requirements are 1-16 character length limit, Must start with a letter,
         * Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the Cluster.
         * <p>
         * If this attribute is not specified, the Cluster's {@code instanceDisplayNamePrefix} attribute is used
         * to name and incrementally number the ESXi host. For example, if you're creating the fourth
         * ESXi host in the Cluster, and {@code instanceDisplayNamePrefix} is {@code MyCluster}, the host's display
         * name is {@code MyCluster-4}.
         * <p>
         * Avoid entering confidential information.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deleted ESXi Host with LeftOver billing cycle.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingDonorHostId")
        private String billingDonorHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deleted ESXi Host with LeftOver billing cycle.
         *
         * @param billingDonorHostId the value to set
         * @return this builder
         **/
        public Builder billingDonorHostId(String billingDonorHostId) {
            this.billingDonorHostId = billingDonorHostId;
            this.__explicitlySet__.add("billingDonorHostId");
            return this;
        }
        /**
         * The billing option currently used by the ESXi host.
         * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentCommitment")
        private Commitment currentCommitment;

        /**
         * The billing option currently used by the ESXi host.
         * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         * @param currentCommitment the value to set
         * @return this builder
         **/
        public Builder currentCommitment(Commitment currentCommitment) {
            this.currentCommitment = currentCommitment;
            this.__explicitlySet__.add("currentCommitment");
            return this;
        }
        /**
         * The billing option to switch to after the existing billing cycle ends.
         * If {@code nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing cycle.
         * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nextCommitment")
        private Commitment nextCommitment;

        /**
         * The billing option to switch to after the existing billing cycle ends.
         * If {@code nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing cycle.
         * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         * @param nextCommitment the value to set
         * @return this builder
         **/
        public Builder nextCommitment(Commitment nextCommitment) {
            this.nextCommitment = nextCommitment;
            this.__explicitlySet__.add("nextCommitment");
            return this;
        }
        /**
         * The availability domain to create the ESXi host in.
         * If keep empty, for AD-specific Cluster, new ESXi host will be created in the same availability domain;
         * for multi-AD Cluster, new ESXi host will be auto assigned to the next availability domain following evenly distribution strategy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        /**
         * The availability domain to create the ESXi host in.
         * If keep empty, for AD-specific Cluster, new ESXi host will be created in the same availability domain;
         * for multi-AD Cluster, new ESXi host will be auto assigned to the next availability domain following evenly distribution strategy.
         *
         * @param computeAvailabilityDomain the value to set
         * @return this builder
         **/
        public Builder computeAvailabilityDomain(String computeAvailabilityDomain) {
            this.computeAvailabilityDomain = computeAvailabilityDomain;
            this.__explicitlySet__.add("computeAvailabilityDomain");
            return this;
        }
        /**
         * The compute shape name of the ESXi host.
         * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostShapeName")
        private String hostShapeName;

        /**
         * The compute shape name of the ESXi host.
         * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         *
         * @param hostShapeName the value to set
         * @return this builder
         **/
        public Builder hostShapeName(String hostShapeName) {
            this.hostShapeName = hostShapeName;
            this.__explicitlySet__.add("hostShapeName");
            return this;
        }
        /**
         * The OCPU count of the ESXi host.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuCount")
        private Float hostOcpuCount;

        /**
         * The OCPU count of the ESXi host.
         *
         * @param hostOcpuCount the value to set
         * @return this builder
         **/
        public Builder hostOcpuCount(Float hostOcpuCount) {
            this.hostOcpuCount = hostOcpuCount;
            this.__explicitlySet__.add("hostOcpuCount");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
         *
         * @param capacityReservationId the value to set
         * @return this builder
         **/
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /**
         * The ESXi software bundle to install on the ESXi host.
         * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
         * To get a list of the available versions, use
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
        private String esxiSoftwareVersion;

        /**
         * The ESXi software bundle to install on the ESXi host.
         * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
         * To get a list of the available versions, use
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
         *
         * @param esxiSoftwareVersion the value to set
         * @return this builder
         **/
        public Builder esxiSoftwareVersion(String esxiSoftwareVersion) {
            this.esxiSoftwareVersion = esxiSoftwareVersion;
            this.__explicitlySet__.add("esxiSoftwareVersion");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateEsxiHostDetails build() {
            CreateEsxiHostDetails model =
                    new CreateEsxiHostDetails(
                            this.clusterId,
                            this.displayName,
                            this.billingDonorHostId,
                            this.currentCommitment,
                            this.nextCommitment,
                            this.computeAvailabilityDomain,
                            this.hostShapeName,
                            this.hostOcpuCount,
                            this.capacityReservationId,
                            this.esxiSoftwareVersion,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEsxiHostDetails model) {
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("billingDonorHostId")) {
                this.billingDonorHostId(model.getBillingDonorHostId());
            }
            if (model.wasPropertyExplicitlySet("currentCommitment")) {
                this.currentCommitment(model.getCurrentCommitment());
            }
            if (model.wasPropertyExplicitlySet("nextCommitment")) {
                this.nextCommitment(model.getNextCommitment());
            }
            if (model.wasPropertyExplicitlySet("computeAvailabilityDomain")) {
                this.computeAvailabilityDomain(model.getComputeAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("hostShapeName")) {
                this.hostShapeName(model.getHostShapeName());
            }
            if (model.wasPropertyExplicitlySet("hostOcpuCount")) {
                this.hostOcpuCount(model.getHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("esxiSoftwareVersion")) {
                this.esxiSoftwareVersion(model.getEsxiSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Cluster to add the ESXi host to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Cluster to add the ESXi host to.
     *
     * @return the value
     **/
    public String getClusterId() {
        return clusterId;
    }

    /**
     * A descriptive name for the ESXi host. It's changeable.
     * Esxi Host name requirements are 1-16 character length limit, Must start with a letter,
     * Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the Cluster.
     * <p>
     * If this attribute is not specified, the Cluster's {@code instanceDisplayNamePrefix} attribute is used
     * to name and incrementally number the ESXi host. For example, if you're creating the fourth
     * ESXi host in the Cluster, and {@code instanceDisplayNamePrefix} is {@code MyCluster}, the host's display
     * name is {@code MyCluster-4}.
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the ESXi host. It's changeable.
     * Esxi Host name requirements are 1-16 character length limit, Must start with a letter,
     * Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the Cluster.
     * <p>
     * If this attribute is not specified, the Cluster's {@code instanceDisplayNamePrefix} attribute is used
     * to name and incrementally number the ESXi host. For example, if you're creating the fourth
     * ESXi host in the Cluster, and {@code instanceDisplayNamePrefix} is {@code MyCluster}, the host's display
     * name is {@code MyCluster-4}.
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deleted ESXi Host with LeftOver billing cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingDonorHostId")
    private final String billingDonorHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deleted ESXi Host with LeftOver billing cycle.
     *
     * @return the value
     **/
    public String getBillingDonorHostId() {
        return billingDonorHostId;
    }

    /**
     * The billing option currently used by the ESXi host.
     * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentCommitment")
    private final Commitment currentCommitment;

    /**
     * The billing option currently used by the ESXi host.
     * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     * @return the value
     **/
    public Commitment getCurrentCommitment() {
        return currentCommitment;
    }

    /**
     * The billing option to switch to after the existing billing cycle ends.
     * If {@code nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing cycle.
     * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextCommitment")
    private final Commitment nextCommitment;

    /**
     * The billing option to switch to after the existing billing cycle ends.
     * If {@code nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing cycle.
     * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     * @return the value
     **/
    public Commitment getNextCommitment() {
        return nextCommitment;
    }

    /**
     * The availability domain to create the ESXi host in.
     * If keep empty, for AD-specific Cluster, new ESXi host will be created in the same availability domain;
     * for multi-AD Cluster, new ESXi host will be auto assigned to the next availability domain following evenly distribution strategy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    /**
     * The availability domain to create the ESXi host in.
     * If keep empty, for AD-specific Cluster, new ESXi host will be created in the same availability domain;
     * for multi-AD Cluster, new ESXi host will be auto assigned to the next availability domain following evenly distribution strategy.
     *
     * @return the value
     **/
    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * The compute shape name of the ESXi host.
     * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostShapeName")
    private final String hostShapeName;

    /**
     * The compute shape name of the ESXi host.
     * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     * @return the value
     **/
    public String getHostShapeName() {
        return hostShapeName;
    }

    /**
     * The OCPU count of the ESXi host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuCount")
    private final Float hostOcpuCount;

    /**
     * The OCPU count of the ESXi host.
     *
     * @return the value
     **/
    public Float getHostOcpuCount() {
        return hostOcpuCount;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
     *
     * @return the value
     **/
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * The ESXi software bundle to install on the ESXi host.
     * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
     * To get a list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
    private final String esxiSoftwareVersion;

    /**
     * The ESXi software bundle to install on the ESXi host.
     * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
     * To get a list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     * @return the value
     **/
    public String getEsxiSoftwareVersion() {
        return esxiSoftwareVersion;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateEsxiHostDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", billingDonorHostId=").append(String.valueOf(this.billingDonorHostId));
        sb.append(", currentCommitment=").append(String.valueOf(this.currentCommitment));
        sb.append(", nextCommitment=").append(String.valueOf(this.nextCommitment));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", hostShapeName=").append(String.valueOf(this.hostShapeName));
        sb.append(", hostOcpuCount=").append(String.valueOf(this.hostOcpuCount));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", esxiSoftwareVersion=").append(String.valueOf(this.esxiSoftwareVersion));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateEsxiHostDetails)) {
            return false;
        }

        CreateEsxiHostDetails other = (CreateEsxiHostDetails) o;
        return java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.billingDonorHostId, other.billingDonorHostId)
                && java.util.Objects.equals(this.currentCommitment, other.currentCommitment)
                && java.util.Objects.equals(this.nextCommitment, other.nextCommitment)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.hostShapeName, other.hostShapeName)
                && java.util.Objects.equals(this.hostOcpuCount, other.hostOcpuCount)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.esxiSoftwareVersion, other.esxiSoftwareVersion)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.billingDonorHostId == null
                                ? 43
                                : this.billingDonorHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.currentCommitment == null ? 43 : this.currentCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.nextCommitment == null ? 43 : this.nextCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.computeAvailabilityDomain == null
                                ? 43
                                : this.computeAvailabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.hostShapeName == null ? 43 : this.hostShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.hostOcpuCount == null ? 43 : this.hostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiSoftwareVersion == null
                                ? 43
                                : this.esxiSoftwareVersion.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
