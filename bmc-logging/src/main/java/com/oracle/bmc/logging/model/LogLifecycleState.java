/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * The log object state. The states workflow is: 1. *CREATING* Object is being created, backend
 * service contacted. 2. *ACTIVE* Logging is active. 3. *UPDATING* Object configuration change
 * requested, but the backend service has not confirmed the update. 4. *INACTIVE* Logging is
 * disabled. 5. *DELETING* Log object is being deleted.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public enum LogLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Creating("CREATING"),
    Active("ACTIVE"),
    Updating("UPDATING"),
    Inactive("INACTIVE"),
    Deleting("DELETING"),
    Failed("FAILED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LogLifecycleState.class);

    private final String value;
    private static java.util.Map<String, LogLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (LogLifecycleState v : LogLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    LogLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LogLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'LogLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
