/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/** Possible lifecycleStates for the Exadata Fleet Update Job resource. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public enum JobLifecycleStates implements com.oracle.bmc.http.internal.BmcEnum {
    Accepted("ACCEPTED"),
    InProgress("IN_PROGRESS"),
    Unknown("UNKNOWN"),
    Terminated("TERMINATED"),
    Failed("FAILED"),
    NeedsAttention("NEEDS_ATTENTION"),
    Succeeded("SUCCEEDED"),
    Waiting("WAITING"),
    Canceling("CANCELING"),
    Canceled("CANCELED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JobLifecycleStates.class);

    private final String value;
    private static java.util.Map<String, JobLifecycleStates> map;

    static {
        map = new java.util.HashMap<>();
        for (JobLifecycleStates v : JobLifecycleStates.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    JobLifecycleStates(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JobLifecycleStates create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'JobLifecycleStates', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
