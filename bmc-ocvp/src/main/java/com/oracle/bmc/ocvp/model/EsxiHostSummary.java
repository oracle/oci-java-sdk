/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * A summary of the ESXi host.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EsxiHostSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EsxiHostSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "sddcId",
        "compartmentId",
        "computeInstanceId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "currentSku",
        "nextSku",
        "billingContractEndDate",
        "failedEsxiHostId",
        "replacementEsxiHostId",
        "gracePeriodEndDate",
        "computeAvailabilityDomain",
        "hostShapeName",
        "hostOcpuCount",
        "freeformTags",
        "definedTags"
    })
    public EsxiHostSummary(
            String id,
            String displayName,
            String sddcId,
            String compartmentId,
            String computeInstanceId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleStates lifecycleState,
            Sku currentSku,
            Sku nextSku,
            java.util.Date billingContractEndDate,
            String failedEsxiHostId,
            String replacementEsxiHostId,
            java.util.Date gracePeriodEndDate,
            String computeAvailabilityDomain,
            String hostShapeName,
            Float hostOcpuCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.sddcId = sddcId;
        this.compartmentId = compartmentId;
        this.computeInstanceId = computeInstanceId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.currentSku = currentSku;
        this.nextSku = nextSku;
        this.billingContractEndDate = billingContractEndDate;
        this.failedEsxiHostId = failedEsxiHostId;
        this.replacementEsxiHostId = replacementEsxiHostId;
        this.gracePeriodEndDate = gracePeriodEndDate;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.hostShapeName = hostShapeName;
        this.hostOcpuCount = hostOcpuCount;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
        private String sddcId;

        public Builder sddcId(String sddcId) {
            this.sddcId = sddcId;
            this.__explicitlySet__.add("sddcId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceId")
        private String computeInstanceId;

        public Builder computeInstanceId(String computeInstanceId) {
            this.computeInstanceId = computeInstanceId;
            this.__explicitlySet__.add("computeInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentSku")
        private Sku currentSku;

        public Builder currentSku(Sku currentSku) {
            this.currentSku = currentSku;
            this.__explicitlySet__.add("currentSku");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextSku")
        private Sku nextSku;

        public Builder nextSku(Sku nextSku) {
            this.nextSku = nextSku;
            this.__explicitlySet__.add("nextSku");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billingContractEndDate")
        private java.util.Date billingContractEndDate;

        public Builder billingContractEndDate(java.util.Date billingContractEndDate) {
            this.billingContractEndDate = billingContractEndDate;
            this.__explicitlySet__.add("billingContractEndDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failedEsxiHostId")
        private String failedEsxiHostId;

        public Builder failedEsxiHostId(String failedEsxiHostId) {
            this.failedEsxiHostId = failedEsxiHostId;
            this.__explicitlySet__.add("failedEsxiHostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replacementEsxiHostId")
        private String replacementEsxiHostId;

        public Builder replacementEsxiHostId(String replacementEsxiHostId) {
            this.replacementEsxiHostId = replacementEsxiHostId;
            this.__explicitlySet__.add("replacementEsxiHostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gracePeriodEndDate")
        private java.util.Date gracePeriodEndDate;

        public Builder gracePeriodEndDate(java.util.Date gracePeriodEndDate) {
            this.gracePeriodEndDate = gracePeriodEndDate;
            this.__explicitlySet__.add("gracePeriodEndDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        public Builder computeAvailabilityDomain(String computeAvailabilityDomain) {
            this.computeAvailabilityDomain = computeAvailabilityDomain;
            this.__explicitlySet__.add("computeAvailabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostShapeName")
        private String hostShapeName;

        public Builder hostShapeName(String hostShapeName) {
            this.hostShapeName = hostShapeName;
            this.__explicitlySet__.add("hostShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuCount")
        private Float hostOcpuCount;

        public Builder hostOcpuCount(Float hostOcpuCount) {
            this.hostOcpuCount = hostOcpuCount;
            this.__explicitlySet__.add("hostOcpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EsxiHostSummary build() {
            EsxiHostSummary __instance__ =
                    new EsxiHostSummary(
                            id,
                            displayName,
                            sddcId,
                            compartmentId,
                            computeInstanceId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            currentSku,
                            nextSku,
                            billingContractEndDate,
                            failedEsxiHostId,
                            replacementEsxiHostId,
                            gracePeriodEndDate,
                            computeAvailabilityDomain,
                            hostShapeName,
                            hostOcpuCount,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EsxiHostSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .sddcId(o.getSddcId())
                            .compartmentId(o.getCompartmentId())
                            .computeInstanceId(o.getComputeInstanceId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .currentSku(o.getCurrentSku())
                            .nextSku(o.getNextSku())
                            .billingContractEndDate(o.getBillingContractEndDate())
                            .failedEsxiHostId(o.getFailedEsxiHostId())
                            .replacementEsxiHostId(o.getReplacementEsxiHostId())
                            .gracePeriodEndDate(o.getGracePeriodEndDate())
                            .computeAvailabilityDomain(o.getComputeAvailabilityDomain())
                            .hostShapeName(o.getHostShapeName())
                            .hostOcpuCount(o.getHostOcpuCount())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the ESXi host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * A descriptive name for the ESXi host. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the SDDC that the
     * ESXi host belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
    private final String sddcId;

    public String getSddcId() {
        return sddcId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * In terms of implementation, an ESXi host is a Compute instance that
     * is configured with the chosen bundle of VMware software. The {@code computeInstanceId}
     * is the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of that Compute instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceId")
    private final String computeInstanceId;

    public String getComputeInstanceId() {
        return computeInstanceId;
    }

    /**
     * The date and time the ESXi host was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the ESXi host was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the ESXi host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The billing option currently used by the ESXi host.
     * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentSku")
    private final Sku currentSku;

    public Sku getCurrentSku() {
        return currentSku;
    }

    /**
     * The billing option to switch to after the current billing cycle ends.
     * If {@code nextSku} is null or empty, {@code currentSku} continues to the next billing cycle.
     * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextSku")
    private final Sku nextSku;

    public Sku getNextSku() {
        return nextSku;
    }

    /**
     * Current billing cycle end date. If the value in {@code currentSku} and {@code nextSku} are different, the value specified in {@code nextSku}
     * becomes the new {@code currentSKU} when the {@code contractEndDate} is reached.
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingContractEndDate")
    private final java.util.Date billingContractEndDate;

    public java.util.Date getBillingContractEndDate() {
        return billingContractEndDate;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the ESXi host that failed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedEsxiHostId")
    private final String failedEsxiHostId;

    public String getFailedEsxiHostId() {
        return failedEsxiHostId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the ESXi host that
     * is newly created to replace the failed host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replacementEsxiHostId")
    private final String replacementEsxiHostId;

    public String getReplacementEsxiHostId() {
        return replacementEsxiHostId;
    }

    /**
     * The date and time when the new esxi host should start billing cycle.
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2021-07-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gracePeriodEndDate")
    private final java.util.Date gracePeriodEndDate;

    public java.util.Date getGracePeriodEndDate() {
        return gracePeriodEndDate;
    }

    /**
     * The availability domain of the ESXi host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

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

    public String getHostShapeName() {
        return hostShapeName;
    }

    /**
     * The OCPU count of the ESXi host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuCount")
    private final Float hostOcpuCount;

    public Float getHostOcpuCount() {
        return hostOcpuCount;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EsxiHostSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sddcId=").append(String.valueOf(this.sddcId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", computeInstanceId=").append(String.valueOf(this.computeInstanceId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", currentSku=").append(String.valueOf(this.currentSku));
        sb.append(", nextSku=").append(String.valueOf(this.nextSku));
        sb.append(", billingContractEndDate=").append(String.valueOf(this.billingContractEndDate));
        sb.append(", failedEsxiHostId=").append(String.valueOf(this.failedEsxiHostId));
        sb.append(", replacementEsxiHostId=").append(String.valueOf(this.replacementEsxiHostId));
        sb.append(", gracePeriodEndDate=").append(String.valueOf(this.gracePeriodEndDate));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", hostShapeName=").append(String.valueOf(this.hostShapeName));
        sb.append(", hostOcpuCount=").append(String.valueOf(this.hostOcpuCount));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EsxiHostSummary)) {
            return false;
        }

        EsxiHostSummary other = (EsxiHostSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sddcId, other.sddcId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.computeInstanceId, other.computeInstanceId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.currentSku, other.currentSku)
                && java.util.Objects.equals(this.nextSku, other.nextSku)
                && java.util.Objects.equals(
                        this.billingContractEndDate, other.billingContractEndDate)
                && java.util.Objects.equals(this.failedEsxiHostId, other.failedEsxiHostId)
                && java.util.Objects.equals(this.replacementEsxiHostId, other.replacementEsxiHostId)
                && java.util.Objects.equals(this.gracePeriodEndDate, other.gracePeriodEndDate)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.hostShapeName, other.hostShapeName)
                && java.util.Objects.equals(this.hostOcpuCount, other.hostOcpuCount)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sddcId == null ? 43 : this.sddcId.hashCode());
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
        result = (result * PRIME) + (this.currentSku == null ? 43 : this.currentSku.hashCode());
        result = (result * PRIME) + (this.nextSku == null ? 43 : this.nextSku.hashCode());
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
                        + (this.computeAvailabilityDomain == null
                                ? 43
                                : this.computeAvailabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.hostShapeName == null ? 43 : this.hostShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.hostOcpuCount == null ? 43 : this.hostOcpuCount.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
