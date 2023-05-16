/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Details of the ESXi host to add to the SDDC. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateEsxiHostDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateEsxiHostDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sddcId",
        "displayName",
        "currentSku",
        "nextSku",
        "computeAvailabilityDomain",
        "failedEsxiHostId",
        "hostShapeName",
        "hostOcpuCount",
        "capacityReservationId",
        "nonUpgradedEsxiHostId",
        "freeformTags",
        "definedTags"
    })
    public CreateEsxiHostDetails(
            String sddcId,
            String displayName,
            Sku currentSku,
            Sku nextSku,
            String computeAvailabilityDomain,
            String failedEsxiHostId,
            String hostShapeName,
            Float hostOcpuCount,
            String capacityReservationId,
            String nonUpgradedEsxiHostId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.sddcId = sddcId;
        this.displayName = displayName;
        this.currentSku = currentSku;
        this.nextSku = nextSku;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.failedEsxiHostId = failedEsxiHostId;
        this.hostShapeName = hostShapeName;
        this.hostOcpuCount = hostOcpuCount;
        this.capacityReservationId = capacityReservationId;
        this.nonUpgradedEsxiHostId = nonUpgradedEsxiHostId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * SDDC to add the ESXi host to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
        private String sddcId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * SDDC to add the ESXi host to.
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
         * A descriptive name for the ESXi host. It's changeable. Esxi Host name requirements are
         * 1-16 character length limit, Must start with a letter, Must be English letters, numbers,
         * - only, No repeating hyphens, Must be unique within the SDDC.
         *
         * <p>If this attribute is not specified, the SDDC's {@code instanceDisplayNamePrefix}
         * attribute is used to name and incrementally number the ESXi host. For example, if you're
         * creating the fourth ESXi host in the SDDC, and {@code instanceDisplayNamePrefix} is
         * {@code MySDDC}, the host's display name is {@code MySDDC-4}.
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the ESXi host. It's changeable. Esxi Host name requirements are
         * 1-16 character length limit, Must start with a letter, Must be English letters, numbers,
         * - only, No repeating hyphens, Must be unique within the SDDC.
         *
         * <p>If this attribute is not specified, the SDDC's {@code instanceDisplayNamePrefix}
         * attribute is used to name and incrementally number the ESXi host. For example, if you're
         * creating the fourth ESXi host in the SDDC, and {@code instanceDisplayNamePrefix} is
         * {@code MySDDC}, the host's display name is {@code MySDDC-4}.
         *
         * <p>Avoid entering confidential information.
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
         * The billing option currently used by the ESXi host. {@link
         * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentSku")
        private Sku currentSku;

        /**
         * The billing option currently used by the ESXi host. {@link
         * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
         *
         * @param currentSku the value to set
         * @return this builder
         */
        public Builder currentSku(Sku currentSku) {
            this.currentSku = currentSku;
            this.__explicitlySet__.add("currentSku");
            return this;
        }
        /**
         * The billing option to switch to after the existing billing cycle ends. If {@code nextSku}
         * is null or empty, {@code currentSku} continues to the next billing cycle. {@link
         * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextSku")
        private Sku nextSku;

        /**
         * The billing option to switch to after the existing billing cycle ends. If {@code nextSku}
         * is null or empty, {@code currentSku} continues to the next billing cycle. {@link
         * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
         *
         * @param nextSku the value to set
         * @return this builder
         */
        public Builder nextSku(Sku nextSku) {
            this.nextSku = nextSku;
            this.__explicitlySet__.add("nextSku");
            return this;
        }
        /**
         * The availability domain to create the ESXi host in. If keep empty, for AD-specific SDDC,
         * new ESXi host will be created in the same availability domain; for multi-AD SDDC, new
         * ESXi host will be auto assigned to the next availability domain following evenly
         * distribution strategy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        /**
         * The availability domain to create the ESXi host in. If keep empty, for AD-specific SDDC,
         * new ESXi host will be created in the same availability domain; for multi-AD SDDC, new
         * ESXi host will be auto assigned to the next availability domain following evenly
         * distribution strategy.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that is failed. This is an optional parameter. If this parameter is specified,
         * a new ESXi host will be created to replace the failed one, and the {@code
         * failedEsxiHostId} field will be updated in the newly created Esxi host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("failedEsxiHostId")
        private String failedEsxiHostId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that is failed. This is an optional parameter. If this parameter is specified,
         * a new ESXi host will be created to replace the failed one, and the {@code
         * failedEsxiHostId} field will be updated in the newly created Esxi host.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Capacity Reservation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that will be upgraded. This is an optional parameter. If this parameter is
         * specified, an ESXi host with the new software version is created to replace the original
         * one, and the {@code nonUpgradedEsxiHostId} field is updated in the newly created Esxi
         * host. See [Upgrading VMware
         * Software](https://docs.cloud.oracle.com/Content/VMware/Concepts/upgrade.htm) for more
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nonUpgradedEsxiHostId")
        private String nonUpgradedEsxiHostId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * ESXi host that will be upgraded. This is an optional parameter. If this parameter is
         * specified, an ESXi host with the new software version is created to replace the original
         * one, and the {@code nonUpgradedEsxiHostId} field is updated in the newly created Esxi
         * host. See [Upgrading VMware
         * Software](https://docs.cloud.oracle.com/Content/VMware/Concepts/upgrade.htm) for more
         * information.
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
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateEsxiHostDetails build() {
            CreateEsxiHostDetails model =
                    new CreateEsxiHostDetails(
                            this.sddcId,
                            this.displayName,
                            this.currentSku,
                            this.nextSku,
                            this.computeAvailabilityDomain,
                            this.failedEsxiHostId,
                            this.hostShapeName,
                            this.hostOcpuCount,
                            this.capacityReservationId,
                            this.nonUpgradedEsxiHostId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEsxiHostDetails model) {
            if (model.wasPropertyExplicitlySet("sddcId")) {
                this.sddcId(model.getSddcId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("currentSku")) {
                this.currentSku(model.getCurrentSku());
            }
            if (model.wasPropertyExplicitlySet("nextSku")) {
                this.nextSku(model.getNextSku());
            }
            if (model.wasPropertyExplicitlySet("computeAvailabilityDomain")) {
                this.computeAvailabilityDomain(model.getComputeAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("failedEsxiHostId")) {
                this.failedEsxiHostId(model.getFailedEsxiHostId());
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
            if (model.wasPropertyExplicitlySet("nonUpgradedEsxiHostId")) {
                this.nonUpgradedEsxiHostId(model.getNonUpgradedEsxiHostId());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * SDDC to add the ESXi host to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
    private final String sddcId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * SDDC to add the ESXi host to.
     *
     * @return the value
     */
    public String getSddcId() {
        return sddcId;
    }

    /**
     * A descriptive name for the ESXi host. It's changeable. Esxi Host name requirements are 1-16
     * character length limit, Must start with a letter, Must be English letters, numbers, - only,
     * No repeating hyphens, Must be unique within the SDDC.
     *
     * <p>If this attribute is not specified, the SDDC's {@code instanceDisplayNamePrefix} attribute
     * is used to name and incrementally number the ESXi host. For example, if you're creating the
     * fourth ESXi host in the SDDC, and {@code instanceDisplayNamePrefix} is {@code MySDDC}, the
     * host's display name is {@code MySDDC-4}.
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the ESXi host. It's changeable. Esxi Host name requirements are 1-16
     * character length limit, Must start with a letter, Must be English letters, numbers, - only,
     * No repeating hyphens, Must be unique within the SDDC.
     *
     * <p>If this attribute is not specified, the SDDC's {@code instanceDisplayNamePrefix} attribute
     * is used to name and incrementally number the ESXi host. For example, if you're creating the
     * fourth ESXi host in the SDDC, and {@code instanceDisplayNamePrefix} is {@code MySDDC}, the
     * host's display name is {@code MySDDC-4}.
     *
     * <p>Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The billing option currently used by the ESXi host. {@link
     * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentSku")
    private final Sku currentSku;

    /**
     * The billing option currently used by the ESXi host. {@link
     * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     * @return the value
     */
    public Sku getCurrentSku() {
        return currentSku;
    }

    /**
     * The billing option to switch to after the existing billing cycle ends. If {@code nextSku} is
     * null or empty, {@code currentSku} continues to the next billing cycle. {@link
     * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextSku")
    private final Sku nextSku;

    /**
     * The billing option to switch to after the existing billing cycle ends. If {@code nextSku} is
     * null or empty, {@code currentSku} continues to the next billing cycle. {@link
     * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     * @return the value
     */
    public Sku getNextSku() {
        return nextSku;
    }

    /**
     * The availability domain to create the ESXi host in. If keep empty, for AD-specific SDDC, new
     * ESXi host will be created in the same availability domain; for multi-AD SDDC, new ESXi host
     * will be auto assigned to the next availability domain following evenly distribution strategy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    /**
     * The availability domain to create the ESXi host in. If keep empty, for AD-specific SDDC, new
     * ESXi host will be created in the same availability domain; for multi-AD SDDC, new ESXi host
     * will be auto assigned to the next availability domain following evenly distribution strategy.
     *
     * @return the value
     */
    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * ESXi host that is failed. This is an optional parameter. If this parameter is specified, a
     * new ESXi host will be created to replace the failed one, and the {@code failedEsxiHostId}
     * field will be updated in the newly created Esxi host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failedEsxiHostId")
    private final String failedEsxiHostId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * ESXi host that is failed. This is an optional parameter. If this parameter is specified, a
     * new ESXi host will be created to replace the failed one, and the {@code failedEsxiHostId}
     * field will be updated in the newly created Esxi host.
     *
     * @return the value
     */
    public String getFailedEsxiHostId() {
        return failedEsxiHostId;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Capacity Reservation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Capacity Reservation.
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * ESXi host that will be upgraded. This is an optional parameter. If this parameter is
     * specified, an ESXi host with the new software version is created to replace the original one,
     * and the {@code nonUpgradedEsxiHostId} field is updated in the newly created Esxi host. See
     * [Upgrading VMware
     * Software](https://docs.cloud.oracle.com/Content/VMware/Concepts/upgrade.htm) for more
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonUpgradedEsxiHostId")
    private final String nonUpgradedEsxiHostId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * ESXi host that will be upgraded. This is an optional parameter. If this parameter is
     * specified, an ESXi host with the new software version is created to replace the original one,
     * and the {@code nonUpgradedEsxiHostId} field is updated in the newly created Esxi host. See
     * [Upgrading VMware
     * Software](https://docs.cloud.oracle.com/Content/VMware/Concepts/upgrade.htm) for more
     * information.
     *
     * @return the value
     */
    public String getNonUpgradedEsxiHostId() {
        return nonUpgradedEsxiHostId;
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
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateEsxiHostDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sddcId=").append(String.valueOf(this.sddcId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", currentSku=").append(String.valueOf(this.currentSku));
        sb.append(", nextSku=").append(String.valueOf(this.nextSku));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", failedEsxiHostId=").append(String.valueOf(this.failedEsxiHostId));
        sb.append(", hostShapeName=").append(String.valueOf(this.hostShapeName));
        sb.append(", hostOcpuCount=").append(String.valueOf(this.hostOcpuCount));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", nonUpgradedEsxiHostId=").append(String.valueOf(this.nonUpgradedEsxiHostId));
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
        return java.util.Objects.equals(this.sddcId, other.sddcId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.currentSku, other.currentSku)
                && java.util.Objects.equals(this.nextSku, other.nextSku)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.failedEsxiHostId, other.failedEsxiHostId)
                && java.util.Objects.equals(this.hostShapeName, other.hostShapeName)
                && java.util.Objects.equals(this.hostOcpuCount, other.hostOcpuCount)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.nonUpgradedEsxiHostId, other.nonUpgradedEsxiHostId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sddcId == null ? 43 : this.sddcId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.currentSku == null ? 43 : this.currentSku.hashCode());
        result = (result * PRIME) + (this.nextSku == null ? 43 : this.nextSku.hashCode());
        result =
                (result * PRIME)
                        + (this.computeAvailabilityDomain == null
                                ? 43
                                : this.computeAvailabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.failedEsxiHostId == null ? 43 : this.failedEsxiHostId.hashCode());
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
                        + (this.nonUpgradedEsxiHostId == null
                                ? 43
                                : this.nonUpgradedEsxiHostId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
