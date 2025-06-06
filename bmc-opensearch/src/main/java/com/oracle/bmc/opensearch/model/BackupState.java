/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/** The result of a cluster backup operation. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public enum BackupState implements com.oracle.bmc.http.internal.BmcEnum {
    Deleted("DELETED"),
    Success("SUCCESS"),
    Failed("FAILED"),
    ;

    private final String value;
    private static java.util.Map<String, BackupState> map;

    static {
        map = new java.util.HashMap<>();
        for (BackupState v : BackupState.values()) {
            map.put(v.getValue(), v);
        }
    }

    BackupState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static BackupState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid BackupState: " + key);
    }
}
