/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The SSL mode of the Channel.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum SslMode {
    VerifyIdentity("VERIFY_IDENTITY"),
    VerifyCa("VERIFY_CA"),
    Required("REQUIRED"),
    Disabled("DISABLED"),
    ;

    private final String value;
    private static java.util.Map<String, SslMode> map;

    static {
        map = new java.util.HashMap<>();
        for (SslMode v : SslMode.values()) {
            map.put(v.getValue(), v);
        }
    }

    SslMode(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SslMode create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SslMode: " + key);
    }
}
