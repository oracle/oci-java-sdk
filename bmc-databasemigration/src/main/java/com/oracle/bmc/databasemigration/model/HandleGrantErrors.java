/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * The action taken in the event of errors related to GRANT or REVOKE errors.
 * ABORT - (default) stops the load process and displays an error.
 * DROP_ACCOUNT - deletes the account and continues the load process.
 * IGNORE - ignores the error and continues the load process.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum HandleGrantErrors {
    Abort("ABORT"),
    DropAccount("DROP_ACCOUNT"),
    Ignore("IGNORE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(HandleGrantErrors.class);

    private final String value;
    private static java.util.Map<String, HandleGrantErrors> map;

    static {
        map = new java.util.HashMap<>();
        for (HandleGrantErrors v : HandleGrantErrors.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    HandleGrantErrors(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static HandleGrantErrors create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'HandleGrantErrors', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
