/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/** Asset type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public enum AssetType implements com.oracle.bmc.http.internal.BmcEnum {
    VmwareVm("VMWARE_VM"),
    Vm("VM"),
    AwsEc2("AWS_EC2"),
    AwsEbs("AWS_EBS"),
    ;

    private final String value;
    private static java.util.Map<String, AssetType> map;

    static {
        map = new java.util.HashMap<>();
        for (AssetType v : AssetType.values()) {
            map.put(v.getValue(), v);
        }
    }

    AssetType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AssetType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AssetType: " + key);
    }
}
