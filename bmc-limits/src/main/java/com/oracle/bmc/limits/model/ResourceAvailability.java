/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.model;

/**
 * The availability of a given resource limit, based on the usage, tenant service limits, and quotas set for the tenancy.
 * Note: We cannot guarantee this data for all the limits. In such cases, these fields will be empty.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceAvailability.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceAvailability extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "used",
        "available",
        "fractionalUsage",
        "fractionalAvailability",
        "effectiveQuotaValue"
    })
    public ResourceAvailability(
            Long used,
            Long available,
            java.math.BigDecimal fractionalUsage,
            java.math.BigDecimal fractionalAvailability,
            java.math.BigDecimal effectiveQuotaValue) {
        super();
        this.used = used;
        this.available = available;
        this.fractionalUsage = fractionalUsage;
        this.fractionalAvailability = fractionalAvailability;
        this.effectiveQuotaValue = effectiveQuotaValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The current usage in the given compartment. To support resources with fractional counts,
         * the field rounds up to the nearest integer.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("used")
        private Long used;

        /**
         * The current usage in the given compartment. To support resources with fractional counts,
         * the field rounds up to the nearest integer.
         *
         * @param used the value to set
         * @return this builder
         **/
        public Builder used(Long used) {
            this.used = used;
            this.__explicitlySet__.add("used");
            return this;
        }
        /**
         * The count of available resources. To support resources with fractional counts,
         * the field rounds down to the nearest integer.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("available")
        private Long available;

        /**
         * The count of available resources. To support resources with fractional counts,
         * the field rounds down to the nearest integer.
         *
         * @param available the value to set
         * @return this builder
         **/
        public Builder available(Long available) {
            this.available = available;
            this.__explicitlySet__.add("available");
            return this;
        }
        /**
         * The current most accurate usage in the given compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fractionalUsage")
        private java.math.BigDecimal fractionalUsage;

        /**
         * The current most accurate usage in the given compartment.
         *
         * @param fractionalUsage the value to set
         * @return this builder
         **/
        public Builder fractionalUsage(java.math.BigDecimal fractionalUsage) {
            this.fractionalUsage = fractionalUsage;
            this.__explicitlySet__.add("fractionalUsage");
            return this;
        }
        /**
         * The most accurate count of available resources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fractionalAvailability")
        private java.math.BigDecimal fractionalAvailability;

        /**
         * The most accurate count of available resources.
         *
         * @param fractionalAvailability the value to set
         * @return this builder
         **/
        public Builder fractionalAvailability(java.math.BigDecimal fractionalAvailability) {
            this.fractionalAvailability = fractionalAvailability;
            this.__explicitlySet__.add("fractionalAvailability");
            return this;
        }
        /**
         * The effective quota value for the given compartment. This field is only present if there is a
         * current quota policy affecting the current resource in the target region or availability domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("effectiveQuotaValue")
        private java.math.BigDecimal effectiveQuotaValue;

        /**
         * The effective quota value for the given compartment. This field is only present if there is a
         * current quota policy affecting the current resource in the target region or availability domain.
         *
         * @param effectiveQuotaValue the value to set
         * @return this builder
         **/
        public Builder effectiveQuotaValue(java.math.BigDecimal effectiveQuotaValue) {
            this.effectiveQuotaValue = effectiveQuotaValue;
            this.__explicitlySet__.add("effectiveQuotaValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceAvailability build() {
            ResourceAvailability model =
                    new ResourceAvailability(
                            this.used,
                            this.available,
                            this.fractionalUsage,
                            this.fractionalAvailability,
                            this.effectiveQuotaValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceAvailability model) {
            if (model.wasPropertyExplicitlySet("used")) {
                this.used(model.getUsed());
            }
            if (model.wasPropertyExplicitlySet("available")) {
                this.available(model.getAvailable());
            }
            if (model.wasPropertyExplicitlySet("fractionalUsage")) {
                this.fractionalUsage(model.getFractionalUsage());
            }
            if (model.wasPropertyExplicitlySet("fractionalAvailability")) {
                this.fractionalAvailability(model.getFractionalAvailability());
            }
            if (model.wasPropertyExplicitlySet("effectiveQuotaValue")) {
                this.effectiveQuotaValue(model.getEffectiveQuotaValue());
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
     * The current usage in the given compartment. To support resources with fractional counts,
     * the field rounds up to the nearest integer.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("used")
    private final Long used;

    /**
     * The current usage in the given compartment. To support resources with fractional counts,
     * the field rounds up to the nearest integer.
     *
     * @return the value
     **/
    public Long getUsed() {
        return used;
    }

    /**
     * The count of available resources. To support resources with fractional counts,
     * the field rounds down to the nearest integer.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("available")
    private final Long available;

    /**
     * The count of available resources. To support resources with fractional counts,
     * the field rounds down to the nearest integer.
     *
     * @return the value
     **/
    public Long getAvailable() {
        return available;
    }

    /**
     * The current most accurate usage in the given compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fractionalUsage")
    private final java.math.BigDecimal fractionalUsage;

    /**
     * The current most accurate usage in the given compartment.
     *
     * @return the value
     **/
    public java.math.BigDecimal getFractionalUsage() {
        return fractionalUsage;
    }

    /**
     * The most accurate count of available resources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fractionalAvailability")
    private final java.math.BigDecimal fractionalAvailability;

    /**
     * The most accurate count of available resources.
     *
     * @return the value
     **/
    public java.math.BigDecimal getFractionalAvailability() {
        return fractionalAvailability;
    }

    /**
     * The effective quota value for the given compartment. This field is only present if there is a
     * current quota policy affecting the current resource in the target region or availability domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveQuotaValue")
    private final java.math.BigDecimal effectiveQuotaValue;

    /**
     * The effective quota value for the given compartment. This field is only present if there is a
     * current quota policy affecting the current resource in the target region or availability domain.
     *
     * @return the value
     **/
    public java.math.BigDecimal getEffectiveQuotaValue() {
        return effectiveQuotaValue;
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
        sb.append("ResourceAvailability(");
        sb.append("super=").append(super.toString());
        sb.append("used=").append(String.valueOf(this.used));
        sb.append(", available=").append(String.valueOf(this.available));
        sb.append(", fractionalUsage=").append(String.valueOf(this.fractionalUsage));
        sb.append(", fractionalAvailability=").append(String.valueOf(this.fractionalAvailability));
        sb.append(", effectiveQuotaValue=").append(String.valueOf(this.effectiveQuotaValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceAvailability)) {
            return false;
        }

        ResourceAvailability other = (ResourceAvailability) o;
        return java.util.Objects.equals(this.used, other.used)
                && java.util.Objects.equals(this.available, other.available)
                && java.util.Objects.equals(this.fractionalUsage, other.fractionalUsage)
                && java.util.Objects.equals(
                        this.fractionalAvailability, other.fractionalAvailability)
                && java.util.Objects.equals(this.effectiveQuotaValue, other.effectiveQuotaValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.used == null ? 43 : this.used.hashCode());
        result = (result * PRIME) + (this.available == null ? 43 : this.available.hashCode());
        result =
                (result * PRIME)
                        + (this.fractionalUsage == null ? 43 : this.fractionalUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.fractionalAvailability == null
                                ? 43
                                : this.fractionalAvailability.hashCode());
        result =
                (result * PRIME)
                        + (this.effectiveQuotaValue == null
                                ? 43
                                : this.effectiveQuotaValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
