/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The current sub-state of the audit trail.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.extern.slf4j.Slf4j
public enum AuditTrailStatus {
    Starting("STARTING"),
    Collecting("COLLECTING"),
    Recovering("RECOVERING"),
    Idle("IDLE"),
    Stopping("STOPPING"),
    Stopped("STOPPED"),
    Resuming("RESUMING"),
    Retrying("RETRYING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, AuditTrailStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (AuditTrailStatus v : AuditTrailStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AuditTrailStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AuditTrailStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AuditTrailStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
