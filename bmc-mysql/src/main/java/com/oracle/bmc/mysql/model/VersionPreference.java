/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The preferred version to target when performing an automatic MySQL upgrade.
 *
 * <p>OLDEST: Choose the oldest available MySQL version based on the current version of the DB
 * System. SECOND_NEWEST: Choose the MySQL version before the newest for auto-upgrade. NEWEST:
 * Choose the latest and greatest MySQL version available for auto-upgrade.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum VersionPreference implements com.oracle.bmc.http.internal.BmcEnum {
    Oldest("OLDEST"),
    SecondNewest("SECOND_NEWEST"),
    Newest("NEWEST"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VersionPreference.class);

    private final String value;
    private static java.util.Map<String, VersionPreference> map;

    static {
        map = new java.util.HashMap<>();
        for (VersionPreference v : VersionPreference.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    VersionPreference(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static VersionPreference create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'VersionPreference', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
