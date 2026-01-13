/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/** Type of Windows software update. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public enum WindowsUpdateTypes implements com.oracle.bmc.http.internal.BmcEnum {
    Security("SECURITY"),
    Bugfix("BUGFIX"),
    Enhancement("ENHANCEMENT"),
    Other("OTHER"),
    All("ALL"),
    ;

    private final String value;
    private static java.util.Map<String, WindowsUpdateTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (WindowsUpdateTypes v : WindowsUpdateTypes.values()) {
            map.put(v.getValue(), v);
        }
    }

    WindowsUpdateTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WindowsUpdateTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid WindowsUpdateTypes: " + key);
    }
}
