/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Object containing chargeback plan details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChargebackPlanDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChargebackPlanDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"planId", "planType", "timeEnabled"})
    public ChargebackPlanDetails(String planId, String planType, java.util.Date timeEnabled) {
        super();
        this.planId = planId;
        this.planType = planType;
        this.timeEnabled = timeEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI Chargeback plan resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planId")
        private String planId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI Chargeback plan resource.
         *
         * @param planId the value to set
         * @return this builder
         **/
        public Builder planId(String planId) {
            this.planId = planId;
            this.__explicitlySet__.add("planId");
            return this;
        }
        /**
         * Chargeback Plan type of the chargeback entity. For an Exadata it can be WEIGHTED_ALLOCATION, EQUAL_ALLOCATION, UNUSED_ALLOCATION.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planType")
        private String planType;

        /**
         * Chargeback Plan type of the chargeback entity. For an Exadata it can be WEIGHTED_ALLOCATION, EQUAL_ALLOCATION, UNUSED_ALLOCATION.
         *
         * @param planType the value to set
         * @return this builder
         **/
        public Builder planType(String planType) {
            this.planType = planType;
            this.__explicitlySet__.add("planType");
            return this;
        }
        /**
         * The date and time the chargeback plan was enabled on the resource, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
        private java.util.Date timeEnabled;

        /**
         * The date and time the chargeback plan was enabled on the resource, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeEnabled the value to set
         * @return this builder
         **/
        public Builder timeEnabled(java.util.Date timeEnabled) {
            this.timeEnabled = timeEnabled;
            this.__explicitlySet__.add("timeEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChargebackPlanDetails build() {
            ChargebackPlanDetails model =
                    new ChargebackPlanDetails(this.planId, this.planType, this.timeEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChargebackPlanDetails model) {
            if (model.wasPropertyExplicitlySet("planId")) {
                this.planId(model.getPlanId());
            }
            if (model.wasPropertyExplicitlySet("planType")) {
                this.planType(model.getPlanType());
            }
            if (model.wasPropertyExplicitlySet("timeEnabled")) {
                this.timeEnabled(model.getTimeEnabled());
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
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI Chargeback plan resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planId")
    private final String planId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI Chargeback plan resource.
     *
     * @return the value
     **/
    public String getPlanId() {
        return planId;
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
     * The date and time the chargeback plan was enabled on the resource, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
    private final java.util.Date timeEnabled;

    /**
     * The date and time the chargeback plan was enabled on the resource, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeEnabled() {
        return timeEnabled;
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
        sb.append("ChargebackPlanDetails(");
        sb.append("super=").append(super.toString());
        sb.append("planId=").append(String.valueOf(this.planId));
        sb.append(", planType=").append(String.valueOf(this.planType));
        sb.append(", timeEnabled=").append(String.valueOf(this.timeEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChargebackPlanDetails)) {
            return false;
        }

        ChargebackPlanDetails other = (ChargebackPlanDetails) o;
        return java.util.Objects.equals(this.planId, other.planId)
                && java.util.Objects.equals(this.planType, other.planType)
                && java.util.Objects.equals(this.timeEnabled, other.timeEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planId == null ? 43 : this.planId.hashCode());
        result = (result * PRIME) + (this.planType == null ? 43 : this.planType.hashCode());
        result = (result * PRIME) + (this.timeEnabled == null ? 43 : this.timeEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
