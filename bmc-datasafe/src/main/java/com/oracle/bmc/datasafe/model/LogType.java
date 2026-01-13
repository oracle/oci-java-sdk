/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/** The type of log to be added as an allowed sql. Allowed values are - VIOLATION_LOG */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum LogType implements com.oracle.bmc.http.internal.BmcEnum {
    ViolationLog("VIOLATION_LOG"),
    ;

    private final String value;
    private static java.util.Map<String, LogType> map;

    static {
        map = new java.util.HashMap<>();
        for (LogType v : LogType.values()) {
            map.put(v.getValue(), v);
        }
    }

    LogType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LogType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid LogType: " + key);
    }
}
