/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/** Credit card type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public enum CreditCardType implements com.oracle.bmc.http.internal.BmcEnum {
    Visa("VISA"),
    Amex("AMEX"),
    Mastercard("MASTERCARD"),
    Discover("DISCOVER"),
    Jcb("JCB"),
    Diner("DINER"),
    Elo("ELO"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CreditCardType.class);

    private final String value;
    private static java.util.Map<String, CreditCardType> map;

    static {
        map = new java.util.HashMap<>();
        for (CreditCardType v : CreditCardType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
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
        LOG.warn(
                "Received unknown value '{}' for enum 'CreditCardType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
