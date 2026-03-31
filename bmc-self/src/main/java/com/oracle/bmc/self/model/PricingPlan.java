/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * A pricing plan details provided by the Publisher.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PricingPlan.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PricingPlan extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "planType",
        "planName",
        "planDescription",
        "billingFrequency",
        "planDuration",
        "rates"
    })
    public PricingPlan(
            PlanType planType,
            String planName,
            String planDescription,
            BillingFrequency billingFrequency,
            PlanDuration planDuration,
            java.util.List<PricingRate> rates) {
        super();
        this.planType = planType;
        this.planName = planName;
        this.planDescription = planDescription;
        this.billingFrequency = billingFrequency;
        this.planDuration = planDuration;
        this.rates = rates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the subscription plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planType")
        private PlanType planType;

        /**
         * The type of the subscription plan.
         * @param planType the value to set
         * @return this builder
         **/
        public Builder planType(PlanType planType) {
            this.planType = planType;
            this.__explicitlySet__.add("planType");
            return this;
        }
        /**
         * The name of the subscription plan used to identify the plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planName")
        private String planName;

        /**
         * The name of the subscription plan used to identify the plan.
         * @param planName the value to set
         * @return this builder
         **/
        public Builder planName(String planName) {
            this.planName = planName;
            this.__explicitlySet__.add("planName");
            return this;
        }
        /**
         * A detailed explanation of the subscription plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
        private String planDescription;

        /**
         * A detailed explanation of the subscription plan.
         * @param planDescription the value to set
         * @return this builder
         **/
        public Builder planDescription(String planDescription) {
            this.planDescription = planDescription;
            this.__explicitlySet__.add("planDescription");
            return this;
        }
        /**
         * Specifies the interval at which billing occurs for the subscription plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
        private BillingFrequency billingFrequency;

        /**
         * Specifies the interval at which billing occurs for the subscription plan.
         * @param billingFrequency the value to set
         * @return this builder
         **/
        public Builder billingFrequency(BillingFrequency billingFrequency) {
            this.billingFrequency = billingFrequency;
            this.__explicitlySet__.add("billingFrequency");
            return this;
        }
        /**
         * Specifies the interval at which billing occurs for the subscription plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planDuration")
        private PlanDuration planDuration;

        /**
         * Specifies the interval at which billing occurs for the subscription plan.
         * @param planDuration the value to set
         * @return this builder
         **/
        public Builder planDuration(PlanDuration planDuration) {
            this.planDuration = planDuration;
            this.__explicitlySet__.add("planDuration");
            return this;
        }
        /**
         * The pricing details of the subscription plan in various supported currencies.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rates")
        private java.util.List<PricingRate> rates;

        /**
         * The pricing details of the subscription plan in various supported currencies.
         * @param rates the value to set
         * @return this builder
         **/
        public Builder rates(java.util.List<PricingRate> rates) {
            this.rates = rates;
            this.__explicitlySet__.add("rates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PricingPlan build() {
            PricingPlan model =
                    new PricingPlan(
                            this.planType,
                            this.planName,
                            this.planDescription,
                            this.billingFrequency,
                            this.planDuration,
                            this.rates);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PricingPlan model) {
            if (model.wasPropertyExplicitlySet("planType")) {
                this.planType(model.getPlanType());
            }
            if (model.wasPropertyExplicitlySet("planName")) {
                this.planName(model.getPlanName());
            }
            if (model.wasPropertyExplicitlySet("planDescription")) {
                this.planDescription(model.getPlanDescription());
            }
            if (model.wasPropertyExplicitlySet("billingFrequency")) {
                this.billingFrequency(model.getBillingFrequency());
            }
            if (model.wasPropertyExplicitlySet("planDuration")) {
                this.planDuration(model.getPlanDuration());
            }
            if (model.wasPropertyExplicitlySet("rates")) {
                this.rates(model.getRates());
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
     * The type of the subscription plan.
     **/
    public enum PlanType {
        Fixed("FIXED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlanType.class);

        private final String value;
        private static java.util.Map<String, PlanType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanType v : PlanType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlanType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlanType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the subscription plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planType")
    private final PlanType planType;

    /**
     * The type of the subscription plan.
     * @return the value
     **/
    public PlanType getPlanType() {
        return planType;
    }

    /**
     * The name of the subscription plan used to identify the plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planName")
    private final String planName;

    /**
     * The name of the subscription plan used to identify the plan.
     * @return the value
     **/
    public String getPlanName() {
        return planName;
    }

    /**
     * A detailed explanation of the subscription plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
    private final String planDescription;

    /**
     * A detailed explanation of the subscription plan.
     * @return the value
     **/
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * Specifies the interval at which billing occurs for the subscription plan.
     **/
    public enum BillingFrequency {
        Yearly("YEARLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BillingFrequency.class);

        private final String value;
        private static java.util.Map<String, BillingFrequency> map;

        static {
            map = new java.util.HashMap<>();
            for (BillingFrequency v : BillingFrequency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BillingFrequency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BillingFrequency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BillingFrequency', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the interval at which billing occurs for the subscription plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
    private final BillingFrequency billingFrequency;

    /**
     * Specifies the interval at which billing occurs for the subscription plan.
     * @return the value
     **/
    public BillingFrequency getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Specifies the interval at which billing occurs for the subscription plan.
     **/
    public enum PlanDuration {
        Annual("ANNUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlanDuration.class);

        private final String value;
        private static java.util.Map<String, PlanDuration> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanDuration v : PlanDuration.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlanDuration(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanDuration create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlanDuration', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the interval at which billing occurs for the subscription plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planDuration")
    private final PlanDuration planDuration;

    /**
     * Specifies the interval at which billing occurs for the subscription plan.
     * @return the value
     **/
    public PlanDuration getPlanDuration() {
        return planDuration;
    }

    /**
     * The pricing details of the subscription plan in various supported currencies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rates")
    private final java.util.List<PricingRate> rates;

    /**
     * The pricing details of the subscription plan in various supported currencies.
     * @return the value
     **/
    public java.util.List<PricingRate> getRates() {
        return rates;
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
        sb.append("PricingPlan(");
        sb.append("super=").append(super.toString());
        sb.append("planType=").append(String.valueOf(this.planType));
        sb.append(", planName=").append(String.valueOf(this.planName));
        sb.append(", planDescription=").append(String.valueOf(this.planDescription));
        sb.append(", billingFrequency=").append(String.valueOf(this.billingFrequency));
        sb.append(", planDuration=").append(String.valueOf(this.planDuration));
        sb.append(", rates=").append(String.valueOf(this.rates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PricingPlan)) {
            return false;
        }

        PricingPlan other = (PricingPlan) o;
        return java.util.Objects.equals(this.planType, other.planType)
                && java.util.Objects.equals(this.planName, other.planName)
                && java.util.Objects.equals(this.planDescription, other.planDescription)
                && java.util.Objects.equals(this.billingFrequency, other.billingFrequency)
                && java.util.Objects.equals(this.planDuration, other.planDuration)
                && java.util.Objects.equals(this.rates, other.rates)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planType == null ? 43 : this.planType.hashCode());
        result = (result * PRIME) + (this.planName == null ? 43 : this.planName.hashCode());
        result =
                (result * PRIME)
                        + (this.planDescription == null ? 43 : this.planDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.billingFrequency == null ? 43 : this.billingFrequency.hashCode());
        result = (result * PRIME) + (this.planDuration == null ? 43 : this.planDuration.hashCode());
        result = (result * PRIME) + (this.rates == null ? 43 : this.rates.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
