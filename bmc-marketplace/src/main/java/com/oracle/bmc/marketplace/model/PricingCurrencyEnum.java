/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible values for the pricing currency code.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum PricingCurrencyEnum {
    Usd("USD"),
    ;

    private final String value;
    private static java.util.Map<String, PricingCurrencyEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (PricingCurrencyEnum v : PricingCurrencyEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    PricingCurrencyEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PricingCurrencyEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid PricingCurrencyEnum: " + key);
    }
}
