/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Defines the hierarchical scope of the tasks to be returned. When set to SHALLOW, which is
 * default, only tasks contained directly (non-recursively) within current hierarchy entry are
 * returned. When set to DEEP, tasks contained within current hierarchy entry and all its
 * descendants recursively are returned. The default hierarchy entry is root, i.e. batch job itself.
 * To use a different hierarchy entry, provide the group task name as a query parameter. The
 * specified group task becomes the entry point instead of the batch job.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public enum BatchTaskHierarchyView implements com.oracle.bmc.http.internal.BmcEnum {
    Shallow("SHALLOW"),
    Deep("DEEP"),
    ;

    private final String value;
    private static java.util.Map<String, BatchTaskHierarchyView> map;

    static {
        map = new java.util.HashMap<>();
        for (BatchTaskHierarchyView v : BatchTaskHierarchyView.values()) {
            map.put(v.getValue(), v);
        }
    }

    BatchTaskHierarchyView(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static BatchTaskHierarchyView create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid BatchTaskHierarchyView: " + key);
    }
}
