/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/** The supported work request {@code sort by} columns. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public enum WorkRequestSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    Id("id"),
    OperationType("operationType"),
    Status("status"),
    TimeAccepted("timeAccepted"),
    TimeStarted("timeStarted"),
    TimeFinished("timeFinished"),
    ;

    private final String value;
    private static java.util.Map<String, WorkRequestSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestSortBy v : WorkRequestSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    WorkRequestSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid WorkRequestSortBy: " + key);
    }
}
