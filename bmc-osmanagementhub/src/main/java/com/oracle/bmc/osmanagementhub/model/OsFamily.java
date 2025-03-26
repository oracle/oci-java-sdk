/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Type of operating system.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public enum OsFamily {
    OracleLinux9("ORACLE_LINUX_9"),
    OracleLinux8("ORACLE_LINUX_8"),
    OracleLinux7("ORACLE_LINUX_7"),
    OracleLinux6("ORACLE_LINUX_6"),
    WindowsServer2016("WINDOWS_SERVER_2016"),
    WindowsServer2019("WINDOWS_SERVER_2019"),
    WindowsServer2022("WINDOWS_SERVER_2022"),
    All("ALL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(OsFamily.class);

    private final String value;
    private static java.util.Map<String, OsFamily> map;

    static {
        map = new java.util.HashMap<>();
        for (OsFamily v : OsFamily.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OsFamily(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OsFamily create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OsFamily', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
