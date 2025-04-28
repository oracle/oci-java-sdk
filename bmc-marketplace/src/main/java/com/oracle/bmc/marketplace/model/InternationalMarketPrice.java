/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for international market pricing. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InternationalMarketPrice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InternationalMarketPrice
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"currencyCode", "currencySymbol", "rate"})
    public InternationalMarketPrice(
            PricingCurrencyEnum currencyCode, String currencySymbol, Double rate) {
        super();
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.rate = rate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The currency of the pricing model. */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private PricingCurrencyEnum currencyCode;

        /**
         * The currency of the pricing model.
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(PricingCurrencyEnum currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** The symbol of the currency */
        @com.fasterxml.jackson.annotation.JsonProperty("currencySymbol")
        private String currencySymbol;

        /**
         * The symbol of the currency
         *
         * @param currencySymbol the value to set
         * @return this builder
         */
        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            this.__explicitlySet__.add("currencySymbol");
            return this;
        }
        /** The pricing rate. */
        @com.fasterxml.jackson.annotation.JsonProperty("rate")
        private Double rate;

        /**
         * The pricing rate.
         *
         * @param rate the value to set
         * @return this builder
         */
        public Builder rate(Double rate) {
            this.rate = rate;
            this.__explicitlySet__.add("rate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InternationalMarketPrice build() {
            InternationalMarketPrice model =
                    new InternationalMarketPrice(this.currencyCode, this.currencySymbol, this.rate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InternationalMarketPrice model) {
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("currencySymbol")) {
                this.currencySymbol(model.getCurrencySymbol());
            }
            if (model.wasPropertyExplicitlySet("rate")) {
                this.rate(model.getRate());
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

    /** The currency of the pricing model. */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final PricingCurrencyEnum currencyCode;

    /**
     * The currency of the pricing model.
     *
     * @return the value
     */
    public PricingCurrencyEnum getCurrencyCode() {
        return currencyCode;
    }

    /** The symbol of the currency */
    @com.fasterxml.jackson.annotation.JsonProperty("currencySymbol")
    private final String currencySymbol;

    /**
     * The symbol of the currency
     *
     * @return the value
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /** The pricing rate. */
    @com.fasterxml.jackson.annotation.JsonProperty("rate")
    private final Double rate;

    /**
     * The pricing rate.
     *
     * @return the value
     */
    public Double getRate() {
        return rate;
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
        sb.append("InternationalMarketPrice(");
        sb.append("super=").append(super.toString());
        sb.append("currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", currencySymbol=").append(String.valueOf(this.currencySymbol));
        sb.append(", rate=").append(String.valueOf(this.rate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InternationalMarketPrice)) {
            return false;
        }

        InternationalMarketPrice other = (InternationalMarketPrice) o;
        return java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.currencySymbol, other.currencySymbol)
                && java.util.Objects.equals(this.rate, other.rate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result =
                (result * PRIME)
                        + (this.currencySymbol == null ? 43 : this.currencySymbol.hashCode());
        result = (result * PRIME) + (this.rate == null ? 43 : this.rate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
