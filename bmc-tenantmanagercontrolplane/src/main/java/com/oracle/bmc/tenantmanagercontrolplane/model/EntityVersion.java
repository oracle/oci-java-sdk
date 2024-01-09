/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The entity version of the subscription, whether V1 (the legacy schema version), or V2 (the latest
 * 20230401 API version).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public enum EntityVersion implements com.oracle.bmc.http.internal.BmcEnum {
    V1("V1"),
    V2("V2"),
    ;

    private final String value;
    private static java.util.Map<String, EntityVersion> map;

    static {
        map = new java.util.HashMap<>();
        for (EntityVersion v : EntityVersion.values()) {
            map.put(v.getValue(), v);
        }
    }

    EntityVersion(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static EntityVersion create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid EntityVersion: " + key);
    }
}
