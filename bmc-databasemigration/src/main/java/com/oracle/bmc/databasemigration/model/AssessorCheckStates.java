/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Possible Assessor Check lifecycle states.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum AssessorCheckStates {
    PendingApproval("PENDING_APPROVAL"),
    PendingResolution("PENDING_RESOLUTION"),
    PendingValidation("PENDING_VALIDATION"),
    NotAcknowledged("NOT_ACKNOWLEDGED"),
    Approved("APPROVED"),
    Acknowledged("ACKNOWLEDGED"),
    Validated("VALIDATED"),
    Passed("PASSED"),
    Pending("PENDING"),
    Started("STARTED"),
    Completed("COMPLETED"),
    Failed("FAILED"),
    Skipped("SKIPPED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AssessorCheckStates.class);

    private final String value;
    private static java.util.Map<String, AssessorCheckStates> map;

    static {
        map = new java.util.HashMap<>();
        for (AssessorCheckStates v : AssessorCheckStates.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AssessorCheckStates(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AssessorCheckStates create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AssessorCheckStates', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
