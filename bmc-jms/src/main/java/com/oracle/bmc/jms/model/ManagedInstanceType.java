/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** The types of managed instance. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum ManagedInstanceType implements com.oracle.bmc.http.internal.BmcEnum {
    OracleManagementAgent("ORACLE_MANAGEMENT_AGENT"),
    OracleCloudAgent("ORACLE_CLOUD_AGENT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagedInstanceType.class);

    private final String value;
    private static java.util.Map<String, ManagedInstanceType> map;

    static {
        map = new java.util.HashMap<>();
        for (ManagedInstanceType v : ManagedInstanceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ManagedInstanceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ManagedInstanceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ManagedInstanceType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
