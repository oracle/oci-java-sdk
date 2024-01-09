/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/** The kinds of Bot creation. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public enum CreateBotKind implements com.oracle.bmc.http.internal.BmcEnum {
    New("NEW"),
    Clone("CLONE"),
    Version("VERSION"),
    Extend("EXTEND"),
    ;

    private final String value;
    private static java.util.Map<String, CreateBotKind> map;

    static {
        map = new java.util.HashMap<>();
        for (CreateBotKind v : CreateBotKind.values()) {
            map.put(v.getValue(), v);
        }
    }

    CreateBotKind(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CreateBotKind create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid CreateBotKind: " + key);
    }
}
