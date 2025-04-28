/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/** Possible source major versions for a DB Exadata Fleet Update Collection. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public enum DbSourceMajorVersions implements com.oracle.bmc.http.internal.BmcEnum {
    Db11204("DB_11204"),
    Db121("DB_121"),
    Db122("DB_122"),
    Db18("DB_18"),
    Db19("DB_19"),
    Db23("DB_23"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbSourceMajorVersions.class);

    private final String value;
    private static java.util.Map<String, DbSourceMajorVersions> map;

    static {
        map = new java.util.HashMap<>();
        for (DbSourceMajorVersions v : DbSourceMajorVersions.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DbSourceMajorVersions(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DbSourceMajorVersions create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DbSourceMajorVersions', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
