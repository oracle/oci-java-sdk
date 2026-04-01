/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The details used to create a new Ops Insights chargeback plan.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource",
    defaultImpl = CreateChargebackPlanDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateChargebackPlanExadataDetails.class,
        name = "CHARGEBACK_EXADATA"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateChargebackPlanDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "freeformTags",
        "definedTags",
        "planName",
        "planDescription",
        "planType",
        "planCustomItems"
    })
    protected CreateChargebackPlanDetails(
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String planName,
            String planDescription,
            String planType,
            java.util.List<CreatePlanCustomItemDetails> planCustomItems) {
        super();
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.planName = planName;
        this.planDescription = planDescription;
        this.planType = planType;
        this.planCustomItems = planCustomItems;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Name for the OPSI Chargeback plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planName")
    private final String planName;

    /**
     * Name for the OPSI Chargeback plan.
     * @return the value
     **/
    public String getPlanName() {
        return planName;
    }

    /**
     * Description of OPSI Chargeback Plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
    private final String planDescription;

    /**
     * Description of OPSI Chargeback Plan.
     * @return the value
     **/
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * Chargeback Plan type of the chargeback entity. For an Exadata it can be WEIGHTED_ALLOCATION, EQUAL_ALLOCATION, UNUSED_ALLOCATION.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planType")
    private final String planType;

    /**
     * Chargeback Plan type of the chargeback entity. For an Exadata it can be WEIGHTED_ALLOCATION, EQUAL_ALLOCATION, UNUSED_ALLOCATION.
     *
     * @return the value
     **/
    public String getPlanType() {
        return planType;
    }

    /**
     * List of chargeback plan customizations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planCustomItems")
    private final java.util.List<CreatePlanCustomItemDetails> planCustomItems;

    /**
     * List of chargeback plan customizations.
     * @return the value
     **/
    public java.util.List<CreatePlanCustomItemDetails> getPlanCustomItems() {
        return planCustomItems;
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
        sb.append("CreateChargebackPlanDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", planName=").append(String.valueOf(this.planName));
        sb.append(", planDescription=").append(String.valueOf(this.planDescription));
        sb.append(", planType=").append(String.valueOf(this.planType));
        sb.append(", planCustomItems=").append(String.valueOf(this.planCustomItems));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateChargebackPlanDetails)) {
            return false;
        }

        CreateChargebackPlanDetails other = (CreateChargebackPlanDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.planName, other.planName)
                && java.util.Objects.equals(this.planDescription, other.planDescription)
                && java.util.Objects.equals(this.planType, other.planType)
                && java.util.Objects.equals(this.planCustomItems, other.planCustomItems)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.planName == null ? 43 : this.planName.hashCode());
        result =
                (result * PRIME)
                        + (this.planDescription == null ? 43 : this.planDescription.hashCode());
        result = (result * PRIME) + (this.planType == null ? 43 : this.planType.hashCode());
        result =
                (result * PRIME)
                        + (this.planCustomItems == null ? 43 : this.planCustomItems.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
