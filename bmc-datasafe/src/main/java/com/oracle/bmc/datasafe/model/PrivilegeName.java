/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The name of the privilege granted to user.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum PrivilegeName {
    Select("SELECT"),
    Update("UPDATE"),
    Insert("INSERT"),
    Delete("DELETE"),
    Read("READ"),
    Owner("OWNER"),
    Index("INDEX"),
    SelectAnyTable("SELECT_ANY_TABLE"),
    UpdateAnyTable("UPDATE_ANY_TABLE"),
    InsertAnyTable("INSERT_ANY_TABLE"),
    DeleteAnyTable("DELETE_ANY_TABLE"),
    ReadAnyTable("READ_ANY_TABLE"),
    CreateAnyIndex("CREATE_ANY_INDEX"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrivilegeName.class);

    private final String value;
    private static java.util.Map<String, PrivilegeName> map;

    static {
        map = new java.util.HashMap<>();
        for (PrivilegeName v : PrivilegeName.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    PrivilegeName(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PrivilegeName create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'PrivilegeName', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
