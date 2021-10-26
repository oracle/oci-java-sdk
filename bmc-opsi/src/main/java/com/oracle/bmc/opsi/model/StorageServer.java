/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Displays exadata storage server resource metrics
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum StorageServer {
    Storage("STORAGE"),
    Iops("IOPS"),
    Throughput("THROUGHPUT"),
    ;

    private final String value;
    private static java.util.Map<String, StorageServer> map;

    static {
        map = new java.util.HashMap<>();
        for (StorageServer v : StorageServer.values()) {
            map.put(v.getValue(), v);
        }
    }

    StorageServer(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static StorageServer create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid StorageServer: " + key);
    }
}
