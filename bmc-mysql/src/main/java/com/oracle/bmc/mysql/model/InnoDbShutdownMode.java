/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The InnoDB shutdown mode. If the value is \"SLOW\", InnoDB does a slow
 * shutdown, a full purge and a change buffer merge before shutting
 * down. If the value is \"FAST\", InnoDB skips these operations at shutdown,
 * a process known as a fast shutdown. If the value is \"IMMEDIATE\", InnoDB
 * flushes its logs and shuts down cold, as if MySQL had crashed; no
 * committed transactions are lost, but the crash recovery operation makes
 * the next startup take longer.
 * <p>
 * The slow shutdown can take minutes, or even hours in extreme cases where
 * substantial amounts of data are still buffered. Use the slow shutdown
 * technique before upgrading or downgrading between MySQL major releases,
 * so that all data files are fully prepared in case the upgrade process
 * updates the file format.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum InnoDbShutdownMode {
    Immediate("IMMEDIATE"),
    Fast("FAST"),
    Slow("SLOW"),
    ;

    private final String value;
    private static java.util.Map<String, InnoDbShutdownMode> map;

    static {
        map = new java.util.HashMap<>();
        for (InnoDbShutdownMode v : InnoDbShutdownMode.values()) {
            map.put(v.getValue(), v);
        }
    }

    InnoDbShutdownMode(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InnoDbShutdownMode create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid InnoDbShutdownMode: " + key);
    }
}
