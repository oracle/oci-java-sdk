/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Group types in a DR Plan. - USER_DEFINED - DR Plan group whose contents are defined by the user.
 * - BUILT_IN - DR Plan group whose contents are pre-defined by the service. - BUILT_IN_PRECHECK -
 * DR Plan precheck group whose contents are pre-defined by the service.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanGroupType implements com.oracle.bmc.http.internal.BmcEnum {
    UserDefined("USER_DEFINED"),
    BuiltIn("BUILT_IN"),
    BuiltInPrecheck("BUILT_IN_PRECHECK"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanGroupType.class);

    private final String value;
    private static java.util.Map<String, DrPlanGroupType> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanGroupType v : DrPlanGroupType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanGroupType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanGroupType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanGroupType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
