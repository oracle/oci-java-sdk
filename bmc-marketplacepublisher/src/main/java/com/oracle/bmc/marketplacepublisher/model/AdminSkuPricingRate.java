/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * A pricing plan rate for listing sku.
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
    builder = AdminSkuPricingRate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdminSkuPricingRate extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"currencyCode", "unitPrice"})
    public AdminSkuPricingRate(String currencyCode, Float unitPrice) {
        super();
        this.currencyCode = currencyCode;
        this.unitPrice = unitPrice;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The currency supported, in the format specified by ISO-4217
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * The currency supported, in the format specified by ISO-4217
         * @param currencyCode the value to set
         * @return this builder
         **/
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /**
         * The amount for the currency type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
        private Float unitPrice;

        /**
         * The amount for the currency type.
         * @param unitPrice the value to set
         * @return this builder
         **/
        public Builder unitPrice(Float unitPrice) {
            this.unitPrice = unitPrice;
            this.__explicitlySet__.add("unitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdminSkuPricingRate build() {
            AdminSkuPricingRate model = new AdminSkuPricingRate(this.currencyCode, this.unitPrice);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminSkuPricingRate model) {
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("unitPrice")) {
                this.unitPrice(model.getUnitPrice());
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
     * The currency supported, in the format specified by ISO-4217
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * The currency supported, in the format specified by ISO-4217
     * @return the value
     **/
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * The amount for the currency type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    private final Float unitPrice;

    /**
     * The amount for the currency type.
     * @return the value
     **/
    public Float getUnitPrice() {
        return unitPrice;
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
        sb.append("AdminSkuPricingRate(");
        sb.append("super=").append(super.toString());
        sb.append("currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", unitPrice=").append(String.valueOf(this.unitPrice));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdminSkuPricingRate)) {
            return false;
        }

        AdminSkuPricingRate other = (AdminSkuPricingRate) o;
        return java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.unitPrice, other.unitPrice)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result = (result * PRIME) + (this.unitPrice == null ? 43 : this.unitPrice.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
