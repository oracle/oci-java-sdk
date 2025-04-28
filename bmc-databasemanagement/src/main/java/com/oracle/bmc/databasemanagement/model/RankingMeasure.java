/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Defines an ORDER BY clause on the selected SQL represented by SQLSET_ROW object. Possible values
 * are defined in the enum structure below.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum RankingMeasure implements com.oracle.bmc.http.internal.BmcEnum {
    ElapsedTime("ELAPSED_TIME"),
    CpuTime("CPU_TIME"),
    OptimizerCost("OPTIMIZER_COST"),
    BufferGets("BUFFER_GETS"),
    DiskReads("DISK_READS"),
    DirectWrites("DIRECT_WRITES"),
    ;

    private final String value;
    private static java.util.Map<String, RankingMeasure> map;

    static {
        map = new java.util.HashMap<>();
        for (RankingMeasure v : RankingMeasure.values()) {
            map.put(v.getValue(), v);
        }
    }

    RankingMeasure(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RankingMeasure create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid RankingMeasure: " + key);
    }
}
