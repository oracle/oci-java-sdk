/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/** Posible Named Entity Recognition versions. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public enum NerModelVersion implements com.oracle.bmc.http.internal.BmcEnum {
    V21("V2_1"),
    V11("V1_1"),
    ;

    private final String value;
    private static java.util.Map<String, NerModelVersion> map;

    static {
        map = new java.util.HashMap<>();
        for (NerModelVersion v : NerModelVersion.values()) {
            map.put(v.getValue(), v);
        }
    }

    NerModelVersion(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static NerModelVersion create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid NerModelVersion: " + key);
    }
}
