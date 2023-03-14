/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/** Enum for attributeSets. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public enum AttributeSets implements com.oracle.bmc.http.internal.BmcEnum {
    All("all"),
    Always("always"),
    Never("never"),
    Request("request"),
    Default("default"),
    ;

    private final String value;
    private static java.util.Map<String, AttributeSets> map;

    static {
        map = new java.util.HashMap<>();
        for (AttributeSets v : AttributeSets.values()) {
            map.put(v.getValue(), v);
        }
    }

    AttributeSets(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AttributeSets create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AttributeSets: " + key);
    }
}
