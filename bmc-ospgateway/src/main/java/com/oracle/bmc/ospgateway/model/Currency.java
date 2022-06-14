/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Currency details model
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Currency.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Currency {
    @Deprecated
    @java.beans.ConstructorProperties({
        "currencyCode",
        "currencySymbol",
        "name",
        "usdConversion",
        "roundDecimalPoint"
    })
    public Currency(
            String currencyCode,
            String currencySymbol,
            String name,
            java.math.BigDecimal usdConversion,
            java.math.BigDecimal roundDecimalPoint) {
        super();
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.name = name;
        this.usdConversion = usdConversion;
        this.roundDecimalPoint = roundDecimalPoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Currency code
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * Currency code
         * @param currencyCode the value to set
         * @return this builder
         **/
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /**
         * Currency symbol
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currencySymbol")
        private String currencySymbol;

        /**
         * Currency symbol
         * @param currencySymbol the value to set
         * @return this builder
         **/
        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            this.__explicitlySet__.add("currencySymbol");
            return this;
        }
        /**
         * Name of the currency
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the currency
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * USD conversion rate of the currency
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usdConversion")
        private java.math.BigDecimal usdConversion;

        /**
         * USD conversion rate of the currency
         * @param usdConversion the value to set
         * @return this builder
         **/
        public Builder usdConversion(java.math.BigDecimal usdConversion) {
            this.usdConversion = usdConversion;
            this.__explicitlySet__.add("usdConversion");
            return this;
        }
        /**
         * Round decimal point
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("roundDecimalPoint")
        private java.math.BigDecimal roundDecimalPoint;

        /**
         * Round decimal point
         * @param roundDecimalPoint the value to set
         * @return this builder
         **/
        public Builder roundDecimalPoint(java.math.BigDecimal roundDecimalPoint) {
            this.roundDecimalPoint = roundDecimalPoint;
            this.__explicitlySet__.add("roundDecimalPoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Currency build() {
            Currency __instance__ =
                    new Currency(
                            currencyCode, currencySymbol, name, usdConversion, roundDecimalPoint);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Currency o) {
            Builder copiedBuilder =
                    currencyCode(o.getCurrencyCode())
                            .currencySymbol(o.getCurrencySymbol())
                            .name(o.getName())
                            .usdConversion(o.getUsdConversion())
                            .roundDecimalPoint(o.getRoundDecimalPoint());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Currency code
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * Currency code
     * @return the value
     **/
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Currency symbol
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencySymbol")
    private final String currencySymbol;

    /**
     * Currency symbol
     * @return the value
     **/
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Name of the currency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the currency
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * USD conversion rate of the currency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usdConversion")
    private final java.math.BigDecimal usdConversion;

    /**
     * USD conversion rate of the currency
     * @return the value
     **/
    public java.math.BigDecimal getUsdConversion() {
        return usdConversion;
    }

    /**
     * Round decimal point
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("roundDecimalPoint")
    private final java.math.BigDecimal roundDecimalPoint;

    /**
     * Round decimal point
     * @return the value
     **/
    public java.math.BigDecimal getRoundDecimalPoint() {
        return roundDecimalPoint;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Currency(");
        sb.append("currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", currencySymbol=").append(String.valueOf(this.currencySymbol));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", usdConversion=").append(String.valueOf(this.usdConversion));
        sb.append(", roundDecimalPoint=").append(String.valueOf(this.roundDecimalPoint));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Currency)) {
            return false;
        }

        Currency other = (Currency) o;
        return java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.currencySymbol, other.currencySymbol)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.usdConversion, other.usdConversion)
                && java.util.Objects.equals(this.roundDecimalPoint, other.roundDecimalPoint)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result =
                (result * PRIME)
                        + (this.currencySymbol == null ? 43 : this.currencySymbol.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.usdConversion == null ? 43 : this.usdConversion.hashCode());
        result =
                (result * PRIME)
                        + (this.roundDecimalPoint == null ? 43 : this.roundDecimalPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
