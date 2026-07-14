/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * The type of redundancy configured for the Database Infrastructure storage disk. MIRROR is 2-way
 * redundancy. HIGH is 3-way redundancy. FLEX redundancy can be either HIGH or MIRROR.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public enum StorageDiskRedundancy implements com.oracle.bmc.http.internal.BmcEnum {
    High("HIGH"),
    Mirror("MIRROR"),
    Flex("FLEX"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StorageDiskRedundancy.class);

    private final String value;
    private static java.util.Map<String, StorageDiskRedundancy> map;

    static {
        map = new java.util.HashMap<>();
        for (StorageDiskRedundancy v : StorageDiskRedundancy.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    StorageDiskRedundancy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static StorageDiskRedundancy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'StorageDiskRedundancy', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
