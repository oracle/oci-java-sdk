/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The nature of the maintenance event.
 * <p>
 * DATABASE:  maintenance event causing a MySQL version upgrade. This may also include OS updates.
 * OS_UPDATE: maintenance event causing an OS update.
 * ONLINE_UPDATE: maintenance event causing downtime-free OS security patches.
 * HARDWARE: hardware maintenance event affecting the DB System's VMs and BMs.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum MaintenanceAction {
    Database("DATABASE"),
    OsUpdate("OS_UPDATE"),
    OnlineUpdate("ONLINE_UPDATE"),
    Hardware("HARDWARE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MaintenanceAction.class);

    private final String value;
    private static java.util.Map<String, MaintenanceAction> map;

    static {
        map = new java.util.HashMap<>();
        for (MaintenanceAction v : MaintenanceAction.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MaintenanceAction(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MaintenanceAction create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MaintenanceAction', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
