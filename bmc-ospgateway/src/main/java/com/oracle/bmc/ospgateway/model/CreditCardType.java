/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Credit card type.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public enum CreditCardType {
    Visa("VISA"),
    Amex("AMEX"),
    Mastercard("MASTERCARD"),
    Discover("DISCOVER"),
    Jcb("JCB"),
    Diner("DINER"),
    Elo("ELO"),
    ;

    private final String value;
    private static java.util.Map<String, CreditCardType> map;

    static {
        map = new java.util.HashMap<>();
        for (CreditCardType v : CreditCardType.values()) {
            map.put(v.getValue(), v);
        }
    }

    CreditCardType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CreditCardType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid CreditCardType: " + key);
    }
}
