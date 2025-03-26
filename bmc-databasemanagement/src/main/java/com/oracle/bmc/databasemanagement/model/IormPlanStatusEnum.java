/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The status of the IORM plan of an Exadata storage server.
 * The OTHER status is used when Exadata adds a new value, and OTHER should not be used as input
 * when to make change to IORM plan.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum IormPlanStatusEnum {
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Other("OTHER"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IormPlanStatusEnum.class);

    private final String value;
    private static java.util.Map<String, IormPlanStatusEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (IormPlanStatusEnum v : IormPlanStatusEnum.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    IormPlanStatusEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static IormPlanStatusEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'IormPlanStatusEnum', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
