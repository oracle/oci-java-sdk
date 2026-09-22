/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaidata.model;

/**
 * Controls whether GenerateSqlFromNl, ExecuteSql, or Query waits for execution to finish or submits background execution.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
public enum CompletionMode {
    WaitForCompletion("WAIT_FOR_COMPLETION"),
    BackgroundJob("BACKGROUND_JOB"),
    ;

    private final String value;
    private static java.util.Map<String, CompletionMode> map;

    static {
        map = new java.util.HashMap<>();
        for (CompletionMode v : CompletionMode.values()) {
            map.put(v.getValue(), v);
        }
    }

    CompletionMode(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CompletionMode create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid CompletionMode: " + key);
    }
}
