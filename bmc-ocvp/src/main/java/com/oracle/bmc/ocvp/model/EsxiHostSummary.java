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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EsxiHostSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class EsxiHostSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the ESXi host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * A descriptive name for the ESXi host. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the SDDC that the
     * ESXi host belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
    String sddcId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * In terms of implementation, an ESXi host is a Compute instance that
     * is configured with the chosen bundle of VMware software. The {@code computeInstanceId}
     * is the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of that Compute instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceId")
    String computeInstanceId;

    /**
     * The date and time the ESXi host was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the ESXi host was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the ESXi host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

    /**
     * The billing option currently used by the ESXi host.
     * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentSku")
    Sku currentSku;

    /**
     * The billing option to switch to after the current billing cycle ends.
     * If {@code nextSku} is null or empty, {@code currentSku} continues to the next billing cycle.
     * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextSku")
    Sku nextSku;

    /**
     * Current billing cycle end date. If the value in {@code currentSku} and {@code nextSku} are different, the value specified in {@code nextSku}
     * becomes the new {@code currentSKU} when the {@code contractEndDate} is reached.
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingContractEndDate")
    java.util.Date billingContractEndDate;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the ESXi host that failed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedEsxiHostId")
    String failedEsxiHostId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the ESXi host that
     * is newly created to replace the failed host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replacementEsxiHostId")
    String replacementEsxiHostId;

    /**
     * The date and time when the new esxi host should start billing cycle.
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2021-07-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gracePeriodEndDate")
    java.util.Date gracePeriodEndDate;

    /**
     * The availability domain of the ESXi host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    String computeAvailabilityDomain;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
