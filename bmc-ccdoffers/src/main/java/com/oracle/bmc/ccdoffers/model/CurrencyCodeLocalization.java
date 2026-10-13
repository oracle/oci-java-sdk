/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * The currency code and its listing price. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CurrencyCodeLocalization.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CurrencyCodeLocalization
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"currencyCode", "prices"})
    public CurrencyCodeLocalization(String currencyCode, java.util.List<Prices> prices) {
        super();
        this.currencyCode = currencyCode;
        this.prices = prices;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The currency code. */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * The currency code.
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** The pricing model associated with the currency code. */
        @com.fasterxml.jackson.annotation.JsonProperty("prices")
        private java.util.List<Prices> prices;

        /**
         * The pricing model associated with the currency code.
         *
         * @param prices the value to set
         * @return this builder
         */
        public Builder prices(java.util.List<Prices> prices) {
            this.prices = prices;
            this.__explicitlySet__.add("prices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CurrencyCodeLocalization build() {
            CurrencyCodeLocalization model =
                    new CurrencyCodeLocalization(this.currencyCode, this.prices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CurrencyCodeLocalization model) {
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("prices")) {
                this.prices(model.getPrices());
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

    /** The currency code. */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * The currency code.
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** The pricing model associated with the currency code. */
    @com.fasterxml.jackson.annotation.JsonProperty("prices")
    private final java.util.List<Prices> prices;

    /**
     * The pricing model associated with the currency code.
     *
     * @return the value
     */
    public java.util.List<Prices> getPrices() {
        return prices;
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
        sb.append("CurrencyCodeLocalization(");
        sb.append("super=").append(super.toString());
        sb.append("currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", prices=").append(String.valueOf(this.prices));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CurrencyCodeLocalization)) {
            return false;
        }

        CurrencyCodeLocalization other = (CurrencyCodeLocalization) o;
        return java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.prices, other.prices)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result = (result * PRIME) + (this.prices == null ? 43 : this.prices.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
