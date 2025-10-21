/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * How the maintenance event was triggered.
 *
 * <p>AUTOMATIC: maintenance event triggered as part of scheduled maintenance. MANUAL: maintenance
 * event triggered manually. SHAPE: maintenance event triggered by a shape update.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum MaintenanceType implements com.oracle.bmc.http.internal.BmcEnum {
    Automatic("AUTOMATIC"),
    Manual("MANUAL"),
    Shape("SHAPE"),
    ;

    private final String value;
    private static java.util.Map<String, MaintenanceType> map;

    static {
        map = new java.util.HashMap<>();
        for (MaintenanceType v : MaintenanceType.values()) {
            map.put(v.getValue(), v);
        }
    }

    MaintenanceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MaintenanceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MaintenanceType: " + key);
    }
}
