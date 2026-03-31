/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * The size of a source database.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum DatabaseDataSize {
    LessThan1Gb("LESS_THAN_1GB"),
    Gb110("GB_1_10"),
    Gb1050("GB_10_50"),
    Gb50100("GB_50_100"),
    Gb100500("GB_100_500"),
    Gb500Tb1("GB_500_TB_1"),
    Tb13("TB_1_3"),
    Tb310("TB_3_10"),
    Tb1050("TB_10_50"),
    GreaterThan50Tb("GREATER_THAN_50TB"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseDataSize.class);

    private final String value;
    private static java.util.Map<String, DatabaseDataSize> map;

    static {
        map = new java.util.HashMap<>();
        for (DatabaseDataSize v : DatabaseDataSize.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DatabaseDataSize(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DatabaseDataSize create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DatabaseDataSize', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
