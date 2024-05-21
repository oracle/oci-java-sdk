/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/**
 * the pricing information for the offer
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Pricing.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Pricing extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"currencyType", "totalAmount", "billingCycle"})
    public Pricing(String currencyType, Long totalAmount, BillingCycle billingCycle) {
        super();
        this.currencyType = currencyType;
        this.totalAmount = totalAmount;
        this.billingCycle = billingCycle;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The currency supported for a given Offer, in the format specified by ISO-4217
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currencyType")
        private String currencyType;

        /**
         * The currency supported for a given Offer, in the format specified by ISO-4217
         * @param currencyType the value to set
         * @return this builder
         **/
        public Builder currencyType(String currencyType) {
            this.currencyType = currencyType;
            this.__explicitlySet__.add("currencyType");
            return this;
        }
        /**
         * The total amount an Offer costs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalAmount")
        private Long totalAmount;

        /**
         * The total amount an Offer costs
         * @param totalAmount the value to set
         * @return this builder
         **/
        public Builder totalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            this.__explicitlySet__.add("totalAmount");
            return this;
        }
        /**
         * The frequency at which the customer is billed for the Offer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingCycle")
        private BillingCycle billingCycle;

        /**
         * The frequency at which the customer is billed for the Offer
         * @param billingCycle the value to set
         * @return this builder
         **/
        public Builder billingCycle(BillingCycle billingCycle) {
            this.billingCycle = billingCycle;
            this.__explicitlySet__.add("billingCycle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Pricing build() {
            Pricing model = new Pricing(this.currencyType, this.totalAmount, this.billingCycle);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Pricing model) {
            if (model.wasPropertyExplicitlySet("currencyType")) {
                this.currencyType(model.getCurrencyType());
            }
            if (model.wasPropertyExplicitlySet("totalAmount")) {
                this.totalAmount(model.getTotalAmount());
            }
            if (model.wasPropertyExplicitlySet("billingCycle")) {
                this.billingCycle(model.getBillingCycle());
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
     * The currency supported for a given Offer, in the format specified by ISO-4217
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyType")
    private final String currencyType;

    /**
     * The currency supported for a given Offer, in the format specified by ISO-4217
     * @return the value
     **/
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * The total amount an Offer costs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalAmount")
    private final Long totalAmount;

    /**
     * The total amount an Offer costs
     * @return the value
     **/
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * The frequency at which the customer is billed for the Offer
     **/
    public enum BillingCycle {
        OneTime("ONE_TIME"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BillingCycle.class);

        private final String value;
        private static java.util.Map<String, BillingCycle> map;

        static {
            map = new java.util.HashMap<>();
            for (BillingCycle v : BillingCycle.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BillingCycle(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BillingCycle create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BillingCycle', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The frequency at which the customer is billed for the Offer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingCycle")
    private final BillingCycle billingCycle;

    /**
     * The frequency at which the customer is billed for the Offer
     * @return the value
     **/
    public BillingCycle getBillingCycle() {
        return billingCycle;
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
        sb.append("Pricing(");
        sb.append("super=").append(super.toString());
        sb.append("currencyType=").append(String.valueOf(this.currencyType));
        sb.append(", totalAmount=").append(String.valueOf(this.totalAmount));
        sb.append(", billingCycle=").append(String.valueOf(this.billingCycle));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pricing)) {
            return false;
        }

        Pricing other = (Pricing) o;
        return java.util.Objects.equals(this.currencyType, other.currencyType)
                && java.util.Objects.equals(this.totalAmount, other.totalAmount)
                && java.util.Objects.equals(this.billingCycle, other.billingCycle)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.currencyType == null ? 43 : this.currencyType.hashCode());
        result = (result * PRIME) + (this.totalAmount == null ? 43 : this.totalAmount.hashCode());
        result = (result * PRIME) + (this.billingCycle == null ? 43 : this.billingCycle.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
