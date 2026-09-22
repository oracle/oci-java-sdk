/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Sku details for private offers
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
    builder = AdminPublisherSku.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdminPublisherSku extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"productCode", "description", "meter", "rates"})
    public AdminPublisherSku(
            String productCode,
            String description,
            String meter,
            java.util.List<AdminSkuPricingRate> rates) {
        super();
        this.productCode = productCode;
        this.description = description;
        this.meter = meter;
        this.rates = rates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Sku name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productCode")
        private String productCode;

        /**
         * Sku name
         * @param productCode the value to set
         * @return this builder
         **/
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            this.__explicitlySet__.add("productCode");
            return this;
        }
        /**
         * Sku description
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Sku description
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The meter of the SKU.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("meter")
        private String meter;

        /**
         * The meter of the SKU.
         * @param meter the value to set
         * @return this builder
         **/
        public Builder meter(String meter) {
            this.meter = meter;
            this.__explicitlySet__.add("meter");
            return this;
        }
        /**
         * List of pricing rates for listing
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rates")
        private java.util.List<AdminSkuPricingRate> rates;

        /**
         * List of pricing rates for listing
         * @param rates the value to set
         * @return this builder
         **/
        public Builder rates(java.util.List<AdminSkuPricingRate> rates) {
            this.rates = rates;
            this.__explicitlySet__.add("rates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdminPublisherSku build() {
            AdminPublisherSku model =
                    new AdminPublisherSku(
                            this.productCode, this.description, this.meter, this.rates);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminPublisherSku model) {
            if (model.wasPropertyExplicitlySet("productCode")) {
                this.productCode(model.getProductCode());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("meter")) {
                this.meter(model.getMeter());
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
     * Sku name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productCode")
    private final String productCode;

    /**
     * Sku name
     * @return the value
     **/
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sku description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Sku description
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The meter of the SKU.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("meter")
    private final String meter;

    /**
     * The meter of the SKU.
     * @return the value
     **/
    public String getMeter() {
        return meter;
    }

    /**
     * List of pricing rates for listing
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rates")
    private final java.util.List<AdminSkuPricingRate> rates;

    /**
     * List of pricing rates for listing
     * @return the value
     **/
    public java.util.List<AdminSkuPricingRate> getRates() {
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
        sb.append("AdminPublisherSku(");
        sb.append("super=").append(super.toString());
        sb.append("productCode=").append(String.valueOf(this.productCode));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", meter=").append(String.valueOf(this.meter));
        sb.append(", rates=").append(String.valueOf(this.rates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdminPublisherSku)) {
            return false;
        }

        AdminPublisherSku other = (AdminPublisherSku) o;
        return java.util.Objects.equals(this.productCode, other.productCode)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.meter, other.meter)
                && java.util.Objects.equals(this.rates, other.rates)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.productCode == null ? 43 : this.productCode.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.meter == null ? 43 : this.meter.hashCode());
        result = (result * PRIME) + (this.rates == null ? 43 : this.rates.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
