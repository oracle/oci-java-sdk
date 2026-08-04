/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * A metered usage dimension associated with a usage-based or hybrid pricing plan. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsageDimension.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsageDimension
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dimensionName",
        "dimensionKey",
        "dimensionDescription",
        "metricType",
        "dimensionBillingFrequency",
        "includedQuantity",
        "rates"
    })
    public UsageDimension(
            String dimensionName,
            String dimensionKey,
            String dimensionDescription,
            MetricType metricType,
            BillingFrequency dimensionBillingFrequency,
            Float includedQuantity,
            java.util.List<PricingRate> rates) {
        super();
        this.dimensionName = dimensionName;
        this.dimensionKey = dimensionKey;
        this.dimensionDescription = dimensionDescription;
        this.metricType = metricType;
        this.dimensionBillingFrequency = dimensionBillingFrequency;
        this.includedQuantity = includedQuantity;
        this.rates = rates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the usage dimension. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
        private String dimensionName;

        /**
         * The name of the usage dimension.
         *
         * @param dimensionName the value to set
         * @return this builder
         */
        public Builder dimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            this.__explicitlySet__.add("dimensionName");
            return this;
        }
        /** The stable key used internally to map this usage dimension to billing details. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionKey")
        private String dimensionKey;

        /**
         * The stable key used internally to map this usage dimension to billing details.
         *
         * @param dimensionKey the value to set
         * @return this builder
         */
        public Builder dimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            this.__explicitlySet__.add("dimensionKey");
            return this;
        }
        /** A detailed explanation of the usage dimension. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionDescription")
        private String dimensionDescription;

        /**
         * A detailed explanation of the usage dimension.
         *
         * @param dimensionDescription the value to set
         * @return this builder
         */
        public Builder dimensionDescription(String dimensionDescription) {
            this.dimensionDescription = dimensionDescription;
            this.__explicitlySet__.add("dimensionDescription");
            return this;
        }
        /** The metric type in which usage is measured. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricType")
        private MetricType metricType;

        /**
         * The metric type in which usage is measured.
         *
         * @param metricType the value to set
         * @return this builder
         */
        public Builder metricType(MetricType metricType) {
            this.metricType = metricType;
            this.__explicitlySet__.add("metricType");
            return this;
        }
        /** Specifies the interval at which the usage dimension is billed. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionBillingFrequency")
        private BillingFrequency dimensionBillingFrequency;

        /**
         * Specifies the interval at which the usage dimension is billed.
         *
         * @param dimensionBillingFrequency the value to set
         * @return this builder
         */
        public Builder dimensionBillingFrequency(BillingFrequency dimensionBillingFrequency) {
            this.dimensionBillingFrequency = dimensionBillingFrequency;
            this.__explicitlySet__.add("dimensionBillingFrequency");
            return this;
        }
        /** Quantity included in the base fee for hybrid plans. */
        @com.fasterxml.jackson.annotation.JsonProperty("includedQuantity")
        private Float includedQuantity;

        /**
         * Quantity included in the base fee for hybrid plans.
         *
         * @param includedQuantity the value to set
         * @return this builder
         */
        public Builder includedQuantity(Float includedQuantity) {
            this.includedQuantity = includedQuantity;
            this.__explicitlySet__.add("includedQuantity");
            return this;
        }
        /** Dimension-level rates in various supported currencies. */
        @com.fasterxml.jackson.annotation.JsonProperty("rates")
        private java.util.List<PricingRate> rates;

        /**
         * Dimension-level rates in various supported currencies.
         *
         * @param rates the value to set
         * @return this builder
         */
        public Builder rates(java.util.List<PricingRate> rates) {
            this.rates = rates;
            this.__explicitlySet__.add("rates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageDimension build() {
            UsageDimension model =
                    new UsageDimension(
                            this.dimensionName,
                            this.dimensionKey,
                            this.dimensionDescription,
                            this.metricType,
                            this.dimensionBillingFrequency,
                            this.includedQuantity,
                            this.rates);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageDimension model) {
            if (model.wasPropertyExplicitlySet("dimensionName")) {
                this.dimensionName(model.getDimensionName());
            }
            if (model.wasPropertyExplicitlySet("dimensionKey")) {
                this.dimensionKey(model.getDimensionKey());
            }
            if (model.wasPropertyExplicitlySet("dimensionDescription")) {
                this.dimensionDescription(model.getDimensionDescription());
            }
            if (model.wasPropertyExplicitlySet("metricType")) {
                this.metricType(model.getMetricType());
            }
            if (model.wasPropertyExplicitlySet("dimensionBillingFrequency")) {
                this.dimensionBillingFrequency(model.getDimensionBillingFrequency());
            }
            if (model.wasPropertyExplicitlySet("includedQuantity")) {
                this.includedQuantity(model.getIncludedQuantity());
            }
            if (model.wasPropertyExplicitlySet("rates")) {
                this.rates(model.getRates());
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

    /** The name of the usage dimension. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
    private final String dimensionName;

    /**
     * The name of the usage dimension.
     *
     * @return the value
     */
    public String getDimensionName() {
        return dimensionName;
    }

    /** The stable key used internally to map this usage dimension to billing details. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionKey")
    private final String dimensionKey;

    /**
     * The stable key used internally to map this usage dimension to billing details.
     *
     * @return the value
     */
    public String getDimensionKey() {
        return dimensionKey;
    }

    /** A detailed explanation of the usage dimension. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionDescription")
    private final String dimensionDescription;

    /**
     * A detailed explanation of the usage dimension.
     *
     * @return the value
     */
    public String getDimensionDescription() {
        return dimensionDescription;
    }

    /** The metric type in which usage is measured. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricType")
    private final MetricType metricType;

    /**
     * The metric type in which usage is measured.
     *
     * @return the value
     */
    public MetricType getMetricType() {
        return metricType;
    }

    /** Specifies the interval at which the usage dimension is billed. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionBillingFrequency")
    private final BillingFrequency dimensionBillingFrequency;

    /**
     * Specifies the interval at which the usage dimension is billed.
     *
     * @return the value
     */
    public BillingFrequency getDimensionBillingFrequency() {
        return dimensionBillingFrequency;
    }

    /** Quantity included in the base fee for hybrid plans. */
    @com.fasterxml.jackson.annotation.JsonProperty("includedQuantity")
    private final Float includedQuantity;

    /**
     * Quantity included in the base fee for hybrid plans.
     *
     * @return the value
     */
    public Float getIncludedQuantity() {
        return includedQuantity;
    }

    /** Dimension-level rates in various supported currencies. */
    @com.fasterxml.jackson.annotation.JsonProperty("rates")
    private final java.util.List<PricingRate> rates;

    /**
     * Dimension-level rates in various supported currencies.
     *
     * @return the value
     */
    public java.util.List<PricingRate> getRates() {
        return rates;
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
        sb.append("UsageDimension(");
        sb.append("super=").append(super.toString());
        sb.append("dimensionName=").append(String.valueOf(this.dimensionName));
        sb.append(", dimensionKey=").append(String.valueOf(this.dimensionKey));
        sb.append(", dimensionDescription=").append(String.valueOf(this.dimensionDescription));
        sb.append(", metricType=").append(String.valueOf(this.metricType));
        sb.append(", dimensionBillingFrequency=")
                .append(String.valueOf(this.dimensionBillingFrequency));
        sb.append(", includedQuantity=").append(String.valueOf(this.includedQuantity));
        sb.append(", rates=").append(String.valueOf(this.rates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageDimension)) {
            return false;
        }

        UsageDimension other = (UsageDimension) o;
        return java.util.Objects.equals(this.dimensionName, other.dimensionName)
                && java.util.Objects.equals(this.dimensionKey, other.dimensionKey)
                && java.util.Objects.equals(this.dimensionDescription, other.dimensionDescription)
                && java.util.Objects.equals(this.metricType, other.metricType)
                && java.util.Objects.equals(
                        this.dimensionBillingFrequency, other.dimensionBillingFrequency)
                && java.util.Objects.equals(this.includedQuantity, other.includedQuantity)
                && java.util.Objects.equals(this.rates, other.rates)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dimensionName == null ? 43 : this.dimensionName.hashCode());
        result = (result * PRIME) + (this.dimensionKey == null ? 43 : this.dimensionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionDescription == null
                                ? 43
                                : this.dimensionDescription.hashCode());
        result = (result * PRIME) + (this.metricType == null ? 43 : this.metricType.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionBillingFrequency == null
                                ? 43
                                : this.dimensionBillingFrequency.hashCode());
        result =
                (result * PRIME)
                        + (this.includedQuantity == null ? 43 : this.includedQuantity.hashCode());
        result = (result * PRIME) + (this.rates == null ? 43 : this.rates.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
