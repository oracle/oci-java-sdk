/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Event type: * {@code KERNEL_OOPS} - Used to identify a kernel panic condition event * {@code
 * KERNEL_CRASH} - Used to identify an internal fatal kernel error that cannot be safely recovered
 * from * {@code CRASH} - Used to identify when an application stopped functioning properly and
 * exited * {@code EXPLOIT_ATTEMPT} - Used to identify a known exploit detection as identified by
 * Ksplice * {@code COMPLIANCE} - Used to identify a compliance related events * {@code
 * TUNING_SUGGESTION} - Used to identify autonomous tuning suggestion events * {@code
 * TUNING_APPLIED} - Used to identify when a tuning suggestion has been applied * {@code SECURITY} -
 * Used to identify security related events * {@code ERROR} - Used to identify error related events
 * * {@code WARNING} - Used to identify warning related events
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public enum EventType implements com.oracle.bmc.http.internal.BmcEnum {
    KernelOops("KERNEL_OOPS"),
    KernelCrash("KERNEL_CRASH"),
    Crash("CRASH"),
    ExploitAttempt("EXPLOIT_ATTEMPT"),
    Compliance("COMPLIANCE"),
    TuningSuggestion("TUNING_SUGGESTION"),
    TuningApplied("TUNING_APPLIED"),
    Security("SECURITY"),
    Error("ERROR"),
    Warning("WARNING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(EventType.class);

    private final String value;
    private static java.util.Map<String, EventType> map;

    static {
        map = new java.util.HashMap<>();
        for (EventType v : EventType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    EventType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static EventType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'EventType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
