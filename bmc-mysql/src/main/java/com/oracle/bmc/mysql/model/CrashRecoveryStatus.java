/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or
 * disabled, and whether to enable or disable syncing of the Binary Logs.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum CrashRecoveryStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Enabled("ENABLED"),
    Disabled("DISABLED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CrashRecoveryStatus.class);

    private final String value;
    private static java.util.Map<String, CrashRecoveryStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (CrashRecoveryStatus v : CrashRecoveryStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CrashRecoveryStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CrashRecoveryStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CrashRecoveryStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
