/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Entities are auto-created when enterprise manager bridge is configured in logging analytics, or
 * when logs are forwarded from service connector or through bulk discovery from object store.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public enum CreationSourceType implements com.oracle.bmc.http.internal.BmcEnum {
    EmBridge("EM_BRIDGE"),
    BulkDiscovery("BULK_DISCOVERY"),
    ServiceConnectorHub("SERVICE_CONNECTOR_HUB"),
    Discovery("DISCOVERY"),
    LoggingAnalytics("LOGGING_ANALYTICS"),
    None("NONE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CreationSourceType.class);

    private final String value;
    private static java.util.Map<String, CreationSourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (CreationSourceType v : CreationSourceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CreationSourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CreationSourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CreationSourceType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
