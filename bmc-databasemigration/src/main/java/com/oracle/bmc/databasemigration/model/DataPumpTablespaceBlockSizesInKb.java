/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/** Size of Oracle database blocks in KB. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum DataPumpTablespaceBlockSizesInKb implements com.oracle.bmc.http.internal.BmcEnum {
    Size2K("SIZE_2K"),
    Size8K("SIZE_8K"),
    Size16K("SIZE_16K"),
    Size32K("SIZE_32K"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataPumpTablespaceBlockSizesInKb.class);

    private final String value;
    private static java.util.Map<String, DataPumpTablespaceBlockSizesInKb> map;

    static {
        map = new java.util.HashMap<>();
        for (DataPumpTablespaceBlockSizesInKb v : DataPumpTablespaceBlockSizesInKb.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DataPumpTablespaceBlockSizesInKb(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DataPumpTablespaceBlockSizesInKb create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DataPumpTablespaceBlockSizesInKb', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
