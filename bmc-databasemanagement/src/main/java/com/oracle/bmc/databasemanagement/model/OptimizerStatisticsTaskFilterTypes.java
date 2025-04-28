/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Indicates which Gather Optimizer Statistics Collection or Optimizer Statistics Advisor tasks
 * should be filtered.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum OptimizerStatisticsTaskFilterTypes implements com.oracle.bmc.http.internal.BmcEnum {
    All("ALL"),
    Manual("MANUAL"),
    Auto("AUTO"),
    ;

    private final String value;
    private static java.util.Map<String, OptimizerStatisticsTaskFilterTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (OptimizerStatisticsTaskFilterTypes v : OptimizerStatisticsTaskFilterTypes.values()) {
            map.put(v.getValue(), v);
        }
    }

    OptimizerStatisticsTaskFilterTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OptimizerStatisticsTaskFilterTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OptimizerStatisticsTaskFilterTypes: " + key);
    }
}
