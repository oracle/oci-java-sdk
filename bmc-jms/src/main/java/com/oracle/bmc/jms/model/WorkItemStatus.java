/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** Possible operation status. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum WorkItemStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Accepted("ACCEPTED"),
    InProgress("IN_PROGRESS"),
    Canceling("CANCELING"),
    Canceled("CANCELED"),
    Succeeded("SUCCEEDED"),
    NeedsAttention("NEEDS_ATTENTION"),
    Retrying("RETRYING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkItemStatus.class);

    private final String value;
    private static java.util.Map<String, WorkItemStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkItemStatus v : WorkItemStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkItemStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkItemStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkItemStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
