/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/** Possible Dimensions for distinguishing Responder Executions */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public enum ResponderDimension implements com.oracle.bmc.http.internal.BmcEnum {
    ResponderRuleType("RESPONDER_RULE_TYPE"),
    ResponderExecutionStatus("RESPONDER_EXECUTION_STATUS"),
    ;

    private final String value;
    private static java.util.Map<String, ResponderDimension> map;

    static {
        map = new java.util.HashMap<>();
        for (ResponderDimension v : ResponderDimension.values()) {
            map.put(v.getValue(), v);
        }
    }

    ResponderDimension(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ResponderDimension create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ResponderDimension: " + key);
    }
}
