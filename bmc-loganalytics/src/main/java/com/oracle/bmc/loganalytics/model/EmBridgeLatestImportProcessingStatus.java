/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Processing status of the latest upload from enterprise manager. Supported values are NOT_STARTED,
 * SUCCESS, IN_PROGRESS, FAILED, PARTIAL_SUCCESS
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public enum EmBridgeLatestImportProcessingStatus implements com.oracle.bmc.http.internal.BmcEnum {
    NotStarted("NOT_STARTED"),
    Success("SUCCESS"),
    InProgress("IN_PROGRESS"),
    Failed("FAILED"),
    PartialSuccess("PARTIAL_SUCCESS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EmBridgeLatestImportProcessingStatus.class);

    private final String value;
    private static java.util.Map<String, EmBridgeLatestImportProcessingStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (EmBridgeLatestImportProcessingStatus v :
                EmBridgeLatestImportProcessingStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    EmBridgeLatestImportProcessingStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static EmBridgeLatestImportProcessingStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'EmBridgeLatestImportProcessingStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
