/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Represents the kinds of devices that a virtual machine can boot from.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public enum OlvmBootDevice {
    Cdrom("CDROM"),
    Hd("HD"),
    Network("NETWORK"),
    ;

    private final String value;
    private static java.util.Map<String, OlvmBootDevice> map;

    static {
        map = new java.util.HashMap<>();
        for (OlvmBootDevice v : OlvmBootDevice.values()) {
            map.put(v.getValue(), v);
        }
    }

    OlvmBootDevice(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OlvmBootDevice create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OlvmBootDevice: " + key);
    }
}
