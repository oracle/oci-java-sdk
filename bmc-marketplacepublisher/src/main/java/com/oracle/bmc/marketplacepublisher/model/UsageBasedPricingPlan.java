/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Usage-based SaaS pricing plan where all billing is driven by dimensions.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UsageBasedPricingPlan.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "planType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UsageBasedPricingPlan extends PricingPlan {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("rates")
        private java.util.List<PricingRate> rates;

        public Builder rates(java.util.List<PricingRate> rates) {
            this.rates = rates;
            this.__explicitlySet__.add("rates");
            return this;
        }
        /**
         * Unique identifier of the pricing plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pricingPlanKey")
        private String pricingPlanKey;

        /**
         * Unique identifier of the pricing plan.
         * @param pricingPlanKey the value to set
         * @return this builder
         **/
        public Builder pricingPlanKey(String pricingPlanKey) {
            this.pricingPlanKey = pricingPlanKey;
            this.__explicitlySet__.add("pricingPlanKey");
            return this;
        }
        /**
         * The plan name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The plan name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The plan description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
        private String planDescription;

        /**
         * The plan description.
         * @param planDescription the value to set
         * @return this builder
         **/
        public Builder planDescription(String planDescription) {
            this.planDescription = planDescription;
            this.__explicitlySet__.add("planDescription");
            return this;
        }
        /**
         * The plan billing frequency.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
        private BillingFrequency billingFrequency;

        /**
         * The plan billing frequency.
         * @param billingFrequency the value to set
         * @return this builder
         **/
        public Builder billingFrequency(BillingFrequency billingFrequency) {
            this.billingFrequency = billingFrequency;
            this.__explicitlySet__.add("billingFrequency");
            return this;
        }
        /**
         * The plan duration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planDuration")
        private PlanDuration planDuration;

        /**
         * The plan duration.
         * @param planDuration the value to set
         * @return this builder
         **/
        public Builder planDuration(PlanDuration planDuration) {
            this.planDuration = planDuration;
            this.__explicitlySet__.add("planDuration");
            return this;
        }
        /**
         * The usage dimensions that define billable usage for this plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<UsageDimension> dimensions;

        /**
         * The usage dimensions that define billable usage for this plan.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.List<UsageDimension> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * Additional metadata key/value pairs for the usage-based pricing.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        /**
         * Additional metadata key/value pairs for the usage-based pricing.
         *
         * @param extendedMetadata the value to set
         * @return this builder
         **/
        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageBasedPricingPlan build() {
            UsageBasedPricingPlan model =
                    new UsageBasedPricingPlan(
                            this.rates,
                            this.pricingPlanKey,
                            this.name,
                            this.planDescription,
                            this.billingFrequency,
                            this.planDuration,
                            this.dimensions,
                            this.extendedMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageBasedPricingPlan model) {
            if (model.wasPropertyExplicitlySet("rates")) {
                this.rates(model.getRates());
            }
            if (model.wasPropertyExplicitlySet("pricingPlanKey")) {
                this.pricingPlanKey(model.getPricingPlanKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
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

    @Deprecated
    public UsageBasedPricingPlan(
            java.util.List<PricingRate> rates,
            String pricingPlanKey,
            String name,
            String planDescription,
            BillingFrequency billingFrequency,
            PlanDuration planDuration,
            java.util.List<UsageDimension> dimensions,
            java.util.Map<String, String> extendedMetadata) {
        super(rates);
        this.pricingPlanKey = pricingPlanKey;
        this.name = name;
        this.planDescription = planDescription;
        this.billingFrequency = billingFrequency;
        this.planDuration = planDuration;
        this.dimensions = dimensions;
        this.extendedMetadata = extendedMetadata;
    }

    /**
     * Unique identifier of the pricing plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingPlanKey")
    private final String pricingPlanKey;

    /**
     * Unique identifier of the pricing plan.
     * @return the value
     **/
    public String getPricingPlanKey() {
        return pricingPlanKey;
    }

    /**
     * The plan name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The plan name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The plan description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
    private final String planDescription;

    /**
     * The plan description.
     * @return the value
     **/
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * The plan billing frequency.
     **/
    public enum BillingFrequency {
        Monthly("MONTHLY"),
        Quarterly("QUARTERLY"),
        SemiAnnual("SEMI_ANNUAL"),
        Annual("ANNUAL"),
        Biennial("BIENNIAL"),
        Triennial("TRIENNIAL"),

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
     * The plan billing frequency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
    private final BillingFrequency billingFrequency;

    /**
     * The plan billing frequency.
     * @return the value
     **/
    public BillingFrequency getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * The plan duration.
     **/
    public enum PlanDuration {
        Monthly("MONTHLY"),
        Quarterly("QUARTERLY"),
        SemiAnnual("SEMI_ANNUAL"),
        Annual("ANNUAL"),
        Biennial("BIENNIAL"),
        Triennial("TRIENNIAL"),

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
     * The plan duration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planDuration")
    private final PlanDuration planDuration;

    /**
     * The plan duration.
     * @return the value
     **/
    public PlanDuration getPlanDuration() {
        return planDuration;
    }

    /**
     * The usage dimensions that define billable usage for this plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<UsageDimension> dimensions;

    /**
     * The usage dimensions that define billable usage for this plan.
     * @return the value
     **/
    public java.util.List<UsageDimension> getDimensions() {
        return dimensions;
    }

    /**
     * Additional metadata key/value pairs for the usage-based pricing.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    /**
     * Additional metadata key/value pairs for the usage-based pricing.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
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
        sb.append("UsageBasedPricingPlan(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pricingPlanKey=").append(String.valueOf(this.pricingPlanKey));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", planDescription=").append(String.valueOf(this.planDescription));
        sb.append(", billingFrequency=").append(String.valueOf(this.billingFrequency));
        sb.append(", planDuration=").append(String.valueOf(this.planDuration));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageBasedPricingPlan)) {
            return false;
        }

        UsageBasedPricingPlan other = (UsageBasedPricingPlan) o;
        return java.util.Objects.equals(this.pricingPlanKey, other.pricingPlanKey)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.planDescription, other.planDescription)
                && java.util.Objects.equals(this.billingFrequency, other.billingFrequency)
                && java.util.Objects.equals(this.planDuration, other.planDuration)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.pricingPlanKey == null ? 43 : this.pricingPlanKey.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.planDescription == null ? 43 : this.planDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.billingFrequency == null ? 43 : this.billingFrequency.hashCode());
        result = (result * PRIME) + (this.planDuration == null ? 43 : this.planDuration.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        return result;
    }
}
