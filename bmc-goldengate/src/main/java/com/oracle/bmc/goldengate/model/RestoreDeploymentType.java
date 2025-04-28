/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/** The deployment restore type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum RestoreDeploymentType implements com.oracle.bmc.http.internal.BmcEnum {
    Default("DEFAULT"),
    ;

    private final String value;
    private static java.util.Map<String, RestoreDeploymentType> map;

    static {
        map = new java.util.HashMap<>();
        for (RestoreDeploymentType v : RestoreDeploymentType.values()) {
            map.put(v.getValue(), v);
        }
    }

    RestoreDeploymentType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RestoreDeploymentType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid RestoreDeploymentType: " + key);
    }
}
