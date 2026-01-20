/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/** Possible values for a package type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public enum PackageType implements com.oracle.bmc.http.internal.BmcEnum {
    ContainerImage("CONTAINER_IMAGE"),
    HelmChart("HELM_CHART"),
    ;

    private final String value;
    private static java.util.Map<String, PackageType> map;

    static {
        map = new java.util.HashMap<>();
        for (PackageType v : PackageType.values()) {
            map.put(v.getValue(), v);
        }
    }

    PackageType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PackageType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid PackageType: " + key);
    }
}
