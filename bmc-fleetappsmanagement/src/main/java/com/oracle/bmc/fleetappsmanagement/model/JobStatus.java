/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/** Possible Job status. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public enum JobStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Accepted("ACCEPTED"),
    Waiting("WAITING"),
    InProgress("IN_PROGRESS"),
    Failed("FAILED"),
    Succeeded("SUCCEEDED"),
    Canceled("CANCELED"),
    Skipped("SKIPPED"),
    Ignored("IGNORED"),
    NotApplicable("NOT_APPLICABLE"),
    Aborted("ABORTED"),
    TimedOut("TIMED_OUT"),
    Paused("PAUSED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(JobStatus.class);

    private final String value;
    private static java.util.Map<String, JobStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (JobStatus v : JobStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    JobStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JobStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'JobStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
