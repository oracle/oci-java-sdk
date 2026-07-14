/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/** The infrastructure type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public enum InfrastructureType implements com.oracle.bmc.http.internal.BmcEnum {
    Cloud("CLOUD"),
    CloudAtCustomer("CLOUD_AT_CUSTOMER"),
    ;

    private final String value;
    private static java.util.Map<String, InfrastructureType> map;

    static {
        map = new java.util.HashMap<>();
        for (InfrastructureType v : InfrastructureType.values()) {
            map.put(v.getValue(), v);
        }
    }

    InfrastructureType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InfrastructureType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid InfrastructureType: " + key);
    }
}
