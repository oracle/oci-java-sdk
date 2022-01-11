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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Currency.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Currency {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currencySymbol")
        private String currencySymbol;

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            this.__explicitlySet__.add("currencySymbol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usdConversion")
        private java.math.BigDecimal usdConversion;

        public Builder usdConversion(java.math.BigDecimal usdConversion) {
            this.usdConversion = usdConversion;
            this.__explicitlySet__.add("usdConversion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("roundDecimalPoint")
        private java.math.BigDecimal roundDecimalPoint;

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

    /**
     * Currency code
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    String currencyCode;

    /**
     * Currency symbol
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencySymbol")
    String currencySymbol;

    /**
     * Name of the currency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * USD conversion rate of the currency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usdConversion")
    java.math.BigDecimal usdConversion;

    /**
     * Round decimal point
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("roundDecimalPoint")
    java.math.BigDecimal roundDecimalPoint;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
