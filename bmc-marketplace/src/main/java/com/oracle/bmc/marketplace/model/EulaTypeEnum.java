/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/** Possible values for end user license agreement (EULA) formats. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum EulaTypeEnum implements com.oracle.bmc.http.internal.BmcEnum {
    Text("TEXT"),
    ;

    private final String value;
    private static java.util.Map<String, EulaTypeEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (EulaTypeEnum v : EulaTypeEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    EulaTypeEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static EulaTypeEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid EulaTypeEnum: " + key);
    }
}
