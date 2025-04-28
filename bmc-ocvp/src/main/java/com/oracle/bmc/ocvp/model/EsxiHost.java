/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * An ESXi host is a node in a Cluster. At a minimum, each Cluster has 3 ESXi hosts that are used to
 * implement a functioning VMware environment.
 *
 * <p>In terms of implementation, an ESXi host is a Compute instance that is configured with the
 * chosen bundle of VMware software.
 *
 * <p>Notice that an {@code EsxiHost} object has its own OCID ({@code id}), and a separate attribute
 * for the OCID of the Compute instance ({@code computeInstanceId}). <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EsxiHost.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EsxiHost extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "sddcId",
        "clusterId",
        "compartmentId",
        "computeInstanceId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "billingDonorHostId",
        "swapBillingHostId",
        "isBillingContinuationInProgress",
        "isBillingSwappingInProgress",
        "currentCommitment",
        "nextCommitment",
        "billingContractEndDate",
        "failedEsxiHostId",
        "replacementEsxiHostId",
        "gracePeriodEndDate",
        "vmwareSoftwareVersion",
        "esxiSoftwareVersion",
        "nonUpgradedEsxiHostId",
        "upgradedReplacementEsxiHostId",
        "computeAvailabilityDomain",
        "hostShapeName",
        "hostOcpuCount",
        "capacityReservationId",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public EsxiHost(
            String id,
            String displayName,
            String sddcId,
            String clusterId,
            String compartmentId,
            String computeInstanceId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleStates lifecycleState,
            String billingDonorHostId,
            String swapBillingHostId,
            Boolean isBillingContinuationInProgress,
            Boolean isBillingSwappingInProgress,
            Commitment currentCommitment,
            Commitment nextCommitment,
            java.util.Date billingContractEndDate,
            String failedEsxiHostId,
            String replacementEsxiHostId,
            java.util.Date gracePeriodEndDate,
            String vmwareSoftwareVersion,
            String esxiSoftwareVersion,
            String nonUpgradedEsxiHostId,
            String upgradedReplacementEsxiHostId,
            String computeAvailabilityDomain,
            String hostShapeName,
            Float hostOcpuCount,
            String capacityReservationId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.sddcId = sddcId;
        this.clusterId = clusterId;
        this.compartmentId = compartmentId;
        this.computeInstanceId = computeInstanceId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.billingDonorHostId = billingDonorHostId;
        this.swapBillingHostId = swapBillingHostId;
        this.isBillingContinuationInProgress = isBillingContinuationInProgress;
        this.isBillingSwappingInProgress = isBillingSwappingInProgress;
        this.currentCommitment = currentCommitment;
        this.nextCommitment = nextCommitment;
        this.billingContractEndDate = billingContractEndDate;
        this.failedEsxiHostId = failedEsxiHostId;
        this.replacementEsxiHostId = replacementEsxiHostId;
        this.gracePeriodEndDate = gracePeriodEndDate;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.esxiSoftwareVersion = esxiSoftwareVersion;
        this.nonUpgradedEsxiHostId = nonUpgradedEsxiHostId;
        this.upgradedReplacementEsxiHostId = upgradedReplacementEsxiHostId;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.hostShapeName = hostShapeName;
        this.hostOcpuCount = hostOcpuCount;
        this.capacityReservationId = capacityReservationId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A descriptive name for the ESXi host. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the ESXi host. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * SDDC that the ESXi host belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
        private String sddcId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * SDDC that the ESXi host belongs to.
         *
         * @param sddcId the value to set
         * @return this builder
         */
        public Builder sddcId(String sddcId) {
            this.sddcId = sddcId;
            this.__explicitlySet__.add("sddcId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Cluster that the ESXi host belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Cluster that the ESXi host belongs to.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Cluster.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * In terms of implementation, an ESXi host is a Compute instance that is configured with
         * the chosen bundle of VMware software. The {@code computeInstanceId} is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that
         * Compute instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceId")
        private String computeInstanceId;

        /**
         * In terms of implementation, an ESXi host is a Compute instance that is configured with
         * the chosen bundle of VMware software. The {@code computeInstanceId} is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that
         * Compute instance.
         *
         * @param computeInstanceId the value to set
         * @return this builder
         */
        public Builder computeInstanceId(String computeInstanceId) {
            this.computeInstanceId = computeInstanceId;
            this.__explicitlySet__.add("computeInstanceId");
            return this;
        }
        /**
         * The date and time the ESXi host was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the ESXi host was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the ESXi host was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the ESXi host was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the ESXi host. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of the ESXi host.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deleted ESXi Host with LeftOver billing cycle.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("billingDonorHostId")
        private String billingDonorHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deleted ESXi Host with LeftOver billing cycle.
         *
         * @param billingDonorHostId the value to set
         * @return this builder
         */
        public Builder billingDonorHostId(String billingDonorHostId) {
            this.billingDonorHostId = billingDonorHostId;
            this.__explicitlySet__.add("billingDonorHostId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * active ESXi Host to swap billing with current host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("swapBillingHostId")
        private String swapBillingHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * active ESXi Host to swap billing with current host.
         *
         * @param swapBillingHostId the value to set
         * @return this builder
         */
        public Builder swapBillingHostId(String swapBillingHostId) {
            this.swapBillingHostId = swapBillingHostId;
            this.__explicitlySet__.add("swapBillingHostId");
            return this;
        }
        /** Indicates whether this host is in the progress of billing continuation. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBillingContinuationInProgress")
        private Boolean isBillingContinuationInProgress;

        /**
         * Indicates whether this host is in the progress of billing continuation.
         *
         * @param isBillingContinuationInProgress the value to set
         * @return this builder
         */
        public Builder isBillingContinuationInProgress(Boolean isBillingContinuationInProgress) {
            this.isBillingContinuationInProgress = isBillingContinuationInProgress;
            this.__explicitlySet__.add("isBillingContinuationInProgress");
            return this;
        }
        /** Indicates whether this host is in the progress of swapping billing. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBillingSwappingInProgress")
        private Boolean isBillingSwappingInProgress;

        /**
         * Indicates whether this host is in the progress of swapping billing.
         *
         * @param isBillingSwappingInProgress the value to set
         * @return this builder
         */
        public Builder isBillingSwappingInProgress(Boolean isBillingSwappingInProgress) {
            this.isBillingSwappingInProgress = isBillingSwappingInProgress;
            this.__explicitlySet__.add("isBillingSwappingInProgress");
            return this;
        }
        /**
         * The billing option currently used by the ESXi host. {@link
         * #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentCommitment")
        private Commitment currentCommitment;

        /**
         * The billing option currently used by the ESXi host. {@link
         * #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         * @param currentCommitment the value to set
         * @return this builder
         */
        public Builder currentCommitment(Commitment currentCommitment) {
            this.currentCommitment = currentCommitment;
            this.__explicitlySet__.add("currentCommitment");
            return this;
        }
        /**
         * The billing option to switch to after the current billing cycle ends. If {@code
         * nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing
         * cycle. {@link #listSupportedCommitments(ListSupportedCommitmentsRequest)
         * listSupportedCommitments}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextCommitment")
        private Commitment nextCommitment;

        /**
         * The billing option to switch to after the current billing cycle ends. If {@code
         * nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing
         * cycle. {@link #listSupportedCommitments(ListSupportedCommitmentsRequest)
         * listSupportedCommitments}.
         *
         * @param nextCommitment the value to set
         * @return this builder
         */
        public Builder nextCommitment(Commitment nextCommitment) {
            this.nextCommitment = nextCommitment;
            this.__explicitlySet__.add("nextCommitment");
            return this;
        }
        /**
         * Current billing cycle end date. If the value in {@code currentCommitment} and {@code
         * nextCommitment} are different, the value specified in {@code nextCommitment} becomes the
         * new {@code currentCommitment} when the {@code contractEndDate} is reached. Example:
         * {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("billingContractEndDate")
        private java.util.Date billingContractEndDate;

        /**
         * Current billing cycle end date. If the value in {@code currentCommitment} and {@code
         * nextCommitment} are different, the value specified in {@code nextCommitment} becomes the
         * new {@code currentCommitment} when the {@code contractEndDate} is reached. Example:
         * {@code 2016-08-25T21:10:29.600Z}
         *
         * @param billingContractEndDate the value to set
         * @return this builder
         */
        public Builder billingContractEndDate(java.util.Date billingContractEndDate) {
            this.billingContractEndDate = billingContractEndDate;
            this.__explicitlySet__.add("billingContractEndDate");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that failed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("failedEsxiHostId")
        private String failedEsxiHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that failed.
         *
         * @param failedEsxiHostId the value to set
         * @return this builder
         */
        public Builder failedEsxiHostId(String failedEsxiHostId) {
            this.failedEsxiHostId = failedEsxiHostId;
            this.__explicitlySet__.add("failedEsxiHostId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that is created to replace the failed host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replacementEsxiHostId")
        private String replacementEsxiHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that is created to replace the failed host.
         *
         * @param replacementEsxiHostId the value to set
         * @return this builder
         */
        public Builder replacementEsxiHostId(String replacementEsxiHostId) {
            this.replacementEsxiHostId = replacementEsxiHostId;
            this.__explicitlySet__.add("replacementEsxiHostId");
            return this;
        }
        /**
         * The date and time when the new esxi host should start billing cycle.
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2021-07-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gracePeriodEndDate")
        private java.util.Date gracePeriodEndDate;

        /**
         * The date and time when the new esxi host should start billing cycle.
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2021-07-25T21:10:29.600Z}
         *
         * @param gracePeriodEndDate the value to set
         * @return this builder
         */
        public Builder gracePeriodEndDate(java.util.Date gracePeriodEndDate) {
            this.gracePeriodEndDate = gracePeriodEndDate;
            this.__explicitlySet__.add("gracePeriodEndDate");
            return this;
        }
        /**
         * The version of VMware software that Oracle Cloud VMware Solution installed on the ESXi
         * hosts.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        /**
         * The version of VMware software that Oracle Cloud VMware Solution installed on the ESXi
         * hosts.
         *
         * @param vmwareSoftwareVersion the value to set
         * @return this builder
         */
        public Builder vmwareSoftwareVersion(String vmwareSoftwareVersion) {
            this.vmwareSoftwareVersion = vmwareSoftwareVersion;
            this.__explicitlySet__.add("vmwareSoftwareVersion");
            return this;
        }
        /**
         * The version of ESXi software that Oracle Cloud VMware Solution installed on the ESXi
         * hosts.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
        private String esxiSoftwareVersion;

        /**
         * The version of ESXi software that Oracle Cloud VMware Solution installed on the ESXi
         * hosts.
         *
         * @param esxiSoftwareVersion the value to set
         * @return this builder
         */
        public Builder esxiSoftwareVersion(String esxiSoftwareVersion) {
            this.esxiSoftwareVersion = esxiSoftwareVersion;
            this.__explicitlySet__.add("esxiSoftwareVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that will be upgraded.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nonUpgradedEsxiHostId")
        private String nonUpgradedEsxiHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that will be upgraded.
         *
         * @param nonUpgradedEsxiHostId the value to set
         * @return this builder
         */
        public Builder nonUpgradedEsxiHostId(String nonUpgradedEsxiHostId) {
            this.nonUpgradedEsxiHostId = nonUpgradedEsxiHostId;
            this.__explicitlySet__.add("nonUpgradedEsxiHostId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that is newly created to upgrade the original host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("upgradedReplacementEsxiHostId")
        private String upgradedReplacementEsxiHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that is newly created to upgrade the original host.
         *
         * @param upgradedReplacementEsxiHostId the value to set
         * @return this builder
         */
        public Builder upgradedReplacementEsxiHostId(String upgradedReplacementEsxiHostId) {
            this.upgradedReplacementEsxiHostId = upgradedReplacementEsxiHostId;
            this.__explicitlySet__.add("upgradedReplacementEsxiHostId");
            return this;
        }
        /** The availability domain of the ESXi host. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        /**
         * The availability domain of the ESXi host.
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
         * The compute shape name of the ESXi host. {@link
         * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostShapeName")
        private String hostShapeName;

        /**
         * The compute shape name of the ESXi host. {@link
         * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         *
         * @param hostShapeName the value to set
         * @return this builder
         */
        public Builder hostShapeName(String hostShapeName) {
            this.hostShapeName = hostShapeName;
            this.__explicitlySet__.add("hostShapeName");
            return this;
        }
        /** The OCPU count of the ESXi host. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuCount")
        private Float hostOcpuCount;

        /**
         * The OCPU count of the ESXi host.
         *
         * @param hostOcpuCount the value to set
         * @return this builder
         */
        public Builder hostOcpuCount(Float hostOcpuCount) {
            this.hostOcpuCount = hostOcpuCount;
            this.__explicitlySet__.add("hostOcpuCount");
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
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EsxiHost build() {
            EsxiHost model =
                    new EsxiHost(
                            this.id,
                            this.displayName,
                            this.sddcId,
                            this.clusterId,
                            this.compartmentId,
                            this.computeInstanceId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.billingDonorHostId,
                            this.swapBillingHostId,
                            this.isBillingContinuationInProgress,
                            this.isBillingSwappingInProgress,
                            this.currentCommitment,
                            this.nextCommitment,
                            this.billingContractEndDate,
                            this.failedEsxiHostId,
                            this.replacementEsxiHostId,
                            this.gracePeriodEndDate,
                            this.vmwareSoftwareVersion,
                            this.esxiSoftwareVersion,
                            this.nonUpgradedEsxiHostId,
                            this.upgradedReplacementEsxiHostId,
                            this.computeAvailabilityDomain,
                            this.hostShapeName,
                            this.hostOcpuCount,
                            this.capacityReservationId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EsxiHost model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sddcId")) {
                this.sddcId(model.getSddcId());
            }
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("computeInstanceId")) {
                this.computeInstanceId(model.getComputeInstanceId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("billingDonorHostId")) {
                this.billingDonorHostId(model.getBillingDonorHostId());
            }
            if (model.wasPropertyExplicitlySet("swapBillingHostId")) {
                this.swapBillingHostId(model.getSwapBillingHostId());
            }
            if (model.wasPropertyExplicitlySet("isBillingContinuationInProgress")) {
                this.isBillingContinuationInProgress(model.getIsBillingContinuationInProgress());
            }
            if (model.wasPropertyExplicitlySet("isBillingSwappingInProgress")) {
                this.isBillingSwappingInProgress(model.getIsBillingSwappingInProgress());
            }
            if (model.wasPropertyExplicitlySet("currentCommitment")) {
                this.currentCommitment(model.getCurrentCommitment());
            }
            if (model.wasPropertyExplicitlySet("nextCommitment")) {
                this.nextCommitment(model.getNextCommitment());
            }
            if (model.wasPropertyExplicitlySet("billingContractEndDate")) {
                this.billingContractEndDate(model.getBillingContractEndDate());
            }
            if (model.wasPropertyExplicitlySet("failedEsxiHostId")) {
                this.failedEsxiHostId(model.getFailedEsxiHostId());
            }
            if (model.wasPropertyExplicitlySet("replacementEsxiHostId")) {
                this.replacementEsxiHostId(model.getReplacementEsxiHostId());
            }
            if (model.wasPropertyExplicitlySet("gracePeriodEndDate")) {
                this.gracePeriodEndDate(model.getGracePeriodEndDate());
            }
            if (model.wasPropertyExplicitlySet("vmwareSoftwareVersion")) {
                this.vmwareSoftwareVersion(model.getVmwareSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("esxiSoftwareVersion")) {
                this.esxiSoftwareVersion(model.getEsxiSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("nonUpgradedEsxiHostId")) {
                this.nonUpgradedEsxiHostId(model.getNonUpgradedEsxiHostId());
            }
            if (model.wasPropertyExplicitlySet("upgradedReplacementEsxiHostId")) {
                this.upgradedReplacementEsxiHostId(model.getUpgradedReplacementEsxiHostId());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A descriptive name for the ESXi host. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the ESXi host. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC
     * that the ESXi host belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
    private final String sddcId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC
     * that the ESXi host belongs to.
     *
     * @return the value
     */
    public String getSddcId() {
        return sddcId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Cluster that the ESXi host belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Cluster that the ESXi host belongs to.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Cluster.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * In terms of implementation, an ESXi host is a Compute instance that is configured with the
     * chosen bundle of VMware software. The {@code computeInstanceId} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that Compute
     * instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceId")
    private final String computeInstanceId;

    /**
     * In terms of implementation, an ESXi host is a Compute instance that is configured with the
     * chosen bundle of VMware software. The {@code computeInstanceId} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that Compute
     * instance.
     *
     * @return the value
     */
    public String getComputeInstanceId() {
        return computeInstanceId;
    }

    /**
     * The date and time the ESXi host was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the ESXi host was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the ESXi host was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the ESXi host was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the ESXi host. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of the ESXi host.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deleted ESXi Host with LeftOver billing cycle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billingDonorHostId")
    private final String billingDonorHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deleted ESXi Host with LeftOver billing cycle.
     *
     * @return the value
     */
    public String getBillingDonorHostId() {
        return billingDonorHostId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * active ESXi Host to swap billing with current host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("swapBillingHostId")
    private final String swapBillingHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * active ESXi Host to swap billing with current host.
     *
     * @return the value
     */
    public String getSwapBillingHostId() {
        return swapBillingHostId;
    }

    /** Indicates whether this host is in the progress of billing continuation. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBillingContinuationInProgress")
    private final Boolean isBillingContinuationInProgress;

    /**
     * Indicates whether this host is in the progress of billing continuation.
     *
     * @return the value
     */
    public Boolean getIsBillingContinuationInProgress() {
        return isBillingContinuationInProgress;
    }

    /** Indicates whether this host is in the progress of swapping billing. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBillingSwappingInProgress")
    private final Boolean isBillingSwappingInProgress;

    /**
     * Indicates whether this host is in the progress of swapping billing.
     *
     * @return the value
     */
    public Boolean getIsBillingSwappingInProgress() {
        return isBillingSwappingInProgress;
    }

    /**
     * The billing option currently used by the ESXi host. {@link
     * #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentCommitment")
    private final Commitment currentCommitment;

    /**
     * The billing option currently used by the ESXi host. {@link
     * #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     * @return the value
     */
    public Commitment getCurrentCommitment() {
        return currentCommitment;
    }

    /**
     * The billing option to switch to after the current billing cycle ends. If {@code
     * nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing
     * cycle. {@link #listSupportedCommitments(ListSupportedCommitmentsRequest)
     * listSupportedCommitments}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextCommitment")
    private final Commitment nextCommitment;

    /**
     * The billing option to switch to after the current billing cycle ends. If {@code
     * nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing
     * cycle. {@link #listSupportedCommitments(ListSupportedCommitmentsRequest)
     * listSupportedCommitments}.
     *
     * @return the value
     */
    public Commitment getNextCommitment() {
        return nextCommitment;
    }

    /**
     * Current billing cycle end date. If the value in {@code currentCommitment} and {@code
     * nextCommitment} are different, the value specified in {@code nextCommitment} becomes the new
     * {@code currentCommitment} when the {@code contractEndDate} is reached. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billingContractEndDate")
    private final java.util.Date billingContractEndDate;

    /**
     * Current billing cycle end date. If the value in {@code currentCommitment} and {@code
     * nextCommitment} are different, the value specified in {@code nextCommitment} becomes the new
     * {@code currentCommitment} when the {@code contractEndDate} is reached. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getBillingContractEndDate() {
        return billingContractEndDate;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host that failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failedEsxiHostId")
    private final String failedEsxiHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host that failed.
     *
     * @return the value
     */
    public String getFailedEsxiHostId() {
        return failedEsxiHostId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host that is created to replace the failed host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replacementEsxiHostId")
    private final String replacementEsxiHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host that is created to replace the failed host.
     *
     * @return the value
     */
    public String getReplacementEsxiHostId() {
        return replacementEsxiHostId;
    }

    /**
     * The date and time when the new esxi host should start billing cycle.
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2021-07-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gracePeriodEndDate")
    private final java.util.Date gracePeriodEndDate;

    /**
     * The date and time when the new esxi host should start billing cycle.
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2021-07-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getGracePeriodEndDate() {
        return gracePeriodEndDate;
    }

    /**
     * The version of VMware software that Oracle Cloud VMware Solution installed on the ESXi hosts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    private final String vmwareSoftwareVersion;

    /**
     * The version of VMware software that Oracle Cloud VMware Solution installed on the ESXi hosts.
     *
     * @return the value
     */
    public String getVmwareSoftwareVersion() {
        return vmwareSoftwareVersion;
    }

    /**
     * The version of ESXi software that Oracle Cloud VMware Solution installed on the ESXi hosts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
    private final String esxiSoftwareVersion;

    /**
     * The version of ESXi software that Oracle Cloud VMware Solution installed on the ESXi hosts.
     *
     * @return the value
     */
    public String getEsxiSoftwareVersion() {
        return esxiSoftwareVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host that will be upgraded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonUpgradedEsxiHostId")
    private final String nonUpgradedEsxiHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host that will be upgraded.
     *
     * @return the value
     */
    public String getNonUpgradedEsxiHostId() {
        return nonUpgradedEsxiHostId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host that is newly created to upgrade the original host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upgradedReplacementEsxiHostId")
    private final String upgradedReplacementEsxiHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ESXi
     * host that is newly created to upgrade the original host.
     *
     * @return the value
     */
    public String getUpgradedReplacementEsxiHostId() {
        return upgradedReplacementEsxiHostId;
    }

    /** The availability domain of the ESXi host. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    /**
     * The availability domain of the ESXi host.
     *
     * @return the value
     */
    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * The compute shape name of the ESXi host. {@link
     * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostShapeName")
    private final String hostShapeName;

    /**
     * The compute shape name of the ESXi host. {@link
     * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     * @return the value
     */
    public String getHostShapeName() {
        return hostShapeName;
    }

    /** The OCPU count of the ESXi host. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuCount")
    private final Float hostOcpuCount;

    /**
     * The OCPU count of the ESXi host.
     *
     * @return the value
     */
    public Float getHostOcpuCount() {
        return hostOcpuCount;
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
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("EsxiHost(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sddcId=").append(String.valueOf(this.sddcId));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", computeInstanceId=").append(String.valueOf(this.computeInstanceId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", billingDonorHostId=").append(String.valueOf(this.billingDonorHostId));
        sb.append(", swapBillingHostId=").append(String.valueOf(this.swapBillingHostId));
        sb.append(", isBillingContinuationInProgress=")
                .append(String.valueOf(this.isBillingContinuationInProgress));
        sb.append(", isBillingSwappingInProgress=")
                .append(String.valueOf(this.isBillingSwappingInProgress));
        sb.append(", currentCommitment=").append(String.valueOf(this.currentCommitment));
        sb.append(", nextCommitment=").append(String.valueOf(this.nextCommitment));
        sb.append(", billingContractEndDate=").append(String.valueOf(this.billingContractEndDate));
        sb.append(", failedEsxiHostId=").append(String.valueOf(this.failedEsxiHostId));
        sb.append(", replacementEsxiHostId=").append(String.valueOf(this.replacementEsxiHostId));
        sb.append(", gracePeriodEndDate=").append(String.valueOf(this.gracePeriodEndDate));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", esxiSoftwareVersion=").append(String.valueOf(this.esxiSoftwareVersion));
        sb.append(", nonUpgradedEsxiHostId=").append(String.valueOf(this.nonUpgradedEsxiHostId));
        sb.append(", upgradedReplacementEsxiHostId=")
                .append(String.valueOf(this.upgradedReplacementEsxiHostId));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", hostShapeName=").append(String.valueOf(this.hostShapeName));
        sb.append(", hostOcpuCount=").append(String.valueOf(this.hostOcpuCount));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EsxiHost)) {
            return false;
        }

        EsxiHost other = (EsxiHost) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sddcId, other.sddcId)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.computeInstanceId, other.computeInstanceId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.billingDonorHostId, other.billingDonorHostId)
                && java.util.Objects.equals(this.swapBillingHostId, other.swapBillingHostId)
                && java.util.Objects.equals(
                        this.isBillingContinuationInProgress, other.isBillingContinuationInProgress)
                && java.util.Objects.equals(
                        this.isBillingSwappingInProgress, other.isBillingSwappingInProgress)
                && java.util.Objects.equals(this.currentCommitment, other.currentCommitment)
                && java.util.Objects.equals(this.nextCommitment, other.nextCommitment)
                && java.util.Objects.equals(
                        this.billingContractEndDate, other.billingContractEndDate)
                && java.util.Objects.equals(this.failedEsxiHostId, other.failedEsxiHostId)
                && java.util.Objects.equals(this.replacementEsxiHostId, other.replacementEsxiHostId)
                && java.util.Objects.equals(this.gracePeriodEndDate, other.gracePeriodEndDate)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.esxiSoftwareVersion, other.esxiSoftwareVersion)
                && java.util.Objects.equals(this.nonUpgradedEsxiHostId, other.nonUpgradedEsxiHostId)
                && java.util.Objects.equals(
                        this.upgradedReplacementEsxiHostId, other.upgradedReplacementEsxiHostId)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.hostShapeName, other.hostShapeName)
                && java.util.Objects.equals(this.hostOcpuCount, other.hostOcpuCount)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sddcId == null ? 43 : this.sddcId.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeInstanceId == null ? 43 : this.computeInstanceId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.billingDonorHostId == null
                                ? 43
                                : this.billingDonorHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.swapBillingHostId == null ? 43 : this.swapBillingHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.isBillingContinuationInProgress == null
                                ? 43
                                : this.isBillingContinuationInProgress.hashCode());
        result =
                (result * PRIME)
                        + (this.isBillingSwappingInProgress == null
                                ? 43
                                : this.isBillingSwappingInProgress.hashCode());
        result =
                (result * PRIME)
                        + (this.currentCommitment == null ? 43 : this.currentCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.nextCommitment == null ? 43 : this.nextCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.billingContractEndDate == null
                                ? 43
                                : this.billingContractEndDate.hashCode());
        result =
                (result * PRIME)
                        + (this.failedEsxiHostId == null ? 43 : this.failedEsxiHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.replacementEsxiHostId == null
                                ? 43
                                : this.replacementEsxiHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.gracePeriodEndDate == null
                                ? 43
                                : this.gracePeriodEndDate.hashCode());
        result =
                (result * PRIME)
                        + (this.vmwareSoftwareVersion == null
                                ? 43
                                : this.vmwareSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiSoftwareVersion == null
                                ? 43
                                : this.esxiSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.nonUpgradedEsxiHostId == null
                                ? 43
                                : this.nonUpgradedEsxiHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradedReplacementEsxiHostId == null
                                ? 43
                                : this.upgradedReplacementEsxiHostId.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
