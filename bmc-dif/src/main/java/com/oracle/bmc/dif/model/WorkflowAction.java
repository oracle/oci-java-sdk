/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/** Action to be done over the user. Allowed values are "CREATE" or "UPDATE". */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
public enum WorkflowAction implements com.oracle.bmc.http.internal.BmcEnum {
    Create("CREATE"),
    Update("UPDATE"),
    ;

    private final String value;
    private static java.util.Map<String, WorkflowAction> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkflowAction v : WorkflowAction.values()) {
            map.put(v.getValue(), v);
        }
    }

    WorkflowAction(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkflowAction create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid WorkflowAction: " + key);
    }
}
