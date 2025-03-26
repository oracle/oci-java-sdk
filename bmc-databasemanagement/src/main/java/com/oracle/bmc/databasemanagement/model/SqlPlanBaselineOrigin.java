/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The origin of the SQL plan baseline.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum SqlPlanBaselineOrigin {
    AddmSqltune("ADDM_SQLTUNE"),
    AutoCapture("AUTO_CAPTURE"),
    AutoSqltune("AUTO_SQLTUNE"),
    EvolveAutoIndexLoad("EVOLVE_AUTO_INDEX_LOAD"),
    EvolveCreateFromAdaptive("EVOLVE_CREATE_FROM_ADAPTIVE"),
    EvolveLoadFromSts("EVOLVE_LOAD_FROM_STS"),
    EvolveLoadFromAwr("EVOLVE_LOAD_FROM_AWR"),
    EvolveLoadFromCursorCache("EVOLVE_LOAD_FROM_CURSOR_CACHE"),
    ManualLoad("MANUAL_LOAD"),
    ManualLoadFromAwr("MANUAL_LOAD_FROM_AWR"),
    ManualLoadFromCursorCache("MANUAL_LOAD_FROM_CURSOR_CACHE"),
    ManualLoadFromSts("MANUAL_LOAD_FROM_STS"),
    ManualSqltune("MANUAL_SQLTUNE"),
    StoredOutline("STORED_OUTLINE"),
    Unknown("UNKNOWN"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SqlPlanBaselineOrigin.class);

    private final String value;
    private static java.util.Map<String, SqlPlanBaselineOrigin> map;

    static {
        map = new java.util.HashMap<>();
        for (SqlPlanBaselineOrigin v : SqlPlanBaselineOrigin.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SqlPlanBaselineOrigin(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SqlPlanBaselineOrigin create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SqlPlanBaselineOrigin', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
