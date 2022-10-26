/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/** Type of the resource associated with a work request. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public enum WorkRequestResourceType implements com.oracle.bmc.http.internal.BmcEnum {
    AnalyticsInstance("ANALYTICS_INSTANCE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkRequestResourceType.class);

    private final String value;
    private static java.util.Map<String, WorkRequestResourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestResourceType v : WorkRequestResourceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestResourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestResourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestResourceType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
