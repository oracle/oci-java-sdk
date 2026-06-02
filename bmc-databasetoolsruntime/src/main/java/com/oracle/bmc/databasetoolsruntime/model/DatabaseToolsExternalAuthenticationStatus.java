/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The status of the external authentication. AVAILABLE if the external authentication can be used with this connection. UNAVAILABLE if not.
 * ENABLED if the external authentication is enabled. UNKNOWN if the user has insufficient privilege.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public enum DatabaseToolsExternalAuthenticationStatus {
    Available("AVAILABLE"),
    Unavailable("UNAVAILABLE"),
    Enabled("ENABLED"),
    Unknown("UNKNOWN"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseToolsExternalAuthenticationStatus.class);

    private final String value;
    private static java.util.Map<String, DatabaseToolsExternalAuthenticationStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (DatabaseToolsExternalAuthenticationStatus v :
                DatabaseToolsExternalAuthenticationStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DatabaseToolsExternalAuthenticationStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DatabaseToolsExternalAuthenticationStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DatabaseToolsExternalAuthenticationStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
