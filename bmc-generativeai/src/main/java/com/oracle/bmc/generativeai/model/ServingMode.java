/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The deployment mode of the model, which can be either ON_DEMAND (the model is hosted in a shared environment and can be accessed on demand) or DEDICATED (the model is hosted in a dedicated environment for better performance and isolation).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public enum ServingMode {
    OnDemand("ON_DEMAND"),
    Dedicated("DEDICATED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ServingMode.class);

    private final String value;
    private static java.util.Map<String, ServingMode> map;

    static {
        map = new java.util.HashMap<>();
        for (ServingMode v : ServingMode.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ServingMode(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ServingMode create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ServingMode', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
