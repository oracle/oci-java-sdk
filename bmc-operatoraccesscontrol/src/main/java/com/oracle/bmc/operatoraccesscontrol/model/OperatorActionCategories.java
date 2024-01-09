/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Operator action categories - "Service Diagnostics: Allows non-privileged read-only access to the
 * layer of the system. No privileged commands are available under this operator action." - "Service
 * Management: Allows non-root services to be restarted and maintained." - "System Management:
 * Allows root services pertinent to the layer to be restarted, all processes to be restarted." -
 * "Full Administration: Allows full root access without any constraints." - "Cell Management: Only
 * applicable to cell server layer of Exadata. Allows cell management actions."
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum OperatorActionCategories implements com.oracle.bmc.http.internal.BmcEnum {
    Servicediagnostics("SERVICEDIAGNOSTICS"),
    Servicemanagement("SERVICEMANAGEMENT"),
    Systemmanagement("SYSTEMMANAGEMENT"),
    Fulladministration("FULLADMINISTRATION"),
    Cellmanagement("CELLMANAGEMENT"),
    ;

    private final String value;
    private static java.util.Map<String, OperatorActionCategories> map;

    static {
        map = new java.util.HashMap<>();
        for (OperatorActionCategories v : OperatorActionCategories.values()) {
            map.put(v.getValue(), v);
        }
    }

    OperatorActionCategories(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperatorActionCategories create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OperatorActionCategories: " + key);
    }
}
