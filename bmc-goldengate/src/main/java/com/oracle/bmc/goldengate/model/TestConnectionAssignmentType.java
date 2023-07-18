/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/** The type of the test to be performed. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum TestConnectionAssignmentType implements com.oracle.bmc.http.internal.BmcEnum {
    Default("DEFAULT"),
    ;

    private final String value;
    private static java.util.Map<String, TestConnectionAssignmentType> map;

    static {
        map = new java.util.HashMap<>();
        for (TestConnectionAssignmentType v : TestConnectionAssignmentType.values()) {
            map.put(v.getValue(), v);
        }
    }

    TestConnectionAssignmentType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TestConnectionAssignmentType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid TestConnectionAssignmentType: " + key);
    }
}
