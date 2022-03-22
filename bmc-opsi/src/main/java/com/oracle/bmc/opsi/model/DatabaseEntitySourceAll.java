/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Source of the database entity.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.extern.slf4j.Slf4j
public enum DatabaseEntitySourceAll {
    AutonomousDatabase("AUTONOMOUS_DATABASE"),
    EmManagedExternalDatabase("EM_MANAGED_EXTERNAL_DATABASE"),
    MacsManagedExternalDatabase("MACS_MANAGED_EXTERNAL_DATABASE"),
    PeComanagedDatabase("PE_COMANAGED_DATABASE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, DatabaseEntitySourceAll> map;

    static {
        map = new java.util.HashMap<>();
        for (DatabaseEntitySourceAll v : DatabaseEntitySourceAll.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DatabaseEntitySourceAll(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DatabaseEntitySourceAll create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DatabaseEntitySourceAll', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
