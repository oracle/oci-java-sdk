/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Supported Datatypes.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public enum Datatypes {
    Long("LONG"),
    Double("DOUBLE"),
    Integer("INTEGER"),
    String("STRING"),
    Boolean("BOOLEAN"),
    ;

    private final String value;
    private static java.util.Map<String, Datatypes> map;

    static {
        map = new java.util.HashMap<>();
        for (Datatypes v : Datatypes.values()) {
            map.put(v.getValue(), v);
        }
    }

    Datatypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Datatypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid Datatypes: " + key);
    }
}
