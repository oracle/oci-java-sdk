/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/** Pre-Migration advisor result. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
public enum AdvisorResults implements com.oracle.bmc.http.internal.BmcEnum {
    Fatal("FATAL"),
    Blocker("BLOCKER"),
    Warning("WARNING"),
    Informational("INFORMATIONAL"),
    Pass("PASS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AdvisorResults.class);

    private final String value;
    private static java.util.Map<String, AdvisorResults> map;

    static {
        map = new java.util.HashMap<>();
        for (AdvisorResults v : AdvisorResults.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AdvisorResults(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AdvisorResults create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AdvisorResults', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
