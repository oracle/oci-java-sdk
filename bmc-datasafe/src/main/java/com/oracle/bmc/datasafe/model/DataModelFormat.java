/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/** The format of the sensitive data model file. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum DataModelFormat implements com.oracle.bmc.http.internal.BmcEnum {
    Xml("XML"),
    ;

    private final String value;
    private static java.util.Map<String, DataModelFormat> map;

    static {
        map = new java.util.HashMap<>();
        for (DataModelFormat v : DataModelFormat.values()) {
            map.put(v.getValue(), v);
        }
    }

    DataModelFormat(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DataModelFormat create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DataModelFormat: " + key);
    }
}
